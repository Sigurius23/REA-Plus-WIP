.class public final Lm40/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function3;

.field public final synthetic F:Lkotlin/jvm/functions/Function3;

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic H:Lb2/h;

.field public final synthetic I:Ly2/k;

.field public final synthetic J:Li2/y;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lm40/w;

.field public final synthetic y:Z

.field public final synthetic z:Ln2/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm40/w;ZLn2/a;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;Li2/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm40/o;->w:Ljava/lang/String;

    iput-object p2, p0, Lm40/o;->x:Lm40/w;

    iput-boolean p3, p0, Lm40/o;->y:Z

    iput-object p4, p0, Lm40/o;->z:Ln2/a;

    iput-object p5, p0, Lm40/o;->E:Lkotlin/jvm/functions/Function3;

    iput-object p6, p0, Lm40/o;->F:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Lm40/o;->G:Landroidx/compose/ui/Modifier;

    iput-object p8, p0, Lm40/o;->H:Lb2/h;

    iput-object p9, p0, Lm40/o;->I:Ly2/k;

    iput-object p10, p0, Lm40/o;->J:Li2/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    check-cast v3, Ll0/v;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v4, "$this$BoxWithConstraints"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v2, v4

    :cond_1
    and-int/lit8 v2, v2, 0x13

    const/16 v4, 0x12

    if-ne v2, v4, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_3
    :goto_1
    sget-object v2, Lb3/k2;->a:Lp1/u2;

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move-object v2, v3

    check-cast v2, Landroidx/compose/foundation/layout/c;

    iget-wide v4, v2, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v4, v5}, Ly3/a;->i(J)I

    move-result v2

    const-wide/16 v6, 0x0

    long-to-int v6, v6

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v8, -0x1

    if-le v2, v6, :cond_4

    invoke-static {v4, v5}, Ly3/a;->i(J)I

    move-result v2

    float-to-int v9, v7

    if-ge v2, v9, :cond_4

    invoke-static {v4, v5}, Ly3/a;->i(J)I

    move-result v2

    goto :goto_2

    :cond_4
    move v2, v8

    :goto_2
    invoke-static {v4, v5}, Ly3/a;->h(J)I

    move-result v9

    if-le v9, v6, :cond_5

    invoke-static {v4, v5}, Ly3/a;->h(J)I

    move-result v6

    float-to-int v7, v7

    if-ge v6, v7, :cond_5

    invoke-static {v4, v5}, Ly3/a;->h(J)I

    move-result v4

    goto :goto_3

    :cond_5
    move v4, v8

    :goto_3
    if-ne v2, v8, :cond_6

    move v15, v4

    goto :goto_4

    :cond_6
    move v15, v2

    :goto_4
    if-ne v4, v8, :cond_7

    move v4, v15

    :cond_7
    const v2, -0x183d2764

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v2, v5, :cond_9

    if-eqz v1, :cond_8

    iget-object v2, v0, Lm40/o;->z:Ln2/a;

    if-eqz v2, :cond_8

    new-instance v6, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    invoke-direct {v6, v2}, Lcom/stripe/android/uicore/image/StripeImageState$Success;-><init>(Ln2/a;)V

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    goto :goto_5

    :cond_8
    sget-object v2, Lm40/x;->b:Lm40/x;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    :goto_5
    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v17, v2

    check-cast v17, Lp1/c1;

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    const v6, -0x183cf020

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    if-nez v1, :cond_c

    const v1, -0x183cea1c

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lm40/o;->x:Lm40/w;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    iget-object v6, v0, Lm40/o;->w:Ljava/lang/String;

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v1, v7

    invoke-virtual {v11, v15}, Lp1/q;->e(I)Z

    move-result v7

    or-int/2addr v1, v7

    invoke-virtual {v11, v4}, Lp1/q;->e(I)Z

    move-result v7

    or-int/2addr v1, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_a

    if-ne v7, v5, :cond_b

    :cond_a
    new-instance v12, Lm40/m;

    const/16 v18, 0x0

    iget-object v13, v0, Lm40/o;->x:Lm40/w;

    iget-object v14, v0, Lm40/o;->w:Ljava/lang/String;

    move/from16 v16, v4

    invoke-direct/range {v12 .. v18}, Lm40/m;-><init>(Lm40/w;Ljava/lang/String;IILp1/c1;Lq83/d;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v12

    :cond_b
    check-cast v7, Lc93/m;

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-static {v11, v7, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :cond_c
    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-interface/range {v17 .. v17}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    const v1, -0x183ca5a5

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v0, Lm40/o;->y:Z

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_d

    if-ne v6, v5, :cond_e

    :cond_d
    new-instance v6, Lb30/x4;

    const/16 v4, 0x8

    invoke-direct {v6, v1, v4}, Lb30/x4;-><init>(ZI)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    new-instance v1, Lm40/n;

    iget-object v7, v0, Lm40/o;->I:Ly2/k;

    iget-object v8, v0, Lm40/o;->J:Li2/y;

    iget-object v2, v0, Lm40/o;->E:Lkotlin/jvm/functions/Function3;

    iget-object v4, v0, Lm40/o;->F:Lkotlin/jvm/functions/Function3;

    iget-object v5, v0, Lm40/o;->G:Landroidx/compose/ui/Modifier;

    iget-object v6, v0, Lm40/o;->H:Lb2/h;

    invoke-direct/range {v1 .. v8}, Lm40/n;-><init>(Lkotlin/jvm/functions/Function3;Ll0/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;Li2/y;)V

    const v2, -0x13e711e1

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const v12, 0x186000

    const/16 v13, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "loading_image_animation"

    move-object v4, v9

    move-object v9, v10

    move-object v10, v1

    invoke-static/range {v4 .. v13}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
