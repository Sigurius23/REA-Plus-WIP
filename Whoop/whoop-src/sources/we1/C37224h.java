package we1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.data.remote.domain.dto.growth.UserStrapsDto;
import com.whoop.entitlements.EntitlementsResponse;
import com.whoop.home.domain.models.AutopopMetadata;
import com.whoop.home.domain.models.CalendarResponse;
import com.whoop.home.domain.models.ComponentItems;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import com.whoop.home.domain.models.HomeResponseMetaData;
import com.whoop.home.domain.models.JournalHomeTileModel;
import com.whoop.home.domain.models.JournalHomeTileWrapperModel;
import com.whoop.home.domain.models.NotificationsCenterModel;
import com.whoop.home.domain.models.NotificationsWrapperModelV2;
import com.whoop.home.domain.models.Pillars;
import com.whoop.home.domain.models.ScoreGaugeStickyDialModel;
import com.whoop.home.domain.models.ScoreGaugeStickyModel;
import com.whoop.home.domain.models.StreakMetadata;
import com.whoop.home.domain.models.WeeklyPlanHomeTileModel;
import com.whoop.home.domain.models.WeeklyPlanHomeTileWrapperModel;
import java.util.LinkedHashMap;
import p390p1.C28674u2;
import p634y1.AbstractC39035h;
import p634y1.C39031d;
import x81.AbstractC38071c;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: we1.h */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C37224h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159210w;

    public /* synthetic */ C37224h(int i13) {
        this.f159210w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f159210w) {
            case 0:
                return EntitlementsResponse._childSerializers$_anonymous_();
            case 1:
                return AbstractC38071c.m121945b();
            case 2:
                return AbstractC38073e.m121963k();
            case 3:
                return AbstractC38073e.m121962j();
            case 4:
                return AbstractC38073e.m121964l();
            case 5:
                return AbstractC38073e.m121965m();
            case 6:
                return AbstractC38073e.m121960h();
            case 7:
                return AbstractC38073e.m121961i();
            case 8:
                return UserStrapsDto._childSerializers$_anonymous_();
            case 9:
                return new C39031d(new LinkedHashMap());
            case 10:
                C28674u2 c28674u2 = AbstractC39035h.f168004a;
                return null;
            case 11:
                return AutopopMetadata._childSerializers$_anonymous_();
            case 12:
                return CalendarResponse._childSerializers$_anonymous_();
            case 13:
                return CalendarResponse._childSerializers$_anonymous_$0();
            case 14:
                return ComponentItems._childSerializers$_anonymous_();
            case 15:
                return ComponentItems._childSerializers$_anonymous_$0();
            case 16:
                return HomeBffFeedResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HomeBffFeedResponse._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return HomeResponseMetaData._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return JournalHomeTileModel._init_$_anonymous_();
            case 20:
                return JournalHomeTileWrapperModel._childSerializers$_anonymous_();
            case 21:
                return NotificationsCenterModel._init_$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return NotificationsWrapperModelV2._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Pillars._childSerializers$_anonymous_();
            case 24:
                return ScoreGaugeStickyDialModel._childSerializers$_anonymous_();
            case 25:
                return ScoreGaugeStickyModel._childSerializers$_anonymous_();
            case 26:
                return ScoreGaugeStickyModel._childSerializers$_anonymous_$0();
            case 27:
                return StreakMetadata._childSerializers$_anonymous_();
            case 28:
                return WeeklyPlanHomeTileModel._init_$_anonymous_();
            default:
                return WeeklyPlanHomeTileWrapperModel._childSerializers$_anonymous_();
        }
    }
}
