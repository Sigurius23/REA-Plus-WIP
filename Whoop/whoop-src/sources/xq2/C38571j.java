package xq2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xq2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lxq2/j;", "", "Lxq2/m;", "left", "right", "<init>", "(Lxq2/m;Lxq2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxq2/m;", "()Lxq2/m;", "b", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38571j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38577m left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38577m right;

    public C38571j(C38577m left, C38577m right) {
        AbstractC22676k.m65750j(left, "left");
        AbstractC22676k.m65750j(right, "right");
        this.left = left;
        this.right = right;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C38577m getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C38577m getRight() {
        return this.right;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38571j)) {
            return false;
        }
        C38571j c38571j = (C38571j) other;
        return AbstractC22676k.m65745e(this.left, c38571j.left) && AbstractC22676k.m65745e(this.right, c38571j.right);
    }

    public int hashCode() {
        return this.right.hashCode() + (this.left.hashCode() * 31);
    }

    public String toString() {
        return "ComparisonFooterState(left=" + this.left + ", right=" + this.right + ")";
    }
}
