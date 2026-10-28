package io.getstream.chat.android.client.utils.message;

import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.errors.cause.MessageModerationDeletedException;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.utils.date.DateUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.AttachmentType;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageModerationAction;
import io.getstream.chat.android.models.MessageModerationDetails;
import io.getstream.chat.android.models.MessageType;
import io.getstream.chat.android.models.Moderation;
import io.getstream.chat.android.models.ModerationAction;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u0005*\u00020\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u0005*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0012\u0010\t\u001a\u0011\u0010\u0013\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0013\u0010\t\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0014\u0010\t\u001a\u0011\u0010\u0015\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0015\u0010\t\u001a\u0011\u0010\u0016\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0016\u0010\t\u001a\u0011\u0010\u0017\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0017\u0010\t\u001a\u0011\u0010\u0018\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0018\u0010\t\u001a\u0011\u0010\u0019\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u0019\u0010\t\u001a\u0011\u0010\u001a\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u001a\u0010\t\u001a\u0011\u0010\u001b\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u001b\u0010\t\u001a\u0011\u0010\u001c\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u001c\u0010\t\u001a\u0011\u0010\u001d\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u001d\u0010\t\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u001e\u0010\t\u001a\u0011\u0010\u001f\u001a\u00020\u0005*\u00020\u0001¢\u0006\u0004\b\u001f\u0010\t\u001a\u001d\u0010\"\u001a\u00020\u0005*\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0005*\u00020\u0001H\u0007¢\u0006\u0004\b$\u0010\t\u001a\u0013\u0010%\u001a\u00020\u0005*\u00020\u0001H\u0007¢\u0006\u0004\b%\u0010\t\u001a\u0013\u0010&\u001a\u00020\u0005*\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\t\u001a\u001b\u0010'\u001a\u00020\u0005*\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b'\u0010#\u001a#\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(*\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010,\u001a\u00020\u0001*\u00020\u0001H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010,\u001a\u00020.*\u00020.H\u0000¢\u0006\u0004\b,\u0010/\u001a\u000f\u00100\u001a\u00020 H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00102\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b2\u0010\t\"\u0014\u00104\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105\" \u00108\u001a\b\u0012\u0004\u0012\u000207068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\" \u0010<\u001a\b\u0012\u0004\u0012\u00020 068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006>"}, m65681d2 = {"", "Lio/getstream/chat/android/models/Message;", "latestOrNull", "(Ljava/util/List;)Lio/getstream/chat/android/models/Message;", "that", "", "createdAfter", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z", "isFailed", "(Lio/getstream/chat/android/models/Message;)Z", "isErrorOrFailed", "isDeleted", "Lkotlin/Function0;", "", "now", "isPinned", "(Lio/getstream/chat/android/models/Message;Lc93/a;)Z", "isPinExpired", "isRegular", "isEphemeral", "isSystem", "isError", "isGiphy", "hasAudioRecording", "isPoll", "isPollClosed", "isGiphyEphemeral", "isThreadStart", "isThreadReply", "belongsToThread", "isReply", "hasSharedLocation", "", "currentUserId", "isMine", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z", "isModerationBounce", "isModerationBlock", "isModerationFlag", "isModerationError", "Ln23/h;", "Ll83/a0;", "shouldDeleteRemote", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ln23/h;", "ensureId", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/DraftMessage;", "(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/models/DraftMessage;", "fallbackMessageId", "()Ljava/lang/String;", "isLocalOnly", "", "ITEM_COUNT_OF_TWO", "I", "", "Lio/getstream/chat/android/models/SyncStatus;", "LocalOnlySyncStatuses", "Ljava/util/Set;", "getLocalOnlySyncStatuses", "()Ljava/util/Set;", "LocalOnlyMessageTypes", "getLocalOnlyMessageTypes", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageUtils {
    private static final int ITEM_COUNT_OF_TWO = 2;
    private static final Set<SyncStatus> LocalOnlySyncStatuses = AbstractC25260n.m74059b1(new SyncStatus[]{SyncStatus.SYNC_NEEDED, SyncStatus.IN_PROGRESS, SyncStatus.AWAITING_ATTACHMENTS, SyncStatus.FAILED_PERMANENTLY});
    private static final Set<String> LocalOnlyMessageTypes = AbstractC25260n.m74059b1(new String[]{"ephemeral", "error"});

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.message.MessageUtils$isPinned$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 176)
    public static final class C194531 implements InterfaceC4339a {
        public static final C194531 INSTANCE = new C194531();

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final boolean belongsToThread(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return isThreadStart(message) || isThreadReply(message);
    }

    @InternalStreamChatApi
    public static final boolean createdAfter(Message message, Message that) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(that, "that");
        return DateUtils.after(MessageExtensionsKt.getCreatedAtOrNull(message), MessageExtensionsKt.getCreatedAtOrNull(that));
    }

    public static final Message ensureId(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        String id4 = message.getId();
        if (AbstractC39414r.m125890i0(id4)) {
            id4 = null;
        }
        if (id4 == null) {
            id4 = fallbackMessageId();
        }
        return message.copy(((-1) & 1) != 0 ? message.id : id4, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    public static final String fallbackMessageId() {
        String lowerCase = AbstractC11895b.m31995n("toString(...)").toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final Set<String> getLocalOnlyMessageTypes() {
        return LocalOnlyMessageTypes;
    }

    public static final Set<SyncStatus> getLocalOnlySyncStatuses() {
        return LocalOnlySyncStatuses;
    }

    public static final boolean hasAudioRecording(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        List<Attachment> attachments = message.getAttachments();
        if ((attachments instanceof Collection) && attachments.isEmpty()) {
            return false;
        }
        Iterator<T> it = attachments.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((Attachment) it.next()).getType(), AttachmentType.AUDIO_RECORDING)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasSharedLocation(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getSharedLocation() != null;
    }

    public static final boolean isDeleted(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getDeletedAt() != null || message.getDeletedForMe();
    }

    public static final boolean isEphemeral(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(message.getType(), "ephemeral");
    }

    public static final boolean isError(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(message.getType(), "error");
    }

    @InternalStreamChatApi
    public static final boolean isErrorOrFailed(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return isError(message) || isFailed(message);
    }

    @InternalStreamChatApi
    public static final boolean isFailed(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getSyncStatus() == SyncStatus.FAILED_PERMANENTLY;
    }

    public static final boolean isGiphy(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(message.getCommand(), "giphy");
    }

    public static final boolean isGiphyEphemeral(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return isGiphy(message) && isEphemeral(message);
    }

    public static final boolean isLocalOnly(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return LocalOnlySyncStatuses.contains(message.getSyncStatus()) || LocalOnlyMessageTypes.contains(message.getType());
    }

    @InternalStreamChatApi
    public static final boolean isMine(Message message, String str) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(str, message.getUser().getId());
    }

    @InternalStreamChatApi
    public static final boolean isModerationBlock(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        MessageModerationDetails moderationDetails = message.getModerationDetails();
        return AbstractC22676k.m65745e(moderationDetails != null ? moderationDetails.getAction() : null, MessageModerationAction.INSTANCE.getBlock());
    }

    @InternalStreamChatApi
    public static final boolean isModerationBounce(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        MessageModerationDetails moderationDetails = message.getModerationDetails();
        if (AbstractC22676k.m65745e(moderationDetails != null ? moderationDetails.getAction() : null, MessageModerationAction.INSTANCE.getBounce())) {
            return true;
        }
        Moderation moderation = message.getModeration();
        return AbstractC22676k.m65745e(moderation != null ? moderation.getAction() : null, ModerationAction.INSTANCE.getBounce());
    }

    public static final boolean isModerationError(Message message, String str) {
        AbstractC22676k.m65750j(message, "<this>");
        return isMine(message, str) && isError(message) && isModerationBounce(message);
    }

    @InternalStreamChatApi
    public static final boolean isModerationFlag(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        MessageModerationDetails moderationDetails = message.getModerationDetails();
        if (AbstractC22676k.m65745e(moderationDetails != null ? moderationDetails.getAction() : null, MessageModerationAction.INSTANCE.getFlag())) {
            return true;
        }
        Moderation moderation = message.getModeration();
        return AbstractC22676k.m65745e(moderation != null ? moderation.getAction() : null, ModerationAction.INSTANCE.getFlag());
    }

    @InternalStreamChatApi
    public static final boolean isPinExpired(Message message, InterfaceC4339a now) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(now, "now");
        Date pinExpires = message.getPinExpires();
        return pinExpires != null && pinExpires.getTime() < ((Number) now.invoke()).longValue();
    }

    @InternalStreamChatApi
    public static final boolean isPinned(Message message, InterfaceC4339a now) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(now, "now");
        if (!message.getPinned() || isDeleted(message)) {
            return false;
        }
        Date pinExpires = message.getPinExpires();
        return pinExpires == null || pinExpires.getTime() >= ((Number) now.invoke()).longValue();
    }

    public static /* synthetic */ boolean isPinned$default(Message message, InterfaceC4339a now, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            now = C194531.INSTANCE;
        }
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(now, "now");
        if (!message.getPinned() || isDeleted(message)) {
            return false;
        }
        Date pinExpires = message.getPinExpires();
        return pinExpires == null || pinExpires.getTime() >= ((Number) now.invoke()).longValue();
    }

    public static final boolean isPoll(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getPoll() != null;
    }

    public static final boolean isPollClosed(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        Poll poll = message.getPoll();
        return poll != null && poll.getClosed();
    }

    public static final boolean isRegular(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(message.getType(), "regular");
    }

    public static final boolean isReply(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getReplyTo() != null;
    }

    public static final boolean isSystem(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(message.getType(), MessageType.SYSTEM);
    }

    public static final boolean isThreadReply(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        String parentId = message.getParentId();
        return !(parentId == null || parentId.length() == 0);
    }

    public static final boolean isThreadStart(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return !message.getThreadParticipants().isEmpty();
    }

    @InternalStreamChatApi
    public static final Message latestOrNull(List<Message> list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.size() < 2) {
            return (Message) AbstractC25265s.m74114R0(list);
        }
        Message message = (Message) AbstractC25265s.m74096F0(list);
        Message message2 = (Message) AbstractC25265s.m74112P0(list);
        return createdAfter(message2, message) ? message2 : message;
    }

    @InternalStreamChatApi
    public static final AbstractC26205h shouldDeleteRemote(Message message, String str) {
        AbstractC22676k.m65750j(message, "<this>");
        if (isModerationError(message, str)) {
            return new C26203f(new C26201d(AbstractC11266d.m30461o("Message with failed moderation has been deleted locally: ", message.getId()), new MessageModerationDeletedException(AbstractC11266d.m30461o("Message with failed moderation has been deleted locally: ", message.getId()))));
        }
        return (isError(message) || isEphemeral(message) || message.getSyncStatus() == SyncStatus.IN_PROGRESS || message.getSyncStatus() == SyncStatus.FAILED_PERMANENTLY) ? new C26203f(new C26198a("Message is local-only, don't call DeleteMessage API")) : new C26204g(C23454a0.f92919a);
    }

    public static final DraftMessage ensureId(DraftMessage draftMessage) {
        AbstractC22676k.m65750j(draftMessage, "<this>");
        String id4 = draftMessage.getId();
        if (AbstractC39414r.m125890i0(id4)) {
            id4 = null;
        }
        if (id4 == null) {
            id4 = fallbackMessageId();
        }
        return DraftMessage.copy$default(draftMessage, id4, null, null, null, null, null, null, false, false, null, null, null, 4094, null);
    }
}
