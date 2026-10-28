package o52;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import bl2.C3374c;
import c93.InterfaceC4339a;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.domain.model.User;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import d91.AbstractC11814b;
import de.hdodenhof.circleimageview.CircleImageView;
import hj0.AbstractC17348g;
import i93.C18279e;
import j93.InterfaceC21493z;
import jf3.C21647a;
import jo.ViewOnClickListenerC21821j;
import k52.AbstractC22207c;
import k52.AbstractC22210f;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m52.AbstractC25083c;
import m83.AbstractC25247g0;
import mw1.C25985a;
import nf1.AbstractC26664e;
import od1.C27858u;
import p098dt.AbstractC12350b;
import p390p1.C28655q;
import p479s4.AbstractC32122c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p92.C29019h;
import pf.AbstractC29125c;
import pl.C29341d;
import q52.AbstractC29983a;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import se.AbstractC32417h;
import tr2.InterfaceC34116n;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vu1.AbstractC36512c;
import wb3.AbstractC37056f;
import zg3.C40634a;

/* JADX INFO: renamed from: o52.d0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0003R\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u00106R+\u0010@\u001a\u0002082\u0006\u00109\u001a\u0002088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, m65681d2 = {"Lo52/d0;", "Lhj0/g;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onDestroy", "W", "Lo52/f;", "data", "m0", "(Lo52/f;)V", "l0", "g0", "V", "c0", "n0", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "F", "Ll83/h;", "T", "()Lcom/whoop/domain/model/StrainRecoveryMapping;", "strainMapping", "", "G", "S", "()D", "strainGoal", "", "H", "Ljava/lang/Long;", "calibrationEndSeconds", "", "I", "Z", "restartCalibrationOnReconnect", "J", "timerSeconds", "Lo52/n;", "K", "U", "()Lo52/n;", "viewModel", "Lm52/c;", "<set-?>", "L", "Lcom/whoop/ui/b;", "R", "()Lm52/c;", "f0", "(Lm52/c;)V", "binding", "Landroid/animation/ValueAnimator;", "M", "Landroid/animation/ValueAnimator;", "animator", "Ltr2/n;", "N", "Ltr2/n;", "logger", "O", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27548d0 extends AbstractC17348g {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean restartCalibrationOnReconnect;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private long timerSeconds;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private ValueAnimator animator;

    /* JADX INFO: renamed from: P */
    static final /* synthetic */ InterfaceC21493z[] f110886P = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C27548d0.class, "binding", "getBinding()Lcom/whoop/realtime/databinding/FragmentRealTimeActivityStrainBinding;", 0))};

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Q */
    public static final int f110887Q = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h strainMapping = AbstractC30060g.m92088H(new C27546c0(this, 1));

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h strainGoal = AbstractC30060g.m92088H(new C27546c0(this, 2));

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Long calibrationEndSeconds = 30L;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(this, null, new c(this), null));

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26725b(this, new C27544b0(this, 2));

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("StrainCoach - RealTimeStrainFragment");

    /* JADX INFO: renamed from: o52.d0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lo52/d0$a;", "", "<init>", "()V", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "mapping", "", WeeklyPlanApiKt.GOAL, "Lo52/d0;", "a", "(Lcom/whoop/domain/model/StrainRecoveryMapping;D)Lo52/d0;", "", "ARG_MAPPING", "Ljava/lang/String;", "ARG_GOAL", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C27548d0 m83140a(StrainRecoveryMapping mapping, double goal) {
            C27548d0 c27548d0 = new C27548d0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("StrainMapping", mapping);
            bundle.putDouble("StrainGoal", goal);
            c27548d0.setArguments(bundle);
            return c27548d0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o52.d0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f110897w;

        public b(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f110897w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f110897w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f110897w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o52.d0$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f110898w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f110898w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f110898w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f110898w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: o52.d0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f110899w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f110900x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f110901y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f110902z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f110899w = abstractComponentCallbacksC1320m0;
            this.f110900x = interfaceC35951a;
            this.f110901y = interfaceC4339a;
            this.f110902z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, o52.n] */
        @Override // c93.InterfaceC4339a
        public final C27567n invoke() {
            return AbstractC37056f.m118952D(this.f110899w, this.f110900x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27567n.class), this.f110901y, this.f110902z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m83116Q(C27548d0 c27548d0, AbstractC25083c it) {
        AbstractC22676k.m65750j(it, "it");
        ValueAnimator valueAnimator = c27548d0.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c27548d0.animator = null;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final AbstractC25083c m83117R() {
        return (AbstractC25083c) this.binding.getValue(this, f110886P[0]);
    }

    /* JADX INFO: renamed from: S */
    private final double m83118S() {
        return ((Number) this.strainGoal.getValue()).doubleValue();
    }

    /* JADX INFO: renamed from: T */
    private final StrainRecoveryMapping m83119T() {
        return (StrainRecoveryMapping) this.strainMapping.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final C27567n m83120U() {
        return (C27567n) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final void m83121V() {
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        ((RealTimeRecordActivity) activity).m23839N0();
    }

    /* JADX INFO: renamed from: W */
    private final void m83122W() {
        m83120U().getViewStateActivityLiveData().observe(getViewLifecycleOwner(), new b(new C27544b0(this, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m83123X(C27548d0 c27548d0, C27551f c27551f) {
        AbstractC22676k.m65747g(c27551f);
        c27548d0.m83138m0(c27551f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m83124Y(C27548d0 c27548d0, View view) {
        c27548d0.m83121V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m83125Z(C27548d0 c27548d0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C27567n c27567nM83120U = c27548d0.m83120U();
            InterfaceC1585g0 viewLifecycleOwner = c27548d0.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC27550e0.m83148f(c27567nM83120U, viewLifecycleOwner, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m83126a0(C27548d0 c27548d0, Long l7) {
        c27548d0.timerSeconds = l7.longValue() / ((long) 1000);
        Long l12 = c27548d0.calibrationEndSeconds;
        if (l12 != null) {
            if (c27548d0.timerSeconds > l12.longValue()) {
                c27548d0.calibrationEndSeconds = null;
            }
            c27548d0.m83139n0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m83127b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c0 */
    private final void m83128c0() {
        this.logger.mo85216g("strainFragment animating goal reached", new AbstractC30556a.a[0]);
        m83117R().f98292o.setGoalReached(true);
        m83117R().f98290m.setVisibility(0);
        int integer = getResources().getInteger(AbstractC26664e.f106003d);
        int integer2 = getResources().getInteger(AbstractC26664e.f106002c);
        int integer3 = getResources().getInteger(AbstractC26664e.f106004e);
        Float fValueOf = Float.valueOf(0.0f);
        int i13 = integer / 2;
        C23465k c23465k = new C23465k(fValueOf, Integer.valueOf(i13));
        C23465k c23465k2 = new C23465k(fValueOf, Integer.valueOf(i13));
        Float fValueOf2 = Float.valueOf(1.0f);
        this.animator = AbstractC29983a.m91706b(AbstractC37056f.m118959K(c23465k, c23465k2, new C23465k(fValueOf2, Integer.valueOf(integer2)), new C23465k(fValueOf2, Integer.valueOf(integer3)), new C23465k(fValueOf, 0)), new C27544b0(this, 0), new C27546c0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m83129d0(C27548d0 c27548d0, float f13) {
        c27548d0.m83117R().f98290m.setAlpha(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m83130e0(C27548d0 c27548d0) {
        c27548d0.m83117R().f98290m.setVisibility(8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    private final void m83131f0(AbstractC25083c abstractC25083c) {
        this.binding.setValue(this, f110886P[0], abstractC25083c);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m83132g0() {
        AbstractActivityC1340r0 abstractActivityC1340r0M49107B = m49107B();
        AbstractC22676k.m65748h(abstractActivityC1340r0M49107B, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        m49109z(((RealTimeRecordActivity) abstractActivityC1340r0M49107B).m23840Q0().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27544b0(this, 3), 29)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m83133h0(C27548d0 c27548d0, C29019h c29019h) {
        c29019h.m88244b0(c27548d0.m83118S());
        c27548d0.m83120U().m83258u0(c29019h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m83134i0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final double m83135j0(C27548d0 c27548d0) {
        Bundle arguments = c27548d0.getArguments();
        if (arguments != null) {
            return arguments.getDouble("StrainGoal", 0.0d);
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final StrainRecoveryMapping m83136k0(C27548d0 c27548d0) {
        Bundle arguments = c27548d0.getArguments();
        if (arguments != null) {
            return (StrainRecoveryMapping) ((Parcelable) AbstractC12350b.m34600u(arguments, StrainRecoveryMapping.class, "StrainMapping"));
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    private final void m83137l0(C27551f data) {
        int i13;
        EnumC27586w0 enumC27586w0;
        if (data.getRealTimeStrain() != m83120U().getLastRealTimeStrain()) {
            m83120U().m83247U0(data.getRealTimeStrain());
            this.logger.mo85216g("Strain Coach Data: " + data, new AbstractC30556a.a[0]);
        }
        double realTimeStrain = data.getRealTimeStrain();
        m83117R().f98292o.setProgress((float) (realTimeStrain / 21.0d));
        m83117R().f98300w.setText(AbstractC10538f.m27183h(realTimeStrain));
        if (m83119T() != null) {
            StrainRecoveryMapping strainRecoveryMappingM83119T = m83119T();
            AbstractC22676k.m65747g(strainRecoveryMappingM83119T);
            if (realTimeStrain < strainRecoveryMappingM83119T.getLowerRecStrain()) {
                enumC27586w0 = EnumC27586w0.RESTORATIVE;
            } else {
                StrainRecoveryMapping strainRecoveryMappingM83119T2 = m83119T();
                AbstractC22676k.m65747g(strainRecoveryMappingM83119T2);
                enumC27586w0 = realTimeStrain > strainRecoveryMappingM83119T2.getUpperRecStrain() ? EnumC27586w0.OVERREACHING : EnumC27586w0.OPTIMAL;
            }
            m83117R().f98298u.setText(getString(enumC27586w0.getStrinResId()));
            return;
        }
        TextView textView = m83117R().f98298u;
        if (realTimeStrain < 6.0d) {
            i13 = AbstractC22210f.f86488j0;
        } else if (realTimeStrain < 10.0d) {
            i13 = AbstractC22210f.f86482h0;
        } else if (realTimeStrain < 14.0d) {
            i13 = AbstractC22210f.f86485i0;
        } else {
            i13 = realTimeStrain < 18.0d ? AbstractC22210f.f86491k0 : AbstractC22210f.f86479g0;
        }
        textView.setText(getString(i13));
    }

    /* JADX INFO: renamed from: m0 */
    private final void m83138m0(C27551f data) {
        m83139n0();
        m83117R().f98286i.setValueText(String.valueOf(data.getRealtimeHearRate()));
        m83137l0(data);
        m83117R().f98288k.setStrainPercent(data.getHearRatePercentRange());
        C23465k hearRateStat = data.getHearRateStat();
        int iIntValue = ((Number) hearRateStat.f92937w).intValue();
        m83117R().f98282e.setValueText(String.valueOf(((Number) hearRateStat.f92938x).intValue()));
        m83117R().f98287j.setValueText(String.valueOf(iIntValue));
        m83120U().m83246T0(String.valueOf(data.getCalories()));
        m83117R().f98283f.setValueText(String.valueOf(data.getCalories()));
        if (data.getIsGoalReached()) {
            m83117R().f98292o.setGoalReached(false);
        }
        if (data.getReachGoal()) {
            m83128c0();
            m83120U().m83248c0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m83139n0() {
        if (!m83120U().m83254k0()) {
            this.logger.mo85222m("updateUiState: Bluetooth not enabled", new AbstractC30556a.a[0]);
            if (this.calibrationEndSeconds != null) {
                this.restartCalibrationOnReconnect = true;
            }
            m83117R().f98293p.setVisibility(8);
            m83117R().f98294q.setVisibility(0);
            m83117R().f98297t.setText(AbstractC22210f.f86437O0);
            m83117R().f98296s.setText("");
            m83117R().f98295r.setImageDrawable(AbstractC32122c.getDrawable(requireContext(), AbstractC22207c.f86261b));
            return;
        }
        if (!m83120U().m83253j0()) {
            this.logger.mo85216g("updateUiState: whoopStrapProxy Status Is Ready", new AbstractC30556a.a[0]);
            if (this.calibrationEndSeconds != null) {
                this.restartCalibrationOnReconnect = true;
            }
            m83117R().f98293p.setVisibility(8);
            m83117R().f98294q.setVisibility(0);
            m83117R().f98297t.setText(AbstractC22210f.f86435N0);
            m83117R().f98296s.setText("");
            m83117R().f98295r.setImageDrawable(AbstractC32122c.getDrawable(requireContext(), AbstractC22207c.f86269j));
            return;
        }
        Long l7 = this.calibrationEndSeconds;
        if (l7 != null) {
            long j7 = this.timerSeconds;
            AbstractC22676k.m65747g(l7);
            if (j7 < l7.longValue()) {
                m83117R().f98293p.setVisibility(8);
                m83117R().f98294q.setVisibility(0);
                m83117R().f98297t.setText(AbstractC22210f.f86431L0);
                TextView textView = m83117R().f98296s;
                Resources resources = getResources();
                int i13 = AbstractC22210f.f86433M0;
                Long l12 = this.calibrationEndSeconds;
                AbstractC22676k.m65747g(l12);
                textView.setText(resources.getString(i13, Long.valueOf(l12.longValue() - this.timerSeconds)));
                m83117R().f98295r.setImageDrawable(AbstractC32122c.getDrawable(requireContext(), AbstractC22207c.f86263d));
                return;
            }
        }
        m83117R().f98293p.setVisibility(0);
        m83117R().f98294q.setVisibility(8);
        if (this.restartCalibrationOnReconnect) {
            this.logger.mo85216g("updateUiState: restartCalibrationOnReconnect", new AbstractC30556a.a[0]);
            this.calibrationEndSeconds = Long.valueOf(this.timerSeconds + 30);
            this.restartCalibrationOnReconnect = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC25083c abstractC25083cM73580c = AbstractC25083c.m73580c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC25083cM73580c, "inflate(...)");
        m83131f0(abstractC25083cM73580c);
        m83117R().getRoot().setTag(0);
        View root = m83117R().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        this.logger.mo85216g("onDestroy", new AbstractC30556a.a[0]);
        m83120U().m83245S0();
        super.onDestroy();
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getEventDispatcher().m129034f0("Activity Recording", AbstractC25247g0.m73989X(new C23465k("Label", "Activity Strain")));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        this.logger.mo85216g("RealTimeStrainFragment onStart - subscribing to strainController connect", new AbstractC30556a.a[0]);
        super.onStart();
        m83132g0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        this.logger.mo85216g("onViewCreated", new AbstractC30556a.a[0]);
        super.onViewCreated(view, savedInstanceState);
        StrainRecoveryMapping strainRecoveryMappingM83119T = m83119T();
        if (strainRecoveryMappingM83119T != null) {
            m83117R().f98292o.setOptimalRange(new C18279e((float) (strainRecoveryMappingM83119T.getLowerRecStrain() / 21.0d), (float) (strainRecoveryMappingM83119T.getUpperRecStrain() / 21.0d)));
        }
        m83117R().f98292o.setGoalPct((float) (m83118S() / 21.0d));
        if (m83118S() > 0.0d) {
            m83117R().f98292o.setDrawGoalIcon(true);
        }
        m83117R().f98283f.setValueText(m83120U().getLastCalorieCount());
        m83117R().f98288k.setStrainPercent(0);
        AbstractC32417h.m101189T(m83117R().f98298u, m83119T() != null);
        m83117R().f98301x.setOnClickListener(new ViewOnClickListenerC21821j(this, 8));
        CircleImageView circleImageView = m83117R().f98291n;
        circleImageView.setImageDrawable(AbstractC32122c.getDrawable(requireContext(), AbstractC36512c.f156072o));
        User userM84055f = ((C27858u) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"))).m84055f();
        if (userM84055f != null) {
            ComponentCallbacks2C4960b.m15529e(requireContext()).m15549m(userM84055f.getAvatarUrl()).mo15533a((C29341d) new C29341d().m89319j(AbstractC36512c.f156072o)).m15537y(circleImageView);
        }
        m83117R().f98288k.setVisibility(8);
        ComposeView rangeViewComposeView = m83117R().f98289l;
        AbstractC22676k.m65749i(rangeViewComposeView, "rangeViewComposeView");
        AbstractC11814b.m31673c(rangeViewComposeView, new C37816b(new C25985a(this, 26), true, 74909893));
        m83120U().m83255l0();
        m83120U().m83257r0();
        m83120U().m83256o0();
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        m49109z(((RealTimeRecordActivity) activity).getTimerSubject().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27544b0(this, 1), 28)));
        m83122W();
    }
}
