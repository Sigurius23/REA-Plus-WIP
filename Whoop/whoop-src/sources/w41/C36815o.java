package w41;

import com.whoop.navigation.C9598e;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: w41.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lw41/o;", "Lm91/u;", "", "activityMapTitle", "Lw41/z;", "mapState", "", "Lw41/r;", "activityStatList", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lw41/z;Ljava/util/List;Lcom/whoop/navigation/e;)V", "a", "(Ljava/lang/String;Lw41/z;Ljava/util/List;Lcom/whoop/navigation/e;)Lw41/o;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lw41/z;", "g", "()Lw41/z;", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lcom/whoop/navigation/e;", "f", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36815o implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f157492e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String activityMapTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC36826z mapState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C36818r> activityStatList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    public C36815o(String activityMapTitle, AbstractC36826z abstractC36826z, List<C36818r> activityStatList, C9598e c9598e) {
        AbstractC22676k.m65750j(activityMapTitle, "activityMapTitle");
        AbstractC22676k.m65750j(activityStatList, "activityStatList");
        this.activityMapTitle = activityMapTitle;
        this.mapState = abstractC36826z;
        this.activityStatList = activityStatList;
        this.destination = c9598e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36815o m118025b(C36815o c36815o, String str, AbstractC36826z abstractC36826z, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c36815o.activityMapTitle;
        }
        if ((i13 & 2) != 0) {
            abstractC36826z = c36815o.mapState;
        }
        if ((i13 & 4) != 0) {
            list = c36815o.activityStatList;
        }
        if ((i13 & 8) != 0) {
            c9598e = c36815o.destination;
        }
        return c36815o.m118026a(str, abstractC36826z, list, c9598e);
    }

    /* JADX INFO: renamed from: a */
    public final C36815o m118026a(String activityMapTitle, AbstractC36826z mapState, List<C36818r> activityStatList, C9598e destination) {
        AbstractC22676k.m65750j(activityMapTitle, "activityMapTitle");
        AbstractC22676k.m65750j(activityStatList, "activityStatList");
        return new C36815o(activityMapTitle, mapState, activityStatList, destination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityMapTitle() {
        return this.activityMapTitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<C36818r> m118028e() {
        return this.activityStatList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36815o)) {
            return false;
        }
        C36815o c36815o = (C36815o) other;
        return AbstractC22676k.m65745e(this.activityMapTitle, c36815o.activityMapTitle) && AbstractC22676k.m65745e(this.mapState, c36815o.mapState) && AbstractC22676k.m65745e(this.activityStatList, c36815o.activityStatList) && AbstractC22676k.m65745e(this.destination, c36815o.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC36826z getMapState() {
        return this.mapState;
    }

    public int hashCode() {
        int iHashCode = this.activityMapTitle.hashCode() * 31;
        AbstractC36826z abstractC36826z = this.mapState;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (abstractC36826z == null ? 0 : abstractC36826z.hashCode())) * 31, 31, this.activityStatList);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        return "ActivityMapState(activityMapTitle=" + this.activityMapTitle + ", mapState=" + this.mapState + ", activityStatList=" + this.activityStatList + ", destination=" + this.destination + ")";
    }

    public /* synthetic */ C36815o(String str, AbstractC36826z abstractC36826z, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, abstractC36826z, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : c9598e);
    }
}
