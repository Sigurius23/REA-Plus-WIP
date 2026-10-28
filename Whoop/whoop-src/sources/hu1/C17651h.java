package hu1;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: hu1.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C17651h implements InterfaceC17647d {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f68429a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f68430b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1794i f68431c = new b();

    /* JADX INFO: renamed from: hu1.h$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C17645b c17645b) {
            interfaceC33689c.mo5356p(1, c17645b.getTimestamp());
            interfaceC33689c.mo5356p(2, c17645b.getPacketRevision());
            interfaceC33689c.mo5357q(3, c17645b.getPacketData().array());
            interfaceC33689c.mo5356p(4, c17645b.getVersionId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ecg_packets` (`timestamp`,`packet_revision`,`packet_data`,`version_id`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: hu1.h$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C17645b c17645b) {
            interfaceC33689c.mo5356p(1, c17645b.getTimestamp());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `ecg_packets` WHERE `timestamp` = ?";
        }
    }

    public C17651h(AbstractC1848z0 abstractC1848z0) {
        this.f68429a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: g */
    public static List<Class<?>> m50284g() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ C23454a0 m50285h(List list, InterfaceC33687a interfaceC33687a) {
        this.f68431c.handleMultiple(interfaceC33687a, list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m50286i(int i13, int i14, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM ecg_packets WHERE packet_revision = ? ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_revision");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C17645b(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ C23454a0 m50287j(List list, InterfaceC33687a interfaceC33687a) {
        this.f68430b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Long m50288k(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(timestamp) FROM ecg_packets");
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

    @Override // hu1.InterfaceC17647d
    /* JADX INFO: renamed from: a */
    public Object mo50278a(List<C17645b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f68429a, false, true, new C17648e(this, list, 1), interfaceC30057d);
    }

    @Override // hu1.InterfaceC17647d
    /* JADX INFO: renamed from: b */
    public Object mo50279b(int i13, int i14, InterfaceC30057d<? super List<C17645b>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f68429a, true, false, new C17649f(i14, i13, 0), interfaceC30057d);
    }

    @Override // hu1.InterfaceC17647d
    public Object insertList(List<C17645b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f68429a, false, true, new C17648e(this, list, 0), interfaceC30057d);
    }

    @Override // hu1.InterfaceC17647d
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.f68429a, new String[]{"ecg_packets"}, new C17650g(0));
    }
}
