package px2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y71.C39282o;

/* JADX INFO: renamed from: px2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lpx2/n;", "", "", "sessionId", "Ly71/o;", "itemState", "<init>", "(ILy71/o;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ly71/o;", "()Ly71/o;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29611n {

    /* JADX INFO: renamed from: c */
    public static final int f120952c = C39282o.f168987q;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39282o itemState;

    public C29611n(int i13, C39282o itemState) {
        AbstractC22676k.m65750j(itemState, "itemState");
        this.sessionId = i13;
        this.itemState = itemState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39282o getItemState() {
        return this.itemState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29611n)) {
            return false;
        }
        C29611n c29611n = (C29611n) other;
        return this.sessionId == c29611n.sessionId && AbstractC22676k.m65745e(this.itemState, c29611n.itemState);
    }

    public int hashCode() {
        return this.itemState.hashCode() + (Integer.hashCode(this.sessionId) * 31);
    }

    public String toString() {
        return "TaskViewState(sessionId=" + this.sessionId + ", itemState=" + this.itemState + ")";
    }
}
