package ci0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.add.activity.view.AddActivityFragment;
import com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment;
import com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment;
import com.whoop.amoeba.debug.view.AmoebaDebugFragment;
import com.whoop.bot.settings.CoachSettingsFragment;
import com.whoop.changepassword.view.ChangePasswordV2Fragment;
import com.whoop.healthmonitor.view.ComposableHealthMonitorFragment;
import com.whoop.healthmonitor.view.ComposableHealthReportFragment;
import com.whoop.helpcenter.view.fragment.HelpCenterFragment;
import com.whoop.labrador.fragment.LabradorAboutFragment;
import com.whoop.labrador.fragment.LabradorDetailsFragment;
import com.whoop.labrador.fragment.LabradorDeviceLocationFragment;
import com.whoop.labrador.fragment.LabradorEligibilityFragment;
import com.whoop.labrador.fragment.LabradorReadingFragment;
import com.whoop.labrador.fragment.LabradorRegistrationFragment;
import com.whoop.labrador.fragment.LabradorSubmitEligibilityFragment;
import com.whoop.membership.view.upcycle.UpcycleLandingFragment;
import com.whoop.p069ui.onboarding.dayzero.DayZeroSplashDialogFragment;
import com.whoop.profile.view.ProfileFragment;
import com.whoop.settings.WakeUpAutopopHeightTesterFragment;
import com.whoop.sms.setup.view.SmsSetupFragment;
import cr2.AbstractC11090f;
import cr2.C11087c;
import d01.AbstractC11440e;
import d01.C11441f;
import d62.AbstractC11741g;
import d62.C11742h;
import d81.AbstractC11775c;
import d81.C11776d;
import d91.AbstractC11817e;
import dd2.C11971a;
import dl1.AbstractC12170d;
import e11.AbstractC12583c;
import e11.C12584d;
import fd2.EnumC14403a;
import fd2.EnumC14404b;
import hy0.C17731c2;
import p291l0.C23016z;
import xf3.C38266c;
import xk1.C38429c;

/* JADX INFO: renamed from: ci0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4726a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19318w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f19319x;

    public /* synthetic */ C4726a(Object obj, int i13) {
        this.f19318w = i13;
        this.f19319x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19318w) {
            case 0:
                return AmoebaDebugFragment.m17864D((AmoebaDebugFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return ComposableHealthMonitorFragment.m21585T((ComposableHealthMonitorFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return ComposableHealthReportFragment.m21597F((ComposableHealthReportFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return HelpCenterFragment.m21669F((HelpCenterFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return CoachSettingsFragment.onCreateView$lambda$0((CoachSettingsFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return ProfileFragment.onCreateView$lambda$0((ProfileFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC11090f.m29940d((C11087c) this.f19319x, C23016z.f90757a, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return LabradorAboutFragment.m22438D((LabradorAboutFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return LabradorDetailsFragment.m22466Y((LabradorDetailsFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return LabradorDeviceLocationFragment.m22484D((LabradorDeviceLocationFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return LabradorEligibilityFragment.m22494E((LabradorEligibilityFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return LabradorReadingFragment.m22503F((LabradorReadingFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return LabradorRegistrationFragment.m22509A((LabradorRegistrationFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return LabradorSubmitEligibilityFragment.m22516D((LabradorSubmitEligibilityFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return UpcycleLandingFragment.m22858H((UpcycleLandingFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC11440e.m30698f((C11441f) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC11741g.m31399H((C17731c2) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC11741g.m31395D((C11742h) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC11775c.m31566e((C11776d) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC11817e.m31685k((AbstractC11817e) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return BiomarkerDetailsFragment.m17290P((BiomarkerDetailsFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return EditTestDetailsFragment.m17433M((EditTestDetailsFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C11971a.m32965l((C38266c) this.f19319x, (EnumC14403a) obj, (EnumC14404b) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12170d.m33671u((C38429c) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return DayZeroSplashDialogFragment.m27355E((DayZeroSplashDialogFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return ChangePasswordV2Fragment.m18419H((ChangePasswordV2Fragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC12583c.m35268h((C12584d) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AddActivityFragment.m17237V((AddActivityFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return WakeUpAutopopHeightTesterFragment.m25302C((WakeUpAutopopHeightTesterFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return SmsSetupFragment.m25974E((SmsSetupFragment) this.f19319x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
