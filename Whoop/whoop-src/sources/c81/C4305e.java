package c81;

import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c81.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lc81/e;", "", "", "topValueDisplay", "bottomValueDisplay", "", "isCurrentValue", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4305e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String topValueDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String bottomValueDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isCurrentValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String style;

    public C4305e(String str, String str2, boolean z4, String style) {
        AbstractC22676k.m65750j(style, "style");
        this.topValueDisplay = str;
        this.bottomValueDisplay = str2;
        this.isCurrentValue = z4;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomValueDisplay() {
        return this.bottomValueDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTopValueDisplay() {
        return this.topValueDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4305e)) {
            return false;
        }
        C4305e c4305e = (C4305e) other;
        return AbstractC22676k.m65745e(this.topValueDisplay, c4305e.topValueDisplay) && AbstractC22676k.m65745e(this.bottomValueDisplay, c4305e.bottomValueDisplay) && this.isCurrentValue == c4305e.isCurrentValue && AbstractC22676k.m65745e(this.style, c4305e.style);
    }

    public int hashCode() {
        String str = this.topValueDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bottomValueDisplay;
        return this.style.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isCurrentValue);
    }

    public String toString() {
        String str = this.topValueDisplay;
        String str2 = this.bottomValueDisplay;
        return AbstractC21702c.m61139j(AbstractC11895b.m32001t("PaceOfAgingMeterTick(topValueDisplay=", str, ", bottomValueDisplay=", str2, ", isCurrentValue="), this.isCurrentValue, ", style=", this.style, ")");
    }
}
