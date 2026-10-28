package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.data.local.room.dao.persistent.C6494e;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder;
import io.getstream.chat.android.p226ui.widgets.internal.ScrollPauseLinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xb3.AbstractC38176k;
import xb3.C38170e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0001-B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J3\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b!\u0010\u001cJ3\u0010\"\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;", "layoutManager", "", "", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;", "swipeStateByPosition", "", "multiSwipeEnabled", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;Z)V", "Landroid/view/View;", "", "value", "Ll83/a0;", "animateSwipeTo", "(Landroid/view/View;F)V", "adapterPosition", "closeAllOtherPositions", "(I)V", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;", "viewHolder", "x", "y", "onSwipeStarted", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V", "dX", "totalDeltaX", "onSwipeChanged", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V", "onSwipeCompleted", "onSwipeCanceled", "onRestoreSwipePosition", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;", "getLayoutManager", "()Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;", "Ljava/util/Map;", "Z", "SwipeState", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelItemSwipeListener implements ChannelListView.SwipeListener {
    private final ScrollPauseLinearLayoutManager layoutManager;
    private boolean multiSwipeEnabled;
    private final RecyclerView recyclerView;
    private final Map<Integer, SwipeState> swipeStateByPosition;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;", "", "<init>", "()V", "Open", "Closed", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class SwipeState {

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;", "<init>", "()V", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Closed extends SwipeState {
            public static final Closed INSTANCE = new Closed();

            private Closed() {
            }

            public final String toString() {
                return "Closed";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;", "<init>", "()V", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Open extends SwipeState {
            public static final Open INSTANCE = new Open();

            private Open() {
            }

            public final String toString() {
                return "Open";
            }
        }

        private SwipeState() {
        }

        public SwipeState(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelItemSwipeListener(RecyclerView recyclerView, ScrollPauseLinearLayoutManager layoutManager) {
        this(recyclerView, layoutManager, null, false, 12, null);
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(layoutManager, "layoutManager");
    }

    private final void animateSwipeTo(View view, float f13) {
        view.animate().x(f13).setStartDelay(0L).setDuration(100L).start();
    }

    private final void closeAllOtherPositions(int adapterPosition) {
        Map<Integer, SwipeState> map = this.swipeStateByPosition;
        AbstractC22676k.m65750j(map, "<this>");
        C38170e c38170e = new C38170e(AbstractC38176k.m122282r(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(map.entrySet()), new C6494e(adapterPosition, 19)), new C19616a(11)));
        while (c38170e.hasNext()) {
            Map.Entry entry = (Map.Entry) c38170e.next();
            this.swipeStateByPosition.put((Integer) entry.getKey(), SwipeState.Closed.INSTANCE);
            AbstractC1717o2 abstractC1717o2FindViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(((Number) entry.getKey()).intValue());
            if (abstractC1717o2FindViewHolderForAdapterPosition != null) {
                if (!(abstractC1717o2FindViewHolderForAdapterPosition instanceof ChannelViewHolder)) {
                    abstractC1717o2FindViewHolderForAdapterPosition = null;
                }
                ChannelViewHolder channelViewHolder = (ChannelViewHolder) abstractC1717o2FindViewHolderForAdapterPosition;
                if (channelViewHolder != null) {
                    boolean zIsViewPartiallyVisible = this.layoutManager.isViewPartiallyVisible(channelViewHolder.itemView, true, false);
                    boolean zIsViewPartiallyVisible2 = this.layoutManager.isViewPartiallyVisible(channelViewHolder.itemView, false, false);
                    if (zIsViewPartiallyVisible || zIsViewPartiallyVisible2) {
                        animateSwipeTo(channelViewHolder.getSwipeView(), 0.0f);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean closeAllOtherPositions$lambda$2(int i13, Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return ((Number) it.getKey()).intValue() != i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean closeAllOtherPositions$lambda$3(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC22676k.m65745e(it.getValue(), SwipeState.Open.INSTANCE);
    }

    public final ScrollPauseLinearLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
    public final void onRestoreSwipePosition(SwipeViewHolder viewHolder, int adapterPosition) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        viewHolder.getSwipeView().setX(AbstractC22676k.m65745e(this.swipeStateByPosition.get(Integer.valueOf(adapterPosition)), SwipeState.Open.INSTANCE) ? viewHolder.getOpenedX() : 0.0f);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
    public final void onSwipeCanceled(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        animateSwipeTo(viewHolder.getSwipeView(), 0.0f);
        this.swipeStateByPosition.put(Integer.valueOf(adapterPosition), SwipeState.Closed.INSTANCE);
        this.layoutManager.setVerticalScrollEnabled(true);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
    public final void onSwipeChanged(SwipeViewHolder viewHolder, int adapterPosition, float dX, float totalDeltaX) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        float fFloatValue = ((Number) AbstractC12889b.m36288r(Float.valueOf(viewHolder.getSwipeView().getX() + dX), viewHolder.getSwipeDeltaRange())).floatValue();
        View swipeView = viewHolder.getSwipeView();
        if (swipeView.getX() != fFloatValue) {
            swipeView.setX(fFloatValue);
        }
        viewHolder.itemView.setPressed(false);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
    public final void onSwipeCompleted(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        animateSwipeTo(viewHolder.getSwipeView(), viewHolder.isSwiped() ? viewHolder.getOpenedX() : 0.0f);
        SwipeState swipeState = viewHolder.isSwiped() ? SwipeState.Open.INSTANCE : SwipeState.Closed.INSTANCE;
        this.swipeStateByPosition.put(Integer.valueOf(adapterPosition), swipeState);
        if (!this.multiSwipeEnabled && AbstractC22676k.m65745e(swipeState, SwipeState.Open.INSTANCE)) {
            closeAllOtherPositions(adapterPosition);
        }
        this.layoutManager.setVerticalScrollEnabled(true);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
    public final void onSwipeStarted(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        this.layoutManager.setVerticalScrollEnabled(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelItemSwipeListener(RecyclerView recyclerView, ScrollPauseLinearLayoutManager layoutManager, Map<Integer, SwipeState> swipeStateByPosition) {
        this(recyclerView, layoutManager, swipeStateByPosition, false, 8, null);
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(layoutManager, "layoutManager");
        AbstractC22676k.m65750j(swipeStateByPosition, "swipeStateByPosition");
    }

    public ChannelItemSwipeListener(RecyclerView recyclerView, ScrollPauseLinearLayoutManager layoutManager, Map<Integer, SwipeState> swipeStateByPosition, boolean z4) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        AbstractC22676k.m65750j(layoutManager, "layoutManager");
        AbstractC22676k.m65750j(swipeStateByPosition, "swipeStateByPosition");
        this.recyclerView = recyclerView;
        this.layoutManager = layoutManager;
        this.swipeStateByPosition = swipeStateByPosition;
        this.multiSwipeEnabled = z4;
    }

    public /* synthetic */ ChannelItemSwipeListener(RecyclerView recyclerView, ScrollPauseLinearLayoutManager scrollPauseLinearLayoutManager, Map map, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, scrollPauseLinearLayoutManager, (i13 & 4) != 0 ? new LinkedHashMap() : map, (i13 & 8) != 0 ? false : z4);
    }
}
