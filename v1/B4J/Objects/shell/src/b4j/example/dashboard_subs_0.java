package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dashboard_subs_0 {


public static RemoteObject  _actoolbarlight1_navigationitemclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ACToolBarLight1_NavigationItemClick (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("actoolbarlight1_navigationitemclick")) { return __ref.runUserSub(false, "dashboard","actoolbarlight1_navigationitemclick", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Sub ACToolBarLight1_NavigationItemClick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
Debug.ShouldStop(131072);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,dashboard.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_getleftopen" /*RemoteObject*/ ))));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "dashboard","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 36;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Root = Root1";
Debug.ShouldStop(16);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 39;BA.debugLine="SetMaximized(B4XPages.GetNativeParent(Me))";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.dashboard.class, "_setmaximized" /*RemoteObject*/ ,(Object)(dashboard._b4xpages.runMethod(false,"_getnativeparent" /*RemoteObject*/ ,(Object)(__ref))));
 BA.debugLineNum = 40;BA.debugLine="DBInit";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.dashboard.class, "_dbinit" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="SetTitle";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.dashboard.class, "_settitle" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="InitDrawer";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.dashboard.class, "_initdrawer" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="InitPanel";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.dashboard.class, "_initpanel" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="ShowLoginMenu";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.dashboard.class, "_showloginmenu" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="SetButtonMousePointer";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.dashboard.class, "_setbuttonmousepointer" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="CSSUtils.SetStyleProperty(BtnExit, \"-fx-focus-col";
Debug.ShouldStop(32768);
dashboard._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_btnexit" /*RemoteObject*/ ).getObject()),(Object)(BA.ObjectToString("-fx-focus-color")),(Object)(RemoteObject.createImmutable("white")));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Resize (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("b4xpage_resize")) { return __ref.runUserSub(false, "dashboard","b4xpage_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 52;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If Drawer.IsInitialized Then Drawer.Resize(Width,";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_drawer" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_resize" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));};
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhide_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("BtnHide_MouseClicked (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("btnhide_mouseclicked")) { return __ref.runUserSub(false, "dashboard","btnhide_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 117;BA.debugLine="Private Sub BtnHide_MouseClicked (EventData As Mou";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="MenuMode = \"Drawer\"";
Debug.ShouldStop(2097152);
__ref.setField ("_menumode" /*RemoteObject*/ ,BA.ObjectToString("Drawer"));
 BA.debugLineNum = 119;BA.debugLine="PnlMini.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 120;BA.debugLine="PnlStatic.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 121;BA.debugLine="PnlCenter.Width = Root.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 122;BA.debugLine="PnlCenter.Left = 0";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, 0));
 BA.debugLineNum = 123;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.dashboard.class, "_clvmenustatic_itemclick" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenu_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("BtnMenu_MouseClicked (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("btnmenu_mouseclicked")) { return __ref.runUserSub(false, "dashboard","btnmenu_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 103;BA.debugLine="Sub BtnMenu_MouseClicked (EventData As MouseEvent)";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="Select MenuMode";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(__ref.getField(true,"_menumode" /*RemoteObject*/ ),BA.ObjectToString("Mini"),BA.ObjectToString("Static"))) {
case 0: 
case 1: {
 BA.debugLineNum = 107;BA.debugLine="SwitchMenu";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.dashboard.class, "_switchmenu" /*RemoteObject*/ );
 break; }
default: {
 BA.debugLineNum = 109;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
Debug.ShouldStop(4096);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,dashboard.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_getleftopen" /*RemoteObject*/ ))));
 break; }
}
;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshow_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("BtnShow_MouseClicked (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("btnshow_mouseclicked")) { return __ref.runUserSub(false, "dashboard","btnshow_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 126;BA.debugLine="Private Sub BtnShow_MouseClicked (EventData As Mou";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Drawer.LeftOpen = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 128;BA.debugLine="MenuMode = \"Static\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_menumode" /*RemoteObject*/ ,BA.ObjectToString("Static"));
 BA.debugLineNum = 129;BA.debugLine="PnlMini.Visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 130;BA.debugLine="PnlStatic.Visible = True";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"True"));
 BA.debugLineNum = 131;BA.debugLine="PnlCenter.Width = Root.Width - PnlStatic.Width";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));
 BA.debugLineNum = 132;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Width";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 0));
 BA.debugLineNum = 133;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.dashboard.class, "_clvmenustatic_itemclick" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private XUI 			As XUI";
dashboard._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",dashboard._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private Root 			As B4XView";
dashboard._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",dashboard._root);
 //BA.debugLineNum = 6;BA.debugLine="Private mBase 			As B4XView";
dashboard._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",dashboard._mbase);
 //BA.debugLineNum = 7;BA.debugLine="Private Drawer 			As B4XDrawer";
dashboard._drawer = RemoteObject.createNew ("b4j.example.b4xdrawer");__ref.setField("_drawer",dashboard._drawer);
 //BA.debugLineNum = 8;BA.debugLine="Private LblTitle 		As Label";
dashboard._lbltitle = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitle",dashboard._lbltitle);
 //BA.debugLineNum = 9;BA.debugLine="Private lblAppVersion 	As Label";
dashboard._lblappversion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblappversion",dashboard._lblappversion);
 //BA.debugLineNum = 10;BA.debugLine="Private BtnMenu 		As Label";
dashboard._btnmenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_btnmenu",dashboard._btnmenu);
 //BA.debugLineNum = 11;BA.debugLine="Private BtnHide 		As Label";
dashboard._btnhide = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_btnhide",dashboard._btnhide);
 //BA.debugLineNum = 12;BA.debugLine="Private BtnShow 		As Label";
dashboard._btnshow = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_btnshow",dashboard._btnshow);
 //BA.debugLineNum = 13;BA.debugLine="Private BtnExit 		As Button";
dashboard._btnexit = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnexit",dashboard._btnexit);
 //BA.debugLineNum = 14;BA.debugLine="Private Button1 		As Button";
dashboard._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_button1",dashboard._button1);
 //BA.debugLineNum = 15;BA.debugLine="Private PnlRoot 		As B4XView";
dashboard._pnlroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlroot",dashboard._pnlroot);
 //BA.debugLineNum = 16;BA.debugLine="Private PnlMini 		As B4XView";
dashboard._pnlmini = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlmini",dashboard._pnlmini);
 //BA.debugLineNum = 17;BA.debugLine="Private PnlStatic 		As B4XView";
dashboard._pnlstatic = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlstatic",dashboard._pnlstatic);
 //BA.debugLineNum = 18;BA.debugLine="Private PnlCenter 		As B4XView";
dashboard._pnlcenter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlcenter",dashboard._pnlcenter);
 //BA.debugLineNum = 19;BA.debugLine="Private ClvMenuMini 	As CustomListView";
dashboard._clvmenumini = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvmenumini",dashboard._clvmenumini);
 //BA.debugLineNum = 20;BA.debugLine="Private ClvMenuStatic 	As CustomListView";
dashboard._clvmenustatic = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvmenustatic",dashboard._clvmenustatic);
 //BA.debugLineNum = 21;BA.debugLine="Private ClvMenuDrawer 	As CustomListView";
dashboard._clvmenudrawer = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvmenudrawer",dashboard._clvmenudrawer);
 //BA.debugLineNum = 23;BA.debugLine="Private FX 				As JFX";
dashboard._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",dashboard._fx);
 //BA.debugLineNum = 25;BA.debugLine="Private Title 			As String = \"AB4XDashboard\"";
dashboard._title = BA.ObjectToString("AB4XDashboard");__ref.setField("_title",dashboard._title);
 //BA.debugLineNum = 26;BA.debugLine="Private MenuMode		As String = \"Mini\"";
dashboard._menumode = BA.ObjectToString("Mini");__ref.setField("_menumode",dashboard._menumode);
 //BA.debugLineNum = 28;BA.debugLine="Private sql As SQL";
dashboard._sql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql",dashboard._sql);
 //BA.debugLineNum = 29;BA.debugLine="Private lblMiniLabel 	As B4XView";
dashboard._lblminilabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblminilabel",dashboard._lblminilabel);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvmenudrawer_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ClvMenuDrawer_ItemClick (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("clvmenudrawer_itemclick")) { return __ref.runUserSub(false, "dashboard","clvmenudrawer_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 167;BA.debugLine="Private Sub ClvMenuDrawer_ItemClick (Index As Int,";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Drawer.LeftOpen = False";
Debug.ShouldStop(128);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 169;BA.debugLine="ClvMenuStatic_ItemClick(Index, Value)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.dashboard.class, "_clvmenustatic_itemclick" /*RemoteObject*/ ,(Object)(_index),(Object)(_value));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvmenumini_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ClvMenuMini_ItemClick (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("clvmenumini_itemclick")) { return __ref.runUserSub(false, "dashboard","clvmenumini_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 163;BA.debugLine="Private Sub ClvMenuMini_ItemClick (Index As Int, V";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="ClvMenuStatic_ItemClick(Index, Value)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.dashboard.class, "_clvmenustatic_itemclick" /*RemoteObject*/ ,(Object)(_index),(Object)(_value));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvmenustatic_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ClvMenuStatic_ItemClick (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("clvmenustatic_itemclick")) { return __ref.runUserSub(false, "dashboard","clvmenustatic_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 158;BA.debugLine="Private Sub ClvMenuStatic_ItemClick (Index As Int,";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="If ContentEmpty = False Then PnlCenter.GetView(0)";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.dashboard.class, "_contentempty" /*RemoteObject*/ ),dashboard.__c.getField(true,"False"))) { 
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 160;BA.debugLine="CallSub2(Value, \"Show\", PnlCenter)";
Debug.ShouldStop(-2147483648);
dashboard.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_value),(Object)(BA.ObjectToString("Show")),(Object)((__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ))));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _contentempty(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ContentEmpty (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("contentempty")) { return __ref.runUserSub(false, "dashboard","contentempty", __ref);}
 BA.debugLineNum = 154;BA.debugLine="Private Sub ContentEmpty As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Return PnlCenter.NumberOfViews = 0";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createminiitem(RemoteObject __ref,RemoteObject _text,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("CreateMiniItem (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("createminiitem")) { return __ref.runUserSub(false, "dashboard","createminiitem", __ref, _text, _width);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Width", _width);
 BA.debugLineNum = 209;BA.debugLine="Sub CreateMiniItem (Text As String, Width As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim pnl As B4XView = XUI.CreatePanel(\"\")";
Debug.ShouldStop(131072);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 212;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, 60dip)";
Debug.ShouldStop(524288);
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, dashboard.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))))));
 BA.debugLineNum = 213;BA.debugLine="pnl.LoadLayout(\"MiniItem\")";
