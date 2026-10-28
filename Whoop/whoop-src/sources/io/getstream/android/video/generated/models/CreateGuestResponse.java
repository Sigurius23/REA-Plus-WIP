package io.getstream.android.video.generated.models;

import com.whoop.service.network.model.UserSessionDtoKt;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateGuestResponse;", "", "accessToken", "", AttachmentExtensionsKt.EXTRA_DURATION, UserState.Sources.USER, "Lio/getstream/android/video/generated/models/UserResponse;", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)V", "getAccessToken", "()Ljava/lang/String;", "getDuration", "getUser", "()Lio/getstream/android/video/generated/models/UserResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CreateGuestResponse {
    private final String accessToken;
    private final String duration;
    private final UserResponse user;

    public CreateGuestResponse(@InterfaceC30731q(name = UserSessionDtoKt.ACCESS_TOKEN) String accessToken, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user) {
        AbstractC22676k.m65750j(accessToken, "accessToken");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(user, "user");
        this.accessToken = accessToken;
        this.duration = duration;
        this.user = user;
    }

    public static /* synthetic */ CreateGuestResponse copy$default(CreateGuestResponse createGuestResponse, String str, String str2, UserResponse userResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = createGuestResponse.accessToken;
        }
        if ((i13 & 2) != 0) {
            str2 = createGuestResponse.duration;
        }
        if ((i13 & 4) != 0) {
            userResponse = createGuestResponse.user;
        }
        return createGuestResponse.copy(str, str2, userResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    public final CreateGuestResponse copy(@InterfaceC30731q(name = UserSessionDtoKt.ACCESS_TOKEN) String accessToken, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user) {
        AbstractC22676k.m65750j(accessToken, "accessToken");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(user, "user");
        return new CreateGuestResponse(accessToken, duration, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateGuestResponse)) {
            return false;
        }
        CreateGuestResponse createGuestResponse = (CreateGuestResponse) other;
        return AbstractC22676k.m65745e(this.accessToken, createGuestResponse.accessToken) && AbstractC22676k.m65745e(this.duration, createGuestResponse.duration) && AbstractC22676k.m65745e(this.user, createGuestResponse.user);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.user.hashCode() + AbstractC11266d.m30450d(this.accessToken.hashCode() * 31, 31, this.duration);
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.duration;
        UserResponse userResponse = this.user;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateGuestResponse(accessToken=", str, ", duration=", str2, ", user=");
        sbM32001t.append(userResponse);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
