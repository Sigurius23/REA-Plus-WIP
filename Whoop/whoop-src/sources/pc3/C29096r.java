package pc3;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.archv2.feature.domain.models.GenericModels;
import com.whoop.archv2.feature.domain.models.GenericSectionModel;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.LinkedHashMap;
import p727py0.AbstractC29619d;
import p727py0.Function0;
import ph1.AbstractC29245i;
import ph1.C29238b;
import pj2.AbstractC29310i;
import pj2.AbstractC29318q;
import pj2.AbstractC29321t;
import pp1.AbstractC29436i;
import pp2.AbstractC29441e;
import pp2.AbstractC29444h;
import pp2.C29438b;
import pq2.AbstractC29484a;
import pt2.AbstractC29540v;
import px0.AbstractC29593c;

/* JADX INFO: renamed from: pc3.r */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C29096r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117689w;

    public /* synthetic */ C29096r(int i13) {
        this.f117689w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f117689w) {
            case 0:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 1:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            case 2:
                return new LinkedHashMap();
            case 3:
                return C29238b.m88748e();
            case 4:
                return AbstractC29245i.m88783K();
            case 5:
                return GenericModels._childSerializers$_anonymous_();
            case 6:
                return GenericSectionModel._childSerializers$_anonymous_();
            case 7:
                return AbstractC29310i.m89042h0();
            case 8:
                return AbstractC29318q.m89103G0();
            case 9:
                return AbstractC29318q.m89107I0();
            case 10:
                return AbstractC29318q.m89109J0();
            case 11:
                return AbstractC29321t.m89194E();
            case 12:
                return AbstractC29436i.m89731L0();
            case 13:
                return C29438b.m89823e();
            case 14:
                return AbstractC29441e.m89837l();
            case 15:
                return AbstractC29444h.m89866o();
            case 16:
                return AbstractC29484a.m90065p();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29540v.m90387N0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29593c.m90755p();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29593c.m90756q();
            case 20:
                return AbstractC29593c.m90758s();
            case 21:
                return AbstractC29593c.m90759t();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Function0.m90886L();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Function0.m90928n0();
            case 24:
                return Function0.m90942u0();
            case 25:
                return Function0.m90900Z();
            case 26:
                return Function0.m90914g0();
            case 27:
                return Function0.m90893S();
            case 28:
                return AbstractC29619d.m90962J();
            default:
                return AbstractC29619d.m90969Q();
        }
    }
}
