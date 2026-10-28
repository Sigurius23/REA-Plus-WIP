package c41;

import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: c41.e5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lc41/e5;", "Lm91/u;", "startItem", "endItem", "", "showDivider", "<init>", "(Lm91/u;Lm91/u;Z)V", "a", "(Lm91/u;Lm91/u;Z)Lc41/e5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lm91/u;", "f", "()Lm91/u;", "b", "c", "Z", "e", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4018e5 implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f16318d = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u startItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u endItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showDivider;

    public C4018e5(InterfaceC25312u startItem, InterfaceC25312u endItem, boolean z4) {
        AbstractC22676k.m65750j(startItem, "startItem");
        AbstractC22676k.m65750j(endItem, "endItem");
        this.startItem = startItem;
        this.endItem = endItem;
        this.showDivider = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4018e5 m12212b(C4018e5 c4018e5, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC25312u = c4018e5.startItem;
        }
        if ((i13 & 2) != 0) {
            interfaceC25312u2 = c4018e5.endItem;
        }
        if ((i13 & 4) != 0) {
            z4 = c4018e5.showDivider;
        }
        return c4018e5.m12213a(interfaceC25312u, interfaceC25312u2, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C4018e5 m12213a(InterfaceC25312u startItem, InterfaceC25312u endItem, boolean showDivider) {
        AbstractC22676k.m65750j(startItem, "startItem");
        AbstractC22676k.m65750j(endItem, "endItem");
        return new C4018e5(startItem, endItem, showDivider);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getEndItem() {
        return this.endItem;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4018e5)) {
            return false;
        }
        C4018e5 c4018e5 = (C4018e5) other;
        return AbstractC22676k.m65745e(this.startItem, c4018e5.startItem) && AbstractC22676k.m65745e(this.endItem, c4018e5.endItem) && this.showDivider == c4018e5.showDivider;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC25312u getStartItem() {
        return this.startItem;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showDivider) + AbstractC11478a.m30851c(this.endItem, this.startItem.hashCode() * 31, 31);
    }

    public String toString() {
        InterfaceC25312u interfaceC25312u = this.startItem;
        InterfaceC25312u interfaceC25312u2 = this.endItem;
        boolean z4 = this.showDivider;
        StringBuilder sb4 = new StringBuilder("SplitContainerCardState(startItem=");
        sb4.append(interfaceC25312u);
        sb4.append(", endItem=");
        sb4.append(interfaceC25312u2);
        sb4.append(", showDivider=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C4018e5(InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25312u, interfaceC25312u2, (i13 & 4) != 0 ? false : z4);
    }
}
