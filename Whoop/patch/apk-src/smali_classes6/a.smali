.class public final synthetic La;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Li3/i;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Li3/i;ZLc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, La;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La;->y:Li3/i;

    iput-boolean p2, p0, La;->x:Z

    iput-object p3, p0, La;->z:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(ZLi3/i;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, La;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La;->x:Z

    iput-object p2, p0, La;->y:Li3/i;

    iput-object p3, p0, La;->z:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, La;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "$this$composed"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v2

    check-cast v8, Lp1/q;

    const v2, 0x524c7a48

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v2, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_1

    invoke-static {v8}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v11, v4

    check-cast v11, Lbc3/c0;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    invoke-static {v8}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_2
    move-object v13, v4

    check-cast v13, Lj0/i;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_3

    const v4, 0x3f7851ec    # 0.97f

    goto :goto_0

    :cond_3
    const/high16 v4, 0x3f800000    # 1.0f

    :goto_0
    const/4 v5, 0x6

    const/16 v12, 0x96

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v12, v14, v15, v5}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v5

    const/16 v9, 0xc00

    const/16 v10, 0x14

    const-string v6, "bounceClickScale"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v4

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_4

    if-ne v6, v3, :cond_5

    :cond_4
    new-instance v6, Lb;

    const/4 v5, 0x0

    invoke-direct {v6, v4, v5}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v6}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-boolean v4, v0, La;->x:Z

    if-eqz v4, :cond_6

    const v4, -0xee8a391

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lf0/v0;

    :goto_1
    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    const v4, 0x31d46375

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    goto :goto_1

    :goto_2
    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8, v12}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, La;->z:Lc93/a;

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_7

    if-ne v6, v3, :cond_8

    :cond_7
    new-instance v6, Lc;

    const/4 v3, 0x0

    invoke-direct {v6, v11, v5, v2, v3}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    move v2, v14

    move-object v14, v15

    const/4 v15, 0x1

    const/16 v16, 0x0

    iget-object v3, v0, La;->y:Li3/i;

    move-object v12, v1

    move-object/from16 v17, v3

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->d(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLjava/lang/String;Li3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-object v1

    :pswitch_0
    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/ui/Modifier;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "$this$composed"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lp1/q;

    const v2, -0x25f25b25

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v2

    const-string v3, "tappable-effect-cards"

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    iget-object v12, v0, La;->y:Li3/i;

    iget-boolean v3, v0, La;->x:Z

    iget-object v13, v0, La;->z:Lc93/a;

    const/4 v4, 0x0

    if-eqz v2, :cond_9

    const v2, 0x19c49442

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    const-string v2, "onClick"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La;

    invoke-direct {v2, v3, v12, v13}, La;-><init>(ZLi3/i;Lc93/a;)V

    invoke-static {v9, v2}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_3

    :cond_9
    if-eqz v3, :cond_a

    const v2, 0x19c67ba9

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    const/16 v14, 0xb

    const/4 v10, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_3

    :cond_a
    const v2, 0x19c793df

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_b

    invoke-static {v1}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v2

    :cond_b
    move-object v10, v2

    check-cast v10, Lj0/i;

    move-object v14, v13

    move-object v13, v12

    const/4 v12, 0x0

    const/16 v15, 0xc

    const/4 v11, 0x0

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
