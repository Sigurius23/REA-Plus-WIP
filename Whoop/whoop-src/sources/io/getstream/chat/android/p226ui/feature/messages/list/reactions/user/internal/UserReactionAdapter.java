package io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import b30.ViewOnClickListenerC2558k3;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.extensions.internal.ViewHolderKt;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageOptionsUserReactionAlignment;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageOptionsUserReactionAlignmentKt;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemUserReactionBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;", "userReactionClickListener", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;I)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;", "value", "messageOptionsUserReactionAlignment", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;", "getMessageOptionsUserReactionAlignment", "()Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;", "setMessageOptionsUserReactionAlignment", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V", "UserReactionViewHolder", "UserReactionItemDiffCallback", "UserReactionClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserReactionAdapter extends AbstractC1759z0 {
    private MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment;
    private final UserReactionClickListener userReactionClickListener;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;", "", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "userReaction", "Ll83/a0;", "onUserReactionClick", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface UserReactionClickListener {
        void onUserReactionClick(UserReactionItem userReaction);
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionItemDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class UserReactionItemDiffCallback extends AbstractC1738u {
        public static final UserReactionItemDiffCallback INSTANCE = new UserReactionItemDiffCallback();

        private UserReactionItemDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areContentsTheSame(UserReactionItem oldItem, UserReactionItem newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areItemsTheSame(UserReactionItem oldItem, UserReactionItem newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return AbstractC22676k.m65745e(oldItem.getUser().getId(), newItem.getUser().getId()) && AbstractC22676k.m65745e(oldItem.getReaction().getType(), newItem.getReaction().getType());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserReactionAdapter(UserReactionClickListener userReactionClickListener) {
        super(UserReactionItemDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(userReactionClickListener, "userReactionClickListener");
        this.userReactionClickListener = userReactionClickListener;
        this.messageOptionsUserReactionAlignment = MessageOptionsUserReactionAlignment.BY_USER;
    }

    public final MessageOptionsUserReactionAlignment getMessageOptionsUserReactionAlignment() {
        return this.messageOptionsUserReactionAlignment;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setMessageOptionsUserReactionAlignment(MessageOptionsUserReactionAlignment value) {
        AbstractC22676k.m65750j(value, "value");
        this.messageOptionsUserReactionAlignment = value;
        notifyDataSetChanged();
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;", "binding", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;", "userReactionClickListener", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;", "messageOptionsUserReactionAlignment", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V", "Ll83/a0;", "bindUserAvatar", "()V", "bindUserName", "bindUserReaction", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "userReactionItem", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class UserReactionViewHolder extends AbstractC1717o2 {
        private final StreamUiItemUserReactionBinding binding;
        private final MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment;
        private final UserReactionClickListener userReactionClickListener;
        private UserReactionItem userReactionItem;

        public /* synthetic */ UserReactionViewHolder(StreamUiItemUserReactionBinding streamUiItemUserReactionBinding, UserReactionClickListener userReactionClickListener, MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(streamUiItemUserReactionBinding, userReactionClickListener, (i13 & 4) != 0 ? MessageOptionsUserReactionAlignment.BY_USER : messageOptionsUserReactionAlignment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(UserReactionViewHolder userReactionViewHolder, View view) {
            UserReactionClickListener userReactionClickListener = userReactionViewHolder.userReactionClickListener;
            UserReactionItem userReactionItem = userReactionViewHolder.userReactionItem;
            if (userReactionItem != null) {
                userReactionClickListener.onUserReactionClick(userReactionItem);
            } else {
                AbstractC22676k.m65757q("userReactionItem");
                throw null;
            }
        }

        private final void bindUserAvatar() {
            UserAvatarView userAvatarView = this.binding.userAvatarView;
            UserReactionItem userReactionItem = this.userReactionItem;
            if (userReactionItem != null) {
                UserAvatarView.setUser$default(userAvatarView, userReactionItem.getUser(), false, 2, null);
            } else {
                AbstractC22676k.m65757q("userReactionItem");
                throw null;
            }
        }

        private final void bindUserName() {
            TextView textView = this.binding.userNameTextView;
            UserReactionItem userReactionItem = this.userReactionItem;
            if (userReactionItem != null) {
                textView.setText(userReactionItem.getUser().getName());
            } else {
                AbstractC22676k.m65757q("userReactionItem");
                throw null;
            }
        }

        private final void bindUserReaction() {
            StreamUiItemUserReactionBinding streamUiItemUserReactionBinding = this.binding;
            ConstraintLayout reactionContainer = streamUiItemUserReactionBinding.reactionContainer;
            AbstractC22676k.m65749i(reactionContainer, "reactionContainer");
            ConstraintLayoutKt.updateConstraints(reactionContainer, new C19616a(24));
            MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment = this.messageOptionsUserReactionAlignment;
            UserReactionItem userReactionItem = this.userReactionItem;
            if (userReactionItem == null) {
                AbstractC22676k.m65757q("userReactionItem");
                throw null;
            }
            boolean zIsStartAlignment = MessageOptionsUserReactionAlignmentKt.isStartAlignment(messageOptionsUserReactionAlignment, userReactionItem.isMine());
            SingleReactionView userReactionView = streamUiItemUserReactionBinding.userReactionView;
            AbstractC22676k.m65749i(userReactionView, "userReactionView");
            ViewGroup.LayoutParams layoutParams = userReactionView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C1141d c1141d = (C1141d) layoutParams;
            if (zIsStartAlignment) {
                c1141d.f5073t = 0;
                c1141d.setMarginStart(ContextKt.getDimension(ViewHolderKt.getContext(this), C19469R.dimen.stream_ui_spacing_small));
            } else {
                c1141d.f5075v = 0;
                c1141d.setMarginEnd(ContextKt.getDimension(ViewHolderKt.getContext(this), C19469R.dimen.stream_ui_spacing_small));
            }
            userReactionView.setLayoutParams(c1141d);
            SingleReactionView singleReactionView = streamUiItemUserReactionBinding.userReactionView;
            UserReactionItem userReactionItem2 = this.userReactionItem;
            if (userReactionItem2 != null) {
                singleReactionView.setReaction(userReactionItem2);
            } else {
                AbstractC22676k.m65757q("userReactionItem");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 bindUserReaction$lambda$3$lambda$1(C1153p updateConstraints) {
            AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
            updateConstraints.m3646c(C19469R.id.userReactionView, 6);
            updateConstraints.m3646c(C19469R.id.userReactionView, 7);
            return C23454a0.f92919a;
        }

        public final void bind(UserReactionItem userReactionItem) {
            AbstractC22676k.m65750j(userReactionItem, "userReactionItem");
            this.userReactionItem = userReactionItem;
            bindUserAvatar();
            bindUserName();
            bindUserReaction();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserReactionViewHolder(StreamUiItemUserReactionBinding binding, UserReactionClickListener userReactionClickListener, MessageOptionsUserReactionAlignment messageOptionsUserReactionAlignment) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(userReactionClickListener, "userReactionClickListener");
            AbstractC22676k.m65750j(messageOptionsUserReactionAlignment, "messageOptionsUserReactionAlignment");
            this.binding = binding;
            this.userReactionClickListener = userReactionClickListener;
            this.messageOptionsUserReactionAlignment = messageOptionsUserReactionAlignment;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2558k3(this, 25));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(UserReactionViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((UserReactionItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final UserReactionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new UserReactionViewHolder(StreamUiItemUserReactionBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.userReactionClickListener, this.messageOptionsUserReactionAlignment);
    }
}
