package ku0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import java.util.Collections;
import java.util.List;
import jp1.C21851c;
import l83.C23454a0;
import lu0.C24746b;
import lu0.C24747c;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ku0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C22835d implements InterfaceC22832a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f90005a;

    /* JADX INFO: renamed from: c */
    private final C24746b f90007c = new C24746b();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f90006b = new a();

    /* JADX INFO: renamed from: ku0.d$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C24747c c24747c) {
            interfaceC33689c.mo5356p(1, c24747c.getVersionId());
            interfaceC33689c.mo5356p(2, c24747c.getHardwareFamily());
            interfaceC33689c.mo5356p(3, c24747c.getPcbaRevision());
            interfaceC33689c.mo5356p(4, c24747c.getOpticalRevision());
            interfaceC33689c.mo5356p(5, c24747c.getFirmwareMajor());
            interfaceC33689c.mo5356p(6, c24747c.getFirmwareMinor());
            interfaceC33689c.mo5356p(7, c24747c.getFirmwareBuild());
            interfaceC33689c.mo5356p(8, c24747c.getFirmwareUnreleased());
            String strM72453b = C22835d.this.f90007c.m72453b(c24747c.getFirmwareVersion());
            if (strM72453b == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5354L(9, strM72453b);
            }
            interfaceC33689c.mo5356p(10, c24747c.getSigProcMajor());
            interfaceC33689c.mo5356p(11, c24747c.getSigProcMinor());
            interfaceC33689c.mo5356p(12, c24747c.getSigProcPatch());
            interfaceC33689c.mo5356p(13, c24747c.getBinaryVersion());
            interfaceC33689c.mo5356p(14, c24747c.getBinaryFlags());
            if (c24747c.getStrapId() == null) {
                interfaceC33689c.mo5359u(15);
            } else {
                interfaceC33689c.mo5354L(15, c24747c.getStrapId());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_heart_data_versions` (`version_id`,`hardware_family`,`pcba_revision`,`optical_revision`,`firmware_major`,`firmware_minor`,`firmware_build`,`firmware_unreleased`,`firmware_version`,`sigproc_major`,`sigproc_minor`,`sigproc_patch`,`binary_version`,`binary_flags`,`strap_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public C22835d(AbstractC1848z0 abstractC1848z0) {
        this.f90005a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m66214h() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C24747c m66215i(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_heart_data_versions WHERE version_id == ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hardware_family");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pcba_revision");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "optical_revision");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "firmware_major");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "firmware_minor");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "firmware_build");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "firmware_unreleased");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "firmware_version");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sigproc_major");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sigproc_minor");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sigproc_patch");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "binary_version");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "binary_flags");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strap_id");
            C24747c c24747c = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                try {
                    c24747c = new C24747c((int) interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), (int) interfaceC33689cMo68212g1.getLong(iM60658N3), (int) interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), (int) interfaceC33689cMo68212g1.getLong(iM60658N7), (int) interfaceC33689cMo68212g1.getLong(iM60658N8), this.f90007c.m72452a(interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9)), (int) interfaceC33689cMo68212g1.getLong(iM60658N10), (int) interfaceC33689cMo68212g1.getLong(iM60658N11), (int) interfaceC33689cMo68212g1.getLong(iM60658N12), (int) interfaceC33689cMo68212g1.getLong(iM60658N13), (int) interfaceC33689cMo68212g1.getLong(iM60658N14), interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15));
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689cMo68212g1.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return c24747c;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Integer m66216j(int i13, int i14, int i15, int i16, int i17, int i18, int i19, String str, int i24, int i25, int i26, int i27, int i28, String str2, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("Select version_id FROM table_heart_data_versions WHERE hardware_family == ? AND pcba_revision == ? AND optical_revision == ? AND firmware_major == ? AND firmware_minor == ? AND firmware_build == ? AND firmware_unreleased == ? AND firmware_version == ? AND sigproc_major == ? AND sigproc_minor == ? AND sigproc_patch == ? AND binary_version == ? AND binary_flags == ? AND strap_id == ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            interfaceC33689cMo68212g1.mo5356p(3, i15);
            interfaceC33689cMo68212g1.mo5356p(4, i16);
            interfaceC33689cMo68212g1.mo5356p(5, i17);
            interfaceC33689cMo68212g1.mo5356p(6, i18);
            interfaceC33689cMo68212g1.mo5356p(7, i19);
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(8);
            } else {
                interfaceC33689cMo68212g1.mo5354L(8, str);
            }
            interfaceC33689cMo68212g1.mo5356p(9, i24);
            interfaceC33689cMo68212g1.mo5356p(10, i25);
            interfaceC33689cMo68212g1.mo5356p(11, i26);
            interfaceC33689cMo68212g1.mo5356p(12, i27);
            interfaceC33689cMo68212g1.mo5356p(13, i28);
            if (str2 == null) {
                interfaceC33689cMo68212g1.mo5359u(14);
            } else {
                interfaceC33689cMo68212g1.mo5354L(14, str2);
            }
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
    /* JADX INFO: renamed from: k */
    public /* synthetic */ C23454a0 m66217k(C24747c c24747c, InterfaceC33687a interfaceC33687a) {
        this.f90006b.insert(interfaceC33687a, c24747c);
        return C23454a0.f92919a;
    }

    @Override // ku0.InterfaceC22832a
    /* JADX INFO: renamed from: a */
    public Object mo66207a(C24747c c24747c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c24747c.getClass();
        return AbstractC15751g.m44434N(this.f90005a, false, true, new C21851c(13, this, c24747c), interfaceC30057d);
    }

    @Override // ku0.InterfaceC22832a
    /* JADX INFO: renamed from: b */
    public Object mo66208b(final int i13, final int i14, final int i15, final int i16, final int i17, final int i18, final int i19, final String str, final int i24, final int i25, final int i26, final int i27, final int i28, final String str2, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f90005a, true, false, new Function1() { // from class: ku0.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C22835d.m66216j(i13, i14, i15, i16, i17, i18, i19, str, i24, i25, i26, i27, i28, str2, (InterfaceC33687a) obj);
            }
        }, interfaceC30057d);
    }

    @Override // ku0.InterfaceC22832a
    /* JADX INFO: renamed from: c */
    public Object mo66209c(int i13, InterfaceC30057d<? super C24747c> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f90005a, true, false, new C22834c(this, i13, 0), interfaceC30057d);
    }
}
