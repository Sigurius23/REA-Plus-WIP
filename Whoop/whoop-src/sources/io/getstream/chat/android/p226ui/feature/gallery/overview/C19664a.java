package io.getstream.chat.android.p226ui.feature.gallery.overview;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.overview.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19664a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74514w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MediaAttachmentGridView f74515x;

    public /* synthetic */ C19664a(MediaAttachmentGridView mediaAttachmentGridView, int i13) {
        this.f74514w = i13;
        this.f74515x = mediaAttachmentGridView;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74514w) {
            case 0:
                return Integer.valueOf(MediaAttachmentGridView.dateScrollListener_delegate$lambda$4$lambda$2(this.f74515x));
            case 1:
                MediaAttachmentGridView.dateScrollListener_delegate$lambda$4$lambda$3(this.f74515x);
                return C23454a0.f92919a;
            case 2:
                return MediaAttachmentGridView.adapter_delegate$lambda$1(this.f74515x);
            case 3:
                return MediaAttachmentGridView.dateScrollListener_delegate$lambda$4(this.f74515x);
            default:
                MediaAttachmentGridView.scrollListener$lambda$5(this.f74515x);
                return C23454a0.f92919a;
        }
    }
}
