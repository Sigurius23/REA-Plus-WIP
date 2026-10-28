.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00002\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\'R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\'R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010)R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010*R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "(Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "sort",
        "(Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "",
        "name",
        "predefinedFilter",
        "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "",
        "values",
        "filterValues",
        "(Ljava/util/Map;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "sortValues",
        "",
        "limit",
        "(I)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "messageLimit",
        "(Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "memberLimit",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "chatEventHandlerFactory",
        "(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "",
        "isDraftMessagesEnabled",
        "(Z)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;",
        "Landroidx/lifecycle/a2;",
        "build",
        "()Landroidx/lifecycle/a2;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "predefinedFilterName",
        "Ljava/lang/String;",
        "Ljava/util/Map;",
        "I",
        "Ljava/lang/Integer;",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "Z",
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
.field private chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

.field private filter:Lio/getstream/chat/android/models/FilterObject;

.field private filterValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private isDraftMessagesEnabled:Z

.field private limit:I

.field private memberLimit:Ljava/lang/Integer;

.field private messageLimit:Ljava/lang/Integer;

.field private predefinedFilterName:Ljava/lang/String;

.field private sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field private sortValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    const/16 v0, 0x1e

    iput v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->limit:I

    new-instance v0, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDraftMessagesEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->isDraftMessagesEnabled:Z

    return-void
.end method


# virtual methods
.method public final build()Landroidx/lifecycle/a2;
    .locals 10

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->predefinedFilterName:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->filter:Lio/getstream/chat/android/models/FilterObject;

    if-nez v0, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->filterValues:Ljava/util/Map;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->sortValues:Ljava/util/Map;

    iget v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->limit:I

    iget-object v5, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->messageLimit:Ljava/lang/Integer;

    iget-object v6, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->memberLimit:Ljava/lang/Integer;

    iget-object v8, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->isDraftMessagesEnabled:Z

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ChannelListViewModelFactory.Builder: filter() and predefinedFilter() are mutually exclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget v5, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->limit:I

    iget-object v6, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->messageLimit:Ljava/lang/Integer;

    iget-object v7, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->memberLimit:Ljava/lang/Integer;

    iget-object v9, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->isDraftMessagesEnabled:Z

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;

    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-object v2
.end method

.method public final chatEventHandlerFactory(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 1

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    return-object p0
.end method

.method public final filter(Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 1

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object p0
.end method

.method public final filterValues(Ljava/util/Map;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;"
        }
    .end annotation

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->filterValues:Ljava/util/Map;

    return-object p0
.end method

.method public final isDraftMessagesEnabled(Z)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->isDraftMessagesEnabled:Z

    return-object p0
.end method

.method public final limit(I)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->limit:I

    return-object p0
.end method

.method public final memberLimit(Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->memberLimit:Ljava/lang/Integer;

    return-object p0
.end method

.method public final messageLimit(Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->messageLimit:Ljava/lang/Integer;

    return-object p0
.end method

.method public final predefinedFilter(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->predefinedFilterName:Ljava/lang/String;

    return-object p0
.end method

.method public final sort(Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object p0
.end method

.method public final sortValues(Ljava/util/Map;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;"
        }
    .end annotation

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;->sortValues:Ljava/util/Map;

    return-object p0
.end method
