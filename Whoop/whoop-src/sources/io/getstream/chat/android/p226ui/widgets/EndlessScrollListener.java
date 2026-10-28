package io.getstream.chat.android.p226ui.widgets;

import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "Landroidx/recyclerview/widget/z1;", "", "loadMoreThreshold", "Lkotlin/Function0;", "Ll83/a0;", "loadMoreListener", "<init>", "(ILc93/a;)V", "dy", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "checkScrollUp", "(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V", "checkScrollDown", "handleScrollUp", "(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V", "handleScrollDown", "dx", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "enablePagination", "()V", "disablePagination", "I", "Lc93/a;", "", "paginationEnabled", "Z", "scrollStateReset", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EndlessScrollListener extends AbstractC1760z1 {
    private final InterfaceC4339a loadMoreListener;
    private final int loadMoreThreshold;
    private boolean paginationEnabled;
    private boolean scrollStateReset;

    public EndlessScrollListener(int i13, InterfaceC4339a loadMoreListener) {
        AbstractC22676k.m65750j(loadMoreListener, "loadMoreListener");
        this.loadMoreThreshold = i13;
        this.loadMoreListener = loadMoreListener;
        if (i13 < 0) {
            throw new IllegalArgumentException("Load more threshold must not be negative");
        }
        this.scrollStateReset = true;
    }

    private final void checkScrollDown(int dy3, LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        if (dy3 <= 0) {
            return;
        }
        handleScrollDown(layoutManager, recyclerView);
    }

    private final void checkScrollUp(int dy3, LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        if (dy3 >= 0) {
            return;
        }
        handleScrollUp(layoutManager, recyclerView);
    }

    private final void handleScrollDown(LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        int iFindLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
        int itemCount = layoutManager.getItemCount();
        if (!this.scrollStateReset || itemCount - this.loadMoreThreshold > iFindLastVisibleItemPosition) {
            return;
        }
        this.scrollStateReset = false;
        recyclerView.post(new RunnableC19963a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleScrollDown$lambda$2(EndlessScrollListener endlessScrollListener) {
        if (endlessScrollListener.paginationEnabled) {
            endlessScrollListener.loadMoreListener.invoke();
        }
    }

    private final void handleScrollUp(LinearLayoutManager layoutManager, RecyclerView recyclerView) {
        int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        if (!this.scrollStateReset || iFindFirstVisibleItemPosition > this.loadMoreThreshold) {
            return;
        }
        this.scrollStateReset = false;
        recyclerView.post(new RunnableC19963a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleScrollUp$lambda$1(EndlessScrollListener endlessScrollListener) {
        if (endlessScrollListener.paginationEnabled) {
            endlessScrollListener.loadMoreListener.invoke();
        }
    }

    public final void disablePagination() {
        this.paginationEnabled = false;
    }

    public final void enablePagination() {
        this.paginationEnabled = true;
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
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.getReverseLayout()) {
                checkScrollUp(dy3, linearLayoutManager, recyclerView);
            } else {
                checkScrollDown(dy3, linearLayoutManager, recyclerView);
            }
        }
    }
}
