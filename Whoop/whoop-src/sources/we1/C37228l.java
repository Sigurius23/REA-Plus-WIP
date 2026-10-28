package we1;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: we1.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lwe1/l;", "", "", "id", "", "membershipType", "", "lastUpdated", "<init>", "(ILjava/lang/String;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "J", "()J", "d", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37228l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String membershipType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastUpdated;

    public C37228l(int i13, String membershipType, long j7) {
        AbstractC22676k.m65750j(membershipType, "membershipType");
        this.id = i13;
        this.membershipType = membershipType;
        this.lastUpdated = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMembershipType() {
        return this.membershipType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37228l)) {
            return false;
        }
        C37228l c37228l = (C37228l) other;
        return this.id == c37228l.id && AbstractC22676k.m65745e(this.membershipType, c37228l.membershipType) && this.lastUpdated == c37228l.lastUpdated;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdated) + AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.membershipType);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.lastUpdated, ")", AbstractC18489d0.m53373n(this.id, "MembershipTypeEntity(id=", ", membershipType=", this.membershipType, ", lastUpdated="));
    }

    public /* synthetic */ C37228l(int i13, String str, long j7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, str, j7);
    }
}
