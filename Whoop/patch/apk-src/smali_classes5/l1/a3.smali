.class public final Ll1/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Z

.field public final synthetic G:Ll3/v0;

.field public final synthetic H:Lu0/r0;

.field public final synthetic I:Lu0/q0;

.field public final synthetic J:Z

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic M:Lq3/g0;

.field public final synthetic N:Lj0/i;

.field public final synthetic O:Lc93/m;

.field public final synthetic P:Li2/a1;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll1/e4;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll1/e4;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lj0/i;Lc93/m;Li2/a1;I)V
    .locals 1

    move/from16 v0, p16

    iput v0, p0, Ll1/a3;->w:I

    iput-object p1, p0, Ll1/a3;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ll1/a3;->y:Ll1/e4;

    iput-object p3, p0, Ll1/a3;->z:Ljava/lang/String;

    iput-object p4, p0, Ll1/a3;->E:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Ll1/a3;->F:Z

    iput-object p6, p0, Ll1/a3;->G:Ll3/v0;

    iput-object p7, p0, Ll1/a3;->H:Lu0/r0;

    iput-object p8, p0, Ll1/a3;->I:Lu0/q0;

    iput-boolean p9, p0, Ll1/a3;->J:Z

    iput p10, p0, Ll1/a3;->K:I

    iput p11, p0, Ll1/a3;->L:I

    iput-object p12, p0, Ll1/a3;->M:Lq3/g0;

    iput-object p13, p0, Ll1/a3;->N:Lj0/i;

    iput-object p14, p0, Ll1/a3;->O:Lc93/m;

    move-object/from16 p1, p15

    iput-object p1, p0, Ll1/a3;->P:Li2/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Ll1/a3;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const v3, 0x7f140426

    iget-object v4, v0, Ll1/a3;->x:Landroidx/compose/ui/Modifier;

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/lit8 v9, v8, 0x3

    if-eq v9, v5, :cond_0

    move v7, v6

    :cond_0
    and-int/lit8 v5, v8, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5, v7}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v1, v3}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    sget v3, Lm1/l0;->a:F

    sget v3, Ll1/h4;->c:F

    sget v5, Ll1/h4;->b:F

    invoke-static {v4, v3, v5}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v3, Li2/c1;

    iget-object v4, v0, Ll1/a3;->y:Ll1/e4;

    iget-wide v5, v4, Ll1/e4;->i:J

    invoke-direct {v3, v5, v6}, Li2/c1;-><init>(J)V

    new-instance v11, Ll1/z2;

    iget-object v5, v0, Ll1/a3;->O:Lc93/m;

    iget-object v6, v0, Ll1/a3;->P:Li2/a1;

    iget-object v8, v0, Ll1/a3;->z:Ljava/lang/String;

    iget-boolean v13, v0, Ll1/a3;->F:Z

    iget-boolean v14, v0, Ll1/a3;->J:Z

    iget-object v15, v0, Ll1/a3;->M:Lq3/g0;

    iget-object v7, v0, Ll1/a3;->N:Lj0/i;

    move-object/from16 v19, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v16, v7

    move-object v12, v8

    invoke-direct/range {v11 .. v19}, Ll1/z2;-><init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;)V

    const v4, 0x568400e5

    invoke-static {v4, v1, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v23

    const/high16 v26, 0x30000

    const/16 v27, 0x1000

    iget-object v9, v0, Ll1/a3;->E:Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    move v11, v13

    iget-object v13, v0, Ll1/a3;->G:Ll3/v0;

    move-object/from16 v21, v16

    move/from16 v16, v14

    iget-object v14, v0, Ll1/a3;->H:Lu0/r0;

    move-object/from16 v19, v15

    iget-object v15, v0, Ll1/a3;->I:Lu0/q0;

    iget v4, v0, Ll1/a3;->K:I

    iget v5, v0, Ll1/a3;->L:I

    const/16 v20, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v1

    move-object/from16 v22, v3

    move/from16 v17, v4

    move/from16 v18, v5

    invoke-static/range {v8 .. v27}, Lu0/i;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    goto :goto_0

    :cond_1
    move-object/from16 v24, v1

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_0
    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/lit8 v9, v8, 0x3

    if-eq v9, v5, :cond_2

    move v5, v6

    goto :goto_1

    :cond_2
    move v5, v7

    :goto_1
    and-int/2addr v6, v8

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_3

    const v5, -0x35d45166    # -2812838.5f

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-interface {v4, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v1, v3}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    sget v3, Lm1/l0;->a:F

    sget v3, Ll1/t2;->c:F

    sget v5, Ll1/t2;->b:F

    invoke-static {v4, v3, v5}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v3, Li2/c1;

    iget-object v4, v0, Ll1/a3;->y:Ll1/e4;

    iget-wide v5, v4, Ll1/e4;->i:J

    invoke-direct {v3, v5, v6}, Li2/c1;-><init>(J)V

    new-instance v11, Ll1/z2;

    iget-object v5, v0, Ll1/a3;->O:Lc93/m;

    iget-object v6, v0, Ll1/a3;->P:Li2/a1;

    iget-object v8, v0, Ll1/a3;->z:Ljava/lang/String;

    iget-boolean v13, v0, Ll1/a3;->F:Z

    iget-boolean v14, v0, Ll1/a3;->J:Z

    iget-object v15, v0, Ll1/a3;->M:Lq3/g0;

    iget-object v7, v0, Ll1/a3;->N:Lj0/i;

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    move-object/from16 v19, v6

    move-object/from16 v16, v7

    move-object v12, v8

    invoke-direct/range {v11 .. v19}, Ll1/z2;-><init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;Lc93/m;Ll1/e4;Li2/a1;)V

    const v4, -0x46e2e35b

    invoke-static {v4, v1, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v23

    const/high16 v26, 0x30000

    const/16 v27, 0x1000

    iget-object v9, v0, Ll1/a3;->E:Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    move v11, v13

    iget-object v13, v0, Ll1/a3;->G:Ll3/v0;

    move-object/from16 v21, v16

    move/from16 v16, v14

    iget-object v14, v0, Ll1/a3;->H:Lu0/r0;

    move-object/from16 v19, v15

    iget-object v15, v0, Ll1/a3;->I:Lu0/q0;

    iget v4, v0, Ll1/a3;->K:I

    iget v5, v0, Ll1/a3;->L:I

    const/16 v20, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v1

    move-object/from16 v22, v3

    move/from16 v17, v4

    move/from16 v18, v5

    invoke-static/range {v8 .. v27}, Lu0/i;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    goto :goto_2

    :cond_3
    move-object/from16 v24, v1

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_2
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
