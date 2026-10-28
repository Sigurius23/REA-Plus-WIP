package io.getstream.chat.android.p226ui.feature.gallery;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19654a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74500w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttachmentGalleryActivity f74501x;

    public /* synthetic */ ViewOnClickListenerC19654a(AttachmentGalleryActivity attachmentGalleryActivity, int i13) {
        this.f74500w = i13;
        this.f74501x = attachmentGalleryActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f74500w;
        AttachmentGalleryActivity attachmentGalleryActivity = this.f74501x;
        switch (i13) {
            case 0:
                AttachmentGalleryActivity.setupAttachmentActionsButton$lambda$8(attachmentGalleryActivity, view);
                break;
            case 1:
                AttachmentGalleryActivity.setupGalleryOverviewButton$lambda$14(attachmentGalleryActivity, view);
                break;
            case 2:
                AttachmentGalleryActivity.Companion companion = AttachmentGalleryActivity.INSTANCE;
                attachmentGalleryActivity.finish();
                break;
            default:
                AttachmentGalleryActivity.setupShareMediaButton$lambda$4(attachmentGalleryActivity, view);
                break;
        }
    }
}
