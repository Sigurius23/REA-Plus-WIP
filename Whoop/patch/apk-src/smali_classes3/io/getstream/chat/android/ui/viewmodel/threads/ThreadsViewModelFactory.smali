.class public final Lio/getstream/chat/android/ui/viewmodel/threads/ThreadsViewModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\n\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0007*\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/threads/ThreadsViewModelFactory;",
        "Landroidx/lifecycle/a2;",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "query",
        "<init>",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)V",
        "Landroidx/lifecycle/w1;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
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
.field private final query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadsViewModelFactory;->query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

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
    .locals 7
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
    const-class v0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadsViewModelFactory;->query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;-><init>(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;-><init>(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;)V

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ThreadsViewModelFactory can only create instances of ThreadListViewModel"

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
