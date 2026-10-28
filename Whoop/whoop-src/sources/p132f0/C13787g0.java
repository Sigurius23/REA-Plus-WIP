package p132f0;

import android.content.Context;
import android.widget.EdgeEffect;
import p095dp.AbstractC12240d;
import p180h0.EnumC16377d2;
import p636y3.C39180l;

/* JADX INFO: renamed from: f0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13787g0 {

    /* JADX INFO: renamed from: a */
    public final Context f49183a;

    /* JADX INFO: renamed from: b */
    public final int f49184b;

    /* JADX INFO: renamed from: c */
    public long f49185c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f49186d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f49187e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f49188f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f49189g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f49190h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f49191i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f49192j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f49193k;

    public C13787g0(Context context, int i13) {
        this.f49183a = context;
        this.f49184b = i13;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m39140f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m39141g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(AbstractC12240d.m34041G(edgeEffect) == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m39142a(EnumC16377d2 enumC16377d2) {
        EdgeEffect edgeEffectM34084u = AbstractC12240d.m34084u(this.f49183a);
        edgeEffectM34084u.setColor(this.f49184b);
        if (!C39180l.m124799a(this.f49185c, 0L)) {
            if (enumC16377d2 == EnumC16377d2.f62971w) {
                long j7 = this.f49185c;
                edgeEffectM34084u.setSize((int) (j7 >> 32), (int) (j7 & 4294967295L));
                return edgeEffectM34084u;
            }
            long j13 = this.f49185c;
            edgeEffectM34084u.setSize((int) (j13 & 4294967295L), (int) (j13 >> 32));
        }
        return edgeEffectM34084u;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m39143b() {
        EdgeEffect edgeEffect = this.f49187e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM39142a = m39142a(EnumC16377d2.f62971w);
        this.f49187e = edgeEffectM39142a;
        return edgeEffectM39142a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m39144c() {
        EdgeEffect edgeEffect = this.f49188f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM39142a = m39142a(EnumC16377d2.f62972x);
        this.f49188f = edgeEffectM39142a;
        return edgeEffectM39142a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m39145d() {
        EdgeEffect edgeEffect = this.f49189g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM39142a = m39142a(EnumC16377d2.f62972x);
        this.f49189g = edgeEffectM39142a;
        return edgeEffectM39142a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m39146e() {
        EdgeEffect edgeEffect = this.f49186d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM39142a = m39142a(EnumC16377d2.f62971w);
        this.f49186d = edgeEffectM39142a;
        return edgeEffectM39142a;
    }
}
