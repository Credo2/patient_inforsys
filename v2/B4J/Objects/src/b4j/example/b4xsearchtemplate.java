package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xsearchtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xsearchtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xsearchtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public b4j.example.b4xdialog _xdialog = null;
public b4j.example.b4xfloattextfield _searchfield = null;
public anywheresoftware.b4a.objects.collections.Map _prefixlist = null;
public anywheresoftware.b4a.objects.collections.Map _substringlist = null;
public int _texthighlightcolor = 0;
public int _itemhightlightcolor = 0;
public int _max_limit = 0;
public int _maxnumberofitemstoshow = 0;
public anywheresoftware.b4a.objects.collections.List _itemscache = null;
public anywheresoftware.b4a.objects.collections.List _allitems = null;
public String _selecteditem = "";
public String _lastterm = "";
public boolean _allowunlistedtext = false;
public boolean _prefixonly = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.dbutils _dbutils = null;
public void  _show(b4j.example.b4xsearchtemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xsearchtemplate parent,b4j.example.b4xsearchtemplate __ref,b4j.example.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.example.b4xsearchtemplate __ref;
b4j.example.b4xsearchtemplate parent;
b4j.example.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4j.example.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=28508170;
 //BA.debugLineNum = 28508170;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=28508174;
 //BA.debugLineNum = 28508174;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xsearchtemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="End Sub";
return null;
}
public String  _dialogclosed(b4j.example.b4xsearchtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="End Sub";
return "";
}
public String  _additemstolist(b4j.example.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "additemstolist", true))
	 {return ((String) Debug.delegate(ba, "additemstolist", new Object[] {_li,_full}));}
b4j.example.b4jtextflow _tf = null;
int _i = 0;
String _item = "";
int _x = 0;
int _pnlcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _textpane = null;
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new b4j.example.b4jtextflow();
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=28835846;
 //BA.debugLineNum = 28835846;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=28835849;
 //BA.debugLineNum = 28835849;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=28835851;
 //BA.debugLineNum = 28835851;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=28835853;
 //BA.debugLineNum = 28835853;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=28835854;
 //BA.debugLineNum = 28835854;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()==0 && _full.length()>0 && __ref._allowunlistedtext /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=28835855;
 //BA.debugLineNum = 28835855;BA.debugLine="pnlColor = ItemHightlightColor";
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=28835857;
 //BA.debugLineNum = 28835857;BA.debugLine="pnlColor = CustomListView1.DefaultTextBackgroun";
_pnlcolor = __ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor;
 };
RDebugUtils.currentLine=28835878;
 //BA.debugLineNum = 28835878;BA.debugLine="tf.Reset";
_tf._reset /*b4j.example.b4jtextflow*/ (null);
RDebugUtils.currentLine=28835879;
 //BA.debugLineNum = 28835879;BA.debugLine="If x > 0 Then";
if (_x>0) { 
RDebugUtils.currentLine=28835880;
 //BA.debugLineNum = 28835880;BA.debugLine="tf.Append(item.SubString2(0, x)).SetColor(Custo";
_tf._append /*b4j.example.b4jtextflow*/ (null,_item.substring((int) (0),_x))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=28835882;
 //BA.debugLineNum = 28835882;BA.debugLine="If full.Length > 0 Then";
if (_full.length()>0) { 
RDebugUtils.currentLine=28835883;
 //BA.debugLineNum = 28835883;BA.debugLine="tf.Append(item.SubString2(x, x + full.Length)).";
_tf._append /*b4j.example.b4jtextflow*/ (null,_item.substring(_x,(int) (_x+_full.length())))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._texthighlightcolor /*int*/ );
 };
RDebugUtils.currentLine=28835885;
 //BA.debugLineNum = 28835885;BA.debugLine="If x + full.Length < item.Length Then";
