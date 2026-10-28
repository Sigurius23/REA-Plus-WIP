.class public final Lfu0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfu0/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lgu0/b;

.field private final d:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgu0/b;

    invoke-direct {v0}, Lgu0/b;-><init>()V

    iput-object v0, p0, Lfu0/c;->c:Lgu0/b;

    iput-object p1, p0, Lfu0/c;->a:Landroidx/room/z0;

    new-instance p1, Lfu0/c$a;

    invoke-direct {p1, p0}, Lfu0/c$a;-><init>(Lfu0/c;)V

    iput-object p1, p0, Lfu0/c;->b:Landroidx/room/k;

    new-instance p1, Lfu0/c$b;

    invoke-direct {p1, p0}, Lfu0/c$b;-><init>(Lfu0/c;)V

    iput-object p1, p0, Lfu0/c;->d:Landroidx/room/i;

    return-void
.end method

.method public static synthetic c(Lfu0/c;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1, p2}, Lfu0/c;->i(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lfu0/c;->l(Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lfu0/c;Ljava/util/List;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lfu0/c;->k(Ljava/util/List;Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lfu0/c;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lfu0/c;->j(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g(Lfu0/c;)Lgu0/b;
    .locals 0

    iget-object p0, p0, Lfu0/c;->c:Lgu0/b;

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

.method private synthetic i(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lfu0/c;->d:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handleMultiple(Ltb/a;Ljava/lang/Iterable;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private synthetic j(ILtb/a;)Ljava/util/List;
    .locals 19

    const-string v0, "SELECT * FROM table_rev2_data_settings ORDER BY id ASC LIMIT ?"

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

    const-string v2, "packet_time_stamp"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "sequence_no"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "metadata"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "subtype"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "received_packet_raw"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v10

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v12

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x0

    :goto_1
    move-object/from16 v9, p0

    move/from16 p1, v0

    goto :goto_2

    :cond_0
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :goto_2
    iget-object v0, v9, Lfu0/c;->c:Lgu0/b;

    invoke-virtual {v0, v8}, Lgu0/b;->b(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    move-result-object v16

    move/from16 p2, v2

    move v0, v3

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v6}, Ltb/c;->getBlob(I)[B

    move-result-object v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v18

    new-instance v9, Lgu0/a;

    move/from16 v17, v2

    invoke-direct/range {v9 .. v18}, Lgu0/a;-><init>(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;ILjava/nio/ByteBuffer;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, p2

    move v3, v0

    move/from16 v0, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v7

    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic k(Ljava/util/List;Ltb/a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lfu0/c;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insertAndReturnIdsList(Ltb/a;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic l(Ltb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT MAX(packet_time_stamp) FROM table_rev2_data_settings"

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
            "Lgu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lfu0/c;->a:Landroidx/room/z0;

    new-instance v1, Lfu0/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lfu0/b;-><init>(Lfu0/c;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

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
            "Lgu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lfu0/c;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lfu0/c;->a:Landroidx/room/z0;

    new-instance v1, Lfu0/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lfu0/b;-><init>(Lfu0/c;Ljava/util/List;I)V

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

    iget-object v0, p0, Lfu0/c;->a:Landroidx/room/z0;

    const-string v1, "table_rev2_data_settings"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lfq2/c;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lfq2/c;-><init>(I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method
