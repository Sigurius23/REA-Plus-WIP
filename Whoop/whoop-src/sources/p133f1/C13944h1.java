package p133f1;

import androidx.compose.foundation.text.contextmenu.modifier.AbstractC1113a;
import l83.C23454a0;
import p025b1.C2214e;
import p181h2.C16618c;
import p268k0.AbstractC22086a;
import p294l3.C23283u0;
import p412q3.InterfaceC29884r;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p635y2.InterfaceC39147y;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f1.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13944h1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49710w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13977s1 f49711x;

    public /* synthetic */ C13944h1(C13977s1 c13977s1, int i13) {
        this.f49710w = i13;
        this.f49711x = c13977s1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C16618c c16618c;
        char c3;
        float fIntBitsToFloat;
        InterfaceC39147y interfaceC39147yM108661c;
        InterfaceC39147y interfaceC39147yM108661c2;
        InterfaceC39147y interfaceC39147yM108661c3;
        InterfaceC39147y interfaceC39147yM108661c4;
        int i13 = this.f49710w;
        C13977s1 c13977s1 = this.f49711x;
        switch (i13) {
            case 0:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) obj;
                C34354s0 c34354s0 = c13977s1.f49848d;
                if (c34354s0 == null) {
                    c16618c = C16618c.f63938e;
                } else {
                    if (c34354s0.f144322p) {
                        c34354s0 = null;
                    }
                    if (c34354s0 != null) {
                        InterfaceC29884r interfaceC29884r = c13977s1.f49846b;
                        long j7 = c13977s1.m39783m().f122126b;
                        int i14 = C23283u0.f92252c;
                        int iMo15749x = interfaceC29884r.mo15749x((int) (j7 >> 32));
                        int iMo15749x2 = c13977s1.f49846b.mo15749x((int) (c13977s1.m39783m().f122126b & 4294967295L));
                        C34354s0 c34354s1 = c13977s1.f49848d;
                        long jMo3523Z = 0;
                        long jMo3523Z2 = (c34354s1 == null || (interfaceC39147yM108661c4 = c34354s1.m108661c()) == null) ? 0L : interfaceC39147yM108661c4.mo3523Z(c13977s1.m39781k(true));
                        C34354s0 c34354s2 = c13977s1.f49848d;
                        if (c34354s2 != null && (interfaceC39147yM108661c3 = c34354s2.m108661c()) != null) {
                            jMo3523Z = interfaceC39147yM108661c3.mo3523Z(c13977s1.m39781k(false));
                        }
                        C34354s0 c34354s3 = c13977s1.f49848d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (c34354s3 == null || (interfaceC39147yM108661c2 = c34354s3.m108661c()) == null) {
                            c3 = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            C34346p1 c34346p1M108662d = c34354s0.m108662d();
                            c3 = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC39147yM108661c2.mo3523Z((((long) Float.floatToRawIntBits(c34346p1M108662d != null ? c34346p1M108662d.f144282a.m67334c(iMo15749x).f63940b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        C34354s0 c34354s4 = c13977s1.f49848d;
                        if (c34354s4 != null && (interfaceC39147yM108661c = c34354s4.m108661c()) != null) {
                            C34346p1 c34346p1M108662d2 = c34354s0.m108662d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC39147yM108661c.mo3523Z((((long) Float.floatToRawIntBits(0.0f)) << c3) | (((long) Float.floatToRawIntBits(c34346p1M108662d2 != null ? c34346p1M108662d2.f144282a.m67334c(iMo15749x2).f63940b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i15 = (int) (jMo3523Z2 >> c3);
                        int i16 = (int) (jMo3523Z >> c3);
                        c16618c = new C16618c(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), (c34354s0.f144307a.f144066g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (jMo3523Z2 & 4294967295L)), Float.intBitsToFloat((int) (jMo3523Z & 4294967295L))));
                    } else {
                        c16618c = C16618c.f63938e;
                    }
                }
                C34354s0 c34354s5 = c13977s1.f49848d;
                InterfaceC39147y interfaceC39147yM108661c5 = c34354s5 != null ? c34354s5.m108661c() : null;
                if (interfaceC39147yM108661c5 != null) {
                    return AbstractC1113a.m3453d(c16618c, interfaceC39147yM108661c5, interfaceC39147y);
                }
                AbstractC22086a.m63161d("Required value was null.");
                throw new KotlinNothingValueException();
            case 1:
                return new C2214e(c13977s1, 12);
            default:
                c13977s1.m39787q();
                return C23454a0.f92919a;
        }
    }
}
