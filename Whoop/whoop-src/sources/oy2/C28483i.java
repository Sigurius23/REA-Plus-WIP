package oy2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oy2.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, m65681d2 = {"Loy2/i;", "", "", "inputLabel", "", "min", "max", "minErrorText", "maxErrorText", "hint", "rowCount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "d", "f", "g", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28483i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String inputLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer max;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String minErrorText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String maxErrorText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String hint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int rowCount;

    public C28483i(String inputLabel, Integer num, Integer num2, String minErrorText, String maxErrorText, String hint, int i13) {
        AbstractC22676k.m65750j(inputLabel, "inputLabel");
        AbstractC22676k.m65750j(minErrorText, "minErrorText");
        AbstractC22676k.m65750j(maxErrorText, "maxErrorText");
        AbstractC22676k.m65750j(hint, "hint");
        this.inputLabel = inputLabel;
        this.min = num;
        this.max = num2;
        this.minErrorText = minErrorText;
        this.maxErrorText = maxErrorText;
        this.hint = hint;
        this.rowCount = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInputLabel() {
        return this.inputLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMaxErrorText() {
        return this.maxErrorText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getMin() {
        return this.min;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28483i)) {
            return false;
        }
        C28483i c28483i = (C28483i) other;
        return AbstractC22676k.m65745e(this.inputLabel, c28483i.inputLabel) && AbstractC22676k.m65745e(this.min, c28483i.min) && AbstractC22676k.m65745e(this.max, c28483i.max) && AbstractC22676k.m65745e(this.minErrorText, c28483i.minErrorText) && AbstractC22676k.m65745e(this.maxErrorText, c28483i.maxErrorText) && AbstractC22676k.m65745e(this.hint, c28483i.hint) && this.rowCount == c28483i.rowCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMinErrorText() {
        return this.minErrorText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRowCount() {
        return this.rowCount;
    }

    public int hashCode() {
        int iHashCode = this.inputLabel.hashCode() * 31;
        Integer num = this.min;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.max;
        return Integer.hashCode(this.rowCount) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.minErrorText), 31, this.maxErrorText), 31, this.hint);
    }

    public String toString() {
        String str = this.inputLabel;
        Integer num = this.min;
        Integer num2 = this.max;
        String str2 = this.minErrorText;
        String str3 = this.maxErrorText;
        String str4 = this.hint;
        int i13 = this.rowCount;
        StringBuilder sb4 = new StringBuilder("InputConfigDomainState(inputLabel=");
        sb4.append(str);
        sb4.append(", min=");
        sb4.append(num);
        sb4.append(", max=");
        AbstractC13673n.m38577x(num2, ", minErrorText=", str2, ", maxErrorText=", sb4);
        AbstractC11266d.m30444B(sb4, str3, ", hint=", str4, ", rowCount=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }

    public /* synthetic */ C28483i(String str, Integer num, Integer num2, String str2, String str3, String str4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? "" : str4, (i14 & 64) != 0 ? 1 : i13);
    }
}
