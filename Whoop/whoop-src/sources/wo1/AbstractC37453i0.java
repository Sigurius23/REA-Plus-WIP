package wo1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gy0.AbstractC16276e;
import jp2.C21882m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13996z;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32676t1;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn1.AbstractC38480c;

/* JADX INFO: renamed from: wo1.i0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "text", "", "showBackground", "Ll83/a0;", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37453i0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e A[PHI: r0 r1
      0x008e: PHI (r0v6 androidx.compose.ui.Modifier) = (r0v3 androidx.compose.ui.Modifier), (r0v7 androidx.compose.ui.Modifier) binds: [B:55:0x00a0, B:47:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r1v9 com.whoop.design.util.TextResource) = (r1v5 com.whoop.design.util.TextResource), (r1v10 com.whoop.design.util.TextResource) binds: [B:55:0x00a0, B:47:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m119955d(Modifier modifier, TextResource textResource, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        boolean z14;
        TextResource textResource2;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        TextResource textResource3;
        Modifier modifier4;
        C37816b c37816bM121344e;
        Modifier modifierMo3471e;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        TextResource c8688b = textResource;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1625987758);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i17 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q.m87153g(c8688b) : c28655q.m87157i(c8688b)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
            }
            i15 |= i17;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        c8688b = new TextResource.C8688b(AbstractC38480c.f164875v, null, 2, null);
                    }
                    textResource3 = c8688b;
                    modifier4 = modifier2;
                    if (i19 != 0) {
                        z15 = true;
                    }
                    c28655q.m87175r();
                    c37816bM121344e = AbstractC37817c.m121344e(-1597669391, c28655q, new C21882m(textResource3, 3));
                    modifierMo3471e = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3).mo3471e(modifier4);
                    if (z15) {
                        c28655q.m87150e0(-1158976345);
                        float f13 = 4;
                        AbstractC12889b.m36263b(modifierMo3471e, AbstractC33253j.m105489e(3 * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f13, AbstractC37817c.m121344e(-487353708, c28655q, new C13996z(c37816bM121344e, 6)), c28655q, 1769472, 24);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1158737955);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        c37816bM121344e.invoke(c28655q, 6);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    textResource2 = textResource3;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    textResource3 = c8688b;
                    modifier4 = modifier2;
                }
                z15 = z13;
                c28655q.m87175r();
                c37816bM121344e = AbstractC37817c.m121344e(-1597669391, c28655q, new C21882m(textResource3, 3));
                modifierMo3471e = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3).mo3471e(modifier4);
                if (z15) {
                    c28655q.m87150e0(-1158976345);
                    float f14 = 4;
                    AbstractC12889b.m36263b(modifierMo3471e, AbstractC33253j.m105489e(3 * f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f14, AbstractC37817c.m121344e(-487353708, c28655q, new C13996z(c37816bM121344e, 6)), c28655q, 1769472, 24);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1158737955);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    c37816bM121344e.invoke(c28655q, 6);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                textResource2 = textResource3;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                textResource2 = c8688b;
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(modifier3, textResource2, z15, i13, i14, 5);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    c8688b = new TextResource.C8688b(AbstractC38480c.f164875v, null, 2, null);
                }
                textResource3 = c8688b;
                modifier4 = modifier2;
                if (i19 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    c8688b = new TextResource.C8688b(AbstractC38480c.f164875v, null, 2, null);
                }
                textResource3 = c8688b;
                modifier4 = modifier2;
                if (i19 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
            }
            c28655q.m87175r();
            c37816bM121344e = AbstractC37817c.m121344e(-1597669391, c28655q, new C21882m(textResource3, 3));
            modifierMo3471e = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3).mo3471e(modifier4);
            if (z15) {
                c28655q.m87150e0(-1158976345);
                float f15 = 4;
                AbstractC12889b.m36263b(modifierMo3471e, AbstractC33253j.m105489e(3 * f15), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f15, AbstractC37817c.m121344e(-487353708, c28655q, new C13996z(c37816bM121344e, 6)), c28655q, 1769472, 24);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1158737955);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c37816bM121344e.invoke(c28655q, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            textResource2 = textResource3;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            textResource2 = c8688b;
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(modifier3, textResource2, z15, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m119956e(TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 1 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11);
            float f14 = 4;
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(f14 * f14, modifierM3398t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m119957f(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m119958g(Modifier modifier, TextResource textResource, boolean z4, int i13, int i14, Composer composer, int i15) {
        m119955d(modifier, textResource, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
