package io.getstream.android.video.generated.models;

import com.whoop.service.network.model.UserState;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CreateGuestRequest;", "", UserState.Sources.USER, "Lio/getstream/android/video/generated/models/UserRequest;", "(Lio/getstream/android/video/generated/models/UserRequest;)V", "getUser", "()Lio/getstream/android/video/generated/models/UserRequest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CreateGuestRequest {
    private final UserRequest user;

    public CreateGuestRequest(@InterfaceC30731q(name = UserState.Sources.USER) UserRequest user) {
        AbstractC22676k.m65750j(user, "user");
        this.user = user;
    }

    public static /* synthetic */ CreateGuestRequest copy$default(CreateGuestRequest createGuestRequest, UserRequest userRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            userRequest = createGuestRequest.user;
        }
        return createGuestRequest.copy(userRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserRequest getUser() {
        return this.user;
    }

    public final CreateGuestRequest copy(@InterfaceC30731q(name = UserState.Sources.USER) UserRequest user) {
        AbstractC22676k.m65750j(user, "user");
        return new CreateGuestRequest(user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateGuestRequest) && AbstractC22676k.m65745e(this.user, ((CreateGuestRequest) other).user);
    }

    public final UserRequest getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.user.hashCode();
    }

    public String toString() {
        return "CreateGuestRequest(user=" + this.user + ")";
    }
}
