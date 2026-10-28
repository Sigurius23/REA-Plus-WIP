.class public abstract Landroidx/compose/ui/graphics/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroidx/compose/ui/Modifier;FFFFLi2/a1;I)Landroidx/compose/ui/Modifier;
    .locals 22

    move/from16 v0, p6

    and-int/lit8 v1, v0, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    move v9, v1

    goto :goto_3

    :cond_3
    move/from16 v9, p4

    :goto_3
    sget-wide v12, Li2/e1;->b:J

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_4

    sget-object v1, Li2/w0;->a:Li2/v0;

    move-object v14, v1

    goto :goto_4

    :cond_4
    move-object/from16 v14, p5

    :goto_4
    sget-wide v17, Li2/h0;->a:J

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    :goto_5
    move/from16 v21, v0

    goto :goto_6

    :cond_5
    const/4 v0, 0x1

    goto :goto_5

    :goto_6
    new-instance v3, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 v19, v17

    invoke-direct/range {v3 .. v21}, Landroidx/compose/ui/graphics/GraphicsLayerElement;-><init>(FFFFFFFFJLi2/a1;ZLal/a;JJI)V

    move-object/from16 v0, p0

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;
    .locals 22

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move v7, v2

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move v8, v2

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move v10, v2

    goto :goto_5

    :cond_5
    const/high16 v1, 0x43340000    # 180.0f

    move v10, v1

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move v11, v2

    goto :goto_6

    :cond_6
    move/from16 v11, p6

    :goto_6
    sget-wide v12, Li2/e1;->b:J

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_7

    sget-object v1, Li2/w0;->a:Li2/v0;

    move-object v14, v1

    goto :goto_7

    :cond_7
    move-object/from16 v14, p7

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    move v15, v2

    goto :goto_8

    :cond_8
    const/4 v1, 0x1

    move v15, v1

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    move-object/from16 v16, v1

    goto :goto_9

    :cond_9
    move-object/from16 v16, p8

    :goto_9
    sget-wide v17, Li2/h0;->a:J

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    move/from16 v21, v2

    goto :goto_a

    :cond_a
    move/from16 v21, p9

    :goto_a
    new-instance v3, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    const/4 v9, 0x0

    move-wide/from16 v19, v17

    invoke-direct/range {v3 .. v21}, Landroidx/compose/ui/graphics/GraphicsLayerElement;-><init>(FFFFFFFFJLi2/a1;ZLal/a;JJI)V

    move-object/from16 v0, p0

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method
