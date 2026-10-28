package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollAddCommentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollAnswerBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollCloseBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollHeaderBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollResultsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollShowAllOptionsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollSuggestOptionBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollViewCommentsBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.PollViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u000b"}, m65681d2 = {"applyStyle", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCloseBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollSuggestOptionBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAddCommentBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollViewCommentsBinding;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollViewKt {
    public static final /* synthetic */ StreamUiItemPollAddCommentBinding access$applyStyle(StreamUiItemPollAddCommentBinding streamUiItemPollAddCommentBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollAddCommentBinding, pollViewStyle);
        return streamUiItemPollAddCommentBinding;
    }

    private static final StreamUiItemPollHeaderBinding applyStyle(StreamUiItemPollHeaderBinding streamUiItemPollHeaderBinding, PollViewStyle pollViewStyle) {
        TextView title = streamUiItemPollHeaderBinding.title;
        AbstractC22676k.m65749i(title, "title");
        TextStyleKt.setTextStyle(title, pollViewStyle.getPollTitleTextStyle());
        TextView subtitle = streamUiItemPollHeaderBinding.subtitle;
        AbstractC22676k.m65749i(subtitle, "subtitle");
        TextStyleKt.setTextStyle(subtitle, pollViewStyle.getPollSubtitleTextStyle());
        return streamUiItemPollHeaderBinding;
    }

    public static final /* synthetic */ StreamUiItemPollAnswerBinding access$applyStyle(StreamUiItemPollAnswerBinding streamUiItemPollAnswerBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollAnswerBinding, pollViewStyle);
        return streamUiItemPollAnswerBinding;
    }

    public static final /* synthetic */ StreamUiItemPollCloseBinding access$applyStyle(StreamUiItemPollCloseBinding streamUiItemPollCloseBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollCloseBinding, pollViewStyle);
        return streamUiItemPollCloseBinding;
    }

    private static final StreamUiItemPollAnswerBinding applyStyle(StreamUiItemPollAnswerBinding streamUiItemPollAnswerBinding, PollViewStyle pollViewStyle) {
        AppCompatImageView appCompatImageView = streamUiItemPollAnswerBinding.check;
        Drawable.ConstantState constantState = pollViewStyle.getPollOptionCheckDrawable().getConstantState();
        appCompatImageView.setImageDrawable(constantState != null ? constantState.newDrawable() : null);
        AppCompatTextView option = streamUiItemPollAnswerBinding.option;
        AbstractC22676k.m65749i(option, "option");
        TextStyleKt.setTextStyle(option, pollViewStyle.getPollOptionTextStyle());
        AppCompatTextView votes = streamUiItemPollAnswerBinding.votes;
        AbstractC22676k.m65749i(votes, "votes");
        TextStyleKt.setTextStyle(votes, pollViewStyle.getPollOptionVotesTextStyle());
        return streamUiItemPollAnswerBinding;
    }

    public static final /* synthetic */ StreamUiItemPollHeaderBinding access$applyStyle(StreamUiItemPollHeaderBinding streamUiItemPollHeaderBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollHeaderBinding, pollViewStyle);
        return streamUiItemPollHeaderBinding;
    }

    public static final /* synthetic */ StreamUiItemPollResultsBinding access$applyStyle(StreamUiItemPollResultsBinding streamUiItemPollResultsBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollResultsBinding, pollViewStyle);
        return streamUiItemPollResultsBinding;
    }

    public static final /* synthetic */ StreamUiItemPollShowAllOptionsBinding access$applyStyle(StreamUiItemPollShowAllOptionsBinding streamUiItemPollShowAllOptionsBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollShowAllOptionsBinding, pollViewStyle);
        return streamUiItemPollShowAllOptionsBinding;
    }

    private static final StreamUiItemPollCloseBinding applyStyle(StreamUiItemPollCloseBinding streamUiItemPollCloseBinding, PollViewStyle pollViewStyle) {
        TextView pollClose = streamUiItemPollCloseBinding.pollClose;
        AbstractC22676k.m65749i(pollClose, "pollClose");
        TextStyleKt.setTextStyle(pollClose, pollViewStyle.getPollCloseTextStyle());
        return streamUiItemPollCloseBinding;
    }

    public static final /* synthetic */ StreamUiItemPollSuggestOptionBinding access$applyStyle(StreamUiItemPollSuggestOptionBinding streamUiItemPollSuggestOptionBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollSuggestOptionBinding, pollViewStyle);
        return streamUiItemPollSuggestOptionBinding;
    }

    private static final StreamUiItemPollResultsBinding applyStyle(StreamUiItemPollResultsBinding streamUiItemPollResultsBinding, PollViewStyle pollViewStyle) {
        TextView pollResults = streamUiItemPollResultsBinding.pollResults;
        AbstractC22676k.m65749i(pollResults, "pollResults");
        TextStyleKt.setTextStyle(pollResults, pollViewStyle.getPollResultsTextStyle());
        return streamUiItemPollResultsBinding;
    }

    public static final /* synthetic */ StreamUiItemPollViewCommentsBinding access$applyStyle(StreamUiItemPollViewCommentsBinding streamUiItemPollViewCommentsBinding, PollViewStyle pollViewStyle) {
        applyStyle(streamUiItemPollViewCommentsBinding, pollViewStyle);
        return streamUiItemPollViewCommentsBinding;
    }

    private static final StreamUiItemPollShowAllOptionsBinding applyStyle(StreamUiItemPollShowAllOptionsBinding streamUiItemPollShowAllOptionsBinding, PollViewStyle pollViewStyle) {
        TextView pollShowAllOptions = streamUiItemPollShowAllOptionsBinding.pollShowAllOptions;
        AbstractC22676k.m65749i(pollShowAllOptions, "pollShowAllOptions");
        TextStyleKt.setTextStyle(pollShowAllOptions, pollViewStyle.getPollShowAllOptionsTextStyle());
        return streamUiItemPollShowAllOptionsBinding;
    }

    private static final StreamUiItemPollSuggestOptionBinding applyStyle(StreamUiItemPollSuggestOptionBinding streamUiItemPollSuggestOptionBinding, PollViewStyle pollViewStyle) {
        TextView pollSuggestOption = streamUiItemPollSuggestOptionBinding.pollSuggestOption;
        AbstractC22676k.m65749i(pollSuggestOption, "pollSuggestOption");
        TextStyleKt.setTextStyle(pollSuggestOption, pollViewStyle.getPollSuggestOptionTextStyle());
        return streamUiItemPollSuggestOptionBinding;
    }

    private static final StreamUiItemPollAddCommentBinding applyStyle(StreamUiItemPollAddCommentBinding streamUiItemPollAddCommentBinding, PollViewStyle pollViewStyle) {
        TextView pollAddComment = streamUiItemPollAddCommentBinding.pollAddComment;
        AbstractC22676k.m65749i(pollAddComment, "pollAddComment");
        TextStyleKt.setTextStyle(pollAddComment, pollViewStyle.getPollAddCommentTextStyle());
        return streamUiItemPollAddCommentBinding;
    }

    private static final StreamUiItemPollViewCommentsBinding applyStyle(StreamUiItemPollViewCommentsBinding streamUiItemPollViewCommentsBinding, PollViewStyle pollViewStyle) {
        TextView pollViewComments = streamUiItemPollViewCommentsBinding.pollViewComments;
        AbstractC22676k.m65749i(pollViewComments, "pollViewComments");
        TextStyleKt.setTextStyle(pollViewComments, pollViewStyle.getPollViewCommentsTextStyle());
        return streamUiItemPollViewCommentsBinding;
    }
}
