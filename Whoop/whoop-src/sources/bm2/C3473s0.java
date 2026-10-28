package bm2;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: bm2.s0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Lbm2/s0;", "", "Lbm2/m1;", "style", "", "widthPercent", "", "lowerBound", "upperBound", "Lcom/whoop/design/util/TextResource;", "displayValue", "<init>", "(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm2/m1;", "c", "()Lbm2/m1;", "b", "F", "e", "()F", "I", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3473s0 {

    /* JADX INFO: renamed from: f */
    public static final int f13643f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC3461m1 style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float widthPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int lowerBound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int upperBound;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource displayValue;

    public C3473s0(EnumC3461m1 style, float f13, int i13, int i14, TextResource displayValue) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(displayValue, "displayValue");
        this.style = style;
        this.widthPercent = f13;
        this.lowerBound = i13;
        this.upperBound = i14;
        this.displayValue = displayValue;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDisplayValue() {
        return this.displayValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC3461m1 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getWidthPercent() {
        return this.widthPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3473s0)) {
            return false;
        }
        C3473s0 c3473s0 = (C3473s0) other;
        return this.style == c3473s0.style && Float.compare(this.widthPercent, c3473s0.widthPercent) == 0 && this.lowerBound == c3473s0.lowerBound && this.upperBound == c3473s0.upperBound && AbstractC22676k.m65745e(this.displayValue, c3473s0.displayValue);
    }

    public int hashCode() {
        return this.displayValue.hashCode() + AbstractC11266d.m30448b(this.upperBound, AbstractC11266d.m30448b(this.lowerBound, AbstractC11266d.m30447a(this.widthPercent, this.style.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        EnumC3461m1 enumC3461m1 = this.style;
        float f13 = this.widthPercent;
        int i13 = this.lowerBound;
        int i14 = this.upperBound;
        TextResource textResource = this.displayValue;
        StringBuilder sb4 = new StringBuilder("SegmentsViewState(style=");
        sb4.append(enumC3461m1);
        sb4.append(", widthPercent=");
        sb4.append(f13);
        sb4.append(", lowerBound=");
        AbstractC30802r.m94773v(sb4, i13, ", upperBound=", i14, ", displayValue=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }
}
