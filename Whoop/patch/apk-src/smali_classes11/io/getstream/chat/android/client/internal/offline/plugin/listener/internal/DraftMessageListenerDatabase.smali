.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J6\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\r2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJF\u0010\u001a\u001a\u00020\r2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0016\u001a\u0004\u0018\u00010\t2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "result",
        "",
        "channelType",
        "channelId",
        "message",
        "Ll83/a0;",
        "onCreateDraftMessageResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "onDeleteDraftMessagesResult",
        "Lio/getstream/chat/android/models/QueryDraftsResult;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "",
        "limit",
        "next",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/DraftsSort;",
        "sort",
        "onQueryDraftMessagesResult",
        "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "stream-chat-android-client_release"
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
.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V
    .locals 1

    const-string v0, "messageRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-void
.end method

.method public static final synthetic access$getMessageRepository$p(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    return-object p0
.end method


# virtual methods
.method public final onCreateDraftMessageResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p5, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;

    if-eqz p2, :cond_0

    move-object p2, p5

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;

    iget p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->label:I

    const/high16 v0, -0x80000000

    and-int v1, p3, v0

    if-eqz v1, :cond_0

    sub-int/2addr p3, v0

    iput p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;

    invoke-direct {p2, p0, p5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->result:Ljava/lang/Object;

    sget-object p5, Lr83/a;->w:Lr83/a;

    iget v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->label:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-ne v0, v1, :cond_1

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$9:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$8:Ljava/lang/Object;

    check-cast p1, Ln23/e;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$8:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$4:Ljava/lang/Object;

    check-cast p4, Ln23/h;

    iget-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$3:Ljava/lang/Object;

    check-cast p4, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_4

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p3, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$2:Ljava/lang/Object;

    iput-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$3:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$5:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$6:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$7:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$8:Ljava/lang/Object;

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$0:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$1:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$2:I

    iput v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->label:I

    invoke-interface {v0, p3, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, p5, :cond_5

    goto :goto_3

    :cond_4
    instance-of p3, p1, Ln23/f;

    if-eqz p3, :cond_9

    :cond_5
    :goto_1
    instance-of p3, p1, Ln23/g;

    if-nez p3, :cond_8

    instance-of p3, p1, Ln23/f;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, Ln23/f;

    iget-object p3, p3, Ln23/f;->a:Ln23/e;

    invoke-static {p3}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result p3

    if-nez p3, :cond_6

    goto :goto_2

    :cond_6
    move-object p4, v4

    :goto_2
    if-eqz p4, :cond_8

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$2:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$3:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$5:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$6:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$7:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$8:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->L$9:Ljava/lang/Object;

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$0:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$1:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$2:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->I$3:I

    iput v1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onCreateDraftMessageResult$1;->label:I

    invoke-interface {p3, p4, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_8

    :goto_3
    return-object p5

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onDeleteDraftMessagesResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p5, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;

    if-eqz p2, :cond_0

    move-object p2, p5

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;

    iget p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->label:I

    const/high16 v0, -0x80000000

    and-int v1, p3, v0

    if-eqz v1, :cond_0

    sub-int/2addr p3, v0

    iput p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;

    invoke-direct {p2, p0, p5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->result:Ljava/lang/Object;

    sget-object p5, Lr83/a;->w:Lr83/a;

    iget v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->label:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-ne v0, v1, :cond_1

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$9:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$8:Ljava/lang/Object;

    check-cast p1, Ln23/e;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$8:Ljava/lang/Object;

    check-cast p1, Ll83/a0;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$7:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$4:Ljava/lang/Object;

    check-cast p4, Ln23/h;

    iget-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$3:Ljava/lang/Object;

    check-cast p4, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_4

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p3, Ll83/a0;

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$2:Ljava/lang/Object;

    iput-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$3:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$5:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$6:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$7:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$8:Ljava/lang/Object;

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$0:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$1:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$2:I

    iput v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->label:I

    invoke-interface {p3, p4, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, p5, :cond_5

    goto :goto_3

    :cond_4
    instance-of p3, p1, Ln23/f;

    if-eqz p3, :cond_9

    :cond_5
    :goto_1
    instance-of p3, p1, Ln23/g;

    if-nez p3, :cond_8

    instance-of p3, p1, Ln23/f;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, Ln23/f;

    iget-object p3, p3, Ln23/f;->a:Ln23/e;

    invoke-static {p3}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result p3

    if-nez p3, :cond_6

    goto :goto_2

    :cond_6
    move-object p4, v4

    :goto_2
    if-eqz p4, :cond_8

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$2:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$3:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$5:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$6:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$7:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$8:Ljava/lang/Object;

    iput-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->L$9:Ljava/lang/Object;

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$0:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$1:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$2:I

    iput v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->I$3:I

    iput v1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onDeleteDraftMessagesResult$1;->label:I

    invoke-interface {p3, p4, p2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_8

    :goto_3
    return-object p5

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;

    if-eqz p2, :cond_0

    move-object p2, p6

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;

    iget p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->label:I

    const/high16 p5, -0x80000000

    and-int v0, p4, p5

    if-eqz v0, :cond_0

    sub-int/2addr p4, p5

    iput p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;

    invoke-direct {p2, p0, p6}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->result:Ljava/lang/Object;

    sget-object p5, Lr83/a;->w:Lr83/a;

    iget p6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->label:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p6, :cond_2

    if-ne p6, v0, :cond_1

    iget p1, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$4:I

    iget p3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$3:I

    iget p6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$2:I

    iget v2, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$1:I

    iget v3, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$0:I

    iget-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$12:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v4, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$10:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$9:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$8:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/QueryDraftsResult;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$7:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$6:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v5, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ln23/h;

    iget-object v6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/FilterObject;

    iget-object v6, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ln23/h;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move p4, v3

    move v3, v2

    move v2, p6

    move p6, p3

    move-object p3, p2

    move p2, p1

    move-object p1, v5

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p4, p1, Ln23/g;

    if-eqz p4, :cond_4

    move-object p4, p1

    check-cast p4, Ln23/g;

    iget-object p4, p4, Ln23/g;->a:Ljava/lang/Object;

    check-cast p4, Lio/getstream/chat/android/models/QueryDraftsResult;

    invoke-virtual {p4}, Lio/getstream/chat/android/models/QueryDraftsResult;->getDrafts()Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move-object v4, p4

    move p6, v1

    move v2, p6

    move v3, v2

    move p4, p3

    move-object p3, p2

    move p2, v3

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    const/4 v7, 0x0

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$1:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$2:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$3:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$4:Ljava/lang/Object;

    iput-object p1, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$5:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$6:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$7:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$8:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$9:Ljava/lang/Object;

    iput-object v4, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$10:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$11:Ljava/lang/Object;

    iput-object v7, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->L$12:Ljava/lang/Object;

    iput p4, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$0:I

    iput v3, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$1:I

    iput v2, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$2:I

    iput p6, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$3:I

    iput p2, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$4:I

    iput v1, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->I$5:I

    iput v0, p3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase$onQueryDraftMessagesResult$1;->label:I

    invoke-interface {v6, v5, p3}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, p5, :cond_3

    return-object p5

    :cond_4
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_6

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
