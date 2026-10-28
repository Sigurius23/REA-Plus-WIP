package lp0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lp0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u0012¨\u0006$"}, m65681d2 = {"Llp0/d;", "Llp0/f;", "", "optimalSleepText", "optimalSleepTimeText", "Llp0/h;", "optimalSleepDirection", "", "startPixels", "endTimePixels", "", "isOptimalTextCentered", "totalTimePixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llp0/h;IIZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Llp0/h;", "()Llp0/h;", "I", "e", "f", "Z", "g", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24633d extends AbstractC24635f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optimalSleepText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String optimalSleepTimeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC24637h optimalSleepDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int startPixels;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int endTimePixels;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isOptimalTextCentered;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int totalTimePixels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24633d(String optimalSleepText, String optimalSleepTimeText, EnumC24637h optimalSleepDirection, int i13, int i14, boolean z4, int i15) {
        super(null);
        AbstractC22676k.m65750j(optimalSleepText, "optimalSleepText");
        AbstractC22676k.m65750j(optimalSleepTimeText, "optimalSleepTimeText");
        AbstractC22676k.m65750j(optimalSleepDirection, "optimalSleepDirection");
        this.optimalSleepText = optimalSleepText;
        this.optimalSleepTimeText = optimalSleepTimeText;
        this.optimalSleepDirection = optimalSleepDirection;
        this.startPixels = i13;
        this.endTimePixels = i14;
        this.isOptimalTextCentered = z4;
        this.totalTimePixels = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEndTimePixels() {
        return this.endTimePixels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC24637h getOptimalSleepDirection() {
        return this.optimalSleepDirection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getOptimalSleepText() {
        return this.optimalSleepText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getOptimalSleepTimeText() {
        return this.optimalSleepTimeText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartPixels() {
        return this.startPixels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24633d)) {
            return false;
        }
        C24633d c24633d = (C24633d) other;
        return AbstractC22676k.m65745e(this.optimalSleepText, c24633d.optimalSleepText) && AbstractC22676k.m65745e(this.optimalSleepTimeText, c24633d.optimalSleepTimeText) && this.optimalSleepDirection == c24633d.optimalSleepDirection && this.startPixels == c24633d.startPixels && this.endTimePixels == c24633d.endTimePixels && this.isOptimalTextCentered == c24633d.isOptimalTextCentered && this.totalTimePixels == c24633d.totalTimePixels;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTotalTimePixels() {
        return this.totalTimePixels;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsOptimalTextCentered() {
        return this.isOptimalTextCentered;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalTimePixels) + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.endTimePixels, AbstractC11266d.m30448b(this.startPixels, (this.optimalSleepDirection.hashCode() + AbstractC11266d.m30450d(this.optimalSleepText.hashCode() * 31, 31, this.optimalSleepTimeText)) * 31, 31), 31), 31, this.isOptimalTextCentered);
    }

    public String toString() {
        String str = this.optimalSleepText;
        String str2 = this.optimalSleepTimeText;
        EnumC24637h enumC24637h = this.optimalSleepDirection;
        int i13 = this.startPixels;
        int i14 = this.endTimePixels;
        boolean z4 = this.isOptimalTextCentered;
        int i15 = this.totalTimePixels;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FitsPartiallyInWindow(optimalSleepText=", str, ", optimalSleepTimeText=", str2, ", optimalSleepDirection=");
        sbM32001t.append(enumC24637h);
        sbM32001t.append(", startPixels=");
        sbM32001t.append(i13);
        sbM32001t.append(", endTimePixels=");
        AbstractC13673n.m38573t(i14, ", isOptimalTextCentered=", ", totalTimePixels=", sbM32001t, z4);
        return AbstractC18489d0.m53371l(sbM32001t, i15, ")");
    }
}