if (_x+_full.length()<_item.length()) { 
RDebugUtils.currentLine=28835886;
 //BA.debugLineNum = 28835886;BA.debugLine="tf.Append(item.SubString(x + full.Length)).SetC";
_tf._append /*b4j.example.b4jtextflow*/ (null,_item.substring((int) (_x+_full.length())))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=28835888;
 //BA.debugLineNum = 28835888;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=28835889;
 //BA.debugLineNum = 28835889;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=28835890;
 //BA.debugLineNum = 28835890;BA.debugLine="Dim TextPane As B4XView = tf.CreateTextFlow";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()));
RDebugUtils.currentLine=28835891;
 //BA.debugLineNum = 28835891;BA.debugLine="p.AddView(TextPane, 0, p.Height / 2 - 12, p.Widt";
_p.AddView((javafx.scene.Node)(_textpane.getObject()),0,_p.getHeight()/(double)2-12,_p.getWidth(),_p.getHeight()/(double)2);
RDebugUtils.currentLine=28835892;
 //BA.debugLineNum = 28835892;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=28835893;
 //BA.debugLineNum = 28835893;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_p,(Object)(_item));
 }
};
RDebugUtils.currentLine=28835896;
 //BA.debugLineNum = 28835896;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=28835897;
 //BA.debugLineNum = 28835897;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=28835898;
 //BA.debugLineNum = 28835898;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=28835899;
 //BA.debugLineNum = 28835899;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=28835900;
 //BA.debugLineNum = 28835900;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=28835903;
 //BA.debugLineNum = 28835903;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=28246020;
 //BA.debugLineNum = 28246020;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28246023;
 //BA.debugLineNum = 28246023;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28246024;
 //BA.debugLineNum = 28246024;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = ((int)0xfffd5c5c);
RDebugUtils.currentLine=28246025;
 //BA.debugLineNum = 28246025;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = ((int)0x7e008eff);
RDebugUtils.currentLine=28246026;
 //BA.debugLineNum = 28246026;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=28246027;
 //BA.debugLineNum = 28246027;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=28246028;
 //BA.debugLineNum = 28246028;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28246029;
 //BA.debugLineNum = 28246029;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28246030;
 //BA.debugLineNum = 28246030;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=28246031;
 //BA.debugLineNum = 28246031;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=28246035;
 //BA.debugLineNum = 28246035;BA.debugLine="Public AllowUnlistedText As Boolean";
_allowunlistedtext = false;
RDebugUtils.currentLine=28246036;
 //BA.debugLineNum = 28246036;BA.debugLine="Public PrefixOnly As Boolean";
_prefixonly = false;
RDebugUtils.currentLine=28246037;
 //BA.debugLineNum = 28246037;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4j.example.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xsearchtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
int _height = 0;
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=28311562;
 //BA.debugLineNum = 28311562;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=28311564;
 //BA.debugLineNum = 28311564;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=28311565;
 //BA.debugLineNum = 28311565;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=28311566;
 //BA.debugLineNum = 28311566;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=28311568;
 //BA.debugLineNum = 28311568;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=28311569;
 //BA.debugLineNum = 28311569;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=28311572;
 //BA.debugLineNum = 28311572;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=28311573;
 //BA.debugLineNum = 28311573;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=28311574;
 //BA.debugLineNum = 28311574;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=28311580;
 //BA.debugLineNum = 28311580;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.example.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview();
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),0,_c.getTop(),_width,_height-_c.getTop());
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_c.getHeight());
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(b4j.example.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="If AllowUnlistedText Then";
if (__ref._allowunlistedtext /*boolean*/ ) { 
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="SelectedItem = LastTerm";
__ref._selecteditem /*String*/  = __ref._lastterm /*String*/ ;
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 }else 
{RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="Else If CustomListView1.Size > 0 And LastTerm.Len";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=28704773;
 //BA.debugLineNum = 28704773;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue((int) (0)));
 }}
