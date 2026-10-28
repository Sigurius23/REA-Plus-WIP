package io.getstream.chat.android.p226ui.feature.search.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.C1754y;
import androidx.recyclerview.widget.RecyclerView;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.databinding.StreamUiSearchResultListViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.feature.search.internal.SearchResultListAdapter;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.EndlessScrollListener;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004012/B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000fJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;", "Landroid/widget/ViewFlipper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "style", "Ll83/a0;", "setupViewStyle", "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V", "setupView", "()V", "", "query", "", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "messages", "showMessages", "(Ljava/lang/String;Ljava/util/List;)V", "showLoading", "showError", "", "isEnabled", "setPaginationEnabled", "(Z)V", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;", "searchResultSelectedListener", "setSearchResultSelectedListener", "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;", "loadMoreListener", "setLoadMoreListener", "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;", "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;", "adapter", "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "Companion", "SearchResultSelectedListener", "LoadMoreListener", "Flipper", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SearchResultListView extends ViewFlipper {
    private static final Companion Companion = new Companion();

    @Deprecated
    public static final int LOAD_MORE_THRESHOLD = 10;
    private final SearchResultListAdapter adapter;
    private final StreamUiSearchResultListViewBinding binding;
    private LoadMoreListener loadMoreListener;
    private final EndlessScrollListener scrollListener;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Companion;", "", "<init>", "()V", "LOAD_MORE_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Flipper;", "", "<init>", "()V", "RESULTS", "", "EMPTY", "LOADING", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Flipper {
        public static final int EMPTY = 1;
        public static final Flipper INSTANCE = new Flipper();
        public static final int LOADING = 2;
        public static final int RESULTS = 0;

        private Flipper() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;", "", "Ll83/a0;", "onLoadMoreRequested", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface LoadMoreListener {
        void onLoadMoreRequested();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onSearchResultSelected", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface SearchResultSelectedListener {
        void onSearchResultSelected(Message message);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResultListView(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 scrollListener$lambda$0(SearchResultListView searchResultListView) {
        LoadMoreListener loadMoreListener = searchResultListView.loadMoreListener;
        if (loadMoreListener != null) {
            loadMoreListener.onLoadMoreRequested();
        }
        return C23454a0.f92919a;
    }

    private final void setupView() {
        RecyclerView recyclerView = this.binding.searchListView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.adapter);
        recyclerView.addOnScrollListener(this.scrollListener);
    }

    private final void setupViewStyle(SearchResultListViewStyle style) {
        setBackgroundColor(style.getBackgroundColor());
        this.binding.searchInfoBar.setBackground(style.getSearchInfoBarBackground());
        TextView searchInfoBar = this.binding.searchInfoBar;
        AbstractC22676k.m65749i(searchInfoBar, "searchInfoBar");
        TextStyleKt.setTextStyle(searchInfoBar, style.getSearchInfoBarTextStyle());
        this.binding.emptyImage.setImageDrawable(style.getEmptyStateIcon());
        TextView emptyLabel = this.binding.emptyLabel;
        AbstractC22676k.m65749i(emptyLabel, "emptyLabel");
        TextStyleKt.setTextStyle(emptyLabel, style.getEmptyStateTextStyle());
        this.binding.progressBar.setIndeterminateDrawable(style.getProgressBarIcon());
        RecyclerView recyclerView = this.binding.searchListView;
        C1754y c1754y = new C1754y(getContext());
        Drawable itemSeparator = style.getItemSeparator();
        if (itemSeparator == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        c1754y.f6937a = itemSeparator;
        recyclerView.addItemDecoration(c1754y, -1);
    }

    public final void setLoadMoreListener(LoadMoreListener loadMoreListener) {
        this.loadMoreListener = loadMoreListener;
    }

    public final void setPaginationEnabled(boolean isEnabled) {
        if (isEnabled) {
            this.scrollListener.enablePagination();
        } else {
            this.scrollListener.disablePagination();
        }
    }

    public final void setSearchResultSelectedListener(SearchResultSelectedListener searchResultSelectedListener) {
        this.adapter.setSearchResultSelectedListener(searchResultSelectedListener);
    }

    public final void showError() {
        Toast.makeText(getContext(), C19469R.string.stream_ui_search_results_error, 0).show();
    }

    public final void showLoading() {
        setDisplayedChild(2);
        this.adapter.submitList(C25271y.f99162w);
        this.scrollListener.disablePagination();
    }

    public final void showMessages(String query, List<MessageResult> messages) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(messages, "messages");
        boolean zIsEmpty = messages.isEmpty();
        setDisplayedChild(zIsEmpty ? 1 : 0);
        if (zIsEmpty) {
            this.binding.emptyLabel.setText(getContext().getString(C19469R.string.stream_ui_search_results_empty, query));
        } else {
            this.binding.searchInfoBar.setText(getResources().getQuantityString(C19469R.plurals.stream_ui_search_results_count, messages.size(), Integer.valueOf(messages.size())));
        }
        this.adapter.submitList(messages);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultListView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiSearchResultListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.scrollListener = new EndlessScrollListener(10, new C19683b(this, 8));
        SearchResultListViewStyle searchResultListViewStyleInvoke = SearchResultListViewStyle.INSTANCE.invoke(context, attributeSet);
        this.adapter = new SearchResultListAdapter(searchResultListViewStyleInvoke);
        setupViewStyle(searchResultListViewStyleInvoke);
        setupView();
    }
}
