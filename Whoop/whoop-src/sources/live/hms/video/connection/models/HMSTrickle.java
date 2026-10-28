package live.hms.video.connection.models;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/connection/models/HMSTrickle;", "", "candidate", "Llive/hms/video/connection/models/HMSIceCandidate;", "role", "Llive/hms/video/connection/models/HMSConnectionRole;", "sfuNodeId", "", "<init>", "(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)V", "getCandidate", "()Llive/hms/video/connection/models/HMSIceCandidate;", "getRole", "()Llive/hms/video/connection/models/HMSConnectionRole;", "getSfuNodeId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSTrickle {
    private final HMSIceCandidate candidate;
    private final HMSConnectionRole role;
    private final String sfuNodeId;

    public HMSTrickle(HMSIceCandidate candidate, HMSConnectionRole role, String str) {
        AbstractC22676k.m65750j(candidate, "candidate");
        AbstractC22676k.m65750j(role, "role");
        this.candidate = candidate;
        this.role = role;
        this.sfuNodeId = str;
    }

    public static /* synthetic */ HMSTrickle copy$default(HMSTrickle hMSTrickle, HMSIceCandidate hMSIceCandidate, HMSConnectionRole hMSConnectionRole, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSIceCandidate = hMSTrickle.candidate;
        }
        if ((i13 & 2) != 0) {
            hMSConnectionRole = hMSTrickle.role;
        }
        if ((i13 & 4) != 0) {
            str = hMSTrickle.sfuNodeId;
        }
        return hMSTrickle.copy(hMSIceCandidate, hMSConnectionRole, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSIceCandidate getCandidate() {
        return this.candidate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSConnectionRole getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSfuNodeId() {
        return this.sfuNodeId;
    }

    public final HMSTrickle copy(HMSIceCandidate candidate, HMSConnectionRole role, String sfuNodeId) {
        AbstractC22676k.m65750j(candidate, "candidate");
        AbstractC22676k.m65750j(role, "role");
        return new HMSTrickle(candidate, role, sfuNodeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSTrickle)) {
            return false;
        }
        HMSTrickle hMSTrickle = (HMSTrickle) other;
        return AbstractC22676k.m65745e(this.candidate, hMSTrickle.candidate) && this.role == hMSTrickle.role && AbstractC22676k.m65745e(this.sfuNodeId, hMSTrickle.sfuNodeId);
    }

    public final HMSIceCandidate getCandidate() {
        return this.candidate;
    }

    public final HMSConnectionRole getRole() {
        return this.role;
    }

    public final String getSfuNodeId() {
        return this.sfuNodeId;
    }

    public int hashCode() {
        int iHashCode = (this.role.hashCode() + (this.candidate.hashCode() * 31)) * 31;
        String str = this.sfuNodeId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSTrickle(candidate=");
        sb4.append(this.candidate);
        sb4.append(", role=");
        sb4.append(this.role);
        sb4.append(", sfuNodeId=");
        return AbstractC25012a.m73377j(sb4, this.sfuNodeId, ')');
    }
}
