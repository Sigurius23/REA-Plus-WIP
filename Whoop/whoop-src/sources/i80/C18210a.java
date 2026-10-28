package i80;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.activation.domain.models.steps.BirthdayStepModel;
import com.whoop.activation.domain.models.steps.CheckYourEmailStepModel;
import com.whoop.activation.domain.models.steps.CountrySelectionStepModel;
import com.whoop.activation.domain.models.steps.CreatePasswordStepModel;
import com.whoop.activation.domain.models.steps.CreateYourAccountStepModel;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.domain.models.steps.FamilyPlanBlockStepModel;
import com.whoop.activation.domain.models.steps.GiftStepModel;
import com.whoop.activation.domain.models.steps.HealthConnectStepModel;
import com.whoop.activation.domain.models.steps.HeightAndWeightStepModel;
import com.whoop.activation.domain.models.steps.HeroWithFooterCtaStepModel;
import com.whoop.activation.domain.models.steps.NameInformationStepModel;
import com.whoop.activation.domain.models.steps.NotificationsStepModel;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.ReferAFriendCodesModel;
import com.whoop.activation.domain.models.steps.StateSelectionStepModel;
import com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel;
import com.whoop.activation.domain.models.steps.TrialPlanPickerModel;
import com.whoop.activation.domain.models.steps.UniversalPaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel;
import com.whoop.activation.domain.models.steps.WelcomeTransitionStepModel;
import fb0.AbstractC14335a;
import ib0.AbstractC18333d;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: i80.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C18210a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f70728w;

    public /* synthetic */ C18210a(int i13) {
        this.f70728w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f70728w) {
            case 0:
                return AbstractC18211b.m52298W((WelcomeTransitionStepModel) obj);
            case 1:
                return AbstractC18211b.m52299X((EnterEmailStepModel) obj);
            case 2:
                return AbstractC18211b.m52300Y((EnterYourPasswordStepModel) obj);
            case 3:
                return AbstractC18211b.m52301Z((CreatePasswordStepModel) obj);
            case 4:
                return AbstractC18211b.m52282G((C21536b) obj);
            case 5:
                return AbstractC18211b.m52303a0((CheckYourEmailStepModel) obj);
            case 6:
                return AbstractC18211b.m52305b0((FamilyPlanBlockStepModel) obj);
            case 7:
                return AbstractC18211b.m52307c0((HeroWithFooterCtaStepModel) obj);
            case 8:
                return AbstractC18211b.m52309d0((UniversalPaymentMethodStepModel) obj);
            case 9:
                return AbstractC18211b.m52296U((HealthConnectStepModel) obj);
            case 10:
                return AbstractC18211b.m52311e0((NameInformationStepModel) obj);
            case 11:
                return AbstractC18211b.m52313f0((BirthdayStepModel) obj);
            case 12:
                return AbstractC18211b.m52315g0((NotificationsStepModel) obj);
            case 13:
                return AbstractC18211b.m52317h0((PaymentMethodStepModel) obj);
            case 14:
                return AbstractC18211b.m52321j0((ReferAFriendCodesModel) obj);
            case 15:
                return AbstractC18211b.m52283H((C23749z0) obj);
            case 16:
                return AbstractC18211b.m52323k0((UpcyclePlanPickerModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18211b.m52325l0((TrialPlanPickerModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18211b.m52319i0((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18211b.m52284I((CreateYourAccountStepModel) obj);
            case 20:
                return AbstractC18211b.m52286K((UpcycleJoinTodayModel) obj);
            case 21:
                return AbstractC18211b.m52287L((TrialOfferCheckoutModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18211b.m52288M((GiftStepModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18211b.m52289N((CountrySelectionStepModel) obj);
            case 24:
                return AbstractC18211b.m52290O((StateSelectionStepModel) obj);
            case 25:
                return AbstractC18211b.m52291P((HeightAndWeightStepModel) obj);
            case 26:
                return AbstractC18333d.m52782u((InterfaceC22381a.c) obj);
            case 27:
                return AbstractC18333d.m52747E(obj);
            case 28:
                return AbstractC18333d.m52753K((InterfaceC22381a.c) obj);
            default:
                return AbstractC18333d.m52754L((AbstractC14335a) obj);
        }
    }
}
