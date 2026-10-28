package io.getstream.chat.android.p226ui.feature.messages.list;

import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItem;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19829h implements AttachmentGalleryActivity.AttachmentDownloadOptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74745b;

    public /* synthetic */ C19829h(Object obj, int i13) {
        this.f74744a = i13;
        this.f74745b = obj;
    }

    @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDownloadOptionHandler
    public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
        switch (this.f74744a) {
            case 0:
                MessageListView._attachmentDownloadOptionHandler_delegate$lambda$37$lambda$36((InterfaceC4339a) this.f74745b, attachmentGalleryResultItem);
                break;
            default:
                MessageListView._attachmentDownloadOptionHandler_delegate$lambda$35((MessageListView) this.f74745b, attachmentGalleryResultItem);
                break;
        }
    }
}
