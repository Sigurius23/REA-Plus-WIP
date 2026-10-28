package q80;

import am2.C1019g0;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.C3446h1;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import d80.C11766b;
import d80.C11768d;
import e93.AbstractC12889b;
import f70.C14201q0;
import g80.AbstractC15561b;
import g80.C15562c;
import g80.C15566g;
import g80.EnumC15570k;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import h80.InterfaceC17002b;
import io.sentry.config.AbstractC20301a;
import j80.InterfaceC21413a;
import j80.InterfaceC21414b;
import l80.AbstractC23438o;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import n90.AbstractC26474d;
import no.nordicsemi.android.dfu.DfuBaseService;
import nr0.C27072e;
import nw0.C27198e;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.InterfaceC22997s1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p714k80.AbstractC22289r;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p90.C28997e;
import p90.C29006n;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u80.C34634d;
import v90.C35815g;
import v90.C35826r;
import v90.C35830v;
import w90.C36953c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: q80.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0002\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00062*\b\u0002\u0010\u0015\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102T\u0010\u0019\u001aP\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0016H\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lg80/g;", "viewState", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentNavHostDestination", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lkotlin/Function0;", "askForPushNotificationPermissions", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function3;", "Lm91/u;", "Lf70/q0;", "Lq83/d;", "", "onBeforeProgressButtonClick", "Lkotlin/Function8;", "Lp90/e;", "Lc31/k;", "handleProgressButtonClick", "m", "(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/r;Landroidx/compose/runtime/Composer;II)V", "localProgressButtonState", "card", "newCard", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30037i {

    /* JADX INFO: renamed from: q80.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.bffjourney.ActivationBffScreensContainerKt$ActivationBffScreensContainer$5$1", m100430f = "ActivationBffScreensContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lm91/u;", "<unused var>", "Lf70/q0;", "Ll83/a0;", "<anonymous>", "(Lm91/u;Lf70/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f122597w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC25312u interfaceC25312u, C14201q0 c14201q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new a(interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122597w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q80.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.bffjourney.ActivationBffScreensContainerKt$ActivationBffScreensContainer$6$1", m100430f = "ActivationBffScreensContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122598w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15566g f122599x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f122600y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15566g c15566g, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122599x = c15566g;
            this.f122600y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f122599x, this.f122600y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122598w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC30037i.m91938D(this.f122600y, this.f122599x.getProgressButtonState());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q80.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.bffjourney.ActivationBffScreensContainerKt$ActivationBffScreensContainer$7$4$1$1$1$1", m100430f = "ActivationBffScreensContainer.kt", m100431l = {293}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4356r f122601E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C3927k f122602F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f122603G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Function1 f122604H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ SignUpSource f122605I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f122606J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC28601c1 f122607K;

        /* JADX INFO: renamed from: w */
        int f122608w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function3 f122609x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25312u f122610y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15566g f122611z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, InterfaceC4356r interfaceC4356r, C3927k c3927k, Function1 function1, Function1 function2, SignUpSource signUpSource, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122609x = function3;
            this.f122610y = interfaceC25312u;
            this.f122611z = c15566g;
            this.f122601E = interfaceC4356r;
            this.f122602F = c3927k;
            this.f122603G = function1;
            this.f122604H = function2;
            this.f122605I = signUpSource;
            this.f122606J = interfaceC28601c1;
            this.f122607K = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f122609x, this.f122610y, this.f122611z, this.f122601E, this.f122602F, this.f122603G, this.f122604H, this.f122605I, this.f122606J, this.f122607K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122608w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function3 function3 = this.f122609x;
                InterfaceC25312u interfaceC25312u = this.f122610y;
                C14201q0 c14201q0M43836e = this.f122611z.getMemberInfo();
                this.f122608w = 1;
                if (function3.invoke(interfaceC25312u, c14201q0M43836e, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f122601E.invoke(this.f122610y, AbstractC30037i.m91939E(this.f122606J), AbstractC30037i.m91959q(this.f122607K), this.f122602F, this.f122611z, this.f122603G, this.f122604H, this.f122605I);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q80.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f122612a;

        static {
            int[] iArr = new int[EnumC3921e.values().length];
            try {
                iArr[EnumC3921e.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3921e.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3921e.HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3921e.SHOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3921e.DISMISS_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f122612a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m91935A(InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m91936B(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final C3927k m91937C(InterfaceC28601c1 interfaceC28601c1) {
        return (C3927k) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m91938D(InterfaceC28601c1 interfaceC28601c1, C3927k c3927k) {
        interfaceC28601c1.setValue(c3927k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C28997e m91939E(InterfaceC28601c1 interfaceC28601c1) {
        return (C28997e) interfaceC28601c1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0163  */
    /* JADX WARN: Code duplicated, block: B:108:0x0166  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:114:0x017c  */
    /* JADX WARN: Code duplicated, block: B:116:0x017f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x0192  */
    /* JADX WARN: Code duplicated, block: B:123:0x0198  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:141:0x023b  */
    /* JADX WARN: Code duplicated, block: B:144:0x024e  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:150:0x027f  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:160:0x0300  */
    /* JADX WARN: Code duplicated, block: B:163:0x0315  */
    /* JADX WARN: Code duplicated, block: B:165:0x0323  */
    /* JADX WARN: Code duplicated, block: B:168:0x0337  */
    /* JADX WARN: Code duplicated, block: B:170:0x033e  */
    /* JADX WARN: Code duplicated, block: B:173:0x036e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0372  */
    /* JADX WARN: Code duplicated, block: B:177:0x037f  */
    /* JADX WARN: Code duplicated, block: B:179:0x038d  */
    /* JADX WARN: Code duplicated, block: B:182:0x039b  */
    /* JADX WARN: Code duplicated, block: B:184:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:187:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:191:0x03db  */
    /* JADX WARN: Code duplicated, block: B:194:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:198:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:202:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x040d  */
    /* JADX WARN: Code duplicated, block: B:209:0x044b  */
    /* JADX WARN: Code duplicated, block: B:211:0x045f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0463  */
    /* JADX WARN: Code duplicated, block: B:215:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x0491  */
    /* JADX WARN: Code duplicated, block: B:221:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:228:0x053e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0542  */
    /* JADX WARN: Code duplicated, block: B:232:0x054f  */
    /* JADX WARN: Code duplicated, block: B:234:0x055d  */
    /* JADX WARN: Code duplicated, block: B:237:0x056b  */
    /* JADX WARN: Code duplicated, block: B:239:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:243:0x05bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:246:0x05df  */
    /* JADX WARN: Code duplicated, block: B:249:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:251:0x0606  */
    /* JADX WARN: Code duplicated, block: B:253:0x0614  */
    /* JADX WARN: Code duplicated, block: B:255:0x061d  */
    /* JADX WARN: Code duplicated, block: B:258:0x063a  */
    /* JADX WARN: Code duplicated, block: B:259:0x063c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0644  */
    /* JADX WARN: Code duplicated, block: B:263:0x0646  */
    /* JADX WARN: Code duplicated, block: B:266:0x064e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0655  */
    /* JADX WARN: Code duplicated, block: B:273:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:279:0x071e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0757  */
    /* JADX WARN: Code duplicated, block: B:283:0x075b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0768  */
    /* JADX WARN: Code duplicated, block: B:288:0x0776  */
    /* JADX WARN: Code duplicated, block: B:291:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:292:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:295:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:297:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:300:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:327:0x0860  */
    /* JADX WARN: Code duplicated, block: B:329:0x087f  */
    /* JADX WARN: Code duplicated, block: B:332:0x0891  */
    /* JADX WARN: Code duplicated, block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x011e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x0134  */
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
    /* JADX INFO: renamed from: m */
    public static final void m91955m(final C15566g viewState, ActivationFlowDestination currentNavHostDestination, SignUpSource signUpSource, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function3 function5, final InterfaceC4356r handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        Function1 function6;
        int i16;
        Function1 function7;
        int i17;
        int i18;
        Function1 function8;
        int i19;
        int i24;
        Function1 function9;
        int i25;
        Function3 function10;
        int i26;
        boolean z4;
        C28655q c28655q;
        Function3 function11;
        Function1 function12;
        SignUpSource signUpSource2;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        C28677v1 c28677v1M87180u;
        int i27;
        C28676v0 c28676v0;
        SignUpSource signUpSource3;
        Function1 function16;
        Function1 function17;
        int i28;
        SignUpSource signUpSource4;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Function3 function18;
        InterfaceC25312u interfaceC25312u;
        InterfaceC25312u interfaceC25312u2;
        boolean zIsFeatureEnabled;
        boolean zIsFeatureEnabled2;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R7;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R9;
        InterfaceC28601c1 interfaceC28601c3;
        boolean zM87157i;
        Object objM87133R10;
        C2314t c2314t;
        InterfaceC28601c1 interfaceC28601c4;
        int iHashCode;
        Function3 function19;
        C0213j c0213j;
        C0209i c0209i;
        int i29;
        C2307m c2307m;
        int iHashCode2;
        int i34;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R11;
        InterfaceC25312u interfaceC25312u3;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC25312u interfaceC25312u4;
        C30039k c30039k;
        InterfaceC25312u interfaceC25312u5;
        Function1 function20;
        boolean zM87157i2;
        Object objM87133R12;
        int iHashCode3;
        boolean zM91973b;
        C1100b c1100b;
        boolean z18;
        C15566g c15566g;
        C28655q c28655q2;
        C15562c c15562cM43837f;
        Modifier modifierMo3400a;
        Function1 function21;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R13;
        InterfaceC25312u interfaceC25312u6;
        final C3927k c3927kM91937C;
        C2307m c2307m2;
        int iHashCode4;
        int iHashCode5;
        final SignUpSource signUpSource5;
        Function1 function22;
        final Function3 function23;
        boolean z26;
        boolean z27;
        Object objM87133R14;
        ActivationFlowDestination activationFlowDestinationM43832a;
        int iOrdinal;
        boolean zM87149e;
        Object objM87133R15;
        int i35;
        C2307m c2307m3 = C2299e.f9105H;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(currentNavHostDestination, "currentNavHostDestination");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(354447135);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87149e(currentNavHostDestination.ordinal()) ? 32 : 16;
        }
        int i36 = i14 & 4;
        if (i36 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87149e(signUpSource == null ? -1 : signUpSource.ordinal()) ? 256 : 128;
        }
        int i37 = i14 & 8;
        if (i37 == 0) {
            if ((i13 & 3072) == 0) {
                function6 = function1;
                i15 |= c28655q3.m87157i(function6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function7 = function2;
                    if (c28655q3.m87157i(function7)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function3;
                } else {
                    function8 = function3;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(function8)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function9 = function4;
                } else {
                    function9 = function4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87157i(function9)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if ((i14 & 128) == 0) {
                        function10 = function5;
                        int i38 = c28655q3.m87157i(function10) ? 8388608 : 4194304;
                        i15 |= i38;
                    } else {
                        function10 = function5;
                    }
                    i15 |= i38;
                } else {
                    function10 = function5;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87157i(handleProgressButtonClick)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                i26 = i15;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i26 & 1, z4)) {
                    c28655q3.m87140Z();
                    i27 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0 || c28655q3.m87118C()) {
                        if (i36 != 0) {
                            signUpSource3 = SignUpSource.ACTIVATION;
                        } else {
                            signUpSource3 = signUpSource;
                        }
                        if (i37 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C30034f(0);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function16 = (Function1) objM87133R5;
                        } else {
                            function16 = function6;
                        }
                        if (i16 != 0) {
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C30034f(1);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            function7 = (Function1) objM87133R4;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C30034f(2);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            function8 = (Function1) objM87133R3;
                        }
                        if (i24 != 0) {
                            objM87133R2 = c28655q3.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C30034f(3);
                                c28655q3.m87172p0(objM87133R2);
                            }
                            function17 = (Function1) objM87133R2;
                        } else {
                            function17 = function9;
                        }
                        if ((i14 & 128) != 0) {
                            objM87133R = c28655q3.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new a(null);
                                c28655q3.m87172p0(objM87133R);
                            }
                            function10 = (Function3) objM87133R;
                            i28 = i26 & (-29360129);
                        } else {
                            i28 = i26;
                        }
                        signUpSource4 = signUpSource3;
                    } else {
                        c28655q3.m87138X();
                        if ((i14 & 128) != 0) {
                            function8 = function8;
                            function7 = function7;
                            function17 = function9;
                            function16 = function6;
                            signUpSource4 = signUpSource;
                            i28 = i26 & (-29360129);
                        } else {
                            function18 = function10;
                            function8 = function8;
                            function7 = function7;
                            function17 = function9;
                            function16 = function6;
                            i28 = i26;
                            signUpSource4 = signUpSource;
                        }
                        c28655q3.m87175r();
                        interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
                        interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
                        zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID);
                        zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.EMAIL_FIRST_BACK_NAV_FIX);
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(viewState.getProgressButtonState());
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87262p(c28655q3);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R7;
                        objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                            c28655q3.m87172p0(objM87133R8);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                        objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                            c28655q3.m87172p0(objM87133R9);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                        C3927k c3927kM43838g = viewState.getProgressButtonState();
                        zM87157i = c28655q3.m87157i(viewState);
                        objM87133R10 = c28655q3.m87133R();
                        if (zM87157i || objM87133R10 == c28676v0) {
                            objM87133R10 = new b(viewState, interfaceC28601c1, null);
                            c28655q3.m87172p0(objM87133R10);
                        }
                        int i39 = C3927k.f16020r;
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R10, c3927kM43838g);
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                        C2307m c2307m4 = C2299e.f9114w;
                        interfaceC28601c4 = interfaceC28601c1;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66723l);
                        InterfaceC0221l.f734a.getClass();
                        function19 = function18;
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                        if (interfaceC25312u instanceof C34634d) {
                            i29 = 0;
                        } else {
                            i29 = 4;
                        }
                        Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3407d, 0.0f, 0.0f, 0.0f, i29 * 8, 7);
                        c2307m = C2299e.f9102E;
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                        i34 = 3670016;
                        if (viewState.getCurrentDestination() != currentNavHostDestination) {
                            c28655q3.m87150e0(611457388);
                            AbstractC22289r.m64035b(c28655q3, 0);
                            c28655q3.m87173q(false);
                            interfaceC28601c5 = interfaceC28601c2;
                            function17 = function17;
                            interfaceC28601c4 = interfaceC28601c4;
                            interfaceC28601c3 = interfaceC28601c3;
                            function8 = function8;
                            function7 = function7;
                        } else {
                            c28655q3.m87150e0(611719772);
                            C25307p c25307pM43816c = AbstractC15561b.m43816c();
                            boolean zM87157i3 = c28655q3.m87157i(interfaceC25312u);
                            if ((458752 & i28) == 131072) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z28 = zM87157i3 | z13;
                            if ((i28 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z29 = z28 | z14;
                            if ((57344 & i28) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean z34 = z29 | z15;
                            if ((i28 & 3670016) == 1048576) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z34 | z16;
                            objM87133R11 = c28655q3.m87133R();
                            if (!z17 || objM87133R11 == c28676v0) {
                                Function1 function24 = function16;
                                objM87133R11 = new C1019g0(function24, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                                interfaceC25312u3 = interfaceC25312u;
                                interfaceC28601c5 = interfaceC28601c2;
                                function16 = function24;
                                c28655q3.m87172p0(objM87133R11);
                            } else {
                                interfaceC28601c5 = interfaceC28601c2;
                                interfaceC25312u3 = interfaceC25312u;
                            }
                            interfaceC25312u = interfaceC25312u3;
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM43816c, null, (Function1) objM87133R11, c28655q3, C25307p.f99300b << 3, 4);
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(true);
                        if (zIsFeatureEnabled2) {
                            c28655q3.m87150e0(-773289618);
                            int iM43833b = viewState.getCurrentStepIndex();
                            activationFlowDestinationM43832a = viewState.getCurrentDestination();
                            boolean zM87149e2 = c28655q3.m87149e(iM43833b);
                            if (activationFlowDestinationM43832a == null) {
                                iOrdinal = -1;
                            } else {
                                iOrdinal = activationFlowDestinationM43832a.ordinal();
                            }
                            zM87149e = c28655q3.m87149e(iOrdinal) | zM87149e2 | c28655q3.m87153g(interfaceC25312u) | c28655q3.m87153g(interfaceC25312u2) | c28655q3.m87155h(zIsFeatureEnabled);
                            objM87133R15 = c28655q3.m87133R();
                            if (!zM87149e || objM87133R15 == c28676v0) {
                                interfaceC25312u4 = interfaceC25312u;
                                objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                                c28655q3.m87172p0(objM87133R15);
                            } else {
                                interfaceC25312u4 = interfaceC25312u;
                            }
                            c30039k = (C30039k) objM87133R15;
                            c28655q3.m87173q(false);
                        } else {
                            i34 = 3670016;
                            interfaceC25312u4 = interfaceC25312u;
                            c28655q3.m87150e0(-772578943);
                            c28655q3.m87173q(false);
                            c30039k = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, false, function16);
                        }
                        interfaceC25312u5 = interfaceC25312u4;
                        function20 = function16;
                        boolean zM91974c = c30039k.m91974c();
                        zM87157i2 = c28655q3.m87157i(c30039k);
                        final Function1 function25 = function17;
                        objM87133R12 = c28655q3.m87133R();
                        if (zM87157i2 || objM87133R12 == c28676v0) {
                            objM87133R12 = new C30036h(c30039k, 0);
                            c28655q3.m87172p0(objM87133R12);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM91974c, c28655q3, 0, 0);
                        float f13 = 8;
                        float f14 = 2 * f13;
                        C30039k c30039k2 = c30039k;
                        float f15 = 1 * f13;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f15, f14, f15, 0.0f, 8);
                        final InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c5;
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3398t2);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                        zM91973b = c30039k2.m91973b();
                        c1100b = C1100b.f4583a;
                        if (zM91973b) {
                            c28655q3.m87150e0(-1335408562);
                            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            Modifier modifierMo3400a2 = c1100b.mo3400a(c2314t, C2299e.f9117z);
                            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q3, 0);
                            c15566g = viewState;
                            boolean zM87157i4 = c28655q3.m87157i(c15566g);
                            if ((i28 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = zM87157i4 | z26;
                            objM87133R14 = c28655q3.m87133R();
                            if (z27 || objM87133R14 == c28676v0) {
                                objM87133R14 = new C11768d(c15566g, function20, 1);
                                c28655q3.m87172p0(objM87133R14);
                            }
                            AbstractC27242b1.m82092d(c27270o, strM21273g, modifierMo3400a2, null, (InterfaceC4339a) objM87133R14, c28655q3, C27270o.f109105k, 8);
                            c28655q2 = c28655q3;
                            z18 = false;
                            c28655q2.m87173q(false);
                        } else {
                            z18 = false;
                            c15566g = viewState;
                            c28655q2 = c28655q3;
                            c28655q2.m87150e0(-1334793088);
                            c28655q2.m87173q(false);
                        }
                        c15562cM43837f = c15566g.getNavigationBarState();
                        if (c15562cM43837f == null) {
                            c28655q2.m87150e0(-1334709947);
                            c28655q2.m87173q(z18);
                            c28655q = c28655q2;
                            function21 = function20;
                            interfaceC25312u6 = interfaceC25312u5;
                        } else {
                            c28655q2.m87150e0(-1334709946);
                            if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                                modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                            } else {
                                modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9103F);
                            }
                            Modifier modifier = modifierMo3400a;
                            boolean zM87153g = c28655q2.m87153g(c15562cM43837f) | c28655q2.m87157i(interfaceC25312u5);
                            function21 = function20;
                            if ((i28 & 7168) == 2048) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z35 = z19 | zM87153g;
                            if ((i28 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z35 | z24;
                            objM87133R13 = c28655q2.m87133R();
                            if (!z25 || objM87133R13 == c28676v0) {
                                objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                                interfaceC25312u6 = interfaceC25312u5;
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                interfaceC25312u6 = interfaceC25312u5;
                            }
                            signUpSource4 = signUpSource4;
                            C28655q c28655q4 = c28655q2;
                            AbstractC12350b.m34583d((InterfaceC4339a) objM87133R13, modifier, false, null, null, null, null, AbstractC37817c.m121344e(-847257506, c28655q2, new C11766b(c15562cM43837f, 1)), c28655q4, 805306368, 508);
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c3927kM91937C = m91937C(interfaceC28601c4);
                        if (c3927kM91937C == null && !(interfaceC25312u6 instanceof C36953c) && c3927kM91937C.getIsVisible()) {
                            c28655q.m87150e0(-769516639);
                            C17909s c17909s = AbstractC17911t.f69612b;
                            C38072d c38072d = C38072d.f163053a;
                            int i44 = C38072d.f163054b;
                            c2307m2 = c2307m3;
                            AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(144, AbstractC1092a.m3357b(c2314t, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, i44).getBackgroundDarkStd())), new C17919x(c38072d.m121949b(c28655q, i44).getBackgroundDarkStd()), new C17919x(c38072d.m121949b(c28655q, i44).getBackgroundDarkStd())), 0.0f, 0.0f, 14), null, 0.0f, 6))), c2307m2), c28655q, 0);
                            c28655q.m87173q(false);
                        } else {
                            c2307m2 = c2307m3;
                            c28655q.m87150e0(-768905443);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3400a3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        float f16 = 4 * f13;
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, f16, 0.0f, f16, f14, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                        if (c3927kM91937C == 0 && c3927kM91937C.getIsVisible()) {
                            c28655q.m87150e0(503177498);
                            function23 = function19;
                            boolean zM87157i5 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(function23) | c28655q.m87157i(interfaceC25312u6) | c28655q.m87157i(viewState) | ((i28 & 234881024) == 67108864) | c28655q.m87157i(c3927kM91937C);
                            int i45 = i28;
                            boolean z36 = zM87157i5 | ((i45 & 7168) == 2048) | ((i45 & i34) == 1048576) | ((i45 & 896) == 256);
                            Object objM87133R16 = c28655q.m87133R();
                            if (z36 || objM87133R16 == c28676v0) {
                                signUpSource5 = signUpSource4;
                                final InterfaceC25312u interfaceC25312u7 = interfaceC25312u6;
                                final Function1 function26 = function21;
                                final InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c3;
                                Function1 function27 = new Function1() { // from class: q80.g
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC30037i.m91967y(interfaceC2994c0, function23, interfaceC25312u7, viewState, handleProgressButtonClick, c3927kM91937C, function26, function25, signUpSource5, interfaceC28601c6, interfaceC28601c7, (EnumC3919c) obj);
                                    }
                                };
                                function22 = function26;
                                c28655q.m87172p0(function27);
                                objM87133R16 = function27;
                            } else {
                                signUpSource5 = signUpSource4;
                                function22 = function21;
                            }
                            AbstractC3926j.m11931e(c3927kM91937C, (Function1) objM87133R16, c28655q, i39, 0);
                            c28655q.m87173q(false);
                        } else {
                            signUpSource5 = signUpSource4;
                            function22 = function21;
                            function23 = function19;
                            c28655q.m87150e0(503908819);
                            c28655q.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q, true, true, true);
                        function11 = function23;
                        signUpSource2 = signUpSource5;
                        function14 = function25;
                        function15 = function22;
                        function13 = function7;
                        function12 = function8;
                    }
                    function18 = function10;
                    c28655q3.m87175r();
                    interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
                    interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
                    zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID);
                    zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.EMAIL_FIRST_BACK_NAV_FIX);
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(viewState.getProgressButtonState());
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87262p(c28655q3);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    final InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R7;
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                        c28655q3.m87172p0(objM87133R8);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                        c28655q3.m87172p0(objM87133R9);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                    C3927k c3927kM43838g2 = viewState.getProgressButtonState();
                    zM87157i = c28655q3.m87157i(viewState);
                    objM87133R10 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new b(viewState, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new b(viewState, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R10);
                    }
                    int i310 = C3927k.f16020r;
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R10, c3927kM43838g2);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                    C2307m c2307m5 = C2299e.f9114w;
                    interfaceC28601c4 = interfaceC28601c1;
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM66723l2);
                    InterfaceC0221l.f734a.getClass();
                    function19 = function18;
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC39127r0M66763d5);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N6);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (interfaceC25312u instanceof C34634d) {
                        i29 = 0;
                    } else {
                        i29 = 4;
                    }
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3407d2, 0.0f, 0.0f, 0.0f, i29 * 8, 7);
                    c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m7);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N7);
                    i34 = 3670016;
                    if (viewState.getCurrentDestination() != currentNavHostDestination) {
                        c28655q3.m87150e0(611457388);
                        AbstractC22289r.m64035b(c28655q3, 0);
                        c28655q3.m87173q(false);
                        interfaceC28601c5 = interfaceC28601c2;
                        function17 = function17;
                        interfaceC28601c4 = interfaceC28601c4;
                        interfaceC28601c3 = interfaceC28601c3;
                        function8 = function8;
                        function7 = function7;
                    } else {
                        c28655q3.m87150e0(611719772);
                        C25307p c25307pM43816c2 = AbstractC15561b.m43816c();
                        boolean zM87157i6 = c28655q3.m87157i(interfaceC25312u);
                        if ((458752 & i28) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z210 = zM87157i6 | z13;
                        if ((i28 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z211 = z210 | z14;
                        if ((57344 & i28) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z37 = z211 | z15;
                        if ((i28 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z37 | z16;
                        objM87133R11 = c28655q3.m87133R();
                        if (z17) {
                            Function1 function28 = function16;
                            objM87133R11 = new C1019g0(function28, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                            interfaceC25312u3 = interfaceC25312u;
                            interfaceC28601c5 = interfaceC28601c2;
                            function16 = function28;
                            c28655q3.m87172p0(objM87133R11);
                        } else {
                            Function1 function29 = function16;
                            objM87133R11 = new C1019g0(function29, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                            interfaceC25312u3 = interfaceC25312u;
                            interfaceC28601c5 = interfaceC28601c2;
                            function16 = function29;
                            c28655q3.m87172p0(objM87133R11);
                        }
                        interfaceC25312u = interfaceC25312u3;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM43816c2, null, (Function1) objM87133R11, c28655q3, C25307p.f99300b << 3, 4);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    if (zIsFeatureEnabled2) {
                        c28655q3.m87150e0(-773289618);
                        int iM43833b2 = viewState.getCurrentStepIndex();
                        activationFlowDestinationM43832a = viewState.getCurrentDestination();
                        boolean zM87149e3 = c28655q3.m87149e(iM43833b2);
                        if (activationFlowDestinationM43832a == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = activationFlowDestinationM43832a.ordinal();
                        }
                        zM87149e = c28655q3.m87149e(iOrdinal) | zM87149e3 | c28655q3.m87153g(interfaceC25312u) | c28655q3.m87153g(interfaceC25312u2) | c28655q3.m87155h(zIsFeatureEnabled);
                        objM87133R15 = c28655q3.m87133R();
                        if (zM87149e) {
                            interfaceC25312u4 = interfaceC25312u;
                            objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                            c28655q3.m87172p0(objM87133R15);
                        } else {
                            interfaceC25312u4 = interfaceC25312u;
                            objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        c30039k = (C30039k) objM87133R15;
                        c28655q3.m87173q(false);
                    } else {
                        i34 = 3670016;
                        interfaceC25312u4 = interfaceC25312u;
                        c28655q3.m87150e0(-772578943);
                        c28655q3.m87173q(false);
                        c30039k = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, false, function16);
                    }
                    interfaceC25312u5 = interfaceC25312u4;
                    function20 = function16;
                    boolean zM91974c2 = c30039k.m91974c();
                    zM87157i2 = c28655q3.m87157i(c30039k);
                    final Function1 function210 = function17;
                    objM87133R12 = c28655q3.m87133R();
                    if (zM87157i2) {
                        objM87133R12 = new C30036h(c30039k, 0);
                        c28655q3.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C30036h(c30039k, 0);
                        c28655q3.m87172p0(objM87133R12);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM91974c2, c28655q3, 0, 0);
                    float f17 = 8;
                    float f18 = 2 * f17;
                    C30039k c30039k3 = c30039k;
                    float f19 = 1 * f17;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f19, f18, f19, 0.0f, 8);
                    final InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c5;
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3398t5);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m8);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N8);
                    zM91973b = c30039k3.m91973b();
                    c1100b = C1100b.f4583a;
                    if (zM91973b) {
                        c28655q3.m87150e0(-1335408562);
                        C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        Modifier modifierMo3400a4 = c1100b.mo3400a(c2314t, C2299e.f9117z);
                        String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q3, 0);
                        c15566g = viewState;
                        boolean zM87157i7 = c28655q3.m87157i(c15566g);
                        if ((i28 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zM87157i7 | z26;
                        objM87133R14 = c28655q3.m87133R();
                        if (z27) {
                            objM87133R14 = new C11768d(c15566g, function20, 1);
                            c28655q3.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new C11768d(c15566g, function20, 1);
                            c28655q3.m87172p0(objM87133R14);
                        }
                        AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierMo3400a4, null, (InterfaceC4339a) objM87133R14, c28655q3, C27270o.f109105k, 8);
                        c28655q2 = c28655q3;
                        z18 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z18 = false;
                        c15566g = viewState;
                        c28655q2 = c28655q3;
                        c28655q2.m87150e0(-1334793088);
                        c28655q2.m87173q(false);
                    }
                    c15562cM43837f = c15566g.getNavigationBarState();
                    if (c15562cM43837f == null) {
                        c28655q2.m87150e0(-1334709947);
                        c28655q2.m87173q(z18);
                        c28655q = c28655q2;
                        function21 = function20;
                        interfaceC25312u6 = interfaceC25312u5;
                    } else {
                        c28655q2.m87150e0(-1334709946);
                        if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                            modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                        } else {
                            modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9103F);
                        }
                        Modifier modifier2 = modifierMo3400a;
                        boolean zM87153g2 = c28655q2.m87153g(c15562cM43837f) | c28655q2.m87157i(interfaceC25312u5);
                        function21 = function20;
                        if ((i28 & 7168) == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z38 = z19 | zM87153g2;
                        if ((i28 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z38 | z24;
                        objM87133R13 = c28655q2.m87133R();
                        if (z25) {
                            objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                            interfaceC25312u6 = interfaceC25312u5;
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                            interfaceC25312u6 = interfaceC25312u5;
                            c28655q2.m87172p0(objM87133R13);
                        }
                        signUpSource4 = signUpSource4;
                        C28655q c28655q5 = c28655q2;
                        AbstractC12350b.m34583d((InterfaceC4339a) objM87133R13, modifier2, false, null, null, null, null, AbstractC37817c.m121344e(-847257506, c28655q2, new C11766b(c15562cM43837f, 1)), c28655q5, 805306368, 508);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c3927kM91937C = m91937C(interfaceC28601c4);
                    if (c3927kM91937C == null) {
                        c2307m2 = c2307m3;
                        c28655q.m87150e0(-768905443);
                        c28655q.m87173q(false);
                    } else {
                        c2307m2 = c2307m3;
                        c28655q.m87150e0(-768905443);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3400a5 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3400a5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N9);
                    float f110 = 4 * f17;
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, f110, 0.0f, f110, f18, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m5, false);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N10);
                    if (c3927kM91937C == 0) {
                        signUpSource5 = signUpSource4;
                        function22 = function21;
                        function23 = function19;
                        c28655q.m87150e0(503908819);
                        c28655q.m87173q(false);
                    } else {
                        signUpSource5 = signUpSource4;
                        function22 = function21;
                        function23 = function19;
                        c28655q.m87150e0(503908819);
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    function11 = function23;
                    signUpSource2 = signUpSource5;
                    function14 = function210;
                    function15 = function22;
                    function13 = function7;
                    function12 = function8;
                } else {
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    Function1 function30 = function8;
                    function11 = function10;
                    function12 = function30;
                    signUpSource2 = signUpSource;
                    function13 = function7;
                    function14 = function9;
                    function15 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3446h1(viewState, currentNavHostDestination, signUpSource2, function15, function13, function12, function14, function11, handleProgressButtonClick, i13, i14, 4);
                }
            }
            i15 |= 24576;
            function7 = function2;
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function3;
            } else {
                function8 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(function8)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function9 = function4;
            } else {
                function9 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87157i(function9)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    function10 = function5;
                    if (c28655q3.m87157i(function10)) {
                    }
                    i15 |= i38;
                } else {
                    function10 = function5;
                }
                i15 |= i38;
            } else {
                function10 = function5;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q3.m87157i(handleProgressButtonClick)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            i26 = i15;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i26 & 1, z4)) {
                c28655q3.m87140Z();
                i27 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i36 != 0) {
                        signUpSource3 = SignUpSource.ACTIVATION;
                    } else {
                        signUpSource3 = signUpSource;
                    }
                    if (i37 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30034f(0);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function16 = (Function1) objM87133R5;
                    } else {
                        function16 = function6;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30034f(1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30034f(2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C30034f(3);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function17 = (Function1) objM87133R2;
                    } else {
                        function17 = function9;
                    }
                    if ((i14 & 128) != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new a(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        function10 = (Function3) objM87133R;
                        i28 = i26 & (-29360129);
                    } else {
                        i28 = i26;
                    }
                    signUpSource4 = signUpSource3;
                    function18 = function10;
                } else {
                    if (i36 != 0) {
                        signUpSource3 = SignUpSource.ACTIVATION;
                    } else {
                        signUpSource3 = signUpSource;
                    }
                    if (i37 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30034f(0);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function16 = (Function1) objM87133R5;
                    } else {
                        function16 = function6;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30034f(1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30034f(2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C30034f(3);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function17 = (Function1) objM87133R2;
                    } else {
                        function17 = function9;
                    }
                    if ((i14 & 128) != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new a(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        function10 = (Function3) objM87133R;
                        i28 = i26 & (-29360129);
                    } else {
                        i28 = i26;
                    }
                    signUpSource4 = signUpSource3;
                    function18 = function10;
                }
                c28655q3.m87175r();
                interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
                interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID);
                zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.EMAIL_FIRST_BACK_NAV_FIX);
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(viewState.getProgressButtonState());
                    c28655q3.m87172p0(objM87133R6);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R7);
                }
                final InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R7;
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                    c28655q3.m87172p0(objM87133R8);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                    c28655q3.m87172p0(objM87133R9);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                C3927k c3927kM43838g3 = viewState.getProgressButtonState();
                zM87157i = c28655q3.m87157i(viewState);
                objM87133R10 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R10 = new b(viewState, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new b(viewState, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R10);
                }
                int i311 = C3927k.f16020r;
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R10, c3927kM43838g3);
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                C2307m c2307m6 = C2299e.f9114w;
                interfaceC28601c4 = interfaceC28601c1;
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, modifierM66723l3);
                InterfaceC0221l.f734a.getClass();
                function19 = function18;
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC39127r0M66763d9);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i9, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N11);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (interfaceC25312u instanceof C34634d) {
                    i29 = 0;
                } else {
                    i29 = 4;
                }
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(modifierM3407d3, 0.0f, 0.0f, 0.0f, i29 * 8, 7);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, modifierM3398t7);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC39127r0M66763d10);
                AbstractC28683x.m87239G(c28655q3, c0209i9, interfaceC28653p1M87165m12);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N12);
                i34 = 3670016;
                if (viewState.getCurrentDestination() != currentNavHostDestination) {
                    c28655q3.m87150e0(611457388);
                    AbstractC22289r.m64035b(c28655q3, 0);
                    c28655q3.m87173q(false);
                    interfaceC28601c5 = interfaceC28601c2;
                    function17 = function17;
                    interfaceC28601c4 = interfaceC28601c4;
                    interfaceC28601c3 = interfaceC28601c3;
                    function8 = function8;
                    function7 = function7;
                } else {
                    c28655q3.m87150e0(611719772);
                    C25307p c25307pM43816c3 = AbstractC15561b.m43816c();
                    boolean zM87157i8 = c28655q3.m87157i(interfaceC25312u);
                    if ((458752 & i28) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z212 = zM87157i8 | z13;
                    if ((i28 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z213 = z212 | z14;
                    if ((57344 & i28) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z39 = z213 | z15;
                    if ((i28 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z39 | z16;
                    objM87133R11 = c28655q3.m87133R();
                    if (z17) {
                        Function1 function211 = function16;
                        objM87133R11 = new C1019g0(function211, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                        interfaceC25312u3 = interfaceC25312u;
                        interfaceC28601c5 = interfaceC28601c2;
                        function16 = function211;
                        c28655q3.m87172p0(objM87133R11);
                    } else {
                        Function1 function212 = function16;
                        objM87133R11 = new C1019g0(function212, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                        interfaceC25312u3 = interfaceC25312u;
                        interfaceC28601c5 = interfaceC28601c2;
                        function16 = function212;
                        c28655q3.m87172p0(objM87133R11);
                    }
                    interfaceC25312u = interfaceC25312u3;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM43816c3, null, (Function1) objM87133R11, c28655q3, C25307p.f99300b << 3, 4);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                if (zIsFeatureEnabled2) {
                    c28655q3.m87150e0(-773289618);
                    int iM43833b3 = viewState.getCurrentStepIndex();
                    activationFlowDestinationM43832a = viewState.getCurrentDestination();
                    boolean zM87149e4 = c28655q3.m87149e(iM43833b3);
                    if (activationFlowDestinationM43832a == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = activationFlowDestinationM43832a.ordinal();
                    }
                    zM87149e = c28655q3.m87149e(iOrdinal) | zM87149e4 | c28655q3.m87153g(interfaceC25312u) | c28655q3.m87153g(interfaceC25312u2) | c28655q3.m87155h(zIsFeatureEnabled);
                    objM87133R15 = c28655q3.m87133R();
                    if (zM87149e) {
                        interfaceC25312u4 = interfaceC25312u;
                        objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                        c28655q3.m87172p0(objM87133R15);
                    } else {
                        interfaceC25312u4 = interfaceC25312u;
                        objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                        c28655q3.m87172p0(objM87133R15);
                    }
                    c30039k = (C30039k) objM87133R15;
                    c28655q3.m87173q(false);
                } else {
                    i34 = 3670016;
                    interfaceC25312u4 = interfaceC25312u;
                    c28655q3.m87150e0(-772578943);
                    c28655q3.m87173q(false);
                    c30039k = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, false, function16);
                }
                interfaceC25312u5 = interfaceC25312u4;
                function20 = function16;
                boolean zM91974c3 = c30039k.m91974c();
                zM87157i2 = c28655q3.m87157i(c30039k);
                final Function1 function213 = function17;
                objM87133R12 = c28655q3.m87133R();
                if (zM87157i2) {
                    objM87133R12 = new C30036h(c30039k, 0);
                    c28655q3.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C30036h(c30039k, 0);
                    c28655q3.m87172p0(objM87133R12);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM91974c3, c28655q3, 0, 0);
                float f111 = 8;
                float f112 = 2 * f111;
                C30039k c30039k4 = c30039k;
                float f113 = 1 * f111;
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f113, f112, f113, 0.0f, 8);
                final InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c5;
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3398t8);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q3, c0209i9, interfaceC28653p1M87165m13);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N13);
                zM91973b = c30039k4.m91973b();
                c1100b = C1100b.f4583a;
                if (zM91973b) {
                    c28655q3.m87150e0(-1335408562);
                    C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierMo3400a6 = c1100b.mo3400a(c2314t, C2299e.f9117z);
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q3, 0);
                    c15566g = viewState;
                    boolean zM87157i9 = c28655q3.m87157i(c15566g);
                    if ((i28 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zM87157i9 | z26;
                    objM87133R14 = c28655q3.m87133R();
                    if (z27) {
                        objM87133R14 = new C11768d(c15566g, function20, 1);
                        c28655q3.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C11768d(c15566g, function20, 1);
                        c28655q3.m87172p0(objM87133R14);
                    }
                    AbstractC27242b1.m82092d(c27270o3, strM21273g3, modifierMo3400a6, null, (InterfaceC4339a) objM87133R14, c28655q3, C27270o.f109105k, 8);
                    c28655q2 = c28655q3;
                    z18 = false;
                    c28655q2.m87173q(false);
                } else {
                    z18 = false;
                    c15566g = viewState;
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-1334793088);
                    c28655q2.m87173q(false);
                }
                c15562cM43837f = c15566g.getNavigationBarState();
                if (c15562cM43837f == null) {
                    c28655q2.m87150e0(-1334709947);
                    c28655q2.m87173q(z18);
                    c28655q = c28655q2;
                    function21 = function20;
                    interfaceC25312u6 = interfaceC25312u5;
                } else {
                    c28655q2.m87150e0(-1334709946);
                    if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                        modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                    } else {
                        modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9103F);
                    }
                    Modifier modifier3 = modifierMo3400a;
                    boolean zM87153g3 = c28655q2.m87153g(c15562cM43837f) | c28655q2.m87157i(interfaceC25312u5);
                    function21 = function20;
                    if ((i28 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z310 = z19 | zM87153g3;
                    if ((i28 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z310 | z24;
                    objM87133R13 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                        interfaceC25312u6 = interfaceC25312u5;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                        interfaceC25312u6 = interfaceC25312u5;
                        c28655q2.m87172p0(objM87133R13);
                    }
                    signUpSource4 = signUpSource4;
                    C28655q c28655q6 = c28655q2;
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R13, modifier3, false, null, null, null, null, AbstractC37817c.m121344e(-847257506, c28655q2, new C11766b(c15562cM43837f, 1)), c28655q6, 805306368, 508);
                    c28655q = c28655q6;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c3927kM91937C = m91937C(interfaceC28601c4);
                if (c3927kM91937C == null) {
                    c2307m2 = c2307m3;
                    c28655q.m87150e0(-768905443);
                    c28655q.m87173q(false);
                } else {
                    c2307m2 = c2307m3;
                    c28655q.m87150e0(-768905443);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3400a7 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierMo3400a7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N14);
                float f114 = 4 * f111;
                Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, f114, 0.0f, f114, f112, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m6, false);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N15);
                if (c3927kM91937C == 0) {
                    signUpSource5 = signUpSource4;
                    function22 = function21;
                    function23 = function19;
                    c28655q.m87150e0(503908819);
                    c28655q.m87173q(false);
                } else {
                    signUpSource5 = signUpSource4;
                    function22 = function21;
                    function23 = function19;
                    c28655q.m87150e0(503908819);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function11 = function23;
                signUpSource2 = signUpSource5;
                function14 = function213;
                function15 = function22;
                function13 = function7;
                function12 = function8;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                Function1 function31 = function8;
                function11 = function10;
                function12 = function31;
                signUpSource2 = signUpSource;
                function13 = function7;
                function14 = function9;
                function15 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3446h1(viewState, currentNavHostDestination, signUpSource2, function15, function13, function12, function14, function11, handleProgressButtonClick, i13, i14, 4);
            }
        }
        i15 |= 3072;
        function6 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function7 = function2;
                if (c28655q3.m87157i(function7)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function3;
            } else {
                function8 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(function8)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function9 = function4;
            } else {
                function9 = function4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87157i(function9)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 12582912) == 0) {
                if ((i14 & 128) == 0) {
                    function10 = function5;
                    if (c28655q3.m87157i(function10)) {
                    }
                    i15 |= i38;
                } else {
                    function10 = function5;
                }
                i15 |= i38;
            } else {
                function10 = function5;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q3.m87157i(handleProgressButtonClick)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            i26 = i15;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i26 & 1, z4)) {
                c28655q3.m87140Z();
                i27 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    if (i36 != 0) {
                        signUpSource3 = SignUpSource.ACTIVATION;
                    } else {
                        signUpSource3 = signUpSource;
                    }
                    if (i37 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30034f(0);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function16 = (Function1) objM87133R5;
                    } else {
                        function16 = function6;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30034f(1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30034f(2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C30034f(3);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function17 = (Function1) objM87133R2;
                    } else {
                        function17 = function9;
                    }
                    if ((i14 & 128) != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new a(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        function10 = (Function3) objM87133R;
                        i28 = i26 & (-29360129);
                    } else {
                        i28 = i26;
                    }
                    signUpSource4 = signUpSource3;
                    function18 = function10;
                } else {
                    if (i36 != 0) {
                        signUpSource3 = SignUpSource.ACTIVATION;
                    } else {
                        signUpSource3 = signUpSource;
                    }
                    if (i37 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30034f(0);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function16 = (Function1) objM87133R5;
                    } else {
                        function16 = function6;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30034f(1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30034f(2);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C30034f(3);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function17 = (Function1) objM87133R2;
                    } else {
                        function17 = function9;
                    }
                    if ((i14 & 128) != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new a(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        function10 = (Function3) objM87133R;
                        i28 = i26 & (-29360129);
                    } else {
                        i28 = i26;
                    }
                    signUpSource4 = signUpSource3;
                    function18 = function10;
                }
                c28655q3.m87175r();
                interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
                interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID);
                zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.EMAIL_FIRST_BACK_NAV_FIX);
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(viewState.getProgressButtonState());
                    c28655q3.m87172p0(objM87133R6);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R7);
                }
                final InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R7;
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                    c28655q3.m87172p0(objM87133R8);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                    c28655q3.m87172p0(objM87133R9);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
                C3927k c3927kM43838g4 = viewState.getProgressButtonState();
                zM87157i = c28655q3.m87157i(viewState);
                objM87133R10 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R10 = new b(viewState, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new b(viewState, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R10);
                }
                int i312 = C3927k.f16020r;
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R10, c3927kM43838g4);
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
                C2307m c2307m7 = C2299e.f9114w;
                interfaceC28601c4 = interfaceC28601c1;
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, modifierM66723l4);
                InterfaceC0221l.f734a.getClass();
                function19 = function18;
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC39127r0M66763d13);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i12, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N16);
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (interfaceC25312u instanceof C34634d) {
                    i29 = 0;
                } else {
                    i29 = 4;
                }
                Modifier modifierM3398t10 = AbstractC1099a.m3398t(modifierM3407d4, 0.0f, 0.0f, 0.0f, i29 * 8, 7);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q3.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q3, modifierM3398t10);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q3, c0209i12, interfaceC28653p1M87165m17);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N17);
                i34 = 3670016;
                if (viewState.getCurrentDestination() != currentNavHostDestination) {
                    c28655q3.m87150e0(611457388);
                    AbstractC22289r.m64035b(c28655q3, 0);
                    c28655q3.m87173q(false);
                    interfaceC28601c5 = interfaceC28601c2;
                    function17 = function17;
                    interfaceC28601c4 = interfaceC28601c4;
                    interfaceC28601c3 = interfaceC28601c3;
                    function8 = function8;
                    function7 = function7;
                } else {
                    c28655q3.m87150e0(611719772);
                    C25307p c25307pM43816c4 = AbstractC15561b.m43816c();
                    boolean zM87157i10 = c28655q3.m87157i(interfaceC25312u);
                    if ((458752 & i28) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z214 = zM87157i10 | z13;
                    if ((i28 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z215 = z214 | z14;
                    if ((57344 & i28) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z311 = z215 | z15;
                    if ((i28 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z311 | z16;
                    objM87133R11 = c28655q3.m87133R();
                    if (z17) {
                        Function1 function214 = function16;
                        objM87133R11 = new C1019g0(function214, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                        interfaceC25312u3 = interfaceC25312u;
                        interfaceC28601c5 = interfaceC28601c2;
                        function16 = function214;
                        c28655q3.m87172p0(objM87133R11);
                    } else {
                        Function1 function215 = function16;
                        objM87133R11 = new C1019g0(function215, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                        interfaceC25312u3 = interfaceC25312u;
                        interfaceC28601c5 = interfaceC28601c2;
                        function16 = function215;
                        c28655q3.m87172p0(objM87133R11);
                    }
                    interfaceC25312u = interfaceC25312u3;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM43816c4, null, (Function1) objM87133R11, c28655q3, C25307p.f99300b << 3, 4);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                if (zIsFeatureEnabled2) {
                    c28655q3.m87150e0(-773289618);
                    int iM43833b4 = viewState.getCurrentStepIndex();
                    activationFlowDestinationM43832a = viewState.getCurrentDestination();
                    boolean zM87149e5 = c28655q3.m87149e(iM43833b4);
                    if (activationFlowDestinationM43832a == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = activationFlowDestinationM43832a.ordinal();
                    }
                    zM87149e = c28655q3.m87149e(iOrdinal) | zM87149e5 | c28655q3.m87153g(interfaceC25312u) | c28655q3.m87153g(interfaceC25312u2) | c28655q3.m87155h(zIsFeatureEnabled);
                    objM87133R15 = c28655q3.m87133R();
                    if (zM87149e) {
                        interfaceC25312u4 = interfaceC25312u;
                        objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                        c28655q3.m87172p0(objM87133R15);
                    } else {
                        interfaceC25312u4 = interfaceC25312u;
                        objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                        c28655q3.m87172p0(objM87133R15);
                    }
                    c30039k = (C30039k) objM87133R15;
                    c28655q3.m87173q(false);
                } else {
                    i34 = 3670016;
                    interfaceC25312u4 = interfaceC25312u;
                    c28655q3.m87150e0(-772578943);
                    c28655q3.m87173q(false);
                    c30039k = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, false, function16);
                }
                interfaceC25312u5 = interfaceC25312u4;
                function20 = function16;
                boolean zM91974c4 = c30039k.m91974c();
                zM87157i2 = c28655q3.m87157i(c30039k);
                final Function1 function216 = function17;
                objM87133R12 = c28655q3.m87133R();
                if (zM87157i2) {
                    objM87133R12 = new C30036h(c30039k, 0);
                    c28655q3.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C30036h(c30039k, 0);
                    c28655q3.m87172p0(objM87133R12);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM91974c4, c28655q3, 0, 0);
                float f115 = 8;
                float f116 = 2 * f115;
                C30039k c30039k5 = c30039k;
                float f117 = 1 * f115;
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f117, f116, f117, 0.0f, 8);
                final InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c5;
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, modifierM3398t11);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q3, c0209i12, interfaceC28653p1M87165m18);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N18);
                zM91973b = c30039k5.m91973b();
                c1100b = C1100b.f4583a;
                if (zM91973b) {
                    c28655q3.m87150e0(-1335408562);
                    C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierMo3400a8 = c1100b.mo3400a(c2314t, C2299e.f9117z);
                    String strM21273g4 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q3, 0);
                    c15566g = viewState;
                    boolean zM87157i11 = c28655q3.m87157i(c15566g);
                    if ((i28 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zM87157i11 | z26;
                    objM87133R14 = c28655q3.m87133R();
                    if (z27) {
                        objM87133R14 = new C11768d(c15566g, function20, 1);
                        c28655q3.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C11768d(c15566g, function20, 1);
                        c28655q3.m87172p0(objM87133R14);
                    }
                    AbstractC27242b1.m82092d(c27270o4, strM21273g4, modifierMo3400a8, null, (InterfaceC4339a) objM87133R14, c28655q3, C27270o.f109105k, 8);
                    c28655q2 = c28655q3;
                    z18 = false;
                    c28655q2.m87173q(false);
                } else {
                    z18 = false;
                    c15566g = viewState;
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-1334793088);
                    c28655q2.m87173q(false);
                }
                c15562cM43837f = c15566g.getNavigationBarState();
                if (c15562cM43837f == null) {
                    c28655q2.m87150e0(-1334709947);
                    c28655q2.m87173q(z18);
                    c28655q = c28655q2;
                    function21 = function20;
                    interfaceC25312u6 = interfaceC25312u5;
                } else {
                    c28655q2.m87150e0(-1334709946);
                    if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                        modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                    } else {
                        modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9103F);
                    }
                    Modifier modifier4 = modifierMo3400a;
                    boolean zM87153g4 = c28655q2.m87153g(c15562cM43837f) | c28655q2.m87157i(interfaceC25312u5);
                    function21 = function20;
                    if ((i28 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z312 = z19 | zM87153g4;
                    if ((i28 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z312 | z24;
                    objM87133R13 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                        interfaceC25312u6 = interfaceC25312u5;
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                        interfaceC25312u6 = interfaceC25312u5;
                        c28655q2.m87172p0(objM87133R13);
                    }
                    signUpSource4 = signUpSource4;
                    C28655q c28655q7 = c28655q2;
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R13, modifier4, false, null, null, null, null, AbstractC37817c.m121344e(-847257506, c28655q2, new C11766b(c15562cM43837f, 1)), c28655q7, 805306368, 508);
                    c28655q = c28655q7;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c3927kM91937C = m91937C(interfaceC28601c4);
                if (c3927kM91937C == null) {
                    c2307m2 = c2307m3;
                    c28655q.m87150e0(-768905443);
                    c28655q.m87173q(false);
                } else {
                    c2307m2 = c2307m3;
                    c28655q.m87150e0(-768905443);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3400a9 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierMo3400a9);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m19);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N19);
                float f118 = 4 * f115;
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, f118, 0.0f, f118, f116, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3398t12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d16);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N110);
                if (c3927kM91937C == 0) {
                    signUpSource5 = signUpSource4;
                    function22 = function21;
                    function23 = function19;
                    c28655q.m87150e0(503908819);
                    c28655q.m87173q(false);
                } else {
                    signUpSource5 = signUpSource4;
                    function22 = function21;
                    function23 = function19;
                    c28655q.m87150e0(503908819);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function11 = function23;
                signUpSource2 = signUpSource5;
                function14 = function216;
                function15 = function22;
                function13 = function7;
                function12 = function8;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                Function1 function32 = function8;
                function11 = function10;
                function12 = function32;
                signUpSource2 = signUpSource;
                function13 = function7;
                function14 = function9;
                function15 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3446h1(viewState, currentNavHostDestination, signUpSource2, function15, function13, function12, function14, function11, handleProgressButtonClick, i13, i14, 4);
            }
        }
        i15 |= 24576;
        function7 = function2;
        i18 = i14 & 32;
        if (i18 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function8 = function3;
        } else {
            function8 = function3;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(function8)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            function9 = function4;
        } else {
            function9 = function4;
            if ((i13 & 1572864) == 0) {
                if (c28655q3.m87157i(function9)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        if ((i13 & 12582912) == 0) {
            if ((i14 & 128) == 0) {
                function10 = function5;
                if (c28655q3.m87157i(function10)) {
                }
                i15 |= i38;
            } else {
                function10 = function5;
            }
            i15 |= i38;
        } else {
            function10 = function5;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q3.m87157i(handleProgressButtonClick)) {
                i35 = 67108864;
            } else {
                i35 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i35;
        }
        i26 = i15;
        if ((i15 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i26 & 1, z4)) {
            c28655q3.m87140Z();
            i27 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                if (i36 != 0) {
                    signUpSource3 = SignUpSource.ACTIVATION;
                } else {
                    signUpSource3 = signUpSource;
                }
                if (i37 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30034f(0);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function16 = (Function1) objM87133R5;
                } else {
                    function16 = function6;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30034f(1);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30034f(2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                }
                if (i24 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30034f(3);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function17 = (Function1) objM87133R2;
                } else {
                    function17 = function9;
                }
                if ((i14 & 128) != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new a(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    function10 = (Function3) objM87133R;
                    i28 = i26 & (-29360129);
                } else {
                    i28 = i26;
                }
                signUpSource4 = signUpSource3;
                function18 = function10;
            } else {
                if (i36 != 0) {
                    signUpSource3 = SignUpSource.ACTIVATION;
                } else {
                    signUpSource3 = signUpSource;
                }
                if (i37 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30034f(0);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function16 = (Function1) objM87133R5;
                } else {
                    function16 = function6;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30034f(1);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30034f(2);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                }
                if (i24 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30034f(3);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function17 = (Function1) objM87133R2;
                } else {
                    function17 = function9;
                }
                if ((i14 & 128) != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new a(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    function10 = (Function3) objM87133R;
                    i28 = i26 & (-29360129);
                } else {
                    i28 = i26;
                }
                signUpSource4 = signUpSource3;
                function18 = function10;
            }
            c28655q3.m87175r();
            interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
            interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID);
            zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.EMAIL_FIRST_BACK_NAV_FIX);
            objM87133R6 = c28655q3.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(viewState.getProgressButtonState());
                c28655q3.m87172p0(objM87133R6);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q3.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87262p(c28655q3);
                c28655q3.m87172p0(objM87133R7);
            }
            final InterfaceC2994c0 interfaceC2994c4 = (InterfaceC2994c0) objM87133R7;
            objM87133R8 = c28655q3.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                c28655q3.m87172p0(objM87133R8);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
            objM87133R9 = c28655q3.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87272z(new C28997e(null, null, null, null, 15, null));
                c28655q3.m87172p0(objM87133R9);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R9;
            C3927k c3927kM43838g5 = viewState.getProgressButtonState();
            zM87157i = c28655q3.m87157i(viewState);
            objM87133R10 = c28655q3.m87133R();
            if (zM87157i) {
                objM87133R10 = new b(viewState, interfaceC28601c1, null);
                c28655q3.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new b(viewState, interfaceC28601c1, null);
                c28655q3.m87172p0(objM87133R10);
            }
            int i313 = C3927k.f16020r;
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R10, c3927kM43838g5);
            c2314t = C2314t.f9131w;
            Modifier modifierM66723l5 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, c2314t));
            C2307m c2307m8 = C2299e.f9114w;
            interfaceC28601c4 = interfaceC28601c1;
            InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m8, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q3.m87165m();
            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q3, modifierM66723l5);
            InterfaceC0221l.f734a.getClass();
            function19 = function18;
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC39127r0M66763d17);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m111);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i16 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N111);
            Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
            if (interfaceC25312u instanceof C34634d) {
                i29 = 0;
            } else {
                i29 = 4;
            }
            Modifier modifierM3398t13 = AbstractC1099a.m3398t(modifierM3407d5, 0.0f, 0.0f, 0.0f, i29 * 8, 7);
            c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q3.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q3, modifierM3398t13);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC39127r0M66763d18);
            AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m112);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N112);
            i34 = 3670016;
            if (viewState.getCurrentDestination() != currentNavHostDestination) {
                c28655q3.m87150e0(611457388);
                AbstractC22289r.m64035b(c28655q3, 0);
                c28655q3.m87173q(false);
                interfaceC28601c5 = interfaceC28601c2;
                function17 = function17;
                interfaceC28601c4 = interfaceC28601c4;
                interfaceC28601c3 = interfaceC28601c3;
                function8 = function8;
                function7 = function7;
            } else {
                c28655q3.m87150e0(611719772);
                C25307p c25307pM43816c5 = AbstractC15561b.m43816c();
                boolean zM87157i12 = c28655q3.m87157i(interfaceC25312u);
                if ((458752 & i28) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z216 = zM87157i12 | z13;
                if ((i28 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z217 = z216 | z14;
                if ((57344 & i28) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z313 = z217 | z15;
                if ((i28 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z313 | z16;
                objM87133R11 = c28655q3.m87133R();
                if (z17) {
                    Function1 function217 = function16;
                    objM87133R11 = new C1019g0(function217, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                    interfaceC25312u3 = interfaceC25312u;
                    interfaceC28601c5 = interfaceC28601c2;
                    function16 = function217;
                    c28655q3.m87172p0(objM87133R11);
                } else {
                    Function1 function218 = function16;
                    objM87133R11 = new C1019g0(function218, function7, function17, interfaceC28601c4, interfaceC25312u, interfaceC28601c3, interfaceC28601c2, function8);
                    interfaceC25312u3 = interfaceC25312u;
                    interfaceC28601c5 = interfaceC28601c2;
                    function16 = function218;
                    c28655q3.m87172p0(objM87133R11);
                }
                interfaceC25312u = interfaceC25312u3;
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM43816c5, null, (Function1) objM87133R11, c28655q3, C25307p.f99300b << 3, 4);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            if (zIsFeatureEnabled2) {
                c28655q3.m87150e0(-773289618);
                int iM43833b5 = viewState.getCurrentStepIndex();
                activationFlowDestinationM43832a = viewState.getCurrentDestination();
                boolean zM87149e6 = c28655q3.m87149e(iM43833b5);
                if (activationFlowDestinationM43832a == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = activationFlowDestinationM43832a.ordinal();
                }
                zM87149e = c28655q3.m87149e(iOrdinal) | zM87149e6 | c28655q3.m87153g(interfaceC25312u) | c28655q3.m87153g(interfaceC25312u2) | c28655q3.m87155h(zIsFeatureEnabled);
                objM87133R15 = c28655q3.m87133R();
                if (zM87149e) {
                    interfaceC25312u4 = interfaceC25312u;
                    objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                    c28655q3.m87172p0(objM87133R15);
                } else {
                    interfaceC25312u4 = interfaceC25312u;
                    objM87133R15 = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, true, function16);
                    c28655q3.m87172p0(objM87133R15);
                }
                c30039k = (C30039k) objM87133R15;
                c28655q3.m87173q(false);
            } else {
                i34 = 3670016;
                interfaceC25312u4 = interfaceC25312u;
                c28655q3.m87150e0(-772578943);
                c28655q3.m87173q(false);
                c30039k = new C30039k(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u4, interfaceC25312u2, zIsFeatureEnabled, false, function16);
            }
            interfaceC25312u5 = interfaceC25312u4;
            function20 = function16;
            boolean zM91974c5 = c30039k.m91974c();
            zM87157i2 = c28655q3.m87157i(c30039k);
            final Function1 function219 = function17;
            objM87133R12 = c28655q3.m87133R();
            if (zM87157i2) {
                objM87133R12 = new C30036h(c30039k, 0);
                c28655q3.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new C30036h(c30039k, 0);
                c28655q3.m87172p0(objM87133R12);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R12, zM91974c5, c28655q3, 0, 0);
            float f119 = 8;
            float f1110 = 2 * f119;
            C30039k c30039k6 = c30039k;
            float f1111 = 1 * f119;
            Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f1111, f1110, f1111, 0.0f, 8);
            final InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c5;
            InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m8, false);
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, modifierM3398t14);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC39127r0M66763d19);
            AbstractC28683x.m87239G(c28655q3, c0209i15, interfaceC28653p1M87165m113);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i16, modifierM118962N113);
            zM91973b = c30039k6.m91973b();
            c1100b = C1100b.f4583a;
            if (zM91973b) {
                c28655q3.m87150e0(-1335408562);
                C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierMo3400a10 = c1100b.mo3400a(c2314t, C2299e.f9117z);
                String strM21273g5 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q3, 0);
                c15566g = viewState;
                boolean zM87157i13 = c28655q3.m87157i(c15566g);
                if ((i28 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zM87157i13 | z26;
                objM87133R14 = c28655q3.m87133R();
                if (z27) {
                    objM87133R14 = new C11768d(c15566g, function20, 1);
                    c28655q3.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new C11768d(c15566g, function20, 1);
                    c28655q3.m87172p0(objM87133R14);
                }
                AbstractC27242b1.m82092d(c27270o5, strM21273g5, modifierMo3400a10, null, (InterfaceC4339a) objM87133R14, c28655q3, C27270o.f109105k, 8);
                c28655q2 = c28655q3;
                z18 = false;
                c28655q2.m87173q(false);
            } else {
                z18 = false;
                c15566g = viewState;
                c28655q2 = c28655q3;
                c28655q2.m87150e0(-1334793088);
                c28655q2.m87173q(false);
            }
            c15562cM43837f = c15566g.getNavigationBarState();
            if (c15562cM43837f == null) {
                c28655q2.m87150e0(-1334709947);
                c28655q2.m87173q(z18);
                c28655q = c28655q2;
                function21 = function20;
                interfaceC25312u6 = interfaceC25312u5;
            } else {
                c28655q2.m87150e0(-1334709946);
                if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                    modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                } else {
                    modifierMo3400a = c1100b.mo3400a(c2314t, C2299e.f9103F);
                }
                Modifier modifier5 = modifierMo3400a;
                boolean zM87153g5 = c28655q2.m87153g(c15562cM43837f) | c28655q2.m87157i(interfaceC25312u5);
                function21 = function20;
                if ((i28 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z314 = z19 | zM87153g5;
                if ((i28 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z314 | z24;
                objM87133R13 = c28655q2.m87133R();
                if (z25) {
                    objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                    interfaceC25312u6 = interfaceC25312u5;
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new C27198e((Object) c15562cM43837f, (Object) interfaceC25312u5, function21, (Object) signUpSource4, 7);
                    interfaceC25312u6 = interfaceC25312u5;
                    c28655q2.m87172p0(objM87133R13);
                }
                signUpSource4 = signUpSource4;
                C28655q c28655q8 = c28655q2;
                AbstractC12350b.m34583d((InterfaceC4339a) objM87133R13, modifier5, false, null, null, null, null, AbstractC37817c.m121344e(-847257506, c28655q2, new C11766b(c15562cM43837f, 1)), c28655q8, 805306368, 508);
                c28655q = c28655q8;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c3927kM91937C = m91937C(interfaceC28601c4);
            if (c3927kM91937C == null) {
                c2307m2 = c2307m3;
                c28655q.m87150e0(-768905443);
                c28655q.m87173q(false);
            } else {
                c2307m2 = c2307m3;
                c28655q.m87150e0(-768905443);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3400a11 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2);
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierMo3400a11);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N114);
            float f1112 = 4 * f119;
            Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, f1112, 0.0f, f1112, f1110, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m8, false);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d110);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m115);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N115);
            if (c3927kM91937C == 0) {
                signUpSource5 = signUpSource4;
                function22 = function21;
                function23 = function19;
                c28655q.m87150e0(503908819);
                c28655q.m87173q(false);
            } else {
                signUpSource5 = signUpSource4;
                function22 = function21;
                function23 = function19;
                c28655q.m87150e0(503908819);
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, true);
            function11 = function23;
            signUpSource2 = signUpSource5;
            function14 = function219;
            function15 = function22;
            function13 = function7;
            function12 = function8;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            Function1 function33 = function8;
            function11 = function10;
            function12 = function33;
            signUpSource2 = signUpSource;
            function13 = function7;
            function14 = function9;
            function15 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(viewState, currentNavHostDestination, signUpSource2, function15, function13, function12, function14, function11, handleProgressButtonClick, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m91956n(InterfaceC21414b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m91957o(AbstractC23438o it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m91958p(InterfaceC28601c1 interfaceC28601c1, C28997e c28997e) {
        interfaceC28601c1.setValue(c28997e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C28997e m91959q(InterfaceC28601c1 interfaceC28601c1) {
        return (C28997e) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final void m91960r(InterfaceC28601c1 interfaceC28601c1, C28997e c28997e) {
        interfaceC28601c1.setValue(c28997e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m91961s(Function1 function1, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC25312u interfaceC25312u, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Function1 function4, Object event) {
        C3927k c3927kM11937b;
        AbstractC22676k.m65750j(event, "event");
        EnumC3921e enumC3921e = event instanceof EnumC3921e ? (EnumC3921e) event : null;
        if (enumC3921e != null) {
            C3927k c3927kM91937C = m91937C(interfaceC28601c1);
            if (c3927kM91937C != null) {
                int i13 = d.f122612a[enumC3921e.ordinal()];
                if (i13 == 1) {
                    c3927kM11937b = C3927k.m11937b(c3927kM91937C, null, null, null, null, null, null, 0, 0, null, true, false, null, null, null, null, null, null, 130559, null);
                } else if (i13 == 2) {
                    c3927kM11937b = C3927k.m11937b(c3927kM91937C, null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 130559, null);
                } else if (i13 == 3) {
                    c3927kM11937b = C3927k.m11937b(c3927kM91937C, null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 130047, null);
                } else if (i13 == 4) {
                    c3927kM11937b = C3927k.m11937b(c3927kM91937C, null, null, null, null, null, null, 0, 0, null, false, true, null, null, null, null, null, null, 130047, null);
                } else {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c3927kM11937b = C3927k.m11937b(c3927kM91937C, null, null, null, null, null, null, 0, 0, null, false, false, null, null, null, null, null, null, 131047, null);
                }
            } else {
                c3927kM11937b = null;
            }
            m91938D(interfaceC28601c1, c3927kM11937b);
        }
        C29006n c29006n = event instanceof C29006n ? (C29006n) event : null;
        if (c29006n != null) {
            if ((interfaceC25312u instanceof C35826r) || (interfaceC25312u instanceof C35815g)) {
                m91960r(interfaceC28601c2, c29006n.getCard());
            } else {
                m91958p(interfaceC28601c3, c29006n.getCard());
            }
        }
        AbstractC26474d.a aVar = event instanceof AbstractC26474d.a ? (AbstractC26474d.a) event : null;
        if (aVar != null) {
            function4.invoke(new C27072e(aVar, 29));
        }
        InterfaceC21414b interfaceC21414b = event instanceof InterfaceC21414b ? (InterfaceC21414b) event : null;
        if (interfaceC21414b != null) {
            function1.invoke(interfaceC21414b);
        }
        AbstractC23438o abstractC23438o = event instanceof AbstractC23438o ? (AbstractC23438o) event : null;
        if (abstractC23438o != null) {
            function2.invoke(abstractC23438o);
        }
        InterfaceC17002b interfaceC17002b = event instanceof InterfaceC17002b ? (InterfaceC17002b) event : null;
        if (interfaceC17002b != null) {
            function3.invoke(interfaceC17002b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m91962t(AbstractC26474d.a aVar) {
        aVar.getOnNext().invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m91963u(C30039k c30039k) {
        c30039k.m91972a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m91964v(C15566g c15566g, Function1 function1) {
        ActivationFlowDestination activationFlowDestinationM43832a = c15566g.getCurrentDestination();
        if (activationFlowDestinationM43832a != null) {
            function1.invoke(new InterfaceC21413a.m0(activationFlowDestinationM43832a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m91965w(C15562c c15562c, InterfaceC25312u interfaceC25312u, Function1 function1, SignUpSource signUpSource) {
        if (c15562c.getNavBarType() == EnumC15570k.SKIP) {
            if (interfaceC25312u instanceof C35830v) {
                function1.invoke(new InterfaceC21413a.f0(CommitmentType.TRIAL));
            }
            function1.invoke(new InterfaceC21413a.c0(true, null, signUpSource, 2, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m91966x(C15562c c15562c, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        C2886a c2886aM8430k;
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String text = c15562c.getText();
            if (c15562c.getNavBarType() == EnumC15570k.TITLE) {
                c28655q.m87150e0(874604500);
                c2886aM8430k = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(874689843);
                c2886aM8430k = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS();
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(text, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k, null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m91967y(InterfaceC2994c0 interfaceC2994c0, Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, InterfaceC4356r interfaceC4356r, C3927k c3927k, Function1 function1, Function1 function2, SignUpSource signUpSource, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(function3, interfaceC25312u, c15566g, interfaceC4356r, c3927k, function1, function2, signUpSource, interfaceC28601c1, interfaceC28601c2, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m91968z(C15566g c15566g, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function3 function5, InterfaceC4356r interfaceC4356r, int i13, int i14, Composer composer, int i15) {
        m91955m(c15566g, activationFlowDestination, signUpSource, function1, function2, function3, function4, function5, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
