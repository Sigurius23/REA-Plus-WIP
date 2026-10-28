package we1;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: we1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lwe1/e;", "", "", "id", "", "name", "", "enabled", "", "lastUpdated", "<init>", "(ILjava/lang/String;ZJ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "d", "c", "Z", "()Z", "J", "()J", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37221e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long lastUpdated;

    public C37221e(int i13, String name, boolean z4, long j7) {
        AbstractC22676k.m65750j(name, "name");
        this.id = i13;
        this.name = name;
        this.enabled = z4;
        this.lastUpdated = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37221e)) {
            return false;
        }
        C37221e c37221e = (C37221e) other;
        return this.id == c37221e.id && AbstractC22676k.m65745e(this.name, c37221e.name) && this.enabled == c37221e.enabled && this.lastUpdated == c37221e.lastUpdated;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdated) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.enabled);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.name;
        boolean z4 = this.enabled;
        long j7 = this.lastUpdated;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "EntitlementEntity(id=", ", name=", str, ", enabled=");
        sbM53373n.append(z4);
        sbM53373n.append(", lastUpdated=");
        sbM53373n.append(j7);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
