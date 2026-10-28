package n80;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
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
import l80.AbstractC23438o;
import l83.C23454a0;
import mf2.C25514e;
import n72.C26439b;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import q80.AbstractC30037i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: n80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÉ\u0001\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u001a\b\u0002\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022T\u0010\u0012\u001aP\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lg80/f;", "viewState", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lkotlin/Function0;", "askForPushNotificationPermissions", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "g", "(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26447a {

    /* JADX INFO: renamed from: n80.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.accountactivation.AccountActivationScreenContainerKt$AccountActivationScreenContainer$4$1", m100430f = "AccountActivationScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105048w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f105049x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f105050y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2464x2 f105051z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, boolean z4, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105049x = function1;
            this.f105050y = z4;
            this.f105051z = interfaceC2464x2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f105049x, this.f105050y, this.f105051z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105048w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f105049x.invoke(InterfaceC21413a.h.f82111a);
            AbstractC22290s.m64042f(this.f105050y, this.f105051z);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0185  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:107:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:121:0x01da  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:126:0x0224  */
    /* JADX WARN: Code duplicated, block: B:129:0x0232  */
    /* JADX WARN: Code duplicated, block: B:132:0x023e  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0118  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    /* JADX INFO: renamed from: g */
    public static final void m78306g(C15565f viewState, Function1 onViewEvent, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        InterfaceC2464x2 interfaceC2464x2;
        boolean zM64043g;
        int i24;
        boolean z13;
        boolean zM87155h;
        Object objM87133R;
        C15566g c15566gM43819b;
        EnumC3920d enumC3920dM11951p;
        C15566g c15566gM43819b2;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        C3927k c3927kM43838g;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        int i25;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1990102707);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(handleProgressButtonClick)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C26439b(1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function4 = (Function1) objM87133R6;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C26439b(2);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C26439b(3);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function6;
                        }
                        interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                        zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                        AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                        i24 = i15 & 112;
                        if (i24 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                        objM87133R = c28655q.m87133R();
                        if (zM87155h || objM87133R == c28676v0) {
                            objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                            c28655q.m87150e0(580021136);
                            AbstractC22290s.m64039c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(580056693);
                            c28655q.m87173q(false);
                        }
                        if (viewState.getActivationState().getIsFullScreenError()) {
                            c28655q.m87150e0(580133759);
                            if (i24 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C25514e(onViewEvent, 9);
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                            if (i24 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z15 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C25514e(onViewEvent, 10);
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                            c28655q.m87173q(false);
                        } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                            c28655q.m87150e0(580492274);
                            AbstractC22290s.m64039c(c28655q, 0);
                            AbstractC22289r.m64035b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                            if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                                c28655q.m87150e0(580652916);
                                int i27 = i15;
                                int i28 = i27 << 6;
                                AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i28 & 3670016) | (i28 & 7168) | 48 | (57344 & i28) | (458752 & i28) | ((i27 << 9) & 234881024), 132);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(581182613);
                                c28655q.m87173q(false);
                            }
                        }
                        function7 = function10;
                        function8 = function11;
                    } else {
                        c28655q.m87138X();
                        function7 = function5;
                        function8 = function6;
                    }
                    function9 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(handleProgressButtonClick)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C26439b(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function4 = (Function1) objM87133R6;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26439b(2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26439b(3);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function6;
                    }
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                    AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                    objM87133R = c28655q.m87133R();
                    if (zM87155h) {
                        objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                        c28655q.m87150e0(580021136);
                        AbstractC22290s.m64039c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(580056693);
                        c28655q.m87173q(false);
                    }
                    if (viewState.getActivationState().getIsFullScreenError()) {
                        c28655q.m87150e0(580133759);
                        if (i24 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            objM87133R2 = new C25514e(onViewEvent, 9);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25514e(onViewEvent, 9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C25514e(onViewEvent, 10);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C25514e(onViewEvent, 10);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m64022b(interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(580492274);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                        if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                            c28655q.m87150e0(580652916);
                            int i29 = i15;
                            int i210 = i29 << 6;
                            AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i210 & 3670016) | (i210 & 7168) | 48 | (57344 & i210) | (458752 & i210) | ((i29 << 9) & 234881024), 132);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(581182613);
                            c28655q.m87173q(false);
                        }
                    }
                    function7 = function10;
                    function8 = function11;
                } else {
                    c28655q.m87138X();
                    function7 = function5;
                    function8 = function6;
                }
                function9 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(handleProgressButtonClick)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C26439b(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function4 = (Function1) objM87133R6;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26439b(2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26439b(3);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function6;
                    }
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                    AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                    objM87133R = c28655q.m87133R();
                    if (zM87155h) {
                        objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                        c28655q.m87150e0(580021136);
                        AbstractC22290s.m64039c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(580056693);
                        c28655q.m87173q(false);
                    }
                    if (viewState.getActivationState().getIsFullScreenError()) {
                        c28655q.m87150e0(580133759);
                        if (i24 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            objM87133R2 = new C25514e(onViewEvent, 9);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25514e(onViewEvent, 9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C25514e(onViewEvent, 10);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C25514e(onViewEvent, 10);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m64022b(interfaceC4339a3, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(580492274);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                        if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                            c28655q.m87150e0(580652916);
                            int i211 = i15;
                            int i212 = i211 << 6;
                            AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i212 & 3670016) | (i212 & 7168) | 48 | (57344 & i212) | (458752 & i212) | ((i211 << 9) & 234881024), 132);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(581182613);
                            c28655q.m87173q(false);
                        }
                    }
                    function7 = function10;
                    function8 = function11;
                } else {
                    c28655q.m87138X();
                    function7 = function5;
                    function8 = function6;
                }
                function9 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C26439b(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26439b(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26439b(3);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function6;
                }
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                objM87133R = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                    c28655q.m87150e0(580021136);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(580056693);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(580133759);
                    if (i24 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C25514e(onViewEvent, 9);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25514e(onViewEvent, 9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C25514e(onViewEvent, 10);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C25514e(onViewEvent, 10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a4, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q.m87150e0(580492274);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                    if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                        c28655q.m87150e0(580652916);
                        int i213 = i15;
                        int i214 = i213 << 6;
                        AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i214 & 3670016) | (i214 & 7168) | 48 | (57344 & i214) | (458752 & i214) | ((i213 << 9) & 234881024), 132);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(581182613);
                        c28655q.m87173q(false);
                    }
                }
                function7 = function10;
                function8 = function11;
            } else {
                c28655q.m87138X();
                function7 = function5;
                function8 = function6;
            }
            function9 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
            }
        }
        i15 |= 384;
        function4 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(handleProgressButtonClick)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C26439b(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function4 = (Function1) objM87133R6;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C26439b(2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26439b(3);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function6;
                    }
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                    AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                    objM87133R = c28655q.m87133R();
                    if (zM87155h) {
                        objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                        c28655q.m87150e0(580021136);
                        AbstractC22290s.m64039c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(580056693);
                        c28655q.m87173q(false);
                    }
                    if (viewState.getActivationState().getIsFullScreenError()) {
                        c28655q.m87150e0(580133759);
                        if (i24 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            objM87133R2 = new C25514e(onViewEvent, 9);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25514e(onViewEvent, 9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C25514e(onViewEvent, 10);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C25514e(onViewEvent, 10);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m64022b(interfaceC4339a5, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(580492274);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                        if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                            c28655q.m87150e0(580652916);
                            int i215 = i15;
                            int i216 = i215 << 6;
                            AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i216 & 3670016) | (i216 & 7168) | 48 | (57344 & i216) | (458752 & i216) | ((i215 << 9) & 234881024), 132);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(581182613);
                            c28655q.m87173q(false);
                        }
                    }
                    function7 = function10;
                    function8 = function11;
                } else {
                    c28655q.m87138X();
                    function7 = function5;
                    function8 = function6;
                }
                function9 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C26439b(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26439b(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26439b(3);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function6;
                }
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                objM87133R = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                    c28655q.m87150e0(580021136);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(580056693);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(580133759);
                    if (i24 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C25514e(onViewEvent, 9);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25514e(onViewEvent, 9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C25514e(onViewEvent, 10);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C25514e(onViewEvent, 10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a6, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q.m87150e0(580492274);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                    if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                        c28655q.m87150e0(580652916);
                        int i217 = i15;
                        int i218 = i217 << 6;
                        AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i218 & 3670016) | (i218 & 7168) | 48 | (57344 & i218) | (458752 & i218) | ((i217 << 9) & 234881024), 132);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(581182613);
                        c28655q.m87173q(false);
                    }
                }
                function7 = function10;
                function8 = function11;
            } else {
                c28655q.m87138X();
                function7 = function5;
                function8 = function6;
            }
            function9 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
            }
        }
        i15 |= 3072;
        function5 = function2;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C26439b(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C26439b(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function5;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26439b(3);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function6;
                }
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                objM87133R = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                    c28655q.m87150e0(580021136);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(580056693);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(580133759);
                    if (i24 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C25514e(onViewEvent, 9);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25514e(onViewEvent, 9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C25514e(onViewEvent, 10);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C25514e(onViewEvent, 10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a7, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q.m87150e0(580492274);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                    if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                        c28655q.m87150e0(580652916);
                        int i219 = i15;
                        int i2110 = i219 << 6;
                        AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i2110 & 3670016) | (i2110 & 7168) | 48 | (57344 & i2110) | (458752 & i2110) | ((i219 << 9) & 234881024), 132);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(581182613);
                        c28655q.m87173q(false);
                    }
                }
                function7 = function10;
                function8 = function11;
            } else {
                c28655q.m87138X();
                function7 = function5;
                function8 = function6;
            }
            function9 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
            }
        }
        i15 |= 24576;
        function6 = function3;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(handleProgressButtonClick)) {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i25;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C26439b(1);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C26439b(2);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
            } else {
                function10 = function5;
            }
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C26439b(3);
                    c28655q.m87172p0(objM87133R4);
                }
                function11 = (Function1) objM87133R4;
            } else {
                function11 = function6;
            }
            interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            zM64043g = AbstractC22290s.m64043g(c28655q, 0);
            AbstractC14874j.m42904c(viewState.getActivationState(), "activation_account_activation", c28655q, 48);
            i24 = i15 & 112;
            if (i24 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
            objM87133R = c28655q.m87133R();
            if (zM87155h) {
                objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(onViewEvent, zM64043g, interfaceC2464x2, null);
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
                c28655q.m87150e0(580021136);
                AbstractC22290s.m64039c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(580056693);
                c28655q.m87173q(false);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                c28655q.m87150e0(580133759);
                if (i24 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C25514e(onViewEvent, 9);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C25514e(onViewEvent, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                if (i24 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C25514e(onViewEvent, 10);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C25514e(onViewEvent, 10);
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m64022b(interfaceC4339a8, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                c28655q.m87150e0(580492274);
                AbstractC22290s.m64039c(c28655q, 0);
                AbstractC22289r.m64035b(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c15566gM43819b2 = viewState.getActivationState().getBffScreenContainerState();
                if ((c15566gM43819b2 != null ? c15566gM43819b2.m43839h() : null) != null) {
                    c28655q.m87150e0(580652916);
                    int i2111 = i15;
                    int i2112 = i2111 << 6;
                    AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), ActivationFlowDestination.ACCOUNT_ACTIVATION, null, onViewEvent, function4, function10, function11, null, handleProgressButtonClick, c28655q, (i2112 & 3670016) | (i2112 & 7168) | 48 | (57344 & i2112) | (458752 & i2112) | ((i2111 << 9) & 234881024), 132);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(581182613);
                    c28655q.m87173q(false);
                }
            }
            function7 = function10;
            function8 = function11;
        } else {
            c28655q.m87138X();
            function7 = function5;
            function8 = function6;
        }
        function9 = function4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f((Object) viewState, onViewEvent, function9, (Object) function7, (Object) function8, (Object) handleProgressButtonClick, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m78307h(AbstractC23438o it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m78308i(InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m78309j(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m78310k(Function1 function1) {
        function1.invoke(InterfaceC21413a.h.f82111a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m78311l(Function1 function1) {
        function1.invoke(InterfaceC21413a.h.f82111a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m78312m(C15565f c15565f, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, int i13, int i14, Composer composer, int i15) {
        m78306g(c15565f, function1, function2, function3, function4, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
