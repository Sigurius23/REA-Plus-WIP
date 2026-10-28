package lf0;

import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.w0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Llf0/w0;", "Lm91/u;", "Llf0/x0;", "startItem", "endItem", "<init>", "(Llf0/x0;Llf0/x0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llf0/x0;", "b", "()Llf0/x0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23980w0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f94681c = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23983x0 startItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C23983x0 endItem;

    public C23980w0(C23983x0 startItem, C23983x0 endItem) {
        AbstractC22676k.m65750j(startItem, "startItem");
        AbstractC22676k.m65750j(endItem, "endItem");
        this.startItem = startItem;
        this.endItem = endItem;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23983x0 getEndItem() {
        return this.endItem;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23983x0 getStartItem() {
        return this.startItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23980w0)) {
            return false;
        }
        C23980w0 c23980w0 = (C23980w0) other;
        return AbstractC22676k.m65745e(this.startItem, c23980w0.startItem) && AbstractC22676k.m65745e(this.endItem, c23980w0.endItem);
    }

    public int hashCode() {
        return this.endItem.hashCode() + (this.startItem.hashCode() * 31);
    }

    public String toString() {
        return "ImageSplitContainerState(startItem=" + this.startItem + ", endItem=" + this.endItem + ")";
    }
}
