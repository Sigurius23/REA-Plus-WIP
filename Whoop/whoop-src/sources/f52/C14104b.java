package f52;

import oh2.C27940c;
import oh2.InterfaceC27939b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pu0.C29547a;

/* JADX INFO: renamed from: f52.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0015B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\r¨\u0006!"}, m65681d2 = {"Lf52/b;", "", "Loh2/c;", "hardwareVersion", "", "binaryVersion", "Loh2/b$b;", "firmwareVersion", "", "serial", "<init>", "(Loh2/c;BLoh2/b$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh2/c;", "c", "()Loh2/c;", "b", "B", "()B", "Loh2/b$b;", "()Loh2/b$b;", "d", "Ljava/lang/String;", "e", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14104b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27940c hardwareVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte binaryVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27939b.b firmwareVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String serial;

    /* JADX INFO: renamed from: f52.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lf52/b$a;", "", "<init>", "()V", "Lpu0/a;", "packet", "Lf52/b;", "a", "(Lpu0/a;)Lf52/b;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C14104b m40178a(C29547a packet) {
            AbstractC22676k.m65750j(packet, "packet");
            return new C14104b(new C27940c(packet.getHardwareFamily(), packet.getPcbaRevision(), packet.getOpticalRevision()), (byte) 5, new InterfaceC27939b.b(packet.getFirmwareMajor(), packet.getFirmwareMinor(), packet.getFirmwarePoint(), packet.getFirmwareExtra()), packet.getBatterySerial());
        }

        private Companion() {
        }
    }

    public C14104b(C27940c hardwareVersion, byte b, InterfaceC27939b.b firmwareVersion, String serial) {
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(serial, "serial");
        this.hardwareVersion = hardwareVersion;
        this.binaryVersion = b;
        this.firmwareVersion = firmwareVersion;
        this.serial = serial;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte getBinaryVersion() {
        return this.binaryVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC27939b.b getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27940c getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14104b)) {
            return false;
        }
        C14104b c14104b = (C14104b) other;
        return AbstractC22676k.m65745e(this.hardwareVersion, c14104b.hardwareVersion) && this.binaryVersion == c14104b.binaryVersion && AbstractC22676k.m65745e(this.firmwareVersion, c14104b.firmwareVersion) && AbstractC22676k.m65745e(this.serial, c14104b.serial);
    }

    public int hashCode() {
        return this.serial.hashCode() + ((this.firmwareVersion.hashCode() + ((Byte.hashCode(this.binaryVersion) + (this.hardwareVersion.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        C27940c c27940c = this.hardwareVersion;
        InterfaceC27939b.b bVar = this.firmwareVersion;
        String str = this.serial;
        StringBuilder sb4 = new StringBuilder("BPMetadataAcquisitionInfo(hw=");
        sb4.append(c27940c);
        sb4.append("|fw=");
        sb4.append(bVar);
        sb4.append("|serial=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C14104b(C27940c c27940c, byte b, InterfaceC27939b.b bVar, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C27940c(0L, 0L, 0L) : c27940c, (i13 & 2) != 0 ? (byte) 5 : b, (i13 & 4) != 0 ? new InterfaceC27939b.b(0L, 0L, 0L, 0L) : bVar, (i13 & 8) != 0 ? "" : str);
    }
}
