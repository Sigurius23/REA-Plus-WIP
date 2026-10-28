.class public final Lx90/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx90/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lcom/whoop/activitysession/a;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/activitysession/a;

    invoke-direct {v0}, Lcom/whoop/activitysession/a;-><init>()V

    iput-object v0, p0, Lx90/b;->c:Lcom/whoop/activitysession/a;

    iput-object p1, p0, Lx90/b;->a:Landroidx/room/z0;

    new-instance p1, Lx90/b$a;

    invoke-direct {p1, p0}, Lx90/b$a;-><init>(Lx90/b;)V

    iput-object p1, p0, Lx90/b;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic c(Lx90/b;Lx90/c;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lx90/b;->j(Lx90/c;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx90/b;Ltb/a;)Lx90/c;
    .locals 0

    invoke-direct {p0, p1}, Lx90/b;->i(Ltb/a;)Lx90/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lx90/b;->h(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f(Lx90/b;)Lcom/whoop/activitysession/a;
    .locals 0

    iget-object p0, p0, Lx90/b;->c:Lcom/whoop/activitysession/a;

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

.method private static synthetic h(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM active_activity_session_table"

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

.method private synthetic i(Ltb/a;)Lx90/c;
    .locals 23

    const-string v0, "SELECT * FROM active_activity_session_table LIMIT 1"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "activitySessionId"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "state"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "selectedActivityInternalName"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "gpsTrackingEnabled"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "startTimeMs"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "resumeNavigationJson"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "pauseSegmentsJson"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_6

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v11

    long-to-int v14, v11

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v15, v10

    goto :goto_0

    :cond_0
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    :goto_0
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v16, v10

    goto :goto_1

    :cond_1
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    :goto_1
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v17, v10

    goto :goto_2

    :cond_2
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_2
    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_3
    move/from16 v18, v0

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v19

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v21, v10

    goto :goto_5

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v21, v0

    :goto_5
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_6
    move-object/from16 v2, p0

    goto :goto_7

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_6

    :goto_7
    :try_start_1
    iget-object v0, v2, Lx90/b;->c:Lcom/whoop/activitysession/a;

    invoke-virtual {v0, v10}, Lcom/whoop/activitysession/a;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    new-instance v13, Lx90/c;

    invoke-direct/range {v13 .. v22}, Lx90/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v10, v13

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object/from16 v2, p0

    goto :goto_9

    :cond_6
    move-object/from16 v2, p0

    :goto_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v10

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic j(Lx90/c;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lx90/b;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lx90/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx90/b;->a:Landroidx/room/z0;

    new-instance v1, Lx30/h1;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lx90/c;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx90/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lx90/b;->a:Landroidx/room/z0;

    new-instance v1, Lx30/j1;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0, p1}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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

    iget-object v0, p0, Lx90/b;->a:Landroidx/room/z0;

    new-instance v1, Lwz/h1;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lwz/h1;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
