package mp0;

import android.R;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15804m;
import j93.InterfaceC21493z;
import java.util.List;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import np0.C27020m;
import np0.EnumC27008a;
import np0.EnumC27022o;
import or2.C28216y;
import p000.AbstractC30802r;
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
import qe2.AbstractC30312e;
import qe2.AbstractC30314g;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: mp0.q0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0014X\u0094D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006>"}, m65681d2 = {"Lmp0/q0;", "Lmp0/k0;", "<init>", "()V", "Lmp0/c;", "alarmFlowOptionViewState", "Ll83/a0;", "T", "(Lmp0/c;)V", "Lnp0/m;", "viewState", "U", "(Lnp0/m;)V", "S", "R", "Q", "P", "", "fragTag", "Landroidx/fragment/app/m0;", "a0", "(Ljava/lang/String;)Landroidx/fragment/app/m0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "z", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "E", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/m;", "<set-?>", "F", "Lcom/whoop/ui/b;", "O", "()Lgf2/m;", "b0", "(Lgf2/m;)V", "binding", "Lor2/y;", "G", "Ll83/h;", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "H", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25849q0 extends AbstractC25837k0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: I */
    static final /* synthetic */ InterfaceC21493z[] f101836I = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25849q0.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepCoachWizardContainerBinding;", 0))};

    /* JADX INFO: renamed from: J */
    public static final int f101837J = 8;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String logTag = "SleepCoachWizardContainerFragment";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new d(this, null, null));

    /* JADX INFO: renamed from: mp0.q0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101842a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f101843b;

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
            f101842a = iArr;
            int[] iArr2 = new int[EnumC27022o.values().length];
            try {
                iArr2[EnumC27022o.ALARM_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC27022o.SLEEP_PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC27022o.TIME_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC27022o.COLLAPSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f101843b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mp0.q0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f101844w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f101844w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f101844w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101844w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: mp0.q0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101845w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101846x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101847y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101845w = componentCallbacks;
            this.f101846x = interfaceC35951a;
            this.f101847y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f101845w;
            InterfaceC35951a interfaceC35951a = this.f101846x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101847y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: O */
    private final C15804m m76314O() {
        return (C15804m) this.binding.getValue(this, f101836I[0]);
    }

    /* JADX INFO: renamed from: P */
    private final void m76315P() {
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(childFragmentManager, childFragmentManager);
        c1271aM94758g.m4068e(AbstractC30312e.f124137a2, m76326a0("alarmTypeFrag"), "alarmTypeFrag");
        c1271aM94758g.m4067c(null);
        c1271aM94758g.m4069f(R.anim.fade_in, R.anim.fade_out, 0, 0);
        c1271aM94758g.m4046j();
    }

    /* JADX INFO: renamed from: Q */
    private final void m76316Q() {
        List<AbstractComponentCallbacksC1320m0> listM4059f = getChildFragmentManager().f5717c.m4059f();
        AbstractC22676k.m65749i(listM4059f, "getFragments(...)");
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : listM4059f) {
            AbstractC1329o1 childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1271a c1271a = new C1271a(childFragmentManager);
            c1271a.m4050n(abstractComponentCallbacksC1320m0);
            c1271a.m4046j();
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m76317R() {
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(childFragmentManager, childFragmentManager);
        c1271aM94758g.m4068e(AbstractC30312e.f124137a2, m76326a0("sleepPercentFrag"), "sleepPercentFrag");
        c1271aM94758g.m4069f(R.anim.fade_in, R.anim.fade_out, 0, 0);
        c1271aM94758g.m4067c(null);
        c1271aM94758g.m4046j();
    }

    /* JADX INFO: renamed from: S */
    private final void m76318S() {
        AbstractC1329o1 childFragmentManager = getChildFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(childFragmentManager, childFragmentManager);
        c1271aM94758g.m4068e(AbstractC30312e.f124137a2, m76326a0("timePickerFrag"), "timePickerFrag");
        c1271aM94758g.m4067c(null);
        c1271aM94758g.m4069f(R.anim.fade_in, R.anim.fade_out, 0, 0);
        c1271aM94758g.m4046j();
    }

    /* JADX INFO: renamed from: T */
    private final void m76319T(C25820c alarmFlowOptionViewState) {
        switch (b.f101842a[alarmFlowOptionViewState.getExpendedStateFlow().ordinal()]) {
            case 1:
                m76282F().m76151c0();
                return;
            case 2:
                m76282F().m76150b0();
                return;
            case 3:
                m76282F().m76147X();
                return;
            case 4:
                m76282F().m76146V();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: U */
    private final void m76320U(C27020m viewState) {
        int i13 = b.f101843b[viewState.getCurrentScreen().ordinal()];
        if (i13 == 1) {
            m76315P();
            m76314O().f59645d.setText(getString(AbstractC30314g.f124285W));
            return;
        }
        if (i13 == 2) {
            m76317R();
            m76314O().f59645d.setText(getString(AbstractC30314g.f124287X));
        } else if (i13 == 3) {
            m76318S();
            m76314O().f59645d.setText(viewState.getCurrentAlarm().getType() == EnumC27008a.EXACT_TIME ? getString(AbstractC30314g.f124272P0) : getString(AbstractC30314g.f124270O0));
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m76316Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m76321V(C25849q0 c25849q0, C27020m it) {
        AbstractC22676k.m65750j(it, "it");
        c25849q0.m76320U(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m76322W(C25849q0 c25849q0, C25820c conductorViewState) {
        AbstractC22676k.m65750j(conductorViewState, "conductorViewState");
        c25849q0.m76319T(conductorViewState);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m76323X(C25849q0 c25849q0, C25846p it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getOnBackPressState() == EnumC25844o.ALARM_FLOW_ON_BACK_PRESS) {
            c25849q0.getChildFragmentManager().m4150T();
            c25849q0.m76282F().m76138I("Native Back");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m76324Y(C25849q0 c25849q0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25849q0.getChildFragmentManager().m4150T();
        c25849q0.m76282F().m76138I("Back Arrow");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m76325Z(C25849q0 c25849q0, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25849q0.m76282F().m76139K();
        C28216y externalLinkNavigator = c25849q0.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = c25849q0.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, c25849q0.m76282F().getSleepCoachHelpUrl(), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private final AbstractComponentCallbacksC1320m0 m76326a0(String fragTag) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0;
        int iHashCode = fragTag.hashCode();
        if (iHashCode != -1928339328) {
            if (iHashCode != -828708419) {
                if (iHashCode == 1395682893 && fragTag.equals("timePickerFrag")) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = getChildFragmentManager().m4140E("timePickerFrag");
                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E instanceof C25861w0 ? (C25861w0) abstractComponentCallbacksC1320m0M4140E : null;
                    return abstractComponentCallbacksC1320m0 == null ? new C25861w0() : abstractComponentCallbacksC1320m0;
                }
            } else if (fragTag.equals("alarmTypeFrag")) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E2 = getChildFragmentManager().m4140E("alarmTypeFrag");
                abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E2 instanceof C25830h ? (C25830h) abstractComponentCallbacksC1320m0M4140E2 : null;
                return abstractComponentCallbacksC1320m0 == null ? new C25830h() : abstractComponentCallbacksC1320m0;
            }
        } else if (fragTag.equals("sleepPercentFrag")) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E3 = getChildFragmentManager().m4140E("sleepPercentFrag");
            abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0M4140E3 instanceof C25853s0 ? (C25853s0) abstractComponentCallbacksC1320m0M4140E3 : null;
            return abstractComponentCallbacksC1320m0 == null ? new C25853s0() : abstractComponentCallbacksC1320m0;
        }
        throw new IllegalArgumentException(fragTag.concat(" not a valid fragment tag"));
    }

    /* JADX INFO: renamed from: b0 */
    private final void m76327b0(C15804m c15804m) {
        this.binding.setValue(this, f101836I[0], c15804m);
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // mp0.AbstractC25837k0, hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15804m c15804mM44591c = C15804m.m44591c(inflater);
        AbstractC22676k.m65749i(c15804mM44591c, "inflate(...)");
        m76327b0(c15804mM44591c);
        ConstraintLayout root = m76314O().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final int i13 = 0;
        observe(m76282F().getViewStateLiveData(), new c(new Function1(this) { // from class: mp0.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25849q0 f101830x;

            {
                this.f101830x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C25849q0.m76321V(this.f101830x, (C27020m) obj);
                    case 1:
                        return C25849q0.m76322W(this.f101830x, (C25820c) obj);
                    case 2:
                        return C25849q0.m76323X(this.f101830x, (C25846p) obj);
                    case 3:
                        return C25849q0.m76324Y(this.f101830x, (View) obj);
                    default:
                        return C25849q0.m76325Z(this.f101830x, (View) obj);
                }
            }
        }));
        final int i14 = 1;
        observe(m76282F().m76152y(), new c(new Function1(this) { // from class: mp0.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25849q0 f101830x;

            {
                this.f101830x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C25849q0.m76321V(this.f101830x, (C27020m) obj);
                    case 1:
                        return C25849q0.m76322W(this.f101830x, (C25820c) obj);
                    case 2:
                        return C25849q0.m76323X(this.f101830x, (C25846p) obj);
                    case 3:
                        return C25849q0.m76324Y(this.f101830x, (View) obj);
                    default:
                        return C25849q0.m76325Z(this.f101830x, (View) obj);
                }
            }
        }));
        final int i15 = 2;
        observe(m76282F().m76134C(), new c(new Function1(this) { // from class: mp0.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25849q0 f101830x;

            {
                this.f101830x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return C25849q0.m76321V(this.f101830x, (C27020m) obj);
                    case 1:
                        return C25849q0.m76322W(this.f101830x, (C25820c) obj);
                    case 2:
                        return C25849q0.m76323X(this.f101830x, (C25846p) obj);
                    case 3:
                        return C25849q0.m76324Y(this.f101830x, (View) obj);
                    default:
                        return C25849q0.m76325Z(this.f101830x, (View) obj);
                }
            }
        }));
        C15804m c15804mM76314O = m76314O();
        ImageView backButton = c15804mM76314O.f59643b;
        AbstractC22676k.m65749i(backButton, "backButton");
        final int i16 = 3;
        AbstractC1953c.m5963a(backButton, new Function1(this) { // from class: mp0.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25849q0 f101830x;

            {
                this.f101830x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return C25849q0.m76321V(this.f101830x, (C27020m) obj);
                    case 1:
                        return C25849q0.m76322W(this.f101830x, (C25820c) obj);
                    case 2:
                        return C25849q0.m76323X(this.f101830x, (C25846p) obj);
                    case 3:
                        return C25849q0.m76324Y(this.f101830x, (View) obj);
                    default:
                        return C25849q0.m76325Z(this.f101830x, (View) obj);
                }
            }
        });
        ImageView helpButton = c15804mM76314O.f59644c;
        AbstractC22676k.m65749i(helpButton, "helpButton");
        final int i17 = 4;
        AbstractC1953c.m5963a(helpButton, new Function1(this) { // from class: mp0.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25849q0 f101830x;

            {
                this.f101830x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        return C25849q0.m76321V(this.f101830x, (C27020m) obj);
                    case 1:
                        return C25849q0.m76322W(this.f101830x, (C25820c) obj);
                    case 2:
                        return C25849q0.m76323X(this.f101830x, (C25846p) obj);
                    case 3:
                        return C25849q0.m76324Y(this.f101830x, (View) obj);
                    default:
                        return C25849q0.m76325Z(this.f101830x, (View) obj);
                }
            }
        });
    }
}
