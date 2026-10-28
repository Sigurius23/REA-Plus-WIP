package s50;

import hy0.EnumC17727b2;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s50.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ls50/e;", "", "", "label", "value", "Lhy0/b2;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhy0/b2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lhy0/b2;", "()Lhy0/b2;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32203e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17727b2 style;

    public C32203e(String label, String value, EnumC17727b2 enumC17727b2) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.label = label;
        this.value = value;
        this.style = enumC17727b2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17727b2 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32203e)) {
            return false;
        }
        C32203e c32203e = (C32203e) other;
        return AbstractC22676k.m65745e(this.label, c32203e.label) && AbstractC22676k.m65745e(this.value, c32203e.value) && this.style == c32203e.style;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.value);
        EnumC17727b2 enumC17727b2 = this.style;
        return iM30450d + (enumC17727b2 == null ? 0 : enumC17727b2.hashCode());
    }

    public String toString() {
        String str = this.label;
        String str2 = this.value;
        EnumC17727b2 enumC17727b2 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementReadingViewState(label=", str, ", value=", str2, ", style=");
        sbM32001t.append(enumC17727b2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
