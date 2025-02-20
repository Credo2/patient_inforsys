package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class dbutils extends Object{
public static dbutils mostCurrent = new dbutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dbutils", null);
		ba.loadHtSubs(dbutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dbutils", ba);
		}
	}
    public static Class<?> getObject() {
		return dbutils.class;
	}

 
public static class _dbfieldinfo{
public boolean IsInitialized;
public String FieldName;
public String DataType;
public boolean CanBeNull;
public Object DefValue;
public void Initialize() {
IsInitialized = true;
FieldName = "";
DataType = "";
CanBeNull = false;
DefValue = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static String  _copydbfromassets(String _filename,String _appname) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "copydbfromassets", true))
	 {return ((String) Debug.delegate(ba, "copydbfromassets", new Object[] {_filename,_appname}));}
String _targetdir = "";
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub CopyDBFromAssets (FileName As String, A";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="Dim TargetDir As String = GetDBFolder(AppName)";
_targetdir = _getdbfolder(_appname);
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=35061766;
 //BA.debugLineNum = 35061766;BA.debugLine="End Sub";
return "";
}
public static String  _getdbfolder(String _appname) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getdbfolder", true))
	 {return ((String) Debug.delegate(ba, "getdbfolder", new Object[] {_appname}));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub GetDBFolder (AppName As String) As Stri";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="Return File.DirData(AppName)";
if (true) return anywheresoftware.b4a.keywords.Common.File.DirData(_appname);
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="End Sub";
return "";
}
public static String  _createtable(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((String) Debug.delegate(ba, "createtable", new Object[] {_sql,_tablename,_fieldsandtypes,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=35192837;
 //BA.debugLineNum = 35192837;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=35192838;
 //BA.debugLineNum = 35192838;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=35192840;
 //BA.debugLineNum = 35192840;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=35192841;
 //BA.debugLineNum = 35192841;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=35192842;
 //BA.debugLineNum = 35192842;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=35192844;
 //BA.debugLineNum = 35192844;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=35192845;
 //BA.debugLineNum = 35192845;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=35192847;
 //BA.debugLineNum = 35192847;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("935192847","CreateTable: "+_query,0);
RDebugUtils.currentLine=35192849;
 //BA.debugLineNum = 35192849;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=35192850;
 //BA.debugLineNum = 35192850;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "deleterecord", true))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_sql,_tablename,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="sb.Append(\"DELETE FROM \" & EscapeField(TableName)";
_sb.Append("DELETE FROM "+_escapefield(_tablename)+" WHERE ");
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("936110341","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=36110344;
 //BA.debugLineNum = 36110344;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36110345;
 //BA.debugLineNum = 36110345;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _wherefieldequals.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_col = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=36110347;
 //BA.debugLineNum = 36110347;BA.debugLine="If args.Size > 0 Then sb.Append(\" AND \")";
if (_args.getSize()>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=36110348;
 //BA.debugLineNum = 36110348;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_col)).Append(" = ?");
RDebugUtils.currentLine=36110349;
 //BA.debugLineNum = 36110349;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=36110352;
 //BA.debugLineNum = 36110352;BA.debugLine="Log(\"DeleteRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("936110352","DeleteRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=36110354;
 //BA.debugLineNum = 36110354;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=36110355;
 //BA.debugLineNum = 36110355;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "droptable", true))
	 {return ((String) Debug.delegate(ba, "droptable", new Object[] {_sql,_tablename}));}
String _query = "";
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Dim query As String = \"DROP TABLE IF EXISTS\" & Es";
_query = "DROP TABLE IF EXISTS"+_escapefield(_tablename);
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.LogImpl("935258371","DropTable: "+_query,0);
RDebugUtils.currentLine=35258373;
 //BA.debugLineNum = 35258373;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=35258374;
 //BA.debugLineNum = 35258374;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executehtml", true))
	 {return ((String) Debug.delegate(ba, "executehtml", new Object[] {_sql,_query,_stringargs,_limit,_clickable}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=35782664;
 //BA.debugLineNum = 35782664;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("935782664","ExecuteHtml: "+_query,0);
RDebugUtils.currentLine=35782667;
 //BA.debugLineNum = 35782667;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35782668;
 //BA.debugLineNum = 35782668;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35782669;
 //BA.debugLineNum = 35782669;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=35782670;
 //BA.debugLineNum = 35782670;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=35782671;
 //BA.debugLineNum = 35782671;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=35782672;
 //BA.debugLineNum = 35782672;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=35782673;
 //BA.debugLineNum = 35782673;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=35782675;
 //BA.debugLineNum = 35782675;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=35782685;
 //BA.debugLineNum = 35782685;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=35782686;
 //BA.debugLineNum = 35782686;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=35782687;
 //BA.debugLineNum = 35782687;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=35782688;
 //BA.debugLineNum = 35782688;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=35782689;
 //BA.debugLineNum = 35782689;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=35782691;
 //BA.debugLineNum = 35782691;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=35782693;
 //BA.debugLineNum = 35782693;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=35782694;
 //BA.debugLineNum = 35782694;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=35782695;
 //BA.debugLineNum = 35782695;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=35782696;
 //BA.debugLineNum = 35782696;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=35782697;
 //BA.debugLineNum = 35782697;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=35782698;
 //BA.debugLineNum = 35782698;BA.debugLine="sb.Append(\".stub'>\").Append(cur.GetString2(i))";
_sb.Append(".stub'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=35782700;
 //BA.debugLineNum = 35782700;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=35782702;
 //BA.debugLineNum = 35782702;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=35782704;
 //BA.debugLineNum = 35782704;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=35782705;
 //BA.debugLineNum = 35782705;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=35782707;
 //BA.debugLineNum = 35782707;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=35782708;
 //BA.debugLineNum = 35782708;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=35782709;
 //BA.debugLineNum = 35782709;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=35782710;
 //BA.debugLineNum = 35782710;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executejson", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executejson", new Object[] {_sql,_query,_stringargs,_limit,_dbtypes}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("935717129","ExecuteJSON: "+_query,0);
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=35717133;
 //BA.debugLineNum = 35717133;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35717135;
 //BA.debugLineNum = 35717135;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=35717136;
 //BA.debugLineNum = 35717136;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=35717137;
 //BA.debugLineNum = 35717137;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=35717139;
 //BA.debugLineNum = 35717139;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=35717141;
 //BA.debugLineNum = 35717141;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=35717143;
 //BA.debugLineNum = 35717143;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=35717145;
 //BA.debugLineNum = 35717145;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("935717145","Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=35717148;
 //BA.debugLineNum = 35717148;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=35717149;
 //BA.debugLineNum = 35717149;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=35717151;
 //BA.debugLineNum = 35717151;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=35717152;
 //BA.debugLineNum = 35717152;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35717153;
 //BA.debugLineNum = 35717153;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=35717154;
 //BA.debugLineNum = 35717154;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=35717155;
 //BA.debugLineNum = 35717155;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=35717156;
 //BA.debugLineNum = 35717156;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executelist(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executelist", new Object[] {_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.List _res = null;
String[] _cols = null;
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Dim Table As List = ExecuteMemoryTable(SQL, Query";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = _executememorytable(_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="For Each Cols() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_cols = (String[])(group4.Get(index4));
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="res.Add(Cols(0))";
_res.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executememorytable", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executememorytable", new Object[] {_sql,_query,_stringargs,_limit}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("935389447","ExecuteMemoryTable: "+_query,0);
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35389450;
 //BA.debugLineNum = 35389450;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=35389451;
 //BA.debugLineNum = 35389451;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=35389452;
 //BA.debugLineNum = 35389452;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=35389453;
 //BA.debugLineNum = 35389453;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=35389454;
 //BA.debugLineNum = 35389454;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=35389456;
 //BA.debugLineNum = 35389456;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=35389457;
 //BA.debugLineNum = 35389457;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=35389459;
 //BA.debugLineNum = 35389459;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=35389460;
 //BA.debugLineNum = 35389460;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=35389461;
 //BA.debugLineNum = 35389461;BA.debugLine="End Sub";
return null;
}
public static String  _executelist2(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist2", true))
	 {return ((String) Debug.delegate(ba, "executelist2", new Object[] {_sql,_query,_stringargs,_limit,_list}));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub ExecuteList2(SQL As SQL, Query As Strin";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="List.Clear";
_list.Clear();
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="List.AddAll(ExecuteList(SQL, Query, StringArgs, L";
_list.AddAll(_executelist(_sql,_query,_stringargs,_limit));
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executemap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executemap", new Object[] {_sql,_query,_stringargs}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=35454985;
 //BA.debugLineNum = 35454985;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.LogImpl("935454985","ExecuteMap: "+_query,0);
RDebugUtils.currentLine=35454987;
 //BA.debugLineNum = 35454987;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=35454989;
 //BA.debugLineNum = 35454989;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("935454989","No records found.",0);
RDebugUtils.currentLine=35454991;
 //BA.debugLineNum = 35454991;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=35454993;
 //BA.debugLineNum = 35454993;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=35454994;
 //BA.debugLineNum = 35454994;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=35454995;
 //BA.debugLineNum = 35454995;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=35454997;
 //BA.debugLineNum = 35454997;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=35454998;
 //BA.debugLineNum = 35454998;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35454999;
 //BA.debugLineNum = 35454999;BA.debugLine="End Sub";
return null;
}
public static String  _executetableview(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4j.objects.TableViewWrapper _tableview1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executetableview", true))
	 {return ((String) Debug.delegate(ba, "executetableview", new Object[] {_sql,_query,_stringargs,_limit,_tableview1}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _cols = null;
int _i = 0;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub ExecuteTableView(SQL As SQL, Query As S";
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="TableView1.Items.Clear";
_tableview1.getItems().Clear();
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=35520519;
 //BA.debugLineNum = 35520519;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="Dim cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="cols.Initialize";
_cols.Initialize();
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step9 = 1;
final int limit9 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=35520523;
 //BA.debugLineNum = 35520523;BA.debugLine="cols.Add(cur.GetColumnName(i))";
_cols.Add((Object)(_cur.GetColumnName(_i)));
 }
};
RDebugUtils.currentLine=35520525;
 //BA.debugLineNum = 35520525;BA.debugLine="TableView1.SetColumns(cols)";
_tableview1.SetColumns(_cols);
RDebugUtils.currentLine=35520526;
 //BA.debugLineNum = 35520526;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=35520527;
 //BA.debugLineNum = 35520527;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=35520528;
 //BA.debugLineNum = 35520528;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step15 = 1;
final int limit15 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;_col <= limit15 ;_col = _col + step15 ) {
RDebugUtils.currentLine=35520529;
 //BA.debugLineNum = 35520529;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=35520531;
 //BA.debugLineNum = 35520531;BA.debugLine="TableView1.Items.Add(values)";
_tableview1.getItems().Add((Object)(_values));
RDebugUtils.currentLine=35520532;
 //BA.debugLineNum = 35520532;BA.debugLine="If Limit > 0 And TableView1.Items.Size >= Limit";
if (_limit>0 && _tableview1.getItems().getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=35520534;
 //BA.debugLineNum = 35520534;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=35520535;
 //BA.debugLineNum = 35520535;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4j.objects.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getdbversion", true))
	 {return ((Integer) Debug.delegate(ba, "getdbversion", new Object[] {_sql}));}
int _version = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Public Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Dim version As Int";
_version = 0;
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="If TableExists(SQL, \"DBVersion\") Then";
if (_tableexists(_sql,"DBVersion")) { 
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT version FROM DBVersion")));
 }else {
RDebugUtils.currentLine=35848201;
 //BA.debugLineNum = 35848201;BA.debugLine="Dim m As Map = CreateMap(\"version\": DB_INTEGER)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("version"),(Object)(_db_integer)});
RDebugUtils.currentLine=35848202;
 //BA.debugLineNum = 35848202;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=35848204;
 //BA.debugLineNum = 35848204;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=35848205;
 //BA.debugLineNum = 35848205;BA.debugLine="version = 1";
_version = (int) (1);
 };
RDebugUtils.currentLine=35848207;
 //BA.debugLineNum = 35848207;BA.debugLine="Return version";
if (true) return _version;
RDebugUtils.currentLine=35848208;
 //BA.debugLineNum = 35848208;BA.debugLine="End Sub";
return 0;
}
public static boolean  _tableexists(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "tableexists", true))
	 {return ((Boolean) Debug.delegate(ba, "tableexists", new Object[] {_sql,_tablename}));}
int _count = 0;
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub TableExists(SQL As SQL, TableName As St";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="Dim count As Int = SQL.ExecQuerySingleResult2(\"SE";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult2("SELECT count(name) FROM sqlite_master WHERE type='table' AND name=? COLLATE NOCASE",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_tablename}))));
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Return count > 0";
if (true) return _count>0;
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _getfieldsinfo(anywheresoftware.b4j.objects.SQL _db,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "getfieldsinfo", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getfieldsinfo", new Object[] {_db,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfieldsinfo = null;
anywheresoftware.b4a.objects.collections.List _fieldslist = null;
String[] _values = null;
b4j.example.dbutils._dbfieldinfo _fieldinfo = null;
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub GetFieldsInfo(DB As SQL, TableName As S";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Dim lstFieldsInfo As List";
_lstfieldsinfo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="lstFieldsInfo.Initialize";
_lstfieldsinfo.Initialize();
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="Dim FieldsList As List = ExecuteMemoryTable(DB, \"";
_fieldslist = new anywheresoftware.b4a.objects.collections.List();
_fieldslist = _executememorytable(_db,"PRAGMA table_info ('"+_tablename+"')",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="For Each values() As String In FieldsList";
{
final anywheresoftware.b4a.BA.IterableList group4 = _fieldslist;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_values = (String[])(group4.Get(index4));
RDebugUtils.currentLine=36306949;
 //BA.debugLineNum = 36306949;BA.debugLine="Dim FieldInfo As DBFieldInfo";
_fieldinfo = new b4j.example.dbutils._dbfieldinfo();
RDebugUtils.currentLine=36306950;
 //BA.debugLineNum = 36306950;BA.debugLine="FieldInfo.Initialize";
_fieldinfo.Initialize();
RDebugUtils.currentLine=36306951;
 //BA.debugLineNum = 36306951;BA.debugLine="FieldInfo.FieldName = values(1)";
_fieldinfo.FieldName /*String*/  = _values[(int) (1)];
RDebugUtils.currentLine=36306952;
 //BA.debugLineNum = 36306952;BA.debugLine="FieldInfo.DataType = values(2)";
_fieldinfo.DataType /*String*/  = _values[(int) (2)];
RDebugUtils.currentLine=36306953;
 //BA.debugLineNum = 36306953;BA.debugLine="FieldInfo.CanBeNull = (values(3) = 1)";
_fieldinfo.CanBeNull /*boolean*/  = ((_values[(int) (3)]).equals(BA.NumberToString(1)));
RDebugUtils.currentLine=36306954;
 //BA.debugLineNum = 36306954;BA.debugLine="FieldInfo.DefValue = values(4)";
_fieldinfo.DefValue /*Object*/  = (Object)(_values[(int) (4)]);
RDebugUtils.currentLine=36306955;
 //BA.debugLineNum = 36306955;BA.debugLine="lstFieldsInfo.Add(FieldInfo)";
_lstfieldsinfo.Add((Object)(_fieldinfo));
 }
};
RDebugUtils.currentLine=36306958;
 //BA.debugLineNum = 36306958;BA.debugLine="Return lstFieldsInfo";
if (true) return _lstfieldsinfo;
RDebugUtils.currentLine=36306959;
 //BA.debugLineNum = 36306959;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _gettables(anywheresoftware.b4j.objects.SQL _db) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "gettables", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettables", new Object[] {_db}));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub GetTables(DB As SQL) As List";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="Return ExecuteList(DB, \"SELECT name FROM sqlite_m";
if (true) return _executelist(_db,"SELECT name FROM sqlite_master WHERE type = 'table'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="End Sub";
return null;
}
public static boolean  _insertmaps(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "insertmaps", true))
	 {return ((Boolean) Debug.delegate(ba, "insertmaps", new Object[] {_sql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
boolean _res = false;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="Dim res As Boolean = False";
_res = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=35323908;
 //BA.debugLineNum = 35323908;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=35323909;
 //BA.debugLineNum = 35323909;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.LogImpl("935323909","Same Map found twice in list. Each item in the list should include a different map object.",0);
RDebugUtils.currentLine=35323910;
 //BA.debugLineNum = 35323910;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=35323912;
 //BA.debugLineNum = 35323912;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=35323913;
 //BA.debugLineNum = 35323913;BA.debugLine="Try";
try {RDebugUtils.currentLine=35323914;
 //BA.debugLineNum = 35323914;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit9 ;_i1 = _i1 + step9 ) {
RDebugUtils.currentLine=35323915;
 //BA.debugLineNum = 35323915;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35323916;
 //BA.debugLineNum = 35323916;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=35323917;
 //BA.debugLineNum = 35323917;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=35323918;
 //BA.debugLineNum = 35323918;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35323919;
 //BA.debugLineNum = 35323919;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=35323920;
 //BA.debugLineNum = 35323920;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=35323921;
 //BA.debugLineNum = 35323921;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=35323922;
 //BA.debugLineNum = 35323922;BA.debugLine="For Each col As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _m.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_col = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=35323923;
 //BA.debugLineNum = 35323923;BA.debugLine="Dim value As Object = m.Get(col)";
_value = _m.Get((Object)(_col));
RDebugUtils.currentLine=35323924;
 //BA.debugLineNum = 35323924;BA.debugLine="If listOfValues.Size > 0 Then";
if (_listofvalues.getSize()>0) { 
RDebugUtils.currentLine=35323925;
 //BA.debugLineNum = 35323925;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=35323926;
 //BA.debugLineNum = 35323926;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=35323928;
 //BA.debugLineNum = 35323928;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
RDebugUtils.currentLine=35323929;
 //BA.debugLineNum = 35323929;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=35323930;
 //BA.debugLineNum = 35323930;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=35323932;
 //BA.debugLineNum = 35323932;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=35323934;
 //BA.debugLineNum = 35323934;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("935323934","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=35323936;
 //BA.debugLineNum = 35323936;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=35323938;
 //BA.debugLineNum = 35323938;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
RDebugUtils.currentLine=35323939;
 //BA.debugLineNum = 35323939;BA.debugLine="res = True";
_res = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e34) {
			ba.setLastException(e34);RDebugUtils.currentLine=35323941;
 //BA.debugLineNum = 35323941;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("935323941",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=35323943;
 //BA.debugLineNum = 35323943;BA.debugLine="SQL.Rollback";
_sql.Rollback();
 };
RDebugUtils.currentLine=35323949;
 //BA.debugLineNum = 35323949;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=35323950;
 //BA.debugLineNum = 35323950;BA.debugLine="End Sub";
return false;
}
public static String  _setdbversion(anywheresoftware.b4j.objects.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "setdbversion", true))
	 {return ((String) Debug.delegate(ba, "setdbversion", new Object[] {_sql,_version}));}
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub SetDBVersion (SQL As SQL, Version As In";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord", true))
	 {return ((String) Debug.delegate(ba, "updaterecord", new Object[] {_sql,_tablename,_field,_newvalue,_wherefieldequals}));}
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="UpdateRecord2(SQL, TableName, CreateMap(Field: Ne";
_updaterecord2(_sql,_tablename,anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(_field),_newvalue}),_wherefieldequals);
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord2", true))
	 {return ((String) Debug.delegate(ba, "updaterecord2", new Object[] {_sql,_tablename,_fields,_wherefieldequals}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
String _col = "";
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("936044802","WhereFieldEquals map empty!",0);
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.LogImpl("936044806","Fields empty",0);
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=36044811;
 //BA.debugLineNum = 36044811;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ");
RDebugUtils.currentLine=36044812;
 //BA.debugLineNum = 36044812;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36044813;
 //BA.debugLineNum = 36044813;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=36044814;
 //BA.debugLineNum = 36044814;BA.debugLine="For Each col As String In Fields.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = _fields.Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=36044815;
 //BA.debugLineNum = 36044815;BA.debugLine="sb.Append(EscapeField(col)).Append(\"=?\")";
_sb.Append(_escapefield(_col)).Append("=?");
RDebugUtils.currentLine=36044816;
 //BA.debugLineNum = 36044816;BA.debugLine="sb.Append(\",\")";
_sb.Append(",");
RDebugUtils.currentLine=36044817;
 //BA.debugLineNum = 36044817;BA.debugLine="args.Add(Fields.Get(col))";
_args.Add(_fields.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=36044819;
 //BA.debugLineNum = 36044819;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=36044820;
 //BA.debugLineNum = 36044820;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=36044821;
 //BA.debugLineNum = 36044821;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = _wherefieldequals.Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_col = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=36044822;
 //BA.debugLineNum = 36044822;BA.debugLine="sb.Append(EscapeField(col)).Append(\" = ?\")";
_sb.Append(_escapefield(_col)).Append(" = ?");
RDebugUtils.currentLine=36044823;
 //BA.debugLineNum = 36044823;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
RDebugUtils.currentLine=36044824;
 //BA.debugLineNum = 36044824;BA.debugLine="args.Add(WhereFieldEquals.Get(col))";
_args.Add(_wherefieldequals.Get((Object)(_col)));
 }
};
RDebugUtils.currentLine=36044826;
 //BA.debugLineNum = 36044826;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-" AND ".length()),_sb.getLength());
RDebugUtils.currentLine=36044828;
 //BA.debugLineNum = 36044828;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("936044828","UpdateRecord: "+_sb.ToString(),0);
RDebugUtils.currentLine=36044830;
 //BA.debugLineNum = 36044830;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=36044831;
 //BA.debugLineNum = 36044831;BA.debugLine="End Sub";
return "";
}
}