package q21;

import java.util.List;
import ny0.C27256h;
import ny0.C27273p0;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: q21.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001b\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lq21/i;", "Lm91/u;", "", "highlightedPlan", "", "Lq21/d;", "rows", "Li2/t;", "highlightedBackgroundColor", "Lny0/h;", "buttonState", "Lny0/p0;", "secondaryButtonViewState", "Lq21/e;", "style", "<init>", "(ILjava/util/List;Li2/t;Lny0/h;Lny0/p0;Lq21/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Li2/t;", "()Li2/t;", "d", "Lny0/h;", "()Lny0/h;", "Lny0/p0;", "f", "()Lny0/p0;", "Lq21/e;", "g", "()Lq21/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29850i implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f122000g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int highlightedPlan;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<List<AbstractC29845d>> rows;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC17911t highlightedBackgroundColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27256h buttonState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27273p0 secondaryButtonViewState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C29846e style;

    /* JADX WARN: Multi-variable type inference failed */
    public C29850i(int i13, List<? extends List<? extends AbstractC29845d>> rows, AbstractC17911t highlightedBackgroundColor, C27256h c27256h, C27273p0 c27273p0, C29846e c29846e) {
        AbstractC22676k.m65750j(rows, "rows");
        AbstractC22676k.m65750j(highlightedBackgroundColor, "highlightedBackgroundColor");
        this.highlightedPlan = i13;
        this.rows = rows;
        this.highlightedBackgroundColor = highlightedBackgroundColor;
        this.buttonState = c27256h;
        this.secondaryButtonViewState = c27273p0;
        this.style = c29846e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC17911t getHighlightedBackgroundColor() {
        return this.highlightedBackgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHighlightedPlan() {
        return this.highlightedPlan;
    }

    /* JADX INFO: renamed from: e */
    public final List<List<AbstractC29845d>> m91420e() {
        return this.rows;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29850i)) {
            return false;
        }
        C29850i c29850i = (C29850i) other;
        return this.highlightedPlan == c29850i.highlightedPlan && AbstractC22676k.m65745e(this.rows, c29850i.rows) && AbstractC22676k.m65745e(this.highlightedBackgroundColor, c29850i.highlightedBackgroundColor) && AbstractC22676k.m65745e(this.buttonState, c29850i.buttonState) && AbstractC22676k.m65745e(this.secondaryButtonViewState, c29850i.secondaryButtonViewState) && AbstractC22676k.m65745e(this.style, c29850i.style);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27273p0 getSecondaryButtonViewState() {
        return this.secondaryButtonViewState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C29846e getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = (this.highlightedBackgroundColor.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.highlightedPlan) * 31, 31, this.rows)) * 31;
        C27256h c27256h = this.buttonState;
        int iHashCode2 = (iHashCode + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C27273p0 c27273p0 = this.secondaryButtonViewState;
        int iHashCode3 = (iHashCode2 + (c27273p0 == null ? 0 : c27273p0.hashCode())) * 31;
        C29846e c29846e = this.style;
        return iHashCode3 + (c29846e != null ? c29846e.hashCode() : 0);
    }

    public String toString() {
        return "MembershipComparisonTableViewState(highlightedPlan=" + this.highlightedPlan + ", rows=" + this.rows + ", highlightedBackgroundColor=" + this.highlightedBackgroundColor + ", buttonState=" + this.buttonState + ", secondaryButtonViewState=" + this.secondaryButtonViewState + ", style=" + this.style + ")";
    }

    public /* synthetic */ C29850i(int i13, List list, AbstractC17911t abstractC17911t, C27256h c27256h, C27273p0 c27273p0, C29846e c29846e, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, list, abstractC17911t, c27256h, c27273p0, (i14 & 32) != 0 ? null : c29846e);
    }
}
