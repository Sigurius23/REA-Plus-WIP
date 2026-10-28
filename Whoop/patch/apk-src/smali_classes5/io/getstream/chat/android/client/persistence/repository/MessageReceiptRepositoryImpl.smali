.class public final Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\t2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;",
        "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;",
        "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
        "dao",
        "<init>",
        "(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;)V",
        "",
        "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
        "receipts",
        "Ll83/a0;",
        "upsertMessageReceipts",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "selectMessageReceipts",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "messageIds",
        "deleteMessageReceiptsByMessageIds",
        "clearMessageReceipts",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
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
.field private final dao:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;->dao:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    return-void
.end method


# virtual methods
.method public final clearMessageReceipts(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;->dao:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteMessageReceiptsByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;->dao:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;->deleteByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectMessageReceipts(ILq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;

    iget v1, v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;-><init>(Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;->dao:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    iput p1, v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl$selectMessageReceipts$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;->selectAll(ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;

    invoke-static {v0}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryMapperKt;->toModel(Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;)Lio/getstream/chat/android/client/receipts/MessageReceipt;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object p1
.end method

.method public final upsertMessageReceipts(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/receipts/MessageReceipt;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryImpl;->dao:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/receipts/MessageReceipt;

    invoke-static {v2}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepositoryMapperKt;->toEntity(Lio/getstream/chat/android/client/receipts/MessageReceipt;)Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p2}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;->upsert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
