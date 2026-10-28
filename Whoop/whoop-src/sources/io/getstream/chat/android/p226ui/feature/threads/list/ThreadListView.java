package io.getstream.chat.android.p226ui.feature.threads.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b30.ViewOnClickListenerC2558k3;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiThreadListViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.internal.ThreadListAdapter;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.EndlessScrollListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ?2\u00020\u0001:\u0004?@ABB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u001b\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\t2\u0006\u0010'\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\t2\u0006\u0010'\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0016\u00104\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006C"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;", "requireAdapter", "()Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;", "initAdapter", "()V", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "style", "applyEmptyStateStyle", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V", "applyBannerStyle", "", "Lio/getstream/chat/android/models/Thread;", "threads", "", "isLoadingMore", "showThreads", "(Ljava/util/List;Z)V", "showLoading", "", "unreadThreadsCount", "showUnreadThreadsBanner", "(I)V", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;", "factory", "setViewHolderFactory", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;", "listener", "setUnreadThreadsBannerClickListener", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;)V", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "setThreadClickListener", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;", "setLoadMoreListener", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "viewHolderFactory", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;", "adapter", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;", "clickListener", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "loadMoreListener", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;", "Companion", "UnreadThreadsBannerClickListener", "ThreadClickListener", "LoadMoreListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListView extends ConstraintLayout {
    private static final Companion Companion = new Companion();
    private static final int LOAD_MORE_THRESHOLD = 10;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74826w = 0;
    private ThreadListAdapter adapter;
    private final StreamUiThreadListViewBinding binding;
    private ThreadClickListener clickListener;
    private LoadMoreListener loadMoreListener;
    private final EndlessScrollListener scrollListener;
    private ThreadListViewStyle style;
    private ThreadListItemViewHolderFactory viewHolderFactory;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$Companion;", "", "<init>", "()V", "LOAD_MORE_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;", "", "Ll83/a0;", "onLoadMore", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface LoadMoreListener {
        void onLoadMore();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "", "Lio/getstream/chat/android/models/Thread;", "thread", "Ll83/a0;", "onThreadClick", "(Lio/getstream/chat/android/models/Thread;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ThreadClickListener {
        void onThreadClick(Thread thread);
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;", "", "Ll83/a0;", "onUnreadThreadsBannerClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface UnreadThreadsBannerClickListener {
        void onUnreadThreadsBannerClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadListView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiThreadListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.scrollListener = new EndlessScrollListener(10, new C19683b(this, 9));
        init(null);
    }

    private final void applyBannerStyle(ThreadListViewStyle style) {
        TextView unreadThreadsBannerTextView = this.binding.unreadThreadsBannerTextView;
        AbstractC22676k.m65749i(unreadThreadsBannerTextView, "unreadThreadsBannerTextView");
        TextStyleKt.setTextStyle(unreadThreadsBannerTextView, style.getBannerTextStyle());
        this.binding.unreadThreadsBannerTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, style.getBannerIcon(), (Drawable) null);
        this.binding.unreadThreadsBannerTextView.setBackground(style.getBannerBackground());
        TextView unreadThreadsBannerTextView2 = this.binding.unreadThreadsBannerTextView;
        AbstractC22676k.m65749i(unreadThreadsBannerTextView2, "unreadThreadsBannerTextView");
        unreadThreadsBannerTextView2.setPadding(style.getBannerPaddingLeft(), style.getBannerPaddingTop(), style.getBannerPaddingRight(), style.getBannerPaddingBottom());
        TextView unreadThreadsBannerTextView3 = this.binding.unreadThreadsBannerTextView;
        AbstractC22676k.m65749i(unreadThreadsBannerTextView3, "unreadThreadsBannerTextView");
        ViewGroup.LayoutParams layoutParams = unreadThreadsBannerTextView3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = style.getBannerMarginLeft();
        marginLayoutParams.topMargin = style.getBannerMarginTop();
        marginLayoutParams.rightMargin = style.getBannerMarginRight();
        marginLayoutParams.bottomMargin = style.getBannerMarginBottom();
        unreadThreadsBannerTextView3.setLayoutParams(marginLayoutParams);
    }

    private final void applyEmptyStateStyle(ThreadListViewStyle style) {
        this.binding.emptyImage.setImageDrawable(style.getEmptyStateDrawable());
        this.binding.emptyTextView.setText(style.getEmptyStateText());
        TextView emptyTextView = this.binding.emptyTextView;
        AbstractC22676k.m65749i(emptyTextView, "emptyTextView");
        TextStyleKt.setTextStyle(emptyTextView, style.getEmptyStateTextStyle());
    }

    private final void init(AttributeSet attrs) {
        ThreadListViewStyle.Companion companion = ThreadListViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.style = companion.invoke(context, attrs);
        this.binding.threadListRecyclerView.addOnScrollListener(this.scrollListener);
        ThreadListViewStyle threadListViewStyle = this.style;
        if (threadListViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        setBackgroundColor(threadListViewStyle.getBackgroundColor());
        ThreadListViewStyle threadListViewStyle2 = this.style;
        if (threadListViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        applyEmptyStateStyle(threadListViewStyle2);
        ThreadListViewStyle threadListViewStyle3 = this.style;
        if (threadListViewStyle3 != null) {
            applyBannerStyle(threadListViewStyle3);
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    private final void initAdapter() {
        if (this.viewHolderFactory == null) {
            this.viewHolderFactory = new ThreadListItemViewHolderFactory();
        }
        ThreadListItemViewHolderFactory threadListItemViewHolderFactory = this.viewHolderFactory;
        if (threadListItemViewHolderFactory == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        ThreadListViewStyle threadListViewStyle = this.style;
        if (threadListViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        threadListItemViewHolderFactory.setStyle$stream_chat_android_ui_components_release(threadListViewStyle);
        ThreadListItemViewHolderFactory threadListItemViewHolderFactory2 = this.viewHolderFactory;
        if (threadListItemViewHolderFactory2 == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        threadListItemViewHolderFactory2.setThreadClickListener$stream_chat_android_ui_components_release(this.clickListener);
        ThreadListViewStyle threadListViewStyle2 = this.style;
        if (threadListViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        ThreadListItemViewHolderFactory threadListItemViewHolderFactory3 = this.viewHolderFactory;
        if (threadListItemViewHolderFactory3 == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        ThreadListAdapter threadListAdapter = new ThreadListAdapter(threadListViewStyle2, threadListItemViewHolderFactory3);
        this.adapter = threadListAdapter;
        this.binding.threadListRecyclerView.setAdapter(threadListAdapter);
    }

    private final ThreadListAdapter requireAdapter() {
        if (this.adapter == null) {
            initAdapter();
        }
        ThreadListAdapter threadListAdapter = this.adapter;
        if (threadListAdapter != null) {
            return threadListAdapter;
        }
        AbstractC22676k.m65757q("adapter");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 scrollListener$lambda$0(ThreadListView threadListView) {
        LoadMoreListener loadMoreListener = threadListView.loadMoreListener;
        if (loadMoreListener != null) {
            loadMoreListener.onLoadMore();
        }
        return C23454a0.f92919a;
    }

    public final void setLoadMoreListener(LoadMoreListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.loadMoreListener = listener;
    }

    public final void setThreadClickListener(ThreadClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.clickListener = listener;
    }

    public final void setUnreadThreadsBannerClickListener(UnreadThreadsBannerClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.unreadThreadsBannerTextView.setOnClickListener(new ViewOnClickListenerC2558k3(listener, 26));
    }

    public final void setViewHolderFactory(ThreadListItemViewHolderFactory factory) {
        AbstractC22676k.m65750j(factory, "factory");
        if (this.adapter != null) {
            throw new IllegalStateException("Adapter was already initialized, please set ChannelListItemViewHolderFactory first");
        }
        this.viewHolderFactory = factory;
    }

    public final void showLoading() {
        requireAdapter().submitList(C25271y.f99162w);
        RecyclerView threadListRecyclerView = this.binding.threadListRecyclerView;
        AbstractC22676k.m65749i(threadListRecyclerView, "threadListRecyclerView");
        threadListRecyclerView.setVisibility(8);
        LinearLayout emptyContainer = this.binding.emptyContainer;
        AbstractC22676k.m65749i(emptyContainer, "emptyContainer");
        emptyContainer.setVisibility(8);
        ProgressBar progressBar = this.binding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(0);
        this.scrollListener.disablePagination();
    }

    public final void showThreads(List<Thread> threads, boolean isLoadingMore) {
        AbstractC22676k.m65750j(threads, "threads");
        boolean z4 = requireAdapter().getPageCount() == 0;
        boolean zIsEmpty = threads.isEmpty();
        RecyclerView threadListRecyclerView = this.binding.threadListRecyclerView;
        AbstractC22676k.m65749i(threadListRecyclerView, "threadListRecyclerView");
        threadListRecyclerView.setVisibility(!zIsEmpty ? 0 : 8);
        LinearLayout emptyContainer = this.binding.emptyContainer;
        AbstractC22676k.m65749i(emptyContainer, "emptyContainer");
        emptyContainer.setVisibility(zIsEmpty ? 0 : 8);
        ProgressBar progressBar = this.binding.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(8);
        List<Thread> list = threads;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ThreadListItem.ThreadItem((Thread) it.next()));
        }
        requireAdapter().submitList(AbstractC25265s.m74129g1(arrayList, isLoadingMore ? AbstractC37056f.m118958J(ThreadListItem.LoadingMoreItem.INSTANCE) : C25271y.f99162w));
        this.scrollListener.enablePagination();
        if (!z4 || zIsEmpty) {
            return;
        }
        this.binding.threadListRecyclerView.scrollToPosition(0);
    }

    public final void showUnreadThreadsBanner(int unreadThreadsCount) {
        String quantityString = getContext().getResources().getQuantityString(C19469R.plurals.stream_ui_thread_list_new_threads, unreadThreadsCount, Integer.valueOf(unreadThreadsCount));
        AbstractC22676k.m65749i(quantityString, "getQuantityString(...)");
        TextView unreadThreadsBannerTextView = this.binding.unreadThreadsBannerTextView;
        AbstractC22676k.m65749i(unreadThreadsBannerTextView, "unreadThreadsBannerTextView");
        unreadThreadsBannerTextView.setVisibility(unreadThreadsCount > 0 ? 0 : 8);
        this.binding.unreadThreadsBannerTextView.setText(quantityString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadListView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiThreadListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.scrollListener = new EndlessScrollListener(10, new C19683b(this, 9));
        init(attributeSet);
    }
}
