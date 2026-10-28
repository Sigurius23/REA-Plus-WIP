.class public final Lwe1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe1/j;


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

    iput-object p1, p0, Lwe1/k;->a:Landroidx/room/z0;

    new-instance p1, Lwe1/k$a;

    invoke-direct {p1, p0}, Lwe1/k$a;-><init>(Lwe1/k;)V

    iput-object p1, p0, Lwe1/k;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic c(Ltb/a;)Lwe1/l;
    .locals 0

    invoke-static {p0}, Lwe1/k;->h(Ltb/a;)Lwe1/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwe1/k;Lwe1/l;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe1/k;->i(Lwe1/l;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwe1/k;->g(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static f()Ljava/util/List;
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

.method private static synthetic g(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM membership_type_table"

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

.method private static synthetic h(Ltb/a;)Lwe1/l;
    .locals 7

    const-string v0, "SELECT * FROM membership_type_table LIMIT 1"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    const-string v0, "id"

    invoke-static {p0, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "membershipType"

    invoke-static {p0, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "lastUpdated"

    invoke-static {p0, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v0, v5

    invoke-interface {p0, v1}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-interface {p0, v2}, Ltb/c;->getLong(I)J

    move-result-wide v1

    new-instance v3, Lwe1/l;

    invoke-direct {v3, v0, v4, v1, v2}, Lwe1/l;-><init>(ILjava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic i(Lwe1/l;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lwe1/k;->b:Landroidx/room/k;

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
            "Lwe1/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lwe1/k;->a:Landroidx/room/z0;

    new-instance v1, Lwd3/b;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lwd3/b;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lwe1/l;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe1/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lwe1/k;->a:Landroidx/room/z0;

    new-instance v1, Lum0/b;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p0, p1}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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

    iget-object v0, p0, Lwe1/k;->a:Landroidx/room/z0;

    new-instance v1, Lwd3/b;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lwd3/b;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
