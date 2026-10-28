package r41;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r41.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lr41/d;", "", "", "newTimeText", "", "setIndex", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30920d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String newTimeText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int setIndex;

    public C30920d(String newTimeText, int i13) {
        AbstractC22676k.m65750j(newTimeText, "newTimeText");
        this.newTimeText = newTimeText;
        this.setIndex = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNewTimeText() {
        return this.newTimeText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSetIndex() {
        return this.setIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30920d)) {
            return false;
        }
        C30920d c30920d = (C30920d) other;
        return AbstractC22676k.m65745e(this.newTimeText, c30920d.newTimeText) && this.setIndex == c30920d.setIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.setIndex) + (this.newTimeText.hashCode() * 31);
    }

    public String toString() {
        return AbstractC11895b.m31993l(this.setIndex, "TimeChanged(newTimeText=", this.newTimeText, ", setIndex=", ")");
    }
}
