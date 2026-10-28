package sc2;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dj.ChoreographerFrameCallbackC12060e;
import ge3.AbstractC15751g;
import gl.C15946k;
import gl.C15953r;
import hi0.AbstractC17311i;
import hj0.AbstractC17354m;
import ii0.AbstractC18567w;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import or2.InterfaceC28203t1;
import p031b9.RunnableC2833g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sc2.y */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J!\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010\u0017R\u001a\u0010(\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R+\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u0010?R(\u0010I\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010\u0003\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010Q\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010\u0003\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010Y\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bX\u0010\u0003\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010]\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010\u0013\u0012\u0004\b\\\u0010\u0003\u001a\u0004\bZ\u0010?\"\u0004\b[\u0010\u0017R\u0014\u0010_\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010?¨\u0006a"}, m65681d2 = {"Lsc2/y;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "S", "Z", "", "shouldDisable", "L", "(Z)V", "W", "", "animation", "Lsc2/g;", "strapAnimationState", "X", "(ILsc2/g;)V", "d0", "e0", "strapDisconnected", "i0", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lii0/w;", "<set-?>", "x", "Lcom/whoop/ui/b;", "N", "()Lii0/w;", "f0", "(Lii0/w;)V", "binding", "Lsc2/s;", "y", "Ll83/h;", "R", "()Lsc2/s;", "viewModel", "Lor2/t1;", "z", "Q", "()Lor2/t1;", "systemSettingsChecker", "E", "V", "()Z", "isTest", "Lcom/airbnb/lottie/LottieAnimationView;", "F", "Lcom/airbnb/lottie/LottieAnimationView;", "P", "()Lcom/airbnb/lottie/LottieAnimationView;", "h0", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "getStrapAnimationView$annotations", "strapAnimationView", "G", "Lsc2/g;", "getCurrentStrapAnimationState", "()Lsc2/g;", "setCurrentStrapAnimationState", "(Lsc2/g;)V", "getCurrentStrapAnimationState$annotations", "currentStrapAnimationState", "H", "I", "getCurrentAnimation", "()I", "setCurrentAnimation", "(I)V", "getCurrentAnimation$annotations", "currentAnimation", "O", "g0", "getPlayAfterComplete$annotations", "playAfterComplete", "M", "animatorsDisabledInDeveloperOptions", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32386y extends AbstractC17354m {

    /* JADX INFO: renamed from: J */
    static final /* synthetic */ InterfaceC21493z[] f134104J = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C32386y.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentStrapStatusBinding;", 0))};

    /* JADX INFO: renamed from: K */
    public static final int f134105K = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h isTest;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public LottieAnimationView strapAnimationView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private EnumC32368g currentStrapAnimationState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int currentAnimation;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean playAfterComplete;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "StrapStatusFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h systemSettingsChecker;

    /* JADX INFO: renamed from: sc2.y$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, m65681d2 = {"Lsc2/y$a;", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(Lsc2/y;)V", "Landroid/animation/Animator;", "p0", "Ll83/a0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationRepeat", "onAnimationEnd", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator p13) {
            AbstractC22676k.m65750j(p13, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = C32386y.this.m100959P().f20245E.f124770x;
            choreographerFrameCallbackC12060e.f40000z = -choreographerFrameCallbackC12060e.f40000z;
            C32386y.this.m100959P().f20245E.f124770x.removeAllListeners();
            if (C32386y.this.getPlayAfterComplete()) {
                C32386y.this.m100959P().m15514d();
                C32386y.this.m100960g0(false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator p13) {
            AbstractC22676k.m65750j(p13, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator p13) {
            AbstractC22676k.m65750j(p13, "p0");
        }
    }

    /* JADX INFO: renamed from: sc2.y$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134116a;

        static {
            int[] iArr = new int[EnumC32368g.values().length];
            try {
                iArr[EnumC32368g.CHARGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32368g.NOT_CHARGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32368g.SHOW_SLIDING_IN_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32368g.SHOW_SLIDING_OUT_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f134116a = iArr;
        }
    }

    /* JADX INFO: renamed from: sc2.y$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f134117w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f134117w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f134117w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f134117w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: sc2.y$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f134118w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f134119x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f134120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f134118w = componentCallbacks;
            this.f134119x = interfaceC35951a;
            this.f134120y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.t1] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC28203t1 invoke() {
            ComponentCallbacks componentCallbacks = this.f134118w;
            InterfaceC35951a interfaceC35951a = this.f134119x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f134120y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC28203t1.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: sc2.y$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f134121w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f134122x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f134123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f134121w = componentCallbacks;
            this.f134122x = interfaceC35951a;
            this.f134123y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            ComponentCallbacks componentCallbacks = this.f134121w;
            InterfaceC35951a interfaceC35951a = this.f134122x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f134123y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Boolean.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: sc2.y$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f134124w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f134124w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f134124w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f134124w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: sc2.y$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f134125w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f134126x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f134127y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f134128z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f134125w = abstractComponentCallbacksC1320m0;
            this.f134126x = interfaceC35951a;
            this.f134127y = interfaceC4339a;
            this.f134128z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, sc2.s] */
        @Override // c93.InterfaceC4339a
        public final C32380s invoke() {
            return AbstractC37056f.m118952D(this.f134125w, this.f134126x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32380s.class), this.f134127y, this.f134128z);
        }
    }

    public C32386y() {
        C32372k c32372k = new C32372k(this, 7);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new g(this, null, new f(this), c32372k));
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.systemSettingsChecker = AbstractC30060g.m92087G(enumC23463i, new d(this, null, null));
        this.isTest = AbstractC30060g.m92087G(enumC23463i, new e(this, new C35953c("testFlag"), null));
        this.currentStrapAnimationState = EnumC32368g.NOT_CHARGING;
        this.currentAnimation = -1;
    }

    /* JADX INFO: renamed from: L */
    private final void m100937L(boolean shouldDisable) {
        m100941R().m100901i0(shouldDisable);
        m100939N().f72543o.setEnabled(!shouldDisable);
    }

    /* JADX INFO: renamed from: M */
    private final boolean m100938M() {
        return m100940Q().getFloat("animator_duration_scale", 1.0f) == 0.0f;
    }

    /* JADX INFO: renamed from: N */
    private final AbstractC18567w m100939N() {
        return (AbstractC18567w) this.binding.getValue(this, f134104J[0]);
    }

    /* JADX INFO: renamed from: Q */
    private final InterfaceC28203t1 m100940Q() {
        return (InterfaceC28203t1) this.systemSettingsChecker.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final C32380s m100941R() {
        return (C32380s) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final void m100942S() {
        ConstraintLayout pairWhoopStrapLayout = m100939N().f72535g;
        AbstractC22676k.m65749i(pairWhoopStrapLayout, "pairWhoopStrapLayout");
        AbstractC1953c.m5963a(pairWhoopStrapLayout, new C32384w(this, 3));
        m100939N().f72543o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sc2.x
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                C32386y.m100944U(this.f134103a, compoundButton, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m100943T(C32386y c32386y, View it) {
        AbstractC22676k.m65750j(it, "it");
        c32386y.m100941R().m100899g1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m100944U(C32386y c32386y, CompoundButton compoundButton, boolean z4) {
        AbstractC22676k.m65750j(compoundButton, "<unused var>");
        c32386y.m100941R().m100898f1(z4);
    }

    /* JADX INFO: renamed from: V */
    private final boolean m100945V() {
        return ((Boolean) this.isTest.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: W */
    private final void m100946W() {
        C4964f c4964fM15548l = ComponentCallbacks2C4960b.m15529e(requireContext()).m15548l(Integer.valueOf(AbstractC17311i.f66908e));
        c4964fM15548l.getClass();
        ((C4964f) c4964fM15548l.m89322n(C15946k.f60354b, new C15953r(), true)).m15537y(m100939N().f72540l);
    }

    /* JADX INFO: renamed from: X */
    private final void m100947X(int animation, EnumC32368g strapAnimationState) {
        if (this.currentAnimation != animation || m100959P().getComposition() == null) {
            AbstractActivityC1340r0 activity = getActivity();
            if (activity != null) {
                activity.runOnUiThread(new RunnableC2833g0(this, animation, 7));
            }
            this.currentAnimation = animation;
        }
        int i13 = b.f134116a[strapAnimationState.ordinal()];
        if (i13 == 1) {
            m100959P().setFrame(25);
            this.currentStrapAnimationState = EnumC32368g.CHARGING;
            return;
        }
        if (i13 == 2) {
            m100959P().setFrame(0);
            this.currentStrapAnimationState = EnumC32368g.NOT_CHARGING;
        } else if (i13 == 3) {
            m100953d0();
            this.currentStrapAnimationState = EnumC32368g.CHARGING;
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m100954e0();
            this.currentStrapAnimationState = EnumC32368g.NOT_CHARGING;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m100948Y(C32386y c32386y, int i13) {
        if (c32386y.m100945V()) {
            return;
        }
        c32386y.m100959P().setAnimation(i13);
        LottieAnimationView lottieAnimationViewM100959P = c32386y.m100959P();
        lottieAnimationViewM100959P.f20249I = false;
        lottieAnimationViewM100959P.f20245E.m92885l();
    }

    /* JADX INFO: renamed from: Z */
    private final void m100949Z() {
        observe(m100941R().getViewStateLiveData(), new c(new C32384w(this, 0)));
        observe(m100941R().getMembershipStatus(), new c(new C32384w(this, 1)));
        observe(m100941R().m100908v0(), new c(new C32384w(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m100950a0(C32386y c32386y, C32383v it) {
        AbstractC22676k.m65750j(it, "it");
        ImageView strapSettingsHrBroadcastAnimation = c32386y.m100939N().f72540l;
        AbstractC22676k.m65749i(strapSettingsHrBroadcastAnimation, "strapSettingsHrBroadcastAnimation");
        strapSettingsHrBroadcastAnimation.setVisibility(it.getHrBroadcastEnabled() ? 0 : 8);
        ImageView strapSettingsHrBroadcastStaticImage = c32386y.m100939N().f72541m;
        AbstractC22676k.m65749i(strapSettingsHrBroadcastStaticImage, "strapSettingsHrBroadcastStaticImage");
        strapSettingsHrBroadcastStaticImage.setVisibility(it.getHrBroadcastEnabled() ? 8 : 0);
        c32386y.m100939N().f72543o.m3293d(c32386y.requireContext(), it.getSwitchTextAppearance());
        c32386y.m100939N().f72538j.m27463j(it.getBatteryIndicatorViewState());
        c32386y.m100956i0(it.getStrapDisconnected());
        if (c32386y.m100939N().f72543o.isChecked() != it.getHrBroadcastEnabled()) {
            c32386y.m100939N().f72543o.setChecked(it.getHrBroadcastEnabled());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m100951b0(C32386y c32386y, MembershipStatus membershipStatus) {
        if (membershipStatus != null) {
            c32386y.m100937L(membershipStatus.getNeedsSubscription());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m100952c0(C32386y c32386y, C32367f it) {
        AbstractC22676k.m65750j(it, "it");
        c32386y.m100947X(it.getAnimation(), it.getState());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private final void m100953d0() {
        if (this.currentStrapAnimationState == EnumC32368g.NOT_CHARGING) {
            if (m100959P().f20245E.m92884k()) {
                this.playAfterComplete = true;
            } else if (!m100945V()) {
                m100959P().m15514d();
            }
        }
        this.currentStrapAnimationState = EnumC32368g.CHARGING;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m100954e0() {
        if (this.currentStrapAnimationState == EnumC32368g.CHARGING) {
            ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = m100959P().f20245E.f124770x;
            choreographerFrameCallbackC12060e.f40000z = -choreographerFrameCallbackC12060e.f40000z;
            if (!m100945V()) {
                m100959P().m15514d();
            }
            if (m100938M()) {
                ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e2 = m100959P().f20245E.f124770x;
                choreographerFrameCallbackC12060e2.f40000z = -choreographerFrameCallbackC12060e2.f40000z;
            } else {
                LottieAnimationView lottieAnimationViewM100959P = m100959P();
                lottieAnimationViewM100959P.f20245E.f124770x.addListener(new a());
            }
        }
        this.currentStrapAnimationState = EnumC32368g.NOT_CHARGING;
    }

    /* JADX INFO: renamed from: f0 */
    private final void m100955f0(AbstractC18567w abstractC18567w) {
        this.binding.setValue(this, f134104J[0], abstractC18567w);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m100956i0(boolean strapDisconnected) {
        if (strapDisconnected) {
            m100939N().f72533e.setVisibility(8);
            m100939N().f72530b.setVisibility(0);
            m100939N().f72538j.setVisibility(8);
            m100939N().f72531c.setVisibility(0);
            m100939N().f72537i.setVisibility(8);
            return;
        }
        m100939N().f72533e.setVisibility(0);
        m100939N().f72530b.setVisibility(8);
        m100939N().f72538j.setVisibility(0);
        m100939N().f72531c.setVisibility(8);
        m100939N().f72537i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C34911a m100957j0(C32386y c32386y) {
        return AbstractC15751g.m44431K(c32386y.requireContext());
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getPlayAfterComplete() {
        return this.playAfterComplete;
    }

    /* JADX INFO: renamed from: P */
    public final LottieAnimationView m100959P() {
        LottieAnimationView lottieAnimationView = this.strapAnimationView;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        AbstractC22676k.m65757q("strapAnimationView");
        throw null;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m100960g0(boolean z4) {
        this.playAfterComplete = z4;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m100961h0(LottieAnimationView lottieAnimationView) {
        AbstractC22676k.m65750j(lottieAnimationView, "<set-?>");
        this.strapAnimationView = lottieAnimationView;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18567w abstractC18567wM53780c = AbstractC18567w.m53780c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC18567wM53780c, "inflate(...)");
        m100955f0(abstractC18567wM53780c);
        LottieAnimationView strapSettingsAnimation = m100939N().f72537i;
        AbstractC22676k.m65749i(strapSettingsAnimation, "strapSettingsAnimation");
        m100961h0(strapSettingsAnimation);
        m100946W();
        View root = m100939N().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStop() {
        super.onStop();
        m100941R().m100902j1();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireActivity();
        m100942S();
        m100949Z();
    }
}
