package eu2;

import java.util.List;
import java.util.UUID;
import o11.AbstractC27407m;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: eu2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!R\u0017\u0010#\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, m65681d2 = {"Leu2/p;", "Lm91/u;", "Lm91/n;", "Ljava/util/UUID;", "id", "", "canBeReordered", "canDragOver", "", "Lo11/m$b;", "exerciseTiles", "<init>", "(Ljava/util/UUID;ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "b", "Z", "()Z", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "f", "isSuperset", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13659p implements InterfaceC25312u, InterfaceC25305n<UUID> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean canBeReordered;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean canDragOver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<AbstractC27407m.b> exerciseTiles;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSuperset;

    /* JADX WARN: Multi-variable type inference failed */
    public C13659p(UUID id4, boolean z4, boolean z13, List<? extends AbstractC27407m.b> exerciseTiles) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(exerciseTiles, "exerciseTiles");
        this.id = id4;
        this.canBeReordered = z4;
        this.canDragOver = z13;
        this.exerciseTiles = exerciseTiles;
        this.isSuperset = exerciseTiles.size() > 1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanBeReordered() {
        return this.canBeReordered;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanDragOver() {
        return this.canDragOver;
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC27407m.b> m38524c() {
        return this.exerciseTiles;
    }

    @Override // p720m91.InterfaceC25305n
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public UUID getStateUpdateKey() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13659p)) {
            return false;
        }
        C13659p c13659p = (C13659p) other;
        return AbstractC22676k.m65745e(this.id, c13659p.id) && this.canBeReordered == c13659p.canBeReordered && this.canDragOver == c13659p.canDragOver && AbstractC22676k.m65745e(this.exerciseTiles, c13659p.exerciseTiles);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSuperset() {
        return this.isSuperset;
    }

    public int hashCode() {
        return this.exerciseTiles.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.canBeReordered), 31, this.canDragOver);
    }

    public String toString() {
        return "WorkoutGroupState(id=" + this.id + ", canBeReordered=" + this.canBeReordered + ", canDragOver=" + this.canDragOver + ", exerciseTiles=" + this.exerciseTiles + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C13659p(UUID uuid, boolean z4, boolean z13, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 2) != 0 ? true : z4;
        this(uuid, z4, (i13 & 4) != 0 ? z4 : z13, list);
    }
}
