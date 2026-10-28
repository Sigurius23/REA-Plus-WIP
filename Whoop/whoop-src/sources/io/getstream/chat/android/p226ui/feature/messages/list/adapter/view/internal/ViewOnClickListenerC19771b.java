package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;
import io.getstream.chat.android.models.Attachment;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19771b implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74621w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74622x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74623y;

    public /* synthetic */ ViewOnClickListenerC19771b(int i13, Object obj, Object obj2) {
        this.f74621w = i13;
        this.f74622x = obj;
        this.f74623y = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74621w) {
            case 0:
                AnswerViewHolder.bind$lambda$0((PollItem.Answer) this.f74622x, (AnswerViewHolder) this.f74623y, view);
                break;
            case 1:
                GeneralFileAttachmentViewHolder.m55493a((GeneralFileAttachmentViewHolder) this.f74622x, (AttachmentClickListener) this.f74623y, view);
                break;
            case 2:
                GeneralFileAttachmentViewHolder.lambda$6$lambda$5((GeneralFileAttachmentViewHolder) this.f74622x, (AttachmentDownloadClickListener) this.f74623y, view);
                break;
            case 3:
                RecordingFileAttachmentViewHolder.m55527c((RecordingFileAttachmentViewHolder) this.f74622x, (AttachmentClickListener) this.f74623y, view);
                break;
            case 4:
                RecordingFileAttachmentViewHolder.lambda$6$lambda$5((RecordingFileAttachmentViewHolder) this.f74622x, (AttachmentDownloadClickListener) this.f74623y, view);
                break;
            case 5:
                AudioRecordingAttachmentsGroupView.m55482f((AudioRecordingAttachmentsGroupView) this.f74622x, (Attachment) this.f74623y, view);
                break;
            case 6:
                FootnoteView.showTime$lambda$12((String) this.f74622x, (FootnoteView) this.f74623y, view);
                break;
            case 7:
                LinkAttachmentView.m55499a((LinkAttachmentView) this.f74622x, (LinkAttachmentView.LinkPreviewClickListener) this.f74623y, view);
                break;
            default:
                MediaAttachmentView.m55504f((MediaAttachmentView) this.f74622x, (Attachment) this.f74623y, view);
                break;
        }
    }
}
