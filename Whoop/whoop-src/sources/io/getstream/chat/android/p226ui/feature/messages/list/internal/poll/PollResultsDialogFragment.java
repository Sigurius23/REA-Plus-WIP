package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import b30.ViewOnClickListenerC2558k3;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollResultsViewState;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentPollResultsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemResultBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemResultUserBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import io.getstream.chat.android.p226ui.viewmodel.messages.PollResultsViewModel;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p314m.C24835d0;
import p479s4.AbstractC32122c;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u000389:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0003R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;", "Lm/d0;", "<init>", "()V", "Ll83/a0;", "setupEdgeToEdge", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "observeState", "Lio/getstream/chat/android/models/Option;", "option", "onShowAllVotesClick", "(Lio/getstream/chat/android/models/Option;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getTheme", "()I", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;", "Lio/getstream/chat/android/models/Poll;", "poll$delegate", "Ll83/h;", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "poll", "Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;", "viewModel$delegate", "getViewModel", "()Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;", "viewModel", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;", "resultsAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollResultsBinding;", "binding", "", "getPollId", "()Ljava/lang/String;", "pollId", "Companion", "ResultsAdapter", "UserVoteAdapter", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollResultsDialogFragment extends C24835d0 {
    private static final String ARG_POLL = "arg_poll";
    public static final String TAG = "PollResultsDialogFragment";
    private StreamUiFragmentPollResultsBinding _binding;

    /* JADX INFO: renamed from: poll$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h poll;
    private final ResultsAdapter resultsAdapter;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Map<String, Poll> polls = new LinkedHashMap();

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_POLL", "polls", "", "Lio/getstream/chat/android/models/Poll;", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;", "poll", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollResultsDialogFragment newInstance(Poll poll) {
            AbstractC22676k.m65750j(poll, "poll");
            PollResultsDialogFragment pollResultsDialogFragment = new PollResultsDialogFragment();
            PollResultsDialogFragment.polls.put(poll.getId(), poll);
            pollResultsDialogFragment.setArguments(AbstractC12889b.m36273g(new C23465k(PollResultsDialogFragment.ARG_POLL, poll.getId())));
            return pollResultsDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "Ll83/a0;", "onShowAllVotesClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;", "holder", "position", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "ResultViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ResultsAdapter extends AbstractC1759z0 {
        private final Function1 onShowAllVotesClick;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.PollResultsDialogFragment$ResultsAdapter$2 */
        @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"io/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$2", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class C198502 extends AbstractC1738u {
            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areContentsTheSame(PollResultsViewState.ResultItem oldItem, PollResultsViewState.ResultItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return oldItem.equals(newItem);
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areItemsTheSame(PollResultsViewState.ResultItem oldItem, PollResultsViewState.ResultItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return AbstractC22676k.m65745e(oldItem.getOption().getId(), newItem.getOption().getId());
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "Ll83/a0;", "onShowAllVotesClick", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;", "result", "bind", "(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class ResultViewHolder extends AbstractC1717o2 {
            private final StreamUiItemResultBinding binding;
            private final Function1 onShowAllVotesClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResultViewHolder(StreamUiItemResultBinding binding, Function1 onShowAllVotesClick) {
                super(binding.getRoot());
                AbstractC22676k.m65750j(binding, "binding");
                AbstractC22676k.m65750j(onShowAllVotesClick, "onShowAllVotesClick");
                this.binding = binding;
                this.onShowAllVotesClick = onShowAllVotesClick;
            }

            /* JADX INFO: renamed from: a */
            public static void m55631a(ResultViewHolder resultViewHolder, PollResultsViewState.ResultItem resultItem, View view) {
                resultViewHolder.onShowAllVotesClick.invoke(resultItem.getOption());
            }

            public final void bind(PollResultsViewState.ResultItem result) {
                AbstractC22676k.m65750j(result, "result");
                this.binding.option.setText(result.getOption().getText());
                StreamUiItemResultBinding streamUiItemResultBinding = this.binding;
                streamUiItemResultBinding.votes.setText(streamUiItemResultBinding.getRoot().getResources().getString(C19469R.string.stream_ui_poll_vote_counts, Integer.valueOf(result.getVoteCount())));
                AbstractC1692i1 adapter = this.binding.optionList.getAdapter();
                UserVoteAdapter userVoteAdapter = adapter instanceof UserVoteAdapter ? (UserVoteAdapter) adapter : null;
                if (userVoteAdapter != null) {
                    userVoteAdapter.submitList(result.getVotes());
                }
                ImageView award = this.binding.award;
                AbstractC22676k.m65749i(award, "award");
                award.setVisibility(result.isWinner() ? 0 : 8);
                AppCompatButton showAll = this.binding.showAll;
                AbstractC22676k.m65749i(showAll, "showAll");
                showAll.setVisibility(result.getShowAllButton() ? 0 : 8);
                this.binding.showAll.setOnClickListener(new ViewOnClickListenerC19854c(this, result, 1));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultsAdapter(Function1 onShowAllVotesClick) {
            super(new C198502());
            AbstractC22676k.m65750j(onShowAllVotesClick, "onShowAllVotesClick");
            this.onShowAllVotesClick = onShowAllVotesClick;
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final void onBindViewHolder(ResultViewHolder holder, int position) {
            AbstractC22676k.m65750j(holder, "holder");
            Object item = getItem(position);
            AbstractC22676k.m65749i(item, "getItem(...)");
            holder.bind((PollResultsViewState.ResultItem) item);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final ResultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            AbstractC22676k.m65750j(parent, "parent");
            StreamUiItemResultBinding streamUiItemResultBindingInflate = StreamUiItemResultBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            streamUiItemResultBindingInflate.optionList.setAdapter(new UserVoteAdapter());
            return new ResultViewHolder(streamUiItemResultBindingInflate, this.onShowAllVotesClick);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;I)V", "UserVoteViewHolder", "UserVoteDiffCallback", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class UserVoteAdapter extends AbstractC1759z0 {

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/models/Vote;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/models/Vote;Lio/getstream/chat/android/models/Vote;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class UserVoteDiffCallback extends AbstractC1738u {
            public static final UserVoteDiffCallback INSTANCE = new UserVoteDiffCallback();

            private UserVoteDiffCallback() {
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areContentsTheSame(Vote oldItem, Vote newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return oldItem.equals(newItem);
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areItemsTheSame(Vote oldItem, Vote newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return AbstractC22676k.m65745e(oldItem.getId(), newItem.getId());
            }
        }

        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter$UserVoteViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;)V", "Lio/getstream/chat/android/models/Vote;", "vote", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/models/Vote;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class UserVoteViewHolder extends AbstractC1717o2 {
            private final StreamUiItemResultUserBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserVoteViewHolder(StreamUiItemResultUserBinding binding) {
                super(binding.getRoot());
                AbstractC22676k.m65750j(binding, "binding");
                this.binding = binding;
            }

            private static final C23454a0 bind$lambda$1(UserVoteViewHolder userVoteViewHolder) {
                userVoteViewHolder.binding.name.setText("");
                UserAvatarView userAvatarView = userVoteViewHolder.binding.userAvatarView;
                AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
                userAvatarView.setVisibility(4);
                return C23454a0.f92919a;
            }

            public final void bind(Vote vote) {
                AbstractC22676k.m65750j(vote, "vote");
                User user = vote.getUser();
                if (user != null) {
                    this.binding.name.setText(user.getName());
                    UserAvatarView.setUser$default(this.binding.userAvatarView, user, false, 2, null);
                    UserAvatarView userAvatarView = this.binding.userAvatarView;
                    AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
                    userAvatarView.setVisibility(0);
                }
                this.binding.date.setText(ChatUI.getDateFormatter().formatRelativeDate(vote.getCreatedAt()));
                this.binding.time.setText(ChatUI.getDateFormatter().formatTime(vote.getCreatedAt()));
            }
        }

        public UserVoteAdapter() {
            super(UserVoteDiffCallback.INSTANCE);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final void onBindViewHolder(UserVoteViewHolder holder, int position) {
            AbstractC22676k.m65750j(holder, "holder");
            Object item = getItem(position);
            AbstractC22676k.m65749i(item, "getItem(...)");
            holder.bind((Vote) item);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final UserVoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            AbstractC22676k.m65750j(parent, "parent");
            return new UserVoteViewHolder(StreamUiItemResultUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }
    }

    public PollResultsDialogFragment() {
        final int i13 = 0;
        this.poll = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PollResultsDialogFragment f74768x;

            {
                this.f74768x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PollResultsDialogFragment.poll_delegate$lambda$0(this.f74768x);
                    default:
                        return PollResultsDialogFragment.m55629B(this.f74768x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PollResultsDialogFragment f74768x;

            {
                this.f74768x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PollResultsDialogFragment.poll_delegate$lambda$0(this.f74768x);
                    default:
                        return PollResultsDialogFragment.m55629B(this.f74768x);
                }
            }
        };
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new PollResultsDialogFragment$special$$inlined$viewModels$default$2(new PollResultsDialogFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PollResultsViewModel.class), new PollResultsDialogFragment$special$$inlined$viewModels$default$3(interfaceC23462hM92087G), interfaceC4339a, new PollResultsDialogFragment$special$$inlined$viewModels$default$4(null, interfaceC23462hM92087G));
        this.resultsAdapter = new ResultsAdapter(new PollResultsDialogFragment$resultsAdapter$1(this));
    }

    /* JADX INFO: renamed from: B */
    public static PollResultsViewModel.Factory m55629B(PollResultsDialogFragment pollResultsDialogFragment) {
        return new PollResultsViewModel.Factory(pollResultsDialogFragment.getPoll());
    }

    private final StreamUiFragmentPollResultsBinding getBinding() {
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollResultsBinding);
        return streamUiFragmentPollResultsBinding;
    }

    private final Poll getPoll() {
        return (Poll) this.poll.getValue();
    }

    private final String getPollId() {
        String string = requireArguments().getString(ARG_POLL);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Poll ID not found in arguments");
    }

    private final PollResultsViewModel getViewModel() {
        return (PollResultsViewModel) this.viewModel.getValue();
    }

    private final void observeState() {
        getViewModel().getState().observe(getViewLifecycleOwner(), new PollResultsDialogFragment$sam$androidx_lifecycle_Observer$0(new C17095c(this, 27)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeState$lambda$4(PollResultsDialogFragment pollResultsDialogFragment, PollResultsViewState pollResultsViewState) {
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBinding = pollResultsDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollResultsBinding);
        streamUiFragmentPollResultsBinding.question.setText(pollResultsViewState.getPollName());
        pollResultsDialogFragment.resultsAdapter.submitList(pollResultsViewState.getResults());
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBinding2 = pollResultsDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollResultsBinding2);
        FrameLayout loadingContainer = streamUiFragmentPollResultsBinding2.loadingContainer;
        AbstractC22676k.m65749i(loadingContainer, "loadingContainer");
        loadingContainer.setVisibility(8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowAllVotesClick(Option option) {
        PollOptionVotesDialogFragment.INSTANCE.newInstance(getPoll(), option).show(getParentFragmentManager(), PollOptionVotesDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll poll_delegate$lambda$0(PollResultsDialogFragment pollResultsDialogFragment) {
        Poll poll = polls.get(pollResultsDialogFragment.getPollId());
        if (poll != null) {
            return poll;
        }
        throw new IllegalStateException("Poll not found for ID: ".concat(pollResultsDialogFragment.getPollId()));
    }

    private final void setupEdgeToEdge() {
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollResultsBinding);
        ConstraintLayout root = streamUiFragmentPollResultsBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
    }

    private final void setupToolbar(Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2558k3(this, 24));
        Drawable drawable = AbstractC32122c.getDrawable(requireContext(), C19469R.drawable.stream_ui_arrow_left);
        if (drawable != null) {
            drawable.setTint(AbstractC32122c.getColor(requireContext(), C19469R.color.stream_ui_black));
            toolbar.setNavigationIcon(drawable);
        }
        toolbar.setTitle(getString(C19469R.string.stream_ui_poll_results_title));
    }

    private static final InterfaceC1563a2 viewModel_delegate$lambda$1(PollResultsDialogFragment pollResultsDialogFragment) {
        return new PollResultsViewModel.Factory(pollResultsDialogFragment.getPoll());
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
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBindingInflate = StreamUiFragmentPollResultsBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentPollResultsBindingInflate;
        ConstraintLayout root = streamUiFragmentPollResultsBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        AbstractActivityC1340r0 activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            polls.remove(getPollId());
        }
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
        setupEdgeToEdge();
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollResultsBinding);
        Toolbar toolbar = streamUiFragmentPollResultsBinding.toolbar;
        AbstractC22676k.m65749i(toolbar, "toolbar");
        setupToolbar(toolbar);
        StreamUiFragmentPollResultsBinding streamUiFragmentPollResultsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollResultsBinding2);
        streamUiFragmentPollResultsBinding2.optionList.setAdapter(this.resultsAdapter);
        observeState();
    }
}
