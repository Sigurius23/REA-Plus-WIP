.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001:\u0001&B=\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rB[\u0008\u0017\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\u0013Bw\u0008\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0016\u0008\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\u001aJ\'\u0010\u001f\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u001c*\u00020\u001b2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;",
        "Landroidx/lifecycle/a2;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;",
        "mode",
        "",
        "limit",
        "messageLimit",
        "memberLimit",
        "",
        "isDraftMessagesEnabled",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "chatEventHandlerFactory",
        "<init>",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "sort",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V",
        "",
        "predefinedFilterName",
        "",
        "",
        "filterValues",
        "sortValues",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V",
        "Landroidx/lifecycle/w1;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;",
        "I",
        "Ljava/lang/Integer;",
        "Z",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "Builder",
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
.field private final chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

.field private final isDraftMessagesEnabled:Z

.field private final limit:I

.field private final memberLimit:Ljava/lang/Integer;

.field private final messageLimit:Ljava/lang/Integer;

.field private final mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;)V
    .locals 10

    .line 2
    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    .line 3
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;I)V"
        }
    .end annotation

    .line 4
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;I",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 5
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x70

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 6
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z)V"
        }
    .end annotation

    .line 7
    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            ")V"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    .line 26
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    move-object p1, p0

    .line 27
    invoke-direct/range {p1 .. p7}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 22
    sget-object p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const/16 p3, 0x1e

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    .line 23
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDraftMessagesEnabled()Z

    move-result p6

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    .line 24
    new-instance p7, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 p8, 0x1

    invoke-direct {p7, v0, p8, v0}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 25
    invoke-direct/range {p1 .. p8}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-void
.end method

.method private constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    .line 17
    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->limit:I

    .line 18
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->messageLimit:Ljava/lang/Integer;

    .line 19
    iput-object p4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->memberLimit:Ljava/lang/Integer;

    .line 20
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->isDraftMessagesEnabled:Z

    .line 21
    iput-object p6, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 12

    .line 8
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xfe

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 9
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xfc

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 10
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xf8

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    .line 11
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xf0

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 12
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 13
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z)V"
        }
    .end annotation

    .line 14
    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Z",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            ")V"
        }
    .end annotation

    const-string v0, "predefinedFilterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    .line 31
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;

    invoke-direct {p2, p1, v0, p3}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    move-object p1, p0

    move p3, p4

    move-object p4, p5

    move-object p5, p6

    move p6, p7

    move-object p7, p8

    .line 32
    invoke-direct/range {p1 .. p7}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_2

    const/16 p4, 0x1e

    :cond_2
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_5

    .line 28
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDraftMessagesEnabled()Z

    move-result p7

    :cond_5
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_6

    .line 29
    new-instance p8, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 p9, 0x1

    invoke-direct {p8, v0, p9, v0}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 30
    invoke-direct/range {p1 .. p9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-void
.end method


# virtual methods
.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Lj93/d;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-class v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    .line 6
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->mode:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;

    .line 7
    iget v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->limit:I

    .line 8
    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->messageLimit:Ljava/lang/Integer;

    .line 9
    iget-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->memberLimit:Ljava/lang/Integer;

    .line 10
    iget-boolean v5, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->isDraftMessagesEnabled:Z

    .line 11
    iget-object v6, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    .line 12
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v7

    .line 13
    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;

    move-result-object v8

    .line 14
    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-object v0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ChannelListViewModelFactory can only create instances of ChannelListViewModel"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
