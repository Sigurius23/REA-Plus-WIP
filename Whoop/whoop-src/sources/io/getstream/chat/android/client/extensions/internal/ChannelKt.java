package io.getstream.chat.android.client.extensions.internal;

import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import l83.C23470p;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25264r;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p163g1.C15160u4;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.C38180o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u0013\u001a#\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001f\u0010\u000f\u001a'\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020 2\n\u0010\n\u001a\u00060\tj\u0002`\"H\u0007¢\u0006\u0004\b#\u0010$\u001a'\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\b\u0012\u0004\u0012\u00020\u00000%2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\b\u0012\u0004\u0012\u00020\u00000%2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020*H\u0007¢\u0006\u0004\b+\u0010,\u001a'\u0010+\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020*H\u0000¢\u0006\u0004\b+\u0010-\u001a-\u00100\u001a\b\u0012\u0004\u0012\u00020\u00000%*\b\u0012\u0004\u0012\u00020\u00000%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0001H\u0007¢\u0006\u0004\b0\u00101\"\u0014\u00102\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103\" \u00108\u001a\u0004\u0018\u00010\u0007*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, m65681d2 = {"Lio/getstream/chat/android/models/Channel;", "", "Lio/getstream/chat/android/models/User;", "users", "(Lio/getstream/chat/android/models/Channel;)Ljava/util/List;", "Ljava/util/Date;", "receivedEventDate", "Lio/getstream/chat/android/models/Message;", "message", "", "currentUserId", "updateLastMessage", "(Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "memberUserId", "removeMember", "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/Member;", "member", "addMember", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;", "updateMember", "", "banned", "shadow", "updateMemberBanned", "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ZZ)Lio/getstream/chat/android/models/Channel;", "addMembership", "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;", "updateMembership", "updateMembershipBanned", "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Z)Lio/getstream/chat/android/models/Channel;", "removeMembership", "Lio/getstream/chat/android/models/ChannelUserRead;", "newRead", "Lio/getstream/chat/android/models/UserId;", "updateReads", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/ChannelUserRead;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "applyPagination", "(Ljava/util/Collection;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Ljava/util/List;", "", "updateUsers", "(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/List;", "(Lio/getstream/chat/android/models/Channel;Ljava/util/Map;)Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/Location;", "locations", "updateLiveLocations", "(Ljava/util/Collection;Ljava/util/List;)Ljava/util/Collection;", "TAG", "Ljava/lang/String;", "getLastMessage", "(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;", "getLastMessage$annotations", "(Lio/getstream/chat/android/models/Channel;)V", "lastMessage", "Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelKt {
    private static final String TAG = "Chat:ChannelTools";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m54666a(Channel channel) {
        return (String) applyPagination$lambda$31$lambda$30$lambda$29(channel);
    }

    @InternalStreamChatApi
    public static final Channel addMember(Channel channel, Member member) {
        boolean z4;
        AbstractC22676k.m65750j(channel, "<this>");
        Member member2 = member;
        AbstractC22676k.m65750j(member2, "member");
        List<Member> members = channel.getMembers();
        if (!(members instanceof Collection) || !members.isEmpty()) {
            Iterator<T> it = members.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                if (AbstractC22676k.m65745e(((Member) it.next()).getUserId(), member2.getUserId())) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        List<Member> members2 = channel.getMembers();
        if (z4) {
            member2 = null;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(members2, AbstractC37056f.m118960L(member2));
        int memberCount = channel.getMemberCount();
        Integer num = z4 ? null : 1;
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, memberCount + (num != null ? num.intValue() : 0), null, arrayListM74129g1, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -5121, 7, null);
    }

    @InternalStreamChatApi
    public static final Channel addMembership(Channel channel, String currentUserId, Member member) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        AbstractC22676k.m65750j(member, "member");
        Member membership = AbstractC22676k.m65745e(member.getUserId(), currentUserId) ? member : null;
        if (membership == null) {
            membership = channel.getMembership();
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, membership, null, false, null, null, null, null, null, null, null, -33554433, 7, null);
    }

    @InternalStreamChatApi
    public static final List<Channel> applyPagination(Collection<Channel> collection, AnyChannelPaginationRequest pagination) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(pagination, "pagination");
        C23470p c23470pM5382S = AbstractC1772c1.m5382S(collection, "Chat:ChannelSort");
        C25264r c25264rM74145r0 = AbstractC25265s.m74145r0(collection);
        C2345k c2345k = (C2345k) c23470pM5382S.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Sorting channels: ", AbstractC38176k.m122289y(c25264rM74145r0, null, null, new C15160u4(3), 31)), null);
        }
        C38180o c38180oM122274C = AbstractC38176k.m122274C(c25264rM74145r0, pagination.getSort().getComparator());
        C2345k c2345k2 = (C2345k) c23470pM5382S.getValue();
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            c2345k2.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("Sort for channels result: ", AbstractC38176k.m122289y(c38180oM122274C, null, null, new C15160u4(4), 31)), null);
        }
        return AbstractC38176k.m122276E(AbstractC38176k.m122275D(AbstractC38176k.m122281q(c38180oM122274C, pagination.getChannelOffset()), pagination.getChannelLimit()));
    }

    private static final C2345k applyPagination$lambda$28(InterfaceC23462h interfaceC23462h) {
        return (C2345k) interfaceC23462h.getValue();
    }

    private static final CharSequence applyPagination$lambda$31$lambda$30$lambda$29(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        return channel.getId();
    }

    private static final CharSequence applyPagination$lambda$34$lambda$33$lambda$32(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        return channel.getId();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m54667b(Channel channel) {
        return (String) applyPagination$lambda$34$lambda$33$lambda$32(channel);
    }

    public static final Message getLastMessage(Channel channel) {
        Object obj;
        AbstractC22676k.m65750j(channel, "<this>");
        List<Message> messages = channel.getMessages();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (!MessageUtils.isDeleted((Message) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            Message message = (Message) obj3;
            if (message.getParentId() == null || message.getShowInChannel()) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault((Message) next, MessageKt.getNEVER());
                do {
                    Object next2 = it.next();
                    Date createdAtOrDefault2 = MessageExtensionsKt.getCreatedAtOrDefault((Message) next2, MessageKt.getNEVER());
                    if (createdAtOrDefault.compareTo(createdAtOrDefault2) < 0) {
                        next = next2;
                        createdAtOrDefault = createdAtOrDefault2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getLastMessage$annotations(Channel channel) {
    }

    @InternalStreamChatApi
    public static final Channel removeMember(Channel channel, String str) {
        AbstractC22676k.m65750j(channel, "<this>");
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            if (!AbstractC22676k.m65745e(((Member) obj).getUser().getId(), str)) {
                arrayList.add(obj);
            }
        }
        int memberCount = channel.getMemberCount();
        Integer num = 1;
        List<Member> members2 = channel.getMembers();
        if (!(members2 instanceof Collection) || !members2.isEmpty()) {
            Iterator<T> it = members2.iterator();
            do {
                if (!it.hasNext()) {
                    num = null;
                    break;
                }
            } while (!AbstractC22676k.m65745e(((Member) it.next()).getUser().getId(), str));
        } else {
            num = null;
            break;
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, memberCount - (num != null ? num.intValue() : 0), null, arrayList, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -5121, 7, null);
    }

    @InternalStreamChatApi
    public static final Channel removeMembership(Channel channel, String str) {
        User user;
        AbstractC22676k.m65750j(channel, "<this>");
        Member membership = channel.getMembership();
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, !AbstractC22676k.m65745e((membership == null || (user = membership.getUser()) == null) ? null : user.getId(), str) ? membership : null, null, false, null, null, null, null, null, null, null, -33554433, 7, null);
    }

    @InternalStreamChatApi
    public static final Channel updateLastMessage(Channel channel, Date date, Message message, String currentUserId) {
        Date receivedEventDate = date;
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(receivedEventDate, "receivedEventDate");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        if (MessageExtensionsKt.getCreatedAtOrNull(message) == null) {
            throw new IllegalStateException("created at cant be null, be sure to set message.createdAt");
        }
        List<Message> messages = channel.getMessages();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(messages, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : messages) {
            linkedHashMap.put(((Message) obj).getId(), obj);
        }
        Collection collectionValues = AbstractC25247g0.m73996e0(linkedHashMap, new C23465k(message.getId(), message)).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!MessageUtils.isDeleted((Message) obj2)) {
                arrayList.add(obj2);
            }
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new ChannelKt$updateLastMessage$$inlined$sortedBy$1());
        List<ChannelUserRead> read = channel.getRead();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        for (ChannelUserRead channelUserRead : read) {
            ChannelUserRead channelUserReadCopy$default = !AbstractC22676k.m65745e(channelUserRead.getUser().getId(), currentUserId) ? channelUserRead : null;
            if (channelUserReadCopy$default == null) {
                channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserRead, null, receivedEventDate, (!receivedEventDate.after(channelUserRead.getLastReceivedEventDate()) || listM74152u1.size() <= channel.getMessages().size() || !AbstractC22676k.m65745e(((Message) AbstractC25265s.m74112P0(listM74152u1)).getId(), message.getId()) || message.getShadowed() || message.getSilent()) ? channelUserRead.getUnreadMessages() : channelUserRead.getUnreadMessages() + 1, null, null, null, null, 121, null);
            }
            arrayList2.add(channelUserReadCopy$default);
            receivedEventDate = date;
        }
        return ChannelExtensionKt.syncUnreadCountWithReads(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, listM74152u1, null, null, arrayList2, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -18433, 7, null), currentUserId);
    }

    @InternalStreamChatApi
    public static final Collection<Channel> updateLiveLocations(Collection<Channel> collection, List<Location> locations) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(locations, "locations");
        Collection<Channel> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        for (Channel channel : collection2) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : locations) {
                if (AbstractC22676k.m65745e(((Location) obj).getCid(), channel.getCid())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, arrayList2, null, null, null, null, null, -536870913, 7, null));
        }
        return arrayList;
    }

    @InternalStreamChatApi
    public static final Channel updateMember(Channel channel, Member member) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(member, "member");
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        for (Member member2 : members) {
            if (AbstractC22676k.m65745e(member2.getUserId(), member.getUserId())) {
                member2 = null;
            }
            if (member2 == null) {
                member2 = member;
            }
            arrayList.add(member2);
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, arrayList, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -4097, 7, null);
    }

    @InternalStreamChatApi
    public static final Channel updateMemberBanned(Channel channel, String memberUserId, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(memberUserId, "memberUserId");
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        for (Member member : members) {
            Member memberCopy = !AbstractC22676k.m65745e(member.getUser().getId(), memberUserId) ? member : null;
            if (memberCopy == null) {
                memberCopy = member.copy((32766 & 1) != 0 ? member.user : null, (32766 & 2) != 0 ? member.createdAt : null, (32766 & 4) != 0 ? member.updatedAt : null, (32766 & 8) != 0 ? member.isInvited : null, (32766 & 16) != 0 ? member.inviteAcceptedAt : null, (32766 & 32) != 0 ? member.inviteRejectedAt : null, (32766 & 64) != 0 ? member.shadowBanned : z13, (32766 & 128) != 0 ? member.banned : z4, (32766 & 256) != 0 ? member.channelRole : null, (32766 & 512) != 0 ? member.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? member.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? member.banExpires : null, (32766 & 4096) != 0 ? member.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? member.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? member.extraData : null);
            }
            arrayList.add(memberCopy);
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, arrayList, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -4097, 7, null);
    }

    @InternalStreamChatApi
    public static final Channel updateMembership(Channel channel, Member member) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(member, "member");
        String userId = member.getUserId();
        Member membership = channel.getMembership();
        Member membership2 = AbstractC22676k.m65745e(userId, membership != null ? membership.getUserId() : null) ? member : null;
        if (membership2 == null) {
            membership2 = channel.getMembership();
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
                InterfaceC2344j interfaceC2344j = C2343i.f9271c;
                String userId2 = member.getUserId();
                Member membership3 = channel.getMembership();
                interfaceC2344j.log(enumC2341g, TAG, AbstractC2875y.m8300m("[updateMembership] rejected; memberUserId(", userId2, ") != membershipUserId(", membership3 != null ? membership3.getUserId() : null, ")"), null);
            }
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, membership2, null, false, null, null, null, null, null, null, null, -33554433, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    @InternalStreamChatApi
    public static final Channel updateMembershipBanned(Channel channel, String memberUserId, boolean z4) {
        Member membership;
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(memberUserId, "memberUserId");
        Member membership2 = channel.getMembership();
        if (membership2 == null) {
            membership = channel.getMembership();
        } else {
            if (!AbstractC22676k.m65745e(membership2.getUserId(), memberUserId)) {
                membership2 = null;
            }
            Member member = membership2;
            if (member == null || (membership = member.copy((32766 & 1) != 0 ? member.user : null, (32766 & 2) != 0 ? member.createdAt : null, (32766 & 4) != 0 ? member.updatedAt : null, (32766 & 8) != 0 ? member.isInvited : null, (32766 & 16) != 0 ? member.inviteAcceptedAt : null, (32766 & 32) != 0 ? member.inviteRejectedAt : null, (32766 & 64) != 0 ? member.shadowBanned : false, (32766 & 128) != 0 ? member.banned : z4, (32766 & 256) != 0 ? member.channelRole : null, (32766 & 512) != 0 ? member.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? member.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? member.banExpires : null, (32766 & 4096) != 0 ? member.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? member.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? member.extraData : null)) == null) {
                membership = channel.getMembership();
            }
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, membership, null, false, null, null, null, null, null, null, null, -33554433, 7, null);
    }

    @InternalStreamChatApi
    public static final Channel updateReads(Channel channel, ChannelUserRead newRead, String currentUserId) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(newRead, "newRead");
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        ChannelUserRead channelUserReadUserRead = ChannelExtensionKt.userRead(channel, newRead.getUser().getId());
        return ChannelExtensionKt.syncUnreadCountWithReads(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, channelUserReadUserRead != null ? AbstractC25265s.m74128f1(newRead, AbstractC25265s.m74124b1(channel.getRead(), channelUserReadUserRead)) : AbstractC25265s.m74128f1(newRead, channel.getRead()), null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -16385, 7, null), currentUserId);
    }

    @InternalStreamChatApi
    public static final List<Channel> updateUsers(Collection<Channel> collection, Map<String, User> users) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(users, "users");
        Collection<Channel> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(updateUsers((Channel) it.next(), users));
        }
        return arrayList;
    }

    @InternalStreamChatApi
    public static final List<User> users(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator<T> it = members.iterator();
        while (it.hasNext()) {
            arrayList.add(((Member) it.next()).getUser());
        }
        List<ChannelUserRead> read = channel.getRead();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        Iterator<T> it3 = read.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ChannelUserRead) it3.next()).getUser());
        }
        ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(channel.getCreatedBy(), AbstractC25265s.m74129g1(arrayList, arrayList2));
        List<Message> messages = channel.getMessages();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = messages.iterator();
        while (it4.hasNext()) {
            AbstractC25265s.m74141p0(arrayList3, MessageKt.users((Message) it4.next()));
        }
        return AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(arrayListM74128f1, arrayList3), channel.getWatchers());
    }

    public static final Channel updateUsers(Channel channel, Map<String, User> users) {
        Channel channel2 = channel;
        AbstractC22676k.m65750j(channel2, "<this>");
        AbstractC22676k.m65750j(users, "users");
        List<User> listUsers = users(channel2);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listUsers, 10));
        Iterator<T> it = listUsers.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        if (arrayList.isEmpty()) {
            return channel2;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (users.containsKey((String) it3.next())) {
                List<Message> listUpdateUsers = MessageKt.updateUsers(channel2.getMessages(), users);
                List listM74093D1 = AbstractC25265s.m74093D1(MemberKt.updateUsers(channel2.getMembers(), users));
                List<User> listUpdateUsers2 = UserKt.updateUsers(channel2.getWatchers(), users);
                User createdBy = users.get(channel2.getCreatedBy().getId());
                if (createdBy == null) {
                    createdBy = channel2.getCreatedBy();
                }
                return Channel.copy$default(channel2, null, null, null, null, 0, false, null, null, null, null, 0, listUpdateUsers, listM74093D1, listUpdateUsers2, null, null, createdBy, 0, null, null, null, 0, null, MessageKt.updateUsers(channel2.getPinnedMessages(), users), null, null, null, false, null, null, null, null, null, null, null, -8468481, 7, null);
            }
            channel2 = channel;
        }
        return channel;
    }
}
