package p90;

import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p90.m */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lp90/m;", "", "Lkd1/o;", "imageSource", "", "accessibilityName", "<init>", "(Lkd1/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29005m {

    /* JADX INFO: renamed from: c */
    public static final int f117366c = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String accessibilityName;

    public C29005m(AbstractC22403o imageSource, String accessibilityName) {
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(accessibilityName, "accessibilityName");
        this.imageSource = imageSource;
        this.accessibilityName = accessibilityName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessibilityName() {
        return this.accessibilityName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29005m)) {
            return false;
        }
        C29005m c29005m = (C29005m) other;
        return AbstractC22676k.m65745e(this.imageSource, c29005m.imageSource) && AbstractC22676k.m65745e(this.accessibilityName, c29005m.accessibilityName);
    }

    public int hashCode() {
        return this.accessibilityName.hashCode() + (this.imageSource.hashCode() * 31);
    }

    public String toString() {
        return "PaymentType(imageSource=" + this.imageSource + ", accessibilityName=" + this.accessibilityName + ")";
    }
}
