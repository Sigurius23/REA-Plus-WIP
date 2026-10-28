package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberMapperKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadMapperKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.LocationMapperKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0084\u0001\u0010\u000e\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042$\u0010\u000b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042$\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "toEntity", "(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/models/DraftMessage;", "getDraftMessage", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelMapperKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelMapperKt", m100430f = "ChannelMapper.kt", m100431l = {87, 89, 90, 91, 92, 97, 98}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191311 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$19;
        Object L$2;
        Object L$20;
        Object L$21;
        Object L$22;
        Object L$23;
        Object L$24;
        Object L$25;
        Object L$26;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C191311(InterfaceC30057d<? super C191311> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelMapperKt.toModel(null, null, null, null, this);
        }
    }

    public static final ChannelEntity toEntity(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        String type = channel.getType();
        String id4 = channel.getId();
        String name = channel.getName();
        String image = channel.getImage();
        int cooldown = channel.getCooldown();
        List<String> filterTags = channel.getFilterTags();
        boolean frozen = channel.getFrozen();
        Date createdAt = channel.getCreatedAt();
        Date updatedAt = channel.getUpdatedAt();
        Date deletedAt = channel.getDeletedAt();
        Map<String, Object> extraData = channel.getExtraData();
        SyncStatus syncStatus = channel.getSyncStatus();
        Boolean hidden = channel.getHidden();
        Date hiddenMessagesBefore = channel.getHiddenMessagesBefore();
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator<T> it = members.iterator();
        while (it.hasNext()) {
            arrayList.add(MemberMapperKt.toEntity((Member) it.next()));
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : arrayList) {
            linkedHashMap.put(((MemberEntity) obj).getUserId(), obj);
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap);
        int memberCount = channel.getMemberCount();
        List<ChannelUserRead> read = channel.getRead();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        Iterator<T> it3 = read.iterator();
        while (it3.hasNext()) {
            arrayList2.add(ChannelUserReadMapperKt.toEntity((ChannelUserRead) it3.next()));
        }
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList2, 10));
        if (iM73988W2 < 16) {
            iM73988W2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2);
        for (Object obj2 : arrayList2) {
            linkedHashMap2.put(((ChannelUserReadEntity) obj2).getUserId(), obj2);
        }
        LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(linkedHashMap2);
        Message lastMessage = ChannelKt.getLastMessage(channel);
        String id5 = lastMessage != null ? lastMessage.getId() : null;
        Date lastMessageAt = channel.getLastMessageAt();
        String id6 = channel.getCreatedBy().getId();
        List<User> watchers = channel.getWatchers();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(watchers, 10));
        Iterator<T> it4 = watchers.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((User) it4.next()).getId());
        }
        int watcherCount = channel.getWatcherCount();
        String team = channel.getTeam();
        Set<String> ownCapabilities = channel.getOwnCapabilities();
        Member membership = channel.getMembership();
        MemberEntity entity = membership != null ? MemberMapperKt.toEntity(membership) : null;
        List<Location> activeLiveLocations = channel.getActiveLiveLocations();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(activeLiveLocations, 10));
        Iterator<T> it5 = activeLiveLocations.iterator();
        while (it5.hasNext()) {
            arrayList4.add(LocationMapperKt.toEntity((Location) it5.next()));
        }
        return new ChannelEntity(type, id4, name, image, cooldown, id6, filterTags, frozen, hidden, hiddenMessagesBefore, linkedHashMapM74003l0, memberCount, arrayList3, watcherCount, linkedHashMapM74003l1, lastMessageAt, id5, createdAt, updatedAt, deletedAt, extraData, syncStatus, team, ownCapabilities, entity, arrayList4, channel.getMessageCount());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0553  */
    /* JADX WARN: Code duplicated, block: B:25:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x05c2 -> B:26:0x05e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x077b -> B:42:0x07a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0914 -> B:54:0x0930). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object toModel(io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity r56, c93.InterfaceC4351m r57, c93.InterfaceC4351m r58, c93.InterfaceC4351m r59, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Channel> r60) {
        /*
            Method dump skipped, instruction units count: 2936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelMapperKt.toModel(io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity, c93.m, c93.m, c93.m, q83.d):java.lang.Object");
    }
}
