.class public final Lju0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lju0/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lju0/b;->a:Landroidx/room/z0;

    new-instance p1, Lju0/b$a;

    invoke-direct {p1, p0}, Lju0/b$a;-><init>(Lju0/b;)V

    iput-object p1, p0, Lju0/b;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic d(ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lju0/b;->i(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lju0/b;Liu0/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lju0/b;->j(Liu0/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lju0/b;->h(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic h(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 2

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    invoke-interface {p0, p2}, Ltb/c;->u(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, p2, v0, v1}, Ltb/c;->p(IJ)V

    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static synthetic i(ILtb/a;)Ljava/util/List;
    .locals 8

    const-string v0, "SELECT * FROM memfault_packets order by id limit ?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const-string p0, "id"

    invoke-static {p1, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string v0, "serial_number"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "value"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-interface {p1, v0}, Ltb/c;->isNull(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    move-object v5, v6

    goto :goto_1

    :cond_0
    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-interface {p1, v1}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p1, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v6

    :goto_2
    new-instance v7, Liu0/a;

    invoke-direct {v7, v3, v4, v5, v6}, Liu0/a;-><init>(JLjava/lang/String;[B)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic j(Liu0/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lju0/b;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Liu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lju0/b;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v2, 0x14

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "DELETE FROM memfault_packets WHERE id IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lju0/b;->a:Landroidx/room/z0;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Liu0/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lju0/b;->a:Landroidx/room/z0;

    new-instance v1, Ljp1/c;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0, p1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
