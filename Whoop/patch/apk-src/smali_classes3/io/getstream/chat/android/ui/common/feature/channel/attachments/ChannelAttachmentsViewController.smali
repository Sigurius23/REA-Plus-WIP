.class public final Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010\"R\u001a\u00102\u001a\u0008\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u001d\u00105\u001a\u0008\u0012\u0004\u0012\u000201048\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u0002090,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010.R\u001d\u0010<\u001a\u0008\u0012\u0004\u0012\u0002090;8\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\u00a8\u0006@"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;",
        "",
        "",
        "cid",
        "",
        "attachmentTypes",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "",
        "localFilter",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/SearchMessagesResult;",
        "searchAttachments",
        "(Lq83/d;)Ljava/lang/Object;",
        "result",
        "Ll83/a0;",
        "onSuccessResult",
        "(Lio/getstream/chat/android/models/SearchMessagesResult;)V",
        "Ln23/e;",
        "error",
        "onFailureResult",
        "(Ln23/e;)V",
        "loadMore",
        "()V",
        "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;",
        "action",
        "onViewAction",
        "(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V",
        "Ljava/lang/String;",
        "Ljava/util/List;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/o1;",
        "loadRequests",
        "Lec3/o1;",
        "nextPage",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent;",
        "_events",
        "Lec3/t1;",
        "events",
        "Lec3/t1;",
        "getEvents",
        "()Lec3/t1;",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final _events:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final attachmentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final events:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final loadRequests:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
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

.field private final logger$delegate:Ll83/h;

.field private nextPage:Ljava/lang/String;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->cid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->attachmentTypes:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->localFilter:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    const-string p1, "Chat:ChannelAttachmentsViewController"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->logger$delegate:Ll83/h;

    const/4 p1, 0x0

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x5

    .line 7
    invoke-static {p1, p2, p3, p4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->loadRequests:Lec3/o1;

    .line 8
    sget-object v1, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Loading;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Loading;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_state:Lec3/p1;

    .line 9
    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->state:Lec3/f2;

    .line 10
    invoke-static {p1, p2, p3, p4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_events:Lec3/o1;

    .line 11
    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->events:Lec3/t1;

    .line 12
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$2;

    const/4 p2, 0x2

    .line 13
    invoke-direct {p1, p2, p3}, Ls83/i;-><init>(ILq83/d;)V

    .line 14
    new-instance p2, Lec3/a0;

    invoke-direct {p2, p1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 15
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$special$$inlined$flatMapLatest$1;

    invoke-direct {p1, p3, p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;)V

    invoke-static {p2, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    .line 16
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Lq83/d;)V

    .line 17
    new-instance p3, Lec3/j1;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 18
    invoke-static {p3, p5}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 19
    new-instance p3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p7, 0xe

    invoke-direct {p3, p7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 20
    sget-object p3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p4

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 21
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_init_$lambda$0(Lio/getstream/chat/android/models/Attachment;)Z

    return-void
.end method

.method public static final synthetic access$onFailureResult(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Ln23/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->onFailureResult(Ln23/e;)V

    return-void
.end method

.method public static final synthetic access$onSuccessResult(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Lio/getstream/chat/android/models/SearchMessagesResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->onSuccessResult(Lio/getstream/chat/android/models/SearchMessagesResult;)V

    return-void
.end method

.method public static final synthetic access$searchAttachments(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->searchAttachments(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final loadMore()V
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->state:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->getCanLoadMore()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] no more attachments to load"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] already loading more attachments"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] no args"

    invoke-interface {v0, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_state:Lec3/p1;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static/range {v3 .. v8}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;Ljava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    move-result-object v1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->loadRequests:Lec3/o1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadMore] current state is not Content, cannot load more attachments"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method

.method private final onFailureResult(Ln23/e;)V
    .locals 12

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[onFailureResult] error: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_state:Lec3/p1;

    :cond_1
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;

    instance-of v4, v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Loading;

    if-eqz v4, :cond_2

    new-instance v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Error;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Error;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v4, v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    if-eqz v4, :cond_3

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_events:Lec3/o1;

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent$LoadMoreError;

    invoke-direct {v5, p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent$LoadMoreError;-><init>(Ln23/e;)V

    invoke-interface {v4, v5}, Lec3/o1;->a(Ljava/lang/Object;)Z

    move-object v6, v3

    check-cast v6, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;Ljava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void
.end method

.method private final onSuccessResult(Lio/getstream/chat/android/models/SearchMessagesResult;)V
    .locals 7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/SearchMessagesResult;->getNext()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->nextPage:Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/SearchMessagesResult;->getMessages()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->localFilter:Lkotlin/jvm/functions/Function1;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    new-instance v5, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;

    invoke-direct {v5, v1, v4}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->nextPage:Ljava/lang/String;

    const-string v5, "[onSuccessResult] items: "

    const-string v6, ", next: "

    invoke-static {v1, v5, v6, v4}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {p1, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->_state:Lec3/p1;

    :cond_5
    move-object v1, p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;

    instance-of v4, v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    if-eqz v4, :cond_6

    check-cast v3, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->getItems()Ljava/util/List;

    move-result-object v3

    goto :goto_3

    :cond_6
    sget-object v3, Lm83/y;->w:Lm83/y;

    :goto_3
    new-instance v4, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->nextPage:Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    move v5, v6

    :goto_4
    invoke-direct {v4, v3, v5, v6}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;-><init>(Ljava/util/List;ZZ)V

    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-void
.end method

.method private final searchAttachments(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->cid:Ljava/lang/String;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cid"

    invoke-static {v1, v0}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v3

    const-string v0, "attachments.type"

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->attachmentTypes:Ljava/util/List;

    invoke-static {v0, v1}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->nextPage:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[searchAttachments] filters: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " and "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", limit: 30, nextPage: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-interface {v0, v2, v5, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    new-instance v6, Ljava/lang/Integer;

    const/16 v0, 0x1e

    invoke-direct {v6, v0}, Ljava/lang/Integer;-><init>(I)V

    iget-object v7, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->nextPage:Ljava/lang/String;

    const/16 v9, 0x24

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lio/getstream/chat/android/client/ChatClient;->searchMessages$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Object;)Lo23/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getEvents()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->events:Lec3/t1;

    return-object v0
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->state:Lec3/f2;

    return-object v0
.end method

.method public final onViewAction(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction$LoadMoreRequested;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction$LoadMoreRequested;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->loadMore()V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
