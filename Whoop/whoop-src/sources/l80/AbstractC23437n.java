package l80;

import a90.AbstractC0585b;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b03.C2209f;
import b90.AbstractC2881c;
import bc3.InterfaceC2994c0;
import c03.C3815c;
import c31.C3927k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4354p;
import c93.InterfaceC4356r;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d30.C11544k;
import d70.C11753g;
import d80.AbstractC11772h;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f70.C14201q0;
import f80.C14242a;
import f80.C14245d;
import f80.C14246e;
import g80.C15563d;
import g80.C15564e;
import g80.C15565f;
import g80.C15566g;
import gb1.AbstractC15673b0;
import h80.C17003c;
import h80.InterfaceC17002b;
import hg3.AbstractC17269i;
import i90.AbstractC18246b;
import j90.AbstractC21428a;
import jk2.C21767h;
import jp1.C21862n;
import ky2.C22892a;
import l01.C23045q;
import l83.C23454a0;
import l83.C23465k;
import l90.AbstractC23541a;
import live.hms.video.utils.AndroidSDKConstants;
import m80.AbstractC25219a;
import m80.AbstractC25224f;
import m83.AbstractC25247g0;
import n80.AbstractC26447a;
import no.nordicsemi.android.dfu.DfuBaseService;
import o80.AbstractC27655a;
import o90.AbstractC27683a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3764o;
import p114eb.AbstractC12958g1;
import p114eb.C12953f;
import p114eb.C12974m;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p737t90.AbstractC33658a;
import p80.AbstractC28968a;
import p90.C28997e;
import q80.InterfaceC30033e;
import q83.InterfaceC30057d;
import q90.AbstractC30068a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ty1.AbstractC34264i;
import wb3.AbstractC37056f;
import x81.C38072d;
import y80.AbstractC39325b;

