package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.ArticleTileModel;
import com.whoop.design.models.items.AxisSize;
import com.whoop.design.models.items.AxisSizeType;
import com.whoop.design.models.items.BarGraph;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BehaviorDetailsTileImpactCard;
import com.whoop.design.models.items.BehaviorDetailsTileModel;
import com.whoop.design.models.items.BehaviorTrackerModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.BiomarkerModel;
import com.whoop.design.models.items.BiomarkerPieChartContentModel;
import com.whoop.design.models.items.BiomarkerPieChartSectionModel;
import com.whoop.design.models.items.BottomSheetInfoModel;
import com.whoop.design.models.items.ButtonCellModel;
import com.whoop.design.models.items.CardIconButtonModel;
import com.whoop.design.models.items.CheckboxModel;

/* JADX INFO: renamed from: w91.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36954a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158122w;

    public /* synthetic */ C36954a(int i13) {
        this.f158122w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158122w) {
            case 0:
                return ArticleTileModel._childSerializers$_anonymous_();
            case 1:
                return ArticleTileModel._childSerializers$_anonymous_$0();
            case 2:
                return ArticleTileModel._childSerializers$_anonymous_$1();
            case 3:
                return AxisSize._childSerializers$_anonymous_();
            case 4:
                return AxisSizeType._init_$_anonymous_();
            case 5:
                return BarGraph._childSerializers$_anonymous_();
            case 6:
                return BarGraphContainerModel._childSerializers$_anonymous_();
            case 7:
                return BarGraphContainerModel._childSerializers$_anonymous_$0();
            case 8:
                return BehaviorDetailsTileImpactCard._childSerializers$_anonymous_();
            case 9:
                return BehaviorDetailsTileModel._childSerializers$_anonymous_();
            case 10:
                return BehaviorTrackerModel._childSerializers$_anonymous_();
            case 11:
                return BiomarkerCardModel._childSerializers$_anonymous_();
            case 12:
                return BiomarkerCardModel._childSerializers$_anonymous_$0();
            case 13:
                return BiomarkerModel._childSerializers$_anonymous_();
            case 14:
                return BiomarkerPieChartContentModel._childSerializers$_anonymous_();
            case 15:
                return BiomarkerPieChartSectionModel._childSerializers$_anonymous_();
            case 16:
                return BiomarkerPieChartSectionModel._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return BottomSheetInfoModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ButtonCellModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ButtonCellModel._childSerializers$_anonymous_$0();
            case 20:
                return ButtonCellModel._childSerializers$_anonymous_$1();
            case 21:
                return ButtonCellModel._childSerializers$_anonymous_$2();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CardIconButtonModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CheckboxModel._childSerializers$_anonymous_();
            case 24:
                return CheckboxModel._childSerializers$_anonymous_$0();
            case 25:
                return CheckboxModel._childSerializers$_anonymous_$1();
            case 26:
                return CheckboxModel._childSerializers$_anonymous_$2();
            case 27:
                return CheckboxModel._childSerializers$_anonymous_$3();
            case 28:
                return CheckboxModel.CheckboxAlignment._init_$_anonymous_();
            default:
                return CheckboxModel.CheckboxStyle._init_$_anonymous_();
        }
    }
}