;
RDebugUtils.currentLine=28704775;
 //BA.debugLineNum = 28704775;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(b4j.example.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.example.b4xsearchtemplate __ref,String _term,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_term,_force}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28639237;
 //BA.debugLineNum = 28639237;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=28639239;
 //BA.debugLineNum = 28639239;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=28639242;
 //BA.debugLineNum = 28639242;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=28639244;
 //BA.debugLineNum = 28639244;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=28639245;
 //BA.debugLineNum = 28639245;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=28639246;
 //BA.debugLineNum = 28639246;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=28639247;
 //BA.debugLineNum = 28639247;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=28639249;
 //BA.debugLineNum = 28639249;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=28639250;
 //BA.debugLineNum = 28639250;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=28639252;
 //BA.debugLineNum = 28639252;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=28639254;
 //BA.debugLineNum = 28639254;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=28639255;
 //BA.debugLineNum = 28639255;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=28639257;
 //BA.debugLineNum = 28639257;BA.debugLine="End Sub";
return "";
}
public String  _setindex(b4j.example.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (0)]));
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (1)]));
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="End Sub";
return "";
}
public Object  _setitems(b4j.example.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((Object) Debug.delegate(ba, "setitems", new Object[] {_items}));}
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _itemnotlower = "";
String _itemtolower = "";
int _start = 0;
int _count = 0;
String _str = "";
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=28901382;
 //BA.debugLineNum = 28901382;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=28901383;
 //BA.debugLineNum = 28901383;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28901384;
 //BA.debugLineNum = 28901384;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28901385;
 //BA.debugLineNum = 28901385;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=28901386;
 //BA.debugLineNum = 28901386;BA.debugLine="Dim itemNotLower As String = Items.Get(i)";
_itemnotlower = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=28901387;
 //BA.debugLineNum = 28901387;BA.debugLine="Dim itemToLower As String = itemNotLower.ToLower";
_itemtolower = _itemnotlower.toLowerCase();
RDebugUtils.currentLine=28901388;
 //BA.debugLineNum = 28901388;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=28901389;
 //BA.debugLineNum = 28901389;BA.debugLine="For start = 0 To IIf(PrefixOnly, 0, itemToLower.";
{
final int step13 = 1;
final int limit13 = (int)(BA.ObjectToNumber(((__ref._prefixonly /*boolean*/ ) ? ((Object)(0)) : ((Object)(_itemtolower.length()-1)))));
_start = (int) (0) ;
for (;_start <= limit13 ;_start = _start + step13 ) {
RDebugUtils.currentLine=28901390;
 //BA.debugLineNum = 28901390;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=28901391;
 //BA.debugLineNum = 28901391;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_itemtolower.length()) {
RDebugUtils.currentLine=28901392;
 //BA.debugLineNum = 28901392;BA.debugLine="Dim str As String = itemToLower.SubString2(sta";
_str = _itemtolower.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=28901393;
 //BA.debugLineNum = 28901393;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=28901394;
 //BA.debugLineNum = 28901394;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=28901395;
 //BA.debugLineNum = 28901395;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=28901396;
 //BA.debugLineNum = 28901396;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=28901397;
 //BA.debugLineNum = 28901397;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=28901398;
 //BA.debugLineNum = 28901398;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=28901399;
 //BA.debugLineNum = 28901399;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=28901401;
 //BA.debugLineNum = 28901401;BA.debugLine="li.Add(itemNotLower)";
_li.Add((Object)(_itemnotlower));
 };
RDebugUtils.currentLine=28901403;
 //BA.debugLineNum = 28901403;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=28901407;
 //BA.debugLineNum = 28901407;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("928901407","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
RDebugUtils.currentLine=28901408;
 //BA.debugLineNum = 28901408;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=28901409;
 //BA.debugLineNum = 28901409;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=28901410;
 //BA.debugLineNum = 28901410;BA.debugLine="End Sub";
return null;
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}