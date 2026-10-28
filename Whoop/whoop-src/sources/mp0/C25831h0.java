package mp0;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.coaching.sleepcoach.wizard.C6245g;
import com.whoop.coaching.sleepcoach.wizard.C6246h;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.TextResource;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d91.AbstractC11814b;
import ec3.InterfaceC13037f2;
import ge3.AbstractC15751g;
import gf2.C15802k;
import hj0.AbstractC17354m;
import hy0.AbstractC17746g1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ip0.C20807d;
import ip0.EnumC20804a;
import j93.InterfaceC21493z;
import jf3.C21647a;
import jo.ViewOnClickListenerC21821j;
import kk1.C22541b;
import kp0.AbstractC22734a;
import kp0.AbstractC22748o;
import kp0.C22736c;
import kp0.C22737d;
import kp0.C22739f;
import kp0.C22745l;
import kp0.C22746m;
import kp0.C22747n;
import kp0.C22750q;
import kp0.C22751r;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import op0.C28087e;
import op0.EnumC28083a;
import or2.C28205u0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
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
import qe2.AbstractC30314g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mp0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u00020 8\u0014X\u0094D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R+\u0010C\u001a\u00020;2\u0006\u0010<\u001a\u00020;8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010F\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010c\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u00104¨\u0006h²\u0006\f\u0010g\u001a\u00020f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lmp0/h0;", "Lhj0/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkp0/o;", "sleepPercent", "", "S", "(Lkp0/o;)Ljava/lang/CharSequence;", "n0", "Lmp0/j0;", "viewState", "m0", "(Lmp0/j0;)V", "f0", "Lkp0/a;", "alarmType", "", "isSleepScheduleEnabled", "k0", "(Lkp0/a;Z)V", "sleepGoalText", "e0", "(Ljava/lang/CharSequence;)V", "j0", "(Lkp0/o;)V", "Lcom/whoop/design/util/TextResource;", "vow", "l0", "(Lcom/whoop/design/util/TextResource;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkp0/o;", "currentSleepGoalSetting", "", "x", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "y", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/k;", "<set-?>", "z", "Lcom/whoop/ui/b;", "O", "()Lgf2/k;", "d0", "(Lgf2/k;)V", "binding", "Lmp0/i0;", "E", "Ll83/h;", "V", "()Lmp0/i0;", "viewModel", "Lcom/whoop/coaching/sleepcoach/wizard/h;", "F", "U", "()Lcom/whoop/coaching/sleepcoach/wizard/h;", "tonightsSleepContainerViewModel", "Lop0/e;", "G", "R", "()Lop0/e;", "sleepCoachToolTipViewModel", "Lor2/u0;", "H", "Q", "()Lor2/u0;", "localizedDateTimeFormatter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "I", "P", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lip0/d;", "J", "Lip0/d;", "inAppSupportButtonTooltip", "T", "timeFormat", "K", "a", "Lmp0/q;", "state", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25831h0 extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h tonightsSleepContainerViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachToolTipViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private C20807d inAppSupportButtonTooltip;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private AbstractC22748o currentSleepGoalSetting;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: L */
    static final /* synthetic */ InterfaceC21493z[] f101675L = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25831h0.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepCoachVowContainerBinding;", 0))};

    /* JADX INFO: renamed from: M */
    public static final int f101676M = 8;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String logTag = "SleepCoachVowContainerFragment";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: mp0.h0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101687a;

        static {
            int[] iArr = new int[EnumC28083a.values().length];
            try {
                iArr[EnumC28083a.SLEEP_GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101687a = iArr;
        }
    }

    /* JADX INFO: renamed from: mp0.h0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f101688w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f101688w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f101688w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101688w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101689w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101690x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101691y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101689w = componentCallbacks;
            this.f101690x = interfaceC35951a;
            this.f101691y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f101689w;
            InterfaceC35951a interfaceC35951a = this.f101690x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101691y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101692w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101693x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101694y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101692w = componentCallbacks;
            this.f101693x = interfaceC35951a;
            this.f101694y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f101692w;
            InterfaceC35951a interfaceC35951a = this.f101693x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101694y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101695w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101695w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101695w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101695w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101696w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101697x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101698y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101696w = abstractComponentCallbacksC1320m0;
            this.f101697x = interfaceC35951a;
            this.f101698y = interfaceC4339a;
            this.f101699z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.coaching.sleepcoach.wizard.h] */
        @Override // c93.InterfaceC4339a
        public final C6246h invoke() {
            return AbstractC37056f.m118952D(this.f101696w, this.f101697x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C6246h.class), this.f101698y, this.f101699z);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101700w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101700w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101700w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101700w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101701w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101702x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101703y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101704z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101701w = abstractComponentCallbacksC1320m0;
            this.f101702x = interfaceC35951a;
            this.f101703y = interfaceC4339a;
            this.f101704z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, op0.e] */
        @Override // c93.InterfaceC4339a
        public final C28087e invoke() {
            return AbstractC37056f.m118952D(this.f101701w, this.f101702x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28087e.class), this.f101703y, this.f101704z);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101705w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f101705w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f101705w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: mp0.h0$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101706w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101707x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101708y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101709z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101706w = componentCallbacks;
            this.f101707x = interfaceC35951a;
            this.f101708y = interfaceC4339a;
            this.f101709z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.i0] */
        @Override // c93.InterfaceC4339a
        public final C25833i0 invoke() {
            return AbstractC34132o.m107857B(this.f101706w, this.f101707x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25833i0.class), this.f101708y, this.f101709z);
        }
    }

    public C25831h0() {
        j jVar = new j(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new k(this, null, jVar, null));
        this.tonightsSleepContainerViewModel = AbstractC30060g.m92087G(enumC23463i, new g(this, null, new f(this), null));
        this.sleepCoachToolTipViewModel = AbstractC30060g.m92087G(enumC23463i, new i(this, null, new h(this), null));
        C24117a c24117a = new C24117a(this, 13);
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i2, new d(this, null, c24117a));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i2, new e(this, null, null));
    }

    /* JADX INFO: renamed from: O */
    private final C15802k m76202O() {
        return (C15802k) this.binding.getValue(this, f101675L[0]);
    }

    /* JADX INFO: renamed from: P */
    private final FeatureFlagChecker m76203P() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final C28205u0 m76204Q() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final C28087e m76205R() {
        return (C28087e) this.sleepCoachToolTipViewModel.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final String m76206T() {
        return m76204Q().m85383l() ? "TWENTY_FOUR_HOUR" : "TWELVE_HOUR";
    }

    /* JADX INFO: renamed from: U */
    private final C6246h m76207U() {
        return (C6246h) this.tonightsSleepContainerViewModel.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final C25833i0 m76208V() {
        return (C25833i0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C34911a m76209W(C25831h0 c25831h0) {
        return AbstractC15751g.m44431K(c25831h0.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m76210X(C25831h0 c25831h0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC13037f2 interfaceC13037f2M76268I = c25831h0.m76208V().getSleepScheduleTagStateFlow();
            C25848q c25848q = new C25848q(null, null, null, 7, null);
            int i14 = TextResource.$stable;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(interfaceC13037f2M76268I, c25848q, null, c28655q, i14 << 3, 2);
            AbstractC17746g1.m50874j(m76211Y(interfaceC28601c1M87260n).getTagLabel(), m76211Y(interfaceC28601c1M87260n).getBackGroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), null, m76211Y(interfaceC28601c1M87260n).getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, i14, 0, 0, 8388596);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final C25848q m76211Y(InterfaceC28670t2 interfaceC28670t2) {
        return (C25848q) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m76212Z(C25831h0 c25831h0, C25835j0 c25835j0) {
        AbstractC22676k.m65747g(c25835j0);
        c25831h0.m76225m0(c25835j0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m76213a0(C25831h0 c25831h0, boolean z4) {
        if (z4) {
            c25831h0.m76208V().m76272O(c25831h0.m76206T());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m76214b0(C25831h0 c25831h0, EnumC28083a enumC28083a) {
        if ((enumC28083a == null ? -1 : b.f101687a[enumC28083a.ordinal()]) == 1) {
            c25831h0.m76226n0();
        } else {
            C20807d c20807d = c25831h0.inAppSupportButtonTooltip;
            if (c20807d != null) {
                c20807d.m57361s();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m76215c0(C25831h0 c25831h0, boolean z4) {
        ComposeView composeScheduleStatusView = c25831h0.m76202O().f59619b;
        AbstractC22676k.m65749i(composeScheduleStatusView, "composeScheduleStatusView");
        composeScheduleStatusView.setVisibility(z4 ? 0 : 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private final void m76216d0(C15802k c15802k) {
        this.binding.setValue(this, f101675L[0], c15802k);
    }

    /* JADX INFO: renamed from: e0 */
    private final void m76217e0(CharSequence sleepGoalText) {
        int color = getResources().getColor(AbstractC36510a.f156014W, null);
        StrokedPillButton strokedPillButton = m76202O().f59622e;
        strokedPillButton.setEnabled(false);
        strokedPillButton.setText(sleepGoalText);
        strokedPillButton.setStrokeColor(color);
        strokedPillButton.setTextColor(color);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m76218f0() {
        observe(m76207U().getLoadSleepGraphDto(), new c(new C25829g0(this, 4)));
        observe(m76207U().getViewStateLiveData(), new c(new C25829g0(this, 5)));
        StrokedPillButton sleepGoalShortcutButton = m76202O().f59622e;
        AbstractC22676k.m65749i(sleepGoalShortcutButton, "sleepGoalShortcutButton");
        AbstractC1953c.m5963a(sleepGoalShortcutButton, new C25829g0(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m76219g0(C25831h0 c25831h0, C6245g it) {
        AbstractC22676k.m65750j(it, "it");
        c25831h0.m76223k0(it.getAlarmType(), it.getIsSleepScheduleEnabled());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m76220h0(C25831h0 c25831h0, C6245g it) {
        AbstractC22676k.m65750j(it, "it");
        c25831h0.m76223k0(it.getAlarmType(), it.getIsSleepScheduleEnabled());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m76221i0(C25831h0 c25831h0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25831h0.m76208V().m76273P(c25831h0.currentSleepGoalSetting);
        c25831h0.m76207U().m18765j0();
        c25831h0.m76207U().m18770x0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m76222j0(AbstractC22748o sleepPercent) {
        this.currentSleepGoalSetting = sleepPercent;
        int color = getResources().getColor(AbstractC36510a.f156023c0, null);
        StrokedPillButton strokedPillButton = m76202O().f59622e;
        strokedPillButton.setEnabled(true);
        strokedPillButton.setText(m76228S(sleepPercent));
        strokedPillButton.setStrokeColor(color);
        strokedPillButton.setTextColor(color);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m76223k0(AbstractC22734a alarmType, boolean isSleepScheduleEnabled) {
        if (alarmType instanceof C22736c) {
            m76222j0(((C22736c) alarmType).getSleepPercent());
            return;
        }
        if (alarmType instanceof C22739f) {
            if (m76203P().isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                String string = getString(AbstractC30314g.f124362x);
                AbstractC22676k.m65749i(string, "getString(...)");
                m76217e0(string);
                return;
            } else {
                String string2 = getString(AbstractC30314g.f124360w0);
                AbstractC22676k.m65749i(string2, "getString(...)");
                m76217e0(string2);
                return;
            }
        }
        if (!(alarmType instanceof C22747n)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!isSleepScheduleEnabled) {
            m76222j0(((C22747n) alarmType).getSleepPercent());
            return;
        }
        TextResource textResource = ((C22747n) alarmType).getSleepPercent().getTextResource();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        m76217e0(textResource.resolve(contextRequireContext));
    }

    /* JADX INFO: renamed from: l0 */
    private final void m76224l0(TextResource vow) {
        TextView textView = m76202O().f59625h;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        textView.setText(vow.resolve(contextRequireContext));
    }

    /* JADX INFO: renamed from: m0 */
    private final void m76225m0(C25835j0 viewState) {
        C15802k c15802kM76202O = m76202O();
        if (viewState.getLoading()) {
            c15802kM76202O.f59624g.m26663f();
            c15802kM76202O.f59624g.setVisibility(0);
            c15802kM76202O.f59625h.setVisibility(8);
            return;
        }
        c15802kM76202O.f59624g.m26664g();
        c15802kM76202O.f59624g.setVisibility(8);
        c15802kM76202O.f59625h.setVisibility(0);
        TextResource body = viewState.getBody();
        if (body != null) {
            m76224l0(body);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m76226n0() {
        Context context = m76202O().f59622e.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        C20807d c20807dM57363a = new C20807d.a(context, null, 0).m57372j(getString(AbstractC30314g.f124280T0)).m57367e(getString(AbstractC30314g.f124278S0)).m57364b(getString(AbstractC30314g.f124273Q)).m57371i(false).m57366d(true).m57365c(true).m57369g(500L).m57368f(5, 2).m57370h(new ViewOnClickListenerC21821j(this, 6)).m57363a();
        this.inAppSupportButtonTooltip = c20807dM57363a;
        if (c20807dM57363a != null) {
            StrokedPillButton sleepGoalShortcutButton = m76202O().f59622e;
            AbstractC22676k.m65749i(sleepGoalShortcutButton, "sleepGoalShortcutButton");
            c20807dM57363a.m57362v(sleepGoalShortcutButton, -1, EnumC20804a.TOP);
        }
        C28087e c28087eM76205R = m76205R();
        String string = getString(AbstractC30314g.f124280T0);
        AbstractC22676k.m65749i(string, "getString(...)");
        c28087eM76205R.m84870I(2, string, "Onboarding Tooltip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m76227o0(C25831h0 c25831h0, View view) {
        c25831h0.m76205R().m84865D(EnumC28083a.LATEST_WAKE_TIME);
        c25831h0.m76205R().m84869H(2, "NEXT", "Next Onboarding Tooltip");
    }

    /* JADX INFO: renamed from: S */
    public final CharSequence m76228S(AbstractC22748o sleepPercent) {
        AbstractC22676k.m65750j(sleepPercent, "sleepPercent");
        if ((sleepPercent instanceof C22750q) || (sleepPercent instanceof C22751r)) {
            String string = getResources().getString(AbstractC30314g.f124238C);
            AbstractC22676k.m65747g(string);
            return string;
        }
        if (((sleepPercent instanceof C22745l) || (sleepPercent instanceof C22746m) || (sleepPercent instanceof C22737d)) && m76203P().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS)) {
            String string2 = getResources().getString(AbstractC30314g.f124368z);
            AbstractC22676k.m65747g(string2);
            return string2;
        }
        TextResource textResource = sleepPercent.getTextResource();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        return textResource.resolve(contextRequireContext);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        m76208V().m76272O(m76206T());
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15802k c15802kM44584c = C15802k.m44584c(inflater, container, false);
        AbstractC22676k.m65749i(c15802kM44584c, "inflate(...)");
        m76216d0(c15802kM44584c);
        ComposeView composeScheduleStatusView = m76202O().f59619b;
        AbstractC22676k.m65749i(composeScheduleStatusView, "composeScheduleStatusView");
        AbstractC11814b.m31673c(composeScheduleStatusView, new C37816b(new C22541b(this, 29), true, 1965457551));
        ConstraintLayout constraintLayoutM44585b = m76202O().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44585b, "getRoot(...)");
        return constraintLayoutM44585b;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C25833i0 c25833i0M76208V = m76208V();
        c25833i0M76208V.getVowLiveData().observe(getViewLifecycleOwner(), new c(new C25829g0(this, 0)));
        observe(c25833i0M76208V.m76267H(), new c(new C25829g0(this, 1)));
        c25833i0M76208V.m76271N();
        m76218f0();
        observe(m76205R().getOnboardingStateLiveData(), new c(new C25829g0(this, 2)));
        observe(m76208V().getSleepScheduleTagVisibleLiveData(), new c(new C25829g0(this, 3)));
    }
}
