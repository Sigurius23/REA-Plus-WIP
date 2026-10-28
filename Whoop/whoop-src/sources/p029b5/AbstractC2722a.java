package p029b5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p267k.C22082c;
import p267k.C22083d;
import p267k.C22084e;
import p267k.InterfaceC22085f;
import p607x8.AbstractC38046a;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: b5.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2722a {
    /* JADX INFO: renamed from: a */
    public static Icon m7674a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* JADX INFO: renamed from: b */
    public static void m7675b(int i13) {
        SdkExtensions.getExtensionVersion(i13);
    }

    /* JADX INFO: renamed from: c */
    public static final Bitmap m7676c(MediaMetadataRetriever mediaMetadataRetriever, long j7, int i13, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getFrameAtTime(j7, i13);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getFrameAtTime(j7, i13, bitmapParams);
    }

    /* JADX INFO: renamed from: d */
    public static final Bitmap m7677d(MediaMetadataRetriever mediaMetadataRetriever, long j7, int i13, int i14, int i15, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j7, i13, i14, i15);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getScaledFrameAtTime(j7, i13, i14, i15, bitmapParams);
    }

    /* JADX INFO: renamed from: e */
    public static ResolveInfo m7678e(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    /* JADX INFO: renamed from: f */
    public static String m7679f(InterfaceC22085f interfaceC22085f) {
        if (interfaceC22085f instanceof C22083d) {
            return "image/*";
        }
        if (interfaceC22085f instanceof C22084e) {
            return "video/*";
        }
        if (interfaceC22085f instanceof C22082c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7680g() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            return true;
        }
        return i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7681h(Canvas canvas, float f13, float f14, float f15, float f16) {
        return canvas.quickReject(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7682i(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m7683j(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    /* JADX INFO: renamed from: k */
    public static void m7684k(Window window, boolean z4) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z4);
    }

    /* JADX INFO: renamed from: l */
    public static void m7685l(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* JADX INFO: renamed from: m */
    public static void m7686m(Outline outline, InterfaceC17910s0 interfaceC17910s0) {
        if (!(interfaceC17910s0 instanceof C17891j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C17891j) interfaceC17910s0).f69587a);
    }

    /* JADX INFO: renamed from: n */
    public static void m7687n(Surface surface, float f13) {
        try {
            surface.setFrameRate(f13, f13 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e5) {
            AbstractC38046a.m121813h("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e5);
        }
    }
}
