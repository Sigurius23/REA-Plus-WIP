package com.whoop.coaching.sleepcoach.wizard;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.coaching.sleepcoach.wizard.C6243e;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import gf2.C15801j;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import mp0.C25820c;
import mp0.C25827f0;
import mp0.EnumC25817b;
import or2.AbstractC28163g0;
import or2.C28216y;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qe2.AbstractC30314g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010A¨\u0006E"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/e;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "N", "", "shouldShow", "J", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/j;", "<set-?>", "y", "Lcom/whoop/ui/b;", "K", "()Lgf2/j;", "T", "(Lgf2/j;)V", "binding", "Lor2/y;", "z", "Ll83/h;", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lmp0/f0;", "E", "M", "()Lmp0/f0;", "sleepCoachToolBarViewModel", "Lmp0/b;", "F", "Lmp0/b;", "previousFlowState", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "L", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/o0;", "H", "getNavigator", "()Lj02/o0;", "navigator", "I", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6243e extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachToolBarViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private EnumC25817b previousFlowState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: J */
    static final /* synthetic */ InterfaceC21493z[] f24629J = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C6243e.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepCoachToolBarBinding;", 0))};

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: K */
    public static final int f24630K = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepCoachToolBarFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/e$a;", "", "<init>", "()V", "Lcom/whoop/coaching/sleepcoach/wizard/e;", "a", "()Lcom/whoop/coaching/sleepcoach/wizard/e;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6243e m18701a() {
            return new C6243e();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24639a;

        static {
            int[] iArr = new int[EnumC25817b.values().length];
            try {
                iArr[EnumC25817b.ALARM_SET_TO_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25817b.LATEST_WAKE_TIME_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25817b.SLEEP_GOAL_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25817b.COLLAPSED_STATE_FLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25817b.SAVING_STATE_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC25817b.EMPTY_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25817b.ALARM_SET_REMINDER_FLOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f24639a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f24640w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f24640w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f24640w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24640w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24641w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24642x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24643y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24641w = componentCallbacks;
            this.f24642x = interfaceC35951a;
            this.f24643y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f24641w;
            InterfaceC35951a interfaceC35951a = this.f24642x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24643y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24644w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24645x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24646y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24644w = componentCallbacks;
            this.f24645x = interfaceC35951a;
            this.f24646y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f24644w;
            InterfaceC35951a interfaceC35951a = this.f24645x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24646y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24647w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24648x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24649y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24647w = componentCallbacks;
            this.f24648x = interfaceC35951a;
            this.f24649y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24647w;
            InterfaceC35951a interfaceC35951a = this.f24648x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24649y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24650w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24650w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24650w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.e$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24651w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24652x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24653y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24651w = componentCallbacks;
            this.f24652x = interfaceC35951a;
            this.f24653y = interfaceC4339a;
            this.f24654z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.f0] */
        @Override // c93.InterfaceC4339a
        public final C25827f0 invoke() {
            return AbstractC34132o.m107857B(this.f24651w, this.f24652x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25827f0.class), this.f24653y, this.f24654z);
        }
    }

    public C6243e() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new d(this, null, null));
        this.sleepCoachToolBarViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new h(this, null, new g(this), null));
        this.previousFlowState = EnumC25817b.COLLAPSED_STATE_FLOW;
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new e(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new f(this, null, new C24117a(this, 12)));
    }

    /* JADX INFO: renamed from: J */
    private final void m18690J(boolean shouldShow) {
        ImageView wakeTimeScheduling = m18691K().f59617e;
        AbstractC22676k.m65749i(wakeTimeScheduling, "wakeTimeScheduling");
        wakeTimeScheduling.setVisibility(shouldShow ? 0 : 8);
        m18693M().m76180q(shouldShow);
    }

    /* JADX INFO: renamed from: K */
    private final C15801j m18691K() {
        return (C15801j) this.binding.getValue(this, f24629J[0]);
    }

    /* JADX INFO: renamed from: L */
    private final FeatureFlagChecker m18692L() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C25827f0 m18693M() {
        return (C25827f0) this.sleepCoachToolBarViewModel.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final void m18694N() {
        if (b.f24639a[this.previousFlowState.ordinal()] == 4) {
            m18691K().f59614b.setVisibility(0);
            m18690J(true);
        } else {
            m18691K().f59614b.setVisibility(8);
            m18690J(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m18695O(C6243e c6243e) {
        return AbstractC15751g.m44431K(c6243e.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m18696P(C6243e c6243e, View it) {
        AbstractC22676k.m65750j(it, "it");
        c6243e.m18693M().m76177n();
        AbstractC5583n.m16799z(c6243e).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m18697Q(C6243e c6243e, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (c6243e.m18692L().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS)) {
            c6243e.getNavigator().mo59393b(new AbstractC21155m0.f3("OPTIMAL_BEDTIME_RECS_EDUCATION", "", "Sleep Planner", null, null, 24, null));
        } else {
            c6243e.m18693M().m76178o();
            C28216y externalLinkNavigator = c6243e.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = c6243e.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, c6243e.m18693M().getSleepCoachHelpUrl(), false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m18698R(C6243e c6243e, View it) {
        AbstractC22676k.m65750j(it, "it");
        c6243e.m18693M().m76179p();
        if (c6243e.m18693M().m76175j()) {
            AbstractC28163g0.m85259o(c6243e).m85338d(Uri.parse("android-app://com.whoop/onboardingStoriesFragmentRedesign/ALARM_SCHEDULING"));
        } else {
            AbstractC28163g0.m85259o(c6243e).m85338d(Uri.parse("android-app://com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment/?fromOnboarding=false"));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m18699S(C6243e c6243e, C25820c it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC25817b expendedStateFlow = it.getExpendedStateFlow();
        switch (b.f24639a[expendedStateFlow.ordinal()]) {
            case 1:
                c6243e.previousFlowState = expendedStateFlow;
                break;
            case 2:
                c6243e.previousFlowState = expendedStateFlow;
                break;
            case 3:
                c6243e.previousFlowState = expendedStateFlow;
                break;
            case 4:
                c6243e.previousFlowState = expendedStateFlow;
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c6243e.m18694N();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private final void m18700T(C15801j c15801j) {
        this.binding.setValue(this, f24629J[0], c15801j);
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
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
        C15801j c15801jM44581c = C15801j.m44581c(inflater, container, false);
        AbstractC22676k.m65749i(c15801jM44581c, "inflate(...)");
        m18700T(c15801jM44581c);
        ConstraintLayout constraintLayoutM44582b = m18691K().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44582b, "getRoot(...)");
        return constraintLayoutM44582b;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C15801j c15801jM18691K = m18691K();
        c15801jM18691K.f59616d.setText(getString(AbstractC30314g.f124298b1));
        ImageView closeIcon = c15801jM18691K.f59614b;
        AbstractC22676k.m65749i(closeIcon, "closeIcon");
        final int i13 = 0;
        AbstractC1953c.m5963a(closeIcon, new Function1(this) { // from class: mp0.e0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6243e f101635x;

            {
                this.f101635x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C6243e.m18696P(this.f101635x, (View) obj);
                    case 1:
                        return C6243e.m18697Q(this.f101635x, (View) obj);
                    case 2:
                        return C6243e.m18698R(this.f101635x, (View) obj);
                    default:
                        return C6243e.m18699S(this.f101635x, (C25820c) obj);
                }
            }
        });
        ImageView helpIcon = c15801jM18691K.f59615c;
        AbstractC22676k.m65749i(helpIcon, "helpIcon");
        final int i14 = 1;
        AbstractC1953c.m5963a(helpIcon, new Function1(this) { // from class: mp0.e0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6243e f101635x;

            {
                this.f101635x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C6243e.m18696P(this.f101635x, (View) obj);
                    case 1:
                        return C6243e.m18697Q(this.f101635x, (View) obj);
                    case 2:
                        return C6243e.m18698R(this.f101635x, (View) obj);
                    default:
                        return C6243e.m18699S(this.f101635x, (C25820c) obj);
                }
            }
        });
        m18690J(true);
        ImageView wakeTimeScheduling = c15801jM18691K.f59617e;
        AbstractC22676k.m65749i(wakeTimeScheduling, "wakeTimeScheduling");
        final int i15 = 2;
        AbstractC1953c.m5963a(wakeTimeScheduling, new Function1(this) { // from class: mp0.e0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6243e f101635x;

            {
                this.f101635x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return C6243e.m18696P(this.f101635x, (View) obj);
                    case 1:
                        return C6243e.m18697Q(this.f101635x, (View) obj);
                    case 2:
                        return C6243e.m18698R(this.f101635x, (View) obj);
                    default:
                        return C6243e.m18699S(this.f101635x, (C25820c) obj);
                }
            }
        });
        final int i16 = 3;
        observe(m18693M().getAlarmOptionDeepLinKLiveData(), new c(new Function1(this) { // from class: mp0.e0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6243e f101635x;

            {
                this.f101635x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return C6243e.m18696P(this.f101635x, (View) obj);
                    case 1:
                        return C6243e.m18697Q(this.f101635x, (View) obj);
                    case 2:
                        return C6243e.m18698R(this.f101635x, (View) obj);
                    default:
                        return C6243e.m18699S(this.f101635x, (C25820c) obj);
                }
            }
        }));
    }
}
