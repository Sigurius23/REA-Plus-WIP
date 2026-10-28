package hu1;

import java.io.File;
import nh3.AbstractC26725a;
import oh2.C27938a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hu1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0012¨\u0006("}, m65681d2 = {"Lhu1/a;", "", "Loh2/a;", "dataAcquisitionInfo", "Ljava/io/File;", "fileToBeUploaded", "", "oldestTimestamp", "newestTimestamp", "", "noOfEvents", "packetRevision", "<init>", "(Loh2/a;Ljava/io/File;JJII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh2/a;", "()Loh2/a;", "b", "Ljava/io/File;", "()Ljava/io/File;", "c", "J", "getOldestTimestamp", "()J", "d", "getNewestTimestamp", "e", "I", "getNoOfEvents", "f", "getPacketRevision", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17644a {

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

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int packetRevision;

    public C17644a(C27938a c27938a, File fileToBeUploaded, long j7, long j13, int i13, int i14) {
        AbstractC22676k.m65750j(fileToBeUploaded, "fileToBeUploaded");
        this.dataAcquisitionInfo = c27938a;
        this.fileToBeUploaded = fileToBeUploaded;
        this.oldestTimestamp = j7;
        this.newestTimestamp = j13;
        this.noOfEvents = i13;
        this.packetRevision = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27938a getDataAcquisitionInfo() {
        return this.dataAcquisitionInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getFileToBeUploaded() {
        return this.fileToBeUploaded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17644a)) {
            return false;
        }
        C17644a c17644a = (C17644a) other;
        return AbstractC22676k.m65745e(this.dataAcquisitionInfo, c17644a.dataAcquisitionInfo) && AbstractC22676k.m65745e(this.fileToBeUploaded, c17644a.fileToBeUploaded) && this.oldestTimestamp == c17644a.oldestTimestamp && this.newestTimestamp == c17644a.newestTimestamp && this.noOfEvents == c17644a.noOfEvents && this.packetRevision == c17644a.packetRevision;
    }

    public int hashCode() {
        C27938a c27938a = this.dataAcquisitionInfo;
        return Integer.hashCode(this.packetRevision) + AbstractC11266d.m30448b(this.noOfEvents, AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.fileToBeUploaded.hashCode() + ((c27938a == null ? 0 : c27938a.hashCode()) * 31)) * 31, this.oldestTimestamp, 31), this.newestTimestamp, 31), 31);
    }

    public String toString() {
        C27938a c27938a = this.dataAcquisitionInfo;
        File file = this.fileToBeUploaded;
        long j7 = this.oldestTimestamp;
        long j13 = this.newestTimestamp;
        int i13 = this.noOfEvents;
        int i14 = this.packetRevision;
        StringBuilder sb4 = new StringBuilder("ExportedLabradorPacketsMetaData(dataAcquisitionInfo=");
        sb4.append(c27938a);
        sb4.append(", fileToBeUploaded=");
        sb4.append(file);
        sb4.append(", oldestTimestamp=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", newestTimestamp=", j13, ", noOfEvents=");
        return AbstractC26725a.m79505i(sb4, i13, ", packetRevision=", i14, ")");
    }
}
