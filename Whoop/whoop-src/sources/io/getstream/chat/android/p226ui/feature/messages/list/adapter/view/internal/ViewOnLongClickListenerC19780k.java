package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC19780k implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AttachmentLongClickListener f74641b;

    public /* synthetic */ ViewOnLongClickListenerC19780k(AttachmentLongClickListener attachmentLongClickListener, int i13) {
        this.f74640a = i13;
        this.f74641b = attachmentLongClickListener;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i13 = this.f74640a;
        AttachmentLongClickListener attachmentLongClickListener = this.f74641b;
        switch (i13) {
            case 0:
                int i14 = GeneralFileAttachmentViewHolder.f74616a;
                attachmentLongClickListener.onAttachmentLongClick();
                break;
            default:
                RecordingFileAttachmentViewHolder.Companion companion = RecordingFileAttachmentViewHolder.Companion;
                attachmentLongClickListener.onAttachmentLongClick();
                break;
        }
        return true;
    }
}
