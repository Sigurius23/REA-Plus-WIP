package ov2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import gy0.AbstractC16276e;
import java.util.Iterator;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15166v0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ov2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lov2/a;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onShowMoreClicked", "d", "(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "onClick", "g", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28403g {
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[LOOP:0: B:63:0x010e->B:65:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0204  */
    /* JADX WARN: Code duplicated, block: B:87:0x020f  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m86123d(Modifier modifier, C28397a viewState, Function1 function1, InterfaceC4339a onShowMoreClicked, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Iterator<T> it;
        C2314t c2314t2;
        float f14;
        boolean z13;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        Object objM87133R;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onShowMoreClicked, "onShowMoreClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-685156520);
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
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onShowMoreClicked)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C28402f(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                f13 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
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
                c28655q.m87150e0(765998822);
                it = viewState.m86090a().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i16 << 3) & 7168, 6);
                    c2314t = c2314t;
                    f13 = f13;
                }
                c2314t2 = c2314t;
                f14 = f13;
                Function1 function5 = function4;
                c28655q.m87173q(false);
                if (viewState.getIsShowMoreEnabled()) {
                    c28655q.m87150e0(-2023710991);
                    m86126g(onShowMoreClicked, c28655q, (i16 >> 9) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2023646604);
                    c28655q.m87173q(false);
                }
                if (viewState.getIsLoadingMore()) {
                    c28655q.m87150e0(-2023594834);
                    Modifier modifierM3411h = AbstractC1102d.m3411h(f14 * 4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 0.0f, 0.0f, 3 * f14, 7));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
                    z13 = true;
                    AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z13 = true;
                    c28655q.m87150e0(-2023189292);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                modifier3 = modifier2;
                function3 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) modifier3, (Object) viewState, function3, (InterfaceC23459e) onShowMoreClicked, i13, i14, 3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onShowMoreClicked)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            if (i19 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28402f(0);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            f13 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            c28655q.m87150e0(765998822);
            it = viewState.m86090a().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i16 << 3) & 7168, 6);
                c2314t = c2314t;
                f13 = f13;
            }
            c2314t2 = c2314t;
            f14 = f13;
            Function1 function6 = function4;
            c28655q.m87173q(false);
            if (viewState.getIsShowMoreEnabled()) {
                c28655q.m87150e0(-2023710991);
                m86126g(onShowMoreClicked, c28655q, (i16 >> 9) & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2023646604);
                c28655q.m87173q(false);
            }
            if (viewState.getIsLoadingMore()) {
                c28655q.m87150e0(-2023594834);
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(f14 * 4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 0.0f, 0.0f, 3 * f14, 7));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
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
                z13 = true;
                AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                c28655q.m87150e0(-2023189292);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            modifier3 = modifier2;
            function3 = function6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) modifier3, (Object) viewState, function3, (InterfaceC23459e) onShowMoreClicked, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m86124e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m86125f(Modifier modifier, C28397a c28397a, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m86123d(modifier, c28397a, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m86126g(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1039500279);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35402K1);
            C38072d c38072d = C38072d.f163053a;
            int iM46492g = c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown();
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8438s = c38072d.m121952e(c28655q, i15).getH5();
            float f13 = 8;
            float f14 = 1 * f13;
            float f15 = ((float) 1.5d) * f13;
            c28655q = c28655q;
            AbstractC27292z.m82343j(modifierM3409f, false, false, Integer.valueOf(iM46492g), null, null, c8688bM21277k, AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i15).getWhite10(), c38072d.m121949b(c28655q, i15).getBrandWhite(), c38072d.m121949b(c28655q, i15).getWhite10(), c38072d.m121949b(c28655q, i15).getWhite20(), c28655q, 0, 0), null, null, 2 * 4, new C22976l1(f14, f15, f14, f15), c2886aM8438s, interfaceC4339a, c28655q, (TextResource.C8688b.f25889c << 18) | 6, (C2886a.f11498d << 6) | 54 | ((i14 << 9) & 7168), 822);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 15, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m86127h(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m86126g(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
