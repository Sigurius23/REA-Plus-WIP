package hx0;

import cu0.C11113a;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hx0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lhx0/f;", "", "", "revision", "Lcu0/a;", "metadata", "", "uploadSuccess", "<init>", "(Ljava/lang/String;Lcu0/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcu0/a;", "getMetadata", "()Lcu0/a;", "c", "Z", "()Z", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17710f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String revision;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11113a metadata;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean uploadSuccess;

    public C17710f(String revision, C11113a c11113a, boolean z4) {
        AbstractC22676k.m65750j(revision, "revision");
        this.revision = revision;
        this.metadata = c11113a;
        this.uploadSuccess = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRevision() {
        return this.revision;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUploadSuccess() {
        return this.uploadSuccess;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17710f)) {
            return false;
        }
        C17710f c17710f = (C17710f) other;
        return AbstractC22676k.m65745e(this.revision, c17710f.revision) && AbstractC22676k.m65745e(this.metadata, c17710f.metadata) && this.uploadSuccess == c17710f.uploadSuccess;
    }

    public int hashCode() {
        int iHashCode = this.revision.hashCode() * 31;
        C11113a c11113a = this.metadata;
        return Boolean.hashCode(this.uploadSuccess) + ((iHashCode + (c11113a == null ? 0 : c11113a.hashCode())) * 31);
    }

    public String toString() {
        String str = this.revision;
        C11113a c11113a = this.metadata;
        boolean z4 = this.uploadSuccess;
        StringBuilder sb4 = new StringBuilder("UploadInfoData(revision=");
        sb4.append(str);
        sb4.append(", metadata=");
        sb4.append(c11113a);
        sb4.append(", uploadSuccess=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