Debug.ShouldStop(1048576);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MiniItem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 214;BA.debugLine="lblMiniLabel.Text = Text";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblminilabel" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 217;BA.debugLine="pnl.As(Pane).MouseCursor = FX.Cursors.HAND";
Debug.ShouldStop(16777216);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _pnl.getObject())).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 219;BA.debugLine="Return pnl";
Debug.ShouldStop(67108864);
if (true) return _pnl;
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbinit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DBInit (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("dbinit")) { return __ref.runUserSub(false, "dashboard","dbinit", __ref);}
 BA.debugLineNum = 240;BA.debugLine="Sub DBInit";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="If File.Exists(File.DirData(\"sql\"), \"patient.db\")";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",dashboard.__c.getField(false,"File").runMethod(true,"Exists",(Object)(dashboard.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("sql")))),(Object)(RemoteObject.createImmutable("patient.db"))),dashboard.__c.getField(true,"False"))) { 
 BA.debugLineNum = 243;BA.debugLine="File.Copy(File.DirAssets, \"patient.db\", File.Dir";
Debug.ShouldStop(262144);
dashboard.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(dashboard.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("patient.db")),(Object)(dashboard.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("sql")))),(Object)(RemoteObject.createImmutable("patient.db")));
 };
 BA.debugLineNum = 247;BA.debugLine="sql.InitializeSQLite(File.DirData(\"sql\"), \"patien";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(dashboard.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("sql")))),(Object)(BA.ObjectToString("patient.db")),(Object)(dashboard.__c.getField(true,"True")));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawer_statechanged(RemoteObject __ref,RemoteObject _open) throws Exception{
try {
		Debug.PushSubsStack("Drawer_StateChanged (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("drawer_statechanged")) { return __ref.runUserSub(false, "dashboard","drawer_statechanged", __ref, _open);}
Debug.locals.put("Open", _open);
 BA.debugLineNum = 136;BA.debugLine="Sub Drawer_StateChanged (Open As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="If Open Then";
Debug.ShouldStop(256);
if (_open.<Boolean>get().booleanValue()) { 
 }else {
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initdrawer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitDrawer (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("initdrawer")) { return __ref.runUserSub(false, "dashboard","initdrawer", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Sub InitDrawer";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 300dip)";
Debug.ShouldStop(1);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("Drawer")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )),(Object)(dashboard.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 66;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"LeftDrawer\")";
Debug.ShouldStop(2);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_getleftpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("LeftDrawer")),__ref.getField(false, "ba"));
 BA.debugLineNum = 67;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"MainPanel\")";
Debug.ShouldStop(4);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdrawer.class, "_getcenterpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPanel")),__ref.getField(false, "ba"));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dashboard","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _initpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitPanel (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("initpanel")) { return __ref.runUserSub(false, "dashboard","initpanel", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Sub InitPanel";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="LblTitle.Text = Title";
Debug.ShouldStop(128);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_title" /*RemoteObject*/ ));
 BA.debugLineNum = 73;BA.debugLine="PnlMini.LoadLayout(\"PanelMini\")";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PanelMini")),__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="PnlStatic.LoadLayout(\"PanelStatic\")";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PanelStatic")),__ref.getField(false, "ba"));
 BA.debugLineNum = 75;BA.debugLine="PnlCenter.LoadLayout(\"Dashboard\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Dashboard")),__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="CSSUtils.SetStyleProperty(Button1, \"-fx-focus-col";
Debug.ShouldStop(4096);
dashboard._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_button1" /*RemoteObject*/ ).getObject()),(Object)(BA.ObjectToString("-fx-focus-color")),(Object)(RemoteObject.createImmutable("white")));
 BA.debugLineNum = 78;BA.debugLine="Select MenuMode";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(__ref.getField(true,"_menumode" /*RemoteObject*/ ),BA.ObjectToString("Mini"),BA.ObjectToString("Static"))) {
case 0: {
 BA.debugLineNum = 80;BA.debugLine="PnlMini.Visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="PnlStatic.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 82;BA.debugLine="PnlCenter.Width = PnlRoot.Width - PnlMini.Width";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlroot" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));
 BA.debugLineNum = 83;BA.debugLine="PnlCenter.Left = 60dip";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, dashboard.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 break; }
case 1: {
 BA.debugLineNum = 85;BA.debugLine="PnlMini.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="PnlStatic.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"True"));
 BA.debugLineNum = 87;BA.debugLine="PnlCenter.Width = PnlRoot.Width - PnlStatic.Wid";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlroot" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));
 BA.debugLineNum = 88;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Wid";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 0));
 break; }
