package i40;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p163g1.C15064k8;
import p163g1.C15074l8;
import p163g1.C15084m8;
import p163g1.C15197y1;
import p163g1.InterfaceC14999e8;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.C22976l1;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p602x1.C37816b;

/* JADX INFO: renamed from: i40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C18072f implements InterfaceC4354p {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f70237E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f70238F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4351m f70239G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4351m f70240H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC17869a1 f70241I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C37816b f70242J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean f70243K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C22976l1 f70244L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean f70245M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4351m f70246w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f70247x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f70248y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC14999e8 f70249z;

    public C18072f(InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, String str, InterfaceC14999e8 interfaceC14999e8, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, InterfaceC17869a1 interfaceC17869a1, C37816b c37816b, boolean z14, C22976l1 c22976l1, boolean z15) {
        this.f70246w = interfaceC4351m;
        this.f70247x = interfaceC4351m2;
        this.f70248y = str;
        this.f70249z = interfaceC14999e8;
        this.f70237E = z4;
        this.f70238F = z13;
        this.f70239G = interfaceC4351m3;
        this.f70240H = interfaceC4351m4;
        this.f70241I = interfaceC17869a1;
        this.f70242J = c37816b;
        this.f70243K = z14;
        this.f70244L = c22976l1;
        this.f70245M = z15;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x008c, please report this as an issue */
    @Override // c93.InterfaceC4354p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i13;
        C28655q c28655q;
        InterfaceC4351m interfaceC4351m;
        float f13;
        C37816b c37816bM121344e;
        boolean z4;
        InterfaceC4351m interfaceC4351m2;
        boolean z13;
        C37816b c37816bM121344e2;
        long j7;
        InterfaceC4351m interfaceC4351m3;
        C37816b c37816bM121344e3;
        float fFloatValue = ((Number) obj).floatValue();
        long j13 = ((C17919x) obj2).f69639a;
        long j14 = ((C17919x) obj3).f69639a;
        float fFloatValue2 = ((Number) obj4).floatValue();
        Composer composer = (Composer) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i13 = (((C28655q) composer).m87147d(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i13 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i13 |= ((C28655q) composer).m87151f(j13) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i13 |= ((C28655q) composer).m87151f(j14) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i13 |= ((C28655q) composer).m87147d(fFloatValue2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i14 = i13;
        if ((i14 & 9363) == 9362) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-914106855);
                interfaceC4351m = this.f70246w;
                if (interfaceC4351m == null) {
                    f13 = fFloatValue;
                    c37816bM121344e = null;
                } else {
                    f13 = fFloatValue;
                    c37816bM121344e = AbstractC37817c.m121344e(-424665208, c28655q, new C15064k8(f13, j14, interfaceC4351m, this.f70245M, j13, 1));
                }
                c28655q.m87173q(false);
                c28655q.m87150e0(-914084376);
                z4 = this.f70237E;
                interfaceC4351m2 = this.f70247x;
                InterfaceC14999e8 interfaceC14999e8 = this.f70249z;
                if (interfaceC4351m2 == null && this.f70248y.length() == 0 && fFloatValue2 > 0.0f) {
                    C15084m8 c15084m8 = new C15084m8(fFloatValue2, interfaceC14999e8, z4, interfaceC4351m2, 1);
                    z13 = z4;
                    c37816bM121344e2 = AbstractC37817c.m121344e(154418702, c28655q, c15084m8);
                } else {
                    z13 = z4;
                    c37816bM121344e2 = null;
                }
                c28655q.m87173q(false);
                C15197y1 c15197y1 = (C15197y1) interfaceC14999e8;
                boolean z14 = this.f70238F;
                j7 = ((C17919x) c15197y1.m43217d(z13, z14, c28655q).getValue()).f69639a;
                c28655q.m87150e0(-914061229);
                interfaceC4351m3 = this.f70239G;
                if (interfaceC4351m3 == null) {
                    c37816bM121344e3 = null;
                } else {
                    c37816bM121344e3 = AbstractC37817c.m121344e(704901338, c28655q, new C15074l8(j7, interfaceC4351m3, 2));
                }
                c28655q.m87173q(false);
                long j15 = ((C17919x) c15197y1.m43219f(z13, z14, c28655q).getValue()).f69639a;
                c28655q.m87150e0(-914051500);
                InterfaceC4351m interfaceC4351m4 = this.f70240H;
                C37816b c37816bM121344e4 = interfaceC4351m4 != null ? AbstractC37817c.m121344e(-1742107582, c28655q, new C15074l8(j15, interfaceC4351m4, 3)) : null;
                c28655q.m87173q(false);
                AbstractC18076j.m51913a(AbstractC1092a.m3358c(C2314t.f9131w, ((C17919x) c15197y1.m43214a(c28655q).getValue()).f69639a, this.f70241I), this.f70242J, c37816bM121344e, c37816bM121344e2, c37816bM121344e3, c37816bM121344e4, this.f70243K, f13, this.f70244L, c28655q, (i14 << 21) & 29360128);
            }
        } else {
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-914106855);
            interfaceC4351m = this.f70246w;
            if (interfaceC4351m == null) {
                f13 = fFloatValue;
                c37816bM121344e = null;
            } else {
                f13 = fFloatValue;
                c37816bM121344e = AbstractC37817c.m121344e(-424665208, c28655q, new C15064k8(f13, j14, interfaceC4351m, this.f70245M, j13, 1));
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-914084376);
            z4 = this.f70237E;
            interfaceC4351m2 = this.f70247x;
            InterfaceC14999e8 interfaceC14999e9 = this.f70249z;
            if (interfaceC4351m2 == null) {
                z13 = z4;
                c37816bM121344e2 = null;
            } else {
                z13 = z4;
                c37816bM121344e2 = null;
            }
            c28655q.m87173q(false);
            C15197y1 c15197y2 = (C15197y1) interfaceC14999e9;
            boolean z15 = this.f70238F;
            j7 = ((C17919x) c15197y2.m43217d(z13, z15, c28655q).getValue()).f69639a;
            c28655q.m87150e0(-914061229);
            interfaceC4351m3 = this.f70239G;
            if (interfaceC4351m3 == null) {
                c37816bM121344e3 = null;
            } else {
                c37816bM121344e3 = AbstractC37817c.m121344e(704901338, c28655q, new C15074l8(j7, interfaceC4351m3, 2));
            }
            c28655q.m87173q(false);
            long j16 = ((C17919x) c15197y2.m43219f(z13, z15, c28655q).getValue()).f69639a;
            c28655q.m87150e0(-914051500);
            InterfaceC4351m interfaceC4351m5 = this.f70240H;
            C37816b c37816bM121344e5 = interfaceC4351m5 != null ? AbstractC37817c.m121344e(-1742107582, c28655q, new C15074l8(j16, interfaceC4351m5, 3)) : null;
            c28655q.m87173q(false);
            AbstractC18076j.m51913a(AbstractC1092a.m3358c(C2314t.f9131w, ((C17919x) c15197y2.m43214a(c28655q).getValue()).f69639a, this.f70241I), this.f70242J, c37816bM121344e, c37816bM121344e2, c37816bM121344e3, c37816bM121344e5, this.f70243K, f13, this.f70244L, c28655q, (i14 << 21) & 29360128);
        }
        return C23454a0.f92919a;
    }
}
