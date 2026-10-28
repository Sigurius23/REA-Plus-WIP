.class public final Lau0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lau0/a;


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


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance p1, Lau0/f$a;

    invoke-direct {p1, p0}, Lau0/f$a;-><init>(Lau0/f;)V

    iput-object p1, p0, Lau0/f;->b:Landroidx/room/k;

    new-instance p1, Lau0/f$b;

    invoke-direct {p1, p0}, Lau0/f$b;-><init>(Lau0/f;)V

    iput-object p1, p0, Lau0/f;->c:Landroidx/room/i;

    return-void
.end method

.method public static synthetic g(Lau0/f;JJLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lau0/f;->o(JJLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(JJLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lau0/f;->q(JJLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lau0/f;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lau0/f;->t(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lau0/f;->u(Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(IILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lau0/f;->r(IILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lau0/f;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1, p2}, Lau0/f;->p(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lau0/f;->s(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static n()Ljava/util/List;
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

.method private synthetic o(JJLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super/range {p0 .. p5}, Lau0/a;->f(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private synthetic p(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lau0/f;->c:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handleMultiple(Ltb/a;Ljava/lang/Iterable;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic q(JJLtb/a;)Ljava/util/List;
    .locals 8

    const-string v0, "SELECT * FROM table_strap_firmware_events WHERE timestamp>=? AND timestamp<=? ORDER BY timestamp ASC"

    invoke-interface {p4, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p4

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p4, v0, p0, p1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {p4, p0, p2, p3}, Ltb/c;->p(IJ)V

    const-string p0, "timestamp"

    invoke-static {p4, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "type"

    invoke-static {p4, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p2, "packet_data"

    invoke-static {p4, p2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p2

    const-string p3, "version_id"

    invoke-static {p4, p3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p4}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p4, p0}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-interface {p4, p1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v5, v1

    invoke-interface {p4, p2}, Ltb/c;->getBlob(I)[B

    move-result-object v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-interface {p4, p3}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v7, v1

    new-instance v2, Lbu0/a;

    invoke-direct/range {v2 .. v7}, Lbu0/a;-><init>(JILjava/nio/ByteBuffer;I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    invoke-interface {p4}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p4}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic r(IILtb/a;)Ljava/util/List;
    .locals 10

    const-string v0, "SELECT * FROM table_strap_firmware_events WHERE version_id = ? ORDER BY timestamp ASC LIMIT ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p2, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    int-to-long v0, p1

    invoke-interface {p2, p0, v0, v1}, Ltb/c;->p(IJ)V

    const-string p0, "timestamp"

    invoke-static {p2, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "type"

    invoke-static {p2, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string v0, "packet_data"

    invoke-static {p2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "version_id"

    invoke-static {p2, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p2}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p2, p0}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-interface {p2, p1}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v7, v3

    invoke-interface {p2, v0}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-interface {p2, v1}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v9, v3

    new-instance v4, Lbu0/a;

    invoke-direct/range {v4 .. v9}, Lbu0/a;-><init>(JILjava/nio/ByteBuffer;I)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_1
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic s(Ltb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT version_id FROM table_strap_firmware_events ORDER BY timestamp ASC LIMIT 1"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic t(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lau0/f;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private static synthetic u(Ltb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT MAX(timestamp) FROM table_strap_firmware_events"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance v1, Lau0/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lau0/b;-><init>(Lau0/f;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance v1, La11/g;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(JJLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance v1, Lau0/d;

    invoke-direct {v1, p1, p2, p3, p4}, Lau0/d;-><init>(JJ)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p5}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(IILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance v1, Lau0/e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lau0/e;-><init>(III)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(JJLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance v1, Lau0/c;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lau0/c;-><init>(Lau0/f;JJ)V

    invoke-static {v0, v1, p5}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    new-instance v1, Lau0/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lau0/b;-><init>(Lau0/f;Ljava/util/List;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public observeNewestTimestamp()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lau0/f;->a:Landroidx/room/z0;

    const-string v1, "table_strap_firmware_events"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lat2/b1;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lat2/b1;-><init>(I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method
