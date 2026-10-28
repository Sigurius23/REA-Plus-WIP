package iw0;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: iw0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Liw0/f;", "Lm91/u;", "Liw0/j;", "detailsSegmentControlsState", "", "Liw0/d;", "graphList", "<init>", "(Liw0/j;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liw0/j;", "()Liw0/j;", "b", "Ljava/util/List;", "()Ljava/util/List;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20967f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20975j detailsSegmentControlsState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C20963d> graphList;

    public C20967f(C20975j detailsSegmentControlsState, List<C20963d> graphList) {
        AbstractC22676k.m65750j(detailsSegmentControlsState, "detailsSegmentControlsState");
        AbstractC22676k.m65750j(graphList, "graphList");
        this.detailsSegmentControlsState = detailsSegmentControlsState;
        this.graphList = graphList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C20975j getDetailsSegmentControlsState() {
        return this.detailsSegmentControlsState;
    }

    /* JADX INFO: renamed from: b */
    public final List<C20963d> m58285b() {
        return this.graphList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20967f)) {
            return false;
        }
        C20967f c20967f = (C20967f) other;
        return AbstractC22676k.m65745e(this.detailsSegmentControlsState, c20967f.detailsSegmentControlsState) && AbstractC22676k.m65745e(this.graphList, c20967f.graphList);
    }

    public int hashCode() {
        return this.graphList.hashCode() + (this.detailsSegmentControlsState.hashCode() * 31);
    }

    public String toString() {
        return "DetailsGraphWithSegmentState(detailsSegmentControlsState=" + this.detailsSegmentControlsState + ", graphList=" + this.graphList + ")";
    }
}
