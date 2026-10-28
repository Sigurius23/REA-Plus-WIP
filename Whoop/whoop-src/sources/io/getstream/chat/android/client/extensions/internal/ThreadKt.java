package io.getstream.chat.android.client.extensions.internal;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.internal.state.utils.internal.ListKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageType;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.ThreadInfo;
import io.getstream.chat.android.models.ThreadParticipant;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p163g1.C15160u4;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007\u001a\u0014\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0007\u001a$\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0014\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0002\u001a$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\u0006\u0010\r\u001a\u00020\tH\u0002\"\u001e\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m65681d2 = {"PARTICIPANT_BY_LAST_REPLY", "Ljava/util/Comparator;", "Lio/getstream/chat/android/models/ThreadParticipant;", "Lkotlin/Comparator;", "sortedByLastReply", "", "updateParentOrReply", "Lio/getstream/chat/android/models/Thread;", "message", "Lio/getstream/chat/android/models/Message;", "updateParent", "parent", "upsertReply", MessageType.REPLY, "markAsReadByUser", "threadInfo", "Lio/getstream/chat/android/models/ThreadInfo;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "createdAt", "Ljava/util/Date;", "applyThreadUpdatedEventChanges", "markAsUnreadByUser", "upsertMessageInList", "newMessage", "messages", "upsertThreadParticipantInList", "newParticipant", "participants", "updateReadCounts", "Lio/getstream/chat/android/models/ChannelUserRead;", "read", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadKt {
    private static final Comparator<ThreadParticipant> PARTICIPANT_BY_LAST_REPLY = new ThreadKt$special$$inlined$compareByDescending$1();

    @InternalStreamChatApi
    public static final Thread applyThreadUpdatedEventChanges(Thread thread, ThreadInfo threadInfo) {
        AbstractC22676k.m65750j(thread, "<this>");
        AbstractC22676k.m65750j(threadInfo, "threadInfo");
        if (!AbstractC22676k.m65745e(thread.getParentMessageId(), threadInfo.getParentMessageId())) {
            return thread;
        }
        return Thread.copy$default(thread, 0, null, null, null, null, null, null, 0, null, null, null, threadInfo.getUpdatedAt(), null, threadInfo.getTitle(), null, null, null, threadInfo.getExtraData(), 120831, null);
    }

    @InternalStreamChatApi
    public static final Thread markAsReadByUser(Thread thread, ThreadInfo threadInfo, User user, Date date) {
        AbstractC22676k.m65750j(thread, "<this>");
        AbstractC22676k.m65750j(threadInfo, "threadInfo");
        User user2 = user;
        AbstractC22676k.m65750j(user2, "user");
        Date createdAt = date;
        AbstractC22676k.m65750j(createdAt, "createdAt");
        if (!AbstractC22676k.m65745e(thread.getParentMessageId(), threadInfo.getParentMessageId())) {
            return thread;
        }
        List<ChannelUserRead> read = thread.getRead();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        for (ChannelUserRead channelUserReadCopy$default : read) {
            if (AbstractC22676k.m65745e(channelUserReadCopy$default.getUser().getId(), user2.getId())) {
                channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserReadCopy$default, user2, createdAt, 0, null, null, null, null, 120, null);
            }
            arrayList.add(channelUserReadCopy$default);
            user2 = user;
            createdAt = date;
        }
        int activeParticipantCount = threadInfo.getActiveParticipantCount();
        Date deletedAt = threadInfo.getDeletedAt();
        Date lastMessageAt = threadInfo.getLastMessageAt();
        if (lastMessageAt == null) {
            lastMessageAt = thread.getLastMessageAt();
        }
        Date date2 = lastMessageAt;
        Message parentMessage = threadInfo.getParentMessage();
        if (parentMessage == null) {
            parentMessage = thread.getParentMessage();
        }
        return Thread.copy$default(thread, activeParticipantCount, null, null, null, parentMessage, null, null, threadInfo.getParticipantCount(), null, date2, null, threadInfo.getUpdatedAt(), deletedAt, threadInfo.getTitle(), null, arrayList, null, null, 214382, null);
    }

    @InternalStreamChatApi
    public static final Thread markAsUnreadByUser(Thread thread, User user, Date date) {
        AbstractC22676k.m65750j(thread, "<this>");
        User user2 = user;
        AbstractC22676k.m65750j(user2, "user");
        Date createdAt = date;
        AbstractC22676k.m65750j(createdAt, "createdAt");
        List<ChannelUserRead> read = thread.getRead();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        for (ChannelUserRead channelUserReadCopy$default : read) {
            if (AbstractC22676k.m65745e(channelUserReadCopy$default.getUser().getId(), user2.getId())) {
                channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserReadCopy$default, user2, createdAt, channelUserReadCopy$default.getUnreadMessages() + 1, null, null, null, null, 120, null);
            }
            arrayList.add(channelUserReadCopy$default);
            user2 = user;
            createdAt = date;
        }
        return Thread.copy$default(thread, 0, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, arrayList, null, null, 229375, null);
    }

    @InternalStreamChatApi
    public static final List<ThreadParticipant> sortedByLastReply(List<ThreadParticipant> list) {
        AbstractC22676k.m65750j(list, "<this>");
        return AbstractC25265s.m74152u1(list, PARTICIPANT_BY_LAST_REPLY);
    }

    @InternalStreamChatApi
    public static final Thread updateParent(Thread thread, Message parent) {
        AbstractC22676k.m65750j(thread, "<this>");
        AbstractC22676k.m65750j(parent, "parent");
        if (!AbstractC22676k.m65745e(thread.getParentMessageId(), parent.getId())) {
            return thread;
        }
        Poll poll = parent.getPoll();
        if (poll == null) {
            poll = thread.getParentMessage().getPoll();
        }
        Message messageCopy = parent.copy(((-1) & 1) != 0 ? parent.id : null, ((-1) & 2) != 0 ? parent.cid : null, ((-1) & 4) != 0 ? parent.text : null, ((-1) & 8) != 0 ? parent.html : null, ((-1) & 16) != 0 ? parent.parentId : null, ((-1) & 32) != 0 ? parent.command : null, ((-1) & 64) != 0 ? parent.attachments : null, ((-1) & 128) != 0 ? parent.mentionedUsersIds : null, ((-1) & 256) != 0 ? parent.mentionedUsers : null, ((-1) & 512) != 0 ? parent.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? parent.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? parent.reactionCounts : null, ((-1) & 4096) != 0 ? parent.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? parent.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? parent.syncStatus : null, ((-1) & 32768) != 0 ? parent.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? parent.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? parent.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? parent.createdAt : null, ((-1) & 524288) != 0 ? parent.updatedAt : null, ((-1) & 1048576) != 0 ? parent.deletedAt : null, ((-1) & 2097152) != 0 ? parent.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? parent.createdLocallyAt : null, ((-1) & 8388608) != 0 ? parent.user : null, ((-1) & 16777216) != 0 ? parent.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? parent.silent : false, ((-1) & 67108864) != 0 ? parent.shadowed : false, ((-1) & 134217728) != 0 ? parent.i18n : null, ((-1) & 268435456) != 0 ? parent.showInChannel : false, ((-1) & 536870912) != 0 ? parent.channelInfo : null, ((-1) & 1073741824) != 0 ? parent.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? parent.replyMessageId : null, (65535 & 1) != 0 ? parent.pinned : false, (65535 & 2) != 0 ? parent.pinnedAt : null, (65535 & 4) != 0 ? parent.pinExpires : null, (65535 & 8) != 0 ? parent.pinnedBy : null, (65535 & 16) != 0 ? parent.threadParticipants : null, (65535 & 32) != 0 ? parent.skipPushNotification : false, (65535 & 64) != 0 ? parent.skipEnrichUrl : false, (65535 & 128) != 0 ? parent.moderationDetails : null, (65535 & 256) != 0 ? parent.moderation : null, (65535 & 512) != 0 ? parent.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? parent.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? parent.restrictedVisibility : null, (65535 & 4096) != 0 ? parent.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? parent.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? parent.channelRole : null, (65535 & 32768) != 0 ? parent.deletedForMe : false);
        Date deletedAt = parent.getDeletedAt();
        Date updatedAt = parent.getUpdatedAt();
        if (updatedAt == null) {
            updatedAt = thread.getUpdatedAt();
        }
        return Thread.copy$default(thread, 0, null, null, null, messageCopy, null, null, 0, null, null, null, updatedAt, deletedAt, null, null, null, null, null, 255983, null);
    }

    @InternalStreamChatApi
    public static final Thread updateParentOrReply(Thread thread, Message message) {
        AbstractC22676k.m65750j(thread, "<this>");
        AbstractC22676k.m65750j(message, "message");
        String parentMessageId = thread.getParentMessageId();
        if (AbstractC22676k.m65745e(parentMessageId, message.getId())) {
            return updateParent(thread, message);
        }
        return AbstractC22676k.m65745e(parentMessageId, message.getParentId()) ? upsertReply(thread, message) : thread;
    }

    private static final List<ChannelUserRead> updateReadCounts(List<ChannelUserRead> list, Message message) {
        List<ChannelUserRead> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ChannelUserRead channelUserReadCopy$default : list2) {
            if (!AbstractC22676k.m65745e(channelUserReadCopy$default.getUser().getId(), message.getUser().getId())) {
                channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserReadCopy$default, null, null, channelUserReadCopy$default.getUnreadMessages() + 1, null, null, null, null, 123, null);
            }
            arrayList.add(channelUserReadCopy$default);
        }
        return arrayList;
    }

    private static final List<Message> upsertMessageInList(Message message, List<Message> list) {
        List<Message> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((Message) it.next()).getId(), message.getId())) {
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    for (Message message2 : list2) {
                        if (AbstractC22676k.m65745e(message2.getId(), message.getId())) {
                            message2 = message;
                        }
                        arrayList.add(message2);
                    }
                    return arrayList;
                }
            }
        }
        return AbstractC25265s.m74129g1(list, AbstractC37056f.m118958J(message));
    }

    @InternalStreamChatApi
    public static final Thread upsertReply(Thread thread, Message reply) {
        AbstractC22676k.m65750j(thread, "<this>");
        AbstractC22676k.m65750j(reply, "reply");
        if (!AbstractC22676k.m65745e(thread.getParentMessageId(), reply.getParentId())) {
            return thread;
        }
        List<Message> listUpsertMessageInList = upsertMessageInList(reply, thread.getLatestReplies());
        boolean z4 = ((ArrayList) listUpsertMessageInList).size() > thread.getLatestReplies().size();
        List listM74152u1 = AbstractC25265s.m74152u1(listUpsertMessageInList, new ThreadKt$upsertReply$$inlined$sortedBy$1());
        Message message = (Message) AbstractC25265s.m74114R0(listM74152u1);
        Date createdAtOrNull = message != null ? MessageExtensionsKt.getCreatedAtOrNull(message) : null;
        List<ThreadParticipant> listUpsertThreadParticipantInList = z4 ? upsertThreadParticipantInList(new ThreadParticipant(reply.getUser(), MessageExtensionsKt.getCreatedAtOrNull(reply)), thread.getThreadParticipants()) : thread.getThreadParticipants();
        int size = z4 ? listUpsertThreadParticipantInList.size() : thread.getParticipantCount();
        List<ChannelUserRead> listUpdateReadCounts = z4 ? updateReadCounts(thread.getRead(), reply) : thread.getRead();
        Date lastMessageAt = createdAtOrNull == null ? thread.getLastMessageAt() : createdAtOrNull;
        if (createdAtOrNull == null) {
            createdAtOrNull = thread.getUpdatedAt();
        }
        return Thread.copy$default(thread, 0, null, null, null, null, null, null, size, listUpsertThreadParticipantInList, lastMessageAt, null, createdAtOrNull, null, null, listM74152u1, listUpdateReadCounts, null, null, 210047, null);
    }

    private static final List<ThreadParticipant> upsertThreadParticipantInList(ThreadParticipant threadParticipant, List<ThreadParticipant> list) {
        return ListKt.upsertSorted$default(list, threadParticipant, new C15160u4(5), PARTICIPANT_BY_LAST_REPLY, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String upsertThreadParticipantInList$lambda$6(ThreadParticipant it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getUserId();
    }
}
