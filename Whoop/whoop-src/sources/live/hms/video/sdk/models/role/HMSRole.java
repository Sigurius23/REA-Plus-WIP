package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JI\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, m65681d2 = {"Llive/hms/video/sdk/models/role/HMSRole;", "", "name", "", "publishParams", "Llive/hms/video/sdk/models/role/PublishParams;", "subscribeParams", "Llive/hms/video/sdk/models/role/SubscribeParams;", "permission", "Llive/hms/video/sdk/models/role/PermissionsParams;", "priority", "", "maxPeerCount", "", "<init>", "(Ljava/lang/String;Llive/hms/video/sdk/models/role/PublishParams;Llive/hms/video/sdk/models/role/SubscribeParams;Llive/hms/video/sdk/models/role/PermissionsParams;IJ)V", "getName", "()Ljava/lang/String;", "getPublishParams", "()Llive/hms/video/sdk/models/role/PublishParams;", "setPublishParams", "(Llive/hms/video/sdk/models/role/PublishParams;)V", "getSubscribeParams", "()Llive/hms/video/sdk/models/role/SubscribeParams;", "getPermission", "()Llive/hms/video/sdk/models/role/PermissionsParams;", "getPriority", "()I", "getMaxPeerCount", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRole {

    @SerializedName("maxPeerCount")
    private final long maxPeerCount;

    @SerializedName("name")
    private final String name;

    @SerializedName("permissions")
    private final PermissionsParams permission;

    @SerializedName("priority")
    private final int priority;

    @SerializedName("publishParams")
    private PublishParams publishParams;

    @SerializedName("subscribeParams")
    private final SubscribeParams subscribeParams;

    public HMSRole(String name, PublishParams publishParams, SubscribeParams subscribeParams, PermissionsParams permission, int i13, long j7) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(permission, "permission");
        this.name = name;
        this.publishParams = publishParams;
        this.subscribeParams = subscribeParams;
        this.permission = permission;
        this.priority = i13;
        this.maxPeerCount = j7;
    }

    public static /* synthetic */ HMSRole copy$default(HMSRole hMSRole, String str, PublishParams publishParams, SubscribeParams subscribeParams, PermissionsParams permissionsParams, int i13, long j7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = hMSRole.name;
        }
        if ((i14 & 2) != 0) {
            publishParams = hMSRole.publishParams;
        }
        if ((i14 & 4) != 0) {
            subscribeParams = hMSRole.subscribeParams;
        }
        if ((i14 & 8) != 0) {
            permissionsParams = hMSRole.permission;
        }
        if ((i14 & 16) != 0) {
            i13 = hMSRole.priority;
        }
        if ((i14 & 32) != 0) {
            j7 = hMSRole.maxPeerCount;
        }
        long j13 = j7;
        int i15 = i13;
        SubscribeParams subscribeParams2 = subscribeParams;
        return hMSRole.copy(str, publishParams, subscribeParams2, permissionsParams, i15, j13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PublishParams getPublishParams() {
        return this.publishParams;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubscribeParams getSubscribeParams() {
        return this.subscribeParams;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PermissionsParams getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getMaxPeerCount() {
        return this.maxPeerCount;
    }

    public final HMSRole copy(String name, PublishParams publishParams, SubscribeParams subscribeParams, PermissionsParams permission, int priority, long maxPeerCount) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(permission, "permission");
        return new HMSRole(name, publishParams, subscribeParams, permission, priority, maxPeerCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRole)) {
            return false;
        }
        HMSRole hMSRole = (HMSRole) other;
        return AbstractC22676k.m65745e(this.name, hMSRole.name) && AbstractC22676k.m65745e(this.publishParams, hMSRole.publishParams) && AbstractC22676k.m65745e(this.subscribeParams, hMSRole.subscribeParams) && AbstractC22676k.m65745e(this.permission, hMSRole.permission) && this.priority == hMSRole.priority && this.maxPeerCount == hMSRole.maxPeerCount;
    }

    public final long getMaxPeerCount() {
        return this.maxPeerCount;
    }

    public final String getName() {
        return this.name;
    }

    public final PermissionsParams getPermission() {
        return this.permission;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final PublishParams getPublishParams() {
        return this.publishParams;
    }

    public final SubscribeParams getSubscribeParams() {
        return this.subscribeParams;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        PublishParams publishParams = this.publishParams;
        int iHashCode2 = (iHashCode + (publishParams == null ? 0 : publishParams.hashCode())) * 31;
        SubscribeParams subscribeParams = this.subscribeParams;
        return Long.hashCode(this.maxPeerCount) + AbstractC11266d.m30448b(this.priority, (this.permission.hashCode() + ((iHashCode2 + (subscribeParams != null ? subscribeParams.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final void setPublishParams(PublishParams publishParams) {
        this.publishParams = publishParams;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSRole(name=");
        sb4.append(this.name);
        sb4.append(", publishParams=");
        sb4.append(this.publishParams);
        sb4.append(", subscribeParams=");
        sb4.append(this.subscribeParams);
        sb4.append(", permission=");
        sb4.append(this.permission);
        sb4.append(", priority=");
        sb4.append(this.priority);
        sb4.append(", maxPeerCount=");
        return AbstractC2875y.m8302o(sb4, this.maxPeerCount, ')');
    }

    public /* synthetic */ HMSRole(String str, PublishParams publishParams, SubscribeParams subscribeParams, PermissionsParams permissionsParams, int i13, long j7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        PermissionsParams permissionsParams2;
        if ((i14 & 8) != 0) {
            permissionsParams2 = new PermissionsParams(false, false, false, false, false, false, false, false, false, false, null, 2047, null);
        } else {
            permissionsParams2 = permissionsParams;
        }
        this(str, publishParams, subscribeParams, permissionsParams2, i13, j7);
    }
}
