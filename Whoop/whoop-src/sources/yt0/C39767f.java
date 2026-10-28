package yt0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata;
import com.whoop.data.local.room.dao.persistent.C6493d;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ku0.C22834c;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p392p3.C28761b0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;
import vb1.C35868a;
import yk2.C39611k;
import zt0.C41124b;
import zt0.C41125c;

/* JADX INFO: renamed from: yt0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C39767f implements InterfaceC39765d {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f171300a;

    /* JADX INFO: renamed from: c */
    private final C41125c f171302c = new C41125c();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f171301b = new a();

    /* JADX INFO: renamed from: yt0.f$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C41124b c41124b) {
            interfaceC33689c.mo5356p(1, c41124b.getId());
            interfaceC33689c.mo5356p(2, c41124b.getSequenceNo());
            interfaceC33689c.mo5356p(3, c41124b.getPacketTimeStampUtcMillis());
            String strM133514a = C39767f.this.f171302c.m133514a(c41124b.getConsolePacketsMetadata());
            if (strM133514a == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, strM133514a);
            }
            interfaceC33689c.mo5357q(5, c41124b.getReceivedPacketRaw().array());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `console_packets` (`id`,`sequence_no`,`packet_time_stamp`,`console_packets_metadata`,`received_packet_raw`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    public C39767f(AbstractC1848z0 abstractC1848z0) {
        this.f171300a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: o */
    public static List<Class<?>> m127306o() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Integer m127307p(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM console_packets");
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
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Integer m127308q(long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM console_packets WHERE id IN (SELECT id FROM console_packets WHERE packet_time_stamp >= ? AND packet_time_stamp <= ? AND console_packets_metadata == ? ORDER BY packet_time_stamp ASC LIMIT ?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            String strM133514a = this.f171302c.m133514a(consolePacketsMetadata);
            if (strM133514a == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5354L(3, strM133514a);
            }
            interfaceC33689cMo68212g1.mo5356p(4, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Integer m127309r(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM console_packets where packet_time_stamp<=?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ List m127310s(long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM console_packets WHERE packet_time_stamp >= ? AND packet_time_stamp <= ? AND console_packets_metadata == ? ORDER BY packet_time_stamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            String strM133514a = this.f171302c.m133514a(consolePacketsMetadata);
            if (strM133514a == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5354L(3, strM133514a);
            }
            interfaceC33689cMo68212g1.mo5356p(4, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_no");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "console_packets_metadata");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "received_packet_raw");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C41124b(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3), this.f171302c.m133515b(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4)), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N5))));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ List m127311t(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM console_packets LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_no");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "console_packets_metadata");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "received_packet_raw");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C41124b(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3), this.f171302c.m133515b(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4)), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N5))));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ C23454a0 m127312u(C41124b c41124b, InterfaceC33687a interfaceC33687a) {
        this.f171301b.insert(interfaceC33687a, c41124b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Long m127313v(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(packet_time_stamp) FROM console_packets");
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

    @Override // yt0.InterfaceC39765d
    /* JADX INFO: renamed from: a */
    public Object mo127292a(long j7, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171300a, false, true, new C6493d(j7, 7), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39765d
    /* JADX INFO: renamed from: b */
    public Object mo127293b(int i13, InterfaceC30057d<? super List<C41124b>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171300a, true, false, new C22834c(this, i13, 2), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39765d
    /* JADX INFO: renamed from: c */
    public Object mo127294c(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171300a, true, false, new C35868a(28), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39765d
    /* JADX INFO: renamed from: d */
    public Object mo127295d(int i13, long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171300a, false, true, new C39766e(this, j7, j13, consolePacketsMetadata, i13, 0), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39765d
    /* JADX INFO: renamed from: e */
    public Object mo127296e(int i13, long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, InterfaceC30057d<? super List<C41124b>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171300a, true, false, new C39766e(this, j7, j13, consolePacketsMetadata, i13, 1), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39765d
    /* JADX INFO: renamed from: f */
    public Object mo127297f(C41124b c41124b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c41124b.getClass();
        return AbstractC15751g.m44434N(this.f171300a, false, true, new C28761b0(19, this, c41124b), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39765d
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.f171300a, new String[]{"console_packets"}, new C39611k(11));
    }
}
