.class public final Lg1/q6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lg1/q6;->w:I

    iput-object p1, p0, Lg1/q6;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    iget v1, v0, Lg1/q6;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v23, p2

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$TextButton"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lg1/i9;->b:Lp1/u2;

    move-object/from16 v2, v23

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->i:Ll3/v0;

    const/16 v25, 0x0

    const v26, 0xfffe

    iget-object v2, v0, Lg1/q6;->x:Ljava/lang/String;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v22, v1

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Ll1/w4;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_4

    and-int/lit8 v4, v3, 0x8

    if-nez v4, :cond_2

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/4 v4, 0x4

    goto :goto_3

    :cond_3
    const/4 v4, 0x2

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/lit8 v5, v3, 0x1

    move-object v13, v1

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lb30/b0;

    iget-object v4, v0, Lg1/q6;->x:Ljava/lang/String;

    const/4 v5, 0x6

    invoke-direct {v1, v4, v5}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v4, -0x3b99a1f7

    invoke-static {v4, v13, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    and-int/lit8 v1, v3, 0xe

    const/high16 v3, 0x30000000

    or-int v14, v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v14}, Ll1/u4;->a(Ll1/w4;Landroidx/compose/ui/Modifier;FLi2/a1;JJFFLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_6
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Ll1/w4;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_9

    and-int/lit8 v4, v3, 0x8

    if-nez v4, :cond_7

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_6

    :cond_7
    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_6
    if-eqz v4, :cond_8

    const/4 v4, 0x4

    goto :goto_7

    :cond_8
    const/4 v4, 0x2

    :goto_7
    or-int/2addr v3, v4

    :cond_9
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_a

    const/4 v4, 0x1

    goto :goto_8

    :cond_a
    const/4 v4, 0x0

    :goto_8
    and-int/lit8 v5, v3, 0x1

    move-object v13, v1

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Lb30/b0;

    iget-object v4, v0, Lg1/q6;->x:Ljava/lang/String;

    const/4 v5, 0x5

    invoke-direct {v1, v4, v5}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v4, 0x719a85bc

    invoke-static {v4, v13, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    and-int/lit8 v1, v3, 0xe

    const/high16 v3, 0x30000000

    or-int v14, v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v14}, Ll1/u4;->a(Ll1/w4;Landroidx/compose/ui/Modifier;FLi2/a1;JJFFLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_b
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$AnimatedVisibility"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lg1/q6;->x:Ljava/lang/String;

    if-nez v1, :cond_c

    const-string v1, ""

    :cond_c
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v1, v3, v2, v4}, Lj00/q;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$AnimatedVisibility"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb30/b0;

    iget-object v3, v0, Lg1/q6;->x:Ljava/lang/String;

    const/4 v4, 0x3

    invoke-direct {v1, v3, v4}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v3, 0x648a6a0a

    invoke-static {v3, v2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v3, 0x30

    const/4 v4, 0x0

    invoke-static {v4, v1, v2, v3}, Lg00/g;->a(Lwz/d0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x11

    const/16 v4, 0x10

    const/4 v5, 0x1

    if-eq v3, v4, :cond_d

    move v3, v5

    goto :goto_a

    :cond_d
    const/4 v3, 0x0

    :goto_a
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    const/16 v27, 0x0

    const v28, 0x1fffe

    iget-object v4, v0, Lg1/q6;->x:Ljava/lang/String;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v1

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_b

    :cond_e
    move-object/from16 v25, v1

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
