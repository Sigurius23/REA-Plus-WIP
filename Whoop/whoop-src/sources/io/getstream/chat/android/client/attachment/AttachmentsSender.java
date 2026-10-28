package io.getstream.chat.android.client.attachment;

import android.content.Context;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.attachment.worker.UploadAttachmentsAndroidWorker;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.UploadAttachmentsNetworkType;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0015J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/AttachmentsSender;", "", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;", "networkType", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;", "verifier", "<init>", "(Landroid/content/Context;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;Lio/getstream/chat/android/client/setup/state/ClientState;Lbc3/c0;Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;)V", "Lio/getstream/chat/android/models/Message;", "message", "", "channelType", "channelId", "Ln23/h;", "retryMessage", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "uploadAttachments", "newMessage", "waitForAttachmentsToBeSent", "Ll83/a0;", "enqueueAttachmentUpload", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V", "", "isRetrying", "sendAttachments$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "sendAttachments", "cancelJobs", "()V", "Landroid/content/Context;", "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lbc3/c0;", "Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;", "", "Lbc3/k1;", "jobsMap", "Ljava/util/Map;", "", "Ljava/util/UUID;", "uploadIds", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsSender {
    private final ClientState clientState;
    private final Context context;
    private Map<String, ? extends InterfaceC3027k1> jobsMap;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final UploadAttachmentsNetworkType networkType;
    private final InterfaceC2994c0 scope;
    private final Map<String, UUID> uploadIds;
    private final AttachmentsVerifier verifier;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.AttachmentsSender", m100430f = "AttachmentsSender.kt", m100431l = {156}, m100432m = "waitForAttachmentsToBeSent")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190571 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C190571(InterfaceC30057d<? super C190571> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AttachmentsSender.this.waitForAttachmentsToBeSent(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2", m100430f = "AttachmentsSender.kt", m100431l = {140}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190582 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C22659b0 $allAttachmentsUploaded;
        final /* synthetic */ C22669g0 $messageToBeSent;
        final /* synthetic */ Message $newMessage;
        int label;
        final /* synthetic */ AttachmentsSender this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190582(Message message, C22669g0 c22669g0, C22659b0 c22659b0, AttachmentsSender attachmentsSender, InterfaceC30057d<? super C190582> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$newMessage = message;
            this.$messageToBeSent = c22669g0;
            this.$allAttachmentsUploaded = c22659b0;
            this.this$0 = attachmentsSender;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190582(this.$newMessage, this.$messageToBeSent, this.$allAttachmentsUploaded, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C190582) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final InterfaceC13058l interfaceC13058lObserveAttachments = AttachmentsUploadStates.INSTANCE.observeAttachments(this.$newMessage.getId());
                InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC13062m {
                        final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2$invokeSuspend$$inlined$filterNot$1$2", m100430f = "AttachmentsSender.kt", m100431l = {50}, m100432m = "emit")
                        @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                        public static final class AnonymousClass1 extends AbstractC32269c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                                super(interfaceC30057d);
                            }

                            @Override // s83.AbstractC32267a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC13062m interfaceC13062m) {
                            this.$this_unsafeFlow = interfaceC13062m;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // ec3.InterfaceC13062m
                        public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC30057d instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                                int i13 = anonymousClass1.label;
                                if ((i13 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i13 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                            }
                            Object obj2 = anonymousClass1.result;
                            EnumC31071a enumC31071a = EnumC31071a.f128113w;
                            int i14 = anonymousClass1.label;
                            if (i14 == 0) {
                                AbstractC34132o.m107864I(obj2);
                                InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                                if (!((Collection) obj).isEmpty()) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
                                        return enumC31071a;
                                    }
                                }
                            } else {
                                if (i14 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC34132o.m107864I(obj2);
                            }
                            return C23454a0.f92919a;
                        }
                    }

                    @Override // ec3.InterfaceC13058l
                    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                        Object objCollect = interfaceC13058lObserveAttachments.collect(new AnonymousClass2(interfaceC13062m), interfaceC30057d);
                        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                    }
                };
                final C22669g0 c22669g0 = this.$messageToBeSent;
                final Message message = this.$newMessage;
                final C22659b0 c22659b0 = this.$allAttachmentsUploaded;
                final AttachmentsSender attachmentsSender = this.this$0;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: io.getstream.chat.android.client.attachment.AttachmentsSender.waitForAttachmentsToBeSent.2.2
                    @Override // ec3.InterfaceC13062m
                    public final /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        emit((List<Attachment>) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                        return C23454a0.f92919a;
                    }

                    /* JADX WARN: Code duplicated, block: B:26:0x00f5  */
                    public final Object emit(List<Attachment> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        InterfaceC3027k1 interfaceC3027k1;
                        List<Attachment> list2 = list;
                        boolean z4 = list2 instanceof Collection;
                        if (z4 && list2.isEmpty()) {
                            C22669g0 c22669g1 = c22669g0;
                            Message message2 = message;
                            c22669g1.f89336w = message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : AbstractC25265s.m74097F1(list), ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false);
                            c22659b0.f89329w = true;
                            interfaceC3027k1 = (InterfaceC3027k1) attachmentsSender.jobsMap.get(message.getId());
                            if (interfaceC3027k1 != null) {
                                interfaceC3027k1.cancel((CancellationException) null);
                            }
                        } else {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                if (!AbstractC22676k.m65745e(((Attachment) it.next()).getUploadState(), Attachment.UploadState.Success.INSTANCE)) {
                                    if (!z4 || !list2.isEmpty()) {
                                        Iterator<T> it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            if (((Attachment) it3.next()).getUploadState() instanceof Attachment.UploadState.Failed) {
                                                InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) attachmentsSender.jobsMap.get(message.getId());
                                                if (interfaceC3027k2 == null) {
                                                    break;
                                                }
                                                interfaceC3027k2.cancel((CancellationException) null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            C22669g0 c22669g2 = c22669g0;
                            Message message3 = message;
                            c22669g2.f89336w = message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : AbstractC25265s.m74097F1(list), ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false);
                            c22659b0.f89329w = true;
                            interfaceC3027k1 = (InterfaceC3027k1) attachmentsSender.jobsMap.get(message.getId());
                            if (interfaceC3027k1 != null) {
                                interfaceC3027k1.cancel((CancellationException) null);
                            }
                        }
                        return C23454a0.f92919a;
                    }
                };
                this.label = 1;
                if (interfaceC13058l.collect(interfaceC13062m, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public AttachmentsSender(Context context, UploadAttachmentsNetworkType networkType, ClientState clientState, InterfaceC2994c0 scope, AttachmentsVerifier verifier) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(networkType, "networkType");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(verifier, "verifier");
        this.context = context;
        this.networkType = networkType;
        this.clientState = clientState;
        this.scope = scope;
        this.verifier = verifier;
        this.jobsMap = C25272z.f99163w;
        this.uploadIds = new LinkedHashMap();
        this.logger = AbstractC1772c1.m5382S(this, "Chat:AttachmentsSender");
    }

    private final void enqueueAttachmentUpload(Message message, String channelType, String channelId) {
        this.uploadIds.put(message.getId(), UploadAttachmentsAndroidWorker.INSTANCE.start(this.context, channelType, channelId, message.getId(), this.networkType));
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final Object retryMessage(Message message, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return uploadAttachments(message, str, str2, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadAttachments(Message message, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        if (this.clientState.isNetworkAvailable()) {
            return waitForAttachmentsToBeSent(message, str, str2, interfaceC30057d);
        }
        enqueueAttachmentUpload(message, str, str2);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[uploadAttachments] Chat is offline, not sending message with id " + message.getId(), null);
        }
        return new C26203f(new C26198a(AbstractC31061c.m95640p("Chat is offline, not sending message with id ", message.getId(), " and text ", message.getText())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object waitForAttachmentsToBeSent(Message message, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C190571 c190571;
        C22659b0 c22659b0;
        C22669g0 c22669g0;
        Object c26203f;
        Message message2 = message;
        if (interfaceC30057d instanceof C190571) {
            c190571 = (C190571) interfaceC30057d;
            int i13 = c190571.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190571.label = i13 - Integer.MIN_VALUE;
            } else {
                c190571 = new C190571(interfaceC30057d);
            }
        } else {
            c190571 = new C190571(interfaceC30057d);
        }
        C190571 c190572 = c190571;
        Object obj = c190572.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190572.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC3027k1 interfaceC3027k1 = this.jobsMap.get(message2.getId());
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            c22659b0 = new C22659b0();
            c22669g0 = new C22669g0();
            c22669g0.f89336w = message2;
            AttachmentsUploadStates.INSTANCE.updateMessageAttachments(message2);
            this.jobsMap = AbstractC25247g0.m73996e0(this.jobsMap, new C23465k(message2.getId(), AbstractC3006f0.m8732z(this.scope, null, null, new C190582(message2, c22669g0, c22659b0, this, null), 3)));
            enqueueAttachmentUpload(message, str, str2);
            InterfaceC3027k1 interfaceC3027k2 = this.jobsMap.get(message2.getId());
            if (interfaceC3027k2 != null) {
                c190572.L$0 = message2;
                c190572.L$1 = null;
                c190572.L$2 = null;
                c190572.L$3 = c22659b0;
                c190572.L$4 = c22669g0;
                c190572.label = 1;
                if (interfaceC3027k2.join(c190572) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C22669g0 c22669g1 = (C22669g0) c190572.L$4;
            C22659b0 c22659b1 = (C22659b0) c190572.L$3;
            Message message3 = (Message) c190572.L$0;
            AbstractC34132o.m107864I(obj);
            c22669g0 = c22669g1;
            message2 = message3;
            c22659b0 = c22659b1;
        }
        if (c22659b0.f89329w) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[waitForAttachmentsToBeSent] All attachments for message ", message2.getId(), " uploaded"), null);
            }
            Message message4 = (Message) c22669g0.f89336w;
            c26203f = new C26204g(message4.copy(((-1) & 1) != 0 ? message4.id : null, ((-1) & 2) != 0 ? message4.cid : null, ((-1) & 4) != 0 ? message4.text : null, ((-1) & 8) != 0 ? message4.html : null, ((-1) & 16) != 0 ? message4.parentId : null, ((-1) & 32) != 0 ? message4.command : null, ((-1) & 64) != 0 ? message4.attachments : null, ((-1) & 128) != 0 ? message4.mentionedUsersIds : null, ((-1) & 256) != 0 ? message4.mentionedUsers : null, ((-1) & 512) != 0 ? message4.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message4.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message4.reactionCounts : null, ((-1) & 4096) != 0 ? message4.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message4.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message4.syncStatus : null, ((-1) & 32768) != 0 ? message4.type : "regular", ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message4.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message4.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message4.createdAt : null, ((-1) & 524288) != 0 ? message4.updatedAt : null, ((-1) & 1048576) != 0 ? message4.deletedAt : null, ((-1) & 2097152) != 0 ? message4.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message4.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message4.user : null, ((-1) & 16777216) != 0 ? message4.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message4.silent : false, ((-1) & 67108864) != 0 ? message4.shadowed : false, ((-1) & 134217728) != 0 ? message4.i18n : null, ((-1) & 268435456) != 0 ? message4.showInChannel : false, ((-1) & 536870912) != 0 ? message4.channelInfo : null, ((-1) & 1073741824) != 0 ? message4.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message4.replyMessageId : null, (65535 & 1) != 0 ? message4.pinned : false, (65535 & 2) != 0 ? message4.pinnedAt : null, (65535 & 4) != 0 ? message4.pinExpires : null, (65535 & 8) != 0 ? message4.pinnedBy : null, (65535 & 16) != 0 ? message4.threadParticipants : null, (65535 & 32) != 0 ? message4.skipPushNotification : false, (65535 & 64) != 0 ? message4.skipEnrichUrl : false, (65535 & 128) != 0 ? message4.moderationDetails : null, (65535 & 256) != 0 ? message4.moderation : null, (65535 & 512) != 0 ? message4.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message4.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message4.restrictedVisibility : null, (65535 & 4096) != 0 ? message4.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message4.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message4.channelRole : null, (65535 & 32768) != 0 ? message4.deletedForMe : false));
        } else {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.INFO;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[waitForAttachmentsToBeSent] Could not upload attachments for message " + message2.getId(), null);
            }
            c26203f = new C26203f(new C26198a(AbstractC11266d.m30461o("Could not upload attachments, not sending message with id ", message2.getId())));
        }
        AttachmentsUploadStates.INSTANCE.removeMessageAttachmentsState(message2.getId());
        this.uploadIds.remove(message2.getId());
        return c26203f;
    }

    public final void cancelJobs() {
        AttachmentsUploadStates.INSTANCE.clearStates();
        Iterator<T> it = this.jobsMap.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC3027k1) it.next()).cancel((CancellationException) null);
        }
        Iterator<T> it3 = this.uploadIds.values().iterator();
        while (it3.hasNext()) {
            UploadAttachmentsAndroidWorker.INSTANCE.stop(this.context, (UUID) it3.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r5 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        if (r5 == r7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendAttachments$stream_chat_android_client_release(io.getstream.chat.android.models.Message r17, java.lang.String r18, java.lang.String r19, boolean r20, q83.InterfaceC30057d<? super n23.AbstractC26205h> r21) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.attachment.AttachmentsSender.sendAttachments$stream_chat_android_client_release(io.getstream.chat.android.models.Message, java.lang.String, java.lang.String, boolean, q83.d):java.lang.Object");
    }

    public /* synthetic */ AttachmentsSender(Context context, UploadAttachmentsNetworkType uploadAttachmentsNetworkType, ClientState clientState, InterfaceC2994c0 interfaceC2994c0, AttachmentsVerifier attachmentsVerifier, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uploadAttachmentsNetworkType, clientState, interfaceC2994c0, (i13 & 16) != 0 ? AttachmentsVerifier.INSTANCE : attachmentsVerifier);
    }
}
