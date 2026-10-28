package hy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bf0.C3195g;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import kd1.C22411w;
import l83.C23454a0;
import l83.C23471q;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.a1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "text", "subtitle", "", "isActive", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17722a1 {
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m50718d(Modifier modifier, String text, String str, boolean z4, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        boolean z13;
        C28655q c28655q;
        String str3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        String str4;
        C23471q c23471q;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean z14;
        Object objM87133R2;
        int i16;
        int i17;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(662279879);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(text) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(onClick)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (z4) {
                    c28655q2.m87150e0(-1099665874);
                    C38072d c38072d = C38072d.f163053a;
                    c23471q = new C23471q(new C17919x(c38072d.m121949b(c28655q2, 6).getWhite10()), new C17919x(c38072d.m121949b(c28655q2, 6).getBrandWhite()), new C17919x(c38072d.m121949b(c28655q2, 6).getBrandWhite()));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1099552228);
                    C17919x c17919x = new C17919x(C17919x.f69636m);
                    C38072d c38072d2 = C38072d.f163053a;
                    c23471q = new C23471q(c17919x, new C17919x(c38072d2.m121949b(c28655q2, 6).getWhite70()), new C17919x(c38072d2.m121949b(c28655q2, 6).getWhite70()));
                    c28655q2.m87173q(false);
                }
                long j7 = ((C17919x) c23471q.f92947w).f69639a;
                long j13 = ((C17919x) c23471q.f92948x).f69639a;
                long j14 = ((C17919x) c23471q.f92949y).f69639a;
                C33252i c33252iM64090c = C22411w.f87680a.m64536b().m64090c();
                float f13 = 0;
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                String str5 = str4;
                C18027i c18027i = new C18027i(0);
                if ((i15 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C17804y0(onClick, 0);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC12889b.m36263b(AbstractC1092a.m3360e(c2314t, interfaceC21083i, null, false, c18027i, (InterfaceC4339a) objM87133R2, 12).mo3471e(modifier3), c33252iM64090c, j7, null, f13, AbstractC37817c.m121344e(1906118212, c28655q2, new C17807z0(str5, text, j13, j14)), c28655q, 1769472, 24);
                str3 = str5;
                modifier2 = modifier3;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(modifier2, text, str3, z4, onClick, i13, i14, 14);
            }
        }
        i15 |= 384;
        str2 = str;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87155h(z4)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(onClick)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (z4) {
                c28655q2.m87150e0(-1099665874);
                C38072d c38072d3 = C38072d.f163053a;
                c23471q = new C23471q(new C17919x(c38072d3.m121949b(c28655q2, 6).getWhite10()), new C17919x(c38072d3.m121949b(c28655q2, 6).getBrandWhite()), new C17919x(c38072d3.m121949b(c28655q2, 6).getBrandWhite()));
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1099552228);
                C17919x c17919x2 = new C17919x(C17919x.f69636m);
                C38072d c38072d4 = C38072d.f163053a;
                c23471q = new C23471q(c17919x2, new C17919x(c38072d4.m121949b(c28655q2, 6).getWhite70()), new C17919x(c38072d4.m121949b(c28655q2, 6).getWhite70()));
                c28655q2.m87173q(false);
            }
            long j15 = ((C17919x) c23471q.f92947w).f69639a;
            long j16 = ((C17919x) c23471q.f92948x).f69639a;
            long j17 = ((C17919x) c23471q.f92949y).f69639a;
            C33252i c33252iM64090c2 = C22411w.f87680a.m64536b().m64090c();
            float f14 = 0;
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            String str6 = str4;
            C18027i c18027i2 = new C18027i(0);
            if ((i15 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C17804y0(onClick, 0);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C17804y0(onClick, 0);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC12889b.m36263b(AbstractC1092a.m3360e(c2314t, interfaceC21083i2, null, false, c18027i2, (InterfaceC4339a) objM87133R2, 12).mo3471e(modifier3), c33252iM64090c2, j15, null, f14, AbstractC37817c.m121344e(1906118212, c28655q2, new C17807z0(str6, text, j16, j17)), c28655q, 1769472, 24);
            str3 = str6;
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(modifier2, text, str3, z4, onClick, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m50719e(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m50720f(String str, String str2, long j7, long j13, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            if (str != null) {
                c28655q2.m87150e0(556480470);
                C2305k c2305k = C2299e.f9111N;
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.25d) * f13, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 48);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(str2, null, j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, 0, 0, 196090);
                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f13, 0.0f, 0.0f, 13), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB4(), null, c28655q2, 48, 0, 196088);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(557247224);
                AbstractC30795n.m94707h(str2, AbstractC1099a.m3394p(((float) 1.25d) * 8, c2314t), j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getH5(), null, c28655q2, 48, 0, 196088);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m50721g(Modifier modifier, String str, String str2, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m50718d(modifier, str, str2, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
