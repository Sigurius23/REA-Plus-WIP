package p208i2;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.compose.p018ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: i2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17870b {
    /* JADX INFO: renamed from: a */
    public static void m51406a(Canvas canvas, boolean z4) {
        if (z4) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m51407b(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    /* JADX INFO: renamed from: c */
    public static void m51408c(Paint paint, int i13) {
        paint.setBlendMode(m51409d(i13));
    }

    /* JADX INFO: renamed from: d */
    public static final BlendMode m51409d(int i13) {
        if (i13 == 0) {
            return BlendMode.CLEAR;
        }
        if (i13 == 1) {
            return BlendMode.SRC;
        }
        if (i13 == 2) {
            return BlendMode.DST;
        }
        if (i13 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i13 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i13 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i13 == 6) {
            return BlendMode.DST_IN;
        }
        if (i13 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i13 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i13 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i13 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i13 == 11) {
            return BlendMode.XOR;
        }
        if (i13 == 12) {
            return BlendMode.PLUS;
        }
        if (i13 == 13) {
            return BlendMode.MODULATE;
        }
        if (i13 == 14) {
            return BlendMode.SCREEN;
        }
        if (i13 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i13 == 16) {
            return BlendMode.DARKEN;
        }
        if (i13 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i13 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i13 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i13 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i13 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i13 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i13 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i13 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i13 == 25) {
            return BlendMode.HUE;
        }
        if (i13 == 26) {
            return BlendMode.SATURATION;
        }
        if (i13 == 27) {
            return BlendMode.COLOR;
        }
        return i13 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: e */
    public static final PorterDuff.Mode m51410e(int i13) {
        if (i13 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i13 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i13 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i13 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i13 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i13 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i13 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i13 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i13 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i13 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i13 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i13 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i13 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
