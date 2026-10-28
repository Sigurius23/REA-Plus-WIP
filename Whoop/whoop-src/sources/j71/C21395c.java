package j71;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.graph.LayoutDirection;
import j61.C21374h;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: j71.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lj71/c;", "Lm91/u;", "Lj61/h;", "plane", "", "Lj71/b;", "plots", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "layoutDirection", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;)V", "a", "(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;)Lj71/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj61/h;", "e", "()Lj61/h;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "()Lcom/whoop/design/models/items/graph/LayoutDirection;", "d", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21395c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f81985e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21374h plane;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC21394b> plots;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Object event;

    /* JADX WARN: Multi-variable type inference failed */
    public C21395c(C21374h plane, List<? extends AbstractC21394b> plots, LayoutDirection layoutDirection, Object event) {
        AbstractC22676k.m65750j(plane, "plane");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        AbstractC22676k.m65750j(event, "event");
        this.plane = plane;
        this.plots = plots;
        this.layoutDirection = layoutDirection;
        this.event = event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21395c m60092b(C21395c c21395c, C21374h c21374h, List list, LayoutDirection layoutDirection, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            c21374h = c21395c.plane;
        }
        if ((i13 & 2) != 0) {
            list = c21395c.plots;
        }
        if ((i13 & 4) != 0) {
            layoutDirection = c21395c.layoutDirection;
        }
        if ((i13 & 8) != 0) {
            obj = c21395c.event;
        }
        return c21395c.m60093a(c21374h, list, layoutDirection, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C21395c m60093a(C21374h plane, List<? extends AbstractC21394b> plots, LayoutDirection layoutDirection, Object event) {
        AbstractC22676k.m65750j(plane, "plane");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        AbstractC22676k.m65750j(event, "event");
        return new C21395c(plane, plots, layoutDirection, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C21374h getPlane() {
        return this.plane;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21395c)) {
            return false;
        }
        C21395c c21395c = (C21395c) other;
        return AbstractC22676k.m65745e(this.plane, c21395c.plane) && AbstractC22676k.m65745e(this.plots, c21395c.plots) && this.layoutDirection == c21395c.layoutDirection && AbstractC22676k.m65745e(this.event, c21395c.event);
    }

    /* JADX INFO: renamed from: f */
    public final List<AbstractC21394b> m60096f() {
        return this.plots;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode() + ((this.layoutDirection.hashCode() + AbstractC11895b.m31983b(this.plane.hashCode() * 31, 31, this.plots)) * 31);
    }

    public String toString() {
        return "GraphState(plane=" + this.plane + ", plots=" + this.plots + ", layoutDirection=" + this.layoutDirection + ", event=" + this.event + ")";
    }

    public /* synthetic */ C21395c(C21374h c21374h, List list, LayoutDirection layoutDirection, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21374h(null, null, null, null, null, null, null, null, false, false, null, 0L, 0.0f, 8191, null) : c21374h, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? LayoutDirection.LEFT_TO_RIGHT : layoutDirection, (i13 & 8) != 0 ? C23454a0.f92919a : obj);
    }
}
