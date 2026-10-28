.class public final Lwe1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe1/b;


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

    iput-object p1, p0, Lwe1/d;->a:Landroidx/room/z0;

    new-instance p1, Lwe1/d$a;

    invoke-direct {p1, p0}, Lwe1/d$a;-><init>(Lwe1/d;)V

    iput-object p1, p0, Lwe1/d;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic d(Lwe1/d;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe1/d;->i(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwe1/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe1/d;->l(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwe1/d;->j(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwe1/d;->k(Ltb/a;)Ljava/util/List;

    move-result-object p0

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

.method private synthetic i(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lwe1/d;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private static synthetic j(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM entitlement_table"

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

.method private static synthetic k(Ltb/a;)Ljava/util/List;
    .locals 13

    const-string v0, "SELECT * FROM entitlement_table"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    const-string v0, "id"

    invoke-static {p0, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "name"

    invoke-static {p0, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "enabled"

    invoke-static {p0, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "lastUpdated"

    invoke-static {p0, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v8, v5

    invoke-interface {p0, v1}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    :goto_1
    move-object v9, v5

    goto :goto_2

    :cond_0
    invoke-interface {p0, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :goto_2
    invoke-interface {p0, v2}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    :goto_3
    move v10, v5

    goto :goto_4

    :cond_1
    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    invoke-interface {p0, v3}, Ltb/c;->getLong(I)J

    move-result-wide v11

    new-instance v7, Lwe1/e;

    invoke-direct/range {v7 .. v12}, Lwe1/e;-><init>(ILjava/lang/String;ZJ)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_5
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic l(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lwe1/b;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lwe1/d;->a:Landroidx/room/z0;

    new-instance v1, Lwe1/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lwe1/c;-><init>(Lwe1/d;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lwe1/d;->a:Landroidx/room/z0;

    new-instance v1, Lwe1/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lwe1/c;-><init>(Lwe1/d;Ljava/util/List;I)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lwe1/d;->a:Landroidx/room/z0;

    new-instance v1, Lwd3/b;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lwd3/b;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getEntitlements(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lwe1/d;->a:Landroidx/room/z0;

    new-instance v1, Lvb1/a;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lvb1/a;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
