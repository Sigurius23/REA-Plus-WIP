package qu1;

import com.whoop.lastnightsleep.domain.models.LastNightSleepSpacingType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: qu1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lqu1/a;", "Lm91/u;", "itemViewState", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;", "insetBottom", "<init>", "(Lm91/u;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "b", "()Lm91/u;", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;", "()Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30625a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u itemViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LastNightSleepSpacingType insetBottom;

    public C30625a(InterfaceC25312u itemViewState, LastNightSleepSpacingType insetBottom) {
        AbstractC22676k.m65750j(itemViewState, "itemViewState");
        AbstractC22676k.m65750j(insetBottom, "insetBottom");
        this.itemViewState = itemViewState;
        this.insetBottom = insetBottom;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LastNightSleepSpacingType getInsetBottom() {
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
        if (!(other instanceof C30625a)) {
            return false;
        }
        C30625a c30625a = (C30625a) other;
        return AbstractC22676k.m65745e(this.itemViewState, c30625a.itemViewState) && this.insetBottom == c30625a.insetBottom;
    }

    public int hashCode() {
        return this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31);
    }

    public String toString() {
        return "ComponentItem(itemViewState=" + this.itemViewState + ", insetBottom=" + this.insetBottom + ")";
    }
}
