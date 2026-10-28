package p133f1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel;
import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.models.tiles.OfferBannerModel;
import com.whoop.editactivities.network.model.EditActivitiesDrawerContent;
import com.whoop.healthspan.domain.HealthspanDomainResult;
import com.whoop.homecustomization.domain.legacy.models.HomeCustomizationResponse;
import com.whoop.homecustomization.domain.legacy.models.KeyStatSection;
import com.whoop.hormonalinsights.fertility.domain.models.TickMarkOutline;
import com.whoop.hormonalinsights.fertility.domain.models.TickMarkOutlineStyle;
import f22.AbstractC14031c;
import fc2.AbstractC14368b;
import fg2.AbstractC14464f;
import fg2.AbstractC14465g;
import fg2.AbstractC14466h;
import fg2.AbstractC14468j;
import fg2.AbstractC14471m;
import fg2.AbstractC14472n;
import fl2.C14570a;
import live.hms.video.connection.stats.clientside.manager.StatsSamplingManager;

/* JADX INFO: renamed from: f1.z1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13998z1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49948w;

    public /* synthetic */ C13998z1(int i13) {
        this.f49948w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f49948w) {
            case 0:
                return AbstractC13923a2.f49639b;
            case 1:
                return AbstractC14031c.m39923A();
            case 2:
                return FormTextFieldModel._childSerializers$_anonymous_();
            case 3:
                return EmptyTileModel._childSerializers$_anonymous_();
            case 4:
                return EmptyTileModel._childSerializers$_anonymous_$0();
            case 5:
                return OfferBannerModel._childSerializers$_anonymous_();
            case 6:
                return OfferBannerModel._childSerializers$_anonymous_$0();
            case 7:
                return AbstractC14368b.m41021i();
            case 8:
                return StatsSamplingManager.localPublisherVideoSamplerMap_delegate$lambda$0();
            case 9:
                return StatsSamplingManager.subscriberAudioSamplerMap_delegate$lambda$1();
            case 10:
                return StatsSamplingManager.subscriberVideoSamplerMap_delegate$lambda$2();
            case 11:
                return EditActivitiesDrawerContent._childSerializers$_anonymous_();
            case 12:
                return EditActivitiesDrawerContent._childSerializers$_anonymous_$0();
            case 13:
                return AbstractC14464f.m41226e();
            case 14:
                return AbstractC14465g.m41235f();
            case 15:
                return AbstractC14466h.m41252j();
            case 16:
                return AbstractC14466h.m41256n();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC14468j.m41276m();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC14471m.m41288h();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC14471m.m41289i();
            case 20:
                return AbstractC14472n.m41310o();
            case 21:
                return AbstractC14472n.m41311p();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HealthspanDomainResult.Success._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C14570a.m41733t();
            case 24:
                return HomeCustomizationResponse._childSerializers$_anonymous_();
            case 25:
                return KeyStatSection._childSerializers$_anonymous_();
            case 26:
                return TickMarkOutline._childSerializers$_anonymous_();
            case 27:
                return TickMarkOutlineStyle._init_$_anonymous_();
            case 28:
                return RecoveryDetailsModel._childSerializers$_anonymous_();
            default:
                return RecoveryDetailsModel._childSerializers$_anonymous_$0();
        }
    }
}
