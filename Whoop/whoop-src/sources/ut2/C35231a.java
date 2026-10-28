package ut2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.hcaptcha.config.HCaptchaOrientation;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.whoop.membership.domain.upcycle.models.Cta;
import com.whoop.membership.domain.upcycle.models.UpcycleContent;
import com.whoop.membership.domain.upcycle.models.UpcycleLandingModel;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.GetPaymentMethodMenuItemResponse;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementModels;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementSectionModel;
import com.whoop.weeklyplan.weeklyplan.domain.models.StyledString;
import com.whoop.weeklyplan.weeklyplan.domain.models.Summary;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryItem;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryItemStyle;
import com.whoop.weeklyplan.weeklyplan.domain.models.TrackingStyle;
import com.whoop.weeklyplan.weeklyplan.domain.models.WeeklyPlanModel;
import com.whoop.whooplive.selfie.SelfieActivity;
import java.util.LinkedHashMap;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p313lz.C24805b;
import p390p1.C28596b0;
import uu2.AbstractC35249f;
import uu2.AbstractC35272w;
import uw0.AbstractC35296f;
import uw0.AbstractC35307q;
import ux2.AbstractC35371a;
import v00.AbstractC35461d0;
import v00.InterfaceC35457b0;
import v30.AbstractC35594c;
import v30.C35602k;
import v30.C35603l;

/* JADX INFO: renamed from: ut2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35231a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149833w;

    public /* synthetic */ C35231a(int i13) {
        this.f149833w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f149833w) {
            case 0:
                return StyledString._childSerializers$_anonymous_();
            case 1:
                return Summary._childSerializers$_anonymous_();
            case 2:
                return SummaryItem._childSerializers$_anonymous_();
            case 3:
                return SummaryItemStyle._init_$_anonymous_();
            case 4:
                return TrackingStyle._init_$_anonymous_();
            case 5:
                return WeeklyPlanModel._childSerializers$_anonymous_();
            case 6:
                return WeeklyPlanModel._childSerializers$_anonymous_$0();
            case 7:
                return WeeklyPlanModel._childSerializers$_anonymous_$1();
            case 8:
                return AbstractC35249f.m111699b();
            case 9:
                return AbstractC35272w.m111889X();
            case 10:
                return AbstractC35272w.m111885T();
            case 11:
                return Cta._childSerializers$_anonymous_();
            case 12:
                return UpcycleContent._childSerializers$_anonymous_();
            case 13:
                return UpcycleLandingModel._childSerializers$_anonymous_();
            case 14:
                return AbstractC35296f.m111993p();
            case 15:
                return AbstractC35296f.m111994q();
            case 16:
                return AbstractC35296f.m111995r();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35307q.m112099l();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC35371a.m112244i();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SelfieActivity.m28875u1();
            case 20:
                Set set = AbstractC35461d0.f151000a;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Object obj : set) {
                    linkedHashMap.put(((InterfaceC35457b0) obj).getType().f167132w, obj);
                }
                return linkedHashMap;
            case 21:
                int i13 = StripeBrowserLauncherActivity.f22350x;
                return new C24805b(1);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return GetPaymentMethodMenuItemResponse._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PaymentMethodManagementModels._childSerializers$_anonymous_();
            case 24:
                return PaymentMethodManagementModels._childSerializers$_anonymous_$0();
            case 25:
                return PaymentMethodManagementSectionModel._childSerializers$_anonymous_();
            case 26:
                C28596b0 c28596b0 = AbstractC35594c.f151360a;
                return C35603l.f151374a;
            case 27:
                return new C35602k();
            case 28:
                return HCaptchaOrientation._init_$_anonymous_();
            default:
                return HCaptchaSize._init_$_anonymous_();
        }
    }
}
