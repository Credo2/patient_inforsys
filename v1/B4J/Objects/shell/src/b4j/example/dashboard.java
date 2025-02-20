
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dashboard {
    public static RemoteObject myClass;
	public dashboard() {
	}
    public static PCBA staticBA = new PCBA(null, dashboard.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _drawer = RemoteObject.declareNull("b4j.example.b4xdrawer");
public static RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblappversion = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _btnhide = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _btnshow = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _btnexit = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _pnlroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlmini = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlstatic = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlcenter = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clvmenumini = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _clvmenustatic = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _clvmenudrawer = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _title = RemoteObject.createImmutable("");
public static RemoteObject _menumode = RemoteObject.createImmutable("");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _lblminilabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static b4j.example.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BtnExit",_ref.getField(false, "_btnexit"),"BtnHide",_ref.getField(false, "_btnhide"),"BtnMenu",_ref.getField(false, "_btnmenu"),"BtnShow",_ref.getField(false, "_btnshow"),"Button1",_ref.getField(false, "_button1"),"ClvMenuDrawer",_ref.getField(false, "_clvmenudrawer"),"ClvMenuMini",_ref.getField(false, "_clvmenumini"),"ClvMenuStatic",_ref.getField(false, "_clvmenustatic"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Drawer",_ref.getField(false, "_drawer"),"FX",_ref.getField(false, "_fx"),"lblAppVersion",_ref.getField(false, "_lblappversion"),"lblMiniLabel",_ref.getField(false, "_lblminilabel"),"LblTitle",_ref.getField(false, "_lbltitle"),"mBase",_ref.getField(false, "_mbase"),"MenuMode",_ref.getField(false, "_menumode"),"PnlCenter",_ref.getField(false, "_pnlcenter"),"PnlMini",_ref.getField(false, "_pnlmini"),"PnlRoot",_ref.getField(false, "_pnlroot"),"PnlStatic",_ref.getField(false, "_pnlstatic"),"Root",_ref.getField(false, "_root"),"sql",_ref.getField(false, "_sql"),"Title",_ref.getField(false, "_title"),"XUI",_ref.getField(false, "_xui")};
}
}