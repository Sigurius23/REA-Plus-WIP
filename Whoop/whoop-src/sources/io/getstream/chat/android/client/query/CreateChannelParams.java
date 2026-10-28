package io.getstream.chat.android.client.query;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.MemberData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/query/CreateChannelParams;", "", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/chat/android/models/MemberData;", "extraData", "", "", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getMembers", "()Ljava/util/List;", "getExtraData", "()Ljava/util/Map;", "memberIds", "getMemberIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CreateChannelParams {
    private final Map<String, Object> extraData;
    private final List<String> memberIds;
    private final List<MemberData> members;

    public CreateChannelParams(List<MemberData> members, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.members = members;
        this.extraData = extraData;
        List<MemberData> list = members;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MemberData) it.next()).getUserId());
        }
        this.memberIds = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateChannelParams copy$default(CreateChannelParams createChannelParams, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = createChannelParams.members;
        }
        if ((i13 & 2) != 0) {
            map = createChannelParams.extraData;
        }
        return createChannelParams.copy(list, map);
    }

    public final List<MemberData> component1() {
        return this.members;
    }

    public final Map<String, Object> component2() {
        return this.extraData;
    }

    public final CreateChannelParams copy(List<MemberData> members, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new CreateChannelParams(members, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateChannelParams)) {
            return false;
        }
        CreateChannelParams createChannelParams = (CreateChannelParams) other;
        return AbstractC22676k.m65745e(this.members, createChannelParams.members) && AbstractC22676k.m65745e(this.extraData, createChannelParams.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final List<String> getMemberIds() {
        return this.memberIds;
    }

    public final List<MemberData> getMembers() {
        return this.members;
    }

    public final int hashCode() {
        return this.extraData.hashCode() + (this.members.hashCode() * 31);
    }

    public final String toString() {
        return "CreateChannelParams(members=" + this.members + ", extraData=" + this.extraData + ")";
    }
}
