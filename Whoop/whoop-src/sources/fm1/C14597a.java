package fm1;

import com.whoop.home.domain.models.ComponentItemSpacingType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: fm1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lfm1/a;", "", "Lm91/u;", "itemViewState", "Lcom/whoop/home/domain/models/ComponentItemSpacingType;", "insetBottom", "<init>", "(Lm91/u;Lcom/whoop/home/domain/models/ComponentItemSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "b", "()Lm91/u;", "Lcom/whoop/home/domain/models/ComponentItemSpacingType;", "()Lcom/whoop/home/domain/models/ComponentItemSpacingType;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14597a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u itemViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ComponentItemSpacingType insetBottom;

    public C14597a(InterfaceC25312u itemViewState, ComponentItemSpacingType insetBottom) {
        AbstractC22676k.m65750j(itemViewState, "itemViewState");
        AbstractC22676k.m65750j(insetBottom, "insetBottom");
        this.itemViewState = itemViewState;
        this.insetBottom = insetBottom;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ComponentItemSpacingType getInsetBottom() {
        return this.insetBottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getItemViewState() {
        return this.itemViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14597a)) {
            return false;
        }
        C14597a c14597a = (C14597a) other;
        return AbstractC22676k.m65745e(this.itemViewState, c14597a.itemViewState) && this.insetBottom == c14597a.insetBottom;
    }

    public int hashCode() {
        return this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31);
    }

    public String toString() {
        return "ComponentItem(itemViewState=" + this.itemViewState + ", insetBottom=" + this.insetBottom + ")";
    }

    public /* synthetic */ C14597a(InterfaceC25312u interfaceC25312u, ComponentItemSpacingType componentItemSpacingType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25312u, (i13 & 2) != 0 ? ComponentItemSpacingType.COMPACT : componentItemSpacingType);
    }
}
