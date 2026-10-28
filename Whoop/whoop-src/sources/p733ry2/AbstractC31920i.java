package p733ry2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import hg3.AbstractC17269i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ry2.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "", "isEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31920i {
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m99360c(TextResource text, boolean z4, Modifier modifier, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C13825t c13825tM48880a;
        boolean z14;
        Object objM87133R;
        int i16;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1769389577);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(text) : c28655q.m87157i(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                Modifier modifier5 = modifier4;
                float f14 = 8;
                float f15 = ((float) 2.5d) * f14;
                f13 = 2;
                float f16 = f14 * f13;
                Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM3409f, f16, f15, f16, f16);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (z4) {
                    c28655q.m87150e0(-510375077);
                    c13825tM48880a = AbstractC17269i.m48880a(f13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite());
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-510297794);
                    c13825tM48880a = AbstractC17269i.m48880a(f13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20());
                    c28655q.m87173q(false);
                }
                C13825t c13825t = c13825tM48880a;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f17 = 16 * 4;
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i18).getTransparent(), c38072d.m121949b(c28655q, i18).getBrandWhite(), c38072d.m121949b(c28655q, i18).getTransparent(), c38072d.m121949b(c28655q, i18).getWhite20(), c28655q, 0, 0);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31918g(onClick, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3409f2, z4, false, null, null, null, text, c15077m1M43196a, null, c13825t, f17, null, null, (InterfaceC4339a) objM87133R, c28655q, (i15 & 112) | 6 | (TextResource.$stable << 18) | ((i15 << 18) & 3670016), 6, 6460);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(i13, i14, 0, text, modifier3, onClick, z4);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onClick)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
            Modifier modifier6 = modifier4;
            float f18 = 8;
            float f19 = ((float) 2.5d) * f18;
            f13 = 2;
            float f110 = f18 * f13;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(modifierM3409f3, f110, f19, f110, f110);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (z4) {
                c28655q.m87150e0(-510375077);
                c13825tM48880a = AbstractC17269i.m48880a(f13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite());
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-510297794);
                c13825tM48880a = AbstractC17269i.m48880a(f13, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20());
                c28655q.m87173q(false);
            }
            C13825t c13825t2 = c13825tM48880a;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            float f111 = 16 * 4;
            C22976l1 c22976l2 = AbstractC15166v0.f56891a;
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i19).getTransparent(), c38072d2.m121949b(c28655q, i19).getBrandWhite(), c38072d2.m121949b(c28655q, i19).getTransparent(), c38072d2.m121949b(c28655q, i19).getWhite20(), c28655q, 0, 0);
            if ((i15 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C31918g(onClick, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(onClick, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3409f4, z4, false, null, null, null, text, c15077m1M43196a2, null, c13825t2, f111, null, null, (InterfaceC4339a) objM87133R, c28655q, (i15 & 112) | 6 | (TextResource.$stable << 18) | ((i15 << 18) & 3670016), 6, 6460);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(i13, i14, 0, text, modifier3, onClick, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m99361d(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m99362e(TextResource textResource, boolean z4, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m99360c(textResource, z4, modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
