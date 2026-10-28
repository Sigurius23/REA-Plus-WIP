.class public final Lrk2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk2/c;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lrk2/a;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lrk2/a;

    invoke-direct {v0}, Lrk2/a;-><init>()V

    iput-object v0, p0, Lrk2/d;->c:Lrk2/a;

    iput-object p1, p0, Lrk2/d;->a:Landroidx/room/z0;

    new-instance p1, Lrk2/d$a;

    invoke-direct {p1, p0}, Lrk2/d$a;-><init>(Lrk2/d;)V

    iput-object p1, p0, Lrk2/d;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic c(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrk2/d;->i(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lrk2/d;Lrk2/e;Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrk2/d;->l(Lrk2/e;Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(JLtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrk2/d;->j(JLtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lrk2/d;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lrk2/d;->k(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g(Lrk2/d;)Lrk2/a;
    .locals 0

    iget-object p0, p0, Lrk2/d;->c:Lrk2/a;

    return-object p0
.end method

.method public static h()Ljava/util/List;
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

.method private static synthetic i(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM pending_activity_save_table"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic j(JLtb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM pending_activity_save_table WHERE id = ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Ltb/c;->p(IJ)V

    invoke-interface {p2}, Ltb/c;->e1()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic k(Ltb/a;)Ljava/util/List;
    .locals 22

    const-string v0, "SELECT * FROM pending_activity_save_table"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "activityInternalName"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "garmentId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "startTime"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "endTime"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "gpsEnabled"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "queuedAtMs"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "pauseSegmentsJson"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v12

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_0

    const/4 v14, 0x0

    :goto_1
    move-wide v15, v12

    goto :goto_2

    :cond_0
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object v14, v10

    goto :goto_1

    :goto_2
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v11

    long-to-int v10, v11

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v11

    :goto_3
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v17, 0x0

    goto :goto_4

    :cond_2
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v17, v12

    :goto_4
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v12

    long-to-int v12, v12

    if-eqz v12, :cond_3

    const/4 v12, 0x1

    :goto_5
    move/from16 v18, v12

    goto :goto_6

    :cond_3
    const/4 v12, 0x0

    goto :goto_5

    :goto_6
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v19

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_4

    const/4 v12, 0x0

    :goto_7
    move-object/from16 v13, p0

    move/from16 p1, v0

    goto :goto_8

    :cond_4
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_7

    :goto_8
    iget-object v0, v13, Lrk2/d;->c:Lrk2/a;

    invoke-virtual {v0, v12}, Lrk2/a;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    move-wide v12, v15

    move-object/from16 v16, v11

    new-instance v11, Lrk2/e;

    move v15, v10

    invoke-direct/range {v11 .. v21}, Lrk2/e;-><init>(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZJLjava/util/List;)V

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v0, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v9

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic l(Lrk2/e;Ltb/a;)Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lrk2/d;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insertAndReturnId(Ltb/a;Ljava/lang/Object;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrk2/d;->a:Landroidx/room/z0;

    new-instance v1, Lai1/b;

    const/16 v2, 0x1d

    invoke-direct {v1, p1, p2, v2}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lrk2/e;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrk2/e;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrk2/d;->a:Landroidx/room/z0;

    new-instance v1, Lq11/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2, p0, p1}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAll(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lrk2/d;->a:Landroidx/room/z0;

    new-instance v1, Lr61/h;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lr61/h;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lrk2/e;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrk2/d;->a:Landroidx/room/z0;

    new-instance v1, Lpf/b;

    const/16 v2, 0x19

    invoke-direct {v1, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
