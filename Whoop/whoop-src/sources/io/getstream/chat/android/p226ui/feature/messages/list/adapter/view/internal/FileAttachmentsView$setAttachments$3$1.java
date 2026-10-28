package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class FileAttachmentsView$setAttachments$3$1 implements AttachmentLongClickListener, InterfaceC22666f {
    final /* synthetic */ AttachmentLongClickListener $tmp0;

    public FileAttachmentsView$setAttachments$3$1(AttachmentLongClickListener attachmentLongClickListener) {
        this.$tmp0 = attachmentLongClickListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AttachmentLongClickListener) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22672i(0, 0, AttachmentLongClickListener.class, this.$tmp0, "onAttachmentLongClick", "onAttachmentLongClick()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentLongClickListener
    public final void onAttachmentLongClick() {
        this.$tmp0.onAttachmentLongClick();
    }
}
