.class public final Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;,
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u0000 \u008a\u00012\u00020\u0001:\u0016\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008 \u0010!J!\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008\"\u0010!J\u0017\u0010$\u001a\u00020\u00162\u0008\u0008\u0001\u0010#\u001a\u00020\t\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010\'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\t\u00a2\u0006\u0004\u0008\'\u0010%J\u0015\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0019\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00101\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u00081\u00102J\u0017\u00104\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u000103\u00a2\u0006\u0004\u00084\u00105J\u0017\u00107\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u000106\u00a2\u0006\u0004\u00087\u00108J\u0017\u00109\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u00089\u00102J\u0017\u0010:\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u0008:\u00102J!\u0010>\u001a\u00020\u00162\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00190;\u00a2\u0006\u0004\u0008>\u0010?J!\u0010A\u001a\u00020\u00162\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00190;\u00a2\u0006\u0004\u0008A\u0010?J#\u0010D\u001a\u00020\u00162\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010B0;\u00a2\u0006\u0004\u0008D\u0010?J#\u0010F\u001a\u00020\u00162\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010B0;\u00a2\u0006\u0004\u0008F\u0010?J\u0017\u0010G\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u0008G\u00102J\u0017\u0010H\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u0008H\u00102J\u0017\u0010J\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010I\u00a2\u0006\u0004\u0008J\u0010KJ\u0017\u0010M\u001a\u00020\u00162\u0008\u00100\u001a\u0004\u0018\u00010L\u00a2\u0006\u0004\u0008M\u0010NJ\u0015\u0010P\u001a\u00020\u00162\u0006\u00100\u001a\u00020O\u00a2\u0006\u0004\u0008P\u0010QJ\u0015\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020R\u00a2\u0006\u0004\u0008T\u0010UJ\u0015\u0010X\u001a\u00020\u00162\u0006\u0010W\u001a\u00020V\u00a2\u0006\u0004\u0008X\u0010YJ\u0015\u0010\\\u001a\u00020\u00162\u0006\u0010[\u001a\u00020Z\u00a2\u0006\u0004\u0008\\\u0010]J\u001b\u0010a\u001a\u00020\u00162\u000c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020_0^\u00a2\u0006\u0004\u0008a\u0010bJ\r\u0010c\u001a\u00020\u0016\u00a2\u0006\u0004\u0008c\u0010dJ\r\u0010e\u001a\u00020\u0016\u00a2\u0006\u0004\u0008e\u0010dJ\u0015\u0010g\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u0019\u00a2\u0006\u0004\u0008g\u0010*J\r\u0010h\u001a\u00020\u0019\u00a2\u0006\u0004\u0008h\u0010\u001bJ!\u0010i\u001a\u00020\u00162\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008i\u0010jJ\u000f\u0010k\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008k\u0010dJ\u000f\u0010l\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008l\u0010dJ\u000f\u0010m\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008m\u0010dJ\u0017\u0010n\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008n\u0010\u0005R\u0014\u0010o\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0016\u0010q\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0016\u0010s\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008s\u0010rR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u0016\u0010x\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0016\u0010z\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010yR\u0016\u0010{\u001a\u00020V8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00018BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0010\u0010\u0088\u0001\u00a8\u0006\u0095\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getRecyclerView",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "getLayoutManager",
        "()Landroidx/recyclerview/widget/LinearLayoutManager;",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "state",
        "Ll83/a0;",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "",
        "isAdapterInitialized",
        "()Z",
        "Landroid/view/View;",
        "view",
        "Landroid/widget/FrameLayout$LayoutParams;",
        "layoutParams",
        "setEmptyStateView",
        "(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V",
        "setLoadingView",
        "drawableResource",
        "setItemSeparator",
        "(I)V",
        "dp",
        "setItemSeparatorHeight",
        "shouldDrawOnLastItem",
        "setShouldDrawItemSeparatorOnLastItem",
        "(Z)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;",
        "factory",
        "setViewHolderFactory",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;",
        "listener",
        "setChannelItemClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;",
        "setChannelLongClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;",
        "setUserClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V",
        "setChannelDeleteClickListener",
        "setMoreOptionsClickListener",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Channel;",
        "isMoreOptionsVisible",
        "setIsMoreOptionsVisible",
        "(Lkotlin/jvm/functions/Function1;)V",
        "isDeleteOptionVisible",
        "setIsDeleteOptionVisible",
        "Landroid/graphics/drawable/Drawable;",
        "getMoreOptionsIcon",
        "setMoreOptionsIconProvider",
        "getDeleteOptionIcon",
        "setDeleteOptionIconProvider",
        "setChannelInfoClickListener",
        "setChannelLeaveClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "setSwipeListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;",
        "setOnEndReachedListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;",
        "setChannelListUpdateListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;",
        "channelListItemPredicate",
        "setChannelListItemPredicate",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;",
        "handler",
        "setErrorEventHandler",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;)V",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;",
        "errorEvent",
        "showError",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V",
        "",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
        "channels",
        "setChannels",
        "(Ljava/util/List;)V",
        "hideLoadingView",
        "()V",
        "showLoadingView",
        "enabled",
        "setPaginationEnabled",
        "hasChannels",
        "init",
        "(Landroid/util/AttributeSet;I)V",
        "restoreLayoutManagerState",
        "showEmptyStateView",
        "hideEmptyStateView",
        "configureDefaultMoreOptionsListener",
        "CHANNEL_LIST_VIEW_ID",
        "I",
        "emptyStateView",
        "Landroid/view/View;",
        "loadingView",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;",
        "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;",
        "simpleChannelListView",
        "Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;",
        "channelInfoListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;",
        "channelLeaveListener",
        "errorEventHandler",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
        "actionDialogStyle",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
        "channelListUpdateListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;",
        "layoutManagerState",
        "Landroid/os/Parcelable;",
        "Landroidx/recyclerview/widget/u1;",
        "()Landroidx/recyclerview/widget/u1;",
        "layoutManager",
        "Companion",
        "UserClickListener",
        "ChannelClickListener",
        "ChannelLongClickListener",
        "ChannelOptionVisibilityPredicate",
        "ChannelOptionIconProvider",
        "EndReachedListener",
        "ChannelListUpdateListener",
        "ChannelListItemPredicate",
        "ErrorEventHandler",
        "SwipeListener",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;

