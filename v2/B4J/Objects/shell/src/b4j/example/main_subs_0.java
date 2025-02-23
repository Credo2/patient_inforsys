package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,16);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _pagesmanager = RemoteObject.declareNull("b4j.example.b4xpagesmanager");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 16;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 22;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(2097152);
main._mainform = _form1;
 BA.debugLineNum = 41;BA.debugLine="Dim PagesManager As B4XPagesManager";
Debug.ShouldStop(256);
_pagesmanager = RemoteObject.createNew ("b4j.example.b4xpagesmanager");Debug.locals.put("PagesManager", _pagesmanager);
 BA.debugLineNum = 42;BA.debugLine="PagesManager.Initialize(MainForm)";
Debug.ShouldStop(512);
_pagesmanager.runClassMethod (b4j.example.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closed() throws Exception{
try {
		Debug.PushSubsStack("MainForm_Closed (main) ","main",0,main.ba,main.mostCurrent,56);
if (RapidSub.canDelegate("mainform_closed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closed");}
 BA.debugLineNum = 56;BA.debugLine="Sub MainForm_Closed";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
Debug.ShouldStop(16777216);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closed" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MainForm_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,60);
if (RapidSub.canDelegate("mainform_closerequest")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 60;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(EventData";
Debug.ShouldStop(268435456);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closerequest" /*RemoteObject*/ ,(Object)(_eventdata));
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
public static RemoteObject  _mainform_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("MainForm_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,48);
if (RapidSub.canDelegate("mainform_focuschanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 48;BA.debugLine="Sub MainForm_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(HasFocus)";
Debug.ShouldStop(65536);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_focuschanged" /*RemoteObject*/ ,(Object)(_hasfocus));
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
public static RemoteObject  _mainform_iconifiedchanged(RemoteObject _iconified) throws Exception{
try {
		Debug.PushSubsStack("MainForm_IconifiedChanged (main) ","main",0,main.ba,main.mostCurrent,64);
if (RapidSub.canDelegate("mainform_iconifiedchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_iconifiedchanged", _iconified);}
Debug.locals.put("Iconified", _iconified);
 BA.debugLineNum = 64;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(Iconi";
Debug.ShouldStop(1);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_iconifiedchanged" /*RemoteObject*/ ,(Object)(_iconified));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (main) ","main",0,main.ba,main.mostCurrent,52);
if (RapidSub.canDelegate("mainform_resize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 52;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="B4XPages.Delegate.MainForm_Resize(Width, Height)";
Debug.ShouldStop(1048576);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_resize" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));
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

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
dbutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4j.example.b4xmainpage");
dashboard.myClass = BA.getDeviceClass ("b4j.example.dashboard");
patientview.myClass = BA.getDeviceClass ("b4j.example.patientview");
view2.myClass = BA.getDeviceClass ("b4j.example.view2");
b4xpages.myClass = BA.getDeviceClass ("b4j.example.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4j.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4j.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4j.example.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4j.example.b4xpagesmanager");
b4xtable.myClass = BA.getDeviceClass ("b4j.example.b4xtable");
b4xformatter.myClass = BA.getDeviceClass ("b4j.example.b4xformatter");
animatedcounter.myClass = BA.getDeviceClass ("b4j.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4j.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4j.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4j.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4j.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4j.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4j.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4j.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4j.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4j.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4j.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4j.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4j.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4j.example.madewithlove");
roundslider.myClass = BA.getDeviceClass ("b4j.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4j.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4j.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4j.example.xuiviewsutils");
b4jtextflow.myClass = BA.getDeviceClass ("b4j.example.b4jtextflow");
dbutils.myClass = BA.getDeviceClass ("b4j.example.dbutils");
b4xdrawer.myClass = BA.getDeviceClass ("b4j.example.b4xdrawer");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 10;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}