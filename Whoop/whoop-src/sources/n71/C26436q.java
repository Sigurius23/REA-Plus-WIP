package n71;

import ih0.AbstractC18489d0;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: n71.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, m65681d2 = {"Ln71/q;", "Lm91/u;", "", "", "heartRates", "Ln71/r;", "zoneStatus", "maxVisibleHeartRates", "<init>", "(Ljava/util/List;Ln71/r;I)V", "a", "(Ljava/util/List;Ln71/r;I)Ln71/q;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ln71/r;", "f", "()Ln71/r;", "I", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26436q implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f105013d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Integer> heartRates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC26437r zoneStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxVisibleHeartRates;

    public C26436q(List<Integer> list, EnumC26437r zoneStatus, int i13) {
        AbstractC22676k.m65750j(zoneStatus, "zoneStatus");
        this.heartRates = list;
        this.zoneStatus = zoneStatus;
        this.maxVisibleHeartRates = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26436q m78255b(C26436q c26436q, List list, EnumC26437r enumC26437r, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = c26436q.heartRates;
        }
        if ((i14 & 2) != 0) {
            enumC26437r = c26436q.zoneStatus;
        }
        if ((i14 & 4) != 0) {
            i13 = c26436q.maxVisibleHeartRates;
        }
        return c26436q.m78256a(list, enumC26437r, i13);
    }

    /* JADX INFO: renamed from: a */
    public final C26436q m78256a(List<Integer> heartRates, EnumC26437r zoneStatus, int maxVisibleHeartRates) {
        AbstractC22676k.m65750j(zoneStatus, "zoneStatus");
        return new C26436q(heartRates, zoneStatus, maxVisibleHeartRates);
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m78257c() {
        return this.heartRates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxVisibleHeartRates() {
        return this.maxVisibleHeartRates;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26436q)) {
            return false;
        }
        C26436q c26436q = (C26436q) other;
        return AbstractC22676k.m65745e(this.heartRates, c26436q.heartRates) && this.zoneStatus == c26436q.zoneStatus && this.maxVisibleHeartRates == c26436q.maxVisibleHeartRates;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC26437r getZoneStatus() {
        return this.zoneStatus;
    }

    public int hashCode() {
        List<Integer> list = this.heartRates;
        return Integer.hashCode(this.maxVisibleHeartRates) + ((this.zoneStatus.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31);
    }

    public String toString() {
        List<Integer> list = this.heartRates;
        EnumC26437r enumC26437r = this.zoneStatus;
        int i13 = this.maxVisibleHeartRates;
        StringBuilder sb4 = new StringBuilder("LiveHrMonitorState(heartRates=");
        sb4.append(list);
        sb4.append(", zoneStatus=");
        sb4.append(enumC26437r);
        sb4.append(", maxVisibleHeartRates=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }

    public /* synthetic */ C26436q(List list, EnumC26437r enumC26437r, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, enumC26437r, (i14 & 4) != 0 ? 30 : i13);
    }
}
