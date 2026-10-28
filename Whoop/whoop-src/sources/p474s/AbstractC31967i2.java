package p474s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p290l.AbstractC22932a;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: s.i2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31967i2 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f132715a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f132716b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f132717c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f132718d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f132719e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f132720f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f132721g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m99459a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC22932a.f90517j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m99460b(Context context, int i13) {
        ColorStateList colorStateListM99462d = m99462d(context, i13);
        if (colorStateListM99462d != null && colorStateListM99462d.isStateful()) {
            return colorStateListM99462d.getColorForState(f132716b, colorStateListM99462d.getDefaultColor());
        }
        ThreadLocal threadLocal = f132715a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f13 = typedValue.getFloat();
        int iM99461c = m99461c(context, i13);
        return AbstractC35642a.m112838g(iM99461c, Math.round(Color.alpha(iM99461c) * f13));
    }

    /* JADX INFO: renamed from: c */
    public static int m99461c(Context context, int i13) {
        int[] iArr = f132721g;
        iArr[0] = i13;
        C31983m2 c31983m2M99478p = C31983m2.m99478p(context, null, iArr);
        try {
            return ((TypedArray) c31983m2M99478p.f132769x).getColor(0, 0);
        } finally {
            c31983m2M99478p.m99491r();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m99462d(Context context, int i13) {
        int[] iArr = f132721g;
        iArr[0] = i13;
        C31983m2 c31983m2M99478p = C31983m2.m99478p(context, null, iArr);
        try {
            return c31983m2M99478p.m99484h(0);
        } finally {
            c31983m2M99478p.m99491r();
        }
    }
}
