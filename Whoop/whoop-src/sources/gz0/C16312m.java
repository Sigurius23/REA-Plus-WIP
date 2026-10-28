package gz0;

import java.util.List;
import kd1.C22396h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lgz0/m;", "", "", "discoverMore", "", "Lkd1/h;", "descriptions", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDiscoverMore", "b", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16312m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int discoverMore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16312m(int i13, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.discoverMore = i13;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22396h<Integer>> m46372a() {
        return this.descriptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16312m)) {
            return false;
        }
        C16312m c16312m = (C16312m) other;
        return this.discoverMore == c16312m.discoverMore && AbstractC22676k.m65745e(this.descriptions, c16312m.descriptions);
    }

    public int hashCode() {
        return this.descriptions.hashCode() + (Integer.hashCode(this.discoverMore) * 31);
    }

    public String toString() {
        return "GeneralIcons(discoverMore=" + this.discoverMore + ", descriptions=" + this.descriptions + ")";
    }
}
