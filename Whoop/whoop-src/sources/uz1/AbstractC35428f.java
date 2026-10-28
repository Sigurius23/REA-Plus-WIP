package uz1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ao2.C1877b;
import bv2.C3675b;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fg2.C14467i;
import gz0.EnumC16313m0;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import mz1.AbstractC26039b;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import tz1.C34284f;
import tz1.InterfaceC34282d;
import uf0.C34904e;
import uv0.AbstractC35283c;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: uz1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Ltz1/f;", "viewState", "", "isTabRoot", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "g", "(Ltz1/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isUpsellShop", "m", "(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "i", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35428f {
    /* JADX INFO: renamed from: g */
    public static final void m112419g(C34284f viewState, boolean z4, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        boolean z13;
        Modifier modifier2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(82492852);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            boolean z14 = i16 != 0 ? false : z4;
            Modifier modifier3 = i17 != 0 ? C2314t.f9131w : modifier;
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(1966225966);
                m112425m(viewState.getIsUpsellShop(), z14, onViewEvent, modifier3, c28655q, i15 & 8176, 0);
                c28655q.m87173q(false);
            } else if (viewState.getData() != null) {
                c28655q.m87150e0(1966233125);
                Modifier modifier4 = modifier3;
                boolean z15 = z14;
                int i18 = i15 << 6;
                AbstractC35430h.m112448p(viewState.getData(), viewState.getCartIndicator(), viewState.getIsUpsellShop(), z15, onViewEvent, modifier4, c28655q, (C1877b.f7412d << 3) | (i18 & 7168) | (57344 & i18) | (i18 & 458752), 0);
                z14 = z15;
                modifier3 = modifier4;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1966242316);
                m112421i(viewState.getIsUpsellShop(), z14, onViewEvent, modifier3, c28655q, i15 & 8176, 0);
                c28655q.m87173q(false);
            }
            z13 = z14;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            z13 = z4;
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(viewState, z13, onViewEvent, modifier2, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112420h(C34284f c34284f, boolean z4, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m112419g(c34284f, z4, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    private static final void m112421i(boolean z4, boolean z13, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z14;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z15;
        Object objM87133R;
        int i17;
        boolean z16;
        int iM125595a;
        String strM21273g;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-6483150);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, i18, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150176N, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C34904e(function1, 5);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier5 = modifier4;
                i17 = i15;
                z16 = false;
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, modifierM66723l, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                c28655q = c28655q;
                if (z13) {
                    iM125595a = EnumC16313m0.SETTINGS.toWhoopIcon();
                } else if (z4) {
                    iM125595a = EnumC16313m0.CARET_BACKWARD.toWhoopIcon();
                } else {
                    iM125595a = AbstractC39383f.m125595a(C38072d.f163053a);
                }
                Integer numValueOf = Integer.valueOf(iM125595a);
                if (z13) {
                    c28655q.m87150e0(153249175);
                    strM21273g = AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(153349243);
                    strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0);
                    c28655q.m87173q(false);
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(null, null, numValueOf, strM21273g, null, null, null, null, false, null, null, null, null, null, null, null, 65523, null);
                Modifier modifierM66723l2 = AbstractC22953f.m66723l(c2314t);
                if (i16 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i17 & 112) == 32) {
                    z16 = true;
                }
                z18 = z16 | z17;
                objM87133R2 = c28655q.m87133R();
                if (z18 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C3675b(function1, z13, 12);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC6719b.m20143d(modifierM66723l2, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14467i(z4, z13, function1, modifier3, i13, i14, 2);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
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
            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, i18, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150176N, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
            Modifier modifierM66723l3 = AbstractC22953f.m66723l(c2314t);
            i16 = i15 & 896;
            if (i16 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z15) {
                objM87133R = new C34904e(function1, 5);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C34904e(function1, 5);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifier6 = modifier4;
            i17 = i15;
            z16 = false;
            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, modifierM66723l3, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
            c28655q = c28655q;
            if (z13) {
                iM125595a = EnumC16313m0.SETTINGS.toWhoopIcon();
            } else if (z4) {
                iM125595a = EnumC16313m0.CARET_BACKWARD.toWhoopIcon();
            } else {
                iM125595a = AbstractC39383f.m125595a(C38072d.f163053a);
            }
            Integer numValueOf2 = Integer.valueOf(iM125595a);
            if (z13) {
                c28655q.m87150e0(153249175);
                strM21273g = AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(153349243);
                strM21273g = AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, numValueOf2, strM21273g, null, null, null, null, false, null, null, null, null, null, null, null, 65523, null);
            Modifier modifierM66723l4 = AbstractC22953f.m66723l(c2314t);
            if (i16 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i17 & 112) == 32) {
                z16 = true;
            }
            z18 = z16 | z17;
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                objM87133R2 = new C3675b(function1, z13, 12);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3675b(function1, z13, 12);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC6719b.m20143d(modifierM66723l4, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14467i(z4, z13, function1, modifier3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m112422j(Function1 function1) {
        function1.invoke(new InterfaceC34282d.j(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m112423k(Function1 function1, boolean z4) {
        function1.invoke(z4 ? InterfaceC34282d.l.f143999a : InterfaceC34282d.b.f143986a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m112424l(boolean z4, boolean z13, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m112421i(z4, z13, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private static final void m112425m(boolean z4, boolean z13, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z14;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Modifier modifier5;
        TextResource c8688b;
        Modifier modifierM66723l;
        Object[] objArr;
        Object[] objArr2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-399617690);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                List list = null;
                objArr2 = 0;
                objArr = 0;
                Object[] objArr3 = 0;
                if (z13 || z4) {
                    modifier5 = modifier4;
                    c28655q.m87150e0(639663788);
                    AbstractC33208p0.c cVar = AbstractC33208p0.c.f138471e;
                    if (z4) {
                        c8688b = AbstractC8693b.m21267a();
                    } else {
                        c8688b = new TextResource.C8688b(AbstractC26039b.f103022e, objArr == true ? 1 : 0, i16, objArr2 == true ? 1 : 0);
                    }
                    if (z4) {
                        modifierM66723l = modifier5;
                    } else {
                        modifierM66723l = AbstractC22953f.m66723l(modifier5);
                    }
                    AbstractC33199m0.m105214F(cVar, c8688b, null, null, null, false, false, null, null, modifierM66723l, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(638943999);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier4);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                    modifier5 = modifier4;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, new TextResource.C8688b(AbstractC26039b.f103020c, list, i16, objArr3 == true ? 1 : 0), null, null, null, false, false, null, null, AbstractC22953f.m66723l(c2314t), false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.C8688b.f25889c << 3), 0, 3580);
                    c28655q = c28655q;
                    AbstractC6721d.a aVar = new AbstractC6721d.a(null, null, Integer.valueOf(EnumC16313m0.SETTINGS.toWhoopIcon()), AbstractC8693b.m21273g(AbstractC26039b.f103024g, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65523, null);
                    Modifier modifierM66723l2 = AbstractC22953f.m66723l(c2314t);
                    boolean z15 = (i15 & 896) == 256;
                    Object objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C34904e(function1, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC6719b.m20143d(modifierM66723l2, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14467i(z4, z13, function1, modifier3, i13, i14, 1);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            List list2 = null;
            objArr2 = 0;
            objArr = 0;
            Object[] objArr4 = 0;
            if (z13) {
                modifier5 = modifier4;
                c28655q.m87150e0(639663788);
                AbstractC33208p0.c cVar2 = AbstractC33208p0.c.f138471e;
                if (z4) {
                    c8688b = AbstractC8693b.m21267a();
                } else {
                    c8688b = new TextResource.C8688b(AbstractC26039b.f103022e, objArr == true ? 1 : 0, i16, objArr2 == true ? 1 : 0);
                }
                if (z4) {
                    modifierM66723l = modifier5;
                } else {
                    modifierM66723l = AbstractC22953f.m66723l(modifier5);
                }
                AbstractC33199m0.m105214F(cVar2, c8688b, null, null, null, false, false, null, null, modifierM66723l, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                modifier5 = modifier4;
                c28655q.m87150e0(639663788);
                AbstractC33208p0.c cVar3 = AbstractC33208p0.c.f138471e;
                if (z4) {
                    c8688b = AbstractC8693b.m21267a();
                } else {
                    c8688b = new TextResource.C8688b(AbstractC26039b.f103022e, objArr == true ? 1 : 0, i16, objArr2 == true ? 1 : 0);
                }
                if (z4) {
                    modifierM66723l = modifier5;
                } else {
                    modifierM66723l = AbstractC22953f.m66723l(modifier5);
                }
                AbstractC33199m0.m105214F(cVar3, c8688b, null, null, null, false, false, null, null, modifierM66723l, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14467i(z4, z13, function1, modifier3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112426n(Function1 function1) {
        function1.invoke(InterfaceC34282d.l.f143999a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m112427o(boolean z4, boolean z13, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m112425m(z4, z13, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
