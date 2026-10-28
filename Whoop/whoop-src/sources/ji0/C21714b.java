package ji0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.navigation.C9598e;
import com.whoop.startactivity.goals.CollapsibleToggleContainerModel;
import d61.InterfaceC11732a;
import em1.InterfaceC13346t;
import jb1.C21536b;
import jk2.AbstractC21764e;
import jk2.AbstractC21768i;
import js1.AbstractC21914e;
import js1.AbstractC21916g;
import js1.AbstractC21921l;
import k01.AbstractC22092d;
import k71.AbstractC22253j;
import k71.AbstractC22269z;
import kc1.AbstractC22350a;
import kd1.AbstractC22404p;
import kf1.C22441b;
import kg2.AbstractC22457c;
import mh.C25540h;
import p040c0.InterfaceC3770q;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: ji0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21714b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83347w;

    public /* synthetic */ C21714b(int i13) {
        this.f83347w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f83347w) {
            case 0:
                return C21715c.m61170h((InterfaceC33687a) obj);
            case 1:
                return AbstractC21764e.m61478h((InterfaceC13346t) obj);
            case 2:
                return AbstractC21764e.m61479i((C9598e) obj);
            case 3:
                return AbstractC21768i.m61524q((InterfaceC3770q) obj);
            case 4:
                return Integer.valueOf(AbstractC21768i.m61533z(((Integer) obj).intValue()));
            case 5:
                return Integer.valueOf(AbstractC21768i.m61498A(((Integer) obj).intValue()));
            case 6:
                return Integer.valueOf(AbstractC21768i.m61499B(((Integer) obj).intValue()));
            case 7:
                return Integer.valueOf(AbstractC21768i.m61532y(((Integer) obj).intValue()));
            case 8:
                return AbstractC21914e.m62355t(obj);
            case 9:
                return AbstractC21916g.m62362e(obj);
            case 10:
                return AbstractC21921l.m62406z(obj);
            case 11:
                return AbstractC21921l.m62375E(((Float) obj).floatValue());
            case 12:
                return AbstractC21921l.m62378H(obj);
            case 13:
                return AbstractC22092d.m63198x(obj);
            case 14:
                return AbstractC22092d.m63189o(obj);
            case 15:
                return AbstractC22253j.m63852v(obj);
            case 16:
                return AbstractC22253j.m63824J(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22269z.m63943L(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22269z.m63938G(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22269z.m63950S((InterfaceC11732a) obj);
            case 20:
                return AbstractC22269z.m63933B(obj);
            case 21:
                return AbstractC22350a.m64236e((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22350a.m64237f((HeightPickerModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC8692a.m21266d((String) obj);
            case 24:
                return AbstractC22404p.m64501j((C25540h) obj);
            case 25:
                return Boolean.valueOf(C22441b.m64752m((InterfaceC34816g0) obj));
            case 26:
                return AbstractC22457c.m64860e((C21536b) obj);
            case 27:
                return AbstractC22457c.m64863h((C25308q) obj);
            case 28:
                return AbstractC22457c.m64861f((C23749z0) obj);
            default:
                return AbstractC22457c.m64862g((CollapsibleToggleContainerModel) obj);
        }
    }
}
