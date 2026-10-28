package n01;

import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n01.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ln01/f;", "", "", "listId", "", "selectedCellIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26089f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String listId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> selectedCellIds;

    public C26089f(String listId, List<String> selectedCellIds) {
        AbstractC22676k.m65750j(listId, "listId");
        AbstractC22676k.m65750j(selectedCellIds, "selectedCellIds");
        this.listId = listId;
        this.selectedCellIds = selectedCellIds;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getListId() {
        return this.listId;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m77610b() {
        return this.selectedCellIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26089f)) {
            return false;
        }
        C26089f c26089f = (C26089f) other;
        return AbstractC22676k.m65745e(this.listId, c26089f.listId) && AbstractC22676k.m65745e(this.selectedCellIds, c26089f.selectedCellIds);
    }

    public int hashCode() {
        return this.selectedCellIds.hashCode() + (this.listId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("SelectableCellListViewEvent(listId=", this.listId, ", selectedCellIds=", ")", this.selectedCellIds);
    }
}
