package lp0;

import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lp0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\r¨\u0006\u0019"}, m65681d2 = {"Llp0/b;", "Llp0/f;", "", "optimalSleepText", "optimalSleepTimeText", "", "startPixels", "endTimePixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24631b extends AbstractC24635f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optimalSleepText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String optimalSleepTimeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int startPixels;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int endTimePixels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24631b(String optimalSleepText, String optimalSleepTimeText, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(optimalSleepText, "optimalSleepText");
        AbstractC22676k.m65750j(optimalSleepTimeText, "optimalSleepTimeText");
        this.optimalSleepText = optimalSleepText;
        this.optimalSleepTimeText = optimalSleepTimeText;
        this.startPixels = i13;
        this.endTimePixels = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEndTimePixels() {
        return this.endTimePixels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getOptimalSleepText() {
        return this.optimalSleepText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getOptimalSleepTimeText() {
        return this.optimalSleepTimeText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartPixels() {
        return this.startPixels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24631b)) {
            return false;
        }
        C24631b c24631b = (C24631b) other;
        return AbstractC22676k.m65745e(this.optimalSleepText, c24631b.optimalSleepText) && AbstractC22676k.m65745e(this.optimalSleepTimeText, c24631b.optimalSleepTimeText) && this.startPixels == c24631b.startPixels && this.endTimePixels == c24631b.endTimePixels;
    }

    public int hashCode() {
        return Integer.hashCode(this.endTimePixels) + AbstractC11266d.m30448b(this.startPixels, AbstractC11266d.m30450d(this.optimalSleepText.hashCode() * 31, 31, this.optimalSleepTimeText), 31);
    }

    public String toString() {
        String str = this.optimalSleepText;
        String str2 = this.optimalSleepTimeText;
        return AbstractC26725a.m79505i(AbstractC11895b.m32001t("FitsInWindow(optimalSleepText=", str, ", optimalSleepTimeText=", str2, ", startPixels="), this.startPixels, ", endTimePixels=", this.endTimePixels, ")");
    }
}
