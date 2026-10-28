package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import io.getstream.chat.android.models.Attachment;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class FileAttachmentsView$setAttachments$2$1 implements AttachmentClickListener, InterfaceC22666f {
    final /* synthetic */ AttachmentClickListener $tmp0;

    public FileAttachmentsView$setAttachments$2$1(AttachmentClickListener attachmentClickListener) {
        this.$tmp0 = attachmentClickListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AttachmentClickListener) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22672i(1, 0, AttachmentClickListener.class, this.$tmp0, "onAttachmentClick", "onAttachmentClick(Lio/getstream/chat/android/models/Attachment;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentClickListener
    public final void onAttachmentClick(Attachment p13) {
        AbstractC22676k.m65750j(p13, "p0");
        this.$tmp0.onAttachmentClick(p13);
    }
}
