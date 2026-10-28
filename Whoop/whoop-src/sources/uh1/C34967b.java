package uh1;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.C6494e;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.C19212a;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import sg2.C32469t;
import u71.C34569c;
import vh1.C36045a;

/* JADX INFO: renamed from: uh1.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C34967b implements InterfaceC34966a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f147941a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f147942b = new a();

    /* JADX INFO: renamed from: uh1.b$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C36045a c36045a) {
            interfaceC33689c.mo5356p(1, c36045a.getTimestamp());
            interfaceC33689c.mo5358t(c36045a.getLatitude(), 2);
            interfaceC33689c.mo5358t(c36045a.getLongitude(), 3);
            interfaceC33689c.mo5358t(c36045a.getAltitude(), 4);
            interfaceC33689c.mo5358t(c36045a.getHorizontalAccuracyMeters(), 5);
            interfaceC33689c.mo5358t(c36045a.getVerticalAccuracyMeters(), 6);
            if (c36045a.getSpeedValue() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5358t(c36045a.getSpeedValue().doubleValue(), 7);
            }
            if (c36045a.getSpeedUnit() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, c36045a.getSpeedUnit());
            }
            if (c36045a.getSpeedAccuracy() == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5358t(c36045a.getSpeedAccuracy().doubleValue(), 9);
            }
            if (c36045a.getTrigger() == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, c36045a.getTrigger());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `gps_locations` (`timestamp`,`latitude`,`longitude`,`altitude`,`horizontal_accuracy_meters`,`vertical_accuracy_meters`,`speed_value`,`speed_unit`,`speed_accuracy`,`trigger`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public C34967b(AbstractC1848z0 abstractC1848z0) {
        this.f147941a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m110440k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Integer m110441l(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM gps_locations");
        try {
            Integer numValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0));
            }
            return numValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Integer m110442m(String str, List list, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                Long l7 = (Long) it.next();
                if (l7 == null) {
                    interfaceC33689cMo68212g1.mo5359u(i13);
                } else {
                    interfaceC33689cMo68212g1.mo5356p(i13, l7.longValue());
                }
                i13++;
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ List m110443n(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM gps_locations ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "latitude");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "longitude");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "altitude");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "horizontal_accuracy_meters");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "vertical_accuracy_meters");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "speed_value");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "speed_unit");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "speed_accuracy");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "trigger");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C36045a(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getDouble(iM60658N2), interfaceC33689cMo68212g1.getDouble(iM60658N3), interfaceC33689cMo68212g1.getDouble(iM60658N4), interfaceC33689cMo68212g1.getDouble(iM60658N5), interfaceC33689cMo68212g1.getDouble(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Double.valueOf(interfaceC33689cMo68212g1.getDouble(iM60658N7)), interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8), interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : Double.valueOf(interfaceC33689cMo68212g1.getDouble(iM60658N9)), interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10)));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Long m110444o(C36045a c36045a, InterfaceC33687a interfaceC33687a) {
        return Long.valueOf(this.f147942b.insertAndReturnId(interfaceC33687a, c36045a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Integer m110445p(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("\n        DELETE FROM gps_locations\n        WHERE timestamp < (\n          SELECT timestamp FROM gps_locations\n          ORDER BY timestamp DESC\n          LIMIT 1 OFFSET ? - 1\n        )\n    ");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // uh1.InterfaceC34966a
    /* JADX INFO: renamed from: a */
    public Object mo110430a(List<Long> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("DELETE FROM gps_locations WHERE timestamp IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        return AbstractC15751g.m44434N(this.f147941a, false, true, new C19212a(4, sbM53374o.toString(), list), interfaceC30057d);
    }

    @Override // uh1.InterfaceC34966a
    /* JADX INFO: renamed from: b */
    public Object mo110431b(int i13, InterfaceC30057d<? super List<C36045a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f147941a, true, false, new C6494e(i13, 28), interfaceC30057d);
    }

    @Override // uh1.InterfaceC34966a
    /* JADX INFO: renamed from: c */
    public Object mo110432c(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f147941a, true, false, new C34569c(24), interfaceC30057d);
    }

    @Override // uh1.InterfaceC34966a
    /* JADX INFO: renamed from: d */
    public Object mo110433d(int i13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f147941a, false, true, new C6494e(i13, 27), interfaceC30057d);
    }

    @Override // uh1.InterfaceC34966a
    /* JADX INFO: renamed from: e */
    public Object mo110434e(C36045a c36045a, InterfaceC30057d<? super Long> interfaceC30057d) {
        c36045a.getClass();
        return AbstractC15751g.m44434N(this.f147941a, false, true, new C32469t(26, this, c36045a), interfaceC30057d);
    }
}
