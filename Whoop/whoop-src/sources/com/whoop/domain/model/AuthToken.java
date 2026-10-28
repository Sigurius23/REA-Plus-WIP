package com.whoop.domain.model;

import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÂ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/domain/model/AuthToken;", "", "accessToken", "", "refreshToken", "expirationSeconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "toAuthMaterial", "Lcom/whoop/domain/model/AuthMaterial;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class AuthToken {
    private final String accessToken;
    private final int expirationSeconds;
    private final String refreshToken;

    public AuthToken(String str, String str2, int i13) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.expirationSeconds = i13;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final int getExpirationSeconds() {
        return this.expirationSeconds;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = authToken.accessToken;
        }
        if ((i14 & 2) != 0) {
            str2 = authToken.refreshToken;
        }
        if ((i14 & 4) != 0) {
            i13 = authToken.expirationSeconds;
        }
        return authToken.copy(str, str2, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final AuthToken copy(String accessToken, String refreshToken, int expirationSeconds) {
        return new AuthToken(accessToken, refreshToken, expirationSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) other;
        return AbstractC22676k.m65745e(this.accessToken, authToken.accessToken) && AbstractC22676k.m65745e(this.refreshToken, authToken.refreshToken) && this.expirationSeconds == authToken.expirationSeconds;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refreshToken;
        return Integer.hashCode(this.expirationSeconds) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final AuthMaterial toAuthMaterial() {
        if (this.accessToken != null && this.refreshToken != null) {
            return new AuthMaterial(this.accessToken, this.refreshToken, this.expirationSeconds, -1);
        }
        throw new IllegalArgumentException(AbstractC39415s.m125909s("\n                    Access token is null: " + (this.accessToken == null) + "\n                    Refresh token is null: " + (this.refreshToken == null) + "\n                "));
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("AuthToken(accessToken=", str, ", refreshToken=", str2, ", expirationSeconds="), this.expirationSeconds, ")");
    }
}
