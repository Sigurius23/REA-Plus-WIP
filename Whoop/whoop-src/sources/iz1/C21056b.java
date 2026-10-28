package iz1;

import gz1.InterfaceC16331b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Liz1/b;", "", "Liz1/e;", "session", "Lgz1/b;", "detection", "<init>", "(Liz1/e;Lgz1/b;)V", "a", "(Liz1/e;Lgz1/b;)Liz1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liz1/e;", "d", "()Liz1/e;", "b", "Lgz1/b;", "c", "()Lgz1/b;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21056b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21059e session;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC16331b detection;

    public C21056b(EnumC21059e session, InterfaceC16331b detection) {
        AbstractC22676k.m65750j(session, "session");
        AbstractC22676k.m65750j(detection, "detection");
        this.session = session;
        this.detection = detection;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21056b m58898b(C21056b c21056b, EnumC21059e enumC21059e, InterfaceC16331b interfaceC16331b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC21059e = c21056b.session;
        }
        if ((i13 & 2) != 0) {
            interfaceC16331b = c21056b.detection;
        }
        return c21056b.m58899a(enumC21059e, interfaceC16331b);
    }

    /* JADX INFO: renamed from: a */
    public final C21056b m58899a(EnumC21059e session, InterfaceC16331b detection) {
        AbstractC22676k.m65750j(session, "session");
        AbstractC22676k.m65750j(detection, "detection");
        return new C21056b(session, detection);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC16331b getDetection() {
        return this.detection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC21059e getSession() {
        return this.session;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21056b)) {
            return false;
        }
        C21056b c21056b = (C21056b) other;
        return this.session == c21056b.session && AbstractC22676k.m65745e(this.detection, c21056b.detection);
    }

    public int hashCode() {
        return this.detection.hashCode() + (this.session.hashCode() * 31);
    }

    public String toString() {
        return "MotionTrackingSandboxDomainState(session=" + this.session + ", detection=" + this.detection + ")";
    }

    public /* synthetic */ C21056b(EnumC21059e enumC21059e, InterfaceC16331b interfaceC16331b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC21059e.IDLE : enumC21059e, (i13 & 2) != 0 ? InterfaceC16331b.a.f62836a : interfaceC16331b);
    }
}
