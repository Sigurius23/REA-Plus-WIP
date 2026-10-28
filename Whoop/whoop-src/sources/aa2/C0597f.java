package aa2;

import a11.C0129g;
import a20.C0167g;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.mapbox.common.HttpHeaders;
import ge3.AbstractC15751g;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p000.C28503p;
import p003a1.C0103b;
import p007a6.C0428i;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: aa2.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C0597f implements InterfaceC0596e {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f2108a;

    /* JADX INFO: renamed from: d */
    private final C0593b f2111d = new C0593b();

    /* JADX INFO: renamed from: e */
    private final C0594c f2112e = new C0594c();

    /* JADX INFO: renamed from: f */
    private final C0595d f2113f = new C0595d();

    /* JADX INFO: renamed from: g */
    private final C0592a f2114g = new C0592a();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f2109b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1802k f2110c = new b();

    /* JADX INFO: renamed from: aa2.f$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C0598g c0598g) {
            interfaceC33689c.mo5356p(1, c0598g.getId());
            if (c0598g.getCreatedAt() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c0598g.getCreatedAt());
            }
            if (c0598g.getFirstName() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, c0598g.getFirstName());
            }
            if (c0598g.getLastName() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, c0598g.getLastName());
            }
            if (c0598g.getFullName() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, c0598g.getFullName());
            }
            if (c0598g.getEmailAddress() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, c0598g.getEmailAddress());
            }
            if (c0598g.getPassword() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, c0598g.getPassword());
            }
            if (c0598g.getUsername() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, c0598g.getUsername());
            }
            if (c0598g.getAvatarUrl() == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5354L(9, c0598g.getAvatarUrl());
            }
            if (c0598g.getCity() == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, c0598g.getCity());
            }
            if (c0598g.getAdminDivision() == null) {
                interfaceC33689c.mo5359u(11);
            } else {
                interfaceC33689c.mo5354L(11, c0598g.getAdminDivision());
            }
            if (c0598g.getCountry() == null) {
                interfaceC33689c.mo5359u(12);
            } else {
                interfaceC33689c.mo5354L(12, c0598g.getCountry());
            }
            interfaceC33689c.mo5356p(13, c0598g.getConcealed() ? 1L : 0L);
            interfaceC33689c.mo5356p(14, c0598g.getCom.mapbox.common.HttpHeaders.AGE java.lang.String());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_user` (`id`,`created_at`,`first_name`,`last_name`,`full_name`,`email_address`,`password`,`username`,`avatar_url`,`city`,`admin_division`,`country`,`concealed`,`age`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: aa2.f$b */
    public class b extends AbstractC1802k {
        public b() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C0600i c0600i) {
            interfaceC33689c.mo5356p(1, c0600i.getId());
            String strM1549a = C0597f.this.f2111d.m1549a(c0600i.getGender());
            if (strM1549a == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, strM1549a);
            }
            interfaceC33689c.mo5358t(c0600i.getHeight(), 3);
            interfaceC33689c.mo5358t(c0600i.getWeight(), 4);
            String strM1551a = C0597f.this.f2112e.m1551a(c0600i.getBirthday());
            if (strM1551a == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, strM1551a);
            }
            if (c0600i.getTimeZoneOffset() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, c0600i.getTimeZoneOffset());
            }
            String strM1553a = C0597f.this.f2113f.m1553a(c0600i.getUnitSystem());
            if (strM1553a == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, strM1553a);
            }
            String strM1547a = C0597f.this.f2114g.m1547a(c0600i.getFitnessLevel());
            if (strM1547a == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strM1547a);
            }
            interfaceC33689c.mo5356p(9, c0600i.getMaxHeartRate());
            interfaceC33689c.mo5356p(10, c0600i.getMinHeartRate());
            if (c0600i.getPhysiologicalBaseline() == null) {
                interfaceC33689c.mo5359u(11);
            } else {
                interfaceC33689c.mo5354L(11, c0600i.getPhysiologicalBaseline());
            }
            interfaceC33689c.mo5356p(12, c0600i.getCanUploadData() ? 1L : 0L);
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_user_profile` (`id`,`gender`,`height`,`weight`,`birthday`,`time_zone_offset`,`unit_system`,`fitness_level`,`max_heart_rate`,`min_heart_rate`,`physiological_baseline`,`can_upload_data`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public C0597f(AbstractC1848z0 abstractC1848z0) {
        this.f2108a = abstractC1848z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ C23454a0 m1563A(C0600i c0600i, InterfaceC33687a interfaceC33687a) {
        this.f2110c.insert(interfaceC33687a, c0600i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static List<Class<?>> m1575t() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C23454a0 m1576u(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_user");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C23454a0 m1577v(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_user_profile");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C0598g m1578w(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_user LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "created_at");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "first_name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_name");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "full_name");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "email_address");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "password");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "username");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avatar_url");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "city");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "admin_division");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "country");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "concealed");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, HttpHeaders.AGE);
            C0598g c0598g = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                c0598g = new C0598g((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8), interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9), interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10), interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11), interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12), ((int) interfaceC33689cMo68212g1.getLong(iM60658N13)) != 0, (int) interfaceC33689cMo68212g1.getLong(iM60658N14));
            }
            return c0598g;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ C0600i m1579x(InterfaceC33687a interfaceC33687a) throws Exception {
        C0600i c0600i;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_user_profile LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "gender");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "height");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "weight");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "birthday");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_zone_offset");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "unit_system");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "fitness_level");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "max_heart_rate");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "min_heart_rate");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "physiological_baseline");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "can_upload_data");
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                c0600i = new C0600i((int) interfaceC33689cMo68212g1.getLong(iM60658N), this.f2111d.m1550b(interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2)), (float) interfaceC33689cMo68212g1.getDouble(iM60658N3), (float) interfaceC33689cMo68212g1.getDouble(iM60658N4), this.f2112e.m1552b(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5)), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), this.f2113f.m1554b(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7)), this.f2114g.m1548b(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8)), (int) interfaceC33689cMo68212g1.getLong(iM60658N9), (int) interfaceC33689cMo68212g1.getLong(iM60658N10), interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11), ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0);
            } else {
                c0600i = null;
            }
            return c0600i;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object m1580y(InterfaceC30057d interfaceC30057d) {
        return super.mo1562h(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ C23454a0 m1581z(C0598g c0598g, InterfaceC33687a interfaceC33687a) {
        this.f2109b.insert(interfaceC33687a, c0598g);
        return C23454a0.f92919a;
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: a */
    public Object mo1556a(InterfaceC30057d<? super C0600i> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f2108a, true, false, new C0428i(this, 1), interfaceC30057d);
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: b */
    public Object mo1557b(C0598g c0598g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c0598g.getClass();
        return AbstractC15751g.m44434N(this.f2108a, false, true, new C0167g(3, this, c0598g), interfaceC30057d);
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: c */
    public Object mo1558c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f2108a, false, true, new C28503p(13), interfaceC30057d);
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: d */
    public Object mo1559d(InterfaceC30057d<? super C0598g> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f2108a, true, false, new C0129g(2), interfaceC30057d);
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: e */
    public Object mo1560e(C0600i c0600i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c0600i.getClass();
        return AbstractC15751g.m44434N(this.f2108a, false, true, new C0167g(4, this, c0600i), interfaceC30057d);
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: f */
    public Object mo1561f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f2108a, false, true, new C28503p(14), interfaceC30057d);
    }

    @Override // aa2.InterfaceC0596e
    /* JADX INFO: renamed from: h */
    public Object mo1562h(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.f2108a, new C0103b(this, 4), interfaceC30057d);
    }
}
