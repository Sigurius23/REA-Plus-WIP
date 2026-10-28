package oh2;

import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;
import uk0.AbstractC35049c;
import uk0.C35048b;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: oh2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0002\u0016\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Loh2/c;", "", "", "hardwareFamily", "pcbaRevision", "opticalRevision", "<init>", "(JJJ)V", "", "d", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27940c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    private static final InterfaceC34116n f112686e = InterfaceC34116n.INSTANCE.m107848a("HardwareVersion");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long hardwareFamily;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long pcbaRevision;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long opticalRevision;

    /* JADX INFO: renamed from: oh2.c$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Loh2/c$a;", "", "<init>", "()V", "", "hardwareFamily", "b", "(J)Loh2/c$a;", "pcbaRevision", "d", "opticalRevision", "c", "Loh2/c;", "a", "()Loh2/c;", "", "toString", "()Ljava/lang/String;", "J", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long hardwareFamily;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long pcbaRevision;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private long opticalRevision;

        /* JADX INFO: renamed from: a */
        public final C27940c m84333a() {
            return new C27940c(this.hardwareFamily, this.pcbaRevision, this.opticalRevision);
        }

        /* JADX INFO: renamed from: b */
        public final a m84334b(long hardwareFamily) {
            this.hardwareFamily = hardwareFamily;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m84335c(long opticalRevision) {
            this.opticalRevision = opticalRevision;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m84336d(long pcbaRevision) {
            this.pcbaRevision = pcbaRevision;
            return this;
        }

        public String toString() {
            long j7 = this.hardwareFamily;
            long j13 = this.pcbaRevision;
            long j14 = this.opticalRevision;
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "HardwareVersion.HardwareVersionBuilder(hardwareFamily=", ", pcbaRevision=");
            sbM125596b.append(j13);
            sbM125596b.append(", opticalRevision=");
            sbM125596b.append(j14);
            sbM125596b.append(")");
            return sbM125596b.toString();
        }
    }

    /* JADX INFO: renamed from: oh2.c$b, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Loh2/c$b;", "", "<init>", "()V", "Loh2/c$a;", "a", "()Loh2/c$a;", "Ljava/nio/ByteBuffer;", "buffer", "Loh2/c;", "b", "(Ljava/nio/ByteBuffer;)Loh2/c;", "Ltr2/n;", "logger", "Ltr2/n;", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final a m84337a() {
            return new a();
        }

        /* JADX INFO: renamed from: b */
        public final C27940c m84338b(ByteBuffer buffer) {
            AbstractC22676k.m65750j(buffer, "buffer");
            return m84337a().m84334b(C35048b.m110783d(buffer.getInt())).m84336d(C35048b.m110783d(buffer.getInt())).m84335c(C35048b.m110783d(buffer.getInt())).m84333a();
        }

        private Companion() {
        }
    }

    public C27940c(long j7, long j13, long j14) {
        this.hardwareFamily = j7;
        this.pcbaRevision = j13;
        this.opticalRevision = j14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getHardwareFamily() {
        return this.hardwareFamily;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getOpticalRevision() {
        return this.opticalRevision;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPcbaRevision() {
        return this.pcbaRevision;
    }

    /* JADX INFO: renamed from: d */
    public final String m84332d() {
        return AbstractC35049c.m110788b(this.hardwareFamily, this.pcbaRevision, this.opticalRevision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27940c)) {
            return false;
        }
        C27940c c27940c = (C27940c) other;
        return this.hardwareFamily == c27940c.hardwareFamily && this.pcbaRevision == c27940c.pcbaRevision && this.opticalRevision == c27940c.opticalRevision;
    }

    public int hashCode() {
        return Long.hashCode(this.opticalRevision) + AbstractC11266d.m30451e(Long.hashCode(this.hardwareFamily) * 31, this.pcbaRevision, 31);
    }

    public String toString() {
        long j7 = this.hardwareFamily;
        long j13 = this.pcbaRevision;
        long j14 = this.opticalRevision;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "HardwareVersion(hardwareFamily=", ", pcbaRevision=");
        sbM125596b.append(j13);
        sbM125596b.append(", opticalRevision=");
        sbM125596b.append(j14);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }
}
