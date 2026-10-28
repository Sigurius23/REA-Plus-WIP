package g31;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: g31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lg31/d;", "Lm91/u;", "", "maximum", "numSelected", "", "stateUpdateValueKey", "<init>", "(IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15300d implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f57460d = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int maximum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int numSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String stateUpdateValueKey;

    public C15300d(int i13, int i14, String stateUpdateValueKey) {
        AbstractC22676k.m65750j(stateUpdateValueKey, "stateUpdateValueKey");
        this.maximum = i13;
        this.numSelected = i14;
        this.stateUpdateValueKey = stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNumSelected() {
        return this.numSelected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15300d)) {
            return false;
        }
        C15300d c15300d = (C15300d) other;
        return this.maximum == c15300d.maximum && this.numSelected == c15300d.numSelected && AbstractC22676k.m65745e(this.stateUpdateValueKey, c15300d.stateUpdateValueKey);
    }

    public int hashCode() {
        return this.stateUpdateValueKey.hashCode() + AbstractC11266d.m30448b(this.numSelected, Integer.hashCode(this.maximum) * 31, 31);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.stateUpdateValueKey, ")", AbstractC11266d.m30465s(this.maximum, this.numSelected, "RatingPickerState(maximum=", ", numSelected=", ", stateUpdateValueKey="));
    }
}
