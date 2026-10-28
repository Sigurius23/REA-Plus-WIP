.class public final Lha0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lha0/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lha0/i;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lha0/i;

    invoke-direct {v0}, Lha0/i;-><init>()V

    iput-object v0, p0, Lha0/c;->c:Lha0/i;

    iput-object p1, p0, Lha0/c;->a:Landroidx/room/z0;

    new-instance p1, Lha0/c$a;

    invoke-direct {p1, p0}, Lha0/c$a;-><init>(Lha0/c;)V

    iput-object p1, p0, Lha0/c;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic f(Lha0/c;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lha0/c;->m(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lha0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lha0/c;->o(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lha0/c;->l(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lha0/c;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lha0/c;->n(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Lha0/c;)Lha0/i;
    .locals 0

    iget-object p0, p0, Lha0/c;->c:Lha0/i;

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

.method private static synthetic l(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_activities_list"

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

.method private synthetic m(Ltb/a;)Ljava/util/List;
    .locals 21

    const-string v0, "SELECT * FROM table_activities_list"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "internal_name"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "display_name"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "icon_url"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "deleted"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "category"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "score_type"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "has_gps"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v12, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object v12, v9

    :goto_1
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object v13, v9

    :goto_2
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2

    const/4 v14, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object v14, v9

    :goto_3
    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v9, v10

    if-eqz v9, :cond_3

    const/4 v15, 0x1

    goto :goto_4

    :cond_3
    const/4 v15, 0x0

    :goto_4
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v16, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v16, v9

    :goto_5
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    :goto_6
    move-object/from16 v10, p0

    goto :goto_7

    :cond_5
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_6

    :goto_7
    :try_start_1
    iget-object v11, v10, Lha0/c;->c:Lha0/i;

    invoke-virtual {v11, v9}, Lha0/i;->b(Ljava/lang/String;)Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v9

    move/from16 v19, v2

    move/from16 v20, v3

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_6

    const/16 v18, 0x1

    goto :goto_8

    :cond_6
    const/16 v18, 0x0

    :goto_8
    new-instance v11, Lha0/d;

    move-object/from16 v17, v9

    invoke-direct/range {v11 .. v18}, Lha0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v2, v19

    move/from16 v3, v20

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object/from16 v10, p0

    goto :goto_9

    :cond_7
    move-object/from16 v10, p0

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v8

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic n(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lha0/c;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic o(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lha0/a;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lha0/c;->a:Landroidx/room/z0;

    const-string v1, "table_activities_list"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Leg/j;

    const/16 v3, 0x1c

    invoke-direct {v2, p0, v3}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lha0/d;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lha0/c;->a:Landroidx/room/z0;

    new-instance v1, Lha0/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lha0/b;-><init>(Lha0/c;Ljava/util/List;I)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lha0/c;->a:Landroidx/room/z0;

    new-instance v1, Lh01/u;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lh01/u;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lha0/d;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lha0/c;->a:Landroidx/room/z0;

    new-instance v1, Lha0/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lha0/b;-><init>(Lha0/c;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
