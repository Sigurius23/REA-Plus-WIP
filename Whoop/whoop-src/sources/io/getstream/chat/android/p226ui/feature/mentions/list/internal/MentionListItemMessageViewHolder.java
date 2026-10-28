package io.getstream.chat.android.p226ui.feature.mentions.list.internal;

import android.view.View;
import android.view.ViewGroup;
import b30.ViewOnClickListenerC2558k3;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMentionListBinding;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListItem;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListView;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import io.getstream.chat.android.p226ui.feature.messages.preview.internal.MessagePreviewView;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;", "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "style", "Landroid/view/ViewGroup;", "parentView", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;", "binding", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "clickListener", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListItemMessageViewHolder extends MentionListItemViewHolder<MentionListItem.MessageItem> {
    private final StreamUiItemMentionListBinding binding;
    private final MentionListView.MentionSelectedListener clickListener;
    private Message message;

    public /* synthetic */ MentionListItemMessageViewHolder(MessagePreviewStyle messagePreviewStyle, ViewGroup viewGroup, StreamUiItemMentionListBinding streamUiItemMentionListBinding, MentionListView.MentionSelectedListener mentionSelectedListener, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagePreviewStyle, viewGroup, (i13 & 4) != 0 ? StreamUiItemMentionListBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemMentionListBinding, mentionSelectedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MentionListItemMessageViewHolder mentionListItemMessageViewHolder, View view) {
        MentionListView.MentionSelectedListener mentionSelectedListener = mentionListItemMessageViewHolder.clickListener;
        if (mentionSelectedListener != null) {
            Message message = mentionListItemMessageViewHolder.message;
            if (message != null) {
                mentionSelectedListener.onMentionSelected(message);
            } else {
                AbstractC22676k.m65757q("message");
                throw null;
            }
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.mentions.list.internal.MentionListItemViewHolder
    public final void bind(MentionListItem.MessageItem item) {
        AbstractC22676k.m65750j(item, "item");
        this.message = item.getMessage().getMessage();
        this.binding.getRoot().renderMessageResult(item.getMessage());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MentionListItemMessageViewHolder(MessagePreviewStyle messagePreviewStyle, ViewGroup parentView, StreamUiItemMentionListBinding binding, MentionListView.MentionSelectedListener mentionSelectedListener) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(binding, "binding");
        MessagePreviewView root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        this.clickListener = mentionSelectedListener;
        if (messagePreviewStyle != null) {
            binding.getRoot().styleView(messagePreviewStyle);
        }
        this.itemView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 13));
    }
}
