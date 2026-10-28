package p41;

import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p41.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lp41/f;", "", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/GenericInteraction;", "b", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28835f {

    /* JADX INFO: renamed from: c */
    public static final int f116723c = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final GenericInteraction toggleOnInteraction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GenericInteraction toggleOffInteraction;

    public C28835f(GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        this.toggleOnInteraction = genericInteraction;
        this.toggleOffInteraction = genericInteraction2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28835f)) {
            return false;
        }
        C28835f c28835f = (C28835f) other;
        return AbstractC22676k.m65745e(this.toggleOnInteraction, c28835f.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, c28835f.toggleOffInteraction);
    }

    public int hashCode() {
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        int iHashCode = (genericInteraction == null ? 0 : genericInteraction.hashCode()) * 31;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        return iHashCode + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        return "ToggleInteraction(toggleOnInteraction=" + this.toggleOnInteraction + ", toggleOffInteraction=" + this.toggleOffInteraction + ")";
    }
}
