package vs2;

import a23.C0176c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bb2.C2925a;
import by1.C3698e;
import c41.C4109r5;
import c41.C4140w1;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import d41.C11678d;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import gz2.C16334a;
import hy0.C17736e;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import ks2.AbstractC22822a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import nq2.C27060c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p134f2.C14015d;
import p134f2.C14018g;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33168c;
import pf.AbstractC29125c;
import pq1.C29479c;
import q83.AbstractC30060g;
import qx0.C30745a;
import qz0.AbstractC30795n;
import rs2.AbstractC31797c;
import st2.C32995a;
import te0.AbstractC33745d;
import ts2.AbstractC34145a;
import uf0.C34904e;
import um0.C35076b;
import uo1.C35141b;
import us2.AbstractC35222c;
import us2.AbstractC35223d;
import us2.AbstractC35225f;
import us2.C35220a;
import us2.C35221b;
import uv0.AbstractC35283c;
import v31.C35608d;
import v41.C35657b0;
import v41.C35658c;
import v90.C35813e;
import vo1.C36244s;
import vq2.C36287d;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import zt2.AbstractC41138g;
import zt2.C41137f;

/* JADX INFO: renamed from: vs2.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\"\u0010 \u001a\u000f\u0010#\u001a\u00020\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b%\u0010&\"\u0018\u0010+\u001a\u00020(*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lus2/f;", "viewState", "Lkotlin/Function1;", "Lus2/d;", "Ll83/a0;", "onViewEvent", "Lts2/a;", "onNavigationEvent", "C", "(Lus2/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lus2/f$c;", "Y", "(Lus2/f$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "title", "f0", "(Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "imageUrl", "Landroidx/compose/ui/Modifier;", "modifier", "P", "(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "N", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "Lus2/b;", "headerSection", "J", "(Lus2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "customPlanCard", "z", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "itemViewState", "V", "T", "(Landroidx/compose/runtime/Composer;I)V", "G", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ln0/u;", "", "j0", "(Ln0/u;)F", "scrollOffset", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36479e {

    /* JADX INFO: renamed from: vs2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f155808w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vs2.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f155809w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f155810x;

        public b(Function1 function1, List list) {
            this.f155809w = function1;
            this.f155810x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m116902a(int i13) {
            return this.f155809w.invoke(this.f155810x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m116902a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vs2.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f155811w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f155812x;

        public c(List list, Function1 function1) {
            this.f155811w = list;
            this.f155812x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m116903a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f155811w.get(i13);
            c28655q.m87150e0(-1780303845);
            AbstractC36479e.m116860V(interfaceC25312u, this.f155812x, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m116903a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m116839A(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            function1.invoke(new AbstractC34145a.b((C9598e) event));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m116840B(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, Composer composer, int i14) {
        m116900z(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m116841C(AbstractC35225f viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-347769885);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C36244s(29);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36478d(0);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            if (viewState instanceof AbstractC35225f.c) {
                c28655q.m87150e0(-1810099942);
                m116863Y((AbstractC35225f.c) viewState, function2, c28655q, ((i15 >> 3) & 112) | (i15 & 14));
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC35225f.b.f149813a)) {
                c28655q.m87150e0(-1809895280);
                m116858T(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof AbstractC35225f.a)) {
                    throw AbstractC11895b.m32003v(772891689, c28655q, false);
                }
                c28655q.m87150e0(-1809802311);
                m116845G(function1, c28655q, (i15 >> 3) & 14);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Function1 function3 = function1;
        Function1 function4 = function2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d((Object) viewState, function3, (InterfaceC23459e) function4, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m116842D(AbstractC35223d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m116843E(AbstractC34145a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m116844F(AbstractC35225f abstractC35225f, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m116841C(abstractC35225f, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m116845G(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1735345008);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C34904e(function1, 27);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i15 = AbstractC33208p0.b.f138467h;
            int i16 = TextResource.$stable;
            AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, interfaceC4339a, false, false, null, null, null, true, false, c28655q, i15 | (i16 << 3) | (i16 << 9), 6, 3044);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m116846H(Function1 function1) {
        function1.invoke(new AbstractC35223d.a(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m116847I(Function1 function1, int i13, Composer composer, int i14) {
        m116845G(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m116848J(C35221b c35221b, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1719474875);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35221b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 4, 0.0f, 0.0f, 13), 2 * 8, 0.0f, 2);
            String strM21274h = AbstractC8693b.m21274h(c35221b.getSubtitleDisplay(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            InterfaceC25312u interfaceC25312uM111590a = c35221b.getLearnMoreButton();
            C25307p c25307pM111594c = AbstractC35222c.m111594c();
            C30745a c30745a = new C30745a(28);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312uM111590a, c25307pM111594c, c30745a, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(c35221b, function1, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Modifier m116849K(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1676084479);
        float f13 = 1;
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, f13 * 4, f13 * 8, 0.0f, 0.0f, 12);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m116850L(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            function1.invoke(new AbstractC34145a.b((C9598e) event));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m116851M(C35221b c35221b, Function1 function1, int i13, Composer composer, int i14) {
        m116848J(c35221b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final void m116852N(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1990903501);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            AbstractC41138g.m133573b(AbstractC1099a.m3396r(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 6 * f13, 0.0f, 0.0f, 13), 2 * f13, 0.0f, 2), new C41137f(abstractC22403o, false), c28655q, 6 | (AbstractC22403o.f87638a << 3));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m116853O(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m116852N(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P */
    private static final void m116854P(AbstractC22403o abstractC22403o, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        long jM125368V0;
        long jM125410o;
        boolean zM87151f;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1381269119);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                jM125368V0 = c38072d.m121949b(c28655q, i17).getTransparent();
                jM125410o = c38072d.m121949b(c28655q, i17).getBackgroundDarkStd();
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3);
                Modifier modifierM3411h = AbstractC1102d.m3411h(68 * 4, AbstractC1102d.m3409f(1.0f, modifier4));
                zM87151f = c28655q.m87151f(jM125368V0) | c28655q.m87151f(jM125410o);
                objM87133R = c28655q.m87133R();
                if (zM87151f || objM87133R == C28635l.f115821a) {
                    C2925a c2925a = new C2925a(jM125368V0, jM125410o, 7);
                    c28655q.m87172p0(c2925a);
                    objM87133R = c2925a;
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3479b(modifierM3411h, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                c28655q = c28655q;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16334a(abstractC22403o, modifier3, i13, i14, 3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            jM125368V0 = c38072d2.m121949b(c28655q, i18).getTransparent();
            jM125410o = c38072d2.m121949b(c28655q, i18).getBackgroundDarkStd();
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(68 * 4, AbstractC1102d.m3409f(1.0f, modifier4));
            zM87151f = c28655q.m87151f(jM125368V0) | c28655q.m87151f(jM125410o);
            objM87133R = c28655q.m87133R();
            if (zM87151f) {
                C2925a c2925a2 = new C2925a(jM125368V0, jM125410o, 7);
                c28655q.m87172p0(c2925a2);
                objM87133R = c2925a2;
            } else {
                C2925a c2925a3 = new C2925a(jM125368V0, jM125410o, 7);
                c28655q.m87172p0(c2925a3);
                objM87133R = c2925a3;
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC1125a.m3479b(modifierM3411h2, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16334a(abstractC22403o, modifier3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C14018g m116855Q(long j7, long j13, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C27060c(C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j13)), 0.0f, 0.0f, 14), 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m116856R(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m116857S(AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m116854P(abstractC22403o, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m116858T(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-660991071);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m116859U(int i13, Composer composer, int i14) {
        m116858T(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m116860V(InterfaceC25312u interfaceC25312u, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(741054547);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = interfaceC25312u instanceof C33168c;
            C2314t c2314t = C2314t.f9131w;
            if (z4 || (interfaceC25312u instanceof C4109r5)) {
                c28655q.m87150e0(624365167);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(624307507);
                AbstractC25012a.m73388u(3, 4, c2314t, c28655q, false);
            }
            boolean z13 = interfaceC25312u instanceof C17736e;
            if (z13 || (interfaceC25312u instanceof C4140w1)) {
                c28655q.m87150e0(624446480);
                AbstractC25012a.m73388u(2, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(624507023);
                c28655q.m87173q(false);
            }
            String strM21274h = null;
            C11474i c11474i = interfaceC25312u instanceof C11474i ? (C11474i) interfaceC25312u : null;
            TextResource textResourceM30813E = c11474i != null ? c11474i.getTitle() : null;
            if (textResourceM30813E == null) {
                c28655q.m87150e0(624569270);
            } else {
                c28655q.m87150e0(624569271);
                strM21274h = AbstractC8693b.m21274h(textResourceM30813E, c28655q, TextResource.$stable);
            }
            c28655q.m87173q(false);
            float f13 = 2 * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            boolean zM87153g = c28655q.m87153g(strM21274h) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0176c(strM21274h, function1, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, i14 & 14, 6);
            c28655q.m87173q(true);
            if (z13) {
                AbstractC33745d.m106667z(c28655q, 625179568, c2314t, f13, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(625240111);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29479c(interfaceC25312u, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m116861W(String str, Function1 function1, Object event) {
        C9598e c9598eM104222b;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            if (str == null || (c9598eM104222b = C32995a.f137390a.m104222b(event, str)) == null) {
                c9598eM104222b = (C9598e) event;
            }
            function1.invoke(new AbstractC34145a.b(c9598eM104222b));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m116862X(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, Composer composer, int i14) {
        m116860V(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final void m116863Y(AbstractC35225f.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(553210366);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(c2314t);
            C13404j c13404jM111606g = cVar.getScreenContextMetadata();
            int i16 = C13404j.f46947x;
            Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM66722k, c13404jM111606g, false, c28655q, i16 << 3, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM34129b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC22403o abstractC22403oM111602c = cVar.getHeroImageUrl();
            boolean zM87153g = c28655q.m87153g(c26068uM77569a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C35141b(c26068uM77569a, 13);
                c28655q.m87172p0(objM87133R);
            }
            m116854P(abstractC22403oM111602c, AbstractC1127a.m3486a(c2314t, (Function1) objM87133R), c28655q, AbstractC22403o.f87638a, 0);
            Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            int i17 = i15 & 112;
            m116876f0(cVar.getNavigationTitle(), function1, c28655q, TextResource.$stable | i17);
            InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(cVar.getScreenContextMetadata(), AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 12 * 8, 7), false, c28655q, i16 | 48, 4);
            boolean zM87157i = c28655q.m87157i(cVar) | (i17 == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C35076b(12, cVar, function1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(null, c26068uM77569a, interfaceC22973k1M34113f, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 505);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(cVar, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m116864Z(C26068u c26068u, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51550E(-m116884j0(c26068u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m116866a0(final AbstractC35225f.c cVar, final Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C36287d(cVar, 1), true, -1638435635), 3);
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: vs2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC36479e.m116870c0(cVar, function1, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC36479e.m116872d0(cVar, function1, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -1831212298), 3);
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: vs2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC36479e.m116870c0(cVar, function1, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC36479e.m116872d0(cVar, function1, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 264623253), 3);
        List<InterfaceC25312u> listM111603d = cVar.m111603d();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM111603d.size(), null, new b(a.f155808w, listM111603d), new C37816b(new c(listM111603d, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m116868b0(AbstractC35225f.c cVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m116852N(cVar.getJanuaryJumpstartImageUrl(), c28655q, AbstractC22403o.f87638a);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m116870c0(AbstractC35225f.c cVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m116848J(cVar.getHeaderSection(), function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m116872d0(AbstractC35225f.c cVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m116900z(cVar.getCustomPlanCard(), function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m116874e0(AbstractC35225f.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m116863Y(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    private static final void m116876f0(TextResource textResource, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(968381016);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResource, null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                function2 = function1;
                objM87133R = new C34904e(function2, 26);
                c28655q = c28655q2;
                c28655q.m87172p0(objM87133R);
            } else {
                function2 = function1;
                c28655q = c28655q2;
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
        } else {
            function2 = function1;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3698e(textResource, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m116878g0(Function1 function1) {
        function1.invoke(AbstractC34145a.a.f143127a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m116880h0(TextResource textResource, Function1 function1, int i13, Composer composer, int i14) {
        m116876f0(textResource, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    private static final float m116884j0(C26068u c26068u) {
        if (((C28621h1) c26068u.f103222e.f91958b).m87024x() == 0) {
            return ((C28621h1) c26068u.f103222e.f91959c).m87024x();
        }
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: z */
    private static final void m116900z(InterfaceC25312u interfaceC25312u, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1864124508);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C35220a c35220a = interfaceC25312u instanceof C35220a ? (C35220a) interfaceC25312u : null;
            if (c35220a == null) {
                c28655q.m87150e0(206275384);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(206275385);
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35657b0(function1, 9);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31797c.m98779n(c35220a, (Function1) objM87133R, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29479c(interfaceC25312u, function1, i13, 2);
        }
    }
}
