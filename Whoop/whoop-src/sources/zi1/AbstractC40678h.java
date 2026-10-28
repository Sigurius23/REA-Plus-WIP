package zi1;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.items.ArticleTileModelEvent;
import ec3.InterfaceC13087t1;
import jf3.C21647a;
import l83.C23454a0;
import nf3.C26669a;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p664yy.C39850b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wq1.C37508b;
import x30.C37894h1;
import xf3.C38266c;
import xi1.C38322b;
import xi1.InterfaceC38321a;
import yi1.C39568b;
import yi1.InterfaceC39569c;
import yi1.InterfaceC39570d;

/* JADX INFO: renamed from: zi1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lyi1/b;", "viewModel", "Lxi1/b;", "navRouter", "Ll83/a0;", "d", "(Lyi1/b;Lxi1/b;Landroidx/compose/runtime/Composer;II)V", "Lyi1/d;", "viewState", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40678h {

    /* JADX INFO: renamed from: zi1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f175593w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21647a c21647a) {
            super(0);
            this.f175593w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f175593w;
        }
    }

    /* JADX INFO: renamed from: zi1.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.health.monitor.medical.view.HeartHealthTabKt$HeartHealthTab$1$1", m100430f = "HeartHealthTab.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f175594w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39568b f175595x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C39568b c39568b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f175595x = c39568b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f175595x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f175594w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f175595x.m126372n(InterfaceC39569c.a.f170261a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m132060d(C39568b c39568b, C38322b navRouter, Composer composer, int i13, int i14) {
        C39568b c39568b2;
        int i15;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1401226902);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                c39568b2 = c39568b;
                int i16 = c28655q.m87157i(c39568b2) ? 4 : 2;
                i15 = i13 | i16;
            } else {
                c39568b2 = c39568b;
            }
            i15 = i13 | i16;
        } else {
            c39568b2 = c39568b;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q.m87140Z();
            int i17 = i13 & 1;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                int i18 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                c28655q.m87152f0(1509148315);
                C26669a c26669a = C29155a.f118017b;
                if (c26669a == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                C38266c c38266c = c26669a.f106046a.f159364d;
                C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
                boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC21598x.m60668X(c38266c, null, new a(c21647aM114690r), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39568b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                c39568b2 = (C39568b) ((AbstractC1637w1) objM87133R);
            }
            c28655q.m87175r();
            InterfaceC13087t1 interfaceC13087t1M126371l = c39568b2.getViewState();
            InterfaceC39570d.b bVar = InterfaceC39570d.b.f170266a;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(interfaceC13087t1M126371l, bVar, null, c28655q, 48, 2);
            boolean zM87157i = c28655q.m87157i(c39568b2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(c39568b2, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            InterfaceC39570d interfaceC39570dM132061e = m132061e(interfaceC28601c1M87260n);
            if (AbstractC22676k.m65745e(interfaceC39570dM132061e, bVar)) {
                c28655q.m87150e0(-2040666416);
                AbstractC40667b.m132008b(c28655q, 0);
                c28655q.m87173q(false);
            } else if (interfaceC39570dM132061e instanceof InterfaceC39570d.a) {
                c28655q.m87150e0(1163922466);
                InterfaceC39570d interfaceC39570dM132061e2 = m132061e(interfaceC28601c1M87260n);
                AbstractC22676k.m65748h(interfaceC39570dM132061e2, "null cannot be cast to non-null type com.whoop.health.monitor.medical.presentation.HeartHealthViewState.Error");
                InterfaceC39570d.a aVar = (InterfaceC39570d.a) interfaceC39570dM132061e2;
                boolean zM87157i2 = c28655q.m87157i(c39568b2);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C39850b0(c39568b2, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC40665a.m131995c(aVar, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                if (!(interfaceC39570dM132061e instanceof InterfaceC39570d.c)) {
                    throw AbstractC11895b.m32003v(-2040667607, c28655q, false);
                }
                c28655q.m87150e0(1164142101);
                InterfaceC39570d interfaceC39570dM132061e3 = m132061e(interfaceC28601c1M87260n);
                AbstractC22676k.m65748h(interfaceC39570dM132061e3, "null cannot be cast to non-null type com.whoop.health.monitor.medical.presentation.HeartHealthViewState.Success");
                InterfaceC39570d.c cVar = (InterfaceC39570d.c) interfaceC39570dM132061e3;
                boolean zM87157i3 = c28655q.m87157i(navRouter);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C37894h1(navRouter, 17);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC40677g.m132051e(cVar, (Function1) objM87133R4, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C39568b c39568b3 = c39568b2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(c39568b3, i13, navRouter, i14, 29);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final InterfaceC39570d m132061e(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC39570d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m132062f(C39568b c39568b) {
        c39568b.m126372n(InterfaceC39569c.a.f170261a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132063g(C38322b c38322b, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof ArticleTileModelEvent) {
            c38322b.m122812c(new InterfaceC38321a.b((ArticleTileModelEvent) it));
        }
        if (it instanceof InterfaceC38321a) {
            c38322b.m122812c((InterfaceC38321a) it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132064h(C39568b c39568b, C38322b c38322b, int i13, int i14, Composer composer, int i15) {
        m132060d(c39568b, c38322b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
