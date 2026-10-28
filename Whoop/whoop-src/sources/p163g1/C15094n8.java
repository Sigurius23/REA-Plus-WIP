package p163g1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c51.C4222a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p181h2.C16620e;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.n8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15094n8 implements InterfaceC4354p {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f56524E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f56525F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4351m f56526G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4351m f56527H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC17869a1 f56528I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ EnumC14967b9 f56529J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC4351m f56530K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ boolean f56531L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC22973k1 f56532M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ boolean f56533N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC4351m f56534O;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4351m f56535w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f56536x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f56537y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC14999e8 f56538z;

    public C15094n8(InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, String str, InterfaceC14999e8 interfaceC14999e8, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, InterfaceC17869a1 interfaceC17869a1, EnumC14967b9 enumC14967b9, InterfaceC4351m interfaceC4351m5, boolean z14, InterfaceC22973k1 interfaceC22973k1, boolean z15, InterfaceC4351m interfaceC4351m6) {
        this.f56535w = interfaceC4351m;
        this.f56536x = interfaceC4351m2;
        this.f56537y = str;
        this.f56538z = interfaceC14999e8;
        this.f56524E = z4;
        this.f56525F = z13;
        this.f56526G = interfaceC4351m3;
        this.f56527H = interfaceC4351m4;
        this.f56528I = interfaceC17869a1;
        this.f56529J = enumC14967b9;
        this.f56530K = interfaceC4351m5;
        this.f56531L = z14;
        this.f56532M = interfaceC22973k1;
        this.f56533N = z15;
        this.f56534O = interfaceC4351m6;
    }

    @Override // c93.InterfaceC4354p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i13;
        C28655q c28655q;
        C37816b c37816b;
        boolean z4;
        C37816b c37816bM121344e;
        C37816b c37816bM121344e2;
        float fFloatValue = ((Number) obj).floatValue();
        long j7 = ((C17919x) obj2).f69639a;
        long j13 = ((C17919x) obj3).f69639a;
        float fFloatValue2 = ((Number) obj4).floatValue();
        Composer composer = (Composer) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i13 = (((C28655q) composer).m87147d(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i13 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i13 |= ((C28655q) composer).m87151f(j7) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i13 |= ((C28655q) composer).m87151f(j13) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i13 |= ((C28655q) composer).m87147d(fFloatValue2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i14 = i13;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C37816b c37816bM121344e3 = null;
            InterfaceC4351m interfaceC4351m = this.f56535w;
            if (interfaceC4351m == null) {
                c28655q2.m87150e0(986681709);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                c37816b = null;
            } else {
                c28655q2.m87150e0(986681710);
                c28655q = c28655q2;
                C15064k8 c15064k8 = new C15064k8(fFloatValue, j13, interfaceC4351m, this.f56533N, j7, 0);
                fFloatValue = fFloatValue;
                C37816b c37816bM121344e4 = AbstractC37817c.m121344e(723429411, c28655q, c15064k8);
                c28655q.m87173q(false);
                c37816b = c37816bM121344e4;
            }
            boolean z13 = this.f56524E;
            InterfaceC4351m interfaceC4351m2 = this.f56536x;
            InterfaceC14999e8 interfaceC14999e8 = this.f56538z;
            if (interfaceC4351m2 == null || this.f56537y.length() != 0 || fFloatValue2 <= 0.0f) {
                z4 = z13;
                c28655q.m87150e0(988093542);
                c28655q.m87173q(false);
                c37816bM121344e = null;
            } else {
                c28655q.m87150e0(987666549);
                C15084m8 c15084m8 = new C15084m8(fFloatValue2, interfaceC14999e8, z13, interfaceC4351m2, 0);
                z4 = z13;
                c37816bM121344e = AbstractC37817c.m121344e(-426706263, c28655q, c15084m8);
                c28655q.m87173q(false);
            }
            C15197y1 c15197y1 = (C15197y1) interfaceC14999e8;
            boolean z14 = this.f56525F;
            long j14 = ((C17919x) c15197y1.m43217d(z4, z14, c28655q).getValue()).f69639a;
            InterfaceC4351m interfaceC4351m3 = this.f56526G;
            if (interfaceC4351m3 == null) {
                c28655q.m87150e0(988282301);
                c28655q.m87173q(false);
                c37816bM121344e2 = null;
            } else {
                c28655q.m87150e0(988282302);
                c37816bM121344e2 = AbstractC37817c.m121344e(-317090443, c28655q, new C15074l8(j14, interfaceC4351m3, 0));
                c28655q.m87173q(false);
            }
            long j15 = ((C17919x) c15197y1.m43219f(z4, z14, c28655q).getValue()).f69639a;
            InterfaceC4351m interfaceC4351m4 = this.f56527H;
            if (interfaceC4351m4 == null) {
                c28655q.m87150e0(988575964);
            } else {
                c28655q.m87150e0(988575965);
                c37816bM121344e3 = AbstractC37817c.m121344e(262889693, c28655q, new C15074l8(j15, interfaceC4351m4, 1));
            }
            c28655q.m87173q(false);
            Modifier modifierM3358c = AbstractC1092a.m3358c(C2314t.f9131w, ((C17919x) c15197y1.m43214a(c28655q).getValue()).f69639a, this.f56528I);
            int iOrdinal = this.f56529J.ordinal();
            if (iOrdinal == 0) {
                c28655q.m87150e0(988856360);
                AbstractC15164u8.m43194c(modifierM3358c, this.f56530K, c37816b, c37816bM121344e, c37816bM121344e2, c37816bM121344e3, this.f56531L, fFloatValue, this.f56532M, c28655q, (i14 << 21) & 29360128);
                c28655q.m87173q(false);
            } else {
                if (iOrdinal != 1) {
                    throw AbstractC11895b.m32003v(1971561250, c28655q, false);
                }
                c28655q.m87150e0(989436742);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C16620e(0L));
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C37816b c37816bM121344e5 = AbstractC37817c.m121344e(-1107746014, c28655q, new C15001f(interfaceC28601c1, this.f56532M, this.f56534O));
                boolean z15 = (i14 & 14) == 4;
                Object objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C4222a(fFloatValue, interfaceC28601c1, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC15050j4.m43137c(modifierM3358c, this.f56530K, c37816bM121344e, c37816b, c37816bM121344e2, c37816bM121344e3, this.f56531L, fFloatValue, (Function1) objM87133R2, c37816bM121344e5, this.f56532M, c28655q, ((i14 << 21) & 29360128) | 805306368);
                c28655q.m87173q(false);
            }
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }
}
