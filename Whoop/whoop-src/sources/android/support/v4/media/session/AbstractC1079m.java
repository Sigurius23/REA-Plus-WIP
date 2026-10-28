package android.support.v4.media.session;

import android.content.Context;
import android.graphics.RenderNode;
import android.media.session.MediaSession;
import android.view.WindowInsets;

/* JADX INFO: renamed from: android.support.v4.media.session.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1079m {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RenderNode m3213a() {
        return new RenderNode("OffscreenLayer.main");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MediaSession m3214b(Context context, String str) {
        return new MediaSession(context, str, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ WindowInsets.Builder m3215c(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ RenderNode m3216d() {
        return new RenderNode("OffscreenLayer.shadow");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ RenderNode m3217e() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }
}
