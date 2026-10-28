package oe2;

import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsentUi;
import com.whoop.advancedlabs.testhistory.view.TestHistoryFragment;
import com.whoop.advancedlabsmanagement.view.AdvancedLabsManagementFragment;
import com.whoop.aiinsights.AiInsightsFragment;
import com.whoop.challengedetails.view.ChallengeDetailsFragment;
import com.whoop.core.details.view.CoreDetailsFragment;
import com.whoop.debug.battery.BatteryDebugFragment;
import com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment;
import com.whoop.debug.experiments.ExperimentsDebugFragment;
import com.whoop.hormonalinsights.pregnancyinsights.view.PregnancyInsightsFragment;
import com.whoop.impacts.details.view.BehaviorDetailsFragment;
import com.whoop.settings.regulatorylabels.SettingsRegulatoryLabelsFragment;
import com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment;
import com.whoop.shepherd.fragment.ShepherdOnboardingFragment;
import com.whoop.shepherd.fragment.ShepherdRegistrationFragment;
import com.whoop.shepherd.fragment.ShepherdSubmitTermsOfUseFragment;
import com.whoop.shepherd.fragment.ShepherdTermsOfUseFragment;
import com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment;
import com.whoop.stress.view.StressMonitorFragment;
import com.whoop.stress.view.StressSessionFragment;
import com.whoop.training.locationsettings.view.LocationSettingsFragment;
import com.whoop.universalcheckout.features.UniversalCheckoutFragment;
import l83.C23454a0;
import m72.C25211j;
import nt1.C27130i;
import os0.AbstractC28307c;
import p00.AbstractC28571h;
import p00.C28578o;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32073e;
import p725ot1.AbstractC28328d;
import p730qt2.AbstractC30598d0;
import p730qt2.AbstractC30603i;
import p730qt2.C30596c0;
import p730qt2.C30602h;
import p90.AbstractC28996d;
import p90.C29002j;
import q72.AbstractC30020c;
import qa2.C30114b;

/* JADX INFO: renamed from: oe2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27878c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112419w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f112420x;

    public /* synthetic */ C27878c(Object obj, int i13) {
        this.f112419w = i13;
        this.f112420x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112419w) {
            case 0:
                return ShepherdNotificationHistoryFragment.m25865F((ShepherdNotificationHistoryFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return ShepherdOnboardingFragment.m25876F((ShepherdOnboardingFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return ShepherdRegistrationFragment.m25880A((ShepherdRegistrationFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return ShepherdSubmitTermsOfUseFragment.m25886C((ShepherdSubmitTermsOfUseFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return ShepherdTermsOfUseFragment.m25898G((ShepherdTermsOfUseFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return ShepherdToggleSettingsFragment.m25906E((ShepherdToggleSettingsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return BehaviorDetailsFragment.m22204D((BehaviorDetailsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC28307c.m85764k((ComposeView) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC28328d.m85850k((C27130i) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return CoreDetailsFragment.m19759I((CoreDetailsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return BatteryDebugFragment.m20019B((BatteryDebugFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                ((Integer) obj2).getClass();
                AbstractC28571h.m86899b((ConsentUi.ConsentSection) this.f112420x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC32073e.m99747h((C28578o) this.f112420x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 13:
                return AbstractC28996d.m88024M((C29002j) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return SettingsRegulatoryLabelsFragment.m25707B((SettingsRegulatoryLabelsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AiInsightsFragment.m17848P((AiInsightsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return StressMonitorFragment.m26430f0((StressMonitorFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return StressSessionFragment.m26465g0((StressSessionFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ChallengeDetailsFragment.m18406G((ChallengeDetailsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return UniversalCheckoutFragment.m27533P((UniversalCheckoutFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return PregnancyInsightsFragment.m22145P((PregnancyInsightsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return DismissalPlaygroundFragment.m20034L((DismissalPlaygroundFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30020c.m91901d((C25211j) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C30114b.m92251G((C30114b) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return TestHistoryFragment.m17602H((TestHistoryFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AdvancedLabsManagementFragment.m17729D((AdvancedLabsManagementFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return LocationSettingsFragment.m26549A((LocationSettingsFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC30603i.m93890d((C30602h) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AbstractC30598d0.m93870d((C30596c0) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return ExperimentsDebugFragment.m20052B((ExperimentsDebugFragment) this.f112420x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C27878c(Object obj, int i13, int i14) {
        this.f112419w = i14;
        this.f112420x = obj;
    }
}
