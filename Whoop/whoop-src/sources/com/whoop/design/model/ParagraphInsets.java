package com.whoop.design.model;

import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/model/ParagraphInsets;", "", "top", "", "leading", "bottom", "trailing", "<init>", "(DDDD)V", "getTop", "()D", "getLeading", "getBottom", "getTrailing", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ParagraphInsets {
    public static final int $stable = 0;
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;

    public ParagraphInsets(double d3, double d14, double d15, double d16) {
        this.top = d3;
        this.leading = d14;
        this.bottom = d15;
        this.trailing = d16;
    }

    public static /* synthetic */ ParagraphInsets copy$default(ParagraphInsets paragraphInsets, double d3, double d14, double d15, double d16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = paragraphInsets.top;
        }
        double d17 = d3;
        if ((i13 & 2) != 0) {
            d14 = paragraphInsets.leading;
        }
        double d18 = d14;
        if ((i13 & 4) != 0) {
            d15 = paragraphInsets.bottom;
        }
        return paragraphInsets.copy(d17, d18, d15, (i13 & 8) != 0 ? paragraphInsets.trailing : d16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTrailing() {
        return this.trailing;
    }

    public final ParagraphInsets copy(double top, double leading, double bottom, double trailing) {
        return new ParagraphInsets(top, leading, bottom, trailing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInsets)) {
            return false;
        }
        ParagraphInsets paragraphInsets = (ParagraphInsets) other;
        return Double.compare(this.top, paragraphInsets.top) == 0 && Double.compare(this.leading, paragraphInsets.leading) == 0 && Double.compare(this.bottom, paragraphInsets.bottom) == 0 && Double.compare(this.trailing, paragraphInsets.trailing) == 0;
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final double getLeading() {
        return this.leading;
    }

    public final double getTop() {
        return this.top;
    }

    public final double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return Double.hashCode(this.trailing) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.top) * 31, 31, this.leading), 31, this.bottom);
    }

    public String toString() {
        double d3 = this.top;
        double d14 = this.leading;
        double d15 = this.bottom;
        double d16 = this.trailing;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("ParagraphInsets(top=", d3, ", leading=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", bottom=", d15, ", trailing=");
        return AbstractC30007c.m91836f(d16, ")", sbM8306s);
    }
}
