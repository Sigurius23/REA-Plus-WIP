.class public final Lus1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus1/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

.field private final d:Lvs1/c;

.field private final e:Landroidx/room/i;
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

    new-instance v0, Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

    invoke-direct {v0}, Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;-><init>()V

    iput-object v0, p0, Lus1/b;->c:Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

    new-instance v0, Lvs1/c;

    invoke-direct {v0}, Lvs1/c;-><init>()V

    iput-object v0, p0, Lus1/b;->d:Lvs1/c;

    iput-object p1, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance p1, Lus1/b$a;

    invoke-direct {p1, p0}, Lus1/b$a;-><init>(Lus1/b;)V

    iput-object p1, p0, Lus1/b;->b:Landroidx/room/k;

    new-instance p1, Lus1/b$b;

    invoke-direct {p1, p0}, Lus1/b$b;-><init>(Lus1/b;)V

    iput-object p1, p0, Lus1/b;->e:Landroidx/room/i;

    return-void
.end method

.method public static synthetic g(Lus1/b;Lvs1/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lus1/b;->u(Lvs1/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lus1/b;Ljava/util/List;Ljava/lang/String;JLtb/a;)Ll83/a0;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lus1/b;->v(Ljava/util/List;Ljava/lang/String;JLtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lus1/b;JLtb/a;)Lvs1/a;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lus1/b;->t(JLtb/a;)Lvs1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(JLtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lus1/b;->r(JLtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ZJLtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lus1/b;->w(ZJLtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lus1/b;Ltb/a;)Lvs1/a;
    .locals 0

    invoke-direct {p0, p1}, Lus1/b;->s(Ltb/a;)Lvs1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lus1/b;->q(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n(Lus1/b;)Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;
    .locals 0

    iget-object p0, p0, Lus1/b;->c:Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

    return-object p0
.end method

.method public static bridge synthetic o(Lus1/b;)Lvs1/c;
    .locals 0

    iget-object p0, p0, Lus1/b;->d:Lvs1/c;

    return-object p0
.end method

.method public static p()Ljava/util/List;
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

.method private static synthetic q(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_labrador_reading_result_data"

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

.method private static synthetic r(JLtb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_labrador_reading_result_data WHERE time_stamp = ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Ltb/c;->p(IJ)V

    invoke-interface {p2}, Ltb/c;->e1()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic s(Ltb/a;)Lvs1/a;
    .locals 24

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM table_labrador_reading_result_data ORDER BY time_stamp DESC LIMIT 1"

    move-object/from16 v2, p1

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    const-string v0, "average_hr"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v3, "classification"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "samples"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "time_stamp"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "symptoms_list"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "notes"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "uploaded"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "deleted"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_5

    invoke-interface {v2, v0}, Ltb/c;->getDouble(I)D

    move-result-wide v12

    double-to-float v15, v12

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v12

    long-to-int v0, v12

    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v11

    goto :goto_0

    :cond_0
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    iget-object v4, v1, Lus1/b;->c:Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

    invoke-virtual {v4, v3}, Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v17

    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v18

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v11

    goto :goto_1

    :cond_1
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    iget-object v4, v1, Lus1/b;->d:Lvs1/c;

    invoke-virtual {v4, v3}, Lvs1/c;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v20

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_2
    move-object/from16 v21, v11

    goto :goto_3

    :cond_2
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :goto_3
    invoke-interface {v2, v8}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    move/from16 v22, v5

    goto :goto_4

    :cond_3
    move/from16 v22, v4

    :goto_4
    invoke-interface {v2, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v3, v6

    if-eqz v3, :cond_4

    move/from16 v23, v5

    goto :goto_5

    :cond_4
    move/from16 v23, v4

    :goto_5
    new-instance v14, Lvs1/a;

    move/from16 v16, v0

    invoke-direct/range {v14 .. v23}, Lvs1/a;-><init>(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v11, v14

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_5
    :goto_6
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v11

    :goto_7
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic t(JLtb/a;)Lvs1/a;
    .locals 25

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM table_labrador_reading_result_data WHERE time_stamp = ?"

    move-object/from16 v2, p3

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    const/4 v0, 0x1

    move-wide/from16 v3, p1

    :try_start_0
    invoke-interface {v2, v0, v3, v4}, Ltb/c;->p(IJ)V

    const-string v3, "average_hr"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "classification"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "samples"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "time_stamp"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "symptoms_list"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "notes"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "uploaded"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "deleted"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v11

    const/4 v12, 0x0

    if-eqz v11, :cond_5

    invoke-interface {v2, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v13

    double-to-float v3, v13

    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v4, v13

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_0

    move-object v5, v12

    goto :goto_0

    :cond_0
    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_0
    iget-object v11, v1, Lus1/b;->c:Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;

    invoke-virtual {v11, v5}, Lcom/whoop/labrador/data/dto/FilteredLabradorDataConverter;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v19

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v5, v12

    goto :goto_1

    :cond_1
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    iget-object v6, v1, Lus1/b;->d:Lvs1/c;

    invoke-virtual {v6, v5}, Lvs1/c;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    :goto_2
    move-object/from16 v22, v12

    goto :goto_3

    :cond_2
    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_2

    :goto_3
    invoke-interface {v2, v9}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move/from16 v23, v0

    goto :goto_4

    :cond_3
    move/from16 v23, v6

    :goto_4
    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v5, v7

    if-eqz v5, :cond_4

    move/from16 v24, v0

    goto :goto_5

    :cond_4
    move/from16 v24, v6

    :goto_5
    new-instance v15, Lvs1/a;

    move/from16 v16, v3

    move/from16 v17, v4

    invoke-direct/range {v15 .. v24}, Lvs1/a;-><init>(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v15

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_5
    :goto_6
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v12

    :goto_7
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic u(Lvs1/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lus1/b;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic v(Ljava/util/List;Ljava/lang/String;JLtb/a;)Ll83/a0;
    .locals 1

    const-string v0, "UPDATE table_labrador_reading_result_data SET symptoms_list = ?, notes = ? WHERE time_stamp = ?"

    invoke-interface {p5, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p5

    :try_start_0
    iget-object v0, p0, Lus1/b;->d:Lvs1/c;

    invoke-virtual {v0, p1}, Lvs1/c;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-interface {p5, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-interface {p5, v0, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x2

    if-nez p2, :cond_1

    invoke-interface {p5, p1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p5, p1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 p1, 0x3

    invoke-interface {p5, p1, p3, p4}, Ltb/c;->p(IJ)V

    invoke-interface {p5}, Ltb/c;->e1()Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p5}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_2
    invoke-interface {p5}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static synthetic w(ZJLtb/a;)Ll83/a0;
    .locals 2

    const-string v0, "UPDATE table_labrador_reading_result_data SET uploaded = ? WHERE time_stamp = ?"

    invoke-interface {p3, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p3

    int-to-long v0, p0

    const/4 p0, 0x1

    :try_start_0
    invoke-interface {p3, p0, v0, v1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {p3, p0, p1, p2}, Ltb/c;->p(IJ)V

    invoke-interface {p3}, Ltb/c;->e1()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method


# virtual methods
.method public a(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Lf0/r;

    move-object v2, p0

    move-wide v5, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v1 .. v6}, Lf0/r;-><init>(Lus1/b;Ljava/util/List;Ljava/lang/String;J)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p5}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Lsz0/p1;

    const/4 v2, 0x3

    invoke-direct {v1, p1, p2, v2}, Lsz0/p1;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lvs1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Lg1/d4;

    const/4 v2, 0x5

    invoke-direct {v1, p0, p1, p2, v2}, Lg1/d4;-><init>(Ljava/lang/Object;JI)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvs1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Luo1/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

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

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Luk2/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Luk2/a;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lvs1/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvs1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Lum0/b;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(JZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lus1/b;->a:Landroidx/room/z0;

    new-instance v1, Lio2/f;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1, p2, p3}, Lio2/f;-><init>(IJZ)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
