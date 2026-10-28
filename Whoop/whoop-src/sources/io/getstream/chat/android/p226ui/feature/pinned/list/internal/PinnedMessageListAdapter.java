package io.getstream.chat.android.p226ui.feature.pinned.list.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1759z0;
import b13.ViewOnClickListenerC2292a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemListLoadingBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMentionListBinding;
import io.getstream.chat.android.p226ui.feature.internal.MessageResultDiffCallback;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import io.getstream.chat.android.p226ui.feature.pinned.list.PinnedMessageListView;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001f !B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "Landroidx/recyclerview/widget/o2;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/o2;I)V", "getItemViewType", "(I)I", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;", "pinnedMessageSelectedListener", "setPinnedMessageSelectedListener", "(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "messagePreviewStyle", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "getMessagePreviewStyle", "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "setMessagePreviewStyle", "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V", "Companion", "PinnedMessageLoadingMoreView", "MessagePreviewViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessageListAdapter extends AbstractC1759z0 {
    private static final int ITEM_LOADING_MORE = 1;
    private static final int ITEM_MESSAGE = 0;
    private MessagePreviewStyle messagePreviewStyle;
    private PinnedMessageListView.PinnedMessageSelectedListener pinnedMessageSelectedListener;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;)V", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "messageResult", "Ll83/a0;", "bind$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V", "bind", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class MessagePreviewViewHolder extends AbstractC1717o2 {
        private final StreamUiItemMentionListBinding binding;
        private Message message;
        final /* synthetic */ PinnedMessageListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagePreviewViewHolder(PinnedMessageListAdapter pinnedMessageListAdapter, StreamUiItemMentionListBinding binding) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            this.this$0 = pinnedMessageListAdapter;
            this.binding = binding;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2292a(5, pinnedMessageListAdapter, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(PinnedMessageListAdapter pinnedMessageListAdapter, MessagePreviewViewHolder messagePreviewViewHolder, View view) {
            PinnedMessageListView.PinnedMessageSelectedListener pinnedMessageSelectedListener = pinnedMessageListAdapter.pinnedMessageSelectedListener;
            if (pinnedMessageSelectedListener != null) {
                Message message = messagePreviewViewHolder.message;
                if (message != null) {
                    pinnedMessageSelectedListener.onPinnedMessageSelected(message);
                } else {
                    AbstractC22676k.m65757q("message");
                    throw null;
                }
            }
        }

        public final void bind$stream_chat_android_ui_components_release(MessageResult messageResult) {
            AbstractC22676k.m65750j(messageResult, "messageResult");
            this.message = messageResult.getMessage();
            this.binding.getRoot().renderMessageResult(messageResult);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class PinnedMessageLoadingMoreView extends AbstractC1717o2 {
        final /* synthetic */ PinnedMessageListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinnedMessageLoadingMoreView(PinnedMessageListAdapter pinnedMessageListAdapter, StreamUiItemListLoadingBinding binding) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            this.this$0 = pinnedMessageListAdapter;
        }
    }

    public PinnedMessageListAdapter() {
        super(MessageResultDiffCallback.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        return (((MessageResult) getItem(position)).getMessage().getId().length() > 0 ? 1 : 0) ^ 1;
    }

    public final MessagePreviewStyle getMessagePreviewStyle() {
        return this.messagePreviewStyle;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        if (holder instanceof MessagePreviewViewHolder) {
            Object item = getItem(position);
            AbstractC22676k.m65749i(item, "getItem(...)");
            ((MessagePreviewViewHolder) holder).bind$stream_chat_android_ui_components_release((MessageResult) item);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        if (viewType != 0) {
            return new PinnedMessageLoadingMoreView(this, StreamUiItemListLoadingBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false));
        }
        StreamUiItemMentionListBinding streamUiItemMentionListBindingInflate = StreamUiItemMentionListBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
        MessagePreviewStyle messagePreviewStyle = this.messagePreviewStyle;
        if (messagePreviewStyle != null) {
            streamUiItemMentionListBindingInflate.getRoot().styleView(messagePreviewStyle);
        }
        return new MessagePreviewViewHolder(this, streamUiItemMentionListBindingInflate);
    }

    public final void setMessagePreviewStyle(MessagePreviewStyle messagePreviewStyle) {
        this.messagePreviewStyle = messagePreviewStyle;
    }

    public final void setPinnedMessageSelectedListener(PinnedMessageListView.PinnedMessageSelectedListener pinnedMessageSelectedListener) {
        this.pinnedMessageSelectedListener = pinnedMessageSelectedListener;
    }
}
