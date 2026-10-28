package p745y81;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y81.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Ly81/a;", "", "Li2/x;", "accent", "active", "affirmative", "negative", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39328a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long accent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long affirmative;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long negative;

    public /* synthetic */ C39328a(long j7, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, j14, j15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAccent() {
        return this.accent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAffirmative() {
        return this.affirmative;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNegative() {
        return this.negative;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39328a)) {
            return false;
        }
        C39328a c39328a = (C39328a) other;
        return C17919x.m51542d(this.accent, c39328a.accent) && C17919x.m51542d(this.active, c39328a.active) && C17919x.m51542d(this.affirmative, c39328a.affirmative) && C17919x.m51542d(this.negative, c39328a.negative);
    }

    public int hashCode() {
        long j7 = this.accent;
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.negative) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(j7) * 31, this.active, 31), this.affirmative, 31);
    }

    public String toString() {
        String strM51548j = C17919x.m51548j(this.accent);
        String strM51548j2 = C17919x.m51548j(this.active);
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("SemanticColors(accent=", strM51548j, ", active=", strM51548j2, ", affirmative="), C17919x.m51548j(this.affirmative), ", negative=", C17919x.m51548j(this.negative), ")");
    }

    private C39328a(long j7, long j13, long j14, long j15) {
        this.accent = j7;
        this.active = j13;
        this.affirmative = j14;
        this.negative = j15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C39328a(long j7, long j13, long j14, long j15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        long j16;
        long j17;
        long j18;
        long j19;
        if ((i13 & 1) != 0) {
            int i14 = C17919x.f69638o;
            j16 = C17919x.f69637n;
        } else {
            j16 = j7;
        }
        if ((i13 & 2) != 0) {
            int i15 = C17919x.f69638o;
            j17 = C17919x.f69637n;
        } else {
            j17 = j13;
        }
        if ((i13 & 4) != 0) {
            int i16 = C17919x.f69638o;
            j18 = C17919x.f69637n;
        } else {
            j18 = j14;
        }
        if ((i13 & 8) != 0) {
            int i17 = C17919x.f69638o;
            j19 = C17919x.f69637n;
        } else {
            j19 = j15;
        }
        this(j16, j17, j18, j19, null);
    }
}
