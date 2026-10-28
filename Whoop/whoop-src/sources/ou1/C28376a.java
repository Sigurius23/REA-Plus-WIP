package ou1;

import android.os.Bundle;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.contentsearch.domain.models.ContentSearchResponse;
import com.whoop.contentsearch.domain.models.ContentSearchScreen;
import com.whoop.design.atomic.organism.historylistitem.HistoryListItemStyle;
import com.whoop.design.models.items.graph.plot.bar.BarGroupModel;
import com.whoop.design.models.items.graph.plot.bar.BarModel;
import com.whoop.design.models.items.graph.plot.bar.BarTheme;
import com.whoop.lastnightsleep.domain.models.LastNightSleepModel;
import com.whoop.lastnightsleep.domain.models.LastNightSleepSectionModel;
import com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecords;
import com.whoop.personalrecords.miniarch.domain.models.ArchMiniPersonalRecordsModel;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsMiniArchModel;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsMiniArchModelResponse;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel;
import java.time.format.DateTimeFormatterBuilder;
import l83.C23454a0;
import ox0.AbstractC28449c;
import ox2.AbstractC28459e;
import oy0.AbstractC28472a;
import p12.AbstractC28734x;
import p21.AbstractC28752e;
import p90.AbstractC28996d;
import pc1.AbstractC29068b;
import pc2.AbstractC29074d;

/* JADX INFO: renamed from: ou1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28376a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114485w;

    public /* synthetic */ C28376a(int i13) {
        this.f114485w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f114485w) {
            case 0:
                return LastNightSleepModel._childSerializers$_anonymous_();
            case 1:
                return LastNightSleepSectionModel._childSerializers$_anonymous_();
            case 2:
                return ContentSearchResponse._childSerializers$_anonymous_();
            case 3:
                return ContentSearchScreen._childSerializers$_anonymous_();
            case 4:
                return ContentSearchScreen._childSerializers$_anonymous_$0();
            case 5:
                return AbstractC28449c.m86231n();
            case 6:
                return AbstractC28459e.m86282G();
            case 7:
                return C23454a0.f92919a;
            case 8:
                return AbstractC28472a.m86383d();
            case 9:
                return AbstractC28734x.m87449r0();
            case 10:
                return AbstractC28752e.m87501m();
            case 11:
                return ArchMiniPersonalRecords._childSerializers$_anonymous_();
            case 12:
                return ArchMiniPersonalRecordsModel._init_$_anonymous_();
            case 13:
                return PersonalRecordsMiniArchModel._childSerializers$_anonymous_();
            case 14:
                return PersonalRecordsMiniArchModelResponse._childSerializers$_anonymous_();
            case 15:
                return PersonalRecordsModel._childSerializers$_anonymous_();
            case 16:
                return new Bundle();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HistoryListItemStyle._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC28996d.m88033V();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC28996d.m88020I();
            case 20:
                return AbstractC28996d.m88025N();
            case 21:
                return AbstractC28996d.m88029R();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return BarGroupModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return BarModel._childSerializers$_anonymous_();
            case 24:
                return BarTheme._childSerializers$_anonymous_();
            case 25:
                return BarTheme._childSerializers$_anonymous_$0();
            case 26:
                return AbstractC29068b.m88363h();
            case 27:
                return AbstractC29074d.m88387e();
            case 28:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    }
}
