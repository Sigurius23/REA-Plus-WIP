package y11;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: y11.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ly11/d;", "Lm91/u;", "", "showGradient", "", "Ly11/f;", "bars", "Ly11/s;", "legendContentList", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39051d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showGradient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C39053f> bars;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C39066s> legendContentList;

    public C39051d(boolean z4, List<C39053f> bars, List<C39066s> legendContentList) {
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(legendContentList, "legendContentList");
        this.showGradient = z4;
        this.bars = bars;
        this.legendContentList = legendContentList;
    }

    /* JADX INFO: renamed from: a */
    public final List<C39053f> m124491a() {
        return this.bars;
    }

    /* JADX INFO: renamed from: b */
    public final List<C39066s> m124492b() {
        return this.legendContentList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowGradient() {
        return this.showGradient;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39051d)) {
            return false;
        }
        C39051d c39051d = (C39051d) other;
        return this.showGradient == c39051d.showGradient && AbstractC22676k.m65745e(this.bars, c39051d.bars) && AbstractC22676k.m65745e(this.legendContentList, c39051d.legendContentList);
    }

    public int hashCode() {
        return this.legendContentList.hashCode() + AbstractC11895b.m31983b(Boolean.hashCode(this.showGradient) * 31, 31, this.bars);
    }

    public String toString() {
        boolean z4 = this.showGradient;
        List<C39053f> list = this.bars;
        List<C39066s> list2 = this.legendContentList;
        StringBuilder sb4 = new StringBuilder("ComparisonBarGraphState(showGradient=");
        sb4.append(z4);
        sb4.append(", bars=");
        sb4.append(list);
        sb4.append(", legendContentList=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }
}
