package ir;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: ir.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20858a {

    /* JADX INFO: renamed from: a */
    public static final int[] f78460a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final int[] f78461b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    public static final int[] f78462c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d */
    public static final int[] f78463d = {R.attr.state_selected};

    /* JADX INFO: renamed from: a */
    public static int m57612a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC35642a.m112838g(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m57613b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
