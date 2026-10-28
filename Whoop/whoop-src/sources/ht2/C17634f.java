package ht2;

import gt2.AbstractC16205c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ht2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lht2/f;", "Lm91/u;", "Lgt2/c;", "weeklyPlanHomeTileViewState", "", "isExpanded", "<init>", "(Lgt2/c;Z)V", "a", "(Lgt2/c;Z)Lht2/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lgt2/c;", "c", "()Lgt2/c;", "b", "Z", "e", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17634f implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f68385c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC16205c weeklyPlanHomeTileViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isExpanded;

    public C17634f(AbstractC16205c abstractC16205c, boolean z4) {
        this.weeklyPlanHomeTileViewState = abstractC16205c;
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17634f m50246b(C17634f c17634f, AbstractC16205c abstractC16205c, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC16205c = c17634f.weeklyPlanHomeTileViewState;
        }
        if ((i13 & 2) != 0) {
            z4 = c17634f.isExpanded;
        }
        return c17634f.m50247a(abstractC16205c, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C17634f m50247a(AbstractC16205c weeklyPlanHomeTileViewState, boolean isExpanded) {
        return new C17634f(weeklyPlanHomeTileViewState, isExpanded);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC16205c getWeeklyPlanHomeTileViewState() {
        return this.weeklyPlanHomeTileViewState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17634f)) {
            return false;
        }
        C17634f c17634f = (C17634f) other;
        return AbstractC22676k.m65745e(this.weeklyPlanHomeTileViewState, c17634f.weeklyPlanHomeTileViewState) && this.isExpanded == c17634f.isExpanded;
    }

    public int hashCode() {
        AbstractC16205c abstractC16205c = this.weeklyPlanHomeTileViewState;
        return Boolean.hashCode(this.isExpanded) + ((abstractC16205c == null ? 0 : abstractC16205c.hashCode()) * 31);
    }

    public String toString() {
        return "WeeklyPlanHomeTileWrapperState(weeklyPlanHomeTileViewState=" + this.weeklyPlanHomeTileViewState + ", isExpanded=" + this.isExpanded + ")";
    }

    public /* synthetic */ C17634f(AbstractC16205c abstractC16205c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC16205c, (i13 & 2) != 0 ? false : z4);
    }
}
