package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_mainpanel{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
views.get("btnexit").setPrefHeight((int)((views.get("pnlstatus").getPrefHeight())-(4d * scale)));
views.get("btnexit").setPrefWidth((int)((views.get("btnexit").getPrefHeight())));
views.get("btnexit").setLeft((int)((views.get("pnlstatus").getPrefWidth())-(views.get("btnexit").getPrefWidth())-(6d * scale)));
views.get("btnexit").setTop((int)((views.get("pnlstatus").getTop())+(2d * scale)));
if ((BA.ObjectToBoolean( (String.valueOf(views.get("pnlmini").getVisible()))))) { 
;
views.get("pnlcenter").setLeft((int)((views.get("pnlmini").getLeft() + views.get("pnlmini").getPrefWidth())));
;}else if ((BA.ObjectToBoolean( (String.valueOf(views.get("pnlstatic").getVisible()))))) { 
;
views.get("pnlcenter").setLeft((int)((views.get("pnlstatic").getLeft() + views.get("pnlstatic").getPrefWidth())));
;}else{ 
;
//BA.debugLineNum = 11;BA.debugLine="PnlCenter.Left = 0"[MainPanel/General script]
views.get("pnlcenter").setLeft((int)(0d));
//BA.debugLineNum = 12;BA.debugLine="PnlCenter.Width = 100%x"[MainPanel/General script]
views.get("pnlcenter").setPrefWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 13;BA.debugLine="End If"[MainPanel/General script]
;};

}
}