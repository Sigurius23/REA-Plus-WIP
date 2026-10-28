.class public final Li20/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Li20/j1;

.field public final synthetic y:Lp1/t2;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Li20/j1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Li20/d1;->w:I

    iput-object p1, p0, Li20/d1;->x:Li20/j1;

    iput-object p2, p0, Li20/d1;->y:Lp1/t2;

    iput-object p3, p0, Li20/d1;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Li20/d1;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$InputAddressScreen"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_3

    :cond_1
    :goto_0
    iget-object v1, v0, Li20/d1;->x:Li20/j1;

    iget-object v3, v1, Li20/j1;->w:Li20/h;

    iget-object v3, v3, Li20/h;->x:Li20/s;

    if-eqz v3, :cond_2

    iget-object v3, v3, Li20/s;->E:Li20/r;

    if-eqz v3, :cond_2

    iget-object v3, v3, Li20/r;->x:Ljava/lang/String;

    :goto_1
    move-object v7, v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    const/4 v3, 0x4

    int-to-float v3, v3

    const/4 v4, 0x1

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static {v5, v6, v3, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    iget-object v3, v0, Li20/d1;->y:Lp1/t2;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v5, v0, Li20/d1;->z:Lp1/t2;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    move-object v10, v2

    check-cast v10, Lp1/q;

    const v2, -0x54e2ae4f

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_4

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v5, v2, :cond_5

    :cond_4
    new-instance v5, Lh02/h;

    const/16 v2, 0xd

    invoke-direct {v5, v2, v1, v3}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/4 v11, 0x6

    const/4 v12, 0x2

    const/4 v5, 0x0

    invoke-static/range {v4 .. v12}, Lx30/s0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$InputAddressScreen"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_7

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_5

    :cond_7
    :goto_4
    iget-object v1, v0, Li20/d1;->y:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/i1;

    instance-of v3, v1, Li20/h1;

    if-eqz v3, :cond_a

    const/16 v3, 0x8

    int-to-float v8, v3

    const/4 v9, 0x7

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    check-cast v1, Li20/h1;

    iget-boolean v12, v1, Li20/h1;->a:Z

    const v1, 0x7f14105e

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    invoke-static {v1, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v13

    iget-object v1, v0, Li20/d1;->z:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    check-cast v2, Lp1/q;

    const v1, 0x15c583b1

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Li20/d1;->x:Li20/j1;

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_9

    :cond_8
    new-instance v4, Lhb2/c;

    const/4 v3, 0x7

    invoke-direct {v4, v1, v3}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    const/16 v17, 0x6

    const/16 v18, 0x2

    const/4 v11, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v10 .. v18}, Lx30/s0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :cond_a
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
