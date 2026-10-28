.class public final Loj/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/a;ZI)V
    .locals 0

    const/4 p5, 0x1

    iput p5, p0, Loj/m;->w:I

    .line 1
    iput-object p1, p0, Loj/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Loj/m;->y:Ljava/lang/Object;

    iput-object p3, p0, Loj/m;->E:Ljava/lang/Object;

    iput-boolean p4, p0, Loj/m;->z:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;ZLc93/a;I)V
    .locals 0

    const/4 p5, 0x0

    iput p5, p0, Loj/m;->w:I

    .line 2
    iput-object p1, p0, Loj/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Loj/m;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Loj/m;->z:Z

    iput-object p4, p0, Loj/m;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lsj/f;Lcom/amplitude/android/engagement/types/Action;IZLjava/lang/String;)V
    .locals 0

    const/4 p3, 0x2

    iput p3, p0, Loj/m;->w:I

    .line 3
    iput-object p1, p0, Loj/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Loj/m;->y:Ljava/lang/Object;

    iput-boolean p4, p0, Loj/m;->z:Z

    iput-object p5, p0, Loj/m;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLrj/h;Luj/i;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    const/4 p5, 0x3

    iput p5, p0, Loj/m;->w:I

    .line 4
    iput-boolean p1, p0, Loj/m;->z:Z

    iput-object p2, p0, Loj/m;->x:Ljava/lang/Object;

    iput-object p3, p0, Loj/m;->y:Ljava/lang/Object;

    iput-object p4, p0, Loj/m;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v0, p0

    iget v1, v0, Loj/m;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Loj/m;->E:Ljava/lang/Object;

    iget-object v4, v0, Loj/m;->y:Ljava/lang/Object;

    iget-object v5, v0, Loj/m;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-object v7, v5

    check-cast v7, Lrj/h;

    move-object v8, v4

    check-cast v8, Luj/i;

    move-object v9, v3

    check-cast v9, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v11

    iget-boolean v6, v0, Loj/m;->z:Z

    invoke-static/range {v6 .. v11}, Lrj/o;->d(ZLrj/h;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p2

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    and-int/lit8 v6, v6, 0xb

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    move-object v6, v1

    check-cast v6, Lp1/q;

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v29, v2

    goto/16 :goto_2

    :cond_1
    :goto_0
    check-cast v1, Lp1/q;

    const v6, 0x4b527a0a    # 1.3793802E7f

    invoke-virtual {v1, v6}, Lp1/q;->f0(I)V

    sget-object v6, Luj/e;->j:Lp1/u2;

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/f;

    iget v6, v6, Ly3/f;->w:F

    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v6, v8

    new-instance v9, Ll0/l1;

    invoke-direct {v9, v6, v6, v6, v6}, Ll0/l1;-><init>(FFFF)V

    sget-object v6, Ll1/g;->a:Ll0/l1;

    const v6, -0x5ad94b74

    invoke-virtual {v1, v6}, Lp1/q;->f0(I)V

    sget-object v11, Luj/e;->g:Lp1/u2;

    invoke-virtual {v1, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Luj/a;

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    iget-wide v14, v12, Luj/a;->a:J

    invoke-virtual {v1, v6}, Lp1/q;->f0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Luj/a;

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    iget-wide v12, v12, Luj/a;->c:J

    sget-wide v18, Li2/x;->n:J

    sget-object v8, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v1, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll1/m;

    iget-object v6, v8, Ll1/m;->W:Ll1/f;

    if-nez v6, :cond_2

    new-instance v20, Ll1/f;

    sget-object v6, Lo1/k;->a:Lo1/f;

    invoke-static {v8, v6}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v21

    sget-object v6, Lo1/k;->j:Lo1/f;

    invoke-static {v8, v6}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v23

    sget-object v6, Lo1/k;->c:Lo1/f;

    move-object/from16 v29, v2

    move-object/from16 v30, v3

    invoke-static {v8, v6}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    sget v6, Lo1/k;->e:F

    invoke-static {v6, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v25

    sget-object v2, Lo1/k;->f:Lo1/f;

    invoke-static {v8, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    sget v6, Lo1/k;->g:F

    invoke-static {v6, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v27

    invoke-direct/range {v20 .. v28}, Ll1/f;-><init>(JJJJ)V

    move-object/from16 v6, v20

    iput-object v6, v8, Ll1/m;->W:Ll1/f;

    goto :goto_1

    :cond_2
    move-object/from16 v29, v2

    move-object/from16 v30, v3

    :goto_1
    move-wide/from16 v20, v18

    move-wide/from16 v16, v12

    move-object v13, v6

    invoke-virtual/range {v13 .. v21}, Ll1/f;->a(JJJJ)Ll1/f;

    move-result-object v13

    int-to-float v2, v7

    const v3, -0x5ad94b74

    invoke-virtual {v1, v3}, Lp1/q;->f0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/a;

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    iget-wide v11, v3, Luj/a;->b:J

    invoke-static {v2, v11, v12}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v15

    const v2, -0x316077b7

    invoke-virtual {v1, v2}, Lp1/q;->f0(I)V

    sget-object v2, Luj/e;->h:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luj/b;

    iget-object v12, v2, Luj/b;->a:Li2/a1;

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    check-cast v5, Lsj/f;

    check-cast v4, Lcom/amplitude/android/engagement/types/Action;

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, La3/z0;

    const/16 v2, 0x1a

    invoke-direct {v3, v2, v5, v4}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lc93/a;

    new-instance v2, Lnj/f;

    move-object/from16 v4, v30

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, v4, v7}, Lnj/f;-><init>(Ljava/lang/Object;I)V

    const v4, -0x7db965c9    # -1.4591E-37f

    invoke-static {v4, v1, v2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    const/high16 v19, 0x30c00000

    const/16 v20, 0x120

    iget-boolean v11, v0, Loj/m;->z:Z

    const/4 v14, 0x0

    move-object/from16 v18, v1

    move-object/from16 v16, v9

    move-object v9, v3

    invoke-static/range {v9 .. v20}, Ll1/k3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll1/h;Lf0/t;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    return-object v29

    :pswitch_1
    move-object/from16 v29, v2

    move-object/from16 v30, v3

    move-object/from16 v25, p1

    check-cast v25, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-object/from16 v21, v5

    check-cast v21, Lcom/amplitude/android/engagement/types/Nudge;

    move-object/from16 v22, v4

    check-cast v22, Lcom/amplitude/android/engagement/types/SimulationContext;

    move-object/from16 v23, v30

    check-cast v23, Lcom/amplitude/android/engagement/a;

    const/16 v1, 0x249

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v26

    iget-boolean v1, v0, Loj/m;->z:Z

    move/from16 v24, v1

    invoke-static/range {v21 .. v26}, Lce/w;->q(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/a;ZLandroidx/compose/runtime/Composer;I)V

    return-object v29

    :pswitch_2
    move-object/from16 v29, v2

    move-object/from16 v30, v3

    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-object v2, v5

    check-cast v2, Lcom/amplitude/android/engagement/types/Nudge;

    move-object v3, v4

    check-cast v3, Lcom/amplitude/android/engagement/types/SimulationContext;

    move-object/from16 v5, v30

    check-cast v5, Lc93/a;

    const/16 v1, 0x49

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v7

    iget-boolean v4, v0, Loj/m;->z:Z

    invoke-static/range {v2 .. v7}, Lo73/a;->f(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object v29

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
