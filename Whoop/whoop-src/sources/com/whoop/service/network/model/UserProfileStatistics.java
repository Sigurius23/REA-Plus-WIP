package com.whoop.service.network.model;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/service/network/model/UserProfileStatistics;", "", "recoveryCount", "", "<init>", "(I)V", "getRecoveryCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UserProfileStatistics {
    private final int recoveryCount;

    public UserProfileStatistics() {
        this(0, 1, null);
    }

    public static /* synthetic */ UserProfileStatistics copy$default(UserProfileStatistics userProfileStatistics, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = userProfileStatistics.recoveryCount;
        }
        return userProfileStatistics.copy(i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecoveryCount() {
        return this.recoveryCount;
    }

    public final UserProfileStatistics copy(int recoveryCount) {
        return new UserProfileStatistics(recoveryCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserProfileStatistics) && this.recoveryCount == ((UserProfileStatistics) other).recoveryCount;
    }

    public final int getRecoveryCount() {
        return this.recoveryCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.recoveryCount);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.recoveryCount, "UserProfileStatistics(recoveryCount=", ")");
    }

    public UserProfileStatistics(int i13) {
        this.recoveryCount = i13;
    }

    public /* synthetic */ UserProfileStatistics(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13);
    }
}
