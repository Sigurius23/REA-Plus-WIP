.class public final Le9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp9/l;

.field public final b:La00/g;

.field public final c:[I

.field public final d:I

.field public final e:Lz8/f;

.field public final f:J

.field public final g:I

.field public final h:Le9/o;

.field public final i:[Le9/j;

.field public j:Lo9/s;

.field public k:Lf9/c;

.field public l:I

.field public m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

.field public n:Z


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/g1;Lp9/l;Lf9/c;La00/g;I[ILo9/s;ILz8/f;JIZLjava/util/ArrayList;Le9/o;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p7

    move/from16 v6, p8

    move-object/from16 v7, p15

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v8, p2

    iput-object v8, v0, Le9/l;->a:Lp9/l;

    iput-object v2, v0, Le9/l;->k:Lf9/c;

    iput-object v3, v0, Le9/l;->b:La00/g;

    move-object/from16 v8, p6

    iput-object v8, v0, Le9/l;->c:[I

    iput-object v5, v0, Le9/l;->j:Lo9/s;

    iput v6, v0, Le9/l;->d:I

    move-object/from16 v8, p9

    iput-object v8, v0, Le9/l;->e:Lz8/f;

    iput v4, v0, Le9/l;->l:I

    move-wide/from16 v8, p10

    iput-wide v8, v0, Le9/l;->f:J

    move/from16 v8, p12

    iput v8, v0, Le9/l;->g:I

    iput-object v7, v0, Le9/l;->h:Le9/o;

    invoke-virtual {v2, v4}, Lf9/c;->c(I)J

    move-result-wide v9

    invoke-virtual {v0}, Le9/l;->a()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v5}, Lo9/s;->length()I

    move-result v4

    new-array v4, v4, [Le9/j;

    iput-object v4, v0, Le9/l;->i:[Le9/j;

    const/4 v4, 0x0

    move v8, v4

    :goto_0
    iget-object v11, v0, Le9/l;->i:[Le9/j;

    array-length v11, v11

    if-ge v8, v11, :cond_b

    invoke-interface {v5, v8}, Lo9/s;->e(I)I

    move-result v11

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf9/m;

    iget-object v12, v11, Lf9/m;->x:Lzr/g0;

    invoke-virtual {v3, v12}, La00/g;->C(Ljava/util/List;)Lf9/b;

    move-result-object v12

    iget-object v13, v0, Le9/l;->i:[Le9/j;

    move v14, v8

    new-instance v8, Le9/j;

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    iget-object v12, v11, Lf9/m;->x:Lzr/g0;

    invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf9/b;

    :goto_1
    iget-object v15, v11, Lf9/m;->w:Lu8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v15, Lu8/p;->m:Ljava/lang/String;

    invoke-static {v4}, Lu8/d0;->m(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_2

    iget-boolean v4, v1, Lcom/iterable/iterableapi/g1;->w:Z

    if-nez v4, :cond_1

    const/4 v4, 0x0

    move-object/from16 p3, v2

    move/from16 p5, v14

    goto/16 :goto_8

    :cond_1
    new-instance v4, Lqa/h;

    iget-object v0, v1, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v0, Ljc/b;

    invoke-virtual {v0, v15}, Ljc/b;->h(Lu8/p;)Lqa/l;

    move-result-object v0

    invoke-direct {v4, v0, v15}, Lqa/h;-><init>(Lqa/l;Lu8/p;)V

    :goto_2
    move-object/from16 p3, v2

    :goto_3
    move/from16 p5, v14

    move-object/from16 v14, p14

    goto/16 :goto_7

    :cond_2
    if-nez v4, :cond_3

    goto :goto_4

    :cond_3
    const-string v0, "video/webm"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "audio/webm"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "application/webm"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "video/x-matroska"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "audio/x-matroska"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "application/x-matroska"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move-object/from16 p3, v2

    move/from16 p5, v14

    const/4 v0, 0x1

    move-object/from16 v14, p14

    goto :goto_6

    :cond_5
    :goto_4
    const-string v0, "image/jpeg"

    invoke-static {v4, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v4, Lpa/a;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Lpa/a;-><init>(I)V

    goto :goto_2

    :cond_6
    const-string v0, "image/png"

    invoke-static {v4, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v4, Lpa/a;

    const/4 v0, 0x0

    move-object/from16 p3, v2

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lpa/a;-><init>(IB)V

    goto :goto_3

    :cond_7
    move-object/from16 p3, v2

    if-eqz p13, :cond_8

    const/4 v0, 0x4

    goto :goto_5

    :cond_8
    const/4 v0, 0x0

    :goto_5
    iget-boolean v2, v1, Lcom/iterable/iterableapi/g1;->w:Z

    if-nez v2, :cond_9

    or-int/lit8 v0, v0, 0x20

    :cond_9
    new-instance v4, Lna/h;

    iget-object v2, v1, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    move/from16 p5, v14

    move-object/from16 v14, p14

    invoke-direct {v4, v2, v0, v14, v7}, Lna/h;-><init>(Lqa/j;ILjava/util/List;Le9/o;)V

    goto :goto_7

    :goto_6
    iget-boolean v2, v1, Lcom/iterable/iterableapi/g1;->w:Z

    if-nez v2, :cond_a

    const/4 v0, 0x3

    :cond_a
    new-instance v4, Lla/d;

    iget-object v2, v1, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    invoke-direct {v4, v2, v0}, Lla/d;-><init>(Lqa/j;I)V

    :goto_7
    new-instance v0, Lm9/c;

    invoke-direct {v0, v4, v6, v15}, Lm9/c;-><init>(Lt9/n;ILu8/p;)V

    move-object v4, v0

    :goto_8
    const-wide/16 v14, 0x0

    invoke-virtual {v11}, Lf9/m;->c()Le9/i;

    move-result-object v16

    move-object v0, v13

    move-object v13, v4

    move/from16 v4, p5

    invoke-direct/range {v8 .. v16}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    aput-object v8, v0, v4

    add-int/lit8 v8, v4, 0x1

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_b
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Le9/l;->k:Lf9/c;

    iget v1, p0, Le9/l;->l:I

    invoke-virtual {v0, v1}, Lf9/c;->a(I)Lf9/h;

    move-result-object v0

    iget-object v0, v0, Lf9/h;->c:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Le9/l;->c:[I

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/a;

    iget-object v5, v5, Lf9/a;->c:Ljava/util/List;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final b(I)Le9/j;
    .locals 13

    iget-object v0, p0, Le9/l;->i:[Le9/j;

    aget-object v1, v0, p1

    iget-object v2, v1, Le9/j;->b:Lf9/m;

    iget-object v2, v2, Lf9/m;->x:Lzr/g0;

    iget-object v3, p0, Le9/l;->b:La00/g;

    invoke-virtual {v3, v2}, La00/g;->C(Ljava/util/List;)Lf9/b;

    move-result-object v8

    if-eqz v8, :cond_0

    iget-object v2, v1, Le9/j;->c:Lf9/b;

    invoke-virtual {v8, v2}, Lf9/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v4, Le9/j;

    iget-wide v5, v1, Le9/j;->e:J

    iget-object v7, v1, Le9/j;->b:Lf9/m;

    iget-object v9, v1, Le9/j;->a:Lm9/c;

    iget-wide v10, v1, Le9/j;->f:J

    iget-object v12, v1, Le9/j;->d:Le9/i;

    invoke-direct/range {v4 .. v12}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    aput-object v4, v0, p1

    return-object v4

    :cond_0
    return-object v1
.end method
