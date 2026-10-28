.class public final Lp00/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic w:I

.field public final synthetic x:Lp00/q;

.field public final synthetic y:Lg40/o1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;I)V
    .locals 0

    iput p9, p0, Lp00/k;->w:I

    iput-object p1, p0, Lp00/k;->x:Lp00/q;

    iput-object p2, p0, Lp00/k;->y:Lg40/o1;

    iput-object p3, p0, Lp00/k;->z:Lc93/a;

    iput-object p4, p0, Lp00/k;->E:Lc93/a;

    iput-object p5, p0, Lp00/k;->F:Lc93/a;

    iput-object p6, p0, Lp00/k;->G:Lc93/a;

    iput-object p7, p0, Lp00/k;->H:Lc93/a;

    iput-object p8, p0, Lp00/k;->I:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lp00/k;->w:I

    packed-switch v1, :pswitch_data_0

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

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {v1}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v2

    if-eqz v2, :cond_2

    const v2, 0x3e99999a    # 0.3f

    goto :goto_1

    :cond_2
    const v2, 0x3f4ccccd    # 0.8f

    :goto_1
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v4, v3, Lc4/b0;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    check-cast v3, Lc4/b0;

    goto :goto_2

    :cond_3
    move-object v3, v5

    :goto_2
    if-eqz v3, :cond_4

    invoke-interface {v3}, Lc4/b0;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3, v2}, Landroid/view/Window;->setDimAmount(F)V

    :cond_4
    new-instance v6, Lp00/k;

    iget-object v14, v0, Lp00/k;->I:Lc93/a;

    const/4 v15, 0x1

    iget-object v7, v0, Lp00/k;->x:Lp00/q;

    iget-object v8, v0, Lp00/k;->y:Lg40/o1;

    iget-object v9, v0, Lp00/k;->z:Lc93/a;

    iget-object v10, v0, Lp00/k;->E:Lc93/a;

    iget-object v11, v0, Lp00/k;->F:Lc93/a;

    iget-object v12, v0, Lp00/k;->G:Lc93/a;

    iget-object v13, v0, Lp00/k;->H:Lc93/a;

    invoke-direct/range {v6 .. v15}, Lp00/k;-><init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;I)V

    const v2, -0x98afc64

    invoke-static {v2, v1, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v5, v2, v1, v3}, Lg00/g;->a(Lwz/d0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    move-object v1, v11

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_5

    :cond_6
    :goto_4
    const/16 v1, 0x168

    int-to-float v1, v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    move-object v1, v11

    check-cast v1, Lp1/q;

    const v4, -0x1a6f7841

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    iget-wide v4, v4, Lg00/b;->b:J

    new-instance v12, Lp00/k;

    iget-object v1, v0, Lp00/k;->I:Lc93/a;

    const/16 v21, 0x0

    iget-object v13, v0, Lp00/k;->x:Lp00/q;

    iget-object v14, v0, Lp00/k;->y:Lg40/o1;

    iget-object v15, v0, Lp00/k;->z:Lc93/a;

    iget-object v6, v0, Lp00/k;->E:Lc93/a;

    iget-object v7, v0, Lp00/k;->F:Lc93/a;

    iget-object v8, v0, Lp00/k;->G:Lc93/a;

    iget-object v9, v0, Lp00/k;->H:Lc93/a;

    move-object/from16 v20, v1

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    invoke-direct/range {v12 .. v21}, Lp00/k;-><init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;I)V

    const v1, -0x70a60220

    invoke-static {v1, v11, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const v12, 0x180006

    const/16 v13, 0x38

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    move-object v1, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_7

    :cond_8
    :goto_6
    iget-object v9, v0, Lp00/k;->I:Lc93/a;

    const/16 v11, 0x40

    iget-object v2, v0, Lp00/k;->x:Lp00/q;

    iget-object v3, v0, Lp00/k;->y:Lg40/o1;

    iget-object v4, v0, Lp00/k;->z:Lc93/a;

    iget-object v5, v0, Lp00/k;->E:Lc93/a;

    iget-object v6, v0, Lp00/k;->F:Lc93/a;

    iget-object v7, v0, Lp00/k;->G:Lc93/a;

    iget-object v8, v0, Lp00/k;->H:Lc93/a;

    invoke-static/range {v2 .. v11}, Lp00/h;->f(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
