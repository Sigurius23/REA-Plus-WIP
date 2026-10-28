package live.hms.video.whiteboard;

import hc3.AbstractC17176i;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/whiteboard/HMSWhiteboardPermissions;", "", "admin", "", "", "reader", "writer", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdmin", "()Ljava/util/List;", "getReader", "getWriter", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSWhiteboardPermissions {
    private final List<String> admin;
    private final List<String> reader;
    private final List<String> writer;

    public HMSWhiteboardPermissions(List<String> admin, List<String> reader, List<String> writer) {
        AbstractC22676k.m65750j(admin, "admin");
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(writer, "writer");
        this.admin = admin;
        this.reader = reader;
        this.writer = writer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSWhiteboardPermissions copy$default(HMSWhiteboardPermissions hMSWhiteboardPermissions, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = hMSWhiteboardPermissions.admin;
        }
        if ((i13 & 2) != 0) {
            list2 = hMSWhiteboardPermissions.reader;
        }
        if ((i13 & 4) != 0) {
            list3 = hMSWhiteboardPermissions.writer;
        }
        return hMSWhiteboardPermissions.copy(list, list2, list3);
    }

    public final List<String> component1() {
        return this.admin;
    }

    public final List<String> component2() {
        return this.reader;
    }

    public final List<String> component3() {
        return this.writer;
    }

    public final HMSWhiteboardPermissions copy(List<String> admin, List<String> reader, List<String> writer) {
        AbstractC22676k.m65750j(admin, "admin");
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(writer, "writer");
        return new HMSWhiteboardPermissions(admin, reader, writer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSWhiteboardPermissions)) {
            return false;
        }
        HMSWhiteboardPermissions hMSWhiteboardPermissions = (HMSWhiteboardPermissions) other;
        return AbstractC22676k.m65745e(this.admin, hMSWhiteboardPermissions.admin) && AbstractC22676k.m65745e(this.reader, hMSWhiteboardPermissions.reader) && AbstractC22676k.m65745e(this.writer, hMSWhiteboardPermissions.writer);
    }

    public final List<String> getAdmin() {
        return this.admin;
    }

    public final List<String> getReader() {
        return this.reader;
    }

    public final List<String> getWriter() {
        return this.writer;
    }

    public int hashCode() {
        return this.writer.hashCode() + AbstractC11895b.m31983b(this.admin.hashCode() * 31, 31, this.reader);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSWhiteboardPermissions(admin=");
        sb4.append(this.admin);
        sb4.append(", reader=");
        sb4.append(this.reader);
        sb4.append(", writer=");
        return AbstractC17176i.m48506h(sb4, this.writer, ')');
    }
}