default: {
 BA.debugLineNum = 90;BA.debugLine="PnlMini.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="PnlStatic.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="PnlCenter.Width = PnlRoot.Width";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_pnlroot" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 93;BA.debugLine="PnlCenter.Left = 0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, 0));
 break; }
}
;
 BA.debugLineNum = 97;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
Debug.ShouldStop(1);
dashboard.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SetScrollPaneBackgroundColor")),(Object)((__ref.getField(false,"_clvmenumini" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 98;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
Debug.ShouldStop(2);
dashboard.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SetScrollPaneBackgroundColor")),(Object)((__ref.getField(false,"_clvmenustatic" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 99;BA.debugLine="CallSubDelayed3(Me, \"SetScrollPaneBackgroundColor";
Debug.ShouldStop(4);
dashboard.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SetScrollPaneBackgroundColor")),(Object)((__ref.getField(false,"_clvmenudrawer" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuttonmousepointer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetButtonMousePointer (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("setbuttonmousepointer")) { return __ref.runUserSub(false, "dashboard","setbuttonmousepointer", __ref);}
 BA.debugLineNum = 232;BA.debugLine="Private Sub SetButtonMousePointer";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="BtnMenu.MouseCursor = FX.Cursors.HAND";
Debug.ShouldStop(256);
__ref.getField(false,"_btnmenu" /*RemoteObject*/ ).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 234;BA.debugLine="BtnExit.MouseCursor = FX.Cursors.HAND";
Debug.ShouldStop(512);
__ref.getField(false,"_btnexit" /*RemoteObject*/ ).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 235;BA.debugLine="BtnHide.MouseCursor = FX.Cursors.HAND";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnhide" /*RemoteObject*/ ).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 236;BA.debugLine="BtnShow.MouseCursor = FX.Cursors.HAND";
Debug.ShouldStop(2048);
__ref.getField(false,"_btnshow" /*RemoteObject*/ ).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 237;BA.debugLine="Button1.MouseCursor = FX.Cursors.HAND";
Debug.ShouldStop(4096);
__ref.getField(false,"_button1" /*RemoteObject*/ ).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaximized(RemoteObject __ref,RemoteObject _frm) throws Exception{
try {
		Debug.PushSubsStack("SetMaximized (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("setmaximized")) { return __ref.runUserSub(false, "dashboard","setmaximized", __ref, _frm);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("frm", _frm);
 BA.debugLineNum = 253;BA.debugLine="Sub SetMaximized(frm As Form)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(536870912);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _frm);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 255;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(1073741824);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 256;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(-2147483648);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(dashboard.__c.getField(true,"True"))})));
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollpanebackgroundcolor(RemoteObject __ref,RemoteObject _view,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetScrollPaneBackgroundColor (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("setscrollpanebackgroundcolor")) { return __ref.runUserSub(false, "dashboard","setscrollpanebackgroundcolor", __ref, _view, _color);}
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("View", _view);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 224;BA.debugLine="Private Sub SetScrollPaneBackgroundColor (View As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Dim SP As JavaObject = View.GetBase.GetView(0)";
Debug.ShouldStop(1);
_sp = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.runMethod(false,"_getbase").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("SP", _sp);Debug.locals.put("SP", _sp);
 BA.debugLineNum = 226;BA.debugLine="Dim V As B4XView = SP";
Debug.ShouldStop(2);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _sp.getObject());Debug.locals.put("V", _v);Debug.locals.put("V", _v);
 BA.debugLineNum = 227;BA.debugLine="V.Color = Color";
Debug.ShouldStop(4);
_v.runMethod(true,"setColor",_color);
 BA.debugLineNum = 228;BA.debugLine="Dim V As B4XView = SP.RunMethod(\"lookup\", Array(\"";
Debug.ShouldStop(8);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _sp.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("lookup")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(".viewport"))}))));Debug.locals.put("V", _v);Debug.locals.put("V", _v);
 BA.debugLineNum = 229;BA.debugLine="V.Color = Color";
