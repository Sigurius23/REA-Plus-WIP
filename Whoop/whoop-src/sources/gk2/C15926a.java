package gk2;

import ih0.AbstractC18489d0;
import java.time.Instant;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: gk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0015\u0010$¨\u0006%"}, m65681d2 = {"Lgk2/a;", "", "", "versionCode", "", "versionName", "releaseName", "", "hardTombstone", "softTombstone", "Ljava/time/Instant;", "releasedAt", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZZLjava/time/Instant;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getVersionName", "c", "getReleaseName", "d", "Z", "getHardTombstone", "()Z", "e", "getSoftTombstone", "f", "Ljava/time/Instant;", "()Ljava/time/Instant;", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15926a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int versionCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String versionName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String releaseName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean hardTombstone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean softTombstone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Instant releasedAt;

    public C15926a(int i13, String versionName, String releaseName, boolean z4, boolean z13, Instant releasedAt) {
        AbstractC22676k.m65750j(versionName, "versionName");
        AbstractC22676k.m65750j(releaseName, "releaseName");
        AbstractC22676k.m65750j(releasedAt, "releasedAt");
        this.versionCode = i13;
        this.versionName = versionName;
        this.releaseName = releaseName;
        this.hardTombstone = z4;
        this.softTombstone = z13;
        this.releasedAt = releasedAt;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Instant getReleasedAt() {
        return this.releasedAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15926a)) {
            return false;
        }
        C15926a c15926a = (C15926a) other;
        return this.versionCode == c15926a.versionCode && AbstractC22676k.m65745e(this.versionName, c15926a.versionName) && AbstractC22676k.m65745e(this.releaseName, c15926a.releaseName) && this.hardTombstone == c15926a.hardTombstone && this.softTombstone == c15926a.softTombstone && AbstractC22676k.m65745e(this.releasedAt, c15926a.releasedAt);
    }

    public int hashCode() {
        return this.releasedAt.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.versionCode) * 31, 31, this.versionName), 31, this.releaseName), 31, this.hardTombstone), 31, this.softTombstone);
    }

    public String toString() {
        int i13 = this.versionCode;
        String str = this.versionName;
        String str2 = this.releaseName;
        boolean z4 = this.hardTombstone;
        boolean z13 = this.softTombstone;
        Instant instant = this.releasedAt;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "AndroidRelease(versionCode=", ", versionName=", str, ", releaseName=");
        AbstractC38963t7.m124390t(sbM53373n, str2, ", hardTombstone=", z4, ", softTombstone=");
        sbM53373n.append(z13);
        sbM53373n.append(", releasedAt=");
        sbM53373n.append(instant);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
