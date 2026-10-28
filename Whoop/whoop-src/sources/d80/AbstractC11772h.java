package d80;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import d11.C11473h;
import f70.C14201q0;
import f80.C14246e;
import fy1.AbstractC14874j;
import g80.C15565f;
import g80.C15566g;
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import java.util.List;
import l80.AbstractC23438o;
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
import p714k80.AbstractC22289r;
import p714k80.AbstractC22290s;
import p714k80.Function0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: d80.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u00ad\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042H\u0010\u0011\u001aD\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lg80/f;", "viewState", "Lf80/e;", "saveCredentialOnAdvance", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function6;", "Lm91/u;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "f", "(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/p;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11772h {

    /* JADX INFO: renamed from: d80.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFScreenContainerKt$IAJFScreenContainer$3$1", m100430f = "IAJFScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC2464x2 f38151E;

        /* JADX INFO: renamed from: w */
        int f38152w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f38153x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21413a f38154y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f38155z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC21413a interfaceC21413a, boolean z4, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38153x = function1;
            this.f38154y = interfaceC21413a;
            this.f38155z = z4;
            this.f38151E = interfaceC2464x2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f38153x, this.f38154y, this.f38155z, this.f38151E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38152w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f38153x.invoke(this.f38154y);
            AbstractC22290s.m64042f(this.f38155z, this.f38151E);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFScreenContainerKt$IAJFScreenContainer$6$1", m100430f = "IAJFScreenContainer.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lm91/u;", "currentScreen", "Lf70/q0;", "memberInfo", "Ll83/a0;", "<anonymous>", "(Lm91/u;Lf70/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Context f38156E;

        /* JADX INFO: renamed from: w */
        int f38157w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f38158x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f38159y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14246e f38160z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C14246e c14246e, Context context, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f38160z = c14246e;
            this.f38156E = context;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC25312u interfaceC25312u, C14201q0 c14201q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(this.f38160z, this.f38156E, interfaceC30057d);
            bVar.f38158x = interfaceC25312u;
            bVar.f38159y = c14201q0;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f38158x;
            C14201q0 c14201q0 = (C14201q0) this.f38159y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38157w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14246e c14246e = this.f38160z;
                if (c14246e != null) {
                    Context context = this.f38156E;
                    this.f38158x = null;
                    this.f38159y = null;
                    this.f38157w = 1;
                    obj = C14246e.m40709b(c14246e, context, interfaceC25312u, c14201q0, false, this, 8, null);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x019d  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01db  */
    /* JADX WARN: Code duplicated, block: B:120:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:127:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0251  */
    /* JADX WARN: Code duplicated, block: B:132:0x0265  */
    /* JADX WARN: Code duplicated, block: B:135:0x0271  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
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
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:89:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    /* JADX WARN: Code duplicated, block: B:99:0x0188  */
    /* JADX INFO: renamed from: f */
    public static final void m31551f(C15565f viewState, C14246e c14246e, final Function1 onViewEvent, Function1 function1, Function1 function2, InterfaceC4354p handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        C14246e c14246e2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        int i24;
        boolean z4;
        C14246e c14246e3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Context context;
        InterfaceC2464x2 interfaceC2464x2;
        C14246e c14246e4;
        boolean zM64043g;
        SignUpSource signUpSource;
        final InterfaceC21413a.u uVar;
        int i25;
        boolean z13;
        boolean zM87155h;
        Object aVar;
        C28676v0 c28676v1;
        C14246e c14246e5;
        C15566g bffScreenContainerState;
        EnumC3920d state;
        C15566g bffScreenContainerState2;
        List<InterfaceC25312u> listM43839h;
        Function1 function8;
        Function1 function9;
        boolean zM87157i;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        C3927k progressButtonState;
        Object objM87133R4;
        Object objM87133R5;
        int i26;
        int i27;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1077144278);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                c14246e2 = c14246e;
                i15 |= c28655q.m87157i(c14246e2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i15 |= i27;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(handleProgressButtonClick)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i26;
                    }
                    i24 = i15;
                    if ((74899 & i24) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i24 & 1, z4)) {
                        if (i28 != 0) {
                            c14246e2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C11473h(13);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function7 = (Function1) objM87133R5;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C11473h(14);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function4 = (Function1) objM87133R4;
                        }
                        context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                        c14246e4 = c14246e2;
                        zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                        AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                        signUpSource = SignUpSource.IAJF_V2;
                        uVar = InterfaceC21413a.u.f82142a;
                        i25 = i24 & 896;
                        if (i25 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                        Object objM87133R6 = c28655q.m87133R();
                        if (!zM87155h || objM87133R6 == c28676v0) {
                            c28676v1 = c28676v0;
                            c14246e5 = c14246e4;
                            aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                            c28655q.m87172p0(aVar);
                        } else {
                            c28676v1 = c28676v0;
                            aVar = objM87133R6;
                            c14246e5 = c14246e4;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                        bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                        if (bffScreenContainerState != null || (progressButtonState = bffScreenContainerState.getProgressButtonState()) == null) {
                            state = null;
                        } else {
                            state = progressButtonState.getState();
                        }
                        if (state == EnumC3920d.LOADING) {
                            c28655q.m87150e0(-1503225741);
                            AbstractC22290s.m64039c(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1503190184);
                            c28655q.m87173q(false);
                        }
                        if (viewState.getActivationState().getIsFullScreenError()) {
                            c28655q.m87150e0(-1503115164);
                            if (i25 == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z14 || objM87133R2 == c28676v1) {
                                final int i29 = 0;
                                objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i29) {
                                            case 0:
                                                return AbstractC11772h.m31554i(onViewEvent, uVar);
                                            default:
                                                return AbstractC11772h.m31555j(onViewEvent, uVar);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                            if (i25 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z15 || objM87133R3 == c28676v1) {
                                final int i34 = 1;
                                objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i34) {
                                            case 0:
                                                return AbstractC11772h.m31554i(onViewEvent, uVar);
                                            default:
                                                return AbstractC11772h.m31555j(onViewEvent, uVar);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState.getActivationState().getIsFullScreenLoading()) {
                                c28655q.m87150e0(-1502820075);
                                AbstractC22290s.m64039c(c28655q, 0);
                                AbstractC22289r.m64035b(c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                                if (bffScreenContainerState2 != null) {
                                    listM43839h = bffScreenContainerState2.m43839h();
                                } else {
                                    listM43839h = null;
                                }
                                if (listM43839h != null) {
                                    c28655q.m87150e0(-1502651404);
                                    C15566g bffScreenContainerState3 = viewState.getActivationState().getBffScreenContainerState();
                                    ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                                    zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                                    objM87133R = c28655q.m87133R();
                                    if (zM87157i || objM87133R == c28676v1) {
                                        objM87133R = new b(c14246e5, context, null);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    int i35 = i24 << 3;
                                    function8 = function4;
                                    function9 = function7;
                                    AbstractC11769e.m31521m(bffScreenContainerState3, activationFlowDestination, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i35 & 458752) | (i35 & 7168) | 432 | (57344 & i35) | (29360128 & (i24 << 6)), 0);
                                    c28655q.m87173q(false);
                                } else {
                                    function8 = function4;
                                    function9 = function7;
                                    c28655q.m87150e0(-1501872808);
                                    c28655q.m87173q(false);
                                }
                            }
                            function5 = function9;
                            function6 = function8;
                            c14246e3 = c14246e5;
                        }
                        function8 = function4;
                        function9 = function7;
                        function5 = function9;
                        function6 = function8;
                        c14246e3 = c14246e5;
                    } else {
                        c28655q.m87138X();
                        c14246e3 = c14246e2;
                        function5 = function3;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(handleProgressButtonClick)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                i24 = i15;
                if ((74899 & i24) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i28 != 0) {
                        c14246e2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(13);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(14);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    }
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    c14246e4 = c14246e2;
                    zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                    AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                    signUpSource = SignUpSource.IAJF_V2;
                    uVar = InterfaceC21413a.u.f82142a;
                    i25 = i24 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                    Object objM87133R7 = c28655q.m87133R();
                    if (zM87155h) {
                        c28676v1 = c28676v0;
                        c14246e5 = c14246e4;
                        aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(aVar);
                    } else {
                        c28676v1 = c28676v0;
                        c14246e5 = c14246e4;
                        aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(aVar);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                    bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                    if (bffScreenContainerState != null) {
                        state = null;
                    } else {
                        state = null;
                    }
                    if (state == EnumC3920d.LOADING) {
                        c28655q.m87150e0(-1503225741);
                        AbstractC22290s.m64039c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1503190184);
                        c28655q.m87173q(false);
                    }
                    if (viewState.getActivationState().getIsFullScreenError()) {
                        c28655q.m87150e0(-1503115164);
                        if (i25 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            final int i210 = 0;
                            objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i211 = 0;
                            objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            final int i36 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i36) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i37 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i37) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m64022b(interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.getActivationState().getIsFullScreenLoading()) {
                            c28655q.m87150e0(-1502820075);
                            AbstractC22290s.m64039c(c28655q, 0);
                            AbstractC22289r.m64035b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                            if (bffScreenContainerState2 != null) {
                                listM43839h = bffScreenContainerState2.m43839h();
                            } else {
                                listM43839h = null;
                            }
                            if (listM43839h != null) {
                                c28655q.m87150e0(-1502651404);
                                C15566g bffScreenContainerState4 = viewState.getActivationState().getBffScreenContainerState();
                                ActivationFlowDestination activationFlowDestination2 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                                zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    objM87133R = new b(c14246e5, context, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new b(c14246e5, context, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i38 = i24 << 3;
                                function8 = function4;
                                function9 = function7;
                                AbstractC11769e.m31521m(bffScreenContainerState4, activationFlowDestination2, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i38 & 458752) | (i38 & 7168) | 432 | (57344 & i38) | (29360128 & (i24 << 6)), 0);
                                c28655q.m87173q(false);
                            } else {
                                function8 = function4;
                                function9 = function7;
                                c28655q.m87150e0(-1501872808);
                                c28655q.m87173q(false);
                            }
                        }
                        function5 = function9;
                        function6 = function8;
                        c14246e3 = c14246e5;
                    }
                    function8 = function4;
                    function9 = function7;
                    function5 = function9;
                    function6 = function8;
                    c14246e3 = c14246e5;
                } else {
                    c28655q.m87138X();
                    c14246e3 = c14246e2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
                }
            }
            i15 |= 3072;
            function3 = function1;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(handleProgressButtonClick)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                i24 = i15;
                if ((74899 & i24) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i28 != 0) {
                        c14246e2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(13);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(14);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    }
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    c14246e4 = c14246e2;
                    zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                    AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                    signUpSource = SignUpSource.IAJF_V2;
                    uVar = InterfaceC21413a.u.f82142a;
                    i25 = i24 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                    Object objM87133R8 = c28655q.m87133R();
                    if (zM87155h) {
                        c28676v1 = c28676v0;
                        c14246e5 = c14246e4;
                        aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(aVar);
                    } else {
                        c28676v1 = c28676v0;
                        c14246e5 = c14246e4;
                        aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(aVar);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                    bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                    if (bffScreenContainerState != null) {
                        state = null;
                    } else {
                        state = null;
                    }
                    if (state == EnumC3920d.LOADING) {
                        c28655q.m87150e0(-1503225741);
                        AbstractC22290s.m64039c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1503190184);
                        c28655q.m87173q(false);
                    }
                    if (viewState.getActivationState().getIsFullScreenError()) {
                        c28655q.m87150e0(-1503115164);
                        if (i25 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            final int i212 = 0;
                            objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i212) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i213 = 0;
                            objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            final int i39 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i39) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i310 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i310) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m64022b(interfaceC4339a3, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.getActivationState().getIsFullScreenLoading()) {
                            c28655q.m87150e0(-1502820075);
                            AbstractC22290s.m64039c(c28655q, 0);
                            AbstractC22289r.m64035b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                            if (bffScreenContainerState2 != null) {
                                listM43839h = bffScreenContainerState2.m43839h();
                            } else {
                                listM43839h = null;
                            }
                            if (listM43839h != null) {
                                c28655q.m87150e0(-1502651404);
                                C15566g bffScreenContainerState5 = viewState.getActivationState().getBffScreenContainerState();
                                ActivationFlowDestination activationFlowDestination3 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                                zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    objM87133R = new b(c14246e5, context, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new b(c14246e5, context, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i311 = i24 << 3;
                                function8 = function4;
                                function9 = function7;
                                AbstractC11769e.m31521m(bffScreenContainerState5, activationFlowDestination3, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i311 & 458752) | (i311 & 7168) | 432 | (57344 & i311) | (29360128 & (i24 << 6)), 0);
                                c28655q.m87173q(false);
                            } else {
                                function8 = function4;
                                function9 = function7;
                                c28655q.m87150e0(-1501872808);
                                c28655q.m87173q(false);
                            }
                        }
                        function5 = function9;
                        function6 = function8;
                        c14246e3 = c14246e5;
                    }
                    function8 = function4;
                    function9 = function7;
                    function5 = function9;
                    function6 = function8;
                    c14246e3 = c14246e5;
                } else {
                    c28655q.m87138X();
                    c14246e3 = c14246e2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            i24 = i15;
            if ((74899 & i24) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i28 != 0) {
                    c14246e2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(13);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(14);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                c14246e4 = c14246e2;
                zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                signUpSource = SignUpSource.IAJF_V2;
                uVar = InterfaceC21413a.u.f82142a;
                i25 = i24 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                Object objM87133R9 = c28655q.m87133R();
                if (zM87155h) {
                    c28676v1 = c28676v0;
                    c14246e5 = c14246e4;
                    aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(aVar);
                } else {
                    c28676v1 = c28676v0;
                    c14246e5 = c14246e4;
                    aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(aVar);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                if (bffScreenContainerState != null) {
                    state = null;
                } else {
                    state = null;
                }
                if (state == EnumC3920d.LOADING) {
                    c28655q.m87150e0(-1503225741);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1503190184);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(-1503115164);
                    if (i25 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        final int i214 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i215 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i215) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    if (i25 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        final int i312 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i312) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i313 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i313) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a4, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(-1502820075);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                        if (bffScreenContainerState2 != null) {
                            listM43839h = bffScreenContainerState2.m43839h();
                        } else {
                            listM43839h = null;
                        }
                        if (listM43839h != null) {
                            c28655q.m87150e0(-1502651404);
                            C15566g bffScreenContainerState6 = viewState.getActivationState().getBffScreenContainerState();
                            ActivationFlowDestination activationFlowDestination4 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                            zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R = new b(c14246e5, context, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new b(c14246e5, context, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i314 = i24 << 3;
                            function8 = function4;
                            function9 = function7;
                            AbstractC11769e.m31521m(bffScreenContainerState6, activationFlowDestination4, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i314 & 458752) | (i314 & 7168) | 432 | (57344 & i314) | (29360128 & (i24 << 6)), 0);
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            function9 = function7;
                            c28655q.m87150e0(-1501872808);
                            c28655q.m87173q(false);
                        }
                    }
                    function5 = function9;
                    function6 = function8;
                    c14246e3 = c14246e5;
                }
                function8 = function4;
                function9 = function7;
                function5 = function9;
                function6 = function8;
                c14246e3 = c14246e5;
            } else {
                c28655q.m87138X();
                c14246e3 = c14246e2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
            }
        }
        i15 |= 48;
        c14246e2 = c14246e;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i15 |= i27;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(handleProgressButtonClick)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                i24 = i15;
                if ((74899 & i24) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    if (i28 != 0) {
                        c14246e2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C11473h(13);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(14);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    }
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    c14246e4 = c14246e2;
                    zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                    AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                    signUpSource = SignUpSource.IAJF_V2;
                    uVar = InterfaceC21413a.u.f82142a;
                    i25 = i24 & 896;
                    if (i25 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                    Object objM87133R10 = c28655q.m87133R();
                    if (zM87155h) {
                        c28676v1 = c28676v0;
                        c14246e5 = c14246e4;
                        aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(aVar);
                    } else {
                        c28676v1 = c28676v0;
                        c14246e5 = c14246e4;
                        aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                        c28655q.m87172p0(aVar);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                    bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                    if (bffScreenContainerState != null) {
                        state = null;
                    } else {
                        state = null;
                    }
                    if (state == EnumC3920d.LOADING) {
                        c28655q.m87150e0(-1503225741);
                        AbstractC22290s.m64039c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1503190184);
                        c28655q.m87173q(false);
                    }
                    if (viewState.getActivationState().getIsFullScreenError()) {
                        c28655q.m87150e0(-1503115164);
                        if (i25 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14) {
                            final int i216 = 0;
                            objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i216) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i217 = 0;
                            objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i217) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            final int i315 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i315) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i316 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i316) {
                                        case 0:
                                            return AbstractC11772h.m31554i(onViewEvent, uVar);
                                        default:
                                            return AbstractC11772h.m31555j(onViewEvent, uVar);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function0.m64022b(interfaceC4339a5, (InterfaceC4339a) objM87133R3, c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.getActivationState().getIsFullScreenLoading()) {
                            c28655q.m87150e0(-1502820075);
                            AbstractC22290s.m64039c(c28655q, 0);
                            AbstractC22289r.m64035b(c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                            if (bffScreenContainerState2 != null) {
                                listM43839h = bffScreenContainerState2.m43839h();
                            } else {
                                listM43839h = null;
                            }
                            if (listM43839h != null) {
                                c28655q.m87150e0(-1502651404);
                                C15566g bffScreenContainerState7 = viewState.getActivationState().getBffScreenContainerState();
                                ActivationFlowDestination activationFlowDestination5 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                                zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    objM87133R = new b(c14246e5, context, null);
                                    c28655q.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new b(c14246e5, context, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i317 = i24 << 3;
                                function8 = function4;
                                function9 = function7;
                                AbstractC11769e.m31521m(bffScreenContainerState7, activationFlowDestination5, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i317 & 458752) | (i317 & 7168) | 432 | (57344 & i317) | (29360128 & (i24 << 6)), 0);
                                c28655q.m87173q(false);
                            } else {
                                function8 = function4;
                                function9 = function7;
                                c28655q.m87150e0(-1501872808);
                                c28655q.m87173q(false);
                            }
                        }
                        function5 = function9;
                        function6 = function8;
                        c14246e3 = c14246e5;
                    }
                    function8 = function4;
                    function9 = function7;
                    function5 = function9;
                    function6 = function8;
                    c14246e3 = c14246e5;
                } else {
                    c28655q.m87138X();
                    c14246e3 = c14246e2;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            i24 = i15;
            if ((74899 & i24) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i28 != 0) {
                    c14246e2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(13);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(14);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                c14246e4 = c14246e2;
                zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                signUpSource = SignUpSource.IAJF_V2;
                uVar = InterfaceC21413a.u.f82142a;
                i25 = i24 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                Object objM87133R11 = c28655q.m87133R();
                if (zM87155h) {
                    c28676v1 = c28676v0;
                    c14246e5 = c14246e4;
                    aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(aVar);
                } else {
                    c28676v1 = c28676v0;
                    c14246e5 = c14246e4;
                    aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(aVar);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                if (bffScreenContainerState != null) {
                    state = null;
                } else {
                    state = null;
                }
                if (state == EnumC3920d.LOADING) {
                    c28655q.m87150e0(-1503225741);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1503190184);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(-1503115164);
                    if (i25 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        final int i218 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i218) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i219 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i219) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    if (i25 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        final int i318 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i318) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i319 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i319) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a6, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(-1502820075);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                        if (bffScreenContainerState2 != null) {
                            listM43839h = bffScreenContainerState2.m43839h();
                        } else {
                            listM43839h = null;
                        }
                        if (listM43839h != null) {
                            c28655q.m87150e0(-1502651404);
                            C15566g bffScreenContainerState8 = viewState.getActivationState().getBffScreenContainerState();
                            ActivationFlowDestination activationFlowDestination6 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                            zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R = new b(c14246e5, context, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new b(c14246e5, context, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3110 = i24 << 3;
                            function8 = function4;
                            function9 = function7;
                            AbstractC11769e.m31521m(bffScreenContainerState8, activationFlowDestination6, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i3110 & 458752) | (i3110 & 7168) | 432 | (57344 & i3110) | (29360128 & (i24 << 6)), 0);
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            function9 = function7;
                            c28655q.m87150e0(-1501872808);
                            c28655q.m87173q(false);
                        }
                    }
                    function5 = function9;
                    function6 = function8;
                    c14246e3 = c14246e5;
                }
                function8 = function4;
                function9 = function7;
                function5 = function9;
                function6 = function8;
                c14246e3 = c14246e5;
            } else {
                c28655q.m87138X();
                c14246e3 = c14246e2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(handleProgressButtonClick)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            i24 = i15;
            if ((74899 & i24) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                if (i28 != 0) {
                    c14246e2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C11473h(13);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(14);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                c14246e4 = c14246e2;
                zM64043g = AbstractC22290s.m64043g(c28655q, 0);
                AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
                signUpSource = SignUpSource.IAJF_V2;
                uVar = InterfaceC21413a.u.f82142a;
                i25 = i24 & 896;
                if (i25 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
                Object objM87133R12 = c28655q.m87133R();
                if (zM87155h) {
                    c28676v1 = c28676v0;
                    c14246e5 = c14246e4;
                    aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(aVar);
                } else {
                    c28676v1 = c28676v0;
                    c14246e5 = c14246e4;
                    aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                    c28655q.m87172p0(aVar);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
                bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                if (bffScreenContainerState != null) {
                    state = null;
                } else {
                    state = null;
                }
                if (state == EnumC3920d.LOADING) {
                    c28655q.m87150e0(-1503225741);
                    AbstractC22290s.m64039c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1503190184);
                    c28655q.m87173q(false);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    c28655q.m87150e0(-1503115164);
                    if (i25 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        final int i2110 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2110) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i2111 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    if (i25 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        final int i3111 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i3112 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3112) {
                                    case 0:
                                        return AbstractC11772h.m31554i(onViewEvent, uVar);
                                    default:
                                        return AbstractC11772h.m31555j(onViewEvent, uVar);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m64022b(interfaceC4339a7, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getActivationState().getIsFullScreenLoading()) {
                        c28655q.m87150e0(-1502820075);
                        AbstractC22290s.m64039c(c28655q, 0);
                        AbstractC22289r.m64035b(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                        if (bffScreenContainerState2 != null) {
                            listM43839h = bffScreenContainerState2.m43839h();
                        } else {
                            listM43839h = null;
                        }
                        if (listM43839h != null) {
                            c28655q.m87150e0(-1502651404);
                            C15566g bffScreenContainerState9 = viewState.getActivationState().getBffScreenContainerState();
                            ActivationFlowDestination activationFlowDestination7 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                            zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R = new b(c14246e5, context, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new b(c14246e5, context, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3113 = i24 << 3;
                            function8 = function4;
                            function9 = function7;
                            AbstractC11769e.m31521m(bffScreenContainerState9, activationFlowDestination7, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i3113 & 458752) | (i3113 & 7168) | 432 | (57344 & i3113) | (29360128 & (i24 << 6)), 0);
                            c28655q.m87173q(false);
                        } else {
                            function8 = function4;
                            function9 = function7;
                            c28655q.m87150e0(-1501872808);
                            c28655q.m87173q(false);
                        }
                    }
                    function5 = function9;
                    function6 = function8;
                    c14246e3 = c14246e5;
                }
                function8 = function4;
                function9 = function7;
                function5 = function9;
                function6 = function8;
                c14246e3 = c14246e5;
            } else {
                c28655q.m87138X();
                c14246e3 = c14246e2;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(handleProgressButtonClick)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i26;
        }
        i24 = i15;
        if ((74899 & i24) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            if (i28 != 0) {
                c14246e2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C11473h(13);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C11473h(14);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            }
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
            c14246e4 = c14246e2;
            zM64043g = AbstractC22290s.m64043g(c28655q, 0);
            AbstractC14874j.m42904c(viewState.getActivationState(), "iajf_screen", c28655q, 48);
            signUpSource = SignUpSource.IAJF_V2;
            uVar = InterfaceC21413a.u.f82142a;
            i25 = i24 & 896;
            if (i25 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87155h = z13 | c28655q.m87155h(zM64043g) | c28655q.m87153g(interfaceC2464x2);
            Object objM87133R13 = c28655q.m87133R();
            if (zM87155h) {
                c28676v1 = c28676v0;
                c14246e5 = c14246e4;
                aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                c28655q.m87172p0(aVar);
            } else {
                c28676v1 = c28676v0;
                c14246e5 = c14246e4;
                aVar = new a(onViewEvent, uVar, zM64043g, interfaceC2464x2, null);
                c28655q.m87172p0(aVar);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, C23454a0.f92919a);
            bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
            if (bffScreenContainerState != null) {
                state = null;
            } else {
                state = null;
            }
            if (state == EnumC3920d.LOADING) {
                c28655q.m87150e0(-1503225741);
                AbstractC22290s.m64039c(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1503190184);
                c28655q.m87173q(false);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                c28655q.m87150e0(-1503115164);
                if (i25 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    final int i2112 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2112) {
                                case 0:
                                    return AbstractC11772h.m31554i(onViewEvent, uVar);
                                default:
                                    return AbstractC11772h.m31555j(onViewEvent, uVar);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i2113 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: d80.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2113) {
                                case 0:
                                    return AbstractC11772h.m31554i(onViewEvent, uVar);
                                default:
                                    return AbstractC11772h.m31555j(onViewEvent, uVar);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                if (i25 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    final int i3114 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3114) {
                                case 0:
                                    return AbstractC11772h.m31554i(onViewEvent, uVar);
                                default:
                                    return AbstractC11772h.m31555j(onViewEvent, uVar);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i3115 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: d80.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3115) {
                                case 0:
                                    return AbstractC11772h.m31554i(onViewEvent, uVar);
                                default:
                                    return AbstractC11772h.m31555j(onViewEvent, uVar);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m64022b(interfaceC4339a8, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q.m87150e0(-1502820075);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                    if (bffScreenContainerState2 != null) {
                        listM43839h = bffScreenContainerState2.m43839h();
                    } else {
                        listM43839h = null;
                    }
                    if (listM43839h != null) {
                        c28655q.m87150e0(-1502651404);
                        C15566g bffScreenContainerState10 = viewState.getActivationState().getBffScreenContainerState();
                        ActivationFlowDestination activationFlowDestination8 = ActivationFlowDestination.IN_APP_JOIN_FLOW;
                        zM87157i = c28655q.m87157i(c14246e5) | c28655q.m87157i(context);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R = new b(c14246e5, context, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new b(c14246e5, context, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i3116 = i24 << 3;
                        function8 = function4;
                        function9 = function7;
                        AbstractC11769e.m31521m(bffScreenContainerState10, activationFlowDestination8, signUpSource, onViewEvent, function9, function8, (Function3) objM87133R, handleProgressButtonClick, c28655q, (i3116 & 458752) | (i3116 & 7168) | 432 | (57344 & i3116) | (29360128 & (i24 << 6)), 0);
                        c28655q.m87173q(false);
                    } else {
                        function8 = function4;
                        function9 = function7;
                        c28655q.m87150e0(-1501872808);
                        c28655q.m87173q(false);
                    }
                }
                function5 = function9;
                function6 = function8;
                c14246e3 = c14246e5;
            }
            function8 = function4;
            function9 = function7;
            function5 = function9;
            function6 = function8;
            c14246e3 = c14246e5;
        } else {
            c28655q.m87138X();
            c14246e3 = c14246e2;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f((Object) viewState, (Object) c14246e3, onViewEvent, function5, function6, (InterfaceC23459e) handleProgressButtonClick, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m31552g(AbstractC23438o it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m31553h(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m31554i(Function1 function1, InterfaceC21413a interfaceC21413a) {
        function1.invoke(interfaceC21413a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m31555j(Function1 function1, InterfaceC21413a interfaceC21413a) {
        function1.invoke(interfaceC21413a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m31556k(C15565f c15565f, C14246e c14246e, Function1 function1, Function1 function2, Function1 function3, InterfaceC4354p interfaceC4354p, int i13, int i14, Composer composer, int i15) {
        m31551f(c15565f, c14246e, function1, function2, function3, interfaceC4354p, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
