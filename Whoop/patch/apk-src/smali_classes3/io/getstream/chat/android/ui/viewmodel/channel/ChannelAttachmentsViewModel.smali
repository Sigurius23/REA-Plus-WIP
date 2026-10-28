.class public final Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008#\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "",
        "attachmentTypes",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "",
        "localFilter",
        "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;",
        "controllerProvider",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;",
        "action",
        "Ll83/a0;",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V",
        "Ljava/lang/String;",
        "Ljava/util/List;",
        "Lkotlin/jvm/functions/Function1;",
        "controller$delegate",
        "Ll83/h;",
        "getController",
        "()Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;",
        "controller",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent;",
        "events",
        "getEvents",
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
.field private final attachmentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final cid:Ljava/lang/String;

.field private final controller$delegate:Ll83/h;

.field private final events:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final localFilter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
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
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 5
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->cid:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->attachmentTypes:Ljava/util/List;

    .line 7
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->localFilter:Lkotlin/jvm/functions/Function1;

    .line 8
    new-instance p1, Li;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p4, p0}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->controller$delegate:Ll83/h;

    .line 9
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getState()Lec3/f2;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p3, p2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->state:Landroidx/lifecycle/p0;

    .line 10
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getEvents()Lec3/t1;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p3, p2, p3}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt;->asSingleLiveEvent$default(Lec3/l;Lq83/j;ILjava/lang/Object;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->events:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 1
    new-instance p3, Lp;

    const/4 p6, 0x2

    invoke-direct {p3, p6}, Lp;-><init>(I)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 2
    new-instance p4, La23/a;

    invoke-direct {p4, p1, p2, p3}, La23/a;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final _init_$lambda$1(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    invoke-static {p3}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v6

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final controller_delegate$lambda$2(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;)Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->_init_$lambda$1(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    move-result-object p0

    return-object p0
.end method

.method private final getController()Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->controller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    return-object v0
.end method

.method public static synthetic j(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->_init_$lambda$0(Lio/getstream/chat/android/models/Attachment;)Z

    return-void
.end method


# virtual methods
.method public final getEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->events:Landroidx/lifecycle/p0;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->getController()Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V

    return-void
.end method
