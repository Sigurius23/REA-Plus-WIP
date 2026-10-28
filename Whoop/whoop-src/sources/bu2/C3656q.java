package bu2;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bu2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b!\u0010 ¨\u0006\""}, m65681d2 = {"Lbu2/q;", "Lm91/u;", "", "fillPercentage", "minFillPercentage", "maxFillPercentage", "Li2/x;", "backgroundColor", "foregroundColor", "sliderHandleColor", "<init>", "(FFFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "f", "c", "e", "d", "J", "()J", "g", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3656q implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float minFillPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float maxFillPercentage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long foregroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long sliderHandleColor;

    public /* synthetic */ C3656q(float f13, float f14, float f15, long j7, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, j7, j13, j14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getMaxFillPercentage() {
        return this.maxFillPercentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3656q)) {
            return false;
        }
        C3656q c3656q = (C3656q) other;
        return Float.compare(this.fillPercentage, c3656q.fillPercentage) == 0 && Float.compare(this.minFillPercentage, c3656q.minFillPercentage) == 0 && Float.compare(this.maxFillPercentage, c3656q.maxFillPercentage) == 0 && C17919x.m51542d(this.backgroundColor, c3656q.backgroundColor) && C17919x.m51542d(this.foregroundColor, c3656q.foregroundColor) && C17919x.m51542d(this.sliderHandleColor, c3656q.sliderHandleColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getMinFillPercentage() {
        return this.minFillPercentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSliderHandleColor() {
        return this.sliderHandleColor;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.maxFillPercentage, AbstractC11266d.m30447a(this.minFillPercentage, Float.hashCode(this.fillPercentage) * 31, 31), 31);
        long j7 = this.backgroundColor;
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.sliderHandleColor) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(iM30447a, j7, 31), this.foregroundColor, 31);
    }

    public String toString() {
        float f13 = this.fillPercentage;
        float f14 = this.minFillPercentage;
        float f15 = this.maxFillPercentage;
        String strM51548j = C17919x.m51548j(this.backgroundColor);
        String strM51548j2 = C17919x.m51548j(this.foregroundColor);
        String strM51548j3 = C17919x.m51548j(this.sliderHandleColor);
        StringBuilder sbM8307t = AbstractC2875y.m8307t("SliderItemState(fillPercentage=", f13, ", minFillPercentage=", f14, ", maxFillPercentage=");
        sbM8307t.append(f15);
        sbM8307t.append(", backgroundColor=");
        sbM8307t.append(strM51548j);
        sbM8307t.append(", foregroundColor=");
        return AbstractC11266d.m30464r(sbM8307t, strM51548j2, ", sliderHandleColor=", strM51548j3, ")");
    }

    private C3656q(float f13, float f14, float f15, long j7, long j13, long j14) {
        this.fillPercentage = f13;
        this.minFillPercentage = f14;
        this.maxFillPercentage = f15;
        this.backgroundColor = j7;
        this.foregroundColor = j13;
        this.sliderHandleColor = j14;
    }
}
