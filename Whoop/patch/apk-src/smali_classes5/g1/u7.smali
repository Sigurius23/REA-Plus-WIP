.class public final Lg1/u7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material/d;ZLc93/a;Lx1/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/u7;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/u7;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lg1/u7;->x:Z

    iput-object p3, p0, Lg1/u7;->E:Ljava/lang/Object;

    iput-boolean p4, p0, Lg1/u7;->y:Z

    iput-object p5, p0, Lg1/u7;->F:Ljava/lang/Object;

    iput-object p6, p0, Lg1/u7;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg2/s;Lp1/c1;Ln00/d;ZZLg40/m3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/u7;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/u7;->z:Ljava/lang/Object;

    iput-object p2, p0, Lg1/u7;->E:Ljava/lang/Object;

    iput-object p3, p0, Lg1/u7;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Lg1/u7;->x:Z

    iput-boolean p5, p0, Lg1/u7;->y:Z

    iput-object p6, p0, Lg1/u7;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lg1/u7;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Lg1/u7;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    and-int/lit8 v2, v2, 0x3

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    const/4 v2, 0x4

    int-to-float v2, v2

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v5, v2, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v4, v0, Lg1/u7;->z:Ljava/lang/Object;

    check-cast v4, Lg2/s;

    invoke-static {v2, v4}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v1, Lp1/q;

    const v4, -0x6085d40

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_3

    :cond_2
    new-instance v5, Ljs2/e;

    const/16 v4, 0xf

    invoke-direct {v5, v4, v3}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    invoke-static {v2, v5}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    iget-object v2, v0, Lg1/u7;->F:Ljava/lang/Object;

    check-cast v2, Ln00/d;

    sget-object v4, Ln00/d;->y:Ln00/d;

    if-ne v2, v4, :cond_4

    const/4 v4, 0x6

    :goto_1
    move v9, v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x7

    goto :goto_1

    :goto_2
    iget-boolean v4, v0, Lg1/u7;->x:Z

    if-eqz v4, :cond_5

    iget-boolean v4, v0, Lg1/u7;->y:Z

    if-eqz v4, :cond_5

    sget-object v4, Ln00/d;->x:Ln00/d;

    if-eq v2, v4, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    move v8, v3

    :goto_3
    iget-object v2, v0, Lg1/u7;->G:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lg40/m3;

    const/16 v18, 0x0

    const/16 v19, 0x3f0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v7 .. v19}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
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

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lg1/u7;->z:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lg1/u7;->E:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Lf0/v0;

    new-instance v11, Li3/i;

    const/4 v2, 0x4

    invoke-direct {v11, v2}, Li3/i;-><init>(I)V

    iget-object v2, v0, Lg1/u7;->F:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Lc93/a;

    iget-boolean v7, v0, Lg1/u7;->x:Z

    const/4 v8, 0x0

    iget-boolean v10, v0, Lg1/u7;->y:Z

    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/selection/b;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->e:Ll0/h;

    iget-object v6, v0, Lg1/u7;->G:Ljava/lang/Object;

    check-cast v6, Lx1/b;

    const/16 v7, 0x36

    invoke-static {v4, v3, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ll0/z;->a:Ll0/z;

    invoke-virtual {v6, v3, v1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
