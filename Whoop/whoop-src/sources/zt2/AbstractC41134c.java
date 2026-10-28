package zt2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;
import yo1.C39689b;
import z51.C40103n;
import zm1.C40893d;

/* JADX INFO: renamed from: zt2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lzt2/b;", "addGoalCardItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lzt2/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41134c {
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m133552e(C41133b addGoalCardItemState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        boolean z13;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(addGoalCardItemState, "addGoalCardItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1483820145);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(addGoalCardItemState) : c28655q.m87157i(addGoalCardItemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
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
                z4 = false;
                if ((i15 & 147) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C40893d(13);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    float f13 = 4;
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(14 * f13, modifier4));
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(addGoalCardItemState))) {
                        z4 = true;
                    }
                    z15 = z14 | z4;
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C39689b(24, function4, addGoalCardItemState);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, c33252iM105489e, null, null, 0.0f, AbstractC37817c.m121344e(1856435937, c28655q, new C37888f1(modifier4, addGoalCardItemState)), c28655q, 12582912, 118);
                    modifier3 = modifier4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C40103n(addGoalCardItemState, modifier3, function3, i13, i14, 13);
                }
            }
            i15 |= 384;
            function2 = function1;
            z4 = false;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40893d(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f14 = 4;
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(14 * f14, modifier4));
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                z15 = z14 | z4;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C39689b(24, function4, addGoalCardItemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C39689b(24, function4, addGoalCardItemState);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, c33252iM105489e2, null, null, 0.0f, AbstractC37817c.m121344e(1856435937, c28655q, new C37888f1(modifier4, addGoalCardItemState)), c28655q, 12582912, 118);
                modifier3 = modifier4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(addGoalCardItemState, modifier3, function3, i13, i14, 13);
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
            z4 = false;
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40893d(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f15 = 4;
                C33252i c33252iM105489e3 = AbstractC33253j.m105489e(3 * f15);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(14 * f15, modifier4));
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                z15 = z14 | z4;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C39689b(24, function4, addGoalCardItemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C39689b(24, function4, addGoalCardItemState);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f3, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, c33252iM105489e3, null, null, 0.0f, AbstractC37817c.m121344e(1856435937, c28655q, new C37888f1(modifier4, addGoalCardItemState)), c28655q, 12582912, 118);
                modifier3 = modifier4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(addGoalCardItemState, modifier3, function3, i13, i14, 13);
            }
        }
        i15 |= 384;
        function2 = function1;
        z4 = false;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40893d(13);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f16 = 4;
            C33252i c33252iM105489e4 = AbstractC33253j.m105489e(3 * f16);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(14 * f16, modifier4));
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 14) != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            z15 = z14 | z4;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C39689b(24, function4, addGoalCardItemState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C39689b(24, function4, addGoalCardItemState);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f4, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, c33252iM105489e4, null, null, 0.0f, AbstractC37817c.m121344e(1856435937, c28655q, new C37888f1(modifier4, addGoalCardItemState)), c28655q, 12582912, 118);
            modifier3 = modifier4;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(addGoalCardItemState, modifier3, function3, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m133553f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m133554g(Function1 function1, C41133b c41133b) {
        function1.invoke(c41133b.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m133555h(Modifier modifier, C41133b c41133b, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2306l c2306l = C2299e.f9108K;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c41133b.getLeftIcon().getIcon(), c28655q, 6);
            TextResource contentDescription = c41133b.getLeftIcon().getContentDescription();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(contentDescription, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long white30 = c38072d.m121949b(c28655q, i15).getWhite30();
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            float f14 = 4 * 6;
            AbstractC15005f3.m43108b(c27430eM107874S, strM21274h, AbstractC1102d.m3411h(f14, AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2)), white30, c28655q, 384, 0);
            String strM21274h2 = AbstractC8693b.m21274h(c41133b.getTitle(), c28655q, i14);
            C2886a h7 = AbstractC2890e.m8450e().getH4();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c41133b.getRightIcon().getIcon(), c28655q, 6), AbstractC8693b.m21274h(c41133b.getRightIcon().getContentDescription(), c28655q, i14), AbstractC1102d.m3411h(f14, AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2)), c38072d.m121949b(c28655q, i15).getBrandWhite(), c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m133556i(C41133b c41133b, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m133552e(c41133b, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
