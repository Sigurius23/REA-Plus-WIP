package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentDownloadClickListener;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder$sam$io_getstream_chat_android_ui_feature_messages_list_adapter_view_internal_AttachmentDownloadClickListener$0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19794x34cbee9c implements AttachmentDownloadClickListener, InterfaceC22666f {
    private final /* synthetic */ Function1 function;

    public C19794x34cbee9c(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AttachmentDownloadClickListener) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentDownloadClickListener
    public final /* synthetic */ void onAttachmentDownloadClick(Attachment attachment) {
        this.function.invoke(attachment);
    }
}
