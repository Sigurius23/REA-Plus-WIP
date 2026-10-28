package io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whoop.service.network.model.UserState;
import hn.C17508p;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageOptionsUserReactionAlignmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiUserReactionsViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.helper.SupportedReactions;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "bindTitle", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/models/User;", "currentUser", "bindReactionList", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)V", "setMessage", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;", "userReactionClickListener", "setOnUserReactionClickListener$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;)V", "setOnUserReactionClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "messageListViewStyle", "configure$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V", "configure", "Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;", "userReactionsAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;", "Companion", "UserReactionClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserReactionsView extends FrameLayout {
    private static final Companion Companion = new Companion();
    private static final int MAX_COLUMNS_COUNT = 4;
    private final StreamUiUserReactionsViewBinding binding;
    private final GridLayoutManager gridLayoutManager;
    private UserReactionClickListener userReactionClickListener;
    private final UserReactionAdapter userReactionsAdapter;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$Companion;", "", "<init>", "()V", "MAX_COLUMNS_COUNT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView$UserReactionClickListener;", "", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/models/Reaction;", "reaction", "Ll83/a0;", "onUserReactionClick", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface UserReactionClickListener {
        void onUserReactionClick(User user, Reaction reaction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserReactionsView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void bindReactionList(Message message, User currentUser) {
        List<Reaction> supportedLatestReactions = MessageKt.getSupportedLatestReactions(message);
        ArrayList arrayList = new ArrayList();
        for (Reaction reaction : supportedLatestReactions) {
            User user = reaction.getUser();
            SupportedReactions.ReactionDrawable reactionDrawable = ChatUI.getSupportedReactions().getReactionDrawable(reaction.getType());
            UserReactionItem userReactionItem = (user == null || reactionDrawable == null) ? null : new UserReactionItem(user, reaction, AbstractC22676k.m65745e(user.getId(), currentUser.getId()), reactionDrawable);
            if (userReactionItem != null) {
                arrayList.add(userReactionItem);
            }
        }
        GridLayoutManager gridLayoutManager = this.gridLayoutManager;
        int size = arrayList.size();
        if (size > 4) {
            size = 4;
        }
        if (size < 1) {
            size = 1;
        }
        gridLayoutManager.m5108y(size);
        this.userReactionsAdapter.submitList(arrayList);
    }

    private final void bindTitle(Message message) {
        int size = MessageKt.getSupportedLatestReactions(message).size();
        this.binding.userReactionsTitleTextView.setText(getContext().getResources().getQuantityString(C19469R.plurals.stream_ui_message_list_message_reactions, size, Integer.valueOf(size)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void userReactionsAdapter$lambda$0(UserReactionsView userReactionsView, UserReactionItem it) {
        AbstractC22676k.m65750j(it, "it");
        UserReactionClickListener userReactionClickListener = userReactionsView.userReactionClickListener;
        if (userReactionClickListener != null) {
            userReactionClickListener.onUserReactionClick(it.getUser(), it.getReaction());
        }
    }

    public final void configure$stream_chat_android_ui_components_release(MessageListViewStyle messageListViewStyle) {
        AbstractC22676k.m65750j(messageListViewStyle, "messageListViewStyle");
        this.binding.userReactionsContainer.setCardBackgroundColor(messageListViewStyle.getUserReactionsBackgroundColor());
        TextView userReactionsTitleTextView = this.binding.userReactionsTitleTextView;
        AbstractC22676k.m65749i(userReactionsTitleTextView, "userReactionsTitleTextView");
        TextStyleKt.setTextStyle(userReactionsTitleTextView, messageListViewStyle.getUserReactionsTitleText());
        this.userReactionsAdapter.setMessageOptionsUserReactionAlignment(MessageOptionsUserReactionAlignmentKt.getUserReactionAlignment(messageListViewStyle.getMessageOptionsUserReactionAlignment()));
    }

    public final void setMessage(Message message, User currentUser) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        bindTitle(message);
        bindReactionList(message, currentUser);
    }

    /* JADX INFO: renamed from: setOnUserReactionClickListener$stream_chat_android_ui_components_release */
    public final void m55647xa633a074(UserReactionClickListener userReactionClickListener) {
        AbstractC22676k.m65750j(userReactionClickListener, "userReactionClickListener");
        this.userReactionClickListener = userReactionClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserReactionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserReactionsView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        StreamUiUserReactionsViewBinding streamUiUserReactionsViewBindingInflate = StreamUiUserReactionsViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        this.binding = streamUiUserReactionsViewBindingInflate;
        UserReactionAdapter userReactionAdapter = new UserReactionAdapter(new C17508p(this, 10));
        this.userReactionsAdapter = userReactionAdapter;
        streamUiUserReactionsViewBindingInflate.recyclerView.setAdapter(userReactionAdapter);
        AbstractC1740u1 layoutManager = streamUiUserReactionsViewBindingInflate.recyclerView.getLayoutManager();
        AbstractC22676k.m65748h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        this.gridLayoutManager = (GridLayoutManager) layoutManager;
    }
}
