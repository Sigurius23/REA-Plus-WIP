package o80;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import be1.C3172f;
import c31.C3927k;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import f70.C14201q0;
import f80.C14246e;
import fy1.AbstractC14874j;
import g80.C15565f;
import g80.C15566g;
import j80.InterfaceC21413a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27207n;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p714k80.AbstractC22289r;
import p714k80.AbstractC22290s;
import p714k80.Function0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q80.AbstractC30037i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: o80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a±\u0001\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042T\u0010\u0012\u001aP\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lg80/f;", "viewState", "Lf80/e;", "saveCredentialOnAdvance", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "d", "(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27655a {

    /* JADX INFO: renamed from: o80.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.accountcreation.AccountCreationScreenContainerKt$AccountCreationScreenContainer$1$1", m100430f = "AccountCreationScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111269w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f111270x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f111271y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2464x2 f111272z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, boolean z4, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111270x = function1;
            this.f111271y = z4;
            this.f111272z = interfaceC2464x2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f111270x, this.f111271y, this.f111272z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f111269w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f111270x.invoke(InterfaceC21413a.i.f82113a);
            AbstractC22290s.m64042f(this.f111271y, this.f111272z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: o80.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.accountcreation.AccountCreationScreenContainerKt$AccountCreationScreenContainer$4$1", m100430f = "AccountCreationScreenContainer.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lm91/u;", "currentScreen", "Lf70/q0;", "memberInfo", "Ll83/a0;", "<anonymous>", "(Lm91/u;Lf70/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Context f111273E;

        /* JADX INFO: renamed from: w */
        int f111274w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f111275x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f111276y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14246e f111277z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C14246e c14246e, Context context, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f111277z = c14246e;
            this.f111273E = context;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC25312u interfaceC25312u, C14201q0 c14201q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(this.f111277z, this.f111273E, interfaceC30057d);
            bVar.f111275x = interfaceC25312u;
            bVar.f111276y = c14201q0;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f111275x;
            C14201q0 c14201q0 = (C14201q0) this.f111276y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111274w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14246e c14246e = this.f111277z;
                Context context = this.f111273E;
                this.f111275x = null;
                this.f111276y = null;
                this.f111274w = 1;
                if (C14246e.m40709b(c14246e, context, interfaceC25312u, c14201q0, false, this, 8, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: d */
    public static final void m83617d(C15565f viewState, C14246e saveCredentialOnAdvance, Function1 onViewEvent, Function1 onNavigationEvent, Function1 onAnalyticsEvent, InterfaceC4356r handleProgressButtonClick, Composer composer, int i13) {
        int i14;
        C3927k c3927kM43838g;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(saveCredentialOnAdvance, "saveCredentialOnAdvance");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(117338017);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(saveCredentialOnAdvance) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(handleProgressButtonClick) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_creation", c28655q, 48);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            boolean zM64043g = AbstractC22290s.m64043g(c28655q, 0);
            int i15 = i14 & 896;
            boolean zM87155h = (i15 == 256) | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87155h || objM87133R == c28676v0) {
                objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            C15566g c15566gM43819b = viewState.getActivationState().getBffScreenContainerState();
            if (((c15566gM43819b == null || (c3927kM43838g = c15566gM43819b.getProgressButtonState()) == null) ? null : c3927kM43838g.getState()) == EnumC3920d.LOADING) {
                c28655q.m87150e0(-485282276);
                AbstractC22290s.m64039c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-485246719);
                c28655q.m87173q(false);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                c28655q.m87150e0(-485171823);
                boolean z4 = i15 == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C27207n(onViewEvent, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean z13 = i15 == 256;
                Object objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C27207n(onViewEvent, 11);
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                c28655q.m87150e0(-484880578);
                AbstractC22290s.m64039c(c28655q, 0);
                AbstractC22289r.m64035b(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                C15566g c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                    c28655q.m87150e0(-484713116);
                    C15566g c15566gM43819b3 = viewState.getActivationState().getBffScreenContainerState();
                    ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.ACCOUNT_CREATION;
                    boolean zM87157i = c28655q.m87157i(saveCredentialOnAdvance) | c28655q.m87157i(context);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87157i || objM87133R4 == c28676v0) {
                        objM87133R4 = new b(saveCredentialOnAdvance, context, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i16 = i14 << 3;
                    AbstractC30037i.m91955m(c15566gM43819b3, activationFlowDestination, null, onViewEvent, onNavigationEvent, null, onAnalyticsEvent, (Function3) objM87133R4, handleProgressButtonClick, c28655q, (i16 & 57344) | (i16 & 7168) | 48 | (3670016 & (i14 << 6)) | ((i14 << 9) & 234881024), 36);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-483971999);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(viewState, saveCredentialOnAdvance, onViewEvent, onNavigationEvent, onAnalyticsEvent, handleProgressButtonClick, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m83618e(Function1 function1) {
        function1.invoke(InterfaceC21413a.i.f82113a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m83619f(Function1 function1) {
        function1.invoke(InterfaceC21413a.i.f82113a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m83620g(C15565f c15565f, C14246e c14246e, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, int i13, Composer composer, int i14) {
        m83617d(c15565f, c14246e, function1, function2, function3, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
