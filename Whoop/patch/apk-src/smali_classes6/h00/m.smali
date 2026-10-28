.class public final Lh00/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Z

.field public final synthetic z:Lse/h;


# direct methods
.method public constructor <init>(Lc93/a;ZLse/h;I)V
    .locals 0

    iput p4, p0, Lh00/m;->w:I

    packed-switch p4, :pswitch_data_0

    sget-object p4, Lh20/n1;->w:Lh20/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/m;->x:Lc93/a;

    iput-boolean p2, p0, Lh00/m;->y:Z

    iput-object p3, p0, Lh00/m;->z:Lse/h;

    return-void

    :pswitch_0
    sget-object p4, Lh20/n1;->w:Lh20/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/m;->x:Lc93/a;

    iput-boolean p2, p0, Lh00/m;->y:Z

    iput-object p3, p0, Lh00/m;->z:Lse/h;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget v1, v0, Lh00/m;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    iget-object v4, v0, Lh00/m;->z:Lse/h;

    const/4 v5, 0x2

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p2

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    and-int/lit8 v6, v6, 0x3

    if-ne v6, v5, :cond_1

    move-object v5, v1

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v5, Lh00/m;

    sget-object v6, Lh20/n1;->w:Lh20/n1;

    iget-object v6, v0, Lh00/m;->x:Lc93/a;

    iget-boolean v7, v0, Lh00/m;->y:Z

    invoke-direct {v5, v6, v7, v4, v3}, Lh00/m;-><init>(Lc93/a;ZLse/h;I)V

    const v3, 0x30677500

    invoke-static {v3, v1, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x30

    const/4 v5, 0x0

    invoke-static {v5, v3, v1, v4}, Lg00/g;->a(Lwz/d0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    return-object v2

    :pswitch_0
    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v6, Lh20/n1;->w:Lh20/n1;

    and-int/lit8 v1, v1, 0x3

    if-ne v1, v5, :cond_3

    move-object v1, v15

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v15}, Le4/a;->C(Landroidx/compose/runtime/Composer;)Lb30/h4;

    move-result-object v5

    iget v5, v5, Lb30/h4;->c:F

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v1, v6, v5, v7}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v5, Lh00/o;->a:F

    move-object v5, v15

    check-cast v5, Lp1/q;

    const v6, -0x23bdef1d

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const v6, 0x7c6fd560

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lh20/n1;->w:Lh20/n1;

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    const-string v6, "LinkButtonTestTag"

    invoke-static {v1, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Ld40/p;->e:Ld40/k;

    iget-object v6, v6, Ld40/k;->c:Ld40/j;

    iget v6, v6, Ld40/j;->a:F

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v14

    int-to-float v6, v3

    const/16 v12, 0x6db6

    const/4 v13, 0x0

    move v7, v6

    move v8, v6

    move v9, v6

    move v10, v6

    move-object v11, v15

    invoke-static/range {v6 .. v13}, Lg1/v0;->b(FFFFFLandroidx/compose/runtime/Composer;II)Lg1/q1;

    move-result-object v9

    const v6, 0x469047e8

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const v6, -0x475dd771

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static {v5}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-wide v16, Lg00/a;->l:J

    invoke-static {v5}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-wide v6, Lg00/a;->a:J

    invoke-static {v5}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v5, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li2/x;

    iget-wide v10, v8, Li2/x;->a:J

    sget-object v8, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v5, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg1/c1;

    invoke-virtual {v8}, Lg1/c1;->i()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    goto :goto_3

    :cond_4
    invoke-static {v10, v11}, Li2/w0;->x(J)F

    :goto_3
    const v8, 0x3ec28f5c    # 0.38f

    invoke-static {v8, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v22

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-wide/from16 v20, v16

    move-object/from16 v24, v5

    move-wide/from16 v18, v6

    invoke-static/range {v16 .. v26}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    sget v3, Lh00/o;->b:F

    sget v5, Lh00/o;->a:F

    new-instance v13, Ll0/l1;

    invoke-direct {v13, v3, v5, v3, v5}, Ll0/l1;-><init>(FFFF)V

    new-instance v3, Lb30/o4;

    invoke-direct {v3, v4}, Lb30/o4;-><init>(Lse/h;)V

    const v4, -0x43d078f0

    invoke-static {v4, v15, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/high16 v16, 0x36000000

    const/16 v17, 0x48

    iget-object v6, v0, Lh00/m;->x:Lc93/a;

    iget-boolean v8, v0, Lh00/m;->y:Z

    const/4 v11, 0x0

    move-object v7, v1

    move-object v10, v14

    move-object v14, v3

    invoke-static/range {v6 .. v17}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
