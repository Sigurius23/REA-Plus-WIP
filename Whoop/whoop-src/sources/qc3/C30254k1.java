package qc3;

import kotlinx.datetime.YearMonth;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.C32390d;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.k1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30254k1 extends AbstractC30222a {

    /* JADX INFO: renamed from: a */
    public final C32390d f123796a;

    public C30254k1(C32390d c32390d) {
        this.f123796a = c32390d;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: a */
    public final C32390d mo92497a() {
        return this.f123796a;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: b */
    public final InterfaceC34764b mo92498b() {
        return AbstractC30257l1.f123798a;
    }

    @Override // qc3.AbstractC30222a
    /* JADX INFO: renamed from: d */
    public final Object mo92500d(InterfaceC34764b interfaceC34764b) {
        C30278w intermediate = (C30278w) interfaceC34764b;
        AbstractC22676k.m65750j(intermediate, "intermediate");
        Integer num = intermediate.f123834a;
        AbstractC30257l1.m92518a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = intermediate.f123835b;
        AbstractC30257l1.m92518a(num2, "monthNumber");
        return new YearMonth(iIntValue, num2.intValue());
    }
}
