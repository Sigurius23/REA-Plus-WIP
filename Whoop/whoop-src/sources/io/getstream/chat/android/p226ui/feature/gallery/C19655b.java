package io.getstream.chat.android.p226ui.feature.gallery;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19655b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74502w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttachmentGalleryActivity f74503x;

    public /* synthetic */ C19655b(AttachmentGalleryActivity attachmentGalleryActivity, int i13) {
        this.f74502w = i13;
        this.f74503x = attachmentGalleryActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f74502w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        AttachmentGalleryActivity attachmentGalleryActivity = this.f74503x;
        switch (i13) {
            case 0:
                AttachmentGalleryActivity.setupGalleryAdapter$lambda$3(attachmentGalleryActivity);
                return c23454a0;
            case 1:
                AttachmentGalleryActivity.handleSaveMedia$lambda$10$lambda$9(attachmentGalleryActivity);
                return c23454a0;
            default:
                AttachmentGalleryActivity.Companion companion = AttachmentGalleryActivity.INSTANCE;
                return Integer.valueOf(attachmentGalleryActivity.getIntent().getIntExtra("extra_key_initial_index", 0));
        }
    }
}
