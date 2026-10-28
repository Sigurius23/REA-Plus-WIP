.class public final Lg40/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:I

.field public final synthetic H:Lg2/i;

.field public final synthetic I:Ld40/g;

.field public final synthetic J:Z

.field public final synthetic K:Lc93/m;

.field public final synthetic L:Lc93/m;

.field public final synthetic M:Lg1/y1;

.field public final synthetic N:Lp1/t2;

.field public final synthetic O:Lp1/c1;

.field public final synthetic P:Lp1/t2;

.field public final synthetic Q:Lp1/t2;

.field public final synthetic R:Lp1/t2;

.field public final synthetic w:Lg40/z1;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lr0/a;

.field public final synthetic z:Lg2/s;


# direct methods
.method public constructor <init>(Lg40/z1;Landroidx/compose/ui/Modifier;Lr0/a;Lg2/s;Lbc3/c0;Lp1/c1;ILg2/i;Ld40/g;ZLc93/m;Lc93/m;Lg1/y1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/f2;->w:Lg40/z1;

    iput-object p2, p0, Lg40/f2;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg40/f2;->y:Lr0/a;

    iput-object p4, p0, Lg40/f2;->z:Lg2/s;

    iput-object p5, p0, Lg40/f2;->E:Lbc3/c0;

    iput-object p6, p0, Lg40/f2;->F:Lp1/c1;

    iput p7, p0, Lg40/f2;->G:I

    iput-object p8, p0, Lg40/f2;->H:Lg2/i;

    iput-object p9, p0, Lg40/f2;->I:Ld40/g;

    iput-boolean p10, p0, Lg40/f2;->J:Z

    iput-object p11, p0, Lg40/f2;->K:Lc93/m;

    iput-object p12, p0, Lg40/f2;->L:Lc93/m;

    iput-object p13, p0, Lg40/f2;->M:Lg1/y1;

    iput-object p14, p0, Lg40/f2;->N:Lp1/t2;

    iput-object p15, p0, Lg40/f2;->O:Lp1/c1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lg40/f2;->P:Lp1/t2;

    move-object/from16 p1, p17

    iput-object p1, p0, Lg40/f2;->Q:Lp1/t2;

    move-object/from16 p1, p18

    iput-object p1, p0, Lg40/f2;->R:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-object v2, v0, Lg40/f2;->N:Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    check-cast v1, Lp1/q;

    const v2, 0x810c500

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    iget-object v6, v0, Lg40/f2;->w:Lg40/z1;

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_2

    if-ne v4, v12, :cond_3

    :cond_2
    new-instance v4, La1/e;

    const/4 v10, 0x0

    const/16 v11, 0x1c

    const/4 v5, 0x1

    const-class v7, Lg40/z1;

    const-string v8, "onValueChange"

    const-string v9, "onValueChange(Ljava/lang/String;)V"

    invoke-direct/range {v4 .. v11}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lj93/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    iget-object v5, v0, Lg40/f2;->x:Landroidx/compose/ui/Modifier;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v6, v0, Lg40/f2;->y:Lr0/a;

    invoke-static {v5, v6}, Landroidx/compose/foundation/relocation/a;->a(Landroidx/compose/ui/Modifier;Lr0/a;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v7, v0, Lg40/f2;->z:Lg2/s;

    invoke-static {v5, v7}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lc2/n;->d0:Lc2/n;

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const v8, 0x810ee20

    invoke-virtual {v1, v8}, Lp1/q;->e0(I)V

    iget-object v15, v0, Lg40/f2;->w:Lg40/z1;

    invoke-virtual {v1, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_4

    if-ne v9, v12, :cond_5

    :cond_4
    new-instance v13, La1/e;

    const/16 v19, 0x0

    const/16 v20, 0x1d

    const/4 v14, 0x1

    const-class v16, Lg40/z1;

    const-string v17, "onValueChange"

    const-string v18, "onValueChange(Ljava/lang/String;)V"

    invoke-direct/range {v13 .. v20}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v13

    :cond_5
    check-cast v9, Lj93/g;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x30

    invoke-static {v5, v7, v9, v1, v8}, Lug/m;->n(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v7, 0x810f811

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    iget-object v7, v0, Lg40/f2;->E:Lbc3/c0;

    invoke-virtual {v1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_6

    if-ne v9, v12, :cond_7

    :cond_6
    new-instance v9, Lfd3/a;

    const/16 v8, 0x10

    invoke-direct {v9, v8, v7, v6}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-static {v5, v9}, Landroidx/compose/ui/focus/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, 0x811118f

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    iget-object v6, v0, Lg40/f2;->F:Lp1/c1;

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    iget-object v8, v0, Lg40/f2;->w:Lg40/z1;

    invoke-virtual {v1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_8

    if-ne v9, v12, :cond_9

    :cond_8
    new-instance v9, Lfd3/a;

    const/16 v7, 0x11

    invoke-direct {v9, v7, v8, v6}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-static {v5, v9}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "PhoneNumberTextField"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v6, v0, Lg40/f2;->O:Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg40/h1;

    if-eqz v6, :cond_a

    const/4 v6, 0x1

    goto :goto_1

    :cond_a
    move v6, v2

    :goto_1
    iget-object v7, v0, Lg40/f2;->P:Lp1/t2;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lq3/g0;

    new-instance v14, Lu0/r0;

    iget v7, v0, Lg40/f2;->G:I

    const/16 v9, 0x73

    const/4 v10, 0x4

    invoke-direct {v14, v2, v10, v7, v9}, Lu0/r0;-><init>(IIII)V

    const v7, 0x811b4ac

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    iget-object v7, v0, Lg40/f2;->H:Lg2/i;

    invoke-virtual {v1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_b

    if-ne v10, v12, :cond_c

    :cond_b
    new-instance v10, Lb30/l1;

    const/4 v9, 0x6

    invoke-direct {v10, v7, v9}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v16, v10

    check-cast v16, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const v9, 0x811a640

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_d

    if-ne v10, v12, :cond_e

    :cond_d
    new-instance v10, Lb30/l1;

    const/4 v9, 0x7

    invoke-direct {v10, v7, v9}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v17, v10

    check-cast v17, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    new-instance v15, Lu0/q0;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x3a

    invoke-direct/range {v15 .. v20}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iget-object v2, v0, Lg40/f2;->I:Ld40/g;

    invoke-virtual {v2}, Ld40/g;->a()Ll0/l1;

    move-result-object v22

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lb30/w2;

    iget-object v7, v0, Lg40/f2;->Q:Lp1/t2;

    const/16 v9, 0xb

    invoke-direct {v2, v9, v8, v7}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x59a388c6

    invoke-static {v7, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    new-instance v2, Lg40/o;

    iget-object v7, v0, Lg40/f2;->R:Lp1/t2;

    const/4 v9, 0x2

    invoke-direct {v2, v7, v9}, Lg40/o;-><init>(Lp1/t2;I)V

    const v7, -0x859221b

    invoke-static {v7, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/16 v26, 0x0

    const v27, 0xf0030

    move v12, v6

    iget-boolean v6, v0, Lg40/f2;->J:Z

    const/4 v7, 0x0

    iget-object v10, v0, Lg40/f2;->K:Lc93/m;

    iget-object v11, v0, Lg40/f2;->L:Lc93/m;

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    iget-object v2, v0, Lg40/f2;->M:Lg1/y1;

    const/high16 v24, 0xd80000

    const v25, 0x30030

    move-object/from16 v23, v1

    move-object/from16 v21, v2

    invoke-static/range {v3 .. v27}, Lvp/c;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/e8;Ll0/l1;Landroidx/compose/runtime/Composer;IIII)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
