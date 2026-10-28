package io.getstream.chat.android.client.extensions.internal;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.ReactionGroup;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000b"}, m65681d2 = {"addMyReaction", "Lio/getstream/chat/android/models/Message;", "reaction", "Lio/getstream/chat/android/models/Reaction;", "enforceUnique", "", "removeMyReaction", "removeReactions", "userId", "", "type", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReactionsKt {
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    @InternalStreamChatApi
    public static final Message addMyReaction(Message message, Reaction reaction, boolean z4) {
        Date createdAt;
        Date createdAt2;
        ReactionGroup reactionGroup;
        Message messageRemoveReactions$default = message;
        AbstractC22676k.m65750j(messageRemoveReactions$default, "<this>");
        AbstractC22676k.m65750j(reaction, "reaction");
        if (z4) {
            messageRemoveReactions$default = removeReactions$default(messageRemoveReactions$default, reaction.getUserId(), null, 2, null);
        }
        Integer num = messageRemoveReactions$default.getReactionScores().get(reaction.getType());
        Map mapM73996e0 = AbstractC25247g0.m73996e0(messageRemoveReactions$default.getReactionScores(), new C23465k(reaction.getType(), Integer.valueOf(reaction.getScore() + (num != null ? num.intValue() : 0))));
        Integer num2 = messageRemoveReactions$default.getReactionCounts().get(reaction.getType());
        Map mapM73996e1 = AbstractC25247g0.m73996e0(messageRemoveReactions$default.getReactionCounts(), new C23465k(reaction.getType(), Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1)));
        ReactionGroup reactionGroup2 = messageRemoveReactions$default.getReactionGroups().get(reaction.getType());
        if (reactionGroup2 != null) {
            int score = reaction.getScore() + reactionGroup2.getSumScore();
            int count = reactionGroup2.getCount() + 1;
            Date createdAt3 = reaction.getCreatedAt();
            if (createdAt3 == null && (createdAt3 = reaction.getCreatedLocallyAt()) == null) {
                createdAt3 = new Date();
            }
            reactionGroup = ReactionGroup.copy$default(reactionGroup2, null, count, score, null, createdAt3, 9, null);
            if (reactionGroup == null) {
                String type = reaction.getType();
                int score2 = reaction.getScore();
                createdAt = reaction.getCreatedAt();
                if (createdAt == null && (createdAt = reaction.getCreatedLocallyAt()) == null) {
                    createdAt = new Date();
                }
                Date date = createdAt;
                createdAt2 = reaction.getCreatedAt();
                if (createdAt2 == null && (createdAt2 = reaction.getCreatedLocallyAt()) == null) {
                    createdAt2 = new Date();
                }
                reactionGroup = new ReactionGroup(type, 1, score2, date, createdAt2);
            }
        } else {
            String type2 = reaction.getType();
            int score3 = reaction.getScore();
            createdAt = reaction.getCreatedAt();
            if (createdAt == null) {
                createdAt = new Date();
            }
            Date date2 = createdAt;
            createdAt2 = reaction.getCreatedAt();
            if (createdAt2 == null) {
                createdAt2 = new Date();
            }
            reactionGroup = new ReactionGroup(type2, 1, score3, date2, createdAt2);
        }
        Message message2 = messageRemoveReactions$default;
        return message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : mapM73996e1, ((-1) & 4096) != 0 ? message2.reactionScores : mapM73996e0, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : AbstractC25247g0.m73996e0(messageRemoveReactions$default.getReactionGroups(), new C23465k(reaction.getType(), reactionGroup)), ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : AbstractC25265s.m74128f1(reaction, messageRemoveReactions$default.getLatestReactions()), ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : AbstractC25265s.m74128f1(reaction, messageRemoveReactions$default.getOwnReactions()), ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false);
    }

    public static /* synthetic */ Message addMyReaction$default(Message message, Reaction reaction, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return addMyReaction(message, reaction, z4);
    }

    @InternalStreamChatApi
    public static final Message removeMyReaction(Message message, Reaction reaction) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(reaction, "reaction");
        return removeReactions(message, reaction.getUserId(), reaction.getType());
    }

    private static final Message removeReactions(Message message, String str, String str2) {
        Set setM74103I1;
        ArrayList arrayList;
        if (str2 != null) {
            List<Reaction> ownReactions = message.getOwnReactions();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : ownReactions) {
                Reaction reaction = (Reaction) obj;
                if (AbstractC22676k.m65745e(reaction.getType(), str2) && AbstractC22676k.m65745e(reaction.getUserId(), str)) {
                    arrayList2.add(obj);
                }
            }
            setM74103I1 = AbstractC25265s.m74103I1(arrayList2);
        } else {
            setM74103I1 = AbstractC25265s.m74103I1(message.getOwnReactions());
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(message.getReactionScores());
        LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(message.getReactionCounts());
        LinkedHashMap linkedHashMapM74003l2 = AbstractC25247g0.m74003l0(message.getReactionGroups());
        Set<Reaction> set = setM74103I1;
        for (Reaction reaction2 : set) {
            Integer num = message.getReactionScores().get(reaction2.getType());
            if (num != null) {
                int iIntValue = num.intValue() - reaction2.getScore();
                if (iIntValue > 0) {
                    linkedHashMapM74003l0.put(reaction2.getType(), Integer.valueOf(iIntValue));
                } else {
                    linkedHashMapM74003l0.remove(reaction2.getType());
                }
            }
            Integer num2 = message.getReactionCounts().get(reaction2.getType());
            if (num2 != null) {
                int iIntValue2 = num2.intValue() - 1;
                if (iIntValue2 > 0) {
                    linkedHashMapM74003l1.put(reaction2.getType(), Integer.valueOf(iIntValue2));
                } else {
                    linkedHashMapM74003l1.remove(reaction2.getType());
                }
            }
            ReactionGroup reactionGroup = message.getReactionGroups().get(reaction2.getType());
            if (reactionGroup != null) {
                ReactionGroup reactionGroupCopy$default = ReactionGroup.copy$default(reactionGroup, null, reactionGroup.getCount() - 1, reactionGroup.getSumScore() - reaction2.getScore(), null, null, 25, null);
                if (reactionGroupCopy$default.getSumScore() <= 0 || reactionGroupCopy$default.getCount() <= 0) {
                    linkedHashMapM74003l2.remove(reaction2.getType());
                } else {
                    linkedHashMapM74003l2.put(reaction2.getType(), reactionGroupCopy$default);
                }
            }
        }
        List listM74125c1 = str2 != null ? AbstractC25265s.m74125c1(message.getOwnReactions(), set) : C25271y.f99162w;
        if (str2 != null) {
            List<Reaction> latestReactions = message.getLatestReactions();
            arrayList = new ArrayList();
            for (Object obj2 : latestReactions) {
                Reaction reaction3 = (Reaction) obj2;
                if (!AbstractC22676k.m65745e(reaction3.getType(), str2) || !AbstractC22676k.m65745e(reaction3.getUserId(), str)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            List<Reaction> latestReactions2 = message.getLatestReactions();
            arrayList = new ArrayList();
            for (Object obj3 : latestReactions2) {
                if (!AbstractC22676k.m65745e(((Reaction) obj3).getUserId(), str)) {
                    arrayList.add(obj3);
                }
            }
        }
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : linkedHashMapM74003l1, ((-1) & 4096) != 0 ? message.reactionScores : linkedHashMapM74003l0, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : linkedHashMapM74003l2, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : arrayList, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : listM74125c1, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    public static /* synthetic */ Message removeReactions$default(Message message, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return removeReactions(message, str, str2);
    }
}
