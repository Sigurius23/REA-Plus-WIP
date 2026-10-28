.class public final Lmu0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu0/a;


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

    iput-object p1, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance p1, Lmu0/e$a;

    invoke-direct {p1, p0}, Lmu0/e$a;-><init>(Lmu0/e;)V

    iput-object p1, p0, Lmu0/e;->b:Landroidx/room/k;

    new-instance p1, Lmu0/e$b;

    invoke-direct {p1, p0}, Lmu0/e$b;-><init>(Lmu0/e;)V

    iput-object p1, p0, Lmu0/e;->c:Landroidx/room/i;

    return-void
.end method

.method private static synthetic A(ILtb/a;)Ljava/util/List;
    .locals 14

    const-string v0, "SELECT * FROM table_metrics_data ORDER BY timestamp ASC LIMIT ?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const-string p0, "packet_revision"

    invoke-static {p1, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "packet_data"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "version_id"

    invoke-static {p1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "frame_revision"

    invoke-static {p1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v8, v5

    invoke-interface {p1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v9

    invoke-interface {p1, v1}, Ltb/c;->getBlob(I)[B

    move-result-object v5

    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v11

    invoke-interface {p1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v12, v5

    invoke-interface {p1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v13, v5

    new-instance v7, Lnu0/a;

    invoke-direct/range {v7 .. v13}, Lnu0/a;-><init>(IJLjava/nio/ByteBuffer;II)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic B(IIILtb/a;)Ljava/util/List;
    .locals 12

    const-string v0, "SELECT * FROM table_metrics_data WHERE packet_revision == ? AND version_id == ? ORDER BY timestamp ASC LIMIT ?"

    invoke-interface {p3, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p3

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p3, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    int-to-long v0, p1

    invoke-interface {p3, p0, v0, v1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    int-to-long p1, p2

    invoke-interface {p3, p0, p1, p2}, Ltb/c;->p(IJ)V

    const-string p0, "packet_revision"

    invoke-static {p3, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "timestamp"

    invoke-static {p3, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p2, "packet_data"

    invoke-static {p3, p2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p2

    const-string v0, "version_id"

    invoke-static {p3, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "frame_revision"

    invoke-static {p3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p3}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p3, p0}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v6, v3

    invoke-interface {p3, p1}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-interface {p3, p2}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-interface {p3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v10, v3

    invoke-interface {p3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v11, v3

    new-instance v5, Lnu0/a;

    invoke-direct/range {v5 .. v11}, Lnu0/a;-><init>(IJLjava/nio/ByteBuffer;II)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_1
    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic C(IJJIJLtb/a;)Ljava/util/List;
    .locals 7

    const-string v0, "SELECT * FROM table_metrics_data WHERE packet_revision == ? AND timestamp >= ? AND timestamp <= ? AND version_id == ? ORDER BY timestamp ASC LIMIT ?"

    invoke-interface {p8, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p8

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p8, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {p8, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    invoke-interface {p8, p0, p3, p4}, Ltb/c;->p(IJ)V

    const/4 p0, 0x4

    int-to-long p1, p5

    invoke-interface {p8, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x5

    invoke-interface {p8, p0, p6, p7}, Ltb/c;->p(IJ)V

    const-string p0, "packet_revision"

    invoke-static {p8, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "timestamp"

    invoke-static {p8, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p2, "packet_data"

    invoke-static {p8, p2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p2

    const-string p3, "version_id"

    invoke-static {p8, p3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p3

    const-string p4, "frame_revision"

    invoke-static {p8, p4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p4

    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p8}, Ltb/c;->e1()Z

    move-result p6

    if-eqz p6, :cond_0

    invoke-interface {p8, p0}, Ltb/c;->getLong(I)J

    move-result-wide p6

    long-to-int v1, p6

    invoke-interface {p8, p1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-interface {p8, p2}, Ltb/c;->getBlob(I)[B

    move-result-object p6

    invoke-static {p6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-interface {p8, p3}, Ltb/c;->getLong(I)J

    move-result-wide p6

    long-to-int v5, p6

    invoke-interface {p8, p4}, Ltb/c;->getLong(I)J

    move-result-wide p6

    long-to-int v6, p6

    new-instance v0, Lnu0/a;

    invoke-direct/range {v0 .. v6}, Lnu0/a;-><init>(IJLjava/nio/ByteBuffer;II)V

    invoke-virtual {p5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    invoke-interface {p8}, Ljava/lang/AutoCloseable;->close()V

    return-object p5

    :goto_1
    invoke-interface {p8}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic D(Ltb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT packet_revision FROM table_metrics_data ORDER BY timestamp ASC LIMIT 1"

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

.method private static synthetic E(ILtb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT timestamp FROM table_metrics_data WHERE packet_revision == ? ORDER BY timestamp ASC LIMIT 1"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic F(ILtb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT version_id FROM table_metrics_data WHERE packet_revision == ? ORDER BY timestamp ASC LIMIT 1"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic G(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lmu0/e;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private static synthetic H(Ltb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT MAX(timestamp) FROM table_metrics_data"

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

.method public static synthetic l(IJJIJLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p8}, Lmu0/e;->C(IJJIJLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(ILtb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Lmu0/e;->E(ILtb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(ILtb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Lmu0/e;->z(ILtb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lmu0/e;->A(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lmu0/e;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmu0/e;->y(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lmu0/e;->F(ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lmu0/e;->H(Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lmu0/e;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmu0/e;->G(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lmu0/e;->x(ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(IIILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmu0/e;->B(IIILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lmu0/e;->D(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static w()Ljava/util/List;
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

.method private static synthetic x(ILtb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT COUNT(*) FROM table_metrics_data WHERE packet_revision == ?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic y(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lmu0/e;->c:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handleMultiple(Ltb/a;Ljava/lang/Iterable;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic z(ILtb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT timestamp FROM table_metrics_data WHERE packet_revision == ? ORDER BY timestamp DESC LIMIT 1"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lmu0/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lmu0/b;-><init>(Lmu0/e;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(JIJJILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIJJI",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static/range {p0 .. p9}, Lmu0/a$a;->a(Lmu0/a;JIJJILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getOldestPacketRevision(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lmd0/b;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lmd0/b;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(JIJJILq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIJJI",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lmu0/d;

    move-wide v8, p1

    move v2, p3

    move-wide v3, p4

    move-wide/from16 v5, p6

    move/from16 v7, p8

    invoke-direct/range {v1 .. v9}, Lmu0/d;-><init>(IJJIJ)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    move-object/from16 p3, p9

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lmu0/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmu0/b;-><init>(Lmu0/e;Ljava/util/List;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(IIILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lmu0/c;

    invoke-direct {v1, p1, p2, p3}, Lmu0/c;-><init>(III)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

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

    iget-object v0, p0, Lmu0/e;->a:Landroidx/room/z0;

    const-string v1, "table_metrics_data"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lmm1/h;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lmm1/h;-><init>(I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method
