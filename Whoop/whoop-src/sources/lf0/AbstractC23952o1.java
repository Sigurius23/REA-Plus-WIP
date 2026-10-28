package lf0;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15674c;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import java.util.Iterator;
import java.util.List;
import jt1.C21937b;
import l72.C23401h;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23858q;
import m83.AbstractC25265s;
import md0.AbstractC25448c;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p636y3.C39174f;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.o1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0014²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lld0/q;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isExpanded", "hasMoreItems", "Ly3/f;", "fadeHeight", "", "Lm91/u;", "itemsToShow", "", "caretRotation", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23952o1 {
    /* JADX WARN: Code duplicated, block: B:100:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x0306  */
    /* JADX WARN: Code duplicated, block: B:106:0x031a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0325  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Code duplicated, block: B:90:0x021c A[LOOP:0: B:88:0x0216->B:90:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0249  */
    /* JADX WARN: Code duplicated, block: B:95:0x0268  */
    /* JADX WARN: Code duplicated, block: B:97:0x026f  */
    /* JADX INFO: renamed from: f */
    public static final void m70562f(Modifier modifier, C23858q viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int i16;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87149e;
        Object objM87133R2;
        InterfaceC28670t2 interfaceC28670t2;
        float f13;
        int i17;
        boolean zM87153g;
        Object objM87133R3;
        float f14;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Iterator<T> it;
        TextResource textResourceM70100b;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1083333895);
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                i16 = 14;
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C23825g(i16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87149e = c28655q.m87149e(viewState.m70101c().size()) | c28655q.m87149e(viewState.getItemsShownCollapsed());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87264r(new C19683b(viewState, 26));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R2;
                if (m70566j(interfaceC28601c1) && m70569m(interfaceC28670t2)) {
                    f13 = 200;
                } else {
                    f13 = 0;
                }
                i17 = i15;
                InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, c28655q, 48, 12);
                c28655q = c28655q;
                zM87153g = c28655q.m87153g(viewState.m70101c()) | c28655q.m87149e(viewState.getItemsShownCollapsed());
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new C18656a0(viewState, interfaceC28601c1, interfaceC28670t2, 21));
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R3;
                if (m70566j(interfaceC28601c1)) {
                    f14 = -180.0f;
                } else {
                    f14 = 0.0f;
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                Modifier modifierM44081e = AbstractC15674c.m44081e(AbstractC1091c.m3355a(c2314t, AbstractC11348f.m30574v(300, 0, null, 6), 2), m70570n(interfaceC28670t2M30587a));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(20), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44081e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(923530830);
                it = m70572p(interfaceC28670t3).iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC25448c.m74678B0(), null, function4, c28655q, (C25307p.f99300b << 3) | ((i17 << 3) & 7168), 4);
                }
                Function1 function5 = function4;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                if (m70569m(interfaceC28670t2)) {
                    c28655q.m87150e0(-1672043128);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
                    if (m70566j(interfaceC28601c1)) {
                        textResourceM70100b = viewState.getCollapseButtonTitle();
                    } else {
                        textResourceM70100b = viewState.getExpandButtonTitle();
                    }
                    TextResource textResource = textResourceM70100b;
                    C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i24).getWhite10(), c38072d.m121949b(c28655q, i24).getBrandWhite(), c38072d.m121949b(c28655q, i24).getWhite10(), c38072d.m121949b(c28655q, i24).getWhite20(), c28655q, 0, 0);
                    Integer numValueOf = Integer.valueOf(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown());
                    Modifier modifierM5375L = AbstractC1772c1.m5375L(m70573q(interfaceC28670t2M30588b), c2314t);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21937b(14, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27271o0.m82253b(modifierM3398t, false, textResource, null, c15077m1M43196a, null, numValueOf, modifierM5375L, false, null, (InterfaceC4339a) objM87133R4, c28655q, (TextResource.$stable << 6) | 196614, 6, 778);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1671277211);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 17, (Object) modifier3, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            i16 = 14;
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C23825g(i16);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87149e = c28655q.m87149e(viewState.m70101c().size()) | c28655q.m87149e(viewState.getItemsShownCollapsed());
            objM87133R2 = c28655q.m87133R();
            if (zM87149e) {
                objM87133R2 = AbstractC28683x.m87264r(new C19683b(viewState, 26));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC28683x.m87264r(new C19683b(viewState, 26));
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R2;
            if (m70566j(interfaceC28601c1)) {
                f13 = 0;
            } else {
                f13 = 0;
            }
            i17 = i15;
            InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, c28655q, 48, 12);
            c28655q = c28655q;
            zM87153g = c28655q.m87153g(viewState.m70101c()) | c28655q.m87149e(viewState.getItemsShownCollapsed());
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = AbstractC28683x.m87264r(new C18656a0(viewState, interfaceC28601c1, interfaceC28670t2, 21));
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87264r(new C18656a0(viewState, interfaceC28601c1, interfaceC28670t2, 21));
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R3;
            if (m70566j(interfaceC28601c1)) {
                f14 = -180.0f;
            } else {
                f14 = 0.0f;
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f14, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
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
            Modifier modifierM44081e2 = AbstractC15674c.m44081e(AbstractC1091c.m3355a(c2314t, AbstractC11348f.m30574v(300, 0, null, 6), 2), m70570n(interfaceC28670t2M30587a2));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(20), c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44081e2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            c28655q.m87150e0(923530830);
            it = m70572p(interfaceC28670t4).iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC25448c.m74678B0(), null, function4, c28655q, (C25307p.f99300b << 3) | ((i17 << 3) & 7168), 4);
            }
            Function1 function6 = function4;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (m70569m(interfaceC28670t2)) {
                c28655q.m87150e0(-1672043128);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
                if (m70566j(interfaceC28601c1)) {
                    textResourceM70100b = viewState.getCollapseButtonTitle();
                } else {
                    textResourceM70100b = viewState.getExpandButtonTitle();
                }
                TextResource textResource2 = textResourceM70100b;
                C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                C38072d c38072d2 = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                C15077m1 c15077m1M43196a2 = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q, i25).getWhite10(), c38072d2.m121949b(c28655q, i25).getBrandWhite(), c38072d2.m121949b(c28655q, i25).getWhite10(), c38072d2.m121949b(c28655q, i25).getWhite20(), c28655q, 0, 0);
                Integer numValueOf2 = Integer.valueOf(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown());
                Modifier modifierM5375L2 = AbstractC1772c1.m5375L(m70573q(interfaceC28670t2M30588b), c2314t);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C21937b(14, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27271o0.m82253b(modifierM3398t2, false, textResource2, null, c15077m1M43196a2, null, numValueOf2, modifierM5375L2, false, null, (InterfaceC4339a) objM87133R4, c28655q, (TextResource.$stable << 6) | 196614, 6, 778);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1671277211);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 17, (Object) modifier3, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70563g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m70564h(InterfaceC28601c1 interfaceC28601c1) {
        m70567k(interfaceC28601c1, !m70566j(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m70565i(Modifier modifier, C23858q c23858q, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70562f(modifier, c23858q, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m70566j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m70567k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m70568l(C23858q c23858q) {
        return c23858q.m70101c().size() > c23858q.getItemsShownCollapsed();
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m70569m(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    private static final float m70570n(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final List m70571o(C23858q c23858q, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2) {
        return (m70566j(interfaceC28601c1) || !m70569m(interfaceC28670t2)) ? c23858q.m70101c() : AbstractC25265s.m74156w1(c23858q.m70101c(), c23858q.getItemsShownCollapsed());
    }

    /* JADX INFO: renamed from: p */
    private static final List<InterfaceC25312u> m70572p(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final float m70573q(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }
}
