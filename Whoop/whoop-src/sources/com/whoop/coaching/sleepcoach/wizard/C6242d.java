package com.whoop.coaching.sleepcoach.wizard;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import gf2.C15800i;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import mp0.C25814a;
import mp0.C25820c;
import mp0.C25824e;
import mp0.C25826f;
import mp0.C25846p;
import mp0.C25850r;
import mp0.C25852s;
import mp0.EnumC25817b;
import mp0.EnumC25821c0;
import mp0.EnumC25823d0;
import mp0.EnumC25836k;
import mp0.EnumC25840m;
import mp0.EnumC25844o;
import p087db.C11845e;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu1.AbstractC36512c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8\u0014X\u0094D¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/d;", "Lhj0/m;", "<init>", "()V", "Lmp0/a;", "alarmLoadingViewState", "Ll83/a0;", "a0", "(Lmp0/a;)V", "currentAlarmType", "b0", "Z", "U", "V", "X", "d0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/i;", "y", "Lgf2/i;", "binding", "Lmp0/s;", "z", "Ll83/h;", "O", "()Lmp0/s;", "sleepCoachAlarmLoadingStateViewModel", "Lmp0/f;", "E", "N", "()Lmp0/f;", "alarmTurnOffTutorialViewModel", "Landroid/animation/ValueAnimator;", "F", "Landroid/animation/ValueAnimator;", "valueAnimator", "Lmp0/m;", "G", "Lmp0/m;", "currentLoadingState", "H", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6242d extends AbstractC17354m {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: I */
    public static final int f24607I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h alarmTurnOffTutorialViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private EnumC25840m currentLoadingState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepCoachAlarmLoadingStateFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C15800i binding;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachAlarmLoadingStateViewModel;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/d$a;", "", "<init>", "()V", "", "fromPush", "Lcom/whoop/coaching/sleepcoach/wizard/d;", "a", "(Z)Lcom/whoop/coaching/sleepcoach/wizard/d;", "", "KEY_FROM_PUSH", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6242d m18684a(boolean fromPush) {
            C6242d c6242d = new C6242d();
            c6242d.setArguments(AbstractC12889b.m36273g(new C23465k("keyfrompush", Boolean.valueOf(fromPush))));
            return c6242d;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24615a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24616b;

        static {
            int[] iArr = new int[EnumC25840m.values().length];
            try {
                iArr[EnumC25840m.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25840m.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25840m.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25840m.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24615a = iArr;
            int[] iArr2 = new int[EnumC25836k.values().length];
            try {
                iArr2[EnumC25836k.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC25836k.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f24616b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f24617w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f24617w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f24617w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24617w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24618w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24618w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f24618w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f24618w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24619w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24620x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24621y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24622z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24619w = abstractComponentCallbacksC1320m0;
            this.f24620x = interfaceC35951a;
            this.f24621y = interfaceC4339a;
            this.f24622z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.f] */
        @Override // c93.InterfaceC4339a
        public final C25826f invoke() {
            return AbstractC37056f.m118952D(this.f24619w, this.f24620x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25826f.class), this.f24621y, this.f24622z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24623w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24623w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24623w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.d$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24624w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24625x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24626y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24627z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24624w = componentCallbacks;
            this.f24625x = interfaceC35951a;
            this.f24626y = interfaceC4339a;
            this.f24627z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.s] */
        @Override // c93.InterfaceC4339a
        public final C25852s invoke() {
            return AbstractC34132o.m107857B(this.f24624w, this.f24625x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25852s.class), this.f24626y, this.f24627z);
        }
    }

    public C6242d() {
        C24117a c24117a = new C24117a(this, 10);
        f fVar = new f(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.sleepCoachAlarmLoadingStateViewModel = AbstractC30060g.m92087G(enumC23463i, new g(this, null, fVar, c24117a));
        this.alarmTurnOffTutorialViewModel = AbstractC30060g.m92087G(enumC23463i, new e(this, null, new d(this), null));
        this.currentLoadingState = EnumC25840m.LOADING;
    }

    /* JADX INFO: renamed from: N */
    private final C25826f m18666N() {
        return (C25826f) this.alarmTurnOffTutorialViewModel.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final C25852s m18667O() {
        return (C25852s) this.sleepCoachAlarmLoadingStateViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m18668P(C6242d c6242d, C25820c it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getExpendedStateFlow() == EnumC25817b.SAVING_STATE_FLOW) {
            C15800i c15800i = c6242d.binding;
            if (c15800i == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            c15800i.f59597b.setVisibility(0);
            c6242d.m18667O().m76356R(c6242d.requireArguments().getBoolean("keyfrompush"));
            c6242d.m18666N().m76170D();
        } else {
            C15800i c15800i2 = c6242d.binding;
            if (c15800i2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            c15800i2.f59597b.setVisibility(8);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m18669Q(C6242d c6242d, C25814a alarmLoadingViewState) {
        AbstractC22676k.m65750j(alarmLoadingViewState, "alarmLoadingViewState");
        c6242d.currentLoadingState = alarmLoadingViewState.getLoadingStates();
        int i13 = b.f24615a[alarmLoadingViewState.getLoadingStates().ordinal()];
        if (i13 == 1) {
            c6242d.m18679a0(alarmLoadingViewState);
        } else if (i13 == 2) {
            c6242d.m18680b0(alarmLoadingViewState);
        } else if (i13 == 3) {
            c6242d.m18678Z(alarmLoadingViewState);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c6242d.m18673U();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m18670R(C6242d c6242d, boolean z4) {
        if (z4) {
            c6242d.m18666N().m76169C();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m18671S(C6242d c6242d, EnumC25836k it) {
        AbstractC22676k.m65750j(it, "it");
        int i13 = b.f24616b[it.ordinal()];
        if (i13 == 1) {
            AbstractC1329o1 childFragmentManager = c6242d.getChildFragmentManager();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = childFragmentManager.m4140E(c22673i0.getOrCreateKotlinClass(C25824e.class).getSimpleName());
            C25824e c25824e = abstractComponentCallbacksC1320m0M4140E instanceof C25824e ? (C25824e) abstractComponentCallbacksC1320m0M4140E : null;
            if (c25824e == null) {
                c25824e = new C25824e();
            }
            c25824e.show(c6242d.getChildFragmentManager(), c22673i0.getOrCreateKotlinClass(C25824e.class).getSimpleName());
        } else if (i13 == 2) {
            c6242d.m18667O().m76351D();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m18672T(C6242d c6242d, C25846p it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getOnBackPressState() == EnumC25844o.SAVING_FLOW_ON_BACK_PRESS && c6242d.currentLoadingState != EnumC25840m.LOADING) {
            c6242d.m18673U();
            c6242d.m18667O().m76359Z();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    private final void m18673U() {
        m18666N().m76171E();
        C15800i c15800i = this.binding;
        if (c15800i != null) {
            c15800i.f59597b.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m18674V() {
        C15800i c15800i = this.binding;
        if (c15800i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        StrokedPillButton retryButton = c15800i.f59607l;
        AbstractC22676k.m65749i(retryButton, "retryButton");
        AbstractC1953c.m5963a(retryButton, new C25850r(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m18675W(C6242d c6242d, View it) {
        AbstractC22676k.m65750j(it, "it");
        c6242d.m18667O().m76357V(EnumC25821c0.RETRY);
        c6242d.m18667O().m76356R(c6242d.requireArguments().getBoolean("keyfrompush"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private final void m18676X() {
        C15800i c15800i = this.binding;
        if (c15800i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView cancelButton = c15800i.f59601f;
        AbstractC22676k.m65749i(cancelButton, "cancelButton");
        AbstractC1953c.m5963a(cancelButton, new C25850r(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m18677Y(C6242d c6242d, View it) {
        AbstractC22676k.m65750j(it, "it");
        c6242d.m18667O().m76357V(EnumC25821c0.CANCEL);
        c6242d.m18667O().m76359Z();
        c6242d.m18673U();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private final void m18678Z(C25814a alarmLoadingViewState) {
        m18667O().m76358W(EnumC25823d0.FAILED);
        C15800i c15800i = this.binding;
        if (c15800i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        C23465k c23465kM76053b = alarmLoadingViewState.getPairOfTitleAndDescription();
        if (c23465kM76053b != null) {
            TextView textView = c15800i.f59603h;
            TextResource textResource = (TextResource) c23465kM76053b.f92937w;
            Context contextRequireContext = requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            textView.setText(textResource.resolve(contextRequireContext));
            TextView textView2 = c15800i.f59602g;
            TextResource textResource2 = (TextResource) c23465kM76053b.f92938x;
            Context contextRequireContext2 = requireContext();
            AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
            textView2.setText(textResource2.resolve(contextRequireContext2));
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ConstraintLayout savingStateContainer = c15800i.f59609n;
        AbstractC22676k.m65749i(savingStateContainer, "savingStateContainer");
        savingStateContainer.setVisibility(8);
        ConstraintLayout successStateContainer = c15800i.f59612q;
        AbstractC22676k.m65749i(successStateContainer, "successStateContainer");
        successStateContainer.setVisibility(8);
        ConstraintLayout errorStateContainer = c15800i.f59605j;
        AbstractC22676k.m65749i(errorStateContainer, "errorStateContainer");
        errorStateContainer.setVisibility(0);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m18679a0(C25814a alarmLoadingViewState) {
        m18667O().m76358W(EnumC25823d0.SAVING);
        C15800i c15800i = this.binding;
        if (c15800i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        m18682d0();
        if (alarmLoadingViewState.getIsAlarmEnabled()) {
            c15800i.f59608m.setVisibility(0);
        } else {
            c15800i.f59608m.setVisibility(8);
        }
        c15800i.f59611p.setImageDrawable(getResources().getDrawable(AbstractC36512c.f156070m, null));
        C23465k c23465kM76053b = alarmLoadingViewState.getPairOfTitleAndDescription();
        if (c23465kM76053b != null) {
            TextView textView = c15800i.f59610o;
            TextResource textResource = (TextResource) c23465kM76053b.f92937w;
            Context contextRequireContext = requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            textView.setText(textResource.resolve(contextRequireContext));
            TextView textView2 = c15800i.f59608m;
            TextResource textResource2 = (TextResource) c23465kM76053b.f92938x;
            Context contextRequireContext2 = requireContext();
            AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
            textView2.setText(textResource2.resolve(contextRequireContext2));
        }
        ConstraintLayout savingStateContainer = c15800i.f59609n;
        AbstractC22676k.m65749i(savingStateContainer, "savingStateContainer");
        savingStateContainer.setVisibility(0);
        ConstraintLayout successStateContainer = c15800i.f59612q;
        AbstractC22676k.m65749i(successStateContainer, "successStateContainer");
        successStateContainer.setVisibility(8);
        ConstraintLayout errorStateContainer = c15800i.f59605j;
        AbstractC22676k.m65749i(errorStateContainer, "errorStateContainer");
        errorStateContainer.setVisibility(8);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m18680b0(C25814a currentAlarmType) {
        m18667O().m76358W(EnumC25823d0.SAVED);
        C15800i c15800i = this.binding;
        if (c15800i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C23465k c23465kM76053b = currentAlarmType.getPairOfTitleAndDescription();
        if (c23465kM76053b != null) {
            TextView textView = c15800i.f59599d;
            TextResource textResource = (TextResource) c23465kM76053b.f92937w;
            Context contextRequireContext = requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            textView.setText(textResource.resolve(contextRequireContext));
            TextView textView2 = c15800i.f59598c;
            TextResource textResource2 = (TextResource) c23465kM76053b.f92938x;
            Context contextRequireContext2 = requireContext();
            AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
            textView2.setText(textResource2.resolve(contextRequireContext2));
        }
        ConstraintLayout savingStateContainer = c15800i.f59609n;
        AbstractC22676k.m65749i(savingStateContainer, "savingStateContainer");
        savingStateContainer.setVisibility(8);
        ConstraintLayout successStateContainer = c15800i.f59612q;
        AbstractC22676k.m65749i(successStateContainer, "successStateContainer");
        successStateContainer.setVisibility(0);
        ConstraintLayout errorStateContainer = c15800i.f59605j;
        AbstractC22676k.m65749i(errorStateContainer, "errorStateContainer");
        errorStateContainer.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C34911a m18681c0(C6242d c6242d) {
        return AbstractC15751g.m44431K(c6242d.requireContext());
    }

    /* JADX INFO: renamed from: d0 */
    private final void m18682d0() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new C11845e(this, 5));
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.start();
        this.valueAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m18683e0(C6242d c6242d, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        C15800i c15800i = c6242d.binding;
        if (c15800i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ProgressBar progressBar = c15800i.f59606k;
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15800i c15800iM44578c = C15800i.m44578c(inflater, container, false);
        AbstractC22676k.m65749i(c15800iM44578c, "inflate(...)");
        this.binding = c15800iM44578c;
        FrameLayout frameLayoutM44579b = c15800iM44578c.getRoot();
        AbstractC22676k.m65749i(frameLayoutM44579b, "getRoot(...)");
        return frameLayoutM44579b;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m18674V();
        m18676X();
        observe(m18667O().getAlarmOptionFlowLiveData(), new c(new C25850r(this, 0)));
        observe(m18667O().getAlarmLoadingViewStateLiveData(), new c(new C25850r(this, 1)));
        observe(m18667O().getOnSuccessCompleteLiveData(), new c(new C25850r(this, 2)));
        observe(m18666N().getHowToTurnOffAlarmTutorialLiveData(), new c(new C25850r(this, 3)));
        observe(m18667O().getOnBackPressHandlerLiveData(), new c(new C25850r(this, 4)));
    }
}
