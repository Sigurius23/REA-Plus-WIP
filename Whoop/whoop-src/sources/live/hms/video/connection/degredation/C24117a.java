package live.hms.video.connection.degredation;

import androidx.appcompat.widget.SwitchCompat;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment;
import com.whoop.clinicianintheloop.view.ClinicianSchedulingConfirmationFragment;
import com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormFragment;
import com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeFragment;
import com.whoop.coaching.sleepcoach.harvard.view.OptimalSleepView;
import com.whoop.coaching.sleepcoach.wizard.C6242d;
import com.whoop.coaching.sleepcoach.wizard.C6243e;
import com.whoop.hormonalinsights.logsymptoms.view.LogSymptomsFragment;
import com.whoop.membership.familyPlan.FamilyPlanHubFragment;
import com.whoop.motiontrackingsandbox.view.MotionTrackingSandboxFragment;
import com.whoop.p069ui.debug.IterableToolDebugFragment;
import com.whoop.p069ui.drawer.debug.DebugFeatureFlagSettingsFragment;
import com.whoop.privacyconsent.view.PrivacyConsentFragment;
import l83.C23454a0;
import live.hms.video.factories.HMSPeerConnectionFactory;
import live.hms.video.factories.SafeVariable;
import live.hms.video.media.capturers.camera.CameraControl;
import live.hms.video.sdk.models.PeerSearchResponse;
import live.hms.videoview.ZoomPanManager;
import m41.AbstractC25053e;
import mp0.AbstractC25837k0;
import mp0.C25818b0;
import mp0.C25831h0;
import mp0.C25867z0;
import mq0.C25880e;
import n41.C26271b;
import nk1.AbstractC26797c;
import nk1.C26798d;
import nq0.C27046i;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p078d1.C11457j;
import p316m1.InterfaceC24926x;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: live.hms.video.connection.degredation.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24117a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95197w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95198x;

    public /* synthetic */ C24117a(Object obj, int i13) {
        this.f95197w = i13;
        this.f95198x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95197w) {
            case 0:
                return WebRtcStatsMonitor.statsSamplingManager_delegate$lambda$0((WebRtcStatsMonitor) this.f95198x);
            case 1:
                return HMSPeerConnectionFactory.wavCapturer_delegate$lambda$5((HMSPeerConnectionFactory) this.f95198x);
            case 2:
                return SafeVariable.safeHandler_delegate$lambda$2((SafeVariable) this.f95198x);
            case 3:
                return CameraControl.imageReaderHandler_delegate$lambda$2((CameraControl) this.f95198x);
            case 4:
                return PeerSearchResponse.peers_delegate$lambda$1((PeerSearchResponse) this.f95198x);
            case 5:
                return ZoomPanManager.matrixManager_delegate$lambda$0((ZoomPanManager) this.f95198x);
            case 6:
                return OptimalSleepView.m18532d((OptimalSleepView) this.f95198x);
            case 7:
                return MotionTrackingSandboxFragment.m22912B((MotionTrackingSandboxFragment) this.f95198x);
            case 8:
                return Long.valueOf(AbstractC25053e.m73493B((C26271b) this.f95198x));
            case 9:
                return IterableToolDebugFragment.m26759R((IterableToolDebugFragment) this.f95198x);
            case 10:
                return C6242d.m18681c0((C6242d) this.f95198x);
            case 11:
                return C25818b0.m76072K0((SwitchCompat) this.f95198x);
            case 12:
                return C6243e.m18695O((C6243e) this.f95198x);
            case 13:
                return C25831h0.m76209W((C25831h0) this.f95198x);
            case 14:
                return AbstractC25837k0.m76281I((AbstractC25837k0) this.f95198x);
            case 15:
                return C25867z0.m76439b0((C25867z0) this.f95198x);
            case 16:
                return C25880e.m76495M((C25880e) this.f95198x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FamilyPlanHubFragment.m22721K((FamilyPlanHubFragment) this.f95198x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Float.valueOf(((InterfaceC24926x) this.f95198x).invoke() < 1.0f ? 0.3f : 1.0f);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Boolean bool = (Boolean) ((InterfaceC28670t2) ((C11457j) this.f95198x).f36754y).getValue();
                bool.getClass();
                return bool;
            case 20:
                InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) this.f95198x;
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                return C23454a0.f92919a;
            case 21:
                return PrivacyConsentFragment.m23344L((PrivacyConsentFragment) this.f95198x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ClinicalInsightsFragment.m17328F((ClinicalInsightsFragment) this.f95198x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26797c.m79856m((C26798d) this.f95198x);
            case 24:
                return DebugFeatureFlagSettingsFragment.m26856R((DebugFeatureFlagSettingsFragment) this.f95198x);
            case 25:
                return ClinicianSchedulingConfirmationFragment.m18481C((ClinicianSchedulingConfirmationFragment) this.f95198x);
            case 26:
                return ClinicianVideoSchedulingFormFragment.m18490E((ClinicianVideoSchedulingFormFragment) this.f95198x);
            case 27:
                return ClinicianVideoSchedulingIntakeFragment.m18498C((ClinicianVideoSchedulingIntakeFragment) this.f95198x);
            case 28:
                return LogSymptomsFragment.m21933C((LogSymptomsFragment) this.f95198x);
            default:
                return C27046i.m81195U0((C27046i) this.f95198x);
        }
    }
}
