.class public final Lg1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# static fields
.field public static final b:Lg1/d;

.field public static final c:Lg1/d;

.field public static final d:Lg1/d;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lg1/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg1/d;-><init>(I)V

    sput-object v0, Lg1/d;->b:Lg1/d;

    new-instance v0, Lg1/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg1/d;-><init>(I)V

    sput-object v0, Lg1/d;->c:Lg1/d;

    new-instance v0, Lg1/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg1/d;-><init>(I)V

    sput-object v0, Lg1/d;->d:Lg1/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg1/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p0

    move-wide/from16 v3, p3

    iget v5, v2, Lg1/d;->a:I

    packed-switch v5, :pswitch_data_0

    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v10, 0x0

    move v6, v10

    :goto_0
    const-string v7, "Collection contains no element matching the predicate."

    if-ge v6, v5, :cond_9

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    invoke-static {v8}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v9

    const-string v11, "action"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v14

    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v5

    iget v6, v14, Ly2/j1;->w:I

    sub-int/2addr v5, v6

    sget v6, Lg1/s6;->e:F

    invoke-interface {v0, v6}, Ly3/c;->F(F)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v3, v4}, Ly3/a;->k(J)I

    move-result v6

    if-ge v5, v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v5

    :goto_1
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move v8, v10

    :goto_2
    if-ge v8, v5, :cond_7

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Ly2/q0;

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v9

    const-string v12, "text"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/4 v8, 0x0

    const/16 v9, 0x9

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide v5

    invoke-interface {v11, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v12

    sget-object v1, Ly2/d;->a:Ly2/m;

    invoke-virtual {v12, v1}, Ly2/j1;->c0(Ly2/a;)I

    move-result v5

    sget-object v6, Ly2/d;->b:Ly2/m;

    invoke-virtual {v12, v6}, Ly2/j1;->c0(Ly2/a;)I

    move-result v6

    const/high16 v7, -0x80000000

    const/4 v8, 0x1

    if-eq v5, v7, :cond_1

    if-eq v6, v7, :cond_1

    move v9, v8

    goto :goto_3

    :cond_1
    move v9, v10

    :goto_3
    if-eq v5, v6, :cond_3

    if-nez v9, :cond_2

    goto :goto_4

    :cond_2
    move v8, v10

    :cond_3
    :goto_4
    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v6

    iget v9, v14, Ly2/j1;->w:I

    sub-int v15, v6, v9

    if-eqz v8, :cond_5

    sget v6, Lg1/s6;->f:F

    invoke-interface {v0, v6}, Ly3/c;->F(F)I

    move-result v6

    iget v8, v14, Ly2/j1;->x:I

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v8, v12, Ly2/j1;->x:I

    sub-int v8, v6, v8

    div-int/lit8 v8, v8, 0x2

    invoke-virtual {v14, v1}, Ly2/j1;->c0(Ly2/a;)I

    move-result v1

    if-eq v1, v7, :cond_4

    add-int/2addr v5, v8

    sub-int v10, v5, v1

    :cond_4
    :goto_5
    move v13, v8

    move/from16 v16, v10

    goto :goto_6

    :cond_5
    sget v1, Lg1/s6;->a:F

    invoke-interface {v0, v1}, Ly3/c;->F(F)I

    move-result v1

    sub-int v8, v1, v5

    sget v1, Lg1/s6;->g:F

    invoke-interface {v0, v1}, Ly3/c;->F(F)I

    move-result v1

    iget v5, v12, Ly2/j1;->x:I

    add-int/2addr v5, v8

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v1, v14, Ly2/j1;->x:I

    sub-int v1, v6, v1

    div-int/lit8 v10, v1, 0x2

    goto :goto_5

    :goto_6
    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v1

    new-instance v11, Lg1/p6;

    invoke-direct/range {v11 .. v16}, Lg1/p6;-><init>(Ly2/j1;ILy2/j1;II)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-interface {v0, v1, v6, v3, v11}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_2

    :cond_7
    invoke-static {v7}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_9
    invoke-static {v7}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/high16 v7, -0x80000000

    const/4 v8, 0x0

    move v10, v7

    move v11, v10

    move v9, v8

    move v12, v9

    :goto_7
    if-ge v9, v6, :cond_e

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly2/q0;

    invoke-interface {v13, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v13

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v14, Ly2/d;->a:Ly2/m;

    invoke-virtual {v13, v14}, Ly2/j1;->c0(Ly2/a;)I

    move-result v15

    if-eq v15, v7, :cond_b

    if-eq v10, v7, :cond_a

    invoke-virtual {v13, v14}, Ly2/j1;->c0(Ly2/a;)I

    move-result v15

    if-ge v15, v10, :cond_b

    :cond_a
    invoke-virtual {v13, v14}, Ly2/j1;->c0(Ly2/a;)I

    move-result v10

    :cond_b
    sget-object v14, Ly2/d;->b:Ly2/m;

    invoke-virtual {v13, v14}, Ly2/j1;->c0(Ly2/a;)I

    move-result v15

    if-eq v15, v7, :cond_d

    if-eq v11, v7, :cond_c

    invoke-virtual {v13, v14}, Ly2/j1;->c0(Ly2/a;)I

    move-result v15

    if-le v15, v11, :cond_d

    :cond_c
    invoke-virtual {v13, v14}, Ly2/j1;->c0(Ly2/a;)I

    move-result v11

    :cond_d
    iget v13, v13, Ly2/j1;->x:I

    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_e
    if-eq v10, v7, :cond_f

    if-eq v11, v7, :cond_f

    const/4 v8, 0x1

    :cond_f
    if-eq v10, v11, :cond_11

    if-nez v8, :cond_10

    goto :goto_8

    :cond_10
    sget v1, Lg1/s6;->g:F

    goto :goto_9

    :cond_11
    :goto_8
    sget v1, Lg1/s6;->f:F

    :goto_9
    invoke-interface {v0, v1}, Ly3/c;->F(F)I

    move-result v1

    invoke-static {v1, v12}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v3

    new-instance v4, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v6, 0x6

    invoke-direct {v4, v5, v1, v6}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    sget-object v5, Lm83/z;->w:Lm83/z;

    invoke-interface {v0, v3, v1, v5, v4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v10, 0x0

    move v6, v10

    :goto_a
    const-string v11, "Collection contains no element matching the predicate."

    if-ge v6, v5, :cond_15

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ly2/q0;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "badge"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide v5

    invoke-interface {v12, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_b
    if-ge v10, v6, :cond_13

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly2/q0;

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "anchor"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v7, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    sget-object v3, Ly2/d;->a:Ly2/m;

    invoke-virtual {v1, v3}, Ly2/j1;->c0(Ly2/a;)I

    move-result v4

    sget-object v6, Ly2/d;->b:Ly2/m;

    invoke-virtual {v1, v6}, Ly2/j1;->c0(Ly2/a;)I

    move-result v7

    iget v8, v1, Ly2/j1;->w:I

    iget v9, v1, Ly2/j1;->x:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v10, Ll83/k;

    invoke-direct {v10, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v4}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lep1/g;

    const/16 v6, 0x9

    invoke-direct {v4, v5, v0, v1, v6}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v8, v9, v3, v4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :cond_12
    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    :cond_13
    invoke-static {v11}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_14
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_a

    :cond_15
    invoke-static {v11}, La4/b;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_2
    move-object v10, v1

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v11, 0x0

    move v6, v11

    :goto_c
    const/4 v12, 0x0

    if-ge v6, v5, :cond_17

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ly2/q0;

    invoke-static {v8}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "title"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    goto :goto_d

    :cond_16
    add-int/lit8 v6, v6, 0x1

    goto :goto_c

    :cond_17
    move-object v7, v12

    :goto_d
    move-object v13, v7

    check-cast v13, Ly2/q0;

    if-eqz v13, :cond_18

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide v5

    invoke-interface {v13, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    move-object v13, v3

    goto :goto_e

    :cond_18
    move-object v13, v12

    :goto_e
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v11

    :goto_f
    if-ge v4, v3, :cond_1a

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ly2/q0;

    invoke-static {v6}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "text"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    goto :goto_10

    :cond_19
    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_1a
    move-object v5, v12

    :goto_10
    move-object v1, v5

    check-cast v1, Ly2/q0;

    if-eqz v1, :cond_1b

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v3, p3

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    goto :goto_11

    :cond_1b
    move-object v1, v12

    :goto_11
    if-eqz v13, :cond_1c

    iget v3, v13, Ly2/j1;->w:I

    goto :goto_12

    :cond_1c
    move v3, v11

    :goto_12
    if-eqz v1, :cond_1d

    iget v4, v1, Ly2/j1;->w:I

    goto :goto_13

    :cond_1d
    move v4, v11

    :goto_13
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/high16 v4, -0x80000000

    if-eqz v13, :cond_1f

    sget-object v5, Ly2/d;->a:Ly2/m;

    invoke-virtual {v13, v5}, Ly2/j1;->c0(Ly2/a;)I

    move-result v5

    if-ne v5, v4, :cond_1e

    move-object v5, v12

    goto :goto_14

    :cond_1e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_14
    if-eqz v5, :cond_1f

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_15

    :cond_1f
    move v5, v11

    :goto_15
    if-eqz v13, :cond_21

    sget-object v6, Ly2/d;->b:Ly2/m;

    invoke-virtual {v13, v6}, Ly2/j1;->c0(Ly2/a;)I

    move-result v6

    if-ne v6, v4, :cond_20

    move-object v6, v12

    goto :goto_16

    :cond_20
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_16
    if-eqz v6, :cond_21

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_17

    :cond_21
    move v6, v11

    :goto_17
    sget-wide v7, Lg1/k;->c:J

    invoke-interface {v0, v7, v8}, Ly3/c;->w0(J)I

    move-result v7

    sub-int/2addr v7, v5

    if-eqz v1, :cond_23

    sget-object v5, Ly2/d;->a:Ly2/m;

    invoke-virtual {v1, v5}, Ly2/j1;->c0(Ly2/a;)I

    move-result v5

    if-ne v5, v4, :cond_22

    goto :goto_18

    :cond_22
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    :goto_18
    if-eqz v12, :cond_23

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_19

    :cond_23
    move v4, v11

    :goto_19
    if-nez v13, :cond_24

    sget-wide v8, Lg1/k;->e:J

    invoke-interface {v0, v8, v9}, Ly3/c;->w0(J)I

    move-result v5

    goto :goto_1a

    :cond_24
    sget-wide v8, Lg1/k;->d:J

    invoke-interface {v0, v8, v9}, Ly3/c;->w0(J)I

    move-result v5

    :goto_1a
    if-eqz v13, :cond_25

    iget v8, v13, Ly2/j1;->x:I

    add-int/2addr v8, v7

    goto :goto_1b

    :cond_25
    move v8, v11

    :goto_1b
    if-nez v13, :cond_26

    sub-int v9, v5, v4

    goto :goto_1d

    :cond_26
    if-nez v6, :cond_27

    sub-int v9, v8, v4

    :goto_1c
    add-int/2addr v9, v5

    goto :goto_1d

    :cond_27
    add-int v9, v7, v6

    sub-int/2addr v9, v4

    goto :goto_1c

    :goto_1d
    if-eqz v1, :cond_2a

    if-nez v6, :cond_28

    iget v6, v1, Ly2/j1;->x:I

    add-int/2addr v6, v5

    sub-int/2addr v6, v4

    move v11, v6

    goto :goto_1e

    :cond_28
    iget v10, v1, Ly2/j1;->x:I

    add-int/2addr v10, v5

    sub-int/2addr v10, v4

    if-eqz v13, :cond_29

    iget v11, v13, Ly2/j1;->x:I

    :cond_29
    sub-int/2addr v11, v6

    sub-int/2addr v10, v11

    move v11, v10

    :cond_2a
    :goto_1e
    add-int/2addr v8, v11

    new-instance v4, Lg1/c;

    invoke-direct {v4, v13, v7, v1, v9}, Lg1/c;-><init>(Ly2/j1;ILy2/j1;I)V

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-interface {v0, v3, v8, v1, v4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
