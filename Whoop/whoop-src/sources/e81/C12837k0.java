package e81;

import com.whoop.navigation.C9598e;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e81.k0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Le81/k0;", "", "Lhy0/c2;", "trend", "", "value", "<init>", "(Lhy0/c2;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhy0/c2;", "()Lhy0/c2;", "b", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12837k0 {

    /* JADX INFO: renamed from: c */
    public static final int f44006c = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String value;

    public C12837k0(C17731c2 trend, String value) {
        AbstractC22676k.m65750j(trend, "trend");
        AbstractC22676k.m65750j(value, "value");
        this.trend = trend;
        this.value = value;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12837k0)) {
            return false;
        }
        C12837k0 c12837k0 = (C12837k0) other;
        return AbstractC22676k.m65745e(this.trend, c12837k0.trend) && AbstractC22676k.m65745e(this.value, c12837k0.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.trend.hashCode() * 31);
    }

    public String toString() {
        return "TrendCountViewState(trend=" + this.trend + ", value=" + this.value + ")";
    }
}
