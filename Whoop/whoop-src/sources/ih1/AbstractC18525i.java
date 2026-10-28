package ih1;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc0.C14361e;
import fh1.C14488a;
import fh1.C14490c;
import fy1.AbstractC14874j;
import gh1.C15853c;
import gh1.C15854d;
import gh1.InterfaceC15852b;
import hy0.C17734d1;
import ig0.C18468h;
import ih0.C18510t;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.C33205o0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: ih1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "source", "Lfh1/c;", "navRouter", "Lfh1/a;", "actionRouter", "giftCode", "Ll83/a0;", "f", "(Ljava/lang/String;Lfh1/c;Lfh1/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lgh1/d;", "viewState", "Lkotlin/Function1;", "Lgh1/b;", "onEvent", "e", "(Lgh1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgh1/c;", "viewModel", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18525i {

    /* JADX INFO: renamed from: ih1.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f72168w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f72169x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f72170y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f72171z;

        /* JADX INFO: renamed from: ih1.i$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41744a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f72172w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41744a(C21647a c21647a) {
                super(0);
                this.f72172w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f72172w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f72168w = c38266c;
            this.f72169x = interfaceC35951a;
            this.f72170y = interfaceC4339a;
            this.f72171z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, gh1.c] */
        @Override // c93.InterfaceC4339a
        public final C15853c invoke() {
            return AbstractC21598x.m60668X(this.f72168w, this.f72169x, new C41744a(this.f72171z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15853c.class), null, this.f72170y);
        }
    }

    /* JADX INFO: renamed from: ih1.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.view.GiftedScreenKt$GiftedScreen$1$1", m100430f = "GiftedScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f72173E;

        /* JADX INFO: renamed from: w */
        int f72174w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14488a f72175x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f72176y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f72177z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C14488a c14488a, String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72175x = c14488a;
            this.f72176y = str;
            this.f72177z = str2;
            this.f72173E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f72175x, this.f72176y, this.f72177z, this.f72173E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f72174w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f72175x.m41395d(new InterfaceC15852b.e(this.f72176y));
            AbstractC18525i.m53692g(this.f72173E).m44753o(new InterfaceC15852b.i(this.f72177z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ih1.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.view.GiftedScreenKt$GiftedScreen$2$1", m100430f = "GiftedScreen.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f72179x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14490c f72180y;

        /* JADX INFO: renamed from: ih1.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C14490c f72181w;

            public a(C14490c c14490c) {
                this.f72181w = c14490c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC15852b.g gVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f72181w.m41397b(gVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C14490c c14490c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72179x = interfaceC23462h;
            this.f72180y = c14490c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f72179x, this.f72180y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72178w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM44752n = AbstractC18525i.m53692g(this.f72179x).getNavigationEvents();
                a aVar = new a(this.f72180y);
                this.f72178w = 1;
                if (interfaceC13058lM44752n.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m53690e(C15854d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-299155020);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
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
                    objM87133R = new C18510t(11);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            } else {
                function2 = function1;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(274839481);
                AbstractC18521e.m53649j(viewState.getFullScreenModal(), function2, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(-69796785);
                AbstractC18523g.m53656c(viewState, function2, c28655q, i15 & 126);
                AbstractC18524h.m53674o(viewState.getScreenContent(), function2, null, c28655q, i15 & 112, 4);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-69668786);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, function2, i14, 28);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m53691f(String source, C14490c navRouter, C14488a c14488a, String giftCode, Composer composer, int i13) {
        int i14;
        InterfaceC23462h interfaceC23462h;
        C14488a actionRouter = c14488a;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(giftCode, "giftCode");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-284330540);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(actionRouter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(giftCode) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
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
            InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m53692g(interfaceC23462h2).getViewState(), new C15854d(null, new C15854d.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null), null, c28655q, 0, 2);
            C15853c c15853cM53692g = m53692g(interfaceC23462h2);
            boolean zM87157i = ((i14 & 7168) == 2048) | ((i14 & 14) == 4) | c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                interfaceC23462h = interfaceC23462h2;
                b bVar = new b(actionRouter, source, giftCode, interfaceC23462h, null);
                actionRouter = actionRouter;
                c28655q.m87172p0(bVar);
                objM87133R2 = bVar;
            } else {
                interfaceC23462h = interfaceC23462h2;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c15853cM53692g);
            C15853c c15853cM53692g2 = m53692g(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c15853cM53692g2);
            AbstractC14874j.m42904c(m53693h(interfaceC28601c1M87260n), "gifted", c28655q, 48);
            C15854d c15854dM53693h = m53693h(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C18468h(actionRouter, navRouter, interfaceC23462h, 1);
                c28655q.m87172p0(objM87133R4);
            }
            m53690e(c15854dM53693h, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17734d1(source, navRouter, actionRouter, giftCode, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C15853c m53692g(InterfaceC23462h interfaceC23462h) {
        return (C15853c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C15854d m53693h(InterfaceC28670t2 interfaceC28670t2) {
        return (C15854d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m53694i(C14488a c14488a, C14490c c14490c, InterfaceC23462h interfaceC23462h, InterfaceC15852b event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC15852b interfaceC15852bM41395d = c14488a.m41395d(event);
        if (interfaceC15852bM41395d instanceof InterfaceC15852b.j) {
            m53692g(interfaceC23462h).m44753o((InterfaceC15852b.j) interfaceC15852bM41395d);
        } else if (interfaceC15852bM41395d instanceof InterfaceC15852b.g) {
            c14490c.m41397b((InterfaceC15852b.g) interfaceC15852bM41395d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m53695j(String str, C14490c c14490c, C14488a c14488a, String str2, int i13, Composer composer, int i14) {
        m53691f(str, c14490c, c14488a, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m53696k(InterfaceC15852b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m53697l(C15854d c15854d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m53690e(c15854d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
