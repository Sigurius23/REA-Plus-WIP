package io.getstream.chat.android.p226ui.helper.transformer;

import android.widget.TextView;
import c93.InterfaceC4351m;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.utils.Linkify;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/transformer/AutoLinkableTextTransformer;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lkotlin/Function2;", "Landroid/widget/TextView;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Ll83/a0;", "transformer", "<init>", "(Lc93/m;)V", "textView", "messageItem", "transformAndApply", "(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lc93/m;", "getTransformer", "()Lc93/m;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AutoLinkableTextTransformer implements ChatMessageTextTransformer {
    private final InterfaceC4351m transformer;

    public AutoLinkableTextTransformer(InterfaceC4351m transformer) {
        AbstractC22676k.m65750j(transformer, "transformer");
        this.transformer = transformer;
    }

    public final InterfaceC4351m getTransformer() {
        return this.transformer;
    }

    @Override // io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer
    public final void transformAndApply(TextView textView, MessageListItem.MessageItem messageItem) {
        AbstractC22676k.m65750j(textView, "textView");
        AbstractC22676k.m65750j(messageItem, "messageItem");
        this.transformer.invoke(textView, messageItem);
        Linkify.INSTANCE.addLinks(textView, messageItem.getMessage().getMentionedUsers());
    }
}
