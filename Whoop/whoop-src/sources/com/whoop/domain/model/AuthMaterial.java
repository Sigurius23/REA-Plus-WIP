package com.whoop.domain.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDtoKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001eR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001e¨\u00065"}, m65681d2 = {"Lcom/whoop/domain/model/AuthMaterial;", "", "", "accessToken", "refreshToken", "", "expirationSeconds", "refreshTokenExpirationSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/AuthMaterial;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/AuthToken;", "toAuthToken", "()Lcom/whoop/domain/model/AuthToken;", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/whoop/domain/model/AuthMaterial;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getAccessToken$annotations", "()V", "getRefreshToken", "getRefreshToken$annotations", "I", "getExpirationSeconds", "getExpirationSeconds$annotations", "getRefreshTokenExpirationSeconds", "getRefreshTokenExpirationSeconds$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AuthMaterial {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName(UserSessionDtoKt.ACCESS_TOKEN)
    private final String accessToken;

    @SerializedName("access_token_expires_in")
    private final int expirationSeconds;

    @SerializedName(UserSessionDtoKt.REFRESH_TOKEN)
    private final String refreshToken;

    @SerializedName("refresh_token_expires_in")
    private final int refreshTokenExpirationSeconds;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/AuthMaterial$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/AuthMaterial;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AuthMaterial$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AuthMaterial(int i13, String str, String str2, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AuthMaterial$$serializer.INSTANCE.getDescriptor());
        }
        this.accessToken = str;
        this.refreshToken = str2;
        this.expirationSeconds = i14;
        this.refreshTokenExpirationSeconds = i15;
    }

    public static /* synthetic */ AuthMaterial copy$default(AuthMaterial authMaterial, String str, String str2, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = authMaterial.accessToken;
        }
        if ((i15 & 2) != 0) {
            str2 = authMaterial.refreshToken;
        }
        if ((i15 & 4) != 0) {
            i13 = authMaterial.expirationSeconds;
        }
        if ((i15 & 8) != 0) {
            i14 = authMaterial.refreshTokenExpirationSeconds;
        }
        return authMaterial.copy(str, str2, i13, i14);
    }

    @InterfaceC37143h(UserSessionDtoKt.ACCESS_TOKEN)
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @InterfaceC37143h("access_token_expires_in")
    public static /* synthetic */ void getExpirationSeconds$annotations() {
    }

    @InterfaceC37143h(UserSessionDtoKt.REFRESH_TOKEN)
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    @InterfaceC37143h("refresh_token_expires_in")
    public static /* synthetic */ void getRefreshTokenExpirationSeconds$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(AuthMaterial self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.accessToken);
        output.encodeStringElement(serialDesc, 1, self.refreshToken);
        output.encodeIntElement(serialDesc, 2, self.expirationSeconds);
        output.encodeIntElement(serialDesc, 3, self.refreshTokenExpirationSeconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getExpirationSeconds() {
        return this.expirationSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRefreshTokenExpirationSeconds() {
        return this.refreshTokenExpirationSeconds;
    }

    public final AuthMaterial copy(String accessToken, String refreshToken, int expirationSeconds, int refreshTokenExpirationSeconds) {
        AbstractC22676k.m65750j(accessToken, "accessToken");
        AbstractC22676k.m65750j(refreshToken, "refreshToken");
        return new AuthMaterial(accessToken, refreshToken, expirationSeconds, refreshTokenExpirationSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthMaterial)) {
            return false;
        }
        AuthMaterial authMaterial = (AuthMaterial) other;
        return AbstractC22676k.m65745e(this.accessToken, authMaterial.accessToken) && AbstractC22676k.m65745e(this.refreshToken, authMaterial.refreshToken) && this.expirationSeconds == authMaterial.expirationSeconds && this.refreshTokenExpirationSeconds == authMaterial.refreshTokenExpirationSeconds;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpirationSeconds() {
        return this.expirationSeconds;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getRefreshTokenExpirationSeconds() {
        return this.refreshTokenExpirationSeconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.refreshTokenExpirationSeconds) + AbstractC11266d.m30448b(this.expirationSeconds, AbstractC11266d.m30450d(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31);
    }

    public final AuthToken toAuthToken() {
        return new AuthToken(this.accessToken, this.refreshToken, this.expirationSeconds);
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        return AbstractC26725a.m79505i(AbstractC11895b.m32001t("AuthMaterial(accessToken=", str, ", refreshToken=", str2, ", expirationSeconds="), this.expirationSeconds, ", refreshTokenExpirationSeconds=", this.refreshTokenExpirationSeconds, ")");
    }

    public AuthMaterial(String accessToken, String refreshToken, int i13, int i14) {
        AbstractC22676k.m65750j(accessToken, "accessToken");
        AbstractC22676k.m65750j(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expirationSeconds = i13;
        this.refreshTokenExpirationSeconds = i14;
    }
}
