package yt0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.wipeable.C6518e;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p736sz0.C33209p1;
import q83.InterfaceC30057d;
import yk2.C39611k;
import zt0.C41123a;

/* JADX INFO: renamed from: yt0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C39764c implements InterfaceC39762a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f171291a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f171292b = new a();

    /* JADX INFO: renamed from: yt0.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C41123a c41123a) {
            interfaceC33689c.mo5356p(1, c41123a.getPacketTimeStampUtcMillis());
            interfaceC33689c.mo5356p(2, c41123a.getPacketTimeStampMillis());
            if (c41123a.getStrapId() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, c41123a.getStrapId());
            }
            if (c41123a.getHardwareVersion() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, c41123a.getHardwareVersion());
            }
            if (c41123a.getMaximVersion() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, c41123a.getMaximVersion());
            }
            if (c41123a.getDspVersion() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, c41123a.getDspVersion());
            }
            if (c41123a.getNordicVersion() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, c41123a.getNordicVersion());
            }
            interfaceC33689c.mo5356p(8, c41123a.getSequenceNumber());
            interfaceC33689c.mo5357q(9, c41123a.getReceivedPacketRaw().array());
            interfaceC33689c.mo5356p(10, c41123a.getId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `table_console_packets` (`packet_time_stamp_utc`,`packet_time_stamp`,`strap_id`,`hw_version`,`maxim_version`,`dsp_version`,`nordic_version`,`sequence_number`,`received_packet_raw`,`id`) VALUES (?,?,?,?,?,?,?,?,?,nullif(?, 0))";
        }
    }

    public C39764c(AbstractC1848z0 abstractC1848z0) {
        this.f171291a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m127285k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Integer m127286l(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM table_console_packets");
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
    public static /* synthetic */ Integer m127287m(long j7, long j13, String str, String str2, String str3, String str4, String str5, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_console_packets WHERE id IN (SELECT id FROM table_console_packets WHERE packet_time_stamp_utc >= ? AND packet_time_stamp_utc <= ? AND strap_id == ? AND maxim_version == ? AND nordic_version== ? AND dsp_version == ? AND hw_version == ? ORDER BY packet_time_stamp_utc ASC LIMIT ?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5354L(3, str);
            }
            if (str2 == null) {
                interfaceC33689cMo68212g1.mo5359u(4);
            } else {
                interfaceC33689cMo68212g1.mo5354L(4, str2);
            }
            if (str3 == null) {
                interfaceC33689cMo68212g1.mo5359u(5);
            } else {
                interfaceC33689cMo68212g1.mo5354L(5, str3);
            }
            if (str4 == null) {
                interfaceC33689cMo68212g1.mo5359u(6);
            } else {
                interfaceC33689cMo68212g1.mo5354L(6, str4);
            }
            if (str5 == null) {
                interfaceC33689cMo68212g1.mo5359u(7);
            } else {
                interfaceC33689cMo68212g1.mo5354L(7, str5);
            }
            interfaceC33689cMo68212g1.mo5356p(8, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Integer m127288n(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_console_packets where packet_time_stamp_utc<=?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m127289o(long j7, long j13, String str, String str2, String str3, String str4, String str5, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_console_packets WHERE packet_time_stamp_utc >= ? AND packet_time_stamp_utc <= ? AND strap_id == ? AND maxim_version == ? AND nordic_version== ? AND dsp_version == ? AND hw_version == ? ORDER BY packet_time_stamp_utc ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5354L(3, str);
            }
            if (str2 == null) {
                interfaceC33689cMo68212g1.mo5359u(4);
            } else {
                interfaceC33689cMo68212g1.mo5354L(4, str2);
            }
            if (str3 == null) {
                interfaceC33689cMo68212g1.mo5359u(5);
            } else {
                interfaceC33689cMo68212g1.mo5354L(5, str3);
            }
            if (str4 == null) {
                interfaceC33689cMo68212g1.mo5359u(6);
            } else {
                interfaceC33689cMo68212g1.mo5354L(6, str4);
            }
            if (str5 == null) {
                interfaceC33689cMo68212g1.mo5359u(7);
            } else {
                interfaceC33689cMo68212g1.mo5354L(7, str5);
            }
            interfaceC33689cMo68212g1.mo5356p(8, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp_utc");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strap_id");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hw_version");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maxim_version");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "dsp_version");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "nordic_version");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_number");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "received_packet_raw");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                C41123a c41123a = new C41123a(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), (int) interfaceC33689cMo68212g1.getLong(iM60658N8), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N9)));
                c41123a.m133508k(interfaceC33689cMo68212g1.getLong(iM60658N10));
                arrayList.add(c41123a);
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ List m127290p(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_console_packets LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp_utc");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strap_id");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hw_version");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maxim_version");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "dsp_version");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "nordic_version");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_number");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "received_packet_raw");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                C41123a c41123a = new C41123a(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), (int) interfaceC33689cMo68212g1.getLong(iM60658N8), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N9)));
                c41123a.m133508k(interfaceC33689cMo68212g1.getLong(iM60658N10));
                arrayList.add(c41123a);
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // yt0.InterfaceC39762a
    /* JADX INFO: renamed from: a */
    public Object mo127275a(long j7, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171291a, false, true, new C33209p1(j7, 9), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39762a
    /* JADX INFO: renamed from: b */
    public Object mo127276b(int i13, InterfaceC30057d<? super List<C41123a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171291a, true, false, new C6518e(i13, 8), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39762a
    /* JADX INFO: renamed from: c */
    public Object mo127277c(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171291a, true, false, new C39611k(10), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39762a
    /* JADX INFO: renamed from: d */
    public Object mo127278d(int i13, long j7, long j13, String str, String str2, String str3, String str4, String str5, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171291a, false, true, new C39763b(j7, j13, str, str2, str3, str4, str5, i13, 0), interfaceC30057d);
    }

    @Override // yt0.InterfaceC39762a
    /* JADX INFO: renamed from: e */
    public Object mo127279e(int i13, long j7, long j13, String str, String str2, String str3, String str4, String str5, InterfaceC30057d<? super List<C41123a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f171291a, true, false, new C39763b(j7, j13, str, str2, str3, str4, str5, i13, 1), interfaceC30057d);
    }
}
