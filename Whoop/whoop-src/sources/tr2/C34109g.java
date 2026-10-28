package tr2;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import androidx.room.C1807l1;
import androidx.room.C1810m1;
import androidx.room.C1813n1;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.data.local.room.dao.wipeable.C6518e;
import e61.C12764g;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p007a6.C0428i;
import p132f0.C13806m1;
import p249jc.AbstractC21598x;
import p392p3.C28761b0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p518ub.InterfaceC34734g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import t71.C33572i;
import to1.C34015h;

/* JADX INFO: renamed from: tr2.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C34109g implements InterfaceC34108f {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f143013a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f143014b = new a();

    /* JADX INFO: renamed from: tr2.g$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C34110h c34110h) {
            if (c34110h.getUserId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5356p(1, c34110h.getUserId().intValue());
            }
            if (c34110h.getUtcDateTime() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c34110h.getUtcDateTime());
            }
            if (c34110h.getLocalDateTime() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, c34110h.getLocalDateTime());
            }
            if (c34110h.getBody() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, c34110h.getBody());
            }
            interfaceC33689c.mo5356p(5, c34110h.getId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR ABORT INTO `table_log_stream` (`user_id`,`utc_date_time`,`local_date_time`,`body`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }
    }

    public C34109g(AbstractC1848z0 abstractC1848z0) {
        this.f143013a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: q */
    public static List<Class<?>> m107823q() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Integer m107824r(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM table_log_stream");
        try {
            return Integer.valueOf(interfaceC33689cMo68212g1.mo5355e1() ? (int) interfaceC33689cMo68212g1.getLong(0) : 0);
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m107825s(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_log_stream");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return null;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Integer m107826t(String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_log_stream WHERE utc_date_time <= ?");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            interfaceC33689cMo68212g1.mo5355e1();
            Integer numValueOf = Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
            interfaceC33689cMo68212g1.close();
            return numValueOf;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Integer m107827u(String str, String str2, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_log_stream WHERE id IN(SELECT id FROM table_log_stream WHERE utc_date_time >= ? AND utc_date_time <= ? ORDER BY utc_date_time ASC LIMIT ?)");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            if (str2 == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5354L(2, str2);
            }
            interfaceC33689cMo68212g1.mo5356p(3, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            Integer numValueOf = Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
            interfaceC33689cMo68212g1.close();
            return numValueOf;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ List m107828v(String str, String str2, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_log_stream WHERE utc_date_time >= ? AND utc_date_time <= ? ORDER BY utc_date_time ASC LIMIT ?");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            if (str2 == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5354L(2, str2);
            }
            interfaceC33689cMo68212g1.mo5356p(3, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "utc_date_time");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "local_date_time");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "body");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = null;
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N));
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N4)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                }
                C34110h c34110h = new C34110h(numValueOf, strMo5353J1, strMo5353J2, strMo5353J0);
                c34110h.m107839f(interfaceC33689cMo68212g1.getLong(iM60658N5));
                arrayList.add(c34110h);
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ List m107829w(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT body FROM table_log_stream ORDER BY utc_date_time DESC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(interfaceC33689cMo68212g1.isNull(0) ? null : interfaceC33689cMo68212g1.mo5353J0(0));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ List m107830x(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_log_stream LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "utc_date_time");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "local_date_time");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "body");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = null;
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N));
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N4)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                }
                C34110h c34110h = new C34110h(numValueOf, strMo5353J1, strMo5353J2, strMo5353J0);
                c34110h.m107839f(interfaceC33689cMo68212g1.getLong(iM60658N5));
                arrayList.add(c34110h);
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object m107831y(C34110h c34110h, InterfaceC33687a interfaceC33687a) {
        this.f143014b.insert(interfaceC33687a, c34110h);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static Integer m107832z(String str, C1807l1 c1807l1, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(str);
        try {
            c1807l1.f7111a.invoke(interfaceC33689cMo68212g1);
            return Integer.valueOf(interfaceC33689cMo68212g1.mo5355e1() ? (int) interfaceC33689cMo68212g1.getLong(0) : 0);
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: a */
    public int mo107807a(InterfaceC34734g supportSQLiteQuery) {
        TreeMap treeMap = C1813n1.f7126I;
        AbstractC22676k.m65750j(supportSQLiteQuery, "supportSQLiteQuery");
        C1813n1 c1813n1M92118h = AbstractC30060g.m92118h(supportSQLiteQuery.mo5445b(), supportSQLiteQuery.mo5446h());
        supportSQLiteQuery.mo5447i(new C1810m1(c1813n1M92118h));
        String strMo5446h = c1813n1M92118h.mo5446h();
        return ((Integer) AbstractC15751g.m44432L(this.f143013a, true, false, new C28761b0(13, strMo5446h, new C1807l1(strMo5446h, new C0428i(c1813n1M92118h, 4))))).intValue();
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: b */
    public List<C34110h> mo107808b(int i13, String str, String str2) {
        return (List) AbstractC15751g.m44432L(this.f143013a, true, false, new C13806m1(str, str2, i13, 2));
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: c */
    public List<C34110h> mo107809c(int i13) {
        return (List) AbstractC15751g.m44432L(this.f143013a, true, false, new C6518e(i13, 7));
    }

    @Override // tr2.InterfaceC34108f
    public int count() {
        return ((Integer) AbstractC15751g.m44432L(this.f143013a, true, false, new C34015h(13))).intValue();
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: d */
    public Object mo107810d(int i13, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f143013a, true, false, new C6494e(i13, 26), interfaceC30057d);
    }

    @Override // tr2.InterfaceC34108f
    public void deleteAll() {
        AbstractC15751g.m44432L(this.f143013a, false, true, new C33572i(14));
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: e */
    public int mo107811e(int i13, String str, String str2) {
        return ((Integer) AbstractC15751g.m44432L(this.f143013a, false, true, new C6517d(str, str2, i13, 16))).intValue();
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: f */
    public void mo107812f(C34110h c34110h) {
        c34110h.getClass();
        AbstractC15751g.m44432L(this.f143013a, false, true, new C28761b0(12, this, c34110h));
    }

    @Override // tr2.InterfaceC34108f
    /* JADX INFO: renamed from: g */
    public int mo107813g(String str) {
        return ((Integer) AbstractC15751g.m44432L(this.f143013a, false, true, new C12764g(str, 21))).intValue();
    }
}
