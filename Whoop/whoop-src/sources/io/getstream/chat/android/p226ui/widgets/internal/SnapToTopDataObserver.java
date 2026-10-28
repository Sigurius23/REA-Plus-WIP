package io.getstream.chat.android.p226ui.widgets.internal;

import androidx.recyclerview.widget.AbstractC1700k1;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;", "Landroidx/recyclerview/widget/k1;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "itemPosition", "Ll83/a0;", "autoScrollToTopIfNecessary", "(I)V", "fromPosition", "toPosition", "itemCount", "onItemRangeMoved", "(III)V", "positionStart", "onItemRangeInserted", "(II)V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SnapToTopDataObserver extends AbstractC1700k1 {
    private final LinearLayoutManager layoutManager;
    private final RecyclerView recyclerView;

    public SnapToTopDataObserver(RecyclerView recyclerView) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        AbstractC1740u1 layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            throw new IllegalStateException("Auto scroll only works with LinearLayoutManager");
        }
        this.layoutManager = linearLayoutManager;
    }

    private final void autoScrollToTopIfNecessary(int itemPosition) {
        if (itemPosition == 0 && this.recyclerView.getScrollState() == 0 && !this.recyclerView.canScrollVertically(-1) && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            this.layoutManager.scrollToPosition(0);
        }
    }

    public final LinearLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeInserted(int positionStart, int itemCount) {
        autoScrollToTopIfNecessary(positionStart);
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        autoScrollToTopIfNecessary(Math.min(fromPosition, toPosition));
    }
}
