package zi0;

import a81.C0559j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material3.pulltorefresh.PullToRefreshElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bj0.C3328a;
import c93.InterfaceC4339a;
import com.whoop.bot.settings.C6077g;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.models.ApiRequest;
import cp0.C10954e0;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import e93.AbstractC12889b;
import ep0.C13404j;
import fc0.C14362f;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gb1.AbstractC15684l;
import is0.C20885h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.C23465k;
import mq2.C25888a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23001u;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p330n1.AbstractC26108h;
import p330n1.C26107g;
import p330n1.C26115o;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p664yy.C39850b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p739ui0.AbstractC35005g;
import p739ui0.AbstractC35014p;
import p748zc1.C40349h7;
import r71.AbstractC31052b;
import r80.AbstractC31061c;
import ri0.C31442a;
import ri0.C31446e;
import ri0.InterfaceC31443b;
import ti0.AbstractC33844i;
import ti0.AbstractC33846k;
import ti0.C33840e;
import ti0.C33842g;
import ti0.EnumC33847l;
import vv2.C36538d;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.AbstractC38073e;
import xi0.AbstractC38319a;
import yo1.C39689b;
import z51.C40103n;

/* JADX INFO: renamed from: zi0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"&\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006&²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010#\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010%\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lti0/e;", "contentState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "action", "Landroidx/compose/ui/Modifier;", "contentModifier", "r", "(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lm91/o;", "itemWrapper", "", "onEvent", "o", "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "fadeRampPx", "L", "(IIF)F", "Ly3/f;", "a", "F", "navBarBlurFadeRamp", "", "Ll83/k;", "b", "[Ll83/k;", "navBarScrimStops", "", "isToolbarTransparent", "navBarBlurProgress", "heroHeight", "scrollOffset", "itemHeight", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40662a {

    /* JADX INFO: renamed from: a */
    private static final float f175572a = 50;

    /* JADX INFO: renamed from: b */
    private static final C23465k[] f175573b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.55f);
        f175573b = new C23465k[]{new C23465k(fValueOf, fValueOf2), new C23465k(Float.valueOf(0.65f), fValueOf2), new C23465k(Float.valueOf(0.7f), Float.valueOf(0.52f)), new C23465k(Float.valueOf(0.75f), Float.valueOf(0.5f)), new C23465k(Float.valueOf(1.0f), fValueOf)};
    }

    /* JADX INFO: renamed from: A */
    private static final float m131945A(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m131946B(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m131981y(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m131947C(C33840e c33840e, C33842g c33842g, float f13, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = c33840e.m107022d().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C6077g(f13, (C31446e.a) it.next(), function1), true, 1773430579), 3);
        }
        if (c33842g != null) {
            InterfaceC26064q.m77556b(LazyColumn, "pagination_control", new C37816b(new C36538d(20, c33842g, function1), true, 884391444), 2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m131948D(float f13, C31446e.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC28683x.m87247a(AbstractC31052b.m95599z().mo86977a(new C39174f(f13)), AbstractC37817c.m121344e(320191091, c28655q, new C37888f1(13, aVar, function1)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m131949E(C31446e.a aVar, Function1 function1, Composer composer, int i13) {
        C2314t c2314t;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87150e0(-1534004302);
            Iterator<T> it = aVar.m96825a().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2314t = C2314t.f9131w;
                if (!zHasNext) {
                    break;
                }
                C25306o c25306o = (C25306o) it.next();
                boolean zM87153g = c28655q.m87153g(c25306o);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q);
                }
                InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                boolean zM87153g2 = c28655q.m87153g(interfaceC28593a1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C14362f(interfaceC28593a1, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3502b = AbstractC1132b.m3502b(c2314t, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3502b);
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
                boolean zM87153g3 = c28655q.m87153g(function1) | c28655q.m87157i(c25306o);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C0559j(function1, c25306o, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                m131971o(c25306o, (Function1) objM87133R3, c28655q, C25306o.f99297c, 0);
                c28655q.m87173q(true);
                if (m131950F(interfaceC28593a1) > 0) {
                    c28655q.m87150e0(-829408377);
                    float f13 = 4;
                    AbstractC25012a.m73388u(f13, f13, c2314t, c28655q, false);
                } else {
                    c28655q.m87150e0(-829289213);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getSectionType().getSpacing(), c2314t));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final int m131950F(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: G */
    private static final void m131951G(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m131952H(InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        m131951G(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m131953I(Function1 function1, C25306o c25306o, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC31443b.j(it, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m131954J(C33842g c33842g, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC40664c.m131987e(c33842g, function1, c28655q, ApiRequest.$stable);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m131955K(C33840e c33840e, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m131974r(c33840e, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public static final float m131956L(int i13, int i14, float f13) {
        if (i13 > 0) {
            return 1.0f;
        }
        return AbstractC12889b.m36283m(i14 / f13, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: o */
    public static final void m131971o(C25306o itemWrapper, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(itemWrapper, "itemWrapper");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1903790033);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(itemWrapper) : c28655q.m87157i(itemWrapper) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40349h7(18);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            AbstractC25303l.m74290q(itemWrapper, null, null, function3, c28655q, C25306o.f99297c | (i15 & 14) | ((i15 << 6) & 7168), 6);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3328a(itemWrapper, function2, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m131972p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m131973q(C25306o c25306o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m131971o(c25306o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253  */
    /* JADX WARN: Code duplicated, block: B:103:0x0260  */
    /* JADX WARN: Code duplicated, block: B:105:0x026e  */
    /* JADX WARN: Code duplicated, block: B:108:0x027c  */
    /* JADX WARN: Code duplicated, block: B:109:0x029b  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:118:0x02db  */
    /* JADX WARN: Code duplicated, block: B:122:0x0327  */
    /* JADX WARN: Code duplicated, block: B:125:0x0334  */
    /* JADX WARN: Code duplicated, block: B:128:0x033f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0348  */
    /* JADX WARN: Code duplicated, block: B:132:0x036d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0371  */
    /* JADX WARN: Code duplicated, block: B:136:0x037e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0390  */
    /* JADX WARN: Code duplicated, block: B:143:0x039d  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:148:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x040f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0411  */
    /* JADX WARN: Code duplicated, block: B:159:0x041e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0422  */
    /* JADX WARN: Code duplicated, block: B:164:0x0462  */
    /* JADX WARN: Code duplicated, block: B:166:0x0488 A[LOOP:0: B:165:0x0486->B:166:0x0488, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x0503  */
    /* JADX WARN: Code duplicated, block: B:172:0x0528  */
    /* JADX WARN: Code duplicated, block: B:174:0x0538  */
    /* JADX WARN: Code duplicated, block: B:177:0x0542  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x021a  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v12, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v16, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v13, types: [n1.g] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public static final void m131974r(C33840e contentState, Function1 action, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z4;
        Modifier modifier3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Modifier modifier5;
        C31442a c31442aM107021c;
        boolean z13;
        Object objM87133R;
        int i16;
        C28676v0 c28676v0;
        Object obj;
        InterfaceC28670t2 interfaceC28670t2;
        C26068u c26068uM77569a;
        C33842g c33842gM107025g;
        float fMo743q0;
        boolean zM87153g;
        Object obj2;
        InterfaceC28670t2 interfaceC28670t3;
        boolean zM107036a;
        boolean zM107037b;
        Object objM87133R2;
        Object obj3;
        C26115o c26115o;
        C13404j c13404jM107028j;
        boolean z14;
        boolean zIsFeatureEnabled;
        InterfaceC22973k1 interfaceC22973k1M107023e;
        C13404j c13404jM107028j2;
        C13404j c13404j;
        C26068u c26068u;
        float fM3387i;
        int i17;
        boolean z15;
        boolean zM87157i;
        int i18;
        Object obj4;
        int iHashCode;
        C0213j c0213j;
        int i19;
        C0209i c0209i;
        int i24;
        Modifier modifierM44121e;
        int iHashCode2;
        Modifier modifier6;
        AbstractC22403o abstractC22403oM107019a;
        InterfaceC23001u interfaceC23001u;
        Object objM87133R3;
        Object objM95646v;
        InterfaceC28593a1 interfaceC28593a1;
        Object objM87133R4;
        Object obj5;
        Object objM87133R5;
        Object obj6;
        C0213j c0213j2;
        C28676v0 c28676v1;
        float f13;
        int i25;
        ?? r10;
        ?? r15;
        Modifier modifierM44028b0;
        Modifier modifierMo3471e;
        Modifier modifierMo3471e2;
        int iHashCode3;
        Modifier modifier7;
        float f14;
        Function1 function1;
        Modifier modifierM44085i;
        ?? r16;
        int i26;
        Object objM87133R6;
        Object obj7;
        int i27;
        ?? r17;
        Modifier modifier8;
        InterfaceC2302h interfaceC2302h;
        ?? r18;
        C23465k[] c23465kArr;
        ArrayList arrayList;
        int length;
        ?? r19;
        int i28;
        List<C25306o> listM96776a;
        C2307m c2307m = C2299e.f9115x;
        AbstractC22676k.m65750j(contentState, "contentState");
        AbstractC22676k.m65750j(action, "action");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(486504675);
        int i29 = (i13 & 6) == 0 ? (c28655q.m87157i(contentState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i29 |= c28655q.m87157i(action) ? 32 : 16;
        }
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i29 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i15 = 1;
            if ((i29 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i29 & 1, z4)) {
                modifier4 = C2314t.f9131w;
                if (i34 != 0) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier2;
                }
                c31442aM107021c = contentState.getFooterState();
                if (c31442aM107021c == null && (listM96776a = c31442aM107021c.m96776a()) != null && (!listM96776a.isEmpty())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                i16 = 6;
                c28676v0 = C28635l.f115821a;
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    C28612f0 c28612f0M87264r = AbstractC28683x.m87264r(new C39850b0(contentState, i16));
                    c28655q.m87172p0(c28612f0M87264r);
                    obj = c28612f0M87264r;
                }
                interfaceC28670t2 = (InterfaceC28670t2) obj;
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                c33842gM107025g = contentState.getPaginationControlViewState();
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f175572a);
                zM87153g = c28655q.m87153g(c26068uM77569a);
                Object objM87133R7 = c28655q.m87133R();
                obj2 = objM87133R7;
                if (zM87153g || objM87133R7 == c28676v0) {
                    C28612f0 c28612f0M87264r2 = AbstractC28683x.m87264r(new C10954e0(c26068uM77569a, fMo743q0, i15));
                    c28655q.m87172p0(c28612f0M87264r2);
                    obj2 = c28612f0M87264r2;
                }
                interfaceC28670t3 = (InterfaceC28670t2) obj2;
                zM107036a = AbstractC33844i.m107036a(contentState.getPullToRefreshState());
                zM107037b = AbstractC33844i.m107037b(contentState.getPullToRefreshState());
                float f15 = AbstractC26108h.f103435a;
                Object[] objArr = new Object[0];
                objM87133R2 = c28655q.m87133R();
                obj3 = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    C25888a c25888a = new C25888a(20);
                    c28655q.m87172p0(c25888a);
                    obj3 = c25888a;
                }
                c26115o = (C26115o) AbstractC39038k.m124458d(objArr, C26115o.f103465b, (InterfaceC4339a) obj3, c28655q, 384);
                c13404jM107028j = contentState.getScreenContextMetadata();
                if (c13404jM107028j == null && c13404jM107028j.getIsWceEnabled() && z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("arch-v2-section-padding");
                interfaceC22973k1M107023e = contentState.getListPadding();
                if (!zIsFeatureEnabled) {
                    interfaceC22973k1M107023e = null;
                }
                if (interfaceC22973k1M107023e == null) {
                    float f16 = 2 * 8;
                    interfaceC22973k1M107023e = new C22976l1(f16, f16, f16, f16);
                }
                InterfaceC22973k1 interfaceC22973k1 = interfaceC22973k1M107023e;
                c13404jM107028j2 = contentState.getScreenContextMetadata();
                if (z13) {
                    c13404j = null;
                } else {
                    c13404j = c13404jM107028j2;
                }
                int i35 = C13404j.f46947x;
                c26068u = c26068uM77569a;
                InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(c13404j, interfaceC22973k1, false, c28655q, i35, 4);
                fM3387i = AbstractC1099a.m3387i(interfaceC22973k1, (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n));
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier4);
                i17 = i29 & 112;
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z15 | c28655q.m87157i(contentState);
                Object objM87133R8 = c28655q.m87133R();
                i18 = 14;
                obj4 = objM87133R8;
                if (zM87157i || objM87133R8 == c28676v0) {
                    C39689b c39689b = new C39689b(i18, action, contentState);
                    c28655q.m87172p0(c39689b);
                    obj4 = c39689b;
                }
                Modifier modifierMo3471e3 = modifierM3407d.mo3471e(new PullToRefreshElement(zM107037b, (InterfaceC4339a) obj4, zM107036a, c26115o, C26107g.f103432c));
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                i19 = i29;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i24 = i17;
                } else {
                    i24 = i17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM107049a = AbstractC33846k.m107049a(AbstractC1102d.m3407d(1.0f, modifier4), contentState.getBackgroundTheme(), c28655q, 6);
                    if (m131976t(interfaceC28670t2)) {
                        modifierM44121e = AbstractC15684l.m44121e(modifier4, 0.0f, 0.0f, m131978v(interfaceC28670t3), 3, null);
                    } else {
                        modifierM44121e = modifier4;
                    }
                    Modifier modifierMo3471e4 = modifierM107049a.mo3471e(modifierM44121e);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                    c28655q.m87158i0();
                    modifier6 = modifier4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    abstractC22403oM107019a = contentState.getBackgroundImage();
                    interfaceC23001u = C1100b.f4583a;
                    if (abstractC22403oM107019a == null) {
                        c28655q.m87150e0(-1452712519);
                        c28655q.m87173q(false);
                        c26068u = c26068u;
                        c0213j2 = c0213j;
                        r10 = 0;
                        c28676v1 = c28676v0;
                        f13 = 1.0f;
                        i25 = 32;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-1452712518);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM95646v = objM87133R3;
                            objM95646v = AbstractC31061c.m95646v(0, c28655q);
                        }
                        objM95646v = objM87133R3;
                        interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                        objM87133R4 = c28655q.m87133R();
                        obj5 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28612f0 c28612f0M87264r3 = AbstractC28683x.m87264r(new C39689b(15, c26068u, interfaceC28593a1));
                            c28655q.m87172p0(c28612f0M87264r3);
                            obj5 = c28612f0M87264r3;
                        }
                        float fM131945A = m131945A((InterfaceC28670t2) obj5);
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            C14362f c14362f = new C14362f(interfaceC28593a1, 18);
                            c28655q.m87172p0(c14362f);
                            obj6 = c14362f;
                        } else {
                            obj6 = objM87133R5;
                        }
                        c0213j2 = c0213j;
                        c28676v1 = c28676v0;
                        f13 = 1.0f;
                        i25 = 32;
                        r10 = 0;
                        AbstractC38319a.m122792f(interfaceC23001u, abstractC22403oM107019a, null, fM131945A, (Function1) obj6, c28655q, (AbstractC22403o.f87638a << 3) | 24582, 2);
                        C28655q c28655q2 = c28655q;
                        c28655q2.m87173q(false);
                        r15 = c28655q2;
                    }
                    Modifier modifierM34129b = AbstractC12250f.m34129b(AbstractC1102d.m3407d(f13, modifier6), contentState.getScreenContextMetadata(), false, r15, (i35 << 3) | 6, 2);
                    if (contentState.getBackgroundTheme() == EnumC33847l.DEFAULT || contentState.getBackgroundImage() != null) {
                        modifierM44028b0 = modifier6;
                    } else {
                        modifierM44028b0 = AbstractC15673b0.m44028b0(modifier6);
                    }
                    modifierMo3471e = modifierM34129b.mo3471e(modifierM44028b0);
                    if (m131976t(interfaceC28670t2)) {
                        modifierMo3471e2 = modifierMo3471e.mo3471e(modifier6);
                    } else {
                        modifierMo3471e2 = modifierMo3471e.mo3471e(AbstractC22953f.m66724m(modifier6));
                    }
                    Modifier modifierMo3471e5 = modifierMo3471e2.mo3471e(modifier5);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r10);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierMo3471e5);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j2);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(r15, c0209i3, interfaceC28653p1M87165m3);
                    if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N3);
                    if (m131976t(interfaceC28670t2)) {
                        modifier7 = modifier5;
                        f14 = f13;
                        function1 = action;
                        r15.m87150e0(204192865);
                        r15.m87173q(r10);
                    } else {
                        r15.m87150e0(204004509);
                        modifier7 = modifier5;
                        f14 = f13;
                        AbstractC35014p.m110618i(null, contentState.getNavigationBarState(), action, r15, (i19 << 3) & 896, 1);
                        function1 = action;
                        r15.m87173q(r10);
                    }
                    if (f14 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
                    if (z13) {
                        modifierM44085i = AbstractC15674c.m44089m(modifier6, 0.0f, 1, null);
                    } else {
                        modifierM44085i = AbstractC15674c.m44085i(modifier6, 0.0f, null, 3, null);
                    }
                    Modifier modifierMo3471e6 = layoutWeightElement.mo3471e(modifierM44085i);
                    C2305k c2305k = C2299e.f9111N;
                    int i36 = (r15.m87157i(contentState) ? 1 : 0) | (r15.m87147d(fM3387i) ? 1 : 0);
                    if (i24 == i25) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    i26 = r16 | i36 | (r15.m87157i(r28) ? 1 : 0);
                    objM87133R6 = r15.m87133R();
                    if (i26 == 0 || objM87133R6 == c28676v1) {
                        obj7 = objM87133R6;
                        C20885h0 c20885h0 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                        r15.m87172p0(c20885h0);
                        obj7 = c20885h0;
                    }
                    obj7 = objM87133R6;
                    ?? r110 = r15;
                    AbstractC22674j.m65717c(modifierMo3471e6, c26068u, interfaceC22973k1M34113f, null, c2305k, null, false, null, (Function1) obj7, r110, ProfileVerifier.CompilationStatus.f6515xf2722a21, 472);
                    i27 = (i19 << 3) & 896;
                    AbstractC35005g.m110531h(null, contentState.getFooterState(), action, z14, r110, i27, 1);
                    r17 = r110;
                    r17.m87173q(true);
                    r17.m87173q(true);
                    if (m131976t(interfaceC28670t2)) {
                        r17.m87150e0(-391003800);
                        interfaceC2302h = c2307m;
                        Modifier modifierMo3400a = interfaceC23001u.mo3400a(AbstractC1102d.m3411h(AbstractC15684l.m44119c(), AbstractC1102d.m3409f(f14, modifier6)), interfaceC2302h);
                        C17909s c17909s = AbstractC17911t.f69612b;
                        c23465kArr = f175573b;
                        arrayList = new ArrayList(c23465kArr.length);
                        length = c23465kArr.length;
                        for (r19 = r10; r19 < length; r19++) {
                            i28 = r10;
                            C23465k c23465k = c23465kArr[r19];
                            arrayList.add(new C23465k(Float.valueOf(((Number) c23465k.f92937w).floatValue()), new C17919x(C17919x.m51541c(((Number) c23465k.f92938x).floatValue() * m131978v(interfaceC28670t3), C17919x.f69625b))));
                            modifier6 = modifier6;
                            i28 = 0;
                        }
                        i28 = r10;
                        Modifier modifier9 = modifier6;
                        C23465k[] c23465kArr2 = (C23465k[]) arrayList.toArray(new C23465k[i28]);
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3400a, C17909s.m51494l(c17909s, (C23465k[]) Arrays.copyOf(c23465kArr2, c23465kArr2.length), 0.0f, 0.0f, 14), null, 0.0f, 6), r17, i28);
                        AbstractC35014p.m110618i(AbstractC22953f.m66725n(interfaceC23001u.mo3400a(modifier9, interfaceC2302h)), contentState.getNavigationBarState(), action, r17, i27, 0);
                        r17.m87173q(i28);
                        modifier8 = modifier9;
                    } else {
                        modifier8 = modifier6;
                        interfaceC2302h = c2307m;
                        r17.m87150e0(-390114875);
                        r17.m87173q(r10);
                    }
                    if (zM107036a) {
                        r17.m87150e0(-390068437);
                        C26107g.f103430a.m77668a(c26115o, zM107037b, AbstractC22953f.m66724m(interfaceC23001u.mo3400a(modifier8, interfaceC2302h)), 0L, 0L, 0.0f, r17, 0);
                        ?? r111 = r17;
                        r111.m87173q(false);
                        r18 = r111;
                    } else {
                        r17.m87150e0(-389797435);
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(true);
                    modifier3 = modifier7;
                    r14 = r18;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM107049a2 = AbstractC33846k.m107049a(AbstractC1102d.m3407d(1.0f, modifier4), contentState.getBackgroundTheme(), c28655q, 6);
                if (m131976t(interfaceC28670t2)) {
                    modifierM44121e = AbstractC15684l.m44121e(modifier4, 0.0f, 0.0f, m131978v(interfaceC28670t3), 3, null);
                } else {
                    modifierM44121e = modifier4;
                }
                Modifier modifierMo3471e7 = modifierM107049a2.mo3471e(modifierM44121e);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                c28655q.m87158i0();
                modifier6 = modifier4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                abstractC22403oM107019a = contentState.getBackgroundImage();
                interfaceC23001u = C1100b.f4583a;
                if (abstractC22403oM107019a == null) {
                    c28655q.m87150e0(-1452712519);
                    c28655q.m87173q(false);
                    c26068u = c26068u;
                    c0213j2 = c0213j;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    i25 = 32;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-1452712518);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM95646v = objM87133R3;
                        objM95646v = AbstractC31061c.m95646v(0, c28655q);
                    }
                    objM95646v = objM87133R3;
                    interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                    objM87133R4 = c28655q.m87133R();
                    obj5 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r4 = AbstractC28683x.m87264r(new C39689b(15, c26068u, interfaceC28593a1));
                        c28655q.m87172p0(c28612f0M87264r4);
                        obj5 = c28612f0M87264r4;
                    }
                    float fM131945A2 = m131945A((InterfaceC28670t2) obj5);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        C14362f c14362f2 = new C14362f(interfaceC28593a1, 18);
                        c28655q.m87172p0(c14362f2);
                        obj6 = c14362f2;
                    } else {
                        obj6 = objM87133R5;
                    }
                    c0213j2 = c0213j;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    i25 = 32;
                    r10 = 0;
                    AbstractC38319a.m122792f(interfaceC23001u, abstractC22403oM107019a, null, fM131945A2, (Function1) obj6, c28655q, (AbstractC22403o.f87638a << 3) | 24582, 2);
                    C28655q c28655q3 = c28655q;
                    c28655q3.m87173q(false);
                    r15 = c28655q3;
                }
                Modifier modifierM34129b2 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(f13, modifier6), contentState.getScreenContextMetadata(), false, r15, (i35 << 3) | 6, 2);
                if (contentState.getBackgroundTheme() == EnumC33847l.DEFAULT) {
                    modifierM44028b0 = modifier6;
                } else {
                    modifierM44028b0 = modifier6;
                }
                modifierMo3471e = modifierM34129b2.mo3471e(modifierM44028b0);
                if (m131976t(interfaceC28670t2)) {
                    modifierMo3471e2 = modifierMo3471e.mo3471e(AbstractC22953f.m66724m(modifier6));
                } else {
                    modifierMo3471e2 = modifierMo3471e.mo3471e(modifier6);
                }
                Modifier modifierMo3471e8 = modifierMo3471e2.mo3471e(modifier5);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r10);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierMo3471e8);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(r15, c0209i3, interfaceC28653p1M87165m5);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N5);
                if (m131976t(interfaceC28670t2)) {
                    r15.m87150e0(204004509);
                    modifier7 = modifier5;
                    f14 = f13;
                    AbstractC35014p.m110618i(null, contentState.getNavigationBarState(), action, r15, (i19 << 3) & 896, 1);
                    function1 = action;
                    r15.m87173q(r10);
                } else {
                    modifier7 = modifier5;
                    f14 = f13;
                    function1 = action;
                    r15.m87150e0(204192865);
                    r15.m87173q(r10);
                }
                if (f14 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14, true);
                if (z13) {
                    modifierM44085i = AbstractC15674c.m44089m(modifier6, 0.0f, 1, null);
                } else {
                    modifierM44085i = AbstractC15674c.m44085i(modifier6, 0.0f, null, 3, null);
                }
                Modifier modifierMo3471e9 = layoutWeightElement2.mo3471e(modifierM44085i);
                C2305k c2305k2 = C2299e.f9111N;
                int i37 = (r15.m87157i(contentState) ? 1 : 0) | (r15.m87147d(fM3387i) ? 1 : 0);
                if (i24 == i25) {
                    r16 = 1;
                } else {
                    r16 = r10;
                }
                i26 = r16 | i37 | (r15.m87157i(r28) ? 1 : 0);
                objM87133R6 = r15.m87133R();
                if (i26 == 0) {
                    obj7 = objM87133R6;
                    C20885h0 c20885h1 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                    r15.m87172p0(c20885h1);
                    obj7 = c20885h1;
                } else {
                    obj7 = objM87133R6;
                    C20885h0 c20885h2 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                    r15.m87172p0(c20885h2);
                    obj7 = c20885h2;
                }
                obj7 = objM87133R6;
                ?? r112 = r15;
                AbstractC22674j.m65717c(modifierMo3471e9, c26068u, interfaceC22973k1M34113f, null, c2305k2, null, false, null, (Function1) obj7, r112, ProfileVerifier.CompilationStatus.f6515xf2722a21, 472);
                i27 = (i19 << 3) & 896;
                AbstractC35005g.m110531h(null, contentState.getFooterState(), action, z14, r112, i27, 1);
                r17 = r112;
                r17.m87173q(true);
                r17.m87173q(true);
                if (m131976t(interfaceC28670t2)) {
                    r17.m87150e0(-391003800);
                    interfaceC2302h = c2307m;
                    Modifier modifierMo3400a2 = interfaceC23001u.mo3400a(AbstractC1102d.m3411h(AbstractC15684l.m44119c(), AbstractC1102d.m3409f(f14, modifier6)), interfaceC2302h);
                    C17909s c17909s2 = AbstractC17911t.f69612b;
                    c23465kArr = f175573b;
                    arrayList = new ArrayList(c23465kArr.length);
                    length = c23465kArr.length;
                    while (r19 < length) {
                        i28 = r10;
                        C23465k c23465k2 = c23465kArr[r19];
                        arrayList.add(new C23465k(Float.valueOf(((Number) c23465k2.f92937w).floatValue()), new C17919x(C17919x.m51541c(((Number) c23465k2.f92938x).floatValue() * m131978v(interfaceC28670t3), C17919x.f69625b))));
                        modifier6 = modifier6;
                        i28 = 0;
                    }
                    i28 = r10;
                    Modifier modifier10 = modifier6;
                    C23465k[] c23465kArr3 = (C23465k[]) arrayList.toArray(new C23465k[i28]);
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3400a2, C17909s.m51494l(c17909s2, (C23465k[]) Arrays.copyOf(c23465kArr3, c23465kArr3.length), 0.0f, 0.0f, 14), null, 0.0f, 6), r17, i28);
                    AbstractC35014p.m110618i(AbstractC22953f.m66725n(interfaceC23001u.mo3400a(modifier10, interfaceC2302h)), contentState.getNavigationBarState(), action, r17, i27, 0);
                    r17.m87173q(i28);
                    modifier8 = modifier10;
                } else {
                    modifier8 = modifier6;
                    interfaceC2302h = c2307m;
                    r17.m87150e0(-390114875);
                    r17.m87173q(r10);
                }
                if (zM107036a) {
                    r17.m87150e0(-390068437);
                    C26107g.f103430a.m77668a(c26115o, zM107037b, AbstractC22953f.m66724m(interfaceC23001u.mo3400a(modifier8, interfaceC2302h)), 0L, 0L, 0.0f, r17, 0);
                    ?? r113 = r17;
                    r113.m87173q(false);
                    r18 = r113;
                } else {
                    r17.m87150e0(-389797435);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                modifier3 = modifier7;
                r14 = r18;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(i13, i14, 4, contentState, modifier3, action);
            }
        }
        i29 |= 384;
        modifier2 = modifier;
        i15 = 1;
        if ((i29 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i29 & 1, z4)) {
            modifier4 = C2314t.f9131w;
            if (i34 != 0) {
                modifier5 = modifier4;
            } else {
                modifier5 = modifier2;
            }
            c31442aM107021c = contentState.getFooterState();
            if (c31442aM107021c == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            i16 = 6;
            c28676v0 = C28635l.f115821a;
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                C28612f0 c28612f0M87264r5 = AbstractC28683x.m87264r(new C39850b0(contentState, i16));
                c28655q.m87172p0(c28612f0M87264r5);
                obj = c28612f0M87264r5;
            }
            interfaceC28670t2 = (InterfaceC28670t2) obj;
            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            c33842gM107025g = contentState.getPaginationControlViewState();
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f175572a);
            zM87153g = c28655q.m87153g(c26068uM77569a);
            Object objM87133R9 = c28655q.m87133R();
            obj2 = objM87133R9;
            if (zM87153g) {
                C28612f0 c28612f0M87264r6 = AbstractC28683x.m87264r(new C10954e0(c26068uM77569a, fMo743q0, i15));
                c28655q.m87172p0(c28612f0M87264r6);
                obj2 = c28612f0M87264r6;
            } else {
                C28612f0 c28612f0M87264r7 = AbstractC28683x.m87264r(new C10954e0(c26068uM77569a, fMo743q0, i15));
                c28655q.m87172p0(c28612f0M87264r7);
                obj2 = c28612f0M87264r7;
            }
            interfaceC28670t3 = (InterfaceC28670t2) obj2;
            zM107036a = AbstractC33844i.m107036a(contentState.getPullToRefreshState());
            zM107037b = AbstractC33844i.m107037b(contentState.getPullToRefreshState());
            float f17 = AbstractC26108h.f103435a;
            Object[] objArr2 = new Object[0];
            objM87133R2 = c28655q.m87133R();
            obj3 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                C25888a c25888a2 = new C25888a(20);
                c28655q.m87172p0(c25888a2);
                obj3 = c25888a2;
            }
            c26115o = (C26115o) AbstractC39038k.m124458d(objArr2, C26115o.f103465b, (InterfaceC4339a) obj3, c28655q, 384);
            c13404jM107028j = contentState.getScreenContextMetadata();
            if (c13404jM107028j == null) {
                z14 = false;
            } else {
                z14 = false;
            }
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("arch-v2-section-padding");
            interfaceC22973k1M107023e = contentState.getListPadding();
            if (!zIsFeatureEnabled) {
                interfaceC22973k1M107023e = null;
            }
            if (interfaceC22973k1M107023e == null) {
                float f18 = 2 * 8;
                interfaceC22973k1M107023e = new C22976l1(f18, f18, f18, f18);
            }
            InterfaceC22973k1 interfaceC22973k2 = interfaceC22973k1M107023e;
            c13404jM107028j2 = contentState.getScreenContextMetadata();
            if (z13) {
                c13404j = c13404jM107028j2;
            } else {
                c13404j = null;
            }
            int i38 = C13404j.f46947x;
            c26068u = c26068uM77569a;
            InterfaceC22973k1 interfaceC22973k1M34113f2 = AbstractC12248d.m34113f(c13404j, interfaceC22973k2, false, c28655q, i38, 4);
            fM3387i = AbstractC1099a.m3387i(interfaceC22973k2, (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n));
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier4);
            i17 = i29 & 112;
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i = z15 | c28655q.m87157i(contentState);
            Object objM87133R10 = c28655q.m87133R();
            i18 = 14;
            obj4 = objM87133R10;
            if (zM87157i) {
                C39689b c39689b2 = new C39689b(i18, action, contentState);
                c28655q.m87172p0(c39689b2);
                obj4 = c39689b2;
            } else {
                C39689b c39689b3 = new C39689b(i18, action, contentState);
                c28655q.m87172p0(c39689b3);
                obj4 = c39689b3;
            }
            Modifier modifierMo3471e10 = modifierM3407d2.mo3471e(new PullToRefreshElement(zM107037b, (InterfaceC4339a) obj4, zM107036a, c26115o, C26107g.f103432c));
            C2307m c2307m3 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e10);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            i19 = i29;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i24 = i17;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                Modifier modifierM107049a3 = AbstractC33846k.m107049a(AbstractC1102d.m3407d(1.0f, modifier4), contentState.getBackgroundTheme(), c28655q, 6);
                if (m131976t(interfaceC28670t2)) {
                    modifierM44121e = AbstractC15684l.m44121e(modifier4, 0.0f, 0.0f, m131978v(interfaceC28670t3), 3, null);
                } else {
                    modifierM44121e = modifier4;
                }
                Modifier modifierMo3471e11 = modifierM107049a3.mo3471e(modifierM44121e);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e11);
                c28655q.m87158i0();
                modifier6 = modifier4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                abstractC22403oM107019a = contentState.getBackgroundImage();
                interfaceC23001u = C1100b.f4583a;
                if (abstractC22403oM107019a == null) {
                    c28655q.m87150e0(-1452712519);
                    c28655q.m87173q(false);
                    c26068u = c26068u;
                    c0213j2 = c0213j;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    i25 = 32;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-1452712518);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM95646v = objM87133R3;
                        objM95646v = AbstractC31061c.m95646v(0, c28655q);
                    }
                    objM95646v = objM87133R3;
                    interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                    objM87133R4 = c28655q.m87133R();
                    obj5 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28612f0 c28612f0M87264r8 = AbstractC28683x.m87264r(new C39689b(15, c26068u, interfaceC28593a1));
                        c28655q.m87172p0(c28612f0M87264r8);
                        obj5 = c28612f0M87264r8;
                    }
                    float fM131945A3 = m131945A((InterfaceC28670t2) obj5);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        C14362f c14362f3 = new C14362f(interfaceC28593a1, 18);
                        c28655q.m87172p0(c14362f3);
                        obj6 = c14362f3;
                    } else {
                        obj6 = objM87133R5;
                    }
                    c0213j2 = c0213j;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    i25 = 32;
                    r10 = 0;
                    AbstractC38319a.m122792f(interfaceC23001u, abstractC22403oM107019a, null, fM131945A3, (Function1) obj6, c28655q, (AbstractC22403o.f87638a << 3) | 24582, 2);
                    C28655q c28655q4 = c28655q;
                    c28655q4.m87173q(false);
                    r15 = c28655q4;
                }
                Modifier modifierM34129b3 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(f13, modifier6), contentState.getScreenContextMetadata(), false, r15, (i38 << 3) | 6, 2);
                if (contentState.getBackgroundTheme() == EnumC33847l.DEFAULT) {
                    modifierM44028b0 = modifier6;
                } else {
                    modifierM44028b0 = modifier6;
                }
                modifierMo3471e = modifierM34129b3.mo3471e(modifierM44028b0);
                if (m131976t(interfaceC28670t2)) {
                    modifierMo3471e2 = modifierMo3471e.mo3471e(AbstractC22953f.m66724m(modifier6));
                } else {
                    modifierMo3471e2 = modifierMo3471e.mo3471e(modifier6);
                }
                Modifier modifierMo3471e12 = modifierMo3471e2.mo3471e(modifier5);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r10);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = r15.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(r15, modifierMo3471e12);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(r15, c0209i7, interfaceC28653p1M87165m8);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(r15, c0209i8, modifierM118962N8);
                if (m131976t(interfaceC28670t2)) {
                    r15.m87150e0(204004509);
                    modifier7 = modifier5;
                    f14 = f13;
                    AbstractC35014p.m110618i(null, contentState.getNavigationBarState(), action, r15, (i19 << 3) & 896, 1);
                    function1 = action;
                    r15.m87173q(r10);
                } else {
                    modifier7 = modifier5;
                    f14 = f13;
                    function1 = action;
                    r15.m87150e0(204192865);
                    r15.m87173q(r10);
                }
                if (f14 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f14, true);
                if (z13) {
                    modifierM44085i = AbstractC15674c.m44089m(modifier6, 0.0f, 1, null);
                } else {
                    modifierM44085i = AbstractC15674c.m44085i(modifier6, 0.0f, null, 3, null);
                }
                Modifier modifierMo3471e13 = layoutWeightElement3.mo3471e(modifierM44085i);
                C2305k c2305k3 = C2299e.f9111N;
                int i39 = (r15.m87157i(contentState) ? 1 : 0) | (r15.m87147d(fM3387i) ? 1 : 0);
                if (i24 == i25) {
                    r16 = 1;
                } else {
                    r16 = r10;
                }
                i26 = r16 | i39 | (r15.m87157i(r28) ? 1 : 0);
                objM87133R6 = r15.m87133R();
                if (i26 == 0) {
                    obj7 = objM87133R6;
                    C20885h0 c20885h3 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                    r15.m87172p0(c20885h3);
                    obj7 = c20885h3;
                } else {
                    obj7 = objM87133R6;
                    C20885h0 c20885h4 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                    r15.m87172p0(c20885h4);
                    obj7 = c20885h4;
                }
                obj7 = objM87133R6;
                ?? r114 = r15;
                AbstractC22674j.m65717c(modifierMo3471e13, c26068u, interfaceC22973k1M34113f2, null, c2305k3, null, false, null, (Function1) obj7, r114, ProfileVerifier.CompilationStatus.f6515xf2722a21, 472);
                i27 = (i19 << 3) & 896;
                AbstractC35005g.m110531h(null, contentState.getFooterState(), action, z14, r114, i27, 1);
                r17 = r114;
                r17.m87173q(true);
                r17.m87173q(true);
                if (m131976t(interfaceC28670t2)) {
                    r17.m87150e0(-391003800);
                    interfaceC2302h = c2307m;
                    Modifier modifierMo3400a3 = interfaceC23001u.mo3400a(AbstractC1102d.m3411h(AbstractC15684l.m44119c(), AbstractC1102d.m3409f(f14, modifier6)), interfaceC2302h);
                    C17909s c17909s3 = AbstractC17911t.f69612b;
                    c23465kArr = f175573b;
                    arrayList = new ArrayList(c23465kArr.length);
                    length = c23465kArr.length;
                    while (r19 < length) {
                        i28 = r10;
                        C23465k c23465k3 = c23465kArr[r19];
                        arrayList.add(new C23465k(Float.valueOf(((Number) c23465k3.f92937w).floatValue()), new C17919x(C17919x.m51541c(((Number) c23465k3.f92938x).floatValue() * m131978v(interfaceC28670t3), C17919x.f69625b))));
                        modifier6 = modifier6;
                        i28 = 0;
                    }
                    i28 = r10;
                    Modifier modifier11 = modifier6;
                    C23465k[] c23465kArr4 = (C23465k[]) arrayList.toArray(new C23465k[i28]);
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3400a3, C17909s.m51494l(c17909s3, (C23465k[]) Arrays.copyOf(c23465kArr4, c23465kArr4.length), 0.0f, 0.0f, 14), null, 0.0f, 6), r17, i28);
                    AbstractC35014p.m110618i(AbstractC22953f.m66725n(interfaceC23001u.mo3400a(modifier11, interfaceC2302h)), contentState.getNavigationBarState(), action, r17, i27, 0);
                    r17.m87173q(i28);
                    modifier8 = modifier11;
                } else {
                    modifier8 = modifier6;
                    interfaceC2302h = c2307m;
                    r17.m87150e0(-390114875);
                    r17.m87173q(r10);
                }
                if (zM107036a) {
                    r17.m87150e0(-390068437);
                    C26107g.f103430a.m77668a(c26115o, zM107037b, AbstractC22953f.m66724m(interfaceC23001u.mo3400a(modifier8, interfaceC2302h)), 0L, 0L, 0.0f, r17, 0);
                    ?? r115 = r17;
                    r115.m87173q(false);
                    r18 = r115;
                } else {
                    r17.m87150e0(-389797435);
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(true);
                modifier3 = modifier7;
                r14 = r18;
            } else {
                i24 = i17;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            Modifier modifierM107049a4 = AbstractC33846k.m107049a(AbstractC1102d.m3407d(1.0f, modifier4), contentState.getBackgroundTheme(), c28655q, 6);
            if (m131976t(interfaceC28670t2)) {
                modifierM44121e = AbstractC15684l.m44121e(modifier4, 0.0f, 0.0f, m131978v(interfaceC28670t3), 3, null);
            } else {
                modifierM44121e = modifier4;
            }
            Modifier modifierMo3471e14 = modifierM107049a4.mo3471e(modifierM44121e);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e14);
            c28655q.m87158i0();
            modifier6 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
            abstractC22403oM107019a = contentState.getBackgroundImage();
            interfaceC23001u = C1100b.f4583a;
            if (abstractC22403oM107019a == null) {
                c28655q.m87150e0(-1452712519);
                c28655q.m87173q(false);
                c26068u = c26068u;
                c0213j2 = c0213j;
                r10 = 0;
                c28676v1 = c28676v0;
                f13 = 1.0f;
                i25 = 32;
                r15 = c28655q;
            } else {
                c28655q.m87150e0(-1452712518);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM95646v = objM87133R3;
                    objM95646v = AbstractC31061c.m95646v(0, c28655q);
                }
                objM95646v = objM87133R3;
                interfaceC28593a1 = (InterfaceC28593a1) objM95646v;
                objM87133R4 = c28655q.m87133R();
                obj5 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28612f0 c28612f0M87264r9 = AbstractC28683x.m87264r(new C39689b(15, c26068u, interfaceC28593a1));
                    c28655q.m87172p0(c28612f0M87264r9);
                    obj5 = c28612f0M87264r9;
                }
                float fM131945A4 = m131945A((InterfaceC28670t2) obj5);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    C14362f c14362f4 = new C14362f(interfaceC28593a1, 18);
                    c28655q.m87172p0(c14362f4);
                    obj6 = c14362f4;
                } else {
                    obj6 = objM87133R5;
                }
                c0213j2 = c0213j;
                c28676v1 = c28676v0;
                f13 = 1.0f;
                i25 = 32;
                r10 = 0;
                AbstractC38319a.m122792f(interfaceC23001u, abstractC22403oM107019a, null, fM131945A4, (Function1) obj6, c28655q, (AbstractC22403o.f87638a << 3) | 24582, 2);
                C28655q c28655q5 = c28655q;
                c28655q5.m87173q(false);
                r15 = c28655q5;
            }
            Modifier modifierM34129b4 = AbstractC12250f.m34129b(AbstractC1102d.m3407d(f13, modifier6), contentState.getScreenContextMetadata(), false, r15, (i38 << 3) | 6, 2);
            if (contentState.getBackgroundTheme() == EnumC33847l.DEFAULT) {
                modifierM44028b0 = modifier6;
            } else {
                modifierM44028b0 = modifier6;
            }
            modifierMo3471e = modifierM34129b4.mo3471e(modifierM44028b0);
            if (m131976t(interfaceC28670t2)) {
                modifierMo3471e2 = modifierMo3471e.mo3471e(AbstractC22953f.m66724m(modifier6));
            } else {
                modifierMo3471e2 = modifierMo3471e.mo3471e(modifier6);
            }
            Modifier modifierMo3471e15 = modifierMo3471e2.mo3471e(modifier5);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r10);
            iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = r15.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(r15, modifierMo3471e15);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j2);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i6, c23010xM66775a4);
            AbstractC28683x.m87239G(r15, c0209i7, interfaceC28653p1M87165m10);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(r15, c0209i9, modifierM118962N10);
            if (m131976t(interfaceC28670t2)) {
                r15.m87150e0(204004509);
                modifier7 = modifier5;
                f14 = f13;
                AbstractC35014p.m110618i(null, contentState.getNavigationBarState(), action, r15, (i19 << 3) & 896, 1);
                function1 = action;
                r15.m87173q(r10);
            } else {
                modifier7 = modifier5;
                f14 = f13;
                function1 = action;
                r15.m87150e0(204192865);
                r15.m87173q(r10);
            }
            if (f14 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f14, true);
            if (z13) {
                modifierM44085i = AbstractC15674c.m44089m(modifier6, 0.0f, 1, null);
            } else {
                modifierM44085i = AbstractC15674c.m44085i(modifier6, 0.0f, null, 3, null);
            }
            Modifier modifierMo3471e16 = layoutWeightElement4.mo3471e(modifierM44085i);
            C2305k c2305k4 = C2299e.f9111N;
            int i310 = (r15.m87157i(contentState) ? 1 : 0) | (r15.m87147d(fM3387i) ? 1 : 0);
            if (i24 == i25) {
                r16 = 1;
            } else {
                r16 = r10;
            }
            i26 = r16 | i310 | (r15.m87157i(r28) ? 1 : 0);
            objM87133R6 = r15.m87133R();
            if (i26 == 0) {
                obj7 = objM87133R6;
                C20885h0 c20885h5 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                r15.m87172p0(c20885h5);
                obj7 = c20885h5;
            } else {
                obj7 = objM87133R6;
                C20885h0 c20885h6 = new C20885h0(contentState, c33842gM107025g, fM3387i, function1);
                r15.m87172p0(c20885h6);
                obj7 = c20885h6;
            }
            obj7 = objM87133R6;
            ?? r116 = r15;
            AbstractC22674j.m65717c(modifierMo3471e16, c26068u, interfaceC22973k1M34113f2, null, c2305k4, null, false, null, (Function1) obj7, r116, ProfileVerifier.CompilationStatus.f6515xf2722a21, 472);
            i27 = (i19 << 3) & 896;
            AbstractC35005g.m110531h(null, contentState.getFooterState(), action, z14, r116, i27, 1);
            r17 = r116;
            r17.m87173q(true);
            r17.m87173q(true);
            if (m131976t(interfaceC28670t2)) {
                r17.m87150e0(-391003800);
                interfaceC2302h = c2307m;
                Modifier modifierMo3400a4 = interfaceC23001u.mo3400a(AbstractC1102d.m3411h(AbstractC15684l.m44119c(), AbstractC1102d.m3409f(f14, modifier6)), interfaceC2302h);
                C17909s c17909s4 = AbstractC17911t.f69612b;
                c23465kArr = f175573b;
                arrayList = new ArrayList(c23465kArr.length);
                length = c23465kArr.length;
                while (r19 < length) {
                    i28 = r10;
                    C23465k c23465k4 = c23465kArr[r19];
                    arrayList.add(new C23465k(Float.valueOf(((Number) c23465k4.f92937w).floatValue()), new C17919x(C17919x.m51541c(((Number) c23465k4.f92938x).floatValue() * m131978v(interfaceC28670t3), C17919x.f69625b))));
                    modifier6 = modifier6;
                    i28 = 0;
                }
                i28 = r10;
                Modifier modifier12 = modifier6;
                C23465k[] c23465kArr5 = (C23465k[]) arrayList.toArray(new C23465k[i28]);
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3400a4, C17909s.m51494l(c17909s4, (C23465k[]) Arrays.copyOf(c23465kArr5, c23465kArr5.length), 0.0f, 0.0f, 14), null, 0.0f, 6), r17, i28);
                AbstractC35014p.m110618i(AbstractC22953f.m66725n(interfaceC23001u.mo3400a(modifier12, interfaceC2302h)), contentState.getNavigationBarState(), action, r17, i27, 0);
                r17.m87173q(i28);
                modifier8 = modifier12;
            } else {
                modifier8 = modifier6;
                interfaceC2302h = c2307m;
                r17.m87150e0(-390114875);
                r17.m87173q(r10);
            }
            if (zM107036a) {
                r17.m87150e0(-390068437);
                C26107g.f103430a.m77668a(c26115o, zM107037b, AbstractC22953f.m66724m(interfaceC23001u.mo3400a(modifier8, interfaceC2302h)), 0L, 0L, 0.0f, r17, 0);
                ?? r117 = r17;
                r117.m87173q(false);
                r18 = r117;
            } else {
                r17.m87150e0(-389797435);
                r17.m87173q(false);
                r18 = r17;
            }
            r18.m87173q(true);
            modifier3 = modifier7;
            r14 = r18;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(i13, i14, 4, contentState, modifier3, action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final boolean m131975s(C33840e c33840e) {
        return AbstractC35014p.m110631v(c33840e.getNavigationBarState());
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m131976t(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final float m131977u(C26068u c26068u, float f13) {
        return m131956L(((C28621h1) c26068u.f103222e.f91958b).m87024x(), ((C28621h1) c26068u.f103222e.f91959c).m87024x(), f13);
    }

    /* JADX INFO: renamed from: v */
    private static final float m131978v(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m131979w(Function1 function1, C33840e c33840e) {
        function1.invoke(new InterfaceC31443b.u(true, c33840e.getRefreshScope(), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final int m131980x(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: y */
    private static final void m131981y(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final float m131982z(C26068u c26068u, InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) c26068u.f103222e.f91958b).m87024x() == 0 ? ((C28621h1) c26068u.f103222e.f91959c).m87024x() : Math.max(m131980x(interfaceC28593a1), (int) (c26068u.m77565h().m77537e() & 4294967295L));
    }
}
