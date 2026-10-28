package l72;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import com.whoop.gifting.feature.gifting.domain.models.BottomStickyItemsModel;
import com.whoop.gifting.feature.gifting.domain.models.GiftingModels;
import com.whoop.gifting.feature.gifting.domain.models.GiftingSectionModel;
import com.whoop.startactivity.goals.targetcard.AbstractC10241a;
import com.whoop.startactivity.goals.targetcard.TargetCardModel;
import l90.AbstractC23541a;
import lc0.AbstractC23820b;
import lc0.AbstractC23828j;
import lc2.C23830a;
import lf0.AbstractC23898b;
import lf0.AbstractC23901b2;
import lf0.AbstractC23938l;
import lf0.AbstractC23954p;
import lf0.AbstractC23990z1;
import p716lb1.AbstractC23631g1;
import p716lb1.AbstractC23674m3;

/* JADX INFO: renamed from: l72.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C23399f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92725w;

    public /* synthetic */ C23399f(int i13) {
        this.f92725w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f92725w) {
            case 0:
                return AbstractC23402i.m67763D();
            case 1:
                return AbstractC23408o.m67872t0();
            case 2:
                return AbstractC23408o.m67874u0();
            case 3:
                return AbstractC23408o.m67818L();
            case 4:
                return AbstractC23408o.m67858m0();
            case 5:
                return AbstractC23408o.m67860n0();
            case 6:
                return AbstractC23541a.m68146g();
            case 7:
                return GraphButtons._childSerializers$_anonymous_();
            case 8:
                return AbstractC23631g1.m68786h();
            case 9:
                return AbstractC23674m3.m69092i();
            case 10:
                return AbstractC23820b.m69933h();
            case 11:
                return AbstractC23820b.m69937l();
            case 12:
                return AbstractC23828j.m69987H();
            case 13:
                return C23830a.m70035j();
            case 14:
                return AbstractC23898b.m70201f();
            case 15:
                return AbstractC23938l.m70450A();
            case 16:
                return AbstractC23938l.m70477y();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23938l.m70478z();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23954p.m70590o();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23990z1.m70792l();
            case 20:
                return AbstractC23901b2.m70251j();
            case 21:
                return AbstractC10241a.m26054m();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return TargetCardModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TargetCardModel._childSerializers$_anonymous_$0();
            case 24:
                return TargetCardModel._childSerializers$_anonymous_$1();
            case 25:
                return BottomStickyItemsModel._childSerializers$_anonymous_();
            case 26:
                return GiftingModels._childSerializers$_anonymous_();
            case 27:
                return GiftingModels._childSerializers$_anonymous_$0();
            case 28:
                return GiftingModels._childSerializers$_anonymous_$1();
            default:
                return GiftingSectionModel._childSerializers$_anonymous_();
        }
    }
}
