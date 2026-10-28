package io.getstream.chat.android.client.attachment.worker;

import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.attachment.AttachmentUploader;
import io.getstream.chat.android.client.attachment.AttachmentsUploadStates;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.utils.ProgressCallback;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0018\u0010\u0014J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0019\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;", "", "", "channelType", "channelId", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "channelStateLogic", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lio/getstream/chat/android/client/attachment/AttachmentUploader;", "attachmentUploader", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/attachment/AttachmentUploader;)V", "Lio/getstream/chat/android/models/Message;", "message", "Ln23/h;", "Ll83/a0;", "sendAttachments", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "", "Lio/getstream/chat/android/models/Attachment;", "uploadAttachments", "updateMessages", "messageId", "uploadAttachmentsForMessage", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/attachment/AttachmentUploader;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "ProgressCallbackImpl", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UploadAttachmentsWorker {
    private final AttachmentUploader attachmentUploader;
    private final String channelId;
    private final ChannelMessagesUpdateLogic channelStateLogic;
    private final String channelType;
    private final ChatClient chatClient;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageRepository messageRepository;

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "", "messageId", AttachmentExtensionsKt.EXTRA_UPLOAD_ID, "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "channelStateLogic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;)V", "Lio/getstream/chat/android/models/Attachment$UploadState;", "newState", "Ll83/a0;", "updateAttachmentUploadState", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment$UploadState;)V", QueryParams.URL, "onSuccess", "(Ljava/lang/String;)V", "Ln23/e;", "error", "onError", "(Ln23/e;)V", "", "bytesUploaded", "totalBytes", "onProgress", "(JJ)V", "Ljava/lang/String;", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "lastProgressUpdateTime", "J", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ProgressCallbackImpl implements ProgressCallback {
        private final ChannelMessagesUpdateLogic channelStateLogic;
        private long lastProgressUpdateTime;
        private final String messageId;
        private final String uploadId;

        public ProgressCallbackImpl(String messageId, String uploadId, ChannelMessagesUpdateLogic channelStateLogic) {
            AbstractC22676k.m65750j(messageId, "messageId");
            AbstractC22676k.m65750j(uploadId, "uploadId");
            AbstractC22676k.m65750j(channelStateLogic, "channelStateLogic");
            this.messageId = messageId;
            this.uploadId = uploadId;
            this.channelStateLogic = channelStateLogic;
        }

        private final void updateAttachmentUploadState(String messageId, String uploadId, Attachment.UploadState newState) {
            Object next;
            Iterator it = ((Iterable) this.channelStateLogic.channelState().getMessages().getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((Message) next).getId(), messageId));
            Message message = (Message) next;
            if (message != null) {
                List<Attachment> attachments = message.getAttachments();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
                for (Attachment attachmentCopy$default : attachments) {
                    if (AbstractC22676k.m65745e(AttachmentExtensionsKt.getUploadId(attachmentCopy$default), uploadId)) {
                        attachmentCopy$default = Attachment.copy$default(attachmentCopy$default, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, newState, null, 786431, null);
                    }
                    arrayList.add(attachmentCopy$default);
                }
                this.channelStateLogic.upsertMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : AbstractC25265s.m74097F1(arrayList), ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
            }
        }

        @Override // io.getstream.chat.android.client.utils.ProgressCallback
        public final void onError(AbstractC26202e error) {
            AbstractC22676k.m65750j(error, "error");
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat:UploadWorker")) {
                C2343i.f9271c.log(enumC2341g, "Chat:UploadWorker", "[Progress.onError] #uploader; error: " + error, null);
            }
            updateAttachmentUploadState(this.messageId, this.uploadId, new Attachment.UploadState.Failed(error));
        }

        @Override // io.getstream.chat.android.client.utils.ProgressCallback
        public final void onProgress(long bytesUploaded, long totalBytes) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastProgressUpdateTime >= 200 || bytesUploaded >= totalBytes) {
                this.lastProgressUpdateTime = jCurrentTimeMillis;
                updateAttachmentUploadState(this.messageId, this.uploadId, new Attachment.UploadState.InProgress(bytesUploaded, totalBytes));
            }
        }

        @Override // io.getstream.chat.android.client.utils.ProgressCallback
        public final void onSuccess(String url) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat:UploadWorker")) {
                C2343i.f9271c.log(enumC2341g, "Chat:UploadWorker", AbstractC11266d.m30461o("[Progress.onSuccess] #uploader; url: ", url), null);
            }
            updateAttachmentUploadState(this.messageId, this.uploadId, Attachment.UploadState.Success.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$sendAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker", m100430f = "UploadAttachmentsWorker.kt", m100431l = {84, 97, 98}, m100432m = "sendAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190631 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C190631(InterfaceC30057d<? super C190631> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadAttachmentsWorker.this.sendAttachments(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$updateMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker", m100430f = "UploadAttachmentsWorker.kt", m100431l = {166}, m100432m = "updateMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190641 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C190641(InterfaceC30057d<? super C190641> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadAttachmentsWorker.this.updateMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker", m100430f = "UploadAttachmentsWorker.kt", m100431l = {113}, m100432m = "uploadAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190651 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C190651(InterfaceC30057d<? super C190651> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadAttachmentsWorker.this.uploadAttachments(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachments$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachments$2", m100430f = "UploadAttachmentsWorker.kt", m100431l = {142}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lio/getstream/chat/android/models/Attachment;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190662 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UploadAttachmentsWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190662(Message message, UploadAttachmentsWorker uploadAttachmentsWorker, InterfaceC30057d<? super C190662> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
            this.this$0 = uploadAttachmentsWorker;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C190662 c190662 = new C190662(this.$message, this.this$0, interfaceC30057d);
            c190662.L$0 = obj;
            return c190662;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<Attachment>> interfaceC30057d) {
            return ((C190662) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            List<Attachment> attachments = this.$message.getAttachments();
            UploadAttachmentsWorker uploadAttachmentsWorker = this.this$0;
            Message message = this.$message;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
            Iterator<T> it = attachments.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3006f0.m8711e(interfaceC2994c0, null, new UploadAttachmentsWorker$uploadAttachments$2$1$1((Attachment) it.next(), uploadAttachmentsWorker, message, null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            Object objM8712f = AbstractC3006f0.m8712f(arrayList, this);
            return objM8712f == enumC31071a ? enumC31071a : objM8712f;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachmentsForMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker", m100430f = "UploadAttachmentsWorker.kt", m100431l = {58, 61, 66}, m100432m = "uploadAttachmentsForMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190671 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C190671(InterfaceC30057d<? super C190671> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadAttachmentsWorker.this.uploadAttachmentsForMessage(null, this);
        }
    }

    public UploadAttachmentsWorker(String channelType, String channelId, ChannelMessagesUpdateLogic channelMessagesUpdateLogic, MessageRepository messageRepository, ChatClient chatClient, AttachmentUploader attachmentUploader) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(attachmentUploader, "attachmentUploader");
        this.channelType = channelType;
        this.channelId = channelId;
        this.channelStateLogic = channelMessagesUpdateLogic;
        this.messageRepository = messageRepository;
        this.chatClient = chatClient;
        this.attachmentUploader = attachmentUploader;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:UploadWorker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x0212  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:0: B:66:0x01b6->B:82:?, LOOP_END, SYNTHETIC] */
    public final Object sendAttachments(Message message, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C190631 c190631;
        Message message2;
        Attachment attachment;
        Message message3;
        int i13;
        List list;
        Message messageCopy;
        Message message4;
        List list2;
        List list3;
        Iterator it;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        C2345k logger2;
        InterfaceC2339e interfaceC2339e2;
        String str2;
        EnumC2341g enumC2341g2;
        if (interfaceC30057d instanceof C190631) {
            c190631 = (C190631) interfaceC30057d;
            int i14 = c190631.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c190631.label = i14 - Integer.MIN_VALUE;
            } else {
                c190631 = new C190631(interfaceC30057d);
            }
        } else {
            c190631 = new C190631(interfaceC30057d);
        }
        Object objUploadAttachments = c190631.result;
        Object obj = EnumC31071a.f128113w;
        int i15 = c190631.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i16 = 1;
        if (i15 != 0) {
            if (i15 == 1) {
                message2 = (Message) c190631.L$0;
                AbstractC34132o.m107864I(objUploadAttachments);
            } else {
                if (i15 == 2) {
                    i13 = c190631.I$0;
                    message3 = (Message) c190631.L$0;
                    AbstractC34132o.m107864I(objUploadAttachments);
                    list = (List) objUploadAttachments;
                    messageCopy = message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : list, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false);
                    c190631.L$0 = message3;
                    c190631.L$1 = list;
                    c190631.I$0 = i13;
                    c190631.label = 3;
                    if (updateMessages(messageCopy, c190631) != obj) {
                        message4 = message3;
                        list2 = list;
                    }
                    return obj;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c190631.L$1;
                message4 = (Message) c190631.L$0;
                AbstractC34132o.m107864I(objUploadAttachments);
            }
            list3 = list2;
            if ((list3 instanceof Collection) || !list3.isEmpty()) {
                it = list3.iterator();
                while (it.hasNext()) {
                    if (!AbstractC22676k.m65745e(((Attachment) it.next()).getUploadState(), Attachment.UploadState.Success.INSTANCE)) {
                        logger = getLogger();
                        interfaceC2339e = logger.f9275c;
                        str = logger.f9273a;
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[sendAttachments] #uploader; unable to upload attachments for message ", message4.getId()), null);
                        }
                        return new C26203f(new C26198a(AbstractC11266d.m30461o("Unable to upload attachments for message ", message4.getId())));
                    }
                }
            }
            logger2 = getLogger();
            interfaceC2339e2 = logger2.f9275c;
            str2 = logger2.f9273a;
            enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC11895b.m31996o("[sendAttachments] #uploader; all attachments for message ", message4.getId(), " uploaded"), null);
            }
            return new C26204g(c23454a0);
        }
        AbstractC34132o.m107864I(objUploadAttachments);
        if (this.chatClient.getCurrentUser() == null) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, "[sendAttachments] #uploader; current user is not set. Restoring credentials", null);
            }
            if (this.chatClient.containsStoredCredentials()) {
                ChatClient chatClient = this.chatClient;
                message2 = message;
                c190631.L$0 = message2;
                c190631.label = 1;
                if (chatClient.m54536xe26c02ca(c190631) != obj) {
                }
                return obj;
            }
            C2345k logger4 = getLogger();
            InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
            String str4 = logger4.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                logger4.f9274b.log(enumC2341g4, str4, "[sendAttachments] #uploader; user's credentials are not available", null);
            }
            return new C26203f(new C26198a("Could not set user"));
        }
        message2 = message;
        List<Attachment> attachments = message2.getAttachments();
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            Iterator<T> it3 = attachments.iterator();
            do {
                if (!it3.hasNext()) {
                    i16 = 0;
                    break;
                }
                attachment = (Attachment) it3.next();
                if (attachment.getUploadState() instanceof Attachment.UploadState.InProgress) {
                    break;
                }
            } while (!(attachment.getUploadState() instanceof Attachment.UploadState.Idle));
        } else {
            i16 = 0;
            break;
        }
        if (i16 == 0) {
            C2345k logger5 = getLogger();
            InterfaceC2339e interfaceC2339e5 = logger5.f9275c;
            String str5 = logger5.f9273a;
            EnumC2341g enumC2341g5 = EnumC2341g.DEBUG;
            if (interfaceC2339e5.isLoggable(enumC2341g5, str5)) {
                logger5.f9274b.log(enumC2341g5, str5, AbstractC11895b.m31996o("[sendAttachments] #uploader; message ", message2.getId(), " doesn't have pending attachments"), null);
            }
            AttachmentsUploadStates.INSTANCE.updateMessageAttachments(message2);
            return new C26204g(c23454a0);
        }
        c190631.L$0 = message2;
        c190631.I$0 = i16;
        c190631.label = 2;
        objUploadAttachments = uploadAttachments(message2, c190631);
        if (objUploadAttachments != obj) {
            message3 = message2;
            i13 = i16;
            list = (List) objUploadAttachments;
            messageCopy = message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : list, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false);
            c190631.L$0 = message3;
            c190631.L$1 = list;
            c190631.I$0 = i13;
            c190631.label = 3;
            if (updateMessages(messageCopy, c190631) != obj) {
                message4 = message3;
                list2 = list;
                list3 = list2;
                if (list3 instanceof Collection) {
                    it = list3.iterator();
                    while (it.hasNext()) {
                        if (!AbstractC22676k.m65745e(((Attachment) it.next()).getUploadState(), Attachment.UploadState.Success.INSTANCE)) {
                            logger = getLogger();
                            interfaceC2339e = logger.f9275c;
                            str = logger.f9273a;
                            enumC2341g = EnumC2341g.ERROR;
                            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[sendAttachments] #uploader; unable to upload attachments for message ", message4.getId()), null);
                            }
                            return new C26203f(new C26198a(AbstractC11266d.m30461o("Unable to upload attachments for message ", message4.getId())));
                        }
                    }
                } else {
                    it = list3.iterator();
                    while (it.hasNext()) {
                        if (!AbstractC22676k.m65745e(((Attachment) it.next()).getUploadState(), Attachment.UploadState.Success.INSTANCE)) {
                            logger = getLogger();
                            interfaceC2339e = logger.f9275c;
                            str = logger.f9273a;
                            enumC2341g = EnumC2341g.ERROR;
                            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[sendAttachments] #uploader; unable to upload attachments for message ", message4.getId()), null);
                            }
                            return new C26203f(new C26198a(AbstractC11266d.m30461o("Unable to upload attachments for message ", message4.getId())));
                        }
                    }
                }
                logger2 = getLogger();
                interfaceC2339e2 = logger2.f9275c;
                str2 = logger2.f9273a;
                enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, AbstractC11895b.m31996o("[sendAttachments] #uploader; all attachments for message ", message4.getId(), " uploaded"), null);
                }
                return new C26204g(c23454a0);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object updateMessages(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C190641 c190641;
        Message message2;
        if (interfaceC30057d instanceof C190641) {
            c190641 = (C190641) interfaceC30057d;
            int i13 = c190641.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190641.label = i13 - Integer.MIN_VALUE;
            } else {
                c190641 = new C190641(interfaceC30057d);
            }
        } else {
            c190641 = new C190641(interfaceC30057d);
        }
        Object obj = c190641.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190641.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            SyncStatus syncStatus = message.getSyncStatus();
            List<Attachment> attachments = message.getAttachments();
            if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
                Iterator<T> it = attachments.iterator();
                while (it.hasNext()) {
                    if (((Attachment) it.next()).getUploadState() instanceof Attachment.UploadState.Failed) {
                        syncStatus = null;
                        break;
                    }
                }
            }
            if (syncStatus == null) {
                syncStatus = SyncStatus.FAILED_PERMANENTLY;
            }
            Message messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : syncStatus, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
            ChannelMessagesUpdateLogic channelMessagesUpdateLogic = this.channelStateLogic;
            if (channelMessagesUpdateLogic != null) {
                channelMessagesUpdateLogic.upsertMessage(messageCopy);
            }
            MessageRepository messageRepository = this.messageRepository;
            c190641.L$0 = null;
            c190641.L$1 = messageCopy;
            c190641.label = 1;
            if (messageRepository.insertMessage(messageCopy, c190641) == enumC31071a) {
                return enumC31071a;
            }
            message2 = messageCopy;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            message2 = (Message) c190641.L$1;
            AbstractC34132o.m107864I(obj);
        }
        AttachmentsUploadStates.INSTANCE.updateMessageAttachments(message2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object uploadAttachments(Message message, InterfaceC30057d<? super List<Attachment>> interfaceC30057d) {
        C190651 c190651;
        Message message2 = message;
        if (interfaceC30057d instanceof C190651) {
            c190651 = (C190651) interfaceC30057d;
            int i13 = c190651.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190651.label = i13 - Integer.MIN_VALUE;
            } else {
                c190651 = new C190651(interfaceC30057d);
            }
        } else {
            c190651 = new C190651(interfaceC30057d);
        }
        Object objM8719m = c190651.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190651.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8719m);
                C190662 c190662 = new C190662(message2, this, null);
                c190651.L$0 = message2;
                c190651.label = 1;
                objM8719m = AbstractC3006f0.m8719m(c190662, c190651);
                if (objM8719m == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                message2 = (Message) c190651.L$0;
                AbstractC34132o.m107864I(objM8719m);
            }
            return (List) objM8719m;
        } catch (Exception e5) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[uploadAttachments] #uploader; unable to upload attachments: ", e5.getMessage()), null);
            }
            List<Attachment> attachments = message2.getAttachments();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
            for (Attachment attachment : attachments) {
                Attachment.UploadState uploadState = attachment.getUploadState();
                if (!AbstractC22676k.m65745e(uploadState, Attachment.UploadState.Success.INSTANCE)) {
                    uploadState = null;
                }
                if (uploadState == null) {
                    uploadState = new Attachment.UploadState.Failed(new C26201d("Could not upload attachments.", e5));
                }
                arrayList.add(Attachment.copy$default(attachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, uploadState, null, 786431, null));
            }
            return arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[Catch: Exception -> 0x00af, PHI: r13 r14
      0x00b5: PHI (r13v9 io.getstream.chat.android.models.Message) = (r13v2 io.getstream.chat.android.models.Message), (r13v10 io.getstream.chat.android.models.Message) binds: [B:34:0x0092, B:41:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r14v18 java.lang.String) = (r14v8 java.lang.String), (r14v21 java.lang.String) binds: [B:34:0x0092, B:41:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:45:0x00b5, B:35:0x0094), top: B:56:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r14 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
    
        if (updateMessages(r14, r1) == r2) goto L53;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00b5, please report this as an issue */
    @io.getstream.chat.android.core.internal.InternalStreamChatApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadAttachmentsForMessage(java.lang.String r13, q83.InterfaceC30057d<? super n23.AbstractC26205h> r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker.uploadAttachmentsForMessage(java.lang.String, q83.d):java.lang.Object");
    }

    public /* synthetic */ UploadAttachmentsWorker(String str, String str2, ChannelMessagesUpdateLogic channelMessagesUpdateLogic, MessageRepository messageRepository, ChatClient chatClient, AttachmentUploader attachmentUploader, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, channelMessagesUpdateLogic, messageRepository, chatClient, (i13 & 32) != 0 ? new AttachmentUploader(chatClient) : attachmentUploader);
    }
}
