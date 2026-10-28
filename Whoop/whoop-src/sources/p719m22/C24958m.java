package p719m22;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementModels;
import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementSectionModel;
import com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorFragment;
import com.whoop.design.models.items.graph.plane.line.GraphLineTheme;
import com.whoop.settings.accountheader.model.MyAccountHeaderCtaModel;
import com.whoop.universalcheckout.features.checkout.domain.models.PaymentSheetConfiguration;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutResponse;
import com.whoop.universalcheckout.features.checkout.domain.models.UniversalCheckoutSectionModel;
import m41.AbstractC25053e;
import m80.AbstractC25222d;
import m80.AbstractC25224f;
import m90.AbstractC25285b;
import mf0.AbstractC25506e;
import mf2.AbstractC25511b;
import mf2.AbstractC25515f;
import mh0.AbstractC25552d;

/* JADX INFO: renamed from: m22.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24958m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97675w;

    public /* synthetic */ C24958m(int i13) {
        this.f97675w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f97675w) {
            case 0:
                return AbstractC42788s.m73250v();
            case 1:
                return AbstractC42788s.m73251w();
            case 2:
                return AbstractC42788s.m73252x();
            case 3:
                return AbstractC42789u.m73286w();
            case 4:
                return AbstractC42789u.m73287x();
            case 5:
                return AbstractC42789u.m73288y();
            case 6:
                return AbstractC25053e.m73492A();
            case 7:
                return AbstractC25222d.m73899x();
            case 8:
                return AbstractC25224f.m73928p();
            case 9:
                return AbstractC25285b.m74204p();
            case 10:
                return AbstractC25285b.m74207s();
            case 11:
                return AbstractC25285b.m74210v();
            case 12:
                return GraphLineTheme._childSerializers$_anonymous_();
            case 13:
                return GraphLineTheme._childSerializers$_anonymous_$0();
            case 14:
                return MyAccountHeaderCtaModel._childSerializers$_anonymous_();
            case 15:
                return "cancelling in-flight call";
            case 16:
                return AbstractC25506e.m74911B();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25506e.m74933X();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25511b.m75011n();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC25515f.m75013A();
            case 20:
                return AbstractC25515f.m75014B();
            case 21:
                return AbstractC25515f.m75018F();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AdvancedLabsManagementModels._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AdvancedLabsManagementSectionModel._childSerializers$_anonymous_();
            case 24:
                return AbstractC25552d.m75134d();
            case 25:
                return PaymentSheetConfiguration._childSerializers$_anonymous_();
            case 26:
                return UniversalCheckoutResponse._childSerializers$_anonymous_();
            case 27:
                return UniversalCheckoutResponse._childSerializers$_anonymous_$0();
            case 28:
                return UniversalCheckoutSectionModel._childSerializers$_anonymous_();
            default:
                return SleepCoachWizardConductorFragment.m18612v0();
        }
    }
}
