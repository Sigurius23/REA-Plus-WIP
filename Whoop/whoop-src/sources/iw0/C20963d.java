package iw0;

import j71.C21395c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iw0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Liw0/d;", "", "", "graphId", "Lj71/c;", "graphState", "Liw0/f0;", "graphTitleBar", "<init>", "(Ljava/lang/String;Lj71/c;Liw0/f0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lj71/c;", "()Lj71/c;", "c", "Liw0/f0;", "()Liw0/f0;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20963d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String graphId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21395c graphState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C20968f0 graphTitleBar;

    public C20963d(String graphId, C21395c graphState, C20968f0 c20968f0) {
        AbstractC22676k.m65750j(graphId, "graphId");
        AbstractC22676k.m65750j(graphState, "graphState");
        this.graphId = graphId;
        this.graphState = graphState;
        this.graphTitleBar = c20968f0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGraphId() {
        return this.graphId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C21395c getGraphState() {
        return this.graphState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C20968f0 getGraphTitleBar() {
        return this.graphTitleBar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20963d)) {
            return false;
        }
        C20963d c20963d = (C20963d) other;
        return AbstractC22676k.m65745e(this.graphId, c20963d.graphId) && AbstractC22676k.m65745e(this.graphState, c20963d.graphState) && AbstractC22676k.m65745e(this.graphTitleBar, c20963d.graphTitleBar);
    }

    public int hashCode() {
        int iHashCode = (this.graphState.hashCode() + (this.graphId.hashCode() * 31)) * 31;
        C20968f0 c20968f0 = this.graphTitleBar;
        return iHashCode + (c20968f0 == null ? 0 : c20968f0.hashCode());
    }

    public String toString() {
        return "DetailsGraphData(graphId=" + this.graphId + ", graphState=" + this.graphState + ", graphTitleBar=" + this.graphTitleBar + ")";
    }
}
