.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;
.super Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 ^2\u00020\u0001:\u0001^Bs\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u001b\u0010&\u001a\u00020$*\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J%\u0010+\u001a\u00020\u001a*\u00020(2\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0013\u0010-\u001a\u00020\u001a*\u00020(H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\'\u00101\u001a\u00020\u001a*\u00020(2\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0008\u00100\u001a\u0004\u0018\u00010/H\u0002\u00a2\u0006\u0004\u00081\u00102J\u0013\u00103\u001a\u00020\u001a*\u00020(H\u0002\u00a2\u0006\u0004\u00083\u0010.J\u001d\u00104\u001a\u00020\u001a*\u00020(2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u0002\u00a2\u0006\u0004\u00084\u00105J\u001b\u00107\u001a\u00020\u001a*\u0002062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00087\u00108J\u001b\u00107\u001a\u00020\u001a*\u00020(2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00087\u00109J\u001f\u0010:\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016\u00a2\u0006\u0004\u0008=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016\u00a2\u0006\u0004\u0008@\u0010AJ\u000f\u0010B\u001a\u00020?H\u0016\u00a2\u0006\u0004\u0008B\u0010AJ\u000f\u0010C\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0015\u0010F\u001a\u0008\u0012\u0004\u0012\u00020?0EH\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010H\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008H\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010JR\u0014\u0010\u0008\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010IR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010KR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010NR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010NR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010OR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010OR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010PR\u0016\u0010R\u001a\u0004\u0018\u00010Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010W\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010]\u001a\u00020?8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010A\u00a8\u0006_"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;",
        "Landroid/view/ViewGroup;",
        "parent",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;",
        "channelClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;",
        "channelLongClickListener",
        "channelDeleteListener",
        "channelMoreOptionsListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;",
        "userClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "swipeListener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;",
        "isMoreOptionsVisible",
        "isDeleteOptionVisible",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;",
        "getMoreOptionsIcon",
        "getDeleteOptionIcon",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;)V",
        "Ll83/a0;",
        "configureBackground",
        "()V",
        "configureBackgroundButtons",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;",
        "diff",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;",
        "channelItem",
        "configureForeground",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V",
        "",
        "isAnonymousChannel",
        "channelNameLabelChanged",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Z)Z",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;",
        "Lio/getstream/chat/android/models/Message;",
        "lastMessage",
        "configureChannelNameLabel",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V",
        "configureAvatarView",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "draftMessage",
        "configureLastMessageLabelAndTimestamp",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/DraftMessage;)V",
        "configureUnreadCountBadge",
        "configureCurrentUserLastMessageStatus",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;",
        "applyStyle",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V",
        "Landroid/view/View;",
        "getSwipeView",
        "()Landroid/view/View;",
        "",
        "getOpenedX",
        "()F",
        "getClosedX",
        "isSwiped",
        "()Z",
        "Li93/f;",
        "getSwipeDeltaRange",
        "()Li93/f;",
        "isSwipeEnabled",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "",
        "optionsCount",
        "I",
        "menuItemWidth",
        "F",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "getOptionsMenuWidth",
        "optionsMenuWidth",
        "Companion",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

.field private channel:Lio/getstream/chat/android/models/Channel;

.field private final channelClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

.field private final channelDeleteListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

.field private final channelLongClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;

.field private final channelMoreOptionsListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

.field private final currentUser:Lio/getstream/chat/android/models/User;

.field private final getDeleteOptionIcon:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

.field private final getMoreOptionsIcon:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

.field private final isDeleteOptionVisible:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

.field private final isMoreOptionsVisible:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

.field private final menuItemWidth:F

.field private optionsCount:I

.field private final style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

.field private final swipeListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

