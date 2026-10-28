package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.ProductInfo;
import com.whoop.design.models.items.ProductItems;
import com.whoop.design.models.items.ProductModel;
import com.whoop.design.models.items.ProfileInfoTileListModel;
import com.whoop.design.models.items.ProfileInfoTileModel;
import com.whoop.design.models.items.ProgressBreakdownModel;
import com.whoop.design.models.items.ProgressMetaDataModel;
import com.whoop.design.models.items.ProgressMetricRowModel;
import com.whoop.design.models.items.ProgressSubtaskModel;
import com.whoop.design.models.items.RangeMeterModel;
import com.whoop.design.models.items.RangeSectionModel;
import com.whoop.design.models.items.RewardsSectionModel;
import com.whoop.design.models.items.ScoreGaugeDialModel;
import com.whoop.design.models.items.ScoreGaugeModel;
import com.whoop.design.models.items.ScoreGaugeRowModel;
import com.whoop.design.models.items.SearchBarKeyboardType;
import com.whoop.design.models.items.SearchBarModel;
import com.whoop.design.models.items.SecondaryActionButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SectionModel;
import com.whoop.design.models.items.Segment;

/* JADX INFO: renamed from: w91.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36962i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158130w;

    public /* synthetic */ C36962i(int i13) {
        this.f158130w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158130w) {
            case 0:
                return ProductInfo._childSerializers$_anonymous_();
            case 1:
                return ProductItems._childSerializers$_anonymous_();
            case 2:
                return ProductModel._childSerializers$_anonymous_();
            case 3:
                return ProfileInfoTileListModel._childSerializers$_anonymous_();
            case 4:
                return ProfileInfoTileModel._childSerializers$_anonymous_();
            case 5:
                return ProfileInfoTileModel._childSerializers$_anonymous_$0();
            case 6:
                return ProgressBreakdownModel._childSerializers$_anonymous_();
            case 7:
                return ProgressMetaDataModel._childSerializers$_anonymous_();
            case 8:
                return ProgressMetricRowModel._childSerializers$_anonymous_();
            case 9:
                return ProgressSubtaskModel._childSerializers$_anonymous_();
            case 10:
                return RangeMeterModel._childSerializers$_anonymous_();
            case 11:
                return RangeSectionModel._childSerializers$_anonymous_();
            case 12:
                return RewardsSectionModel._childSerializers$_anonymous_();
            case 13:
                return ScoreGaugeDialModel._childSerializers$_anonymous_();
            case 14:
                return ScoreGaugeModel._childSerializers$_anonymous_();
            case 15:
                return ScoreGaugeModel._childSerializers$_anonymous_$0();
            case 16:
                return ScoreGaugeModel._childSerializers$_anonymous_$1();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ScoreGaugeRowModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return SearchBarKeyboardType._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SearchBarModel._childSerializers$_anonymous_();
            case 20:
                return SecondaryActionButtonModel._childSerializers$_anonymous_();
            case 21:
                return SecondaryButtonModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SecondaryButtonModel._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SecondaryButtonModel._childSerializers$_anonymous_$1();
            case 24:
                return SecondaryButtonModel._childSerializers$_anonymous_$2();
            case 25:
                return SectionModel._childSerializers$_anonymous_();
            case 26:
                return SectionModel._childSerializers$_anonymous_$0();
            case 27:
                return Segment._childSerializers$_anonymous_();
            case 28:
                return Segment._childSerializers$_anonymous_$0();
            default:
                return Segment._childSerializers$_anonymous_$1();
        }
    }
}
