package p635y2;

import io.sentry.config.AbstractC20301a;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y2.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39073a1 implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39151z0 f168118a;

    public C39073a1(InterfaceC39151z0 interfaceC39151z0) {
        this.f168118a = interfaceC39151z0;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        return this.f168118a.mo43536a(interfaceC39133t0, AbstractC20301a.m56302A(interfaceC39133t0), j7);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return this.f168118a.mo66766b(interfaceC39126r, AbstractC20301a.m56302A(interfaceC39126r), i13);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return this.f168118a.mo66767c(interfaceC39126r, AbstractC20301a.m56302A(interfaceC39126r), i13);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return this.f168118a.mo66768d(interfaceC39126r, AbstractC20301a.m56302A(interfaceC39126r), i13);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        return this.f168118a.mo66769e(interfaceC39126r, AbstractC20301a.m56302A(interfaceC39126r), i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39073a1) && AbstractC22676k.m65745e(this.f168118a, ((C39073a1) obj).f168118a);
    }

    public final int hashCode() {
        return this.f168118a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f168118a + ')';
    }
}
