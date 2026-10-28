package jr1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d11.C11467b;
import d11.C11474i;
import e93.AbstractC12889b;
import fr1.InterfaceC14714c;
import gb1.AbstractC15673b0;
import gr1.C16099f;
import gr1.C16101h;
import gr1.C16102i;
import gr1.C16103j;
import gr1.C16105l;
import gr1.C16110q;
import gr1.InterfaceC16100g;
import gr1.InterfaceC16107n;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import ig0.C18464d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.C21214q;
import java.util.List;
import jp1.C21851c;
import jp1.C21860l;
import kd1.AbstractC22403o;
import kd1.C22411w;
import kotlin.C2032u;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import zq1.AbstractC40986a;
import zq1.AbstractC40987b;

/* JADX INFO: renamed from: jr1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\t\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgr1/q;", "viewState", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "Lfr1/c;", "onNavigationEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "k", "Lgr1/j;", "integrationRow", "", "onClick", "s", "(Lgr1/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lgr1/h;", "p", "(Lgr1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21899g {

    /* JADX INFO: renamed from: jr1.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f84611w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC16100g f84612x;

        public a(Function1 function1, InterfaceC16100g interfaceC16100g) {
            this.f84611w = function1;
            this.f84612x = interfaceC16100g;
        }

        /* JADX INFO: renamed from: a */
        public final void m62299a(String it) {
            AbstractC22676k.m65750j(it, "it");
            this.f84611w.invoke(new InterfaceC16107n.e(it, ((C16101h) this.f84612x).getReportingKey()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m62299a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jr1.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f84613w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC16100g f84614x;

        public b(Function1 function1, InterfaceC16100g interfaceC16100g) {
            this.f84613w = function1;
            this.f84614x = interfaceC16100g;
        }

        /* JADX INFO: renamed from: a */
        public final void m62300a(String it) {
            AbstractC22676k.m65750j(it, "it");
            this.f84613w.invoke(new InterfaceC16107n.e(it, ((C16102i) this.f84614x).getReportingKey()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m62300a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jr1.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f84615w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC16100g f84616x;

        public c(Function1 function1, InterfaceC16100g interfaceC16100g) {
            this.f84615w = function1;
            this.f84616x = interfaceC16100g;
        }

        /* JADX INFO: renamed from: a */
        public final void m62301a(String it) {
            AbstractC22676k.m65750j(it, "it");
            this.f84615w.invoke(new InterfaceC16107n.e(it, ((C16103j) this.f84616x).getReportingKey()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m62301a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jr1.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f84617w;

        public d(List list) {
            this.f84617w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m62302a(int i13) {
            this.f84617w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m62302a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: jr1.g$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f84618w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f84619x;

        public e(List list, Function1 function1) {
            this.f84618w = list;
            this.f84619x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m62303a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC16100g interfaceC16100g = (InterfaceC16100g) this.f84618w.get(i13);
            c28655q.m87150e0(-1013119934);
            boolean z4 = interfaceC16100g instanceof C16101h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1013070707);
                C16101h c16101h = (C16101h) interfaceC16100g;
                boolean zM87153g = c28655q.m87153g(this.f84619x) | c28655q.m87157i(interfaceC16100g);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new a(this.f84619x, interfaceC16100g);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21899g.m62290p(c16101h, (Function1) objM87133R, c28655q, 0);
                c28655q.m87173q(false);
            } else if (interfaceC16100g instanceof C16102i) {
                c28655q.m87150e0(-1012825776);
                C16102i c16102i = (C16102i) interfaceC16100g;
                boolean zM87153g2 = c28655q.m87153g(this.f84619x) | c28655q.m87157i(interfaceC16100g);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(this.f84619x, interfaceC16100g);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC21893a.m62160d(c16102i, (Function1) objM87133R2, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (!(interfaceC16100g instanceof C16103j)) {
                    throw AbstractC11895b.m32003v(1352792033, c28655q, false);
                }
                c28655q.m87150e0(-1012580659);
                C16103j c16103j = (C16103j) interfaceC16100g;
                boolean zM87153g3 = c28655q.m87153g(this.f84619x) | c28655q.m87157i(interfaceC16100g);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new c(this.f84619x, interfaceC16100g);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21899g.m62293s(c16103j, (Function1) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m62303a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jr1.g$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f84620w = new f();

        /* JADX INFO: renamed from: a */
        public final long m62304a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m62304a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jr1.g$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f84621w = new g();

        /* JADX INFO: renamed from: a */
        public final long m62305a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m62305a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m62285k(C16110q viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1258513593);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21277k(AbstractC40987b.f176899g), null, AbstractC13673n.m38561h(C38072d.f163053a), "Back button", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C21860l(onNavigationEvent, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM66723l, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), f14, 0.0f, f14, 4 * f13, 2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f13);
            boolean zM87157i = c28655q.m87157i(viewState) | ((i14 & 112) == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C21851c(4, viewState, onViewEvent);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM3398t, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 494);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21895c(viewState, onViewEvent, onNavigationEvent, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m62286l(Function1 function1) {
        function1.invoke(new InterfaceC14714c.a(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m62287m(C16110q c16110q, Function1 function1, InterfaceC26064q LazyColumn) {
        List<C16105l> listM45566a;
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C16099f c16099fM45636f = c16110q.getDiscoveryScreen();
        if (c16099fM45636f != null && (listM45566a = c16099fM45636f.m45566a()) != null) {
            for (C16105l c16105l : listM45566a) {
                if (AbstractC8693b.m21270d(c16105l.getTitle())) {
                    InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2476a1(c16105l, 23), true, 275312693), 3);
                }
                List<InterfaceC16100g> listM45586a = c16105l.m45586a();
                ((C26053f) LazyColumn).m77529r(listM45586a.size(), null, new d(listM45586a), new C37816b(new e(listM45586a, function1), true, 2039820996));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m62288n(C16105l c16105l, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1), null, null, c16105l.getTitle(), null, 0L, 0L, null, c28655q, (TextResource.$stable << 9) | 6, 246);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m62289o(C16110q c16110q, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62285k(c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m62290p(C16101h integrationRow, Function1 onClick, Composer composer, int i13) {
        int i14;
        C11467b c11467b;
        AbstractC22676k.m65750j(integrationRow, "integrationRow");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(400792268);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(integrationRow) : c28655q.m87157i(integrationRow) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource textResourceM45573g = integrationRow.getTitle();
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            C39274g c39274g = new C39274g(AbstractC40986a.f176890b, null, i15, 0 == true ? 1 : 0);
            AbstractC22403o abstractC22403oM45567a = integrationRow.getBannerImage();
            TextResource textResourceM45572f = integrationRow.getSubtitle();
            if (AbstractC22676k.m65745e(integrationRow.getConnected(), Boolean.TRUE)) {
                c11467b = null;
            } else {
                c11467b = new C11467b(integrationRow.getCtaText(), EnumC39333f.ACCENT_ACTION, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0), null, 8, null);
            }
            C11474i c11474i = new C11474i(null, null, null, textResourceM45573g, textResourceM45572f, null, c39274g, abstractC22403oM45567a, null, null, null, false, false, null, null, c11467b, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536837927, null);
            boolean zM87157i = c28655q.m87157i(integrationRow) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21851c(5, onClick, integrationRow);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c11474i, null, null, (Function1) objM87133R, c28655q, C11474i.f36854E, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(integrationRow, onClick, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m62291q(Function1 function1, C16101h c16101h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c16101h.getId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62292r(C16101h c16101h, Function1 function1, int i13, Composer composer, int i14) {
        m62290p(c16101h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m62293s(C16103j integrationRow, Function1 onClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(integrationRow, "integrationRow");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-666630336);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(integrationRow) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C39282o c39282oM125233e = C39282o.INSTANCE.m125233e(integrationRow.getTitle(), (32718 & 2) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.i.f169013w) : null, (32718 & 4) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 8) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.j.f169014w) : null, (32718 & 16) != 0 ? null : integrationRow.getIconImage(), (32718 & 32) == 0 ? integrationRow.getConnectionStatusIcon() : null, (32718 & 64) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 128) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 256) != 0 ? AbstractC8693b.m21267a() : null, (32718 & 512) != 0 ? AbstractC8693b.m21267a() : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? p745y81.Function1.m125323a(C39282o.Companion.k.f169015w) : null, (32718 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0, (32718 & 4096) != 0 ? false : false, (32718 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C23454a0.f92919a : null, (32718 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : false);
            AbstractC39279l alignment = c39282oM125233e.getAlignment();
            AbstractC22676k.m65748h(alignment, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemAlignment.LeftAlignedImageMenu");
            AbstractC39279l.c cVar = (AbstractC39279l.c) alignment;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = f.f84620w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            InterfaceC39332e interfaceC39332eM45580b = integrationRow.getConnectionStatusIconColor();
            if (interfaceC39332eM45580b == null) {
                c28655q.m87150e0(1340580688);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = g.f84621w;
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC39332eM45580b = p745y81.Function1.m125323a((Function1) objM87133R2);
            } else {
                c28655q.m87150e0(1340579789);
            }
            c28655q.m87173q(false);
            AbstractC12889b.m36263b(null, C22411w.f87680a.m64535a().m64090c(), C17919x.f69637n, null, 0, AbstractC37817c.m121344e(-895932553, c28655q, new C2032u((Object) c39282oM125233e, (Object) AbstractC39279l.c.m125179b(cVar, null, null, null, interfaceC39332eM125323a, null, interfaceC39332eM45580b, null, null, null, null, null, false, 4055, null), onClick, (Object) integrationRow, 16)), c28655q, 1769856, 25);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(integrationRow, onClick, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m62294t(C39282o c39282o, AbstractC39279l.c cVar, Function1 function1, C16103j c16103j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C39282o c39282oM125211a = c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : cVar, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c16103j);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21214q(12, function1, c16103j);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(null, c39282oM125211a, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62295u(Function1 function1, C16103j c16103j) {
        function1.invoke(c16103j.getId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m62296v(C16103j c16103j, Function1 function1, int i13, Composer composer, int i14) {
        m62293s(c16103j, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m62297w(C16110q viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-842764317);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (viewState.getDiscoveryScreen() == null) {
                c28655q.m87150e0(-300434457);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-300434456);
                m62285k(viewState, onViewEvent, onNavigationEvent, c28655q, i14 & 1022);
                c28655q.m87173q(false);
            }
            AbstractC21894b.m62170c(viewState, onViewEvent, c28655q, i14 & 126);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21895c(viewState, onViewEvent, onNavigationEvent, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m62298x(C16110q c16110q, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m62297w(c16110q, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
