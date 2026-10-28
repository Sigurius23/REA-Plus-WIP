package lp0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lp0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Llp0/e;", "Llp0/f;", "", "optimalSleepText", "optimalSleepTimeText", "", "midPixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "D", "()D", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24634e extends AbstractC24635f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optimalSleepText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String optimalSleepTimeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double midPixels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24634e(String optimalSleepText, String optimalSleepTimeText, double d3) {
        super(null);
        AbstractC22676k.m65750j(optimalSleepText, "optimalSleepText");
        AbstractC22676k.m65750j(optimalSleepTimeText, "optimalSleepTimeText");
        this.optimalSleepText = optimalSleepText;
        this.optimalSleepTimeText = optimalSleepTimeText;
        this.midPixels = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getMidPixels() {
        return this.midPixels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getOptimalSleepText() {
        return this.optimalSleepText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getOptimalSleepTimeText() {
        return this.optimalSleepTimeText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24634e)) {
            return false;
        }
        C24634e c24634e = (C24634e) other;
        return AbstractC22676k.m65745e(this.optimalSleepText, c24634e.optimalSleepText) && AbstractC22676k.m65745e(this.optimalSleepTimeText, c24634e.optimalSleepTimeText) && Double.compare(this.midPixels, c24634e.midPixels) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.midPixels) + AbstractC11266d.m30450d(this.optimalSleepText.hashCode() * 31, 31, this.optimalSleepTimeText);
    }

    public String toString() {
        return AbstractC30007c.m91836f(this.midPixels, ")", AbstractC11895b.m32001t("NoDataState(optimalSleepText=", this.optimalSleepText, ", optimalSleepTimeText=", this.optimalSleepTimeText, ", midPixels="));
    }
}
