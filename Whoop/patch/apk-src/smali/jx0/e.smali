.class public final Ljx0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljx0/b;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field

.field private final d:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljx0/e;->a:Landroidx/room/z0;

    new-instance p1, Ljx0/e$a;

    invoke-direct {p1, p0}, Ljx0/e$a;-><init>(Ljx0/e;)V

    iput-object p1, p0, Ljx0/e;->b:Landroidx/room/k;

    new-instance p1, Ljx0/e$b;

    invoke-direct {p1, p0}, Ljx0/e$b;-><init>(Ljx0/e;)V

    iput-object p1, p0, Ljx0/e;->c:Landroidx/room/i;

    new-instance p1, Ljx0/e$c;

    invoke-direct {p1, p0}, Ljx0/e$c;-><init>(Ljx0/e;)V

    iput-object p1, p0, Ljx0/e;->d:Landroidx/room/i;

    return-void
.end method

.method public static synthetic f(Ljx0/e;Ljx0/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljx0/e;->o(Ljx0/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;JLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljx0/e;->m(Ljava/lang/String;JLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Ltb/a;)Ljx0/a;
    .locals 0

    invoke-static {p0, p1}, Ljx0/e;->n(Ljava/lang/String;Ltb/a;)Ljx0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljx0/e;Ljx0/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljx0/e;->p(Ljx0/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljx0/e;Ljx0/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljx0/e;->l(Ljx0/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static k()Ljava/util/List;
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

.method private synthetic l(Ljx0/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Ljx0/e;->c:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handle(Ltb/a;Ljava/lang/Object;)I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private static synthetic m(Ljava/lang/String;JLtb/a;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM data_sync_work_db WHERE source = ? AND ? < trigger_timestamp"

    move-object/from16 v2, p3

    invoke-interface {v2, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v1, v2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    invoke-interface {v1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    move-wide/from16 v2, p1

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "workerId"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "source"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "trigger_timestamp"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "result_timestamp"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "total_packet_upload"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "upload_retry_count"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    move-object v11, v9

    goto :goto_2

    :cond_1
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object v11, v8

    :goto_2
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_2

    :goto_3
    move-object v12, v9

    goto :goto_4

    :cond_2
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :goto_4
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v13

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v15

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    new-instance v10, Ljx0/a;

    move/from16 v17, v8

    move/from16 v18, v9

    invoke-direct/range {v10 .. v18}, Ljx0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJII)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v7

    :goto_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic n(Ljava/lang/String;Ltb/a;)Ljx0/a;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM data_sync_work_db WHERE workerId = ? LIMIT 1"

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v1, v2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_0
    invoke-interface {v1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const-string v0, "workerId"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "source"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "trigger_timestamp"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "result_timestamp"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "total_packet_upload"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "upload_retry_count"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v10, v8

    goto :goto_1

    :cond_1
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    :goto_1
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_2
    move-object v11, v8

    goto :goto_3

    :cond_2
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :goto_3
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v12

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v9, Ljx0/a;

    move/from16 v16, v0

    move/from16 v17, v2

    invoke-direct/range {v9 .. v17}, Ljx0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v9

    :cond_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v8

    :goto_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic o(Ljx0/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Ljx0/e;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic p(Ljx0/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Ljx0/e;->d:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handle(Ltb/a;Ljava/lang/Object;)I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Ljx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ljx0/e;->a:Landroidx/room/z0;

    new-instance v1, Ljx0/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Ljx0/c;-><init>(Ljx0/e;Ljx0/a;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljx0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/e;->a:Landroidx/room/z0;

    new-instance v1, Ljx0/d;

    invoke-direct {v1, p1, p2, p3}, Ljx0/d;-><init>(Ljava/lang/String;J)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljx0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/e;->a:Landroidx/room/z0;

    new-instance v1, Le61/g;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ljx0/e;->a:Landroidx/room/z0;

    new-instance v1, Ljx0/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ljx0/c;-><init>(Ljx0/e;Ljx0/a;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ljx0/e;->a:Landroidx/room/z0;

    new-instance v1, Ljx0/c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Ljx0/c;-><init>(Ljx0/e;Ljx0/a;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
