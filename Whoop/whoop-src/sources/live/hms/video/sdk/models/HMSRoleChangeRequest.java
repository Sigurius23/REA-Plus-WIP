package live.hms.video.sdk.models;

import live.hms.video.sdk.models.role.HMSRole;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0012\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0013J)\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSRoleChangeRequest;", "", "requestedBy", "Llive/hms/video/sdk/models/HMSPeer;", "suggestedRole", "Llive/hms/video/sdk/models/role/HMSRole;", "token", "", "<init>", "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V", "getRequestedBy", "()Llive/hms/video/sdk/models/HMSPeer;", "getSuggestedRole", "()Llive/hms/video/sdk/models/role/HMSRole;", "getToken$lib_release", "()Ljava/lang/String;", "component1", "component2", "component3", "component3$lib_release", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRoleChangeRequest {
    private final HMSPeer requestedBy;
    private final HMSRole suggestedRole;
    private final String token;

    public HMSRoleChangeRequest(HMSPeer hMSPeer, HMSRole suggestedRole, String token) {
        AbstractC22676k.m65750j(suggestedRole, "suggestedRole");
        AbstractC22676k.m65750j(token, "token");
        this.requestedBy = hMSPeer;
        this.suggestedRole = suggestedRole;
        this.token = token;
    }

    public static /* synthetic */ HMSRoleChangeRequest copy$default(HMSRoleChangeRequest hMSRoleChangeRequest, HMSPeer hMSPeer, HMSRole hMSRole, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSPeer = hMSRoleChangeRequest.requestedBy;
        }
        if ((i13 & 2) != 0) {
            hMSRole = hMSRoleChangeRequest.suggestedRole;
        }
        if ((i13 & 4) != 0) {
            str = hMSRoleChangeRequest.token;
        }
        return hMSRoleChangeRequest.copy(hMSPeer, hMSRole, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSPeer getRequestedBy() {
        return this.requestedBy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSRole getSuggestedRole() {
        return this.suggestedRole;
    }

    /* JADX INFO: renamed from: component3$lib_release, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final HMSRoleChangeRequest copy(HMSPeer requestedBy, HMSRole suggestedRole, String token) {
        AbstractC22676k.m65750j(suggestedRole, "suggestedRole");
        AbstractC22676k.m65750j(token, "token");
        return new HMSRoleChangeRequest(requestedBy, suggestedRole, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRoleChangeRequest)) {
            return false;
        }
        HMSRoleChangeRequest hMSRoleChangeRequest = (HMSRoleChangeRequest) other;
        return AbstractC22676k.m65745e(this.requestedBy, hMSRoleChangeRequest.requestedBy) && AbstractC22676k.m65745e(this.suggestedRole, hMSRoleChangeRequest.suggestedRole) && AbstractC22676k.m65745e(this.token, hMSRoleChangeRequest.token);
    }

    public final HMSPeer getRequestedBy() {
        return this.requestedBy;
    }

    public final HMSRole getSuggestedRole() {
        return this.suggestedRole;
    }

    public final String getToken$lib_release() {
        return this.token;
    }

    public int hashCode() {
        HMSPeer hMSPeer = this.requestedBy;
        return this.token.hashCode() + ((this.suggestedRole.hashCode() + ((hMSPeer == null ? 0 : hMSPeer.hashCode()) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSRoleChangeRequest(requestedBy=");
        sb4.append(this.requestedBy);
        sb4.append(", suggestedRole=");
        sb4.append(this.suggestedRole);
        sb4.append(", token=");
        return AbstractC25012a.m73377j(sb4, this.token, ')');
    }
}
