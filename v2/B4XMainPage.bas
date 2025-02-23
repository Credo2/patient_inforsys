B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@

Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private usernametxt As TextField
	Private passtxt As TextField
	Private logbtn As Button
	
	Dim dashpg As dashboard
	
	Public sql As SQL
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	
	DBInit
	'load the layout to Root

	Root.LoadLayout("MainPage")
	
'	initialization of pages
	dashpg.Initialize
	
'	Page Stack 
	B4XPages.AddPage("Dashpage",dashpg)
End Sub


Private Sub logbtn_Click
	Dim uname, passw, u1, p1 As String ' create variables
	uname = usernametxt.Text.Trim
	passw = passtxt.Text.Trim

	Dim Cursor As ResultSet
	Cursor = sql.ExecQuery("SELECT * FROM login")
    
	Dim loginSuccessful As Boolean = False ' Flag to track login success
    
	Do While Cursor.NextRow
		' Retrieve username and password as strings
		u1 = Cursor.GetString("username")
		p1 = Cursor.GetString("password")
        
		' Compare with input values
		If (uname = u1) And (passw = p1) Then
			B4XPages.ShowPageAndRemovePreviousPages("Dashpage")
			loginSuccessful = True ' Set the flag to true on successful login Exit Do '
'			 Exit the loop since we found a match
		End If
	Loop
    
	' Show message box only if login was not successful
	If Not(loginSuccessful) Then
		xui.MsgboxAsync("Try again! Password or username is wrong", "Admin")
	End If
End Sub





Sub DBInit
	If File.Exists(File.DirData("sql"), "patient.db") = False Then
		'copy the default DB C:\Users\(Username)\AppData\Roaming\sql
		File.Copy(File.DirAssets, "patient.db", File.DirData("sql"), "patient.db")
	End If


	sql.InitializeSQLite(File.DirData("sql"), "patient.db", True)
End Sub


'

'Sub SetMaximized(frm As Form)
'	Dim joForm As JavaObject = frm
'	Dim joStage As JavaObject = joForm.GetField("stage")
'	joStage.RunMethod("setMaximized", Array(True))
'End Sub
'
