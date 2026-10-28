.class public final Lyt0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt0/a;


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

    iput-object p1, p0, Lyt0/c;->a:Landroidx/room/z0;

    new-instance p1, Lyt0/c$a;

    invoke-direct {p1, p0}, Lyt0/c$a;-><init>(Lyt0/c;)V

    iput-object p1, p0, Lyt0/c;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic f(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lyt0/c;->l(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p10}, Lyt0/c;->o(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static/range {p0 .. p10}, Lyt0/c;->m(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(JLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lyt0/c;->n(JLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lyt0/c;->p(ILtb/a;)Ljava/util/List;

    move-result-object p0

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

.method private static synthetic l(Ltb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT COUNT(*) FROM table_console_packets"

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

.method private static synthetic m(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM table_console_packets WHERE id IN (SELECT id FROM table_console_packets WHERE packet_time_stamp_utc >= ? AND packet_time_stamp_utc <= ? AND strap_id == ? AND maxim_version == ? AND nordic_version== ? AND dsp_version == ? AND hw_version == ? ORDER BY packet_time_stamp_utc ASC LIMIT ?)"

    invoke-interface {p10, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v0, v1, p0, p1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {v0, p0, p2, p3}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    if-nez p4, :cond_0

    invoke-interface {v0, p0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_5

    :cond_0
    invoke-interface {v0, p0, p4}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 p0, 0x4

    if-nez p5, :cond_1

    invoke-interface {v0, p0}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, p0, p5}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 p0, 0x5

    if-nez p6, :cond_2

    invoke-interface {v0, p0}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-interface {v0, p0, p6}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    const/4 p0, 0x6

    if-nez p7, :cond_3

    invoke-interface {v0, p0}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-interface {v0, p0, p7}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    const/4 p0, 0x7

    if-nez p8, :cond_4

    invoke-interface {v0, p0}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-interface {v0, p0, p8}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    const/16 p0, 0x8

    int-to-long p1, p9

    invoke-interface {v0, p0, p1, p2}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p10}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :goto_5
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic n(JLtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM table_console_packets where packet_time_stamp_utc<=?"

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

.method private static synthetic o(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;
    .locals 25

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    const-string v5, "SELECT * FROM table_console_packets WHERE packet_time_stamp_utc >= ? AND packet_time_stamp_utc <= ? AND strap_id == ? AND maxim_version == ? AND nordic_version== ? AND dsp_version == ? AND hw_version == ? ORDER BY packet_time_stamp_utc ASC LIMIT ?"

    move-object/from16 v6, p10

    invoke-interface {v6, v5}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v5

    const/4 v6, 0x1

    move-wide/from16 v7, p0

    :try_start_0
    invoke-interface {v5, v6, v7, v8}, Ltb/c;->p(IJ)V

    const/4 v6, 0x2

    move-wide/from16 v7, p2

    invoke-interface {v5, v6, v7, v8}, Ltb/c;->p(IJ)V

    const/4 v6, 0x3

    if-nez v0, :cond_0

    invoke-interface {v5, v6}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_0
    invoke-interface {v5, v6, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x4

    if-nez v1, :cond_1

    invoke-interface {v5, v0}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v5, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x5

    if-nez v2, :cond_2

    invoke-interface {v5, v0}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-interface {v5, v0, v2}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    const/4 v0, 0x6

    if-nez v3, :cond_3

    invoke-interface {v5, v0}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-interface {v5, v0, v3}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    const/4 v0, 0x7

    if-nez v4, :cond_4

    invoke-interface {v5, v0}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-interface {v5, v0, v4}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    const/16 v0, 0x8

    move/from16 v1, p9

    int-to-long v1, v1

    invoke-interface {v5, v0, v1, v2}, Ltb/c;->p(IJ)V

    const-string v0, "packet_time_stamp_utc"

    invoke-static {v5, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "packet_time_stamp"

    invoke-static {v5, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "strap_id"

    invoke-static {v5, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "hw_version"

    invoke-static {v5, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "maxim_version"

    invoke-static {v5, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v6, "dsp_version"

    invoke-static {v5, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "nordic_version"

    invoke-static {v5, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "sequence_number"

    invoke-static {v5, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "received_packet_raw"

    invoke-static {v5, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "id"

    invoke-static {v5, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_5
    invoke-interface {v5}, Ltb/c;->e1()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v5, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v5, v1}, Ltb/c;->getLong(I)J

    move-result-wide v16

    invoke-interface {v5, v2}, Ltb/c;->isNull(I)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_5

    move-object/from16 v18, v13

    goto :goto_6

    :cond_5
    invoke-interface {v5, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v18, v12

    :goto_6
    invoke-interface {v5, v3}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_6

    move-object/from16 v19, v13

    goto :goto_7

    :cond_6
    invoke-interface {v5, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v12

    :goto_7
    invoke-interface {v5, v4}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_7

    move-object/from16 v20, v13

    goto :goto_8

    :cond_7
    invoke-interface {v5, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v20, v12

    :goto_8
    invoke-interface {v5, v6}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_8

    move-object/from16 v21, v13

    goto :goto_9

    :cond_8
    invoke-interface {v5, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v21, v12

    :goto_9
    invoke-interface {v5, v7}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_9

    :goto_a
    move-object/from16 v22, v13

    goto :goto_b

    :cond_9
    invoke-interface {v5, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_a

    :goto_b
    invoke-interface {v5, v8}, Ltb/c;->getLong(I)J

    move-result-wide v12

    long-to-int v12, v12

    invoke-interface {v5, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v13

    invoke-static {v13}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v24

    new-instance v13, Lzt0/a;

    move/from16 v23, v12

    invoke-direct/range {v13 .. v24}, Lzt0/a;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/nio/ByteBuffer;)V

    invoke-interface {v5, v10}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Lzt0/a;->k(J)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :cond_a
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    return-object v11

    :goto_c
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic p(ILtb/a;)Ljava/util/List;
    .locals 25

    const-string v0, "SELECT * FROM table_console_packets LIMIT ?"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p0

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "packet_time_stamp_utc"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "packet_time_stamp"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "strap_id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "hw_version"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "maxim_version"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "dsp_version"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "nordic_version"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "sequence_number"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "received_packet_raw"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "id"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v16

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    move-object/from16 v18, v13

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v18, v12

    :goto_1
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_1

    move-object/from16 v19, v13

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v12

    :goto_2
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_2

    move-object/from16 v20, v13

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v20, v12

    :goto_3
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_3

    move-object/from16 v21, v13

    goto :goto_4

    :cond_3
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v21, v12

    :goto_4
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_4

    :goto_5
    move-object/from16 v22, v13

    goto :goto_6

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_5

    :goto_6
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v12

    long-to-int v12, v12

    invoke-interface {v1, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v13

    invoke-static {v13}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v24

    new-instance v13, Lzt0/a;

    move/from16 v23, v12

    invoke-direct/range {v13 .. v24}, Lzt0/a;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/nio/ByteBuffer;)V

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Lzt0/a;->k(J)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v11

    :goto_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

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

    iget-object v0, p0, Lyt0/c;->a:Landroidx/room/z0;

    new-instance v1, Lsz0/p1;

    const/16 v2, 0x9

    invoke-direct {v1, p1, p2, v2}, Lsz0/p1;-><init>(JI)V

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
            "Lzt0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/c;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/16 v2, 0x8

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

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

    iget-object v0, p0, Lyt0/c;->a:Landroidx/room/z0;

    new-instance v1, Lyk2/k;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lyk2/k;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/c;->a:Landroidx/room/z0;

    new-instance v1, Lyt0/b;

    const/4 v12, 0x0

    move v11, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v1 .. v12}, Lyt0/b;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    move-object/from16 v3, p11

    invoke-static {v0, p1, v2, v1, v3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lzt0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lyt0/c;->a:Landroidx/room/z0;

    new-instance v1, Lyt0/b;

    const/4 v12, 0x1

    move v11, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v1 .. v12}, Lyt0/b;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    move-object/from16 v3, p11

    invoke-static {v0, p1, v2, v1, v3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
