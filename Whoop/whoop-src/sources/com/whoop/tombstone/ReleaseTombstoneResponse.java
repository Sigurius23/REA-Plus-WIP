package com.whoop.tombstone;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010\u001d¨\u00066"}, m65681d2 = {"Lcom/whoop/tombstone/ReleaseTombstoneResponse;", "", "", "versionCode", "", "versionName", "releaseName", "", "hardTombstone", "softTombstone", "releasedAt", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$tombstone_release", "(Lcom/whoop/tombstone/ReleaseTombstoneResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/whoop/tombstone/ReleaseTombstoneResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getVersionCode", "Ljava/lang/String;", "getVersionName", "getReleaseName", "Z", "getHardTombstone", "getSoftTombstone", "getReleasedAt", "Companion", "$serializer", "a", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReleaseTombstoneResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean hardTombstone;
    private final String releaseName;
    private final String releasedAt;
    private final boolean softTombstone;
    private final int versionCode;
    private final String versionName;

    /* JADX INFO: renamed from: com.whoop.tombstone.ReleaseTombstoneResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/tombstone/ReleaseTombstoneResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/tombstone/ReleaseTombstoneResponse;", "serializer", "()Lwc3/c;", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReleaseTombstoneResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReleaseTombstoneResponse(int i13, int i14, String str, String str2, boolean z4, boolean z13, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ReleaseTombstoneResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.versionCode = i14;
        this.versionName = str;
        this.releaseName = str2;
        this.hardTombstone = z4;
        this.softTombstone = z13;
        this.releasedAt = str3;
    }

    public static /* synthetic */ ReleaseTombstoneResponse copy$default(ReleaseTombstoneResponse releaseTombstoneResponse, int i13, String str, String str2, boolean z4, boolean z13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = releaseTombstoneResponse.versionCode;
        }
        if ((i14 & 2) != 0) {
            str = releaseTombstoneResponse.versionName;
        }
        if ((i14 & 4) != 0) {
            str2 = releaseTombstoneResponse.releaseName;
        }
        if ((i14 & 8) != 0) {
            z4 = releaseTombstoneResponse.hardTombstone;
        }
        if ((i14 & 16) != 0) {
            z13 = releaseTombstoneResponse.softTombstone;
        }
        if ((i14 & 32) != 0) {
            str3 = releaseTombstoneResponse.releasedAt;
        }
        boolean z14 = z13;
        String str4 = str3;
        return releaseTombstoneResponse.copy(i13, str, str2, z4, z14, str4);
    }

    public static final /* synthetic */ void write$Self$tombstone_release(ReleaseTombstoneResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.versionCode);
        output.encodeStringElement(serialDesc, 1, self.versionName);
        output.encodeStringElement(serialDesc, 2, self.releaseName);
        output.encodeBooleanElement(serialDesc, 3, self.hardTombstone);
        output.encodeBooleanElement(serialDesc, 4, self.softTombstone);
        output.encodeStringElement(serialDesc, 5, self.releasedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReleaseName() {
        return this.releaseName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHardTombstone() {
        return this.hardTombstone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSoftTombstone() {
        return this.softTombstone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReleasedAt() {
        return this.releasedAt;
    }

    public final ReleaseTombstoneResponse copy(int versionCode, String versionName, String releaseName, boolean hardTombstone, boolean softTombstone, String releasedAt) {
        AbstractC22676k.m65750j(versionName, "versionName");
        AbstractC22676k.m65750j(releaseName, "releaseName");
        AbstractC22676k.m65750j(releasedAt, "releasedAt");
        return new ReleaseTombstoneResponse(versionCode, versionName, releaseName, hardTombstone, softTombstone, releasedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReleaseTombstoneResponse)) {
            return false;
        }
        ReleaseTombstoneResponse releaseTombstoneResponse = (ReleaseTombstoneResponse) other;
        return this.versionCode == releaseTombstoneResponse.versionCode && AbstractC22676k.m65745e(this.versionName, releaseTombstoneResponse.versionName) && AbstractC22676k.m65745e(this.releaseName, releaseTombstoneResponse.releaseName) && this.hardTombstone == releaseTombstoneResponse.hardTombstone && this.softTombstone == releaseTombstoneResponse.softTombstone && AbstractC22676k.m65745e(this.releasedAt, releaseTombstoneResponse.releasedAt);
    }

    public final boolean getHardTombstone() {
        return this.hardTombstone;
    }

    public final String getReleaseName() {
        return this.releaseName;
    }

    public final String getReleasedAt() {
        return this.releasedAt;
    }

    public final boolean getSoftTombstone() {
        return this.softTombstone;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
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
        String str3 = this.releasedAt;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ReleaseTombstoneResponse(versionCode=", ", versionName=", str, ", releaseName=");
        AbstractC38963t7.m124390t(sbM53373n, str2, ", hardTombstone=", z4, ", softTombstone=");
        return AbstractC21702c.m61139j(sbM53373n, z13, ", releasedAt=", str3, ")");
    }

    public ReleaseTombstoneResponse(int i13, String versionName, String releaseName, boolean z4, boolean z13, String releasedAt) {
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
}
