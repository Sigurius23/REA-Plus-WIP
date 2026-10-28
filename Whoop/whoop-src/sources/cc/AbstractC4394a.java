package cc;

import android.R;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: cc.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4394a {

    /* JADX INFO: renamed from: a */
    public static final int[] f17738a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f17739b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f17740c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f17741d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f17742e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f17743f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: a */
    public static Interpolator m13815a(Context context, int i13) {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i13);
        if (interpolatorLoadInterpolator != null) {
            return interpolatorLoadInterpolator;
        }
        throw new NullPointerException("Failed to parse interpolator, no start tag found");
    }
}
