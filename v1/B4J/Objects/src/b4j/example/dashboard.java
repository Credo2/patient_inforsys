package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dashboard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dashboard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.dashboard.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.b4xdrawer _drawer = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblappversion = null;
public anywheresoftware.b4j.objects.LabelWrapper _btnmenu = null;
public anywheresoftware.b4j.objects.LabelWrapper _btnhide = null;
public anywheresoftware.b4j.objects.LabelWrapper _btnshow = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnexit = null;
public anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlroot = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlmini = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlstatic = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlcenter = null;
public b4j.example.customlistview _clvmenumini = null;
public b4j.example.customlistview _clvmenustatic = null;
public b4j.example.customlistview _clvmenudrawer = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _title = "";
public String _menumode = "";
public anywheresoftware.b4j.objects.SQL _sql = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblminilabel = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.dbutils _dbutils = null;
public String  _initialize(b4j.example.dashboard __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="End Sub";
return "";
}
public String  _actoolbarlight1_navigationitemclick(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "actoolbarlight1_navigationitemclick", false))
	 {return ((String) Debug.delegate(ba, "actoolbarlight1_navigationitemclick", null));}
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Sub ACToolBarLight1_NavigationItemClick";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.Not(__ref._drawer /*b4j.example.b4xdrawer*/ ._getleftopen /*boolean*/ (null)));
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.dashboard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="SetMaximized(B4XPages.GetNativeParent(Me))";
__ref._setmaximized /*String*/ (null,_b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this));
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="DBInit";
__ref._dbinit /*String*/ (null);
RDebugUtils.currentLine=38469637;
 //BA.debugLineNum = 38469637;BA.debugLine="SetTitle";
__ref._settitle /*String*/ (null);
RDebugUtils.currentLine=38469638;
 //BA.debugLineNum = 38469638;BA.debugLine="InitDrawer";
__ref._initdrawer /*String*/ (null);
RDebugUtils.currentLine=38469639;
 //BA.debugLineNum = 38469639;BA.debugLine="InitPanel";
__ref._initpanel /*String*/ (null);
RDebugUtils.currentLine=38469640;
 //BA.debugLineNum = 38469640;BA.debugLine="ShowLoginMenu";
__ref._showloginmenu /*String*/ (null);
RDebugUtils.currentLine=38469642;
 //BA.debugLineNum = 38469642;BA.debugLine="SetButtonMousePointer";
__ref._setbuttonmousepointer /*String*/ (null);
RDebugUtils.currentLine=38469644;
 //BA.debugLineNum = 38469644;BA.debugLine="CSSUtils.SetStyleProperty(BtnExit, \"-fx-focus-col";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._btnexit /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject())),"-fx-focus-color","white");
RDebugUtils.currentLine=38469646;
 //BA.debugLineNum = 38469646;BA.debugLine="End Sub";
return "";
}
public String  _setmaximized(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.Form _frm) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "setmaximized", false))
	 {return ((String) Debug.delegate(ba, "setmaximized", new Object[] {_frm}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Sub SetMaximized(frm As Form)";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_frm));
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="End Sub";
return "";
}
public String  _dbinit(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "dbinit", false))
	 {return ((String) Debug.delegate(ba, "dbinit", null));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Sub DBInit";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="If File.Exists(File.DirData(\"sql\"), \"patient.db\")";
if (__c.File.Exists(__c.File.DirData("sql"),"patient.db")==__c.False) { 
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="File.Copy(File.DirAssets, \"patient.db\", File.Dir";
__c.File.Copy(__c.File.getDirAssets(),"patient.db",__c.File.DirData("sql"),"patient.db");
 };
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="sql.InitializeSQLite(File.DirData(\"sql\"), \"patien";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.DirData("sql"),"patient.db",__c.True);
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "settitle", false))
	 {return ((String) Debug.delegate(ba, "settitle", null));}
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Sub SetTitle";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="B4XPages.SetTitle(Me, Title)";
_b4xpages._settitle /*String*/ (this,(Object)(__ref._title /*String*/ ));
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="End Sub";
return "";
}
public String  _initdrawer(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "initdrawer", false))
	 {return ((String) Debug.delegate(ba, "initdrawer", null));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Sub InitDrawer";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 300dip)";
__ref._drawer /*b4j.example.b4xdrawer*/ ._initialize /*String*/ (null,ba,this,"Drawer",__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"LeftDrawer\")";
__ref._drawer /*b4j.example.b4xdrawer*/ ._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).LoadLayout("LeftDrawer",ba);
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"MainPanel\")";
__ref._drawer /*b4j.example.b4xdrawer*/ ._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).LoadLayout("MainPanel",ba);
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="End Sub";
return "";
}
public String  _initpanel(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "initpanel", false))
	 {return ((String) Debug.delegate(ba, "initpanel", null));}
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Sub InitPanel";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="LblTitle.Text = Title";
__ref._lbltitle /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._title /*String*/ );
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="PnlMini.LoadLayout(\"PanelMini\")";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PanelMini",ba);
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="PnlStatic.LoadLayout(\"PanelStatic\")";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PanelStatic",ba);
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="PnlCenter.LoadLayout(\"Dashboard\")";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Dashboard",ba);
RDebugUtils.currentLine=41025542;
 //BA.debugLineNum = 41025542;BA.debugLine="CSSUtils.SetStyleProperty(Button1, \"-fx-focus-col";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._button1 /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject())),"-fx-focus-color","white");
