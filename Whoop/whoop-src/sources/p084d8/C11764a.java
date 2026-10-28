package p084d8;

import androidx.health.platform.client.exerciseroute.ExerciseRoute;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.C1456e2;
import androidx.health.platform.client.proto.C1466g2;
import androidx.health.platform.client.proto.C1476i2;
import androidx.health.platform.client.proto.C1479j0;
import androidx.health.platform.client.proto.C1486k2;
import androidx.health.platform.client.proto.C1496m2;
import androidx.health.platform.client.proto.C1506o2;
import androidx.health.platform.client.proto.C1511p2;
import androidx.health.platform.client.proto.C1516q2;
import androidx.health.platform.client.proto.C1518r;
import androidx.health.platform.client.proto.C1526s2;
import androidx.health.platform.client.proto.C1531t2;
import androidx.health.platform.client.proto.C1545w1;
import androidx.health.platform.client.proto.InterfaceC1544w0;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.C5576g;
import p111e8.C12808a;
import p111e8.C12809b;
import p111e8.C12810c;
import p111e8.C12811d;
import p111e8.C12812e;
import p111e8.C12813f;
import p140f8.C14238a;
import p140f8.C14239b;
import p140f8.C14240c;
import p140f8.C14241d;
import p470rv.AbstractC31834n;
import p512u2.AbstractC34455e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C11764a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11764a(int i13, int i14) {
        super(i13);
        this.f38087w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38087w) {
            case 0:
                byte[] it = (byte[]) obj;
                AbstractC22676k.m65750j(it, "it");
                return new Permission(C1545w1.m4926s(it));
            case 1:
                byte[] it3 = (byte[]) obj;
                AbstractC22676k.m65750j(it3, "it");
                C1456e2 c1456e2M4599u = C1456e2.m4599u(it3);
                InterfaceC1544w0 interfaceC1544w0M4601s = c1456e2M4599u.m4601s();
                AbstractC22676k.m65749i(interfaceC1544w0M4601s, "proto.uidsList");
                InterfaceC1544w0 interfaceC1544w0M4600r = c1456e2M4599u.m4600r();
                AbstractC22676k.m65749i(interfaceC1544w0M4600r, "proto.clientIdsList");
                return new C12808a(interfaceC1544w0M4601s, interfaceC1544w0M4600r);
            case 2:
                byte[] it4 = (byte[]) obj;
                AbstractC22676k.m65750j(it4, "it");
                return new C12809b(C1466g2.m4629r(it4));
            case 3:
                byte[] it5 = (byte[]) obj;
                AbstractC22676k.m65750j(it5, "it");
                return new C12810c(C1476i2.m4638s(it5));
            case 4:
                byte[] it6 = (byte[]) obj;
                AbstractC22676k.m65750j(it6, "it");
                return new C12811d(C1486k2.m4685v(it6));
            case 5:
                byte[] it7 = (byte[]) obj;
                AbstractC22676k.m65750j(it7, "it");
                C1496m2 c1496m2M4702y = C1496m2.m4702y(it7);
                String callingPackage = c1496m2M4702y.m4703t();
                AbstractC22676k.m65749i(callingPackage, "callingPackage");
                return new C12812e(callingPackage, c1496m2M4702y.m4706w(), c1496m2M4702y.m4705v(), c1496m2M4702y.m4704u());
            case 6:
                byte[] it8 = (byte[]) obj;
                AbstractC22676k.m65750j(it8, "it");
                InterfaceC1544w0 interfaceC1544w0M4788q = C1506o2.m4787s(it8).m4788q();
                AbstractC22676k.m65749i(interfaceC1544w0M4788q, "proto.dataPointList");
                return new C12813f(interfaceC1544w0M4788q);
            case 7:
                byte[] it9 = (byte[]) obj;
                AbstractC22676k.m65750j(it9, "it");
                return new C14238a(C1511p2.m4796t(it9));
            case 8:
                byte[] it10 = (byte[]) obj;
                AbstractC22676k.m65750j(it10, "it");
                return new C14239b(C1516q2.m4802q(it10));
            case 9:
                byte[] it11 = (byte[]) obj;
                AbstractC22676k.m65750j(it11, "it");
                InterfaceC1544w0 interfaceC1544w0M4819q = C1526s2.m4818s(it11).m4819q();
                AbstractC22676k.m65749i(interfaceC1544w0M4819q, "proto.dataPointUidList");
                return new C14240c(interfaceC1544w0M4819q);
            case 10:
                byte[] it12 = (byte[]) obj;
                AbstractC22676k.m65750j(it12, "it");
                return new C14241d(C1531t2.m4820q(it12));
            case 11:
                byte[] it13 = (byte[]) obj;
                AbstractC22676k.m65750j(it13, "it");
                C1479j0 c1479j0M4646v = C1479j0.m4646v(it13);
                return AbstractC31834n.m98900i(c1479j0M4646v.m4647r(), c1479j0M4646v.m4649t() ? c1479j0M4646v.m4648s() : null);
            case 12:
                AbstractC5579j builder = (AbstractC5579j) obj;
                AbstractC22676k.m65750j(builder, "builder");
                return ((C5576g) builder).m16741b(null);
            case 13:
                ((AbstractC34455e) obj).getClass();
                return Boolean.TRUE;
            default:
                byte[] it14 = (byte[]) obj;
                AbstractC22676k.m65750j(it14, "it");
                return new ExerciseRoute(C1518r.m4811t(it14));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11764a(Object obj, int i13) {
        super(1);
        this.f38087w = i13;
    }
}
