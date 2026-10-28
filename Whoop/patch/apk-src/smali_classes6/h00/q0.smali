.class public final Lh00/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lh00/q0;->w:I

    iput-object p1, p0, Lh00/q0;->y:Ljava/lang/String;

    iput-boolean p2, p0, Lh00/q0;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh00/q0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lh00/q0;->x:Z

    iput-object p2, p0, Lh00/q0;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    iget v1, v0, Lh00/q0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$TextButton"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_3

    :cond_1
    :goto_0
    check-cast v2, Lp1/q;

    const v1, 0x17d43016

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v0, Lh00/q0;->x:Z

    if-eqz v1, :cond_2

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->c()J

    move-result-wide v3

    :goto_1
    move-wide v6, v3

    goto :goto_2

    :cond_2
    sget-wide v3, Li2/x;->n:J

    goto :goto_1

    :goto_2
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->i:Ll3/v0;

    const/16 v27, 0x0

    const v28, 0xfffa

    iget-object v4, v0, Lh00/q0;->y:Ljava/lang/String;

    const/4 v5, 0x0

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

    const/16 v26, 0x0

    move-object/from16 v24, v1

    move-object/from16 v25, v2

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$composed"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp1/q;

    const v3, 0x6a8e1e47

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    const v3, 0x7f140426

    invoke-static {v2, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, v0, Lh00/q0;->x:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    const v4, -0x50519e06

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lh00/q0;->y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v7, v6, :cond_4

    :cond_3
    new-instance v7, La23/b;

    const/4 v6, 0x3

    invoke-direct {v7, v4, v3, v6}, La23/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    invoke-static {v1, v5, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :cond_5
    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    return-object v1

    :pswitch_1
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

    if-ne v1, v2, :cond_7

    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_7
    :goto_4
    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    const v2, -0x1a6f7841

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/b;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-wide v4, v2, Lg00/b;->q:J

    iget-boolean v2, v0, Lh00/q0;->x:Z

    if-eqz v2, :cond_a

    const v2, 0x5d143cf0

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v6, v2, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    if-eqz v2, :cond_8

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    move-result v2

    float-to-double v6, v2

    cmpl-double v2, v6, v8

    if-lez v2, :cond_9

    goto :goto_5

    :cond_8
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    move-result v2

    float-to-double v6, v2

    cmpg-double v2, v6, v8

    if-gez v2, :cond_9

    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_9
    const v2, 0x3f5eb852    # 0.87f

    :goto_6
    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    const v2, 0x5d143fd4

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v6, v2, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_7

    :cond_b
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_7
    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    const v2, 0x3ec28f5c    # 0.38f

    :goto_8
    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    const v2, -0x548d6062

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/e;

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-object v1, v2, Lg00/e;->c:Ll3/v0;

    const/16 v25, 0x0

    const v26, 0xfffa

    iget-object v2, v0, Lh00/q0;->y:Ljava/lang/String;

    const/4 v3, 0x0

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

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