RDebugUtils.currentLine=41025543;
 //BA.debugLineNum = 41025543;BA.debugLine="Select MenuMode";
switch (BA.switchObjectToInt(__ref._menumode /*String*/ ,"Mini","Static")) {
case 0: {
RDebugUtils.currentLine=41025545;
 //BA.debugLineNum = 41025545;BA.debugLine="PnlMini.Visible = True";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=41025546;
 //BA.debugLineNum = 41025546;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41025547;
 //BA.debugLineNum = 41025547;BA.debugLine="PnlCenter.Width = PnlRoot.Width - PnlMini.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnlroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41025548;
 //BA.debugLineNum = 41025548;BA.debugLine="PnlCenter.Left = 60dip";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.DipToCurrent((int) (60)));
 break; }
case 1: {
RDebugUtils.currentLine=41025550;
 //BA.debugLineNum = 41025550;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41025551;
 //BA.debugLineNum = 41025551;BA.debugLine="PnlStatic.Visible = True";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=41025552;
 //BA.debugLineNum = 41025552;BA.debugLine="PnlCenter.Width = PnlRoot.Width - PnlStatic.Wid";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnlroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41025553;
 //BA.debugLineNum = 41025553;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Wid";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 break; }
default: {
RDebugUtils.currentLine=41025555;
 //BA.debugLineNum = 41025555;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41025556;
 //BA.debugLineNum = 41025556;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41025557;
 //BA.debugLineNum = 41025557;BA.debugLine="PnlCenter.Width = PnlRoot.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnlroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41025558;
 //BA.debugLineNum = 41025558;BA.debugLine="PnlCenter.Left = 0";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(0);
 break; }
}
;
RDebugUtils.currentLine=41025562;
 //BA.debugLineNum = 41025562;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
__c.CallSubDelayed3(ba,this,"SetScrollPaneBackgroundColor",(Object)(__ref._clvmenumini /*b4j.example.customlistview*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent));
RDebugUtils.currentLine=41025563;
 //BA.debugLineNum = 41025563;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
__c.CallSubDelayed3(ba,this,"SetScrollPaneBackgroundColor",(Object)(__ref._clvmenustatic /*b4j.example.customlistview*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent));
RDebugUtils.currentLine=41025564;
 //BA.debugLineNum = 41025564;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
__c.CallSubDelayed3(ba,this,"SetScrollPaneBackgroundColor",(Object)(__ref._clvmenudrawer /*b4j.example.customlistview*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent));
RDebugUtils.currentLine=41025565;
 //BA.debugLineNum = 41025565;BA.debugLine="End Sub";
return "";
}
public String  _showloginmenu(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "showloginmenu", false))
	 {return ((String) Debug.delegate(ba, "showloginmenu", null));}
b4j.example.patientview _frm1 = null;
b4j.example.view2 _frm2 = null;
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Public Sub ShowLoginMenu";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="ClvMenuDrawer.Clear";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="Dim frm1 As patientview";
_frm1 = new b4j.example.patientview();
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="Dim frm2 As view2";
_frm2 = new b4j.example.view2();
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="frm1.Initialize";
_frm1._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=41746437;
 //BA.debugLineNum = 41746437;BA.debugLine="frm2.Initialize";
_frm2._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Dashboard\", Me)";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._addtextitem((Object)("Dashboard"),this);
RDebugUtils.currentLine=41746439;
 //BA.debugLineNum = 41746439;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Form1\", frm1)";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._addtextitem((Object)("Form1"),(Object)(_frm1));
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Form2\", frm2)";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._addtextitem((Object)("Form2"),(Object)(_frm2));
RDebugUtils.currentLine=41746442;
 //BA.debugLineNum = 41746442;BA.debugLine="ClvMenuStatic.AddTextItem(\"Dashboard\", Me)";
__ref._clvmenustatic /*b4j.example.customlistview*/ ._addtextitem((Object)("Dashboard"),this);
RDebugUtils.currentLine=41746443;
 //BA.debugLineNum = 41746443;BA.debugLine="ClvMenuStatic.AddTextItem(\"Form1\", frm1)";
__ref._clvmenustatic /*b4j.example.customlistview*/ ._addtextitem((Object)("Form1"),(Object)(_frm1));
RDebugUtils.currentLine=41746444;
 //BA.debugLineNum = 41746444;BA.debugLine="ClvMenuStatic.AddTextItem(\"Form2\", frm2)";
__ref._clvmenustatic /*b4j.example.customlistview*/ ._addtextitem((Object)("Form2"),(Object)(_frm2));
RDebugUtils.currentLine=41746446;
 //BA.debugLineNum = 41746446;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF015), ClvMe";
__ref._clvmenumini /*b4j.example.customlistview*/ ._add(__ref._createminiitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xf015))),(int) (__ref._clvmenumini /*b4j.example.customlistview*/ ._asview().getWidth())),this);
RDebugUtils.currentLine=41746447;
 //BA.debugLineNum = 41746447;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF004), ClvMe";
