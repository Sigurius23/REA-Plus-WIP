package x11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.C29616a;
import qz0.AbstractC30795n;
import w71.C36891k;
import wb3.AbstractC37056f;
import wr1.C37572f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: x11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "ctaMessage", "buttonLabel", "Lkotlin/Function0;", "Ll83/a0;", "onClicked", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37828b {
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m121366d(Modifier modifier, TextResource ctaMessage, TextResource textResource, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        C28655q c28655q2;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(ctaMessage, "ctaMessage");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(31865350);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87153g(ctaMessage) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87153g(textResource) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q3.m87157i(interfaceC4339a2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37572f(13);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(ctaMessage, c28655q3, (i15 >> 3) & 14);
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) 1.25d) * f13, 0.0f, 0.0f, ((float) 1.5d) * f13, 6);
                c38072d = C38072d.f163053a;
                interfaceC4339a4 = interfaceC4339a2;
                Modifier modifier5 = modifier4;
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB2(), null, c28655q3, 0, 0, 196600);
                c28655q2 = c28655q3;
                if (textResource == null) {
                    c28655q2.m87150e0(-148498931);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-148498930);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                    if ((i16 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C29616a(interfaceC4339a4, 23);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(null, enumC27269n0, textResource, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, 48, 0, 4073);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a4;
                modifier3 = modifier5;
            } else {
                c28655q3.m87138X();
                c28655q = c28655q3;
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, ctaMessage, textResource, interfaceC4339a3, i13, i14, 6);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37572f(13);
                    c28655q3.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(ctaMessage, c28655q3, (i15 >> 3) & 14);
            float f14 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) 1.25d) * f14, 0.0f, 0.0f, ((float) 1.5d) * f14, 6);
            c38072d = C38072d.f163053a;
            interfaceC4339a4 = interfaceC4339a2;
            Modifier modifier6 = modifier4;
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB2(), null, c28655q3, 0, 0, 196600);
            c28655q2 = c28655q3;
            if (textResource == null) {
                c28655q2.m87150e0(-148498931);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-148498930);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C29616a(interfaceC4339a4, 23);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C29616a(interfaceC4339a4, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(null, enumC27269n1, textResource, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, 48, 0, 4073);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a4;
            modifier3 = modifier6;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, ctaMessage, textResource, interfaceC4339a3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m121367e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m121368f(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m121369g(Modifier modifier, TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m121366d(modifier, textResource, textResource2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
