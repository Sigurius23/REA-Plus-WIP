package io.getstream.chat.android.client.api2.model.requests;

import com.whoop.service.network.model.UserState;
import ih0.AbstractC18489d0;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001a\u001b\u001cB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteUser;", "message", "Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteMessage;", "accept_invite", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteUser;Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteMessage;Z)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteUser;", "getMessage", "()Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteMessage;", "getAccept_invite", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "AcceptInviteUser", "AcceptInviteMessage", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AcceptInviteRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean accept_invite;
    private final AcceptInviteMessage message;
    private final AcceptInviteUser user;

    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteMessage;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AcceptInviteMessage {
        private final String text;

        public AcceptInviteMessage(String str) {
            this.text = str;
        }

        public static /* synthetic */ AcceptInviteMessage copy$default(AcceptInviteMessage acceptInviteMessage, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = acceptInviteMessage.text;
            }
            return acceptInviteMessage.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final AcceptInviteMessage copy(String text) {
            return new AcceptInviteMessage(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AcceptInviteMessage) && AbstractC22676k.m65745e(this.text, ((AcceptInviteMessage) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AcceptInviteMessage(text=", this.text, ")");
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$AcceptInviteUser;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AcceptInviteUser {
        private final String id;

        public AcceptInviteUser(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        public static /* synthetic */ AcceptInviteUser copy$default(AcceptInviteUser acceptInviteUser, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = acceptInviteUser.id;
            }
            return acceptInviteUser.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final AcceptInviteUser copy(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            return new AcceptInviteUser(id4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AcceptInviteUser) && AbstractC22676k.m65745e(this.id, ((AcceptInviteUser) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("AcceptInviteUser(id=", this.id, ")");
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest$Companion;", "", "<init>", "()V", "create", "Lio/getstream/chat/android/client/api2/model/requests/AcceptInviteRequest;", "userId", "", "message", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AcceptInviteRequest create(String userId, String message) {
            AbstractC22676k.m65750j(userId, "userId");
            return new AcceptInviteRequest(new AcceptInviteUser(userId), new AcceptInviteMessage(message), false, 4, null);
        }

        private Companion() {
        }
    }

    public AcceptInviteRequest(AcceptInviteUser user, AcceptInviteMessage message, boolean z4) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(message, "message");
        this.user = user;
        this.message = message;
        this.accept_invite = z4;
    }

    public static /* synthetic */ AcceptInviteRequest copy$default(AcceptInviteRequest acceptInviteRequest, AcceptInviteUser acceptInviteUser, AcceptInviteMessage acceptInviteMessage, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            acceptInviteUser = acceptInviteRequest.user;
        }
        if ((i13 & 2) != 0) {
            acceptInviteMessage = acceptInviteRequest.message;
        }
        if ((i13 & 4) != 0) {
            z4 = acceptInviteRequest.accept_invite;
        }
        return acceptInviteRequest.copy(acceptInviteUser, acceptInviteMessage, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AcceptInviteUser getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AcceptInviteMessage getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAccept_invite() {
        return this.accept_invite;
    }

    public final AcceptInviteRequest copy(AcceptInviteUser user, AcceptInviteMessage message, boolean accept_invite) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(message, "message");
        return new AcceptInviteRequest(user, message, accept_invite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcceptInviteRequest)) {
            return false;
        }
        AcceptInviteRequest acceptInviteRequest = (AcceptInviteRequest) other;
        return AbstractC22676k.m65745e(this.user, acceptInviteRequest.user) && AbstractC22676k.m65745e(this.message, acceptInviteRequest.message) && this.accept_invite == acceptInviteRequest.accept_invite;
    }

    public final boolean getAccept_invite() {
        return this.accept_invite;
    }

    public final AcceptInviteMessage getMessage() {
        return this.message;
    }

    public final AcceptInviteUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return Boolean.hashCode(this.accept_invite) + ((this.message.hashCode() + (this.user.hashCode() * 31)) * 31);
    }

    public String toString() {
        AcceptInviteUser acceptInviteUser = this.user;
        AcceptInviteMessage acceptInviteMessage = this.message;
        boolean z4 = this.accept_invite;
        StringBuilder sb4 = new StringBuilder("AcceptInviteRequest(user=");
        sb4.append(acceptInviteUser);
        sb4.append(", message=");
        sb4.append(acceptInviteMessage);
        sb4.append(", accept_invite=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ AcceptInviteRequest(AcceptInviteUser acceptInviteUser, AcceptInviteMessage acceptInviteMessage, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(acceptInviteUser, acceptInviteMessage, (i13 & 4) != 0 ? true : z4);
    }
}
