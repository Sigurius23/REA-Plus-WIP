package t71;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.ShippingProgressBarModel;
import com.whoop.design.models.items.datepicker.DatePickerModel;
import com.whoop.membership.familyPlan.navigation.C9114b;
import em1.InterfaceC13346t;
import i21.C17991a;
import jb1.C21536b;
import l83.C23454a0;
import p114eb.C12970k1;
import p500tb.InterfaceC33687a;
import p510u0.AbstractC34323i;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import po2.InterfaceC29402a;
import qu1.InterfaceC30626b;
import qu1.InterfaceC30627c;
import t80.AbstractC33593c;
import tb1.AbstractC33692a;
import td2.AbstractC33720k;
import tf0.AbstractC33761b;
import ti2.AbstractC33856c;
import tl0.AbstractC33915b;
import to2.AbstractC34023a;
import tr2.C34109g;
import tu1.AbstractC34193f;
import tx0.AbstractC34241d;
import ty0.AbstractC34254b;
import ty1.AbstractC34264i;
import ty1.InterfaceC34265j;
import tz0.AbstractC34277b;
import tz1.AbstractC34281c;

/* JADX INFO: renamed from: t71.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33572i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140073w;

    public /* synthetic */ C33572i(int i13) {
        this.f140073w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140073w) {
            case 0:
                return C33573j.m106023b((C17991a) obj);
            case 1:
                return AbstractC33576m.m106039i(obj);
            case 2:
                return AbstractC33578o.m106056e(obj);
            case 3:
                return C33579p.m106060b((C17991a) obj);
            case 4:
                return AbstractC33593c.m106097d(obj);
            case 5:
                return AbstractC33692a.m106437d((C23749z0) obj);
            case 6:
                return AbstractC33692a.m106438e((DatePickerModel) obj);
            case 7:
                return AbstractC33720k.m106597e((C21536b) obj);
            case 8:
                return AbstractC33720k.m106598f((C23749z0) obj);
            case 9:
                return AbstractC33720k.m106599g((CtaTileModel) obj);
            case 10:
                return AbstractC33761b.m106744c((C21536b) obj);
            case 11:
                return AbstractC33856c.m107059c((C25308q) obj);
            case 12:
                return AbstractC33915b.m107280d(obj);
            case 13:
                return AbstractC34023a.m107607n((InterfaceC29402a) obj);
            case 14:
                return C34109g.m107825s((InterfaceC33687a) obj);
            case 15:
                return AbstractC34193f.m108052p((InterfaceC30626b) obj);
            case 16:
                return AbstractC34193f.m108053q((InterfaceC30627c.a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC34193f.m108032B((InterfaceC30627c.a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C9114b.m22750f((C12970k1) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC34241d.m108274w((InterfaceC13346t) obj);
            case 20:
                return AbstractC34241d.m108250B(obj);
            case 21:
                return AbstractC34254b.m108313e(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC34254b.m108314f(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC34264i.m108324A((InterfaceC34265j) obj);
            case 24:
                return AbstractC34277b.m108543f(obj);
            case 25:
                return AbstractC34281c.m108568e((C21536b) obj);
            case 26:
                return AbstractC34281c.m108569f((C23749z0) obj);
            case 27:
                return AbstractC34281c.m108570g((ShippingProgressBarModel) obj);
            case 28:
                int i13 = AbstractC34323i.f144126a;
                return C23454a0.f92919a;
            default:
                Long l7 = (Long) obj;
                l7.longValue();
                return l7;
        }
    }
}
