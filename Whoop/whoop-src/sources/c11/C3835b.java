package c11;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lc11/b;", "", "Li2/x;", "valueTextColor", "unitTextColor", "topIndicatorColor", "bottomIndicatorColor", "bottomExpandedLabel", "topExpandedLabel", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "()J", "b", "e", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3835b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long valueTextColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long unitTextColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long topIndicatorColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long bottomIndicatorColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long bottomExpandedLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long topExpandedLabel;

    public /* synthetic */ C3835b(long j7, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, j14, j15, j16, j17);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBottomExpandedLabel() {
        return this.bottomExpandedLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBottomIndicatorColor() {
        return this.bottomIndicatorColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTopExpandedLabel() {
        return this.topExpandedLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTopIndicatorColor() {
        return this.topIndicatorColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getUnitTextColor() {
        return this.unitTextColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3835b)) {
            return false;
        }
        C3835b c3835b = (C3835b) other;
        return C17919x.m51542d(this.valueTextColor, c3835b.valueTextColor) && C17919x.m51542d(this.unitTextColor, c3835b.unitTextColor) && C17919x.m51542d(this.topIndicatorColor, c3835b.topIndicatorColor) && C17919x.m51542d(this.bottomIndicatorColor, c3835b.bottomIndicatorColor) && C17919x.m51542d(this.bottomExpandedLabel, c3835b.bottomExpandedLabel) && C17919x.m51542d(this.topExpandedLabel, c3835b.topExpandedLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getValueTextColor() {
        return this.valueTextColor;
    }

    public int hashCode() {
        long j7 = this.valueTextColor;
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.topExpandedLabel) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(j7) * 31, this.unitTextColor, 31), this.topIndicatorColor, 31), this.bottomIndicatorColor, 31), this.bottomExpandedLabel, 31);
    }

    public String toString() {
        String strM51548j = C17919x.m51548j(this.valueTextColor);
        String strM51548j2 = C17919x.m51548j(this.unitTextColor);
        String strM51548j3 = C17919x.m51548j(this.topIndicatorColor);
        String strM51548j4 = C17919x.m51548j(this.bottomIndicatorColor);
        String strM51548j5 = C17919x.m51548j(this.bottomExpandedLabel);
        String strM51548j6 = C17919x.m51548j(this.topExpandedLabel);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContributorGraphColors(valueTextColor=", strM51548j, ", unitTextColor=", strM51548j2, ", topIndicatorColor=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", bottomIndicatorColor=", strM51548j4, ", bottomExpandedLabel=");
        return AbstractC11266d.m30464r(sbM32001t, strM51548j5, ", topExpandedLabel=", strM51548j6, ")");
    }

    private C3835b(long j7, long j13, long j14, long j15, long j16, long j17) {
        this.valueTextColor = j7;
        this.unitTextColor = j13;
        this.topIndicatorColor = j14;
        this.bottomIndicatorColor = j15;
        this.bottomExpandedLabel = j16;
        this.topExpandedLabel = j17;
    }
}
