package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import android.view.View;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19703a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74549w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttachmentPreviewViewHolder f74550x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74551y;

    public /* synthetic */ ViewOnClickListenerC19703a(AttachmentPreviewViewHolder attachmentPreviewViewHolder, Object obj, int i13) {
        this.f74549w = i13;
        this.f74550x = attachmentPreviewViewHolder;
        this.f74551y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74549w) {
            case 0:
                AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder.m55282a((AudioRecordAttachmentPreviewFactory.AudioRecordAttachmentPreviewViewHolder) this.f74550x, (Function1) this.f74551y, view);
                break;
            case 1:
                FallbackAttachmentPreviewFactory.FallbackAttachmentPreviewViewHolder.m55289a((FallbackAttachmentPreviewFactory.FallbackAttachmentPreviewViewHolder) this.f74550x, (Attachment) this.f74551y, view);
                break;
            case 2:
                FileAttachmentPreviewFactory.FileAttachmentPreviewHandler._init_$lambda$0((Function1) this.f74551y, (FileAttachmentPreviewFactory.FileAttachmentPreviewHandler) this.f74550x, view);
                break;
            default:
                MediaAttachmentPreviewFactory.MediaAttachmentPreviewViewHolder._init_$lambda$0((Function1) this.f74551y, (MediaAttachmentPreviewFactory.MediaAttachmentPreviewViewHolder) this.f74550x, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC19703a(Function1 function1, AttachmentPreviewViewHolder attachmentPreviewViewHolder, int i13) {
        this.f74549w = i13;
        this.f74551y = function1;
        this.f74550x = attachmentPreviewViewHolder;
    }
}
