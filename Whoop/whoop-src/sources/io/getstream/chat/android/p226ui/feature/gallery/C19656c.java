package io.getstream.chat.android.p226ui.feature.gallery;

import io.getstream.chat.android.p226ui.feature.gallery.options.internal.AttachmentGalleryOptionsDialogFragment;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19656c implements AttachmentGalleryOptionsDialogFragment.AttachmentOptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AttachmentGalleryActivity f74505b;

    public /* synthetic */ C19656c(AttachmentGalleryActivity attachmentGalleryActivity, int i13) {
        this.f74504a = i13;
        this.f74505b = attachmentGalleryActivity;
    }

    @Override // io.getstream.chat.android.ui.feature.gallery.options.internal.AttachmentGalleryOptionsDialogFragment.AttachmentOptionHandler
    public final void onAttachmentOptionClick() {
        switch (this.f74504a) {
            case 0:
                AttachmentGalleryActivity.handleSaveMedia$lambda$10(this.f74505b);
                break;
            case 1:
                AttachmentGalleryActivity.setupAttachmentActionsButton$lambda$8$lambda$5(this.f74505b);
                break;
            case 2:
                AttachmentGalleryActivity.setupAttachmentActionsButton$lambda$8$lambda$6(this.f74505b);
                break;
            default:
                AttachmentGalleryActivity.setupAttachmentActionsButton$lambda$8$lambda$7(this.f74505b);
                break;
        }
    }
}
