package hy0;

import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hy0.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lhy0/t;", "", "Li2/x;", "contentColor", "tintColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17788t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long tintColor;

    public /* synthetic */ C17788t(long j7, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17788t)) {
            return false;
        }
        C17788t c17788t = (C17788t) other;
        return C17919x.m51542d(this.contentColor, c17788t.contentColor) && C17919x.m51542d(this.tintColor, c17788t.tintColor);
    }

    public int hashCode() {
        long j7 = this.contentColor;
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.tintColor) + (Long.hashCode(j7) * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("GoalIndicatorColors(contentColor=", C17919x.m51548j(this.contentColor), ", tintColor=", C17919x.m51548j(this.tintColor), ")");
    }

    private C17788t(long j7, long j13) {
        this.contentColor = j7;
        this.tintColor = j13;
    }
}