Debug.ShouldStop(16);
_v.runMethod(true,"setColor",_color);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "dashboard","settitle", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Sub SetTitle";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="B4XPages.SetTitle(Me, Title)";
Debug.ShouldStop(268435456);
dashboard._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,(Object)(__ref),(Object)((__ref.getField(true,"_title" /*RemoteObject*/ ))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Show (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "dashboard","show", __ref, _parent);}
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 144;BA.debugLine="Private Sub Show (Parent As B4XView)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="If mBase.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),dashboard.__c.getField(true,"False"))) { 
 BA.debugLineNum = 146;BA.debugLine="mBase = XUI.CreatePanel(\"\")";
Debug.ShouldStop(131072);
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 147;BA.debugLine="mBase.LoadLayout(\"Dashboard\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Dashboard")),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 149;BA.debugLine="mBase.RemoveViewFromParent";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 150;BA.debugLine="Parent.AddView(mBase, 0, 0, Parent.Width, Parent.";
Debug.ShouldStop(2097152);
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 151;BA.debugLine="CSSUtils.SetStyleProperty(Button1, \"-fx-focus-col";
Debug.ShouldStop(4194304);
dashboard._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_button1" /*RemoteObject*/ ).getObject()),(Object)(BA.ObjectToString("-fx-focus-color")),(Object)(RemoteObject.createImmutable("white")));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showloginmenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowLoginMenu (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("showloginmenu")) { return __ref.runUserSub(false, "dashboard","showloginmenu", __ref);}
RemoteObject _frm1 = RemoteObject.declareNull("b4j.example.patientview");
RemoteObject _frm2 = RemoteObject.declareNull("b4j.example.view2");
 BA.debugLineNum = 190;BA.debugLine="Public Sub ShowLoginMenu";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="ClvMenuDrawer.Clear";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_clvmenudrawer" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 192;BA.debugLine="Dim frm1 As patientview";
