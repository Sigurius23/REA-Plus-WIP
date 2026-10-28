.class public final synthetic Lg1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Li93/f;IFLkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lg1/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/g;->x:Ljava/lang/Object;

    iput p2, p0, Lg1/g;->E:I

    iput p3, p0, Lg1/g;->z:F

    iput-object p4, p0, Lg1/g;->F:Ljava/lang/Object;

    iput-object p5, p0, Lg1/g;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ly2/t0;FILjava/util/ArrayList;I)V
    .locals 0

    .line 2
    iput p6, p0, Lg1/g;->w:I

    iput-object p1, p0, Lg1/g;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/g;->y:Ljava/lang/Object;

    iput p3, p0, Lg1/g;->z:F

    iput p4, p0, Lg1/g;->E:I

    iput-object p5, p0, Lg1/g;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lg1/g;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget v3, v0, Lg1/g;->E:I

    iget-object v5, v0, Lg1/g;->y:Ljava/lang/Object;

    iget-object v6, v0, Lg1/g;->F:Ljava/lang/Object;

    iget v7, v0, Lg1/g;->z:F

    iget-object v8, v0, Lg1/g;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v8, Li93/f;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v5, Lc93/a;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-interface {v8}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {v8}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v1, v2, v9}, Le93/b;->m(FFF)F

    move-result v1

    const/4 v2, 0x1

    if-lez v3, :cond_2

    add-int/2addr v3, v2

    if-ltz v3, :cond_2

    move v10, v1

    move v11, v10

    const/4 v9, 0x0

    :goto_0
    invoke-interface {v8}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    invoke-interface {v8}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    int-to-float v14, v9

    int-to-float v15, v3

    div-float/2addr v14, v15

    invoke-static {v12, v13, v14}, Le93/b;->O(FFF)F

    move-result v12

    sub-float v13, v12, v1

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v14

    cmpg-float v14, v14, v10

    if-gtz v14, :cond_0

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v10

    move v11, v12

    :cond_0
    if-eq v9, v3, :cond_1

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    move v1, v11

    :cond_2
    cmpg-float v3, v1, v7

    if-nez v3, :cond_3

    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_4

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_4
    move v4, v2

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v8, Ljava/util/ArrayList;

    move-object v10, v5

    check-cast v10, Ly2/t0;

    check-cast v6, Ljava/util/ArrayList;

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v3, :cond_8

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v9

    new-array v12, v9, [I

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v9, :cond_6

    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly2/j1;

    iget v13, v13, Ly2/j1;->w:I

    invoke-static {v15}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v14

    if-ge v11, v14, :cond_5

    invoke-interface {v10, v7}, Ly3/c;->F(F)I

    move-result v14

    goto :goto_4

    :cond_5
    const/4 v14, 0x0

    :goto_4
    add-int/2addr v13, v14

    aput v13, v12, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_6
    sget-object v11, Ll0/m;->b:Ll0/e;

    new-array v14, v9, [I

    invoke-interface {v10}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v13

    move-object v9, v11

    iget v11, v0, Lg1/g;->E:I

    invoke-virtual/range {v9 .. v14}, Ll0/e;->c(Ly3/c;I[ILy3/m;[I)V

    move-object v9, v15

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v9, :cond_7

    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly2/j1;

    aget v13, v14, v11

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Number;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v12, v13, v4, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_8
    return-object v2

    :pswitch_1
    check-cast v8, Ljava/util/ArrayList;

    check-cast v5, Ly2/t0;

    check-cast v6, Ljava/util/ArrayList;

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v4, :cond_c

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    new-array v12, v11, [I

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v11, :cond_a

    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly2/j1;

    iget v14, v14, Ly2/j1;->w:I

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v15

    if-ge v13, v15, :cond_9

    invoke-interface {v5, v7}, Ly3/c;->F(F)I

    move-result v15

    goto :goto_8

    :cond_9
    const/4 v15, 0x0

    :goto_8
    add-int/2addr v14, v15

    aput v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :cond_a
    sget-object v13, Ll0/m;->a:Ll0/e;

    new-array v11, v11, [I

    const/4 v13, 0x0

    invoke-static {v3, v12, v11, v13}, Ll0/m;->e(I[I[IZ)V

    move-object v12, v10

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    move v14, v13

    :goto_9
    if-ge v14, v12, :cond_b

    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly2/j1;

    aget v13, v11, v14

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Number;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v15, v13, v0, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    const/4 v13, 0x0

    goto :goto_9

    :cond_b
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_c
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
