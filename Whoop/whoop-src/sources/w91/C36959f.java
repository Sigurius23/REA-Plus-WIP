package w91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.HorizontalMetricTileModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.IconSize;
import com.whoop.design.models.items.ImageAndIconModel;
import com.whoop.design.models.items.ImageCardPickerModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImpactBarSegmentModel;
import com.whoop.design.models.items.ImpactCardModel;
import com.whoop.design.models.items.ImpactLabelModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactTileModel;
import com.whoop.design.models.items.InfoRowListModel;
import com.whoop.design.models.items.InformationItemModel;
import com.whoop.design.models.items.InsightsItemListModel;
import com.whoop.design.models.items.InsightsItemModel;
import com.whoop.design.models.items.InsufficientAnswerCount;
import com.whoop.design.models.items.InsufficientImpactTileModel;
import com.whoop.design.models.items.IntegrationsUpsellButtonModel;
import com.whoop.design.models.items.ItemsCardFooterModel;
import com.whoop.design.models.items.JournalEntryStatus;
import com.whoop.design.models.items.JournalEntryWidgetModel;

/* JADX INFO: renamed from: w91.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36959f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158127w;

    public /* synthetic */ C36959f(int i13) {
        this.f158127w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158127w) {
            case 0:
                return HorizontalMetricTileModel._childSerializers$_anonymous_$0();
            case 1:
                return HorizontalMetricTileModel._childSerializers$_anonymous_$1();
            case 2:
                return HorizontalScrollContainerModel._childSerializers$_anonymous_();
            case 3:
                return HorizontalScrollContainerModel._childSerializers$_anonymous_$0();
            case 4:
                return HorizontalStatModel._childSerializers$_anonymous_();
            case 5:
                return IconSize._init_$_anonymous_();
            case 6:
                return ImageAndIconModel._childSerializers$_anonymous_();
            case 7:
                return ImageCardPickerModel._childSerializers$_anonymous_();
            case 8:
                return ImageUrlModel._childSerializers$_anonymous_();
            case 9:
                return ImpactBarSegmentModel._childSerializers$_anonymous_();
            case 10:
                return ImpactCardModel._childSerializers$_anonymous_();
            case 11:
                return ImpactCardModel._childSerializers$_anonymous_$0();
            case 12:
                return ImpactCardModel._childSerializers$_anonymous_$1();
            case 13:
                return ImpactLabelModel._childSerializers$_anonymous_();
            case 14:
                return ImpactModel._childSerializers$_anonymous_();
            case 15:
                return ImpactModel._childSerializers$_anonymous_$0();
            case 16:
                return ImpactTileModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return InfoRowListModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return InformationItemModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return InsightsItemListModel._childSerializers$_anonymous_();
            case 20:
                return InsightsItemModel._childSerializers$_anonymous_();
            case 21:
                return InsufficientAnswerCount._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return InsufficientImpactTileModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return IntegrationsUpsellButtonModel._childSerializers$_anonymous_();
            case 24:
                return ItemsCardFooterModel._childSerializers$_anonymous_();
            case 25:
                return ItemsCardFooterModel._childSerializers$_anonymous_$0();
            case 26:
                return JournalEntryStatus._init_$_anonymous_();
            case 27:
                return JournalEntryWidgetModel._childSerializers$_anonymous_();
            case 28:
                return JournalEntryWidgetModel._childSerializers$_anonymous_$0();
            default:
                return JournalEntryWidgetModel._childSerializers$_anonymous_$1();
        }
    }
}