Debug.ShouldStop(-2147483648);
_frm1 = RemoteObject.createNew ("b4j.example.patientview");Debug.locals.put("frm1", _frm1);
 BA.debugLineNum = 193;BA.debugLine="Dim frm2 As view2";
Debug.ShouldStop(1);
_frm2 = RemoteObject.createNew ("b4j.example.view2");Debug.locals.put("frm2", _frm2);
 BA.debugLineNum = 194;BA.debugLine="frm1.Initialize";
Debug.ShouldStop(2);
_frm1.runClassMethod (b4j.example.patientview.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 195;BA.debugLine="frm2.Initialize";
Debug.ShouldStop(4);
_frm2.runClassMethod (b4j.example.view2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 196;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Dashboard\", Me)";
Debug.ShouldStop(8);
__ref.getField(false,"_clvmenudrawer" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Dashboard"))),(Object)(__ref));
 BA.debugLineNum = 197;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Form1\", frm1)";
Debug.ShouldStop(16);
__ref.getField(false,"_clvmenudrawer" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Form1"))),(Object)((_frm1)));
 BA.debugLineNum = 198;BA.debugLine="ClvMenuDrawer.AddTextItem(\"Form2\", frm2)";
Debug.ShouldStop(32);
__ref.getField(false,"_clvmenudrawer" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Form2"))),(Object)((_frm2)));
 BA.debugLineNum = 200;BA.debugLine="ClvMenuStatic.AddTextItem(\"Dashboard\", Me)";
Debug.ShouldStop(128);
__ref.getField(false,"_clvmenustatic" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Dashboard"))),(Object)(__ref));
 BA.debugLineNum = 201;BA.debugLine="ClvMenuStatic.AddTextItem(\"Form1\", frm1)";
Debug.ShouldStop(256);
__ref.getField(false,"_clvmenustatic" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Form1"))),(Object)((_frm1)));
 BA.debugLineNum = 202;BA.debugLine="ClvMenuStatic.AddTextItem(\"Form2\", frm2)";
Debug.ShouldStop(512);
__ref.getField(false,"_clvmenustatic" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Form2"))),(Object)((_frm2)));
 BA.debugLineNum = 204;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF015), ClvMe";
Debug.ShouldStop(2048);
__ref.getField(false,"_clvmenumini" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (b4j.example.dashboard.class, "_createminiitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString(dashboard.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf015)))))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_clvmenumini" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth"))))),(Object)(__ref));
 BA.debugLineNum = 205;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF004), ClvMe";
Debug.ShouldStop(4096);
__ref.getField(false,"_clvmenumini" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (b4j.example.dashboard.class, "_createminiitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString(dashboard.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf004)))))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_clvmenumini" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth"))))),(Object)((_frm1)));
 BA.debugLineNum = 206;BA.debugLine="ClvMenuMini.Add(CreateMiniItem(Chr(0xF06B), ClvMe";
Debug.ShouldStop(8192);
__ref.getField(false,"_clvmenumini" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(__ref.runClassMethod (b4j.example.dashboard.class, "_createminiitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString(dashboard.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf06b)))))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_clvmenumini" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth"))))),(Object)((_frm2)));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switchmenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwitchMenu (dashboard) ","dashboard",2,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("switchmenu")) { return __ref.runUserSub(false, "dashboard","switchmenu", __ref);}
 BA.debugLineNum = 172;BA.debugLine="Sub SwitchMenu";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="Select MenuMode";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(__ref.getField(true,"_menumode" /*RemoteObject*/ ),BA.ObjectToString("Mini"),BA.ObjectToString("Static"))) {
case 0: {
 BA.debugLineNum = 175;BA.debugLine="MenuMode = \"Static\"";
Debug.ShouldStop(16384);
__ref.setField ("_menumode" /*RemoteObject*/ ,BA.ObjectToString("Static"));
 BA.debugLineNum = 176;BA.debugLine="PnlMini.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 177;BA.debugLine="PnlStatic.Visible = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"True"));
 BA.debugLineNum = 178;BA.debugLine="PnlCenter.Width = Root.Width - PnlStatic.Width";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));
 BA.debugLineNum = 179;BA.debugLine="PnlCenter.Left = PnlStatic.Left + PnlStatic.Wid";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 0));
 break; }
case 1: {
 BA.debugLineNum = 181;BA.debugLine="MenuMode = \"Mini\"";
Debug.ShouldStop(1048576);
__ref.setField ("_menumode" /*RemoteObject*/ ,BA.ObjectToString("Mini"));
 BA.debugLineNum = 182;BA.debugLine="PnlStatic.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlstatic" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"False"));
 BA.debugLineNum = 183;BA.debugLine="PnlMini.Visible = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"setVisible",dashboard.__c.getField(true,"True"));
 BA.debugLineNum = 184;BA.debugLine="PnlCenter.Width = Root.Width - PnlMini.Width";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));
 BA.debugLineNum = 185;BA.debugLine="PnlCenter.Left = PnlMini.Left + PnlMini.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlcenter" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_pnlmini" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 0));
 break; }
}
;
 BA.debugLineNum = 187;BA.debugLine="ClvMenuStatic_ItemClick(0, Me)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.dashboard.class, "_clvmenustatic_itemclick" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}