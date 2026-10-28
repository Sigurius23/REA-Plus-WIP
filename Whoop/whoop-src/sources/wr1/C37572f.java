package wr1;

import androidx.glance.session.SessionWorker;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.p056ui.core.elements.Capitalization;
import com.stripe.android.p056ui.core.elements.DisplayField;
import com.stripe.android.p056ui.core.elements.EmptyFormSpec;
import com.stripe.android.p056ui.core.elements.KeyboardType;
import com.stripe.android.p056ui.core.elements.OTPSpec;
import com.stripe.android.p056ui.core.elements.PlaceholderSpec;
import com.stripe.android.p056ui.core.elements.TranslationId;
import com.whoop.core.details.activitytargets.ActivityTarget;
import com.whoop.core.details.activitytargets.ActivityTargetType;
import com.whoop.core.details.activitytargets.ActivityTargetZone;
import com.whoop.core.details.activitytargets.ActivityTargetsModel;
import com.whoop.data.remote.domain.dto.community.share.TeamResponseDto;
import com.whoop.data.remote.domain.dto.community.share.WidgetResponseDto;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.activityrecommendation.TargetZonesModel;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerResponse;
import com.whoop.service.TimeZoneReceiver;
import p390p1.AbstractC28683x;
import wz0.AbstractC37777d;
import x11.AbstractC37828b;
import yb3.C39412p;

/* JADX INFO: renamed from: wr1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37572f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160677w;

    public /* synthetic */ C37572f(int i13) {
        this.f160677w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f160677w) {
            case 0:
                return JournalDatePickerResponse._childSerializers$_anonymous_();
            case 1:
                return JournalDatePickerResponse._childSerializers$_anonymous_$0();
            case 2:
                return JournalDatePickerResponse._childSerializers$_anonymous_$1();
            case 3:
                return ActivityTarget._childSerializers$_anonymous_();
            case 4:
                return ActivityTarget._childSerializers$_anonymous_$0();
            case 5:
                return ActivityTarget._childSerializers$_anonymous_$1();
            case 6:
                return ActivityTargetType._init_$_anonymous_();
            case 7:
                return ActivityTargetZone._childSerializers$_anonymous_();
            case 8:
                return ActivityTargetsModel._childSerializers$_anonymous_();
            case 9:
                return TeamResponseDto._childSerializers$_anonymous_();
            case 10:
                return WidgetResponseDto._childSerializers$_anonymous_();
            case 11:
                return AbstractC37777d.m121212m();
            case 12:
                return AbstractC37777d.m121221v();
            case 13:
                return AbstractC37828b.m121367e();
            case 14:
                return new C39412p("^[0-9]{6}$");
            case 15:
                return Capitalization._init_$_anonymous_();
            case 16:
                return AbstractC28683x.m87272z(null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return DisplayField._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EmptyFormSpec._init_$_anonymous_();
            case 20:
                return KeyboardType._init_$_anonymous_();
            case 21:
                return OTPSpec._init_$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PlaceholderSpec.PlaceholderField._init_$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TranslationId._init_$_anonymous_();
            case 24:
                return new C39412p("[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}");
            case 25:
                return Long.valueOf(System.nanoTime());
            case 26:
                return AbstractC3006f0.m8709c();
            case 27:
                return TimeZoneReceiver.m24482c();
            case 28:
                return ActivityRecommendationTileModel._childSerializers$_anonymous_();
            default:
                return TargetZonesModel._childSerializers$_anonymous_();
        }
    }

    public /* synthetic */ C37572f(SessionWorker sessionWorker) {
        this.f160677w = 26;
    }
}
