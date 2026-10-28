package vt0;

import java.io.File;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vt0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lvt0/b;", "", "", "version", "", "newestTimestamp", "oldestTimestamp", "packetCount", "Ljava/io/File;", "outputFile", "<init>", "(IJJJLjava/io/File;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "J", "()J", "c", "d", "Ljava/io/File;", "()Ljava/io/File;", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36485b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long newestTimestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long oldestTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long packetCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final File outputFile;

    public C36485b(int i13, long j7, long j13, long j14, File outputFile) {
        AbstractC22676k.m65750j(outputFile, "outputFile");
        this.version = i13;
        this.newestTimestamp = j7;
        this.oldestTimestamp = j13;
        this.packetCount = j14;
        this.outputFile = outputFile;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getNewestTimestamp() {
        return this.newestTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getOldestTimestamp() {
        return this.oldestTimestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final File getOutputFile() {
        return this.outputFile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getPacketCount() {
        return this.packetCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36485b)) {
            return false;
        }
        C36485b c36485b = (C36485b) other;
        return this.version == c36485b.version && this.newestTimestamp == c36485b.newestTimestamp && this.oldestTimestamp == c36485b.oldestTimestamp && this.packetCount == c36485b.packetCount && AbstractC22676k.m65745e(this.outputFile, c36485b.outputFile);
    }

    public int hashCode() {
        return this.outputFile.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Integer.hashCode(this.version) * 31, this.newestTimestamp, 31), this.oldestTimestamp, 31), this.packetCount, 31);
    }

    public String toString() {
        int i13 = this.version;
        long j7 = this.newestTimestamp;
        long j13 = this.oldestTimestamp;
        long j14 = this.packetCount;
        File file = this.outputFile;
        StringBuilder sb4 = new StringBuilder("DataPacketUploadModel(version=");
        sb4.append(i13);
        sb4.append(", newestTimestamp=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", oldestTimestamp=", j13, ", packetCount=");
        sb4.append(j14);
        sb4.append(", outputFile=");
        sb4.append(file);
        sb4.append(")");
        return sb4.toString();
    }
}
