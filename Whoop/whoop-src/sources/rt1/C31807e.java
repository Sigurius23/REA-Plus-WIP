package rt1;

import e93.AbstractC12889b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rt1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lrt1/e;", "", "", "remainingPercentage", "", "remainingTime", "<init>", "(FLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Ljava/lang/String;", "c", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31807e {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float remainingPercentage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String remainingTime;

    /* JADX INFO: renamed from: rt1.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lrt1/e$a;", "", "<init>", "()V", "", "percentage", "Lrt1/e;", "a", "(S)Lrt1/e;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C31807e m98810a(short percentage) {
            float f13 = 1.0f - (percentage / 100.0f);
            return new C31807e(f13, String.valueOf(AbstractC12889b.m36258X(30 * f13)));
        }

        private Companion() {
        }
    }

    public C31807e(float f13, String remainingTime) {
        AbstractC22676k.m65750j(remainingTime, "remainingTime");
        this.remainingPercentage = f13;
        this.remainingTime = remainingTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getRemainingPercentage() {
        return this.remainingPercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRemainingTime() {
        return this.remainingTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31807e)) {
            return false;
        }
        C31807e c31807e = (C31807e) other;
        return Float.compare(this.remainingPercentage, c31807e.remainingPercentage) == 0 && AbstractC22676k.m65745e(this.remainingTime, c31807e.remainingTime);
    }

    public int hashCode() {
        return this.remainingTime.hashCode() + (Float.hashCode(this.remainingPercentage) * 31);
    }

    public String toString() {
        return "LabradorReadingProgressViewState(remainingPercentage=" + this.remainingPercentage + ", remainingTime=" + this.remainingTime + ")";
    }
}
