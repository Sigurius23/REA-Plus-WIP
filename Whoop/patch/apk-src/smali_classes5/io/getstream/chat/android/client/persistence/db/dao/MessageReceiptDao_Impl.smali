.class public final Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\t2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;",
        "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "",
        "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;",
        "receipts",
        "Ll83/a0;",
        "upsert",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "selectAll",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "messageIds",
        "deleteByMessageIds",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfMessageReceiptEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfMessageReceiptEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->Companion:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$1;-><init>(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__insertAdapterOfMessageReceiptEntity:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM message_receipt"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->deleteAll$lambda$3(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;)Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->deleteByMessageIds$lambda$2(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(ILio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM message_receipt ORDER BY createdAt ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->selectAll$lambda$1(Ljava/lang/String;ILio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->upsert$lambda$0(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final deleteAll$lambda$3(Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final deleteByMessageIds$lambda$2(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0, p2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final selectAll$lambda$1(Ljava/lang/String;ILio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 6

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p3, 0x1

    int-to-long v0, p1

    :try_start_0
    invoke-interface {p0, p3, v0, v1}, Ltb/c;->p(IJ)V

    const-string p1, "messageId"

    invoke-static {p0, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p3, "cid"

    invoke-static {p0, p3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p3

    const-string v0, "createdAt"

    invoke-static {p0, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0, p1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, p3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v0}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_1
    iget-object v5, p2, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;->fromDb(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;

    invoke-direct {v5, v2, v3, v4}, Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final upsert$lambda$0(Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__insertAdapterOfMessageReceiptEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    const-string v0, "DELETE FROM message_receipt WHERE messageId IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectAll(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v2, 0xb

    invoke-direct {v1, p1, p0, v2}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(ILjava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final upsert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
