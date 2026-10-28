package fg1;

import ih0.AbstractC18489d0;
import java.io.File;
import oh2.C27938a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\u0011¨\u0006\""}, m65681d2 = {"Lfg1/b;", "", "Loh2/a;", "dataAcquisitionInfo", "Ljava/io/File;", "fileToBeUploaded", "", "oldestTimestamp", "newestTimestamp", "", "noOfEvents", "<init>", "(Loh2/a;Ljava/io/File;JJI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh2/a;", "()Loh2/a;", "b", "Ljava/io/File;", "()Ljava/io/File;", "c", "J", "e", "()J", "d", "I", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14456b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27938a dataAcquisitionInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final File fileToBeUploaded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long oldestTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long newestTimestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int noOfEvents;

    public C14456b(C27938a c27938a, File fileToBeUploaded, long j7, long j13, int i13) {
        AbstractC22676k.m65750j(fileToBeUploaded, "fileToBeUploaded");
        this.dataAcquisitionInfo = c27938a;
        this.fileToBeUploaded = fileToBeUploaded;
        this.oldestTimestamp = j7;
        this.newestTimestamp = j13;
        this.noOfEvents = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27938a getDataAcquisitionInfo() {
        return this.dataAcquisitionInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getFileToBeUploaded() {
        return this.fileToBeUploaded;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getNewestTimestamp() {
        return this.newestTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getNoOfEvents() {
        return this.noOfEvents;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getOldestTimestamp() {
        return this.oldestTimestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14456b)) {
            return false;
        }
        C14456b c14456b = (C14456b) other;
        return AbstractC22676k.m65745e(this.dataAcquisitionInfo, c14456b.dataAcquisitionInfo) && AbstractC22676k.m65745e(this.fileToBeUploaded, c14456b.fileToBeUploaded) && this.oldestTimestamp == c14456b.oldestTimestamp && this.newestTimestamp == c14456b.newestTimestamp && this.noOfEvents == c14456b.noOfEvents;
    }

    public int hashCode() {
        C27938a c27938a = this.dataAcquisitionInfo;
        return Integer.hashCode(this.noOfEvents) + AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.fileToBeUploaded.hashCode() + ((c27938a == null ? 0 : c27938a.hashCode()) * 31)) * 31, this.oldestTimestamp, 31), this.newestTimestamp, 31);
    }

    public String toString() {
        C27938a c27938a = this.dataAcquisitionInfo;
        File file = this.fileToBeUploaded;
        long j7 = this.oldestTimestamp;
        long j13 = this.newestTimestamp;
        int i13 = this.noOfEvents;
        StringBuilder sb4 = new StringBuilder("ExportedStrapEventsMetaData(dataAcquisitionInfo=");
        sb4.append(c27938a);
        sb4.append(", fileToBeUploaded=");
        sb4.append(file);
        sb4.append(", oldestTimestamp=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", newestTimestamp=", j13, ", noOfEvents=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
