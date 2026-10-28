package iw0;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iw0.e0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, m65681d2 = {"Liw0/e0;", "", "", "Liw0/z;", "exerciseCardItems", "", "totalNumberOfItems", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20966e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C20994z> exerciseCardItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int totalNumberOfItems;

    public C20966e0(List<C20994z> exerciseCardItems, int i13) {
        AbstractC22676k.m65750j(exerciseCardItems, "exerciseCardItems");
        this.exerciseCardItems = exerciseCardItems;
        this.totalNumberOfItems = i13;
    }

    /* JADX INFO: renamed from: a */
    public final List<C20994z> m58282a() {
        return this.exerciseCardItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalNumberOfItems() {
        return this.totalNumberOfItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20966e0)) {
            return false;
        }
        C20966e0 c20966e0 = (C20966e0) other;
        return AbstractC22676k.m65745e(this.exerciseCardItems, c20966e0.exerciseCardItems) && this.totalNumberOfItems == c20966e0.totalNumberOfItems;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalNumberOfItems) + (this.exerciseCardItems.hashCode() * 31);
    }

    public String toString() {
        return "ExerciseSummaryCarousel(exerciseCardItems=" + this.exerciseCardItems + ", totalNumberOfItems=" + this.totalNumberOfItems + ")";
    }
}
