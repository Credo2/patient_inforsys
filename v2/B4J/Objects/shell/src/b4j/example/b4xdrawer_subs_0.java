package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xdrawer_subs_0 {


public static RemoteObject  _changeoffset(RemoteObject __ref,RemoteObject _x,RemoteObject _currentlytouching,RemoteObject _noanimation) throws Exception{
try {
		Debug.PushSubsStack("ChangeOffset (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("changeoffset")) { return __ref.runUserSub(false, "b4xdrawer","changeoffset", __ref, _x, _currentlytouching, _noanimation);}
RemoteObject _visibleoffset = RemoteObject.createImmutable(0);
RemoteObject _dx = RemoteObject.createImmutable(0);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("x", _x);
Debug.locals.put("CurrentlyTouching", _currentlytouching);
Debug.locals.put("NoAnimation", _noanimation);
 BA.debugLineNum = 175;BA.debugLine="Private Sub ChangeOffset (x As Float, CurrentlyTou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="x = Max(-mSideWidth, Min(0, x))";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, b4xdrawer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Integer>get().intValue()))),(Object)(b4xdrawer.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _x))))));Debug.locals.put("x", _x);
 BA.debugLineNum = 177;BA.debugLine="Dim VisibleOffset As Int = mSideWidth + x";
Debug.JustUpdateDeviceLine();
_visibleoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_msidewidth" /*RemoteObject*/ ),_x}, "+",1, 0));Debug.locals.put("VisibleOffset", _visibleoffset);Debug.locals.put("VisibleOffset", _visibleoffset);
 BA.debugLineNum = 186;BA.debugLine="If CurrentlyTouching = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_currentlytouching,b4xdrawer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 187;BA.debugLine="If (IsOpen And VisibleOffset < 0.8 * mSideWidth)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_isopen" /*RemoteObject*/ )) && RemoteObject.solveBoolean("<",_visibleoffset,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.8),__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "*",0, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_isopen" /*RemoteObject*/ ),b4xdrawer.__c.getField(true,"False")) && RemoteObject.solveBoolean("<",_visibleoffset,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.2),__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "*",0, 0)))))) { 
 BA.debugLineNum = 188;BA.debugLine="x = -mSideWidth";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Integer>get().intValue()));Debug.locals.put("x", _x);
 BA.debugLineNum = 189;BA.debugLine="SetIsOpen(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdrawer.class, "_setisopen" /*RemoteObject*/ ,(Object)(b4xdrawer.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 191;BA.debugLine="x = 0";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 192;BA.debugLine="SetIsOpen(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdrawer.class, "_setisopen" /*RemoteObject*/ ,(Object)(b4xdrawer.__c.getField(true,"True")));
 };
 BA.debugLineNum = 194;BA.debugLine="Dim dx As Int = Abs(mLeftPanel.Left - x)";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, b4xdrawer.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x}, "-",1, 0))));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 195;BA.debugLine="Dim duration As Int = Max(0, 200 * dx / mSideWid";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, b4xdrawer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(200),_dx,__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "*/",0, 0))));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 196;BA.debugLine="If NoAnimation Then duration = 0";
Debug.JustUpdateDeviceLine();
if (_noanimation.<Boolean>get().booleanValue()) { 
_duration = BA.numberCast(int.class, 0);Debug.locals.put("duration", _duration);};
 BA.debugLineNum = 197;BA.debugLine="mLeftPanel.SetLayoutAnimated(duration, x, 0, mLe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, _x)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 198;BA.debugLine="mDarkPanel.SetColorAnimated(duration, mDarkPanel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAnimated",(Object)(_duration),(Object)(__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"getColor")),(Object)(__ref.runClassMethod (b4j.example.b4xdrawer.class, "_offsettocolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)))));
 BA.debugLineNum = 204;BA.debugLine="Private jo = mDarkPanel As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 205;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(Not(Is";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4xdrawer.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_isopen" /*RemoteObject*/ ))))})));
 }else {
 BA.debugLineNum = 208;BA.debugLine="mDarkPanel.Color = OffsetToColor(x)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.runClassMethod (b4j.example.b4xdrawer.class, "_offsettocolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x))));
 BA.debugLineNum = 209;BA.debugLine="mLeftPanel.Left = x";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, _x));
 };
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
b4xdrawer._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xdrawer._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
b4xdrawer._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xdrawer._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
b4xdrawer._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xdrawer._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private mSideWidth As Int";
b4xdrawer._msidewidth = RemoteObject.createImmutable(0);__ref.setField("_msidewidth",b4xdrawer._msidewidth);
 //BA.debugLineNum = 7;BA.debugLine="Private mLeftPanel As B4XView";
