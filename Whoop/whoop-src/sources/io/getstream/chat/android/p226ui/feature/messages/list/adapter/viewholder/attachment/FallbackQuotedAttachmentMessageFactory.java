package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.DefaultQuotedAttachmentView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/FallbackQuotedAttachmentMessageFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;", "<init>", "()V", "canHandle", "", "message", "Lio/getstream/chat/android/models/Message;", "generateQuotedAttachmentView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FallbackQuotedAttachmentMessageFactory implements QuotedAttachmentFactory {
    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.QuotedAttachmentFactory
    public final boolean canHandle(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return true;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.QuotedAttachmentFactory
    public final View generateQuotedAttachmentView(Message message, ViewGroup parent) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(parent, "parent");
        Context context = parent.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        DefaultQuotedAttachmentView defaultQuotedAttachmentView = new DefaultQuotedAttachmentView(context);
        defaultQuotedAttachmentView.setImageResource(C19469R.drawable.stream_ui_ic_file);
        return defaultQuotedAttachmentView;
    }
}
