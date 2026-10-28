package io.getstream.chat.android.client.attachment.worker;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.attachment.AttachmentUploader;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import l83.C23454a0;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachments$2$1$1", m100430f = "UploadAttachmentsWorker.kt", m100431l = {129}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/models/Attachment;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/models/Attachment;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class UploadAttachmentsWorker$uploadAttachments$2$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Attachment $attachment;
    final /* synthetic */ Message $message;
    Object L$0;
    int label;
    final /* synthetic */ UploadAttachmentsWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadAttachmentsWorker$uploadAttachments$2$1$1(Attachment attachment, UploadAttachmentsWorker uploadAttachmentsWorker, Message message, InterfaceC30057d<? super UploadAttachmentsWorker$uploadAttachments$2$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$attachment = attachment;
        this.this$0 = uploadAttachmentsWorker;
        this.$message = message;
    }

    private static final Attachment invokeSuspend$lambda$2(Attachment attachment, AbstractC26202e abstractC26202e) {
        return Attachment.copy$default(attachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new Attachment.UploadState.Failed(abstractC26202e), null, 786431, null);
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new UploadAttachmentsWorker$uploadAttachments$2$1$1(this.$attachment, this.this$0, this.$message, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Attachment> interfaceC30057d) {
        return ((UploadAttachmentsWorker$uploadAttachments$2$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        UploadAttachmentsWorker.ProgressCallbackImpl progressCallbackImpl;
        UploadAttachmentsWorker$uploadAttachments$2$1$1 uploadAttachmentsWorker$uploadAttachments$2$1$1;
        C26204g c26204g;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(this.$attachment.getUploadState(), Attachment.UploadState.Success.INSTANCE)) {
                C2345k logger = this.this$0.getLogger();
                Attachment attachment = this.$attachment;
                Message message = this.$message;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8300m("[uploadAttachments] #uploader; attachment ", AttachmentExtensionsKt.getUploadId(attachment), " for message ", message.getId(), " already uploaded"), null);
                }
                return this.$attachment;
            }
            C2345k logger2 = this.this$0.getLogger();
            Attachment attachment2 = this.$attachment;
            Message message2 = this.$message;
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC31061c.m95640p("[uploadAttachments] #uploader; uploading attachment ", AttachmentExtensionsKt.getUploadId(attachment2), " for message ", message2.getId()), null);
            }
            ChannelMessagesUpdateLogic channelMessagesUpdateLogic = this.this$0.channelStateLogic;
            if (channelMessagesUpdateLogic != null) {
                Message message3 = this.$message;
                Attachment attachment3 = this.$attachment;
                String id4 = message3.getId();
                String uploadId = AttachmentExtensionsKt.getUploadId(attachment3);
                AbstractC22676k.m65747g(uploadId);
                progressCallbackImpl = new UploadAttachmentsWorker.ProgressCallbackImpl(id4, uploadId, channelMessagesUpdateLogic);
            } else {
                progressCallbackImpl = null;
            }
            AttachmentUploader attachmentUploader = this.this$0.attachmentUploader;
            String str3 = this.this$0.channelType;
            String str4 = this.this$0.channelId;
            Attachment attachment4 = this.$attachment;
            this.L$0 = null;
            this.label = 1;
            uploadAttachmentsWorker$uploadAttachments$2$1$1 = this;
            obj = attachmentUploader.uploadAttachment(str3, str4, attachment4, progressCallbackImpl, uploadAttachmentsWorker$uploadAttachments$2$1$1);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            uploadAttachmentsWorker$uploadAttachments$2$1$1 = this;
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
        Attachment attachment5 = uploadAttachmentsWorker$uploadAttachments$2$1$1.$attachment;
        AbstractC22676k.m65750j(abstractC26205h, "<this>");
        if (abstractC26205h instanceof C26204g) {
            c26204g = (C26204g) abstractC26205h;
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            c26204g = new C26204g(invokeSuspend$lambda$2(attachment5, ((C26203f) abstractC26205h).f103918a));
        }
        return (Attachment) c26204g.f103919a;
    }
}
