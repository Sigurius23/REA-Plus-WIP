package w20;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.access.omronauth.view.OmronAuthFragment;
import com.whoop.achievements.view.AchievementsFragment;
import com.whoop.advancedlabs.allrecordings.view.AllRecordingsFragment;
import com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment;
import com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment;
import com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment;
import com.whoop.community.CommunityAddMemberFragment;
import com.whoop.entitlements.p060ui.NotFoundFragment;
import com.whoop.feedbacksurvey.view.FeedbackSurveyFragment;
import com.whoop.membership.management.MembershipManagementFragment;
import com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementFragment;
import com.whoop.sanguine.view.SanguineWaitlistBiomarkerListFragment;
import com.whoop.sanguine.view.SanguineWaitlistFragment;
import com.whoop.settings.language.LanguagePrefsFragment;
import com.whoop.streaks.view.StreaksFragment;
import com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment;
import java.util.List;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.C25271y;
import p291l0.C23000t1;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32072d;
import p647yf.C39498k;
import p715kotlin.jvm.internal.AbstractC22676k;
import so1.C32811e0;
import so1.C32842z;
import ti2.C33854a;
import uw1.C35310c;
import uw1.C35311d;
import wb3.AbstractC37056f;
import wo1.AbstractC37457k0;
import wo1.AbstractC37476y;
import wt2.C37626g;
import x30.C37884e0;
import x30.C37901k;
import xi2.AbstractC38324b;
import xz0.AbstractC38754e;
import xz0.C38755f;
import y00.EnumC38853i;
import yb3.AbstractC39414r;
import yw1.AbstractC39821h;
import yw1.AbstractC39828o;
import za2.C40234j;
import zt2.AbstractC41135d;
import zt2.AbstractC41141j;
import zt2.C41136e;

/* JADX INFO: renamed from: w20.q */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36727q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157220w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f157221x;

    public /* synthetic */ C36727q(Object obj, int i13) {
        this.f157220w = i13;
        this.f157221x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157220w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC32072d.m99694c((C36711b0) this.f157221x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 1:
                return AchievementsFragment.m17046D((AchievementsFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                C39498k c39498k = (C39498k) this.f157221x;
                String key = (String) obj;
                List values = (List) obj2;
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(values, "values");
                String strM74110N0 = AbstractC25265s.m74110N0(values, ";", key.concat(": "), "\r\n", null, 56);
                c39498k.mo126148z(strM74110N0.length(), strM74110N0);
                return C23454a0.f92919a;
            case 3:
                return StreaksFragment.m26358J((StreaksFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC37476y.m120162d((C32842z) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC37457k0.m119999l((C32811e0) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                C37901k c37901k = (C37901k) this.f157221x;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String fieldValue = (String) obj2;
                AbstractC22676k.m65750j(fieldValue, "fieldValue");
                return AbstractC37056f.m118958J(new C23465k(c37901k.f162280a, new C23328a(fieldValue, zBooleanValue)));
            case 7:
                C37884e0 c37884e0 = (C37884e0) this.f157221x;
                EnumC38853i brand = (EnumC38853i) obj;
                String fieldValue2 = (String) obj2;
                AbstractC22676k.m65750j(brand, "brand");
                AbstractC22676k.m65750j(fieldValue2, "fieldValue");
                return c37884e0.f162208a.m30620j(brand, C25271y.f99162w, fieldValue2, brand.m124353b());
            case 8:
                return AllRecordingsFragment.m17269D((AllRecordingsFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return LanguagePrefsFragment.m25515C((LanguagePrefsFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return InsightsDeepDiveFragment.m17471G((InsightsDeepDiveFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC38324b.m122823f((C33854a) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return CommunityAddMemberFragment.m18820g0((CommunityAddMemberFragment) this.f157221x, (String) obj, (String) obj2);
            case 13:
                return AbstractC38754e.m124209x((C38755f) this.f157221x, C23000t1.f90727a, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return EditBiomarkersFragment.m17413O((EditBiomarkersFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                char[] cArr = (char[]) this.f157221x;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC22676k.m65750j(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iM125889h0 = AbstractC39414r.m125889h0(DelimitedRangesSequence, cArr, iIntValue, false);
                if (iM125889h0 < 0) {
                    return null;
                }
                return new C23465k(Integer.valueOf(iM125889h0), 1);
            case 16:
                return NotFoundFragment.m21401D((NotFoundFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FeedbackSurveyFragment.m21420D((FeedbackSurveyFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return UniversalBuyNowDialogFragment.m27593U((UniversalBuyNowDialogFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39821h.m127674j((C35310c.a) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC39828o.m127768m((C35311d.a) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return PaymentMethodManagementFragment.m23232D((PaymentMethodManagementFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return OmronAuthFragment.m16965G((OmronAuthFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SanguineWaitlistBiomarkerListFragment.m24455C((SanguineWaitlistBiomarkerListFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return SanguineWaitlistFragment.m24470K((SanguineWaitlistFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C40234j.m129206S((C40234j) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return SchedulePrimerFragment.m17525I((SchedulePrimerFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC41135d.m133564h((C41136e) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AbstractC41141j.m133617n((C37626g) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return MembershipManagementFragment.m22765N((MembershipManagementFragment) this.f157221x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C36727q(C36711b0 c36711b0, int i13) {
        this.f157220w = 0;
        this.f157221x = c36711b0;
    }
}
