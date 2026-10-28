package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import nh3.AbstractC26725a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/UpdateUsersResponse;", "", "users", "", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "<init>", "(Ljava/util/Map;)V", "getUsers", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdateUsersResponse {
    private final Map<String, DownstreamUserDto> users;

    public UpdateUsersResponse(Map<String, DownstreamUserDto> users) {
        AbstractC22676k.m65750j(users, "users");
        this.users = users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateUsersResponse copy$default(UpdateUsersResponse updateUsersResponse, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = updateUsersResponse.users;
        }
        return updateUsersResponse.copy(map);
    }

    public final Map<String, DownstreamUserDto> component1() {
        return this.users;
    }

    public final UpdateUsersResponse copy(Map<String, DownstreamUserDto> users) {
        AbstractC22676k.m65750j(users, "users");
        return new UpdateUsersResponse(users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateUsersResponse) && AbstractC22676k.m65745e(this.users, ((UpdateUsersResponse) other).users);
    }

    public final Map<String, DownstreamUserDto> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.users.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("UpdateUsersResponse(users=", ")", this.users);
    }
}
