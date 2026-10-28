package q90;

import androidx.compose.runtime.Composer;
import aq1.C1909c;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import fy1.AbstractC14874j;
import g80.C15565f;
import g80.C15566g;
import j80.InterfaceC21413a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p62.C28947h;
import p714k80.AbstractC22289r;
import p714k80.AbstractC22290s;
import p714k80.Function0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q80.AbstractC30037i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: q90.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a©\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022T\u0010\u0010\u001aP\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lg80/f;", "viewState", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "d", "(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30068a {

    /* JADX INFO: renamed from: q90.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.postpairing.PostPairingScreenContainerKt$PostPairingScreenContainer$1$1", m100430f = "PostPairingScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122685w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f122686x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f122687y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2464x2 f122688z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, boolean z4, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122686x = function1;
            this.f122687y = z4;
            this.f122688z = interfaceC2464x2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f122686x, this.f122687y, this.f122688z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122685w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f122686x.invoke(InterfaceC21413a.x.f82149a);
            AbstractC22290s.m64042f(this.f122687y, this.f122688z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m92148d(C15565f viewState, Function1 onViewEvent, Function1 onNavigationEvent, Function1 onAnalyticsEvent, InterfaceC4356r handleProgressButtonClick, Composer composer, int i13) {
        int i14;
        C3927k c3927kM43838g;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(545781339);
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
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(handleProgressButtonClick) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            boolean zM64043g = AbstractC22290s.m64043g(c28655q, 0);
            AbstractC14874j.m42904c(viewState.getActivationState(), "activation_post_pairing", c28655q, 48);
            int i15 = i14 & 112;
            boolean zM87155h = (i15 == 32) | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87155h || objM87133R == c28676v0) {
                objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            C15566g c15566gM43819b = viewState.getActivationState().getBffScreenContainerState();
            if (((c15566gM43819b == null || (c3927kM43838g = c15566gM43819b.getProgressButtonState()) == null) ? null : c3927kM43838g.getState()) == EnumC3920d.LOADING) {
                c28655q.m87150e0(-1373186430);
                AbstractC22290s.m64039c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1373150873);
                c28655q.m87173q(false);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                c28655q.m87150e0(-1373073683);
                boolean z4 = i15 == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C28947h(onViewEvent, 19);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean z13 = i15 == 32;
                Object objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C28947h(onViewEvent, 20);
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                c28655q.m87150e0(-1372711324);
                AbstractC22290s.m64039c(c28655q, 0);
                AbstractC22289r.m64035b(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                C15566g c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                    c28655q.m87150e0(-1372553565);
                    int i16 = i14 << 6;
                    AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.POST_PAIRING, null, onViewEvent, onNavigationEvent, null, onAnalyticsEvent, null, handleProgressButtonClick, c28655q, (i16 & 57344) | (i16 & 7168) | 48 | ((i14 << 9) & 3670016) | ((i14 << 12) & 234881024), 164);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1372113241);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) viewState, (Object) onViewEvent, (InterfaceC23459e) onNavigationEvent, (Object) onAnalyticsEvent, (Object) handleProgressButtonClick, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m92149e(Function1 function1) {
        function1.invoke(InterfaceC21413a.x.f82149a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m92150f(Function1 function1) {
        function1.invoke(InterfaceC21413a.x.f82149a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m92151g(C15565f c15565f, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, int i13, Composer composer, int i14) {
        m92148d(c15565f, function1, function2, function3, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
