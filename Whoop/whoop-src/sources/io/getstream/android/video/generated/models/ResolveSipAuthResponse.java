package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ResolveSipAuthResponse;", "", "authResult", "", AttachmentExtensionsKt.EXTRA_DURATION, "password", "trunkId", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthResult", "()Ljava/lang/String;", "getDuration", "getPassword", "getTrunkId", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ResolveSipAuthResponse {
    private final String authResult;
    private final String duration;
    private final String password;
    private final String trunkId;
    private final String username;

    public ResolveSipAuthResponse(@InterfaceC30731q(name = "auth_result") String authResult, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "password") String str, @InterfaceC30731q(name = "trunk_id") String str2, @InterfaceC30731q(name = "username") String str3) {
        AbstractC22676k.m65750j(authResult, "authResult");
        AbstractC22676k.m65750j(duration, "duration");
        this.authResult = authResult;
        this.duration = duration;
        this.password = str;
        this.trunkId = str2;
        this.username = str3;
    }

    public static /* synthetic */ ResolveSipAuthResponse copy$default(ResolveSipAuthResponse resolveSipAuthResponse, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = resolveSipAuthResponse.authResult;
        }
        if ((i13 & 2) != 0) {
            str2 = resolveSipAuthResponse.duration;
        }
        if ((i13 & 4) != 0) {
            str3 = resolveSipAuthResponse.password;
        }
        if ((i13 & 8) != 0) {
            str4 = resolveSipAuthResponse.trunkId;
        }
        if ((i13 & 16) != 0) {
            str5 = resolveSipAuthResponse.username;
        }
        String str6 = str5;
        String str7 = str3;
        return resolveSipAuthResponse.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthResult() {
        return this.authResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrunkId() {
        return this.trunkId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final ResolveSipAuthResponse copy(@InterfaceC30731q(name = "auth_result") String authResult, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "password") String password, @InterfaceC30731q(name = "trunk_id") String trunkId, @InterfaceC30731q(name = "username") String username) {
        AbstractC22676k.m65750j(authResult, "authResult");
        AbstractC22676k.m65750j(duration, "duration");
        return new ResolveSipAuthResponse(authResult, duration, password, trunkId, username);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveSipAuthResponse)) {
            return false;
        }
        ResolveSipAuthResponse resolveSipAuthResponse = (ResolveSipAuthResponse) other;
        return AbstractC22676k.m65745e(this.authResult, resolveSipAuthResponse.authResult) && AbstractC22676k.m65745e(this.duration, resolveSipAuthResponse.duration) && AbstractC22676k.m65745e(this.password, resolveSipAuthResponse.password) && AbstractC22676k.m65745e(this.trunkId, resolveSipAuthResponse.trunkId) && AbstractC22676k.m65745e(this.username, resolveSipAuthResponse.username);
    }

    public final String getAuthResult() {
        return this.authResult;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getTrunkId() {
        return this.trunkId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.authResult.hashCode() * 31, 31, this.duration);
        String str = this.password;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trunkId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.username;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.authResult;
        String str2 = this.duration;
        String str3 = this.password;
        String str4 = this.trunkId;
        String str5 = this.username;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ResolveSipAuthResponse(authResult=", str, ", duration=", str2, ", password=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", trunkId=", str4, ", username=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public /* synthetic */ ResolveSipAuthResponse(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
    }
}
