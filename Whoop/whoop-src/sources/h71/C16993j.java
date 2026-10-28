package h71;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i71.InterfaceC18201e;
import j71.AbstractC21394b;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: h71.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b\u001b\u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lh71/j;", "Lm91/u;", "Lh71/k;", "planeState", "", "Lj71/b;", "plots", "", "scrollSize", "Li71/e;", "dataScrollerType", "Lcom/whoop/design/util/TextResource;", "accessibilityLabel", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lh71/k;Ljava/util/List;FLi71/e;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh71/k;", "c", "()Lh71/k;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "F", "f", "()F", "d", "Li71/e;", "()Li71/e;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16993j implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f65285g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16994k planeState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC21394b> plots;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float scrollSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC18201e dataScrollerType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource accessibilityLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Object event;

    /* JADX WARN: Multi-variable type inference failed */
    public C16993j(C16994k planeState, List<? extends AbstractC21394b> plots, float f13, InterfaceC18201e dataScrollerType, TextResource accessibilityLabel, Object event) {
        AbstractC22676k.m65750j(planeState, "planeState");
        AbstractC22676k.m65750j(plots, "plots");
        AbstractC22676k.m65750j(dataScrollerType, "dataScrollerType");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(event, "event");
        this.planeState = planeState;
        this.plots = plots;
        this.scrollSize = f13;
        this.dataScrollerType = dataScrollerType;
        this.accessibilityLabel = accessibilityLabel;
        this.event = event;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC18201e getDataScrollerType() {
        return this.dataScrollerType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16994k getPlaneState() {
        return this.planeState;
    }

    /* JADX INFO: renamed from: e */
    public final List<AbstractC21394b> m47857e() {
        return this.plots;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16993j)) {
            return false;
        }
        C16993j c16993j = (C16993j) other;
        return AbstractC22676k.m65745e(this.planeState, c16993j.planeState) && AbstractC22676k.m65745e(this.plots, c16993j.plots) && Float.compare(this.scrollSize, c16993j.scrollSize) == 0 && AbstractC22676k.m65745e(this.dataScrollerType, c16993j.dataScrollerType) && AbstractC22676k.m65745e(this.accessibilityLabel, c16993j.accessibilityLabel) && AbstractC22676k.m65745e(this.event, c16993j.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getScrollSize() {
        return this.scrollSize;
    }

    public int hashCode() {
        return this.event.hashCode() + AbstractC31061c.m95625a((this.dataScrollerType.hashCode() + AbstractC11266d.m30447a(this.scrollSize, AbstractC11895b.m31983b(this.planeState.hashCode() * 31, 31, this.plots), 31)) * 31, this.accessibilityLabel, 31);
    }

    public String toString() {
        return "ScrollableGraphState(planeState=" + this.planeState + ", plots=" + this.plots + ", scrollSize=" + this.scrollSize + ", dataScrollerType=" + this.dataScrollerType + ", accessibilityLabel=" + this.accessibilityLabel + ", event=" + this.event + ")";
    }

    public /* synthetic */ C16993j(C16994k c16994k, List list, float f13, InterfaceC18201e interfaceC18201e, TextResource textResource, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C16994k(null, null, null, false, false, false, 63, null) : c16994k, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 15.0f : f13, (i13 & 8) != 0 ? InterfaceC18201e.c.f70708a : interfaceC18201e, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 32) != 0 ? C23454a0.f92919a : obj);
    }
}
