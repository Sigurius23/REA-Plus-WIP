package p182h3;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaRecorder;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.p018ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: h3.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC16792h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MediaRecorder m47338a(Context context) {
        return new MediaRecorder(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ContentInfo.Builder m47339b(ClipData clipData, int i13) {
        return new ContentInfo.Builder(clipData, i13);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ScrollCaptureTarget m47340c(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallbackC16787c scrollCaptureCallbackC16787c) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallbackC16787c);
    }
}
