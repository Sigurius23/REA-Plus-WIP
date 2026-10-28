package com.whoop.design.models;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.calendar.archmini.CalendarHeaderModel;

/* JADX INFO: renamed from: com.whoop.design.models.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C6909a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25700w;

    public /* synthetic */ C6909a(int i13) {
        this.f25700w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f25700w) {
            case 0:
                return DesignModelWrapper._childSerializers$_anonymous_();
            case 1:
                return DesignModelWrapper._childSerializers$_anonymous_$0();
            case 2:
                return IconModel._childSerializers$_anonymous_();
            case 3:
                return ImpactMagnitudeTileModel._childSerializers$_anonymous_();
            case 4:
                return InfoCalloutTileModel._childSerializers$_anonymous_();
            case 5:
                return InfoCalloutTileModel._childSerializers$_anonymous_$0();
            case 6:
                return InfoCalloutTileModel._childSerializers$_anonymous_$1();
            case 7:
                return InfoCalloutTileModel._childSerializers$_anonymous_$2();
            case 8:
                return InfoCalloutTileModel._childSerializers$_anonymous_$3();
            case 9:
                return InfoCalloutTileModel._childSerializers$_anonymous_$4();
            case 10:
                return InfoCalloutTileModel._childSerializers$_anonymous_$5();
            case 11:
                return InfoCalloutTileModel._childSerializers$_anonymous_$6();
            case 12:
                return InfoCalloutTileModel._childSerializers$_anonymous_$7();
            case 13:
                return MagnitudeDetailCardModel._childSerializers$_anonymous_();
            case 14:
                return MarkdownTextModel._childSerializers$_anonymous_();
            case 15:
                return ProgressButtonModel._childSerializers$_anonymous_();
            case 16:
                return ProgressButtonModel._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ProgressButtonModel._childSerializers$_anonymous_$1();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ProgressButtonModel._childSerializers$_anonymous_$2();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ProgressButtonModel._childSerializers$_anonymous_$3();
            case 20:
                return ProgressButtonModel.ButtonStyle._init_$_anonymous_();
            case 21:
                return ProgressButtonModel.ButtonType._init_$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ProgressMeterModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TimeSegmentModel._childSerializers$_anonymous_();
            case 24:
                return TimeSegmentModel._childSerializers$_anonymous_$0();
            case 25:
                return TitleSubTitleModel._childSerializers$_anonymous_();
            case 26:
                return TrendMetricModel._childSerializers$_anonymous_();
            case 27:
                return TrendMetricModel._childSerializers$_anonymous_$0();
            case 28:
                return TrendMetricModel._childSerializers$_anonymous_$1();
            default:
                return CalendarHeaderModel._childSerializers$_anonymous_();
        }
    }
}
