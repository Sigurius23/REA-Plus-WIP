package qu1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: qu1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lqu1/d;", "Lm91/u;", "", "path", "Lqu1/f;", "lastNightScreenViewState", "<init>", "(Ljava/lang/String;Lqu1/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lqu1/f;", "()Lqu1/f;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30628d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30630f lastNightScreenViewState;

    public C30628d(String path, C30630f lastNightScreenViewState) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(lastNightScreenViewState, "lastNightScreenViewState");
        this.path = path;
        this.lastNightScreenViewState = lastNightScreenViewState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C30630f getLastNightScreenViewState() {
        return this.lastNightScreenViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30628d)) {
            return false;
        }
        C30628d c30628d = (C30628d) other;
        return AbstractC22676k.m65745e(this.path, c30628d.path) && AbstractC22676k.m65745e(this.lastNightScreenViewState, c30628d.lastNightScreenViewState);
    }

    public int hashCode() {
        return this.lastNightScreenViewState.hashCode() + (this.path.hashCode() * 31);
    }

    public String toString() {
        return "LastNightSleepMiniArchViewState(path=" + this.path + ", lastNightScreenViewState=" + this.lastNightScreenViewState + ")";
    }
}
