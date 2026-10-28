package ba2;

import java.util.Arrays;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ba2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006\u0017"}, m65681d2 = {"Lba2/a;", "", "", "nanoAmps", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getNanoAmps", "", "b", "()F", "microAmps", "displayValue", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2900a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int nanoAmps;

    public C2900a(int i13) {
        this.nanoAmps = i13;
    }

    /* JADX INFO: renamed from: a */
    public final String m8495a() {
        return String.format("%.3f μA", Arrays.copyOf(new Object[]{Float.valueOf(m8496b())}, 1));
    }

    /* JADX INFO: renamed from: b */
    public final float m8496b() {
        return this.nanoAmps / 1000.0f;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C2900a) && this.nanoAmps == ((C2900a) other).nanoAmps;
    }

    public int hashCode() {
        return Integer.hashCode(this.nanoAmps);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.nanoAmps, "BiasOffset(nanoAmps=", ")");
    }
}