b4xdrawer._mleftpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mleftpanel",b4xdrawer._mleftpanel);
 //BA.debugLineNum = 8;BA.debugLine="Private mDarkPanel As B4XView";
b4xdrawer._mdarkpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mdarkpanel",b4xdrawer._mdarkpanel);
 //BA.debugLineNum = 9;BA.debugLine="Private mBasePanel As B4XView";
b4xdrawer._mbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbasepanel",b4xdrawer._mbasepanel);
 //BA.debugLineNum = 10;BA.debugLine="Private mCenterPanel As B4XView";
b4xdrawer._mcenterpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mcenterpanel",b4xdrawer._mcenterpanel);
 //BA.debugLineNum = 11;BA.debugLine="Public ExtraWidth As Int = 50dip";
b4xdrawer._extrawidth = b4xdrawer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));__ref.setField("_extrawidth",b4xdrawer._extrawidth);
 //BA.debugLineNum = 12;BA.debugLine="Private TouchXStart, TouchYStart As Float 'ignore";
b4xdrawer._touchxstart = RemoteObject.createImmutable(0f);__ref.setField("_touchxstart",b4xdrawer._touchxstart);
b4xdrawer._touchystart = RemoteObject.createImmutable(0f);__ref.setField("_touchystart",b4xdrawer._touchystart);
 //BA.debugLineNum = 13;BA.debugLine="Private IsOpen As Boolean";
b4xdrawer._isopen = RemoteObject.createImmutable(false);__ref.setField("_isopen",b4xdrawer._isopen);
 //BA.debugLineNum = 14;BA.debugLine="Private HandlingSwipe As Boolean";
b4xdrawer._handlingswipe = RemoteObject.createImmutable(false);__ref.setField("_handlingswipe",b4xdrawer._handlingswipe);
 //BA.debugLineNum = 15;BA.debugLine="Private StartAtScrim As Boolean 'ignore";
b4xdrawer._startatscrim = RemoteObject.createImmutable(false);__ref.setField("_startatscrim",b4xdrawer._startatscrim);
 //BA.debugLineNum = 16;BA.debugLine="Private mEnabled As Boolean = True";
b4xdrawer._menabled = b4xdrawer.__c.getField(true,"True");__ref.setField("_menabled",b4xdrawer._menabled);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dark_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Dark_Touch (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("dark_touch")) { return __ref.runUserSub(false, "b4xdrawer","dark_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 167;BA.debugLine="Private Sub Dark_Touch(Action As Int, X As Float,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="If HandlingSwipe = False And Action = mDarkPanel.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ ),b4xdrawer.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 169;BA.debugLine="setLeftOpen(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,(Object)(b4xdrawer.__c.getField(true,"False")));
 };
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcenterpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCenterPanel (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("getcenterpanel")) { return __ref.runUserSub(false, "b4xdrawer","getcenterpanel", __ref);}
 BA.debugLineNum = 241;BA.debugLine="Public Sub getCenterPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="Return mCenterPanel";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mcenterpanel" /*RemoteObject*/ );
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgestureenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getGestureEnabled (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("getgestureenabled")) { return __ref.runUserSub(false, "b4xdrawer","getgestureenabled", __ref);}
 BA.debugLineNum = 253;BA.debugLine="Public Sub getGestureEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="Return mEnabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_menabled" /*RemoteObject*/ );
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleftopen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeftOpen (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("getleftopen")) { return __ref.runUserSub(false, "b4xdrawer","getleftopen", __ref);}
 BA.debugLineNum = 226;BA.debugLine="Public Sub getLeftOpen As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="Return IsOpen";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_isopen" /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleftpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeftPanel (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("getleftpanel")) { return __ref.runUserSub(false, "b4xdrawer","getleftpanel", __ref);}
 BA.debugLineNum = 237;BA.debugLine="Public Sub getLeftPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="Return mLeftPanel";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mleftpanel" /*RemoteObject*/ );
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _parent,RemoteObject _sidewidth) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xdrawer","initialize", __ref, _ba, _callback, _eventname, _parent, _sidewidth);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Parent", _parent);
Debug.locals.put("SideWidth", _sidewidth);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 22;BA.debugLine="mSideWidth = SideWidth";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msidewidth" /*RemoteObject*/ ,_sidewidth);
 BA.debugLineNum = 32;BA.debugLine="mBasePanel = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbasepanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 34;BA.debugLine="Parent.AddView(mBasePanel, 0, 0, Parent.Width, Pa";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 35;BA.debugLine="mCenterPanel = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcenterpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 36;BA.debugLine="mBasePanel.AddView(mCenterPanel, 0, 0, mBasePanel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mcenterpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 37;BA.debugLine="mDarkPanel = xui.CreatePanel(\"dark\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdarkpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dark"))));
 BA.debugLineNum = 38;BA.debugLine="mBasePanel.AddView(mDarkPanel, 0, 0, mBasePanel.W";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 39;BA.debugLine="mLeftPanel = xui.CreatePanel(\"LeftPanel\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mleftpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("LeftPanel"))));
 BA.debugLineNum = 40;BA.debugLine="mBasePanel.AddView(mLeftPanel, -SideWidth, 0, Sid";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, -(double) (0 + _sidewidth.<Integer>get().intValue()))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _sidewidth)),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 41;BA.debugLine="mLeftPanel.Color = xui.Color_Red";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 55;BA.debugLine="Private jo = mDarkPanel As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 56;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4xdrawer.__c.getField(true,"True"))})));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leftpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LeftPanel_Click (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("leftpanel_click")) { return __ref.runUserSub(false, "b4xdrawer","leftpanel_click", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Private Sub LeftPanel_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _offsettocolor(RemoteObject __ref,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("OffsetToColor (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("offsettocolor")) { return __ref.runUserSub(false, "b4xdrawer","offsettocolor", __ref, _x);}
