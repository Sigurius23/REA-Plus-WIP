package p292l1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i93.C18284j;
import java.io.IOException;
import java.io.Serializable;
import l83.C23454a0;
import ne3.C26621j0;
import oe3.C27890j;
import p316m1.AbstractC24917o;
import p390p1.AbstractC28683x;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: l1.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23103h0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f91229E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f91230F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f91231G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f91232H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f91233I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f91234J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91235w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f91236x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Serializable f91237y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f91238z;

    public /* synthetic */ C23103h0(Long l7, long j7, Function1 function1, Function1 function2, AbstractC24917o abstractC24917o, C18284j c18284j, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y, int i13) {
        this.f91237y = l7;
        this.f91236x = j7;
        this.f91238z = function1;
        this.f91229E = function2;
        this.f91230F = abstractC24917o;
        this.f91231G = c18284j;
        this.f91232H = c23085e0;
        this.f91233I = interfaceC23142n3;
        this.f91234J = c23204y;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f91235w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC23092f1.m67069c((Long) this.f91237y, this.f91236x, (Function1) this.f91238z, (Function1) this.f91229E, (AbstractC24917o) this.f91230F, (C18284j) this.f91231G, (C23085e0) this.f91232H, (InterfaceC23142n3) this.f91233I, (C23204y) this.f91234J, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            default:
                C22659b0 c22659b0 = (C22659b0) this.f91237y;
                C22667f0 c22667f0 = (C22667f0) this.f91238z;
                C26621j0 c26621j0 = (C26621j0) this.f91229E;
                C22667f0 c22667f1 = (C22667f0) this.f91230F;
                C22667f0 c22667f2 = (C22667f0) this.f91231G;
                C22669g0 c22669g0 = (C22669g0) this.f91232H;
                C22669g0 c22669g1 = (C22669g0) this.f91233I;
                C22669g0 c22669g2 = (C22669g0) this.f91234J;
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 1) {
                    if (iIntValue == 10) {
                        if (jLongValue < 4) {
                            throw new IOException("bad zip: NTFS extra too short");
                        }
                        c26621j0.skip(4L);
                        AbstractC35785b.m113393P(c26621j0, (int) (jLongValue - 4), new C27890j(c22669g0, c26621j0, c22669g1, c22669g2));
                    }
                } else {
                    if (c22659b0.f89329w) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    c22659b0.f89329w = true;
                    if (jLongValue < this.f91236x) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    long jMo79204e0 = c22667f0.f89335w;
                    if (jMo79204e0 == 4294967295L) {
                        jMo79204e0 = c26621j0.mo79204e0();
                    }
                    c22667f0.f89335w = jMo79204e0;
                    c22667f1.f89335w = c22667f1.f89335w == 4294967295L ? c26621j0.mo79204e0() : 0L;
                    c22667f2.f89335w = c22667f2.f89335w == 4294967295L ? c26621j0.mo79204e0() : 0L;
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C23103h0(C22659b0 c22659b0, long j7, C22667f0 c22667f0, C26621j0 c26621j0, C22667f0 c22667f1, C22667f0 c22667f2, C22669g0 c22669g0, C22669g0 c22669g1, C22669g0 c22669g2) {
        this.f91237y = c22659b0;
        this.f91236x = j7;
        this.f91238z = c22667f0;
        this.f91229E = c26621j0;
        this.f91230F = c22667f1;
        this.f91231G = c22667f2;
        this.f91232H = c22669g0;
        this.f91233I = c22669g1;
        this.f91234J = c22669g2;
    }
}
