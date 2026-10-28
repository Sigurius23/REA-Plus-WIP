package rm1;

import p390p1.InterfaceC28670t2;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rm1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0004\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001b\u0010\u0005\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\fR\u001b\u0010\u0007\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lrm1/a;", "", "Lp1/t2;", "", "alpha", "scale", "Ly3/f;", "xOffset", "<init>", "(Lp1/t2;Lp1/t2;Lp1/t2;)V", "a", "Lp1/t2;", "()F", "b", "c", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31587a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28670t2 alpha;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28670t2 scale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28670t2 xOffset;

    public C31587a(InterfaceC28670t2 alpha, InterfaceC28670t2 scale, InterfaceC28670t2 xOffset) {
        AbstractC22676k.m65750j(alpha, "alpha");
        AbstractC22676k.m65750j(scale, "scale");
        AbstractC22676k.m65750j(xOffset, "xOffset");
        this.alpha = alpha;
        this.scale = scale;
        this.xOffset = xOffset;
    }

    /* JADX INFO: renamed from: a */
    public final float m97371a() {
        return ((Number) this.alpha.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: b */
    public final float m97372b() {
        return ((Number) this.scale.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: c */
    public final float m97373c() {
        return ((C39174f) this.xOffset.getValue()).f168413w;
    }
}
