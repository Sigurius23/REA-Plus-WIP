package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.VotingVisibility;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentPollCommentsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollCommentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import io.getstream.chat.android.p226ui.viewmodel.messages.PollCommentsViewModel;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p314m.C24835d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00061"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;", "Lm/d0;", "<init>", "()V", "Lio/getstream/chat/android/models/Poll;", "poll", "Ll83/a0;", "render", "(Lio/getstream/chat/android/models/Poll;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getTheme", "()I", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;", "Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;", "viewModel$delegate", "Ll83/h;", "getViewModel", "()Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;", "viewModel", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;", "commentsAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollCommentsBinding;", "binding", "", "getCid", "()Ljava/lang/String;", "cid", "getMessageId", "messageId", "Companion", "CommentItem", "CommentsAdapter", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollCommentsDialogFragment extends C24835d0 {
    private static final String ARG_CID = "arg_cid";
    private static final String ARG_MESSAGE_ID = "arg_message_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "PollCommentsDialogFragment";
    private StreamUiFragmentPollCommentsBinding _binding;
    private final CommentsAdapter commentsAdapter;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;", "", "answer", "Lio/getstream/chat/android/models/Answer;", "showUser", "", "<init>", "(Lio/getstream/chat/android/models/Answer;Z)V", "getAnswer", "()Lio/getstream/chat/android/models/Answer;", "getShowUser", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class CommentItem {
        private final Answer answer;
        private final boolean showUser;

        public CommentItem(Answer answer, boolean z4) {
            AbstractC22676k.m65750j(answer, "answer");
            this.answer = answer;
            this.showUser = z4;
        }

        public static /* synthetic */ CommentItem copy$default(CommentItem commentItem, Answer answer, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                answer = commentItem.answer;
            }
            if ((i13 & 2) != 0) {
                z4 = commentItem.showUser;
            }
            return commentItem.copy(answer, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Answer getAnswer() {
            return this.answer;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShowUser() {
            return this.showUser;
        }

        public final CommentItem copy(Answer answer, boolean showUser) {
            AbstractC22676k.m65750j(answer, "answer");
            return new CommentItem(answer, showUser);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentItem)) {
                return false;
            }
            CommentItem commentItem = (CommentItem) other;
            return AbstractC22676k.m65745e(this.answer, commentItem.answer) && this.showUser == commentItem.showUser;
        }

        public final Answer getAnswer() {
            return this.answer;
        }

        public final boolean getShowUser() {
            return this.showUser;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showUser) + (this.answer.hashCode() * 31);
        }

        public final String toString() {
            return "CommentItem(answer=" + this.answer + ", showUser=" + this.showUser + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;I)V", "CommentDiffCallback", "CommentViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class CommentsAdapter extends AbstractC1759z0 {

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class CommentDiffCallback extends AbstractC1738u {
            public static final CommentDiffCallback INSTANCE = new CommentDiffCallback();

            private CommentDiffCallback() {
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areContentsTheSame(CommentItem oldItem, CommentItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return oldItem.equals(newItem);
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areItemsTheSame(CommentItem oldItem, CommentItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return AbstractC22676k.m65745e(oldItem.getAnswer().getId(), newItem.getAnswer().getId());
            }
        }

        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentsAdapter$CommentViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$CommentItem;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCommentBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class CommentViewHolder extends AbstractC1717o2 {
            private final StreamUiItemPollCommentBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CommentViewHolder(StreamUiItemPollCommentBinding binding) {
                super(binding.getRoot());
                AbstractC22676k.m65750j(binding, "binding");
                this.binding = binding;
            }

            public final void bind(CommentItem item) {
                AbstractC22676k.m65750j(item, "item");
                Answer answer = item.getAnswer();
                this.binding.answerText.setText(answer.getText());
                User user = answer.getUser();
                if (user == null || !item.getShowUser()) {
                    user = null;
                }
                if (user != null) {
                    this.binding.name.setText(user.getName());
                    UserAvatarView.setUser$default(this.binding.userAvatarView, user, false, 2, null);
                    UserAvatarView userAvatarView = this.binding.userAvatarView;
                    AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
                    userAvatarView.setVisibility(0);
                } else {
                    this.binding.name.setText("");
                    UserAvatarView userAvatarView2 = this.binding.userAvatarView;
                    AbstractC22676k.m65749i(userAvatarView2, "userAvatarView");
                    userAvatarView2.setVisibility(4);
                }
                this.binding.date.setText(ChatUI.getDateFormatter().formatRelativeDate(answer.getCreatedAt()));
                this.binding.time.setText(ChatUI.getDateFormatter().formatTime(answer.getCreatedAt()));
            }
        }

        public CommentsAdapter() {
            super(CommentDiffCallback.INSTANCE);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final void onBindViewHolder(CommentViewHolder holder, int position) {
            AbstractC22676k.m65750j(holder, "holder");
            Object item = getItem(position);
            AbstractC22676k.m65749i(item, "getItem(...)");
            holder.bind((CommentItem) item);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            AbstractC22676k.m65750j(parent, "parent");
            return new CommentViewHolder(StreamUiItemPollCommentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_CID", "ARG_MESSAGE_ID", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;", "cid", "messageId", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollCommentsDialogFragment newInstance(String cid, String messageId) {
            AbstractC22676k.m65750j(cid, "cid");
            AbstractC22676k.m65750j(messageId, "messageId");
            PollCommentsDialogFragment pollCommentsDialogFragment = new PollCommentsDialogFragment();
            pollCommentsDialogFragment.setArguments(AbstractC12889b.m36273g(new C23465k(PollCommentsDialogFragment.ARG_CID, cid), new C23465k(PollCommentsDialogFragment.ARG_MESSAGE_ID, messageId)));
            return pollCommentsDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.PollCommentsDialogFragment$onViewCreated$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C198442 extends C22672i implements Function1 {
        public C198442(Object obj) {
            super(1, 0, PollCommentsDialogFragment.class, obj, "render", "render(Lio/getstream/chat/android/models/Poll;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Poll) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(Poll p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((PollCommentsDialogFragment) this.receiver).render(p13);
        }
    }

    public PollCommentsDialogFragment() {
        C19683b c19683b = new C19683b(this, 4);
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new PollCommentsDialogFragment$special$$inlined$viewModels$default$2(new PollCommentsDialogFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PollCommentsViewModel.class), new PollCommentsDialogFragment$special$$inlined$viewModels$default$3(interfaceC23462hM92087G), c19683b, new PollCommentsDialogFragment$special$$inlined$viewModels$default$4(null, interfaceC23462hM92087G));
        this.commentsAdapter = new CommentsAdapter();
    }

    private final StreamUiFragmentPollCommentsBinding getBinding() {
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding);
        return streamUiFragmentPollCommentsBinding;
    }

    private final String getCid() {
        String string = requireArguments().getString(ARG_CID);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Channel cid not found in arguments");
    }

    private final String getMessageId() {
        String string = requireArguments().getString(ARG_MESSAGE_ID);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Message ID not found in arguments");
    }

    private final PollCommentsViewModel getViewModel() {
        return (PollCommentsViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(Poll poll) {
        String id4;
        boolean z4 = poll.getVotingVisibility() == VotingVisibility.PUBLIC;
        CommentsAdapter commentsAdapter = this.commentsAdapter;
        List<Answer> answers = poll.getAnswers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(answers, 10));
        Iterator<T> it = answers.iterator();
        while (it.hasNext()) {
            arrayList.add(new CommentItem((Answer) it.next(), z4));
        }
        commentsAdapter.submitList(arrayList);
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding);
        FrameLayout ctaContainer = streamUiFragmentPollCommentsBinding.ctaContainer;
        AbstractC22676k.m65749i(ctaContainer, "ctaContainer");
        ctaContainer.setVisibility(poll.getClosed() ? 8 : 0);
        if (poll.getClosed()) {
            return;
        }
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        Object obj = null;
        if (currentUser != null && (id4 = currentUser.getId()) != null) {
            for (Object obj2 : poll.getAnswers()) {
                User user = ((Answer) obj2).getUser();
                if (AbstractC22676k.m65745e(user != null ? user.getId() : null, id4)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (Answer) obj;
        }
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding2);
        streamUiFragmentPollCommentsBinding2.ctaButton.setText(obj == null ? C19469R.string.stream_ui_poll_add_a_comment_label : C19469R.string.stream_ui_poll_update_comment_label);
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding3);
        streamUiFragmentPollCommentsBinding3.ctaButton.setOnClickListener(new ViewOnClickListenerC19855d(this, poll, obj, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$5(PollCommentsDialogFragment pollCommentsDialogFragment, Poll poll, Answer answer, View view) {
        AddPollCommentDialogFragment.INSTANCE.newInstance(pollCommentsDialogFragment.getMessageId(), poll.getId(), answer != null ? answer.getText() : null).show(pollCommentsDialogFragment.getParentFragmentManager(), AddPollCommentDialogFragment.TAG);
    }

    private static final InterfaceC1563a2 viewModel_delegate$lambda$0(PollCommentsDialogFragment pollCommentsDialogFragment) {
        return new PollCommentsViewModel.Factory(pollCommentsDialogFragment.getCid(), pollCommentsDialogFragment.getMessageId());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ PollCommentsViewModel.Factory m55621z(PollCommentsDialogFragment pollCommentsDialogFragment) {
        return (PollCommentsViewModel.Factory) viewModel_delegate$lambda$0(pollCommentsDialogFragment);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final int getTheme() {
        return C19469R.style.StreamUiBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBindingInflate = StreamUiFragmentPollCommentsBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentPollCommentsBindingInflate;
        ConstraintLayout root = streamUiFragmentPollCommentsBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding);
        ConstraintLayout root = streamUiFragmentPollCommentsBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding2);
        streamUiFragmentPollCommentsBinding2.toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2558k3(this, 22));
        StreamUiFragmentPollCommentsBinding streamUiFragmentPollCommentsBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollCommentsBinding3);
        streamUiFragmentPollCommentsBinding3.commentList.setAdapter(this.commentsAdapter);
        getViewModel().getPoll().observe(getViewLifecycleOwner(), new PollCommentsDialogFragment$sam$androidx_lifecycle_Observer$0(new C198442(this)));
    }
}
