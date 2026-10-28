package kx1;

import android.widget.TimePicker;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.membership.management.domain.models.items.DowngradeMembershipCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutRadioOptionModel;
import com.whoop.membership.management.domain.models.items.MembershipFeaturesCardModel;
import j93.InterfaceC21493z;
import java.util.List;
import kz2.AbstractC22929f;
import kz2.C22928e;
import l11.AbstractC23221c;
import l21.AbstractC23238b;
import l32.AbstractC23324c;
import l41.AbstractC23332d;
import l51.AbstractC23354d;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import mh.C25540h;
import p077d0.C11385o0;
import p088dc.AbstractC11895b;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18028j;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p292l1.AbstractC23141n2;
import p292l1.C23091f0;
import p294l3.C23251e0;
import p294l3.C23272p;
import p294l3.C23290y;
import p354o1.AbstractC27376o;
import p571w3.C36769e;
import p571w3.C36782r;
import p571w3.C36783s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import p745y81.C39336i;

/* JADX INFO: renamed from: kx1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22881b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90328w;

    public /* synthetic */ C22881b(int i13) {
        this.f90328w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f90328w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC22882c.m66494o((DowngradeMembershipCardModel) obj);
            case 1:
                return AbstractC22882c.m66495p((MembershipFeaturesCardModel) obj);
            case 2:
                return AbstractC22882c.m66496q((MembershipCheckoutRadioOptionModel) obj);
            case 3:
                return C22928e.m66692e((C39336i) obj);
            case 4:
                return C22928e.m66693f((C25540h) obj);
            case 5:
                return AbstractC22929f.m66698c((C25308q) obj);
            case 6:
                return c23454a0;
            case 7:
                return Boolean.TRUE;
            case 8:
                AbstractC18041w.m51810i((InterfaceC18044z) obj, 0);
                return c23454a0;
            case 9:
                return c23454a0;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 11:
                AbstractC18041w.m51805d((InterfaceC18044z) obj);
                return c23454a0;
            case 12:
                AbstractC18041w.m51805d((InterfaceC18044z) obj);
                return c23454a0;
            case 13:
                C18028j c18028j = new C18028j(new C23091f0(1), new C23091f0(1));
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                C18043y c18043y = AbstractC18039u.f70053t;
                InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[11];
                c18043y.m51817a((InterfaceC18044z) obj, c18028j);
                return c23454a0;
            case 14:
                float f13 = AbstractC23141n2.f91510a;
                return Boolean.TRUE;
            case 15:
                AbstractC18041w.m51815n((InterfaceC18044z) obj);
                return c23454a0;
            case 16:
                InterfaceC21493z[] interfaceC21493zArr2 = AbstractC18041w.f70062a;
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC18039u.f70056w, c23454a0);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C11385o0 c11385o0 = (C11385o0) obj;
                c11385o0.f36506a = ErrorCodes.GenericErrors.cNotConnected;
                Float fValueOf = Float.valueOf(90.0f);
                c11385o0.m30615a(300, fValueOf).f36485b = AbstractC27376o.f109953b;
                c11385o0.m30615a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                c11385o0.m30615a(1800, fValueOf2);
                c11385o0.m30615a(ErrorCodes.TracksErrors.cGenericTrack, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                c11385o0.m30615a(3300, fValueOf3);
                c11385o0.m30615a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                c11385o0.m30615a(4800, fValueOf4);
                c11385o0.m30615a(ErrorCodes.GenericErrors.cNotConnected, fValueOf4);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC18041w.m51805d((InterfaceC18044z) obj);
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23221c.m67180n(obj);
            case 20:
                return AbstractC23238b.m67276f(obj);
            case 21:
                C23290y c23290y = (C23290y) obj;
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append(c23290y.f92271b);
                sb4.append(", ");
                return AbstractC11895b.m31999r(sb4, c23290y.f92272c, ')');
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                AbstractC22676k.m65747g(bool);
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                AbstractC22676k.m65747g(obj3 != null ? (C23272p) obj3 : null);
                return new C23251e0(zBooleanValue, 0);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C36769e(((Integer) obj).intValue());
            case 24:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                C36782r c36782r = obj4 != null ? (C36782r) obj4 : null;
                AbstractC22676k.m65747g(c36782r);
                int i14 = c36782r.f157363a;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                AbstractC22676k.m65747g(bool2);
                return new C36783s(i14, bool2.booleanValue());
            case 25:
                return AbstractC23324c.m67531f(obj);
            case 26:
                return AbstractC23332d.m67563j((TimePicker) obj);
            case 27:
                return AbstractC23354d.m67610h(obj);
            case 28:
                return AbstractC23354d.m67611i((InterfaceC17886g0) obj);
            default:
                return AbstractC23354d.m67612j((InterfaceC22129c) obj);
        }
    }
}
