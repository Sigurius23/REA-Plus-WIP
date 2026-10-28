.class public final Lai1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai1/a;


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

    iput-object p1, p0, Lai1/d;->a:Landroidx/room/z0;

    new-instance p1, Lai1/d$a;

    invoke-direct {p1, p0}, Lai1/d$a;-><init>(Lai1/d;)V

    iput-object p1, p0, Lai1/d;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic e(Lai1/d;Lbi1/a;Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-direct {p0, p1, p2}, Lai1/d;->m(Lbi1/a;Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(JLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lai1/d;->j(JLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(JLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lai1/d;->l(JLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(JJJLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static/range {p0 .. p6}, Lai1/d;->k(JJJLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static i()Ljava/util/List;
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

.method private static synthetic j(JLtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM foreground_gps_route_points WHERE sessionStartTimeMs = ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v0, v1, p0, p1}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p2}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic k(JJJLtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM foreground_gps_route_points WHERE sessionStartTimeMs = ? AND timestamp BETWEEN ? AND ?"

    invoke-interface {p6, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v0, v1, p0, p1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {v0, p0, p2, p3}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    invoke-interface {v0, p0, p4, p5}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p6}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic l(JLtb/a;)Ljava/util/List;
    .locals 25

    const-string v0, "SELECT * FROM foreground_gps_route_points WHERE sessionStartTimeMs = ? ORDER BY timestamp ASC"

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move-wide/from16 v2, p0

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "sessionStartTimeMs"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "timestamp"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "latitude"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "longitude"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "altitude"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "horizontal_accuracy_meters"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "vertical_accuracy_meters"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v11

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v13

    invoke-interface {v1, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v15

    invoke-interface {v1, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v17

    invoke-interface {v1, v5}, Ltb/c;->getDouble(I)D

    move-result-wide v19

    invoke-interface {v1, v6}, Ltb/c;->getDouble(I)D

    move-result-wide v21

    invoke-interface {v1, v7}, Ltb/c;->getDouble(I)D

    move-result-wide v23

    new-instance v10, Lbi1/a;

    invoke-direct/range {v10 .. v24}, Lbi1/a;-><init>(JJDDDDD)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v8

    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic m(Lbi1/a;Ltb/a;)Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lai1/d;->b:Landroidx/room/k;

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
            "Ljava/util/List<",
            "Lbi1/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lai1/d;->a:Landroidx/room/z0;

    new-instance v1, Lai1/b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lai1/d;->a:Landroidx/room/z0;

    new-instance v1, Lai1/b;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, v2}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(JJJLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lai1/d;->a:Landroidx/room/z0;

    new-instance v1, Lai1/c;

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-direct/range {v1 .. v7}, Lai1/c;-><init>(JJJ)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p7}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lbi1/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbi1/a;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lai1/d;->a:Landroidx/room/z0;

    new-instance v1, La20/g;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
