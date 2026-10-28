package p025b1;

import androidx.health.platform.client.proto.C1533u;
import b30.AbstractC2495c4;
import b30.C2535h4;
import b30.C2551j4;
import b30.C2627t3;
import b72.AbstractC2784b;
import bf0.AbstractC3194f;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.collapsiblerow.CollapsibleRowModel;
import com.whoop.design.models.items.collapsiblerow.CollapsibleStatus;
import com.whoop.design.models.items.collapsiblerow.EndItem;
import com.whoop.design.models.items.collapsiblerow.EndItemFormat;
import com.whoop.design.models.items.searchable.SearchableListModel;
import com.whoop.design.models.items.searchable.SearchableRowModel;
import com.whoop.design.models.items.searchable.SearchableSectionModel;
import com.whoop.sleep.coach.data.network.model.AlarmScheduleState;
import java.util.UUID;
import l83.C23454a0;
import p040c0.C3756l0;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p636y3.C39183o;
import p699b70.Function1;
import p700bd1.C3095m;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2217h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8838w;

    public /* synthetic */ C2217h(int i13) {
        this.f8838w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8838w) {
            case 0:
                C28596b0 c28596b0 = AbstractC2218i.f8839a;
                return null;
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 3:
                return AbstractC28683x.m87272z("");
            case 4:
                C3756l0 c3756l0 = AbstractC2495c4.f9723a;
                return C23454a0.f92919a;
            case 5:
                return new C2627t3((31 & 1) != 0 ? C17919x.f69637n : 0L, (31 & 2) != 0 ? C17919x.f69637n : 0L, (31 & 4) != 0 ? C17919x.f69637n : 0L, (31 & 8) != 0 ? C17919x.f69637n : 0L, C17919x.f69637n);
            case 6:
                return new C2535h4(Float.NaN, Float.NaN, Float.NaN);
            case 7:
                return new C2551j4(null, C39183o.f168428c);
            case 8:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 9:
                return Function1.m7858o();
            case 10:
                return Function1.m7865v();
            case 11:
                return AbstractC2784b.m7904m();
            case 12:
                return CollapsibleRowModel._childSerializers$_anonymous_();
            case 13:
                return CollapsibleRowModel._childSerializers$_anonymous_$0();
            case 14:
                return CollapsibleRowModel._childSerializers$_anonymous_$1();
            case 15:
                return CollapsibleRowModel._childSerializers$_anonymous_$2();
            case 16:
                return CollapsibleStatus._init_$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EndItem._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EndItemFormat._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SearchableListModel._childSerializers$_anonymous_();
            case 20:
                return SearchableListModel._childSerializers$_anonymous_$0();
            case 21:
                return SearchableListModel._childSerializers$_anonymous_$1();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SearchableRowModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SearchableRowModel._childSerializers$_anonymous_$0();
            case 24:
                return SearchableSectionModel._childSerializers$_anonymous_();
            case 25:
                return SearchableSectionModel._childSerializers$_anonymous_$0();
            case 26:
                return C3095m.m8875f();
            case 27:
                return "refreshing IMDS token";
            case 28:
                return AbstractC3194f.m9193g();
            default:
                return AlarmScheduleState._init_$_anonymous_();
        }
    }
}
