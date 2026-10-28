package p474s;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p479s4.AbstractC32121b;

/* JADX INFO: renamed from: s.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31950e1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f132660a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f132661b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f132662c = new Rect();

    /* JADX INFO: renamed from: a */
    public static void m99443a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 29 || i13 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f132660a);
        } else {
            drawable.setState(f132661b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: b */
    public static Rect m99444b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return AbstractC31942c1.m99421a(AbstractC32121b.m99995H(drawable));
        }
        Insets insetsM99430a = AbstractC31946d1.m99430a(drawable);
        return new Rect(insetsM99430a.left, insetsM99430a.top, insetsM99430a.right, insetsM99430a.bottom);
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m99445c(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
