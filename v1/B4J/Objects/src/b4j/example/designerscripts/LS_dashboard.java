package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_dashboard{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
views.get("progressbar1").setLeft((int)((50d / 100 * width) - (views.get("progressbar1").getPrefWidth() / 2)));
views.get("progressbar1").setTop((int)((50d / 100 * height) - (views.get("progressbar1").getPrefHeight() / 2)));
views.get("button1").setLeft((int)((50d / 100 * width) - (views.get("button1").getPrefWidth() / 2)));
views.get("pane1").setPrefWidth((int)(((views.get("pnldashboard").getPrefWidth())-(30d * scale)-(45d * scale))/4d));
views.get("pane2").setPrefWidth((int)((views.get("pane1").getPrefWidth())));
views.get("pane3").setPrefWidth((int)((views.get("pane1").getPrefWidth())));
//BA.debugLineNum = 8;BA.debugLine="Pane4.Width = Pane1.Width"[Dashboard/General script]
views.get("pane4").setPrefWidth((int)((views.get("pane1").getPrefWidth())));
//BA.debugLineNum = 9;BA.debugLine="Pane2.Left = Pane1.Right + 15dip"[Dashboard/General script]
views.get("pane2").setLeft((int)((views.get("pane1").getLeft() + views.get("pane1").getPrefWidth())+(15d * scale)));
//BA.debugLineNum = 10;BA.debugLine="Pane3.Left = Pane2.Right + 15dip"[Dashboard/General script]
views.get("pane3").setLeft((int)((views.get("pane2").getLeft() + views.get("pane2").getPrefWidth())+(15d * scale)));
//BA.debugLineNum = 11;BA.debugLine="Pane4.Left = Pane3.Right + 15dip"[Dashboard/General script]
views.get("pane4").setLeft((int)((views.get("pane3").getLeft() + views.get("pane3").getPrefWidth())+(15d * scale)));

}
}