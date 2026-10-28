package io.getstream.chat.android.client.extensions.internal;

import androidx.profileinstaller.ProfileVerifier;
import com.mapbox.common.HttpHeaders;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u001a8\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u001a \u0010\u0000\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0012*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0007\u001a\u0016\u0010\u0015\u001a\u00020\u0012*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0007\u001a\u0016\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0007\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0002H\u0007\u001a&\u0010\u0017\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0012H\u0007\u001a\f\u0010\u001b\u001a\u00020\u0012*\u00020\u0002H\u0007\u001a\u0014\u0010\u001c\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0007H\u0000\"\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m65681d2 = {"updateUsers", "", "Lio/getstream/chat/android/models/Message;", "", "users", "", "", "Lio/getstream/chat/android/models/User;", "populateMentions", "channel", "Lio/getstream/chat/android/models/Channel;", "NEVER", "Ljava/util/Date;", "getNEVER$annotations", "()V", "getNEVER", "()Ljava/util/Date;", "wasCreatedAfterOrAt", "", HttpHeaders.DATE, "wasCreatedAfter", "wasCreatedBefore", "wasCreatedBeforeOrAt", "shouldIncrementUnreadCount", "currentUserId", "lastMessageAtDate", "isChannelMuted", "hasPendingAttachments", "containsUserMention", UserState.Sources.USER, "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageKt {
    private static final Date NEVER = new Date(0);

    public static final boolean containsUserMention(Message message, User user) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(user, "user");
        if (message.getMentionedUsersIds().contains(user.getId())) {
            return true;
        }
        List<User> mentionedUsers = message.getMentionedUsers();
        if ((mentionedUsers instanceof Collection) && mentionedUsers.isEmpty()) {
            return false;
        }
        Iterator<T> it = mentionedUsers.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((User) it.next()).getId(), user.getId())) {
                return true;
            }
        }
        return false;
    }

    public static final Date getNEVER() {
        return NEVER;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getNEVER$annotations() {
    }

    @InternalStreamChatApi
    public static final boolean hasPendingAttachments(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        List<Attachment> attachments = message.getAttachments();
        if ((attachments instanceof Collection) && attachments.isEmpty()) {
            return false;
        }
        for (Attachment attachment : attachments) {
            if ((attachment.getUploadState() instanceof Attachment.UploadState.InProgress) || (attachment.getUploadState() instanceof Attachment.UploadState.Idle)) {
                return true;
            }
        }
        return false;
    }

    @InternalStreamChatApi
    public static final Message populateMentions(Message message, Channel channel) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(channel, "channel");
        if (!AbstractC39414r.m125875T(message.getText(), '@', false)) {
            return message;
        }
        String lowerCase = message.getText().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        Set setM74101H1 = AbstractC25265s.m74101H1(message.getMentionedUsersIds());
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Member member : members) {
            String lowerCase2 = member.getUser().getName().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            String id4 = AbstractC39414r.m125876U(lowerCase, "@".concat(lowerCase2), false) ? member.getUser().getId() : null;
            if (id4 != null) {
                arrayList.add(id4);
            }
        }
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : AbstractC25265s.m74093D1(AbstractC12350b.m34556E(setM74101H1, arrayList)), ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    @InternalStreamChatApi
    public static final boolean shouldIncrementUnreadCount(Message message, String currentUserId, Date date, boolean z4) {
        boolean z13;
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        if (z4) {
            return false;
        }
        if (message.getCreatedAt() == null || date == null) {
            z13 = true;
        } else {
            Date createdAt = message.getCreatedAt();
            AbstractC22676k.m65747g(createdAt);
            if (createdAt.compareTo(date) > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        return (AbstractC22676k.m65745e(message.getUser().getId(), currentUserId) || message.getSilent() || message.getShadowed() || !z13) ? false : true;
    }

    @InternalStreamChatApi
    public static final List<Message> updateUsers(Collection<Message> collection, Map<String, User> users) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(users, "users");
        Collection<Message> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(updateUsers((Message) it.next(), users));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v1, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @InternalStreamChatApi
    public static final List<User> users(Message message) {
        List<Vote> votes;
        AbstractC22676k.m65750j(message, "<this>");
        List<Reaction> latestReactions = message.getLatestReactions();
        ArrayList arrayList = new ArrayList();
        Iterator it = latestReactions.iterator();
        while (it.hasNext()) {
            User user = ((Reaction) it.next()).getUser();
            if (user != null) {
                arrayList.add(user);
            }
        }
        ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(message.getUser(), arrayList);
        Message replyTo = message.getReplyTo();
        List<User> listUsers = replyTo != null ? users(replyTo) : null;
        ?? arrayList2 = C25271y.f99162w;
        ?? r10 = listUsers;
        if (listUsers == null) {
            r10 = arrayList2;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(arrayListM74128f1, (Iterable) r10), message.getMentionedUsers());
        List<Reaction> ownReactions = message.getOwnReactions();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = ownReactions.iterator();
        while (it3.hasNext()) {
            User user2 = ((Reaction) it3.next()).getUser();
            if (user2 != null) {
                arrayList3.add(user2);
            }
        }
        ArrayList arrayListM74129g2 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(arrayListM74129g1, arrayList3), message.getThreadParticipants());
        User pinnedBy = message.getPinnedBy();
        ArrayList arrayListM74129g3 = AbstractC25265s.m74129g1(arrayListM74129g2, pinnedBy != null ? AbstractC37056f.m118958J(pinnedBy) : arrayList2);
        Poll poll = message.getPoll();
        if (poll != null && (votes = poll.getVotes()) != null) {
            arrayList2 = new ArrayList();
            Iterator it4 = votes.iterator();
            while (it4.hasNext()) {
                User user3 = ((Vote) it4.next()).getUser();
                if (user3 != null) {
                    arrayList2.add(user3);
                }
            }
        }
        return AbstractC25265s.m74129g1(arrayListM74129g3, arrayList2);
    }

    @InternalStreamChatApi
    public static final boolean wasCreatedAfter(Message message, Date date) {
        AbstractC22676k.m65750j(message, "<this>");
        return MessageExtensionsKt.getCreatedAtOrDefault(message, NEVER).compareTo(date) > 0;
    }

    @InternalStreamChatApi
    public static final boolean wasCreatedAfterOrAt(Message message, Date date) {
        AbstractC22676k.m65750j(message, "<this>");
        return MessageExtensionsKt.getCreatedAtOrDefault(message, NEVER).compareTo(date) >= 0;
    }

    @InternalStreamChatApi
    public static final boolean wasCreatedBefore(Message message, Date date) {
        AbstractC22676k.m65750j(message, "<this>");
        return MessageExtensionsKt.getCreatedAtOrDefault(message, NEVER).compareTo(date) < 0;
    }

    @InternalStreamChatApi
    public static final boolean wasCreatedBeforeOrAt(Message message, Date date) {
        AbstractC22676k.m65750j(message, "<this>");
        return MessageExtensionsKt.getCreatedAtOrDefault(message, NEVER).compareTo(date) <= 0;
    }

    @InternalStreamChatApi
    public static final Message updateUsers(Message message, Map<String, User> users) {
        User user;
        String id4;
        Message message2 = message;
        AbstractC22676k.m65750j(message2, "<this>");
        AbstractC22676k.m65750j(users, "users");
        List<User> listUsers = users(message2);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listUsers, 10));
        Iterator it = ((ArrayList) listUsers).iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (users.containsKey((String) it3.next())) {
                    if (!users.containsKey(message2.getUser().getId()) || (user = users.get(message2.getUser().getId())) == null) {
                        user = message2.getUser();
                    }
                    User user2 = user;
                    ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(ReactionKt.updateByUsers(message2.getLatestReactions(), users));
                    Message replyTo = message2.getReplyTo();
                    Message messageUpdateUsers = replyTo != null ? updateUsers(replyTo, users) : null;
                    ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(UserKt.updateUsers(message2.getMentionedUsers(), users));
                    ArrayList arrayListM74097F3 = AbstractC25265s.m74097F1(UserKt.updateUsers(message2.getThreadParticipants(), users));
                    User pinnedBy = message2.getPinnedBy();
                    if (pinnedBy == null || (id4 = pinnedBy.getId()) == null) {
                        id4 = "";
                    }
                    User pinnedBy2 = users.get(id4);
                    if (pinnedBy2 == null) {
                        pinnedBy2 = message2.getPinnedBy();
                    }
                    return message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : arrayListM74097F2, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : arrayListM74097F1, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : user2, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : messageUpdateUsers, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : pinnedBy2, (65535 & 16) != 0 ? message2.threadParticipants : arrayListM74097F3, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false);
                }
                message2 = message;
            }
        }
        return message;
    }

    @InternalStreamChatApi
    public static final Map<String, Message> updateUsers(Map<String, Message> map, Map<String, User> users) {
        AbstractC22676k.m65750j(map, "<this>");
        AbstractC22676k.m65750j(users, "users");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), updateUsers((Message) entry.getValue(), users));
        }
        return linkedHashMap;
    }
}
