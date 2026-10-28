package cp0;

import a41.C0374j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import i91.C18250d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import o01.AbstractC27348d;
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
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22971k;
import p291l0.C22994r1;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import x81.C38072d;

/* JADX INFO: renamed from: cp0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"", "betaTagText", "Lkotlin/Function0;", "Ll83/a0;", "onBetaClick", "f", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "onHistoryClick", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "showLabel", "onContextHubClick", "k", "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10971k {

    /* JADX INFO: renamed from: cp0.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f34126w = new a();

        /* JADX INFO: renamed from: a */
        public final long m29232a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m29232a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m29224f(String betaTagText, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        InterfaceC4339a onBetaClick = interfaceC4339a;
        AbstractC22676k.m65750j(betaTagText, "betaTagText");
        AbstractC22676k.m65750j(onBetaClick, "onBetaClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(339118058);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(betaTagText) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onBetaClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 1;
            float f14 = f13 * 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            DefaultConstructorMarker defaultConstructorMarker = null;
            AbstractC27348d.m82519c(null, c28655q, 0, 1);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(betaTagText);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f34126w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f15 = 4;
            float f16 = f13 * f15;
            float f17 = 3 * f15;
            onBetaClick = interfaceC4339a;
            AbstractC17746g1.m50872h(new C17750h1(textResourceM21278l, null, null, new C18250d(p712j91.Function1.m60318a(C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i15).getTransparent()), new C17919x(c38072d.m121949b(c28655q, i15).getWhite5()), new C17919x(c38072d.m121949b(c28655q, i15).getWhite10())), 0.0f, 0.0f, 14)), 0.0f, 2, defaultConstructorMarker), interfaceC39332eM125323a, null, null, null, false, AbstractC33253j.m105490f(f16, f17, f17, f16), f14, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4192742, null), null, onBetaClick, c28655q, C17750h1.f69012w | ((i14 << 3) & 896), 2);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(betaTagText, onBetaClick, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m29225g(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m29224f(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m29226h(InterfaceC4339a onHistoryClick, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(onHistoryClick, "onHistoryClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-209672572);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onHistoryClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC37335a.f159600b, c28655q, 6);
            String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159632M, c28655q, 0);
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C10968j(onHistoryClick, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, strM21273g, AbstractC1102d.m3419p(6 * 4, AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15)), jM125430y, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 1, onHistoryClick);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m29227i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m29228j(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m29226h(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
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
    /* JADX INFO: renamed from: k */
    public static final void m29229k(boolean z4, InterfaceC4339a onContextHubClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        ?? r10;
        C2314t c2314t;
        C28655q c28655q2;
        String strM21273g;
        AbstractC22676k.m65750j(onContextHubClick, "onContextHubClick");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1512398642);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(onContextHubClick) ? 32 : 16;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2306l c2306l = C2299e.f9108K;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * 8);
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R = c28655q3.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C10968j(onContextHubClick, 1);
                c28655q3.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q3, 54);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (z4) {
                c28655q3.m87150e0(-1206424166);
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159677k, c28655q3, 0);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                r10 = 0;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(strM21273g2, null, c38072d.m121949b(c28655q3, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i15).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            } else {
                r10 = 0;
                c2314t = c2314t2;
                c28655q3.m87150e0(-1206208592);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
            }
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(AbstractC16272a.f62098j, c28655q2, r10);
            if (z4) {
                c28655q2.m87150e0(-1206064629);
                c28655q2.m87173q(r10);
                strM21273g = null;
            } else {
                c28655q2.m87150e0(653831742);
                strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159675j, c28655q2, r10);
                c28655q2.m87173q(r10);
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I, strM21273g, AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), c28655q2, 384, 0);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0374j(z4, onContextHubClick, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m29230l(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m29231m(boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m29229k(z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