__ref._clvmenumini /*b4j.example.customlistview*/ ._add(__ref._createminiitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xf004))),(int) (__ref._clvmenumini /*b4j.example.customlistview*/ ._asview().getWidth())),(Object)(_frm1));
RDebugUtils.currentLine=41746448;
 //BA.debugLineNum = 41746448;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF06B), ClvMe";
__ref._clvmenumini /*b4j.example.customlistview*/ ._add(__ref._createminiitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xf06b))),(int) (__ref._clvmenumini /*b4j.example.customlistview*/ ._asview().getWidth())),(Object)(_frm2));
RDebugUtils.currentLine=41746449;
 //BA.debugLineNum = 41746449;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonmousepointer(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "setbuttonmousepointer", false))
	 {return ((String) Debug.delegate(ba, "setbuttonmousepointer", null));}
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub SetButtonMousePointer";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="BtnMenu.MouseCursor = FX.Cursors.HAND";
__ref._btnmenu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="BtnExit.MouseCursor = FX.Cursors.HAND";
__ref._btnexit /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="BtnHide.MouseCursor = FX.Cursors.HAND";
__ref._btnhide /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="BtnShow.MouseCursor = FX.Cursors.HAND";
__ref._btnshow /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="Button1.MouseCursor = FX.Cursors.HAND";
__ref._button1 /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4j.example.dashboard __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="If Drawer.IsInitialized Then Drawer.Resize(Width,";
if (__ref._drawer /*b4j.example.b4xdrawer*/ .IsInitialized /*boolean*/ ()) { 
__ref._drawer /*b4j.example.b4xdrawer*/ ._resize /*String*/ (null,_width,_height);};
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="End Sub";
return "";
}
public String  _btnhide_mouseclicked(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnhide_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "btnhide_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Private Sub BtnHide_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="MenuMode = \"Drawer\"";
__ref._menumode /*String*/  = "Drawer";
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="PnlCenter.Width = Root.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41156613;
 //BA.debugLineNum = 41156613;BA.debugLine="PnlCenter.Left = 0";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(0);
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
__ref._clvmenustatic_itemclick /*String*/ (null,(int) (0),this);
RDebugUtils.currentLine=41156615;
 //BA.debugLineNum = 41156615;BA.debugLine="End Sub";
return "";
}
public String  _clvmenustatic_itemclick(b4j.example.dashboard __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "clvmenustatic_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvmenustatic_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Private Sub ClvMenuStatic_ItemClick (Index As Int,";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="If ContentEmpty = False Then PnlCenter.GetView(0)";
if (__ref._contentempty /*boolean*/ (null)==__c.False) { 
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).RemoveViewFromParent();};
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="CallSub2(Value, \"Show\", PnlCenter)";
__c.CallSubDebug2(ba,_value,"Show",(Object)(__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="End Sub";
return "";
}
public String  _btnmenu_mouseclicked(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnmenu_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "btnmenu_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Sub BtnMenu_MouseClicked (EventData As MouseEvent)";
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="Select MenuMode";
switch (BA.switchObjectToInt(__ref._menumode /*String*/ ,"Mini","Static")) {
case 0: 
case 1: {
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="SwitchMenu";
__ref._switchmenu /*String*/ (null);
 break; }
default: {
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.Not(__ref._drawer /*b4j.example.b4xdrawer*/ ._getleftopen /*boolean*/ (null)));
 break; }
}
;
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="End Sub";
return "";
}
public String  _switchmenu(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "switchmenu", false))
	 {return ((String) Debug.delegate(ba, "switchmenu", null));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Sub SwitchMenu";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="Select MenuMode";
switch (BA.switchObjectToInt(__ref._menumode /*String*/ ,"Mini","Static")) {
case 0: {
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="MenuMode = \"Static\"";
__ref._menumode /*String*/  = "Static";
RDebugUtils.currentLine=41680900;
 //BA.debugLineNum = 41680900;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41680901;
 //BA.debugLineNum = 41680901;BA.debugLine="PnlStatic.Visible = True";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="PnlCenter.Width = Root.Width - PnlStatic.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Wid";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 break; }
case 1: {
RDebugUtils.currentLine=41680905;
 //BA.debugLineNum = 41680905;BA.debugLine="MenuMode = \"Mini\"";
__ref._menumode /*String*/  = "Mini";
RDebugUtils.currentLine=41680906;
 //BA.debugLineNum = 41680906;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41680907;
 //BA.debugLineNum = 41680907;BA.debugLine="PnlMini.Visible = True";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=41680908;
 //BA.debugLineNum = 41680908;BA.debugLine="PnlCenter.Width = Root.Width - PnlMini.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41680909;
 //BA.debugLineNum = 41680909;BA.debugLine="PnlCenter.Left = PnlMini.Left + PnlMini.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 break; }
}
;
RDebugUtils.currentLine=41680911;
 //BA.debugLineNum = 41680911;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
__ref._clvmenustatic_itemclick /*String*/ (null,(int) (0),this);
RDebugUtils.currentLine=41680912;
 //BA.debugLineNum = 41680912;BA.debugLine="End Sub";
return "";
}
public String  _btnshow_mouseclicked(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnshow_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "btnshow_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Private Sub BtnShow_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Drawer.LeftOpen = False";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="MenuMode = \"Static\"";
__ref._menumode /*String*/  = "Static";
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="PnlStatic.Visible = True";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=41222149;
 //BA.debugLineNum = 41222149;BA.debugLine="PnlCenter.Width = Root.Width - PnlStatic.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=41222151;
 //BA.debugLineNum = 41222151;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
__ref._clvmenustatic_itemclick /*String*/ (null,(int) (0),this);
RDebugUtils.currentLine=41222152;
 //BA.debugLineNum = 41222152;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Private XUI 			As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="Private Root 			As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="Private mBase 			As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="Private Drawer 			As B4XDrawer";
_drawer = new b4j.example.b4xdrawer();
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="Private LblTitle 		As Label";
_lbltitle = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="Private lblAppVersion 	As Label";
_lblappversion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="Private BtnMenu 		As Label";
_btnmenu = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=38338568;
 //BA.debugLineNum = 38338568;BA.debugLine="Private BtnHide 		As Label";
_btnhide = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="Private BtnShow 		As Label";
_btnshow = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="Private BtnExit 		As Button";
_btnexit = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=38338571;
 //BA.debugLineNum = 38338571;BA.debugLine="Private Button1 		As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=38338572;
 //BA.debugLineNum = 38338572;BA.debugLine="Private PnlRoot 		As B4XView";
_pnlroot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338573;
 //BA.debugLineNum = 38338573;BA.debugLine="Private PnlMini 		As B4XView";
_pnlmini = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338574;
 //BA.debugLineNum = 38338574;BA.debugLine="Private PnlStatic 		As B4XView";
_pnlstatic = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338575;
 //BA.debugLineNum = 38338575;BA.debugLine="Private PnlCenter 		As B4XView";
_pnlcenter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338576;
 //BA.debugLineNum = 38338576;BA.debugLine="Private ClvMenuMini 	As CustomListView";
_clvmenumini = new b4j.example.customlistview();
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="Private ClvMenuStatic 	As CustomListView";
_clvmenustatic = new b4j.example.customlistview();
RDebugUtils.currentLine=38338578;
 //BA.debugLineNum = 38338578;BA.debugLine="Private ClvMenuDrawer 	As CustomListView";
_clvmenudrawer = new b4j.example.customlistview();
RDebugUtils.currentLine=38338580;
 //BA.debugLineNum = 38338580;BA.debugLine="Private FX 				As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=38338582;
 //BA.debugLineNum = 38338582;BA.debugLine="Private Title 			As String = \"AB4XDashboard\"";
_title = "AB4XDashboard";
RDebugUtils.currentLine=38338583;
 //BA.debugLineNum = 38338583;BA.debugLine="Private MenuMode		As String = \"Mini\"";
_menumode = "Mini";
RDebugUtils.currentLine=38338585;
 //BA.debugLineNum = 38338585;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=38338586;
 //BA.debugLineNum = 38338586;BA.debugLine="Private lblMiniLabel 	As B4XView";
_lblminilabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38338587;
 //BA.debugLineNum = 38338587;BA.debugLine="End Sub";
return "";
}
public String  _clvmenudrawer_itemclick(b4j.example.dashboard __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "clvmenudrawer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvmenudrawer_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Private Sub ClvMenuDrawer_ItemClick (Index As Int,";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="Drawer.LeftOpen = False";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="ClvMenuStatic_ItemClick(Index, Value)";
__ref._clvmenustatic_itemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="End Sub";
return "";
}
public String  _clvmenumini_itemclick(b4j.example.dashboard __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "clvmenumini_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvmenumini_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub ClvMenuMini_ItemClick (Index As Int, V";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="ClvMenuStatic_ItemClick(Index, Value)";
__ref._clvmenustatic_itemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="End Sub";
return "";
}
public boolean  _contentempty(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "contentempty", false))
	 {return ((Boolean) Debug.delegate(ba, "contentempty", null));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub ContentEmpty As Boolean";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Return PnlCenter.NumberOfViews = 0";
if (true) return __ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()==0;
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="End Sub";
return false;
}
public String  _show(b4j.example.dashboard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_parent}));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Private Sub Show (Parent As B4XView)";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="If mBase.IsInitialized = False Then";
if (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="mBase = XUI.CreatePanel(\"\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="mBase.LoadLayout(\"Dashboard\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Dashboard",ba);
 };
RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="mBase.RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="Parent.AddView(mBase, 0, 0, Parent.Width, Parent.";
_parent.AddView((javafx.scene.Node)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="CSSUtils.SetStyleProperty(Button1, \"-fx-focus-col";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._button1 /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject())),"-fx-focus-color","white");
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createminiitem(b4j.example.dashboard __ref,String _text,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "createminiitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createminiitem", new Object[] {_text,_width}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Sub CreateMiniItem (Text As String, Width As Int)";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Dim pnl As B4XView = XUI.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, 60dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_width,__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="pnl.LoadLayout(\"MiniItem\")";
_pnl.LoadLayout("MiniItem",ba);
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="lblMiniLabel.Text = Text";
__ref._lblminilabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=41811976;
 //BA.debugLineNum = 41811976;BA.debugLine="pnl.As(Pane).MouseCursor = FX.Cursors.HAND";
((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_pnl.getObject()))).setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=41811978;
 //BA.debugLineNum = 41811978;BA.debugLine="Return pnl";
if (true) return _pnl;
RDebugUtils.currentLine=41811979;
 //BA.debugLineNum = 41811979;BA.debugLine="End Sub";
return null;
}
public String  _drawer_statechanged(b4j.example.dashboard __ref,boolean _open) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "drawer_statechanged", false))
	 {return ((String) Debug.delegate(ba, "drawer_statechanged", new Object[] {_open}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Sub Drawer_StateChanged (Open As Boolean)";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="If Open Then";
if (_open) { 
 }else {
 };
RDebugUtils.currentLine=41287686;
 //BA.debugLineNum = 41287686;BA.debugLine="End Sub";
return "";
}
public String  _setscrollpanebackgroundcolor(b4j.example.dashboard __ref,b4j.example.customlistview _view,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "setscrollpanebackgroundcolor", false))
	 {return ((String) Debug.delegate(ba, "setscrollpanebackgroundcolor", new Object[] {_view,_color}));}
anywheresoftware.b4j.object.JavaObject _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub SetScrollPaneBackgroundColor (View As";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="Dim SP As JavaObject = View.GetBase.GetView(0)";
_sp = new anywheresoftware.b4j.object.JavaObject();
_sp = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view._getbase().GetView((int) (0)).getObject()));
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="Dim V As B4XView = SP";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="V.Color = Color";
_v.setColor(_color);
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="Dim V As B4XView = SP.RunMethod(\"lookup\", Array(\"";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.RunMethod("lookup",new Object[]{(Object)(".viewport")})));
RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="V.Color = Color";
_v.setColor(_color);
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="End Sub";
return "";
}
}