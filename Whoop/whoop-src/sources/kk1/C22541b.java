package kk1;

import android.graphics.RectF;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsentUi;
import com.whoop.achievements.celebration.AchievementCelebrationDialogFragment;
import com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextFragment;
import com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment;
import com.whoop.healthspan.view.HealthspanFragment;
import com.whoop.membership.extensions.view.MembershipExtensionsFragment;
import com.whoop.motiontrackingsandbox.view.MotionTrackingSandboxFragment;
import com.whoop.p069ui.views.C10627a;
import com.whoop.p069ui.views.NewStrapSettingsBatteryIndicator;
import com.whoop.pairing.p066ui.view.PairingFragment;
import com.whoop.sage.onboarding.view.SageOnboardingFragment;
import com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment;
import com.whoop.stories.OnboardingStoriesDebugFragment;
import com.whoop.strava.view.StravaFragment;
import com.whoop.training.hrsettings.view.fragment.HrSettingsFragment;
import com.whoop.user.journey.view.UserJourneyFragment;
import java.util.LinkedHashMap;
import l00.AbstractC23024f;
import l01.AbstractC23046r;
import l01.C23047s;
import l03.C23058h;
import l83.C23454a0;
import l83.C23465k;
import ld0.C23842a;
import lf0.AbstractC23898b;
import lf0.AbstractC23937k2;
import lf0.AbstractC23978v1;
import lf0.C23941l2;
import lf0.C23981w1;
import live.hms.video.error.HMSException;
import live.hms.video.transport.HMSTransport;
import live.hms.video.transport.models.TransportState;
import lw1.AbstractC24772h;
import lw1.C24773i;
import m00.C24872d;
import mf0.AbstractC25506e;
import mp0.C25831h0;
import p026b2.InterfaceC2300f;
import p077d0.C11362i1;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p213i7.C18194g;
import p292l1.C23069b2;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p292l1.InterfaceC23098g1;
import p316m1.C24893b0;
import p390p1.AbstractC28683x;
import p636y3.C39169a;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: kk1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22541b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88609w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f88610x;

    public /* synthetic */ C22541b(Object obj, int i13) {
        this.f88609w = i13;
        this.f88610x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01ef A[PHI: r11
      0x01ef: PHI (r11v31 l1.x3) = (r11v30 l1.x3), (r11v33 l1.x3), (r11v34 l1.x3) binds: [B:68:0x01ed, B:60:0x01d5, B:63:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        EnumC23202x3 enumC23202x3;
        boolean zM47204j;
        switch (this.f88609w) {
            case 0:
                return HealthspanFragment.m21655N((HealthspanFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return NewStrapSettingsBatteryIndicator.m27458n((C10627a) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return UserJourneyFragment.m27774Z((UserJourneyFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return MembershipExtensionsFragment.m22696o0((MembershipExtensionsFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return Integer.valueOf(((InterfaceC2300f) this.f88610x).mo7155a(0, ((Integer) obj).intValue(), (EnumC39181m) obj2));
            case 5:
                ((Integer) obj2).getClass();
                AbstractC23024f.m66792k((ConsentUi.ConsentPane.ScopesSection) this.f88610x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 6:
                return AbstractC23046r.m66968m((C23047s) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return C23058h.m67025S((C23058h) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return (C11362i1) this.f88610x;
            case 9:
                ((Integer) obj2).getClass();
                ((C23069b2) this.f88610x).mo3598a((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 10:
                C23196w3 c23196w3 = (C23196w3) this.f88610x;
                C39180l c39180l = (C39180l) obj;
                float fM124764h = C39169a.m124764h(((C39169a) obj2).f168407a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                EnumC23202x3 enumC23202x4 = EnumC23202x3.f91820w;
                linkedHashMap.put(enumC23202x4, Float.valueOf(fM124764h));
                if (((int) (c39180l.f168422a & 4294967295L)) > fM124764h / 2 && !c23196w3.f91783a) {
                    linkedHashMap.put(EnumC23202x3.f91822y, Float.valueOf(fM124764h / 2.0f));
                }
                int i13 = (int) (4294967295L & c39180l.f168422a);
                if (i13 != 0) {
                    linkedHashMap.put(EnumC23202x3.f91821x, Float.valueOf(Math.max(0.0f, fM124764h - i13)));
                }
                C24893b0 c24893b0 = new C24893b0(linkedHashMap);
                int iOrdinal = ((EnumC23202x3) c23196w3.f91787e.f97548h.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        enumC23202x3 = EnumC23202x3.f91821x;
                        if (linkedHashMap.containsKey(enumC23202x3)) {
                            enumC23202x4 = enumC23202x3;
                        }
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        enumC23202x3 = EnumC23202x3.f91822y;
                        if (linkedHashMap.containsKey(enumC23202x3)) {
                            enumC23202x4 = enumC23202x3;
                        } else {
                            enumC23202x3 = EnumC23202x3.f91821x;
                            if (linkedHashMap.containsKey(enumC23202x3)) {
                                enumC23202x4 = enumC23202x3;
                            }
                        }
                    }
                }
                return new C23465k(c24893b0, enumC23202x4);
            case 11:
                C18194g c18194g = (C18194g) this.f88610x;
                C16618c c16618cM51509K = AbstractC17918w0.m51509K((RectF) obj);
                C16618c c16618cM51509K2 = AbstractC17918w0.m51509K((RectF) obj2);
                switch (c18194g.f70576w) {
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        zM47204j = c16618cM51509K.m47204j(c16618cM51509K2);
                        break;
                    default:
                        zM47204j = c16618cM51509K2.m47196a(c16618cM51509K.m47198d());
                        break;
                }
                return Boolean.valueOf(zM47204j);
            case 12:
                return AchievementCelebrationDialogFragment.m17009U((AchievementCelebrationDialogFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return SageOnboardingFragment.m24421K((SageOnboardingFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return HormonalContextFragment.m17449F((HormonalContextFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return SchedulingStepFragment.m17588R((SchedulingStepFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC23898b.m70203h((C23842a) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23978v1.m70748d((C23981w1) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23937k2.m70448d((C23941l2) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return OnboardingStoriesDebugFragment.m26125N((OnboardingStoriesDebugFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return StravaFragment.m26332L((StravaFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return HMSTransport.retryScheduler$lambda$1((HMSTransport) this.f88610x, (TransportState) obj, (HMSException) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HrSettingsFragment.m26548z((HrSettingsFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC24772h.m72582m((C24773i) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return MotionTrackingSandboxFragment.m22911A((MotionTrackingSandboxFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                ((Integer) obj2).getClass();
                AbstractC3269g.m9501e((C24872d) this.f88610x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 26:
                return PairingFragment.m23212Q((PairingFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC25506e.m74965o0((InterfaceC23098g1) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return SleepWakeTimeScheduleListFragment.m25953N((SleepWakeTimeScheduleListFragment) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return C25831h0.m76210X((C25831h0) this.f88610x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C22541b(Object obj, int i13, int i14) {
        this.f88609w = i14;
        this.f88610x = obj;
    }
}
