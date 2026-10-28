package qc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.AbstractC29097s;
import sc3.C32390d;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30285z0 extends AbstractC30222a {

    /* JADX INFO: renamed from: a */
    public final C32390d f123847a;

    public C30285z0(C32390d c32390d) {
        this.f123847a = c32390d;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: a */
    public final C32390d mo92497a() {
        return this.f123847a;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: b */
    public final InterfaceC34764b mo92498b() {
        return AbstractC30224a1.f123764d;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: d */
    public final Object mo92500d(InterfaceC34764b interfaceC34764b) {
        C30276v intermediate = (C30276v) interfaceC34764b;
        AbstractC22676k.m65750j(intermediate, "intermediate");
        int i13 = AbstractC22676k.m65745e(intermediate.f123829a, Boolean.TRUE) ? -1 : 1;
        Integer num = intermediate.f123830b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i13) : null;
        Integer num2 = intermediate.f123831c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i13) : null;
        Integer num3 = intermediate.f123832d;
        return AbstractC29097s.m88411a(numValueOf, numValueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i13) : null);
    }
}
