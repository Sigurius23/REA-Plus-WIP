package w23;

import bc3.C2996c2;
import bc3.InterfaceC3027k1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x23.EnumC37870f;

/* JADX INFO: renamed from: w23.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C36759q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3027k1 f157316a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3027k1 f157317b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3027k1 f157318c;

    /* JADX INFO: renamed from: d */
    public final EnumC37870f f157319d;

    /* JADX INFO: renamed from: e */
    public final EnumC37870f f157320e;

    public C36759q(InterfaceC3027k1 interfaceC3027k1, InterfaceC3027k1 interfaceC3027k2, InterfaceC3027k1 interfaceC3027k3, EnumC37870f publisherStage, EnumC37870f subscriberStage) {
        AbstractC22676k.m65750j(publisherStage, "publisherStage");
        AbstractC22676k.m65750j(subscriberStage, "subscriberStage");
        this.f157316a = interfaceC3027k1;
        this.f157317b = interfaceC3027k2;
        this.f157318c = interfaceC3027k3;
        this.f157319d = publisherStage;
        this.f157320e = subscriberStage;
    }

    /* JADX INFO: renamed from: a */
    public static C36759q m117872a(C36759q c36759q, InterfaceC3027k1 interfaceC3027k1, C2996c2 c2996c2, C2996c2 c2996c3, EnumC37870f enumC37870f, EnumC37870f enumC37870f2, int i13) {
        if ((i13 & 1) != 0) {
            interfaceC3027k1 = c36759q.f157316a;
        }
        InterfaceC3027k1 interfaceC3027k2 = interfaceC3027k1;
        InterfaceC3027k1 interfaceC3027k3 = c2996c2;
        if ((i13 & 2) != 0) {
            interfaceC3027k3 = c36759q.f157317b;
        }
        InterfaceC3027k1 interfaceC3027k4 = interfaceC3027k3;
        InterfaceC3027k1 interfaceC3027k5 = c2996c3;
        if ((i13 & 4) != 0) {
            interfaceC3027k5 = c36759q.f157318c;
        }
        InterfaceC3027k1 interfaceC3027k6 = interfaceC3027k5;
        if ((i13 & 8) != 0) {
            enumC37870f = c36759q.f157319d;
        }
        EnumC37870f publisherStage = enumC37870f;
        if ((i13 & 16) != 0) {
            enumC37870f2 = c36759q.f157320e;
        }
        EnumC37870f subscriberStage = enumC37870f2;
        c36759q.getClass();
        AbstractC22676k.m65750j(publisherStage, "publisherStage");
        AbstractC22676k.m65750j(subscriberStage, "subscriberStage");
        return new C36759q(interfaceC3027k2, interfaceC3027k4, interfaceC3027k6, publisherStage, subscriberStage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36759q)) {
            return false;
        }
        C36759q c36759q = (C36759q) obj;
        return AbstractC22676k.m65745e(this.f157316a, c36759q.f157316a) && AbstractC22676k.m65745e(this.f157317b, c36759q.f157317b) && AbstractC22676k.m65745e(this.f157318c, c36759q.f157318c) && this.f157319d == c36759q.f157319d && this.f157320e == c36759q.f157320e;
    }

    public final int hashCode() {
        InterfaceC3027k1 interfaceC3027k1 = this.f157316a;
        int iHashCode = (interfaceC3027k1 == null ? 0 : interfaceC3027k1.hashCode()) * 31;
        InterfaceC3027k1 interfaceC3027k2 = this.f157317b;
        int iHashCode2 = (iHashCode + (interfaceC3027k2 == null ? 0 : interfaceC3027k2.hashCode())) * 31;
        InterfaceC3027k1 interfaceC3027k3 = this.f157318c;
        return this.f157320e.hashCode() + ((this.f157319d.hashCode() + ((iHashCode2 + (interfaceC3027k3 != null ? interfaceC3027k3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PeerConnectionAnalyticsState(peerConnectionObserverJob=" + this.f157316a + ", publisherJob=" + this.f157317b + ", subscriberJob=" + this.f157318c + ", publisherStage=" + this.f157319d + ", subscriberStage=" + this.f157320e + ")";
    }
}
