package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="DBInit";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_dbinit" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="dashpg.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dashpg" /*RemoteObject*/ ).runClassMethod (b4j.example.dashboard.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.AddPage(\"Dashpage\",dashpg)";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Dashpage")),(Object)((__ref.getField(false,"_dashpg" /*RemoteObject*/ ))));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private usernametxt As TextField";
b4xmainpage._usernametxt = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_usernametxt",b4xmainpage._usernametxt);
 //BA.debugLineNum = 7;BA.debugLine="Private passtxt As TextField";
b4xmainpage._passtxt = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_passtxt",b4xmainpage._passtxt);
 //BA.debugLineNum = 8;BA.debugLine="Private logbtn As Button";
b4xmainpage._logbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_logbtn",b4xmainpage._logbtn);
 //BA.debugLineNum = 10;BA.debugLine="Dim dashpg As dashboard";
b4xmainpage._dashpg = RemoteObject.createNew ("b4j.example.dashboard");__ref.setField("_dashpg",b4xmainpage._dashpg);
 //BA.debugLineNum = 12;BA.debugLine="Public sql As SQL";
b4xmainpage._sql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql",b4xmainpage._sql);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dbinit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DBInit (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("dbinit")) { return __ref.runUserSub(false, "b4xmainpage","dbinit", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Sub DBInit";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If File.Exists(File.DirData(\"sql\"), \"patient.db\")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",b4xmainpage.__c.getField(false,"File").runMethod(true,"Exists",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("sql")))),(Object)(RemoteObject.createImmutable("patient.db"))),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 73;BA.debugLine="File.Copy(File.DirAssets, \"patient.db\", File.Dir";
Debug.ShouldStop(256);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("patient.db")),(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("sql")))),(Object)(RemoteObject.createImmutable("patient.db")));
 };
 BA.debugLineNum = 77;BA.debugLine="sql.InitializeSQLite(File.DirData(\"sql\"), \"patien";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("sql")))),(Object)(BA.ObjectToString("patient.db")),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Return Me";
Debug.ShouldStop(65536);
if (true) return __ref;
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logbtn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("logbtn_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("logbtn_click")) { return __ref.runUserSub(false, "b4xmainpage","logbtn_click", __ref);}
RemoteObject _uname = RemoteObject.createImmutable("");
RemoteObject _passw = RemoteObject.createImmutable("");
RemoteObject _u1 = RemoteObject.createImmutable("");
RemoteObject _p1 = RemoteObject.createImmutable("");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _loginsuccessful = RemoteObject.createImmutable(false);
 BA.debugLineNum = 37;BA.debugLine="Private Sub logbtn_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim uname, passw, u1, p1 As String ' create varia";
Debug.ShouldStop(32);
_uname = RemoteObject.createImmutable("");Debug.locals.put("uname", _uname);
_passw = RemoteObject.createImmutable("");Debug.locals.put("passw", _passw);
_u1 = RemoteObject.createImmutable("");Debug.locals.put("u1", _u1);
_p1 = RemoteObject.createImmutable("");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 39;BA.debugLine="uname = usernametxt.Text.Trim";
Debug.ShouldStop(64);
_uname = __ref.getField(false,"_usernametxt" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("uname", _uname);
 BA.debugLineNum = 40;BA.debugLine="passw = passtxt.Text.Trim";
Debug.ShouldStop(128);
_passw = __ref.getField(false,"_passtxt" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("passw", _passw);
 BA.debugLineNum = 42;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(512);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 43;BA.debugLine="Cursor = sql.ExecQuery(\"SELECT * FROM login\")";
Debug.ShouldStop(1024);
_cursor = __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM login")));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 45;BA.debugLine="Dim loginSuccessful As Boolean = False ' Flag to";
Debug.ShouldStop(4096);
_loginsuccessful = b4xmainpage.__c.getField(true,"False");Debug.locals.put("loginSuccessful", _loginsuccessful);Debug.locals.put("loginSuccessful", _loginsuccessful);
 BA.debugLineNum = 47;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(16384);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 49;BA.debugLine="u1 = Cursor.GetString(\"username\")";
Debug.ShouldStop(65536);
_u1 = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")));Debug.locals.put("u1", _u1);
 BA.debugLineNum = 50;BA.debugLine="p1 = Cursor.GetString(\"password\")";
Debug.ShouldStop(131072);
_p1 = _cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("password")));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 53;BA.debugLine="If (uname = u1) And (passw = p1) Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_uname,_u1)))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_passw,_p1))))) { 
 BA.debugLineNum = 54;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Dashpa";
Debug.ShouldStop(2097152);
b4xmainpage._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Dashpage")));
 BA.debugLineNum = 55;BA.debugLine="loginSuccessful = True ' Set the flag to true o";
Debug.ShouldStop(4194304);
_loginsuccessful = b4xmainpage.__c.getField(true,"True");Debug.locals.put("loginSuccessful", _loginsuccessful);
 };
 }
;
 BA.debugLineNum = 61;BA.debugLine="If Not(loginSuccessful) Then";
Debug.ShouldStop(268435456);
if (b4xmainpage.__c.runMethod(true,"Not",(Object)(_loginsuccessful)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="xui.MsgboxAsync(\"Try again! Password or username";
Debug.ShouldStop(536870912);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Try again! Password or username is wrong")),(Object)(RemoteObject.createImmutable("Admin")));
 };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}