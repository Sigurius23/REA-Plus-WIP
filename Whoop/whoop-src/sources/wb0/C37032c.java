package wb0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lwb0/c;", "", "", "value", "", "valueText", "<init>", "(DLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37032c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String valueText;

    public C37032c(double d3, String valueText) {
        AbstractC22676k.m65750j(valueText, "valueText");
        this.value = d3;
        this.valueText = valueText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValueText() {
        return this.valueText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37032c)) {
            return false;
        }
        C37032c c37032c = (C37032c) other;
        return Double.compare(this.value, c37032c.value) == 0 && AbstractC22676k.m65745e(this.valueText, c37032c.valueText);
    }

    public int hashCode() {
        return this.valueText.hashCode() + (Double.hashCode(this.value) * 31);
    }

    public String toString() {
        return "CategoricalMappingState(value=" + this.value + ", valueText=" + this.valueText + ")";
    }
}
