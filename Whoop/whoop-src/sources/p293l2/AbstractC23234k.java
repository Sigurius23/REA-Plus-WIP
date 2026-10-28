package p293l2;

import android.view.RenderNode;

/* JADX INFO: renamed from: l2.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23234k {
    /* JADX INFO: renamed from: a */
    public static int m67264a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public static int m67265b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public static void m67266c(RenderNode renderNode, int i13) {
        renderNode.setAmbientShadowColor(i13);
    }

    /* JADX INFO: renamed from: d */
    public static void m67267d(RenderNode renderNode, int i13) {
        renderNode.setSpotShadowColor(i13);
    }
}