.field private static final KEY_SCROLL_STATE:Ljava/lang/String; = "scroll_state"

.field private static final KEY_SUPER_STATE:Ljava/lang/String; = "super_state"

.field private static final defaultChildLayoutParams$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# instance fields
.field private final CHANNEL_LIST_VIEW_ID:I

.field private actionDialogStyle:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

.field private channelInfoListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

.field private channelLeaveListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

.field private channelListItemPredicate:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;

.field private channelListUpdateListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;

.field private emptyStateView:Landroid/view/View;

.field private errorEventHandler:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;

.field private layoutManagerState:Landroid/os/Parcelable;

.field private loadingView:Landroid/view/View;

.field private simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

.field private style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;

    new-instance v0, Lio/getstream/chat/android/client/k;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->defaultChildLayoutParams$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->CHANNEL_LIST_VIEW_ID:I

    .line 6
    new-instance p1, Li7/g;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Li7/g;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListItemPredicate:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;

    .line 7
    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelInfoListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    .line 8
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelLeaveListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/feature/channels/list/a;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->errorEventHandler:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;

    .line 10
    new-instance p1, Lio/getstream/chat/android/ui/feature/channels/list/a;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListUpdateListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;

    .line 11
    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->init(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannels$lambda$9(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/List;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$getDefaultChildLayoutParams$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->defaultChildLayoutParams$delegate:Ll83/h;

    return-object v0
.end method

.method public static synthetic b(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->configureDefaultMoreOptionsListener$lambda$14(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListUpdateListener$lambda$3(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/List;)V

    return-void
.end method

.method private static final channelListItemPredicate$lambda$0(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final channelListUpdateListener$lambda$3(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/List;)V
    .locals 3

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p0

    instance-of v0, p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    if-eqz v0, :cond_0

    check-cast p0, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v2

    if-gt v0, v2, :cond_1

    if-gt v2, v1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPosition(I)V

    :cond_1
    return-void
.end method

.method private final configureDefaultMoreOptionsListener(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/b;

    invoke-direct {v0, p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/b;-><init>(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setMoreOptionsClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void
.end method

.method private static final configureDefaultMoreOptionsListener$lambda$14(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Channel;)V
    .locals 3

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getFragmentManager(Landroid/content/Context;)Landroidx/fragment/app/o1;

    move-result-object p0

    if-eqz p0, :cond_1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;

    iget-object v1, p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->actionDialogStyle:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p2, v1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;->newInstance(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    move-result-object p2

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/a;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->setChannelOptionClickListener(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/a;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->setChannelMemberClickListener(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;)V

    invoke-virtual {p2, p0, v2}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "actionDialogStyle"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    return-void
.end method

.method private static final configureDefaultMoreOptionsListener$lambda$14$lambda$13$lambda$12$lambda$10(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V
    .locals 1

    const-string v0, "channelAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/channels/actions/ViewInfo;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelInfoListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/channels/actions/ViewInfo;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/channels/actions/ViewInfo;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;

    if-eqz v0, :cond_1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelLeaveListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/channels/actions/DeleteConversation;

    if-eqz v0, :cond_3

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->getListenerContainer$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->getDeleteClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    move-result-object p0

    check-cast p1, Lio/getstream/chat/android/ui/common/state/channels/actions/DeleteConversation;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/channels/actions/DeleteConversation;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_2
    const-string p0, "simpleChannelListView"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_3
    return-void
.end method

.method private static final configureDefaultMoreOptionsListener$lambda$14$lambda$13$lambda$12$lambda$11(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->getListenerContainer$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->getUserClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;->onClick(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_0
    const-string p0, "simpleChannelListView"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->errorEventHandler$lambda$1(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V

    return-void
.end method

.method private static final defaultChildLayoutParams_delegate$lambda$15()Landroid/widget/FrameLayout$LayoutParams;
    .locals 3

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    const/16 v2, 0x11

    invoke-direct {v0, v1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    return-object v0
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListItemPredicate$lambda$0(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z

    return-void
.end method

.method private static final errorEventHandler$lambda$1(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V
    .locals 1

    const-string v0, "errorEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;

    if-eqz v0, :cond_0

    sget p1, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_error_delete_channel:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;

    if-eqz p1, :cond_1

    sget p1, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_error_leave_channel:I

    :goto_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->showToast(Landroid/view/View;I)V

    return-void

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->configureDefaultMoreOptionsListener$lambda$14$lambda$13$lambda$12$lambda$10(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Member;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->configureDefaultMoreOptionsListener$lambda$14$lambda$13$lambda$12$lambda$11(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Member;)V

    return-void
.end method

.method private final getLayoutManager()Landroidx/recyclerview/widget/u1;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "simpleChannelListView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-object v1
.end method

.method public static synthetic h()Landroid/widget/FrameLayout$LayoutParams;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->defaultChildLayoutParams_delegate$lambda$15()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method private final hideEmptyStateView()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->emptyStateView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "emptyStateView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final init(Landroid/util/AttributeSet;I)V
    .locals 5

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    const/4 v1, 0x0

    const-string v3, "style"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getBackgroundColor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->actionDialogStyle:Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v4, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iget p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->CHANNEL_LIST_VIEW_ID:I

    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setChannelListViewStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p2, -0x1

    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getEmptyStateView()I

    move-result p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->emptyStateView:Landroid/view/View;

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getLoadingView()I

    move-result v1

    invoke-virtual {p1, v1, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->loadingView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->configureDefaultMoreOptionsListener(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final restoreLayoutManagerState()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->layoutManagerState:Landroid/os/Parcelable;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->layoutManagerState:Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/u1;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->layoutManagerState:Landroid/os/Parcelable;

    :cond_1
    return-void
.end method

.method private static final setChannels$lambda$9(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->restoreLayoutManagerState()V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListUpdateListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;->onChannelListUpdate(Ljava/util/List;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic setEmptyStateView$default(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;

    invoke-static {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;->access$getDefaultChildLayoutParams(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setEmptyStateView(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method public static synthetic setLoadingView$default(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;

    invoke-static {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;->access$getDefaultChildLayoutParams(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setLoadingView(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private final showEmptyStateView()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->emptyStateView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "emptyStateView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 2

    .line 3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    instance-of v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "simpleChannelListView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final hasChannels()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->hasChannels()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "simpleChannelListView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final hideLoadingView()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->loadingView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "loadingView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final isAdapterInitialized()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->isAdapterInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_0
    const-string v0, "simpleChannelListView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroid/os/Bundle;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "scroll_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->layoutManagerState:Landroid/os/Parcelable;

    const-string v0, "super_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "super_state"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Ll83/k;

    const-string v3, "scroll_state"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final setChannelDeleteClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setChannelDeleteClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setChannelInfoClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelInfoListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    return-void
.end method

.method public final setChannelItemClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setChannelClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setChannelLeaveClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelLeaveListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    return-void
.end method

.method public final setChannelListItemPredicate(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;)V
    .locals 1

    const-string v0, "channelListItemPredicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListItemPredicate:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->currentChannelItemList$stream_chat_android_ui_components_release()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannels(Ljava/util/List;)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setChannelListUpdateListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListUpdateListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;

    return-void
.end method

.method public final setChannelLongClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setChannelLongClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setChannels(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->channelListItemPredicate:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    invoke-interface {v0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;->predicate(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->showEmptyStateView()V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->hideEmptyStateView()V

    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz p1, :cond_2

    new-instance v0, Li01/d;

    const/16 v2, 0x10

    invoke-direct {v0, v2, p0, v1}, Li01/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setChannels(Ljava/util/List;Lc93/a;)V

    return-void

    :cond_2
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setDeleteOptionIconProvider(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "getDeleteOptionIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionIconProvider$0;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionIconProvider$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setDeleteOptionIconProvider(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setEmptyStateView(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setEmptyStateView$default(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setEmptyStateView(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->emptyStateView:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->emptyStateView:Landroid/view/View;

    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 5
    :cond_0
    const-string p1, "emptyStateView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setErrorEventHandler(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->errorEventHandler:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;

    return-void
.end method

.method public final setIsDeleteOptionVisible(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "isDeleteOptionVisible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionVisibilityPredicate$0;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionVisibilityPredicate$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setIsDeleteOptionVisible(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setIsMoreOptionsVisible(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "isMoreOptionsVisible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionVisibilityPredicate$0;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionVisibilityPredicate$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setIsMoreOptionsVisible(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setItemSeparator(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setItemSeparator(I)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setItemSeparatorHeight(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setItemSeparatorHeight(I)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setLoadingView(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setLoadingView$default(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setLoadingView(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->loadingView:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->loadingView:Landroid/view/View;

    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 5
    :cond_0
    const-string p1, "loadingView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setMoreOptionsClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setMoreOptionsClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setMoreOptionsIconProvider(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "getMoreOptionsIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionIconProvider$0;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$sam$io_getstream_chat_android_ui_feature_channels_list_ChannelListView_ChannelOptionIconProvider$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setMoreOptionsIconProvider(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setOnEndReachedListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setOnEndReachedListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setPaginationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setPaginationEnabled(Z)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setShouldDrawItemSeparatorOnLastItem(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setShouldDrawItemSeparatorOnLastItem(Z)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setSwipeListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setSwipeListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setUserClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setUserClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setViewHolderFactory(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V
    .locals 1

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->simpleChannelListView:Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->setViewHolderFactory(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V

    return-void

    :cond_0
    const-string p1, "simpleChannelListView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final showError(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V
    .locals 1

    const-string v0, "errorEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->errorEventHandler:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;->onErrorEvent(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V

    return-void
.end method

.method public final showLoadingView()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->hideEmptyStateView()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->loadingView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "loadingView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
