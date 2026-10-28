package nb1;

import l83.C23465k;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: nb1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00158\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u001a"}, m65681d2 = {"Lnb1/b;", "", "<init>", "()V", "Li2/x;", "b", "J", "getTransparent-0d7_KjU", "()J", "transparent", "Li2/t;", "c", "Li2/t;", "a", "()Li2/t;", "centerShadowBrush", "Ly3/f;", "d", "F", "()F", "radius", "", "e", "particleSpeedFactor", "f", "particleSizeFactor", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26538b {

    /* JADX INFO: renamed from: a */
    public static final C26538b f105478a = new C26538b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long transparent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final AbstractC17911t centerShadowBrush;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float radius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float particleSpeedFactor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float particleSizeFactor;

    static {
        long jM51518f = AbstractC17918w0.m51518f(0.0f, 0.0f, 0.0f, 0.0f, 16);
        transparent = jM51518f;
        centerShadowBrush = C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(jM51518f)), new C23465k(Float.valueOf(1.0f), new C17919x(jM51518f))}, 0L, 0.0f, 14);
        radius = 28;
        particleSpeedFactor = 0.18f;
        particleSizeFactor = 0.15f;
    }

    private C26538b() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC17911t m78636a() {
        return centerShadowBrush;
    }

    /* JADX INFO: renamed from: b */
    public final float m78637b() {
        return particleSizeFactor;
    }

    /* JADX INFO: renamed from: c */
    public final float m78638c() {
        return particleSpeedFactor;
    }

    /* JADX INFO: renamed from: d */
    public final float m78639d() {
        return radius;
    }
}
