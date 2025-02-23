B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@


Sub Class_Globals
	Private XUI 			As XUI
	Private Root 			As B4XView
	Private mBase 			As B4XView
	Private Drawer 			As B4XDrawer
	Private LblTitle 		As Label
	Private lblAppVersion 	As Label
	Private BtnMenu 		As Label
	Private BtnHide 		As Label
	Private BtnShow 		As Label
	Private BtnExit 		As Button
	Private Button1 		As Button
	Private PnlRoot 		As B4XView
	Private PnlMini 		As B4XView
	Private PnlStatic 		As B4XView
	Private PnlCenter 		As B4XView
	Private ClvMenuMini 	As CustomListView
	Private ClvMenuStatic 	As CustomListView
	Private ClvMenuDrawer 	As CustomListView

	Private FX 				As JFX

	Private Title 			As String = "AB4XDashboard"
	Private MenuMode		As String = "Mini"
	'Private
	Private sql As SQL
	Private lblMiniLabel 	As B4XView
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'Root.LoadLayout("MainPanel")
	SetMaximized(B4XPages.GetNativeParent(Me))
	DBInit
	SetTitle
	InitDrawer
	InitPanel
	ShowLoginMenu

	SetButtonMousePointer

	CSSUtils.SetStyleProperty(BtnExit, "-fx-focus-color", "white")
	'CSSUtils.SetStyleProperty(Button1, "-fx-focus-color", "white")
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	If Drawer.IsInitialized Then Drawer.Resize(Width, Height)
End Sub

'Private Sub BtnExit_Click
'	ExitApplication
'End Sub

Sub SetTitle
	B4XPages.SetTitle(Me, Title)
End Sub

Sub InitDrawer
	Drawer.Initialize(Me, "Drawer", Root, 300dip)
	Drawer.LeftPanel.LoadLayout("LeftDrawer")
	Drawer.CenterPanel.LoadLayout("MainPanel")
'	lblAppVersion.Text = $"A B4X Dashboard$   Version ${Main.Version}"$
End Sub

Sub InitPanel
	LblTitle.Text = Title
	PnlMini.LoadLayout("PanelMini")
	PnlStatic.LoadLayout("PanelStatic")
	PnlCenter.LoadLayout("Dashboard")
'	lblAppVersion.Text = $"A B4X Dashboard${CRLF}   Version ${Main.Version}"$
	CSSUtils.SetStyleProperty(Button1, "-fx-focus-color", "white")
	Select MenuMode
		Case "Mini"
			PnlMini.Visible = True
			PnlStatic.Visible = False
			PnlCenter.Width = PnlRoot.Width - PnlMini.Width
			PnlCenter.Left = 60dip
		Case "Static"
			PnlMini.Visible = False
			PnlStatic.Visible = True
			PnlCenter.Width = PnlRoot.Width - PnlStatic.Width
			PnlCenter.Left = PnlStatic.Left + PnlStatic.Width
		Case Else
			PnlMini.Visible = False
			PnlStatic.Visible = False
			PnlCenter.Width = PnlRoot.Width
			PnlCenter.Left = 0
	End Select

	'BtnExit.Visible = False	' If MainForm.FormStyle = "UNDECORATED"
	CallSubDelayed3(Me, "SetScrollPaneBackgroundColor", ClvMenuMini, XUI.Color_Transparent)
	CallSubDelayed3(Me, "SetScrollPaneBackgroundColor", ClvMenuStatic, XUI.Color_Transparent)
	CallSubDelayed3(Me, "SetScrollPaneBackgroundColor", ClvMenuDrawer, XUI.Color_Transparent)
End Sub


Sub BtnMenu_MouseClicked (EventData As MouseEvent)

	Select MenuMode
		Case "Mini", "Static"
			SwitchMenu
		Case Else
			Drawer.LeftOpen = Not(Drawer.LeftOpen)
	End Select
End Sub

Sub ACToolBarLight1_NavigationItemClick
	Drawer.LeftOpen = Not(Drawer.LeftOpen)
End Sub

Private Sub BtnHide_MouseClicked (EventData As MouseEvent)
	MenuMode = "Drawer"
	PnlMini.Visible = False
	PnlStatic.Visible = False
	PnlCenter.Width = Root.Width
	PnlCenter.Left = 0
	ClvMenuStatic_ItemClick(0, Me)
End Sub

Private Sub BtnShow_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen = False
	MenuMode = "Static"
	PnlMini.Visible = False
	PnlStatic.Visible = True
	PnlCenter.Width = Root.Width - PnlStatic.Width
	PnlCenter.Left = PnlStatic.Left + PnlStatic.Width
	ClvMenuStatic_ItemClick(0, Me)
