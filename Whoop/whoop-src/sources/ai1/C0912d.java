package ai1;

import a20.C0167g;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bi1.C3284a;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ai1.d */
/* JADX INFO: loaded from: classes9.dex */
public final class C0912d implements InterfaceC0909a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f3336a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f3337b = new a();

    /* JADX INFO: renamed from: ai1.d$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C3284a c3284a) {
            interfaceC33689c.mo5356p(1, c3284a.getSessionStartTimeMs());
            interfaceC33689c.mo5356p(2, c3284a.getTimestamp());
            interfaceC33689c.mo5358t(c3284a.getLatitude(), 3);
            interfaceC33689c.mo5358t(c3284a.getLongitude(), 4);
            interfaceC33689c.mo5358t(c3284a.getAltitude(), 5);
            interfaceC33689c.mo5358t(c3284a.getHorizontalAccuracyMeters(), 6);
            interfaceC33689c.mo5358t(c3284a.getVerticalAccuracyMeters(), 7);
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `foreground_gps_route_points` (`sessionStartTimeMs`,`timestamp`,`latitude`,`longitude`,`altitude`,`horizontal_accuracy_meters`,`vertical_accuracy_meters`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public C0912d(AbstractC1848z0 abstractC1848z0) {
        this.f3336a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: i */
    public static List<Class<?>> m2249i() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Integer m2250j(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM foreground_gps_route_points WHERE sessionStartTimeMs = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Integer m2251k(long j7, long j13, long j14, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM foreground_gps_route_points WHERE sessionStartTimeMs = ? AND timestamp BETWEEN ? AND ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            interfaceC33689cMo68212g1.mo5356p(3, j14);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ List m2252l(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM foreground_gps_route_points WHERE sessionStartTimeMs = ? ORDER BY timestamp ASC");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sessionStartTimeMs");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "latitude");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "longitude");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "altitude");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "horizontal_accuracy_meters");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "vertical_accuracy_meters");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C3284a(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.getDouble(iM60658N3), interfaceC33689cMo68212g1.getDouble(iM60658N4), interfaceC33689cMo68212g1.getDouble(iM60658N5), interfaceC33689cMo68212g1.getDouble(iM60658N6), interfaceC33689cMo68212g1.getDouble(iM60658N7)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ Long m2253m(C3284a c3284a, InterfaceC33687a interfaceC33687a) {
        return Long.valueOf(this.f3337b.insertAndReturnId(interfaceC33687a, c3284a));
    }

    @Override // ai1.InterfaceC0909a
    /* JADX INFO: renamed from: a */
    public Object mo2241a(long j7, InterfaceC30057d<? super List<C3284a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f3336a, true, false, new C0910b(j7, 0), interfaceC30057d);
    }

    @Override // ai1.InterfaceC0909a
    /* JADX INFO: renamed from: b */
    public Object mo2242b(long j7, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f3336a, false, true, new C0910b(j7, 1), interfaceC30057d);
    }

    @Override // ai1.InterfaceC0909a
    /* JADX INFO: renamed from: c */
    public Object mo2243c(final long j7, final long j13, final long j14, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f3336a, false, true, new Function1() { // from class: ai1.c
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C0912d.m2251k(j7, j13, j14, (InterfaceC33687a) obj);
            }
        }, interfaceC30057d);
    }

    @Override // ai1.InterfaceC0909a
    /* JADX INFO: renamed from: d */
    public Object mo2244d(C3284a c3284a, InterfaceC30057d<? super Long> interfaceC30057d) {
        c3284a.getClass();
        return AbstractC15751g.m44434N(this.f3336a, false, true, new C0167g(5, this, c3284a), interfaceC30057d);
    }
}
