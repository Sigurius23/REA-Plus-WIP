.class public final Ll1/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lq3/y;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Z

.field public final synthetic H:Ll3/v0;

.field public final synthetic I:Lu0/r0;

.field public final synthetic J:Lu0/q0;

.field public final synthetic K:Z

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:Lq3/g0;

.field public final synthetic O:Lj0/i;

.field public final synthetic P:Lc93/m;

.field public final synthetic Q:Lc93/m;

.field public final synthetic R:Li2/a1;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Z

.field public final synthetic z:Ll1/e4;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lc93/m;ZLl1/e4;Lq3/y;Lkotlin/jvm/functions/Function1;ZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lj0/i;Lc93/m;Lc93/m;Li2/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/b3;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ll1/b3;->x:Lc93/m;

    iput-boolean p3, p0, Ll1/b3;->y:Z

    iput-object p4, p0, Ll1/b3;->z:Ll1/e4;

    iput-object p5, p0, Ll1/b3;->E:Lq3/y;

    iput-object p6, p0, Ll1/b3;->F:Lkotlin/jvm/functions/Function1;

    iput-boolean p7, p0, Ll1/b3;->G:Z

    iput-object p8, p0, Ll1/b3;->H:Ll3/v0;

    iput-object p9, p0, Ll1/b3;->I:Lu0/r0;

    iput-object p10, p0, Ll1/b3;->J:Lu0/q0;

    iput-boolean p11, p0, Ll1/b3;->K:Z

    iput p12, p0, Ll1/b3;->L:I

    iput p13, p0, Ll1/b3;->M:I

    iput-object p14, p0, Ll1/b3;->N:Lq3/g0;

    iput-object p15, p0, Ll1/b3;->O:Lj0/i;

    move-object/from16 p1, p16

    iput-object p1, p0, Ll1/b3;->P:Lc93/m;

    move-object/from16 p1, p17

    iput-object p1, p0, Ll1/b3;->Q:Lc93/m;

    move-object/from16 p1, p18

    iput-object p1, p0, Ll1/b3;->R:Li2/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Ll1/b3;->x:Lc93/m;

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_2

    const v2, -0x715731da

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_1

    new-instance v2, Lkx1/b;

    const/16 v4, 0x9

    invoke-direct {v2, v4}, Lkx1/b;-><init>(I)V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v5, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v1}, Lm1/l0;->d(Landroidx/compose/runtime/Composer;)F

    move-result v9

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    const v2, -0x71515713

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    :goto_1
    iget-object v2, v0, Ll1/b3;->w:Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v3, 0x7f140426

    invoke-static {v1, v3}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lm1/l0;->a:F

    iget-boolean v4, v0, Ll1/b3;->y:Z

    if-eqz v4, :cond_3

    new-instance v5, Lht2/d;

    const/16 v7, 0x16

    invoke-direct {v5, v3, v7}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-static {v2, v6, v5}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    :cond_3
    sget v3, Ll1/t2;->c:F

    sget v5, Ll1/t2;->b:F

    invoke-static {v2, v3, v5}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v2, Li2/c1;

    iget-object v3, v0, Ll1/b3;->z:Ll1/e4;

    if-eqz v4, :cond_4

    iget-wide v4, v3, Ll1/e4;->j:J

    goto :goto_2

    :cond_4
    iget-wide v4, v3, Ll1/e4;->i:J

    :goto_2
    invoke-direct {v2, v4, v5}, Li2/c1;-><init>(J)V

    new-instance v10, Lg1/h4;

    iget-object v4, v0, Ll1/b3;->Q:Lc93/m;

    iget-object v5, v0, Ll1/b3;->R:Li2/a1;

    iget-object v7, v0, Ll1/b3;->E:Lq3/y;

    iget-boolean v12, v0, Ll1/b3;->G:Z

    iget-boolean v13, v0, Ll1/b3;->K:Z

    iget-object v14, v0, Ll1/b3;->N:Lq3/g0;

    iget-object v15, v0, Ll1/b3;->O:Lj0/i;

    iget-boolean v6, v0, Ll1/b3;->y:Z

    iget-object v8, v0, Ll1/b3;->x:Lc93/m;

    iget-object v11, v0, Ll1/b3;->P:Lc93/m;

    move-object/from16 v20, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v5

    move/from16 v16, v6

    move-object/from16 v17, v8

    move-object/from16 v18, v11

    move-object v11, v7

    invoke-direct/range {v10 .. v21}, Lg1/h4;-><init>(Lq3/y;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Ll1/e4;Li2/a1;)V

    const v3, 0x2834ae32

    invoke-static {v3, v1, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v22

    const/high16 v25, 0x30000

    const/16 v26, 0x1000

    iget-object v8, v0, Ll1/b3;->F:Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    move v10, v12

    iget-object v12, v0, Ll1/b3;->H:Ll3/v0;

    move-object/from16 v20, v15

    move v15, v13

    iget-object v13, v0, Ll1/b3;->I:Lu0/r0;

    move-object/from16 v18, v14

    iget-object v14, v0, Ll1/b3;->J:Lu0/q0;

    iget v3, v0, Ll1/b3;->L:I

    iget v4, v0, Ll1/b3;->M:I

    const/16 v19, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v1

    move-object/from16 v21, v2

    move/from16 v16, v3

    move/from16 v17, v4

    invoke-static/range {v7 .. v26}, Lu0/i;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_5
    move-object/from16 v23, v1

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
