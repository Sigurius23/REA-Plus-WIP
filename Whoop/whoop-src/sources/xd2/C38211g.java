package xd2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xd2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b!\u0010%¨\u0006&"}, m65681d2 = {"Lxd2/g;", "", "", "clearAllButtonEnabled", "Lcom/whoop/design/util/TextResource;", "title", "Lxd2/d;", "shepherdHistoryClearAllViewState", "Lxd2/c;", "shepherdEmptyHistoryViewState", "Lxd2/m;", "shepherdPaginatedHistoryViewState", "<init>", "(ZLcom/whoop/design/util/TextResource;Lxd2/d;Lxd2/c;Lxd2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Lxd2/d;", "()Lxd2/d;", "d", "Lxd2/c;", "()Lxd2/c;", "Lxd2/m;", "()Lxd2/m;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38211g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean clearAllButtonEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38208d shepherdHistoryClearAllViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C38207c shepherdEmptyHistoryViewState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38217m shepherdPaginatedHistoryViewState;

    public C38211g(boolean z4, TextResource title, C38208d c38208d, C38207c c38207c, C38217m c38217m) {
        AbstractC22676k.m65750j(title, "title");
        this.clearAllButtonEnabled = z4;
        this.title = title;
        this.shepherdHistoryClearAllViewState = c38208d;
        this.shepherdEmptyHistoryViewState = c38207c;
        this.shepherdPaginatedHistoryViewState = c38217m;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getClearAllButtonEnabled() {
        return this.clearAllButtonEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C38207c getShepherdEmptyHistoryViewState() {
        return this.shepherdEmptyHistoryViewState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C38208d getShepherdHistoryClearAllViewState() {
        return this.shepherdHistoryClearAllViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C38217m getShepherdPaginatedHistoryViewState() {
        return this.shepherdPaginatedHistoryViewState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38211g)) {
            return false;
        }
        C38211g c38211g = (C38211g) other;
        return this.clearAllButtonEnabled == c38211g.clearAllButtonEnabled && AbstractC22676k.m65745e(this.title, c38211g.title) && AbstractC22676k.m65745e(this.shepherdHistoryClearAllViewState, c38211g.shepherdHistoryClearAllViewState) && AbstractC22676k.m65745e(this.shepherdEmptyHistoryViewState, c38211g.shepherdEmptyHistoryViewState) && AbstractC22676k.m65745e(this.shepherdPaginatedHistoryViewState, c38211g.shepherdPaginatedHistoryViewState);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(Boolean.hashCode(this.clearAllButtonEnabled) * 31, this.title, 31);
        C38208d c38208d = this.shepherdHistoryClearAllViewState;
        int iHashCode = (iM95625a + (c38208d == null ? 0 : c38208d.hashCode())) * 31;
        C38207c c38207c = this.shepherdEmptyHistoryViewState;
        int iHashCode2 = (iHashCode + (c38207c == null ? 0 : c38207c.hashCode())) * 31;
        C38217m c38217m = this.shepherdPaginatedHistoryViewState;
        return iHashCode2 + (c38217m != null ? c38217m.hashCode() : 0);
    }

    public String toString() {
        return "ShepherdHistoryViewState(clearAllButtonEnabled=" + this.clearAllButtonEnabled + ", title=" + this.title + ", shepherdHistoryClearAllViewState=" + this.shepherdHistoryClearAllViewState + ", shepherdEmptyHistoryViewState=" + this.shepherdEmptyHistoryViewState + ", shepherdPaginatedHistoryViewState=" + this.shepherdPaginatedHistoryViewState + ")";
    }
}
