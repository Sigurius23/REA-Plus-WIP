package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.ExpandableListModel;
import com.whoop.design.models.items.ExpandableRowItemModel;
import com.whoop.design.models.items.ExplainerGaugeModel;
import com.whoop.design.models.items.FabItemModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.FabModel;
import com.whoop.design.models.items.FaqListModel;
import com.whoop.design.models.items.FeatureItemModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.FeedbackSurveyModel;
import com.whoop.design.models.items.FileViewerModel;
import com.whoop.design.models.items.FixedHeaderAlignment;
import com.whoop.design.models.items.FlowRowHorizontalSpacing;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.FollowerRequestButtonModel;
import com.whoop.design.models.items.FollowerRequestModel;

/* JADX INFO: renamed from: w91.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36957d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158125w;

    public /* synthetic */ C36957d(int i13) {
        this.f158125w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158125w) {
            case 0:
                return ExpandableContentModel._childSerializers$_anonymous_();
            case 1:
                return ExpandableContentModel._childSerializers$_anonymous_$0();
            case 2:
                return ExpandableContentModel._childSerializers$_anonymous_$1();
            case 3:
                return ExpandableContentModel._childSerializers$_anonymous_$2();
            case 4:
                return ExpandableListModel._childSerializers$_anonymous_();
            case 5:
                return ExpandableRowItemModel._childSerializers$_anonymous_();
            case 6:
                return ExplainerGaugeModel._childSerializers$_anonymous_();
            case 7:
                return FabItemModel._childSerializers$_anonymous_();
            case 8:
                return FabMenuModel._childSerializers$_anonymous_();
            case 9:
                return FabMenuModel._childSerializers$_anonymous_$0();
            case 10:
                return FabModel._childSerializers$_anonymous_();
            case 11:
                return FaqListModel._childSerializers$_anonymous_();
            case 12:
                return FeatureItemModel._childSerializers$_anonymous_();
            case 13:
                return FeatureListModel._childSerializers$_anonymous_();
            case 14:
                return FeatureListModel._childSerializers$_anonymous_$0();
            case 15:
                return FeedbackSurveyModel._childSerializers$_anonymous_();
            case 16:
                return FileViewerModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FileViewerModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return FileViewerModel._childSerializers$_anonymous_$1();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return FileViewerModel._childSerializers$_anonymous_$2();
            case 20:
                return FileViewerModel._childSerializers$_anonymous_$3();
            case 21:
                return FileViewerModel._childSerializers$_anonymous_$4();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FileViewerModel._childSerializers$_anonymous_$5();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return FixedHeaderAlignment._init_$_anonymous_();
            case 24:
                return FlowRowHorizontalSpacing._init_$_anonymous_();
            case 25:
                return FlowRowModel._childSerializers$_anonymous_();
            case 26:
                return FlowRowModel._childSerializers$_anonymous_$0();
            case 27:
                return FollowerRequestButtonModel._childSerializers$_anonymous_();
            case 28:
                return FollowerRequestButtonModel._childSerializers$_anonymous_$0();
            default:
                return FollowerRequestModel._childSerializers$_anonymous_();
        }
    }
}
