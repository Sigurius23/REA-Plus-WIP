.class public final Lku0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lku0/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Llu0/b;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llu0/b;

    invoke-direct {v0}, Llu0/b;-><init>()V

    iput-object v0, p0, Lku0/d;->c:Llu0/b;

    iput-object p1, p0, Lku0/d;->a:Landroidx/room/z0;

    new-instance p1, Lku0/d$a;

    invoke-direct {p1, p0}, Lku0/d$a;-><init>(Lku0/d;)V

    iput-object p1, p0, Lku0/d;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic d(Lku0/d;ILtb/a;)Llu0/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lku0/d;->i(ILtb/a;)Llu0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lku0/d;Llu0/c;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lku0/d;->k(Llu0/c;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(IIIIIIILjava/lang/String;IIIIILjava/lang/String;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static/range {p0 .. p14}, Lku0/d;->j(IIIIIIILjava/lang/String;IIIIILjava/lang/String;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g(Lku0/d;)Llu0/b;
    .locals 0

    iget-object p0, p0, Lku0/d;->c:Llu0/b;

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

.method private synthetic i(ILtb/a;)Llu0/c;
    .locals 34

    const-string v0, "SELECT * FROM table_heart_data_versions WHERE version_id == ?"

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p1

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "version_id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "hardware_family"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "pcba_revision"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "optical_revision"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "firmware_major"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "firmware_minor"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "firmware_build"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "firmware_unreleased"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "firmware_version"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "sigproc_major"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "sigproc_minor"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "sigproc_patch"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "binary_version"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "binary_flags"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "strap_id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    const/16 v17, 0x0

    if-eqz v16, :cond_2

    move/from16 p1, v14

    move/from16 p2, v15

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v0, v14

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v2, v14

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v3, v14

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v4, v14

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v5, v14

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v6, v14

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v7, v14

    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v8, v14

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object/from16 v9, v17

    :goto_0
    move-object/from16 v14, p0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    :goto_1
    :try_start_1
    iget-object v15, v14, Lku0/d;->c:Llu0/b;

    invoke-virtual {v15, v9}, Llu0/b;->a(Ljava/lang/String;)Loh2/b;

    move-result-object v27

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v10, v10

    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v11

    long-to-int v11, v11

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v12

    long-to-int v12, v12

    move/from16 v13, p1

    move/from16 v20, v2

    move/from16 v21, v3

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, p2

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    :goto_2
    move-object/from16 v33, v17

    goto :goto_3

    :cond_1
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    goto :goto_2

    :goto_3
    new-instance v18, Llu0/c;

    move/from16 v19, v0

    move/from16 v32, v2

    move/from16 v22, v4

    move/from16 v23, v5

    move/from16 v24, v6

    move/from16 v25, v7

    move/from16 v26, v8

    move/from16 v28, v9

    move/from16 v29, v10

    move/from16 v30, v11

    move/from16 v31, v12

    invoke-direct/range {v18 .. v33}, Llu0/c;-><init>(IIIIIIIILoh2/b;IIIIILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v17, v18

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v14, p0

    goto :goto_5

    :cond_2
    move-object/from16 v14, p0

    :goto_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v17

    :goto_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic j(IIIIIIILjava/lang/String;IIIIILjava/lang/String;Ltb/a;)Ljava/lang/Integer;
    .locals 5

    move-object/from16 v0, p13

    const-string v1, "Select version_id FROM table_heart_data_versions WHERE hardware_family == ? AND pcba_revision == ? AND optical_revision == ? AND firmware_major == ? AND firmware_minor == ? AND firmware_build == ? AND firmware_unreleased == ? AND firmware_version == ? AND sigproc_major == ? AND sigproc_minor == ? AND sigproc_patch == ? AND binary_version == ? AND binary_flags == ? AND strap_id == ?"

    move-object/from16 v2, p14

    invoke-interface {v2, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    int-to-long v3, p0

    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    int-to-long v2, p1

    invoke-interface {v1, p0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    int-to-long p1, p2

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x4

    int-to-long p1, p3

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x5

    int-to-long p1, p4

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x6

    int-to-long p1, p5

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x7

    int-to-long p1, p6

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/16 p0, 0x8

    if-nez p7, :cond_0

    invoke-interface {v1, p0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    :cond_0
    invoke-interface {v1, p0, p7}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/16 p0, 0x9

    int-to-long p1, p8

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/16 p0, 0xa

    int-to-long p1, p9

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/16 p0, 0xb

    int-to-long p1, p10

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/16 p0, 0xc

    move/from16 p1, p11

    int-to-long p1, p1

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/16 p0, 0xd

    move/from16 p1, p12

    int-to-long p1, p1

    invoke-interface {v1, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/16 p0, 0xe

    if-nez v0, :cond_1

    invoke-interface {v1, p0}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v1, p0, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result p0

    const/4 p1, 0x0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    invoke-interface {v1, p0}, Ltb/c;->isNull(I)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v1, p0}, Ltb/c;->getLong(I)J

    move-result-wide p0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic k(Llu0/c;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lku0/d;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Llu0/c;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llu0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lku0/d;->a:Landroidx/room/z0;

    new-instance v1, Ljp1/c;

    const/16 v2, 0xd

    invoke-direct {v1, v2, p0, p1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(IIIIIIILjava/lang/String;IIIIILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIII",
            "Ljava/lang/String;",
            "IIIII",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lku0/d;->a:Landroidx/room/z0;

    new-instance v2, Lku0/b;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    move-object/from16 v16, p14

    invoke-direct/range {v2 .. v16}, Lku0/b;-><init>(IIIIIIILjava/lang/String;IIIIILjava/lang/String;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object/from16 v5, p15

    invoke-static {v1, v3, v4, v2, v5}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public c(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Llu0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lku0/d;->a:Landroidx/room/z0;

    new-instance v1, Lku0/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lku0/c;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