/* JADX INFO: renamed from: l80.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0087\u0002\u0010&\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0015\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2T\u0010%\u001aP\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00110\u001fH\u0001¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)¨\u00061²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "destination", "", "source", "o0", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/lang/String;)Ljava/lang/String;", "Lg80/e;", "viewModel", "startDestination", "Lb03/f;", "whoopStatusViewModel", "Leb/u0;", "navController", "Landroid/content/Intent;", "pairingFlowIntent", "Lkotlin/Function1;", "Ll80/o;", "Ll83/a0;", "onNavigationEvent", "Lj80/b;", "onViewEvent", "Lkotlin/Function0;", "onAskForPermissions", "Lh80/b;", "onAnalyticsEvent", "Lf80/a;", "credentialHelper", "Lf80/d;", "passwordManagerTracker", "Lf80/e;", "saveCredentialOnAdvance", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "E", "(Lg80/e;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lb03/f;Leb/u0;Landroid/content/Intent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lf80/a;Lf80/d;Lf80/e;Lc93/r;Landroidx/compose/runtime/Composer;III)V", "a", "Ljava/lang/String;", "FORGOT_PASSWORD_ROUTE", "b", "CHECK_INBOX_ROUTE", "Lg80/f;", "viewState", "Lc03/c;", "whoopStatusViewState", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23437n {

    /* JADX INFO: renamed from: a */
    private static final String f92858a = ActivationFlowDestination.FORGOT_PASSWORD + "?email={email}&fromPostPairing={fromPostPairing}";

    /* JADX INFO: renamed from: b */
    private static final String f92859b = ActivationFlowDestination.CHECK_INBOX + "?fromPostPairing={fromPostPairing}";

    /* JADX INFO: renamed from: l80.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.navigation.ActivationFlowNavHostKt$ActivationFlowNavHost$1$1", m100430f = "ActivationFlowNavHost.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f92860w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15564e f92861x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f92862y;

        /* JADX INFO: renamed from: l80.n$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41940a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f92863w;

            public C41940a(Function1 function1) {
                this.f92863w = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C17003c.a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f92863w.invoke(new InterfaceC17002b.j(aVar.getScreenName(), aVar.getValue(), aVar.getCategory(), null, 8, null));
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15564e c15564e, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f92861x = c15564e;
            this.f92862y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f92861x, this.f92862y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f92860w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM43828p = this.f92861x.getAnalyticsScreenNameFlow();
                C41940a c41940a = new C41940a(this.f92862y);
                this.f92860w = 1;
                if (interfaceC13058lM43828p.collect(c41940a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: l80.n$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.navigation.ActivationFlowNavHostKt$ActivationFlowNavHost$2$1", m100430f = "ActivationFlowNavHost.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f92864w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15564e f92865x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f92866y;

        /* JADX INFO: renamed from: l80.n$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f92867w;

            public a(Function1 function1) {
                this.f92867w = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC23438o abstractC23438o, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f92867w.invoke(abstractC23438o);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15564e c15564e, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f92865x = c15564e;
            this.f92866y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f92865x, this.f92866y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f92864w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM43829q = this.f92865x.getNavigationState();
                a aVar = new a(this.f92866y);
                this.f92864w = 1;
                if (interfaceC13058lM43829q.collect(aVar, this) == enumC31071a) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E */
    public static final void m67919E(final C15564e viewModel, ActivationFlowDestination startDestination, final C2209f whoopStatusViewModel, final C12991u0 navController, final Intent pairingFlowIntent, String str, final Function1 onNavigationEvent, final Function1 onViewEvent, final Function1 onAskForPermissions, final Function1 onAnalyticsEvent, final C14242a credentialHelper, final C14245d passwordManagerTracker, final C14246e saveCredentialOnAdvance, final InterfaceC4356r handleProgressButtonClick, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        final ActivationFlowDestination activationFlowDestination;
        C28655q c28655q;
        final String str2;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(startDestination, "startDestination");
        AbstractC22676k.m65750j(whoopStatusViewModel, "whoopStatusViewModel");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(pairingFlowIntent, "pairingFlowIntent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAskForPermissions, "onAskForPermissions");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(credentialHelper, "credentialHelper");
        AbstractC22676k.m65750j(passwordManagerTracker, "passwordManagerTracker");
        AbstractC22676k.m65750j(saveCredentialOnAdvance, "saveCredentialOnAdvance");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1712401058);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        int i24 = i16;
        if ((i13 & 48) == 0) {
            i16 = i24 | (c28655q2.m87149e(startDestination.ordinal()) ? 32 : 16);
        }
        int i25 = i16;
        if ((i13 & 384) == 0) {
            i17 = i25 | ((i13 & 512) == 0 ? c28655q2.m87153g(whoopStatusViewModel) : c28655q2.m87157i(whoopStatusViewModel) ? 256 : 128);
        } else {
            i17 = i25;
        }
        int i26 = i17;
        int i27 = i13 & 3072;
        int i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i27 == 0) {
            i18 = i26 | (c28655q2.m87157i(navController) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024);
        } else {
            i18 = i26;
        }
        if ((i13 & 24576) == 0) {
            i18 |= c28655q2.m87157i(pairingFlowIntent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i29 = i15 & 32;
        if (i29 != 0) {
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i18 |= c28655q2.m87153g(str) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i18 |= c28655q2.m87157i(onNavigationEvent) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i18 |= c28655q2.m87157i(onViewEvent) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i18 |= c28655q2.m87157i(onAskForPermissions) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i18 |= c28655q2.m87157i(onAnalyticsEvent) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i19 = i14 | (c28655q2.m87157i(credentialHelper) ? 4 : 2);
        } else {
            i19 = i14;
        }
        if ((i14 & 48) == 0) {
            i19 |= c28655q2.m87157i(passwordManagerTracker) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i19 |= c28655q2.m87157i(saveCredentialOnAdvance) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87157i(handleProgressButtonClick)) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i19 |= i28;
        }
        int i34 = i19;
        int i35 = 1;
        if (c28655q2.m87135U(i18 & 1, ((i18 & 306783379) == 306783378 && (i34 & 1171) == 1170) ? false : true)) {
            C15563d c15563d = null;
            Object[] objArr = 0;
            String str3 = i29 != 0 ? null : str;
            final InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), new C15565f(c15563d, i35, objArr == true ? 1 : 0), null, c28655q2, 0, 2);
            final InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(whoopStatusViewModel.getViewState(), new C3815c(false, null, null, 7, null), null, c28655q2, C3815c.f15649d << 3, 2);
            C38072d c38072d = C38072d.f163053a;
            int i36 = C38072d.f163054b;
            final boolean zIsFeatureEnabled = c38072d.m121950c(c28655q2, i36).isFeatureEnabled("password-reset-enforcement-enabled-android");
            final boolean zIsFeatureEnabled2 = c38072d.m121950c(c28655q2, i36).isFeatureEnabled(OnboardingFeatureFlag.PASSWORD_RESET_FLOW);
            int i37 = i18 & 1879048192;
            boolean zM87157i = c28655q2.m87157i(viewModel) | (i37 == 536870912);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(viewModel, onAnalyticsEvent, null);
                c28655q2.m87172p0(objM87133R);
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, c23454a0);
            int i38 = i18 & 3670016;
            boolean zM87157i2 = c28655q2.m87157i(viewModel) | (i38 == 1048576);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new b(viewModel, onNavigationEvent, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, c23454a0);
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            activationFlowDestination = startDestination;
            String strM67970o0 = m67970o0(activationFlowDestination, str3);
            boolean zM87153g = ((i34 & 7168) == 2048) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87153g(interfaceC28601c1M87260n2) | ((i18 & 29360128) == 8388608) | (i38 == 1048576) | (i37 == 536870912) | c28655q2.m87157i(credentialHelper) | c28655q2.m87157i(passwordManagerTracker) | c28655q2.m87157i(saveCredentialOnAdvance) | c28655q2.m87155h(zIsFeatureEnabled) | c28655q2.m87155h(zIsFeatureEnabled2) | c28655q2.m87157i(pairingFlowIntent) | ((i18 & 234881024) == 67108864);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                Function1 function1 = new Function1() { // from class: l80.c
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC23437n.m67922H(onViewEvent, onNavigationEvent, onAskForPermissions, onAnalyticsEvent, handleProgressButtonClick, interfaceC28601c1M87260n, interfaceC28601c1M87260n2, credentialHelper, passwordManagerTracker, saveCredentialOnAdvance, zIsFeatureEnabled, zIsFeatureEnabled2, pairingFlowIntent, (C12987s0) obj);
                    }
                };
                c28655q2.m87172p0(function1);
                objM87133R3 = function1;
            }
            c28655q = c28655q2;
            AbstractC17269i.m48886d(navController, strM67970o0, null, null, null, null, null, null, null, (Function1) objM87133R3, c28655q, (i18 >> 9) & 14, 1020);
            c28655q.m87173q(true);
            str2 = str3;
        } else {
            activationFlowDestination = startDestination;
            c28655q = c28655q2;
            c28655q.m87138X();
            str2 = str;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l80.i
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC23437n.m67968n0(viewModel, activationFlowDestination, whoopStatusViewModel, navController, pairingFlowIntent, str2, onNavigationEvent, onViewEvent, onAskForPermissions, onAnalyticsEvent, credentialHelper, passwordManagerTracker, saveCredentialOnAdvance, handleProgressButtonClick, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: F */
    private static final C15565f m67920F(InterfaceC28670t2 interfaceC28670t2) {
        return (C15565f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: G */
    private static final C3815c m67921G(InterfaceC28670t2 interfaceC28670t2) {
        return (C3815c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m67922H(final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final InterfaceC4356r interfaceC4356r, final InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, final C14242a c14242a, final C14245d c14245d, final C14246e c14246e, final boolean z4, final boolean z13, Intent intent, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36290t(NavHost, "START_SCREEN", null, null, null, null, null, new C37816b(new C23429f(function1, function2, function4, interfaceC28670t2, interfaceC28670t3), true, 780495495), 254);
        AbstractC12889b.m36290t(NavHost, "ENTER_YOUR_EMAIL", null, null, null, null, null, new C37816b(new C23429f(function1, function2, function4, interfaceC4356r, interfaceC28670t2, 0), true, -303443842), 254);
        AbstractC12889b.m36290t(NavHost, "ENTER_YOUR_PASSWORD", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.g
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC23437n.m67940Z(c14242a, c14245d, c14246e, function1, function2, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
            }
        }, true, -737136641), 254);
        AbstractC12889b.m36290t(NavHost, "MFA_CHALLENGE", null, null, null, null, null, new C37816b(new C21767h(1, function2, interfaceC28670t2), true, -1170829440), 254);
        String str = f92859b;
        C12974m c12974m = new C12974m();
        m67956h0(c12974m);
        AbstractC12889b.m36290t(NavHost, str, AbstractC37056f.m118958J(new C12953f("fromPostPairing", c12974m.f44811a.m36452a())), null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.h
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC23437n.m67958i0(z4, z13, function1, function2, function4, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
            }
        }, true, -1604522239), 252);
        String str2 = f92858a;
        C12974m c12974m2 = new C12974m();
        m67960j0(c12974m2);
        C12953f c12953f = new C12953f(NotificationCompat.CATEGORY_EMAIL, c12974m2.f44811a.m36452a());
        C12974m c12974m3 = new C12974m();
        m67962k0(c12974m3);
        AbstractC12889b.m36290t(NavHost, str2, AbstractC37056f.m118959K(c12953f, new C12953f("fromPostPairing", c12974m3.f44811a.m36452a())), null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.j
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC23437n.m67964l0(z4, z13, function1, function2, function4, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
            }
        }, true, -2038215038), 252);
        AbstractC12889b.m36290t(NavHost, "DEVICE_EDUCATION", null, null, null, null, null, new C37816b(new C23429f(function1, function2, function4, interfaceC4356r, interfaceC28670t2, 1), true, 1823059459), 254);
        AbstractC12889b.m36290t(NavHost, "PAIRING", null, null, null, null, null, new C37816b(new C21767h(2, intent, function1), true, 1389366660), 254);
        final int i13 = 0;
        AbstractC12889b.m36290t(NavHost, "ACCOUNT_CREATION", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.l
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67926L(c14246e, function1, function2, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67929O(c14246e, function1, function2, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, 955673861), 254);
        final int i14 = 2;
        AbstractC12889b.m36290t(NavHost, "ACCOUNT_ACTIVATION", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.d
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67935U(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67937W(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                    case 2:
                        int iIntValue3 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67927M(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue3);
                    default:
                        int iIntValue4 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67933S(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue4);
                }
            }
        }, true, 521981062), 254);
        final int i15 = 1;
        AbstractC12889b.m36290t(NavHost, "IN_APP_JOIN_FLOW", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.l
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i15) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67926L(c14246e, function1, function2, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67929O(c14246e, function1, function2, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, -1931217294), 254);
        AbstractC12889b.m36290t(NavHost, "MEMBERSHIP_SERVICES", null, null, null, null, null, new C37816b(new C23436m(function2, 0), true, 1930057203), 254);
        AbstractC12889b.m36290t(NavHost, "POST_PAIRING", null, null, null, null, null, new C37816b(new C23429f(function1, function2, function4, interfaceC4356r, interfaceC28670t2, 2), true, 1496364404), 254);
        final int i16 = 3;
        AbstractC12889b.m36290t(NavHost, "HW_ONLY_PROFILE", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.d
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i16) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67935U(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67937W(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                    case 2:
                        int iIntValue3 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67927M(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue3);
                    default:
                        int iIntValue4 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67933S(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue4);
                }
            }
        }, true, 1062671605), 254);
        final int i17 = 0;
        AbstractC12889b.m36290t(NavHost, "HW_ONLY_PERMISSIONS", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.d
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i17) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67935U(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67937W(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                    case 2:
                        int iIntValue3 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67927M(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue3);
                    default:
                        int iIntValue4 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67933S(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue4);
                }
            }
        }, true, 628978806), 254);
        final int i18 = 1;
        AbstractC12889b.m36290t(NavHost, "HW_ONLY_AFTER_ACTIVATION", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.d
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i18) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67935U(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67937W(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                    case 2:
                        int iIntValue3 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67927M(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue3);
                    default:
                        int iIntValue4 = ((Integer) obj4).intValue();
                        return AbstractC23437n.m67933S(function1, function2, function3, function4, interfaceC4356r, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue4);
                }
            }
        }, true, 195286007), 254);
        final int i19 = 0;
        AbstractC23425b.m67912b(NavHost, InterfaceC30033e.d.f122579a, new InterfaceC4351m() { // from class: l80.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int i24 = i19;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i24) {
                    case 0:
                        return AbstractC23437n.m67939Y(interfaceC28670t2, composer, iIntValue);
                    case 1:
                        return AbstractC23437n.m67942a0(interfaceC28670t2, composer, iIntValue);
                    case 2:
                        return AbstractC23437n.m67944b0(interfaceC28670t2, composer, iIntValue);
                    default:
                        return AbstractC23437n.m67946c0(interfaceC28670t2, composer, iIntValue);
                }
            }
        }, function1, function2, function3, function4, interfaceC4356r);
        final int i24 = 1;
        AbstractC23425b.m67912b(NavHost, InterfaceC30033e.b.f122571a, new InterfaceC4351m() { // from class: l80.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int i25 = i24;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i25) {
                    case 0:
                        return AbstractC23437n.m67939Y(interfaceC28670t2, composer, iIntValue);
                    case 1:
                        return AbstractC23437n.m67942a0(interfaceC28670t2, composer, iIntValue);
                    case 2:
                        return AbstractC23437n.m67944b0(interfaceC28670t2, composer, iIntValue);
                    default:
                        return AbstractC23437n.m67946c0(interfaceC28670t2, composer, iIntValue);
                }
            }
        }, function1, function2, function3, function4, interfaceC4356r);
        final int i25 = 2;
        AbstractC23425b.m67912b(NavHost, InterfaceC30033e.a.f122567a, new InterfaceC4351m() { // from class: l80.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int i26 = i25;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i26) {
                    case 0:
                        return AbstractC23437n.m67939Y(interfaceC28670t2, composer, iIntValue);
                    case 1:
                        return AbstractC23437n.m67942a0(interfaceC28670t2, composer, iIntValue);
                    case 2:
                        return AbstractC23437n.m67944b0(interfaceC28670t2, composer, iIntValue);
                    default:
                        return AbstractC23437n.m67946c0(interfaceC28670t2, composer, iIntValue);
                }
            }
        }, function1, function2, function3, function4, interfaceC4356r);
        final int i26 = 3;
        AbstractC23425b.m67912b(NavHost, InterfaceC30033e.c.f122575a, new InterfaceC4351m() { // from class: l80.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int i27 = i26;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i27) {
                    case 0:
                        return AbstractC23437n.m67939Y(interfaceC28670t2, composer, iIntValue);
                    case 1:
                        return AbstractC23437n.m67942a0(interfaceC28670t2, composer, iIntValue);
                    case 2:
                        return AbstractC23437n.m67944b0(interfaceC28670t2, composer, iIntValue);
                    default:
                        return AbstractC23437n.m67946c0(interfaceC28670t2, composer, iIntValue);
                }
            }
        }, function1, function2, function3, function4, interfaceC4356r);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m67923I(Function1 function1, Function1 function2, Function1 function3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC33658a.m106300c(m67920F(interfaceC28670t2), m67921G(interfaceC28670t3), function1, function2, function3, composer, C3815c.f15649d << 3, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m67924J(Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC0585b.m1516e(m67920F(interfaceC28670t2), function1, function2, function3, interfaceC4356r, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m67925K(Intent intent, Function1 function1, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC27683a.m83681c(intent, function1, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m67926L(C14246e c14246e, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC27655a.m83617d(m67920F(interfaceC28670t2), c14246e, function1, function2, function3, interfaceC4356r, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m67927M(Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C21862n(function3, 29);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC26447a.m78306g(c15565fM67920F, function1, function2, (Function1) objM87133R, function4, interfaceC4356r, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m67928N(Function1 function1, InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m67929O(C14246e c14246e, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(interfaceC4356r);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C11544k(interfaceC4356r, 3);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC11772h.m31551f(c15565fM67920F, c14246e, function1, function2, function3, (InterfaceC4354p) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m67930P(InterfaceC4356r interfaceC4356r, InterfaceC25312u currentScreen, C3927k localProgressButtonState, C15566g viewState, Function1 onViewEvent, Function1 onAnalyticsEvent, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(localProgressButtonState, "localProgressButtonState");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        C11753g c11753g = null;
        C11753g c11753g2 = null;
        C11753g c11753g3 = null;
        interfaceC4356r.invoke(currentScreen, new C28997e(null, c11753g, c11753g2, c11753g3, 15, null), new C28997e(c11753g, c11753g2, c11753g3, null, 15, null), localProgressButtonState, viewState, onViewEvent, onAnalyticsEvent, signUpSource);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m67931Q(Function1 function1, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC23541a.m68144e(null, function1, composer, 0, 1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m67932R(Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC30068a.m92148d(m67920F(interfaceC28670t2), function1, function2, function3, interfaceC4356r, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m67933S(Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C21862n(function3, 27);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC21428a.m60312d(c15565fM67920F, function1, function2, (Function1) objM87133R, function4, interfaceC4356r, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m67934T(Function1 function1, InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m67935U(Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C23434k(function3, 0);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC18246b.m52559d(c15565fM67920F, function1, function2, (Function1) objM87133R, function4, interfaceC4356r, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m67936V(Function1 function1, InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m67937W(Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C21862n(function3, 28);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28968a.m87971d(c15565fM67920F, function1, function2, (Function1) objM87133R, function4, interfaceC4356r, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m67938X(Function1 function1, InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C15565f m67939Y(InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1260936947);
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        c28655q.m87173q(false);
        return c15565fM67920F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m67940Z(C14242a c14242a, C14245d c14245d, C14246e c14246e, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC2881c.m8330e(m67920F(interfaceC28670t2), c14242a, c14245d, c14246e, function1, function2, function3, interfaceC4356r, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C15565f m67942a0(InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(680033668);
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        c28655q.m87173q(false);
        return c15565fM67920F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C15565f m67944b0(InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(246340869);
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        c28655q.m87173q(false);
        return c15565fM67920F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C15565f m67946c0(InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-187351930);
        C15565f c15565fM67920F = m67920F(interfaceC28670t2);
        c28655q.m87173q(false);
        return c15565fM67920F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m67948d0(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C14201q0 c14201q0M43820c = m67920F(interfaceC28670t2).getActivationState().getMemberInfo();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C22892a(function1, 14);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(c14201q0M43820c);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C23045q(function1, c14201q0M43820c, 6);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C22892a(function1, 15);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC34264i.m108343T(null, null, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m67950e0(Function1 function1) {
        function1.invoke(new AbstractC23438o.b(ActivationFlowDestination.START_SCREEN, ActivationFlowDestination.MFA_CHALLENGE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m67952f0(Function1 function1, C14201q0 c14201q0) {
        function1.invoke(new AbstractC23438o.m(c14201q0.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue(), c14201q0.getPasswordNeedsReset()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m67954g0(Function1 function1) {
        function1.invoke(new AbstractC23438o.k(EnumC23445v.MFA_HELP));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private static final C23454a0 m67956h0(C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(AbstractC12958g1.f44767l);
        navArgument.m36461a(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m67958i0(boolean z4, boolean z13, Function1 function1, Function1 function2, Function1 function3, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        Bundle bundleM36479a = it.m36479a();
        boolean z14 = false;
        if (!(bundleM36479a != null ? bundleM36479a.getBoolean("fromPostPairing") : false) && !z4 && z13) {
            z14 = true;
        }
        AbstractC25219a.m73851g(AbstractC8693b.m21278l(m67920F(interfaceC28670t2).getActivationState().getMemberInfo().getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue()), z14, function1, function2, function3, composer, TextResource.$stable, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    private static final C23454a0 m67960j0(C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(AbstractC12958g1.f44770o);
        navArgument.m36461a("");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    private static final C23454a0 m67962k0(C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(AbstractC12958g1.f44767l);
        navArgument.m36461a(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m67964l0(boolean z4, boolean z13, Function1 function1, Function1 function2, Function1 function3, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        String string;
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        Bundle bundleM36479a = it.m36479a();
        if (bundleM36479a == null || (string = bundleM36479a.getString(NotificationCompat.CATEGORY_EMAIL)) == null) {
            string = "";
        }
        Bundle bundleM36479a2 = it.m36479a();
        boolean z14 = false;
        boolean z15 = bundleM36479a2 != null ? bundleM36479a2.getBoolean("fromPostPairing") : false;
        if (!z15 && !z4 && z13) {
            z14 = true;
        }
        AbstractC25224f.m73923k(string, z15, z14, function1, function2, function3, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m67966m0(Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        AbstractC39325b.m125295e(m67920F(interfaceC28670t2), function1, function2, function3, interfaceC4356r, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m67968n0(C15564e c15564e, ActivationFlowDestination activationFlowDestination, C2209f c2209f, C12991u0 c12991u0, Intent intent, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, C14242a c14242a, C14245d c14245d, C14246e c14246e, InterfaceC4356r interfaceC4356r, int i13, int i14, int i15, Composer composer, int i16) {
        m67919E(c15564e, activationFlowDestination, c2209f, c12991u0, intent, str, function1, function2, function3, function4, c14242a, c14245d, c14246e, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o0 */
    private static final String m67970o0(ActivationFlowDestination activationFlowDestination, String str) {
        if (activationFlowDestination != ActivationFlowDestination.AFTER_ACTIVATION_FINAL_SCREENS) {
            return AbstractC23440q.m68003c(activationFlowDestination, null, 1, null);
        }
        if (str == null) {
            str = "";
        }
        return AbstractC23440q.m68002b(activationFlowDestination, AbstractC25247g0.m73989X(new C23465k("source", str)));
    }
}
