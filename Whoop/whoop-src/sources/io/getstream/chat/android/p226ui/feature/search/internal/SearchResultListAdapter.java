package io.getstream.chat.android.p226ui.feature.search.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1759z0;
import b13.ViewOnClickListenerC2292a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMentionListBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessagePreviewItemBinding;
import io.getstream.chat.android.p226ui.feature.internal.MessageResultDiffCallback;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;I)V", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;", "searchResultSelectedListener", "setSearchResultSelectedListener", "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;", "MessagePreviewViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SearchResultListAdapter extends AbstractC1759z0 {
    private SearchResultListView.SearchResultSelectedListener searchResultSelectedListener;
    private final SearchResultListViewStyle style;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;", "binding", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "messageResult", "Ll83/a0;", "bind$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V", "bind", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionListBinding;", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "Lio/getstream/chat/android/models/Message;", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class MessagePreviewViewHolder extends AbstractC1717o2 {
        private final StreamUiItemMentionListBinding binding;
        private Message message;
        private final SearchResultListViewStyle style;
        final /* synthetic */ SearchResultListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagePreviewViewHolder(SearchResultListAdapter searchResultListAdapter, StreamUiItemMentionListBinding binding, SearchResultListViewStyle style) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(style, "style");
            this.this$0 = searchResultListAdapter;
            this.binding = binding;
            this.style = style;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2292a(6, searchResultListAdapter, this));
            binding.getRoot().styleView(style.getMessagePreviewStyle());
            StreamUiMessagePreviewItemBinding binding2 = binding.getRoot().getBinding();
            ConstraintLayout contentRoot = binding2.contentRoot;
            AbstractC22676k.m65749i(contentRoot, "contentRoot");
            ViewGroup.LayoutParams layoutParams = contentRoot.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = style.getItemHeight();
            contentRoot.setLayoutParams(layoutParams);
            UserAvatarView userAvatarView = binding2.userAvatarView;
            AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
            ViewGroup.LayoutParams layoutParams2 = userAvatarView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(style.getItemMarginStart());
            userAvatarView.setLayoutParams(marginLayoutParams);
            TextView senderNameLabel = binding2.senderNameLabel;
            AbstractC22676k.m65749i(senderNameLabel, "senderNameLabel");
            ViewGroup.LayoutParams layoutParams3 = senderNameLabel.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.setMarginStart(style.getItemTitleMarginStart());
            marginLayoutParams2.setMarginEnd(style.getItemMarginEnd());
            senderNameLabel.setLayoutParams(marginLayoutParams2);
            TextView messageTimeLabel = binding2.messageTimeLabel;
            AbstractC22676k.m65749i(messageTimeLabel, "messageTimeLabel");
            ViewGroup.LayoutParams layoutParams4 = messageTimeLabel.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams3.setMarginEnd(style.getItemMarginEnd());
            messageTimeLabel.setLayoutParams(marginLayoutParams3);
            View spacer = binding2.spacer;
            AbstractC22676k.m65749i(spacer, "spacer");
            ViewGroup.LayoutParams layoutParams5 = spacer.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams5.height = style.getItemVerticalSpacerHeight();
            spacer.setLayoutParams(layoutParams5);
            binding2.guideline.setGuidelinePercent(style.getItemVerticalSpacerPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SearchResultListAdapter searchResultListAdapter, MessagePreviewViewHolder messagePreviewViewHolder, View view) {
            SearchResultListView.SearchResultSelectedListener searchResultSelectedListener = searchResultListAdapter.searchResultSelectedListener;
            if (searchResultSelectedListener != null) {
                Message message = messagePreviewViewHolder.message;
                if (message != null) {
                    searchResultSelectedListener.onSearchResultSelected(message);
                } else {
                    AbstractC22676k.m65757q("message");
                    throw null;
                }
            }
        }

        public final void bind$stream_chat_android_ui_components_release(MessageResult messageResult) {
            AbstractC22676k.m65750j(messageResult, "messageResult");
            this.message = messageResult.getMessage();
            this.binding.getRoot().renderMessageResult(messageResult);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultListAdapter(SearchResultListViewStyle style) {
        super(MessageResultDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }

    public final void setSearchResultSelectedListener(SearchResultListView.SearchResultSelectedListener searchResultSelectedListener) {
        this.searchResultSelectedListener = searchResultSelectedListener;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(MessagePreviewViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind$stream_chat_android_ui_components_release((MessageResult) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final MessagePreviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new MessagePreviewViewHolder(this, StreamUiItemMentionListBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.style);
    }
}
