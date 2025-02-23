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
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="End Sub";
return "";
}
public String  _actoolbarlight1_navigationitemclick(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "actoolbarlight1_navigationitemclick", false))
	 {return ((String) Debug.delegate(ba, "actoolbarlight1_navigationitemclick", null));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Sub ACToolBarLight1_NavigationItemClick";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.Not(__ref._drawer /*b4j.example.b4xdrawer*/ ._getleftopen /*boolean*/ (null)));
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.dashboard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="SetMaximized(B4XPages.GetNativeParent(Me))";
__ref._setmaximized /*String*/ (null,_b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this));
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="DBInit";
__ref._dbinit /*String*/ (null);
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="SetTitle";
__ref._settitle /*String*/ (null);
RDebugUtils.currentLine=38076422;
 //BA.debugLineNum = 38076422;BA.debugLine="InitDrawer";
__ref._initdrawer /*String*/ (null);
RDebugUtils.currentLine=38076423;
 //BA.debugLineNum = 38076423;BA.debugLine="InitPanel";
__ref._initpanel /*String*/ (null);
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="ShowLoginMenu";
__ref._showloginmenu /*String*/ (null);
RDebugUtils.currentLine=38076426;
 //BA.debugLineNum = 38076426;BA.debugLine="SetButtonMousePointer";
__ref._setbuttonmousepointer /*String*/ (null);
RDebugUtils.currentLine=38076428;
 //BA.debugLineNum = 38076428;BA.debugLine="CSSUtils.SetStyleProperty(BtnExit, \"-fx-focus-col";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._btnexit /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject())),"-fx-focus-color","white");
RDebugUtils.currentLine=38076430;
 //BA.debugLineNum = 38076430;BA.debugLine="End Sub";
return "";
}
public String  _setmaximized(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.Form _frm) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "setmaximized", false))
	 {return ((String) Debug.delegate(ba, "setmaximized", new Object[] {_frm}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Sub SetMaximized(frm As Form)";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_frm));
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=39452676;
 //BA.debugLineNum = 39452676;BA.debugLine="End Sub";
return "";
}
public String  _dbinit(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "dbinit", false))
	 {return ((String) Debug.delegate(ba, "dbinit", null));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Sub DBInit";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="If File.Exists(File.DirData(\"sql\"), \"patient.db\")";
if (__c.File.Exists(__c.File.DirData("sql"),"patient.db")==__c.False) { 
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="File.Copy(File.DirAssets, \"patient.db\", File.Dir";
__c.File.Copy(__c.File.getDirAssets(),"patient.db",__c.File.DirData("sql"),"patient.db");
 };
RDebugUtils.currentLine=39387143;
 //BA.debugLineNum = 39387143;BA.debugLine="sql.InitializeSQLite(File.DirData(\"sql\"), \"patien";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.DirData("sql"),"patient.db",__c.True);
RDebugUtils.currentLine=39387144;
 //BA.debugLineNum = 39387144;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "settitle", false))
	 {return ((String) Debug.delegate(ba, "settitle", null));}
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Sub SetTitle";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="B4XPages.SetTitle(Me, Title)";
_b4xpages._settitle /*String*/ (this,(Object)(__ref._title /*String*/ ));
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="End Sub";
return "";
}
public String  _initdrawer(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "initdrawer", false))
	 {return ((String) Debug.delegate(ba, "initdrawer", null));}
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Sub InitDrawer";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 300dip)";
__ref._drawer /*b4j.example.b4xdrawer*/ ._initialize /*String*/ (null,ba,this,"Drawer",__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"LeftDrawer\")";
__ref._drawer /*b4j.example.b4xdrawer*/ ._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).LoadLayout("LeftDrawer",ba);
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"MainPanel\")";
__ref._drawer /*b4j.example.b4xdrawer*/ ._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).LoadLayout("MainPanel",ba);
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="End Sub";
return "";
}
public String  _initpanel(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "initpanel", false))
	 {return ((String) Debug.delegate(ba, "initpanel", null));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Sub InitPanel";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="LblTitle.Text = Title";
__ref._lbltitle /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._title /*String*/ );
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="PnlMini.LoadLayout(\"PanelMini\")";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PanelMini",ba);
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="PnlStatic.LoadLayout(\"PanelStatic\")";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PanelStatic",ba);
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="PnlCenter.LoadLayout(\"Dashboard\")";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Dashboard",ba);
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="CSSUtils.SetStyleProperty(Button1, \"-fx-focus-col";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._button1 /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject())),"-fx-focus-color","white");
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="Select MenuMode";
switch (BA.switchObjectToInt(__ref._menumode /*String*/ ,"Mini","Static")) {
case 0: {
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="PnlMini.Visible = True";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38338571;
 //BA.debugLineNum = 38338571;BA.debugLine="PnlCenter.Width = PnlRoot.Width - PnlMini.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnlroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=38338572;
 //BA.debugLineNum = 38338572;BA.debugLine="PnlCenter.Left = 60dip";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.DipToCurrent((int) (60)));
 break; }
case 1: {
RDebugUtils.currentLine=38338574;
 //BA.debugLineNum = 38338574;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38338575;
 //BA.debugLineNum = 38338575;BA.debugLine="PnlStatic.Visible = True";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=38338576;
 //BA.debugLineNum = 38338576;BA.debugLine="PnlCenter.Width = PnlRoot.Width - PnlStatic.Wid";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnlroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Wid";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 break; }
default: {
RDebugUtils.currentLine=38338579;
 //BA.debugLineNum = 38338579;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38338580;
 //BA.debugLineNum = 38338580;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38338581;
 //BA.debugLineNum = 38338581;BA.debugLine="PnlCenter.Width = PnlRoot.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnlroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=38338582;
 //BA.debugLineNum = 38338582;BA.debugLine="PnlCenter.Left = 0";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(0);
 break; }
}
;
RDebugUtils.currentLine=38338586;
 //BA.debugLineNum = 38338586;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
__c.CallSubDelayed3(ba,this,"SetScrollPaneBackgroundColor",(Object)(__ref._clvmenumini /*b4j.example.customlistview*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent));
RDebugUtils.currentLine=38338587;
 //BA.debugLineNum = 38338587;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
__c.CallSubDelayed3(ba,this,"SetScrollPaneBackgroundColor",(Object)(__ref._clvmenustatic /*b4j.example.customlistview*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent));
RDebugUtils.currentLine=38338588;
 //BA.debugLineNum = 38338588;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
__c.CallSubDelayed3(ba,this,"SetScrollPaneBackgroundColor",(Object)(__ref._clvmenudrawer /*b4j.example.customlistview*/ ),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent));
RDebugUtils.currentLine=38338589;
 //BA.debugLineNum = 38338589;BA.debugLine="End Sub";
