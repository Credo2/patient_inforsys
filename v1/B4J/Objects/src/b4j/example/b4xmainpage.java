package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _usernametxt = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _passtxt = null;
public anywheresoftware.b4j.objects.ButtonWrapper _logbtn = null;
public b4j.example.dashboard _dashpg = null;
public anywheresoftware.b4j.objects.SQL _sql = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.dbutils _dbutils = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="DBInit";
__ref._dbinit /*String*/ (null);
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=37748745;
 //BA.debugLineNum = 37748745;BA.debugLine="dashpg.Initialize";
__ref._dashpg /*b4j.example.dashboard*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37748748;
 //BA.debugLineNum = 37748748;BA.debugLine="B4XPages.AddPage(\"Dashpage\",dashpg)";
_b4xpages._addpage /*String*/ ("Dashpage",(Object)(__ref._dashpg /*b4j.example.dashboard*/ ));
RDebugUtils.currentLine=37748749;
 //BA.debugLineNum = 37748749;BA.debugLine="End Sub";
return "";
}
public String  _dbinit(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbinit", false))
	 {return ((String) Debug.delegate(ba, "dbinit", null));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Sub DBInit";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="If File.Exists(File.DirData(\"sql\"), \"patient.db\")";
if (__c.File.Exists(__c.File.DirData("sql"),"patient.db")==__c.False) { 
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="File.Copy(File.DirAssets, \"patient.db\", File.Dir";
__c.File.Copy(__c.File.getDirAssets(),"patient.db",__c.File.DirData("sql"),"patient.db");
 };
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="sql.InitializeSQLite(File.DirData(\"sql\"), \"patien";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.DirData("sql"),"patient.db",__c.True);
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="Private usernametxt As TextField";
_usernametxt = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="Private passtxt As TextField";
_passtxt = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="Private logbtn As Button";
_logbtn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="Dim dashpg As dashboard";
_dashpg = new b4j.example.dashboard();
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="Public sql As SQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=37617675;
 //BA.debugLineNum = 37617675;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="End Sub";
return null;
}
public String  _logbtn_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "logbtn_click", false))
	 {return ((String) Debug.delegate(ba, "logbtn_click", null));}
String _uname = "";
String _passw = "";
String _u1 = "";
String _p1 = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
boolean _loginsuccessful = false;
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub logbtn_Click";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="Dim uname, passw, u1, p1 As String ' create varia";
_uname = "";
_passw = "";
_u1 = "";
_p1 = "";
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="uname = usernametxt.Text.Trim";
_uname = __ref._usernametxt /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim();
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="passw = passtxt.Text.Trim";
_passw = __ref._passtxt /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim();
RDebugUtils.currentLine=42139653;
 //BA.debugLineNum = 42139653;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=42139654;
 //BA.debugLineNum = 42139654;BA.debugLine="Cursor = sql.ExecQuery(\"SELECT * FROM login\")";
_cursor = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM login");
RDebugUtils.currentLine=42139656;
 //BA.debugLineNum = 42139656;BA.debugLine="Dim loginSuccessful As Boolean = False ' Flag to";
_loginsuccessful = __c.False;
RDebugUtils.currentLine=42139658;
 //BA.debugLineNum = 42139658;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=42139660;
 //BA.debugLineNum = 42139660;BA.debugLine="u1 = Cursor.GetString(\"username\")";
_u1 = _cursor.GetString("username");
RDebugUtils.currentLine=42139661;
 //BA.debugLineNum = 42139661;BA.debugLine="p1 = Cursor.GetString(\"password\")";
_p1 = _cursor.GetString("password");
RDebugUtils.currentLine=42139664;
 //BA.debugLineNum = 42139664;BA.debugLine="If (uname = u1) And (passw = p1) Then";
if (((_uname).equals(_u1)) && ((_passw).equals(_p1))) { 
RDebugUtils.currentLine=42139665;
 //BA.debugLineNum = 42139665;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Dashpa";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Dashpage");
RDebugUtils.currentLine=42139666;
 //BA.debugLineNum = 42139666;BA.debugLine="loginSuccessful = True ' Set the flag to true o";
_loginsuccessful = __c.True;
 };
 }
;
RDebugUtils.currentLine=42139672;
 //BA.debugLineNum = 42139672;BA.debugLine="If Not(loginSuccessful) Then";
if (__c.Not(_loginsuccessful)) { 
RDebugUtils.currentLine=42139673;
 //BA.debugLineNum = 42139673;BA.debugLine="xui.MsgboxAsync(\"Try again! Password or username";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Try again! Password or username is wrong","Admin");
 };
RDebugUtils.currentLine=42139675;
 //BA.debugLineNum = 42139675;BA.debugLine="End Sub";
return "";
}
}