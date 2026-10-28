package io.getstream.chat.android.p226ui.feature.gallery;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19658e implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74508w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttachmentMediaActivity f74509x;

    public /* synthetic */ ViewOnClickListenerC19658e(AttachmentMediaActivity attachmentMediaActivity, int i13) {
        this.f74508w = i13;
        this.f74509x = attachmentMediaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f74508w;
        AttachmentMediaActivity attachmentMediaActivity = this.f74509x;
        switch (i13) {
            case 0:
                AttachmentMediaActivity.setupPlayerView$lambda$8$lambda$7(attachmentMediaActivity, view);
                break;
            default:
                AttachmentMediaActivity.Companion companion = AttachmentMediaActivity.INSTANCE;
                attachmentMediaActivity.onBackPressed();
                break;
        }
    }
}
