package io.getstream.chat.android.p226ui.feature.messages.list;

import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 '2\u00020\u0001:\u0001'B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;", "Landroidx/recyclerview/widget/z1;", "", "loadMoreThreshold", "Lkotlin/Function0;", "Ll83/a0;", "loadMoreAtTopListener", "loadMoreAtBottomListener", "<init>", "(ILc93/a;Lc93/a;)V", "dy", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "handleScroll", "(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V", "handleScrollDown", "(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V", "handleScrollUp", "", "shouldFetch", "fetchAtBottom", "(Z)V", "dx", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "enablePagination", "()V", "disablePagination", "I", "Lc93/a;", "paginationEnabled", "Z", "shouldFetchBottomMessages", "scrollStateReset", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EndlessMessageListScrollListener extends AbstractC1760z1 {
    private static final Companion Companion = new Companion();
    private static final boolean DEBUG = false;
    private static final String TAG = "Chat:EndlessMessageScroll";
    private final InterfaceC4339a loadMoreAtBottomListener;
    private final InterfaceC4339a loadMoreAtTopListener;
    private final int loadMoreThreshold;
    private boolean paginationEnabled;
    private boolean scrollStateReset;
    private boolean shouldFetchBottomMessages;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener$Companion;", "", "<init>", "()V", "TAG", "", "DEBUG", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public EndlessMessageListScrollListener(int i13, InterfaceC4339a loadMoreAtTopListener, InterfaceC4339a loadMoreAtBottomListener) {
        AbstractC22676k.m65750j(loadMoreAtTopListener, "loadMoreAtTopListener");
        AbstractC22676k.m65750j(loadMoreAtBottomListener, "loadMoreAtBottomListener");
        this.loadMoreThreshold = i13;
        this.loadMoreAtTopListener = loadMoreAtTopListener;
        this.loadMoreAtBottomListener = loadMoreAtBottomListener;
        if (i13 < 0) {
            throw new IllegalArgumentException("Load more threshold must not be negative");
        }
        this.scrollStateReset = true;
    }

    private final void handleScroll(int dy3, LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        if (this.paginationEnabled) {
            if (dy3 >= 0 && this.shouldFetchBottomMessages) {
                handleScrollDown(layoutManager, recyclerView);
            } else if (dy3 < 0) {
                handleScrollUp(layoutManager, recyclerView);
            }
        }
    }

    private final void handleScrollDown(LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
        AbstractC1692i1 adapter = recyclerView.getAdapter();
        int displayCount = adapter != null ? adapter.getDisplayCount() : 0;
        if (!this.scrollStateReset || iFindLastVisibleItemPosition <= displayCount - this.loadMoreThreshold) {
            return;
        }
        this.scrollStateReset = false;
        recyclerView.post(new RunnableC19885t0(this.loadMoreAtBottomListener, 3));
    }

    private final void handleScrollUp(LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        if (!this.scrollStateReset || iFindFirstVisibleItemPosition > this.loadMoreThreshold) {
            return;
        }
        this.scrollStateReset = false;
        recyclerView.post(new RunnableC19885t0(this.loadMoreAtTopListener, 2));
    }

    public final void disablePagination() {
        this.paginationEnabled = false;
    }

    public final void enablePagination() {
        this.paginationEnabled = true;
    }

    public final void fetchAtBottom(boolean shouldFetch) {
        this.shouldFetchBottomMessages = shouldFetch;
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        if (newState == 0 || newState == 1) {
            this.scrollStateReset = true;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrolled(RecyclerView recyclerView, int dx3, int dy3) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        if (this.paginationEnabled) {
            AbstractC1740u1 layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new IllegalStateException("EndlessScrollListener supports only LinearLayoutManager");
            }
            handleScroll(dy3, (LinearLayoutManager) layoutManager, recyclerView);
        }
    }
}
