package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentMapperKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal.ChannelInfoEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal.ChannelInfoMapperKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.ChannelInfo;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageModerationDetails;
import io.getstream.chat.android.models.MessageReminderInfo;
import io.getstream.chat.android.models.Moderation;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.ReactionGroup;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0084\u0001\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012$\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012$\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a^\u0010\u000b\u001a\u00020\u0007*\u00020\u000f2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012$\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u000f*\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\r\u001a\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\r\u0010\u0015\u001a:\u0010\u000b\u001a\u00020\u0013*\u00020\u00142$\u0010\u0016\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@¢\u0006\u0004\b\u000b\u0010\u0017\u001a\u0013\u0010\r\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\r\u0010\u001a\u001a\u0013\u0010\u000b\u001a\u00020\u0018*\u00020\u0019H\u0000¢\u0006\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getReply", "Lio/getstream/chat/android/models/Poll;", "getPoll", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;", "toEntity", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;", "toReplyEntity", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;", "Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;", "(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;", "getMessage", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/MessageReminderInfo;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "(Lio/getstream/chat/android/models/MessageReminderInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;)Lio/getstream/chat/android/models/MessageReminderInfo;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageMapperKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt", m100430f = "MessageMapper.kt", m100431l = {42, 63, 64, 65, 67, 69, 76, 83}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192001 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
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
        Object L$27;
        Object L$28;
        Object L$29;
        Object L$3;
        Object L$30;
        Object L$31;
        Object L$32;
        Object L$33;
        Object L$34;
        Object L$35;
        Object L$36;
        Object L$37;
        Object L$38;
        Object L$39;
        Object L$4;
        Object L$40;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        boolean Z$4;
        boolean Z$5;
        int label;
        /* synthetic */ Object result;

        public C192001(InterfaceC30057d<? super C192001> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageMapperKt.toModel(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt$toModel$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt", m100430f = "MessageMapper.kt", m100431l = {152, 171, 175, 181, 184}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192013 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
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
        Object L$27;
        Object L$28;
        Object L$29;
        Object L$3;
        Object L$30;
        Object L$31;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        int label;
        /* synthetic */ Object result;

        public C192013(InterfaceC30057d<? super C192013> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageMapperKt.toModel(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt$toModel$5 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt", m100430f = "MessageMapper.kt", m100431l = {254}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192025 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C192025(InterfaceC30057d<? super C192025> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageMapperKt.toModel(null, null, this);
        }
    }

    public static final MessageEntity toEntity(Message message) {
        String replyMessageId;
        AbstractC22676k.m65750j(message, "<this>");
        String id4 = message.getId();
        String cid = message.getCid();
        String id5 = message.getUser().getId();
        String text = message.getText();
        String html = message.getHtml();
        SyncStatus syncStatus = message.getSyncStatus();
        String type = message.getType();
        int replyCount = message.getReplyCount();
        int deletedReplyCount = message.getDeletedReplyCount();
        Date createdAt = message.getCreatedAt();
        Date createdLocallyAt = message.getCreatedLocallyAt();
        Date updatedAt = message.getUpdatedAt();
        Date updatedLocallyAt = message.getUpdatedLocallyAt();
        Date deletedAt = message.getDeletedAt();
        String parentId = message.getParentId();
        String command = message.getCommand();
        Map<String, Object> extraData = message.getExtraData();
        Map<String, Integer> reactionCounts = message.getReactionCounts();
        Map<String, Integer> reactionScores = message.getReactionScores();
        Map<String, ReactionGroup> reactionGroups = message.getReactionGroups();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(reactionGroups.size()));
        for (Iterator it = reactionGroups.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ReactionGroupMapperKt.toEntity((ReactionGroup) entry.getValue()));
        }
        boolean shadowed = message.getShadowed();
        Map<String, String> i18n = message.getI18n();
        List<User> mentionedUsers = message.getMentionedUsers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(mentionedUsers, 10));
        Iterator<T> it3 = mentionedUsers.iterator();
        while (it3.hasNext()) {
            arrayList.add(((User) it3.next()).getId());
        }
        List<String> mentionedUsersIds = message.getMentionedUsersIds();
        Message replyTo = message.getReplyTo();
        if (replyTo == null || (replyMessageId = replyTo.getId()) == null) {
            replyMessageId = message.getReplyMessageId();
        }
        String str = replyMessageId;
        List<User> threadParticipants = message.getThreadParticipants();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(threadParticipants, 10));
        Iterator<T> it4 = threadParticipants.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((User) it4.next()).getId());
        }
        boolean showInChannel = message.getShowInChannel();
        boolean silent = message.getSilent();
        ChannelInfo channelInfo = message.getChannelInfo();
        ChannelInfoEntity entity = channelInfo != null ? ChannelInfoMapperKt.toEntity(channelInfo) : null;
        boolean pinned = message.getPinned();
        Date pinnedAt = message.getPinnedAt();
        Date pinExpires = message.getPinExpires();
        User pinnedBy = message.getPinnedBy();
        String id6 = pinnedBy != null ? pinnedBy.getId() : null;
        boolean skipPushNotification = message.getSkipPushNotification();
        boolean skipEnrichUrl = message.getSkipEnrichUrl();
        MessageModerationDetails moderationDetails = message.getModerationDetails();
        ModerationDetailsEntity entity2 = moderationDetails != null ? ModerationDetailsMapperKt.toEntity(moderationDetails) : null;
        Moderation moderation = message.getModeration();
        ModerationEntity entity3 = moderation != null ? ModerationMapperKt.toEntity(moderation) : null;
        Date messageTextUpdatedAt = message.getMessageTextUpdatedAt();
        Poll poll = message.getPoll();
        String id7 = poll != null ? poll.getId() : null;
        MessageReminderInfo reminder = message.getReminder();
        ReminderInfoEntity entity4 = reminder != null ? toEntity(reminder) : null;
        List<String> restrictedVisibility = message.getRestrictedVisibility();
        Location sharedLocation = message.getSharedLocation();
        MessageInnerEntity messageInnerEntity = new MessageInnerEntity(id4, cid, id5, text, html, type, syncStatus, replyCount, deletedReplyCount, createdAt, createdLocallyAt, updatedAt, updatedLocallyAt, deletedAt, arrayList, mentionedUsersIds, reactionCounts, reactionScores, linkedHashMap, parentId, command, shadowed, i18n, showInChannel, entity, silent, extraData, str, pinned, pinnedAt, pinExpires, id6, arrayList2, skipPushNotification, skipEnrichUrl, entity2, entity3, messageTextUpdatedAt, id7, restrictedVisibility, entity4, sharedLocation != null ? LocationMapperKt.toEntity(sharedLocation) : null, message.getChannelRole(), message.getDeletedForMe());
        List<Attachment> attachments = message.getAttachments();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
        int i13 = 0;
        for (Object obj : attachments) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList3.add(AttachmentMapperKt.toEntity((Attachment) obj, message.getId(), i13));
            i13 = i14;
        }
        List<Reaction> latestReactions = message.getLatestReactions();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(latestReactions, 10));
        Iterator<T> it5 = latestReactions.iterator();
        while (it5.hasNext()) {
            arrayList4.add(ReactionMapperKt.toEntity((Reaction) it5.next()));
        }
        List<Reaction> ownReactions = message.getOwnReactions();
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(ownReactions, 10));
        Iterator<T> it6 = ownReactions.iterator();
        while (it6.hasNext()) {
            arrayList5.add(ReactionMapperKt.toEntity((Reaction) it6.next()));
        }
        return new MessageEntity(messageInnerEntity, arrayList3, arrayList5, arrayList4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object toModel(DraftMessageEntity draftMessageEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super DraftMessage> interfaceC30057d) {
        C192025 c192025;
        String id4;
        String cid;
        String parentId;
        boolean silent;
        Message message;
        DraftMessageEntity draftMessageEntity2;
        boolean z4;
        List<String> list;
        List<String> list2;
        boolean z13;
        if (interfaceC30057d instanceof C192025) {
            c192025 = (C192025) interfaceC30057d;
            int i13 = c192025.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192025.label = i13 - Integer.MIN_VALUE;
            } else {
                c192025 = new C192025(interfaceC30057d);
            }
        } else {
            c192025 = new C192025(interfaceC30057d);
        }
        Object obj = c192025.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c192025.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            id4 = draftMessageEntity.getId();
            cid = draftMessageEntity.getCid();
            parentId = draftMessageEntity.getParentId();
            List<String> mentionedUsersIds = draftMessageEntity.getMentionedUsersIds();
            silent = draftMessageEntity.getSilent();
            boolean showInChannel = draftMessageEntity.getShowInChannel();
            Object replyMessageId = draftMessageEntity.getReplyMessageId();
            message = null;
            if (replyMessageId != null) {
                c192025.L$0 = draftMessageEntity;
                c192025.L$1 = null;
                c192025.L$2 = id4;
                c192025.L$3 = cid;
                c192025.L$4 = parentId;
                c192025.L$5 = mentionedUsersIds;
                c192025.L$6 = null;
                c192025.Z$0 = silent;
                c192025.Z$1 = showInChannel;
                c192025.I$0 = 0;
                c192025.label = 1;
                Object objInvoke = interfaceC4351m.invoke(replyMessageId, c192025);
                if (objInvoke == obj2) {
                    return obj2;
                }
                list2 = mentionedUsersIds;
                obj = objInvoke;
                z13 = showInChannel;
                draftMessageEntity2 = draftMessageEntity;
            } else {
                draftMessageEntity2 = draftMessageEntity;
                z4 = showInChannel;
                list = mentionedUsersIds;
            }
            String str = cid;
            Message message2 = message;
            boolean z14 = silent;
            String str2 = parentId;
            return new DraftMessage(id4, str, draftMessageEntity2.getText(), str2, null, list, draftMessageEntity2.getExtraData(), z14, z4, message2, draftMessageEntity2.getCommand(), draftMessageEntity2.getArgs(), 16, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = c192025.Z$1;
        silent = c192025.Z$0;
        list2 = (List) c192025.L$5;
        parentId = (String) c192025.L$4;
        cid = (String) c192025.L$3;
        id4 = (String) c192025.L$2;
        draftMessageEntity2 = (DraftMessageEntity) c192025.L$0;
        AbstractC34132o.m107864I(obj);
        message = (Message) obj;
        z4 = z13;
        list = list2;
        String str3 = cid;
        Message message3 = message;
        boolean z15 = silent;
        String str4 = parentId;
        return new DraftMessage(id4, str3, draftMessageEntity2.getText(), str4, null, list, draftMessageEntity2.getExtraData(), z15, z4, message3, draftMessageEntity2.getCommand(), draftMessageEntity2.getArgs(), 16, null);
    }

    public static final ReplyMessageEntity toReplyEntity(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        String id4 = message.getId();
        String cid = message.getCid();
        String id5 = message.getUser().getId();
        String text = message.getText();
        String html = message.getHtml();
        SyncStatus syncStatus = message.getSyncStatus();
        String type = message.getType();
        int replyCount = message.getReplyCount();
        int deletedReplyCount = message.getDeletedReplyCount();
        Date createdAt = message.getCreatedAt();
        Date createdLocallyAt = message.getCreatedLocallyAt();
        Date updatedAt = message.getUpdatedAt();
        Date updatedLocallyAt = message.getUpdatedLocallyAt();
        Date deletedAt = message.getDeletedAt();
        String parentId = message.getParentId();
        String command = message.getCommand();
        boolean shadowed = message.getShadowed();
        Map<String, String> i18n = message.getI18n();
        List<User> mentionedUsers = message.getMentionedUsers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(mentionedUsers, 10));
        Iterator<T> it = mentionedUsers.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        List<String> mentionedUsersIds = message.getMentionedUsersIds();
        List<User> threadParticipants = message.getThreadParticipants();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(threadParticipants, 10));
        Iterator<T> it3 = threadParticipants.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((User) it3.next()).getId());
        }
        boolean showInChannel = message.getShowInChannel();
        boolean silent = message.getSilent();
        boolean pinned = message.getPinned();
        Date pinnedAt = message.getPinnedAt();
        Date pinExpires = message.getPinExpires();
        User pinnedBy = message.getPinnedBy();
        String id6 = pinnedBy != null ? pinnedBy.getId() : null;
        MessageModerationDetails moderationDetails = message.getModerationDetails();
        ModerationDetailsEntity entity = moderationDetails != null ? ModerationDetailsMapperKt.toEntity(moderationDetails) : null;
        Poll poll = message.getPoll();
        String id7 = poll != null ? poll.getId() : null;
        MessageReminderInfo reminder = message.getReminder();
        ReplyMessageInnerEntity replyMessageInnerEntity = new ReplyMessageInnerEntity(id4, cid, id5, text, html, type, syncStatus, replyCount, deletedReplyCount, createdAt, createdLocallyAt, updatedAt, updatedLocallyAt, deletedAt, arrayList, mentionedUsersIds, parentId, command, shadowed, i18n, showInChannel, null, silent, null, pinned, pinnedAt, pinExpires, id6, arrayList2, entity, null, id7, null, reminder != null ? toEntity(reminder) : null, message.getChannelRole(), 1084227584, 1, null);
        List<Attachment> attachments = message.getAttachments();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
        int i13 = 0;
        for (Object obj : attachments) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList3.add(AttachmentMapperKt.toReplyEntity((Attachment) obj, message.getId(), i13));
            i13 = i14;
        }
        return new ReplyMessageEntity(replyMessageInnerEntity, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0997  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0997 -> B:40:0x09be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0b02 -> B:48:0x0b2b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0c75 -> B:56:0x0ca1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0f22 -> B:15:0x0393). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object toModel(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r137, c93.InterfaceC4351m r138, c93.InterfaceC4351m r139, c93.InterfaceC4351m r140, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Message> r141) {
        /*
            Method dump skipped, instruction units count: 4992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toModel(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity, c93.m, c93.m, c93.m, q83.d):java.lang.Object");
    }

    public static final DraftMessageEntity toEntity(DraftMessage draftMessage) {
        AbstractC22676k.m65750j(draftMessage, "<this>");
        String id4 = draftMessage.getId();
        String cid = draftMessage.getCid();
        String parentId = draftMessage.getParentId();
        List<String> mentionedUsersIds = draftMessage.getMentionedUsersIds();
        boolean silent = draftMessage.getSilent();
        boolean showInChannel = draftMessage.getShowInChannel();
        Message replyMessage = draftMessage.getReplyMessage();
        return new DraftMessageEntity(id4, cid, draftMessage.getText(), parentId, mentionedUsersIds, silent, showInChannel, replyMessage != null ? replyMessage.getId() : null, draftMessage.getCommand(), draftMessage.getArgs(), draftMessage.getExtraData());
    }

    public static final ReminderInfoEntity toEntity(MessageReminderInfo messageReminderInfo) {
        AbstractC22676k.m65750j(messageReminderInfo, "<this>");
        return new ReminderInfoEntity(messageReminderInfo.getRemindAt(), messageReminderInfo.getCreatedAt(), messageReminderInfo.getUpdatedAt());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0621  */
    /* JADX WARN: Code duplicated, block: B:45:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0584 -> B:38:0x05a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x06cf -> B:20:0x02d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object toModel(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity r80, c93.InterfaceC4351m r81, c93.InterfaceC4351m r82, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Message> r83) {
        /*
            Method dump skipped, instruction units count: 2647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toModel(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity, c93.m, c93.m, q83.d):java.lang.Object");
    }

    public static final MessageReminderInfo toModel(ReminderInfoEntity reminderInfoEntity) {
        AbstractC22676k.m65750j(reminderInfoEntity, "<this>");
        return new MessageReminderInfo(reminderInfoEntity.getRemindAt(), reminderInfoEntity.getCreatedAt(), reminderInfoEntity.getUpdatedAt());
    }
}
