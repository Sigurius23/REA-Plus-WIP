package oh2;

import java.util.Objects;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 '2\u00020\u0001:\u0002\u001a\u0016BC\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Loh2/a;", "", "Loh2/c;", "hardwareVersion", "Loh2/b;", "firmwareVersion", "bluetoothVersion", "Loh2/e;", "sigProcVersion", "", "strapId", "", "version", "<init>", "(Loh2/c;Loh2/b;Loh2/b;Loh2/e;Ljava/lang/String;B)V", "o", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Loh2/c;", "d", "()Loh2/c;", "b", "Loh2/b;", "c", "()Loh2/b;", "Loh2/e;", "e", "()Loh2/e;", "setSigProcVersion", "(Loh2/e;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "B", "g", "()B", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27938a {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27940c hardwareVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC27939b firmwareVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27939b bluetoothVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C27942e sigProcVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String strapId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final byte version;

    /* JADX INFO: renamed from: oh2.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Loh2/a$a;", "", "<init>", "()V", "Loh2/a$b;", "a", "()Loh2/a$b;", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final b m84311a() {
            return new b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: oh2.a$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006$"}, m65681d2 = {"Loh2/a$b;", "", "<init>", "()V", "Loh2/c;", "hardwareVersion", "d", "(Loh2/c;)Loh2/a$b;", "Loh2/b;", "firmwareVersion", "c", "(Loh2/b;)Loh2/a$b;", "bluetoothVersion", "a", "Loh2/e;", "sigProcVersion", "e", "(Loh2/e;)Loh2/a$b;", "", "strapId", "f", "(Ljava/lang/String;)Loh2/a$b;", "", "versionId", "g", "(B)Loh2/a$b;", "Loh2/a;", "b", "()Loh2/a;", "toString", "()Ljava/lang/String;", "Loh2/c;", "Loh2/b;", "Loh2/e;", "Ljava/lang/String;", "B", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private C27940c hardwareVersion;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private InterfaceC27939b firmwareVersion;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private InterfaceC27939b bluetoothVersion;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private C27942e sigProcVersion;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private String strapId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private byte versionId = 4;

        /* JADX INFO: renamed from: a */
        public final b m84312a(InterfaceC27939b bluetoothVersion) {
            this.bluetoothVersion = bluetoothVersion;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final C27938a m84313b() {
            return new C27938a(this.hardwareVersion, this.firmwareVersion, this.bluetoothVersion, this.sigProcVersion, this.strapId, this.versionId);
        }

        /* JADX INFO: renamed from: c */
        public final b m84314c(InterfaceC27939b firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final b m84315d(C27940c hardwareVersion) {
            this.hardwareVersion = hardwareVersion;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final b m84316e(C27942e sigProcVersion) {
            this.sigProcVersion = sigProcVersion;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final b m84317f(String strapId) {
            this.strapId = strapId;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final b m84318g(byte versionId) {
            this.versionId = versionId;
            return this;
        }

        public String toString() {
            C27940c c27940c = this.hardwareVersion;
            InterfaceC27939b interfaceC27939b = this.firmwareVersion;
            InterfaceC27939b interfaceC27939b2 = this.bluetoothVersion;
            C27942e c27942e = this.sigProcVersion;
            String str = this.strapId;
            StringBuilder sb4 = new StringBuilder("DataAcquisitionInfo.DataAcquisitionInfoBuilder(hardwareVersion=");
            sb4.append(c27940c);
            sb4.append(", firmwareVersion=");
            sb4.append(interfaceC27939b);
            sb4.append(", bluetoothVersion=");
            sb4.append(interfaceC27939b2);
            sb4.append(", sigProcVersion=");
            sb4.append(c27942e);
            sb4.append(", strapId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    public C27938a(C27940c c27940c, InterfaceC27939b interfaceC27939b, InterfaceC27939b interfaceC27939b2, C27942e c27942e, String str, byte b6) {
        this.hardwareVersion = c27940c;
        this.firmwareVersion = interfaceC27939b;
        this.bluetoothVersion = interfaceC27939b2;
        this.sigProcVersion = c27942e;
        this.strapId = str;
        this.version = b6;
    }

    /* JADX INFO: renamed from: a */
    public static final b m84304a() {
        return INSTANCE.m84311a();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC27939b getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC27939b getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C27940c getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27942e getSigProcVersion() {
        return this.sigProcVersion;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && C27938a.class.equals(o.getClass())) {
            C27938a c27938a = (C27938a) o;
            if (AbstractC22676k.m65745e(this.hardwareVersion, c27938a.hardwareVersion) && AbstractC22676k.m65745e(this.firmwareVersion, c27938a.firmwareVersion) && AbstractC22676k.m65745e(this.bluetoothVersion, c27938a.bluetoothVersion) && AbstractC22676k.m65745e(this.sigProcVersion, c27938a.sigProcVersion) && AbstractC22676k.m65745e(this.strapId, c27938a.strapId)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final byte getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.hardwareVersion, this.firmwareVersion, this.bluetoothVersion, this.sigProcVersion, this.strapId);
    }
}
