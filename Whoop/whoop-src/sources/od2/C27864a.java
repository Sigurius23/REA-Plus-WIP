package od2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.lastnightsleep.domain.models.DetailsGraphingCardModel;
import com.whoop.shepherd.feature.about.domain.models.ShepherdAboutResponse;
import com.whoop.shepherd.feature.about.domain.models.TileItem;
import com.whoop.weeklyplan.challengelanding.aiplans.domain.model.AiPlansResponse;
import oq2.AbstractC28126d;
import p725ot1.AbstractC28331g;

/* JADX INFO: renamed from: od2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27864a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112302w;

    public /* synthetic */ C27864a(int i13) {
        this.f112302w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f112302w) {
            case 0:
                return ShepherdAboutResponse._childSerializers$_anonymous_$0();
            case 1:
                return TileItem._childSerializers$_anonymous_();
            case 2:
                return AbstractC28126d.m85079K();
            case 3:
                return AbstractC28126d.m85080L();
            case 4:
                return AbstractC28126d.m85081M();
            case 5:
                return AbstractC28126d.m85071C();
            case 6:
                return AbstractC28126d.m85083O();
            case 7:
                return AbstractC28126d.m85084P();
            case 8:
                return AbstractC28126d.m85082N();
            case 9:
                return AbstractC28126d.m85085Q();
            case 10:
                return AbstractC28126d.m85086R();
            case 11:
                return AbstractC28126d.m85087S();
            case 12:
                return AbstractC28126d.m85088T();
            case 13:
                return AbstractC28126d.m85089U();
            case 14:
                return AbstractC28126d.m85090V();
            case 15:
                return AbstractC28126d.m85091W();
            case 16:
                return AbstractC28126d.m85070B();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC28126d.m85072D();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC28126d.m85073E();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC28126d.m85074F();
            case 20:
                return AbstractC28126d.m85075G();
            case 21:
                return AbstractC28126d.m85076H();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC28126d.m85077I();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC28126d.m85078J();
            case 24:
                return AiPlansResponse._childSerializers$_anonymous_();
            case 25:
                return AbstractC28331g.m85858f();
            case 26:
                return AbstractC28331g.m85859g();
            case 27:
                return DetailsGraphingCardModel._childSerializers$_anonymous_();
            case 28:
                return DetailsGraphingCardModel._childSerializers$_anonymous_$0();
            default:
                return DetailsGraphingCardModel._childSerializers$_anonymous_$1();
        }
    }
}
