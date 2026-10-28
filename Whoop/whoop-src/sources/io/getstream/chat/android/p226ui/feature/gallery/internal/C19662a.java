package io.getstream.chat.android.p226ui.feature.gallery.internal;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19662a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74510w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttachmentGalleryImagePageFragment f74511x;

    public /* synthetic */ C19662a(AttachmentGalleryImagePageFragment attachmentGalleryImagePageFragment, int i13) {
        this.f74510w = i13;
        this.f74511x = attachmentGalleryImagePageFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74510w) {
            case 0:
                return this.f74511x.requireArguments().getString("image_url");
            case 1:
                AttachmentGalleryImagePageFragment.onViewCreated$lambda$6$lambda$3(this.f74511x);
                return C23454a0.f92919a;
            default:
                AttachmentGalleryImagePageFragment.onViewCreated$lambda$6$lambda$4(this.f74511x);
                return C23454a0.f92919a;
        }
    }
}
