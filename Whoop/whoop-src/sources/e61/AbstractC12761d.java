package e61;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e61.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "verticalOffset", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12761d {
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:79:0x013e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0216  */
    /* JADX WARN: Code duplicated, block: B:84:0x0222  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m35710b(Modifier modifier, float f13, int i13, TextResource title, TextResource textResource, Composer composer, int i14, int i15) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i16;
        float f14;
        TextResource textResourceM21267a;
        boolean z4;
        Modifier modifier3;
        float f15;
        TextResource textResource2;
        C28677v1 c28677v1M87180u;
        int i17;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        int i24;
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(127840173);
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                f14 = f13;
                i16 |= c28655q.m87147d(f14) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (c28655q.m87149e(i13)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i16 |= i24;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q.m87153g(title)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i19;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    textResourceM21267a = textResource;
                    if (c28655q.m87153g(textResourceM21267a)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i18;
                } else {
                    textResourceM21267a = textResource;
                }
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i18;
            } else {
                textResourceM21267a = textResource;
            }
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                i17 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i17 != 0 || c28655q.m87118C()) {
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i26 != 0) {
                        f14 = 0.0f;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                } else {
                    c28655q.m87138X();
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                    }
                }
                int i27 = i16;
                float f16 = f14;
                c28655q.m87175r();
                float f17 = 4;
                Modifier modifierMo3471e = AbstractC1102d.m3424u(80 * f17, AbstractC1102d.m3427x(AbstractC29011e.m88149j(c2314t, 0.5f, f16 + 0.5f, C29007a.INSTANCE.m88136a()), null, 3)).mo3471e(modifier2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                TextResource textResource3 = textResourceM21267a;
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(i13, c28655q, ((i27 >> 3) & 112) | 6);
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f17, c2314t);
                C38072d c38072d = C38072d.f163053a;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                float f18 = 2 * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, (i27 >> 9) & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, (i27 >> 12) & 14), null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier2;
                textResource2 = textResource3;
                f15 = f16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f15 = f14;
                textResource2 = textResourceM21267a;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12760c(modifier3, f15, i13, title, textResource2, i14, i15);
            }
        }
        i16 |= 48;
        f14 = f13;
        if ((i14 & 384) == 0) {
            if (c28655q.m87149e(i13)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i16 |= i24;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q.m87153g(title)) {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i19;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                textResourceM21267a = textResource;
                if (c28655q.m87153g(textResourceM21267a)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i18;
            } else {
                textResourceM21267a = textResource;
            }
            i18 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i18;
        } else {
            textResourceM21267a = textResource;
        }
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            i17 = i14 & 1;
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    f14 = 0.0f;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
            } else {
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i26 != 0) {
                    f14 = 0.0f;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
            }
            int i28 = i16;
            float f19 = f14;
            c28655q.m87175r();
            float f110 = 4;
            Modifier modifierMo3471e2 = AbstractC1102d.m3424u(80 * f110, AbstractC1102d.m3427x(AbstractC29011e.m88149j(c2314t, 0.5f, f19 + 0.5f, C29007a.INSTANCE.m88136a()), null, 3)).mo3471e(modifier2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            TextResource textResource4 = textResourceM21267a;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(i13, c28655q, ((i28 >> 3) & 112) | 6);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f110, c2314t);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p2, c38072d2.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            float f111 = 2 * f110;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, (i28 >> 9) & 14), null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f111, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q, (i28 >> 12) & 14), null, c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier2;
            textResource2 = textResource4;
            f15 = f19;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            f15 = f14;
            textResource2 = textResourceM21267a;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12760c(modifier3, f15, i13, title, textResource2, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m35711c(Modifier modifier, float f13, int i13, TextResource textResource, TextResource textResource2, int i14, int i15, Composer composer, int i16) throws XmlPullParserException, IOException {
        m35710b(modifier, f13, i13, textResource, textResource2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
