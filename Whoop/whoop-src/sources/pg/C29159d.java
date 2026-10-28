package pg;

import fg3.InterfaceC14474b;
import ig3.InterfaceC18475a;
import la.C23548b;
import p004a2.AbstractC0152a;
import p368og.EnumC27905b;
import p368og.InterfaceC27908e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pg.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29159d extends AbstractC0152a {
    public C29159d(InterfaceC14474b interfaceC14474b) {
        super(interfaceC14474b, 5);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020 A[PHI: r3
      0x0020: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:5:0x000e, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: g */
    public final InterfaceC27908e mo44899g(EnumC27905b enumC27905b) {
        InterfaceC14474b interfaceC14474b = (InterfaceC14474b) this.f475x;
        int iOrdinal = enumC27905b.ordinal();
        int i13 = 1;
        if (iOrdinal != 0) {
            int i14 = 2;
            if (iOrdinal != 1) {
                i13 = 3;
                if (iOrdinal != 2) {
                    i14 = 4;
                    if (iOrdinal == 3) {
                        i13 = i14;
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i13 = 5;
                    }
                }
            } else {
                i13 = i14;
            }
        }
        InterfaceC18475a interfaceC18475aMo41321g = interfaceC14474b.mo41321g(i13);
        AbstractC22676k.m65749i(interfaceC18475aMo41321g, "atLevel(...)");
        return new C23548b(interfaceC18475aMo41321g, 24);
    }
}
