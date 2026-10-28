package ox2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kz2.AbstractC22926c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lx2.AbstractC24796a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26957l;
import nw0.C27207n;
import nx1.C27225g;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import ny0.C27270o;
import o72.C27640a;
import ou1.C28376a;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p725ot1.C28330f;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import px2.AbstractC29599b;
import px2.C29600c;
import px2.C29605h;
import px2.C29610m;
import px2.InterfaceC29602e;
import px2.InterfaceC29603f;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: ox2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lpx2/b$a;", "content", "Lkotlin/Function1;", "", "Ll83/a0;", "onOptionSelected", "Llx2/a;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "z", "(Lpx2/b$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lpx2/b;", "Lpx2/f$a;", "viewState", "onMenuItemClick", "onCancelReasonSelected", "M", "(Lpx2/b;Lpx2/f$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "r", "(Lpx2/f$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lpx2/b$b;", "D", "(Lpx2/b$b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lpx2/e;", "modal", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "u", "(Lpx2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "K", "(Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28459e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m86276A(Function1 function1, C29605h c29605h) {
        function1.invoke(c29605h.getKey());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m86277B(Function1 function1, AbstractC29599b.a aVar) {
        function1.invoke(new AbstractC24796a.j(aVar.getAction(), aVar.m90788f(), null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m86278C(AbstractC29599b.a aVar, Function1 function1, Function1 function2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m86315z(aVar, function1, function2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x04de  */
    /* JADX WARN: Code duplicated, block: B:110:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x052a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0537  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0195  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0346  */
    /* JADX WARN: Code duplicated, block: B:80:0x0359  */
    /* JADX WARN: Code duplicated, block: B:81:0x035b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0368  */
    /* JADX WARN: Code duplicated, block: B:90:0x0449  */
    /* JADX WARN: Code duplicated, block: B:92:0x0457  */
    /* JADX WARN: Code duplicated, block: B:95:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:99:0x04cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static final void m86279D(AbstractC29599b.b content, Modifier modifier, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        AbstractC29599b.b bVar;
        Function1 function1;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        InterfaceC2464x2 interfaceC2464x2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        int iHashCode2;
        C38072d c38072d;
        int i17;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean z14;
        Object objM87133R2;
        int i18;
        Object objM87133R3;
        boolean z15;
        Object objM87133R4;
        boolean z16;
        long jM125372X0;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R5;
        int i19;
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1437270524);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(content) : c28655q.m87157i(content) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i15 |= i19;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, AbstractC22953f.m66720i(modifier3)));
                float f13 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                float f14 = 2;
                float f15 = f14 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                i16 = i15;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f16 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f16, c2314t);
                AbstractC27274q.a aVar = AbstractC27274q.a.f109136f;
                c38072d = C38072d.f163053a;
                C27270o c27270o = new C27270o(aVar, AbstractC18489d0.m53357C(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String string = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, 0 == true ? 1 : 0).toString();
                i17 = i16 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C27207n(onViewEvent, 21);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o, string, modifierM3419p, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k | 384, 8);
                AbstractC18489d0.m53380u(f14, f16, c2314t, c28655q);
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C27207n(onViewEvent, 22);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                String strM21273g = AbstractC8693b.m21273g(AbstractC35283c.f150167E, c28655q, 0);
                i18 = C38072d.f163054b;
                C2886a c2886aM8437r = c38072d.m121952e(c28655q, i18).getH4();
                long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
                C36775k c36775k = new C36775k(5);
                int i25 = C2886a.f11498d;
                int i26 = i25 << 18;
                AbstractC30795n.m94707h(strM21273g, modifierM3362g, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i26, 196088);
                c28655q.m87173q(true);
                TextResource textResourceM90798h = content.getTitle();
                int i27 = TextResource.$stable;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM90798h, c28655q, i27), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT3(), null, c28655q, 48, i26, 196600);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(content.getSubtitle(), c28655q, i27), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 48, i26, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.2d) * f13, c2314t));
                TextResource textResourceM90796f = content.getLabel();
                C2886a c2886aM8432m = c38072d.m121952e(c28655q, i18).getFormLabel();
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f16);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(content.getAdditionalText());
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C28376a(6);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                if (i17 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z15 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C26957l(onViewEvent, 27);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC30792k.m94678l(null, textResourceM21278l, null, textResourceM90796f, c2886aM8432m, null, null, null, textResourceM21267a, false, false, null, 0L, false, 1, 0, 7, false, null, false, false, 0, false, null, null, c33252iM105489e, null, null, null, null, interfaceC4339a, (Function1) objM87133R4, c28655q, (i27 << 3) | (i27 << 9) | (i25 << 12) | (i27 << 24), 1597440, 0, 6, 1040105189, 0);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(content.getBottomText(), c28655q, i27), AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1), c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 48, i26, 196088);
                if (content.m90799i()) {
                    jM125372X0 = AbstractC25012a.m73366B(c28655q, -752293180, c38072d, c28655q, i18);
                    z16 = false;
                } else {
                    z16 = false;
                    c28655q.m87150e0(-752292095);
                    jM125372X0 = c38072d.m121949b(c28655q, i18).getWhite20();
                }
                c28655q.m87173q(z16);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7);
                TextResource textResourceM90794d = content.getCtaText();
                boolean zM90799i = content.m90799i();
                C13825t c13825tM48880a = AbstractC17269i.m48880a((float) 1.5d, jM125372X0);
                float f17 = f16 * f16;
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                z17 = z16;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i18).getTransparent(), jM125372X0, c38072d.m121949b(c28655q, i18).getTransparent(), c38072d.m121949b(c28655q, i18).getWhite20(), c28655q, 0, 0);
                boolean zM87153g = c28655q.m87153g(interfaceC2464x2);
                if (i17 == 256) {
                    z18 = true;
                } else {
                    z18 = z17;
                }
                boolean z25 = zM87153g | z18;
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        bVar = content;
                        if (c28655q.m87157i(bVar)) {
                        }
                        z24 = z25 | z19;
                        objM87133R5 = c28655q.m87133R();
                        if (!z24 || objM87133R5 == c28676v0) {
                            function1 = onViewEvent;
                            objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function1 = onViewEvent;
                        }
                        AbstractC27292z.m82343j(modifierM3398t2, zM90799i, false, null, null, null, textResourceM90794d, c15077m1M43196a, null, c13825tM48880a, f17, null, null, (InterfaceC4339a) objM87133R5, c28655q, (i27 << 18) | 6, 6, 6460);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                    } else {
                        bVar = content;
                    }
                    z19 = z17;
                    z24 = z25 | z19;
                    objM87133R5 = c28655q.m87133R();
                    if (z24) {
                        function1 = onViewEvent;
                        objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function1 = onViewEvent;
                        objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC27292z.m82343j(modifierM3398t2, zM90799i, false, null, null, null, textResourceM90794d, c15077m1M43196a, null, c13825tM48880a, f17, null, null, (InterfaceC4339a) objM87133R5, c28655q, (i27 << 18) | 6, 6, 6460);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                } else {
                    bVar = content;
                }
                z19 = true;
                z24 = z25 | z19;
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    function1 = onViewEvent;
                    objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function1 = onViewEvent;
                    objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC27292z.m82343j(modifierM3398t2, zM90799i, false, null, null, null, textResourceM90794d, c15077m1M43196a, null, c13825tM48880a, f17, null, null, (InterfaceC4339a) objM87133R5, c28655q, (i27 << 18) | 6, 6, 6460);
                c28655q = c28655q;
                c28655q.m87173q(true);
            } else {
                bVar = content;
                function1 = onViewEvent;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(bVar, modifier3, function1, i13, i14, 5);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, AbstractC22953f.m66720i(modifier3)));
            float f18 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f18), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            float f19 = 2;
            float f110 = f19 * f18;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f110, 7);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            i16 = i15;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            float f111 = 4;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f111, c2314t);
            AbstractC27274q.a aVar2 = AbstractC27274q.a.f109136f;
            c38072d = C38072d.f163053a;
            C27270o c27270o2 = new C27270o(aVar2, AbstractC18489d0.m53357C(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String string2 = new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, 0 == true ? 1 : 0).toString();
            i17 = i16 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C27207n(onViewEvent, 21);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C27207n(onViewEvent, 21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o2, string2, modifierM3419p2, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k | 384, 8);
            AbstractC18489d0.m53380u(f19, f111, c2314t, c28655q);
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C27207n(onViewEvent, 22);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C27207n(onViewEvent, 22);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC35283c.f150167E, c28655q, 0);
            i18 = C38072d.f163054b;
            C2886a c2886aM8437r2 = c38072d.m121952e(c28655q, i18).getH4();
            long jM125430y2 = c38072d.m121949b(c28655q, i18).getBrandWhite();
            C36775k c36775k2 = new C36775k(5);
            int i28 = C2886a.f11498d;
            int i29 = i28 << 18;
            AbstractC30795n.m94707h(strM21273g2, modifierM3362g2, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i29, 196088);
            c28655q.m87173q(true);
            TextResource textResourceM90798h2 = content.getTitle();
            int i210 = TextResource.$stable;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM90798h2, c28655q, i210), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f18, 7), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT3(), null, c28655q, 48, i29, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(content.getSubtitle(), c28655q, i210), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f110, 7), c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 48, i29, 196600);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.2d) * f18, c2314t));
            TextResource textResourceM90796f2 = content.getLabel();
            C2886a c2886aM8432m2 = c38072d.m121952e(c28655q, i18).getFormLabel();
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f111);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(content.getAdditionalText());
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C28376a(6);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            if (i17 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z15) {
                objM87133R4 = new C26957l(onViewEvent, 27);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C26957l(onViewEvent, 27);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC30792k.m94678l(null, textResourceM21278l2, null, textResourceM90796f2, c2886aM8432m2, null, null, null, textResourceM21267a2, false, false, null, 0L, false, 1, 0, 7, false, null, false, false, 0, false, null, null, c33252iM105489e2, null, null, null, null, interfaceC4339a2, (Function1) objM87133R4, c28655q, (i210 << 3) | (i210 << 9) | (i28 << 12) | (i210 << 24), 1597440, 0, 6, 1040105189, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(content.getBottomText(), c28655q, i210), AbstractC1099a.m3396r(c2314t, 0.0f, f110, 1), c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 48, i29, 196088);
            if (content.m90799i()) {
                jM125372X0 = AbstractC25012a.m73366B(c28655q, -752293180, c38072d, c28655q, i18);
                z16 = false;
            } else {
                z16 = false;
                c28655q.m87150e0(-752292095);
                jM125372X0 = c38072d.m121949b(c28655q, i18).getWhite20();
            }
            c28655q.m87173q(z16);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f110, 7);
            TextResource textResourceM90794d2 = content.getCtaText();
            boolean zM90799i2 = content.m90799i();
            C13825t c13825tM48880a2 = AbstractC17269i.m48880a((float) 1.5d, jM125372X0);
            float f112 = f111 * f111;
            C22976l1 c22976l2 = AbstractC15166v0.f56891a;
            z17 = z16;
            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i18).getTransparent(), jM125372X0, c38072d.m121949b(c28655q, i18).getTransparent(), c38072d.m121949b(c28655q, i18).getWhite20(), c28655q, 0, 0);
            boolean zM87153g2 = c28655q.m87153g(interfaceC2464x2);
            if (i17 == 256) {
                z18 = true;
            } else {
                z18 = z17;
            }
            boolean z26 = zM87153g2 | z18;
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    bVar = content;
                    if (c28655q.m87157i(bVar)) {
                    }
                    z24 = z26 | z19;
                    objM87133R5 = c28655q.m87133R();
                    if (z24) {
                        function1 = onViewEvent;
                        objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function1 = onViewEvent;
                        objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC27292z.m82343j(modifierM3398t4, zM90799i2, false, null, null, null, textResourceM90794d2, c15077m1M43196a2, null, c13825tM48880a2, f112, null, null, (InterfaceC4339a) objM87133R5, c28655q, (i210 << 18) | 6, 6, 6460);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                } else {
                    bVar = content;
                }
                z19 = z17;
                z24 = z26 | z19;
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    function1 = onViewEvent;
                    objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function1 = onViewEvent;
                    objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC27292z.m82343j(modifierM3398t4, zM90799i2, false, null, null, null, textResourceM90794d2, c15077m1M43196a2, null, c13825tM48880a2, f112, null, null, (InterfaceC4339a) objM87133R5, c28655q, (i210 << 18) | 6, 6, 6460);
                c28655q = c28655q;
                c28655q.m87173q(true);
            } else {
                bVar = content;
            }
            z19 = true;
            z24 = z26 | z19;
            objM87133R5 = c28655q.m87133R();
            if (z24) {
                function1 = onViewEvent;
                objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                c28655q.m87172p0(objM87133R5);
            } else {
                function1 = onViewEvent;
                objM87133R5 = new C26057j(interfaceC2464x2, function1, bVar, 12);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC27292z.m82343j(modifierM3398t4, zM90799i2, false, null, null, null, textResourceM90794d2, c15077m1M43196a2, null, c13825tM48880a2, f112, null, null, (InterfaceC4339a) objM87133R5, c28655q, (i210 << 18) | 6, 6, 6460);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            bVar = content;
            function1 = onViewEvent;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(bVar, modifier3, function1, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m86280E(Function1 function1) {
        function1.invoke(AbstractC24796a.b.f97045a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m86281F(Function1 function1) {
        function1.invoke(AbstractC24796a.b.f97045a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m86282G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m86283H(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC24796a.a(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m86284I(InterfaceC2464x2 interfaceC2464x2, Function1 function1, AbstractC29599b.b bVar) {
        if (interfaceC2464x2 != null) {
            ((C2463x1) interfaceC2464x2).m7442a();
        }
        function1.invoke(new AbstractC24796a.j(bVar.getAction(), bVar.getKey(), bVar.getAdditionalText()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m86285J(AbstractC29599b.b bVar, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m86279D(bVar, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    public static final void m86286K(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1069839099);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m86287L(int i13, Composer composer, int i14) {
        m86286K(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    public static final void m86288M(AbstractC29599b content, InterfaceC29603f.a viewState, Function1 onMenuItemClick, Function1 onCancelReasonSelected, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onMenuItemClick, "onMenuItemClick");
        AbstractC22676k.m65750j(onCancelReasonSelected, "onCancelReasonSelected");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1348730586);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(content) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onMenuItemClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onCancelReasonSelected) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q.m87138X();
        } else if (content.equals(AbstractC29599b.c.f120868a)) {
            c28655q.m87150e0(-613506704);
            m86307r(viewState, onMenuItemClick, null, c28655q, (i14 >> 3) & 126, 4);
            c28655q.m87173q(false);
        } else if (content instanceof AbstractC29599b.a) {
            c28655q.m87150e0(-613342001);
            int i15 = i14 & 14;
            int i16 = i14 >> 6;
            m86315z((AbstractC29599b.a) content, onCancelReasonSelected, onViewEvent, null, c28655q, i15 | (i16 & 112) | (i16 & 896), 8);
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else {
            if (!(content instanceof AbstractC29599b.b)) {
                throw AbstractC11895b.m32003v(950039579, c28655q, false);
            }
            c28655q.m87150e0(-613144531);
            m86279D((AbstractC29599b.b) content, null, onViewEvent, c28655q, (i14 & 14) | ((i14 >> 6) & 896), 2);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) content, (Object) viewState, (Object) onMenuItemClick, (Object) onCancelReasonSelected, (Object) onViewEvent, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m86289N(AbstractC29599b abstractC29599b, InterfaceC29603f.a aVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m86288M(abstractC29599b, aVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x0290  */
    /* JADX WARN: Code duplicated, block: B:91:0x029b  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    private static final void m86307r(InterfaceC29603f.a aVar, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        InterfaceC29603f.a aVar2;
        int i15;
        Modifier modifier2;
        boolean z4;
        boolean z13;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C29610m c29610mM90833q;
        List<C29600c> listM90872a;
        Modifier modifier5;
        boolean z14;
        boolean z15;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int i16;
        int iHashCode3;
        Function1 function2 = function1;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-480820694);
        if ((i13 & 6) == 0) {
            aVar2 = aVar;
            i15 = (c28655q2.m87157i(aVar2) ? 4 : 2) | i13;
        } else {
            aVar2 = aVar;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(function2) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            z4 = false;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 1.0f;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, modifier4));
                float f15 = 4;
                C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f15, c2305k, c28655q2, 6);
                f14 = f15;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                c29610mM90833q = aVar2.getOptionsConfig();
                if (c29610mM90833q != null) {
                    listM90872a = c29610mM90833q.m90872a();
                } else {
                    listM90872a = null;
                }
                if (listM90872a == null) {
                    c28655q2.m87150e0(359929774);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    z14 = true;
                } else {
                    c28655q2.m87150e0(359929775);
                    for (C29600c c29600c : listM90872a) {
                        float f16 = 2 * 8;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(f13, c2314t), f16, 0.0f, f16, 0.0f, 10);
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        zM87157i = z15 | c28655q2.m87157i(c29600c);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i || objM87133R == C28635l.f115821a) {
                            objM87133R = new C28448b(3, function2, c29600c);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        C38072d c38072d = C38072d.f163053a;
                        int i18 = C38072d.f163054b;
                        float f17 = f14;
                        Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3362g, 1, f17, c38072d.m121949b(c28655q2, i18).getWhite10());
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM95629e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i3 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a);
                        C0209i c0209i4 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m2);
                        c0209i2 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            i16 = i15;
                        } else {
                            i16 = i15;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            }
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                            Modifier modifierM3394p = AbstractC1099a.m3394p(f16, c2314t);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                            Modifier modifier6 = modifier4;
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                            c28655q2.m87158i0();
                            C2305k c2305k2 = c2305k;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j2);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m3);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                            String upperCase = AbstractC8693b.m21275i(c29600c.getLabel(), c28655q2, 0).toUpperCase(Locale.ROOT);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            C28655q c28655q3 = c28655q2;
                            AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getH4(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(true);
                            function2 = function1;
                            i15 = i16;
                            f14 = f17;
                            c2314t = c2314t;
                            modifier4 = modifier6;
                            c28655q2 = c28655q3;
                            c2305k = c2305k2;
                            f13 = 1.0f;
                            z4 = false;
                        }
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                        Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16, c2314t);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        Modifier modifier7 = modifier4;
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                        c28655q2.m87158i0();
                        C2305k c2305k3 = c2305k;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N4);
                        String upperCase2 = AbstractC8693b.m21275i(c29600c.getLabel(), c28655q2, 0).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        C28655q c28655q4 = c28655q2;
                        AbstractC30795n.m94707h(upperCase2, null, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getH4(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(true);
                        function2 = function1;
                        i15 = i16;
                        f14 = f17;
                        c2314t = c2314t;
                        modifier4 = modifier7;
                        c28655q2 = c28655q4;
                        c2305k = c2305k3;
                        f13 = 1.0f;
                        z4 = false;
                    }
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    z14 = true;
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z14);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(aVar, function1, modifier3, i13, i14, 4);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        z4 = false;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            f13 = 1.0f;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, modifier4));
            float f18 = 4;
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(3, f18, c2305k, c28655q2, 6);
            f14 = f18;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
            c29610mM90833q = aVar2.getOptionsConfig();
            if (c29610mM90833q != null) {
                listM90872a = c29610mM90833q.m90872a();
            } else {
                listM90872a = null;
            }
            if (listM90872a == null) {
                c28655q2.m87150e0(359929774);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                modifier5 = modifier4;
                z14 = true;
            } else {
                c28655q2.m87150e0(359929775);
                while (r31.hasNext()) {
                    float f19 = 2 * 8;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(f13, c2314t), f19, 0.0f, f19, 0.0f, 10);
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    zM87157i = z15 | c28655q2.m87157i(c29600c);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new C28448b(3, function2, c29600c);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C28448b(3, function2, c29600c);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3398t2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i19 = C38072d.f163054b;
                    float f110 = f14;
                    Modifier modifierM95629e2 = AbstractC31061c.m95629e(modifierM3362g2, 1, f110, c38072d2.m121949b(c28655q2, i19).getWhite10());
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM95629e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i7 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c22994r1M66759a2);
                    C0209i c0209i8 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m6);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        i16 = i15;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        }
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                        Modifier modifierM3394p3 = AbstractC1099a.m3394p(f19, c2314t);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                        Modifier modifier8 = modifier4;
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                        c28655q2.m87158i0();
                        C2305k c2305k4 = c2305k;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m7);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N7);
                        String upperCase3 = AbstractC8693b.m21275i(c29600c.getLabel(), c28655q2, 0).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                        C28655q c28655q5 = c28655q2;
                        AbstractC30795n.m94707h(upperCase3, null, c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getH4(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(true);
                        function2 = function1;
                        i15 = i16;
                        f14 = f110;
                        c2314t = c2314t;
                        modifier4 = modifier8;
                        c28655q2 = c28655q5;
                        c2305k = c2305k4;
                        f13 = 1.0f;
                        z4 = false;
                    } else {
                        i16 = i15;
                    }
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N6);
                    Modifier modifierM3394p4 = AbstractC1099a.m3394p(f19, c2314t);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                    Modifier modifier9 = modifier4;
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3394p4);
                    c28655q2.m87158i0();
                    C2305k c2305k5 = c2305k;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N8);
                    String upperCase4 = AbstractC8693b.m21275i(c29600c.getLabel(), c28655q2, 0).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                    C28655q c28655q6 = c28655q2;
                    AbstractC30795n.m94707h(upperCase4, null, c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getH4(), null, c28655q6, 0, C2886a.f11498d << 18, 196602);
                    c28655q6.m87173q(true);
                    c28655q6.m87173q(true);
                    function2 = function1;
                    i15 = i16;
                    f14 = f110;
                    c2314t = c2314t;
                    modifier4 = modifier9;
                    c28655q2 = c28655q6;
                    c2305k = c2305k5;
                    f13 = 1.0f;
                    z4 = false;
                }
                c28655q = c28655q2;
                modifier5 = modifier4;
                z14 = true;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z14);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(aVar, function1, modifier3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m86308s(Function1 function1, C29600c c29600c) {
        function1.invoke(new AbstractC24796a.c(c29600c.getAction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m86309t(InterfaceC29603f.a aVar, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m86307r(aVar, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final void m86310u(final InterfaceC29602e modal, final Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modal, "modal");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1002511135);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(modal) : c28655q.m87157i(modal) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        boolean z4 = true;
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (modal.equals(InterfaceC29602e.b.f120878a)) {
            c28655q.m87150e0(-1340518929);
            m86286K(c28655q, 0);
            c28655q.m87173q(false);
        } else {
            boolean z13 = modal instanceof InterfaceC29602e.c;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13) {
                c28655q.m87150e0(-1340516756);
                InterfaceC29602e.c cVar = (InterfaceC29602e.c) modal;
                TextResource textResourceM90812c = cVar.getTitle();
                TextResource textResourceM90811b = cVar.getSupportText();
                boolean z14 = (i14 & 112) == 32;
                if ((i14 & 14) != 4 && ((i14 & 8) == 0 || !c28655q.m87157i(modal))) {
                    z4 = false;
                }
                boolean z15 = z14 | z4;
                Object objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    final int i16 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: ox2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return AbstractC28459e.m86311v(onViewEvent, modal);
                                default:
                                    return AbstractC28459e.m86312w(onViewEvent, modal);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                int i17 = TextResource.$stable;
                AbstractC22926c.m66679r(textResourceM90812c, textResourceM90811b, (InterfaceC4339a) objM87133R, c28655q, i17 | (i17 << 3), 0);
                c28655q.m87173q(false);
            } else if (modal instanceof InterfaceC29602e.d) {
                c28655q.m87150e0(1393840890);
                InterfaceC29602e.d dVar = (InterfaceC29602e.d) modal;
                TextResource textResourceM90814b = dVar.getTitle();
                TextResource textResourceM90813a = dVar.getSupportText();
                int i18 = TextResource.$stable;
                AbstractC22926c.m66683v(textResourceM90814b, textResourceM90813a, c28655q, i18 | (i18 << 3), 0);
                c28655q.m87173q(false);
            } else {
                if (!(modal instanceof InterfaceC29602e.a)) {
                    throw AbstractC11895b.m32003v(-1340519812, c28655q, false);
                }
                c28655q.m87150e0(1393987210);
                boolean z16 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(modal))) | ((i14 & 112) == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    final int i19 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: ox2.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC28459e.m86311v(onViewEvent, modal);
                                default:
                                    return AbstractC28459e.m86312w(onViewEvent, modal);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171715B, null, i15, 0 == true ? 1 : 0);
                z4 = (i14 & 896) == 256;
                Object objM87133R3 = c28655q.m87133R();
                if (z4 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C27207n(onNavEvent, 23);
                    c28655q.m87172p0(objM87133R3);
                }
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171716a, objArr6 == true ? 1 : 0, i15, objArr5 == true ? 1 : 0);
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171727l, objArr4 == true ? 1 : 0, i15, objArr3 == true ? 1 : 0);
                TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC39833e.f171729n, objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
                int i24 = TextResource.C8688b.f25889c;
                AbstractC22926c.m66675n(interfaceC4339a, c8688b, (InterfaceC4339a) objM87133R3, c8688b2, c8688b3, c8688b4, false, c28655q, (i24 << 3) | (i24 << 9) | (i24 << 12) | (i24 << 15), 64);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) modal, onViewEvent, (InterfaceC23459e) onNavEvent, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m86311v(Function1 function1, InterfaceC29602e interfaceC29602e) {
        function1.invoke(new AbstractC24796a.g(((InterfaceC29602e.c) interfaceC29602e).getCampaignId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m86312w(Function1 function1, InterfaceC29602e interfaceC29602e) {
        function1.invoke(new AbstractC24796a.g(((InterfaceC29602e.a) interfaceC29602e).getCampaignId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m86313x(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m86314y(InterfaceC29602e interfaceC29602e, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m86310u(interfaceC29602e, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0457  */
    /* JADX WARN: Code duplicated, block: B:103:0x0462  */
    /* JADX WARN: Code duplicated, block: B:105:0x0314 A[EDGE_INSN: B:105:0x0314->B:85:0x0314 BREAK  A[LOOP:0: B:55:0x01d5->B:84:0x02d2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01de  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x021a  */
    /* JADX WARN: Code duplicated, block: B:64:0x021c  */
    /* JADX WARN: Code duplicated, block: B:70:0x022d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0269  */
    /* JADX WARN: Code duplicated, block: B:74:0x026d  */
    /* JADX WARN: Code duplicated, block: B:79:0x028e  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0391  */
    /* JADX WARN: Code duplicated, block: B:89:0x039f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0409  */
    /* JADX WARN: Code duplicated, block: B:98:0x041f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: z */
    public static final void m86315z(AbstractC29599b.a aVar, Function1 onOptionSelected, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int i16;
        float f14;
        float f15;
        C28655q c28655q;
        float f16;
        Iterator<T> it;
        boolean zHasNext;
        C28676v0 c28676v0;
        C38072d c38072d;
        int i17;
        C28655q c28655q2;
        boolean z13;
        long jM125372X0;
        boolean z14;
        boolean zM87157i;
        Object objM87133R;
        C29605h c29605h;
        long jM95628d;
        boolean z15;
        boolean zM87157i2;
        Object objM87133R2;
        int i18;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        long jM95624D;
        AbstractC29599b.a content = aVar;
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(onOptionSelected, "onOptionSelected");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1458547517);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(content) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onOptionSelected) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onViewEvent) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, modifier4));
                Modifier modifier5 = modifier4;
                float f17 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f17), C2299e.f9110M, c28655q3, 6);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66722k);
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
                TextResource textResourceM90790h = content.getTitle();
                int i24 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM90790h, c28655q3, i24);
                C38072d c38072d2 = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                C2886a c2886aM8418P = c38072d2.m121952e(c28655q3, i25).getT3();
                long jM125430y = c38072d2.m121949b(c28655q3, i25).getBrandWhite();
                f13 = 1 * f17;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
                int i26 = C2886a.f11498d << 18;
                i16 = i15;
                f14 = 1.0f;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q3, 48, i26, 196600);
                f15 = 2 * f17;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getSubtitle(), c28655q3, i24), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), c38072d2.m121949b(c28655q3, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i25).getB1(), null, c28655q3, 48, i26, 196600);
                c28655q = c28655q3;
                f16 = ((float) 0.2d) * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                c28655q.m87150e0(-532819881);
                it = aVar.m90787e().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    c28676v0 = C28635l.f115821a;
                    if (zHasNext) {
                        break;
                    }
                    c29605h = (C29605h) it.next();
                    Modifier modifierM3409f = AbstractC1102d.m3409f(f14, c2314t);
                    if (c29605h.getIsSelected()) {
                        c28655q.m87150e0(1456207261);
                        jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    } else {
                        c28655q.m87150e0(1456208346);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3409f, 3, 4, jM95628d);
                    if ((i16 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i2 = c28655q.m87157i(c29605h) | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (!zM87157i2 || objM87133R2 == c28676v0) {
                        i18 = 1;
                        objM87133R2 = new C28448b(i18, onOptionSelected, c29605h);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        i18 = 1;
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    boolean z16 = i18;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f13, f15);
                    String strM21274h2 = AbstractC8693b.m21274h(c29605h.getValue(), c28655q, TextResource.$stable);
                    if (c29605h.getIsSelected()) {
                        c28655q.m87150e0(-1939203008);
                        jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack70();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1939202013);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3395q, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtM(), null, c28655q4, 0, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q4;
                    AbstractC18489d0.m53356B(c28655q, z16, c2314t, f16, c28655q);
                    f14 = 1.0f;
                }
                c28655q.m87173q(false);
                TextResource textResourceM90784b = aVar.getBottomText();
                int i27 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM90784b, c28655q, i27);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h3, AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1), c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                if (aVar.m90786d()) {
                    jM125372X0 = AbstractC25012a.m73366B(c28655q2, -532779837, c38072d, c28655q2, i17);
                    z13 = false;
                } else {
                    z13 = false;
                    c28655q2.m87150e0(-532778752);
                    jM125372X0 = c38072d.m121949b(c28655q2, i17).getWhite20();
                }
                c28655q2.m87173q(z13);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7);
                TextResource textResourceM90785c = aVar.getCtaText();
                boolean zM90786d = aVar.m90786d();
                C13825t c13825tM48880a = AbstractC17269i.m48880a((float) 1.5d, jM125372X0);
                float f18 = 4;
                float f19 = f18 * f18;
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                z14 = z13;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i17).getTransparent(), jM125372X0, c38072d.m121949b(c28655q2, i17).getTransparent(), c38072d.m121949b(c28655q2, i17).getWhite20(), c28655q2, 0, 0);
                if ((i16 & 896) == 256) {
                    z14 = true;
                }
                content = aVar;
                zM87157i = z14 | c28655q2.m87157i(content);
                objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C28448b(2, onViewEvent, content);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM3398t2, zM90786d, false, null, null, null, textResourceM90785c, c15077m1M43196a, null, c13825tM48880a, f19, null, null, (InterfaceC4339a) objM87133R, c28655q2, (i27 << 18) | 6, 6, 6460);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q3.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) content, onOptionSelected, (InterfaceC23459e) onViewEvent, modifier3, i13, i14, 5);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, modifier4));
            Modifier modifier6 = modifier4;
            float f110 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f110), C2299e.f9110M, c28655q3, 6);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
            TextResource textResourceM90790h2 = content.getTitle();
            int i28 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM90790h2, c28655q3, i28);
            C38072d c38072d3 = C38072d.f163053a;
            int i29 = C38072d.f163054b;
            C2886a c2886aM8418P2 = c38072d3.m121952e(c28655q3, i29).getT3();
            long jM125430y2 = c38072d3.m121949b(c28655q3, i29).getBrandWhite();
            f13 = 1 * f110;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            int i210 = C2886a.f11498d << 18;
            i16 = i15;
            f14 = 1.0f;
            AbstractC30795n.m94707h(strM21274h4, modifierM3398t3, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q3, 48, i210, 196600);
            f15 = 2 * f110;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getSubtitle(), c28655q3, i28), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), c38072d3.m121949b(c28655q3, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q3, i29).getB1(), null, c28655q3, 48, i210, 196600);
            c28655q = c28655q3;
            f16 = ((float) 0.2d) * f110;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
            c28655q.m87150e0(-532819881);
            it = aVar.m90787e().iterator();
            while (true) {
                zHasNext = it.hasNext();
                c28676v0 = C28635l.f115821a;
                if (zHasNext) {
                    break;
                    break;
                }
                c29605h = (C29605h) it.next();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(f14, c2314t);
                if (c29605h.getIsSelected()) {
                    c28655q.m87150e0(1456207261);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(1456208346);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                Modifier modifierM95629e2 = AbstractC31061c.m95629e(modifierM3409f2, 3, 4, jM95628d);
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i2 = c28655q.m87157i(c29605h) | z15;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    i18 = 1;
                    objM87133R2 = new C28448b(i18, onOptionSelected, c29605h);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    i18 = 1;
                    objM87133R2 = new C28448b(i18, onOptionSelected, c29605h);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM95629e2, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                boolean z17 = i18;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(c2314t, f13, f15);
                String strM21274h5 = AbstractC8693b.m21274h(c29605h.getValue(), c28655q, TextResource.$stable);
                if (c29605h.getIsSelected()) {
                    c28655q.m87150e0(-1939203008);
                    jM95624D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack70();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1939202013);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                C28655q c28655q5 = c28655q;
                AbstractC30795n.m94707h(strM21274h5, modifierM3395q2, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtM(), null, c28655q5, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q5;
                AbstractC18489d0.m53356B(c28655q, z17, c2314t, f16, c28655q);
                f14 = 1.0f;
            }
            c28655q.m87173q(false);
            TextResource textResourceM90784b2 = aVar.getBottomText();
            int i211 = TextResource.$stable;
            String strM21274h6 = AbstractC8693b.m21274h(textResourceM90784b2, c28655q, i211);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM21274h6, AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1), c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
            if (aVar.m90786d()) {
                jM125372X0 = AbstractC25012a.m73366B(c28655q2, -532779837, c38072d, c28655q2, i17);
                z13 = false;
            } else {
                z13 = false;
                c28655q2.m87150e0(-532778752);
                jM125372X0 = c38072d.m121949b(c28655q2, i17).getWhite20();
            }
            c28655q2.m87173q(z13);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7);
            TextResource textResourceM90785c2 = aVar.getCtaText();
            boolean zM90786d2 = aVar.m90786d();
            C13825t c13825tM48880a2 = AbstractC17269i.m48880a((float) 1.5d, jM125372X0);
            float f111 = 4;
            float f112 = f111 * f111;
            C22976l1 c22976l2 = AbstractC15166v0.f56891a;
            z14 = z13;
            C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i17).getTransparent(), jM125372X0, c38072d.m121949b(c28655q2, i17).getTransparent(), c38072d.m121949b(c28655q2, i17).getWhite20(), c28655q2, 0, 0);
            if ((i16 & 896) == 256) {
                z14 = true;
            }
            content = aVar;
            zM87157i = z14 | c28655q2.m87157i(content);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R = new C28448b(2, onViewEvent, content);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C28448b(2, onViewEvent, content);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3398t4, zM90786d2, false, null, null, null, textResourceM90785c2, c15077m1M43196a2, null, c13825tM48880a2, f112, null, null, (InterfaceC4339a) objM87133R, c28655q2, (i211 << 18) | 6, 6, 6460);
            c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q3.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) content, onOptionSelected, (InterfaceC23459e) onViewEvent, modifier3, i13, i14, 5);
        }
    }
}
