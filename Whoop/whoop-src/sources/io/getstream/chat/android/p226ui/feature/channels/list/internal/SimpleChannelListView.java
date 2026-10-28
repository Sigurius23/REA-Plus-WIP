package io.getstream.chat.android.p226ui.feature.channels.list.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.AbstractC1708m1;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.internal.ChannelListItemAdapter;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListIconProviderContainerImpl;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainerImpl;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainerImpl;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal.ChannelItemSwipeListener;
import io.getstream.chat.android.p226ui.widgets.internal.ScrollPauseLinearLayoutManager;
import io.getstream.chat.android.p226ui.widgets.internal.SimpleVerticalListDivider;
import io.getstream.chat.android.p226ui.widgets.internal.SnapToTopDataObserver;
import java.util.List;
import p028b4.RunnableC2690a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001{B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010\u001cJ\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020%¢\u0006\u0004\b*\u0010(J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\u0017\u00102\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u000101¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\f2\b\b\u0001\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00106J\u0015\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u000209¢\u0006\u0004\bA\u0010<J)\u0010E\u001a\u00020\f2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0C¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u000209¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u000209¢\u0006\u0004\bI\u0010HJ\u0017\u0010O\u001a\u00020L2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bM\u0010NJ\u001f\u0010S\u001a\u00020\f2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u0006H\u0014¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u00020\f2\b\b\u0001\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u00106J\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\fH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\fH\u0002¢\u0006\u0004\b\\\u0010[R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u00060`R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0016\u0010i\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010l\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010q\u001a\u00020p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010v\u001a\u00020u8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010z¨\u0006|"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "style", "Ll83/a0;", "setChannelListViewStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V", "setChannelListViewStyle", "", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "currentChannelItemList$stream_chat_android_ui_components_release", "()Ljava/util/List;", "currentChannelItemList", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;", "viewHolderFactory", "setViewHolderFactory", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "listener", "setChannelClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "setChannelLongClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "setUserClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V", "setChannelDeleteClickListener", "setMoreOptionsClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "isMoreOptionsVisible", "setIsMoreOptionsVisible", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V", "isDeleteOptionVisible", "setIsDeleteOptionVisible", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "getMoreOptionsIcon", "setMoreOptionsIconProvider", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V", "getDeleteOptionIcon", "setDeleteOptionIconProvider", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "setSwipeListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V", "drawableResource", "setItemSeparator", "(I)V", "height", "setItemSeparatorHeight", "", "shouldDrawOnLastItem", "setShouldDrawItemSeparatorOnLastItem", "(Z)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;", "setOnEndReachedListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V", "enabled", "setPaginationEnabled", "channels", "Lkotlin/Function0;", "commitCallback", "setChannels", "(Ljava/util/List;Lc93/a;)V", "hasChannels", "()Z", "isAdapterInitialized", "", "cid", "Lio/getstream/chat/android/models/Channel;", "getChannel$stream_chat_android_ui_components_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "getChannel", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "edgeEffectColor", "setEdgeEffectColor", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;", "requireAdapter", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;", "initAdapter", "()V", "observeListEndRegion", "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;", "layoutManager", "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;", "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;", "Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;", "dividerDecoration", "Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;", "endReachedListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;", "adapter", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;", "listenerContainer", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;", "getListenerContainer$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;", "visibilityContainer", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;", "getVisibilityContainer$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;", "iconProviderContainer", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;", "getIconProviderContainer$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "EndReachedScrollListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SimpleChannelListView extends RecyclerView {
    private ChannelListItemAdapter adapter;
    private final SimpleVerticalListDivider dividerDecoration;
    private ChannelListView.EndReachedListener endReachedListener;
    private final ChannelListIconProviderContainerImpl iconProviderContainer;
    private final ScrollPauseLinearLayoutManager layoutManager;
    private final ChannelListListenerContainerImpl listenerContainer;
    private final EndReachedScrollListener scrollListener;
    private ChannelListViewStyle style;
    private ChannelListItemViewHolderFactory viewHolderFactory;
    private final ChannelListVisibilityContainerImpl visibilityContainer;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;", "Landroidx/recyclerview/widget/z1;", "<init>", "(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "Ll83/a0;", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "enabled", "setPaginationEnabled", "(Z)V", "Z", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class EndReachedScrollListener extends AbstractC1760z1 {
        private boolean enabled;

        public EndReachedScrollListener() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1760z1
        public final void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            ChannelListView.EndReachedListener endReachedListener;
            AbstractC22676k.m65750j(recyclerView, "recyclerView");
            if (newState == 0) {
                AbstractC1740u1 layoutManager = SimpleChannelListView.this.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager != null ? (LinearLayoutManager) layoutManager : null;
                Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()) : null;
                int itemCount = SimpleChannelListView.this.requireAdapter().getDisplayCount() - 1;
                if (numValueOf != null && itemCount == numValueOf.intValue() && this.enabled && (endReachedListener = SimpleChannelListView.this.endReachedListener) != null) {
                    endReachedListener.onEndReached();
                }
            }
        }

        public final void setPaginationEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleChannelListView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void initAdapter() {
        if (this.viewHolderFactory == null) {
            this.viewHolderFactory = new ChannelListItemViewHolderFactory();
        }
        ChannelListItemViewHolderFactory channelListItemViewHolderFactory = this.viewHolderFactory;
        if (channelListItemViewHolderFactory == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        channelListItemViewHolderFactory.setListenerContainer$stream_chat_android_ui_components_release(this.listenerContainer);
        ChannelListItemViewHolderFactory channelListItemViewHolderFactory2 = this.viewHolderFactory;
        if (channelListItemViewHolderFactory2 == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        channelListItemViewHolderFactory2.setVisibilityContainer$stream_chat_android_ui_components_release(this.visibilityContainer);
        ChannelListItemViewHolderFactory channelListItemViewHolderFactory3 = this.viewHolderFactory;
        if (channelListItemViewHolderFactory3 == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        channelListItemViewHolderFactory3.m55117x1d84bd02(this.iconProviderContainer);
        ChannelListItemViewHolderFactory channelListItemViewHolderFactory4 = this.viewHolderFactory;
        if (channelListItemViewHolderFactory4 == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        ChannelListViewStyle channelListViewStyle = this.style;
        if (channelListViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        channelListItemViewHolderFactory4.setStyle$stream_chat_android_ui_components_release(channelListViewStyle);
        ChannelListItemViewHolderFactory channelListItemViewHolderFactory5 = this.viewHolderFactory;
        if (channelListItemViewHolderFactory5 == null) {
            AbstractC22676k.m65757q("viewHolderFactory");
            throw null;
        }
        ChannelListItemAdapter channelListItemAdapter = new ChannelListItemAdapter(channelListItemViewHolderFactory5);
        this.adapter = channelListItemAdapter;
        setAdapter(channelListItemAdapter);
        ChannelListItemAdapter channelListItemAdapter2 = this.adapter;
        if (channelListItemAdapter2 != null) {
            channelListItemAdapter2.registerAdapterDataObserver(new SnapToTopDataObserver(this));
        } else {
            AbstractC22676k.m65757q("adapter");
            throw null;
        }
    }

    private final void observeListEndRegion() {
        addOnScrollListener(this.scrollListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelListItemAdapter requireAdapter() {
        if (this.adapter == null) {
            initAdapter();
        }
        ChannelListItemAdapter channelListItemAdapter = this.adapter;
        if (channelListItemAdapter != null) {
            return channelListItemAdapter;
        }
        AbstractC22676k.m65757q("adapter");
        throw null;
    }

    private final void setEdgeEffectColor(final int edgeEffectColor) {
        setEdgeEffectFactory(new AbstractC1708m1() { // from class: io.getstream.chat.android.ui.feature.channels.list.internal.SimpleChannelListView.setEdgeEffectColor.1
            @Override // androidx.recyclerview.widget.AbstractC1708m1
            public final EdgeEffect createEdgeEffect(RecyclerView view, int direction) {
                AbstractC22676k.m65750j(view, "view");
                EdgeEffect edgeEffect = new EdgeEffect(view.getContext());
                edgeEffect.setColor(edgeEffectColor);
                return edgeEffect;
            }
        });
    }

    public final List<ChannelListItem> currentChannelItemList$stream_chat_android_ui_components_release() {
        ChannelListItemAdapter channelListItemAdapter = this.adapter;
        if (channelListItemAdapter == null) {
            return null;
        }
        if (channelListItemAdapter != null) {
            return channelListItemAdapter.getCurrentList();
        }
        AbstractC22676k.m65757q("adapter");
        throw null;
    }

    public final Channel getChannel$stream_chat_android_ui_components_release(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        ChannelListItemAdapter channelListItemAdapter = this.adapter;
        if (channelListItemAdapter != null) {
            return channelListItemAdapter.getChannel$stream_chat_android_ui_components_release(cid);
        }
        AbstractC22676k.m65757q("adapter");
        throw null;
    }

    /* JADX INFO: renamed from: getIconProviderContainer$stream_chat_android_ui_components_release, reason: from getter */
    public final ChannelListIconProviderContainerImpl getIconProviderContainer() {
        return this.iconProviderContainer;
    }

    /* JADX INFO: renamed from: getListenerContainer$stream_chat_android_ui_components_release, reason: from getter */
    public final ChannelListListenerContainerImpl getListenerContainer() {
        return this.listenerContainer;
    }

    /* JADX INFO: renamed from: getVisibilityContainer$stream_chat_android_ui_components_release, reason: from getter */
    public final ChannelListVisibilityContainerImpl getVisibilityContainer() {
        return this.visibilityContainer;
    }

    public final boolean hasChannels() {
        return requireAdapter().getDisplayCount() > 0;
    }

    public final boolean isAdapterInitialized() {
        return this.adapter != null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int visibility) {
        ChannelListItemAdapter channelListItemAdapter;
        AbstractC22676k.m65750j(view, "view");
        super.onVisibilityChanged(view, visibility);
        if (visibility != 0 || (channelListItemAdapter = this.adapter) == null) {
            return;
        }
        if (channelListItemAdapter != null) {
            channelListItemAdapter.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("adapter");
            throw null;
        }
    }

    public final void setChannelClickListener(ChannelListView.ChannelClickListener listener) {
        ChannelListListenerContainerImpl channelListListenerContainerImpl = this.listenerContainer;
        if (listener == null) {
            listener = ChannelListView.ChannelClickListener.DEFAULT;
        }
        channelListListenerContainerImpl.setChannelClickListener(listener);
    }

    public final void setChannelDeleteClickListener(ChannelListView.ChannelClickListener listener) {
        ChannelListListenerContainerImpl channelListListenerContainerImpl = this.listenerContainer;
        if (listener == null) {
            listener = ChannelListView.ChannelClickListener.DEFAULT;
        }
        channelListListenerContainerImpl.setDeleteClickListener(listener);
    }

    /* JADX INFO: renamed from: setChannelListViewStyle$stream_chat_android_ui_components_release */
    public final void m55141x4ed1a67a(ChannelListViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.dividerDecoration.setDrawable(style.getItemSeparator());
        Integer edgeEffectColor = style.getEdgeEffectColor();
        if (edgeEffectColor != null) {
            setEdgeEffectColor(edgeEffectColor.intValue());
        }
    }

    public final void setChannelLongClickListener(ChannelListView.ChannelLongClickListener listener) {
        ChannelListListenerContainerImpl channelListListenerContainerImpl = this.listenerContainer;
        if (listener == null) {
            listener = ChannelListView.ChannelLongClickListener.DEFAULT;
        }
        channelListListenerContainerImpl.setChannelLongClickListener(listener);
    }

    public final void setChannels(List<? extends ChannelListItem> channels, InterfaceC4339a commitCallback) {
        AbstractC22676k.m65750j(channels, "channels");
        AbstractC22676k.m65750j(commitCallback, "commitCallback");
        requireAdapter().submitList(channels, new RunnableC2690a(commitCallback, 7));
    }

    public final void setDeleteOptionIconProvider(ChannelListView.ChannelOptionIconProvider getDeleteOptionIcon) {
        AbstractC22676k.m65750j(getDeleteOptionIcon, "getDeleteOptionIcon");
        this.iconProviderContainer.setGetDeleteOptionIcon(getDeleteOptionIcon);
    }

    public final void setIsDeleteOptionVisible(ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible) {
        AbstractC22676k.m65750j(isDeleteOptionVisible, "isDeleteOptionVisible");
        this.visibilityContainer.setDeleteOptionVisible(isDeleteOptionVisible);
    }

    public final void setIsMoreOptionsVisible(ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible) {
        AbstractC22676k.m65750j(isMoreOptionsVisible, "isMoreOptionsVisible");
        this.visibilityContainer.setMoreOptionsVisible(isMoreOptionsVisible);
    }

    public final void setItemSeparator(int drawableResource) {
        SimpleVerticalListDivider simpleVerticalListDivider = this.dividerDecoration;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        Drawable drawable = AbstractC32122c.getDrawable(context, drawableResource);
        AbstractC22676k.m65747g(drawable);
        simpleVerticalListDivider.setDrawable(drawable);
    }

    public final void setItemSeparatorHeight(int height) {
        this.dividerDecoration.setDrawableHeight(Integer.valueOf(height));
    }

    public final void setMoreOptionsClickListener(ChannelListView.ChannelClickListener listener) {
        ChannelListListenerContainerImpl channelListListenerContainerImpl = this.listenerContainer;
        if (listener == null) {
            listener = ChannelListView.ChannelClickListener.DEFAULT;
        }
        channelListListenerContainerImpl.setMoreOptionsClickListener(listener);
    }

    public final void setMoreOptionsIconProvider(ChannelListView.ChannelOptionIconProvider getMoreOptionsIcon) {
        AbstractC22676k.m65750j(getMoreOptionsIcon, "getMoreOptionsIcon");
        this.iconProviderContainer.setGetMoreOptionsIcon(getMoreOptionsIcon);
    }

    public final void setOnEndReachedListener(ChannelListView.EndReachedListener listener) {
        this.endReachedListener = listener;
        observeListEndRegion();
    }

    public final void setPaginationEnabled(boolean enabled) {
        this.scrollListener.setPaginationEnabled(enabled);
    }

    public final void setShouldDrawItemSeparatorOnLastItem(boolean shouldDrawOnLastItem) {
        this.dividerDecoration.setDrawOnLastItem(shouldDrawOnLastItem);
    }

    public final void setSwipeListener(ChannelListView.SwipeListener listener) {
        ChannelListListenerContainerImpl channelListListenerContainerImpl = this.listenerContainer;
        if (listener == null) {
            listener = ChannelListView.SwipeListener.DEFAULT;
        }
        channelListListenerContainerImpl.setSwipeListener(listener);
    }

    public final void setUserClickListener(ChannelListView.UserClickListener listener) {
        ChannelListListenerContainerImpl channelListListenerContainerImpl = this.listenerContainer;
        if (listener == null) {
            listener = ChannelListView.UserClickListener.DEFAULT;
        }
        channelListListenerContainerImpl.setUserClickListener(listener);
    }

    public final void setViewHolderFactory(ChannelListItemViewHolderFactory viewHolderFactory) {
        AbstractC22676k.m65750j(viewHolderFactory, "viewHolderFactory");
        if (this.adapter != null) {
            throw new IllegalStateException("Adapter was already initialized, please set ChannelListItemViewHolderFactory first");
        }
        this.viewHolderFactory = viewHolderFactory;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleChannelListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    public /* synthetic */ SimpleChannelListView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleChannelListView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.scrollListener = new EndReachedScrollListener();
        SimpleVerticalListDivider simpleVerticalListDivider = new SimpleVerticalListDivider(context);
        this.dividerDecoration = simpleVerticalListDivider;
        this.listenerContainer = new ChannelListListenerContainerImpl(null, null, null, null, null, null, 63, null);
        int i14 = 3;
        this.visibilityContainer = new ChannelListVisibilityContainerImpl(null, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        this.iconProviderContainer = new ChannelListIconProviderContainerImpl(0 == true ? 1 : 0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        setHasFixedSize(true);
        ScrollPauseLinearLayoutManager scrollPauseLinearLayoutManager = new ScrollPauseLinearLayoutManager(context);
        this.layoutManager = scrollPauseLinearLayoutManager;
        setLayoutManager(scrollPauseLinearLayoutManager);
        Object[] objArr = 0 == true ? 1 : 0;
        setSwipeListener(new ChannelItemSwipeListener(this, scrollPauseLinearLayoutManager, objArr, false, 12, 0 == true ? 1 : 0));
        addItemDecoration(simpleVerticalListDivider, -1);
    }
}
