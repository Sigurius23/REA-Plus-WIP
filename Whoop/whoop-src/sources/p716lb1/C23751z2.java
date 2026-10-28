package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.MultiWheelPickerModel;
import com.whoop.design.models.items.NumericInputSliderModel;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.design.models.items.TextInputModel;
import com.whoop.design.models.items.TriLabelSliderModel;
import jb1.C21536b;
import jc0.InterfaceC21601a;
import lc0.AbstractC23823e;
import lc0.AbstractC23824f;
import lc0.AbstractC23826h;
import p715kotlin.jvm.functions.Function1;
import p745y81.C39336i;

/* JADX INFO: renamed from: lb1.z2 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C23751z2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94097w;

    public /* synthetic */ C23751z2(int i13) {
        this.f94097w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94097w) {
            case 0:
                return AbstractC23591a3.m68269k((C21536b) obj);
            case 1:
                return AbstractC23640h3.m68838e((C23749z0) obj);
            case 2:
                return AbstractC23640h3.m68839f((MultiWheelPickerModel) obj);
            case 3:
                return AbstractC23668l3.m69044o((C21536b) obj);
            case 4:
                return AbstractC23668l3.m69049t((C21536b) obj);
            case 5:
                return AbstractC23674m3.m69090g((C23749z0) obj);
            case 6:
                return AbstractC23674m3.m69093j((C21536b) obj);
            case 7:
                return AbstractC23674m3.m69091h((NumericInputSliderModel) obj);
            case 8:
                return AbstractC23680n3.m69159h((C21536b) obj);
            case 9:
                return AbstractC23692p3.m69240i((C21536b) obj);
            case 10:
                return AbstractC23620e4.m68715h((C21536b) obj);
            case 11:
                return AbstractC23627f4.m68755h((C21536b) obj);
            case 12:
                return AbstractC23687o4.m69204g((C21536b) obj);
            case 13:
                return AbstractC23711s4.m69411d((C23749z0) obj);
            case 14:
                return AbstractC23711s4.m69412e((TextAreaModel) obj);
            case 15:
                return AbstractC23717t4.m69435e((C23749z0) obj);
            case 16:
                return AbstractC23717t4.m69436f((TextInputModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23593a5.m68348a1((C21536b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23593a5.m68341X0((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23593a5.m68402s1((C21536b) obj);
            case 20:
                return AbstractC23593a5.m68363f1((C21536b) obj);
            case 21:
                return AbstractC23593a5.m68295D0((C21536b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23593a5.m68298E0((C39336i) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23593a5.m68414w1((C21536b) obj);
            case 24:
                return AbstractC23600b5.m68554h((C21536b) obj);
            case 25:
                return AbstractC23628f5.m68760d((C23749z0) obj);
            case 26:
                return AbstractC23628f5.m68761e((TriLabelSliderModel) obj);
            case 27:
                return AbstractC23823e.m69951l((InterfaceC21601a) obj);
            case 28:
                return AbstractC23824f.m69960e((InterfaceC21601a) obj);
            default:
                return AbstractC23826h.m69970h((String) obj);
        }
    }
}
