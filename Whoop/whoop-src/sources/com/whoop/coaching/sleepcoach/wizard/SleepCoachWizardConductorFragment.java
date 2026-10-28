package com.whoop.coaching.sleepcoach.wizard;

import android.R;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fp0.AbstractC14672a;
import ge3.AbstractC15751g;
import gf2.C15803l;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import mm.C25680d;
import mp0.C25818b0;
import mp0.C25820c;
import mp0.C25831h0;
import mp0.C25845o0;
import mp0.C25846p;
import mp0.C25849q0;
import mp0.C25858v;
import mp0.C25867z0;
import mp0.EnumC25817b;
import mp0.EnumC25844o;
import op0.C28087e;
import op0.EnumC28083a;
import or2.AbstractC28163g0;
import or2.C28180m;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p032bc.AbstractC2938a0;
import p032bc.AbstractC2974w;
import p032bc.C2937a;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p719m22.C24958m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001`\b\u0007\u0018\u0000 w2\u00020\u0001:\u0001xB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003R\u001a\u00100\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u00020\u00148\u0014X\u0094D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R+\u0010>\u001a\u0002062\u0006\u00107\u001a\u0002068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010A\u001a\u0004\bX\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010A\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010A\u001a\u0004\bk\u0010lR\u001b\u0010p\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010A\u001a\u0004\bo\u0010lR$\u0010v\u001a\u00020i2\u0006\u0010q\u001a\u00020i8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\br\u0010s\"\u0004\bt\u0010u¨\u0006y"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;", "Lfp0/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "connected", "u0", "(Z)V", "Lmp0/c;", "it", "s0", "(Lmp0/c;)V", "X", "", "containerID", "", "fragmentTag", "W", "(ILjava/lang/String;)V", "V", "fragTag", "Landroidx/fragment/app/m0;", "l0", "(Ljava/lang/String;)Landroidx/fragment/app/m0;", "Lcom/whoop/coaching/sleepcoach/wizard/f;", "i0", "()Lcom/whoop/coaching/sleepcoach/wizard/f;", "Y", "y", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "z", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/l;", "<set-?>", "E", "Lcom/whoop/ui/b;", "e0", "()Lgf2/l;", "t0", "(Lgf2/l;)V", "binding", "Lbc/w;", "F", "Ll83/h;", "j0", "()Lbc/w;", "transition", "Lmp0/o0;", "G", "k0", "()Lmp0/o0;", "viewModel", "Lop0/e;", "H", "h0", "()Lop0/e;", "sleepCoachToolTipViewModel", "Lmp0/b;", "I", "Lmp0/b;", "currentFlow", "Lmp0/o;", "J", "Lmp0/o;", "previousFlowBeforeLoading", "K", "d0", "args", "L", "Ljava/lang/Boolean;", "Lbc3/c0;", "M", "Lbc3/c0;", "coroutineScope", "com/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment$c", "N", "Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment$c;", "callBack", "Lj02/o0;", "O", "getNavigator", "()Lj02/o0;", "navigator", "Landroidx/constraintlayout/widget/p;", "P", "f0", "()Landroidx/constraintlayout/widget/p;", "collapsedScene", "Q", "g0", "expandedScene", "value", "R", "Landroidx/constraintlayout/widget/p;", "r0", "(Landroidx/constraintlayout/widget/p;)V", "alarmConstraintSet", "S", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SleepCoachWizardConductorFragment extends AbstractC14672a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h transition;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachToolTipViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private EnumC25817b currentFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private EnumC25844o previousFlowBeforeLoading;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h args;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Boolean connected;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C6230c callBack;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h collapsedScene;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h expandedScene;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private C1153p alarmConstraintSet;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: T */
    static final /* synthetic */ InterfaceC21493z[] f24520T = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(SleepCoachWizardConductorFragment.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepCoachWizardConductorBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public static final int f24521U = 8;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String logTag = "SleepCoachWizardFragment";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6229b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24538a;

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
                iArr[EnumC25817b.ALARM_SET_REMINDER_FLOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25817b.EMPTY_STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f24538a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment$c", "Lg/t;", "Ll83/a0;", "d", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6230c extends AbstractC14917t {
        public C6230c() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            SleepCoachWizardConductorFragment.this.m18601k0().m76299F(SleepCoachWizardConductorFragment.this.currentFlow, SleepCoachWizardConductorFragment.this.previousFlowBeforeLoading);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$onResume$1", m100430f = "SleepCoachWizardConductorFragment.kt", m100431l = {158}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6231d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24540w;

        /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ SleepCoachWizardConductorFragment f24542w;

            public a(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment) {
                this.f24542w = sleepCoachWizardConductorFragment;
            }

            /* JADX INFO: renamed from: b */
            public final Object m18613b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (z4) {
                    this.f24542w.getNavigator().mo59393b(AbstractC21155m0.y3.f80645b);
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m18613b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        public C6231d(InterfaceC30057d<? super C6231d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SleepCoachWizardConductorFragment.this.new C6231d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6231d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24540w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM76298E = SleepCoachWizardConductorFragment.this.m18601k0().getReactivationModalNavigationFlow();
                a aVar = new a(SleepCoachWizardConductorFragment.this);
                this.f24540w = 1;
                if (interfaceC13058lM76298E.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$e */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$onViewCreated$2$1$1", m100430f = "SleepCoachWizardConductorFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6232e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24543w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25820c f24545y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6232e(C25820c c25820c, InterfaceC30057d<? super C6232e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24545y = c25820c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SleepCoachWizardConductorFragment.this.new C6232e(this.f24545y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6232e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f24543w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SleepCoachWizardConductorFragment.this.m18609s0(this.f24545y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6233f implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f24546w;

        public C6233f(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f24546w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f24546w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24546w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6234g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24547w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24548x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24549y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6234g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24547w = componentCallbacks;
            this.f24548x = interfaceC35951a;
            this.f24549y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24547w;
            InterfaceC35951a interfaceC35951a = this.f24548x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24549y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6235h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24550w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6235h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24550w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f24550w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f24550w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6236i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24551w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24552x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24553y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24554z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6236i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24551w = abstractComponentCallbacksC1320m0;
            this.f24552x = interfaceC35951a;
            this.f24553y = interfaceC4339a;
            this.f24554z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, op0.e] */
        @Override // c93.InterfaceC4339a
        public final C28087e invoke() {
            return AbstractC37056f.m118952D(this.f24551w, this.f24552x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28087e.class), this.f24553y, this.f24554z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6237j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24555w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6237j(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24555w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24555w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6238k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24556w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24557x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24558y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24559z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6238k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24556w = componentCallbacks;
            this.f24557x = interfaceC35951a;
            this.f24558y = interfaceC4339a;
            this.f24559z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.o0] */
        @Override // c93.InterfaceC4339a
        public final C25845o0 invoke() {
            return AbstractC34132o.m107857B(this.f24556w, this.f24557x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25845o0.class), this.f24558y, this.f24559z);
        }
    }

    public SleepCoachWizardConductorFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.transition = AbstractC30060g.m92087G(enumC23463i, new C24958m(29));
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C6238k(this, null, new C6237j(this), null));
        this.sleepCoachToolTipViewModel = AbstractC30060g.m92087G(enumC23463i, new C6236i(this, null, new C6235h(this), null));
        this.currentFlow = EnumC25817b.COLLAPSED_STATE_FLOW;
        this.previousFlowBeforeLoading = EnumC25844o.COLLAPSED_FLOW_ON_BACK_PRESS;
        final int i13 = 0;
        this.args = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: mp0.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101786x;

            {
                this.f101786x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18591a0(this.f101786x);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18603m0(this.f101786x);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18592b0(this.f101786x);
                    default:
                        return SleepCoachWizardConductorFragment.m18593c0(this.f101786x);
                }
            }
        });
        this.coroutineScope = new C28180m(null, 1, null);
        this.callBack = new C6230c();
        final int i14 = 1;
        this.navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6234g(this, null, new InterfaceC4339a(this) { // from class: mp0.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101786x;

            {
                this.f101786x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18591a0(this.f101786x);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18603m0(this.f101786x);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18592b0(this.f101786x);
                    default:
                        return SleepCoachWizardConductorFragment.m18593c0(this.f101786x);
                }
            }
        }));
        final int i15 = 2;
        this.collapsedScene = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: mp0.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101786x;

            {
                this.f101786x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18591a0(this.f101786x);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18603m0(this.f101786x);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18592b0(this.f101786x);
                    default:
                        return SleepCoachWizardConductorFragment.m18593c0(this.f101786x);
                }
            }
        });
        final int i16 = 3;
        this.expandedScene = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: mp0.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101786x;

            {
                this.f101786x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18591a0(this.f101786x);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18603m0(this.f101786x);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18592b0(this.f101786x);
                    default:
                        return SleepCoachWizardConductorFragment.m18593c0(this.f101786x);
                }
            }
        });
        this.alarmConstraintSet = new C1153p();
    }

    /* JADX INFO: renamed from: V */
    private final void m18586V(int containerID, String fragmentTag) {
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(childFragmentManager, childFragmentManager);
        c1271aM94758g.m4068e(containerID, m18602l0(fragmentTag), fragmentTag);
        c1271aM94758g.m4067c(null);
        c1271aM94758g.m4046j();
    }

    /* JADX INFO: renamed from: W */
    private final void m18587W(int containerID, String fragmentTag) {
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(childFragmentManager, childFragmentManager);
        c1271aM94758g.m4068e(containerID, m18602l0(fragmentTag), fragmentTag);
        c1271aM94758g.m4067c(null);
        c1271aM94758g.m4069f(R.anim.fade_in, R.anim.fade_out, 0, 0);
        c1271aM94758g.m4046j();
    }

    /* JADX INFO: renamed from: X */
    private final void m18588X() {
        m18586V(AbstractC30312e.f124073F1, "SleepCoachToolBarFragmentTag");
        m18586V(AbstractC30312e.f124070E1, "SleepCoachTonightSleepFragmentTag");
    }

    /* JADX INFO: renamed from: Y */
    private final void m18589Y() {
        ConstraintLayout constraintLayout = m18595e0().f59636j;
        C25680d c25680d = new C25680d(this, 5);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(constraintLayout, c25680d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C16905q1 m18590Z(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        ConstraintLayout rootContainer = sleepCoachWizardConductorFragment.m18595e0().f59636j;
        AbstractC22676k.m65749i(rootContainer, "rootContainer");
        rootContainer.setPadding(rootContainer.getPaddingLeft(), c35643bMo47530g.f151450b, rootContainer.getPaddingRight(), rootContainer.getPaddingBottom());
        return C16905q1.f64863b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C6244f m18591a0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment) {
        return sleepCoachWizardConductorFragment.m18599i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C1153p m18592b0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment) {
        C1153p c1153p = new C1153p();
        c1153p.m3647d(sleepCoachWizardConductorFragment.requireContext(), AbstractC30313f.f124223k);
        return c1153p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C1153p m18593c0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment) {
        C1153p c1153p = new C1153p();
        c1153p.m3647d(sleepCoachWizardConductorFragment.requireContext(), AbstractC30313f.f124228p);
        return c1153p;
    }

    /* JADX INFO: renamed from: d0 */
    private final C6244f m18594d0() {
        return (C6244f) this.args.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    private final C15803l m18595e0() {
        return (C15803l) this.binding.getValue(this, f24520T[0]);
    }

    /* JADX INFO: renamed from: f0 */
    private final C1153p m18596f0() {
        return (C1153p) this.collapsedScene.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private final C1153p m18597g0() {
        return (C1153p) this.expandedScene.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final C28087e m18598h0() {
        return (C28087e) this.sleepCoachToolTipViewModel.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final C6244f m18599i0() {
        String string;
        String string2;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("entryPoint")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("clickType")) != null) {
            str = string2;
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("sourceId") : null;
        Bundle arguments4 = getArguments();
        return new C6244f(string, str, string3, arguments4 != null ? arguments4.getString("sourcePillar") : null);
    }

    /* JADX INFO: renamed from: j0 */
    private final AbstractC2974w m18600j0() {
        return (AbstractC2974w) this.transition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final C25845o0 m18601k0() {
        return (C25845o0) this.viewModel.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l0 */
    private final AbstractComponentCallbacksC1320m0 m18602l0(String fragTag) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0;
        switch (fragTag.hashCode()) {
            case -575303645:
                if (fragTag.equals("SleepCoachWizardContainerFragment")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E instanceof C25849q0 ? (C25849q0) abstractComponentCallbacksC1320m0M4140E : null;
                    return abstractComponentCallbacksC1320m0 == null ? new C25849q0() : abstractComponentCallbacksC1320m0;
                }
                break;
            case -292236824:
                if (fragTag.equals("SleepCoachSetAlarmTag")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E2 = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E2 instanceof C25858v ? (C25858v) abstractComponentCallbacksC1320m0M4140E2 : null;
                    return abstractComponentCallbacksC1320m0 == null ? new C25858v() : abstractComponentCallbacksC1320m0;
                }
                break;
            case -203781550:
                if (fragTag.equals("SleepCoachToolBarFragmentTag")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E3 = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E3 instanceof C6243e ? (C6243e) abstractComponentCallbacksC1320m0M4140E3 : null;
                    return abstractComponentCallbacksC1320m0 == null ? C6243e.INSTANCE.m18701a() : abstractComponentCallbacksC1320m0;
                }
                break;
            case -16514794:
                if (fragTag.equals("SleepCoachCollapsedFragmentTag")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E4 = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E4 instanceof C25818b0 ? (C25818b0) abstractComponentCallbacksC1320m0M4140E4 : null;
                    return abstractComponentCallbacksC1320m0 == null ? new C25818b0() : abstractComponentCallbacksC1320m0;
                }
                break;
            case 688309043:
                if (fragTag.equals("SleepCoachAlarmLoadingStateFragment")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E5 = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E5 instanceof C6242d ? (C6242d) abstractComponentCallbacksC1320m0M4140E5 : null;
                    return abstractComponentCallbacksC1320m0 == null ? C6242d.INSTANCE.m18684a(AbstractC22676k.m65745e(m18594d0().getEntryPoint(), "Notification")) : abstractComponentCallbacksC1320m0;
                }
                break;
            case 1233111476:
                if (fragTag.equals("SleepCoachVowStateFragmentTag")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E6 = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E6 instanceof C25831h0 ? (C25831h0) abstractComponentCallbacksC1320m0M4140E6 : null;
                    return abstractComponentCallbacksC1320m0 == null ? new C25831h0() : abstractComponentCallbacksC1320m0;
                }
                break;
            case 2064704717:
                if (fragTag.equals("SleepCoachTonightSleepFragmentTag")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E7 = getChildFragmentManager().m4140E(fragTag);
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E7 instanceof C25867z0 ? (C25867z0) abstractComponentCallbacksC1320m0M4140E7 : null;
                    return abstractComponentCallbacksC1320m0 == null ? new C25867z0() : abstractComponentCallbacksC1320m0;
                }
                break;
        }
        throw new IllegalArgumentException(fragTag.concat(" not a valid fragment tag"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C34911a m18603m0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment) {
        return AbstractC15751g.m44431K(sleepCoachWizardConductorFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m18604n0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment, C25820c it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC1585g0 viewLifecycleOwner = sleepCoachWizardConductorFragment.getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC1613o1.m5020j(viewLifecycleOwner).m4973b(sleepCoachWizardConductorFragment.new C6232e(it, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m18605o0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment, C25846p it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC25844o onBackPressState = it.getOnBackPressState();
        EnumC25844o enumC25844o = EnumC25844o.COLLAPSED_FLOW_ON_BACK_PRESS;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (onBackPressState != enumC25844o || !sleepCoachWizardConductorFragment.m18598h0().m84866E()) {
            return c23454a0;
        }
        AbstractC5583n.m16799z(sleepCoachWizardConductorFragment).m36410z();
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m18606p0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment, EnumC28083a enumC28083a) {
        FrameLayout overlayContainer = sleepCoachWizardConductorFragment.m18595e0().f59635i;
        AbstractC22676k.m65749i(overlayContainer, "overlayContainer");
        overlayContainer.setVisibility(enumC28083a != EnumC28083a.END_ON_BOARDING ? 0 : 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m18607q0(SleepCoachWizardConductorFragment sleepCoachWizardConductorFragment, boolean z4) {
        sleepCoachWizardConductorFragment.m18611u0(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m18608r0(C1153p c1153p) {
        if (AbstractC22676k.m65745e(this.alarmConstraintSet, c1153p) || !AbstractC22676k.m65745e(this.connected, Boolean.TRUE)) {
            return;
        }
        this.alarmConstraintSet = c1153p;
        AbstractC2938a0.m8568a(m18595e0().f59636j, m18600j0());
        c1153p.m3644a(m18595e0().f59636j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m18609s0(C25820c it) {
        this.currentFlow = it.getExpendedStateFlow();
        switch (C6229b.f24538a[it.getExpendedStateFlow().ordinal()]) {
            case 1:
            case 2:
            case 3:
                m18608r0(m18597g0());
                m18601k0().m76302I(true);
                m18587W(AbstractC30312e.f124130Y1, "SleepCoachWizardContainerFragment");
                this.previousFlowBeforeLoading = EnumC25844o.ALARM_FLOW_ON_BACK_PRESS;
                m18588X();
                return;
            case 4:
                m18608r0(m18596f0());
                m18601k0().m76302I(false);
                this.previousFlowBeforeLoading = EnumC25844o.COLLAPSED_FLOW_ON_BACK_PRESS;
                return;
            case 5:
                m18587W(AbstractC30312e.f124129Y0, "SleepCoachAlarmLoadingStateFragment");
                return;
            case 6:
                m18587W(AbstractC30312e.f124150f, "SleepCoachSetAlarmTag");
                return;
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m18610t0(C15803l c15803l) {
        this.binding.setValue(this, f24520T[0], c15803l);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m18611u0(boolean connected) {
        this.connected = Boolean.valueOf(connected);
        C15803l c15803lM18595e0 = m18595e0();
        TextView noNetworkHeader = c15803lM18595e0.f59633g;
        AbstractC22676k.m65749i(noNetworkHeader, "noNetworkHeader");
        noNetworkHeader.setVisibility(!connected ? 0 : 8);
        TextView noNetworkBody = c15803lM18595e0.f59632f;
        AbstractC22676k.m65749i(noNetworkBody, "noNetworkBody");
        noNetworkBody.setVisibility(!connected ? 0 : 8);
        ImageView noNetworkImg = c15803lM18595e0.f59634h;
        AbstractC22676k.m65749i(noNetworkImg, "noNetworkImg");
        noNetworkImg.setVisibility(!connected ? 0 : 8);
        c15803lM18595e0.f59639m.setVisibility(0);
        FragmentContainerView vowContainer = c15803lM18595e0.f59640n;
        AbstractC22676k.m65749i(vowContainer, "vowContainer");
        vowContainer.setVisibility(connected ? 0 : 8);
        FragmentContainerView tonightsSleepContainer = c15803lM18595e0.f59638l;
        AbstractC22676k.m65749i(tonightsSleepContainer, "tonightsSleepContainer");
        tonightsSleepContainer.setVisibility(connected ? 0 : 8);
        FragmentContainerView wizardContainer = c15803lM18595e0.f59641o;
        AbstractC22676k.m65749i(wizardContainer, "wizardContainer");
        wizardContainer.setVisibility(connected ? 0 : 8);
        FragmentContainerView collapsedContainer = c15803lM18595e0.f59629c;
        AbstractC22676k.m65749i(collapsedContainer, "collapsedContainer");
        collapsedContainer.setVisibility(connected ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C2937a m18612v0() {
        C2937a c2937a = new C2937a();
        c2937a.mo8581H(200L);
        return c2937a;
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
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        AbstractC28163g0.m85255k(this, 0, 0, 3, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15803l c15803lM44587c = C15803l.m44587c(inflater);
        AbstractC22676k.m65749i(c15803lM44587c, "inflate(...)");
        m18610t0(c15803lM44587c);
        ConstraintLayout constraintLayoutM44589b = m18595e0().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44589b, "getRoot(...)");
        return constraintLayoutM44589b;
    }

    @Override // fp0.AbstractC14672a, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        m18601k0().m76300G();
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C6231d(null), 3);
        super.onResume();
    }

    @Override // fp0.AbstractC14672a, hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m18589Y();
        String strM18704c = m18594d0().getSourceId();
        if (strM18704c != null) {
            m18601k0().m49139u(strM18704c);
        }
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, this.callBack);
        m18586V(AbstractC30312e.f124103P1, "SleepCoachVowStateFragmentTag");
        m18587W(AbstractC30312e.f124204x, "SleepCoachCollapsedFragmentTag");
        m18588X();
        C25845o0 c25845o0M18601k0 = m18601k0();
        final int i13 = 0;
        observe(c25845o0M18601k0.m76295B(), new C6233f(new Function1(this) { // from class: mp0.m0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101784x;

            {
                this.f101784x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18604n0(this.f101784x, (C25820c) obj);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18605o0(this.f101784x, (C25846p) obj);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18606p0(this.f101784x, (EnumC28083a) obj);
                    default:
                        return SleepCoachWizardConductorFragment.m18607q0(this.f101784x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        final int i14 = 1;
        observe(c25845o0M18601k0.getOnBackPressedHandlerLiveData(), new C6233f(new Function1(this) { // from class: mp0.m0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101784x;

            {
                this.f101784x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18604n0(this.f101784x, (C25820c) obj);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18605o0(this.f101784x, (C25846p) obj);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18606p0(this.f101784x, (EnumC28083a) obj);
                    default:
                        return SleepCoachWizardConductorFragment.m18607q0(this.f101784x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        final int i15 = 2;
        observe(m18598h0().getOnboardingStateLiveData(), new C6233f(new Function1(this) { // from class: mp0.m0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101784x;

            {
                this.f101784x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18604n0(this.f101784x, (C25820c) obj);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18605o0(this.f101784x, (C25846p) obj);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18606p0(this.f101784x, (EnumC28083a) obj);
                    default:
                        return SleepCoachWizardConductorFragment.m18607q0(this.f101784x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        m18598h0().m84871z();
        final int i16 = 3;
        observe(c25845o0M18601k0.getConnectionLiveData(), new C6233f(new Function1(this) { // from class: mp0.m0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepCoachWizardConductorFragment f101784x;

            {
                this.f101784x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return SleepCoachWizardConductorFragment.m18604n0(this.f101784x, (C25820c) obj);
                    case 1:
                        return SleepCoachWizardConductorFragment.m18605o0(this.f101784x, (C25846p) obj);
                    case 2:
                        return SleepCoachWizardConductorFragment.m18606p0(this.f101784x, (EnumC28083a) obj);
                    default:
                        return SleepCoachWizardConductorFragment.m18607q0(this.f101784x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        c25845o0M18601k0.m76301H(m18594d0().getEntryPoint(), m18594d0().getClickType(), m18594d0().getSourcePillar());
        getLog().mo85228t(AbstractC11266d.m30461o("entry point to sleep coach ", m18594d0().getEntryPoint()), new AbstractC30556a.a[0]);
    }
}
