package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1759z0;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollAddCommentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollAnswerBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollCloseBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollHeaderBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollResultsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollShowAllOptionsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollSuggestOptionBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollViewCommentsBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.PollViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 \"2\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001:\u0001\"Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "pollViewStyle", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "Ll83/a0;", "onOptionClick", "Lkotlin/Function0;", "onClosePollClick", "onViewPollResultsClick", "onShowAllOptionsClick", "onSuggestOptionClick", "onAddCommentClick", "onViewCommentsClick", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;I)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "Lkotlin/jvm/functions/Function1;", "Lc93/a;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class PollAdapter extends AbstractC1759z0 {
    private static final int VIEW_TYPE_ADD_COMMENT = 7;
    private static final int VIEW_TYPE_ANSWER = 2;
    private static final int VIEW_TYPE_CLOSE = 3;
    private static final int VIEW_TYPE_HEADER = 1;
    private static final int VIEW_TYPE_RESULTS = 4;
    private static final int VIEW_TYPE_SHOW_ALL_OPTIONS = 5;
    private static final int VIEW_TYPE_SUGGEST_OPTION = 6;
    private static final int VIEW_TYPE_VIEW_COMMENTS = 8;
    private final InterfaceC4339a onAddCommentClick;
    private final InterfaceC4339a onClosePollClick;
    private final Function1 onOptionClick;
    private final InterfaceC4339a onShowAllOptionsClick;
    private final InterfaceC4339a onSuggestOptionClick;
    private final InterfaceC4339a onViewCommentsClick;
    private final InterfaceC4339a onViewPollResultsClick;
    private final PollViewStyle pollViewStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAdapter(PollViewStyle pollViewStyle, Function1 onOptionClick, InterfaceC4339a onClosePollClick, InterfaceC4339a onViewPollResultsClick, InterfaceC4339a onShowAllOptionsClick, InterfaceC4339a onSuggestOptionClick, InterfaceC4339a onAddCommentClick, InterfaceC4339a onViewCommentsClick) {
        super(PollItemDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(pollViewStyle, "pollViewStyle");
        AbstractC22676k.m65750j(onOptionClick, "onOptionClick");
        AbstractC22676k.m65750j(onClosePollClick, "onClosePollClick");
        AbstractC22676k.m65750j(onViewPollResultsClick, "onViewPollResultsClick");
        AbstractC22676k.m65750j(onShowAllOptionsClick, "onShowAllOptionsClick");
        AbstractC22676k.m65750j(onSuggestOptionClick, "onSuggestOptionClick");
        AbstractC22676k.m65750j(onAddCommentClick, "onAddCommentClick");
        AbstractC22676k.m65750j(onViewCommentsClick, "onViewCommentsClick");
        this.pollViewStyle = pollViewStyle;
        this.onOptionClick = onOptionClick;
        this.onClosePollClick = onClosePollClick;
        this.onViewPollResultsClick = onViewPollResultsClick;
        this.onShowAllOptionsClick = onShowAllOptionsClick;
        this.onSuggestOptionClick = onSuggestOptionClick;
        this.onAddCommentClick = onAddCommentClick;
        this.onViewCommentsClick = onViewCommentsClick;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        PollItem pollItem = (PollItem) getItem(position);
        if (pollItem instanceof PollItem.Header) {
            return 1;
        }
        if (pollItem instanceof PollItem.Answer) {
            return 2;
        }
        if (AbstractC22676k.m65745e(pollItem, PollItem.Close.INSTANCE)) {
            return 3;
        }
        if (AbstractC22676k.m65745e(pollItem, PollItem.ViewResults.INSTANCE)) {
            return 4;
        }
        if (pollItem instanceof PollItem.ShowAllOptions) {
            return 5;
        }
        if (AbstractC22676k.m65745e(pollItem, PollItem.SuggestOption.INSTANCE)) {
            return 6;
        }
        if (AbstractC22676k.m65745e(pollItem, PollItem.AddComment.INSTANCE)) {
            return 7;
        }
        if (pollItem instanceof PollItem.ViewComments) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(PollItemViewHolder<? extends PollItem> holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((PollItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final PollItemViewHolder<? extends PollItem> onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        switch (viewType) {
            case 1:
                StreamUiItemPollHeaderBinding streamUiItemPollHeaderBindingInflate = StreamUiItemPollHeaderBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollHeaderBindingInflate, this.pollViewStyle);
                return new HeaderViewHolder(streamUiItemPollHeaderBindingInflate);
            case 2:
                StreamUiItemPollAnswerBinding streamUiItemPollAnswerBindingInflate = StreamUiItemPollAnswerBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollAnswerBindingInflate, this.pollViewStyle);
                return new AnswerViewHolder(streamUiItemPollAnswerBindingInflate, this.onOptionClick);
            case 3:
                StreamUiItemPollCloseBinding streamUiItemPollCloseBindingInflate = StreamUiItemPollCloseBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollCloseBindingInflate, this.pollViewStyle);
                return new CloseViewHolder(streamUiItemPollCloseBindingInflate, this.onClosePollClick);
            case 4:
                StreamUiItemPollResultsBinding streamUiItemPollResultsBindingInflate = StreamUiItemPollResultsBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollResultsBindingInflate, this.pollViewStyle);
                return new ViewResultsViewHolder(streamUiItemPollResultsBindingInflate, this.onViewPollResultsClick);
            case 5:
                StreamUiItemPollShowAllOptionsBinding streamUiItemPollShowAllOptionsBindingInflate = StreamUiItemPollShowAllOptionsBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollShowAllOptionsBindingInflate, this.pollViewStyle);
                return new ShowAllOptionsViewHolder(streamUiItemPollShowAllOptionsBindingInflate, this.onShowAllOptionsClick);
            case 6:
                StreamUiItemPollSuggestOptionBinding streamUiItemPollSuggestOptionBindingInflate = StreamUiItemPollSuggestOptionBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollSuggestOptionBindingInflate, this.pollViewStyle);
                return new SuggestOptionViewHolder(streamUiItemPollSuggestOptionBindingInflate, this.onSuggestOptionClick);
            case 7:
                StreamUiItemPollAddCommentBinding streamUiItemPollAddCommentBindingInflate = StreamUiItemPollAddCommentBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollAddCommentBindingInflate, this.pollViewStyle);
                return new AddCommentViewHolder(streamUiItemPollAddCommentBindingInflate, this.onAddCommentClick);
            case 8:
                StreamUiItemPollViewCommentsBinding streamUiItemPollViewCommentsBindingInflate = StreamUiItemPollViewCommentsBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false);
                PollViewKt.access$applyStyle(streamUiItemPollViewCommentsBindingInflate, this.pollViewStyle);
                return new ViewCommentsViewHolder(streamUiItemPollViewCommentsBindingInflate, this.onViewCommentsClick);
            default:
                throw new IllegalArgumentException(AbstractC2875y.m8295h(viewType, "Unknown view type: "));
        }
    }
}
