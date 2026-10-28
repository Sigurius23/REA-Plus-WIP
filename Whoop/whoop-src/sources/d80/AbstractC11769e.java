package d80;

import am2.C1042s;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c31.EnumC3921e;
import c90.C4325b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import ck1.C4780c;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import cp0.C11010y;
import d11.C11473h;
import d30.C11558r;
import e93.AbstractC12889b;
import f70.C14201q0;
import g80.AbstractC15561b;
import g80.C15562c;
import g80.C15566g;
import g80.EnumC15570k;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import h80.InterfaceC17002b;
import io.sentry.config.AbstractC20301a;
import j80.InterfaceC21413a;
import j80.InterfaceC21414b;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l80.AbstractC23438o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27256h;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p078d1.C11456i;
import p098dt.AbstractC12350b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22951e1;
import p291l0.C22994r1;
import p291l0.C23009w1;
import p291l0.C23010x;
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
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w90.C36953c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d80.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aá\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00062*\b\u0002\u0010\u0013\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2H\u0010\u0016\u001aD\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lg80/g;", "viewState", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentNavHostDestination", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function3;", "Lm91/u;", "Lf70/q0;", "Lq83/d;", "", "onBeforeAdvance", "Lkotlin/Function6;", "Lc31/k;", "handleProgressButtonClick", "m", "(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/p;Landroidx/compose/runtime/Composer;II)V", "", "D", "(Lm91/u;)Z", "showLocalLoadingOverlay", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11769e {

    /* JADX INFO: renamed from: d80.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$4$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lm91/u;", "<unused var>", "Lf70/q0;", "Ll83/a0;", "<anonymous>", "(Lm91/u;Lf70/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f38111w;

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
            if (this.f38111w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$5$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11770f f38113x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15566g f38114y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11770f c11770f, C15566g c15566g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38113x = c11770f;
            this.f38114y = c15566g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f38113x, this.f38114y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38112w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f38113x.m31544i(this.f38114y.getProgressButtonState());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$6$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38115w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11770f f38116x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C11770f c11770f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38116x = c11770f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f38116x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38115w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C11770f.m31536f(this.f38116x, false, 1, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$7$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38117w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15566g f38118x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f38119y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15566g c15566g, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38118x = c15566g;
            this.f38119y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f38118x, this.f38119y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38117w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f38118x.getIsProgressButtonLoading()) {
                AbstractC11769e.m31506B(this.f38119y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$9$4$1$1$1$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {324}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f38120E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Object f38121F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ SignUpSource f38122G;

        /* JADX INFO: renamed from: w */
        int f38123w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function3 f38124x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25312u f38125y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15566g f38126z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, Function1 function1, Object obj, SignUpSource signUpSource, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38124x = function3;
            this.f38125y = interfaceC25312u;
            this.f38126z = c15566g;
            this.f38120E = function1;
            this.f38121F = obj;
            this.f38122G = signUpSource;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f38124x, this.f38125y, this.f38126z, this.f38120E, this.f38121F, this.f38122G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38123w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function3 function3 = this.f38124x;
                InterfaceC25312u interfaceC25312u = this.f38125y;
                C14201q0 c14201q0M43836e = this.f38126z.getMemberInfo();
                this.f38123w = 1;
                if (function3.invoke(interfaceC25312u, c14201q0M43836e, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f38120E.invoke(InterfaceC21413a.c0.m60173b((InterfaceC21413a.c0) this.f38121F, false, null, this.f38122G, 3, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$9$4$1$handleCardButtonTap$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {305}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f38127E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ SignUpSource f38128F;

        /* JADX INFO: renamed from: w */
        int f38129w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function3 f38130x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25312u f38131y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15566g f38132z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, Function1 function1, SignUpSource signUpSource, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38130x = function3;
            this.f38131y = interfaceC25312u;
            this.f38132z = c15566g;
            this.f38127E = function1;
            this.f38128F = signUpSource;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f38130x, this.f38131y, this.f38132z, this.f38127E, this.f38128F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38129w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function3 function3 = this.f38130x;
                InterfaceC25312u interfaceC25312u = this.f38131y;
                C14201q0 c14201q0M43836e = this.f38132z.getMemberInfo();
                this.f38129w = 1;
                if (function3.invoke(interfaceC25312u, c14201q0M43836e, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f38127E.invoke(new InterfaceC21413a.c0(false, null, this.f38128F, 3, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$g */
    @InterfaceC32271e(m100429c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$9$5$1$1$1$1", m100430f = "IAJFBffScreensContainer.kt", m100431l = {369}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4354p f38133E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C3927k f38134F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f38135G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Function1 f38136H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ SignUpSource f38137I;

        /* JADX INFO: renamed from: w */
        int f38138w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function3 f38139x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC25312u f38140y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15566g f38141z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, InterfaceC4354p interfaceC4354p, C3927k c3927k, Function1 function1, Function1 function2, SignUpSource signUpSource, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38139x = function3;
            this.f38140y = interfaceC25312u;
            this.f38141z = c15566g;
            this.f38133E = interfaceC4354p;
            this.f38134F = c3927k;
            this.f38135G = function1;
            this.f38136H = function2;
            this.f38137I = signUpSource;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f38139x, this.f38140y, this.f38141z, this.f38133E, this.f38134F, this.f38135G, this.f38136H, this.f38137I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f38138w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function3 function3 = this.f38139x;
                InterfaceC25312u interfaceC25312u = this.f38140y;
                C14201q0 c14201q0M43836e = this.f38141z.getMemberInfo();
                this.f38138w = 1;
                if (function3.invoke(interfaceC25312u, c14201q0M43836e, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f38133E.invoke(this.f38140y, this.f38134F, this.f38141z, this.f38135G, this.f38136H, this.f38137I);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d80.e$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38142a;

        static {
            int[] iArr = new int[FooterAlignment.values().length];
            try {
                iArr[FooterAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FooterAlignment.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FooterAlignment.LEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38142a = iArr;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final boolean m31505A(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m31506B(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m31508D(InterfaceC25312u interfaceC25312u) {
        return !(interfaceC25312u instanceof C4325b);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:103:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0159  */
    /* JADX WARN: Code duplicated, block: B:108:0x0167  */
    /* JADX WARN: Code duplicated, block: B:110:0x016d  */
    /* JADX WARN: Code duplicated, block: B:114:0x017d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x0205  */
    /* JADX WARN: Code duplicated, block: B:136:0x0227  */
    /* JADX WARN: Code duplicated, block: B:139:0x0247  */
    /* JADX WARN: Code duplicated, block: B:140:0x0253  */
    /* JADX WARN: Code duplicated, block: B:146:0x027d  */
    /* JADX WARN: Code duplicated, block: B:149:0x029c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0338  */
    /* JADX WARN: Code duplicated, block: B:159:0x033c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0351  */
    /* JADX WARN: Code duplicated, block: B:165:0x0362  */
    /* JADX WARN: Code duplicated, block: B:169:0x039a  */
    /* JADX WARN: Code duplicated, block: B:170:0x039e  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:180:0x0400  */
    /* JADX WARN: Code duplicated, block: B:182:0x0412  */
    /* JADX WARN: Code duplicated, block: B:183:0x0415  */
    /* JADX WARN: Code duplicated, block: B:186:0x041c  */
    /* JADX WARN: Code duplicated, block: B:187:0x041f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0427  */
    /* JADX WARN: Code duplicated, block: B:191:0x042a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0432 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x043a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0495  */
    /* JADX WARN: Code duplicated, block: B:202:0x0497  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:211:0x04e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:215:0x0539  */
    /* JADX WARN: Code duplicated, block: B:216:0x053d  */
    /* JADX WARN: Code duplicated, block: B:219:0x054a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0558  */
    /* JADX WARN: Code duplicated, block: B:227:0x056f  */
    /* JADX WARN: Code duplicated, block: B:229:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:230:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:233:0x05c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:236:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:238:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:241:0x061e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0631  */
    /* JADX WARN: Code duplicated, block: B:245:0x063f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0648  */
    /* JADX WARN: Code duplicated, block: B:250:0x065b  */
    /* JADX WARN: Code duplicated, block: B:251:0x065d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0665  */
    /* JADX WARN: Code duplicated, block: B:255:0x0667  */
    /* JADX WARN: Code duplicated, block: B:258:0x066f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x0675  */
    /* JADX WARN: Code duplicated, block: B:265:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:273:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x072b  */
    /* JADX WARN: Code duplicated, block: B:277:0x073c  */
    /* JADX WARN: Code duplicated, block: B:279:0x076b  */
    /* JADX WARN: Code duplicated, block: B:281:0x076e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0779  */
    /* JADX WARN: Code duplicated, block: B:285:0x077c  */
    /* JADX WARN: Code duplicated, block: B:287:0x077f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0783  */
    /* JADX WARN: Code duplicated, block: B:292:0x0789  */
    /* JADX WARN: Code duplicated, block: B:293:0x078d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0791  */
    /* JADX WARN: Code duplicated, block: B:298:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:300:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:303:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:305:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:311:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:313:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:314:0x0802  */
    /* JADX WARN: Code duplicated, block: B:317:0x0807  */
    /* JADX WARN: Code duplicated, block: B:322:0x0813  */
    /* JADX WARN: Code duplicated, block: B:323:0x0817  */
    /* JADX WARN: Code duplicated, block: B:325:0x081a  */
    /* JADX WARN: Code duplicated, block: B:326:0x081f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0825  */
    /* JADX WARN: Code duplicated, block: B:329:0x082a  */
    /* JADX WARN: Code duplicated, block: B:331:0x082d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0837  */
    /* JADX WARN: Code duplicated, block: B:337:0x0854  */
    /* JADX WARN: Code duplicated, block: B:338:0x0856  */
    /* JADX WARN: Code duplicated, block: B:341:0x087e  */
    /* JADX WARN: Code duplicated, block: B:342:0x0880  */
    /* JADX WARN: Code duplicated, block: B:345:0x088b  */
    /* JADX WARN: Code duplicated, block: B:346:0x088d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0898  */
    /* JADX WARN: Code duplicated, block: B:350:0x089a  */
    /* JADX WARN: Code duplicated, block: B:353:0x08a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:359:0x0957  */
    /* JADX WARN: Code duplicated, block: B:361:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:362:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:365:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:367:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:371:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:374:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:406:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:410:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:414:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:416:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:417:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:420:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:422:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:425:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:428:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:433:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r0v24, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v31, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v60, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r11v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v36, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v37, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v38, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v39, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r12v12, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r15v15, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r1v15, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r24v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v15, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r6v26, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r8v43, types: [androidx.compose.runtime.Composer] */
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
    public static final void m31521m(final C15566g viewState, ActivationFlowDestination currentNavHostDestination, SignUpSource signUpSource, Function1 function1, Function1 function2, Function1 function3, Function3 function4, InterfaceC4354p handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        Function1 function5;
        Function1 function6;
        int i16;
        Function1 function7;
        int i17;
        Function3 function8;
        boolean z4;
        Function3 function9;
        Function1 function10;
        SignUpSource signUpSource2;
        Function1 function11;
        Function1 function12;
        ?? r14;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        SignUpSource signUpSource3;
        int i19;
        Function3 function13;
        SignUpSource signUpSource4;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC25312u interfaceC25312u;
        InterfaceC25312u interfaceC25312u2;
        List<InterfaceC25312u> listM43835d;
        List<InterfaceC25312u> list;
        boolean zIsEmpty;
        Object objM87133R5;
        C11770f c11770f;
        Object objM87133R6;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i;
        Function1 function17;
        Object objM87133R8;
        Object objM87133R9;
        boolean zM87157i2;
        Object objM87133R10;
        C3927k c3927kM31541c;
        InterfaceC28601c1 interfaceC28601c2;
        float size;
        C2314t c2314t;
        Modifier modifierM66727p;
        int i24;
        Function3 function18;
        boolean zM87153g;
        C17916v0 c17916v0;
        Object objM87133R11;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        InterfaceC2994c0 interfaceC2994c0;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        int i25;
        C0209i c0209i4;
        SignUpSource signUpSource5;
        int iHashCode2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R12;
        InterfaceC25312u interfaceC25312u3;
        C0209i c0209i5;
        float f13;
        C2314t c2314t2;
        C0213j c0213j2;
        C28655q c28655q;
        ActivationFlowDestination activationFlowDestinationM43832a;
        int iOrdinal;
        boolean zM87149e;
        Object objM87133R13;
        Function1 function19;
        C11765a c11765a;
        boolean zM87157i3;
        Object objM87133R14;
        float f14;
        float f15;
        int iHashCode3;
        C0209i c0209i6;
        boolean zM31503b;
        C1100b c1100b;
        InterfaceC25312u interfaceC25312u4;
        C28676v0 c28676v1;
        ?? r10;
        ?? r15;
        C15562c c15562cM43837f;
        C2307m c2307m2;
        Modifier modifierMo3400a;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R15;
        SignUpSource signUpSource6;
        ?? r16;
        boolean z24;
        C2307m c2307m3;
        int i26;
        Function1 function20;
        Function1 function21;
        SignUpSource signUpSource7;
        InterfaceC28601c1 interfaceC28601c3;
        C17916v0 c17916v1;
        C0209i c0209i7;
        ?? r17;
        int iHashCode4;
        C2314t c2314t3;
        int iHashCode5;
        boolean z25;
        float f16;
        ?? r18;
        ?? r19;
        ?? r110;
        int iHashCode6;
        C0213j c0213j3;
        C0209i c0209i8;
        boolean z26;
        FooterAlignment footerAlignmentM43834c;
        int i27;
        C2305k c2305k;
        int iHashCode7;
        Iterator it;
        ?? r24;
        InterfaceC25312u interfaceC25312u5;
        C27256h c27256h;
        C11770f c11770f2;
        C27256h c27256h2;
        boolean zM31540b;
        C9598e destination;
        boolean z27;
        boolean z28;
        final InterfaceC2994c0 interfaceC2994c1;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean zM87157i4;
        Object obj;
        ?? r111;
        Function1 function22;
        SignUpSource signUpSource8;
        InterfaceC28601c1 interfaceC28601c4;
        Function3 function23;
        InterfaceC25312u interfaceC25312u6;
        Function1 function24;
        C27256h c27256hM31539a;
        boolean z36;
        boolean z37;
        Object objM87133R16;
        int i28;
        int i29;
        int i34;
        C2307m c2307m4 = C2299e.f9102E;
        C2307m c2307m5 = C2299e.f9105H;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(currentNavHostDestination, "currentNavHostDestination");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(317228027);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87149e(currentNavHostDestination.ordinal()) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87149e(signUpSource == null ? -1 : signUpSource.ordinal()) ? 256 : 128;
        }
        int i36 = i14 & 8;
        if (i36 != 0) {
            i15 |= 3072;
            function5 = function1;
        } else if ((i13 & 3072) == 0) {
            function5 = function1;
            i15 |= c28655q2.m87157i(function5) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function5 = function1;
        }
        int i37 = i14 & 16;
        if (i37 == 0) {
            if ((i13 & 24576) == 0) {
                function6 = function2;
                i15 |= c28655q2.m87157i(function6) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function7)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
            }
            if ((i13 & 1572864) == 0) {
                function8 = function4;
                if ((i14 & 64) == 0 || !c28655q2.m87157i(function8)) {
                    i34 = 524288;
                } else {
                    i34 = 1048576;
                }
                i15 |= i34;
            } else {
                function8 = function4;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(handleProgressButtonClick)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            if ((i15 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0 || c28655q2.m87118C()) {
                    if (i35 != 0) {
                        signUpSource3 = SignUpSource.IAJF_V2;
                    } else {
                        signUpSource3 = signUpSource;
                    }
                    if (i36 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C11473h(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i37 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C11473h(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function6 = (Function1) objM87133R3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C11473h(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function7 = (Function1) objM87133R2;
                    }
                    if ((i14 & 64) != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new a(null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function8 = (Function3) objM87133R;
                        i15 &= -3670017;
                    }
                    SignUpSource signUpSource9 = signUpSource3;
                    i19 = i15;
                    function13 = function8;
                    signUpSource4 = signUpSource9;
                    function14 = function5;
                    function15 = function6;
                    function16 = function7;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 64) != 0) {
                        i15 &= -3670017;
                    }
                    i19 = i15;
                    function13 = function8;
                    function14 = function5;
                    function15 = function6;
                    function16 = function7;
                    signUpSource4 = signUpSource;
                }
                c28655q2.m87175r();
                interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
                interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
                listM43835d = viewState.m43835d();
                if (listM43835d == null) {
                    listM43835d = C25271y.f99162w;
                }
                list = listM43835d;
                zIsEmpty = list.isEmpty();
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C11770f(viewState.getProgressButtonState());
                    c28655q2.m87172p0(objM87133R5);
                }
                c11770f = (C11770f) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R7;
                C3927k c3927kM43838g = viewState.getProgressButtonState();
                zM87157i = c28655q2.m87157i(viewState);
                function17 = function16;
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i || objM87133R8 == c28676v0) {
                    objM87133R8 = new b(c11770f, viewState, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                int i38 = C3927k.f16020r;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, c3927kM43838g);
                Integer numValueOf = Integer.valueOf(viewState.getCurrentStepIndex());
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new c(c11770f, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, numValueOf);
                Boolean boolValueOf = Boolean.valueOf(viewState.getIsProgressButtonLoading());
                Integer numValueOf2 = Integer.valueOf(viewState.getCurrentStepIndex());
                zM87157i2 = c28655q2.m87157i(viewState);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R10 == c28676v0) {
                    objM87133R10 = new d(viewState, interfaceC28601c1, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87254h(boolValueOf, numValueOf2, (InterfaceC4351m) objM87133R10, c28655q2);
                c3927kM31541c = c11770f.m31541c();
                interfaceC28601c2 = interfaceC28601c1;
                if (viewState.getShouldReserveBottomSpace()) {
                    size = 6 * 8 * list.size();
                } else {
                    size = 8 * 4;
                }
                float f17 = size;
                WeakHashMap weakHashMap = C22944c2.f90553v;
                C23009w1 c23009w1 = C22949e.m66712e(c28655q2).f90564k;
                int i39 = AbstractC22960g2.f90608b | AbstractC22960g2.f90609c | 16;
                C22951e1 c22951e1 = new C22951e1(c23009w1, i39);
                c2314t = C2314t.f9131w;
                modifierM66727p = AbstractC22953f.m66727p(c2314t, c22951e1);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                ?? r112 = C38072d.f163053a;
                i24 = C38072d.f163054b;
                long jM125410o = r112.m121949b(c28655q2, i24).getBackgroundDarkStd();
                function18 = function13;
                C17916v0 c17916v2 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3407d, jM125410o, c17916v2);
                boolean zM31508D = m31508D(interfaceC25312u);
                zM87153g = c28655q2.m87153g(modifierM66727p);
                c17916v0 = c17916v2;
                objM87133R11 = c28655q2.m87133R();
                if (zM87153g || objM87133R11 == c28676v0) {
                    objM87133R11 = new C4780c(modifierM66727p, 18);
                    c28655q2.m87172p0(objM87133R11);
                }
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC15676d.m44099b(modifierM3358c, zM31508D, (Function1) objM87133R11));
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66720i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                interfaceC2994c0 = interfaceC2994c2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    i25 = i24;
                } else {
                    i25 = i24;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f17, 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m4, false);
                    signUpSource5 = signUpSource4;
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    if (viewState.getCurrentDestination() != currentNavHostDestination) {
                        c28655q2.m87150e0(325021968);
                        AbstractC22289r.m64035b(c28655q2, 0);
                        c28655q2.m87173q(false);
                        c2314t2 = c2314t;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        interfaceC25312u3 = interfaceC25312u;
                        function17 = function17;
                        f13 = 1.0f;
                        c28655q = c28655q2;
                    } else {
                        c28655q2.m87150e0(325243401);
                        C25307p c25307pM43816c = AbstractC15561b.m43816c();
                        if ((i19 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i19 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z38 = z13 | z14;
                        if ((i19 & 458752) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z38 | z15;
                        objM87133R12 = c28655q2.m87133R();
                        if (z16 || objM87133R12 == c28676v0) {
                            objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        C28655q c28655q3 = c28655q2;
                        interfaceC25312u3 = interfaceC25312u;
                        c0209i5 = c0209i3;
                        f13 = 1.0f;
                        c2314t2 = c2314t;
                        c0213j2 = c0213j;
                        AbstractC25303l.m74291r(interfaceC25312u3, c25307pM43816c, null, (Function1) objM87133R12, c28655q3, C25307p.f99300b << 3, 4);
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    }
                    c28655q.m87173q(true);
                    int iM43833b = viewState.getCurrentStepIndex();
                    activationFlowDestinationM43832a = viewState.getCurrentDestination();
                    boolean zM87149e2 = c28655q.m87149e(iM43833b);
                    if (activationFlowDestinationM43832a == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = activationFlowDestinationM43832a.ordinal();
                    }
                    zM87149e = zM87149e2 | c28655q.m87149e(iOrdinal) | c28655q.m87153g(interfaceC25312u3) | c28655q.m87153g(interfaceC25312u2);
                    objM87133R13 = c28655q.m87133R();
                    if (!zM87149e || objM87133R13 == c28676v0) {
                        Function1 function25 = function14;
                        objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function25);
                        function19 = function25;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        function19 = function14;
                    }
                    c11765a = (C11765a) objM87133R13;
                    boolean zM31504c = c11765a.m31504c();
                    zM87157i3 = c28655q.m87157i(c11765a);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R14 == c28676v0) {
                        objM87133R14 = new C11456i(c11765a, 7);
                        c28655q.m87172p0(objM87133R14);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, zM31504c, c28655q, 0, 0);
                    f14 = 8;
                    f15 = 2 * f14;
                    float f18 = 1 * f14;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC22953f.m66727p(AbstractC1102d.m3409f(f13, c2314t2), new C22951e1(C22949e.m66712e(c28655q).f90564k, i39)), f18, f15, f18, 0.0f, 8);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(r23, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        c0209i6 = c0209i5;
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    zM31503b = c11765a.m31503b();
                    c1100b = C1100b.f4583a;
                    if (zM31503b) {
                        c28655q.m87150e0(-1305714574);
                        C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        Modifier modifierMo3400a2 = c1100b.mo3400a(c2314t2, C2299e.f9117z);
                        String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q, 0);
                        boolean zM87157i5 = c28655q.m87157i(viewState);
                        InterfaceC25312u interfaceC25312u7 = interfaceC25312u3;
                        if ((i19 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z36 | zM87157i5;
                        objM87133R16 = c28655q.m87133R();
                        if (!z37 || objM87133R16 == c28676v0) {
                            i28 = 0;
                            objM87133R16 = new C11768d(viewState, function19, i28);
                            c28655q.m87172p0(objM87133R16);
                        } else {
                            i28 = 0;
                        }
                        C28655q c28655q4 = c28655q;
                        ?? r25 = i28;
                        c28676v1 = c28676v0;
                        interfaceC25312u4 = interfaceC25312u7;
                        AbstractC27242b1.m82092d(c27270o, strM21273g, modifierMo3400a2, null, (InterfaceC4339a) objM87133R16, c28655q4, C27270o.f109105k, 8);
                        ?? r113 = c28655q4;
                        r113.m87173q(r25);
                        r10 = r25;
                        r15 = r113;
                    } else {
                        interfaceC25312u4 = interfaceC25312u3;
                        c28676v1 = c28676v0;
                        r10 = 0;
                        c28655q.m87150e0(-1305099100);
                        c28655q.m87173q(false);
                        r15 = c28655q;
                    }
                    c15562cM43837f = viewState.getNavigationBarState();
                    if (c15562cM43837f == null) {
                        r15.m87150e0(-1305017602);
                        r15.m87173q(r10);
                        r16 = r15;
                        signUpSource6 = signUpSource5;
                        c2307m2 = c2307m4;
                    } else {
                        r15.m87150e0(-1305017601);
                        if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                            c2307m2 = c2307m4;
                            modifierMo3400a = c1100b.mo3400a(c2314t2, c2307m2);
                        } else {
                            c2307m2 = c2307m4;
                            modifierMo3400a = c1100b.mo3400a(c2314t2, C2299e.f9103F);
                        }
                        Modifier modifier = modifierMo3400a;
                        boolean zM87153g2 = r15.m87153g(c15562cM43837f);
                        if ((i19 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z39 = zM87153g2 | z17;
                        if ((i19 & 896) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z39 | z18;
                        objM87133R15 = r15.m87133R();
                        if (!z19 || objM87133R15 == c28676v1) {
                            signUpSource6 = signUpSource5;
                            objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                            r15.m87172p0(objM87133R15);
                        } else {
                            signUpSource6 = signUpSource5;
                        }
                        ?? r26 = r15;
                        AbstractC12350b.m34583d((InterfaceC4339a) objM87133R15, modifier, false, null, null, null, null, AbstractC37817c.m121344e(-1433196358, r15, new C11766b(c15562cM43837f, 0)), r26, 805306368, 508);
                        ?? r27 = r26;
                        r27.m87173q(false);
                        r16 = r27;
                    }
                    r16.m87173q(true);
                    if (zIsEmpty || (c3927kM31541c != null && c3927kM31541c.getIsVisible())) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((interfaceC25312u4 instanceof C36953c) && z24) {
                        r16.m87150e0(-1474849499);
                        int i44 = i25;
                        i26 = 6;
                        c2307m3 = c2307m5;
                        AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(144, AbstractC1092a.m3357b(c2314t2, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, r112.m121949b(r16, i44).getBackgroundDarkStd())), new C17919x(r112.m121949b(r16, i44).getBackgroundDarkStd()), new C17919x(r112.m121949b(r16, i44).getBackgroundDarkStd())), 0.0f, 0.0f, 14), null, 0.0f, 6))), c2307m3), r16, 0);
                        r16.m87173q(false);
                    } else {
                        c2307m3 = c2307m5;
                        i26 = 6;
                        r16.m87150e0(-1474238303);
                        r16.m87173q(false);
                    }
                    if (zIsEmpty) {
                        function20 = function15;
                        function21 = function19;
                        C28676v0 c28676v2 = c28676v1;
                        signUpSource7 = signUpSource6;
                        int i45 = i19;
                        interfaceC28601c3 = interfaceC28601c2;
                        function18 = function18;
                        c17916v1 = c17916v0;
                        c0209i7 = c0209i6;
                        C2314t c2314t4 = c2314t2;
                        r17 = r16;
                        InterfaceC25312u interfaceC25312u8 = interfaceC25312u4;
                        r17.m87150e0(-1469630091);
                        Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t4), c2307m3);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, r17, i26);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = r17.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(r17, modifierMo3400a3);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j2);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m4);
                        if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                        }
                        AbstractC28683x.m87239G(r17, r4, modifierM118962N4);
                        float f19 = 4 * f14;
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t4, f19, 0.0f, f19, f15, 2);
                        c2314t3 = c2314t4;
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode5 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = r17.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(r17, modifierM3398t3);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j2);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m5);
                        if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                        }
                        AbstractC28683x.m87239G(r17, r4, modifierM118962N5);
                        if (c3927kM31541c == null && c3927kM31541c.getIsVisible()) {
                            r17.m87150e0(1679400035);
                            boolean zM87157i6 = r17.m87157i(interfaceC2994c0) | r17.m87157i(function18) | r17.m87157i(interfaceC25312u8) | r17.m87157i(viewState) | ((i45 & 29360128) == 8388608) | r17.m87157i(c3927kM31541c) | ((i45 & 7168) == 2048) | ((i45 & 458752) == 131072) | ((i45 & 896) == 256);
                            Object objM87133R17 = r17.m87133R();
                            if (zM87157i6 || objM87133R17 == c28676v2) {
                                ?? r114 = r17;
                                f16 = 1.0f;
                                C11010y c11010y = new C11010y(interfaceC2994c0, interfaceC28601c3, function18, interfaceC25312u8, viewState, handleProgressButtonClick, c3927kM31541c, function21, function17, signUpSource7);
                                r114.m87172p0(c11010y);
                                objM87133R17 = c11010y;
                                r19 = r114;
                            } else {
                                r19 = r17;
                                f16 = 1.0f;
                            }
                            z25 = false;
                            AbstractC3926j.m11931e(c3927kM31541c, (Function1) objM87133R17, r19, i38, 0);
                            r19.m87173q(false);
                            r18 = r19;
                        } else {
                            ?? r115 = r17;
                            function18 = function18;
                            z25 = false;
                            f16 = 1.0f;
                            r115.m87150e0(1680162108);
                            r115.m87173q(false);
                            r18 = r115;
                        }
                        AbstractC25012a.m73392y(r18, true, true, z25);
                        r110 = r18;
                    } else {
                        r16.m87150e0(-1474052024);
                        float f24 = ((float) 2.5d) * f14;
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3), c2307m3), f24, 0.0f, f24, 5 * f14, 2);
                        footerAlignmentM43834c = viewState.getFooterAlignment();
                        if (footerAlignmentM43834c == null) {
                            i27 = -1;
                        } else {
                            i27 = h.f38142a[footerAlignmentM43834c.ordinal()];
                        }
                        if (i27 == -1) {
                            if (i27 != 1) {
                                c2305k = C2299e.f9111N;
                            } else if (i27 != 2) {
                                c2305k = C2299e.f9112O;
                            } else if (i27 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                            iHashCode7 = Long.hashCode(r16.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = r16.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(r16, modifierM3398t4);
                            r16.m87158i0();
                            if (r16.f115903S) {
                                r16.m87163l(c0213j2);
                            } else {
                                r16.m87178s0();
                            }
                            AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a);
                            AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m6);
                            if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode7))) {
                                AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                            }
                            AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N6);
                            r16.m87150e0(-1141456598);
                            it = list.iterator();
                            r24 = r16;
                            while (it.hasNext()) {
                                interfaceC25312u5 = (InterfaceC25312u) it.next();
                                if (interfaceC25312u5 instanceof C27256h) {
                                    c27256h = (C27256h) interfaceC25312u5;
                                } else {
                                    c27256h = null;
                                }
                                c11770f2 = c11770f;
                                if (c27256h != null && (c27256hM31539a = c11770f2.m31539a(c27256h)) != null) {
                                    interfaceC25312u5 = c27256hM31539a;
                                }
                                if (interfaceC25312u5 instanceof C27256h) {
                                    c27256h2 = (C27256h) interfaceC25312u5;
                                } else {
                                    c27256h2 = null;
                                }
                                if (c27256h2 != null) {
                                    zM31540b = c27256h2.getEnabled();
                                } else {
                                    zM31540b = c11770f2.m31540b();
                                }
                                if (c27256h != null) {
                                    destination = c27256h.getDestination();
                                } else {
                                    destination = null;
                                }
                                if (destination != null || (destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9318g6)) {
                                    z27 = false;
                                } else {
                                    z27 = true;
                                }
                                C25307p c25307pM43816c2 = AbstractC15561b.m43816c();
                                boolean zM87155h = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                                C2314t c2314t5 = c2314t2;
                                if ((i19 & 57344) == 16384) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                boolean z44 = z28 | zM87155h;
                                interfaceC2994c1 = interfaceC2994c0;
                                boolean zM87157i7 = z44 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                                if ((i19 & 7168) == 2048) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                boolean z45 = zM87157i7 | z29;
                                if ((i19 & 896) == 256) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                boolean z46 = z45 | z34;
                                if ((i19 & 458752) == 131072) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                zM87157i4 = z46 | z35 | r24.m87157i(c27256h);
                                Object objM87133R18 = r24.m87133R();
                                if (!zM87157i4 || objM87133R18 == c28676v1) {
                                    final boolean z47 = zM31540b;
                                    final boolean z48 = z27;
                                    final InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c2;
                                    final Function1 function26 = function15;
                                    final Function1 function27 = function19;
                                    final InterfaceC25312u interfaceC25312u9 = interfaceC25312u4;
                                    r111 = r24;
                                    final SignUpSource signUpSource10 = signUpSource6;
                                    final C9598e c9598e = destination;
                                    final C27256h c27256h3 = c27256h;
                                    final Function1 function28 = function17;
                                    final Function3 function29 = function18;
                                    obj = new Function1() { // from class: d80.c
                                        @Override // p715kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return AbstractC11769e.m31530v(z47, z48, c9598e, function26, interfaceC2994c1, function28, function27, interfaceC28601c5, function29, interfaceC25312u9, viewState, signUpSource10, c27256h3, obj2);
                                        }
                                    };
                                    function22 = function26;
                                    signUpSource8 = signUpSource10;
                                    interfaceC28601c4 = interfaceC28601c5;
                                    function23 = function29;
                                    interfaceC25312u6 = interfaceC25312u9;
                                    function24 = function27;
                                    interfaceC2994c1 = interfaceC2994c1;
                                    r111.m87172p0(obj);
                                } else {
                                    function22 = function15;
                                    obj = objM87133R18;
                                    function24 = function19;
                                    interfaceC25312u6 = interfaceC25312u4;
                                    signUpSource8 = signUpSource6;
                                    interfaceC28601c4 = interfaceC28601c2;
                                    function23 = function18;
                                    r111 = r24;
                                }
                                ?? r28 = r111;
                                AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c2, null, (Function1) obj, r28, C25307p.f99300b << 3, 4);
                                it = it;
                                function18 = function23;
                                r24 = r28;
                                interfaceC2994c0 = interfaceC2994c1;
                                c2314t2 = c2314t5;
                                function15 = function22;
                                interfaceC28601c2 = interfaceC28601c4;
                                interfaceC25312u4 = interfaceC25312u6;
                                function19 = function24;
                                c11770f = c11770f2;
                                signUpSource6 = signUpSource8;
                                c17916v0 = c17916v0;
                                c28676v1 = c28676v1;
                                i19 = i19;
                            }
                            function20 = function15;
                            C2314t c2314t6 = c2314t2;
                            function21 = function19;
                            ?? r29 = r24;
                            signUpSource7 = signUpSource6;
                            interfaceC28601c3 = interfaceC28601c2;
                            c17916v1 = c17916v0;
                            z25 = false;
                            AbstractC25012a.m73392y(r29, false, true, false);
                            r110 = r29;
                            c2314t3 = c2314t6;
                            f16 = 1.0f;
                        }
                        c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                        iHashCode7 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = r16.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(r16, modifierM3398t4);
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m7);
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                        }
                        AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N7);
                        r16.m87150e0(-1141456598);
                        it = list.iterator();
                        r24 = r16;
                        while (it.hasNext()) {
                            interfaceC25312u5 = (InterfaceC25312u) it.next();
                            if (interfaceC25312u5 instanceof C27256h) {
                                c27256h = (C27256h) interfaceC25312u5;
                            } else {
                                c27256h = null;
                            }
                            c11770f2 = c11770f;
                            if (c27256h != null) {
                                interfaceC25312u5 = c27256hM31539a;
                            }
                            if (interfaceC25312u5 instanceof C27256h) {
                                c27256h2 = (C27256h) interfaceC25312u5;
                            } else {
                                c27256h2 = null;
                            }
                            if (c27256h2 != null) {
                                zM31540b = c27256h2.getEnabled();
                            } else {
                                zM31540b = c11770f2.m31540b();
                            }
                            if (c27256h != null) {
                                destination = c27256h.getDestination();
                            } else {
                                destination = null;
                            }
                            if (destination != null) {
                                z27 = false;
                            } else {
                                z27 = false;
                            }
                            C25307p c25307pM43816c3 = AbstractC15561b.m43816c();
                            boolean zM87155h2 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                            C2314t c2314t7 = c2314t2;
                            if ((i19 & 57344) == 16384) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean z49 = z28 | zM87155h2;
                            interfaceC2994c1 = interfaceC2994c0;
                            boolean zM87157i8 = z49 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                            if ((i19 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z410 = zM87157i8 | z29;
                            if ((i19 & 896) == 256) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            boolean z411 = z410 | z34;
                            if ((i19 & 458752) == 131072) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            zM87157i4 = z411 | z35 | r24.m87157i(c27256h);
                            Object objM87133R19 = r24.m87133R();
                            if (zM87157i4) {
                                final boolean z412 = zM31540b;
                                final boolean z413 = z27;
                                final InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c2;
                                final Function1 function210 = function15;
                                final Function1 function211 = function19;
                                final InterfaceC25312u interfaceC25312u10 = interfaceC25312u4;
                                r111 = r24;
                                final SignUpSource signUpSource11 = signUpSource6;
                                final C9598e c9598e2 = destination;
                                final C27256h c27256h4 = c27256h;
                                final Function1 function212 = function17;
                                final Function3 function213 = function18;
                                obj = new Function1() { // from class: d80.c
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC11769e.m31530v(z412, z413, c9598e2, function210, interfaceC2994c1, function212, function211, interfaceC28601c6, function213, interfaceC25312u10, viewState, signUpSource11, c27256h4, obj2);
                                    }
                                };
                                function22 = function210;
                                signUpSource8 = signUpSource11;
                                interfaceC28601c4 = interfaceC28601c6;
                                function23 = function213;
                                interfaceC25312u6 = interfaceC25312u10;
                                function24 = function211;
                                interfaceC2994c1 = interfaceC2994c1;
                                r111.m87172p0(obj);
                            } else {
                                final boolean z414 = zM31540b;
                                final boolean z415 = z27;
                                final InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c2;
                                final Function1 function214 = function15;
                                final Function1 function215 = function19;
                                final InterfaceC25312u interfaceC25312u11 = interfaceC25312u4;
                                r111 = r24;
                                final SignUpSource signUpSource12 = signUpSource6;
                                final C9598e c9598e3 = destination;
                                final C27256h c27256h5 = c27256h;
                                final Function1 function216 = function17;
                                final Function3 function217 = function18;
                                obj = new Function1() { // from class: d80.c
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC11769e.m31530v(z414, z415, c9598e3, function214, interfaceC2994c1, function216, function215, interfaceC28601c7, function217, interfaceC25312u11, viewState, signUpSource12, c27256h5, obj2);
                                    }
                                };
                                function22 = function214;
                                signUpSource8 = signUpSource12;
                                interfaceC28601c4 = interfaceC28601c7;
                                function23 = function217;
                                interfaceC25312u6 = interfaceC25312u11;
                                function24 = function215;
                                interfaceC2994c1 = interfaceC2994c1;
                                r111.m87172p0(obj);
                            }
                            ?? r210 = r111;
                            AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c3, null, (Function1) obj, r210, C25307p.f99300b << 3, 4);
                            it = it;
                            function18 = function23;
                            r24 = r210;
                            interfaceC2994c0 = interfaceC2994c1;
                            c2314t2 = c2314t7;
                            function15 = function22;
                            interfaceC28601c2 = interfaceC28601c4;
                            interfaceC25312u4 = interfaceC25312u6;
                            function19 = function24;
                            c11770f = c11770f2;
                            signUpSource6 = signUpSource8;
                            c17916v0 = c17916v0;
                            c28676v1 = c28676v1;
                            i19 = i19;
                        }
                        function20 = function15;
                        C2314t c2314t8 = c2314t2;
                        function21 = function19;
                        ?? r211 = r24;
                        signUpSource7 = signUpSource6;
                        interfaceC28601c3 = interfaceC28601c2;
                        c17916v1 = c17916v0;
                        z25 = false;
                        AbstractC25012a.m73392y(r211, false, true, false);
                        r110 = r211;
                        c2314t3 = c2314t8;
                        f16 = 1.0f;
                    }
                    if (!m31505A(interfaceC28601c3) || viewState.getIsProgressButtonLoading()) {
                        r110.m87150e0(-1468119399);
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode6 = Long.hashCode(r110.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = r110.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(r110, modifierM3358c2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        r110.m87158i0();
                        if (r110.f115903S) {
                            r110.m87163l(c0213j3);
                        } else {
                            r110.m87178s0();
                        }
                        AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i8 = C0217k.f732j;
                        if (r110.f115903S || !AbstractC22676k.m65745e(r110.m87133R(), Integer.valueOf(iHashCode6))) {
                            AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                        }
                        AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N8);
                        AbstractC22289r.m64035b(r110, 0);
                        z26 = true;
                        r110.m87173q(true);
                        r110.m87173q(false);
                    } else {
                        r110.m87150e0(-1467834943);
                        r110.m87173q(z25);
                        z26 = true;
                    }
                    r110.m87173q(z26);
                    function11 = function20;
                    function10 = function21;
                    signUpSource2 = signUpSource7;
                    function12 = function17;
                    function9 = function18;
                    r14 = r110;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f17, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m4, false);
                signUpSource5 = signUpSource4;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N9);
                if (viewState.getCurrentDestination() != currentNavHostDestination) {
                    c28655q2.m87150e0(325021968);
                    AbstractC22289r.m64035b(c28655q2, 0);
                    c28655q2.m87173q(false);
                    c2314t2 = c2314t;
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    interfaceC25312u3 = interfaceC25312u;
                    function17 = function17;
                    f13 = 1.0f;
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(325243401);
                    C25307p c25307pM43816c4 = AbstractC15561b.m43816c();
                    if ((i19 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i19 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z310 = z13 | z14;
                    if ((i19 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z310 | z15;
                    objM87133R12 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    C28655q c28655q5 = c28655q2;
                    interfaceC25312u3 = interfaceC25312u;
                    c0209i5 = c0209i3;
                    f13 = 1.0f;
                    c2314t2 = c2314t;
                    c0213j2 = c0213j;
                    AbstractC25303l.m74291r(interfaceC25312u3, c25307pM43816c4, null, (Function1) objM87133R12, c28655q5, C25307p.f99300b << 3, 4);
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                }
                c28655q.m87173q(true);
                int iM43833b2 = viewState.getCurrentStepIndex();
                activationFlowDestinationM43832a = viewState.getCurrentDestination();
                boolean zM87149e3 = c28655q.m87149e(iM43833b2);
                if (activationFlowDestinationM43832a == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = activationFlowDestinationM43832a.ordinal();
                }
                zM87149e = zM87149e3 | c28655q.m87149e(iOrdinal) | c28655q.m87153g(interfaceC25312u3) | c28655q.m87153g(interfaceC25312u2);
                objM87133R13 = c28655q.m87133R();
                if (zM87149e) {
                    Function1 function218 = function14;
                    objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function218);
                    function19 = function218;
                    c28655q.m87172p0(objM87133R13);
                } else {
                    Function1 function219 = function14;
                    objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function219);
                    function19 = function219;
                    c28655q.m87172p0(objM87133R13);
                }
                c11765a = (C11765a) objM87133R13;
                boolean zM31504c2 = c11765a.m31504c();
                zM87157i3 = c28655q.m87157i(c11765a);
                objM87133R14 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R14 = new C11456i(c11765a, 7);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new C11456i(c11765a, 7);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, zM31504c2, c28655q, 0, 0);
                f14 = 8;
                f15 = 2 * f14;
                float f110 = 1 * f14;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC22953f.m66727p(AbstractC1102d.m3409f(f13, c2314t2), new C22951e1(C22949e.m66712e(c28655q).f90564k, i39)), f110, f15, f110, 0.0f, 8);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(r23, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                } else {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                zM31503b = c11765a.m31503b();
                c1100b = C1100b.f4583a;
                if (zM31503b) {
                    c28655q.m87150e0(-1305714574);
                    C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierMo3400a4 = c1100b.mo3400a(c2314t2, C2299e.f9117z);
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q, 0);
                    boolean zM87157i9 = c28655q.m87157i(viewState);
                    InterfaceC25312u interfaceC25312u12 = interfaceC25312u3;
                    if ((i19 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z36 | zM87157i9;
                    objM87133R16 = c28655q.m87133R();
                    if (z37) {
                        i28 = 0;
                        objM87133R16 = new C11768d(viewState, function19, i28);
                        c28655q.m87172p0(objM87133R16);
                    } else {
                        i28 = 0;
                        objM87133R16 = new C11768d(viewState, function19, i28);
                        c28655q.m87172p0(objM87133R16);
                    }
                    C28655q c28655q6 = c28655q;
                    ?? r212 = i28;
                    c28676v1 = c28676v0;
                    interfaceC25312u4 = interfaceC25312u12;
                    AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierMo3400a4, null, (InterfaceC4339a) objM87133R16, c28655q6, C27270o.f109105k, 8);
                    ?? r116 = c28655q6;
                    r116.m87173q(r212);
                    r10 = r212;
                    r15 = r116;
                } else {
                    interfaceC25312u4 = interfaceC25312u3;
                    c28676v1 = c28676v0;
                    r10 = 0;
                    c28655q.m87150e0(-1305099100);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                c15562cM43837f = viewState.getNavigationBarState();
                if (c15562cM43837f == null) {
                    r15.m87150e0(-1305017602);
                    r15.m87173q(r10);
                    r16 = r15;
                    signUpSource6 = signUpSource5;
                    c2307m2 = c2307m4;
                } else {
                    r15.m87150e0(-1305017601);
                    if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                        c2307m2 = c2307m4;
                        modifierMo3400a = c1100b.mo3400a(c2314t2, c2307m2);
                    } else {
                        c2307m2 = c2307m4;
                        modifierMo3400a = c1100b.mo3400a(c2314t2, C2299e.f9103F);
                    }
                    Modifier modifier2 = modifierMo3400a;
                    boolean zM87153g3 = r15.m87153g(c15562cM43837f);
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z311 = zM87153g3 | z17;
                    if ((i19 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z311 | z18;
                    objM87133R15 = r15.m87133R();
                    if (z19) {
                        signUpSource6 = signUpSource5;
                        objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                        r15.m87172p0(objM87133R15);
                    } else {
                        signUpSource6 = signUpSource5;
                        objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                        r15.m87172p0(objM87133R15);
                    }
                    ?? r213 = r15;
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R15, modifier2, false, null, null, null, null, AbstractC37817c.m121344e(-1433196358, r15, new C11766b(c15562cM43837f, 0)), r213, 805306368, 508);
                    ?? r214 = r213;
                    r214.m87173q(false);
                    r16 = r214;
                }
                r16.m87173q(true);
                if (zIsEmpty) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (interfaceC25312u4 instanceof C36953c) {
                    c2307m3 = c2307m5;
                    i26 = 6;
                    r16.m87150e0(-1474238303);
                    r16.m87173q(false);
                } else {
                    c2307m3 = c2307m5;
                    i26 = 6;
                    r16.m87150e0(-1474238303);
                    r16.m87173q(false);
                }
                if (zIsEmpty) {
                    r16.m87150e0(-1474052024);
                    float f25 = ((float) 2.5d) * f14;
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3), c2307m3), f25, 0.0f, f25, 5 * f14, 2);
                    footerAlignmentM43834c = viewState.getFooterAlignment();
                    if (footerAlignmentM43834c == null) {
                        i27 = -1;
                    } else {
                        i27 = h.f38142a[footerAlignmentM43834c.ordinal()];
                    }
                    if (i27 == -1) {
                        if (i27 != 1) {
                            c2305k = C2299e.f9111N;
                        } else if (i27 != 2) {
                            c2305k = C2299e.f9112O;
                        } else if (i27 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                        iHashCode7 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = r16.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(r16, modifierM3398t7);
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m11);
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                        }
                        AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N11);
                        r16.m87150e0(-1141456598);
                        it = list.iterator();
                        r24 = r16;
                        while (it.hasNext()) {
                            interfaceC25312u5 = (InterfaceC25312u) it.next();
                            if (interfaceC25312u5 instanceof C27256h) {
                                c27256h = (C27256h) interfaceC25312u5;
                            } else {
                                c27256h = null;
                            }
                            c11770f2 = c11770f;
                            if (c27256h != null) {
                                interfaceC25312u5 = c27256hM31539a;
                            }
                            if (interfaceC25312u5 instanceof C27256h) {
                                c27256h2 = (C27256h) interfaceC25312u5;
                            } else {
                                c27256h2 = null;
                            }
                            if (c27256h2 != null) {
                                zM31540b = c27256h2.getEnabled();
                            } else {
                                zM31540b = c11770f2.m31540b();
                            }
                            if (c27256h != null) {
                                destination = c27256h.getDestination();
                            } else {
                                destination = null;
                            }
                            if (destination != null) {
                                z27 = false;
                            } else {
                                z27 = false;
                            }
                            C25307p c25307pM43816c5 = AbstractC15561b.m43816c();
                            boolean zM87155h3 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                            C2314t c2314t9 = c2314t2;
                            if ((i19 & 57344) == 16384) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean z416 = z28 | zM87155h3;
                            interfaceC2994c1 = interfaceC2994c0;
                            boolean zM87157i10 = z416 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                            if ((i19 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z417 = zM87157i10 | z29;
                            if ((i19 & 896) == 256) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            boolean z418 = z417 | z34;
                            if ((i19 & 458752) == 131072) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            zM87157i4 = z418 | z35 | r24.m87157i(c27256h);
                            Object objM87133R110 = r24.m87133R();
                            if (zM87157i4) {
                                final boolean z419 = zM31540b;
                                final boolean z4110 = z27;
                                final InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c2;
                                final Function1 function2110 = function15;
                                final Function1 function2111 = function19;
                                final InterfaceC25312u interfaceC25312u13 = interfaceC25312u4;
                                r111 = r24;
                                final SignUpSource signUpSource13 = signUpSource6;
                                final C9598e c9598e4 = destination;
                                final C27256h c27256h6 = c27256h;
                                final Function1 function2112 = function17;
                                final Function3 function2113 = function18;
                                obj = new Function1() { // from class: d80.c
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC11769e.m31530v(z419, z4110, c9598e4, function2110, interfaceC2994c1, function2112, function2111, interfaceC28601c8, function2113, interfaceC25312u13, viewState, signUpSource13, c27256h6, obj2);
                                    }
                                };
                                function22 = function2110;
                                signUpSource8 = signUpSource13;
                                interfaceC28601c4 = interfaceC28601c8;
                                function23 = function2113;
                                interfaceC25312u6 = interfaceC25312u13;
                                function24 = function2111;
                                interfaceC2994c1 = interfaceC2994c1;
                                r111.m87172p0(obj);
                            } else {
                                final boolean z4111 = zM31540b;
                                final boolean z4112 = z27;
                                final InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c2;
                                final Function1 function2114 = function15;
                                final Function1 function2115 = function19;
                                final InterfaceC25312u interfaceC25312u14 = interfaceC25312u4;
                                r111 = r24;
                                final SignUpSource signUpSource14 = signUpSource6;
                                final C9598e c9598e5 = destination;
                                final C27256h c27256h7 = c27256h;
                                final Function1 function2116 = function17;
                                final Function3 function2117 = function18;
                                obj = new Function1() { // from class: d80.c
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC11769e.m31530v(z4111, z4112, c9598e5, function2114, interfaceC2994c1, function2116, function2115, interfaceC28601c9, function2117, interfaceC25312u14, viewState, signUpSource14, c27256h7, obj2);
                                    }
                                };
                                function22 = function2114;
                                signUpSource8 = signUpSource14;
                                interfaceC28601c4 = interfaceC28601c9;
                                function23 = function2117;
                                interfaceC25312u6 = interfaceC25312u14;
                                function24 = function2115;
                                interfaceC2994c1 = interfaceC2994c1;
                                r111.m87172p0(obj);
                            }
                            ?? r215 = r111;
                            AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c5, null, (Function1) obj, r215, C25307p.f99300b << 3, 4);
                            it = it;
                            function18 = function23;
                            r24 = r215;
                            interfaceC2994c0 = interfaceC2994c1;
                            c2314t2 = c2314t9;
                            function15 = function22;
                            interfaceC28601c2 = interfaceC28601c4;
                            interfaceC25312u4 = interfaceC25312u6;
                            function19 = function24;
                            c11770f = c11770f2;
                            signUpSource6 = signUpSource8;
                            c17916v0 = c17916v0;
                            c28676v1 = c28676v1;
                            i19 = i19;
                        }
                        function20 = function15;
                        C2314t c2314t10 = c2314t2;
                        function21 = function19;
                        ?? r216 = r24;
                        signUpSource7 = signUpSource6;
                        interfaceC28601c3 = interfaceC28601c2;
                        c17916v1 = c17916v0;
                        z25 = false;
                        AbstractC25012a.m73392y(r216, false, true, false);
                        r110 = r216;
                        c2314t3 = c2314t10;
                        f16 = 1.0f;
                    }
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                    iHashCode7 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = r16.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(r16, modifierM3398t7);
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a4);
                    AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m12);
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                    }
                    AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N12);
                    r16.m87150e0(-1141456598);
                    it = list.iterator();
                    r24 = r16;
                    while (it.hasNext()) {
                        interfaceC25312u5 = (InterfaceC25312u) it.next();
                        if (interfaceC25312u5 instanceof C27256h) {
                            c27256h = (C27256h) interfaceC25312u5;
                        } else {
                            c27256h = null;
                        }
                        c11770f2 = c11770f;
                        if (c27256h != null) {
                            interfaceC25312u5 = c27256hM31539a;
                        }
                        if (interfaceC25312u5 instanceof C27256h) {
                            c27256h2 = (C27256h) interfaceC25312u5;
                        } else {
                            c27256h2 = null;
                        }
                        if (c27256h2 != null) {
                            zM31540b = c27256h2.getEnabled();
                        } else {
                            zM31540b = c11770f2.m31540b();
                        }
                        if (c27256h != null) {
                            destination = c27256h.getDestination();
                        } else {
                            destination = null;
                        }
                        if (destination != null) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        C25307p c25307pM43816c6 = AbstractC15561b.m43816c();
                        boolean zM87155h4 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                        C2314t c2314t11 = c2314t2;
                        if ((i19 & 57344) == 16384) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean z4113 = z28 | zM87155h4;
                        interfaceC2994c1 = interfaceC2994c0;
                        boolean zM87157i11 = z4113 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                        if ((i19 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z4114 = zM87157i11 | z29;
                        if ((i19 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z4115 = z4114 | z34;
                        if ((i19 & 458752) == 131072) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i4 = z4115 | z35 | r24.m87157i(c27256h);
                        Object objM87133R111 = r24.m87133R();
                        if (zM87157i4) {
                            final boolean z4116 = zM31540b;
                            final boolean z4117 = z27;
                            final InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c2;
                            final Function1 function2118 = function15;
                            final Function1 function2119 = function19;
                            final InterfaceC25312u interfaceC25312u15 = interfaceC25312u4;
                            r111 = r24;
                            final SignUpSource signUpSource15 = signUpSource6;
                            final C9598e c9598e6 = destination;
                            final C27256h c27256h8 = c27256h;
                            final Function1 function21110 = function17;
                            final Function3 function21111 = function18;
                            obj = new Function1() { // from class: d80.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AbstractC11769e.m31530v(z4116, z4117, c9598e6, function2118, interfaceC2994c1, function21110, function2119, interfaceC28601c10, function21111, interfaceC25312u15, viewState, signUpSource15, c27256h8, obj2);
                                }
                            };
                            function22 = function2118;
                            signUpSource8 = signUpSource15;
                            interfaceC28601c4 = interfaceC28601c10;
                            function23 = function21111;
                            interfaceC25312u6 = interfaceC25312u15;
                            function24 = function2119;
                            interfaceC2994c1 = interfaceC2994c1;
                            r111.m87172p0(obj);
                        } else {
                            final boolean z4118 = zM31540b;
                            final boolean z4119 = z27;
                            final InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c2;
                            final Function1 function21112 = function15;
                            final Function1 function21113 = function19;
                            final InterfaceC25312u interfaceC25312u16 = interfaceC25312u4;
                            r111 = r24;
                            final SignUpSource signUpSource16 = signUpSource6;
                            final C9598e c9598e7 = destination;
                            final C27256h c27256h9 = c27256h;
                            final Function1 function21114 = function17;
                            final Function3 function21115 = function18;
                            obj = new Function1() { // from class: d80.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AbstractC11769e.m31530v(z4118, z4119, c9598e7, function21112, interfaceC2994c1, function21114, function21113, interfaceC28601c11, function21115, interfaceC25312u16, viewState, signUpSource16, c27256h9, obj2);
                                }
                            };
                            function22 = function21112;
                            signUpSource8 = signUpSource16;
                            interfaceC28601c4 = interfaceC28601c11;
                            function23 = function21115;
                            interfaceC25312u6 = interfaceC25312u16;
                            function24 = function21113;
                            interfaceC2994c1 = interfaceC2994c1;
                            r111.m87172p0(obj);
                        }
                        ?? r217 = r111;
                        AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c6, null, (Function1) obj, r217, C25307p.f99300b << 3, 4);
                        it = it;
                        function18 = function23;
                        r24 = r217;
                        interfaceC2994c0 = interfaceC2994c1;
                        c2314t2 = c2314t11;
                        function15 = function22;
                        interfaceC28601c2 = interfaceC28601c4;
                        interfaceC25312u4 = interfaceC25312u6;
                        function19 = function24;
                        c11770f = c11770f2;
                        signUpSource6 = signUpSource8;
                        c17916v0 = c17916v0;
                        c28676v1 = c28676v1;
                        i19 = i19;
                    }
                    function20 = function15;
                    C2314t c2314t12 = c2314t2;
                    function21 = function19;
                    ?? r218 = r24;
                    signUpSource7 = signUpSource6;
                    interfaceC28601c3 = interfaceC28601c2;
                    c17916v1 = c17916v0;
                    z25 = false;
                    AbstractC25012a.m73392y(r218, false, true, false);
                    r110 = r218;
                    c2314t3 = c2314t12;
                    f16 = 1.0f;
                } else {
                    function20 = function15;
                    function21 = function19;
                    C28676v0 c28676v3 = c28676v1;
                    signUpSource7 = signUpSource6;
                    int i46 = i19;
                    interfaceC28601c3 = interfaceC28601c2;
                    function18 = function18;
                    c17916v1 = c17916v0;
                    c0209i7 = c0209i6;
                    C2314t c2314t13 = c2314t2;
                    r17 = r16;
                    InterfaceC25312u interfaceC25312u17 = interfaceC25312u4;
                    r17.m87150e0(-1469630091);
                    Modifier modifierMo3400a5 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t13), c2307m3);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, r17, i26);
                    iHashCode4 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = r17.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(r17, modifierMo3400a5);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j2);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m13);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(r17, r4, modifierM118962N13);
                    float f111 = 4 * f14;
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t13, f111, 0.0f, f111, f15, 2);
                    c2314t3 = c2314t13;
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode5 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = r17.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(r17, modifierM3398t8);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j2);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m14);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                    }
                    AbstractC28683x.m87239G(r17, r4, modifierM118962N14);
                    if (c3927kM31541c == null) {
                        ?? r117 = r17;
                        function18 = function18;
                        z25 = false;
                        f16 = 1.0f;
                        r117.m87150e0(1680162108);
                        r117.m87173q(false);
                        r18 = r117;
                    } else {
                        ?? r118 = r17;
                        function18 = function18;
                        z25 = false;
                        f16 = 1.0f;
                        r118.m87150e0(1680162108);
                        r118.m87173q(false);
                        r18 = r118;
                    }
                    AbstractC25012a.m73392y(r18, true, true, z25);
                    r110 = r18;
                }
                if (m31505A(interfaceC28601c3)) {
                    r110.m87150e0(-1468119399);
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode6 = Long.hashCode(r110.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = r110.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(r110, modifierM3358c3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r110.m87158i0();
                    if (r110.f115903S) {
                        r110.m87163l(c0213j3);
                    } else {
                        r110.m87178s0();
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i8 = C0217k.f732j;
                    if (r110.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N15);
                    AbstractC22289r.m64035b(r110, 0);
                    z26 = true;
                    r110.m87173q(true);
                    r110.m87173q(false);
                } else {
                    r110.m87150e0(-1468119399);
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode6 = Long.hashCode(r110.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = r110.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(r110, modifierM3358c4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r110.m87158i0();
                    if (r110.f115903S) {
                        r110.m87163l(c0213j3);
                    } else {
                        r110.m87178s0();
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i8 = C0217k.f732j;
                    if (r110.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N16);
                    AbstractC22289r.m64035b(r110, 0);
                    z26 = true;
                    r110.m87173q(true);
                    r110.m87173q(false);
                }
                r110.m87173q(z26);
                function11 = function20;
                function10 = function21;
                signUpSource2 = signUpSource7;
                function12 = function17;
                function9 = function18;
                r14 = r110;
            } else {
                C28655q c28655q7 = c28655q2;
                c28655q7.m87138X();
                Function1 function30 = function5;
                function9 = function8;
                function10 = function30;
                signUpSource2 = signUpSource;
                function11 = function6;
                function12 = function7;
                r14 = c28655q7;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) viewState, (Object) currentNavHostDestination, (Object) signUpSource2, function10, function11, function12, (InterfaceC23459e) function9, (Object) handleProgressButtonClick, i13, i14, 7);
            }
        }
        i15 |= 24576;
        function6 = function2;
        i16 = i14 & 32;
        if (i16 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(function7)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
        }
        if ((i13 & 1572864) == 0) {
            function8 = function4;
            if ((i14 & 64) == 0) {
                i34 = 524288;
            } else {
                i34 = 524288;
            }
            i15 |= i34;
        } else {
            function8 = function4;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87157i(handleProgressButtonClick)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i15 |= i29;
        }
        if ((i15 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i35 != 0) {
                    signUpSource3 = SignUpSource.IAJF_V2;
                } else {
                    signUpSource3 = signUpSource;
                }
                if (i36 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(10);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i37 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(11);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C11473h(12);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                }
                if ((i14 & 64) != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new a(null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function8 = (Function3) objM87133R;
                    i15 &= -3670017;
                }
                SignUpSource signUpSource17 = signUpSource3;
                i19 = i15;
                function13 = function8;
                signUpSource4 = signUpSource17;
                function14 = function5;
                function15 = function6;
                function16 = function7;
            } else {
                if (i35 != 0) {
                    signUpSource3 = SignUpSource.IAJF_V2;
                } else {
                    signUpSource3 = signUpSource;
                }
                if (i36 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C11473h(10);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i37 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(11);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C11473h(12);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                }
                if ((i14 & 64) != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new a(null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function8 = (Function3) objM87133R;
                    i15 &= -3670017;
                }
                SignUpSource signUpSource18 = signUpSource3;
                i19 = i15;
                function13 = function8;
                signUpSource4 = signUpSource18;
                function14 = function5;
                function15 = function6;
                function16 = function7;
            }
            c28655q2.m87175r();
            interfaceC25312u = viewState.m43839h().get(AbstractC12889b.m36284n(viewState.getCurrentStepIndex(), 0, viewState.m43839h().size() - 1));
            interfaceC25312u2 = (InterfaceC25312u) AbstractC25265s.m74102I0(viewState.getCurrentStepIndex() - 1, viewState.m43839h());
            listM43835d = viewState.m43835d();
            if (listM43835d == null) {
                listM43835d = C25271y.f99162w;
            }
            list = listM43835d;
            zIsEmpty = list.isEmpty();
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C11770f(viewState.getProgressButtonState());
                c28655q2.m87172p0(objM87133R5);
            }
            c11770f = (C11770f) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R7);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R7;
            C3927k c3927kM43838g2 = viewState.getProgressButtonState();
            zM87157i = c28655q2.m87157i(viewState);
            function17 = function16;
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R8 = new b(c11770f, viewState, null);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new b(c11770f, viewState, null);
                c28655q2.m87172p0(objM87133R8);
            }
            int i310 = C3927k.f16020r;
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, c3927kM43838g2);
            Integer numValueOf3 = Integer.valueOf(viewState.getCurrentStepIndex());
            objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new c(c11770f, null);
                c28655q2.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, numValueOf3);
            Boolean boolValueOf2 = Boolean.valueOf(viewState.getIsProgressButtonLoading());
            Integer numValueOf4 = Integer.valueOf(viewState.getCurrentStepIndex());
            zM87157i2 = c28655q2.m87157i(viewState);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R10 = new d(viewState, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new d(viewState, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87254h(boolValueOf2, numValueOf4, (InterfaceC4351m) objM87133R10, c28655q2);
            c3927kM31541c = c11770f.m31541c();
            interfaceC28601c2 = interfaceC28601c1;
            if (viewState.getShouldReserveBottomSpace()) {
                size = 6 * 8 * list.size();
            } else {
                size = 8 * 4;
            }
            float f112 = size;
            WeakHashMap weakHashMap2 = C22944c2.f90553v;
            C23009w1 c23009w2 = C22949e.m66712e(c28655q2).f90564k;
            int i311 = AbstractC22960g2.f90608b | AbstractC22960g2.f90609c | 16;
            C22951e1 c22951e2 = new C22951e1(c23009w2, i311);
            c2314t = C2314t.f9131w;
            modifierM66727p = AbstractC22953f.m66727p(c2314t, c22951e2);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            ?? r119 = C38072d.f163053a;
            i24 = C38072d.f163054b;
            long jM125410o2 = r119.m121949b(c28655q2, i24).getBackgroundDarkStd();
            function18 = function13;
            C17916v0 c17916v3 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM3407d2, jM125410o2, c17916v3);
            boolean zM31508D2 = m31508D(interfaceC25312u);
            zM87153g = c28655q2.m87153g(modifierM66727p);
            c17916v0 = c17916v3;
            objM87133R11 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R11 = new C4780c(modifierM66727p, 18);
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C4780c(modifierM66727p, 18);
                c28655q2.m87172p0(objM87133R11);
            }
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC15676d.m44099b(modifierM3358c5, zM31508D2, (Function1) objM87133R11));
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM66720i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            interfaceC2994c0 = interfaceC2994c3;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d11);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m17);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                i25 = i24;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
                Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f112, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m4, false);
                signUpSource5 = signUpSource4;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3398t9);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N18);
                if (viewState.getCurrentDestination() != currentNavHostDestination) {
                    c28655q2.m87150e0(325021968);
                    AbstractC22289r.m64035b(c28655q2, 0);
                    c28655q2.m87173q(false);
                    c2314t2 = c2314t;
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    interfaceC25312u3 = interfaceC25312u;
                    function17 = function17;
                    f13 = 1.0f;
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(325243401);
                    C25307p c25307pM43816c7 = AbstractC15561b.m43816c();
                    if ((i19 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i19 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z312 = z13 | z14;
                    if ((i19 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z312 | z15;
                    objM87133R12 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    C28655q c28655q8 = c28655q2;
                    interfaceC25312u3 = interfaceC25312u;
                    c0209i5 = c0209i3;
                    f13 = 1.0f;
                    c2314t2 = c2314t;
                    c0213j2 = c0213j;
                    AbstractC25303l.m74291r(interfaceC25312u3, c25307pM43816c7, null, (Function1) objM87133R12, c28655q8, C25307p.f99300b << 3, 4);
                    c28655q8.m87173q(false);
                    c28655q = c28655q8;
                }
                c28655q.m87173q(true);
                int iM43833b3 = viewState.getCurrentStepIndex();
                activationFlowDestinationM43832a = viewState.getCurrentDestination();
                boolean zM87149e4 = c28655q.m87149e(iM43833b3);
                if (activationFlowDestinationM43832a == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = activationFlowDestinationM43832a.ordinal();
                }
                zM87149e = zM87149e4 | c28655q.m87149e(iOrdinal) | c28655q.m87153g(interfaceC25312u3) | c28655q.m87153g(interfaceC25312u2);
                objM87133R13 = c28655q.m87133R();
                if (zM87149e) {
                    Function1 function2120 = function14;
                    objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function2120);
                    function19 = function2120;
                    c28655q.m87172p0(objM87133R13);
                } else {
                    Function1 function2121 = function14;
                    objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function2121);
                    function19 = function2121;
                    c28655q.m87172p0(objM87133R13);
                }
                c11765a = (C11765a) objM87133R13;
                boolean zM31504c3 = c11765a.m31504c();
                zM87157i3 = c28655q.m87157i(c11765a);
                objM87133R14 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R14 = new C11456i(c11765a, 7);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new C11456i(c11765a, 7);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, zM31504c3, c28655q, 0, 0);
                f14 = 8;
                f15 = 2 * f14;
                float f113 = 1 * f14;
                Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC22953f.m66727p(AbstractC1102d.m3409f(f13, c2314t2), new C22951e1(C22949e.m66712e(c28655q).f90564k, i311)), f113, f15, f113, 0.0f, 8);
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(r23, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3398t10);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d13);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
                if (c28655q.f115903S) {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                } else {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
                zM31503b = c11765a.m31503b();
                c1100b = C1100b.f4583a;
                if (zM31503b) {
                    c28655q.m87150e0(-1305714574);
                    C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierMo3400a6 = c1100b.mo3400a(c2314t2, C2299e.f9117z);
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q, 0);
                    boolean zM87157i12 = c28655q.m87157i(viewState);
                    InterfaceC25312u interfaceC25312u18 = interfaceC25312u3;
                    if ((i19 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z36 | zM87157i12;
                    objM87133R16 = c28655q.m87133R();
                    if (z37) {
                        i28 = 0;
                        objM87133R16 = new C11768d(viewState, function19, i28);
                        c28655q.m87172p0(objM87133R16);
                    } else {
                        i28 = 0;
                        objM87133R16 = new C11768d(viewState, function19, i28);
                        c28655q.m87172p0(objM87133R16);
                    }
                    C28655q c28655q9 = c28655q;
                    ?? r219 = i28;
                    c28676v1 = c28676v0;
                    interfaceC25312u4 = interfaceC25312u18;
                    AbstractC27242b1.m82092d(c27270o3, strM21273g3, modifierMo3400a6, null, (InterfaceC4339a) objM87133R16, c28655q9, C27270o.f109105k, 8);
                    ?? r1110 = c28655q9;
                    r1110.m87173q(r219);
                    r10 = r219;
                    r15 = r1110;
                } else {
                    interfaceC25312u4 = interfaceC25312u3;
                    c28676v1 = c28676v0;
                    r10 = 0;
                    c28655q.m87150e0(-1305099100);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                c15562cM43837f = viewState.getNavigationBarState();
                if (c15562cM43837f == null) {
                    r15.m87150e0(-1305017602);
                    r15.m87173q(r10);
                    r16 = r15;
                    signUpSource6 = signUpSource5;
                    c2307m2 = c2307m4;
                } else {
                    r15.m87150e0(-1305017601);
                    if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                        c2307m2 = c2307m4;
                        modifierMo3400a = c1100b.mo3400a(c2314t2, c2307m2);
                    } else {
                        c2307m2 = c2307m4;
                        modifierMo3400a = c1100b.mo3400a(c2314t2, C2299e.f9103F);
                    }
                    Modifier modifier3 = modifierMo3400a;
                    boolean zM87153g4 = r15.m87153g(c15562cM43837f);
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z313 = zM87153g4 | z17;
                    if ((i19 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z313 | z18;
                    objM87133R15 = r15.m87133R();
                    if (z19) {
                        signUpSource6 = signUpSource5;
                        objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                        r15.m87172p0(objM87133R15);
                    } else {
                        signUpSource6 = signUpSource5;
                        objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                        r15.m87172p0(objM87133R15);
                    }
                    ?? r2110 = r15;
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R15, modifier3, false, null, null, null, null, AbstractC37817c.m121344e(-1433196358, r15, new C11766b(c15562cM43837f, 0)), r2110, 805306368, 508);
                    ?? r2111 = r2110;
                    r2111.m87173q(false);
                    r16 = r2111;
                }
                r16.m87173q(true);
                if (zIsEmpty) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (interfaceC25312u4 instanceof C36953c) {
                    c2307m3 = c2307m5;
                    i26 = 6;
                    r16.m87150e0(-1474238303);
                    r16.m87173q(false);
                } else {
                    c2307m3 = c2307m5;
                    i26 = 6;
                    r16.m87150e0(-1474238303);
                    r16.m87173q(false);
                }
                if (zIsEmpty) {
                    r16.m87150e0(-1474052024);
                    float f26 = ((float) 2.5d) * f14;
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3), c2307m3), f26, 0.0f, f26, 5 * f14, 2);
                    footerAlignmentM43834c = viewState.getFooterAlignment();
                    if (footerAlignmentM43834c == null) {
                        i27 = -1;
                    } else {
                        i27 = h.f38142a[footerAlignmentM43834c.ordinal()];
                    }
                    if (i27 == -1) {
                        if (i27 != 1) {
                            c2305k = C2299e.f9111N;
                        } else if (i27 != 2) {
                            c2305k = C2299e.f9112O;
                        } else if (i27 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                        iHashCode7 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = r16.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(r16, modifierM3398t11);
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a5);
                        AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m110);
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                        }
                        AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N110);
                        r16.m87150e0(-1141456598);
                        it = list.iterator();
                        r24 = r16;
                        while (it.hasNext()) {
                            interfaceC25312u5 = (InterfaceC25312u) it.next();
                            if (interfaceC25312u5 instanceof C27256h) {
                                c27256h = (C27256h) interfaceC25312u5;
                            } else {
                                c27256h = null;
                            }
                            c11770f2 = c11770f;
                            if (c27256h != null) {
                                interfaceC25312u5 = c27256hM31539a;
                            }
                            if (interfaceC25312u5 instanceof C27256h) {
                                c27256h2 = (C27256h) interfaceC25312u5;
                            } else {
                                c27256h2 = null;
                            }
                            if (c27256h2 != null) {
                                zM31540b = c27256h2.getEnabled();
                            } else {
                                zM31540b = c11770f2.m31540b();
                            }
                            if (c27256h != null) {
                                destination = c27256h.getDestination();
                            } else {
                                destination = null;
                            }
                            if (destination != null) {
                                z27 = false;
                            } else {
                                z27 = false;
                            }
                            C25307p c25307pM43816c8 = AbstractC15561b.m43816c();
                            boolean zM87155h5 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                            C2314t c2314t14 = c2314t2;
                            if ((i19 & 57344) == 16384) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean z41110 = z28 | zM87155h5;
                            interfaceC2994c1 = interfaceC2994c0;
                            boolean zM87157i13 = z41110 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                            if ((i19 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z41111 = zM87157i13 | z29;
                            if ((i19 & 896) == 256) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            boolean z41112 = z41111 | z34;
                            if ((i19 & 458752) == 131072) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            zM87157i4 = z41112 | z35 | r24.m87157i(c27256h);
                            Object objM87133R112 = r24.m87133R();
                            if (zM87157i4) {
                                final boolean z41113 = zM31540b;
                                final boolean z41114 = z27;
                                final InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c2;
                                final Function1 function21116 = function15;
                                final Function1 function21117 = function19;
                                final InterfaceC25312u interfaceC25312u19 = interfaceC25312u4;
                                r111 = r24;
                                final SignUpSource signUpSource19 = signUpSource6;
                                final C9598e c9598e8 = destination;
                                final C27256h c27256h10 = c27256h;
                                final Function1 function21118 = function17;
                                final Function3 function21119 = function18;
                                obj = new Function1() { // from class: d80.c
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC11769e.m31530v(z41113, z41114, c9598e8, function21116, interfaceC2994c1, function21118, function21117, interfaceC28601c12, function21119, interfaceC25312u19, viewState, signUpSource19, c27256h10, obj2);
                                    }
                                };
                                function22 = function21116;
                                signUpSource8 = signUpSource19;
                                interfaceC28601c4 = interfaceC28601c12;
                                function23 = function21119;
                                interfaceC25312u6 = interfaceC25312u19;
                                function24 = function21117;
                                interfaceC2994c1 = interfaceC2994c1;
                                r111.m87172p0(obj);
                            } else {
                                final boolean z41115 = zM31540b;
                                final boolean z41116 = z27;
                                final InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c2;
                                final Function1 function211110 = function15;
                                final Function1 function211111 = function19;
                                final InterfaceC25312u interfaceC25312u110 = interfaceC25312u4;
                                r111 = r24;
                                final SignUpSource signUpSource110 = signUpSource6;
                                final C9598e c9598e9 = destination;
                                final C27256h c27256h11 = c27256h;
                                final Function1 function211112 = function17;
                                final Function3 function211113 = function18;
                                obj = new Function1() { // from class: d80.c
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AbstractC11769e.m31530v(z41115, z41116, c9598e9, function211110, interfaceC2994c1, function211112, function211111, interfaceC28601c13, function211113, interfaceC25312u110, viewState, signUpSource110, c27256h11, obj2);
                                    }
                                };
                                function22 = function211110;
                                signUpSource8 = signUpSource110;
                                interfaceC28601c4 = interfaceC28601c13;
                                function23 = function211113;
                                interfaceC25312u6 = interfaceC25312u110;
                                function24 = function211111;
                                interfaceC2994c1 = interfaceC2994c1;
                                r111.m87172p0(obj);
                            }
                            ?? r2112 = r111;
                            AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c8, null, (Function1) obj, r2112, C25307p.f99300b << 3, 4);
                            it = it;
                            function18 = function23;
                            r24 = r2112;
                            interfaceC2994c0 = interfaceC2994c1;
                            c2314t2 = c2314t14;
                            function15 = function22;
                            interfaceC28601c2 = interfaceC28601c4;
                            interfaceC25312u4 = interfaceC25312u6;
                            function19 = function24;
                            c11770f = c11770f2;
                            signUpSource6 = signUpSource8;
                            c17916v0 = c17916v0;
                            c28676v1 = c28676v1;
                            i19 = i19;
                        }
                        function20 = function15;
                        C2314t c2314t15 = c2314t2;
                        function21 = function19;
                        ?? r2113 = r24;
                        signUpSource7 = signUpSource6;
                        interfaceC28601c3 = interfaceC28601c2;
                        c17916v1 = c17916v0;
                        z25 = false;
                        AbstractC25012a.m73392y(r2113, false, true, false);
                        r110 = r2113;
                        c2314t3 = c2314t15;
                        f16 = 1.0f;
                    }
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                    iHashCode7 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = r16.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(r16, modifierM3398t11);
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a6);
                    AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m111);
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                    }
                    AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N111);
                    r16.m87150e0(-1141456598);
                    it = list.iterator();
                    r24 = r16;
                    while (it.hasNext()) {
                        interfaceC25312u5 = (InterfaceC25312u) it.next();
                        if (interfaceC25312u5 instanceof C27256h) {
                            c27256h = (C27256h) interfaceC25312u5;
                        } else {
                            c27256h = null;
                        }
                        c11770f2 = c11770f;
                        if (c27256h != null) {
                            interfaceC25312u5 = c27256hM31539a;
                        }
                        if (interfaceC25312u5 instanceof C27256h) {
                            c27256h2 = (C27256h) interfaceC25312u5;
                        } else {
                            c27256h2 = null;
                        }
                        if (c27256h2 != null) {
                            zM31540b = c27256h2.getEnabled();
                        } else {
                            zM31540b = c11770f2.m31540b();
                        }
                        if (c27256h != null) {
                            destination = c27256h.getDestination();
                        } else {
                            destination = null;
                        }
                        if (destination != null) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        C25307p c25307pM43816c9 = AbstractC15561b.m43816c();
                        boolean zM87155h6 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                        C2314t c2314t16 = c2314t2;
                        if ((i19 & 57344) == 16384) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean z41117 = z28 | zM87155h6;
                        interfaceC2994c1 = interfaceC2994c0;
                        boolean zM87157i14 = z41117 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                        if ((i19 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z41118 = zM87157i14 | z29;
                        if ((i19 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z41119 = z41118 | z34;
                        if ((i19 & 458752) == 131072) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i4 = z41119 | z35 | r24.m87157i(c27256h);
                        Object objM87133R113 = r24.m87133R();
                        if (zM87157i4) {
                            final boolean z411110 = zM31540b;
                            final boolean z411111 = z27;
                            final InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c2;
                            final Function1 function211114 = function15;
                            final Function1 function211115 = function19;
                            final InterfaceC25312u interfaceC25312u111 = interfaceC25312u4;
                            r111 = r24;
                            final SignUpSource signUpSource111 = signUpSource6;
                            final C9598e c9598e10 = destination;
                            final C27256h c27256h12 = c27256h;
                            final Function1 function211116 = function17;
                            final Function3 function211117 = function18;
                            obj = new Function1() { // from class: d80.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AbstractC11769e.m31530v(z411110, z411111, c9598e10, function211114, interfaceC2994c1, function211116, function211115, interfaceC28601c14, function211117, interfaceC25312u111, viewState, signUpSource111, c27256h12, obj2);
                                }
                            };
                            function22 = function211114;
                            signUpSource8 = signUpSource111;
                            interfaceC28601c4 = interfaceC28601c14;
                            function23 = function211117;
                            interfaceC25312u6 = interfaceC25312u111;
                            function24 = function211115;
                            interfaceC2994c1 = interfaceC2994c1;
                            r111.m87172p0(obj);
                        } else {
                            final boolean z411112 = zM31540b;
                            final boolean z411113 = z27;
                            final InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c2;
                            final Function1 function211118 = function15;
                            final Function1 function211119 = function19;
                            final InterfaceC25312u interfaceC25312u112 = interfaceC25312u4;
                            r111 = r24;
                            final SignUpSource signUpSource112 = signUpSource6;
                            final C9598e c9598e11 = destination;
                            final C27256h c27256h13 = c27256h;
                            final Function1 function2111110 = function17;
                            final Function3 function2111111 = function18;
                            obj = new Function1() { // from class: d80.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AbstractC11769e.m31530v(z411112, z411113, c9598e11, function211118, interfaceC2994c1, function2111110, function211119, interfaceC28601c15, function2111111, interfaceC25312u112, viewState, signUpSource112, c27256h13, obj2);
                                }
                            };
                            function22 = function211118;
                            signUpSource8 = signUpSource112;
                            interfaceC28601c4 = interfaceC28601c15;
                            function23 = function2111111;
                            interfaceC25312u6 = interfaceC25312u112;
                            function24 = function211119;
                            interfaceC2994c1 = interfaceC2994c1;
                            r111.m87172p0(obj);
                        }
                        ?? r2114 = r111;
                        AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c9, null, (Function1) obj, r2114, C25307p.f99300b << 3, 4);
                        it = it;
                        function18 = function23;
                        r24 = r2114;
                        interfaceC2994c0 = interfaceC2994c1;
                        c2314t2 = c2314t16;
                        function15 = function22;
                        interfaceC28601c2 = interfaceC28601c4;
                        interfaceC25312u4 = interfaceC25312u6;
                        function19 = function24;
                        c11770f = c11770f2;
                        signUpSource6 = signUpSource8;
                        c17916v0 = c17916v0;
                        c28676v1 = c28676v1;
                        i19 = i19;
                    }
                    function20 = function15;
                    C2314t c2314t17 = c2314t2;
                    function21 = function19;
                    ?? r2115 = r24;
                    signUpSource7 = signUpSource6;
                    interfaceC28601c3 = interfaceC28601c2;
                    c17916v1 = c17916v0;
                    z25 = false;
                    AbstractC25012a.m73392y(r2115, false, true, false);
                    r110 = r2115;
                    c2314t3 = c2314t17;
                    f16 = 1.0f;
                } else {
                    function20 = function15;
                    function21 = function19;
                    C28676v0 c28676v4 = c28676v1;
                    signUpSource7 = signUpSource6;
                    int i47 = i19;
                    interfaceC28601c3 = interfaceC28601c2;
                    function18 = function18;
                    c17916v1 = c17916v0;
                    c0209i7 = c0209i6;
                    C2314t c2314t18 = c2314t2;
                    r17 = r16;
                    InterfaceC25312u interfaceC25312u113 = interfaceC25312u4;
                    r17.m87150e0(-1469630091);
                    Modifier modifierMo3400a7 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t18), c2307m3);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, r17, i26);
                    iHashCode4 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = r17.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(r17, modifierMo3400a7);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j2);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m112);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(r17, r4, modifierM118962N112);
                    float f114 = 4 * f14;
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t18, f114, 0.0f, f114, f15, 2);
                    c2314t3 = c2314t18;
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode5 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = r17.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(r17, modifierM3398t12);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j2);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m113);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                    }
                    AbstractC28683x.m87239G(r17, r4, modifierM118962N113);
                    if (c3927kM31541c == null) {
                        ?? r1111 = r17;
                        function18 = function18;
                        z25 = false;
                        f16 = 1.0f;
                        r1111.m87150e0(1680162108);
                        r1111.m87173q(false);
                        r18 = r1111;
                    } else {
                        ?? r1112 = r17;
                        function18 = function18;
                        z25 = false;
                        f16 = 1.0f;
                        r1112.m87150e0(1680162108);
                        r1112.m87173q(false);
                        r18 = r1112;
                    }
                    AbstractC25012a.m73392y(r18, true, true, z25);
                    r110 = r18;
                }
                if (m31505A(interfaceC28601c3)) {
                    r110.m87150e0(-1468119399);
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                    InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode6 = Long.hashCode(r110.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = r110.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(r110, modifierM3358c6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r110.m87158i0();
                    if (r110.f115903S) {
                        r110.m87163l(c0213j3);
                    } else {
                        r110.m87178s0();
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d15);
                    AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m114);
                    c0209i8 = C0217k.f732j;
                    if (r110.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N114);
                    AbstractC22289r.m64035b(r110, 0);
                    z26 = true;
                    r110.m87173q(true);
                    r110.m87173q(false);
                } else {
                    r110.m87150e0(-1468119399);
                    Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                    InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode6 = Long.hashCode(r110.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = r110.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(r110, modifierM3358c7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r110.m87158i0();
                    if (r110.f115903S) {
                        r110.m87163l(c0213j3);
                    } else {
                        r110.m87178s0();
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d16);
                    AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m115);
                    c0209i8 = C0217k.f732j;
                    if (r110.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                    }
                    AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N115);
                    AbstractC22289r.m64035b(r110, 0);
                    z26 = true;
                    r110.m87173q(true);
                    r110.m87173q(false);
                }
                r110.m87173q(z26);
                function11 = function20;
                function10 = function21;
                signUpSource2 = signUpSource7;
                function12 = function17;
                function9 = function18;
                r14 = r110;
            } else {
                i25 = i24;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N17);
            Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f112, 7);
            InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m4, false);
            signUpSource5 = signUpSource4;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM3398t13);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d17);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m116);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N116);
            if (viewState.getCurrentDestination() != currentNavHostDestination) {
                c28655q2.m87150e0(325021968);
                AbstractC22289r.m64035b(c28655q2, 0);
                c28655q2.m87173q(false);
                c2314t2 = c2314t;
                c0209i5 = c0209i3;
                c0213j2 = c0213j;
                interfaceC25312u3 = interfaceC25312u;
                function17 = function17;
                f13 = 1.0f;
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(325243401);
                C25307p c25307pM43816c10 = AbstractC15561b.m43816c();
                if ((i19 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i19 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z314 = z13 | z14;
                if ((i19 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z314 | z15;
                objM87133R12 = c28655q2.m87133R();
                if (z16) {
                    objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C1042s(function14, (Object) function15, (Object) function17, (Object) c11770f, 15);
                    c28655q2.m87172p0(objM87133R12);
                }
                C28655q c28655q10 = c28655q2;
                interfaceC25312u3 = interfaceC25312u;
                c0209i5 = c0209i3;
                f13 = 1.0f;
                c2314t2 = c2314t;
                c0213j2 = c0213j;
                AbstractC25303l.m74291r(interfaceC25312u3, c25307pM43816c10, null, (Function1) objM87133R12, c28655q10, C25307p.f99300b << 3, 4);
                c28655q10.m87173q(false);
                c28655q = c28655q10;
            }
            c28655q.m87173q(true);
            int iM43833b4 = viewState.getCurrentStepIndex();
            activationFlowDestinationM43832a = viewState.getCurrentDestination();
            boolean zM87149e5 = c28655q.m87149e(iM43833b4);
            if (activationFlowDestinationM43832a == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = activationFlowDestinationM43832a.ordinal();
            }
            zM87149e = zM87149e5 | c28655q.m87149e(iOrdinal) | c28655q.m87153g(interfaceC25312u3) | c28655q.m87153g(interfaceC25312u2);
            objM87133R13 = c28655q.m87133R();
            if (zM87149e) {
                Function1 function2122 = function14;
                objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function2122);
                function19 = function2122;
                c28655q.m87172p0(objM87133R13);
            } else {
                Function1 function2123 = function14;
                objM87133R13 = new C11765a(viewState.getCurrentStepIndex(), viewState.getCurrentDestination(), interfaceC25312u3, interfaceC25312u2, function2123);
                function19 = function2123;
                c28655q.m87172p0(objM87133R13);
            }
            c11765a = (C11765a) objM87133R13;
            boolean zM31504c4 = c11765a.m31504c();
            zM87157i3 = c28655q.m87157i(c11765a);
            objM87133R14 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R14 = new C11456i(c11765a, 7);
                c28655q.m87172p0(objM87133R14);
            } else {
                objM87133R14 = new C11456i(c11765a, 7);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, zM31504c4, c28655q, 0, 0);
            f14 = 8;
            f15 = 2 * f14;
            float f115 = 1 * f14;
            Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC22953f.m66727p(AbstractC1102d.m3409f(f13, c2314t2), new C22951e1(C22949e.m66712e(c28655q).f90564k, i311)), f115, f15, f115, 0.0f, 8);
            InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(r23, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM3398t14);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d18);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m117);
            if (c28655q.f115903S) {
                c0209i6 = c0209i5;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            } else {
                c0209i6 = c0209i5;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N117);
            zM31503b = c11765a.m31503b();
            c1100b = C1100b.f4583a;
            if (zM31503b) {
                c28655q.m87150e0(-1305714574);
                C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierMo3400a8 = c1100b.mo3400a(c2314t2, C2299e.f9117z);
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC16277f.f62229E, c28655q, 0);
                boolean zM87157i15 = c28655q.m87157i(viewState);
                InterfaceC25312u interfaceC25312u114 = interfaceC25312u3;
                if ((i19 & 7168) == 2048) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z36 | zM87157i15;
                objM87133R16 = c28655q.m87133R();
                if (z37) {
                    i28 = 0;
                    objM87133R16 = new C11768d(viewState, function19, i28);
                    c28655q.m87172p0(objM87133R16);
                } else {
                    i28 = 0;
                    objM87133R16 = new C11768d(viewState, function19, i28);
                    c28655q.m87172p0(objM87133R16);
                }
                C28655q c28655q11 = c28655q;
                ?? r2116 = i28;
                c28676v1 = c28676v0;
                interfaceC25312u4 = interfaceC25312u114;
                AbstractC27242b1.m82092d(c27270o4, strM21273g4, modifierMo3400a8, null, (InterfaceC4339a) objM87133R16, c28655q11, C27270o.f109105k, 8);
                ?? r1113 = c28655q11;
                r1113.m87173q(r2116);
                r10 = r2116;
                r15 = r1113;
            } else {
                interfaceC25312u4 = interfaceC25312u3;
                c28676v1 = c28676v0;
                r10 = 0;
                c28655q.m87150e0(-1305099100);
                c28655q.m87173q(false);
                r15 = c28655q;
            }
            c15562cM43837f = viewState.getNavigationBarState();
            if (c15562cM43837f == null) {
                r15.m87150e0(-1305017602);
                r15.m87173q(r10);
                r16 = r15;
                signUpSource6 = signUpSource5;
                c2307m2 = c2307m4;
            } else {
                r15.m87150e0(-1305017601);
                if (c15562cM43837f.getNavBarType() == EnumC15570k.TITLE) {
                    c2307m2 = c2307m4;
                    modifierMo3400a = c1100b.mo3400a(c2314t2, c2307m2);
                } else {
                    c2307m2 = c2307m4;
                    modifierMo3400a = c1100b.mo3400a(c2314t2, C2299e.f9103F);
                }
                Modifier modifier4 = modifierMo3400a;
                boolean zM87153g5 = r15.m87153g(c15562cM43837f);
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z315 = zM87153g5 | z17;
                if ((i19 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z315 | z18;
                objM87133R15 = r15.m87133R();
                if (z19) {
                    signUpSource6 = signUpSource5;
                    objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                    r15.m87172p0(objM87133R15);
                } else {
                    signUpSource6 = signUpSource5;
                    objM87133R15 = new C11558r(c15562cM43837f, function19, signUpSource6, 2);
                    r15.m87172p0(objM87133R15);
                }
                ?? r2117 = r15;
                AbstractC12350b.m34583d((InterfaceC4339a) objM87133R15, modifier4, false, null, null, null, null, AbstractC37817c.m121344e(-1433196358, r15, new C11766b(c15562cM43837f, 0)), r2117, 805306368, 508);
                ?? r2118 = r2117;
                r2118.m87173q(false);
                r16 = r2118;
            }
            r16.m87173q(true);
            if (zIsEmpty) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (interfaceC25312u4 instanceof C36953c) {
                c2307m3 = c2307m5;
                i26 = 6;
                r16.m87150e0(-1474238303);
                r16.m87173q(false);
            } else {
                c2307m3 = c2307m5;
                i26 = 6;
                r16.m87150e0(-1474238303);
                r16.m87173q(false);
            }
            if (zIsEmpty) {
                r16.m87150e0(-1474052024);
                float f27 = ((float) 2.5d) * f14;
                Modifier modifierM3398t15 = AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3), c2307m3), f27, 0.0f, f27, 5 * f14, 2);
                footerAlignmentM43834c = viewState.getFooterAlignment();
                if (footerAlignmentM43834c == null) {
                    i27 = -1;
                } else {
                    i27 = h.f38142a[footerAlignmentM43834c.ordinal()];
                }
                if (i27 == -1) {
                    if (i27 != 1) {
                        c2305k = C2299e.f9111N;
                    } else if (i27 != 2) {
                        c2305k = C2299e.f9112O;
                    } else if (i27 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                    iHashCode7 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = r16.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(r16, modifierM3398t15);
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a7);
                    AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m118);
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                    }
                    AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N118);
                    r16.m87150e0(-1141456598);
                    it = list.iterator();
                    r24 = r16;
                    while (it.hasNext()) {
                        interfaceC25312u5 = (InterfaceC25312u) it.next();
                        if (interfaceC25312u5 instanceof C27256h) {
                            c27256h = (C27256h) interfaceC25312u5;
                        } else {
                            c27256h = null;
                        }
                        c11770f2 = c11770f;
                        if (c27256h != null) {
                            interfaceC25312u5 = c27256hM31539a;
                        }
                        if (interfaceC25312u5 instanceof C27256h) {
                            c27256h2 = (C27256h) interfaceC25312u5;
                        } else {
                            c27256h2 = null;
                        }
                        if (c27256h2 != null) {
                            zM31540b = c27256h2.getEnabled();
                        } else {
                            zM31540b = c11770f2.m31540b();
                        }
                        if (c27256h != null) {
                            destination = c27256h.getDestination();
                        } else {
                            destination = null;
                        }
                        if (destination != null) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        C25307p c25307pM43816c11 = AbstractC15561b.m43816c();
                        boolean zM87155h7 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                        C2314t c2314t19 = c2314t2;
                        if ((i19 & 57344) == 16384) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean z411114 = z28 | zM87155h7;
                        interfaceC2994c1 = interfaceC2994c0;
                        boolean zM87157i16 = z411114 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                        if ((i19 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z411115 = zM87157i16 | z29;
                        if ((i19 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z411116 = z411115 | z34;
                        if ((i19 & 458752) == 131072) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i4 = z411116 | z35 | r24.m87157i(c27256h);
                        Object objM87133R114 = r24.m87133R();
                        if (zM87157i4) {
                            final boolean z411117 = zM31540b;
                            final boolean z411118 = z27;
                            final InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c2;
                            final Function1 function2111112 = function15;
                            final Function1 function2111113 = function19;
                            final InterfaceC25312u interfaceC25312u115 = interfaceC25312u4;
                            r111 = r24;
                            final SignUpSource signUpSource113 = signUpSource6;
                            final C9598e c9598e12 = destination;
                            final C27256h c27256h14 = c27256h;
                            final Function1 function2111114 = function17;
                            final Function3 function2111115 = function18;
                            obj = new Function1() { // from class: d80.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AbstractC11769e.m31530v(z411117, z411118, c9598e12, function2111112, interfaceC2994c1, function2111114, function2111113, interfaceC28601c16, function2111115, interfaceC25312u115, viewState, signUpSource113, c27256h14, obj2);
                                }
                            };
                            function22 = function2111112;
                            signUpSource8 = signUpSource113;
                            interfaceC28601c4 = interfaceC28601c16;
                            function23 = function2111115;
                            interfaceC25312u6 = interfaceC25312u115;
                            function24 = function2111113;
                            interfaceC2994c1 = interfaceC2994c1;
                            r111.m87172p0(obj);
                        } else {
                            final boolean z411119 = zM31540b;
                            final boolean z4111110 = z27;
                            final InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c2;
                            final Function1 function2111116 = function15;
                            final Function1 function2111117 = function19;
                            final InterfaceC25312u interfaceC25312u116 = interfaceC25312u4;
                            r111 = r24;
                            final SignUpSource signUpSource114 = signUpSource6;
                            final C9598e c9598e13 = destination;
                            final C27256h c27256h15 = c27256h;
                            final Function1 function2111118 = function17;
                            final Function3 function2111119 = function18;
                            obj = new Function1() { // from class: d80.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AbstractC11769e.m31530v(z411119, z4111110, c9598e13, function2111116, interfaceC2994c1, function2111118, function2111117, interfaceC28601c17, function2111119, interfaceC25312u116, viewState, signUpSource114, c27256h15, obj2);
                                }
                            };
                            function22 = function2111116;
                            signUpSource8 = signUpSource114;
                            interfaceC28601c4 = interfaceC28601c17;
                            function23 = function2111119;
                            interfaceC25312u6 = interfaceC25312u116;
                            function24 = function2111117;
                            interfaceC2994c1 = interfaceC2994c1;
                            r111.m87172p0(obj);
                        }
                        ?? r2119 = r111;
                        AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c11, null, (Function1) obj, r2119, C25307p.f99300b << 3, 4);
                        it = it;
                        function18 = function23;
                        r24 = r2119;
                        interfaceC2994c0 = interfaceC2994c1;
                        c2314t2 = c2314t19;
                        function15 = function22;
                        interfaceC28601c2 = interfaceC28601c4;
                        interfaceC25312u4 = interfaceC25312u6;
                        function19 = function24;
                        c11770f = c11770f2;
                        signUpSource6 = signUpSource8;
                        c17916v0 = c17916v0;
                        c28676v1 = c28676v1;
                        i19 = i19;
                    }
                    function20 = function15;
                    C2314t c2314t110 = c2314t2;
                    function21 = function19;
                    ?? r21110 = r24;
                    signUpSource7 = signUpSource6;
                    interfaceC28601c3 = interfaceC28601c2;
                    c17916v1 = c17916v0;
                    z25 = false;
                    AbstractC25012a.m73392y(r21110, false, true, false);
                    r110 = r21110;
                    c2314t3 = c2314t110;
                    f16 = 1.0f;
                }
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, r16, i26);
                iHashCode7 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = r16.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(r16, modifierM3398t15);
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m119);
                if (r16.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, r16, iHashCode7, c0209i6);
                }
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N119);
                r16.m87150e0(-1141456598);
                it = list.iterator();
                r24 = r16;
                while (it.hasNext()) {
                    interfaceC25312u5 = (InterfaceC25312u) it.next();
                    if (interfaceC25312u5 instanceof C27256h) {
                        c27256h = (C27256h) interfaceC25312u5;
                    } else {
                        c27256h = null;
                    }
                    c11770f2 = c11770f;
                    if (c27256h != null) {
                        interfaceC25312u5 = c27256hM31539a;
                    }
                    if (interfaceC25312u5 instanceof C27256h) {
                        c27256h2 = (C27256h) interfaceC25312u5;
                    } else {
                        c27256h2 = null;
                    }
                    if (c27256h2 != null) {
                        zM31540b = c27256h2.getEnabled();
                    } else {
                        zM31540b = c11770f2.m31540b();
                    }
                    if (c27256h != null) {
                        destination = c27256h.getDestination();
                    } else {
                        destination = null;
                    }
                    if (destination != null) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    C25307p c25307pM43816c12 = AbstractC15561b.m43816c();
                    boolean zM87155h8 = r24.m87155h(zM31540b) | r24.m87155h(z27) | r24.m87157i(destination);
                    C2314t c2314t111 = c2314t2;
                    if ((i19 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z4111111 = z28 | zM87155h8;
                    interfaceC2994c1 = interfaceC2994c0;
                    boolean zM87157i17 = z4111111 | r24.m87157i(interfaceC2994c1) | r24.m87157i(function18) | r24.m87157i(interfaceC25312u4) | r24.m87157i(viewState);
                    if ((i19 & 7168) == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z4111112 = zM87157i17 | z29;
                    if ((i19 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z4111113 = z4111112 | z34;
                    if ((i19 & 458752) == 131072) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i4 = z4111113 | z35 | r24.m87157i(c27256h);
                    Object objM87133R115 = r24.m87133R();
                    if (zM87157i4) {
                        final boolean z4111114 = zM31540b;
                        final boolean z4111115 = z27;
                        final InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c2;
                        final Function1 function21111110 = function15;
                        final Function1 function21111111 = function19;
                        final InterfaceC25312u interfaceC25312u117 = interfaceC25312u4;
                        r111 = r24;
                        final SignUpSource signUpSource115 = signUpSource6;
                        final C9598e c9598e14 = destination;
                        final C27256h c27256h16 = c27256h;
                        final Function1 function21111112 = function17;
                        final Function3 function21111113 = function18;
                        obj = new Function1() { // from class: d80.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AbstractC11769e.m31530v(z4111114, z4111115, c9598e14, function21111110, interfaceC2994c1, function21111112, function21111111, interfaceC28601c18, function21111113, interfaceC25312u117, viewState, signUpSource115, c27256h16, obj2);
                            }
                        };
                        function22 = function21111110;
                        signUpSource8 = signUpSource115;
                        interfaceC28601c4 = interfaceC28601c18;
                        function23 = function21111113;
                        interfaceC25312u6 = interfaceC25312u117;
                        function24 = function21111111;
                        interfaceC2994c1 = interfaceC2994c1;
                        r111.m87172p0(obj);
                    } else {
                        final boolean z4111116 = zM31540b;
                        final boolean z4111117 = z27;
                        final InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c2;
                        final Function1 function21111114 = function15;
                        final Function1 function21111115 = function19;
                        final InterfaceC25312u interfaceC25312u118 = interfaceC25312u4;
                        r111 = r24;
                        final SignUpSource signUpSource116 = signUpSource6;
                        final C9598e c9598e15 = destination;
                        final C27256h c27256h17 = c27256h;
                        final Function1 function21111116 = function17;
                        final Function3 function21111117 = function18;
                        obj = new Function1() { // from class: d80.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AbstractC11769e.m31530v(z4111116, z4111117, c9598e15, function21111114, interfaceC2994c1, function21111116, function21111115, interfaceC28601c19, function21111117, interfaceC25312u118, viewState, signUpSource116, c27256h17, obj2);
                            }
                        };
                        function22 = function21111114;
                        signUpSource8 = signUpSource116;
                        interfaceC28601c4 = interfaceC28601c19;
                        function23 = function21111117;
                        interfaceC25312u6 = interfaceC25312u118;
                        function24 = function21111115;
                        interfaceC2994c1 = interfaceC2994c1;
                        r111.m87172p0(obj);
                    }
                    ?? r21111 = r111;
                    AbstractC25303l.m74291r(interfaceC25312u5, c25307pM43816c12, null, (Function1) obj, r21111, C25307p.f99300b << 3, 4);
                    it = it;
                    function18 = function23;
                    r24 = r21111;
                    interfaceC2994c0 = interfaceC2994c1;
                    c2314t2 = c2314t111;
                    function15 = function22;
                    interfaceC28601c2 = interfaceC28601c4;
                    interfaceC25312u4 = interfaceC25312u6;
                    function19 = function24;
                    c11770f = c11770f2;
                    signUpSource6 = signUpSource8;
                    c17916v0 = c17916v0;
                    c28676v1 = c28676v1;
                    i19 = i19;
                }
                function20 = function15;
                C2314t c2314t112 = c2314t2;
                function21 = function19;
                ?? r21112 = r24;
                signUpSource7 = signUpSource6;
                interfaceC28601c3 = interfaceC28601c2;
                c17916v1 = c17916v0;
                z25 = false;
                AbstractC25012a.m73392y(r21112, false, true, false);
                r110 = r21112;
                c2314t3 = c2314t112;
                f16 = 1.0f;
            } else {
                function20 = function15;
                function21 = function19;
                C28676v0 c28676v5 = c28676v1;
                signUpSource7 = signUpSource6;
                int i48 = i19;
                interfaceC28601c3 = interfaceC28601c2;
                function18 = function18;
                c17916v1 = c17916v0;
                c0209i7 = c0209i6;
                C2314t c2314t113 = c2314t2;
                r17 = r16;
                InterfaceC25312u interfaceC25312u119 = interfaceC25312u4;
                r17.m87150e0(-1469630091);
                Modifier modifierMo3400a9 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t113), c2307m3);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, r17, i26);
                iHashCode4 = Long.hashCode(r17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = r17.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(r17, modifierMo3400a9);
                r17.m87158i0();
                if (r17.f115903S) {
                    r17.m87163l(c0213j2);
                } else {
                    r17.m87178s0();
                }
                AbstractC28683x.m87239G(r17, c0209i, c22994r1M66759a4);
                AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m1110);
                if (r17.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(r17, r4, modifierM118962N1110);
                float f116 = 4 * f14;
                Modifier modifierM3398t16 = AbstractC1099a.m3398t(c2314t113, f116, 0.0f, f116, f15, 2);
                c2314t3 = c2314t113;
                InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode5 = Long.hashCode(r17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = r17.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(r17, modifierM3398t16);
                r17.m87158i0();
                if (r17.f115903S) {
                    r17.m87163l(c0213j2);
                } else {
                    r17.m87178s0();
                }
                AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d19);
                AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m1111);
                if (r17.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, r17, iHashCode5, c0209i7);
                }
                AbstractC28683x.m87239G(r17, r4, modifierM118962N1111);
                if (c3927kM31541c == null) {
                    ?? r1114 = r17;
                    function18 = function18;
                    z25 = false;
                    f16 = 1.0f;
                    r1114.m87150e0(1680162108);
                    r1114.m87173q(false);
                    r18 = r1114;
                } else {
                    ?? r1115 = r17;
                    function18 = function18;
                    z25 = false;
                    f16 = 1.0f;
                    r1115.m87150e0(1680162108);
                    r1115.m87173q(false);
                    r18 = r1115;
                }
                AbstractC25012a.m73392y(r18, true, true, z25);
                r110 = r18;
            }
            if (m31505A(interfaceC28601c3)) {
                r110.m87150e0(-1468119399);
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode6 = Long.hashCode(r110.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = r110.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(r110, modifierM3358c8);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                r110.m87158i0();
                if (r110.f115903S) {
                    r110.m87163l(c0213j3);
                } else {
                    r110.m87178s0();
                }
                AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d110);
                AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m1112);
                c0209i8 = C0217k.f732j;
                if (r110.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                }
                AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N1112);
                AbstractC22289r.m64035b(r110, 0);
                z26 = true;
                r110.m87173q(true);
                r110.m87173q(false);
            } else {
                r110.m87150e0(-1468119399);
                Modifier modifierM3358c9 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(f16, c2314t3), C17919x.m51541c(0.9f, C38072d.f163053a.m121949b(r110, C38072d.f163054b).getBackgroundDarkStd()), c17916v1);
                InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode6 = Long.hashCode(r110.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1113 = r110.m87165m();
                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(r110, modifierM3358c9);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                r110.m87158i0();
                if (r110.f115903S) {
                    r110.m87163l(c0213j3);
                } else {
                    r110.m87178s0();
                }
                AbstractC28683x.m87239G(r110, C0217k.f729g, interfaceC39127r0M66763d111);
                AbstractC28683x.m87239G(r110, C0217k.f728f, interfaceC28653p1M87165m1113);
                c0209i8 = C0217k.f732j;
                if (r110.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, r110, iHashCode6, c0209i8);
                }
                AbstractC28683x.m87239G(r110, C0217k.f726d, modifierM118962N1113);
                AbstractC22289r.m64035b(r110, 0);
                z26 = true;
                r110.m87173q(true);
                r110.m87173q(false);
            }
            r110.m87173q(z26);
            function11 = function20;
            function10 = function21;
            signUpSource2 = signUpSource7;
            function12 = function17;
            function9 = function18;
            r14 = r110;
        } else {
            C28655q c28655q12 = c28655q2;
            c28655q12.m87138X();
            Function1 function31 = function5;
            function9 = function8;
            function10 = function31;
            signUpSource2 = signUpSource;
            function11 = function6;
            function12 = function7;
            r14 = c28655q12;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b((Object) viewState, (Object) currentNavHostDestination, (Object) signUpSource2, function10, function11, function12, (InterfaceC23459e) function9, (Object) handleProgressButtonClick, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m31522n(InterfaceC21414b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m31523o(AbstractC23438o it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Modifier m31524p(Modifier modifier, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m31525q(Function1 function1, Function1 function2, Function1 function3, C11770f c11770f, Object event) {
        AbstractC22676k.m65750j(event, "event");
        EnumC3921e enumC3921e = event instanceof EnumC3921e ? (EnumC3921e) event : null;
        if (enumC3921e != null) {
            c11770f.m31542d(enumC3921e);
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
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m31526r(C11765a c11765a) {
        c11765a.m31502a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m31527s(C15566g c15566g, Function1 function1) {
        ActivationFlowDestination activationFlowDestinationM43832a = c15566g.getCurrentDestination();
        if (activationFlowDestinationM43832a != null) {
            function1.invoke(new InterfaceC21413a.m0(activationFlowDestinationM43832a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m31528t(C15562c c15562c, Function1 function1, SignUpSource signUpSource) {
        if (c15562c.getNavBarType() == EnumC15570k.SKIP) {
            function1.invoke(new InterfaceC21413a.c0(true, null, signUpSource, 2, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m31529u(C15562c c15562c, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        C2886a c2886aM8430k;
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String text = c15562c.getText();
            if (c15562c.getNavBarType() == EnumC15570k.TITLE) {
                c28655q.m87150e0(-82644488);
                c2886aM8430k = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-82559145);
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
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m31530v(boolean z4, boolean z13, C9598e c9598e, Function1 function1, InterfaceC2994c0 interfaceC2994c0, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, Function3 function4, InterfaceC25312u interfaceC25312u, C15566g c15566g, SignUpSource signUpSource, C27256h c27256h, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC21413a.c0) {
            if (z4) {
                if (!z13 || c9598e == null) {
                    m31506B(interfaceC28601c1, true);
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(function4, interfaceC25312u, c15566g, function3, event, signUpSource, null), 3);
                } else {
                    function1.invoke(new AbstractC23438o.a(c9598e));
                }
            }
        } else if (event instanceof AbstractC23438o) {
            function1.invoke(event);
        } else if (event instanceof InterfaceC17002b) {
            function2.invoke(event);
        } else if (!(event instanceof EnumC3921e)) {
            if (event instanceof InterfaceC21414b) {
                function3.invoke(event);
            } else if ((event instanceof C27256h) || !(event instanceof C9598e)) {
                m31531w(z4, function2, c27256h, signUpSource, z13, c9598e, function1, interfaceC2994c0, interfaceC28601c1, function4, interfaceC25312u, c15566g, function3);
            } else if (z4) {
                function1.invoke(new AbstractC23438o.a((C9598e) event));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m31531w(boolean z4, Function1 function1, C27256h c27256h, SignUpSource signUpSource, boolean z13, C9598e c9598e, Function1 function2, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, Function1 function4) {
        String str;
        if (z4) {
            if (c27256h != null && (id = c27256h.getCardName()) != null) {
                str = id;
            } else if (c27256h != null) {
                String id4 = c27256h.getId();
                str = id4;
            } else {
                str = null;
            }
            function1.invoke(new InterfaceC17002b.i("in_app_join_flow_footer", null, "footer_cta", str, signUpSource.toString(), null, 34, null));
            if (z13 && c9598e != null) {
                function2.invoke(new AbstractC23438o.a(c9598e));
            } else {
                m31506B(interfaceC28601c1, true);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(function3, interfaceC25312u, c15566g, function4, signUpSource, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m31532x(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, Function3 function3, InterfaceC25312u interfaceC25312u, C15566g c15566g, InterfaceC4354p interfaceC4354p, C3927k c3927k, Function1 function1, Function1 function2, SignUpSource signUpSource, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        m31506B(interfaceC28601c1, true);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(function3, interfaceC25312u, c15566g, interfaceC4354p, c3927k, function1, function2, signUpSource, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m31533y(C15566g c15566g, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource, Function1 function1, Function1 function2, Function1 function3, Function3 function4, InterfaceC4354p interfaceC4354p, int i13, int i14, Composer composer, int i15) {
        m31521m(c15566g, activationFlowDestination, signUpSource, function1, function2, function3, function4, interfaceC4354p, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m31534z(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
