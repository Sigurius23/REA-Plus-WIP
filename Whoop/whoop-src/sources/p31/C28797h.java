package p31;

import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lp31/h;", "", "", "Lp31/b;", "items", "", "expanded", "Lkotlin/Function1;", "Lp31/d;", "Ll83/a0;", "onEvent", "<init>", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28797h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C28791b> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean expanded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 onEvent;

    public C28797h(List<C28791b> items, boolean z4, Function1 onEvent) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        this.items = items;
        this.expanded = z4;
        this.onEvent = onEvent;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    /* JADX INFO: renamed from: b */
    public final List<C28791b> m87580b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Function1 getOnEvent() {
        return this.onEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28797h)) {
            return false;
        }
        C28797h c28797h = (C28797h) other;
        return AbstractC22676k.m65745e(this.items, c28797h.items) && this.expanded == c28797h.expanded && AbstractC22676k.m65745e(this.onEvent, c28797h.onEvent);
    }

    public int hashCode() {
        return this.onEvent.hashCode() + AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.expanded);
    }

    public String toString() {
        return "FabTooltipState(items=" + this.items + ", expanded=" + this.expanded + ", onEvent=" + this.onEvent + ")";
    }
}
