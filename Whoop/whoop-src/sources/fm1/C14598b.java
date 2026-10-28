package fm1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fm1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lfm1/b;", "", "", "lowerEndpoint", "", "lowerBoundType", "upperEndpoint", "upperBoundType", "<init>", "(JLjava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "getLowerBoundType", "c", "d", "getUpperBoundType", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14598b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long lowerEndpoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String lowerBoundType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long upperEndpoint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String upperBoundType;

    public C14598b(long j7, String lowerBoundType, long j13, String upperBoundType) {
        AbstractC22676k.m65750j(lowerBoundType, "lowerBoundType");
        AbstractC22676k.m65750j(upperBoundType, "upperBoundType");
        this.lowerEndpoint = j7;
        this.lowerBoundType = lowerBoundType;
        this.upperEndpoint = j13;
        this.upperBoundType = upperBoundType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14598b)) {
            return false;
        }
        C14598b c14598b = (C14598b) other;
        return this.lowerEndpoint == c14598b.lowerEndpoint && AbstractC22676k.m65745e(this.lowerBoundType, c14598b.lowerBoundType) && this.upperEndpoint == c14598b.upperEndpoint && AbstractC22676k.m65745e(this.upperBoundType, c14598b.upperBoundType);
    }

    public int hashCode() {
        return this.upperBoundType.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30450d(Long.hashCode(this.lowerEndpoint) * 31, 31, this.lowerBoundType), this.upperEndpoint, 31);
    }

    public String toString() {
        long j7 = this.lowerEndpoint;
        String str = this.lowerBoundType;
        long j13 = this.upperEndpoint;
        String str2 = this.upperBoundType;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("CycleDuring(lowerEndpoint=", ", lowerBoundType=", j7, str);
        AbstractC2875y.m8285A(sbM114685m, ", upperEndpoint=", j13, ", upperBoundType=");
        return AbstractC25012a.m73376i(str2, ")", sbM114685m);
    }
}
