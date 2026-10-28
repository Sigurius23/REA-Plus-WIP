package s52;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.realtime.service.RealTimeActivityService;
import p390p1.C28674u2;
import p510u0.AbstractC34347q;
import p736sz0.AbstractC33199m0;
import s82.C32266a;
import sr2.C32924f;
import sr2.C32925g;
import sr2.C32932n;
import sr2.C32941w;
import t62.C33557a;
import uf2.C34910a;
import un1.AbstractC35098d;
import un1.AbstractC35101g;

/* JADX INFO: renamed from: s52.d */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C32223d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133417w;

    public /* synthetic */ C32223d(int i13) {
        this.f133417w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f133417w) {
            case 0:
                return RealTimeActivityService.m24225k();
            case 1:
                return C32266a.m100417b();
            case 2:
                return CalendarDateModel._childSerializers$_anonymous_();
            case 3:
                return CalendarDateModel._childSerializers$_anonymous_$0();
            case 4:
                return CalendarDateModel._childSerializers$_anonymous_$1();
            case 5:
                return C32924f.m103510K2();
            case 6:
                return C32924f.m103610c3();
            case 7:
                return C32925g.m103751c();
            case 8:
                return C32932n.m103848e0();
            case 9:
                return C32932n.m103878t0();
            case 10:
                return C32932n.m103858j0();
            case 11:
                return C32932n.m103868o0();
            case 12:
                return C32932n.m103844c0();
            case 13:
                return C32932n.m103872q0();
            case 14:
                return C32932n.m103836X();
            case 15:
                return C32941w.m103941K0();
            case 16:
                return AbstractC33199m0.m105215G();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC33199m0.m105216H();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC33199m0.m105217I();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC33199m0.m105211C();
            case 20:
                return C33557a.m105974h();
            case 21:
                return TextOnlyCardModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return TextWithIllustrationCardModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TextWithIllustrationCardModel._childSerializers$_anonymous_$0();
            case 24:
                return TextWithIllustrationCardModel._childSerializers$_anonymous_$1();
            case 25:
                C28674u2 c28674u2 = AbstractC34347q.f144285a;
                return null;
            case 26:
                return C34910a.m110108f();
            case 27:
                return AbstractC35098d.m111011i();
            case 28:
                return AbstractC35098d.m111015m();
            default:
                return AbstractC35101g.m111042o();
        }
    }
}
