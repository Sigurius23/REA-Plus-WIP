package f52;

import java.nio.file.Path;
import java.util.Arrays;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f52.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lf52/i;", "", "Ljava/nio/file/Path;", "fileToBeUploaded", "Lf52/b;", "acquisitionInfo", "", "packets", "<init>", "(Ljava/nio/file/Path;Lf52/b;[J)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/nio/file/Path;", "b", "()Ljava/nio/file/Path;", "Lf52/b;", "()Lf52/b;", "c", "[J", "()[J", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14111i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Path fileToBeUploaded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14104b acquisitionInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long[] packets;

    public C14111i(Path fileToBeUploaded, C14104b acquisitionInfo, long[] packets) {
        AbstractC22676k.m65750j(fileToBeUploaded, "fileToBeUploaded");
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        AbstractC22676k.m65750j(packets, "packets");
        this.fileToBeUploaded = fileToBeUploaded;
        this.acquisitionInfo = acquisitionInfo;
        this.packets = packets;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14104b getAcquisitionInfo() {
        return this.acquisitionInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Path getFileToBeUploaded() {
        return this.fileToBeUploaded;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long[] getPackets() {
        return this.packets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C14111i.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.puffin.sync.ExportedBatteryPackRelativeEventsData");
        C14111i c14111i = (C14111i) other;
        return AbstractC22676k.m65745e(this.fileToBeUploaded, c14111i.fileToBeUploaded) && AbstractC22676k.m65745e(this.acquisitionInfo, c14111i.acquisitionInfo) && Arrays.equals(this.packets, c14111i.packets);
    }

    public int hashCode() {
        return Arrays.hashCode(this.packets) + ((this.acquisitionInfo.hashCode() + (this.fileToBeUploaded.hashCode() * 31)) * 31);
    }

    public String toString() {
        Path path = this.fileToBeUploaded;
        C14104b c14104b = this.acquisitionInfo;
        String string = Arrays.toString(this.packets);
        StringBuilder sb4 = new StringBuilder("ExportedBatteryPackRelativeEventsData(fileToBeUploaded=");
        sb4.append(path);
        sb4.append(", acquisitionInfo=");
        sb4.append(c14104b);
        sb4.append(", packets=");
        return AbstractC25012a.m73376i(string, ")", sb4);
    }
}
