package mx0;

import kx0.InterfaceC22878e;
import lx0.InterfaceC24788e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mx0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lmx0/d;", "", "Lkx0/e;", "strapSyncResult", "Llx0/e;", "uploadResult", "<init>", "(Lkx0/e;Llx0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkx0/e;", "()Lkx0/e;", "b", "Llx0/e;", "()Llx0/e;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25994d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC22878e strapSyncResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24788e uploadResult;

    public C25994d(InterfaceC22878e strapSyncResult, InterfaceC24788e uploadResult) {
        AbstractC22676k.m65750j(strapSyncResult, "strapSyncResult");
        AbstractC22676k.m65750j(uploadResult, "uploadResult");
        this.strapSyncResult = strapSyncResult;
        this.uploadResult = uploadResult;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC22878e getStrapSyncResult() {
        return this.strapSyncResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC24788e getUploadResult() {
        return this.uploadResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25994d)) {
            return false;
        }
        C25994d c25994d = (C25994d) other;
        return AbstractC22676k.m65745e(this.strapSyncResult, c25994d.strapSyncResult) && AbstractC22676k.m65745e(this.uploadResult, c25994d.uploadResult);
    }

    public int hashCode() {
        return this.uploadResult.hashCode() + (this.strapSyncResult.hashCode() * 31);
    }

    public String toString() {
        return "SyncStateResult(strapSyncResult=" + this.strapSyncResult + ", uploadResult=" + this.uploadResult + ")";
    }
}
