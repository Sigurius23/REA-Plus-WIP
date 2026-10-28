.class public final synthetic Lp6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp6/l;

.field public final synthetic y:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lp6/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lp6/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/c;->y:Landroid/content/Context;

    iput-object p2, p0, Lp6/c;->x:Lp6/l;

    return-void
.end method

.method public synthetic constructor <init>(Lp6/l;Landroid/content/Context;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lp6/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/c;->x:Lp6/l;

    iput-object p2, p0, Lp6/c;->y:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lp6/c;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_1
    :goto_0
    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_2

    new-instance v1, Ly3/h;

    const-wide/16 v5, 0x0

    invoke-direct {v1, v5, v6}, Ly3/h;-><init>(J)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v12, v1

    check-cast v12, Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v10, v0, Lp6/c;->x:Lp6/l;

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    iget-object v15, v0, Lp6/c;->y:Landroid/content/Context;

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/4 v13, 0x0

    if-nez v3, :cond_4

    if-ne v5, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v10

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v9, Lp33/m;

    const/4 v14, 0x1

    move-object v11, v15

    invoke-direct/range {v9 .. v14}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v3, v10

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v9

    :goto_2
    check-cast v5, Lc93/m;

    invoke-static {v8, v5, v1}, Lp1/x;->A(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v11, 0x0

    if-eqz v1, :cond_8

    const v1, -0x5bda1222

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    iget-object v14, v3, Lp6/l;->e:Lp6/g0;

    iget-object v1, v3, Lp6/l;->f:Lp6/b;

    move-object/from16 v17, v13

    new-instance v13, Lp33/m;

    const/16 v18, 0x2

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v18}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v1, v13

    move-object/from16 v13, v17

    invoke-static {v1}, Lec3/v;->l(Lc93/m;)Lec3/h;

    move-result-object v1

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, v1

    check-cast v5, Lec3/l;

    const/16 v9, 0x30

    const/4 v10, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lc93/m;

    if-nez v9, :cond_6

    const v1, -0x5bd81d4b

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    const v1, -0x5bd81d4a

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    iget-object v10, v3, Lp6/l;->h:Lp6/u1;

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/h;

    iget-wide v6, v1, Ly3/h;->a:J

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lcom/squareup/wire/n;->a(IJLandroidx/compose/runtime/Composer;Lc93/m;Lp6/u1;)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object v13, v4

    :goto_3
    if-nez v13, :cond_7

    const v1, -0x4d490390

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-static {v8, v11}, Lo73/a;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    const v1, -0x4d49195c

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    const v1, -0x5bd6e6ce

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-static {v8, v11}, Lo73/a;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_9

    if-ne v5, v2, :cond_a

    :cond_9
    new-instance v5, Lnr0/e;

    const/16 v1, 0x18

    invoke-direct {v5, v3, v1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lc93/a;

    invoke-static {v5, v8}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :goto_6
    return-object v4

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_c

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_8

    :cond_c
    :goto_7
    sget-object v2, Ln6/h;->b:Lp1/u2;

    iget-object v3, v0, Lp6/c;->y:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    sget-object v4, Ln6/h;->d:Lp1/u2;

    iget-object v5, v0, Lp6/c;->x:Lp6/l;

    iget-object v6, v5, Lp6/l;->f:Lp6/b;

    invoke-virtual {v4, v6}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    sget-object v6, Lp6/q;->a:Lp1/b0;

    iget-object v7, v5, Lp6/l;->k:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/os/Bundle;

    if-nez v7, :cond_d

    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_d
    invoke-virtual {v6, v7}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    sget-object v7, Ln6/h;->c:Lp1/b0;

    iget-object v8, v5, Lp6/l;->j:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v7

    filled-new-array {v2, v4, v6, v7}, [Lp1/u1;

    move-result-object v2

    new-instance v4, Lp6/c;

    invoke-direct {v4, v5, v3}, Lp6/c;-><init>(Lp6/l;Landroid/content/Context;)V

    const v3, -0x6bf7d19e

    invoke-static {v3, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v2, v3, v1, v4}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