.field private final userClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V
    .locals 17

    .line 1
    const-string v0, "parent"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelClickListener"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelLongClickListener"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelDeleteListener"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelMoreOptionsListener"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userClickListener"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "swipeListener"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isMoreOptionsVisible"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isDeleteOptionVisible"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getMoreOptionsIcon"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDeleteOptionIcon"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x1000

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v16}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelClickListener"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelLongClickListener"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelDeleteListener"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelMoreOptionsListener"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userClickListener"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "swipeListener"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p8, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isMoreOptionsVisible"

    invoke-static {p9, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isDeleteOptionVisible"

    invoke-static {p10, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getMoreOptionsIcon"

    invoke-static {p11, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getDeleteOptionIcon"

    invoke-static {p12, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p13, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p13}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 7
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    .line 8
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelLongClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;

    .line 9
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelDeleteListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    .line 10
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelMoreOptionsListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    .line 11
    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->userClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;

    .line 12
    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->swipeListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    .line 13
    iput-object p8, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    .line 14
    iput-object p9, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->isMoreOptionsVisible:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

    .line 15
    iput-object p10, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->isDeleteOptionVisible:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

    .line 16
    iput-object p11, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getMoreOptionsIcon:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    .line 17
    iput-object p12, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getDeleteOptionIcon:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    .line 18
    iput-object p13, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    .line 19
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->currentUser:Lio/getstream/chat/android/models/User;

    const/4 p1, 0x1

    .line 20
    iput p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->optionsCount:I

    .line 21
    invoke-static {p0}, Lio/getstream/chat/android/ui/common/extensions/internal/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/o2;)Landroid/content/Context;

    move-result-object p1

    sget p2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_option_icon_width:I

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->menuItemWidth:F

    .line 22
    iget-object p1, p13, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->channelItemView:Landroid/widget/FrameLayout;

    const-string p2, "channelItemView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 24
    invoke-virtual {p8}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemHeight()I

    move-result p3

    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    iget-object p1, p13, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemBackgroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;

    .line 27
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->moreOptionsImageView:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->deleteImageView:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    invoke-direct {p0, p1, p8}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V

    .line 30
    iget-object p1, p13, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemForegroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    .line 31
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;

    const/4 p4, 0x2

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    .line 33
    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;

    const/4 p4, 0x3

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 35
    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$lambda$11$lambda$10$lambda$9$$inlined$doOnNextLayout$1;

    invoke-direct {p3, p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$lambda$11$lambda$10$lambda$9$$inlined$doOnNextLayout$1;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V

    .line 36
    invoke-virtual {p2, p3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 37
    invoke-direct {p0, p1, p8}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V

    return-void

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p14

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_0

    .line 2
    invoke-static/range {p1 .. p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v3, p1

    .line 3
    invoke-static {v0, v3, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    move-result-object v0

    move-object v15, v0

    :goto_0
    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    goto :goto_1

    :cond_0
    move-object/from16 v3, p1

    move-object/from16 v15, p13

    goto :goto_0

    .line 4
    :goto_1
    invoke-direct/range {v2 .. v15}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;)V

    return-void
.end method

.method public static final synthetic access$getCompanion$p()Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;

    return-object v0
.end method

.method public static final synthetic access$getSwipeListener$p(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->swipeListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    return-object p0
.end method

.method private final applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getBackgroundLayoutColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->backgroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getBackgroundLayoutColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->backgroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "backgroundView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemHeight()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->deleteImageView:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getDeleteIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->moreOptionsImageView:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getOptionsIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V
    .locals 8

    .line 10
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->foregroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getForegroundLayoutColor()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 11
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->foregroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "foregroundView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    if-eqz v1, :cond_5

    .line 13
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemHeight()I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    const-string v1, "channelNameLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getChannelTitleText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v3

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 16
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->draftMessageLabel:Landroid/widget/TextView;

    const-string v3, "draftMessageLabel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getDraftMessageLabel()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v3

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 17
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageLabel:Landroid/widget/TextView;

    const-string v3, "lastMessageLabel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getLastMessageText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v3

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 18
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageTimeLabel:Landroid/widget/TextView;

    const-string v3, "lastMessageTimeLabel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getLastMessageDateText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v4

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 19
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->unreadCountBadge:Landroid/widget/TextView;

    const-string v4, "unreadCountBadge"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getUnreadMessageCounterText()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v5

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 20
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->unreadCountBadge:Landroid/widget/TextView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getUnreadMessageCounterBackgroundColor()I

    move-result v5

    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 21
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->muteIcon:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getMutedChannelIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    const-string v5, "channelAvatarView"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v5, :cond_4

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 24
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemMarginStart()I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 25
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageTimeLabel:Landroid/widget/TextView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 28
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemMarginEnd()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 29
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->unreadCountBadge:Landroid/widget/TextView;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemMarginEnd()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 33
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 36
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemTitleMarginStart()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->spacer:Landroid/view/View;

    const-string v1, "spacer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 40
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemVerticalSpacerHeight()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->guideline:Landroidx/constraintlayout/widget/Guideline;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getItemVerticalSpacerPosition()F

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/widget/Guideline;->setGuidelinePercent(F)V

    return-void

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 47
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->lambda$11$lambda$10$lambda$9$lambda$7(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->lambda$11$lambda$3$lambda$1(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final channelNameLabelChanged(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Z)Z
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getNameChanged()Z

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getTypingUsersChanged()Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getLastMessageChanged()Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getUsersChanged()Z

    move-result v1

    and-int/2addr p2, v1

    or-int/2addr p2, v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getDraftMessageChanged()Z

    move-result p1

    or-int/2addr p1, p2

    return p1
.end method

.method private final configureAvatarView(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V
    .locals 3

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->setChannel$default(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final configureBackground()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureBackgroundButtons()V

    return-void
.end method

.method private final configureBackgroundButtons()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemBackgroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->moreOptionsImageView:Landroid/widget/ImageView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getOptionsEnabled()Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    const-string v4, "channel"

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->isMoreOptionsVisible:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v6, :cond_2

    invoke-interface {v1, v6}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;->invoke(Lio/getstream/chat/android/models/Channel;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getMoreOptionsIcon:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v6, :cond_1

    invoke-interface {v1, v6}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->invoke(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    move v0, v5

    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemBackgroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->deleteImageView:Landroid/widget/ImageView;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getDeleteEnabled()Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->isDeleteOptionVisible:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v7, :cond_6

    invoke-interface {v6, v7}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;->invoke(Lio/getstream/chat/android/models/Channel;)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getDeleteOptionIcon:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v5, :cond_5

    invoke-interface {v3, v5}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->invoke(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    iput v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->optionsCount:I

    return-void
.end method

.method private final configureChannelNameLabel(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V
    .locals 4

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v2, :cond_3

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v3

    invoke-interface {v3}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez p2, :cond_2

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getTypingUsers()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    const-string p3, "channelNameLabel"

    if-lez p2, :cond_1

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->foregroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string p3, "foregroundView"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;->access$yDiffBetweenCenters(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;Landroid/view/View;Landroid/view/View;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_1
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;

    invoke-direct {p3, p2, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1;-><init>(Landroid/view/View;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V

    invoke-static {p2, p3}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_3
    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final configureCurrentUserLastMessageStatus(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;)V
    .locals 8

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->messageStatusImageView:Landroid/widget/ImageView;

    const-string v1, "messageStatusImageView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getShowChannelDeliveryStatusIndicator()Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const/16 v4, 0x8

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    if-eqz p2, :cond_c

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getShowChannelDeliveryStatusIndicator()Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->currentUser:Lio/getstream/chat/android/models/User;

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v5

    :goto_2
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->messageStatusImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_4
    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v3, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v6, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    filled-new-array {v0, v3, v6}, [Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    const-string v6, "channel"

    if-eqz v3, :cond_b

    invoke-static {v3, p2}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->readCount(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)I

    move-result v3

    if-eqz v0, :cond_5

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getIndicatorPendingSyncIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_4

    :cond_5
    if-lez v3, :cond_6

    move v0, v1

    goto :goto_3

    :cond_6
    move v0, v2

    :goto_3
    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v7, :cond_a

    invoke-static {v7, p2}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->deliveredReadsOf(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz v0, :cond_7

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getIndicatorReadIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_4

    :cond_7
    if-nez p2, :cond_8

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getIndicatorDeliveredIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getIndicatorSentIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :goto_4
    const-string v0, "readCountView"

    if-le v3, v1, :cond_9

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getReadCountEnabled()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->readCountView:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->readCountView:Landroid/widget/TextView;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_9
    iget-object v1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->readCountView:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->messageStatusImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_a
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_b
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_c
    :goto_6
    return-void
.end method

.method private final configureForeground(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemForegroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->getLastMessage(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    invoke-static {v2}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->isAnonymousChannel(Lio/getstream/chat/android/models/Channel;)Z

    move-result v2

    invoke-direct {p0, p1, v2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelNameLabelChanged(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, v0, v1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureChannelNameLabel(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getAvatarViewChanged()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureAvatarView(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getLastMessageChanged()Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getTypingUsersChanged()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getDraftMessageChanged()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_2
    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageLabel:Landroid/widget/TextView;

    const-string v5, "lastMessageLabel"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getTypingUsers()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v1, :cond_3

    move v7, v6

    goto :goto_0

    :cond_3
    move v7, v4

    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v8

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_1

    :cond_4
    move v8, v4

    :goto_1
    or-int/2addr v7, v8

    and-int/2addr v5, v7

    if-eqz v5, :cond_5

    move v5, v4

    goto :goto_2

    :cond_5
    move v5, v3

    :goto_2
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->draftMessageLabel:Landroid/widget/TextView;

    const-string v5, "draftMessageLabel"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v5

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    move v6, v4

    :goto_3
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getTypingUsers()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    and-int/2addr v5, v6

    if-eqz v5, :cond_7

    move v5, v4

    goto :goto_4

    :cond_7
    move v5, v3

    :goto_4
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureLastMessageLabelAndTimestamp(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/DraftMessage;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->typingIndicatorView:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getTypingUsers()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->setTypingUsers(Ljava/util/List;)V

    :cond_8
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getReadStateChanged()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getLastMessageChanged()Z

    move-result v2

    if-eqz v2, :cond_a

    :cond_9
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureCurrentUserLastMessageStatus(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;)V

    :cond_a
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->getUnreadCountChanged()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureUnreadCountBadge(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V

    :cond_b
    iget-object p1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->muteIcon:Landroid/widget/ImageView;

    const-string v0, "muteIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p2

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->isMuted(Lio/getstream/chat/android/models/Channel;)Z

    move-result p2

    if-eqz p2, :cond_c

    move v3, v4

    :cond_c
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final configureLastMessageLabelAndTimestamp(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/DraftMessage;)V
    .locals 5

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageTimeLabel:Landroid/widget/TextView;

    const-string v1, "lastMessageTimeLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageTimeLabel:Landroid/widget/TextView;

    const-string v1, ""

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    if-eqz p3, :cond_3

    move-object v3, v2

    goto :goto_3

    :cond_3
    move-object v3, p2

    :goto_3
    if-eqz v3, :cond_4

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v3

    invoke-static {p2}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v4

    invoke-interface {v3, v4}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    move-object v3, v1

    :goto_4
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageLabel:Landroid/widget/TextView;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lio/getstream/chat/android/models/DraftMessage;->getText()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_5

    move-object v1, p3

    goto :goto_5

    :cond_5
    if-eqz p2, :cond_7

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getMessagePreviewFormatter()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;

    move-result-object p3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v0, :cond_6

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-interface {p3, v0, p2, v1}, Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;->formatMessagePreview(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_5

    :cond_6
    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    :goto_5
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final configureUnreadCountBadge(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->currentUserUnreadCount$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->unreadCountBadge:Landroid/widget/TextView;

    const-string v4, "unreadCountBadge"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    if-nez v2, :cond_2

    return-void

    :cond_2
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->unreadCountBadge:Landroid/widget/TextView;

    const/16 v1, 0x63

    if-le v0, v1, :cond_3

    const-string v0, "99+"

    goto :goto_2

    :cond_3
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->lambda$11$lambda$10$lambda$9$lambda$6(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->lambda$11$lambda$10$lambda$5(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->lambda$11$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final getOptionsMenuWidth()F
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->menuItemWidth:F

    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->optionsCount:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method

.method private static final lambda$11$lambda$10$lambda$5(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 5

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    const-string v0, "channel"

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Member;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->currentUser:Lio/getstream/chat/android/models/User;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Member;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->userClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;->onClick(Lio/getstream/chat/android/models/User;)V

    :cond_3
    return-void

    :cond_4
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz p0, :cond_6

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_6
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final lambda$11$lambda$10$lambda$9$lambda$6(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwiping()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_0
    const-string p0, "channel"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method private static final lambda$11$lambda$10$lambda$9$lambda$7(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwiping()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelLongClickListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;->onLongClick(Lio/getstream/chat/android/models/Channel;)Z

    move-result p0

    return p0

    :cond_0
    const-string p0, "channel"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final lambda$11$lambda$3$lambda$1(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 8

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelMoreOptionsListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->swipeListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeCanceled$default(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    return-void

    :cond_0
    const-string p0, "channel"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final lambda$11$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channelDeleteListener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;->onClick(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_0
    const-string p0, "channel"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V
    .locals 1

    const-string v0, "channelItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureForeground(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->configureBackgroundButtons()V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result p2

    invoke-interface {p1, p0, p2}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onRestoreSwipePosition(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V

    :cond_0
    return-void
.end method

.method public final getClosedX()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getOpenedX()F
    .locals 1

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/extensions/internal/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/o2;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getOptionsMenuWidth()F

    move-result v0

    return v0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getOptionsMenuWidth()F

    move-result v0

    neg-float v0, v0

    return v0
.end method

.method public final getSwipeDeltaRange()Li93/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li93/f;"
        }
    .end annotation

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/extensions/internal/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/o2;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getOpenedX()F

    move-result v0

    new-instance v2, Li93/e;

    invoke-direct {v2, v1, v0}, Li93/e;-><init>(FF)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getOpenedX()F

    move-result v0

    new-instance v2, Li93/e;

    invoke-direct {v2, v0, v1}, Li93/e;-><init>(FF)V

    return-object v2
.end method

.method public final getSwipeView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemForegroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isSwipeEnabled()Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->optionsCount:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;->getSwipeEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSwiped()Z
    .locals 2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getOpenedX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
