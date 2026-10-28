package mu0;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.wipeable.C6518e;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import md0.C25447b;
import mm1.C25694h;
import nu0.C27136a;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: mu0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C25953e implements InterfaceC25949a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f102512a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f102513b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1794i f102514c = new b();

    /* JADX INFO: renamed from: mu0.e$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C27136a c27136a) {
            interfaceC33689c.mo5356p(1, c27136a.getPacketRevision());
            interfaceC33689c.mo5356p(2, c27136a.getTimestamp());
            interfaceC33689c.mo5357q(3, c27136a.getPacketData().array());
            interfaceC33689c.mo5356p(4, c27136a.getVersionId());
            interfaceC33689c.mo5356p(5, c27136a.getFrameRevision());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_metrics_data` (`packet_revision`,`timestamp`,`packet_data`,`version_id`,`frame_revision`) VALUES (?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: mu0.e$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C27136a c27136a) {
            interfaceC33689c.mo5356p(1, c27136a.getTimestamp());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `table_metrics_data` WHERE `timestamp` = ?";
        }
    }

    public C25953e(AbstractC1848z0 abstractC1848z0) {
        this.f102512a = abstractC1848z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ List m76802A(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_metrics_data ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_revision");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "frame_revision");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C27136a((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ List m76803B(int i13, int i14, int i15, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_metrics_data WHERE packet_revision == ? AND version_id == ? ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            interfaceC33689cMo68212g1.mo5356p(3, i15);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_revision");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "frame_revision");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C27136a((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ List m76804C(int i13, long j7, long j13, int i14, long j14, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_metrics_data WHERE packet_revision == ? AND timestamp >= ? AND timestamp <= ? AND version_id == ? ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, j7);
            interfaceC33689cMo68212g1.mo5356p(3, j13);
            interfaceC33689cMo68212g1.mo5356p(4, i14);
            interfaceC33689cMo68212g1.mo5356p(5, j14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_revision");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "frame_revision");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C27136a((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Integer m76805D(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT packet_revision FROM table_metrics_data ORDER BY timestamp ASC LIMIT 1");
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
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Long m76806E(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT timestamp FROM table_metrics_data WHERE packet_revision == ? ORDER BY timestamp ASC LIMIT 1");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(0));
            }
            return lValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Integer m76807F(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT version_id FROM table_metrics_data WHERE packet_revision == ? ORDER BY timestamp ASC LIMIT 1");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
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
    /* JADX INFO: renamed from: G */
    public /* synthetic */ C23454a0 m76808G(List list, InterfaceC33687a interfaceC33687a) {
        this.f102513b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Long m76809H(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(timestamp) FROM table_metrics_data");
        try {
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(0));
            }
            return lValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: renamed from: w */
    public static List<Class<?>> m76821w() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Integer m76822x(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM table_metrics_data WHERE packet_revision == ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
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
    /* JADX INFO: renamed from: y */
    public /* synthetic */ Integer m76823y(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.f102514c.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Long m76824z(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT timestamp FROM table_metrics_data WHERE packet_revision == ? ORDER BY timestamp DESC LIMIT 1");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(0));
            }
            return lValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: a */
    public Object mo76792a(List<C27136a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f102512a, false, true, new C25950b(this, list, 1), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: b */
    public Object mo76793b(long j7, int i13, long j13, long j14, int i14, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return InterfaceC25949a.a.m76801a(this, j7, i13, j13, j14, i14, interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: e */
    public Object mo76794e(int i13, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new C6518e(i13, 1), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: f */
    public Object mo76795f(int i13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new C6518e(i13, 2), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: g */
    public Object mo76796g(int i13, InterfaceC30057d<? super Long> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new C6518e(i13, 4), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    public Object getOldestPacketRevision(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new C25447b(24), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: h */
    public Object mo76797h(int i13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new C6518e(i13, 5), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: i */
    public Object mo76798i(final long j7, final int i13, final long j13, final long j14, final int i14, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new Function1() { // from class: mu0.d
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C25953e.m76804C(i13, j13, j14, i14, j7, (InterfaceC33687a) obj);
            }
        }, interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    public Object insertList(List<C27136a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f102512a, false, true, new C25950b(this, list, 0), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: j */
    public Object mo76799j(final int i13, final int i14, final int i15, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new Function1() { // from class: mu0.c
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C25953e.m76803B(i13, i14, i15, (InterfaceC33687a) obj);
            }
        }, interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    /* JADX INFO: renamed from: k */
    public Object mo76800k(int i13, InterfaceC30057d<? super Long> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f102512a, true, false, new C6518e(i13, 3), interfaceC30057d);
    }

    @Override // mu0.InterfaceC25949a
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.f102512a, new String[]{"table_metrics_data"}, new C25694h(24));
    }
}
