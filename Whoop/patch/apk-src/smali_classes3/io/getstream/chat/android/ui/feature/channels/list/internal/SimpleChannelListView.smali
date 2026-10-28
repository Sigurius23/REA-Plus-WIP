.class public final Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001:\u0001{B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0015\u0010\'\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010*\u001a\u00020\u000c2\u0006\u0010)\u001a\u00020%\u00a2\u0006\u0004\u0008*\u0010(J\u0015\u0010-\u001a\u00020\u000c2\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008-\u0010.J\u0015\u00100\u001a\u00020\u000c2\u0006\u0010/\u001a\u00020+\u00a2\u0006\u0004\u00080\u0010.J\u0017\u00102\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u000101\u00a2\u0006\u0004\u00082\u00103J\u0017\u00105\u001a\u00020\u000c2\u0008\u0008\u0001\u00104\u001a\u00020\u0006\u00a2\u0006\u0004\u00085\u00106J\u0015\u00108\u001a\u00020\u000c2\u0006\u00107\u001a\u00020\u0006\u00a2\u0006\u0004\u00088\u00106J\u0015\u0010;\u001a\u00020\u000c2\u0006\u0010:\u001a\u000209\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010>\u001a\u00020\u000c2\u0008\u0010\u001a\u001a\u0004\u0018\u00010=\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010A\u001a\u00020\u000c2\u0006\u0010@\u001a\u000209\u00a2\u0006\u0004\u0008A\u0010<J)\u0010E\u001a\u00020\u000c2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u000c0C\u00a2\u0006\u0004\u0008E\u0010FJ\r\u0010G\u001a\u000209\u00a2\u0006\u0004\u0008G\u0010HJ\r\u0010I\u001a\u000209\u00a2\u0006\u0004\u0008I\u0010HJ\u0017\u0010O\u001a\u00020L2\u0006\u0010K\u001a\u00020JH\u0000\u00a2\u0006\u0004\u0008M\u0010NJ\u001f\u0010S\u001a\u00020\u000c2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008S\u0010TJ\u0019\u0010V\u001a\u00020\u000c2\u0008\u0008\u0001\u0010U\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008V\u00106J\u000f\u0010X\u001a\u00020WH\u0002\u00a2\u0006\u0004\u0008X\u0010YJ\u000f\u0010Z\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008Z\u0010[J\u000f\u0010\\\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\\\u0010[R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0018\u0010a\u001a\u00060`R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010hR\u0016\u0010i\u001a\u00020W8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008i\u0010jR\u001a\u0010l\u001a\u00020k8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010oR\u001a\u0010q\u001a\u00020p8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010tR\u001a\u0010v\u001a\u00020u8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008v\u0010w\u001a\u0004\u0008x\u0010yR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010z\u00a8\u0006|"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
        "style",
        "Ll83/a0;",
        "setChannelListViewStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V",
        "setChannelListViewStyle",
        "",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
        "currentChannelItemList$stream_chat_android_ui_components_release",
        "()Ljava/util/List;",
        "currentChannelItemList",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;",
        "viewHolderFactory",
        "setViewHolderFactory",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;",
        "listener",
        "setChannelClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;",
        "setChannelLongClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;",
        "setUserClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V",
        "setChannelDeleteClickListener",
        "setMoreOptionsClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;",
        "isMoreOptionsVisible",
        "setIsMoreOptionsVisible",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V",
        "isDeleteOptionVisible",
        "setIsDeleteOptionVisible",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;",
        "getMoreOptionsIcon",
        "setMoreOptionsIconProvider",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V",
        "getDeleteOptionIcon",
        "setDeleteOptionIconProvider",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "setSwipeListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V",
        "drawableResource",
        "setItemSeparator",
        "(I)V",
        "height",
        "setItemSeparatorHeight",
        "",
        "shouldDrawOnLastItem",
        "setShouldDrawItemSeparatorOnLastItem",
        "(Z)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;",
        "setOnEndReachedListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V",
        "enabled",
        "setPaginationEnabled",
        "channels",
        "Lkotlin/Function0;",
        "commitCallback",
        "setChannels",
        "(Ljava/util/List;Lc93/a;)V",
        "hasChannels",
        "()Z",
        "isAdapterInitialized",
        "",
        "cid",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel$stream_chat_android_ui_components_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "Landroid/view/View;",
        "view",
        "visibility",
        "onVisibilityChanged",
        "(Landroid/view/View;I)V",
        "edgeEffectColor",
        "setEdgeEffectColor",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;",
        "requireAdapter",
        "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;",
        "initAdapter",
        "()V",
        "observeListEndRegion",
        "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
        "layoutManager",
        "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
        "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;",
        "scrollListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;",
        "dividerDecoration",
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;",
        "endReachedListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;",
        "adapter",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;",
        "listenerContainer",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;",
        "getListenerContainer$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;",
        "visibilityContainer",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;",
        "getVisibilityContainer$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;",
        "iconProviderContainer",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;",
        "getIconProviderContainer$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
        "EndReachedScrollListener",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

.field private final dividerDecoration:Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

.field private endReachedListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;

.field private final iconProviderContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

.field private final layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

.field private final listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

.field private final scrollListener:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;

.field private style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

.field private viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

.field private final visibilityContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p2, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;

    invoke-direct {p2, p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->scrollListener:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->dividerDecoration:Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

    .line 7
    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    .line 8
    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p3, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->visibilityContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;

    .line 9
    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    invoke-direct {p3, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->iconProviderContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    const/4 p3, 0x1

    .line 10
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    new-instance v2, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    invoke-direct {v2, p1}, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    .line 12
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    .line 13
    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;

    const/16 v5, 0xc

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setSwipeListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V

    const/4 p1, -0x1

    .line 14
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/q1;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getEndReachedListener$p(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->endReachedListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;

    return-object p0
.end method

.method public static final synthetic access$requireAdapter(Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->requireAdapter()Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    move-result-object p0

    return-object p0
.end method

.method private final initAdapter()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    const-string v1, "viewHolderFactory"

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;->setListenerContainer$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    if-eqz v0, :cond_6

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->visibilityContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;->setVisibilityContainer$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    if-eqz v0, :cond_5

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->iconProviderContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;->setIconProviderContainer$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    if-eqz v0, :cond_4

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    if-eqz v3, :cond_3

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;->setStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    if-eqz v3, :cond_2

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-eqz v0, :cond_1

    new-instance v1, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/i1;->registerAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    return-void

    :cond_1
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final observeListEndRegion()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->scrollListener:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    return-void
.end method

.method public static synthetic q(Lc93/a;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setChannels$lambda$1(Lc93/a;)V

    return-void
.end method

.method private final requireAdapter()Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->initAdapter()V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final setChannels$lambda$1(Lc93/a;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final setEdgeEffectColor(I)V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$setEdgeEffectColor$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$setEdgeEffectColor$1;-><init>(I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setEdgeEffectFactory(Landroidx/recyclerview/widget/m1;)V

    return-void
.end method


# virtual methods
.method public final currentChannelItemList$stream_chat_android_ui_components_release()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-object v1
.end method

.method public final getChannel$stream_chat_android_ui_components_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->getChannel$stream_chat_android_ui_components_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "adapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final getIconProviderContainer$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->iconProviderContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    return-object v0
.end method

.method public final getListenerContainer$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    return-object v0
.end method

.method public final getVisibilityContainer$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->visibilityContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;

    return-object v0
.end method

.method public final hasChannels()Z
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->requireAdapter()Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getItemCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isAdapterInitialized()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-eqz p1, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void

    :cond_0
    const-string p1, "adapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public final setChannelClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->setChannelClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void
.end method

.method public final setChannelDeleteClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->setDeleteClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void
.end method

.method public final setChannelListViewStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V
    .locals 2

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->dividerDecoration:Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemSeparator()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getEdgeEffectColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setEdgeEffectColor(I)V

    :cond_0
    return-void
.end method

.method public final setChannelLongClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->setChannelLongClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V

    return-void
.end method

.method public final setChannels(Ljava/util/List;Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
            ">;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "channels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commitCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->requireAdapter()Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    move-result-object v0

    new-instance v1, Lb4/a;

    const/4 v2, 0x7

    invoke-direct {v1, p2, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setDeleteOptionIconProvider(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V
    .locals 1

    const-string v0, "getDeleteOptionIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->iconProviderContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->setGetDeleteOptionIcon(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V

    return-void
.end method

.method public final setIsDeleteOptionVisible(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V
    .locals 1

    const-string v0, "isDeleteOptionVisible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->visibilityContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;->setDeleteOptionVisible(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V

    return-void
.end method

.method public final setIsMoreOptionsVisible(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V
    .locals 1

    const-string v0, "isMoreOptionsVisible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->visibilityContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;->setMoreOptionsVisible(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V

    return-void
.end method

.method public final setItemSeparator(I)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->dividerDecoration:Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setItemSeparatorHeight(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->dividerDecoration:Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->setDrawableHeight(Ljava/lang/Integer;)V

    return-void
.end method

.method public final setMoreOptionsClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->setMoreOptionsClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void
.end method

.method public final setMoreOptionsIconProvider(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V
    .locals 1

    const-string v0, "getMoreOptionsIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->iconProviderContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->setGetMoreOptionsIcon(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V

    return-void
.end method

.method public final setOnEndReachedListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->endReachedListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->observeListEndRegion()V

    return-void
.end method

.method public final setPaginationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->scrollListener:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView$EndReachedScrollListener;->setPaginationEnabled(Z)V

    return-void
.end method

.method public final setShouldDrawItemSeparatorOnLastItem(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->dividerDecoration:Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->setDrawOnLastItem(Z)V

    return-void
.end method

.method public final setSwipeListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->setSwipeListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V

    return-void
.end method

.method public final setUserClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->listenerContainer:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->setUserClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V

    return-void
.end method

.method public final setViewHolderFactory(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V
    .locals 1

    const-string v0, "viewHolderFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->adapter:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;

    if-nez v0, :cond_0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter was already initialized, please set ChannelListItemViewHolderFactory first"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
