package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class patientview_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public mBase As B4XView";
patientview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",patientview._mbase);
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
patientview._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",patientview._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
patientview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",patientview._xui);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (patientview) ","patientview",3,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "patientview","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Show (patientview) ","patientview",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "patientview","show", __ref, _parent);}
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Show (Parent As B4XView)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="If mBase.IsInitialized = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),patientview.__c.getField(true,"False"))) { 
 BA.debugLineNum = 14;BA.debugLine="mBase = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 15;BA.debugLine="mBase.LoadLayout(\"Form1\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Form1")),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 17;BA.debugLine="mBase.RemoveViewFromParent";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 18;BA.debugLine="Parent.AddView(mBase, 0, 0, Parent.Width, Parent.";
Debug.ShouldStop(131072);
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}