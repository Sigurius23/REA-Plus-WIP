.class public final Le9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/a0;
.implements Ll9/a1;
.implements Lm9/f;


# static fields
.field public static final Z:Ljava/util/regex/Pattern;

.field public static final a0:Ljava/util/regex/Pattern;


# instance fields
.field public final E:Ljc/b;

.field public final F:La00/g;

.field public final G:J

.field public final H:Lp9/l;

.field public final I:Lko/o;

.field public final J:Ll9/g1;

.field public final K:[Le9/a;

.field public final L:Lg73/a;

.field public final M:Le9/p;

.field public final N:Ljava/util/IdentityHashMap;

.field public final O:Lg9/d;

.field public final P:Lg9/d;

.field public Q:Ll9/z;

.field public R:[Lm9/g;

.field public S:[Le9/m;

.field public T:Ll9/l;

.field public U:Lf9/c;

.field public V:I

.field public W:Ljava/util/List;

.field public X:Z

.field public Y:J

.field public final w:I

.field public final x:Lab/h0;

.field public final y:Lz8/n;

.field public final z:Lg9/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "CC([1-4])=(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le9/b;->Z:Ljava/util/regex/Pattern;

    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le9/b;->a0:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(ILf9/c;La00/g;ILab/h0;Lz8/n;Lg9/h;Lg9/d;Ljc/b;Lg9/d;JLp9/l;Lko/o;Lg73/a;Le9/d;Lc9/n;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    move-object/from16 v5, p14

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move/from16 v6, p1

    iput v6, v0, Le9/b;->w:I

    iput-object v1, v0, Le9/b;->U:Lf9/c;

    move-object/from16 v6, p3

    iput-object v6, v0, Le9/b;->F:La00/g;

    iput v2, v0, Le9/b;->V:I

    iput-object v3, v0, Le9/b;->x:Lab/h0;

    move-object/from16 v6, p6

    iput-object v6, v0, Le9/b;->y:Lz8/n;

    iput-object v4, v0, Le9/b;->z:Lg9/h;

    move-object/from16 v6, p8

    iput-object v6, v0, Le9/b;->P:Lg9/d;

    move-object/from16 v6, p9

    iput-object v6, v0, Le9/b;->E:Ljc/b;

    move-object/from16 v6, p10

    iput-object v6, v0, Le9/b;->O:Lg9/d;

    move-wide/from16 v6, p11

    iput-wide v6, v0, Le9/b;->G:J

    move-object/from16 v6, p13

    iput-object v6, v0, Le9/b;->H:Lp9/l;

    iput-object v5, v0, Le9/b;->I:Lko/o;

    move-object/from16 v6, p15

    iput-object v6, v0, Le9/b;->L:Lg73/a;

    const/4 v7, 0x1

    iput-boolean v7, v0, Le9/b;->X:Z

    new-instance v8, Le9/p;

    move-object/from16 v9, p16

    invoke-direct {v8, v1, v9, v5}, Le9/p;-><init>(Lf9/c;Le9/d;Lko/o;)V

    iput-object v8, v0, Le9/b;->M:Le9/p;

    const/4 v5, 0x0

    new-array v8, v5, [Lm9/g;

    iput-object v8, v0, Le9/b;->R:[Lm9/g;

    new-array v8, v5, [Le9/m;

    iput-object v8, v0, Le9/b;->S:[Le9/m;

    new-instance v8, Ljava/util/IdentityHashMap;

    invoke-direct {v8}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v8, v0, Le9/b;->N:Ljava/util/IdentityHashMap;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Ll9/l;

    sget-object v8, Lzr/g0;->x:Lzr/e0;

    sget-object v8, Lzr/w0;->E:Lzr/w0;

    invoke-direct {v6, v8, v8}, Ll9/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    iput-object v6, v0, Le9/b;->T:Ll9/l;

    invoke-virtual {v1, v2}, Lf9/c;->a(I)Lf9/h;

    move-result-object v1

    iget-object v2, v1, Lf9/h;->d:Ljava/util/List;

    iput-object v2, v0, Le9/b;->W:Ljava/util/List;

    iget-object v1, v1, Lf9/h;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    new-instance v8, Ljava/util/HashMap;

    invoke-static {v6}, Lzr/q;->a(I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/HashMap;-><init>(I)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v10, Landroid/util/SparseArray;

    invoke-direct {v10, v6}, Landroid/util/SparseArray;-><init>(I)V

    move v11, v5

    :goto_0
    if-ge v11, v6, :cond_0

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf9/a;

    iget-wide v12, v12, Lf9/a;->a:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v11, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    move v11, v5

    :goto_1
    const/4 v12, -0x1

    if-ge v11, v6, :cond_a

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf9/a;

    iget-object v14, v13, Lf9/a;->e:Ljava/util/List;

    iget-object v15, v13, Lf9/a;->f:Ljava/util/List;

    move/from16 p1, v7

    const-string v7, "http://dashif.org/guidelines/trickmode"

    invoke-static {v7, v14}, Le9/b;->g(Ljava/lang/String;Ljava/util/List;)Lf9/f;

    move-result-object v14

    if-nez v14, :cond_1

    invoke-static {v7, v15}, Le9/b;->g(Ljava/lang/String;Ljava/util/List;)Lf9/f;

    move-result-object v14

    :cond_1
    if-eqz v14, :cond_2

    iget-object v7, v14, Lf9/f;->b:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_2

    :cond_2
    move v7, v11

    :goto_2
    if-ne v7, v11, :cond_8

    const-string v14, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-static {v14, v15}, Le9/b;->g(Ljava/lang/String;Ljava/util/List;)Lf9/f;

    move-result-object v14

    if-eqz v14, :cond_8

    iget-object v14, v14, Lf9/f;->b:Ljava/lang/String;

    sget v15, Lx8/t;->a:I

    const-string v15, ","

    invoke-virtual {v14, v15, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    array-length v14, v12

    move v15, v5

    :goto_3
    if-ge v15, v14, :cond_8

    aget-object v16, v12, v15

    invoke-static/range {v16 .. v16}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_6

    move-object/from16 p2, v5

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/a;

    move/from16 p4, v6

    iget v6, v13, Lf9/a;->b:I

    move-object/from16 p6, v8

    iget-object v8, v13, Lf9/a;->c:Ljava/util/List;

    move-object/from16 p8, v12

    iget v12, v5, Lf9/a;->b:I

    iget-object v5, v5, Lf9/a;->c:Ljava/util/List;

    if-eq v6, v12, :cond_3

    goto :goto_5

    :cond_3
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf9/m;

    iget-object v8, v8, Lf9/m;->w:Lu8/p;

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/m;

    iget-object v5, v5, Lf9/m;->w:Lu8/p;

    iget-object v6, v8, Lu8/p;->d:Ljava/lang/String;

    iget-object v12, v5, Lu8/p;->d:Ljava/lang/String;

    invoke-static {v6, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget v6, v8, Lu8/p;->f:I

    iget v5, v5, Lu8/p;->f:I

    if-ne v6, v5, :cond_7

    :cond_5
    :goto_4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v7, v5

    goto :goto_5

    :cond_6
    move/from16 p4, v6

    move-object/from16 p6, v8

    move-object/from16 p8, v12

    :cond_7
    :goto_5
    add-int/lit8 v15, v15, 0x1

    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v12, p8

    const/4 v5, 0x0

    goto :goto_3

    :cond_8
    move/from16 p4, v6

    move-object/from16 p6, v8

    if-eq v7, v11, :cond_9

    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v10, v11, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_9
    add-int/lit8 v11, v11, 0x1

    move/from16 v7, p1

    move/from16 v6, p4

    move-object/from16 v8, p6

    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_a
    move/from16 p1, v7

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v6, v5, [[I

    const/4 v7, 0x0

    :goto_6
    if-ge v7, v5, :cond_b

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v8}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_b
    new-array v7, v5, [Z

    new-array v8, v5, [[Lu8/p;

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_7
    if-ge v9, v5, :cond_14

    aget-object v11, v6, v9

    array-length v13, v11

    const/4 v14, 0x0

    :goto_8
    if-ge v14, v13, :cond_e

    aget v15, v11, v14

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lf9/a;

    iget-object v15, v15, Lf9/a;->c:Ljava/util/List;

    move-object/from16 v16, v6

    const/4 v12, 0x0

    :goto_9
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v6

    if-ge v12, v6, :cond_d

    invoke-interface {v15, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf9/m;

    iget-object v6, v6, Lf9/m;->z:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_c

    aput-boolean p1, v7, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_c
    add-int/lit8 v12, v12, 0x1

    goto :goto_9

    :cond_d
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v16

    const/4 v12, -0x1

    goto :goto_8

    :cond_e
    move-object/from16 v16, v6

    :goto_a
    aget-object v6, v16, v9

    array-length v11, v6

    const/4 v12, 0x0

    :goto_b
    if-ge v12, v11, :cond_12

    aget v13, v6, v12

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lf9/a;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf9/a;

    iget-object v13, v13, Lf9/a;->d:Ljava/util/List;

    move-object/from16 p4, v6

    const/4 v15, 0x0

    :goto_c
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v6

    if-ge v15, v6, :cond_11

    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf9/f;

    move-object/from16 v17, v7

    const-string v7, "urn:scte:dash:cc:cea-608:2015"

    move-object/from16 p6, v8

    iget-object v8, v6, Lf9/f;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    new-instance v7, Lu8/o;

    invoke-direct {v7}, Lu8/o;-><init>()V

    const-string v8, "application/cea-608"

    invoke-static {v8}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lu8/o;->m:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v11, v14, Lf9/a;->a:J

    const-string v13, ":cea608"

    invoke-static {v11, v12, v13, v8}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lu8/o;->a:Ljava/lang/String;

    new-instance v8, Lu8/p;

    invoke-direct {v8, v7}, Lu8/p;-><init>(Lu8/o;)V

    sget-object v7, Le9/b;->Z:Ljava/util/regex/Pattern;

    invoke-static {v6, v7, v8}, Le9/b;->o(Lf9/f;Ljava/util/regex/Pattern;Lu8/p;)[Lu8/p;

    move-result-object v6

    goto :goto_d

    :cond_f
    const-string v7, "urn:scte:dash:cc:cea-708:2015"

    iget-object v8, v6, Lf9/f;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    new-instance v7, Lu8/o;

    invoke-direct {v7}, Lu8/o;-><init>()V

    const-string v8, "application/cea-708"

    invoke-static {v8}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lu8/o;->m:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v11, v14, Lf9/a;->a:J

    const-string v13, ":cea708"

    invoke-static {v11, v12, v13, v8}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lu8/o;->a:Ljava/lang/String;

    new-instance v8, Lu8/p;

    invoke-direct {v8, v7}, Lu8/p;-><init>(Lu8/o;)V

    sget-object v7, Le9/b;->a0:Ljava/util/regex/Pattern;

    invoke-static {v6, v7, v8}, Le9/b;->o(Lf9/f;Ljava/util/regex/Pattern;Lu8/p;)[Lu8/p;

    move-result-object v6

    goto :goto_d

    :cond_10
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v8, p6

    move-object/from16 v7, v17

    goto :goto_c

    :cond_11
    move-object/from16 v17, v7

    move-object/from16 p6, v8

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v6, p4

    goto/16 :goto_b

    :cond_12
    move-object/from16 v17, v7

    move-object/from16 p6, v8

    const/4 v6, 0x0

    new-array v7, v6, [Lu8/p;

    move-object v6, v7

    :goto_d
    aput-object v6, p6, v9

    array-length v6, v6

    if-eqz v6, :cond_13

    add-int/lit8 v10, v10, 0x1

    :cond_13
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v8, p6

    move-object/from16 v6, v16

    move-object/from16 v7, v17

    const/4 v12, -0x1

    goto/16 :goto_7

    :cond_14
    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 p6, v8

    add-int/2addr v10, v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v6, v10

    new-array v7, v6, [Lu8/p0;

    new-array v6, v6, [Le9/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_e
    const-string v10, "application/x-emsg"

    if-ge v8, v5, :cond_1c

    aget-object v11, v16, v8

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    array-length v13, v11

    const/4 v14, 0x0

    :goto_f
    if-ge v14, v13, :cond_15

    aget v15, v11, v14

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lf9/a;

    iget-object v15, v15, Lf9/a;->c:Ljava/util/List;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_f

    :cond_15
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    new-array v14, v13, [Lu8/p;

    const/4 v15, 0x0

    :goto_10
    if-ge v15, v13, :cond_16

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move/from16 p1, v5

    move-object/from16 v5, v18

    check-cast v5, Lf9/m;

    iget-object v5, v5, Lf9/m;->w:Lu8/p;

    move/from16 p12, v9

    invoke-virtual {v5}, Lu8/p;->a()Lu8/o;

    move-result-object v9

    invoke-interface {v4, v5}, Lg9/h;->a(Lu8/p;)I

    move-result v5

    iput v5, v9, Lu8/o;->L:I

    new-instance v5, Lu8/p;

    invoke-direct {v5, v9}, Lu8/p;-><init>(Lu8/o;)V

    aput-object v5, v14, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v5, p1

    move/from16 v9, p12

    goto :goto_10

    :cond_16
    move/from16 p1, v5

    move/from16 p12, v9

    const/4 v5, 0x0

    aget v9, v11, v5

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/a;

    iget-wide v12, v5, Lf9/a;->a:J

    const-wide/16 v18, -0x1

    cmp-long v9, v12, v18

    if-eqz v9, :cond_17

    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v9

    goto :goto_11

    :cond_17
    const-string v9, "unset:"

    invoke-static {v8, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :goto_11
    add-int/lit8 v12, p12, 0x1

    aget-boolean v13, v17, v8

    if-eqz v13, :cond_18

    add-int/lit8 v13, p12, 0x2

    goto :goto_12

    :cond_18
    move v13, v12

    const/4 v12, -0x1

    :goto_12
    aget-object v15, p6, v8

    array-length v15, v15

    if-eqz v15, :cond_19

    add-int/lit8 v15, v13, 0x1

    goto :goto_13

    :cond_19
    move v15, v13

    const/4 v13, -0x1

    :goto_13
    invoke-static {v3, v14}, Le9/b;->l(Lab/h0;[Lu8/p;)V

    move-object/from16 v18, v1

    new-instance v1, Lu8/p0;

    invoke-direct {v1, v9, v14}, Lu8/p0;-><init>(Ljava/lang/String;[Lu8/p;)V

    aput-object v1, v7, p12

    iget v1, v5, Lf9/a;->b:I

    new-instance v5, Le9/a;

    sget-object v14, Lzr/g0;->x:Lzr/e0;

    sget-object v14, Lzr/w0;->E:Lzr/w0;

    const/16 v19, 0x0

    const/16 v20, -0x1

    move/from16 p9, v1

    move-object/from16 p8, v5

    move-object/from16 p11, v11

    move/from16 p13, v12

    move/from16 p14, v13

    move-object/from16 p16, v14

    move/from16 p10, v19

    move/from16 p15, v20

    invoke-direct/range {p8 .. p16}, Le9/a;-><init>(II[IIIIILzr/g0;)V

    move-object/from16 v11, p8

    move-object/from16 v5, p11

    move/from16 v1, p12

    aput-object v11, v6, v1

    const/4 v11, -0x1

    if-eq v12, v11, :cond_1a

    const-string v11, ":emsg"

    invoke-static {v9, v11}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move/from16 p12, v1

    new-instance v1, Lu8/o;

    invoke-direct {v1}, Lu8/o;-><init>()V

    iput-object v11, v1, Lu8/o;->a:Ljava/lang/String;

    invoke-static {v10}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v1, Lu8/o;->m:Ljava/lang/String;

    new-instance v10, Lu8/p;

    invoke-direct {v10, v1}, Lu8/p;-><init>(Lu8/o;)V

    new-instance v1, Lu8/p0;

    filled-new-array {v10}, [Lu8/p;

    move-result-object v10

    invoke-direct {v1, v11, v10}, Lu8/p0;-><init>(Ljava/lang/String;[Lu8/p;)V

    aput-object v1, v7, v12

    new-instance v1, Le9/a;

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/16 v19, 0x5

    const/16 v20, 0x1

    const/16 v21, -0x1

    move-object/from16 p8, v1

    move-object/from16 p11, v5

    move/from16 p14, v10

    move/from16 p15, v11

    move-object/from16 p16, v14

    move/from16 p9, v19

    move/from16 p10, v20

    move/from16 p13, v21

    invoke-direct/range {p8 .. p16}, Le9/a;-><init>(II[IIIIILzr/g0;)V

    move-object/from16 v10, p8

    move/from16 v1, p12

    aput-object v10, v6, v12

    const/4 v11, -0x1

    :cond_1a
    if-eq v13, v11, :cond_1b

    const-string v10, ":cc"

    invoke-static {v9, v10}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    aget-object v10, p6, v8

    invoke-static {v10}, Lzr/g0;->n([Ljava/lang/Object;)Lzr/w0;

    move-result-object v10

    new-instance v12, Le9/a;

    const/4 v14, -0x1

    const/16 v19, -0x1

    const/16 v20, 0x3

    const/16 v21, 0x1

    const/16 v22, -0x1

    move/from16 p12, v1

    move-object/from16 p11, v5

    move-object/from16 p16, v10

    move-object/from16 p8, v12

    move/from16 p14, v14

    move/from16 p15, v19

    move/from16 p9, v20

    move/from16 p10, v21

    move/from16 p13, v22

    invoke-direct/range {p8 .. p16}, Le9/a;-><init>(II[IIIIILzr/g0;)V

    move-object/from16 v1, p8

    aput-object v1, v6, v13

    aget-object v1, p6, v8

    invoke-static {v3, v1}, Le9/b;->l(Lab/h0;[Lu8/p;)V

    new-instance v1, Lu8/p0;

    aget-object v5, p6, v8

    invoke-direct {v1, v9, v5}, Lu8/p0;-><init>(Ljava/lang/String;[Lu8/p;)V

    aput-object v1, v7, v13

    :cond_1b
    add-int/lit8 v8, v8, 0x1

    move/from16 v5, p1

    move v9, v15

    move-object/from16 v1, v18

    goto/16 :goto_e

    :cond_1c
    move v1, v9

    const/4 v1, 0x0

    :goto_14
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1d

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf9/g;

    new-instance v4, Lu8/o;

    invoke-direct {v4}, Lu8/o;-><init>()V

    invoke-virtual {v3}, Lf9/g;->a()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lu8/o;->a:Ljava/lang/String;

    invoke-static {v10}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lu8/o;->m:Ljava/lang/String;

    new-instance v5, Lu8/p;

    invoke-direct {v5, v4}, Lu8/p;-><init>(Lu8/o;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lf9/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lu8/p0;

    filled-new-array {v5}, [Lu8/p;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lu8/p0;-><init>(Ljava/lang/String;[Lu8/p;)V

    aput-object v4, v7, v9

    add-int/lit8 v3, v9, 0x1

    new-instance v4, Le9/a;

    const/4 v5, 0x0

    new-array v8, v5, [I

    sget-object v11, Lzr/g0;->x:Lzr/e0;

    sget-object v11, Lzr/w0;->E:Lzr/w0;

    const/4 v12, 0x5

    const/4 v13, 0x2

    const/4 v14, -0x1

    const/4 v15, -0x1

    const/16 v16, -0x1

    move/from16 p14, v1

    move-object/from16 p7, v4

    move-object/from16 p10, v8

    move-object/from16 p15, v11

    move/from16 p8, v12

    move/from16 p9, v13

    move/from16 p11, v14

    move/from16 p12, v15

    move/from16 p13, v16

    invoke-direct/range {p7 .. p15}, Le9/a;-><init>(II[IIIIILzr/g0;)V

    aput-object v4, v6, v9

    add-int/lit8 v1, v1, 0x1

    move v9, v3

    goto :goto_14

    :cond_1d
    new-instance v1, Ll9/g1;

    invoke-direct {v1, v7}, Ll9/g1;-><init>([Lu8/p0;)V

    invoke-static {v1, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ll9/g1;

    iput-object v2, v0, Le9/b;->J:Ll9/g1;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [Le9/a;

    iput-object v1, v0, Le9/b;->K:[Le9/a;

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/util/List;)Lf9/f;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf9/f;

    iget-object v2, v1, Lf9/f;->a:Ljava/lang/String;

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Lab/h0;[Lu8/p;)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_2

    aget-object v1, p1, v0

    iget-object v2, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v2, Lcom/iterable/iterableapi/g1;

    iget-boolean v3, v2, Lcom/iterable/iterableapi/g1;->w:Z

    if-eqz v3, :cond_1

    iget-object v3, v2, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v3, Ljc/b;

    invoke-virtual {v3, v1}, Ljc/b;->g(Lu8/p;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lu8/p;->a()Lu8/o;

    move-result-object v3

    iget-object v4, v1, Lu8/p;->k:Ljava/lang/String;

    const-string v5, "application/x-media3-cues"

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lu8/o;->m:Ljava/lang/String;

    iget-object v2, v2, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    invoke-virtual {v2, v1}, Ljc/b;->i(Lu8/p;)I

    move-result v2

    iput v2, v3, Lu8/o;->I:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v4, :cond_0

    const-string v1, " "

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    const-string v1, ""

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Lu8/o;->j:Ljava/lang/String;

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, v3, Lu8/o;->r:J

    new-instance v1, Lu8/p;

    invoke-direct {v1, v3}, Lu8/p;-><init>(Lu8/o;)V

    :cond_1
    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static o(Lf9/f;Ljava/util/regex/Pattern;Lu8/p;)[Lu8/p;
    .locals 7

    iget-object p0, p0, Lf9/f;->b:Ljava/lang/String;

    if-nez p0, :cond_0

    filled-new-array {p2}, [Lu8/p;

    move-result-object p0

    return-object p0

    :cond_0
    sget v0, Lx8/t;->a:I

    const/4 v0, -0x1

    const-string v1, ";"

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    new-array v0, v0, [Lu8/p;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    aget-object v2, p0, v1

    invoke-virtual {p1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-nez v3, :cond_1

    filled-new-array {p2}, [Lu8/p;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2}, Lu8/p;->a()Lu8/o;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p2, Lu8/p;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ":"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lu8/o;->a:Ljava/lang/String;

    iput v3, v4, Lu8/o;->H:I

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Lu8/o;->d:Ljava/lang/String;

    new-instance v2, Lu8/p;

    invoke-direct {v2, v4}, Lu8/p;-><init>(Lu8/o;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Le9/b;->T:Ll9/l;

    invoke-virtual {v0}, Ll9/l;->a()Z

    move-result v0

    return v0
.end method

.method public final b(Ll9/b1;)V
    .locals 0

    iget-object p1, p0, Le9/b;->Q:Ll9/z;

    invoke-interface {p1, p0}, Ll9/a1;->b(Ll9/b1;)V

    return-void
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Le9/b;->T:Ll9/l;

    invoke-virtual {v0}, Ll9/l;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-object v3, v0, Le9/b;->R:[Lm9/g;

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_b

    aget-object v10, v3, v6

    iget-object v11, v10, Lm9/g;->N:[Ll9/y0;

    iget-object v12, v10, Lm9/g;->M:Ll9/y0;

    iget-object v13, v10, Lm9/g;->I:Lp9/k;

    iget-object v14, v10, Lm9/g;->K:Ljava/util/ArrayList;

    iput-wide v1, v10, Lm9/g;->T:J

    iput-boolean v5, v10, Lm9/g;->W:Z

    invoke-virtual {v10}, Lm9/g;->z()Z

    move-result v15

    if-eqz v15, :cond_0

    iput-wide v1, v10, Lm9/g;->S:J

    move v9, v5

    move/from16 v18, v6

    goto/16 :goto_9

    :cond_0
    move v15, v5

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v15, v7, :cond_3

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm9/a;

    iget-wide v8, v7, Lm9/d;->G:J

    cmp-long v8, v8, v1

    move/from16 v18, v6

    if-nez v8, :cond_1

    iget-wide v5, v7, Lm9/a;->K:J

    cmp-long v5, v5, v16

    if-nez v5, :cond_1

    goto :goto_3

    :cond_1
    if-lez v8, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v15, v15, 0x1

    move/from16 v6, v18

    const/4 v5, 0x0

    goto :goto_1

    :cond_3
    move/from16 v18, v6

    :goto_2
    const/4 v7, 0x0

    :goto_3
    if-eqz v7, :cond_4

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Lm9/a;->a(I)I

    move-result v5

    invoke-virtual {v12, v5}, Ll9/y0;->t(I)Z

    move-result v5

    goto :goto_5

    :cond_4
    invoke-virtual {v10}, Lm9/g;->d()J

    move-result-wide v5

    cmp-long v5, v1, v5

    if-gez v5, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v12, v1, v2, v5}, Ll9/y0;->u(JZ)Z

    move-result v5

    :goto_5
    if-eqz v5, :cond_7

    invoke-virtual {v12}, Ll9/y0;->l()I

    move-result v5

    const/4 v9, 0x0

    invoke-virtual {v10, v5, v9}, Lm9/g;->B(II)I

    move-result v5

    iput v5, v10, Lm9/g;->U:I

    array-length v5, v11

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v5, :cond_6

    aget-object v7, v11, v6

    const/4 v8, 0x1

    invoke-virtual {v7, v1, v2, v8}, Ll9/y0;->u(JZ)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    goto :goto_9

    :cond_7
    iput-wide v1, v10, Lm9/g;->S:J

    const/4 v9, 0x0

    iput-boolean v9, v10, Lm9/g;->Y:Z

    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    iput v9, v10, Lm9/g;->U:I

    invoke-virtual {v13}, Lp9/k;->a()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v12}, Ll9/y0;->g()V

    array-length v5, v11

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_8

    aget-object v7, v11, v6

    invoke-virtual {v7}, Ll9/y0;->g()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_8
    iget-object v5, v13, Lp9/k;->x:Lp9/h;

    invoke-static {v5}, Lva3/g;->j(Ljava/lang/Object;)V

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp9/h;->a(Z)V

    goto :goto_9

    :cond_9
    const/4 v5, 0x0

    const/4 v9, 0x0

    iput-object v5, v13, Lp9/k;->y:Ljava/io/IOException;

    invoke-virtual {v12, v9}, Ll9/y0;->s(Z)V

    iget-object v5, v10, Lm9/g;->N:[Ll9/y0;

    array-length v6, v5

    move v7, v9

    :goto_8
    if-ge v7, v6, :cond_a

    aget-object v8, v5, v7

    invoke-virtual {v8, v9}, Ll9/y0;->s(Z)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_a
    :goto_9
    add-int/lit8 v6, v18, 0x1

    move v5, v9

    goto/16 :goto_0

    :cond_b
    move v9, v5

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v3, v0, Le9/b;->S:[Le9/m;

    array-length v4, v3

    :goto_a
    if-ge v5, v4, :cond_d

    aget-object v6, v3, v5

    iget-object v7, v6, Le9/m;->y:[J

    const/4 v8, 0x1

    invoke-static {v7, v1, v2, v8}, Lx8/t;->a([JJZ)I

    move-result v7

    iput v7, v6, Le9/m;->G:I

    iget-boolean v9, v6, Le9/m;->z:Z

    if-eqz v9, :cond_c

    iget-object v9, v6, Le9/m;->y:[J

    array-length v9, v9

    if-ne v7, v9, :cond_c

    move-wide v9, v1

    goto :goto_b

    :cond_c
    move-wide/from16 v9, v16

    :goto_b
    iput-wide v9, v6, Le9/m;->H:J

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_d
    return-wide v1
.end method

.method public final f()J
    .locals 6

    iget-object v0, p0, Le9/b;->R:[Lm9/g;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-boolean v5, v4, Lm9/g;->X:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, v4, Lm9/g;->X:Z

    if-eqz v5, :cond_0

    iget-wide v0, p0, Le9/b;->Y:J

    return-wide v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-boolean v2, v4, Lm9/g;->X:Z

    throw v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Le9/b;->H:Lp9/l;

    invoke-interface {v0}, Lp9/l;->c()V

    return-void
.end method

.method public final i(J)V
    .locals 11

    iget-object v0, p0, Le9/b;->R:[Lm9/g;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_6

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lm9/g;->z()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_3

    :cond_0
    iget-object v5, v4, Lm9/g;->M:Ll9/y0;

    iget v6, v5, Ll9/y0;->q:I

    const/4 v7, 0x1

    invoke-virtual {v5, p1, p2, v7}, Ll9/y0;->f(JZ)V

    iget-object v5, v4, Lm9/g;->M:Ll9/y0;

    iget v7, v5, Ll9/y0;->q:I

    if-le v7, v6, :cond_2

    monitor-enter v5

    :try_start_0
    iget v6, v5, Ll9/y0;->p:I

    if-nez v6, :cond_1

    const-wide/high16 v8, -0x8000000000000000L

    goto :goto_1

    :cond_1
    iget-object v6, v5, Ll9/y0;->n:[J

    iget v8, v5, Ll9/y0;->r:I

    aget-wide v8, v6, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v5

    move v5, v2

    :goto_2
    iget-object v6, v4, Lm9/g;->N:[Ll9/y0;

    array-length v10, v6

    if-ge v5, v10, :cond_2

    aget-object v6, v6, v5

    iget-object v10, v4, Lm9/g;->z:[Z

    aget-boolean v10, v10, v5

    invoke-virtual {v6, v8, v9, v10}, Ll9/y0;->f(JZ)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    invoke-virtual {v4, v7, v2}, Lm9/g;->B(II)I

    move-result v5

    iget v6, v4, Lm9/g;->U:I

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-lez v5, :cond_5

    iget-object v6, v4, Lm9/g;->K:Ljava/util/ArrayList;

    sget v7, Lx8/t;->a:I

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-gt v5, v7, :cond_4

    if-ltz v5, :cond_4

    if-eqz v5, :cond_3

    invoke-virtual {v6, v2, v5}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->clear()V

    :cond_3
    iget v6, v4, Lm9/g;->U:I

    sub-int/2addr v6, v5

    iput v6, v4, Lm9/g;->U:I

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final j([II)I
    .locals 4

    aget p2, p1, p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Le9/b;->K:[Le9/a;

    aget-object p2, v1, p2

    iget p2, p2, Le9/a;->e:I

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    aget v3, p1, v2

    if-ne v3, p2, :cond_1

    aget-object v3, v1, v3

    iget v3, v3, Le9/a;->c:I

    if-nez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public final k()Ll9/g1;
    .locals 1

    iget-object v0, p0, Le9/b;->J:Ll9/g1;

    return-object v0
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Le9/b;->T:Ll9/l;

    invoke-virtual {v0}, Ll9/l;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(J)V
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Le9/b;->R:[Lm9/g;

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_6

    aget-object v5, v0, v4

    iget-object v6, v5, Lm9/g;->I:Lp9/k;

    invoke-virtual {v6}, Lp9/k;->a()Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, v1, Le9/b;->U:Lf9/c;

    iget v7, v1, Le9/b;->V:I

    invoke-virtual {v6, v7}, Lf9/c;->c(I)J

    move-result-wide v6

    iget-object v8, v5, Lm9/g;->M:Ll9/y0;

    iget-object v9, v5, Lm9/g;->I:Lp9/k;

    invoke-virtual {v9}, Lp9/k;->a()Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    invoke-static {v9}, Lva3/g;->i(Z)V

    invoke-virtual {v5}, Lm9/g;->z()Z

    move-result v9

    if-nez v9, :cond_5

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v11, v6, v9

    if-eqz v11, :cond_5

    iget-object v11, v5, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {v5}, Lm9/g;->v()Lm9/a;

    move-result-object v11

    iget-wide v12, v11, Lm9/a;->L:J

    cmp-long v9, v12, v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    iget-wide v12, v11, Lm9/d;->H:J

    :goto_1
    cmp-long v9, v12, v6

    if-gtz v9, :cond_2

    goto :goto_3

    :cond_2
    monitor-enter v8

    :try_start_0
    iget-wide v9, v8, Ll9/y0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v8

    cmp-long v11, v9, v6

    if-gtz v11, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8, v6, v7}, Ll9/y0;->h(J)V

    iget-object v8, v5, Lm9/g;->N:[Ll9/y0;

    array-length v11, v8

    move v12, v3

    :goto_2
    if-ge v12, v11, :cond_4

    aget-object v13, v8, v12

    invoke-virtual {v13, v6, v7}, Ll9/y0;->h(J)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_4
    iget-object v8, v5, Lm9/g;->G:Lg9/d;

    iget v13, v5, Lm9/g;->w:I

    new-instance v11, Ll9/y;

    invoke-static {v6, v7}, Lx8/t;->U(J)J

    move-result-wide v17

    invoke-static {v9, v10}, Lx8/t;->U(J)J

    move-result-wide v19

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v20}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    iget-object v5, v8, Lg9/d;->b:Ll9/c0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lbc/i;

    const/16 v7, 0x8

    invoke-direct {v6, v8, v5, v11, v7}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v6}, Lg9/d;->a(Lx8/d;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_6
    iget-object v0, v1, Le9/b;->T:Ll9/l;

    move-wide/from16 v2, p1

    invoke-virtual {v0, v2, v3}, Ll9/l;->n(J)V

    return-void
.end method

.method public final s(JLb9/k1;)J
    .locals 19

    move-wide/from16 v1, p1

    move-object/from16 v7, p0

    iget-object v0, v7, Le9/b;->R:[Lm9/g;

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_5

    aget-object v6, v0, v5

    iget v8, v6, Lm9/g;->w:I

    const/4 v9, 0x2

    if-ne v8, v9, :cond_4

    iget-object v0, v6, Lm9/g;->E:Le9/l;

    iget-object v0, v0, Le9/l;->i:[Le9/j;

    array-length v3, v0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v0, v4

    iget-object v6, v5, Le9/j;->d:Le9/i;

    iget-wide v8, v5, Le9/j;->f:J

    iget-object v10, v5, Le9/j;->d:Le9/i;

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Le9/j;->d()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v6, v11, v13

    if-nez v6, :cond_0

    goto :goto_4

    :cond_0
    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v3, v5, Le9/j;->e:J

    invoke-interface {v10, v1, v2, v3, v4}, Le9/i;->u(JJ)J

    move-result-wide v3

    add-long/2addr v3, v8

    move-wide v13, v3

    invoke-virtual {v5, v13, v14}, Le9/j;->f(J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-gez v0, :cond_2

    const-wide/16 v15, -0x1

    cmp-long v0, v11, v15

    const-wide/16 v15, 0x1

    if-eqz v0, :cond_1

    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v10}, Le9/i;->B()J

    move-result-wide v17

    add-long v17, v17, v8

    add-long v17, v17, v11

    sub-long v17, v17, v15

    cmp-long v0, v13, v17

    if-gez v0, :cond_2

    :cond_1
    add-long v8, v13, v15

    invoke-virtual {v5, v8, v9}, Le9/j;->f(J)J

    move-result-wide v5

    :goto_2
    move-object/from16 v0, p3

    goto :goto_3

    :cond_2
    move-wide v5, v3

    goto :goto_2

    :goto_3
    invoke-virtual/range {v0 .. v6}, Lb9/k1;->a(JJJ)J

    move-result-wide v0

    return-wide v0

    :cond_3
    :goto_4
    add-int/lit8 v4, v4, 0x1

    move-wide/from16 v1, p1

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    move-wide/from16 v1, p1

    goto :goto_0

    :cond_5
    return-wide p1
.end method

.method public final t(Ll9/z;J)V
    .locals 0

    iput-object p1, p0, Le9/b;->Q:Ll9/z;

    invoke-interface {p1, p0}, Ll9/z;->c(Ll9/a0;)V

    return-void
.end method

.method public final u([Lo9/s;[Z[Ll9/z0;[ZJ)J
    .locals 35

    move-object/from16 v5, p0

    move-object/from16 v14, p1

    array-length v0, v14

    new-array v0, v0, [I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v14

    const/4 v4, -0x1

    if-ge v2, v3, :cond_2

    aget-object v3, v14, v2

    if-eqz v3, :cond_1

    iget-object v6, v5, Le9/b;->J:Ll9/g1;

    invoke-interface {v3}, Lo9/s;->j()Lu8/p0;

    move-result-object v3

    iget-object v6, v6, Ll9/g1;->b:Lzr/w0;

    invoke-virtual {v6, v3}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v3

    if-ltz v3, :cond_0

    move v4, v3

    :cond_0
    aput v4, v0, v2

    goto :goto_1

    :cond_1
    aput v4, v0, v2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_2
    array-length v3, v14

    const/16 v16, 0x0

    if-ge v2, v3, :cond_7

    aget-object v3, v14, v2

    if-eqz v3, :cond_3

    aget-boolean v3, p2, v2

    if-nez v3, :cond_6

    :cond_3
    aget-object v3, p3, v2

    instance-of v6, v3, Lm9/g;

    if-eqz v6, :cond_4

    check-cast v3, Lm9/g;

    invoke-virtual {v3, v5}, Lm9/g;->C(Le9/b;)V

    goto :goto_3

    :cond_4
    instance-of v6, v3, Lm9/e;

    if-eqz v6, :cond_5

    check-cast v3, Lm9/e;

    iget-object v6, v3, Lm9/e;->E:Lm9/g;

    iget-object v7, v6, Lm9/g;->z:[Z

    iget v3, v3, Lm9/e;->y:I

    aget-boolean v7, v7, v3

    invoke-static {v7}, Lva3/g;->i(Z)V

    iget-object v6, v6, Lm9/g;->z:[Z

    aput-boolean v1, v6, v3

    :cond_5
    :goto_3
    aput-object v16, p3, v2

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    move v2, v1

    :goto_4
    array-length v3, v14

    const/4 v6, 0x1

    if-ge v2, v3, :cond_d

    aget-object v3, p3, v2

    instance-of v7, v3, Ll9/q;

    if-nez v7, :cond_8

    instance-of v3, v3, Lm9/e;

    if-eqz v3, :cond_c

    :cond_8
    invoke-virtual {v5, v0, v2}, Le9/b;->j([II)I

    move-result v3

    if-ne v3, v4, :cond_9

    aget-object v3, p3, v2

    instance-of v3, v3, Ll9/q;

    goto :goto_6

    :cond_9
    aget-object v7, p3, v2

    instance-of v8, v7, Lm9/e;

    if-eqz v8, :cond_a

    check-cast v7, Lm9/e;

    iget-object v7, v7, Lm9/e;->w:Lm9/g;

    aget-object v3, p3, v3

    if-ne v7, v3, :cond_a

    goto :goto_5

    :cond_a
    move v6, v1

    :goto_5
    move v3, v6

    :goto_6
    if-nez v3, :cond_c

    aget-object v3, p3, v2

    instance-of v6, v3, Lm9/e;

    if-eqz v6, :cond_b

    check-cast v3, Lm9/e;

    iget-object v6, v3, Lm9/e;->E:Lm9/g;

    iget-object v7, v6, Lm9/g;->z:[Z

    iget v3, v3, Lm9/e;->y:I

    aget-boolean v7, v7, v3

    invoke-static {v7}, Lva3/g;->i(Z)V

    iget-object v6, v6, Lm9/g;->z:[Z

    aput-boolean v1, v6, v3

    :cond_b
    aput-object v16, p3, v2

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_d
    move v2, v1

    :goto_7
    array-length v3, v14

    if-ge v2, v3, :cond_19

    aget-object v24, v14, v2

    if-nez v24, :cond_e

    move-object/from16 v34, v0

    move/from16 v33, v1

    move/from16 v17, v2

    move-wide/from16 v0, p5

    goto/16 :goto_e

    :cond_e
    aget-object v3, p3, v2

    if-nez v3, :cond_17

    aput-boolean v6, p4, v2

    aget v3, v0, v2

    iget-object v7, v5, Le9/b;->K:[Le9/a;

    aget-object v3, v7, v3

    iget v7, v3, Le9/a;->c:I

    if-nez v7, :cond_16

    iget v7, v3, Le9/a;->f:I

    if-eq v7, v4, :cond_f

    move/from16 v30, v6

    goto :goto_8

    :cond_f
    move/from16 v30, v1

    :goto_8
    if-eqz v30, :cond_10

    iget-object v8, v5, Le9/b;->J:Ll9/g1;

    invoke-virtual {v8, v7}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v7

    move v8, v6

    goto :goto_9

    :cond_10
    move v8, v1

    move-object/from16 v7, v16

    :goto_9
    iget v9, v3, Le9/a;->g:I

    if-eq v9, v4, :cond_11

    iget-object v10, v5, Le9/b;->K:[Le9/a;

    aget-object v9, v10, v9

    iget-object v9, v9, Le9/a;->h:Lzr/g0;

    goto :goto_a

    :cond_11
    sget-object v9, Lzr/g0;->x:Lzr/e0;

    sget-object v9, Lzr/w0;->E:Lzr/w0;

    :goto_a
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    move-result v10

    add-int/2addr v10, v8

    new-array v8, v10, [Lu8/p;

    new-array v10, v10, [I

    if-eqz v30, :cond_12

    iget-object v7, v7, Lu8/p0;->d:[Lu8/p;

    aget-object v7, v7, v1

    aput-object v7, v8, v1

    const/4 v7, 0x5

    aput v7, v10, v1

    move v7, v6

    goto :goto_b

    :cond_12
    move v7, v1

    :goto_b
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move v12, v1

    :goto_c
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    move-result v13

    if-ge v12, v13, :cond_13

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lu8/p;

    aput-object v13, v8, v7

    const/16 v17, 0x3

    aput v17, v10, v7

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v6

    add-int/lit8 v12, v12, 0x1

    goto :goto_c

    :cond_13
    iget-object v7, v5, Le9/b;->U:Lf9/c;

    iget-boolean v7, v7, Lf9/c;->d:Z

    if-eqz v7, :cond_14

    if-eqz v30, :cond_14

    iget-object v7, v5, Le9/b;->M:Le9/p;

    new-instance v9, Le9/o;

    iget-object v12, v7, Le9/p;->w:Lko/o;

    invoke-direct {v9, v7, v12}, Le9/o;-><init>(Le9/p;Lko/o;)V

    move-object/from16 v32, v9

    goto :goto_d

    :cond_14
    move-object/from16 v32, v16

    :goto_d
    iget-object v7, v5, Le9/b;->x:Lab/h0;

    iget-object v9, v5, Le9/b;->H:Lp9/l;

    iget-object v12, v5, Le9/b;->U:Lf9/c;

    iget-object v13, v5, Le9/b;->F:La00/g;

    iget v1, v5, Le9/b;->V:I

    iget-object v4, v3, Le9/a;->a:[I

    iget v6, v3, Le9/a;->b:I

    move-object/from16 v34, v0

    move/from16 v22, v1

    iget-wide v0, v5, Le9/b;->G:J

    move-wide/from16 v27, v0

    iget-object v0, v5, Le9/b;->y:Lz8/n;

    iget-object v1, v7, Lab/h0;->y:Ljava/lang/Object;

    check-cast v1, Lz8/e;

    invoke-interface {v1}, Lz8/e;->createDataSource()Lz8/f;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-interface {v1, v0}, Lz8/f;->addTransferListener(Lz8/n;)V

    :cond_15
    new-instance v17, Le9/l;

    iget-object v0, v7, Lab/h0;->z:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Lcom/iterable/iterableapi/g1;

    iget v0, v7, Lab/h0;->x:I

    move/from16 v29, v0

    move-object/from16 v26, v1

    move-object/from16 v23, v4

    move/from16 v25, v6

    move-object/from16 v19, v9

    move-object/from16 v31, v11

    move-object/from16 v20, v12

    move-object/from16 v21, v13

    invoke-direct/range {v17 .. v32}, Le9/l;-><init>(Lcom/iterable/iterableapi/g1;Lp9/l;Lf9/c;La00/g;I[ILo9/s;ILz8/f;JIZLjava/util/ArrayList;Le9/o;)V

    new-instance v0, Lm9/g;

    iget v1, v3, Le9/a;->b:I

    iget-object v6, v5, Le9/b;->I:Lko/o;

    iget-object v9, v5, Le9/b;->z:Lg9/h;

    move v3, v2

    move-object v2, v10

    iget-object v10, v5, Le9/b;->P:Lg9/d;

    iget-object v11, v5, Le9/b;->E:Ljc/b;

    iget-object v12, v5, Le9/b;->O:Lg9/d;

    iget-boolean v13, v5, Le9/b;->X:Z

    move-object/from16 v4, v17

    move-object/from16 v15, v32

    const/16 v33, 0x0

    move/from16 v17, v3

    move-object v3, v8

    move-wide/from16 v7, p5

    invoke-direct/range {v0 .. v13}, Lm9/g;-><init>(I[I[Lu8/p;Le9/l;Le9/b;Lko/o;JLg9/h;Lg9/d;Ljc/b;Lg9/d;Z)V

    move-object v2, v0

    move-wide v0, v7

    monitor-enter p0

    :try_start_0
    iget-object v3, v5, Le9/b;->N:Ljava/util/IdentityHashMap;

    invoke-virtual {v3, v2, v15}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    aput-object v2, p3, v17

    goto :goto_e

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_16
    move-object/from16 v34, v0

    move/from16 v33, v1

    move/from16 v17, v2

    move-object/from16 v2, v24

    move-wide/from16 v0, p5

    const/4 v4, 0x2

    if-ne v7, v4, :cond_18

    iget-object v4, v5, Le9/b;->W:Ljava/util/List;

    iget v3, v3, Le9/a;->d:I

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf9/g;

    invoke-interface {v2}, Lo9/s;->j()Lu8/p0;

    move-result-object v2

    iget-object v2, v2, Lu8/p0;->d:[Lu8/p;

    aget-object v2, v2, v33

    new-instance v4, Le9/m;

    iget-object v6, v5, Le9/b;->U:Lf9/c;

    iget-boolean v6, v6, Lf9/c;->d:Z

    invoke-direct {v4, v3, v2, v6}, Le9/m;-><init>(Lf9/g;Lu8/p;Z)V

    aput-object v4, p3, v17

    goto :goto_e

    :cond_17
    move-object/from16 v34, v0

    move/from16 v33, v1

    move/from16 v17, v2

    move-object/from16 v2, v24

    move-wide/from16 v0, p5

    instance-of v4, v3, Lm9/g;

    if-eqz v4, :cond_18

    check-cast v3, Lm9/g;

    iget-object v3, v3, Lm9/g;->E:Le9/l;

    iput-object v2, v3, Le9/l;->j:Lo9/s;

    :cond_18
    :goto_e
    add-int/lit8 v2, v17, 0x1

    move/from16 v1, v33

    move-object/from16 v0, v34

    const/4 v4, -0x1

    const/4 v6, 0x1

    goto/16 :goto_7

    :cond_19
    move-object/from16 v34, v0

    move/from16 v33, v1

    move-wide/from16 v0, p5

    move/from16 v2, v33

    :goto_f
    array-length v3, v14

    if-ge v2, v3, :cond_1f

    aget-object v3, p3, v2

    if-nez v3, :cond_1e

    aget-object v3, v14, v2

    if-eqz v3, :cond_1e

    aget v3, v34, v2

    iget-object v4, v5, Le9/b;->K:[Le9/a;

    aget-object v3, v4, v3

    iget v4, v3, Le9/a;->c:I

    const/4 v6, 0x1

    if-ne v4, v6, :cond_1d

    move-object/from16 v4, v34

    invoke-virtual {v5, v4, v2}, Le9/b;->j([II)I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_1a

    new-instance v3, Ll9/q;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    aput-object v3, p3, v2

    goto :goto_12

    :cond_1a
    aget-object v7, p3, v7

    check-cast v7, Lm9/g;

    iget v3, v3, Le9/a;->b:I

    iget-object v9, v7, Lm9/g;->z:[Z

    iget-object v10, v7, Lm9/g;->N:[Ll9/y0;

    move/from16 v11, v33

    :goto_10
    array-length v12, v10

    if-ge v11, v12, :cond_1c

    iget-object v12, v7, Lm9/g;->x:[I

    aget v12, v12, v11

    if-ne v12, v3, :cond_1b

    aget-boolean v3, v9, v11

    xor-int/2addr v3, v6

    invoke-static {v3}, Lva3/g;->i(Z)V

    aput-boolean v6, v9, v11

    aget-object v3, v10, v11

    invoke-virtual {v3, v0, v1, v6}, Ll9/y0;->u(JZ)Z

    new-instance v3, Lm9/e;

    aget-object v9, v10, v11

    invoke-direct {v3, v7, v7, v9, v11}, Lm9/e;-><init>(Lm9/g;Lm9/g;Ll9/y0;I)V

    aput-object v3, p3, v2

    goto :goto_12

    :cond_1b
    add-int/lit8 v11, v11, 0x1

    goto :goto_10

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1d
    move-object/from16 v4, v34

    :goto_11
    const/4 v8, -0x1

    goto :goto_12

    :cond_1e
    move-object/from16 v4, v34

    const/4 v6, 0x1

    goto :goto_11

    :goto_12
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v34, v4

    goto :goto_f

    :cond_1f
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v15, p3

    array-length v4, v15

    move/from16 v6, v33

    :goto_13
    if-ge v6, v4, :cond_22

    aget-object v7, v15, v6

    instance-of v8, v7, Lm9/g;

    if-eqz v8, :cond_20

    check-cast v7, Lm9/g;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_20
    instance-of v8, v7, Le9/m;

    if-eqz v8, :cond_21

    check-cast v7, Le9/m;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    :goto_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_13

    :cond_22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Lm9/g;

    iput-object v4, v5, Le9/b;->R:[Lm9/g;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Le9/m;

    iput-object v4, v5, Le9/b;->S:[Le9/m;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object v3, v5, Le9/b;->L:Lg73/a;

    new-instance v4, Lcom/mapbox/maps/l;

    const/16 v6, 0x15

    invoke-direct {v4, v6}, Lcom/mapbox/maps/l;-><init>(I)V

    invoke-static {v2, v4}, Lzr/q;->t(Ljava/util/List;Lyr/e;)Ljava/util/AbstractList;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ll9/l;

    invoke-direct {v3, v2, v4}, Ll9/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    iput-object v3, v5, Le9/b;->T:Ll9/l;

    iget-boolean v2, v5, Le9/b;->X:Z

    if-eqz v2, :cond_23

    move/from16 v2, v33

    iput-boolean v2, v5, Le9/b;->X:Z

    iput-wide v0, v5, Le9/b;->Y:J

    :cond_23
    return-wide v0
.end method

.method public final x(Lb9/o0;)Z
    .locals 1

    iget-object v0, p0, Le9/b;->T:Ll9/l;

    invoke-virtual {v0, p1}, Ll9/l;->x(Lb9/o0;)Z

    move-result p1

    return p1
.end method
