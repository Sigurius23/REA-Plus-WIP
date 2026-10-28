package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnAttachmentClickListener$0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19731xc893b9b3 implements MessageListView.OnAttachmentClickListener, InterfaceC22666f {
    private final /* synthetic */ InterfaceC4351m function;

    public C19731xc893b9b3(InterfaceC4351m function) {
        AbstractC22676k.m65750j(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof MessageListView.OnAttachmentClickListener) && (obj instanceof InterfaceC22666f)) {
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

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnAttachmentClickListener
    public final /* synthetic */ boolean onAttachmentClick(Message message, Attachment attachment) {
        return ((Boolean) this.function.invoke(message, attachment)).booleanValue();
    }
}
