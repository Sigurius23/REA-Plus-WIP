package mp0;

import android.content.ComponentCallbacks;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cp0.C11012z;
import gf2.AbstractC15810s;
import gf2.C15806o;
import j93.InterfaceC21493z;
import kp0.AbstractC22748o;
import kp0.C22737d;
import kp0.C22744k;
import kp0.C22745l;
import kp0.C22746m;
import kp0.C22750q;
import kp0.C22751r;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import lq0.C24656d;
import m83.AbstractC25265s;
import np0.AbstractC27021n;
import np0.C27017j;
import np0.C27020m;
import np0.EnumC27008a;
import np0.EnumC27022o;
import p000.AbstractC11266d;
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
import qe2.AbstractC30309b;
import qe2.AbstractC30311d;
import qe2.AbstractC30312e;
import qe2.AbstractC30314g;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: mp0.s0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"R+\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00106\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, m65681d2 = {"Lmp0/s0;", "Lmp0/k0;", "<init>", "()V", "Ll83/a0;", "T", "Lnp0/n;", "flow", "V", "(Lnp0/n;)V", "W", "Lnp0/a;", "alarmType", "wizardFlow", "U", "(Lnp0/a;Lnp0/n;)V", "Lgf2/s;", "sleepGoalContainer", "S", "(Lgf2/s;Lnp0/a;)V", "", "O", "(Lnp0/a;Lnp0/n;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lgf2/o;", "<set-?>", "z", "Lcom/whoop/ui/b;", "M", "()Lgf2/o;", "R", "(Lgf2/o;)V", "binding", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "Ll83/h;", "N", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "F", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "G", "I", "currentSelection", "H", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25853s0 extends AbstractC25837k0 {

    /* JADX INFO: renamed from: I */
    static final /* synthetic */ InterfaceC21493z[] f101902I = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25853s0.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentSleepPercentWizardBinding;", 0))};

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J */
    public static final int f101903J = 8;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker = AbstractC30060g.m92087G(EnumC23463i.f92933w, new d(this, null, null));

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String logTag = "SleepPercentWizardFragment";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int currentSelection = -1;

    /* JADX INFO: renamed from: mp0.s0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lmp0/s0$a;", "", "<init>", "()V", "", "selectedRadioId", "Landroid/content/res/Resources;", "resources", "Lkp0/q;", "weeklyGoal", "Lkp0/r;", "weeklyGoalSleep", "Lkp0/k;", "optimizeSleep", "Lkp0/o;", "c", "(ILandroid/content/res/Resources;Lkp0/q;Lkp0/r;Lkp0/k;)Lkp0/o;", "setting", "", "isWeeklyPlanV2SleepFFOn", "a", "(Lkp0/o;Z)I", "sleepGoalSetting", "b", "(Lkp0/o;)I", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m76375a(AbstractC22748o setting, boolean isWeeklyPlanV2SleepFFOn) {
            AbstractC22676k.m65750j(setting, "setting");
            if (setting instanceof C22745l) {
                return AbstractC30312e.f124075G0;
            }
            if (setting instanceof C22746m) {
                return AbstractC30312e.f124078H0;
            }
            if (setting instanceof C22737d) {
                return AbstractC30312e.f124069E0;
            }
            if (setting instanceof C22750q) {
                return AbstractC30312e.f124081I0;
            }
            if (setting instanceof C22751r) {
                return isWeeklyPlanV2SleepFFOn ? AbstractC30312e.f124087K0 : AbstractC30312e.f124084J0;
            }
            if (setting instanceof C22744k) {
                return AbstractC30312e.f124072F0;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final int m76376b(AbstractC22748o sleepGoalSetting) {
            AbstractC22676k.m65750j(sleepGoalSetting, "sleepGoalSetting");
            if (sleepGoalSetting instanceof C22744k) {
                return 0;
            }
            if (sleepGoalSetting instanceof C22745l) {
                return 1;
            }
            if (sleepGoalSetting instanceof C22746m) {
                return 2;
            }
            if (sleepGoalSetting instanceof C22737d) {
                return 3;
            }
            if (sleepGoalSetting instanceof C22750q) {
                return 4;
            }
            if (sleepGoalSetting instanceof C22751r) {
                return 5;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC22748o m76377c(int selectedRadioId, Resources resources, C22750q weeklyGoal, C22751r weeklyGoalSleep, C22744k optimizeSleep) {
            AbstractC22676k.m65750j(resources, "resources");
            if (selectedRadioId == AbstractC30312e.f124075G0) {
                return C22745l.f89475z;
            }
            if (selectedRadioId == AbstractC30312e.f124078H0) {
                return C22746m.f89477z;
            }
            if (selectedRadioId == AbstractC30312e.f124069E0) {
                return C22737d.f89416z;
            }
            if (selectedRadioId == AbstractC30312e.f124081I0) {
                return weeklyGoal == null ? C22745l.f89475z : weeklyGoal;
            }
            if (selectedRadioId == AbstractC30312e.f124084J0 || selectedRadioId == AbstractC30312e.f124087K0) {
                return weeklyGoalSleep == null ? C22745l.f89475z : weeklyGoalSleep;
            }
            if (selectedRadioId == AbstractC30312e.f124072F0) {
                return optimizeSleep == null ? C22745l.f89475z : optimizeSleep;
            }
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Unknown radio button id ", resources.getResourceName(selectedRadioId)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: mp0.s0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101908a;

        static {
            int[] iArr = new int[EnumC27008a.values().length];
            try {
                iArr[EnumC27008a.EXACT_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27008a.SLEEP_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27008a.IN_THE_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101908a = iArr;
        }
    }

    /* JADX INFO: renamed from: mp0.s0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f101909w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f101909w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f101909w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101909w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: mp0.s0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101910w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101911x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101912y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101910w = componentCallbacks;
            this.f101911x = interfaceC35951a;
            this.f101912y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f101910w;
            InterfaceC35951a interfaceC35951a = this.f101911x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101912y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: M */
    private final C15806o m76363M() {
        return (C15806o) this.binding.getValue(this, f101902I[0]);
    }

    /* JADX INFO: renamed from: N */
    private final FeatureFlagChecker m76364N() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final String m76365O(EnumC27008a alarmType, AbstractC27021n wizardFlow) {
        int i13 = b.f101908a[alarmType.ordinal()];
        if (i13 == 1) {
            String string = getString(AbstractC30314g.f124266M0);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wizardFlow instanceof C27017j) {
            String string2 = getString(AbstractC30314g.f124242D0);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }
        String string3 = getString(AbstractC30314g.f124314h);
        AbstractC22676k.m65749i(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m76366P(C25853s0 c25853s0, boolean z4, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C27020m it) {
        AbstractC22676k.m65750j(it, "it");
        c25853s0.m76371U(it.getCurrentAlarm().getType(), it.getWizardFlow());
        Companion companion = INSTANCE;
        int iM76375a = companion.m76375a(it.getCurrentAlarm().getSleepPercent(), z4);
        AbstractC15810s abstractC15810s = c25853s0.m76363M().f59653e;
        if (AbstractC25855t0.m76380c(c25853s0.m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS), it.getWizardFlow(), it)) {
            radioButton.setVisibility(it.getWeeklyGoal() != null ? 0 : 8);
            if (z4) {
                radioButton2.setVisibility(it.getWeeklyGoalSleep() != null ? 0 : 8);
            } else {
                radioButton3.setVisibility(it.getWeeklyGoalSleep() != null ? 0 : 8);
            }
            C22750q c22750qM81014g = it.getWeeklyGoal();
            abstractC15810s.mo44616i(c22750qM81014g != null ? c22750qM81014g.getValue().intValue() : 0);
            C22751r c22751rM81015h = it.getWeeklyGoalSleep();
            abstractC15810s.mo44615h(c22751rM81015h != null ? c22751rM81015h.getText() : null);
        }
        abstractC15810s.f59685h.check(iM76375a);
        if (!c25853s0.m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS)) {
            abstractC15810s.mo44614g(companion.m76376b(it.getCurrentAlarm().getSleepPercent()));
        }
        c25853s0.m76370T();
        c25853s0.m76372V(it.getWizardFlow());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m76367Q(C25853s0 c25853s0, C15806o c15806o, View it) {
        AbstractC22676k.m65750j(it, "it");
        C25819b1 c25819b1M76282F = c25853s0.m76282F();
        Companion companion = INSTANCE;
        int checkedRadioButtonId = c15806o.f59653e.f59685h.getCheckedRadioButtonId();
        Resources resources = c25853s0.getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        C27020m c27020m = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
        C22750q c22750qM81014g = c27020m != null ? c27020m.getWeeklyGoal() : null;
        C27020m c27020m2 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
        C22751r c22751rM81015h = c27020m2 != null ? c27020m2.getWeeklyGoalSleep() : null;
        C27020m c27020m3 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
        c25819b1M76282F.m76142O(companion.m76377c(checkedRadioButtonId, resources, c22750qM81014g, c22751rM81015h, c27020m3 != null ? c27020m3.getOptimizeSleep() : null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final void m76368R(C15806o c15806o) {
        this.binding.setValue(this, f101902I[0], c15806o);
    }

    /* JADX INFO: renamed from: S */
    private final void m76369S(AbstractC15810s sleepGoalContainer, EnumC27008a alarmType) {
        RadioGroup sleepGoalRadioGroup = sleepGoalContainer.f59685h;
        AbstractC22676k.m65749i(sleepGoalRadioGroup, "sleepGoalRadioGroup");
        int childCount = sleepGoalRadioGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = sleepGoalRadioGroup.getChildAt(i13);
            RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
            if (radioButton != null) {
                if (alarmType == EnumC27008a.EXACT_TIME) {
                    radioButton.setButtonDrawable(AbstractC30311d.f124035f);
                    radioButton.setTextColor(radioButton.getResources().getColorStateList(AbstractC30309b.f124024b, null));
                } else {
                    radioButton.setButtonDrawable(AbstractC30311d.f124034e);
                    radioButton.setTextColor(radioButton.getResources().getColorStateList(AbstractC30309b.f124023a, null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m76370T() {
        AbstractC15810s abstractC15810s = m76363M().f59653e;
        if (m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS)) {
            abstractC15810s.f59680c.setText(getString(AbstractC30314g.f124299c));
            abstractC15810s.f59682e.setText(m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2) ? getString(AbstractC30314g.f124293a) : getString(AbstractC30314g.f124305e));
            abstractC15810s.f59681d.setText(getString(AbstractC30314g.f124302d));
            abstractC15810s.f59678a.setText(getString(AbstractC30314g.f124296b));
            return;
        }
        abstractC15810s.f59680c.setText(getString(abstractC15810s.m44612e() == 1 ? AbstractC30314g.f124288X0 : AbstractC30314g.f124286W0));
        abstractC15810s.f59681d.setText(getString(abstractC15810s.m44612e() == 2 ? AbstractC30314g.f124292Z0 : AbstractC30314g.f124290Y0));
        abstractC15810s.f59678a.setText(getString(abstractC15810s.m44612e() == 3 ? AbstractC30314g.f124284V0 : AbstractC30314g.f124282U0));
        abstractC15810s.f59682e.setText(getString(abstractC15810s.m44612e() == 4 ? AbstractC30314g.f124258I1 : AbstractC30314g.f124295a1, Integer.valueOf(abstractC15810s.m44613f())));
    }

    /* JADX INFO: renamed from: U */
    private final void m76371U(EnumC27008a alarmType, AbstractC27021n wizardFlow) {
        C15806o c15806oM76363M = m76363M();
        if (alarmType == EnumC27008a.SLEEP_GOAL) {
            ((RadioButton) m76363M().f59653e.f59685h.findViewById(AbstractC30312e.f124072F0)).setVisibility(8);
        }
        AbstractC15810s sleepGoalContainer = c15806oM76363M.f59653e;
        AbstractC22676k.m65749i(sleepGoalContainer, "sleepGoalContainer");
        m76369S(sleepGoalContainer, alarmType);
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        c15806oM76363M.f59652d.setTextColor(AbstractC25839l0.m76288a(((Number) AbstractC25839l0.m76290c(resources, alarmType).f92937w).intValue(), getResources().getColor(AbstractC36510a.f156023c0, null)));
        c15806oM76363M.f59652d.setText(m76365O(alarmType, wizardFlow));
    }

    /* JADX INFO: renamed from: V */
    private final void m76372V(AbstractC27021n flow) {
        RadioButton radioButton = (RadioButton) m76363M().f59653e.f59685h.findViewById(AbstractC30312e.f124072F0);
        boolean z4 = AbstractC25265s.m74100H0(flow.m81017a()) == EnumC27022o.ALARM_MODE;
        if (!m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS) || z4) {
            radioButton.setVisibility(8);
            AbstractC15810s abstractC15810s = m76363M().f59653e;
            abstractC15810s.f59681d.setVisibility(0);
            abstractC15810s.f59678a.setVisibility(0);
            return;
        }
        radioButton.setVisibility(0);
        AbstractC15810s abstractC15810s2 = m76363M().f59653e;
        abstractC15810s2.f59680c.setText(getString(AbstractC30314g.f124368z));
        abstractC15810s2.f59681d.setVisibility(8);
        abstractC15810s2.f59678a.setVisibility(8);
    }

    /* JADX INFO: renamed from: W */
    private final void m76373W() {
        final AbstractC15810s abstractC15810s = m76363M().f59653e;
        abstractC15810s.f59685h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: mp0.r0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i13) {
                C25853s0.m76374X(this.f101850a, abstractC15810s, radioGroup, i13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m76374X(C25853s0 c25853s0, AbstractC15810s abstractC15810s, RadioGroup button, int i13) {
        AbstractC22676k.m65750j(button, "button");
        if (c25853s0.currentSelection != i13) {
            c25853s0.currentSelection = i13;
            if (!c25853s0.m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.OPTIMAL_BEDTIME_RECS)) {
                Companion companion = INSTANCE;
                int checkedRadioButtonId = button.getCheckedRadioButtonId();
                Resources resources = c25853s0.getResources();
                AbstractC22676k.m65749i(resources, "getResources(...)");
                C27020m c27020m = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
                C22750q c22750qM81014g = c27020m != null ? c27020m.getWeeklyGoal() : null;
                C27020m c27020m2 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
                C22751r c22751rM81015h = c27020m2 != null ? c27020m2.getWeeklyGoalSleep() : null;
                C27020m c27020m3 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
                abstractC15810s.mo44614g(companion.m76376b(companion.m76377c(checkedRadioButtonId, resources, c22750qM81014g, c22751rM81015h, c27020m3 != null ? c27020m3.getOptimizeSleep() : null)));
            }
            C25819b1 c25819b1M76282F = c25853s0.m76282F();
            Companion companion2 = INSTANCE;
            int i14 = c25853s0.currentSelection;
            Resources resources2 = c25853s0.getResources();
            AbstractC22676k.m65749i(resources2, "getResources(...)");
            C27020m c27020m4 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
            C22750q c22750qM81014g2 = c27020m4 != null ? c27020m4.getWeeklyGoal() : null;
            C27020m c27020m5 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
            C22751r c22751rM81015h2 = c27020m5 != null ? c27020m5.getWeeklyGoalSleep() : null;
            C27020m c27020m6 = (C27020m) c25853s0.m76282F().getViewStateLiveData().getValue();
            c25819b1M76282F.m76141N(companion2.m76377c(i14, resources2, c22750qM81014g2, c22751rM81015h2, c27020m6 != null ? c27020m6.getOptimizeSleep() : null));
        }
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15806o c15806oM44598c = C15806o.m44598c(inflater);
        AbstractC22676k.m65749i(c15806oM44598c, "inflate(...)");
        m76368R(c15806oM44598c);
        NestedScrollView nestedScrollViewM44600b = m76363M().getRoot();
        AbstractC22676k.m65749i(nestedScrollViewM44600b, "getRoot(...)");
        return nestedScrollViewM44600b;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m76373W();
        RadioButton radioButton = (RadioButton) m76363M().f59653e.f59685h.findViewById(AbstractC30312e.f124081I0);
        RadioButton radioButton2 = (RadioButton) m76363M().f59653e.f59685h.findViewById(AbstractC30312e.f124084J0);
        observe(m76282F().getViewStateLiveData(), new c(new C11012z(3, this, radioButton, (RadioButton) m76363M().f59653e.f59685h.findViewById(AbstractC30312e.f124087K0), radioButton2, m76364N().isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2))));
        C15806o c15806oM76363M = m76363M();
        StrokedPillButton saveUserPreferences = c15806oM76363M.f59652d;
        AbstractC22676k.m65749i(saveUserPreferences, "saveUserPreferences");
        AbstractC1953c.m5963a(saveUserPreferences, new C24656d(16, this, c15806oM76363M));
    }
}
