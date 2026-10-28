package io.getstream.chat.android.client.attachment;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.AttachmentsSender", m100430f = "AttachmentsSender.kt", m100431l = {67, 74}, m100432m = "sendAttachments$stream_chat_android_client_release")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsSender$sendAttachments$1 extends AbstractC32269c {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachmentsSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentsSender$sendAttachments$1(AttachmentsSender attachmentsSender, InterfaceC30057d<? super AttachmentsSender$sendAttachments$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = attachmentsSender;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendAttachments$stream_chat_android_client_release(null, null, null, false, this);
    }
}
