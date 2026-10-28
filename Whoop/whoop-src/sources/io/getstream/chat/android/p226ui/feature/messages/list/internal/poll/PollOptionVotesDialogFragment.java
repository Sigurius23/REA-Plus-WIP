package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
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
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollOptionVotesViewAction;
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollOptionVotesViewEvent;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollOptionVotesViewState;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentPollOptionVotesBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollOptionHeaderBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemResultUserBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import io.getstream.chat.android.p226ui.viewmodel.messages.PollOptionVotesViewModel;
import io.getstream.chat.android.p226ui.widgets.EndlessScrollListener;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import n83.C26460c;
import p314m.C24835d0;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 E2\u00020\u0001:\u0003EFGB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010A¨\u0006H"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;", "Lm/d0;", "<init>", "()V", "Ll83/a0;", "setupEdgeToEdge", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "setupVotesList", "observeState", "observeEvents", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getTheme", "()I", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;", "Lio/getstream/chat/android/models/Poll;", "poll$delegate", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "poll", "Lio/getstream/chat/android/models/Option;", "option$delegate", "getOption", "()Lio/getstream/chat/android/models/Option;", "option", "Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;", "viewModel$delegate", "getViewModel", "()Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;", "viewModel", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;", "votesAdapter", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentPollOptionVotesBinding;", "binding", "", "getPollId", "()Ljava/lang/String;", "pollId", "getOptionId", "optionId", "Companion", "PollOptionVotesListItem", "UserVoteAdapter", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollOptionVotesDialogFragment extends C24835d0 {
    private static final String ARG_OPTION = "arg_option";
    private static final String ARG_POLL = "arg_poll";
    private static final int LOAD_MORE_THRESHOLD = 3;
    public static final String TAG = "PollOptionVotesDialogFragment";
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_VOTE = 1;
    private StreamUiFragmentPollOptionVotesBinding _binding;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:PollOptionVotesDialogFragment");

    /* JADX INFO: renamed from: option$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h option;

    /* JADX INFO: renamed from: poll$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h poll;
    private final EndlessScrollListener scrollListener;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;
    private final UserVoteAdapter votesAdapter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Map<String, Poll> polls = new LinkedHashMap();
    private static final Map<String, Option> options = new LinkedHashMap();

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_POLL", "ARG_OPTION", "LOAD_MORE_THRESHOLD", "", "VIEW_TYPE_HEADER", "VIEW_TYPE_VOTE", "polls", "", "Lio/getstream/chat/android/models/Poll;", "options", "Lio/getstream/chat/android/models/Option;", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;", "poll", "option", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollOptionVotesDialogFragment newInstance(Poll poll, Option option) {
            AbstractC22676k.m65750j(poll, "poll");
            AbstractC22676k.m65750j(option, "option");
            PollOptionVotesDialogFragment pollOptionVotesDialogFragment = new PollOptionVotesDialogFragment();
            PollOptionVotesDialogFragment.polls.put(poll.getId(), poll);
            PollOptionVotesDialogFragment.options.put(option.getId(), option);
            pollOptionVotesDialogFragment.setArguments(AbstractC12889b.m36273g(new C23465k(PollOptionVotesDialogFragment.ARG_POLL, poll.getId()), new C23465k(PollOptionVotesDialogFragment.ARG_OPTION, option.getId())));
            return pollOptionVotesDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;", "", "Header", "VoteItem", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface PollOptionVotesListItem {

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;", "isWinner", "", "voteCount", "", "<init>", "(ZI)V", "()Z", "getVoteCount", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Header implements PollOptionVotesListItem {
            private final boolean isWinner;
            private final int voteCount;

            public Header(boolean z4, int i13) {
                this.isWinner = z4;
                this.voteCount = i13;
            }

            public static Header copy$default(Header header, boolean z4, int i13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    z4 = header.isWinner;
                }
                if ((i14 & 2) != 0) {
                    i13 = header.voteCount;
                }
                header.getClass();
                return new Header(z4, i13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getIsWinner() {
                return this.isWinner;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getVoteCount() {
                return this.voteCount;
            }

            public final Header copy(boolean isWinner, int voteCount) {
                return new Header(isWinner, voteCount);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return this.isWinner == header.isWinner && this.voteCount == header.voteCount;
            }

            public final int getVoteCount() {
                return this.voteCount;
            }

            public final int hashCode() {
                return Integer.hashCode(this.voteCount) + (Boolean.hashCode(this.isWinner) * 31);
            }

            public final boolean isWinner() {
                return this.isWinner;
            }

            public final String toString() {
                return "Header(isWinner=" + this.isWinner + ", voteCount=" + this.voteCount + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;", "vote", "Lio/getstream/chat/android/models/Vote;", "<init>", "(Lio/getstream/chat/android/models/Vote;)V", "getVote", "()Lio/getstream/chat/android/models/Vote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class VoteItem implements PollOptionVotesListItem {
            private final Vote vote;

            public VoteItem(Vote vote) {
                AbstractC22676k.m65750j(vote, "vote");
                this.vote = vote;
            }

            public static /* synthetic */ VoteItem copy$default(VoteItem voteItem, Vote vote, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    vote = voteItem.vote;
                }
                return voteItem.copy(vote);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Vote getVote() {
                return this.vote;
            }

            public final VoteItem copy(Vote vote) {
                AbstractC22676k.m65750j(vote, "vote");
                return new VoteItem(vote);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VoteItem) && AbstractC22676k.m65745e(this.vote, ((VoteItem) other).vote);
            }

            public final Vote getVote() {
                return this.vote;
            }

            public final int hashCode() {
                return this.vote.hashCode();
            }

            public final String toString() {
                return "VoteItem(vote=" + this.vote + ")";
            }
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;", "Landroidx/recyclerview/widget/o2;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;", "holder", "Ll83/a0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/o2;I)V", "HeaderViewHolder", "UserVoteViewHolder", "UserVoteDiffCallback", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class UserVoteAdapter extends AbstractC1759z0 {

        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class HeaderViewHolder extends AbstractC1717o2 {
            private final StreamUiItemPollOptionHeaderBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeaderViewHolder(StreamUiItemPollOptionHeaderBinding binding) {
                super(binding.getRoot());
                AbstractC22676k.m65750j(binding, "binding");
                this.binding = binding;
            }

            public final void bind(PollOptionVotesListItem.Header item) {
                AbstractC22676k.m65750j(item, "item");
                ImageView award = this.binding.award;
                AbstractC22676k.m65749i(award, "award");
                award.setVisibility(item.isWinner() ? 0 : 8);
                StreamUiItemPollOptionHeaderBinding streamUiItemPollOptionHeaderBinding = this.binding;
                streamUiItemPollOptionHeaderBinding.voteCount.setText(streamUiItemPollOptionHeaderBinding.getRoot().getContext().getString(C19469R.string.stream_ui_poll_vote_counts, Integer.valueOf(item.getVoteCount())));
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class UserVoteDiffCallback extends AbstractC1738u {
            public static final UserVoteDiffCallback INSTANCE = new UserVoteDiffCallback();

            private UserVoteDiffCallback() {
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areContentsTheSame(PollOptionVotesListItem oldItem, PollOptionVotesListItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return oldItem.equals(newItem);
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areItemsTheSame(PollOptionVotesListItem oldItem, PollOptionVotesListItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                if ((oldItem instanceof PollOptionVotesListItem.Header) && (newItem instanceof PollOptionVotesListItem.Header)) {
                    return true;
                }
                if ((oldItem instanceof PollOptionVotesListItem.VoteItem) && (newItem instanceof PollOptionVotesListItem.VoteItem)) {
                    return AbstractC22676k.m65745e(((PollOptionVotesListItem.VoteItem) oldItem).getVote().getId(), ((PollOptionVotesListItem.VoteItem) newItem).getVote().getId());
                }
                return false;
            }
        }

        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;)V", "Lio/getstream/chat/android/models/Vote;", "vote", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/models/Vote;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class UserVoteViewHolder extends AbstractC1717o2 {
            private final StreamUiItemResultUserBinding binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserVoteViewHolder(StreamUiItemResultUserBinding binding) {
                super(binding.getRoot());
                AbstractC22676k.m65750j(binding, "binding");
                this.binding = binding;
            }

            public final void bind(Vote vote) {
                AbstractC22676k.m65750j(vote, "vote");
                User user = vote.getUser();
                if (user == null) {
                    return;
                }
                this.binding.name.setText(user.getName());
                UserAvatarView.setUser$default(this.binding.userAvatarView, user, false, 2, null);
                this.binding.date.setText(ChatUI.getDateFormatter().formatRelativeDate(vote.getCreatedAt()));
                this.binding.time.setText(ChatUI.getDateFormatter().formatTime(vote.getCreatedAt()));
            }
        }

        public UserVoteAdapter() {
            super(UserVoteDiffCallback.INSTANCE);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final int getItemViewType(int position) {
            PollOptionVotesListItem pollOptionVotesListItem = (PollOptionVotesListItem) getItem(position);
            if (pollOptionVotesListItem instanceof PollOptionVotesListItem.Header) {
                return 0;
            }
            if (pollOptionVotesListItem instanceof PollOptionVotesListItem.VoteItem) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final void onBindViewHolder(AbstractC1717o2 holder, int position) {
            AbstractC22676k.m65750j(holder, "holder");
            PollOptionVotesListItem pollOptionVotesListItem = (PollOptionVotesListItem) getItem(position);
            if (pollOptionVotesListItem instanceof PollOptionVotesListItem.Header) {
                ((HeaderViewHolder) holder).bind((PollOptionVotesListItem.Header) pollOptionVotesListItem);
            } else {
                if (!(pollOptionVotesListItem instanceof PollOptionVotesListItem.VoteItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((UserVoteViewHolder) holder).bind(((PollOptionVotesListItem.VoteItem) pollOptionVotesListItem).getVote());
            }
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final AbstractC1717o2 onCreateViewHolder(ViewGroup parent, int viewType) {
            AbstractC22676k.m65750j(parent, "parent");
            return viewType == 0 ? new HeaderViewHolder(StreamUiItemPollOptionHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)) : new UserVoteViewHolder(StreamUiItemResultUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }
    }

    public PollOptionVotesDialogFragment() {
        final int i13 = 0;
        this.poll = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PollOptionVotesDialogFragment f74766x;

            {
                this.f74766x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PollOptionVotesDialogFragment.poll_delegate$lambda$0(this.f74766x);
                    case 1:
                        return PollOptionVotesDialogFragment.option_delegate$lambda$1(this.f74766x);
                    case 2:
                        return PollOptionVotesDialogFragment.m55624C(this.f74766x);
                    default:
                        PollOptionVotesDialogFragment.scrollListener$lambda$3(this.f74766x);
                        return C23454a0.f92919a;
                }
            }
        });
        final int i14 = 1;
        this.option = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PollOptionVotesDialogFragment f74766x;

            {
                this.f74766x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PollOptionVotesDialogFragment.poll_delegate$lambda$0(this.f74766x);
                    case 1:
                        return PollOptionVotesDialogFragment.option_delegate$lambda$1(this.f74766x);
                    case 2:
                        return PollOptionVotesDialogFragment.m55624C(this.f74766x);
                    default:
                        PollOptionVotesDialogFragment.scrollListener$lambda$3(this.f74766x);
                        return C23454a0.f92919a;
                }
            }
        });
        final int i15 = 2;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PollOptionVotesDialogFragment f74766x;

            {
                this.f74766x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return PollOptionVotesDialogFragment.poll_delegate$lambda$0(this.f74766x);
                    case 1:
                        return PollOptionVotesDialogFragment.option_delegate$lambda$1(this.f74766x);
                    case 2:
                        return PollOptionVotesDialogFragment.m55624C(this.f74766x);
                    default:
                        PollOptionVotesDialogFragment.scrollListener$lambda$3(this.f74766x);
                        return C23454a0.f92919a;
                }
            }
        };
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19846xdd2a84d5(new C19845xdd2a84d4(this)));
        this.viewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PollOptionVotesViewModel.class), new C19847xdd2a84d6(interfaceC23462hM92087G), interfaceC4339a, new C19848xdd2a84d7(null, interfaceC23462hM92087G));
        this.votesAdapter = new UserVoteAdapter();
        final int i16 = 3;
        this.scrollListener = new EndlessScrollListener(3, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PollOptionVotesDialogFragment f74766x;

            {
                this.f74766x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return PollOptionVotesDialogFragment.poll_delegate$lambda$0(this.f74766x);
                    case 1:
                        return PollOptionVotesDialogFragment.option_delegate$lambda$1(this.f74766x);
                    case 2:
                        return PollOptionVotesDialogFragment.m55624C(this.f74766x);
                    default:
                        PollOptionVotesDialogFragment.scrollListener$lambda$3(this.f74766x);
                        return C23454a0.f92919a;
                }
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ PollOptionVotesViewModel.Factory m55624C(PollOptionVotesDialogFragment pollOptionVotesDialogFragment) {
        return (PollOptionVotesViewModel.Factory) viewModel_delegate$lambda$2(pollOptionVotesDialogFragment);
    }

    private final StreamUiFragmentPollOptionVotesBinding getBinding() {
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding);
        return streamUiFragmentPollOptionVotesBinding;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final Option getOption() {
        return (Option) this.option.getValue();
    }

    private final String getOptionId() {
        String string = requireArguments().getString(ARG_OPTION);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Option ID not found in arguments");
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

    private final PollOptionVotesViewModel getViewModel() {
        return (PollOptionVotesViewModel) this.viewModel.getValue();
    }

    private final void observeEvents() {
        getViewModel().getEvents().observe(getViewLifecycleOwner(), new PollOptionVotesDialogFragment$sam$androidx_lifecycle_Observer$0(new C19856e(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeEvents$lambda$10(PollOptionVotesDialogFragment pollOptionVotesDialogFragment, PollOptionVotesViewEvent pollOptionVotesViewEvent) {
        if (!(pollOptionVotesViewEvent instanceof PollOptionVotesViewEvent.LoadError)) {
            throw new NoWhenBranchMatchedException();
        }
        C2345k logger = pollOptionVotesDialogFragment.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[observeEvents] error loading poll option results: " + ((PollOptionVotesViewEvent.LoadError) pollOptionVotesViewEvent).getError(), null);
        }
        String string = pollOptionVotesDialogFragment.getString(C19469R.string.stream_ui_poll_option_results_error);
        AbstractC22676k.m65749i(string, "getString(...)");
        Toast.makeText(pollOptionVotesDialogFragment.requireContext(), string, 0).show();
        return C23454a0.f92919a;
    }

    private final void observeState() {
        getViewModel().getState().observe(getViewLifecycleOwner(), new PollOptionVotesDialogFragment$sam$androidx_lifecycle_Observer$0(new C19856e(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observeState$lambda$8(PollOptionVotesDialogFragment pollOptionVotesDialogFragment, PollOptionVotesViewState pollOptionVotesViewState) {
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding = pollOptionVotesDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding);
        streamUiFragmentPollOptionVotesBinding.toolbar.setTitle(pollOptionVotesViewState.getOption().getText());
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding2 = pollOptionVotesDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding2);
        RecyclerView voteList = streamUiFragmentPollOptionVotesBinding2.voteList;
        AbstractC22676k.m65749i(voteList, "voteList");
        voteList.setVisibility(pollOptionVotesViewState.isLoading() ? 4 : 0);
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding3 = pollOptionVotesDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding3);
        FrameLayout loadingContainer = streamUiFragmentPollOptionVotesBinding3.loadingContainer;
        AbstractC22676k.m65749i(loadingContainer, "loadingContainer");
        loadingContainer.setVisibility(pollOptionVotesViewState.isLoading() ? 0 : 8);
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding4 = pollOptionVotesDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding4);
        ProgressBar loadingMoreProgress = streamUiFragmentPollOptionVotesBinding4.loadingMoreProgress;
        AbstractC22676k.m65749i(loadingMoreProgress, "loadingMoreProgress");
        loadingMoreProgress.setVisibility((!pollOptionVotesViewState.isLoadingMore() || pollOptionVotesViewState.isLoading()) ? 8 : 0);
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(new PollOptionVotesListItem.Header(pollOptionVotesViewState.isWinner(), pollOptionVotesViewState.getVoteCount()));
        List<Vote> results = pollOptionVotesViewState.getResults();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(new PollOptionVotesListItem.VoteItem((Vote) it.next()));
        }
        c26460cM119000x.addAll(arrayList);
        pollOptionVotesDialogFragment.votesAdapter.submitList(AbstractC37056f.m118988k(c26460cM119000x));
        if (pollOptionVotesViewState.isLoading() || pollOptionVotesViewState.isLoadingMore() || !pollOptionVotesViewState.getCanLoadMore()) {
            pollOptionVotesDialogFragment.scrollListener.disablePagination();
        } else {
            pollOptionVotesDialogFragment.scrollListener.enablePagination();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Option option_delegate$lambda$1(PollOptionVotesDialogFragment pollOptionVotesDialogFragment) {
        Option option = options.get(pollOptionVotesDialogFragment.getOptionId());
        if (option != null) {
            return option;
        }
        throw new IllegalStateException("Option not found for ID: ".concat(pollOptionVotesDialogFragment.getOptionId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll poll_delegate$lambda$0(PollOptionVotesDialogFragment pollOptionVotesDialogFragment) {
        Poll poll = polls.get(pollOptionVotesDialogFragment.getPollId());
        if (poll != null) {
            return poll;
        }
        throw new IllegalStateException("Poll not found for ID: ".concat(pollOptionVotesDialogFragment.getPollId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 scrollListener$lambda$3(PollOptionVotesDialogFragment pollOptionVotesDialogFragment) {
        pollOptionVotesDialogFragment.getViewModel().onViewAction(PollOptionVotesViewAction.LoadMoreRequested.INSTANCE);
        return C23454a0.f92919a;
    }

    private final void setupEdgeToEdge() {
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding);
        ConstraintLayout root = streamUiFragmentPollOptionVotesBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
    }

    private final void setupToolbar(Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2558k3(this, 23));
        Drawable drawable = AbstractC32122c.getDrawable(requireContext(), C19469R.drawable.stream_ui_arrow_left);
        if (drawable != null) {
            drawable.setTint(AbstractC32122c.getColor(requireContext(), C19469R.color.stream_ui_black));
            toolbar.setNavigationIcon(drawable);
        }
        toolbar.setTitle(getOption().getText());
    }

    private final void setupVotesList() {
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding);
        streamUiFragmentPollOptionVotesBinding.voteList.setAdapter(this.votesAdapter);
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding2);
        streamUiFragmentPollOptionVotesBinding2.voteList.addOnScrollListener(this.scrollListener);
    }

    private static final InterfaceC1563a2 viewModel_delegate$lambda$2(PollOptionVotesDialogFragment pollOptionVotesDialogFragment) {
        return new PollOptionVotesViewModel.Factory(pollOptionVotesDialogFragment.getPoll(), pollOptionVotesDialogFragment.getOption());
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
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBindingInflate = StreamUiFragmentPollOptionVotesBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentPollOptionVotesBindingInflate;
        ConstraintLayout root = streamUiFragmentPollOptionVotesBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        AbstractActivityC1340r0 activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            polls.remove(getPollId());
            options.remove(getOptionId());
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
        StreamUiFragmentPollOptionVotesBinding streamUiFragmentPollOptionVotesBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentPollOptionVotesBinding);
        Toolbar toolbar = streamUiFragmentPollOptionVotesBinding.toolbar;
        AbstractC22676k.m65749i(toolbar, "toolbar");
        setupToolbar(toolbar);
        setupVotesList();
        observeState();
        observeEvents();
    }
}
