.class public final Ldq1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldq1/b;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Ldq1/e;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldq1/e;

    invoke-direct {v0}, Ldq1/e;-><init>()V

    iput-object v0, p0, Ldq1/d;->c:Ldq1/e;

    iput-object p1, p0, Ldq1/d;->a:Landroidx/room/z0;

    new-instance p1, Ldq1/d$a;

    invoke-direct {p1, p0}, Ldq1/d$a;-><init>(Ldq1/d;)V

    iput-object p1, p0, Ldq1/d;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic f(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldq1/d;->l(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ldq1/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldq1/d;->o(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ldq1/d;Ljava/util/List;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldq1/d;->n(Ljava/util/List;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ldq1/d;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Ldq1/d;->m(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Ldq1/d;)Ldq1/e;
    .locals 0

    iget-object p0, p0, Ldq1/d;->c:Ldq1/e;

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

    const-string v0, "DELETE FROM table_hr_zone_list"

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
    .locals 8

    const-string v0, "SELECT * FROM table_hr_zone_list ORDER BY min ASC"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    const-string v0, "zone_id"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "min"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "max"

    invoke-static {p1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v0}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    iget-object v5, p0, Ldq1/d;->c:Ldq1/e;

    invoke-virtual {v5, v4}, Ldq1/e;->b(Ljava/lang/String;)Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v4

    invoke-interface {p1, v1}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {p1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    new-instance v7, Ldq1/a;

    invoke-direct {v7, v4, v5, v6}, Ldq1/a;-><init>(Lcom/whoop/hrZones/network/ZoneID;II)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic n(Ljava/util/List;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldq1/d;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Ldq1/b;->d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Ldq1/d;->a:Landroidx/room/z0;

    const-string v1, "table_hr_zone_list"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lck1/c;

    const/16 v3, 0x18

    invoke-direct {v2, p0, v3}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldq1/a;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ldq1/d;->a:Landroidx/room/z0;

    new-instance v1, Ldq1/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Ldq1/c;-><init>(Ldq1/d;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldq1/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ldq1/d;->a:Landroidx/room/z0;

    new-instance v1, Ldq1/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ldq1/c;-><init>(Ldq1/d;Ljava/util/List;I)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Ldq1/d;->a:Landroidx/room/z0;

    new-instance v1, Ldc1/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
