package yh2;

import ih0.AbstractC18489d0;
import java.io.File;
import oh2.C27941d;
import or2.AbstractC28209v1;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001b\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b!\u0010\u0013¨\u0006&"}, m65681d2 = {"Lyh2/b;", "", "Ljava/io/File;", "exportedFile", "", "newestTimestamp", "oldestTimestamp", "recordCount", "versionId", "Loh2/d;", "historyHeartDataVersion", "", "packetRevision", "<init>", "(Ljava/io/File;JJJJLoh2/d;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "()Ljava/io/File;", "b", "J", "c", "()J", "d", "f", "e", "g", "Loh2/d;", "()Loh2/d;", "I", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39543b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File exportedFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long newestTimestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long oldestTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long recordCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long versionId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27941d historyHeartDataVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int packetRevision;

    public C39543b(File exportedFile, long j7, long j13, long j14, long j15, C27941d historyHeartDataVersion, int i13) {
        AbstractC22676k.m65750j(exportedFile, "exportedFile");
        AbstractC22676k.m65750j(historyHeartDataVersion, "historyHeartDataVersion");
        this.exportedFile = exportedFile;
        this.newestTimestamp = j7;
        this.oldestTimestamp = j13;
        this.recordCount = j14;
        this.versionId = j15;
        this.historyHeartDataVersion = historyHeartDataVersion;
        this.packetRevision = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getExportedFile() {
        return this.exportedFile;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27941d getHistoryHeartDataVersion() {
        return this.historyHeartDataVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getNewestTimestamp() {
        return this.newestTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getOldestTimestamp() {
        return this.oldestTimestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPacketRevision() {
        return this.packetRevision;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39543b)) {
            return false;
        }
        C39543b c39543b = (C39543b) other;
        return AbstractC22676k.m65745e(this.exportedFile, c39543b.exportedFile) && this.newestTimestamp == c39543b.newestTimestamp && this.oldestTimestamp == c39543b.oldestTimestamp && this.recordCount == c39543b.recordCount && this.versionId == c39543b.versionId && AbstractC22676k.m65745e(this.historyHeartDataVersion, c39543b.historyHeartDataVersion) && this.packetRevision == c39543b.packetRevision;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getRecordCount() {
        return this.recordCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return Integer.hashCode(this.packetRevision) + ((this.historyHeartDataVersion.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.exportedFile.hashCode() * 31, this.newestTimestamp, 31), this.oldestTimestamp, 31), this.recordCount, 31), this.versionId, 31)) * 31);
    }

    public String toString() {
        String strM85388b = AbstractC28209v1.m85388b(this.oldestTimestamp);
        String strM85388b2 = AbstractC28209v1.m85388b(this.newestTimestamp);
        int i13 = this.packetRevision;
        long j7 = this.recordCount;
        long length = this.exportedFile.length();
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "R", " => ", strM85388b, " - ");
        sbM53373n.append(strM85388b2);
        sbM53373n.append(" (");
        sbM53373n.append(j7);
        sbM53373n.append(" records, size = ");
        sbM53373n.append(length);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
