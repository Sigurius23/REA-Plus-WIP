package s81;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: s81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ls81/d;", "", "Lm91/u;", "item", "Ls81/e;", "width", "<init>", "(Lm91/u;Ls81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "()Lm91/u;", "b", "Ls81/e;", "()Ls81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32261d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u item;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC32262e width;

    public C32261d(InterfaceC25312u item, InterfaceC32262e width) {
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(width, "width");
        this.item = item;
        this.width = width;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC32262e getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32261d)) {
            return false;
        }
        C32261d c32261d = (C32261d) other;
        return AbstractC22676k.m65745e(this.item, c32261d.item) && AbstractC22676k.m65745e(this.width, c32261d.width);
    }

    public int hashCode() {
        return this.width.hashCode() + (this.item.hashCode() * 31);
    }

    public String toString() {
        return "WhoopRowItemViewState(item=" + this.item + ", width=" + this.width + ")";
    }

    public /* synthetic */ C32261d(InterfaceC25312u interfaceC25312u, InterfaceC32262e interfaceC32262e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25312u, (i13 & 2) != 0 ? new InterfaceC32262e.a(0.0f, 1, null) : interfaceC32262e);
    }
}
