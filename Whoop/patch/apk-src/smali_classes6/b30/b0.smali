.class public final Lb30/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lb30/b0;->w:I

    iput-object p1, p0, Lb30/b0;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget v1, v0, Lb30/b0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x0

    const/4 v4, 0x0

    iget-object v5, v0, Lb30/b0;->x:Ljava/lang/String;

    invoke-static {v5, v2, v1, v4, v3}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    move-object v1, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x0

    const/4 v7, 0x6

    iget-object v2, v0, Lb30/b0;->x:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_4

    move v3, v5

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    :goto_4
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v23, 0x0

    const v24, 0x3fffe

    iget-object v4, v0, Lb30/b0;->x:Ljava/lang/String;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, v1

    invoke-static/range {v4 .. v24}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_5
    move-object/from16 v21, v1

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_6

    move v3, v5

    goto :goto_6

    :cond_6
    const/4 v3, 0x0

    :goto_6
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v23, 0x0

    const v24, 0x3fffe

    iget-object v4, v0, Lb30/b0;->x:Ljava/lang/String;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, v1

    invoke-static/range {v4 .. v24}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_7

    :cond_7
    move-object/from16 v21, v1

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_8

    move v3, v5

    goto :goto_8

    :cond_8
    const/4 v3, 0x0

    :goto_8
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_9

    new-instance v2, Lkx1/b;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lkx1/b;-><init>(I)V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v2}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v23, 0x0

    const v24, 0x3fffc

    iget-object v4, v0, Lb30/b0;->x:Ljava/lang/String;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, v1

    invoke-static/range {v4 .. v24}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_9

    :cond_a
    move-object/from16 v21, v1

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_c

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_a

    :cond_b
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_b

    :cond_c
    :goto_a
    iget-object v2, v0, Lb30/b0;->x:Ljava/lang/String;

    if-nez v2, :cond_d

    const-string v2, ""

    :cond_d
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v2, v3, v1, v4}, Lj00/q;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_5
    move-object/from16 v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_f

    move-object v1, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_d

    :cond_f
    :goto_c
    const/4 v6, 0x0

    const/4 v7, 0x6

    iget-object v2, v0, Lb30/b0;->x:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lds/q;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    :goto_d
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_6
    move-object/from16 v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_11

    move-object v1, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_e

    :cond_10
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_f

    :cond_11
    :goto_e
    const/4 v1, 0x4

    int-to-float v7, v1

    const/4 v10, 0x0

    const/16 v11, 0xe

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    iget-object v2, v0, Lb30/b0;->x:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    :goto_f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_13

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_10

    :cond_12
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_11

    :cond_13
    :goto_10
    iget-object v2, v0, Lb30/b0;->x:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Luf/c0;->k(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_11
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
