package p119ej;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import p426qi.C30387i;
import p649yi.C39548c;

/* JADX INFO: renamed from: ej.a */
/* JADX INFO: loaded from: classes.dex */
public class C13224a {

    /* JADX INFO: renamed from: a */
    public final C30387i f45815a;

    /* JADX INFO: renamed from: b */
    public final Object f45816b;

    /* JADX INFO: renamed from: c */
    public Object f45817c;

    /* JADX INFO: renamed from: d */
    public final Interpolator f45818d;

    /* JADX INFO: renamed from: e */
    public final Interpolator f45819e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f45820f;

    /* JADX INFO: renamed from: g */
    public final float f45821g;

    /* JADX INFO: renamed from: h */
    public Float f45822h;

    /* JADX INFO: renamed from: i */
    public float f45823i;

    /* JADX INFO: renamed from: j */
    public float f45824j;

    /* JADX INFO: renamed from: k */
    public int f45825k;

    /* JADX INFO: renamed from: l */
    public int f45826l;

    /* JADX INFO: renamed from: m */
    public float f45827m;

    /* JADX INFO: renamed from: n */
    public float f45828n;

    /* JADX INFO: renamed from: o */
    public PointF f45829o;

    /* JADX INFO: renamed from: p */
    public PointF f45830p;

    public C13224a(C30387i c30387i, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f13, Float f14) {
        this.f45823i = -3987645.8f;
        this.f45824j = -3987645.8f;
        this.f45825k = 784923401;
        this.f45826l = 784923401;
        this.f45827m = Float.MIN_VALUE;
        this.f45828n = Float.MIN_VALUE;
        this.f45829o = null;
        this.f45830p = null;
        this.f45815a = c30387i;
        this.f45816b = obj;
        this.f45817c = obj2;
        this.f45818d = baseInterpolator;
        this.f45819e = null;
        this.f45820f = null;
        this.f45821g = f13;
        this.f45822h = f14;
    }

    /* JADX INFO: renamed from: a */
    public final float m37123a() {
        C30387i c30387i = this.f45815a;
        if (c30387i == null) {
            return 1.0f;
        }
        if (this.f45828n == Float.MIN_VALUE) {
            if (this.f45822h == null) {
                this.f45828n = 1.0f;
            } else {
                this.f45828n = (float) (((double) m37124b()) + (((double) (this.f45822h.floatValue() - this.f45821g)) / ((double) (c30387i.f124693m - c30387i.f124692l))));
            }
        }
        return this.f45828n;
    }

    /* JADX INFO: renamed from: b */
    public final float m37124b() {
        C30387i c30387i = this.f45815a;
        if (c30387i == null) {
            return 0.0f;
        }
        if (this.f45827m == Float.MIN_VALUE) {
            float f13 = c30387i.f124692l;
            this.f45827m = (this.f45821g - f13) / (c30387i.f124693m - f13);
        }
        return this.f45827m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37125c() {
        return this.f45818d == null && this.f45819e == null && this.f45820f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f45816b + ", endValue=" + this.f45817c + ", startFrame=" + this.f45821g + ", endFrame=" + this.f45822h + ", interpolator=" + this.f45818d + '}';
    }

    public C13224a(C30387i c30387i, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f13) {
        this.f45823i = -3987645.8f;
        this.f45824j = -3987645.8f;
        this.f45825k = 784923401;
        this.f45826l = 784923401;
        this.f45827m = Float.MIN_VALUE;
        this.f45828n = Float.MIN_VALUE;
        this.f45829o = null;
        this.f45830p = null;
        this.f45815a = c30387i;
        this.f45816b = obj;
        this.f45817c = obj2;
        this.f45818d = null;
        this.f45819e = baseInterpolator;
        this.f45820f = baseInterpolator2;
        this.f45821g = f13;
        this.f45822h = null;
    }

    public C13224a(C30387i c30387i, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f13, Float f14) {
        this.f45823i = -3987645.8f;
        this.f45824j = -3987645.8f;
        this.f45825k = 784923401;
        this.f45826l = 784923401;
        this.f45827m = Float.MIN_VALUE;
        this.f45828n = Float.MIN_VALUE;
        this.f45829o = null;
        this.f45830p = null;
        this.f45815a = c30387i;
        this.f45816b = obj;
        this.f45817c = obj2;
        this.f45818d = interpolator;
        this.f45819e = interpolator2;
        this.f45820f = interpolator3;
        this.f45821g = f13;
        this.f45822h = f14;
    }

    public C13224a(Object obj) {
        this.f45823i = -3987645.8f;
        this.f45824j = -3987645.8f;
        this.f45825k = 784923401;
        this.f45826l = 784923401;
        this.f45827m = Float.MIN_VALUE;
        this.f45828n = Float.MIN_VALUE;
        this.f45829o = null;
        this.f45830p = null;
        this.f45815a = null;
        this.f45816b = obj;
        this.f45817c = obj;
        this.f45818d = null;
        this.f45819e = null;
        this.f45820f = null;
        this.f45821g = Float.MIN_VALUE;
        this.f45822h = Float.valueOf(Float.MAX_VALUE);
    }

    public C13224a(C39548c c39548c, C39548c c39548c2) {
        this.f45823i = -3987645.8f;
        this.f45824j = -3987645.8f;
        this.f45825k = 784923401;
        this.f45826l = 784923401;
        this.f45827m = Float.MIN_VALUE;
        this.f45828n = Float.MIN_VALUE;
        this.f45829o = null;
        this.f45830p = null;
        this.f45815a = null;
        this.f45816b = c39548c;
        this.f45817c = c39548c2;
        this.f45818d = null;
        this.f45819e = null;
        this.f45820f = null;
        this.f45821g = Float.MIN_VALUE;
        this.f45822h = Float.valueOf(Float.MAX_VALUE);
    }
}
