package com.whoop.design.models.calendar.archmini;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.targetrecommendation.TargetRecommendationWidgetModel;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButton;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButtonStyle;
import com.whoop.design.models.items.targetrecommendation.WidgetFooterButtonType;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.BottomSheetFixedFooter;
import com.whoop.design.models.modal.BottomSheetFixedHeader;
import com.whoop.design.models.modal.BottomSheetHeight;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.design.models.modal.ToastActionButton;
import com.whoop.design.models.modal.ToastActionButtonAlignment;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.design.models.modal.ToastStyleModel;

/* JADX INFO: renamed from: com.whoop.design.models.calendar.archmini.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C7011a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25703w;

    public /* synthetic */ C7011a(int i13) {
        this.f25703w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f25703w) {
            case 0:
                return CalendarHeaderModel._childSerializers$_anonymous_$0();
            case 1:
                return CalendarModel._childSerializers$_anonymous_();
            case 2:
                return CalendarModel._childSerializers$_anonymous_$0();
            case 3:
                return TargetRecommendationWidgetModel._childSerializers$_anonymous_();
            case 4:
                return TargetRecommendationWidgetModel._childSerializers$_anonymous_$0();
            case 5:
                return WidgetFooterButton._childSerializers$_anonymous_();
            case 6:
                return WidgetFooterButton._childSerializers$_anonymous_$0();
            case 7:
                return WidgetFooterButtonStyle._init_$_anonymous_();
            case 8:
                return WidgetFooterButtonType._init_$_anonymous_();
            case 9:
                return BottomSheet._childSerializers$_anonymous_();
            case 10:
                return BottomSheet._childSerializers$_anonymous_$0();
            case 11:
                return BottomSheet._childSerializers$_anonymous_$1();
            case 12:
                return BottomSheetFixedFooter._childSerializers$_anonymous_();
            case 13:
                return BottomSheetFixedFooter._childSerializers$_anonymous_$0();
            case 14:
                return BottomSheetFixedHeader._childSerializers$_anonymous_();
            case 15:
                return BottomSheetFixedHeader._childSerializers$_anonymous_$0();
            case 16:
                return BottomSheetHeight._init_$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return DialogButton._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return DialogButton._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DialogButton._childSerializers$_anonymous_$1();
            case 20:
                return DialogModel._childSerializers$_anonymous_();
            case 21:
                return DialogModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FullScreenContentModal._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return FullScreenContentModal._childSerializers$_anonymous_$0();
            case 24:
                return LifecycleInteractions._childSerializers$_anonymous_();
            case 25:
                return ToastActionButton._childSerializers$_anonymous_();
            case 26:
                return ToastActionButton._childSerializers$_anonymous_$0();
            case 27:
                return ToastActionButtonAlignment._init_$_anonymous_();
            case 28:
                return ToastModal._childSerializers$_anonymous_();
            default:
                return ToastStyleModel._init_$_anonymous_();
        }
    }
}
