package e81;

import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e81.h0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Le81/h0;", "", "Li2/x;", "color", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12831h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long color;

    public /* synthetic */ C12831h0(long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C12831h0) && C17919x.m51542d(this.color, ((C12831h0) other).color);
    }

    public int hashCode() {
        long j7 = this.color;
        int i13 = C17919x.f69638o;
        return Long.hashCode(j7);
    }

    public String toString() {
        return AbstractC11895b.m31996o("SliceData(color=", C17919x.m51548j(this.color), ")");
    }

    private C12831h0(long j7) {
        this.color = j7;
    }
}