return "";
}
public String  _showloginmenu(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "showloginmenu", false))
	 {return ((String) Debug.delegate(ba, "showloginmenu", null));}
b4j.example.patientview _frm1 = null;
b4j.example.view2 _frm2 = null;
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub ShowLoginMenu";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="ClvMenuDrawer.Clear";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="Dim frm1 As patientview";
_frm1 = new b4j.example.patientview();
RDebugUtils.currentLine=39124995;
 //BA.debugLineNum = 39124995;BA.debugLine="Dim frm2 As view2";
_frm2 = new b4j.example.view2();
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="frm1.Initialize";
_frm1._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=39124997;
 //BA.debugLineNum = 39124997;BA.debugLine="frm2.Initialize";
_frm2._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=39124998;
 //BA.debugLineNum = 39124998;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Home\", Me)";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._addtextitem((Object)("Home"),this);
RDebugUtils.currentLine=39124999;
 //BA.debugLineNum = 39124999;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Patient List\", frm1)";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._addtextitem((Object)("Patient List"),(Object)(_frm1));
RDebugUtils.currentLine=39125000;
 //BA.debugLineNum = 39125000;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Input Form\", frm2)";
__ref._clvmenudrawer /*b4j.example.customlistview*/ ._addtextitem((Object)("Input Form"),(Object)(_frm2));
RDebugUtils.currentLine=39125002;
 //BA.debugLineNum = 39125002;BA.debugLine="ClvMenuStatic.AddTextItem(\"Home\", Me)";
__ref._clvmenustatic /*b4j.example.customlistview*/ ._addtextitem((Object)("Home"),this);
RDebugUtils.currentLine=39125003;
 //BA.debugLineNum = 39125003;BA.debugLine="ClvMenuStatic.AddTextItem(\"Patient List\", frm1)";
