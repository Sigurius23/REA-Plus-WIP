package io.getstream.chat.android.p226ui.feature.channels.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC1329o1;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import e93.AbstractC12889b;
import i01.C17841d;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction;
import io.getstream.chat.android.p226ui.common.state.channels.actions.DeleteConversation;
import io.getstream.chat.android.p226ui.common.state.channels.actions.LeaveGroup;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ViewInfo;
import io.getstream.chat.android.p226ui.feature.channels.actions.ChannelActionsDialogViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.actions.internal.ChannelActionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder;
import io.getstream.chat.android.p226ui.feature.channels.list.internal.SimpleChannelListView;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModel;
import io.getstream.chat.android.p226ui.widgets.internal.ScrollPauseLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import p213i7.C18194g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u008a\u00012\u00020\u0001:\u0016\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u00162\b\b\u0001\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010%J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u000103¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b9\u00102J\u0017\u0010:\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b:\u00102J!\u0010>\u001a\u00020\u00162\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00190;¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020\u00162\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00190;¢\u0006\u0004\bA\u0010?J#\u0010D\u001a\u00020\u00162\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010B0;¢\u0006\u0004\bD\u0010?J#\u0010F\u001a\u00020\u00162\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010B0;¢\u0006\u0004\bF\u0010?J\u0017\u0010G\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\bG\u00102J\u0017\u0010H\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\bH\u00102J\u0017\u0010J\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010L¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u00020\u00162\u0006\u00100\u001a\u00020O¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020\u00162\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0015\u0010\\\u001a\u00020\u00162\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u001b\u0010a\u001a\u00020\u00162\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0016¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\u0016¢\u0006\u0004\be\u0010dJ\u0015\u0010g\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u0019¢\u0006\u0004\bg\u0010*J\r\u0010h\u001a\u00020\u0019¢\u0006\u0004\bh\u0010\u001bJ!\u0010i\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0016H\u0002¢\u0006\u0004\bk\u0010dJ\u000f\u0010l\u001a\u00020\u0016H\u0002¢\u0006\u0004\bl\u0010dJ\u000f\u0010m\u001a\u00020\u0016H\u0002¢\u0006\u0004\bm\u0010dJ\u0017\u0010n\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bn\u0010\u0005R\u0014\u0010o\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010rR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010yR\u0016\u0010{\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0010\u0010\u0088\u0001¨\u0006\u0095\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "Ll83/a0;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "", "isAdapterInitialized", "()Z", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "setEmptyStateView", "(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V", "setLoadingView", "drawableResource", "setItemSeparator", "(I)V", "dp", "setItemSeparatorHeight", "shouldDrawOnLastItem", "setShouldDrawItemSeparatorOnLastItem", "(Z)V", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;", "factory", "setViewHolderFactory", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "listener", "setChannelItemClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "setChannelLongClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "setUserClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V", "setChannelDeleteClickListener", "setMoreOptionsClickListener", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Channel;", "isMoreOptionsVisible", "setIsMoreOptionsVisible", "(Lkotlin/jvm/functions/Function1;)V", "isDeleteOptionVisible", "setIsDeleteOptionVisible", "Landroid/graphics/drawable/Drawable;", "getMoreOptionsIcon", "setMoreOptionsIconProvider", "getDeleteOptionIcon", "setDeleteOptionIconProvider", "setChannelInfoClickListener", "setChannelLeaveClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "setSwipeListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;", "setOnEndReachedListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;", "setChannelListUpdateListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;", "channelListItemPredicate", "setChannelListItemPredicate", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;", "handler", "setErrorEventHandler", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;)V", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;", "errorEvent", "showError", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V", "", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "channels", "setChannels", "(Ljava/util/List;)V", "hideLoadingView", "()V", "showLoadingView", "enabled", "setPaginationEnabled", "hasChannels", "init", "(Landroid/util/AttributeSet;I)V", "restoreLayoutManagerState", "showEmptyStateView", "hideEmptyStateView", "configureDefaultMoreOptionsListener", "CHANNEL_LIST_VIEW_ID", "I", "emptyStateView", "Landroid/view/View;", "loadingView", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;", "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;", "simpleChannelListView", "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;", "channelInfoListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "channelLeaveListener", "errorEventHandler", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "actionDialogStyle", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "channelListUpdateListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;", "layoutManagerState", "Landroid/os/Parcelable;", "Landroidx/recyclerview/widget/u1;", "()Landroidx/recyclerview/widget/u1;", "layoutManager", "Companion", "UserClickListener", "ChannelClickListener", "ChannelLongClickListener", "ChannelOptionVisibilityPredicate", "ChannelOptionIconProvider", "EndReachedListener", "ChannelListUpdateListener", "ChannelListItemPredicate", "ErrorEventHandler", "SwipeListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListView extends FrameLayout {
    private static final String KEY_SCROLL_STATE = "scroll_state";
    private static final String KEY_SUPER_STATE = "super_state";
    private final int CHANNEL_LIST_VIEW_ID;
    private ChannelActionsDialogViewStyle actionDialogStyle;
    private ChannelClickListener channelInfoListener;
    private ChannelClickListener channelLeaveListener;
    private ChannelListItemPredicate channelListItemPredicate;
    private ChannelListUpdateListener channelListUpdateListener;
    private View emptyStateView;
    private ErrorEventHandler errorEventHandler;
    private Parcelable layoutManagerState;
    private View loadingView;
    private SimpleChannelListView simpleChannelListView;
    private ChannelListViewStyle style;
    private static final Companion Companion = new Companion();
    private static final InterfaceC23462h defaultChildLayoutParams$delegate = AbstractC30060g.m92088H(new C19383k(21));

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "", "Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "onClick", "(Lio/getstream/chat/android/models/Channel;)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelClickListener {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final ChannelClickListener DEFAULT = new C19644c();

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void onClick(Channel channel);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;", "", "predicate", "", "channelListItem", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelListItemPredicate {
        boolean predicate(ChannelListItem channelListItem);
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;", "", "", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "channels", "Ll83/a0;", "onChannelListUpdate", "(Ljava/util/List;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelListUpdateListener {
        void onChannelListUpdate(List<? extends ChannelListItem> channels);
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "", "onLongClick", "", "channel", "Lio/getstream/chat/android/models/Channel;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelLongClickListener {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final ChannelLongClickListener DEFAULT = new C19645d();

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static boolean DEFAULT$lambda$0(Channel it) {
            AbstractC22676k.m65750j(it, "it");
            return true;
        }

        boolean onLongClick(Channel channel);
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0006J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H¦\u0002¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Channel;", "Landroid/graphics/drawable/Drawable;", "invoke", "channel", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelOptionIconProvider extends Function1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final ChannelOptionIconProvider DEFAULT = new C19646e();

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static Drawable DEFAULT$lambda$0(Channel it) {
            AbstractC22676k.m65750j(it, "it");
            return null;
        }

        Drawable invoke(Channel channel);

        @Override // p715kotlin.jvm.functions.Function1
        /* synthetic */ Object invoke(Object obj);
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H¦\u0002¢\u0006\u0002\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Channel;", "", "invoke", "channel", "(Lio/getstream/chat/android/models/Channel;)Ljava/lang/Boolean;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelOptionVisibilityPredicate extends Function1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final ChannelOptionVisibilityPredicate DEFAULT = C19628xd6a51b7d.INSTANCE;

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        Boolean invoke(Channel channel);

        @Override // p715kotlin.jvm.functions.Function1
        /* synthetic */ Object invoke(Object obj);
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;", "", "<init>", "()V", "Landroid/widget/FrameLayout$LayoutParams;", "defaultChildLayoutParams$delegate", "Ll83/h;", "getDefaultChildLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "defaultChildLayoutParams", "", "KEY_SUPER_STATE", "Ljava/lang/String;", "KEY_SCROLL_STATE", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FrameLayout.LayoutParams getDefaultChildLayoutParams() {
            return (FrameLayout.LayoutParams) ChannelListView.defaultChildLayoutParams$delegate.getValue();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;", "", "Ll83/a0;", "onEndReached", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface EndReachedListener {
        void onEndReached();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;", "", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;", "errorEvent", "Ll83/a0;", "onErrorEvent", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ErrorEventHandler {
        void onErrorEvent(ChannelListViewModel.ErrorEvent errorEvent);
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0010\u0010\u000bJ7\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0011\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;", "viewHolder", "", "adapterPosition", "", "x", "y", "Ll83/a0;", "onSwipeStarted", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V", "dX", "totalDeltaX", "onSwipeChanged", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V", "onSwipeCompleted", "onSwipeCanceled", "onRestoreSwipePosition", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface SwipeListener {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final SwipeListener DEFAULT = new ChannelListView$SwipeListener$Companion$DEFAULT$1();

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class DefaultImpls {
        }

        static /* synthetic */ void onSwipeCanceled$default(SwipeListener swipeListener, SwipeViewHolder swipeViewHolder, int i13, Float f13, Float f14, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSwipeCanceled");
            }
            if ((i14 & 4) != 0) {
                f13 = null;
            }
            if ((i14 & 8) != 0) {
                f14 = null;
            }
            swipeListener.onSwipeCanceled(swipeViewHolder, i13, f13, f14);
        }

        static /* synthetic */ void onSwipeCompleted$default(SwipeListener swipeListener, SwipeViewHolder swipeViewHolder, int i13, Float f13, Float f14, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSwipeCompleted");
            }
            if ((i14 & 4) != 0) {
                f13 = null;
            }
            if ((i14 & 8) != 0) {
                f14 = null;
            }
            swipeListener.onSwipeCompleted(swipeViewHolder, i13, f13, f14);
        }

        static /* synthetic */ void onSwipeStarted$default(SwipeListener swipeListener, SwipeViewHolder swipeViewHolder, int i13, Float f13, Float f14, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSwipeStarted");
            }
            if ((i14 & 4) != 0) {
                f13 = null;
            }
            if ((i14 & 8) != 0) {
                f14 = null;
            }
            swipeListener.onSwipeStarted(swipeViewHolder, i13, f13, f14);
        }

        void onRestoreSwipePosition(SwipeViewHolder viewHolder, int adapterPosition);

        void onSwipeCanceled(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13);

        void onSwipeChanged(SwipeViewHolder viewHolder, int adapterPosition, float dX, float totalDeltaX);

        void onSwipeCompleted(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13);

        void onSwipeStarted(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Ll83/a0;", "onClick", "(Lio/getstream/chat/android/models/User;)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface UserClickListener {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final UserClickListener DEFAULT = new C19647f();

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void onClick(User user);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean channelListItemPredicate$lambda$0(ChannelListItem it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void channelListUpdateListener$lambda$3(ChannelListView channelListView, List items) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC1740u1 layoutManager = channelListView.getLayoutManager();
        ScrollPauseLinearLayoutManager scrollPauseLinearLayoutManager = layoutManager instanceof ScrollPauseLinearLayoutManager ? (ScrollPauseLinearLayoutManager) layoutManager : null;
        if (scrollPauseLinearLayoutManager == null || !items.contains(ChannelListItem.LoadingMoreItem.INSTANCE)) {
            return;
        }
        int size = items.size() - 2;
        int size2 = items.size();
        int iFindLastVisibleItemPosition = scrollPauseLinearLayoutManager.findLastVisibleItemPosition();
        if (size > iFindLastVisibleItemPosition || iFindLastVisibleItemPosition > size2) {
            return;
        }
        scrollPauseLinearLayoutManager.scrollToPosition(items.size() - 1);
    }

    private final void configureDefaultMoreOptionsListener(Context context) {
        setMoreOptionsClickListener(new C19643b(context, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureDefaultMoreOptionsListener$lambda$14(Context context, ChannelListView channelListView, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(context);
        if (fragmentManager != null) {
            ChannelActionsDialogFragment.Companion companion = ChannelActionsDialogFragment.INSTANCE;
            ChannelActionsDialogViewStyle channelActionsDialogViewStyle = channelListView.actionDialogStyle;
            if (channelActionsDialogViewStyle == null) {
                AbstractC22676k.m65757q("actionDialogStyle");
                throw null;
            }
            ChannelActionsDialogFragment channelActionsDialogFragmentNewInstance = companion.newInstance(channel, channelActionsDialogViewStyle);
            channelActionsDialogFragmentNewInstance.setChannelOptionClickListener(new C19631a(channelListView));
            channelActionsDialogFragmentNewInstance.setChannelMemberClickListener(new C19631a(channelListView));
            channelActionsDialogFragmentNewInstance.show(fragmentManager, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: configureDefaultMoreOptionsListener$lambda$14$lambda$13$lambda$12$lambda$10 */
    public static final void m55102xc3cf1fcb(ChannelListView channelListView, ChannelAction channelAction) {
        AbstractC22676k.m65750j(channelAction, "channelAction");
        if (channelAction instanceof ViewInfo) {
            channelListView.channelInfoListener.onClick(((ViewInfo) channelAction).getChannel());
            return;
        }
        if (channelAction instanceof LeaveGroup) {
            channelListView.channelLeaveListener.onClick(((LeaveGroup) channelAction).getChannel());
            return;
        }
        if (channelAction instanceof DeleteConversation) {
            SimpleChannelListView simpleChannelListView = channelListView.simpleChannelListView;
            if (simpleChannelListView != null) {
                simpleChannelListView.getListenerContainer().getDeleteClickListener().onClick(((DeleteConversation) channelAction).getChannel());
            } else {
                AbstractC22676k.m65757q("simpleChannelListView");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: configureDefaultMoreOptionsListener$lambda$14$lambda$13$lambda$12$lambda$11 */
    public static final void m55103xc3cf1fcc(ChannelListView channelListView, Member member) {
        AbstractC22676k.m65750j(member, "member");
        SimpleChannelListView simpleChannelListView = channelListView.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.getListenerContainer().getUserClickListener().onClick(member.getUser());
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout.LayoutParams defaultChildLayoutParams_delegate$lambda$15() {
        return new FrameLayout.LayoutParams(-2, -2, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorEventHandler$lambda$1(ChannelListView channelListView, ChannelListViewModel.ErrorEvent errorEvent) {
        int i13;
        AbstractC22676k.m65750j(errorEvent, "errorEvent");
        if (errorEvent instanceof ChannelListViewModel.ErrorEvent.DeleteChannelError) {
            i13 = C19469R.string.stream_ui_channel_list_error_delete_channel;
        } else {
            if (!(errorEvent instanceof ChannelListViewModel.ErrorEvent.LeaveChannelError)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = C19469R.string.stream_ui_channel_list_error_leave_channel;
        }
        ViewKt.showToast(channelListView, i13);
    }

    private final AbstractC1740u1 getLayoutManager() {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView == null) {
            return null;
        }
        if (simpleChannelListView != null) {
            return simpleChannelListView.getLayoutManager();
        }
        AbstractC22676k.m65757q("simpleChannelListView");
        throw null;
    }

    private final void hideEmptyStateView() {
        View view = this.emptyStateView;
        if (view != null) {
            view.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("emptyStateView");
            throw null;
        }
    }

    private final void init(AttributeSet attrs, int defStyleAttr) {
        ChannelListViewStyle.Companion companion = ChannelListViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        ChannelListViewStyle channelListViewStyleInvoke = companion.invoke(context, attrs);
        this.style = channelListViewStyleInvoke;
        if (channelListViewStyleInvoke == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        setBackgroundColor(channelListViewStyleInvoke.getBackgroundColor());
        ChannelActionsDialogViewStyle.Companion companion2 = ChannelActionsDialogViewStyle.INSTANCE;
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.actionDialogStyle = companion2.invoke(context2, attrs);
        Context context3 = getContext();
        AbstractC22676k.m65749i(context3, "getContext(...)");
        SimpleChannelListView simpleChannelListView = new SimpleChannelListView(context3, attrs, defStyleAttr);
        simpleChannelListView.setId(this.CHANNEL_LIST_VIEW_ID);
        ChannelListViewStyle channelListViewStyle = this.style;
        if (channelListViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        simpleChannelListView.m55141x4ed1a67a(channelListViewStyle);
        this.simpleChannelListView = simpleChannelListView;
        addView(simpleChannelListView, new FrameLayout.LayoutParams(-1, -1));
        LayoutInflater streamThemeInflater = ViewGroupKt.getStreamThemeInflater(this);
        ChannelListViewStyle channelListViewStyle2 = this.style;
        if (channelListViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        View viewInflate = streamThemeInflater.inflate(channelListViewStyle2.getEmptyStateView(), (ViewGroup) this, false);
        AbstractC22676k.m65747g(viewInflate);
        viewInflate.setVisibility(8);
        addView(viewInflate);
        this.emptyStateView = viewInflate;
        LayoutInflater streamThemeInflater2 = ViewGroupKt.getStreamThemeInflater(this);
        ChannelListViewStyle channelListViewStyle3 = this.style;
        if (channelListViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        View viewInflate2 = streamThemeInflater2.inflate(channelListViewStyle3.getLoadingView(), (ViewGroup) this, false);
        AbstractC22676k.m65747g(viewInflate2);
        viewInflate2.setVisibility(8);
        addView(viewInflate2);
        this.loadingView = viewInflate2;
        Context context4 = getContext();
        AbstractC22676k.m65749i(context4, "getContext(...)");
        configureDefaultMoreOptionsListener(context4);
    }

    private final void restoreLayoutManagerState() {
        if (this.layoutManagerState != null) {
            AbstractC1740u1 layoutManager = getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(this.layoutManagerState);
            }
            this.layoutManagerState = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setChannels$lambda$9(ChannelListView channelListView, List list) {
        channelListView.restoreLayoutManagerState();
        ChannelListUpdateListener channelListUpdateListener = channelListView.channelListUpdateListener;
        if (channelListUpdateListener != null) {
            channelListUpdateListener.onChannelListUpdate(list);
        }
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void setEmptyStateView$default(ChannelListView channelListView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = Companion.getDefaultChildLayoutParams();
        }
        channelListView.setEmptyStateView(view, layoutParams);
    }

    public static /* synthetic */ void setLoadingView$default(ChannelListView channelListView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = Companion.getDefaultChildLayoutParams();
        }
        channelListView.setLoadingView(view, layoutParams);
    }

    private final void showEmptyStateView() {
        View view = this.emptyStateView;
        if (view != null) {
            view.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("emptyStateView");
            throw null;
        }
    }

    public final RecyclerView getRecyclerView() {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            return simpleChannelListView;
        }
        AbstractC22676k.m65757q("simpleChannelListView");
        throw null;
    }

    public final boolean hasChannels() {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            return simpleChannelListView.hasChannels();
        }
        AbstractC22676k.m65757q("simpleChannelListView");
        throw null;
    }

    public final void hideLoadingView() {
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("loadingView");
            throw null;
        }
    }

    public final boolean isAdapterInitialized() {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView == null) {
            return false;
        }
        if (simpleChannelListView != null) {
            return simpleChannelListView.isAdapterInitialized();
        }
        AbstractC22676k.m65757q("simpleChannelListView");
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        this.layoutManagerState = bundle.getParcelable(KEY_SCROLL_STATE);
        super.onRestoreInstanceState(bundle.getParcelable(KEY_SUPER_STATE));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C23465k c23465k = new C23465k(KEY_SUPER_STATE, super.onSaveInstanceState());
        AbstractC1740u1 layoutManager = getLayoutManager();
        return AbstractC12889b.m36273g(c23465k, new C23465k(KEY_SCROLL_STATE, layoutManager != null ? layoutManager.onSaveInstanceState() : null));
    }

    public final void setChannelDeleteClickListener(ChannelClickListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setChannelDeleteClickListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setChannelInfoClickListener(ChannelClickListener listener) {
        if (listener == null) {
            listener = ChannelClickListener.DEFAULT;
        }
        this.channelInfoListener = listener;
    }

    public final void setChannelItemClickListener(ChannelClickListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setChannelClickListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setChannelLeaveClickListener(ChannelClickListener listener) {
        if (listener == null) {
            listener = ChannelClickListener.DEFAULT;
        }
        this.channelLeaveListener = listener;
    }

    public final void setChannelListItemPredicate(ChannelListItemPredicate channelListItemPredicate) {
        AbstractC22676k.m65750j(channelListItemPredicate, "channelListItemPredicate");
        this.channelListItemPredicate = channelListItemPredicate;
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView == null) {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
        List<ChannelListItem> listCurrentChannelItemList$stream_chat_android_ui_components_release = simpleChannelListView.currentChannelItemList$stream_chat_android_ui_components_release();
        if (listCurrentChannelItemList$stream_chat_android_ui_components_release != null) {
            setChannels(listCurrentChannelItemList$stream_chat_android_ui_components_release);
        }
    }

    public final void setChannelListUpdateListener(ChannelListUpdateListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.channelListUpdateListener = listener;
    }

    public final void setChannelLongClickListener(ChannelLongClickListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setChannelLongClickListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setChannels(List<? extends ChannelListItem> channels) {
        AbstractC22676k.m65750j(channels, "channels");
        ChannelListItemPredicate channelListItemPredicate = this.channelListItemPredicate;
        ArrayList arrayList = new ArrayList();
        for (Object obj : channels) {
            channelListItemPredicate.predicate((ChannelListItem) obj);
            arrayList.add(obj);
        }
        if (arrayList.isEmpty()) {
            showEmptyStateView();
        } else {
            hideEmptyStateView();
        }
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView == null) {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
        simpleChannelListView.setChannels(arrayList, new C17841d(16, this, arrayList));
    }

    public final void setDeleteOptionIconProvider(Function1 getDeleteOptionIcon) {
        AbstractC22676k.m65750j(getDeleteOptionIcon, "getDeleteOptionIcon");
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setDeleteOptionIconProvider(new C19629xa70d7a87(getDeleteOptionIcon));
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setEmptyStateView(View view) {
        AbstractC22676k.m65750j(view, "view");
        setEmptyStateView$default(this, view, null, 2, null);
    }

    public final void setErrorEventHandler(ErrorEventHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        this.errorEventHandler = handler;
    }

    public final void setIsDeleteOptionVisible(Function1 isDeleteOptionVisible) {
        AbstractC22676k.m65750j(isDeleteOptionVisible, "isDeleteOptionVisible");
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setIsDeleteOptionVisible(new C19630x4b488e00(isDeleteOptionVisible));
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setIsMoreOptionsVisible(Function1 isMoreOptionsVisible) {
        AbstractC22676k.m65750j(isMoreOptionsVisible, "isMoreOptionsVisible");
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setIsMoreOptionsVisible(new C19630x4b488e00(isMoreOptionsVisible));
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setItemSeparator(int drawableResource) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setItemSeparator(drawableResource);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setItemSeparatorHeight(int dp3) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setItemSeparatorHeight(IntKt.dpToPx(dp3));
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setLoadingView(View view) {
        AbstractC22676k.m65750j(view, "view");
        setLoadingView$default(this, view, null, 2, null);
    }

    public final void setMoreOptionsClickListener(ChannelClickListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setMoreOptionsClickListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setMoreOptionsIconProvider(Function1 getMoreOptionsIcon) {
        AbstractC22676k.m65750j(getMoreOptionsIcon, "getMoreOptionsIcon");
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setMoreOptionsIconProvider(new C19629xa70d7a87(getMoreOptionsIcon));
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setOnEndReachedListener(EndReachedListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setOnEndReachedListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setPaginationEnabled(boolean enabled) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setPaginationEnabled(enabled);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setShouldDrawItemSeparatorOnLastItem(boolean shouldDrawOnLastItem) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setShouldDrawItemSeparatorOnLastItem(shouldDrawOnLastItem);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setSwipeListener(SwipeListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setSwipeListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setUserClickListener(UserClickListener listener) {
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setUserClickListener(listener);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void setViewHolderFactory(ChannelListItemViewHolderFactory factory) {
        AbstractC22676k.m65750j(factory, "factory");
        SimpleChannelListView simpleChannelListView = this.simpleChannelListView;
        if (simpleChannelListView != null) {
            simpleChannelListView.setViewHolderFactory(factory);
        } else {
            AbstractC22676k.m65757q("simpleChannelListView");
            throw null;
        }
    }

    public final void showError(ChannelListViewModel.ErrorEvent errorEvent) {
        AbstractC22676k.m65750j(errorEvent, "errorEvent");
        this.errorEventHandler.onErrorEvent(errorEvent);
    }

    public final void showLoadingView() {
        hideEmptyStateView();
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("loadingView");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    public final void setEmptyStateView(View view, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        View view2 = this.emptyStateView;
        if (view2 == null) {
            AbstractC22676k.m65757q("emptyStateView");
            throw null;
        }
        removeView(view2);
        this.emptyStateView = view;
        addView(view, layoutParams);
    }

    public final void setLoadingView(View view, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        View view2 = this.loadingView;
        if (view2 == null) {
            AbstractC22676k.m65757q("loadingView");
            throw null;
        }
        removeView(view2);
        this.loadingView = view;
        addView(view, layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.CHANNEL_LIST_VIEW_ID = View.generateViewId();
        this.channelListItemPredicate = new C18194g(10);
        ChannelClickListener channelClickListener = ChannelClickListener.DEFAULT;
        this.channelInfoListener = channelClickListener;
        this.channelLeaveListener = channelClickListener;
        this.errorEventHandler = new C19631a(this);
        this.channelListUpdateListener = new C19631a(this);
        init(attributeSet, i13);
    }

    /* JADX INFO: renamed from: getLayoutManager, reason: collision with other method in class */
    public final LinearLayoutManager m134226getLayoutManager() {
        AbstractC1740u1 layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }
}
