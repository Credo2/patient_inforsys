package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4ximageview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4ximageview.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.dbutils _dbutils = null;
public String  _base_resize(b4j.example.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=22609927;
 //BA.debugLineNum = 22609927;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=22609928;
 //BA.debugLineNum = 22609928;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=22609930;
 //BA.debugLineNum = 22609930;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=22609931;
 //BA.debugLineNum = 22609931;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=22609932;
 //BA.debugLineNum = 22609932;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=22609934;
 //BA.debugLineNum = 22609934;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=22609935;
 //BA.debugLineNum = 22609935;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=22609937;
 //BA.debugLineNum = 22609937;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=22609938;
 //BA.debugLineNum = 22609938;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=22609940;
 //BA.debugLineNum = 22609940;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=22609941;
 //BA.debugLineNum = 22609941;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=22609942;
 //BA.debugLineNum = 22609942;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=22609944;
 //BA.debugLineNum = 22609944;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=22609945;
 //BA.debugLineNum = 22609945;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=22609947;
 //BA.debugLineNum = 22609947;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("922609947","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=22609949;
 //BA.debugLineNum = 22609949;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2),__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2),__c.Round(_imageviewwidth),__c.Round(_imageviewheight));
RDebugUtils.currentLine=22609950;
 //BA.debugLineNum = 22609950;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=21954568;
 //BA.debugLineNum = 21954568;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=21954569;
 //BA.debugLineNum = 21954569;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=21954570;
 //BA.debugLineNum = 21954570;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=21954571;
 //BA.debugLineNum = 21954571;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
RDebugUtils.currentLine=21954572;
 //BA.debugLineNum = 21954572;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4ximageview __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="mRound =Props.Get(\"Round\")";
__ref._mround /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Round")));
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
__ref._mresizemode /*String*/  = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
RDebugUtils.currentLine=22085641;
 //BA.debugLineNum = 22085641;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
__ref._mcornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
RDebugUtils.currentLine=22085643;
 //BA.debugLineNum = 22085643;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=22085644;
 //BA.debugLineNum = 22085644;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=22085645;
 //BA.debugLineNum = 22085645;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getcornersradius", true))
	 {return ((Integer) Debug.delegate(ba, "getcornersradius", null));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub getCornersRadius As Int";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Return mCornersRadius";
if (true) return __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="End Sub";
return "";
}
public String  _load(b4j.example.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="setBitmap(xui.LoadBitmap(Dir, FileName))";
__ref._setbitmap /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename));
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4j.example.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(b4j.example.b4ximageview __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcornersradius", true))
	 {return ((String) Debug.delegate(ba, "setcornersradius", new Object[] {_i}));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Public Sub setCornersRadius (i As Int)";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="mCornersRadius = i";
__ref._mcornersradius /*int*/  = _i;
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="End Sub";
return "";
}
public String  _updateclip(b4j.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "updateclip", true))
	 {return ((String) Debug.delegate(ba, "updateclip", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _shape = null;
double _radius = 0;
double _cx = 0;
double _cy = 0;
double _d = 0;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub UpdateClip";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,0,(int) (0),__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,0,(int) (0),__ref._mcornersradius /*int*/ );
 };
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=22937608;
 //BA.debugLineNum = 22937608;BA.debugLine="Dim shape As JavaObject";
_shape = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=22937610;
 //BA.debugLineNum = 22937610;BA.debugLine="Dim radius As Double = Min(mBase.Width / 2, mBas";
_radius = __c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=22937611;
 //BA.debugLineNum = 22937611;BA.debugLine="Dim cx As Double = mBase.Width / 2";
_cx = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2;
RDebugUtils.currentLine=22937612;
 //BA.debugLineNum = 22937612;BA.debugLine="Dim cy As Double = mBase.Height / 2";
_cy = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2;
RDebugUtils.currentLine=22937613;
 //BA.debugLineNum = 22937613;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_cx),(Object)(_cy),(Object)(_radius)});
 }else {
RDebugUtils.currentLine=22937615;
 //BA.debugLineNum = 22937615;BA.debugLine="Dim cx As Double = mBase.Width";
_cx = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=22937616;
 //BA.debugLineNum = 22937616;BA.debugLine="Dim cy As Double = mBase.Height";
_cy = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=22937617;
 //BA.debugLineNum = 22937617;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Rectangle",new Object[]{(Object)(_cx),(Object)(_cy)});
RDebugUtils.currentLine=22937618;
 //BA.debugLineNum = 22937618;BA.debugLine="If mCornersRadius > 0 Then";
if (__ref._mcornersradius /*int*/ >0) { 
RDebugUtils.currentLine=22937619;
 //BA.debugLineNum = 22937619;BA.debugLine="Dim d As Double = mCornersRadius";
_d = __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=22937620;
 //BA.debugLineNum = 22937620;BA.debugLine="shape.RunMethod(\"setArcHeight\", Array(d))";
_shape.RunMethod("setArcHeight",new Object[]{(Object)(_d)});
RDebugUtils.currentLine=22937621;
 //BA.debugLineNum = 22937621;BA.debugLine="shape.RunMethod(\"setArcWidth\", Array(d))";
_shape.RunMethod("setArcWidth",new Object[]{(Object)(_d)});
 };
 };
RDebugUtils.currentLine=22937624;
 //BA.debugLineNum = 22937624;BA.debugLine="jo.RunMethod(\"setClip\", Array(shape))";
_jo.RunMethod("setClip",new Object[]{(Object)(_shape.getObject())});
RDebugUtils.currentLine=22937629;
 //BA.debugLineNum = 22937629;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(b4j.example.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4j.example.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="End Sub";
return "";
}
}