RemoteObject _visible = RemoteObject.createImmutable(0f);
Debug.locals.put("x", _x);
 BA.debugLineNum = 221;BA.debugLine="Private Sub OffsetToColor (x As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 222;BA.debugLine="Dim Visible As Float = (mSideWidth + x) / mSideWi";
Debug.JustUpdateDeviceLine();
_visible = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_msidewidth" /*RemoteObject*/ ),_x}, "+",1, 1)),__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("Visible", _visible);Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 223;BA.debugLine="Return xui.Color_ARGB(100 * Visible, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_visible}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xdrawer","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 245;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 246;BA.debugLine="If IsOpen Then ChangeOffset(-mSideWidth, False, T";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isopen" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.b4xdrawer.class, "_changeoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Integer>get().intValue()))),(Object)(b4xdrawer.__c.getField(true,"False")),(Object)(b4xdrawer.__c.getField(true,"True")));};
 BA.debugLineNum = 247;BA.debugLine="mBasePanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 248;BA.debugLine="mLeftPanel.SetLayoutAnimated(0, mLeftPanel.Left,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 249;BA.debugLine="mDarkPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 250;BA.debugLine="mCenterPanel.SetLayoutAnimated(0, 0, 0, Width, He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mcenterpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgestureenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setGestureEnabled (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("setgestureenabled")) { return __ref.runUserSub(false, "b4xdrawer","setgestureenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 257;BA.debugLine="Public Sub setGestureEnabled (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="mEnabled = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_menabled" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setisopen(RemoteObject __ref,RemoteObject _newstate) throws Exception{
try {
		Debug.PushSubsStack("SetIsOpen (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("setisopen")) { return __ref.runUserSub(false, "b4xdrawer","setisopen", __ref, _newstate);}
Debug.locals.put("NewState", _newstate);
 BA.debugLineNum = 213;BA.debugLine="Private Sub SetIsOpen (NewState As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 214;BA.debugLine="If IsOpen = NewState Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isopen" /*RemoteObject*/ ),_newstate)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 215;BA.debugLine="IsOpen = NewState";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isopen" /*RemoteObject*/ ,_newstate);
 BA.debugLineNum = 216;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_StateC";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_StateChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="CallSubDelayed2(mCallBack,  mEventName & \"_State";
Debug.JustUpdateDeviceLine();
b4xdrawer.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_StateChanged"))),(Object)((__ref.getField(true,"_isopen" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setleftopen(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setLeftOpen (b4xdrawer) ","b4xdrawer",44,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("setleftopen")) { return __ref.runUserSub(false, "b4xdrawer","setleftopen", __ref, _b);}
RemoteObject _x = RemoteObject.createImmutable(0f);
Debug.locals.put("b", _b);
 BA.debugLineNum = 230;BA.debugLine="Public Sub setLeftOpen (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="If b = IsOpen Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,__ref.getField(true,"_isopen" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 232;BA.debugLine="Dim x As Float";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createImmutable(0f);Debug.locals.put("x", _x);
 BA.debugLineNum = 233;BA.debugLine="If b Then x = 0 Else x = -mSideWidth";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
_x = BA.numberCast(float.class, 0);Debug.locals.put("x", _x);}
else {
_x = BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Integer>get().intValue()));Debug.locals.put("x", _x);};
 BA.debugLineNum = 234;BA.debugLine="ChangeOffset(x, False, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdrawer.class, "_changeoffset" /*RemoteObject*/ ,(Object)(_x),(Object)(b4xdrawer.__c.getField(true,"False")),(Object)(b4xdrawer.__c.getField(true,"False")));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}