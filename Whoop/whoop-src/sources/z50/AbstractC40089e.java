package z50;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import fy1.AbstractC14874j;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p579wc.C37082e1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vv2.C36537c;
import w50.C36834a;
import x50.C37987b;
import x50.InterfaceC37986a;
import x50.InterfaceC37988c;
import yz1.C39913g;

/* JADX INFO: renamed from: z50.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lw50/a;", "navRouter", "Lx50/b;", "viewModel", "Lkotlin/Function1;", "", "Ll83/a0;", "onConnect", "e", "(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lx50/c;", "viewState", "Lx50/a;", "onEvent", "f", "(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40089e {

    /* JADX INFO: renamed from: z50.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.view.OmronAuthScreenKt$OmronAuthScreen$1$1", m100430f = "OmronAuthScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173006w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37987b f173007x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C37987b c37987b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173007x = c37987b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f173007x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173006w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f173007x.m121673n(InterfaceC37986a.f.f162651a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m128512e(C36834a navRouter, C37987b viewModel, Function1 onConnect, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(onConnect, "onConnect");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2088392612);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewModel) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onConnect) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC37988c.e.f162703b, null, c28655q, 48, 2);
            boolean zM87157i = c28655q.m87157i(viewModel);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(viewModel, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
            AbstractC14874j.m42904c(m128514g(interfaceC28601c1M87260n), "access_omron_auth", c28655q, 48);
            InterfaceC37988c interfaceC37988cM128514g = m128514g(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(viewModel) | c28655q.m87157i(navRouter) | ((i14 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C37082e1(viewModel, navRouter, onConnect, 22);
                c28655q.m87172p0(objM87133R2);
            }
            m128513f(interfaceC37988cM128514g, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(navRouter, viewModel, onConnect, i13, 22);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m128513f(InterfaceC37988c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1227225064);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
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
                    objM87133R = new C39913g(14);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState instanceof InterfaceC37988c.c) {
                c28655q.m87150e0(-1752714510);
                AbstractC40088d.m128499r((InterfaceC37988c.c) viewState, function1, c28655q, i15 & 126, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1752712620);
                AbstractC40087c.m128473e(viewState, function1, c28655q, i15 & 126, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40086b(viewState, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final InterfaceC37988c m128514g(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC37988c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128515h(C37987b c37987b, C36834a c36834a, Function1 function1, InterfaceC37986a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37986a.j) {
            c37987b.m121673n((InterfaceC37986a.j) event);
        } else if (event instanceof InterfaceC37986a.g) {
            c36834a.m118088a((InterfaceC37986a.g) event);
        } else {
            if (!(event instanceof InterfaceC37986a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(((InterfaceC37986a.a) event).getOmronUrl());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m128516i(C36834a c36834a, C37987b c37987b, Function1 function1, int i13, Composer composer, int i14) {
        m128512e(c36834a, c37987b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128517j(InterfaceC37986a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m128518k(InterfaceC37988c interfaceC37988c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128513f(interfaceC37988c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
