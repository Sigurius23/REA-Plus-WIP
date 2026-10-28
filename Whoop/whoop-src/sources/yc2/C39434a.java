package yc2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.healthmonitor.domain.models.ComposableHealthMonitorAnalyticsModel;
import com.whoop.healthmonitor.domain.models.ComposableHealthMonitorResponse;
import com.whoop.home.domain.models.CalibrationTimelineCardModel;
import com.whoop.home.domain.models.ChallengeHomeTileModel;
import com.whoop.home.domain.models.CoachActivityTileModel;
import com.whoop.home.domain.models.CustomAnimationContainerModel;
import com.whoop.home.domain.models.DayZeroCardsModel;
import com.whoop.home.domain.models.FabMenuModel;
import com.whoop.home.domain.models.MciHomeTileModel;
import com.whoop.home.domain.models.NotificationsWrapperModel;
import com.whoop.home.domain.models.PregnancyTileHeader;
import com.whoop.home.domain.models.WhatToExpectCardModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p746ye1.Function0;
import ye.C39475b;
import yf1.C39513b;
import yk2.AbstractC39612l;
import yl0.AbstractC39619b;
import yl2.C39644k;

/* JADX INFO: renamed from: yc2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39434a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169672w;

    public /* synthetic */ C39434a(int i13) {
        this.f169672w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f169672w) {
            case 0:
                return AbstractC39436c.m125959I();
            case 1:
                return AbstractC39436c.m125960J();
            case 2:
                return AbstractC39436c.m125952B();
            case 3:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C39475b.f169854b;
                return "Error while parsing \"Date\" header from service response";
            case 4:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C39475b.f169854b;
                return "service did not return \"Date\" header, skipping skew calculation";
            case 5:
                return Function0.m126133d();
            case 6:
                return C39513b.m126175e();
            case 7:
                return ComposableHealthMonitorAnalyticsModel._childSerializers$_anonymous_();
            case 8:
                return ComposableHealthMonitorResponse._childSerializers$_anonymous_();
            case 9:
                return AbstractC39612l.m126506E();
            case 10:
                return AbstractC39612l.m126507F();
            case 11:
                return AbstractC39612l.m126508G();
            case 12:
                return AbstractC39619b.m126613n();
            case 13:
                return CalibrationTimelineCardModel._childSerializers$_anonymous_();
            case 14:
                return ChallengeHomeTileModel._childSerializers$_anonymous_();
            case 15:
                return CoachActivityTileModel._childSerializers$_anonymous_();
            case 16:
                return CustomAnimationContainerModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CustomAnimationContainerModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CustomAnimationContainerModel._childSerializers$_anonymous_$1();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DayZeroCardsModel._childSerializers$_anonymous_();
            case 20:
                return FabMenuModel._childSerializers$_anonymous_();
            case 21:
                return MciHomeTileModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return NotificationsWrapperModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PregnancyTileHeader._childSerializers$_anonymous_();
            case 24:
                return PregnancyTileHeader._childSerializers$_anonymous_$0();
            case 25:
                return WhatToExpectCardModel._childSerializers$_anonymous_();
            case 26:
                return WhatToExpectCardModel._childSerializers$_anonymous_$0();
            case 27:
                return C39644k.m126731D();
            case 28:
                return C39644k.m126728A();
            default:
                return C39644k.m126730C();
        }
    }
}
