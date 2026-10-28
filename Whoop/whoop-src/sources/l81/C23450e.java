package l81;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: l81.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Ll81/e;", "Lm91/u;", "", "topItems", "bottomItems", "", "topChildPadding", "bottomChildPadding", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23450e implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f92911e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> topItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> bottomItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double topChildPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Double bottomChildPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public C23450e(List<? extends InterfaceC25312u> topItems, List<? extends InterfaceC25312u> bottomItems, Double d3, Double d14) {
        AbstractC22676k.m65750j(topItems, "topItems");
        AbstractC22676k.m65750j(bottomItems, "bottomItems");
        this.topItems = topItems;
        this.bottomItems = bottomItems;
        this.topChildPadding = d3;
        this.bottomChildPadding = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getBottomChildPadding() {
        return this.bottomChildPadding;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m68027b() {
        return this.bottomItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getTopChildPadding() {
        return this.topChildPadding;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m68029e() {
        return this.topItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23450e)) {
            return false;
        }
        C23450e c23450e = (C23450e) other;
        return AbstractC22676k.m65745e(this.topItems, c23450e.topItems) && AbstractC22676k.m65745e(this.bottomItems, c23450e.bottomItems) && AbstractC22676k.m65745e(this.topChildPadding, c23450e.topChildPadding) && AbstractC22676k.m65745e(this.bottomChildPadding, c23450e.bottomChildPadding);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.topItems.hashCode() * 31, 31, this.bottomItems);
        Double d3 = this.topChildPadding;
        int iHashCode = (iM31983b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.bottomChildPadding;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public String toString() {
        List<InterfaceC25312u> list = this.topItems;
        List<InterfaceC25312u> list2 = this.bottomItems;
        Double d3 = this.topChildPadding;
        Double d14 = this.bottomChildPadding;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("SplitColumnViewState(topItems=", ", bottomItems=", list, ", topChildPadding=", list2);
        sbM124380j.append(d3);
        sbM124380j.append(", bottomChildPadding=");
        sbM124380j.append(d14);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    public /* synthetic */ C23450e(List list, List list2, Double d3, Double d14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? null : d3, (i13 & 8) != 0 ? null : d14);
    }
}
