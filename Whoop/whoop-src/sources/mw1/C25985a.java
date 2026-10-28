package mw1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1637w1;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment;
import com.whoop.clinicianintheloop.view.ClinicianSchedulingConfirmationFragment;
import com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormFragment;
import com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeFragment;
import com.whoop.core.details.sleep.view.SleepDetailsFragment;
import com.whoop.hormonalinsights.logsymptoms.view.LogSymptomsFragment;
import com.whoop.memberdataexport.p063ui.MemberDataExportFragment;
import com.whoop.memberdataexport.p063ui.SubmissionCompleteFragment;
import com.whoop.memberdataexport.p063ui.SubmitMemberDataExportFragment;
import com.whoop.membership.familyPlan.FamilyPlanHubFragment;
import com.whoop.p069ui.drawer.debug.DebugFeatureFlagSettingsFragment;
import com.whoop.privacyconsent.view.PrivacyConsentFragment;
import com.whoop.sage.view.SageFragment;
import com.whoop.shepherd.fragment.ShepherdAboutFragment;
import com.whoop.shepherd.fragment.ShepherdDetailsFragment;
import com.whoop.user.journey.yearinreviewraf.YirRafFragment;
import com.whoop.whattoexpect.view.WhatToExpectFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25235a0;
import n00.C26083k;
import n03.C26095f;
import n03.C26096g;
import n03.C26097h;
import n03.C26098i;
import n03.C26099j;
import n03.C26100k;
import o00.C27344b;
import o01.AbstractC27346b;
import o01.C27347c;
import o21.AbstractC27464b;
import o21.C27465c;
import o51.AbstractC27537c;
import o51.C27539e;
import o52.C27548d0;
import p326mf.C25483c;
import p390p1.AbstractC28683x;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: mw1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25985a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102686w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f102687x;

    public /* synthetic */ C25985a(AbstractC1637w1 abstractC1637w1, int i13, int i14) {
        this.f102686w = i14;
        this.f102687x = abstractC1637w1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f102686w) {
            case 0:
                return FamilyPlanHubFragment.m22717G((FamilyPlanHubFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                AbstractC32411b.m101106r((C26083k) this.f102687x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 2:
                return C26095f.m77627z((C26095f) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return C26096g.m77635z((C26096g) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return C26097h.m77643z((C26097h) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C26098i.m77651z((C26098i) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return C26099j.m77659z((C26099j) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return C26100k.m77666y((C26100k) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return PrivacyConsentFragment.m23340H((PrivacyConsentFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return ClinicalInsightsFragment.m17329G((ClinicalInsightsFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                C35937b c35937b = (C35937b) this.f102687x;
                String key = (String) obj;
                List values = (List) obj2;
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(values, "values");
                C25483c c25483c = c35937b.f153017y;
                List list = values;
                c25483c.getClass();
                List list2 = (List) ((Map) c25483c.f475x).get(key);
                Set setM74103I1 = list2 != null ? AbstractC25265s.m74103I1(list2) : C25235a0.f99113w;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!setM74103I1.contains(obj3)) {
                        arrayList.add(obj3);
                    }
                }
                c25483c.m387h(key, arrayList);
                return C23454a0.f92919a;
            case 11:
                return DebugFeatureFlagSettingsFragment.m26854P((DebugFeatureFlagSettingsFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return ClinicianSchedulingConfirmationFragment.m18482D((ClinicianSchedulingConfirmationFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return ClinicianVideoSchedulingFormFragment.m18491F((ClinicianVideoSchedulingFormFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return ClinicianVideoSchedulingIntakeFragment.m18499D((ClinicianVideoSchedulingIntakeFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return LogSymptomsFragment.m21934D((LogSymptomsFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return YirRafFragment.m27801C((YirRafFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MemberDataExportFragment.m22570F((MemberDataExportFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return SubmissionCompleteFragment.m22587N((SubmissionCompleteFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SubmitMemberDataExportFragment.m22596K((SubmitMemberDataExportFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return SleepDetailsFragment.m19742a0((SleepDetailsFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return WhatToExpectFragment.m28404G((WhatToExpectFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                AbstractC34924m.m110146g((C27344b) this.f102687x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC27346b.m82504l((C27347c) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC27464b.m82879f((C27465c) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC27537c.m83074t((C27539e) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return C27548d0.m83125Z((C27548d0) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return SageFragment.m24444N((SageFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return ShepherdAboutFragment.m25842D((ShepherdAboutFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return ShepherdDetailsFragment.m25855J((ShepherdDetailsFragment) this.f102687x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C25985a(Object obj, int i13) {
        this.f102686w = i13;
        this.f102687x = obj;
    }
}
