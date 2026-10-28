package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollAnswerBinding;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import m83.AbstractC25265s;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "Ll83/a0;", "onOptionClick", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;Lkotlin/jvm/functions/Function1;)V", "", "optionVotes", "totalVotes", "drawProgress", "(II)V", "drawVotes", "", "invertVoteCount", "(Z)I", "pollItem", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class AnswerViewHolder extends PollItemViewHolder<PollItem.Answer> {
    private final StreamUiItemPollAnswerBinding binding;
    private final Function1 onOptionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewHolder(StreamUiItemPollAnswerBinding binding, Function1 onOptionClick) {
        super(binding, null);
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(onOptionClick, "onOptionClick");
        this.binding = binding;
        this.onOptionClick = onOptionClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(PollItem.Answer answer, AnswerViewHolder answerViewHolder, View view) {
        int voteCount = answer.getVoteCount();
        boolean zIsVotedByUser = answer.isVotedByUser();
        answerViewHolder.getClass();
        answerViewHolder.drawVotes(voteCount + (zIsVotedByUser ? -1 : 1), answer.getTotalVotes());
        AppCompatImageView appCompatImageView = answerViewHolder.binding.check;
        appCompatImageView.setEnabled(!appCompatImageView.isEnabled());
        answerViewHolder.onOptionClick.invoke(answer.getOption());
    }

    private final void drawProgress(int optionVotes, int totalVotes) {
        this.binding.votesPercentage.setProgress(totalVotes == 0 ? 0 : (int) ((optionVotes / totalVotes) * 100));
    }

    private final void drawVotes(int optionVotes, int totalVotes) {
        this.binding.votes.setText(String.valueOf(optionVotes));
        drawProgress(optionVotes, totalVotes);
    }

    private final int invertVoteCount(boolean z4) {
        return z4 ? -1 : 1;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.PollItemViewHolder
    public final void bind(PollItem.Answer pollItem) {
        User user;
        User user2;
        AbstractC22676k.m65750j(pollItem, "pollItem");
        this.binding.getRoot().setEnabled(!pollItem.getClosed());
        AppCompatImageView check = this.binding.check;
        AbstractC22676k.m65749i(check, "check");
        check.setVisibility(!pollItem.getClosed() ? 0 : 8);
        if (!pollItem.getClosed()) {
            this.binding.getRoot().setOnClickListener(new ViewOnClickListenerC19771b(0, pollItem, this));
        }
        this.binding.check.setEnabled(pollItem.isVotedByUser());
        this.binding.option.setText(pollItem.getOption().getText());
        this.binding.votesPercentage.setIndicatorColor(pollItem.isVotedByUser() ? AbstractC32122c.getColor(this.binding.getRoot().getContext(), C19469R.color.stream_ui_accent_green) : AbstractC32122c.getColor(this.binding.getRoot().getContext(), C19469R.color.stream_ui_accent_blue));
        drawVotes(pollItem.getVoteCount(), pollItem.getTotalVotes());
        Vote vote = (Vote) AbstractC25265s.m74100H0(pollItem.getVotes());
        if (vote == null || (user2 = vote.getUser()) == null) {
            UserAvatarView avatarFirstVote = this.binding.avatarFirstVote;
            AbstractC22676k.m65749i(avatarFirstVote, "avatarFirstVote");
            avatarFirstVote.setVisibility(8);
        } else {
            UserAvatarView userAvatarView = this.binding.avatarFirstVote;
            userAvatarView.setUser(user2, false);
            userAvatarView.setVisibility(0);
        }
        Vote vote2 = (Vote) AbstractC25265s.m74100H0(AbstractC25265s.m74161z0(pollItem.getVotes(), 1));
        if (vote2 == null || (user = vote2.getUser()) == null) {
            UserAvatarView avatarSecondVote = this.binding.avatarSecondVote;
            AbstractC22676k.m65749i(avatarSecondVote, "avatarSecondVote");
            avatarSecondVote.setVisibility(8);
        } else {
            UserAvatarView userAvatarView2 = this.binding.avatarSecondVote;
            userAvatarView2.setUser(user, false);
            userAvatarView2.setVisibility(0);
        }
    }
}
