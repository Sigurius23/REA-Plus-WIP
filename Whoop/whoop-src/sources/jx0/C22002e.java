package jx0;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import e61.C12764g;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: jx0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C22002e implements InterfaceC21999b {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f85247a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f85248b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1794i f85249c = new b();

    /* JADX INFO: renamed from: d */
    private final AbstractC1794i f85250d = new c();

    /* JADX INFO: renamed from: jx0.e$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C21998a c21998a) {
            if (c21998a.getWorkerId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, c21998a.getWorkerId());
            }
            if (c21998a.getTriggerSource() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c21998a.getTriggerSource());
            }
            interfaceC33689c.mo5356p(3, c21998a.getTriggerTimestamp());
            interfaceC33689c.mo5356p(4, c21998a.getResultTimestamp());
            interfaceC33689c.mo5356p(5, c21998a.getTotalPackUpload());
            interfaceC33689c.mo5356p(6, c21998a.getUploadRetryCount());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `data_sync_work_db` (`workerId`,`source`,`trigger_timestamp`,`result_timestamp`,`total_packet_upload`,`upload_retry_count`) VALUES (?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: jx0.e$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C21998a c21998a) {
            if (c21998a.getWorkerId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, c21998a.getWorkerId());
            }
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `data_sync_work_db` WHERE `workerId` = ?";
        }
    }

    /* JADX INFO: renamed from: jx0.e$c */
    public class c extends AbstractC1794i {
        public c() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C21998a c21998a) {
            if (c21998a.getWorkerId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, c21998a.getWorkerId());
            }
            if (c21998a.getTriggerSource() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c21998a.getTriggerSource());
            }
            interfaceC33689c.mo5356p(3, c21998a.getTriggerTimestamp());
            interfaceC33689c.mo5356p(4, c21998a.getResultTimestamp());
            interfaceC33689c.mo5356p(5, c21998a.getTotalPackUpload());
            interfaceC33689c.mo5356p(6, c21998a.getUploadRetryCount());
            if (c21998a.getWorkerId() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, c21998a.getWorkerId());
            }
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "UPDATE OR ABORT `data_sync_work_db` SET `workerId` = ?,`source` = ?,`trigger_timestamp` = ?,`result_timestamp` = ?,`total_packet_upload` = ?,`upload_retry_count` = ? WHERE `workerId` = ?";
        }
    }

    public C22002e(AbstractC1848z0 abstractC1848z0) {
        this.f85247a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m62870k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ C23454a0 m62871l(C21998a c21998a, InterfaceC33687a interfaceC33687a) {
        this.f85249c.handle(interfaceC33687a, c21998a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ List m62872m(String str, long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM data_sync_work_db WHERE source = ? AND ? < trigger_timestamp");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            interfaceC33689cMo68212g1.mo5356p(2, j7);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "workerId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "source");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "trigger_timestamp");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "result_timestamp");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "total_packet_upload");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "upload_retry_count");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C21998a(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3), interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C21998a m62873n(String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM data_sync_work_db WHERE workerId = ? LIMIT 1");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "workerId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "source");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "trigger_timestamp");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "result_timestamp");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "total_packet_upload");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "upload_retry_count");
            C21998a c21998a = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                c21998a = new C21998a(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3), interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6));
            }
            interfaceC33689cMo68212g1.close();
            return c21998a;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ C23454a0 m62874o(C21998a c21998a, InterfaceC33687a interfaceC33687a) {
        this.f85248b.insert(interfaceC33687a, c21998a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ C23454a0 m62875p(C21998a c21998a, InterfaceC33687a interfaceC33687a) {
        this.f85250d.handle(interfaceC33687a, c21998a);
        return C23454a0.f92919a;
    }

    @Override // jx0.InterfaceC21999b
    /* JADX INFO: renamed from: a */
    public Object mo62860a(C21998a c21998a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c21998a.getClass();
        return AbstractC15751g.m44434N(this.f85247a, false, true, new C22000c(this, c21998a, 1), interfaceC30057d);
    }

    @Override // jx0.InterfaceC21999b
    /* JADX INFO: renamed from: b */
    public Object mo62861b(String str, long j7, InterfaceC30057d<? super List<C21998a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f85247a, true, false, new C22001d(str, j7), interfaceC30057d);
    }

    @Override // jx0.InterfaceC21999b
    /* JADX INFO: renamed from: c */
    public Object mo62862c(String str, InterfaceC30057d<? super C21998a> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f85247a, true, false, new C12764g(str, 3), interfaceC30057d);
    }

    @Override // jx0.InterfaceC21999b
    /* JADX INFO: renamed from: d */
    public Object mo62863d(C21998a c21998a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c21998a.getClass();
        return AbstractC15751g.m44434N(this.f85247a, false, true, new C22000c(this, c21998a, 0), interfaceC30057d);
    }

    @Override // jx0.InterfaceC21999b
    /* JADX INFO: renamed from: e */
    public Object mo62864e(C21998a c21998a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c21998a.getClass();
        return AbstractC15751g.m44434N(this.f85247a, false, true, new C22000c(this, c21998a, 2), interfaceC30057d);
    }
}
