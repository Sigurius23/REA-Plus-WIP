.class public final Ld30/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ld30/b0;->w:I

    iput-object p2, p0, Ld30/b0;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld30/b0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget v1, v0, Ld30/b0;->w:I

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
    iget-object v1, v0, Ld30/b0;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-object v1, v0, Ld30/b0;->y:Ljava/lang/Object;

    move-object/from16 v22, v1

    check-cast v22, Ll3/v0;

    const/16 v25, 0x0

    const v26, 0xfffe

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

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    iget-object v2, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v2, Lj0/i;

    check-cast v1, Lp1/q;

    const v3, -0x620472b

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_2

    invoke-static {v1}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lbc3/c0;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_3

    const/4 v5, 0x0

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v5, Lp1/c1;

    iget-object v6, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v1}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_4

    if-ne v8, v4, :cond_5

    :cond_4
    new-instance v8, Lsg2/t;

    const/16 v7, 0x14

    invoke-direct {v8, v7, v5, v2}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v8, v1}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_6

    if-ne v8, v4, :cond_7

    :cond_6
    new-instance v8, Lu0/k1;

    invoke-direct {v8, v3, v5, v2, v6}, Lu0/k1;-><init>(Lbc3/c0;Lp1/c1;Lj0/i;Lp1/c1;)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v2, v8}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v3, Lp40/a;

    const-string v4, "it"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v2, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_9

    move-object v1, v9

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_3

    :cond_9
    :goto_2
    iget-object v1, v0, Ld30/b0;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ln2/a;

    iget v1, v3, Lp40/a;->b:I

    invoke-static {v9, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    iget-object v8, v3, Lp40/a;->c:Li2/y;

    const/4 v10, 0x0

    const/16 v11, 0x3c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v1

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_3
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

    iget-object v1, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v1, Ln00/c;

    iget-object v1, v1, Ln00/c;->h:Ljava/lang/String;

    if-nez v1, :cond_a

    const-string v1, ""

    :cond_a
    iget-object v3, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v4}, Lse/b;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v4, Lm63/d;

    const-string v5, "$this$InputAddressScreen"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_c

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_5

    :cond_c
    :goto_4
    move-object v10, v2

    check-cast v10, Lp1/q;

    const v1, 0x15c59ea1

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_d

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v5, v1

    check-cast v5, Lec3/f2;

    const/4 v1, 0x0

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    iget-object v3, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v3, Li20/j1;

    iget-object v6, v3, Li20/j1;->N:Lec3/h2;

    iget-object v3, v4, Lm63/d;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    const v7, 0x15c5b287

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_e

    if-ne v7, v2, :cond_f

    :cond_e
    iget-object v2, v4, Lm63/d;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lec3/f2;

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    iget-object v1, v4, Lm63/d;->H:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ln53/e;

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Ls4/l;->a(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$Button"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_11

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_6

    :cond_10
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_7

    :cond_11
    :goto_6
    iget-object v1, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v1, Lh00/o0;

    iget-object v3, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v4}, Lh00/n0;->d(Lh00/o0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x11

    const/16 v4, 0x10

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_12

    move v3, v6

    goto :goto_8

    :cond_12
    move v3, v5

    :goto_8
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_13

    new-instance v2, Lg0/d;

    invoke-direct {v2}, Lg0/d;-><init>()V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, Lg0/d;

    iget-object v3, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v4, Lg0/c;

    iget-object v6, v2, Lg0/d;->a:Lz1/p;

    invoke-virtual {v6}, Lz1/p;->clear()V

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v4, v1, v5}, Lg0/d;->a(Lg0/c;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_14
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, 0x2d4acc1b

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_15

    invoke-static {v2}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v3, Lp1/t2;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_16

    new-instance v2, Ld0/e;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh2/b;

    iget-wide v5, v5, Lh2/b;->a:J

    new-instance v7, Lh2/b;

    invoke-direct {v7, v5, v6}, Lh2/b;-><init>(J)V

    sget-object v5, Lf1/s0;->b:Ld0/f2;

    sget-wide v8, Lf1/s0;->c:J

    new-instance v6, Lh2/b;

    invoke-direct {v6, v8, v9}, Lh2/b;-><init>(J)V

    const/16 v8, 0x8

    invoke-direct {v2, v7, v5, v6, v8}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, Ld0/e;

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_17

    if-ne v6, v4, :cond_18

    :cond_17
    new-instance v6, La1/h;

    const/4 v5, 0x0

    const/16 v7, 0x16

    invoke-direct {v6, v3, v2, v5, v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v6, Lc93/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v6, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v2, v2, Ld0/e;->c:Ld0/m;

    iget-object v3, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_19

    if-ne v6, v4, :cond_1a

    :cond_19
    new-instance v6, Lt;

    const/4 v4, 0x2

    invoke-direct {v6, v2, v4}, Lt;-><init>(Lp1/t2;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v6, Lc93/a;

    invoke-interface {v3, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$SavedPaymentMethodRowButton"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1c

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_a

    :cond_1b
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_b

    :cond_1c
    :goto_a
    iget-object v1, v0, Ld30/b0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld30/x;

    iget-boolean v1, v1, Ld30/x;->c:Z

    iget-object v3, v0, Ld30/b0;->x:Ljava/lang/Object;

    check-cast v3, Lh20/l;

    const/4 v4, 0x0

    invoke-static {v3, v1, v2, v4}, Lds/q;->j(Lh20/l;ZLandroidx/compose/runtime/Composer;I)V

    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

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
