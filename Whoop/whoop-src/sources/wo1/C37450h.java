package wo1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import java.time.LocalDate;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40358i5;
import ro1.AbstractC31635g;
import so1.C32808d;
import vy0.AbstractC36597y;
import wb0.C37035f;
import wq1.AbstractC37509c;
import xa0.AbstractC38137b;
import xi0.AbstractC38319a;
import xi2.C38325c;
import xw1.AbstractC38682f;
import yb0.AbstractC39388k;
import yk2.AbstractC39612l;
import yn1.AbstractC39672a;
import yo1.C39688a;
import yu2.AbstractC39795e;
import z51.C40091b;
import z51.C40102m;
import zd0.AbstractC40545b;
import zq2.C40999l;
import zr1.AbstractC41068b;

/* JADX INFO: renamed from: wo1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37450h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160274w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f160275x;

    public /* synthetic */ C37450h(Function1 function1, int i13) {
        this.f160274w = i13;
        this.f160275x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160274w) {
            case 0:
                return C37452i.m119948g(this.f160275x, (AbstractC39672a) obj);
            case 1:
                return C37452i.m119949h(this.f160275x, (C32808d) obj);
            case 2:
                return C37470s.m120118h(this.f160275x, (String) obj);
            case 3:
                return C37470s.m120119i(this.f160275x, (LocalDate) obj);
            case 4:
                return C37470s.m120120j(this.f160275x, (AbstractC36597y) obj);
            case 5:
                return AbstractC37471t.m120143u(this.f160275x, obj);
            case 6:
                return C37443d0.m119876h(this.f160275x, (AbstractC31635g) obj);
            case 7:
                return C37443d0.m119877i(this.f160275x, (AbstractC39672a) obj);
            case 8:
                return C37443d0.m119880l(this.f160275x, (AbstractC39672a) obj);
            case 9:
                return AbstractC37447f0.m119916n(this.f160275x, (String) obj);
            case 10:
                return C37465o0.m120065e(this.f160275x, (AbstractC31635g) obj);
            case 11:
                return C37465o0.m120066f(this.f160275x, (AbstractC39672a) obj);
            case 12:
                return AbstractC37509c.m120224I(this.f160275x, obj);
            case 13:
                return AbstractC38137b.m122146n(this.f160275x, obj);
            case 14:
                return AbstractC38319a.m122795i(this.f160275x, (C39180l) obj);
            case 15:
                return C38325c.m122831d(this.f160275x, obj);
            case 16:
                return AbstractC38682f.m124082g(this.f160275x, (String) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39388k.m125661J0(this.f160275x, (C37035f) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39612l.m126537e0(this.f160275x, (String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C39688a.m127008e(this.f160275x, (AbstractC39672a) obj);
            case 20:
                return C39688a.m127009f(this.f160275x, (DecodedGenericInteraction) obj);
            case 21:
                return AbstractC39795e.m127546O(this.f160275x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C40091b.m128525g(this.f160275x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C40102m.m128633d(this.f160275x, obj);
            case 24:
                return AbstractC40358i5.m129945G(this.f160275x, ((Boolean) obj).booleanValue());
            case 25:
                return AbstractC40545b.m131396u(this.f160275x, obj);
            case 26:
                return C40999l.m133202f(this.f160275x, obj);
            case 27:
                return C40999l.m133203g(this.f160275x, obj);
            case 28:
                return AbstractC41068b.m133325m(this.f160275x, (String) obj);
            default:
                return AbstractC41068b.m133327o(this.f160275x, ((Integer) obj).intValue());
        }
    }
}
