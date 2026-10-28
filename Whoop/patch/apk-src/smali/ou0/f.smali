.class public final Lou0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lou0/e;


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

    iput-object p1, p0, Lou0/f;->a:Landroidx/room/z0;

    new-instance p1, Lou0/f$a;

    invoke-direct {p1, p0}, Lou0/f$a;-><init>(Lou0/f;)V

    iput-object p1, p0, Lou0/f;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic g(Ltb/a;)Lpu0/d;
    .locals 0

    invoke-static {p0}, Lou0/f;->n(Ltb/a;)Lpu0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;[JLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lou0/f;->l(Ljava/lang/String;[JLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lou0/f;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lou0/f;->o(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;IIIIIIILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p8}, Lou0/f;->m(Ljava/lang/String;IIIIIIILtb/a;)Ljava/util/List;

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

.method private static synthetic l(Ljava/lang/String;[JLtb/a;)Ljava/lang/Integer;
    .locals 5

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-wide v3, p1, v2

    invoke-interface {p0, v1, v3, v4}, Ltb/c;->p(IJ)V

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    invoke-static {p2}, Lj93/l0;->H(Ltb/a;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static synthetic m(Ljava/lang/String;IIIIIIILtb/a;)Ljava/util/List;
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "\n        SELECT * FROM table_battery_pack_relative_firmware_packets\n        WHERE meta_battery_serial = ?\n        AND meta_hardware_family = ?\n        AND meta_pcba_revision = ?\n        AND meta_firmware_major = ?\n        AND meta_firmware_minor = ?\n        AND meta_firmware_point = ?\n        AND meta_firmware_extra = ?\n        ORDER BY id ASC\n        LIMIT ?\n        "

    move-object/from16 v2, p8

    invoke-interface {v2, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v1, v2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    invoke-interface {v1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    move/from16 v2, p1

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x3

    move/from16 v2, p2

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x4

    move/from16 v2, p3

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x5

    move/from16 v2, p4

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x6

    move/from16 v2, p5

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x7

    move/from16 v2, p6

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0x8

    move/from16 v2, p7

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "boot_count"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "seconds_since_boot"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "sequence_number"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "packet_data"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "meta_battery_serial"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "meta_hardware_family"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "meta_pcba_revision"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "meta_optical_revision"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "meta_firmware_major"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "meta_firmware_minor"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "meta_firmware_point"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "meta_firmware_extra"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v15

    move-object/from16 p8, v14

    move-wide/from16 p1, v15

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 p3, v14

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move v15, v2

    move/from16 v16, v3

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v5}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_1

    const/16 v17, 0x0

    :goto_2
    move/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 v19, v17

    goto :goto_3

    :cond_1
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    goto :goto_2

    :goto_3
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v20, v2

    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v21, v2

    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v22, v2

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v23, v2

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v24, v2

    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v25, v2

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v18, Lpu0/a;

    move/from16 v26, v2

    invoke-direct/range {v18 .. v26}, Lpu0/a;-><init>(Ljava/lang/String;IIIIIII)V

    new-instance v2, Lpu0/d;

    move-object/from16 p0, v2

    move/from16 p4, v14

    move-object/from16 p7, v18

    invoke-direct/range {p0 .. p7}, Lpu0/d;-><init>(JIIILjava/nio/ByteBuffer;Lpu0/a;)V

    move-object/from16 v2, p0

    move-object/from16 v3, p8

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v14, v3

    move v2, v15

    move/from16 v3, v16

    goto/16 :goto_1

    :cond_2
    move-object v3, v14

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic n(Ltb/a;)Lpu0/d;
    .locals 32

    const-string v0, "SELECT * FROM table_battery_pack_relative_firmware_packets LIMIT 1"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "boot_count"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "seconds_since_boot"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "sequence_number"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "packet_data"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "meta_battery_serial"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "meta_hardware_family"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "meta_pcba_revision"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "meta_optical_revision"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "meta_firmware_major"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "meta_firmware_minor"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "meta_firmware_point"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "meta_firmware_extra"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v17

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v0, v14

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v1, v5}, Ltb/c;->getBlob(I)[B

    move-result-object v4

    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v22

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v24, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v24, v15

    :goto_0
    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v10, v10

    new-instance v23, Lpu0/a;

    move/from16 v25, v4

    move/from16 v26, v5

    move/from16 v27, v6

    move/from16 v28, v7

    move/from16 v29, v8

    move/from16 v30, v9

    move/from16 v31, v10

    invoke-direct/range {v23 .. v31}, Lpu0/a;-><init>(Ljava/lang/String;IIIIIII)V

    new-instance v16, Lpu0/d;

    move/from16 v19, v0

    move/from16 v20, v2

    move/from16 v21, v3

    invoke-direct/range {v16 .. v23}, Lpu0/d;-><init>(JIIILjava/nio/ByteBuffer;Lpu0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v15, v16

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v15, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v15

    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic o(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lou0/f;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a([JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "DELETE FROM table_battery_pack_relative_firmware_packets WHERE id IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, p1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lou0/f;->a:Landroidx/room/z0;

    new-instance v2, Lou0/c;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, v3}, Lou0/c;-><init>(Ljava/lang/String;[JI)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;IIIIIIILq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIIIIII",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lpu0/d;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lou0/f;->a:Landroidx/room/z0;

    new-instance v1, Lou0/b;

    const/4 v10, 0x1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lou0/b;-><init>(Ljava/lang/String;IIIIIIII)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    move-object/from16 p3, p9

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

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
            "Lpu0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lou0/f;->a:Landroidx/room/z0;

    new-instance v1, Lnm1/g;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lnm1/g;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lpu0/d;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu0/d;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lpu0/d;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lou0/e$a;->a(Lou0/e;Lpu0/d;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpu0/d;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lou0/f;->a:Landroidx/room/z0;

    new-instance v1, Lnq0/m;

    const/16 v2, 0xc

    invoke-direct {v1, v2, p0, p1}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
