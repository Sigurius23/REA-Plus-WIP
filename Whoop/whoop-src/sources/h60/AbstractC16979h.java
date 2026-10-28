package h60;

import am2.C1040r;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import e60.C12756a;
import f60.C14137b;
import f60.C14138c;
import f60.InterfaceC14136a;
import fc0.C14361e;
import fy1.AbstractC14874j;
import h00.C16513l0;
import k11.C22123f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33205o0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: h60.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Le60/a;", "navRouter", "Lf60/b;", "viewModel", "", "nextScreen", "Lkotlin/Function0;", "Ll83/a0;", "onSelectFiles", "onSelectImages", "e", "(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lf60/c;", "viewState", "Lkotlin/Function1;", "Lf60/a;", "onEvent", "f", "(Lf60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16979h {

    /* JADX INFO: renamed from: h60.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.view.ReconfirmLabsScreenKt$ReconfirmLabsScreen$1$1", m100430f = "ReconfirmLabsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65144w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14137b f65145x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f65146y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C14137b c14137b, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65145x = c14137b;
            this.f65146y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f65145x, this.f65146y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f65144w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f65145x.m40243n(new InterfaceC14136a.g(this.f65146y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m47791e(C12756a navRouter, C14137b viewModel, String str, InterfaceC4339a onSelectFiles, InterfaceC4339a onSelectImages, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(onSelectFiles, "onSelectFiles");
        AbstractC22676k.m65750j(onSelectImages, "onSelectImages");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(139251540);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewModel) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onSelectFiles) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onSelectImages) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), new C14138c(new C14138c.a(C33205o0.f138451a.m105288b(), null, null, 6, null), null, null, 6, null), null, c28655q, 0, 2);
            int i15 = i14 & 896;
            boolean zM87157i = c28655q.m87157i(viewModel) | (i15 == 256);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(viewModel, str, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
            AbstractC14874j.m42904c(m47793g(interfaceC28601c1M87260n), "access_reconfirm_labs", c28655q, 48);
            C14138c c14138cM47793g = m47793g(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(viewModel) | (i15 == 256) | c28655q.m87157i(navRouter) | ((i14 & 7168) == 2048) | ((i14 & 57344) == 16384);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C1040r c1040r = new C1040r(viewModel, str, navRouter, onSelectFiles, onSelectImages, 13);
                c28655q.m87172p0(c1040r);
                objM87133R2 = c1040r;
            }
            m47792f(c14138cM47793g, (Function1) objM87133R2, c28655q, 0, r17);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) navRouter, (Object) viewModel, (Object) str, (Object) onSelectFiles, (Object) onSelectImages, i13, 14, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m47792f(C14138c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2099461480);
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
                    objM87133R = new C16513l0(23);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1052141304);
                AbstractC16976e.m47746j(viewState.getFullScreenModal(), function1, c28655q, i15 & 112, 0);
                c28655q.m87173q(false);
            } else if (viewState.getPreviewContent() != null) {
                c28655q.m87150e0(-1052137819);
                AbstractC16977f.m47756f(viewState.getPreviewContent(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(-1052134460);
                AbstractC16978g.m47777p(viewState.getScreenContent(), function1, c28655q, (i15 & 112) | C22123f.f85827n | C3927k.f16020r | C4092p2.f16593v | C9598e.f28134d, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1743633722);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, function2, i14, 16);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final C14138c m47793g(InterfaceC28670t2 interfaceC28670t2) {
        return (C14138c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47794h(C14137b c14137b, String str, C12756a c12756a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC14136a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC14136a.g) {
            c14137b.m40243n(new InterfaceC14136a.g(str));
        } else if (event instanceof InterfaceC14136a.k) {
            c14137b.m40243n((InterfaceC14136a.k) event);
        } else if (event instanceof InterfaceC14136a.f) {
            c12756a.m35701a((InterfaceC14136a.f) event);
        } else if (event instanceof InterfaceC14136a.h) {
            interfaceC4339a.invoke();
        } else {
            if (!(event instanceof InterfaceC14136a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC4339a2.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47795i(C12756a c12756a, C14137b c14137b, String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m47791e(c12756a, c14137b, str, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m47796j(InterfaceC14136a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47797k(C14138c c14138c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47792f(c14138c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
