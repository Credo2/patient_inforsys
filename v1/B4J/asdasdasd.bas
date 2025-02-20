B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private Drawer As B4XDrawer
	
	Private sql As SQL
	
	Private PnlMini As B4XView
	
	
	
	Private NavList As CustomListView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
'	Root1.LoadLayout("Dashboard")
	SetMaximized(B4XPages.GetNativeParent(Me))
	
	InitDrawer
	
'	Root.LoadLayout("Dashboard")
	InitPanel
	
	panelLoad
	
'	DataBase initialization
	DBInit
End Sub



Sub InitDrawer
	Drawer.Initialize(Me, "Drawer", Root, 200dip)
	Drawer.CenterPanel.LoadLayout("Dashboard")
'	Drawer.LeftPanel.LoadLayout("leftPnl")
End Sub




Sub panelLoad
	PnlMini.Visible = True
End Sub



