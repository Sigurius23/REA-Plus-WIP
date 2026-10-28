.class final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertMessages$9"
    f = "DatabaseMessageRepository.kt"
    l = {
        0x97,
        0x99
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $messagesToInsert:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $replyMessagesToInsert:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->$replyMessagesToInsert:Ljava/util/List;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->$messagesToInsert:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->$replyMessagesToInsert:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->$messagesToInsert:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    invoke-direct {v0, v1, v2, v3, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;-><init>(Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->$replyMessagesToInsert:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v5

    :goto_0
    if-eqz p1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->access$getReplyMessageDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    move-result-object v1

    iput-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->I$0:I

    iput v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->label:I

    invoke-interface {v1, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;->insert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->$messagesToInsert:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v5

    :goto_2
    if-eqz p1, :cond_6

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->access$getMessageDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    move-result-object v1

    iput-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;->label:I

    invoke-interface {v1, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
