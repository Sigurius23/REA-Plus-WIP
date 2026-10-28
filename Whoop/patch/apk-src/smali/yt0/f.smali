.class public final Lyt0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt0/d;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lzt0/c;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzt0/c;

    invoke-direct {v0}, Lzt0/c;-><init>()V

    iput-object v0, p0, Lyt0/f;->c:Lzt0/c;

    iput-object p1, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance p1, Lyt0/f$a;

    invoke-direct {p1, p0}, Lyt0/f$a;-><init>(Lyt0/f;)V

    iput-object p1, p0, Lyt0/f;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic g(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lyt0/f;->p(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(JLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lyt0/f;->r(JLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-direct/range {p0 .. p7}, Lyt0/f;->s(JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lyt0/f;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lyt0/f;->t(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-direct/range {p0 .. p7}, Lyt0/f;->q(JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lyt0/f;Lzt0/b;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lyt0/f;->u(Lzt0/b;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lyt0/f;->v(Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n(Lyt0/f;)Lzt0/c;
    .locals 0

    iget-object p0, p0, Lyt0/f;->c:Lzt0/c;

    return-object p0
.end method

.method public static o()Ljava/util/List;
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

.method private static synthetic p(Ltb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT COUNT(*) FROM console_packets"

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

.method private synthetic q(JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM console_packets WHERE id IN (SELECT id FROM console_packets WHERE packet_time_stamp >= ? AND packet_time_stamp <= ? AND console_packets_metadata == ? ORDER BY packet_time_stamp ASC LIMIT ?)"

    invoke-interface {p7, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p1, 0x2

    invoke-interface {v0, p1, p3, p4}, Ltb/c;->p(IJ)V

    iget-object p1, p0, Lyt0/f;->c:Lzt0/c;

    invoke-virtual {p1, p5}, Lzt0/c;->a(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x3

    if-nez p1, :cond_0

    invoke-interface {v0, p2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {v0, p2, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x4

    int-to-long p2, p6

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p7}, Lj93/l0;->H(Ltb/a;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_1
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static synthetic r(JLtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM console_packets where packet_time_stamp<=?"

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

.method private synthetic s(JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;ILtb/a;)Ljava/util/List;
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM console_packets WHERE packet_time_stamp >= ? AND packet_time_stamp <= ? AND console_packets_metadata == ? ORDER BY packet_time_stamp ASC LIMIT ?"

    move-object/from16 v2, p7

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    const/4 v0, 0x1

    move-wide/from16 v3, p1

    :try_start_0
    invoke-interface {v2, v0, v3, v4}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    move-wide/from16 v3, p3

    invoke-interface {v2, v0, v3, v4}, Ltb/c;->p(IJ)V

    iget-object v0, v1, Lyt0/f;->c:Lzt0/c;

    move-object/from16 v3, p5

    invoke-virtual {v0, v3}, Lzt0/c;->a(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x3

    if-nez v0, :cond_0

    invoke-interface {v2, v3}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    invoke-interface {v2, v3, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x4

    move/from16 v3, p6

    int-to-long v3, v3

    invoke-interface {v2, v0, v3, v4}, Ltb/c;->p(IJ)V

    const-string v0, "id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v3, "sequence_no"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "packet_time_stamp"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "console_packets_metadata"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "received_packet_raw"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v2, v0}, Ltb/c;->getLong(I)J

    move-result-wide v10

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v12, v8

    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v13

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_2
    iget-object v9, v1, Lyt0/f;->c:Lzt0/c;

    invoke-virtual {v9, v8}, Lzt0/c;->b(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    move-result-object v15

    invoke-interface {v2, v6}, Ltb/c;->getBlob(I)[B

    move-result-object v8

    invoke-static {v8}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v16

    new-instance v9, Lzt0/b;

    invoke-direct/range {v9 .. v16}, Lzt0/b;-><init>(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v7

    :goto_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic t(ILtb/a;)Ljava/util/List;
    .locals 16

    const-string v0, "SELECT * FROM console_packets LIMIT ?"

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p1

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "sequence_no"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "packet_time_stamp"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "console_packets_metadata"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "received_packet_raw"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v9

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v11, v7

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v12

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x0

    :goto_1
    move-object/from16 v8, p0

    goto :goto_2

    :cond_0
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :goto_2
    iget-object v14, v8, Lyt0/f;->c:Lzt0/c;

    invoke-virtual {v14, v7}, Lzt0/c;->b(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    move-result-object v14

    invoke-interface {v1, v5}, Ltb/c;->getBlob(I)[B

    move-result-object v7

    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v15

    new-instance v8, Lzt0/b;

    invoke-direct/range {v8 .. v15}, Lzt0/b;-><init>(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic u(Lzt0/b;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lyt0/f;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private static synthetic v(Ltb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT MAX(packet_time_stamp) FROM console_packets"

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
.method public a(JLq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/d;

    const/4 v2, 0x7

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/persistent/d;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lzt0/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance v1, Lku0/c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lku0/c;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

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
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance v1, Lvb1/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lvb1/a;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(IJJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance v1, Lyt0/e;

    const/4 v9, 0x0

    move-object v2, p0

    move v8, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lyt0/e;-><init>(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;II)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    move-object/from16 p3, p7

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(IJJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lzt0/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance v1, Lyt0/e;

    const/4 v9, 0x1

    move-object v2, p0

    move v8, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lyt0/e;-><init>(Lyt0/f;JJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    move-object/from16 p3, p7

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lzt0/b;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzt0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    new-instance v1, Lp3/b0;

    const/16 v2, 0x13

    invoke-direct {v1, v2, p0, p1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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

    iget-object v0, p0, Lyt0/f;->a:Landroidx/room/z0;

    const-string v1, "console_packets"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lyk2/k;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lyk2/k;-><init>(I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method
