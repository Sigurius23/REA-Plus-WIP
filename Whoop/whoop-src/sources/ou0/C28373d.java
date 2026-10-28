package ou0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import nm1.C26842g;
import nq0.C27050m;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import pf.AbstractC29125c;
import pu0.C29547a;
import pu0.C29548b;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ou0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C28373d implements InterfaceC28370a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f114479a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f114480b = new a();

    /* JADX INFO: renamed from: ou0.d$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C29548b c29548b) {
            interfaceC33689c.mo5356p(1, c29548b.getId());
            interfaceC33689c.mo5356p(2, c29548b.getBootCount());
            interfaceC33689c.mo5356p(3, c29548b.getSecondsSinceBoot());
            interfaceC33689c.mo5356p(4, c29548b.getSequenceNumber());
            interfaceC33689c.mo5357q(5, c29548b.getPacketData().array());
            C29547a c29547aMo90500b = c29548b.getMetaData();
            if (c29547aMo90500b.getBatterySerial() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, c29547aMo90500b.getBatterySerial());
            }
            interfaceC33689c.mo5356p(7, c29547aMo90500b.getHardwareFamily());
            interfaceC33689c.mo5356p(8, c29547aMo90500b.getPcbaRevision());
            interfaceC33689c.mo5356p(9, c29547aMo90500b.getOpticalRevision());
            interfaceC33689c.mo5356p(10, c29547aMo90500b.getFirmwareMajor());
            interfaceC33689c.mo5356p(11, c29547aMo90500b.getFirmwareMinor());
            interfaceC33689c.mo5356p(12, c29547aMo90500b.getFirmwarePoint());
            interfaceC33689c.mo5356p(13, c29547aMo90500b.getFirmwareExtra());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR ABORT INTO `table_battery_pack_relative_console_packets` (`id`,`boot_count`,`seconds_since_boot`,`sequence_number`,`packet_data`,`meta_battery_serial`,`meta_hardware_family`,`meta_pcba_revision`,`meta_optical_revision`,`meta_firmware_major`,`meta_firmware_minor`,`meta_firmware_point`,`meta_firmware_extra`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public C28373d(AbstractC1848z0 abstractC1848z0) {
        this.f114479a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m86049k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Integer m86050l(String str, long[] jArr, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(str);
        try {
            int i13 = 1;
            for (long j7 : jArr) {
                interfaceC33689cMo68212g1.mo5356p(i13, j7);
                i13++;
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ List m86051m(String str, int i13, int i14, int i15, int i16, int i17, int i18, int i19, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("\n        SELECT * FROM table_battery_pack_relative_console_packets\n        WHERE meta_battery_serial = ?\n        AND meta_hardware_family = ?\n        AND meta_pcba_revision = ?\n        AND meta_firmware_major = ?\n        AND meta_firmware_minor = ?\n        AND meta_firmware_point = ?\n        AND meta_firmware_extra = ?\n        ORDER BY id ASC\n        LIMIT ?\n        ");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            interfaceC33689cMo68212g1.mo5356p(3, i14);
            interfaceC33689cMo68212g1.mo5356p(4, i15);
            interfaceC33689cMo68212g1.mo5356p(5, i16);
            interfaceC33689cMo68212g1.mo5356p(6, i17);
            interfaceC33689cMo68212g1.mo5356p(7, i18);
            interfaceC33689cMo68212g1.mo5356p(8, i19);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "boot_count");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "seconds_since_boot");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_number");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_battery_serial");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_hardware_family");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_pcba_revision");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_optical_revision");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_major");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_minor");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_point");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_extra");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                ArrayList arrayList2 = arrayList;
                int i24 = iM60658N2;
                int i25 = iM60658N3;
                arrayList2.add(new C29548b(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), (int) interfaceC33689cMo68212g1.getLong(iM60658N3), (int) interfaceC33689cMo68212g1.getLong(iM60658N4), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N5)), new C29547a(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), (int) interfaceC33689cMo68212g1.getLong(iM60658N7), (int) interfaceC33689cMo68212g1.getLong(iM60658N8), (int) interfaceC33689cMo68212g1.getLong(iM60658N9), (int) interfaceC33689cMo68212g1.getLong(iM60658N10), (int) interfaceC33689cMo68212g1.getLong(iM60658N11), (int) interfaceC33689cMo68212g1.getLong(iM60658N12), (int) interfaceC33689cMo68212g1.getLong(iM60658N13))));
                arrayList = arrayList2;
                iM60658N2 = i24;
                iM60658N3 = i25;
            }
            ArrayList arrayList3 = arrayList;
            interfaceC33689cMo68212g1.close();
            return arrayList3;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C29548b m86052n(InterfaceC33687a interfaceC33687a) throws Exception {
        C29548b c29548b;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_battery_pack_relative_console_packets LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "boot_count");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "seconds_since_boot");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_number");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_battery_serial");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_hardware_family");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_pcba_revision");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_optical_revision");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_major");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_minor");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_point");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "meta_firmware_extra");
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                c29548b = new C29548b(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), (int) interfaceC33689cMo68212g1.getLong(iM60658N3), (int) interfaceC33689cMo68212g1.getLong(iM60658N4), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N5)), new C29547a(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6), (int) interfaceC33689cMo68212g1.getLong(iM60658N7), (int) interfaceC33689cMo68212g1.getLong(iM60658N8), (int) interfaceC33689cMo68212g1.getLong(iM60658N9), (int) interfaceC33689cMo68212g1.getLong(iM60658N10), (int) interfaceC33689cMo68212g1.getLong(iM60658N11), (int) interfaceC33689cMo68212g1.getLong(iM60658N12), (int) interfaceC33689cMo68212g1.getLong(iM60658N13)));
            } else {
                c29548b = null;
            }
            return c29548b;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ C23454a0 m86053o(List list, InterfaceC33687a interfaceC33687a) {
        this.f114480b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    @Override // ou0.InterfaceC28370a
    /* JADX INFO: renamed from: a */
    public Object mo86040a(long[] jArr, InterfaceC30057d<? super Integer> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("DELETE FROM table_battery_pack_relative_console_packets WHERE id IN (");
        AbstractC29125c.m88533j(jArr.length, sbM53374o);
        sbM53374o.append(")");
        return AbstractC15751g.m44434N(this.f114479a, false, true, new C28372c(sbM53374o.toString(), jArr, 0), interfaceC30057d);
    }

    @Override // ou0.InterfaceC28370a
    /* JADX INFO: renamed from: b */
    public Object mo86041b(String str, int i13, int i14, int i15, int i16, int i17, int i18, int i19, InterfaceC30057d<? super List<C29548b>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f114479a, true, false, new C28371b(str, i13, i14, i15, i16, i17, i18, i19, 0), interfaceC30057d);
    }

    @Override // ou0.InterfaceC28370a
    /* JADX INFO: renamed from: c */
    public Object mo86042c(InterfaceC30057d<? super C29548b> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f114479a, true, false, new C26842g(10), interfaceC30057d);
    }

    @Override // ou0.InterfaceC28370a
    /* JADX INFO: renamed from: e */
    public Object mo86043e(C29548b c29548b, int i13, InterfaceC30057d<? super List<C29548b>> interfaceC30057d) {
        return InterfaceC28370a.a.m86044a(this, c29548b, i13, interfaceC30057d);
    }

    @Override // ou0.InterfaceC28370a
    public Object insertList(List<C29548b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f114479a, false, true, new C27050m(11, this, list), interfaceC30057d);
    }
}
