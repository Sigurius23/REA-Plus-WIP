.class public final Lb1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lb1/d;->w:I

    iput-object p1, p0, Lb1/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb1/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb1/d;->x:Ljava/lang/Object;

    iput-object p4, p0, Lb1/d;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx1/b;I)V
    .locals 0

    .line 2
    iput p5, p0, Lb1/d;->w:I

    iput-object p1, p0, Lb1/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb1/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb1/d;->E:Ljava/lang/Object;

    iput-object p4, p0, Lb1/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp1/c1;Ll1/k4;Ll0/k1;Lc93/m;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lb1/d;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb1/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb1/d;->x:Ljava/lang/Object;

    iput-object p4, p0, Lb1/d;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 52

    move-object/from16 v0, p0

    iget v1, v0, Lb1/d;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x1

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    iget-object v9, v0, Lb1/d;->z:Ljava/lang/Object;

    iget-object v10, v0, Lb1/d;->E:Ljava/lang/Object;

    iget-object v11, v0, Lb1/d;->x:Ljava/lang/Object;

    const/4 v12, 0x2

    const/4 v13, 0x3

    iget-object v14, v0, Lb1/d;->y:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v3, v14

    check-cast v3, Lwz/y;

    and-int/2addr v2, v13

    if-ne v2, v12, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    check-cast v11, Lp1/t2;

    invoke-interface {v11}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwz/r1;

    check-cast v10, Lp1/t2;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh00/j;

    iget-object v6, v3, Lwz/y;->z:Lk20/a;

    check-cast v1, Lp1/q;

    const v10, 0x28c4a518

    invoke-virtual {v1, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_2

    if-ne v11, v4, :cond_3

    :cond_2
    new-instance v15, Lp00/j;

    const/16 v21, 0x0

    const/16 v22, 0x16

    const/16 v16, 0x0

    const-class v18, Lwz/y;

    const-string v19, "onDismissVerificationClicked"

    const-string v20, "onDismissVerificationClicked()V"

    move-object/from16 v17, v3

    invoke-direct/range {v15 .. v22}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v11, v15

    :cond_3
    check-cast v11, Lj93/g;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4ada2

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_4

    if-ne v13, v4, :cond_5

    :cond_4
    new-instance v15, Lp00/j;

    const/16 v21, 0x0

    const/16 v22, 0x17

    const/16 v16, 0x0

    const-class v18, Lwz/y;

    const-string v19, "goBack"

    const-string v20, "goBack()V"

    move-object/from16 v17, v10

    invoke-direct/range {v15 .. v22}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v13, v15

    :cond_5
    check-cast v13, Lj93/g;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4b2e4

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_6

    if-ne v15, v4, :cond_7

    :cond_6
    new-instance v15, Lek/d;

    const/16 v21, 0x0

    const/16 v22, 0x4

    const/16 v16, 0x2

    const-class v18, Lwz/y;

    const-string v19, "navigate"

    const-string v20, "navigate(Lcom/stripe/android/link/LinkScreen;ZZ)V"

    move-object/from16 v17, v10

    invoke-direct/range {v15 .. v22}, Lek/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v23, v15

    check-cast v23, Lc93/m;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4b848

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_8

    if-ne v15, v4, :cond_9

    :cond_8
    new-instance v15, Lp00/j;

    const/16 v21, 0x0

    const/16 v22, 0x18

    const/16 v16, 0x0

    const-class v18, Lwz/y;

    const-string v19, "dismissSheet"

    const-string v20, "dismissSheet()V"

    move-object/from16 v17, v10

    invoke-direct/range {v15 .. v22}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v15, Lj93/g;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4bf73

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v12, :cond_a

    if-ne v7, v4, :cond_b

    :cond_a
    new-instance v24, Lv20/g;

    const/16 v30, 0x0

    const/16 v31, 0x6

    const/16 v25, 0x1

    const-class v27, Lwz/y;

    const-string v28, "handleWebActivityResult"

    const-string v29, "handleWebActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V"

    move-object/from16 v26, v10

    invoke-direct/range {v24 .. v31}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v7, v24

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lj93/g;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4d24c

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_c

    if-ne v0, v4, :cond_d

    :cond_c
    new-instance v24, Lv20/g;

    const/16 v30, 0x0

    const/16 v31, 0x7

    const/16 v25, 0x1

    const-class v27, Lwz/y;

    const-string v28, "handleViewAction"

    const-string v29, "handleViewAction(Lcom/stripe/android/link/LinkAction;)V"

    move-object/from16 v26, v10

    invoke-direct/range {v24 .. v31}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v0, v24

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v0, Lj93/g;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4d8e5

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    move-object/from16 p1, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_e

    if-ne v0, v4, :cond_f

    :cond_e
    new-instance v24, Lv20/g;

    const/16 v30, 0x0

    const/16 v31, 0x8

    const/16 v25, 0x1

    const-class v27, Lwz/y;

    const-string v28, "moveToWeb"

    const-string v29, "moveToWeb(Ljava/lang/Throwable;)V"

    move-object/from16 v26, v10

    invoke-direct/range {v24 .. v31}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v0, v24

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v0, Lj93/g;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4de42

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    move-object/from16 p2, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_10

    if-ne v0, v4, :cond_11

    :cond_10
    new-instance v24, Lp00/j;

    const/16 v30, 0x0

    const/16 v31, 0x19

    const/16 v25, 0x0

    const-class v27, Lwz/y;

    const-string v28, "goBack"

    const-string v29, "goBack()V"

    move-object/from16 v26, v10

    invoke-direct/range {v24 .. v31}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v0, v24

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v0, Lj93/g;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    move-object v10, v14

    check-cast v10, Lwz/y;

    const v12, 0x28c4e3e7

    invoke-virtual {v1, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    move-object/from16 v17, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_12

    if-ne v0, v4, :cond_13

    :cond_12
    new-instance v24, Lp00/j;

    const/16 v30, 0x0

    const/16 v31, 0x1a

    const/16 v25, 0x0

    const-class v27, Lwz/y;

    const-string v28, "changeEmail"

    const-string v29, "changeEmail()V"

    move-object/from16 v26, v10

    invoke-direct/range {v24 .. v31}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v0, v24

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v0, Lj93/g;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    check-cast v14, Lwz/y;

    const v10, 0x28c4ec0d

    invoke-virtual {v1, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_14

    if-ne v12, v4, :cond_15

    :cond_14
    new-instance v24, Lv20/g;

    const/16 v30, 0x0

    const/16 v31, 0x5

    const/16 v25, 0x1

    const-class v27, Lwz/y;

    const-string v28, "onNavEntryChanged"

    const-string v29, "onNavEntryChanged(Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;)V"

    move-object/from16 v26, v14

    invoke-direct/range {v24 .. v31}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v12, v24

    invoke-virtual {v1, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v12, Lj93/g;

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    iget-object v10, v3, Lwz/y;->T:Lec3/q1;

    check-cast v9, Lh40/k;

    move-object/from16 v20, v12

    check-cast v20, Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v11

    check-cast v21, Lc93/a;

    move-object/from16 v22, v13

    check-cast v22, Lc93/a;

    move-object/from16 v24, v15

    check-cast v24, Lc93/a;

    move-object/from16 v25, v7

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const v7, 0x28c4c7a6

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_16

    if-ne v11, v4, :cond_17

    :cond_16
    new-instance v11, Lvv1/c;

    const/16 v4, 0x12

    invoke-direct {v11, v3, v4}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v26, v11

    check-cast v26, Lc93/a;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    move-object/from16 v27, p1

    check-cast v27, Lkotlin/jvm/functions/Function1;

    move-object/from16 v28, p2

    check-cast v28, Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v17

    check-cast v29, Lc93/a;

    move-object/from16 v30, v0

    check-cast v30, Lc93/a;

    const/16 v32, 0x8

    move-object/from16 v31, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object v15, v9

    move-object/from16 v19, v10

    invoke-static/range {v15 .. v32}, Lwz/n1;->b(Lh40/k;Lwz/r1;Lh00/j;Lk20/a;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    return-object v8

    :pswitch_0
    move-object/from16 v36, p1

    check-cast v36, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    check-cast v9, Lt10/j;

    and-int/2addr v0, v13

    if-ne v0, v12, :cond_19

    move-object/from16 v0, v36

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_2

    :cond_18
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_3

    :cond_19
    :goto_2
    move-object/from16 v33, v14

    check-cast v33, Ld30/v;

    const/16 v37, 0x30

    const/16 v38, 0x4

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v33 .. v38}, Lse/g;->m(Ld30/v;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v36

    const/4 v1, 0x0

    invoke-static {v9, v0, v1}, Lt10/o;->e(Lt10/j;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v9, v0, v1}, Lt10/o;->a(Lt10/j;Landroidx/compose/runtime/Composer;I)V

    const/16 v2, 0x28

    int-to-float v2, v2

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    check-cast v11, Lc93/a;

    check-cast v10, Lc93/a;

    invoke-static {v9, v11, v10, v0, v1}, Lt10/o;->b(Lt10/j;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v1, v0, v6}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    :goto_3
    return-object v8

    :pswitch_1
    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/2addr v0, v13

    if-ne v0, v12, :cond_1b

    move-object/from16 v0, v18

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_4

    :cond_1a
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_5

    :cond_1b
    :goto_4
    move-object v12, v14

    check-cast v12, Ly00/a0;

    move-object v13, v9

    check-cast v13, Lg40/m3;

    move-object v14, v11

    check-cast v14, Lx30/e0;

    invoke-virtual {v12}, Ly00/a0;->k()Z

    move-result v15

    check-cast v10, Lq00/i0;

    iget-boolean v0, v10, Lq00/i0;->A:Z

    const/16 v17, 0x0

    const/16 v19, 0x200

    move/from16 v16, v0

    invoke-static/range {v12 .. v19}, Lse/h;->e(Ly00/c0;Lg40/m3;Lx30/e0;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    return-object v8

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v2, v1, 0x3

    if-eq v2, v12, :cond_1c

    move v2, v6

    goto :goto_6

    :cond_1c
    const/4 v2, 0x0

    :goto_6
    and-int/2addr v1, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_20

    const-string v1, "Container"

    invoke-static {v5, v1}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v17, Lm1/g0;

    move-object/from16 v18, v9

    check-cast v18, Lp1/c1;

    const-string v21, "getValue()Ljava/lang/Object;"

    const/16 v22, 0x0

    const-class v19, Lp1/c1;

    const-string v20, "value"

    invoke-direct/range {v17 .. v22}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    move-object/from16 v2, v17

    check-cast v14, Ll1/k4;

    invoke-static {v14}, Lm1/l0;->c(Ll1/k4;)Lb2/f;

    move-result-object v3

    check-cast v11, Ll0/k1;

    sget v4, Ll1/c3;->a:F

    new-instance v4, Ljs2/h;

    const/4 v5, 0x7

    invoke-direct {v4, v2, v11, v3, v5}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v4}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v10, Lc93/m;

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-eqz v7, :cond_1d

    invoke-virtual {v0, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_1d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v0, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_1e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    :cond_1e
    invoke-static {v3, v0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v1, v10, v0, v6}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_8

    :cond_20
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_8
    return-object v8

    :pswitch_3
    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/2addr v0, v13

    if-ne v0, v12, :cond_22

    move-object v0, v15

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_21

    goto :goto_9

    :cond_21
    invoke-virtual {v0}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_22
    :goto_9
    invoke-static {v5, v2, v13}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    check-cast v14, Lcz/t0;

    move-object v12, v9

    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object v13, v11

    check-cast v13, Lkotlin/jvm/functions/Function1;

    check-cast v10, Lbz/i;

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v1, v4, v15, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    invoke-static {v15}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v5, v15

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_23

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_23
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v15, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_24

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    :cond_24
    invoke-static {v4, v5, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v15, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v0, v14, Lcz/q0;

    if-eqz v0, :cond_26

    const v0, -0x170046dc

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-static {v2, v1, v15, v6}, Lds/q;->a(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_26
    const/4 v1, 0x0

    instance-of v0, v14, Lcz/r0;

    if-eqz v0, :cond_27

    const v0, -0x16fdec6b

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    move-object v11, v14

    check-cast v11, Lcz/r0;

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, Le4/a;->j(Lcz/r0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v1, v15, v6}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_27
    instance-of v0, v14, Lcz/p0;

    if-eqz v0, :cond_28

    const v0, -0x16f79fd0

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    check-cast v14, Lcz/p0;

    invoke-static {v14, v12, v10, v15, v1}, Le4/a;->a(Lcz/p0;Lkotlin/jvm/functions/Function1;Lbz/i;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v1, v15, v6}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_28
    instance-of v0, v14, Lcz/s0;

    if-eqz v0, :cond_29

    const v0, -0x16f0d355

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    check-cast v14, Lcz/s0;

    invoke-static {v14, v2, v15, v1}, Le4/a;->l(Lcz/s0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v1, v15, v6}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_c
    return-object v8

    :cond_29
    const v0, -0x3a8c6a12

    invoke-static {v0, v5, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v13

    if-ne v1, v12, :cond_2b

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2a

    goto :goto_d

    :cond_2a
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_2b
    :goto_d
    check-cast v14, Ld40/m;

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2d

    if-ne v1, v6, :cond_2c

    goto :goto_e

    :cond_2c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2d
    check-cast v9, Lf0/t;

    iget v1, v9, Lf0/t;->a:F

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v10, Li2/a1;

    invoke-static {v1, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    :goto_e
    check-cast v11, Lx1/b;

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v1, v2, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    invoke-static {v0}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v2

    move-object v3, v0

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-eqz v9, :cond_2e

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_2e
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_f
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_2f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_30

    :cond_2f
    invoke-static {v2, v3, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v6}, Lp1/q;->q(Z)V

    :goto_10
    return-object v8

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v13

    if-ne v1, v12, :cond_32

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_31

    goto :goto_11

    :cond_31
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_23

    :cond_32
    :goto_11
    check-cast v14, Ld40/n;

    iget-object v12, v14, Ld40/n;->i:Lg1/c1;

    check-cast v9, Ld40/s;

    const-string v1, "<this>"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v3, v9, Ld40/s;->h:J

    iget v5, v9, Ld40/s;->a:I

    iget v6, v9, Ld40/s;->b:I

    iget-object v7, v9, Ld40/s;->l:Ll3/v0;

    iget v14, v9, Ld40/s;->d:F

    iget-object v15, v9, Ld40/s;->k:Ljava/lang/Integer;

    if-eqz v15, :cond_33

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    const/16 v13, 0xe

    invoke-static {v15, v2, v13}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v13

    filled-new-array {v13}, [Lp3/x;

    move-result-object v13

    invoke-static {v13}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v13

    goto :goto_12

    :cond_33
    move-object v13, v2

    :goto_12
    sget-object v15, Ll3/v0;->d:Ll3/v0;

    invoke-static {v15}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v15

    sget-object v32, Lp3/i;->w:Lp3/f;

    if-eqz v7, :cond_35

    iget-object v2, v7, Ll3/v0;->a:Ll3/m0;

    iget-object v2, v2, Ll3/m0;->f:Lp3/i;

    if-nez v2, :cond_34

    goto :goto_13

    :cond_34
    move-object/from16 v23, v2

    goto :goto_14

    :cond_35
    :goto_13
    if-nez v13, :cond_36

    move-object/from16 v23, v32

    goto :goto_14

    :cond_36
    move-object/from16 v23, v13

    :goto_14
    if-eqz v7, :cond_37

    iget-object v2, v7, Ll3/v0;->a:Ll3/m0;

    move-object/from16 v33, v10

    move-object/from16 v34, v11

    iget-wide v10, v2, Ll3/m0;->b:J

    new-instance v2, Ly3/o;

    invoke-direct {v2, v10, v11}, Ly3/o;-><init>(J)V

    goto :goto_15

    :cond_37
    move-object/from16 v33, v10

    move-object/from16 v34, v11

    const/4 v2, 0x0

    :goto_15
    iget-wide v10, v9, Ld40/s;->j:J

    invoke-static {v10, v11}, Lv63/c;->a(J)V

    const-wide v35, 0xff00000000L

    move-object/from16 v37, v12

    move-object/from16 p1, v13

    and-long v12, v10, v35

    invoke-static {v10, v11, v12, v13, v14}, Ld13/a;->d(JJF)J

    move-result-wide v10

    if-eqz v2, :cond_39

    const-wide/16 v18, 0x0

    iget-wide v12, v2, Ly3/o;->a:J

    and-long v20, v12, v35

    cmp-long v2, v20, v18

    if-nez v2, :cond_38

    :goto_16
    move-wide/from16 v20, v10

    goto :goto_17

    :cond_38
    move-wide/from16 v20, v12

    goto :goto_17

    :cond_39
    const-wide/16 v18, 0x0

    goto :goto_16

    :goto_17
    if-eqz v7, :cond_3b

    iget-object v2, v7, Ll3/v0;->a:Ll3/m0;

    iget-object v2, v2, Ll3/m0;->c:Lp3/r;

    if-nez v2, :cond_3a

    goto :goto_19

    :cond_3a
    :goto_18
    move-object/from16 v22, v2

    goto :goto_1a

    :cond_3b
    :goto_19
    new-instance v2, Lp3/r;

    iget v10, v9, Ld40/s;->c:I

    invoke-direct {v2, v10}, Lp3/r;-><init>(I)V

    goto :goto_18

    :goto_1a
    if-eqz v7, :cond_3c

    iget-object v2, v7, Ll3/v0;->a:Ll3/m0;

    iget-wide v10, v2, Ll3/m0;->h:J

    new-instance v2, Ly3/o;

    invoke-direct {v2, v10, v11}, Ly3/o;-><init>(J)V

    goto :goto_1b

    :cond_3c
    const/4 v2, 0x0

    :goto_1b
    iget-object v7, v15, Ll3/v0;->a:Ll3/m0;

    iget-wide v10, v7, Ll3/m0;->h:J

    if-eqz v2, :cond_3d

    iget-wide v12, v2, Ly3/o;->a:J

    and-long v24, v12, v35

    cmp-long v2, v24, v18

    if-nez v2, :cond_3e

    :cond_3d
    move-wide/from16 v24, v10

    goto :goto_1c

    :cond_3e
    move-wide/from16 v24, v12

    :goto_1c
    const/16 v30, 0x0

    const v31, 0xffff59

    const-wide/16 v18, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v17, v15

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v42

    if-nez p1, :cond_40

    iget-object v2, v9, Ld40/s;->o:Lp3/i;

    if-nez v2, :cond_3f

    move-object/from16 v23, v32

    goto :goto_1d

    :cond_3f
    move-object/from16 v23, v2

    goto :goto_1d

    :cond_40
    move-object/from16 v23, p1

    :goto_1d
    iget-wide v10, v9, Ld40/s;->i:J

    invoke-static {v10, v11}, Lv63/c;->a(J)V

    and-long v12, v10, v35

    invoke-static {v10, v11, v12, v13, v14}, Ld13/a;->d(JJF)J

    move-result-wide v20

    new-instance v2, Lp3/r;

    invoke-direct {v2, v6}, Lp3/r;-><init>(I)V

    const-wide v10, -0x402b851eb851eb85L    # -0.32

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v24

    const/16 v30, 0x0

    const v31, 0xffff59

    const-wide/16 v18, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v43

    if-nez p1, :cond_42

    iget-object v2, v9, Ld40/s;->p:Lp3/i;

    if-nez v2, :cond_41

    move-object/from16 v23, v32

    goto :goto_1e

    :cond_41
    move-object/from16 v23, v2

    goto :goto_1e

    :cond_42
    move-object/from16 v23, p1

    :goto_1e
    iget-wide v10, v9, Ld40/s;->g:J

    invoke-static {v10, v11}, Lv63/c;->a(J)V

    and-long v12, v10, v35

    invoke-static {v10, v11, v12, v13, v14}, Ld13/a;->d(JJF)J

    move-result-wide v20

    new-instance v2, Lp3/r;

    invoke-direct {v2, v6}, Lp3/r;-><init>(I)V

    const-wide v10, -0x403ccccccccccccdL    # -0.15

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v24

    const/16 v30, 0x0

    const v31, 0xffff59

    const-wide/16 v18, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v44

    if-nez p1, :cond_44

    iget-object v2, v9, Ld40/s;->m:Lp3/i;

    if-nez v2, :cond_43

    move-object/from16 v23, v32

    goto :goto_1f

    :cond_43
    move-object/from16 v23, v2

    goto :goto_1f

    :cond_44
    move-object/from16 v23, p1

    :goto_1f
    invoke-static {v3, v4}, Lv63/c;->a(J)V

    and-long v12, v3, v35

    invoke-static {v3, v4, v12, v13, v14}, Ld13/a;->d(JJF)J

    move-result-wide v20

    new-instance v2, Lp3/r;

    invoke-direct {v2, v5}, Lp3/r;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0xffffd9

    const-wide/16 v18, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v47

    if-nez p1, :cond_46

    iget-object v2, v9, Ld40/s;->q:Lp3/i;

    if-nez v2, :cond_45

    move-object/from16 v23, v32

    goto :goto_20

    :cond_45
    move-object/from16 v23, v2

    goto :goto_20

    :cond_46
    move-object/from16 v23, p1

    :goto_20
    invoke-static {v3, v4}, Lv63/c;->a(J)V

    invoke-static {v3, v4}, Ly3/o;->c(J)F

    move-result v2

    mul-float/2addr v2, v14

    invoke-static {v2, v12, v13}, Lv63/c;->j(FJ)J

    move-result-wide v20

    new-instance v2, Lp3/r;

    invoke-direct {v2, v5}, Lp3/r;-><init>(I)V

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v24

    const/16 v30, 0x0

    const v31, 0xffff59

    const-wide/16 v18, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v45

    if-nez p1, :cond_48

    iget-object v2, v9, Ld40/s;->r:Lp3/i;

    if-nez v2, :cond_47

    move-object/from16 v23, v32

    goto :goto_21

    :cond_47
    move-object/from16 v23, v2

    goto :goto_21

    :cond_48
    move-object/from16 v23, p1

    :goto_21
    iget-wide v2, v9, Ld40/s;->f:J

    invoke-static {v2, v3}, Lv63/c;->a(J)V

    and-long v12, v2, v35

    invoke-static {v2, v3, v12, v13, v14}, Ld13/a;->d(JJF)J

    move-result-wide v20

    new-instance v2, Lp3/r;

    invoke-direct {v2, v6}, Lp3/r;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0xffffd9

    const-wide/16 v18, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v50

    if-nez p1, :cond_4a

    iget-object v13, v9, Ld40/s;->n:Lp3/i;

    if-nez v13, :cond_49

    move-object/from16 v23, v32

    goto :goto_22

    :cond_49
    move-object/from16 v23, v13

    goto :goto_22

    :cond_4a
    move-object/from16 v23, p1

    :goto_22
    iget-wide v2, v9, Ld40/s;->e:J

    invoke-static {v2, v3}, Lv63/c;->a(J)V

    and-long v6, v2, v35

    invoke-static {v2, v3, v6, v7, v14}, Ld13/a;->d(JJF)J

    move-result-wide v20

    new-instance v2, Lp3/r;

    invoke-direct {v2, v5}, Lp3/r;-><init>(I)V

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v24

    const/16 v30, 0x0

    const v31, 0xffff59

    const-wide/16 v18, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v48

    sget-object v2, Lg1/i9;->b:Lp1/u2;

    move-object v3, v0

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/h9;

    iget-object v4, v2, Lg1/h9;->a:Ll3/v0;

    invoke-static {v4}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v39

    iget-object v4, v2, Lg1/h9;->b:Ll3/v0;

    invoke-static {v4}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v40

    iget-object v4, v2, Lg1/h9;->c:Ll3/v0;

    invoke-static {v4}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v41

    iget-object v4, v2, Lg1/h9;->h:Ll3/v0;

    invoke-static {v4}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v46

    iget-object v4, v2, Lg1/h9;->k:Ll3/v0;

    invoke-static {v4}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v49

    iget-object v2, v2, Lg1/h9;->m:Ll3/v0;

    invoke-static {v2}, Ld40/r;->q(Ll3/v0;)Ll3/v0;

    move-result-object v51

    new-instance v13, Lg1/h9;

    move-object/from16 v38, v13

    invoke-direct/range {v38 .. v51}, Lg1/h9;-><init>(Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;)V

    move-object/from16 v10, v33

    check-cast v10, Ld40/o;

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/l5;

    iget v2, v10, Ld40/o;->a:F

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {v1, v3, v2, v4}, Lg1/l5;->a(Lg1/l5;Lt0/i;Lt0/i;I)Lg1/l5;

    move-result-object v14

    new-instance v1, Lb30/l4;

    move-object/from16 v11, v34

    check-cast v11, Lx1/b;

    const/4 v2, 0x3

    invoke-direct {v1, v11, v2}, Lb30/l4;-><init>(Lx1/b;I)V

    const v2, -0x460f4dc9

    invoke-static {v2, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/16 v17, 0xc00

    const/16 v18, 0x0

    move-object/from16 v16, v0

    move-object/from16 v12, v37

    invoke-static/range {v12 .. v18}, Lio/sentry/config/a;->g(Lg1/c1;Lg1/h9;Lg1/l5;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_23
    return-object v8

    :pswitch_6
    move-object/from16 v33, v10

    move-object/from16 v34, v11

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    check-cast v9, Lp1/c1;

    and-int/lit8 v2, v1, 0x3

    if-eq v2, v12, :cond_4b

    move v10, v6

    goto :goto_24

    :cond_4b
    const/4 v10, 0x0

    :goto_24
    and-int/2addr v1, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1, v10}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_51

    check-cast v14, Landroidx/compose/ui/Modifier;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4c

    new-instance v1, Laq1/d;

    invoke-direct {v1, v12, v9}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v1}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v11, v34

    check-cast v11, Lx1/b;

    move-object/from16 v10, v33

    check-cast v10, Lb1/c;

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_4d

    invoke-virtual {v0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_25

    :cond_4d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_25
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_4e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4f

    :cond_4e
    invoke-static {v3, v0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_50

    new-instance v1, Lb01/m;

    invoke-direct {v1, v6, v9}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_50
    check-cast v1, Lc93/a;

    const/4 v2, 0x6

    invoke-virtual {v10, v1, v0, v2}, Lb1/c;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_51
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_26
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
