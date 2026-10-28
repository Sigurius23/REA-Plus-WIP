package lp0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lp0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, m65681d2 = {"Llp0/c;", "Llp0/f;", "", "optimalSleepText", "optimalSleepTimeText", "Llp0/h;", "optimalSleepDirection", "", "textPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llp0/h;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Llp0/h;", "()Llp0/h;", "d", "I", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24632c extends AbstractC24635f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optimalSleepText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String optimalSleepTimeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC24637h optimalSleepDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int textPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24632c(String optimalSleepText, String optimalSleepTimeText, EnumC24637h optimalSleepDirection, int i13) {
        super(null);
        AbstractC22676k.m65750j(optimalSleepText, "optimalSleepText");
        AbstractC22676k.m65750j(optimalSleepTimeText, "optimalSleepTimeText");
        AbstractC22676k.m65750j(optimalSleepDirection, "optimalSleepDirection");
        this.optimalSleepText = optimalSleepText;
        this.optimalSleepTimeText = optimalSleepTimeText;
        this.optimalSleepDirection = optimalSleepDirection;
        this.textPosition = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC24637h getOptimalSleepDirection() {
        return this.optimalSleepDirection;
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
    public final int getTextPosition() {
        return this.textPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24632c)) {
            return false;
        }
        C24632c c24632c = (C24632c) other;
        return AbstractC22676k.m65745e(this.optimalSleepText, c24632c.optimalSleepText) && AbstractC22676k.m65745e(this.optimalSleepTimeText, c24632c.optimalSleepTimeText) && this.optimalSleepDirection == c24632c.optimalSleepDirection && this.textPosition == c24632c.textPosition;
    }

    public int hashCode() {
        return Integer.hashCode(this.textPosition) + ((this.optimalSleepDirection.hashCode() + AbstractC11266d.m30450d(this.optimalSleepText.hashCode() * 31, 31, this.optimalSleepTimeText)) * 31);
    }

    public String toString() {
        String str = this.optimalSleepText;
        String str2 = this.optimalSleepTimeText;
        EnumC24637h enumC24637h = this.optimalSleepDirection;
        int i13 = this.textPosition;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FitsOutOfWindow(optimalSleepText=", str, ", optimalSleepTimeText=", str2, ", optimalSleepDirection=");
        sbM32001t.append(enumC24637h);
        sbM32001t.append(", textPosition=");
        sbM32001t.append(i13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
