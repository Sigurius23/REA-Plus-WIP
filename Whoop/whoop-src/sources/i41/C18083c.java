package i41;

import i91.AbstractC18247a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Li41/c;", "", "Li41/b;", "trend", "", "isHighlighted", "Li91/a;", "backgroundColor", "<init>", "(Li41/b;Ljava/lang/Boolean;Li91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li41/b;", "getTrend", "()Li41/b;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "Li91/a;", "()Li91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18083c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC18082b trend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Boolean isHighlighted;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18247a backgroundColor;

    public C18083c(EnumC18082b trend, Boolean bool, AbstractC18247a backgroundColor) {
        AbstractC22676k.m65750j(trend, "trend");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.trend = trend;
        this.isHighlighted = bool;
        this.backgroundColor = backgroundColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18247a getBackgroundColor() {
        return this.backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18083c)) {
            return false;
        }
        C18083c c18083c = (C18083c) other;
        return this.trend == c18083c.trend && AbstractC22676k.m65745e(this.isHighlighted, c18083c.isHighlighted) && AbstractC22676k.m65745e(this.backgroundColor, c18083c.backgroundColor);
    }

    public int hashCode() {
        int iHashCode = this.trend.hashCode() * 31;
        Boolean bool = this.isHighlighted;
        return this.backgroundColor.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public String toString() {
        return "TrendBarSegmentViewState(trend=" + this.trend + ", isHighlighted=" + this.isHighlighted + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
