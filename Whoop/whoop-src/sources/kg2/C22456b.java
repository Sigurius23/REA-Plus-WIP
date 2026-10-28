package kg2;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.startactivity.goals.CollapsibleToggleContainerModel;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: kg2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, m65681d2 = {"Lkg2/b;", "Lm91/u;", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "model", "", "childItems", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "<init>", "(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "b", "()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcom/whoop/navigation/models/GenericInteraction;", "e", "()Lcom/whoop/navigation/models/GenericInteraction;", "d", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22456b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CollapsibleToggleContainerModel model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> childItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenericInteraction toggleOnInteraction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction toggleOffInteraction;

    /* JADX WARN: Multi-variable type inference failed */
    public C22456b(CollapsibleToggleContainerModel model, List<? extends InterfaceC25312u> childItems, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(childItems, "childItems");
        this.model = model;
        this.childItems = childItems;
        this.toggleOnInteraction = genericInteraction;
        this.toggleOffInteraction = genericInteraction2;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m64852a() {
        return this.childItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CollapsibleToggleContainerModel getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22456b)) {
            return false;
        }
        C22456b c22456b = (C22456b) other;
        return AbstractC22676k.m65745e(this.model, c22456b.model) && AbstractC22676k.m65745e(this.childItems, c22456b.childItems) && AbstractC22676k.m65745e(this.toggleOnInteraction, c22456b.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, c22456b.toggleOffInteraction);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.model.hashCode() * 31, 31, this.childItems);
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        int iHashCode = (iM31983b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        return iHashCode + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        return "CollapsibleToggleContainerItemViewState(model=" + this.model + ", childItems=" + this.childItems + ", toggleOnInteraction=" + this.toggleOnInteraction + ", toggleOffInteraction=" + this.toggleOffInteraction + ")";
    }
}
