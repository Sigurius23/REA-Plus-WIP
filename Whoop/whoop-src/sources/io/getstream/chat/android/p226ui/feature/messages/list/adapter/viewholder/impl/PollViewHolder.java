package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessagePollBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import l83.C23454a0;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "messageListListeners", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;", "getBinding$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemMessagePollBinding binding;
    private final MessageListListeners messageListListeners;
    private final MessageListItemStyle style;

    public /* synthetic */ PollViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, MessageListItemStyle messageListItemStyle, StreamUiItemMessagePollBinding streamUiItemMessagePollBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, messageListItemStyle, (i13 & 16) != 0 ? StreamUiItemMessagePollBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemMessagePollBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$1(PollViewHolder pollViewHolder, MessageListItem.MessageItem messageItem, Poll poll, Option option) {
        MessageListView.OnPollOptionClickListener onPollOptionClickListener;
        AbstractC22676k.m65750j(option, "option");
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onPollOptionClickListener = messageListListeners.getOnPollOptionClickListener()) != null) {
            onPollOptionClickListener.onPollOptionClick(messageItem.getMessage(), poll, option);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$2(PollViewHolder pollViewHolder, Poll poll, Poll it) {
        MessageListView.OnPollCloseClickListener onPollCloseClickListener;
        AbstractC22676k.m65750j(it, "it");
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onPollCloseClickListener = messageListListeners.getOnPollCloseClickListener()) != null) {
            onPollCloseClickListener.onPollCloseClick(poll);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$3(PollViewHolder pollViewHolder, Poll poll, Poll it) {
        MessageListView.OnViewPollResultClickListener onViewPollResultClickListener;
        AbstractC22676k.m65750j(it, "it");
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onViewPollResultClickListener = messageListListeners.getOnViewPollResultClickListener()) != null) {
            onViewPollResultClickListener.onViewPollResultClick(poll);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$4(PollViewHolder pollViewHolder, MessageListItem.MessageItem messageItem, Poll poll) {
        MessageListView.OnShowAllPollOptionClickListener onShowAllPollOptionClickListener;
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onShowAllPollOptionClickListener = messageListListeners.getOnShowAllPollOptionClickListener()) != null) {
            onShowAllPollOptionClickListener.onShowAllPollOptionClick(messageItem.getMessage(), poll);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$5(PollViewHolder pollViewHolder, Poll poll, Poll it) {
        MessageListView.OnSuggestPollOptionClickListener onSuggestPollOptionClickListener;
        AbstractC22676k.m65750j(it, "it");
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onSuggestPollOptionClickListener = messageListListeners.getOnSuggestPollOptionClickListener()) != null) {
            onSuggestPollOptionClickListener.onSuggestPollOptionClick(poll);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$6(PollViewHolder pollViewHolder, MessageListItem.MessageItem messageItem, Poll poll, Poll it) {
        MessageListView.OnAddPollCommentClickListener onAddPollCommentClickListener;
        AbstractC22676k.m65750j(it, "it");
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onAddPollCommentClickListener = messageListListeners.getOnAddPollCommentClickListener()) != null) {
            onAddPollCommentClickListener.onAddPollCommentClick(messageItem.getMessage(), poll);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$8$lambda$7(PollViewHolder pollViewHolder, MessageListItem.MessageItem messageItem, Poll poll, Poll it) {
        MessageListView.OnViewPollCommentsClickListener onViewPollCommentsClickListener;
        AbstractC22676k.m65750j(it, "it");
        MessageListListeners messageListListeners = pollViewHolder.messageListListeners;
        if (messageListListeners != null && (onViewPollCommentsClickListener = messageListListeners.getOnViewPollCommentsClickListener()) != null) {
            onViewPollCommentsClickListener.onViewPollCommentsClick(messageItem.getMessage(), poll);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: getBinding$stream_chat_android_ui_components_release, reason: from getter */
    public final StreamUiItemMessagePollBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(final MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        final Poll poll = data.getMessage().getPoll();
        if (poll != null) {
            if (!diff.getPoll()) {
                poll = null;
            }
            if (poll != null) {
                this.binding.pollView.setPoll(poll, data.isMine());
                final int i13 = 0;
                this.binding.pollView.setOnOptionClick(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.r

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PollViewHolder f74717x;

                    {
                        this.f74717x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                PollViewHolder.bindData$lambda$8$lambda$1(this.f74717x, data, poll, (Option) obj);
                                break;
                            case 1:
                                PollViewHolder.bindData$lambda$8$lambda$6(this.f74717x, data, poll, (Poll) obj);
                                break;
                            default:
                                PollViewHolder.bindData$lambda$8$lambda$7(this.f74717x, data, poll, (Poll) obj);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                this.binding.pollView.setOnClosePollClick(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.s

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PollViewHolder f74721x;

                    {
                        this.f74721x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                PollViewHolder.bindData$lambda$8$lambda$2(this.f74721x, poll, (Poll) obj);
                                break;
                            case 1:
                                PollViewHolder.bindData$lambda$8$lambda$3(this.f74721x, poll, (Poll) obj);
                                break;
                            default:
                                PollViewHolder.bindData$lambda$8$lambda$5(this.f74721x, poll, (Poll) obj);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                final int i14 = 1;
                this.binding.pollView.setOnViewPollResultsClick(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.s

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PollViewHolder f74721x;

                    {
                        this.f74721x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                PollViewHolder.bindData$lambda$8$lambda$2(this.f74721x, poll, (Poll) obj);
                                break;
                            case 1:
                                PollViewHolder.bindData$lambda$8$lambda$3(this.f74721x, poll, (Poll) obj);
                                break;
                            default:
                                PollViewHolder.bindData$lambda$8$lambda$5(this.f74721x, poll, (Poll) obj);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                this.binding.pollView.setOnShowAllPollOptionClick(new C18656a0(this, data, poll, 6));
                final int i15 = 2;
                this.binding.pollView.setOnSuggestOptionClick(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.s

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PollViewHolder f74721x;

                    {
                        this.f74721x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                PollViewHolder.bindData$lambda$8$lambda$2(this.f74721x, poll, (Poll) obj);
                                break;
                            case 1:
                                PollViewHolder.bindData$lambda$8$lambda$3(this.f74721x, poll, (Poll) obj);
                                break;
                            default:
                                PollViewHolder.bindData$lambda$8$lambda$5(this.f74721x, poll, (Poll) obj);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                final int i16 = 1;
                this.binding.pollView.setOnAddCommentClick(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.r

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PollViewHolder f74717x;

                    {
                        this.f74717x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                PollViewHolder.bindData$lambda$8$lambda$1(this.f74717x, data, poll, (Option) obj);
                                break;
                            case 1:
                                PollViewHolder.bindData$lambda$8$lambda$6(this.f74717x, data, poll, (Poll) obj);
                                break;
                            default:
                                PollViewHolder.bindData$lambda$8$lambda$7(this.f74717x, data, poll, (Poll) obj);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
                final int i17 = 2;
                this.binding.pollView.setOnViewCommentsClick(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.r

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PollViewHolder f74717x;

                    {
                        this.f74717x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                PollViewHolder.bindData$lambda$8$lambda$1(this.f74717x, data, poll, (Option) obj);
                                break;
                            case 1:
                                PollViewHolder.bindData$lambda$8$lambda$6(this.f74717x, data, poll, (Poll) obj);
                                break;
                            default:
                                PollViewHolder.bindData$lambda$8$lambda$7(this.f74717x, data, poll, (Poll) obj);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                });
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PollViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, MessageListItemStyle style, StreamUiItemMessagePollBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.messageListListeners = messageListListeners;
        this.style = style;
        this.binding = binding;
    }
}
