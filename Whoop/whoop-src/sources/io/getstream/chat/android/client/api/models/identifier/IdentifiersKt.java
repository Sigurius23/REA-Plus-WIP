package io.getstream.chat.android.client.api.models.identifier;

import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\bH\u0000\u001aN\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0000\u001a\"\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\"\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a$\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0000\u001a \u0010 \u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020#H\u0000\u001a\u0010\u0010$\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020#H\u0000\u001a\u0018\u0010%\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001bH\u0000\u001a\u0010\u0010'\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u001a*\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0010\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,H\u0000\u001a \u0010-\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001bH\u0000\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u001a\b\u00100\u001a\u00020\u0001H\u0000\u001a\u0018\u00101\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a \u00102\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u001a\b\u00103\u001a\u00020\u0001H\u0000\u001a\u0010\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u000206H\u0000\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00105\u001a\u000206H\u0000\u001a\u0010\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020:H\u0000¨\u0006;"}, m65681d2 = {"QueryChannelIdentifier", "", "channelType", "", "channelId", "request", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "QueryChannelsIdentifier", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "QueryMembersIdentifier", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "filter", "Lio/getstream/chat/android/models/FilterObject;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "", "DeleteReactionIdentifier", "messageId", "reactionType", "cid", "SendReactionIdentifier", "reaction", "Lio/getstream/chat/android/models/Reaction;", "enforceUnique", "", "GetRepliesIdentifier", "getNewerRepliesIdentifier", "parentId", "lastId", "GetRepliesMoreIdentifier", "firstId", "SendGiphyIdentifier", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "ShuffleGiphyIdentifier", "DeleteMessageIdentifier", "hard", "DeleteMessageForMeIdentifier", "SendEventIdentifier", "eventType", "UpdateMessageIdentifier", "message", "Lio/getstream/chat/android/models/Message;", "HideChannelIdentifier", "clearHistory", "GetMessageIdentifier", "MarkAllReadIdentifier", "MarkReadIdentifier", "SendMessageIdentifier", "GetDevicesIdentifier", "AddDeviceIdentifier", "device", "Lio/getstream/chat/android/models/Device;", "DeleteDeviceIdentifier", "ConnectUserIdentifier", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class IdentifiersKt {
    public static final int AddDeviceIdentifier(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return device.hashCode() + 1166532777;
    }

    public static final int ConnectUserIdentifier(User user) {
        AbstractC22676k.m65750j(user, "user");
        return user.getId().hashCode() + 2069068523;
    }

    public static final int DeleteDeviceIdentifier(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return device.hashCode() - 2140977121;
    }

    public static final int DeleteMessageForMeIdentifier(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return messageId.hashCode() - 984790341;
    }

    public static final int DeleteMessageIdentifier(String messageId, boolean z4) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return Boolean.hashCode(z4) + ((messageId.hashCode() + 777903044) * 31);
    }

    public static final int DeleteReactionIdentifier(String messageId, String reactionType, String str) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        return AbstractC11266d.m30450d((messageId.hashCode() - 1337791124) * 31, 31, reactionType) + (str != null ? str.hashCode() : 0);
    }

    public static final int GetDevicesIdentifier() {
        return 295158983;
    }

    public static final int GetMessageIdentifier(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return messageId.hashCode() - 1011292625;
    }

    public static final int GetRepliesIdentifier(String messageId, int i13) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return Integer.hashCode(i13) + ((messageId.hashCode() - 979290802) * 31);
    }

    public static final int GetRepliesMoreIdentifier(String messageId, String firstId, int i13) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(firstId, "firstId");
        return Integer.hashCode(i13) + AbstractC11266d.m30450d((messageId.hashCode() + 12262777) * 31, 31, firstId);
    }

    public static final int HideChannelIdentifier(String channelType, String channelId, boolean z4) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return Boolean.hashCode(z4) + AbstractC11266d.m30450d((channelType.hashCode() - 2135796001) * 31, 31, channelId);
    }

    public static final int MarkAllReadIdentifier() {
        return -150079702;
    }

    public static final int MarkReadIdentifier(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return channelId.hashCode() + ((channelType.hashCode() + 1052195389) * 31);
    }

    public static final int QueryChannelIdentifier(String channelType, String channelId, QueryChannelRequest request) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(request, "request");
        return request.hashCode() + AbstractC11266d.m30450d((channelType.hashCode() - 265582555) * 31, 31, channelId);
    }

    public static final int QueryChannelsIdentifier(QueryChannelsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return request.hashCode() + 356878952;
    }

    public static final int QueryMembersIdentifier(String channelType, String channelId, int i13, int i14, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return members.hashCode() + ((sort.hashCode() + ((filter.hashCode() + AbstractC11266d.m30448b(i14, AbstractC11266d.m30448b(i13, AbstractC11266d.m30450d((channelType.hashCode() + 1947320015) * 31, 31, channelId), 31), 31)) * 31)) * 31);
    }

    public static /* synthetic */ int QueryMembersIdentifier$default(String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter querySorter, List list, int i15, Object obj) {
        if ((i15 & 64) != 0) {
            list = C25271y.f99162w;
        }
        return QueryMembersIdentifier(str, str2, i13, i14, filterObject, querySorter, list);
    }

    public static final int SendEventIdentifier(String eventType, String channelType, String channelId, String str) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC11266d.m30450d(AbstractC11266d.m30450d((eventType.hashCode() + 2079109742) * 31, 31, channelType), 31, channelId) + (str != null ? str.hashCode() : 0);
    }

    public static final int SendGiphyIdentifier(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return request.hashCode() + 2124684361;
    }

    public static final int SendMessageIdentifier(String channelType, String channelId, String messageId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageId, "messageId");
        return messageId.hashCode() + AbstractC11266d.m30450d((channelType.hashCode() + 124551329) * 31, 31, channelId);
    }

    public static final int SendReactionIdentifier(Reaction reaction, boolean z4, String str) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return AbstractC2875y.m8289b((reaction.hashCode() - 116857809) * 31, 31, z4) + (str != null ? str.hashCode() : 0);
    }

    public static final int ShuffleGiphyIdentifier(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return request.hashCode() + 447467194;
    }

    public static final int UpdateMessageIdentifier(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return message.hashCode() - 593915678;
    }

    public static final int getNewerRepliesIdentifier(String parentId, int i13, String str) {
        AbstractC22676k.m65750j(parentId, "parentId");
        return AbstractC11266d.m30448b(i13, (parentId.hashCode() - 1343869546) * 31, 31) + (str != null ? str.hashCode() : 0);
    }

    public static /* synthetic */ int getNewerRepliesIdentifier$default(String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        return getNewerRepliesIdentifier(str, i13, str2);
    }
}
