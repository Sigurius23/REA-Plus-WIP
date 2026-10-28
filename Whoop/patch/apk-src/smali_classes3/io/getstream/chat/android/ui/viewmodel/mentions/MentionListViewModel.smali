.class public final Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B/\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R#\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00180\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Message;",
        "sort",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;",
        "controllerProvider",
        "<init>",
        "(Lio/getstream/chat/android/models/querysort/QuerySorter;Lkotlin/jvm/functions/Function1;)V",
        "Ll83/a0;",
        "loadMore",
        "()V",
        "controller$delegate",
        "Ll83/h;",
        "getController",
        "()Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;",
        "controller",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/client/api/state/Event;",
        "errorEvents",
        "getErrorEvents",
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
.field private final controller$delegate:Ll83/h;

.field private final errorEvents:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;-><init>(Lio/getstream/chat/android/models/querysort/QuerySorter;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/querysort/QuerySorter;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string p1, "controllerProvider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 5
    new-instance p1, Li01/d;

    const/16 v0, 0x14

    invoke-direct {p1, p2, p0, v0}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->controller$delegate:Ll83/h;

    .line 6
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getState()Lec3/f2;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x3

    invoke-static {p1, p2, v0}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->state:Landroidx/lifecycle/p0;

    .line 7
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->getEvents()Lec3/t1;

    move-result-object p1

    .line 8
    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel$special$$inlined$map$1;-><init>(Lec3/l;)V

    .line 9
    invoke-static {v1, p2, v0}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/querysort/QuerySorter;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 2
    new-instance p2, Lhb2/c;

    const/16 p3, 0x1c

    invoke-direct {p2, p1, p3}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;-><init>(Lio/getstream/chat/android/models/querysort/QuerySorter;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/models/querysort/QuerySorter;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    invoke-static {p1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;-><init>(Lbc3/c0;Lio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final controller_delegate$lambda$1(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;)Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/models/querysort/QuerySorter;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->_init_$lambda$0(Lio/getstream/chat/android/models/querysort/QuerySorter;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    move-result-object p0

    return-object p0
.end method

.method private final getController()Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->controller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    return-object v0
.end method


# virtual methods
.method public final getErrorEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final loadMore()V
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;->loadMore()V

    return-void
.end method
