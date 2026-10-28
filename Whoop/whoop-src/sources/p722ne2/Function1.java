package p722ne2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d41.C11678d;
import ec3.InterfaceC13058l;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import jf3.C21647a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd2.AbstractC22415a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import me2.C25474b;
import me2.InterfaceC25473a;
import me2.InterfaceC25475c;
import mf2.C25514e;
import mx1.C26003i;
import nf3.C26669a;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p701ce2.C4493a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: ne2.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkotlin/Function1;", "Lme2/a$c;", "Ll83/a0;", "onNavEvent", "o", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lme2/c;", "viewState", "Lme2/a;", "onEvent", "p", "(Lme2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "background", "v", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "Lme2/c$a;", "x", "(Lme2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lme2/c$b;", "k", "(Lme2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lme2/b;", "viewModel", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: ne2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105825w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105826x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105827y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f105828z;

        /* JADX INFO: renamed from: ne2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42048a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f105829w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42048a(C21647a c21647a) {
                super(0);
                this.f105829w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f105829w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f105825w = c38266c;
            this.f105826x = interfaceC35951a;
            this.f105827y = interfaceC4339a;
            this.f105828z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, me2.b] */
        @Override // c93.InterfaceC4339a
        public final C25474b invoke() {
            return AbstractC21598x.m60668X(this.f105825w, this.f105826x, new C42048a(this.f105828z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25474b.class), null, this.f105827y);
        }
    }

    /* JADX INFO: renamed from: ne2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.welcome.view.ShepherdWelcomeScreenKt$ShepherdWelcomeScreen$1$1", m100430f = "ShepherdWelcomeScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105830w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f105831x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105831x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f105831x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105830w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1.m79135q(this.f105831x).m74881p(InterfaceC25473a.d.f99745a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m79117A(InterfaceC25475c.a aVar, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m79142x(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m79129k(InterfaceC25475c.b viewState, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(541847346);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            AbstractC33208p0 abstractC33208p0M74892f = viewState.getType();
            TextResource textResourceM74891e = viewState.getSupportText();
            TextResource textResourceM74889c = viewState.getPrimaryButtonText();
            int i16 = i15 & 112;
            boolean z4 = i16 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C25514e(onEvent, 15);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            TextResource textResourceM74890d = viewState.getSecondaryButtonText();
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25514e(onEvent, 16);
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = 196608 | AbstractC33208p0.f138461d;
            int i18 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(abstractC33208p0M74892f, textResourceM74891e, null, textResourceM74889c, interfaceC4339a, true, false, textResourceM74890d, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i17 | (i18 << 3) | (i18 << 9) | (i18 << 21), 0, 3652);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(viewState, onEvent, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m79130l(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC25473a.d.f99745a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m79131m(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC25473a.a.f99743a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m79132n(InterfaceC25475c.b bVar, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m79129k(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m79133o(p715kotlin.jvm.functions.Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(895510689);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onNavEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC13058l viewState = m79135q(interfaceC23462h).getViewState();
            InterfaceC25475c.b bVarM74894b = InterfaceC25475c.b.INSTANCE.m74894b();
            int i15 = AbstractC33208p0.f138461d;
            int i16 = TextResource.$stable;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, bVarM74894b, null, c28655q, (((i15 | i16) | i16) | i16) << 3, 2);
            C25474b c25474bM79135q = m79135q(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c25474bM79135q);
            InterfaceC25475c interfaceC25475cM79136r = m79136r(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i14 & 14) == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4493a(onNavEvent, interfaceC23462h, 4);
                c28655q.m87172p0(objM87133R3);
            }
            m79134p(interfaceC25475cM79136r, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(onNavEvent, i13, 10);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m79134p(InterfaceC25475c viewState, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(190001862);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState instanceof InterfaceC25475c.b) {
            c28655q.m87150e0(-2091798081);
            m79129k((InterfaceC25475c.b) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof InterfaceC25475c.a)) {
                throw AbstractC11895b.m32003v(-2091800004, c28655q, false);
            }
            c28655q.m87150e0(-421119810);
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            InterfaceC25475c.a aVar = (InterfaceC25475c.a) viewState;
            m79140v(aVar.getBackgroundImage(), c28655q, AbstractC22403o.f87638a);
            m79142x(aVar, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(viewState, onEvent, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C25474b m79135q(InterfaceC23462h interfaceC23462h) {
        return (C25474b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final InterfaceC25475c m79136r(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC25475c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m79137s(p715kotlin.jvm.functions.Function1 function1, InterfaceC23462h interfaceC23462h, InterfaceC25473a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC25473a.c) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC25473a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            m79135q(interfaceC23462h).m74881p((InterfaceC25473a.e) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m79138t(p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m79133o(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m79139u(InterfaceC25475c interfaceC25475c, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m79134p(interfaceC25475c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m79140v(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(101528604);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3407d, null, C39102j.f168205g, 0.0f, null, c28655q, 25008, 104);
            c28655q = c28655q;
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m79141w(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m79140v(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m79142x(InterfaceC25475c.a aVar, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        int i14;
        p715kotlin.jvm.functions.Function1 function2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1161443177);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(aVar) : c28655q2.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66723l);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21267a(), null, Integer.valueOf(aVar.getIcon()), AbstractC30060g.m92103Y(c28655q2, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C25514e(function1, 13);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            float f13 = 4;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            TextResource textResourceM74885d = aVar.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM74885d, c28655q2, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i17).getT2();
            int i18 = C2886a.f11498d << 18;
            boolean z13 = false;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, i18, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getDescription(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, i18, 196602);
            AbstractC18489d0.m53380u(11, f13, c2314t, c28655q2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h2 = AbstractC8693b.m21274h(aVar.getWelcomeButton().getLabel(), c28655q2, i16);
            long jM125371X = c38072d.m121949b(c28655q2, i17).getRecovery();
            if (i15 == 32) {
                z13 = true;
            }
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                function2 = function1;
                objM87133R2 = new C25514e(function2, 14);
                c28655q2.m87172p0(objM87133R2);
            } else {
                function2 = function1;
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125371X, null, false, (InterfaceC4339a) objM87133R2, c28655q2, 54, 104);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function2 = function1;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(aVar, function2, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m79143y(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC25473a.a.f99743a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m79144z(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC25473a.b.f99744a);
        return C23454a0.f92919a;
    }
}
