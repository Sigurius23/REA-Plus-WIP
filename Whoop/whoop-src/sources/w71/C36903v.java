package w71;

import e93.AbstractC12889b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: w71.v */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\r\u0010\u0014¨\u0006\u0018"}, m65681d2 = {"Lw71/v;", "", "", "increment", "min", "max", "preSetNumber", "<init>", "(IIILjava/lang/Integer;)V", "", "userSelectedValue", "d", "(F)I", "a", "I", "getIncrement", "()I", "b", "F", "c", "()F", "rangeMin", "rangeMax", "modifiedPreSetNumber", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36903v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int increment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float rangeMin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float rangeMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float modifiedPreSetNumber;

    public C36903v(int i13, int i14, int i15, Integer num) {
        this.increment = i13;
        this.rangeMin = i14 / i13;
        this.rangeMax = i15 / i13;
        this.modifiedPreSetNumber = num != null ? num.intValue() / i13 : 0.0f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getModifiedPreSetNumber() {
        return this.modifiedPreSetNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getRangeMax() {
        return this.rangeMax;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getRangeMin() {
        return this.rangeMin;
    }

    /* JADX INFO: renamed from: d */
    public final int m118499d(float userSelectedValue) {
        return AbstractC12889b.m36258X(userSelectedValue) * this.increment;
    }
}
