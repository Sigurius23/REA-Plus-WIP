package qk2;

import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lqk2/a;", "", "Ly3/f;", "chartHeight", "rowHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C30445a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float chartHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float rowHeight;

    public /* synthetic */ C30445a(float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getChartHeight() {
        return this.chartHeight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getRowHeight() {
        return this.rowHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30445a)) {
            return false;
        }
        C30445a c30445a = (C30445a) other;
        return C39174f.m124782b(this.chartHeight, c30445a.chartHeight) && C39174f.m124782b(this.rowHeight, c30445a.rowHeight);
    }

    public int hashCode() {
        return Float.hashCode(this.rowHeight) + (Float.hashCode(this.chartHeight) * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("HrZonesBarDimens(chartHeight=", C39174f.m124783c(this.chartHeight), ", rowHeight=", C39174f.m124783c(this.rowHeight), ")");
    }

    private C30445a(float f13, float f14) {
        this.chartHeight = f13;
        this.rowHeight = f14;
    }
}
