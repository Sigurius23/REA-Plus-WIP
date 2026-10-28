package b30;

import a13.C0150h;
import a20.C0162b;
import a31.C0343e;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1910d;
import ar2.C1935f;
import b01.C2185f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d40.C11666k;
import d40.C11671p;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p000.C12473e;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p025b1.C2217h;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2399k2;
import p040c0.AbstractC3760m1;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p097ds.AbstractC12314q;
import p108e4.AbstractC12667a;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15047j1;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p291l0.EnumC22935a1;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p392p3.AbstractC28771i;
import p392p3.C28780r;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.c4 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2495c4 {

    /* JADX INFO: renamed from: a */
    public static final C3756l0 f9723a = AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(100, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(100, 90, null, 4), 2));

    /* JADX INFO: renamed from: a */
    public static final void m7454a(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1926897466);
        if ((((c28655q.m87157i(interfaceC4339a) ? 32 : 16) | i13) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            c28655q.m87150e0(2016761205);
            Object objM87133R = c28655q.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM94759h = AbstractC30802r.m94759h(2016763554, c28655q, false);
            if (objM94759h == obj) {
                objM94759h = AbstractC11266d.m30468v(zBooleanValue ? 0.0f : 1.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) objM94759h;
            c28655q.m87173q(false);
            float fM87022x = ((C28617g1) interfaceC28690z0).m87022x();
            c28655q.m87150e0(2016774288);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = new C1910d(5, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(fM87022x, null, "CheckmarkAnimation", (Function1) objM87133R2, c28655q, 27648, 6);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(interfaceC4339a, c28655q);
            InterfaceC30057d interfaceC30057d = null;
            if (zBooleanValue) {
                c28655q.m87150e0(-1903881302);
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) interfaceC28601c1M87238F.getValue();
                c28655q.m87150e0(2016796124);
                boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == obj) {
                    objM87133R3 = new C0150h(interfaceC28601c1M87238F, interfaceC30057d, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, interfaceC4339a2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1904246327);
                c28655q.m87150e0(2016783401);
                Object objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C0162b(interfaceC28690z0, interfaceC30057d, 10);
                    c28655q.m87172p0(objM87133R4);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                Boolean bool = (Boolean) interfaceC28601c1.getValue();
                bool.booleanValue();
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) interfaceC28601c1M87238F.getValue();
                c28655q.m87150e0(2016788968);
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g2 || objM87133R5 == obj) {
                    objM87133R5 = new C12473e((InterfaceC28670t2) interfaceC28601c1, (Object) interfaceC28601c1M87238F, interfaceC30057d, 21);
                    c28655q.m87172p0(objM87133R5);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87254h(bool, interfaceC4339a3, (InterfaceC4351m) objM87133R5, c28655q);
                c28655q.m87173q(false);
            }
            m7460g(C1100b.f4583a.mo3400a(C2314t.f9131w, new C2307m(((Number) interfaceC28670t2M30588b.getValue()).floatValue(), 0.0f)), c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2662y3(i13, 0, interfaceC4339a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7455b(String str, InterfaceC2527g4 interfaceC2527g4, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1287945468);
        int i14 = (c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87153g(str) ? 4 : 2) | i13 | (c28655q.m87153g(interfaceC2527g4) ? 32 : 16) | (c28655q.m87155h(z4) ? 256 : 128) | (c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int i15 = i14 >> 3;
            m7456c(interfaceC2527g4, z4, AbstractC37817c.m121344e(255009407, c28655q, new C2669z3(z4, interfaceC4339a, interfaceC2527g4, str, z13)), c28655q, (i15 & 112) | (i15 & 14) | 384);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2655x3(str, interfaceC2527g4, z4, z13, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7456c(InterfaceC2527g4 interfaceC2527g4, boolean z4, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-30493128);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC2527g4) : c28655q.m87157i(interfaceC2527g4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            boolean z13 = interfaceC2527g4 instanceof C2503d4;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), EnumC22935a1.f90538x);
            if (z4) {
                c28655q.m87150e0(-408399511);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c37816b.invoke(Boolean.valueOf(z13), c28655q, Integer.valueOf((i14 >> 3) & 112));
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-408299908);
                Boolean boolValueOf = Boolean.valueOf(z13);
                c28655q.m87150e0(-1260092975);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C2185f(20);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC1089a.m3344b(boolValueOf, modifierM3388j, (Function1) objM87133R, null, "ContentAnimation", null, AbstractC37817c.m121344e(1130681137, c28655q, new C2479a4(c37816b, 0)), c28655q, 1597872, 40);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(interfaceC2527g4, z4, c37816b, i13, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0191  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x0207  */
    /* JADX WARN: Code duplicated, block: B:123:0x021c  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x0276  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3 A[PHI: r0 r6
      0x00e3: PHI (r0v25 b30.g4) = (r0v1 b30.g4), (r0v0 b30.g4) binds: [B:83:0x00f3, B:76:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r6v8 androidx.compose.ui.Modifier) = (r6v3 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier) binds: [B:83:0x00f3, B:76:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168  */
    /* JADX INFO: renamed from: d */
    public static final void m7457d(String label, boolean z4, boolean z13, Modifier modifier, InterfaceC2527g4 interfaceC2527g4, InterfaceC4339a interfaceC4339a, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        int i18;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC2527g4 interfaceC2527g5;
        boolean z14;
        Context context;
        boolean zM87153g;
        Object objM87133R2;
        boolean z15;
        C2627t3 c2627t3M35470x;
        boolean zM87155h;
        Object objM87133R3;
        long j7;
        long j13;
        C28655q c28655q;
        long j14;
        long j15;
        float f13;
        Modifier modifier3;
        InterfaceC2527g4 interfaceC2527g6;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        int i19;
        int i24;
        boolean zM87157i;
        InterfaceC2527g4 c2511e4 = interfaceC2527g4;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1384026);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(label) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z13) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) != 0) {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                } else {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q2.m87153g(c2511e4);
                    } else {
                        zM87157i = c28655q2.m87157i(c2511e4);
                    }
                    if (zM87157i) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                }
                i15 |= i24;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q2.m87157i(onClick)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                if ((i15 & 599187) == 599186 || !c28655q2.m87121F()) {
                    c28655q2.m87140Z();
                    i18 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q2.m87118C()) {
                        if (i25 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 16) != 0) {
                            c2511e4 = new C2511e4();
                        }
                        if (i16 != 0) {
                            c28655q2.m87150e0(-1702720898);
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C2217h(4);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c28655q2.m87173q(false);
                            interfaceC2527g5 = c2511e4;
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        }
                        c28655q2.m87175r();
                        z14 = interfaceC2527g5 instanceof C2503d4;
                        c28655q2.m87150e0(1257241529);
                        context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        c28655q2.m87150e0(295279445);
                        zM87153g = c28655q2.m87153g(context);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                            c28655q2.m87172p0(objM87133R2);
                        }
                        float fFloatValue = ((Number) objM87133R2).floatValue();
                        c28655q2.m87173q(false);
                        if (!((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue() || fFloatValue <= 0.0f) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c28655q2.m87173q(false);
                        c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
                        C2535h4 c2535h4M35432C = AbstractC12667a.m35432C(c28655q2);
                        c28655q2.m87150e0(-1702711570);
                        zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87155h || objM87133R3 == c28676v0) {
                            if (z14) {
                                j7 = c2627t3M35470x.f10225c;
                            } else {
                                j7 = c2627t3M35470x.f10223a;
                            }
                            objM87133R3 = new C17919x(j7);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        j13 = ((C17919x) objM87133R3).f69639a;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(-1702704769);
                        if (z15) {
                            c28655q = c28655q2;
                            j14 = j13;
                        } else {
                            InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                            c28655q = c28655q2;
                            j14 = ((C17919x) interfaceC28670t2M11569a.getValue()).f69639a;
                        }
                        c28655q.m87173q(false);
                        C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                        if (z13) {
                            c28655q.m87150e0(-1702692768);
                            long j16 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            f13 = (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j16)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j16)) <= 0.5d) ? 0.87f : 1.0f;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1702692028);
                            j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j15);
                            } else {
                                AbstractC17918w0.m51536x(j15);
                            }
                            c28655q.m87173q(false);
                            f13 = 0.38f;
                        }
                        Modifier modifier4 = modifier2;
                        InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                        AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier4, onClick, c2535h4M35432C, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a4)), c28655q, 56);
                        modifier3 = modifier4;
                        interfaceC2527g6 = interfaceC2527g5;
                        interfaceC4339a3 = interfaceC4339a4;
                    } else {
                        c28655q2.m87138X();
                    }
                    interfaceC2527g5 = c2511e4;
                    c28655q2.m87175r();
                    z14 = interfaceC2527g5 instanceof C2503d4;
                    c28655q2.m87150e0(1257241529);
                    context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q2.m87150e0(295279445);
                    zM87153g = c28655q2.m87153g(context);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    float fFloatValue2 = ((Number) objM87133R2).floatValue();
                    c28655q2.m87173q(false);
                    if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    c28655q2.m87173q(false);
                    c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
                    C2535h4 c2535h4M35432C2 = AbstractC12667a.m35432C(c28655q2);
                    c28655q2.m87150e0(-1702711570);
                    zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87155h) {
                        if (z14) {
                            j7 = c2627t3M35470x.f10225c;
                        } else {
                            j7 = c2627t3M35470x.f10223a;
                        }
                        objM87133R3 = new C17919x(j7);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (z14) {
                            j7 = c2627t3M35470x.f10225c;
                        } else {
                            j7 = c2627t3M35470x.f10223a;
                        }
                        objM87133R3 = new C17919x(j7);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    j13 = ((C17919x) objM87133R3).f69639a;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(-1702704769);
                    if (z15) {
                        c28655q = c28655q2;
                        j14 = j13;
                    } else {
                        InterfaceC28670t2 interfaceC28670t2M11569a2 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                        c28655q = c28655q2;
                        j14 = ((C17919x) interfaceC28670t2M11569a2.getValue()).f69639a;
                    }
                    c28655q.m87173q(false);
                    C28596b0 c28596b1 = AbstractC15047j1.f56336a;
                    if (z13) {
                        c28655q.m87150e0(-1702692768);
                        long j17 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1702692028);
                        j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j15);
                        } else {
                            AbstractC17918w0.m51536x(j15);
                        }
                        c28655q.m87173q(false);
                        f13 = 0.38f;
                    }
                    Modifier modifier5 = modifier2;
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
                    AbstractC28683x.m87247a(c28596b1.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier5, onClick, c2535h4M35432C2, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a5)), c28655q, 56);
                    modifier3 = modifier5;
                    interfaceC2527g6 = interfaceC2527g5;
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    c28655q2.m87138X();
                    interfaceC2527g6 = c2511e4;
                    c28655q = c28655q2;
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2648w3(label, z4, z13, modifier3, interfaceC2527g6, interfaceC4339a3, onClick, i13, i14, 0);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(onClick)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            if ((i15 & 599187) == 599186) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                }
                c28655q2.m87175r();
                z14 = interfaceC2527g5 instanceof C2503d4;
                c28655q2.m87150e0(1257241529);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q2.m87150e0(295279445);
                zM87153g = c28655q2.m87153g(context);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                }
                float fFloatValue3 = ((Number) objM87133R2).floatValue();
                c28655q2.m87173q(false);
                if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                c28655q2.m87173q(false);
                c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
                C2535h4 c2535h4M35432C3 = AbstractC12667a.m35432C(c28655q2);
                c28655q2.m87150e0(-1702711570);
                zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
                objM87133R3 = c28655q2.m87133R();
                if (zM87155h) {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                }
                j13 = ((C17919x) objM87133R3).f69639a;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-1702704769);
                if (z15) {
                    c28655q = c28655q2;
                    j14 = j13;
                } else {
                    InterfaceC28670t2 interfaceC28670t2M11569a3 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                    c28655q = c28655q2;
                    j14 = ((C17919x) interfaceC28670t2M11569a3.getValue()).f69639a;
                }
                c28655q.m87173q(false);
                C28596b0 c28596b2 = AbstractC15047j1.f56336a;
                if (z13) {
                    c28655q.m87150e0(-1702692768);
                    long j18 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1702692028);
                    j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j15);
                    } else {
                        AbstractC17918w0.m51536x(j15);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier6 = modifier2;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
                AbstractC28683x.m87247a(c28596b2.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier6, onClick, c2535h4M35432C3, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a6)), c28655q, 56);
                modifier3 = modifier6;
                interfaceC2527g6 = interfaceC2527g5;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                }
                c28655q2.m87175r();
                z14 = interfaceC2527g5 instanceof C2503d4;
                c28655q2.m87150e0(1257241529);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q2.m87150e0(295279445);
                zM87153g = c28655q2.m87153g(context);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                }
                float fFloatValue4 = ((Number) objM87133R2).floatValue();
                c28655q2.m87173q(false);
                if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                c28655q2.m87173q(false);
                c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
                C2535h4 c2535h4M35432C4 = AbstractC12667a.m35432C(c28655q2);
                c28655q2.m87150e0(-1702711570);
                zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
                objM87133R3 = c28655q2.m87133R();
                if (zM87155h) {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                }
                j13 = ((C17919x) objM87133R3).f69639a;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-1702704769);
                if (z15) {
                    c28655q = c28655q2;
                    j14 = j13;
                } else {
                    InterfaceC28670t2 interfaceC28670t2M11569a4 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                    c28655q = c28655q2;
                    j14 = ((C17919x) interfaceC28670t2M11569a4.getValue()).f69639a;
                }
                c28655q.m87173q(false);
                C28596b0 c28596b3 = AbstractC15047j1.f56336a;
                if (z13) {
                    c28655q.m87150e0(-1702692768);
                    long j19 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1702692028);
                    j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j15);
                    } else {
                        AbstractC17918w0.m51536x(j15);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier7 = modifier2;
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                AbstractC28683x.m87247a(c28596b3.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier7, onClick, c2535h4M35432C4, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a7)), c28655q, 56);
                modifier3 = modifier7;
                interfaceC2527g6 = interfaceC2527g5;
                interfaceC4339a3 = interfaceC4339a7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(label, z4, z13, modifier3, interfaceC2527g6, interfaceC4339a3, onClick, i13, i14, 0);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) != 0) {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            } else {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c2511e4);
                } else {
                    zM87157i = c28655q2.m87157i(c2511e4);
                }
                if (zM87157i) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
            }
            i15 |= i24;
        }
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(onClick)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            if ((i15 & 599187) == 599186) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                }
                c28655q2.m87175r();
                z14 = interfaceC2527g5 instanceof C2503d4;
                c28655q2.m87150e0(1257241529);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q2.m87150e0(295279445);
                zM87153g = c28655q2.m87153g(context);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                }
                float fFloatValue5 = ((Number) objM87133R2).floatValue();
                c28655q2.m87173q(false);
                if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                c28655q2.m87173q(false);
                c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
                C2535h4 c2535h4M35432C5 = AbstractC12667a.m35432C(c28655q2);
                c28655q2.m87150e0(-1702711570);
                zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
                objM87133R3 = c28655q2.m87133R();
                if (zM87155h) {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                }
                j13 = ((C17919x) objM87133R3).f69639a;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-1702704769);
                if (z15) {
                    c28655q = c28655q2;
                    j14 = j13;
                } else {
                    InterfaceC28670t2 interfaceC28670t2M11569a5 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                    c28655q = c28655q2;
                    j14 = ((C17919x) interfaceC28670t2M11569a5.getValue()).f69639a;
                }
                c28655q.m87173q(false);
                C28596b0 c28596b4 = AbstractC15047j1.f56336a;
                if (z13) {
                    c28655q.m87150e0(-1702692768);
                    long j110 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1702692028);
                    j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j15);
                    } else {
                        AbstractC17918w0.m51536x(j15);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier8 = modifier2;
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a2;
                AbstractC28683x.m87247a(c28596b4.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier8, onClick, c2535h4M35432C5, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a8)), c28655q, 56);
                modifier3 = modifier8;
                interfaceC2527g6 = interfaceC2527g5;
                interfaceC4339a3 = interfaceC4339a8;
            } else {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 16) != 0) {
                        c2511e4 = new C2511e4();
                    }
                    if (i16 != 0) {
                        c28655q2.m87150e0(-1702720898);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C2217h(4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        interfaceC2527g5 = c2511e4;
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC2527g5 = c2511e4;
                    }
                }
                c28655q2.m87175r();
                z14 = interfaceC2527g5 instanceof C2503d4;
                c28655q2.m87150e0(1257241529);
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q2.m87150e0(295279445);
                zM87153g = c28655q2.m87153g(context);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    c28655q2.m87172p0(objM87133R2);
                }
                float fFloatValue6 = ((Number) objM87133R2).floatValue();
                c28655q2.m87173q(false);
                if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                c28655q2.m87173q(false);
                c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
                C2535h4 c2535h4M35432C6 = AbstractC12667a.m35432C(c28655q2);
                c28655q2.m87150e0(-1702711570);
                zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
                objM87133R3 = c28655q2.m87133R();
                if (zM87155h) {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (z14) {
                        j7 = c2627t3M35470x.f10225c;
                    } else {
                        j7 = c2627t3M35470x.f10223a;
                    }
                    objM87133R3 = new C17919x(j7);
                    c28655q2.m87172p0(objM87133R3);
                }
                j13 = ((C17919x) objM87133R3).f69639a;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(-1702704769);
                if (z15) {
                    c28655q = c28655q2;
                    j14 = j13;
                } else {
                    InterfaceC28670t2 interfaceC28670t2M11569a6 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                    c28655q = c28655q2;
                    j14 = ((C17919x) interfaceC28670t2M11569a6.getValue()).f69639a;
                }
                c28655q.m87173q(false);
                C28596b0 c28596b5 = AbstractC15047j1.f56336a;
                if (z13) {
                    c28655q.m87150e0(-1702692768);
                    long j111 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1702692028);
                    j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        AbstractC17918w0.m51536x(j15);
                    } else {
                        AbstractC17918w0.m51536x(j15);
                    }
                    c28655q.m87173q(false);
                    f13 = 0.38f;
                }
                Modifier modifier9 = modifier2;
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a2;
                AbstractC28683x.m87247a(c28596b5.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier9, onClick, c2535h4M35432C6, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a9)), c28655q, 56);
                modifier3 = modifier9;
                interfaceC2527g6 = interfaceC2527g5;
                interfaceC4339a3 = interfaceC4339a9;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2648w3(label, z4, z13, modifier3, interfaceC2527g6, interfaceC4339a3, onClick, i13, i14, 0);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((1572864 & i13) == 0) {
            if (c28655q2.m87157i(onClick)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        if ((i15 & 599187) == 599186) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i25 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 16) != 0) {
                    c2511e4 = new C2511e4();
                }
                if (i16 != 0) {
                    c28655q2.m87150e0(-1702720898);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2217h(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC2527g5 = c2511e4;
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC2527g5 = c2511e4;
                }
            } else {
                if (i25 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 16) != 0) {
                    c2511e4 = new C2511e4();
                }
                if (i16 != 0) {
                    c28655q2.m87150e0(-1702720898);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2217h(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC2527g5 = c2511e4;
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC2527g5 = c2511e4;
                }
            }
            c28655q2.m87175r();
            z14 = interfaceC2527g5 instanceof C2503d4;
            c28655q2.m87150e0(1257241529);
            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q2.m87150e0(295279445);
            zM87153g = c28655q2.m87153g(context);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                c28655q2.m87172p0(objM87133R2);
            }
            float fFloatValue7 = ((Number) objM87133R2).floatValue();
            c28655q2.m87173q(false);
            if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                z15 = true;
            } else {
                z15 = true;
            }
            c28655q2.m87173q(false);
            c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
            C2535h4 c2535h4M35432C7 = AbstractC12667a.m35432C(c28655q2);
            c28655q2.m87150e0(-1702711570);
            zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
            objM87133R3 = c28655q2.m87133R();
            if (zM87155h) {
                if (z14) {
                    j7 = c2627t3M35470x.f10225c;
                } else {
                    j7 = c2627t3M35470x.f10223a;
                }
                objM87133R3 = new C17919x(j7);
                c28655q2.m87172p0(objM87133R3);
            } else {
                if (z14) {
                    j7 = c2627t3M35470x.f10225c;
                } else {
                    j7 = c2627t3M35470x.f10223a;
                }
                objM87133R3 = new C17919x(j7);
                c28655q2.m87172p0(objM87133R3);
            }
            j13 = ((C17919x) objM87133R3).f69639a;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-1702704769);
            if (z15) {
                c28655q = c28655q2;
                j14 = j13;
            } else {
                InterfaceC28670t2 interfaceC28670t2M11569a7 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                c28655q = c28655q2;
                j14 = ((C17919x) interfaceC28670t2M11569a7.getValue()).f69639a;
            }
            c28655q.m87173q(false);
            C28596b0 c28596b6 = AbstractC15047j1.f56336a;
            if (z13) {
                c28655q.m87150e0(-1702692768);
                long j112 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1702692028);
                j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j15);
                } else {
                    AbstractC17918w0.m51536x(j15);
                }
                c28655q.m87173q(false);
                f13 = 0.38f;
            }
            Modifier modifier10 = modifier2;
            InterfaceC4339a interfaceC4339a10 = interfaceC4339a2;
            AbstractC28683x.m87247a(c28596b6.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier10, onClick, c2535h4M35432C7, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a10)), c28655q, 56);
            modifier3 = modifier10;
            interfaceC2527g6 = interfaceC2527g5;
            interfaceC4339a3 = interfaceC4339a10;
        } else {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i25 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 16) != 0) {
                    c2511e4 = new C2511e4();
                }
                if (i16 != 0) {
                    c28655q2.m87150e0(-1702720898);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2217h(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC2527g5 = c2511e4;
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC2527g5 = c2511e4;
                }
            } else {
                if (i25 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 16) != 0) {
                    c2511e4 = new C2511e4();
                }
                if (i16 != 0) {
                    c28655q2.m87150e0(-1702720898);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C2217h(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    interfaceC2527g5 = c2511e4;
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC2527g5 = c2511e4;
                }
            }
            c28655q2.m87175r();
            z14 = interfaceC2527g5 instanceof C2503d4;
            c28655q2.m87150e0(1257241529);
            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q2.m87150e0(295279445);
            zM87153g = c28655q2.m87153g(context);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                c28655q2.m87172p0(objM87133R2);
            }
            float fFloatValue8 = ((Number) objM87133R2).floatValue();
            c28655q2.m87173q(false);
            if (((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                z15 = true;
            } else {
                z15 = true;
            }
            c28655q2.m87173q(false);
            c2627t3M35470x = AbstractC12667a.m35470x(c28655q2);
            C2535h4 c2535h4M35432C8 = AbstractC12667a.m35432C(c28655q2);
            c28655q2.m87150e0(-1702711570);
            zM87155h = c28655q2.m87155h(z14) | c28655q2.m87153g(c2627t3M35470x);
            objM87133R3 = c28655q2.m87133R();
            if (zM87155h) {
                if (z14) {
                    j7 = c2627t3M35470x.f10225c;
                } else {
                    j7 = c2627t3M35470x.f10223a;
                }
                objM87133R3 = new C17919x(j7);
                c28655q2.m87172p0(objM87133R3);
            } else {
                if (z14) {
                    j7 = c2627t3M35470x.f10225c;
                } else {
                    j7 = c2627t3M35470x.f10223a;
                }
                objM87133R3 = new C17919x(j7);
                c28655q2.m87172p0(objM87133R3);
            }
            j13 = ((C17919x) objM87133R3).f69639a;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-1702704769);
            if (z15) {
                c28655q = c28655q2;
                j14 = j13;
            } else {
                InterfaceC28670t2 interfaceC28670t2M11569a8 = AbstractC3760m1.m11569a(j13, AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2), "BackgroundAnimation", c28655q2, 384, 8);
                c28655q = c28655q2;
                j14 = ((C17919x) interfaceC28670t2M11569a8.getValue()).f69639a;
            }
            c28655q.m87173q(false);
            C28596b0 c28596b7 = AbstractC15047j1.f56336a;
            if (z13) {
                c28655q.m87150e0(-1702692768);
                long j113 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1702692028);
                j15 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j15);
                } else {
                    AbstractC17918w0.m51536x(j15);
                }
                c28655q.m87173q(false);
                f13 = 0.38f;
            }
            Modifier modifier11 = modifier2;
            InterfaceC4339a interfaceC4339a11 = interfaceC4339a2;
            AbstractC28683x.m87247a(c28596b7.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(290964250, c28655q, new C2487b4(modifier11, onClick, c2535h4M35432C8, z13, c2627t3M35470x, j14, label, interfaceC2527g5, z15, z4, interfaceC4339a11)), c28655q, 56);
            modifier3 = modifier11;
            interfaceC2527g6 = interfaceC2527g5;
            interfaceC4339a3 = interfaceC4339a11;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2648w3(label, z4, z13, modifier3, interfaceC2527g6, interfaceC4339a3, onClick, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m7458e(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1387392527);
        int i14 = (c28655q.m87157i(interfaceC4339a) ? 32 : 16) | i13;
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-449223304);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0343e(interfaceC4339a, 3);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
            m7460g(C1100b.f4583a.mo3400a(C2314t.f9131w, C2299e.f9102E), c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2662y3(i13, 1, interfaceC4339a);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m7459f(String str, boolean z4, boolean z13, Composer composer, int i13) {
        boolean z14;
        boolean z15 = z4;
        C2307m c2307m = C2299e.f9103F;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-190300587);
        int i14 = i13 | (c28655q.m87153g(str) ? 32 : 16) | (c28655q.m87155h(z15) ? 256 : 128) | (c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            z14 = z13;
        } else {
            C2627t3 c2627t3M35470x = AbstractC12667a.m35470x(c28655q);
            c28655q.m87150e0(1153600138);
            c28655q.m87150e0(-1210649140);
            C11666k c11666k = C11671p.f37684e;
            C2551j4 c2551j4 = (C2551j4) c28655q.m87161k(AbstractC2543i4.f9876c);
            c28655q.m87150e0(1018218746);
            boolean zM87153g = c28655q.m87153g(c11666k) | c28655q.m87153g(c2551j4);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                AbstractC28771i abstractC28771iM36267d = c2551j4.f9914a;
                if (abstractC28771iM36267d == null) {
                    Integer num = c11666k.f37662d.f37663a;
                    abstractC28771iM36267d = num != null ? AbstractC12889b.m36267d(AbstractC17269i.m48882b(num.intValue(), null, 14)) : null;
                }
                long j7 = c2551j4.f9915b;
                C39184p[] c39184pArr = C39183o.f168427b;
                if ((1095216660480L & j7) == 0) {
                    j7 = c11666k.f37662d.f37664b;
                }
                objM87133R = new C2551j4(abstractC28771iM36267d, j7);
                c28655q.m87172p0(objM87133R);
            }
            C2551j4 c2551j5 = (C2551j4) objM87133R;
            AbstractC25012a.m73392y(c28655q, false, false, false);
            AbstractC28771i abstractC28771i = c2551j5.f9914a;
            if (abstractC28771i == null) {
                abstractC28771i = AbstractC28771i.f116519w;
            }
            C23285v0 c23285v0 = new C23285v0(0L, c2551j5.f9915b, C28780r.f116540G, null, abstractC28771i, 0L, null, null, 0, 0L, 16777177);
            long jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), c2627t3M35470x.f10224b);
            C2307m c2307m2 = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            C2314t c2314t = C2314t.f9131w;
            AbstractC15011f9.m43114b(str, c1100b.mo3400a(c2314t, c2307m2), jM51541c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q, (i14 >> 3) & 14, 0, 65528);
            z15 = z4;
            c28655q = c28655q;
            if (z15) {
                c28655q.m87150e0(2041279202);
                AbstractC12314q.m34325e(jM51541c, c1100b.mo3400a(c2314t, c2307m), 0, c28655q, 0);
                c28655q.m87173q(false);
                z14 = z13;
            } else {
                z14 = z13;
                if (z14) {
                    c28655q.m87150e0(2041438573);
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_googlepay_primary_button_lock, c28655q, 0), null, c1100b.mo3400a(c2314t, c2307m), jM51541c, c28655q, 48, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2041744171);
                    c28655q.m87173q(false);
                }
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2569l6(str, z15, z14, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m7460g(Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-651385313);
        int i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_googlepay_primary_button_checkmark, c28655q, 0), null, modifier2, AbstractC12667a.m35470x(c28655q).f10226d, c28655q, ((i14 << 6) & 896) | 48, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier2, i13, 0);
        }
    }
}
