package o42;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: o42.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, m65681d2 = {"Lo42/n;", "", "", "titleRes", "leftIcon", "leftIconContentDescriptionRes", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C27534n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int titleRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int leftIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int leftIconContentDescriptionRes;

    public C27534n(int i13, int i14, int i15) {
        this.titleRes = i13;
        this.leftIcon = i14;
        this.leftIconContentDescriptionRes = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeftIconContentDescriptionRes() {
        return this.leftIconContentDescriptionRes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27534n)) {
            return false;
        }
        C27534n c27534n = (C27534n) other;
        return this.titleRes == c27534n.titleRes && this.leftIcon == c27534n.leftIcon && this.leftIconContentDescriptionRes == c27534n.leftIconContentDescriptionRes;
    }

    public int hashCode() {
        return Integer.hashCode(this.leftIconContentDescriptionRes) + AbstractC11266d.m30448b(this.leftIcon, Integer.hashCode(this.titleRes) * 31, 31);
    }

    public String toString() {
        int i13 = this.titleRes;
        int i14 = this.leftIcon;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "ToolbarConfig(titleRes=", ", leftIcon=", ", leftIconContentDescriptionRes="), this.leftIconContentDescriptionRes, ")");
    }
}
