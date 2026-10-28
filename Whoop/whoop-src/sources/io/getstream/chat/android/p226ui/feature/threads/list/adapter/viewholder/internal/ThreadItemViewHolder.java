package io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.internal;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b30.ViewOnClickListenerC2558k3;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemThreadListBinding;
import io.getstream.chat.android.p226ui.feature.messages.preview.internal.MessagePreviewView;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListViewStyle;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.BaseThreadListItemViewHolder;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.StringKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;", "Landroid/view/ViewGroup;", "parentView", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "clickListener", "Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;)V", "Ll83/a0;", "applyStyle", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V", "Lio/getstream/chat/android/models/User;", "currentUser", "bindThreadTitle", "(Lio/getstream/chat/android/models/User;)V", "bindReplyTo", "()V", "bindUnreadCountBadge", "bindLatestReply", "Lio/getstream/chat/android/models/Message;", "message", "", "formatMessage", "(Lio/getstream/chat/android/models/Message;)Ljava/lang/CharSequence;", "item", "bind", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;)V", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;", "Lio/getstream/chat/android/models/Thread;", "thread", "Lio/getstream/chat/android/models/Thread;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadItemViewHolder extends BaseThreadListItemViewHolder<ThreadListItem.ThreadItem> {
    private static final Companion Companion = new Companion();
    private static final int MAX_UNREAD_COUNT = 99;
    private final StreamUiItemThreadListBinding binding;
    private final ThreadListView.ThreadClickListener clickListener;
    private Thread thread;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder$Companion;", "", "<init>", "()V", "MAX_UNREAD_COUNT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ ThreadItemViewHolder(ViewGroup viewGroup, ThreadListViewStyle threadListViewStyle, ThreadListView.ThreadClickListener threadClickListener, StreamUiItemThreadListBinding streamUiItemThreadListBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, threadListViewStyle, threadClickListener, (i13 & 8) != 0 ? StreamUiItemThreadListBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemThreadListBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ThreadItemViewHolder threadItemViewHolder, View view) {
        ThreadListView.ThreadClickListener threadClickListener = threadItemViewHolder.clickListener;
        if (threadClickListener != null) {
            Thread thread = threadItemViewHolder.thread;
            if (thread != null) {
                threadClickListener.onThreadClick(thread);
            } else {
                AbstractC22676k.m65757q("thread");
                throw null;
            }
        }
    }

    private final void applyStyle(ThreadListViewStyle style) {
        this.binding.threadImage.setImageDrawable(style.getThreadIconDrawable());
        TextView threadTitleTextView = this.binding.threadTitleTextView;
        AbstractC22676k.m65749i(threadTitleTextView, "threadTitleTextView");
        TextStyleKt.setTextStyle(threadTitleTextView, style.getThreadTitleStyle());
        TextView replyToTextView = this.binding.replyToTextView;
        AbstractC22676k.m65749i(replyToTextView, "replyToTextView");
        TextStyleKt.setTextStyle(replyToTextView, style.getThreadReplyToStyle());
        this.binding.latestReplyMessageView.getBinding().getRoot().setBackground(null);
        this.binding.latestReplyMessageView.styleView(style.getLatestReplyStyle());
        TextView unreadCountBadge = this.binding.unreadCountBadge;
        AbstractC22676k.m65749i(unreadCountBadge, "unreadCountBadge");
        TextStyleKt.setTextStyle(unreadCountBadge, style.getUnreadCountBadgeTextStyle());
        this.binding.unreadCountBadge.setBackground(style.getUnreadCountBadgeBackground());
    }

    private final void bindLatestReply() {
        Thread thread = this.thread;
        if (thread == null) {
            AbstractC22676k.m65757q("thread");
            throw null;
        }
        Message message = (Message) AbstractC25265s.m74114R0(thread.getLatestReplies());
        if (message == null) {
            MessagePreviewView latestReplyMessageView = this.binding.latestReplyMessageView;
            AbstractC22676k.m65749i(latestReplyMessageView, "latestReplyMessageView");
            latestReplyMessageView.setVisibility(8);
            return;
        }
        UserAvatarView.setUser$default(this.binding.latestReplyMessageView.getBinding().userAvatarView, message.getUser(), false, 2, null);
        this.binding.latestReplyMessageView.getBinding().senderNameLabel.setText(StringKt.bold$default(message.getUser().getName(), null, false, 3, null));
        this.binding.latestReplyMessageView.getBinding().messageLabel.setText(formatMessage(message));
        this.binding.latestReplyMessageView.getBinding().messageTimeLabel.setText(ChatUI.getDateFormatter().formatDate(MessageExtensionsKt.getCreatedAtOrNull(message)));
        MessagePreviewView latestReplyMessageView2 = this.binding.latestReplyMessageView;
        AbstractC22676k.m65749i(latestReplyMessageView2, "latestReplyMessageView");
        latestReplyMessageView2.setVisibility(0);
    }

    private final void bindReplyTo() throws IOException {
        String string = this.binding.getRoot().getContext().getString(C19469R.string.stream_ui_thread_list_replied_to);
        AbstractC22676k.m65749i(string, "getString(...)");
        Thread thread = this.thread;
        if (thread == null) {
            AbstractC22676k.m65757q("thread");
            throw null;
        }
        this.binding.replyToTextView.setText(string + ((Object) formatMessage(thread.getParentMessage())));
    }

    private final void bindThreadTitle(User currentUser) {
        String title;
        Thread thread = this.thread;
        if (thread == null) {
            AbstractC22676k.m65757q("thread");
            throw null;
        }
        Channel channel = thread.getChannel();
        if (channel != null) {
            title = ChatUI.getChannelNameFormatter().formatChannelName(channel, currentUser);
        } else {
            Thread thread2 = this.thread;
            if (thread2 == null) {
                AbstractC22676k.m65757q("thread");
                throw null;
            }
            title = thread2.getTitle();
        }
        this.binding.threadTitleTextView.setText(title);
    }

    private final void bindUnreadCountBadge(User currentUser) {
        Thread thread = this.thread;
        Object obj = null;
        if (thread == null) {
            AbstractC22676k.m65757q("thread");
            throw null;
        }
        for (Object obj2 : thread.getRead()) {
            if (AbstractC22676k.m65745e(((ChannelUserRead) obj2).getUser().getId(), currentUser != null ? currentUser.getId() : null)) {
                obj = obj2;
                break;
            }
        }
        ChannelUserRead channelUserRead = (ChannelUserRead) obj;
        int unreadMessages = channelUserRead != null ? channelUserRead.getUnreadMessages() : 0;
        if (unreadMessages <= 0) {
            TextView unreadCountBadge = this.binding.unreadCountBadge;
            AbstractC22676k.m65749i(unreadCountBadge, "unreadCountBadge");
            unreadCountBadge.setVisibility(8);
        } else {
            this.binding.unreadCountBadge.setText(unreadMessages > 99 ? "99+" : String.valueOf(unreadMessages));
            TextView unreadCountBadge2 = this.binding.unreadCountBadge;
            AbstractC22676k.m65749i(unreadCountBadge2, "unreadCountBadge");
            unreadCountBadge2.setVisibility(0);
        }
    }

    private final CharSequence formatMessage(Message message) throws IOException {
        if (MessageUtils.hasAudioRecording(message)) {
            String string = this.itemView.getContext().getString(C19469R.string.stream_ui_message_audio_reply_info);
            AbstractC22676k.m65749i(string, "getString(...)");
            return StringKt.italicize$default(string, null, false, 3, null);
        }
        List listM118959K = AbstractC37056f.m118959K(AbstractC39414r.m125869O0(MessageKt.getTranslatedText$default(message, null, 1, null)).toString(), MessageKt.getAttachmentsText(message));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM118959K) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence != null && charSequence.length() != 0) {
                arrayList.add(obj);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AbstractC25265s.m74109M0(arrayList, spannableStringBuilder, " ", null, null, null, 124);
        return spannableStringBuilder;
    }

    @Override // io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.BaseThreadListItemViewHolder
    public final void bind(ThreadListItem.ThreadItem item) throws IOException {
        AbstractC22676k.m65750j(item, "item");
        this.thread = item.getThread();
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        bindThreadTitle(currentUser);
        bindReplyTo();
        bindUnreadCountBadge(currentUser);
        bindLatestReply();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ThreadItemViewHolder(ViewGroup parentView, ThreadListViewStyle style, ThreadListView.ThreadClickListener threadClickListener, StreamUiItemThreadListBinding binding) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.clickListener = threadClickListener;
        this.binding = binding;
        applyStyle(style);
        binding.getRoot().setOnClickListener(new ViewOnClickListenerC2558k3(this, 27));
    }
}
