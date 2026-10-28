.class public final synthetic Lb30/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/y0;


# direct methods
.method public synthetic constructor <init>(Lb30/y0;I)V
    .locals 0

    iput p2, p0, Lb30/s0;->w:I

    iput-object p1, p0, Lb30/s0;->x:Lb30/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lb30/s0;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Lb30/s0;->x:Lb30/y0;

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lb30/e6;->a:Lb30/e6;

    invoke-virtual {v3, v1}, Lb30/y0;->c(Ltx/f;)V

    return-object v2

    :pswitch_0
    sget-object v1, Lb30/g6;->a:Lb30/g6;

    invoke-virtual {v3, v1}, Lb30/y0;->c(Ltx/f;)V

    return-object v2

    :pswitch_1
    iget-object v1, v3, Lb30/y0;->f:Ljava/util/Set;

    iget-object v9, v3, Lb30/y0;->n:Lkotlin/jvm/functions/Function1;

    iget-object v2, v3, Lb30/y0;->c:Lh20/l;

    iget-object v5, v3, Lb30/y0;->q:Lhc3/d;

    iget-object v4, v3, Lb30/y0;->p:Lb30/f4;

    iget-object v6, v3, Lb30/y0;->d:Lux/a;

    iget-object v7, v2, Lh20/l;->c:Lh20/r4;

    instance-of v8, v7, Lh20/m4;

    if-eqz v8, :cond_3

    check-cast v7, Lh20/m4;

    iget-boolean v8, v3, Lb30/y0;->g:Z

    invoke-virtual {v2, v8}, Lh20/l;->d(Z)Z

    move-result v13

    iget-object v14, v7, Lh20/m4;->a:Ly00/z3;

    iget-object v7, v7, Lh20/m4;->b:Ly00/v3;

    const-string v15, "card"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Lb30/i1;

    iget-object v11, v14, Ly00/z3;->H:Ljava/lang/String;

    iget-object v10, v14, Ly00/z3;->z:Ljava/lang/Integer;

    iget-object v12, v14, Ly00/z3;->E:Ljava/lang/Integer;

    iget-object v0, v14, Ly00/z3;->w:Ly00/i;

    move-object/from16 v19, v0

    iget-object v0, v14, Ly00/z3;->L:Ljava/lang/String;

    iget-object v14, v14, Ly00/z3;->K:Ly00/x3;

    if-eqz v14, :cond_0

    iget-object v14, v14, Ly00/x3;->w:Ljava/util/Set;

    move-object/from16 v21, v14

    :goto_0
    move-object/from16 v20, v0

    move-object/from16 v22, v7

    move-object/from16 v17, v10

    move-object/from16 v16, v11

    move-object/from16 v18, v12

    goto :goto_1

    :cond_0
    const/16 v21, 0x0

    goto :goto_0

    :goto_1
    invoke-direct/range {v15 .. v22}, Lb30/i1;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ly00/i;Ljava/lang/String;Ljava/util/Set;Ly00/v3;)V

    new-instance v0, Lb30/y;

    if-eqz v13, :cond_1

    invoke-virtual {v2}, Lh20/l;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    :goto_2
    if-eqz v13, :cond_2

    if-eqz v8, :cond_2

    const/4 v10, 0x1

    goto :goto_3

    :cond_2
    const/4 v10, 0x0

    :goto_3
    invoke-direct {v0, v6, v2, v10}, Lb30/y;-><init>(Lux/a;ZZ)V

    iget-object v2, v3, Lb30/y0;->e:Lh20/j1;

    sget-object v6, Lh20/k1;->w:Lh20/k1;

    new-instance v8, Lh20/l1;

    invoke-direct {v8, v2, v1}, Lh20/l1;-><init>(Lh20/j1;Ljava/util/Set;)V

    new-instance v10, Lb30/r0;

    const/4 v1, 0x2

    invoke-direct {v10, v3, v1}, Lb30/r0;-><init>(Lb30/y0;I)V

    move-object v6, v0

    move-object v7, v15

    invoke-virtual/range {v4 .. v10}, Lb30/f4;->a(Lhc3/d;Lb30/y;Lb30/i1;Lh20/l1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lb30/m0;

    move-result-object v0

    goto :goto_5

    :cond_3
    instance-of v0, v7, Lh20/n4;

    if-eqz v0, :cond_6

    check-cast v7, Lh20/n4;

    iget-object v0, v7, Lh20/n4;->a:Ly00/s2;

    instance-of v2, v0, Ly00/r2;

    if-eqz v2, :cond_4

    move-object v11, v0

    check-cast v11, Ly00/r2;

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    if-eqz v11, :cond_5

    new-instance v7, Lb30/i1;

    iget-object v13, v11, Ly00/r2;->z:Ljava/lang/String;

    iget v0, v11, Ly00/r2;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget v0, v11, Ly00/r2;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iget-object v0, v11, Ly00/r2;->E:Ly00/i;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v0

    move-object v12, v7

    invoke-direct/range {v12 .. v19}, Lb30/i1;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ly00/i;Ljava/lang/String;Ljava/util/Set;Ly00/v3;)V

    new-instance v0, Lb30/y;

    const/4 v2, 0x0

    invoke-direct {v0, v6, v2, v2}, Lb30/y;-><init>(Lux/a;ZZ)V

    sget-object v2, Lh20/j1;->x:Lh20/j1;

    sget-object v6, Lh20/k1;->w:Lh20/k1;

    new-instance v8, Lh20/l1;

    invoke-direct {v8, v2, v1}, Lh20/l1;-><init>(Lh20/j1;Ljava/util/Set;)V

    new-instance v10, Lb30/r0;

    const/4 v1, 0x1

    invoke-direct {v10, v3, v1}, Lb30/r0;-><init>(Lb30/y0;I)V

    move-object v6, v0

    invoke-virtual/range {v4 .. v10}, Lb30/f4;->a(Lhc3/d;Lb30/y;Lb30/i1;Lh20/l1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lb30/m0;

    move-result-object v0

    :goto_5
    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Link payment method is not a card"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Card or Link payment method required for creating EditCardDetailsInteractor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
