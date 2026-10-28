package io.getstream.chat.android.client.api2.model.requests;

import com.whoop.service.network.model.UserState;
import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;", "<init>", "(Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GuestUser", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GuestUserRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GuestUser user;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$Companion;", "", "<init>", "()V", "create", "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;", "id", "", "name", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GuestUserRequest create(String id4, String name) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(name, "name");
            return new GuestUserRequest(new GuestUser(id4, name));
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;", "", "id", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class GuestUser {
        private final String id;
        private final String name;

        public GuestUser(String id4, String name) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(name, "name");
            this.id = id4;
            this.name = name;
        }

        public static /* synthetic */ GuestUser copy$default(GuestUser guestUser, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = guestUser.id;
            }
            if ((i13 & 2) != 0) {
                str2 = guestUser.name;
            }
            return guestUser.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final GuestUser copy(String id4, String name) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(name, "name");
            return new GuestUser(id4, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestUser)) {
                return false;
            }
            GuestUser guestUser = (GuestUser) other;
            return AbstractC22676k.m65745e(this.id, guestUser.id) && AbstractC22676k.m65745e(this.name, guestUser.name);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("GuestUser(id=", this.id, ", name=", this.name, ")");
        }
    }

    public GuestUserRequest(GuestUser user) {
        AbstractC22676k.m65750j(user, "user");
        this.user = user;
    }

    public static /* synthetic */ GuestUserRequest copy$default(GuestUserRequest guestUserRequest, GuestUser guestUser, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            guestUser = guestUserRequest.user;
        }
        return guestUserRequest.copy(guestUser);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GuestUser getUser() {
        return this.user;
    }

    public final GuestUserRequest copy(GuestUser user) {
        AbstractC22676k.m65750j(user, "user");
        return new GuestUserRequest(user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GuestUserRequest) && AbstractC22676k.m65745e(this.user, ((GuestUserRequest) other).user);
    }

    public final GuestUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.user.hashCode();
    }

    public String toString() {
        return "GuestUserRequest(user=" + this.user + ")";
    }
}
