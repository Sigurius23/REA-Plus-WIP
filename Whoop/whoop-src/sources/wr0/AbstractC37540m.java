package wr0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.communitymoments.domain.models.MenuAnchorButtonStyle;
import com.whoop.navigation.models.GenericInteraction;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import vl0.C36100c;
import vy0.AbstractC36568c0;
import vy0.AbstractC36597y;
import vy0.C36570d0;
import vy0.C36598z;
import wb3.AbstractC37056f;
import wo1.C37445e0;
import x81.C38072d;

/* JADX INFO: renamed from: wr0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u000e\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lwr0/n;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "p", "(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "A", "(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "m", "Ly3/f;", "a", "F", "MenuAnchorSize", "b", "MenuAnchorPopupGap", "c", "MenuAnchorBorderWidth", "Lvy0/d0;", "d", "Lvy0/d0;", "previewMenu", "", "expanded", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37540m {

    /* JADX INFO: renamed from: a */
    private static final float f160534a;

    /* JADX INFO: renamed from: c */
    private static final float f160536c;

    /* JADX INFO: renamed from: b */
    private static final float f160535b = 1 * 8;

    /* JADX INFO: renamed from: d */
    private static final C36570d0 f160537d = new C36570d0(AbstractC37056f.m118959K(new C36598z("Take Photo", null, EnumC16313m0.CAMERA, 2, null), new C36598z("Select Photo", null, EnumC16313m0.PICTURE, 2, null), new C36598z("Remove Photo", new GenericInteraction((JsonElement) null, (JsonElement) null, (JsonElement) (0 == true ? 1 : 0), (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null), EnumC16313m0.DELETE)));

    /* JADX INFO: renamed from: wr0.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160538a;

        static {
            int[] iArr = new int[MenuAnchorButtonStyle.values().length];
            try {
                iArr[MenuAnchorButtonStyle.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuAnchorButtonStyle.CONTAINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160538a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        float f13 = 4;
        f160534a = 12 * f13;
        f160536c = ((float) 0.5d) * f13;
    }

    /* JADX INFO: renamed from: A */
    private static final void m120406A(C37542n c37542n, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(626110277);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c37542n) : c28655q.m87157i(c37542n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = f160534a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1102d.m3419p(f13, c2314t), false, null, null, interfaceC4339a, 15);
            boolean z4 = (i15 & 14) == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c37542n));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C37534j(c37542n, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
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
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(c37542n.getIcon().toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37536k(c37542n, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m120407B(C37542n c37542n, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        String strM120437a = c37542n.getContentDescription();
        if (strM120437a != null) {
            AbstractC18041w.m51806e(strM120437a, semantics);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m120408C(C37542n c37542n, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m120406A(c37542n, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m120421m(C37542n c37542n, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        Modifier modifierM44456i;
        boolean z4;
        interfaceC4339a = interfaceC4339a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1791910894);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c37542n) : c28655q.m87157i(c37542n) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 4;
            float f14 = f13 * f13;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            AbstractC22403o abstractC22403oM120439c = c37542n.getIconImage();
            float f15 = f160534a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f15, c2314t), c33252iM105489e);
            if (abstractC22403oM120439c != null) {
                c28655q.m87150e0(-255503618);
                C13825t c13825tM48880a = AbstractC17269i.m48880a(f160536c, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite());
                modifierM44456i = AbstractC15751g.m44456i(c13825tM48880a.f49345a, c2314t, c13825tM48880a.f49346b, c33252iM105489e);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-255500938);
                c28655q.m87173q(false);
                modifierM44456i = c2314t;
            }
            Modifier modifierMo3471e = modifierM118994r.mo3471e(modifierM44456i);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1092a.m3358c(modifierMo3471e, c38072d.m121949b(c28655q, i16).getWhite10(), AbstractC17918w0.f69621a), false, null, null, interfaceC4339a, 15);
            boolean z13 = (i15 & 14) == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c37542n));
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C37534j(c37542n, 0);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM51775c);
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
            if (abstractC22403oM120439c != null) {
                c28655q.m87150e0(1242763443);
                z4 = true;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM120439c, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z4 = true;
                c28655q.m87150e0(1242998082);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(c37542n.getIcon().toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f14, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37536k(c37542n, interfaceC4339a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m120422n(C37542n c37542n, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        String strM120437a = c37542n.getContentDescription();
        if (strM120437a != null) {
            AbstractC18041w.m51806e(strM120437a, semantics);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m120423o(C37542n c37542n, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m120421m(c37542n, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0136  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x0194  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static final void m120424p(C37542n viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC39171c interfaceC39171c;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        Object objM87133R2;
        int iMo724F;
        boolean zM87149e;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-152552226);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                z4 = true;
                if ((i15 & 147) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C37445e0(13);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function3 = (Function1) objM87133R6;
                    } else {
                        function3 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
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
                    i18 = a.f160538a[viewState.getStyle().ordinal()];
                    i19 = 14;
                    if (i18 != 1) {
                        c28655q.m87150e0(-85260717);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37538l(0, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m120406A(viewState, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                        c28655q.m87173q(false);
                    } else {
                        if (i18 == 2) {
                            throw AbstractC11895b.m32003v(-85262716, c28655q, false);
                        }
                        c28655q.m87150e0(-85257673);
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C37538l(1, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        m120421m(viewState, (InterfaceC4339a) objM87133R5, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                        c28655q.m87173q(false);
                    }
                    if (m120426r(interfaceC28601c1)) {
                        c28655q.m87150e0(1652084246);
                        iMo724F = interfaceC39171c.mo724F(f160535b);
                        zM87149e = c28655q.m87149e(iMo724F);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87149e || objM87133R3 == c28676v0) {
                            objM87133R3 = new C37544o(iMo724F);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C37544o c37544o = (C37544o) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C37538l(2, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC3975r.m12004a(c37544o, (InterfaceC4339a) objM87133R4, new C3966j0(z4, i19), AbstractC37817c.m121344e(-1589285539, c28655q, new C36100c(viewState, function3, interfaceC28601c1, 7)), c28655q, 3504, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1652768478);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C37526f(i13, i14, 1, modifier2, function3, viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            z4 = true;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C37445e0(13);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (Function1) objM87133R6;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier3);
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
                i18 = a.f160538a[viewState.getStyle().ordinal()];
                i19 = 14;
                if (i18 != 1) {
                    c28655q.m87150e0(-85260717);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37538l(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m120406A(viewState, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                    c28655q.m87173q(false);
                } else {
                    if (i18 == 2) {
                        throw AbstractC11895b.m32003v(-85262716, c28655q, false);
                    }
                    c28655q.m87150e0(-85257673);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C37538l(1, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    m120421m(viewState, (InterfaceC4339a) objM87133R5, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                    c28655q.m87173q(false);
                }
                if (m120426r(interfaceC28601c1)) {
                    c28655q.m87150e0(1652084246);
                    iMo724F = interfaceC39171c.mo724F(f160535b);
                    zM87149e = c28655q.m87149e(iMo724F);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R3 = new C37544o(iMo724F);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C37544o(iMo724F);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C37544o c37544o2 = (C37544o) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37538l(2, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC3975r.m12004a(c37544o2, (InterfaceC4339a) objM87133R4, new C3966j0(z4, i19), AbstractC37817c.m121344e(-1589285539, c28655q, new C36100c(viewState, function3, interfaceC28601c1, 7)), c28655q, 3504, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1652768478);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 1, modifier2, function3, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            z4 = true;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C37445e0(13);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (Function1) objM87133R6;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier3);
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
                i18 = a.f160538a[viewState.getStyle().ordinal()];
                i19 = 14;
                if (i18 != 1) {
                    c28655q.m87150e0(-85260717);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37538l(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m120406A(viewState, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                    c28655q.m87173q(false);
                } else {
                    if (i18 == 2) {
                        throw AbstractC11895b.m32003v(-85262716, c28655q, false);
                    }
                    c28655q.m87150e0(-85257673);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C37538l(1, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    m120421m(viewState, (InterfaceC4339a) objM87133R5, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                    c28655q.m87173q(false);
                }
                if (m120426r(interfaceC28601c1)) {
                    c28655q.m87150e0(1652084246);
                    iMo724F = interfaceC39171c.mo724F(f160535b);
                    zM87149e = c28655q.m87149e(iMo724F);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R3 = new C37544o(iMo724F);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C37544o(iMo724F);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C37544o c37544o3 = (C37544o) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37538l(2, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC3975r.m12004a(c37544o3, (InterfaceC4339a) objM87133R4, new C3966j0(z4, i19), AbstractC37817c.m121344e(-1589285539, c28655q, new C36100c(viewState, function3, interfaceC28601c1, 7)), c28655q, 3504, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1652768478);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 1, modifier2, function3, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        z4 = true;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i24 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C37445e0(13);
                    c28655q.m87172p0(objM87133R6);
                }
                function3 = (Function1) objM87133R6;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            i18 = a.f160538a[viewState.getStyle().ordinal()];
            i19 = 14;
            if (i18 != 1) {
                c28655q.m87150e0(-85260717);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37538l(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                m120406A(viewState, (InterfaceC4339a) objM87133R2, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                c28655q.m87173q(false);
            } else {
                if (i18 == 2) {
                    throw AbstractC11895b.m32003v(-85262716, c28655q, false);
                }
                c28655q.m87150e0(-85257673);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C37538l(1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                m120421m(viewState, (InterfaceC4339a) objM87133R5, c28655q, (i15 & 14) | AbstractC22403o.f87638a | C36570d0.f156622b | 48);
                c28655q.m87173q(false);
            }
            if (m120426r(interfaceC28601c1)) {
                c28655q.m87150e0(1652084246);
                iMo724F = interfaceC39171c.mo724F(f160535b);
                zM87149e = c28655q.m87149e(iMo724F);
                objM87133R3 = c28655q.m87133R();
                if (zM87149e) {
                    objM87133R3 = new C37544o(iMo724F);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37544o(iMo724F);
                    c28655q.m87172p0(objM87133R3);
                }
                C37544o c37544o4 = (C37544o) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37538l(2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC3975r.m12004a(c37544o4, (InterfaceC4339a) objM87133R4, new C3966j0(z4, i19), AbstractC37817c.m121344e(-1589285539, c28655q, new C36100c(viewState, function3, interfaceC28601c1, 7)), c28655q, 3504, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1652768478);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 1, modifier2, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m120425q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m120426r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m120427s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m120428t(InterfaceC28601c1 interfaceC28601c1) {
        m120427s(interfaceC28601c1, !m120426r(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m120429u(InterfaceC28601c1 interfaceC28601c1) {
        m120427s(interfaceC28601c1, !m120426r(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m120430v(InterfaceC28601c1 interfaceC28601c1) {
        m120427s(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m120431w(C37542n c37542n, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C36570d0 c36570d0M120440e = c37542n.getMenu();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C37538l(3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C37559v0(function1, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC36568c0.m117321z(c36570d0M120440e, null, interfaceC4339a, (Function1) objM87133R2, c28655q, C36570d0.f156622b | 384, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m120432x(InterfaceC28601c1 interfaceC28601c1) {
        m120427s(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m120433y(Function1 function1, AbstractC36597y event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof AbstractC36597y.a)) {
            throw new NoWhenBranchMatchedException();
        }
        function1.invoke(((AbstractC36597y.a) event).getInteraction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m120434z(C37542n c37542n, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120424p(c37542n, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
