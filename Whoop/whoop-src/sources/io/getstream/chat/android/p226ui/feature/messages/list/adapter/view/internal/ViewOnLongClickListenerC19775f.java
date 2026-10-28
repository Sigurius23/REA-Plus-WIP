package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC19775f implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f74630b;

    public /* synthetic */ ViewOnLongClickListenerC19775f(View view, int i13) {
        this.f74629a = i13;
        this.f74630b = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i13 = this.f74629a;
        View view2 = this.f74630b;
        switch (i13) {
            case 0:
                AudioRecordingAttachmentsGroupView.m55480d((AudioRecordingAttachmentsGroupView) view2, view);
                break;
            case 1:
                LinkAttachmentView.Companion companion = LinkAttachmentView.Companion;
                view2.performLongClick();
                break;
            default:
                MediaAttachmentView.m55506k((MediaAttachmentView) view2, view);
                break;
        }
        return true;
    }
}
