package q80;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import fy1.AbstractC14874j;
import g80.C15565f;
import g80.C15566g;
import l83.C23454a0;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: q80.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a×\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00062T\u0010\u0016\u001aP\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lq80/d;", "descriptor", "Lg80/f;", "viewState", "", "source", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lkotlin/Function0;", "askForPushNotificationPermissions", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "d", "(Lq80/d;Lg80/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30031c {

    /* JADX INFO: renamed from: q80.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.bffjourney.ActivationBffFlowContainerKt$ActivationBffFlowContainer$1$1", m100430f = "ActivationBffFlowContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f122557E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC2464x2 f122558F;

        /* JADX INFO: renamed from: w */
        int f122559w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f122560x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30032d f122561y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f122562z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C30032d c30032d, String str, boolean z4, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122560x = function1;
            this.f122561y = c30032d;
            this.f122562z = str;
            this.f122557E = z4;
            this.f122558F = interfaceC2464x2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f122560x, this.f122561y, this.f122562z, this.f122557E, this.f122558F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122559w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f122560x.invoke(this.f122561y.getFetchEvent().invoke(this.f122562z));
            AbstractC22290s.m64042f(this.f122557E, this.f122558F);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0192  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:137:0x020a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0215  */
    /* JADX WARN: Code duplicated, block: B:140:0x0225  */
    /* JADX WARN: Code duplicated, block: B:142:0x022f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0235  */
    /* JADX WARN: Code duplicated, block: B:145:0x0265  */
    /* JADX WARN: Code duplicated, block: B:146:0x0276  */
    /* JADX WARN: Code duplicated, block: B:149:0x0281  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0113  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:83:0x0123  */
    /* JADX WARN: Code duplicated, block: B:84:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x014b  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x00e3, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static final void m91926d(C30032d c30032d, C15565f viewState, String str, Function1 onViewEvent, Function1 onNavigationEvent, Function1 askForPushNotificationPermissions, Function1 onAnalyticsEvent, InterfaceC4356r handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        boolean z4;
        C28655q c28655q;
        final String str3;
        C28677v1 c28677v1M87180u;
        InterfaceC2464x2 interfaceC2464x2;
        boolean zM64043g;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        boolean zM87155h;
        Object objM87133R;
        C28676v0 c28676v0;
        int i24;
        C28676v0 c28676v1;
        int i25;
        final Function1 function1;
        C15566g bffScreenContainerState;
        EnumC3920d state;
        C15566g bffScreenContainerState2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R3;
        C3927k progressButtonState;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        final C30032d descriptor = c30032d;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(askForPushNotificationPermissions, "askForPushNotificationPermissions");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-797778924);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(descriptor) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i34;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(onNavigationEvent)) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i29;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(askForPushNotificationPermissions)) {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i28;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(onAnalyticsEvent)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q2.m87157i(handleProgressButtonClick)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i15 |= i26;
            }
            if ((4793491 & i15) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i35 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
                zM64043g = AbstractC22290s.m64043g(c28655q2, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), descriptor.getScreenTag(), c28655q2, 0);
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i17 = i15 & 14;
                if (i17 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z27 = z13 | z14;
                i18 = i15 & 896;
                i19 = i15;
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87155h = z27 | z15 | c28655q2.m87155h(zM64043g) | c28655q2.m87153g(interfaceC2464x2);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (!zM87155h || objM87133R == c28676v0) {
                    i24 = i16;
                    c28676v1 = c28676v0;
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    objM87133R = new a(onViewEvent, descriptor, str3, zM64043g, interfaceC2464x2, null);
                    function1 = onViewEvent;
                    descriptor = descriptor;
                    c28655q2.m87172p0(objM87133R);
                } else {
                    c28676v1 = c28676v0;
                    function1 = onViewEvent;
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    i24 = i16;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                if (bffScreenContainerState != null || (progressButtonState = bffScreenContainerState.getProgressButtonState()) == null) {
                    state = null;
                } else {
                    state = progressButtonState.getState();
                }
                if (state == EnumC3920d.LOADING) {
                    c28655q2.m87150e0(1718326377);
                    AbstractC22290s.m64039c(c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1718361934);
                    c28655q2.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q2.m87150e0(1718435714);
                    if (i24 == i25) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i17 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z28 = z16 | z17;
                    if (r21 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z28 | z18;
                    objM87133R2 = c28655q2.m87133R();
                    if (z19 || objM87133R2 == c28676v1) {
                        final int i36 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: q80.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i36) {
                                    case 0:
                                        return AbstractC30031c.m91927e(function1, descriptor, str3);
                                    default:
                                        return AbstractC30031c.m91928f(function1, descriptor, str3);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if (i24 == i25) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (i17 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z24 | z25 | (i18 == 256);
                    objM87133R3 = c28655q2.m87133R();
                    if (z26 || objM87133R3 == c28676v1) {
                        final int i37 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: q80.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i37) {
                                    case 0:
                                        return AbstractC30031c.m91927e(function1, descriptor, str3);
                                    default:
                                        return AbstractC30031c.m91928f(function1, descriptor, str3);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q2, 0);
                    c28655q2.m87173q(false);
                } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q2.m87150e0(1718692363);
                    AbstractC22290s.m64039c(c28655q2, 0);
                    AbstractC22289r.m64035b(c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                    if ((bffScreenContainerState2 != null ? bffScreenContainerState2.m43839h() : null) != null) {
                        c28655q2.m87150e0(1718852323);
                        AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), descriptor.getDestination(), null, function1, onNavigationEvent, askForPushNotificationPermissions, onAnalyticsEvent, null, handleProgressButtonClick, c28655q2, (i19 & 4193280) | ((i19 << 3) & 234881024), 132);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87150e0(1719583179);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
                c28655q = c28655q2;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(descriptor, viewState, str3, onViewEvent, onNavigationEvent, askForPushNotificationPermissions, onAnalyticsEvent, handleProgressButtonClick, i13, i14);
            }
        }
        i15 |= 384;
        str2 = str;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i34 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i34;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(onNavigationEvent)) {
                i29 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i29;
        }
        if ((196608 & i13) == 0) {
            if (c28655q2.m87157i(askForPushNotificationPermissions)) {
                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i28;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q2.m87157i(onAnalyticsEvent)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i15 |= i27;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q2.m87157i(handleProgressButtonClick)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i15 |= i26;
        }
        if ((4793491 & i15) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i35 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            zM64043g = AbstractC22290s.m64043g(c28655q2, 0);
            AbstractC14874j.m42904c(viewState.getActivationState(), descriptor.getScreenTag(), c28655q2, 0);
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            i17 = i15 & 14;
            if (i17 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z29 = z13 | z14;
            i18 = i15 & 896;
            i19 = i15;
            if (i18 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87155h = z29 | z15 | c28655q2.m87155h(zM64043g) | c28655q2.m87153g(interfaceC2464x2);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87155h) {
                i24 = i16;
                c28676v1 = c28676v0;
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                objM87133R = new a(onViewEvent, descriptor, str3, zM64043g, interfaceC2464x2, null);
                function1 = onViewEvent;
                descriptor = descriptor;
                c28655q2.m87172p0(objM87133R);
            } else {
                i24 = i16;
                c28676v1 = c28676v0;
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                objM87133R = new a(onViewEvent, descriptor, str3, zM64043g, interfaceC2464x2, null);
                function1 = onViewEvent;
                descriptor = descriptor;
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
            if (bffScreenContainerState != null) {
                state = null;
            } else {
                state = null;
            }
            if (state == EnumC3920d.LOADING) {
                c28655q2.m87150e0(1718326377);
                AbstractC22290s.m64039c(c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1718361934);
                c28655q2.m87173q(false);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                c28655q2.m87150e0(1718435714);
                if (i24 == i25) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i17 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z210 = z16 | z17;
                if (r21 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z210 | z18;
                objM87133R2 = c28655q2.m87133R();
                if (z19) {
                    final int i38 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: q80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i38) {
                                case 0:
                                    return AbstractC30031c.m91927e(function1, descriptor, str3);
                                default:
                                    return AbstractC30031c.m91928f(function1, descriptor, str3);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i39 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: q80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i39) {
                                case 0:
                                    return AbstractC30031c.m91927e(function1, descriptor, str3);
                                default:
                                    return AbstractC30031c.m91928f(function1, descriptor, str3);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                if (i24 == i25) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (i17 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z24 | z25 | (i18 == 256);
                objM87133R3 = c28655q2.m87133R();
                if (z26) {
                    final int i310 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: q80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i310) {
                                case 0:
                                    return AbstractC30031c.m91927e(function1, descriptor, str3);
                                default:
                                    return AbstractC30031c.m91928f(function1, descriptor, str3);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    final int i311 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: q80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i311) {
                                case 0:
                                    return AbstractC30031c.m91927e(function1, descriptor, str3);
                                default:
                                    return AbstractC30031c.m91928f(function1, descriptor, str3);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                Function0.m64022b(interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q2, 0);
                c28655q2.m87173q(false);
            } else if (viewState.getActivationState().getIsFullScreenLoading()) {
                c28655q2.m87150e0(1718692363);
                AbstractC22290s.m64039c(c28655q2, 0);
                AbstractC22289r.m64035b(c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                if ((bffScreenContainerState2 != null ? bffScreenContainerState2.m43839h() : null) != null) {
                    c28655q2.m87150e0(1718852323);
                    AbstractC30037i.m91955m(viewState.getActivationState().getBffScreenContainerState(), descriptor.getDestination(), null, function1, onNavigationEvent, askForPushNotificationPermissions, onAnalyticsEvent, null, handleProgressButtonClick, c28655q2, (i19 & 4193280) | ((i19 << 3) & 234881024), 132);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87150e0(1719583179);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                }
            }
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(descriptor, viewState, str3, onViewEvent, onNavigationEvent, askForPushNotificationPermissions, onAnalyticsEvent, handleProgressButtonClick, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m91927e(Function1 function1, C30032d c30032d, String str) {
        function1.invoke(c30032d.getFetchEvent().invoke(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m91928f(Function1 function1, C30032d c30032d, String str) {
        function1.invoke(c30032d.getFetchEvent().invoke(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m91929g(C30032d c30032d, C15565f c15565f, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, int i13, int i14, Composer composer, int i15) {
        m91926d(c30032d, c15565f, str, function1, function2, function3, function4, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
