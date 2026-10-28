.class public final Lc4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lc4/o;->a:I

    iput-object p2, p0, Lc4/o;->b:Ljava/lang/Object;

    iput-object p3, p0, Lc4/o;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Lc4/o;->a:I

    packed-switch v3, :pswitch_data_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ly2/q0;

    invoke-interface {v9}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v9

    instance-of v9, v9, Lu0/s1;

    if-nez v9, :cond_0

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget-object v5, v0, Lc4/o;->c:Ljava/lang/Object;

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_5

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_4

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lh2/c;

    if-eqz v11, :cond_2

    iget v12, v11, Lh2/c;->b:F

    iget v13, v11, Lh2/c;->a:F

    new-instance v14, Ll83/k;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly2/q0;

    iget v6, v11, Lh2/c;->c:F

    sub-float/2addr v6, v13

    move-object/from16 v16, v8

    float-to-double v7, v6

    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-int v6, v6

    iget v7, v11, Lh2/c;->d:F

    sub-float/2addr v7, v12

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v7

    double-to-float v7, v7

    float-to-int v7, v7

    const/4 v8, 0x5

    invoke-static {v6, v7, v8}, Ly3/b;->b(III)J

    move-result-wide v6

    invoke-interface {v15, v6, v7}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v8

    int-to-long v11, v7

    const/16 v7, 0x20

    shl-long/2addr v11, v7

    int-to-long v7, v8

    const-wide v17, 0xffffffffL

    and-long v7, v7, v17

    or-long/2addr v7, v11

    new-instance v11, Ly3/j;

    invoke-direct {v11, v7, v8}, Ly3/j;-><init>(J)V

    invoke-direct {v14, v6, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move-object/from16 v16, v8

    const/4 v14, 0x0

    :goto_2
    move-object/from16 v6, v16

    if-eqz v14, :cond_3

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v10, v10, 0x1

    move-object v8, v6

    goto :goto_1

    :cond_4
    move-object v6, v8

    move-object v7, v6

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v4, :cond_7

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ly2/q0;

    invoke-interface {v8}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v8

    instance-of v8, v8, Lu0/s1;

    if-eqz v8, :cond_6

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    iget-object v2, v0, Lc4/o;->b:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    invoke-static {v3, v2}, Lq83/g;->g(Ljava/util/List;Lc93/a;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, Ly3/a;->h(J)I

    move-result v4

    new-instance v5, Lm01/e;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v7, v2}, Lm01/e;-><init>(ILjava/util/List;Ljava/util/List;)V

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-interface {v1, v3, v4, v2, v5}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v2, v0, Lc4/o;->b:Ljava/lang/Object;

    check-cast v2, Lc4/f0;

    iget-object v3, v0, Lc4/o;->c:Ljava/lang/Object;

    check-cast v3, Ly3/m;

    invoke-virtual {v2, v3}, Lc4/f0;->setParentLayoutDirection(Ly3/m;)V

    sget-object v2, Lc4/d;->z:Lc4/d;

    sget-object v3, Lm83/z;->w:Lm83/z;

    const/4 v4, 0x0

    invoke-interface {v1, v4, v4, v3, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
