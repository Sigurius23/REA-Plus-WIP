package au0;

import a11.C0129g;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bu0.C3634a;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C1991b1;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: au0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2055f implements InterfaceC2050a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f8171a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f8172b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1794i f8173c = new b();

    /* JADX INFO: renamed from: au0.f$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C3634a c3634a) {
            interfaceC33689c.mo5356p(1, c3634a.getTimestamp());
            interfaceC33689c.mo5356p(2, c3634a.getType());
            interfaceC33689c.mo5357q(3, c3634a.getPacketData().array());
            interfaceC33689c.mo5356p(4, c3634a.getVersionId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_strap_firmware_events` (`timestamp`,`type`,`packet_data`,`version_id`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: au0.f$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C3634a c3634a) {
            interfaceC33689c.mo5356p(1, c3634a.getTimestamp());
            interfaceC33689c.mo5356p(2, c3634a.getType());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `table_strap_firmware_events` WHERE `timestamp` = ? AND `type` = ?";
        }
    }

    public C2055f(AbstractC1848z0 abstractC1848z0) {
        this.f8171a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: n */
    public static List<Class<?>> m6467n() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object m6468o(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        return super.mo6459f(j7, j13, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ Integer m6469p(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.f8173c.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ List m6470q(long j7, long j13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_strap_firmware_events WHERE timestamp>=? AND timestamp<=? ORDER BY timestamp ASC");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C3634a(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ List m6471r(int i13, int i14, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_strap_firmware_events WHERE version_id = ? ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C3634a(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Integer m6472s(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT version_id FROM table_strap_firmware_events ORDER BY timestamp ASC LIMIT 1");
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
    /* JADX INFO: renamed from: t */
    public /* synthetic */ C23454a0 m6473t(List list, InterfaceC33687a interfaceC33687a) {
        this.f8172b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Long m6474u(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(timestamp) FROM table_strap_firmware_events");
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

    @Override // au0.InterfaceC2050a
    /* JADX INFO: renamed from: a */
    public Object mo6455a(List<C3634a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f8171a, false, true, new C2051b(this, list, 1), interfaceC30057d);
    }

    @Override // au0.InterfaceC2050a
    /* JADX INFO: renamed from: b */
    public Object mo6456b(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f8171a, true, false, new C0129g(7), interfaceC30057d);
    }

    @Override // au0.InterfaceC2050a
    /* JADX INFO: renamed from: c */
    public Object mo6457c(final long j7, final long j13, InterfaceC30057d<? super List<C3634a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f8171a, true, false, new Function1() { // from class: au0.d
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2055f.m6470q(j7, j13, (InterfaceC33687a) obj);
            }
        }, interfaceC30057d);
    }

    @Override // au0.InterfaceC2050a
    /* JADX INFO: renamed from: e */
    public Object mo6458e(int i13, int i14, InterfaceC30057d<? super List<C3634a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f8171a, true, false, new C2054e(i13, i14, 0), interfaceC30057d);
    }

    @Override // au0.InterfaceC2050a
    /* JADX INFO: renamed from: f */
    public Object mo6459f(final long j7, final long j13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.f8171a, new Function1() { // from class: au0.c
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f8163w.m6468o(j7, j13, (InterfaceC30057d) obj);
            }
        }, interfaceC30057d);
    }

    @Override // au0.InterfaceC2050a
    public Object insertList(List<C3634a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f8171a, false, true, new C2051b(this, list, 0), interfaceC30057d);
    }

    @Override // au0.InterfaceC2050a
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.f8171a, new String[]{"table_strap_firmware_events"}, new C1991b1(3));
    }
}
