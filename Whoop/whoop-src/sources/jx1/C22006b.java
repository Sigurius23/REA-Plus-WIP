package jx1;

import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jx1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ljx1/b;", "", "", "stop", "Li2/x;", "color", "<init>", "(FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "J", "()J", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22006b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float stop;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long color;

    public /* synthetic */ C22006b(float f13, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, j7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getStop() {
        return this.stop;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22006b)) {
            return false;
        }
        C22006b c22006b = (C22006b) other;
        return Float.compare(this.stop, c22006b.stop) == 0 && C17919x.m51542d(this.color, c22006b.color);
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.stop) * 31;
        long j7 = this.color;
        int i13 = C17919x.f69638o;
        return Long.hashCode(j7) + iHashCode;
    }

    public String toString() {
        return "BackgroundColorStop(stop=" + this.stop + ", color=" + C17919x.m51548j(this.color) + ")";
    }

    private C22006b(float f13, long j7) {
        this.stop = f13;
        this.color = j7;
    }
}