End Sub

Sub Drawer_StateChanged (Open As Boolean)
	If Open Then

	Else

	End If
End Sub

Private Sub Show (Parent As B4XView)
	If mBase.IsInitialized = False Then
		mBase = XUI.CreatePanel("")
		mBase.LoadLayout("Dashboard")
	End If
	mBase.RemoveViewFromParent
	Parent.AddView(mBase, 0, 0, Parent.Width, Parent.Height)
	CSSUtils.SetStyleProperty(Button1, "-fx-focus-color", "white")
End Sub

Private Sub ContentEmpty As Boolean
	Return PnlCenter.NumberOfViews = 0
End Sub

Private Sub ClvMenuStatic_ItemClick (Index As Int, Value As Object)
	If ContentEmpty = False Then PnlCenter.GetView(0).RemoveViewFromParent
	CallSub2(Value, "Show", PnlCenter)
End Sub

Private Sub ClvMenuMini_ItemClick (Index As Int, Value As Object)
	ClvMenuStatic_ItemClick(Index, Value)
End Sub

Private Sub ClvMenuDrawer_ItemClick (Index As Int, Value As Object)
	Drawer.LeftOpen = False
	ClvMenuStatic_ItemClick(Index, Value)
End Sub

Sub SwitchMenu
	Select MenuMode
		Case "Mini"
			MenuMode = "Static"
			PnlMini.Visible = False
			PnlStatic.Visible = True
			PnlCenter.Width = Root.Width - PnlStatic.Width
			PnlCenter.Left = PnlStatic.Left + PnlStatic.Width
		Case "Static"
			MenuMode = "Mini"
			PnlStatic.Visible = False
			PnlMini.Visible = True
			PnlCenter.Width = Root.Width - PnlMini.Width
			PnlCenter.Left = PnlMini.Left + PnlMini.Width
	End Select
	ClvMenuStatic_ItemClick(0, Me)
End Sub

Public Sub ShowLoginMenu
	ClvMenuDrawer.Clear
	Dim frm1 As patientview
	Dim frm2 As view2
	frm1.Initialize
	frm2.Initialize
	ClvMenuDrawer.AddTextItem("Home", Me)
	ClvMenuDrawer.AddTextItem("Patient List", frm1)
	ClvMenuDrawer.AddTextItem("Input Form", frm2)
	
	ClvMenuStatic.AddTextItem("Home", Me)
	ClvMenuStatic.AddTextItem("Patient List", frm1)
	ClvMenuStatic.AddTextItem("Input Form", frm2)
	
	ClvMenuMini.Add(CreateMiniItem(Chr(0xF015), ClvMenuMini.AsView.Width), Me)
	ClvMenuMini.Add(CreateMiniItem(Chr(0xF004), ClvMenuMini.AsView.Width), frm1)
	ClvMenuMini.Add(CreateMiniItem(Chr(0xF06B), ClvMenuMini.AsView.Width), frm2)
End Sub

Sub CreateMiniItem (Text As String, Width As Int) As B4XView
	Dim pnl As B4XView = XUI.CreatePanel("")
	'pnl.Color = XUI.Color_Transparent
	pnl.SetLayoutAnimated(0, 0, 0, Width, 60dip)
	pnl.LoadLayout("MiniItem")
	lblMiniLabel.Text = Text
	

	pnl.As(Pane).MouseCursor = FX.Cursors.HAND

	Return pnl
End Sub


' B4J specific UI
Private Sub SetScrollPaneBackgroundColor (View As CustomListView, Color As Int)
	Dim SP As JavaObject = View.GetBase.GetView(0)
	Dim V As B4XView = SP
	V.Color = Color
	Dim V As B4XView = SP.RunMethod("lookup", Array(".viewport"))
	V.Color = Color
End Sub

Private Sub SetButtonMousePointer
	BtnMenu.MouseCursor = FX.Cursors.HAND
	BtnExit.MouseCursor = FX.Cursors.HAND
	BtnHide.MouseCursor = FX.Cursors.HAND
	BtnShow.MouseCursor = FX.Cursors.HAND
	Button1.MouseCursor = FX.Cursors.HAND
End Sub

Sub DBInit
	If File.Exists(File.DirData("sql"), "patient.db") = False Then
		'copy the default DB
		File.Copy(File.DirAssets, "patient.db", File.DirData("sql"), "patient.db")
	End If


	sql.InitializeSQLite(File.DirData("sql"), "patient.db", True)
End Sub




Sub SetMaximized(frm As Form)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
End Sub



'
'Private Sub BtnMenu_MouseClicked (EventData As MouseEvent)
'	Drawer.LeftOpen = True
'End Sub
'
