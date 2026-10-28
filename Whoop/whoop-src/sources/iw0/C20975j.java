package iw0;

import java.util.List;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: iw0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Liw0/j;", "Lm91/u;", "", "", "segmentedControlIds", "segmentedControlNames", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20975j implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<String> segmentedControlIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> segmentedControlNames;

    public C20975j(List<String> segmentedControlIds, List<String> segmentedControlNames) {
        AbstractC22676k.m65750j(segmentedControlIds, "segmentedControlIds");
        AbstractC22676k.m65750j(segmentedControlNames, "segmentedControlNames");
        this.segmentedControlIds = segmentedControlIds;
        this.segmentedControlNames = segmentedControlNames;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m58301a() {
        return this.segmentedControlIds;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m58302b() {
        return this.segmentedControlNames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20975j)) {
            return false;
        }
        C20975j c20975j = (C20975j) other;
        return AbstractC22676k.m65745e(this.segmentedControlIds, c20975j.segmentedControlIds) && AbstractC22676k.m65745e(this.segmentedControlNames, c20975j.segmentedControlNames);
    }

    public int hashCode() {
        return this.segmentedControlNames.hashCode() + (this.segmentedControlIds.hashCode() * 31);
    }

    public String toString() {
        return AbstractC13673n.m38562i("DetailsSegmentControlsState(segmentedControlIds=", ", segmentedControlNames=", this.segmentedControlIds, ")", this.segmentedControlNames);
    }
}