__ref._clvmenustatic /*b4j.example.customlistview*/ ._addtextitem((Object)("Patient List"),(Object)(_frm1));
RDebugUtils.currentLine=39125004;
 //BA.debugLineNum = 39125004;BA.debugLine="ClvMenuStatic.AddTextItem(\"Input Form\", frm2)";
__ref._clvmenustatic /*b4j.example.customlistview*/ ._addtextitem((Object)("Input Form"),(Object)(_frm2));
RDebugUtils.currentLine=39125006;
 //BA.debugLineNum = 39125006;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF015), ClvMe";
__ref._clvmenumini /*b4j.example.customlistview*/ ._add(__ref._createminiitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xf015))),(int) (__ref._clvmenumini /*b4j.example.customlistview*/ ._asview().getWidth())),this);
RDebugUtils.currentLine=39125007;
 //BA.debugLineNum = 39125007;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF004), ClvMe";
__ref._clvmenumini /*b4j.example.customlistview*/ ._add(__ref._createminiitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xf004))),(int) (__ref._clvmenumini /*b4j.example.customlistview*/ ._asview().getWidth())),(Object)(_frm1));
RDebugUtils.currentLine=39125008;
 //BA.debugLineNum = 39125008;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF06B), ClvMe";
__ref._clvmenumini /*b4j.example.customlistview*/ ._add(__ref._createminiitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xf06b))),(int) (__ref._clvmenumini /*b4j.example.customlistview*/ ._asview().getWidth())),(Object)(_frm2));
RDebugUtils.currentLine=39125009;
 //BA.debugLineNum = 39125009;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonmousepointer(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "setbuttonmousepointer", false))
	 {return ((String) Debug.delegate(ba, "setbuttonmousepointer", null));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Private Sub SetButtonMousePointer";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="BtnMenu.MouseCursor = FX.Cursors.HAND";
__ref._btnmenu /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="BtnExit.MouseCursor = FX.Cursors.HAND";
__ref._btnexit /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="BtnHide.MouseCursor = FX.Cursors.HAND";
__ref._btnhide /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=39321604;
 //BA.debugLineNum = 39321604;BA.debugLine="BtnShow.MouseCursor = FX.Cursors.HAND";
__ref._btnshow /*anywheresoftware.b4j.objects.LabelWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=39321605;
 //BA.debugLineNum = 39321605;BA.debugLine="Button1.MouseCursor = FX.Cursors.HAND";
__ref._button1 /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=39321606;
 //BA.debugLineNum = 39321606;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4j.example.dashboard __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="If Drawer.IsInitialized Then Drawer.Resize(Width,";
if (__ref._drawer /*b4j.example.b4xdrawer*/ .IsInitialized /*boolean*/ ()) { 
__ref._drawer /*b4j.example.b4xdrawer*/ ._resize /*String*/ (null,_width,_height);};
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="End Sub";
return "";
}
public String  _btnhide_mouseclicked(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnhide_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "btnhide_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub BtnHide_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="MenuMode = \"Drawer\"";
__ref._menumode /*String*/  = "Drawer";
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="PnlCenter.Width = Root.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="PnlCenter.Left = 0";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(0);
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
__ref._clvmenustatic_itemclick /*String*/ (null,(int) (0),this);
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="End Sub";
return "";
}
public String  _clvmenustatic_itemclick(b4j.example.dashboard __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "clvmenustatic_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvmenustatic_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Private Sub ClvMenuStatic_ItemClick (Index As Int,";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="If ContentEmpty = False Then PnlCenter.GetView(0)";
if (__ref._contentempty /*boolean*/ (null)==__c.False) { 
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).RemoveViewFromParent();};
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="CallSub2(Value, \"Show\", PnlCenter)";
__c.CallSubDebug2(ba,_value,"Show",(Object)(__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="End Sub";
return "";
}
public String  _btnmenu_mouseclicked(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnmenu_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "btnmenu_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Sub BtnMenu_MouseClicked (EventData As MouseEvent)";
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Select MenuMode";
switch (BA.switchObjectToInt(__ref._menumode /*String*/ ,"Mini","Static")) {
case 0: 
case 1: {
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="SwitchMenu";
__ref._switchmenu /*String*/ (null);
 break; }
default: {
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.Not(__ref._drawer /*b4j.example.b4xdrawer*/ ._getleftopen /*boolean*/ (null)));
 break; }
}
;
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="End Sub";
return "";
}
public String  _switchmenu(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "switchmenu", false))
	 {return ((String) Debug.delegate(ba, "switchmenu", null));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Sub SwitchMenu";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Select MenuMode";
switch (BA.switchObjectToInt(__ref._menumode /*String*/ ,"Mini","Static")) {
case 0: {
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="MenuMode = \"Static\"";
__ref._menumode /*String*/  = "Static";
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="PnlStatic.Visible = True";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=39059462;
 //BA.debugLineNum = 39059462;BA.debugLine="PnlCenter.Width = Root.Width - PnlStatic.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=39059463;
 //BA.debugLineNum = 39059463;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Wid";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 break; }
case 1: {
RDebugUtils.currentLine=39059465;
 //BA.debugLineNum = 39059465;BA.debugLine="MenuMode = \"Mini\"";
__ref._menumode /*String*/  = "Mini";
RDebugUtils.currentLine=39059466;
 //BA.debugLineNum = 39059466;BA.debugLine="PnlStatic.Visible = False";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=39059467;
 //BA.debugLineNum = 39059467;BA.debugLine="PnlMini.Visible = True";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=39059468;
 //BA.debugLineNum = 39059468;BA.debugLine="PnlCenter.Width = Root.Width - PnlMini.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=39059469;
 //BA.debugLineNum = 39059469;BA.debugLine="PnlCenter.Left = PnlMini.Left + PnlMini.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 break; }
}
;
RDebugUtils.currentLine=39059471;
 //BA.debugLineNum = 39059471;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
__ref._clvmenustatic_itemclick /*String*/ (null,(int) (0),this);
RDebugUtils.currentLine=39059472;
 //BA.debugLineNum = 39059472;BA.debugLine="End Sub";
return "";
}
public String  _btnshow_mouseclicked(b4j.example.dashboard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "btnshow_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "btnshow_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Private Sub BtnShow_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Drawer.LeftOpen = False";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="MenuMode = \"Static\"";
__ref._menumode /*String*/  = "Static";
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="PnlMini.Visible = False";
__ref._pnlmini /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="PnlStatic.Visible = True";
__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="PnlCenter.Width = Root.Width - PnlStatic.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Width";
__ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._pnlstatic /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
__ref._clvmenustatic_itemclick /*String*/ (null,(int) (0),this);
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="Private XUI 			As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Private Root 			As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="Private mBase 			As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="Private Drawer 			As B4XDrawer";
_drawer = new b4j.example.b4xdrawer();
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Private LblTitle 		As Label";
_lbltitle = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="Private lblAppVersion 	As Label";
_lblappversion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="Private BtnMenu 		As Label";
_btnmenu = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="Private BtnHide 		As Label";
_btnhide = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="Private BtnShow 		As Label";
_btnshow = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="Private BtnExit 		As Button";
_btnexit = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="Private Button1 		As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="Private PnlRoot 		As B4XView";
_pnlroot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945357;
 //BA.debugLineNum = 37945357;BA.debugLine="Private PnlMini 		As B4XView";
_pnlmini = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="Private PnlStatic 		As B4XView";
_pnlstatic = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945359;
 //BA.debugLineNum = 37945359;BA.debugLine="Private PnlCenter 		As B4XView";
_pnlcenter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="Private ClvMenuMini 	As CustomListView";
_clvmenumini = new b4j.example.customlistview();
RDebugUtils.currentLine=37945361;
 //BA.debugLineNum = 37945361;BA.debugLine="Private ClvMenuStatic 	As CustomListView";
_clvmenustatic = new b4j.example.customlistview();
RDebugUtils.currentLine=37945362;
 //BA.debugLineNum = 37945362;BA.debugLine="Private ClvMenuDrawer 	As CustomListView";
_clvmenudrawer = new b4j.example.customlistview();
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="Private FX 				As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=37945366;
 //BA.debugLineNum = 37945366;BA.debugLine="Private Title 			As String = \"AB4XDashboard\"";
_title = "AB4XDashboard";
RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="Private MenuMode		As String = \"Mini\"";
_menumode = "Mini";
RDebugUtils.currentLine=37945369;
 //BA.debugLineNum = 37945369;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=37945370;
 //BA.debugLineNum = 37945370;BA.debugLine="Private lblMiniLabel 	As B4XView";
_lblminilabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37945371;
 //BA.debugLineNum = 37945371;BA.debugLine="End Sub";
return "";
}
public String  _clvmenudrawer_itemclick(b4j.example.dashboard __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "clvmenudrawer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvmenudrawer_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Private Sub ClvMenuDrawer_ItemClick (Index As Int,";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Drawer.LeftOpen = False";
__ref._drawer /*b4j.example.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="ClvMenuStatic_ItemClick(Index, Value)";
__ref._clvmenustatic_itemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="End Sub";
return "";
}
public String  _clvmenumini_itemclick(b4j.example.dashboard __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "clvmenumini_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvmenumini_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Private Sub ClvMenuMini_ItemClick (Index As Int, V";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="ClvMenuStatic_ItemClick(Index, Value)";
__ref._clvmenustatic_itemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public boolean  _contentempty(b4j.example.dashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "contentempty", false))
	 {return ((Boolean) Debug.delegate(ba, "contentempty", null));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub ContentEmpty As Boolean";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Return PnlCenter.NumberOfViews = 0";
if (true) return __ref._pnlcenter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()==0;
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="End Sub";
return false;
}
public String  _show(b4j.example.dashboard __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_parent}));}
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub Show (Parent As B4XView)";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="If mBase.IsInitialized = False Then";
if (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="mBase = XUI.CreatePanel(\"\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="mBase.LoadLayout(\"Dashboard\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Dashboard",ba);
 };
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="mBase.RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="Parent.AddView(mBase, 0, 0, Parent.Width, Parent.";
_parent.AddView((javafx.scene.Node)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="CSSUtils.SetStyleProperty(Button1, \"-fx-focus-col";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._button1 /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject())),"-fx-focus-color","white");
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createminiitem(b4j.example.dashboard __ref,String _text,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "createminiitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createminiitem", new Object[] {_text,_width}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Sub CreateMiniItem (Text As String, Width As Int)";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Dim pnl As B4XView = XUI.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, 60dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_width,__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="pnl.LoadLayout(\"MiniItem\")";
_pnl.LoadLayout("MiniItem",ba);
RDebugUtils.currentLine=39190533;
 //BA.debugLineNum = 39190533;BA.debugLine="lblMiniLabel.Text = Text";
__ref._lblminilabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=39190536;
 //BA.debugLineNum = 39190536;BA.debugLine="pnl.As(Pane).MouseCursor = FX.Cursors.HAND";
((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_pnl.getObject()))).setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=39190538;
 //BA.debugLineNum = 39190538;BA.debugLine="Return pnl";
if (true) return _pnl;
RDebugUtils.currentLine=39190539;
 //BA.debugLineNum = 39190539;BA.debugLine="End Sub";
return null;
}
public String  _drawer_statechanged(b4j.example.dashboard __ref,boolean _open) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "drawer_statechanged", false))
	 {return ((String) Debug.delegate(ba, "drawer_statechanged", new Object[] {_open}));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Sub Drawer_StateChanged (Open As Boolean)";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="If Open Then";
if (_open) { 
 }else {
 };
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="End Sub";
return "";
}
public String  _setscrollpanebackgroundcolor(b4j.example.dashboard __ref,b4j.example.customlistview _view,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="dashboard";
if (Debug.shouldDelegate(ba, "setscrollpanebackgroundcolor", false))
	 {return ((String) Debug.delegate(ba, "setscrollpanebackgroundcolor", new Object[] {_view,_color}));}
anywheresoftware.b4j.object.JavaObject _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Private Sub SetScrollPaneBackgroundColor (View As";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Dim SP As JavaObject = View.GetBase.GetView(0)";
_sp = new anywheresoftware.b4j.object.JavaObject();
_sp = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view._getbase().GetView((int) (0)).getObject()));
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Dim V As B4XView = SP";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="V.Color = Color";
_v.setColor(_color);
RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Dim V As B4XView = SP.RunMethod(\"lookup\", Array(\"";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.RunMethod("lookup",new Object[]{(Object)(".viewport")})));
RDebugUtils.currentLine=39256069;
 //BA.debugLineNum = 39256069;BA.debugLine="V.Color = Color";
_v.setColor(_color);
RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="End Sub";
return "";
}
}