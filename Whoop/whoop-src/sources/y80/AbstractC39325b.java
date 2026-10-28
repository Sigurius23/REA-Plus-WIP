package y80;

import a90.C0584a;
import androidx.compose.runtime.Composer;
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
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import q80.AbstractC30037i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w01.C36681f;
import y41.C39211b;

/* JADX INFO: renamed from: y80.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a«\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022T\u0010\u0010\u001aP\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lg80/f;", "viewState", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "e", "(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39325b {

    /* JADX INFO: renamed from: y80.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.deviceeducation.DeviceEducationScreenContainerKt$DeviceEducationScreenContainer$2$1", m100430f = "DeviceEducationScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169175w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f169176x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169176x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f169176x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169175w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f169176x.invoke(InterfaceC21413a.p.f82130a);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017c  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0152  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x016c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    /* JADX INFO: renamed from: e */
    public static final void m125295e(C15565f viewState, Function1 onViewEvent, Function1 onNavigationEvent, Function1 function1, InterfaceC4356r handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int i16;
        boolean z13;
        Object objM87133R;
        C15566g c15566gM43819b;
        EnumC3920d enumC3920dM11951p;
        C15566g c15566gM43819b2;
        Function1 function5;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        C3927k c3927kM43838g;
        Object objM87133R4;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-33670159);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39211b(11);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                AbstractC14874j.m42904c(viewState.getActivationState(), "activation_device_education", c28655q, 48);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new a(onViewEvent, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                c15566gM43819b = viewState.getActivationState().getBffScreenContainerState();
                if (c15566gM43819b != null || (c3927kM43838g = c15566gM43819b.getProgressButtonState()) == null) {
                    enumC3920dM11951p = null;
                } else {
                    enumC3920dM11951p = c3927kM43838g.getState();
                }
                if (enumC3920dM11951p == EnumC3920d.LOADING) {
                    c28655q.m87150e0(1955598924);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1955634481);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(1955711423);
                    if (i16 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C36681f(onViewEvent, 24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if (i16 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C36681f(onViewEvent, 25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(1956066094);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                        if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                            c28655q.m87150e0(1956223977);
                            int i19 = i15 << 6;
                            function5 = function4;
                            AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.DEVICE_EDUCATION, null, onViewEvent, onNavigationEvent, null, function5, null, handleProgressButtonClick, c28655q, (i19 & 57344) | (i19 & 7168) | 48 | ((i15 << 9) & 3670016) | ((i15 << 12) & 234881024), 164);
                            c28655q.m87173q(false);
                        } else {
                            function5 = function4;
                            c28655q.m87150e0(1956668145);
                            c28655q.m87173q(false);
                        }
                    }
                    function3 = function5;
                }
                function5 = function4;
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0584a(viewState, onViewEvent, onNavigationEvent, function3, handleProgressButtonClick, i13, i14, 1);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(handleProgressButtonClick)) {
                i17 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i17;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39211b(11);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            AbstractC14874j.m42904c(viewState.getActivationState(), "activation_device_education", c28655q, 48);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new a(onViewEvent, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(onViewEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            c15566gM43819b = viewState.getActivationState().getBffScreenContainerState();
            if (c15566gM43819b != null) {
                enumC3920dM11951p = null;
            } else {
                enumC3920dM11951p = null;
            }
            if (enumC3920dM11951p == EnumC3920d.LOADING) {
                c28655q.m87150e0(1955598924);
                AbstractC22290s.m64039c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1955634481);
                c28655q.m87173q(false);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                c28655q.m87150e0(1955711423);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C36681f(onViewEvent, 24);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C36681f(onViewEvent, 24);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C36681f(onViewEvent, 25);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C36681f(onViewEvent, 25);
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m64022b(interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q.m87150e0(1956066094);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                    if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                        c28655q.m87150e0(1956223977);
                        int i110 = i15 << 6;
                        function5 = function4;
                        AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.DEVICE_EDUCATION, null, onViewEvent, onNavigationEvent, null, function5, null, handleProgressButtonClick, c28655q, (i110 & 57344) | (i110 & 7168) | 48 | ((i15 << 9) & 3670016) | ((i15 << 12) & 234881024), 164);
                        c28655q.m87173q(false);
                    } else {
                        function5 = function4;
                        c28655q.m87150e0(1956668145);
                        c28655q.m87173q(false);
                    }
                }
                function3 = function5;
            }
            function5 = function4;
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0584a(viewState, onViewEvent, onNavigationEvent, function3, handleProgressButtonClick, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m125296f(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m125297g(Function1 function1) {
        function1.invoke(InterfaceC21413a.p.f82130a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m125298h(Function1 function1) {
        function1.invoke(InterfaceC21413a.p.f82130a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m125299i(C15565f c15565f, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, int i13, int i14, Composer composer, int i15) {
        m125295e(c15565f, function1, function2, function3, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
