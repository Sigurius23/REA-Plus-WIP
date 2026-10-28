package e81;

import c13.AbstractC3855a;
import java.util.List;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: e81.f0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Le81/f0;", "Lm91/u;", "", "id", "", "showAnimation", "", "Le81/j0;", "slices", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "a", "(Ljava/lang/String;ZLjava/util/List;)Le81/f0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Z", "c", "()Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12827f0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f43975d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showAnimation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C12835j0> slices;

    public C12827f0(String id4, boolean z4, List<C12835j0> slices) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(slices, "slices");
        this.id = id4;
        this.showAnimation = z4;
        this.slices = slices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12827f0 m35961b(C12827f0 c12827f0, String str, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c12827f0.id;
        }
        if ((i13 & 2) != 0) {
            z4 = c12827f0.showAnimation;
        }
        if ((i13 & 4) != 0) {
            list = c12827f0.slices;
        }
        return c12827f0.m35962a(str, z4, list);
    }

    /* JADX INFO: renamed from: a */
    public final C12827f0 m35962a(String id4, boolean showAnimation, List<C12835j0> slices) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(slices, "slices");
        return new C12827f0(id4, showAnimation, slices);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowAnimation() {
        return this.showAnimation;
    }

    /* JADX INFO: renamed from: e */
    public final List<C12835j0> m35964e() {
        return this.slices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12827f0)) {
            return false;
        }
        C12827f0 c12827f0 = (C12827f0) other;
        return AbstractC22676k.m65745e(this.id, c12827f0.id) && this.showAnimation == c12827f0.showAnimation && AbstractC22676k.m65745e(this.slices, c12827f0.slices);
    }

    public int hashCode() {
        return this.slices.hashCode() + AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.showAnimation);
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.showAnimation;
        return AbstractC3855a.m11829m(AbstractC25012a.m73379l("PieChartViewState(id=", str, ", showAnimation=", ", slices=", z4), this.slices, ")");
    }

    public /* synthetic */ C12827f0(String str, boolean z4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4, list);
    }
}
