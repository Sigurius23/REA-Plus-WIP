.class public final Lb30/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lzy/b;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lb30/h4;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Lb30/h4;JZZLc93/a;Lzy/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/p4;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/p4;->y:Lb30/h4;

    iput-wide p2, p0, Lb30/p4;->z:J

    iput-boolean p4, p0, Lb30/p4;->x:Z

    iput-boolean p5, p0, Lb30/p4;->E:Z

    iput-object p6, p0, Lb30/p4;->F:Lc93/a;

    iput-object p7, p0, Lb30/p4;->G:Lzy/b;

    return-void
.end method

.method public constructor <init>(ZLb30/h4;JZLc93/a;Lzy/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb30/p4;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/p4;->x:Z

    iput-object p2, p0, Lb30/p4;->y:Lb30/h4;

    iput-wide p3, p0, Lb30/p4;->z:J

    iput-boolean p5, p0, Lb30/p4;->E:Z

    iput-object p6, p0, Lb30/p4;->F:Lc93/a;

    iput-object p7, p0, Lb30/p4;->G:Lzy/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lb30/p4;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v9, v6

    check-cast v9, Lp1/q;

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_2

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v4, v9, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lg1/h3;->a:Lp1/u2;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v10, Lb30/p4;

    iget-object v11, v0, Lb30/p4;->y:Lb30/h4;

    iget-wide v12, v0, Lb30/p4;->z:J

    iget-boolean v14, v0, Lb30/p4;->E:Z

    iget-boolean v15, v0, Lb30/p4;->x:Z

    iget-object v3, v0, Lb30/p4;->F:Lc93/a;

    iget-object v4, v0, Lb30/p4;->G:Lzy/b;

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    invoke-direct/range {v10 .. v17}, Lb30/p4;-><init>(Lb30/h4;JZZLc93/a;Lzy/b;)V

    const v3, 0x766d8752

    invoke-static {v3, v6, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v1, v3, v6, v4}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const v1, -0xea49402

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    if-eqz v15, :cond_5

    sget-object v1, Lb2/e;->F:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v2, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v1, 0x8

    int-to-float v11, v1

    const/4 v14, 0x0

    const/16 v15, 0xa

    const/4 v12, 0x0

    move v13, v11

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "REMOVE_BUTTON_LOADING"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v9, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->c()J

    move-result-wide v2

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    :cond_5
    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_7

    move-object v1, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_6

    :cond_7
    :goto_3
    sget-object v1, Lb2/t;->w:Lb2/t;

    sget-object v3, Lb2/e;->E:Lb2/m;

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v1, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v3, "update_payment_method_remove_button"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v3, v0, Lb30/p4;->y:Lb30/h4;

    iget v4, v3, Lb30/h4;->c:F

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v1, v5, v4, v6}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget v4, v3, Lb30/h4;->b:F

    int-to-float v2, v2

    cmpg-float v5, v4, v2

    if-gez v5, :cond_8

    move v4, v2

    :cond_8
    iget-wide v7, v0, Lb30/p4;->z:J

    invoke-static {v4, v7, v8}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v2

    iget v3, v3, Lb30/h4;->a:F

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    iget-boolean v3, v0, Lb30/p4;->x:Z

    if-eqz v3, :cond_9

    iget-boolean v3, v0, Lb30/p4;->E:Z

    if-nez v3, :cond_9

    :goto_4
    move v4, v6

    goto :goto_5

    :cond_9
    const/4 v6, 0x0

    goto :goto_4

    :goto_5
    new-instance v3, Lb30/o4;

    iget-object v6, v0, Lb30/p4;->G:Lzy/b;

    const/4 v7, 0x0

    invoke-direct {v3, v6, v7}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v6, -0x5281f31

    invoke-static {v6, v10, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x30000000

    const/16 v12, 0x198

    move-object v6, v2

    iget-object v2, v0, Lb30/p4;->F:Lc93/a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v1

    invoke-static/range {v2 .. v12}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
