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
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="DBInit";
__ref._dbinit /*String*/ (null);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="dashpg.Initialize";
__ref._dashpg /*b4j.example.dashboard*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="B4XPages.AddPage(\"Dashpage\",dashpg)";
_b4xpages._addpage /*String*/ ("Dashpage",(Object)(__ref._dashpg /*b4j.example.dashboard*/ ));
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="End Sub";
return "";
}
public String  _dbinit(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbinit", false))
	 {return ((String) Debug.delegate(ba, "dbinit", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub DBInit";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If File.Exists(File.DirData(\"sql\"), \"patient.db\")";
if (__c.File.Exists(__c.File.DirData("sql"),"patient.db")==__c.False) { 
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="File.Copy(File.DirAssets, \"patient.db\", File.Dir";
__c.File.Copy(__c.File.getDirAssets(),"patient.db",__c.File.DirData("sql"),"patient.db");
 };
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="sql.InitializeSQLite(File.DirData(\"sql\"), \"patien";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.DirData("sql"),"patient.db",__c.True);
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Private usernametxt As TextField";
_usernametxt = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Private passtxt As TextField";
_passtxt = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Private logbtn As Button";
_logbtn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Dim dashpg As dashboard";
_dashpg = new b4j.example.dashboard();
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Public sql As SQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub logbtn_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim uname, passw, u1, p1 As String ' create varia";
_uname = "";
_passw = "";
_u1 = "";
_p1 = "";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="uname = usernametxt.Text.Trim";
_uname = __ref._usernametxt /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="passw = passtxt.Text.Trim";
_passw = __ref._passtxt /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Cursor = sql.ExecQuery(\"SELECT * FROM login\")";
_cursor = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM login");
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Dim loginSuccessful As Boolean = False ' Flag to";
_loginsuccessful = __c.False;
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="u1 = Cursor.GetString(\"username\")";
_u1 = _cursor.GetString("username");
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="p1 = Cursor.GetString(\"password\")";
_p1 = _cursor.GetString("password");
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="If (uname = u1) And (passw = p1) Then";
if (((_uname).equals(_u1)) && ((_passw).equals(_p1))) { 
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Dashpa";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Dashpage");
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="loginSuccessful = True ' Set the flag to true o";
_loginsuccessful = __c.True;
 };
 }
;
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="If Not(loginSuccessful) Then";
if (__c.Not(_loginsuccessful)) { 
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="xui.MsgboxAsync(\"Try again! Password or username";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Try again! Password or username is wrong","Admin");
 };
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="End Sub";
return "";
}
}