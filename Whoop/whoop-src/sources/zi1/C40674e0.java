package zi1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.communitymomentscontainer.domain.model.CommunityMomentsContainerResponse;
import com.whoop.data.remote.domain.dto.sleepcoach.harvard.AlarmScheduleState;
import com.whoop.data.remote.domain.dto.sleepcoach.harvard.HarvardSleepAdviceDto;
import com.whoop.home.domain.models.dailyoutlook.CoachPillModel;
import com.whoop.hormonalinsights.api.HormonalSettingsRequest;
import com.whoop.hormonalinsights.api.UpdateGoalsRequest;
import com.whoop.labrador.feature.about.domain.models.LabradorAboutResponse;
import com.whoop.labrador.feature.about.domain.models.TileItem;
import com.whoop.nativestore.pdp.domain.model.PackItemCta;
import com.whoop.nativestore.pdp.domain.model.PdpCheckoutFooter;
import com.whoop.nativestore.pdp.domain.model.PdpSection;
import com.whoop.nativestore.pdp.domain.model.ProductAccordionListModel;
import com.whoop.nativestore.pdp.domain.model.ProductDescriptionPageResponse;
import com.whoop.nativestore.pdp.domain.model.ProductDetailsSectionModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryTagModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryTagStyle;
import com.whoop.tiltgraph.domain.models.TiltGraphCalendar;
import zk0.AbstractC40817h0;
import zq2.AbstractC40992e;
import zq2.AbstractC41002o;
import zr1.AbstractC41069c;
import zt2.AbstractC41140i;
import zt2.AbstractC41141j;
import zv2.AbstractC41172h;
import zy2.AbstractC41231d;

/* JADX INFO: renamed from: zi1.e0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C40674e0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f175592w;

    public /* synthetic */ C40674e0(int i13) {
        this.f175592w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f175592w) {
            case 0:
                return AbstractC40676f0.m132044e();
            case 1:
                return TiltGraphCalendar._childSerializers$_anonymous_();
            case 2:
                return AbstractC40817h0.m132309b();
            case 3:
                return CoachPillModel._childSerializers$_anonymous_();
            case 4:
                return HormonalSettingsRequest._childSerializers$_anonymous_();
            case 5:
                return UpdateGoalsRequest._childSerializers$_anonymous_();
            case 6:
                return AbstractC40992e.m133111d();
            case 7:
                return AbstractC41002o.m133216e();
            case 8:
                return CommunityMomentsContainerResponse._childSerializers$_anonymous_();
            case 9:
                return AbstractC41069c.m133349q();
            case 10:
                return AbstractC41069c.m133350r();
            case 11:
                return LabradorAboutResponse._childSerializers$_anonymous_();
            case 12:
                return LabradorAboutResponse._childSerializers$_anonymous_$0();
            case 13:
                return TileItem._childSerializers$_anonymous_();
            case 14:
                return AbstractC41140i.m133598j();
            case 15:
                return AbstractC41141j.m133612i();
            case 16:
                return AbstractC41172h.m133790K();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AlarmScheduleState._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HarvardSleepAdviceDto._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC41231d.m133935n();
            case 20:
                return PackItemCta._childSerializers$_anonymous_();
            case 21:
                return PdpCheckoutFooter._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PdpSection._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ProductAccordionListModel._childSerializers$_anonymous_();
            case 24:
                return ProductDescriptionPageResponse._childSerializers$_anonymous_();
            case 25:
                return ProductDescriptionPageResponse._childSerializers$_anonymous_$0();
            case 26:
                return ProductDetailsSectionModel._childSerializers$_anonymous_();
            case 27:
                return ProductImageGalleryModel._childSerializers$_anonymous_();
            case 28:
                return ProductImageGalleryTagModel._childSerializers$_anonymous_();
            default:
                return ProductImageGalleryTagStyle._init_$_anonymous_();
        }
    }
}
