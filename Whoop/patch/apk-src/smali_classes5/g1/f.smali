.class public final Lg1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/z1;Lx1/b;Ll1/w4;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lg1/f;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/f;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg1/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lg1/f;->w:I

    iput-object p1, p0, Lg1/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/f;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp1/c1;Ll0/k1;Lc93/m;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg1/f;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg1/f;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg1/f;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    move-object/from16 v0, p0

    iget v1, v0, Lg1/f;->w:I

    const/16 v2, 0x8

    const/4 v3, 0x6

    sget-object v4, Lb2/t;->w:Lb2/t;

    sget-object v5, Lp1/l;->a:Lp1/v0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    iget-object v9, v0, Lg1/f;->z:Ljava/lang/Object;

    iget-object v10, v0, Lg1/f;->y:Ljava/lang/Object;

    iget-object v11, v0, Lg1/f;->x:Ljava/lang/Object;

    const/4 v12, 0x2

    const/4 v13, 0x3

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x3

    if-eq v4, v12, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    and-int/2addr v3, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_5

    check-cast v11, Landroidx/compose/ui/Modifier;

    check-cast v10, Lp1/c1;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_1

    new-instance v3, Lyb0/e;

    invoke-direct {v3, v2, v10}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v3}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v9, Lx1/b;

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v11, v1, Lp1/q;->S:Z

    if-eqz v11, :cond_2

    invoke-virtual {v1, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v1, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v9, v1, v6}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    return-object v8

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v12, :cond_6

    move v3, v6

    goto :goto_3

    :cond_6
    move v3, v7

    :goto_3
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    check-cast v11, Ljava/lang/String;

    check-cast v10, Ljava/lang/String;

    check-cast v9, [Ljava/lang/Object;

    invoke-static {v9, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11, v10, v1, v2}, Lsb3/a;->k(Ljava/lang/String;Ljava/lang/String;Lp1/q;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_4
    return-object v8

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v9, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    check-cast v11, Lu10/p;

    and-int/2addr v2, v13

    if-ne v2, v12, :cond_9

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_6

    :cond_9
    :goto_5
    check-cast v1, Lp1/q;

    const v2, -0x7c3792f7

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_a

    if-ne v3, v5, :cond_b

    :cond_a
    invoke-virtual {v11}, Lu10/p;->k()Lec3/f2;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lec3/f2;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    invoke-static {v3, v1, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lb30/j3;

    check-cast v10, Lu10/q;

    iget-object v2, v10, Lu10/q;->b:Lr20/d;

    invoke-virtual {v2}, Lr20/d;->a()Z

    move-result v19

    const v2, -0x7c376c66

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_c

    if-ne v3, v5, :cond_d

    :cond_c
    new-instance v3, Lu10/e;

    invoke-direct {v3, v9, v13}, Lu10/e;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v18, v3

    check-cast v18, Lc93/a;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    const/16 v15, 0x180

    const/16 v20, 0x1

    move-object/from16 v16, v1

    invoke-static/range {v14 .. v20}, Lb30/g3;->c(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    :goto_6
    return-object v8

    :pswitch_2
    move-object/from16 v32, p1

    check-cast v32, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v13

    if-ne v1, v12, :cond_f

    move-object/from16 v1, v32

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_8

    :cond_f
    :goto_7
    check-cast v11, Lp00/q;

    iget-boolean v1, v11, Lp00/q;->w:Z

    xor-int/lit8 v21, v1, 0x1

    int-to-float v1, v2

    invoke-static/range {v32 .. v32}, Lce/w;->Q(Landroidx/compose/runtime/Composer;)Lg00/c;

    move-result-object v2

    iget-object v2, v2, Lg00/c;->b:Lt0/i;

    const/16 v3, 0x148

    int-to-float v3, v3

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "verification_otp_tag"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v23

    invoke-static/range {v32 .. v32}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v3

    iget-wide v3, v3, Lg00/b;->g:J

    invoke-static/range {v32 .. v32}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v5

    iget-wide v5, v5, Lg00/b;->m:J

    invoke-static/range {v32 .. v32}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    iget-wide v11, v7, Lg00/b;->b:J

    invoke-static/range {v32 .. v32}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    iget-wide v13, v7, Lg00/b;->c:J

    invoke-static/range {v32 .. v32}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    move/from16 v26, v1

    iget-wide v0, v7, Lg00/b;->c:J

    new-instance v29, Lg40/p1;

    move-wide/from16 v42, v0

    move-wide/from16 v34, v3

    move-wide/from16 v36, v5

    move-wide/from16 v40, v11

    move-wide/from16 v38, v13

    move-object/from16 v33, v29

    invoke-direct/range {v33 .. v43}, Lg40/p1;-><init>(JJJJJ)V

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    move-object/from16 v22, v10

    check-cast v22, Lg40/o1;

    move-object/from16 v31, v9

    check-cast v31, Lg2/s;

    const/16 v34, 0x6

    const/16 v35, 0x10

    const/16 v25, 0x0

    const-string v28, " "

    const v33, 0x30db01c0

    move/from16 v27, v26

    move/from16 v30, v0

    move-object/from16 v24, v2

    invoke-static/range {v21 .. v35}, Ldc/a;->g(ZLg40/o1;Landroidx/compose/ui/Modifier;Li2/a1;Ll3/v0;FFLjava/lang/String;Lg40/p1;FLg2/s;Landroidx/compose/runtime/Composer;III)V

    :goto_8
    return-object v8

    :pswitch_3
    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/2addr v0, v13

    if-ne v0, v12, :cond_11

    move-object v0, v14

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_9

    :cond_10
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_a

    :cond_11
    :goto_9
    check-cast v11, Ln00/c;

    iget-boolean v0, v11, Ln00/c;->f:Z

    xor-int/2addr v0, v6

    move-object v1, v10

    iget-boolean v10, v11, Ln00/c;->d:Z

    check-cast v1, Lg40/m3;

    iget-object v12, v11, Ln00/c;->e:Ln00/d;

    move-object v13, v9

    check-cast v13, Lg2/s;

    const/16 v15, 0x6000

    move v9, v0

    move-object v11, v1

    invoke-static/range {v9 .. v15}, Lse/b;->e(ZZLg40/m3;Ln00/d;Lg2/s;Landroidx/compose/runtime/Composer;I)V

    :goto_a
    return-object v8

    :pswitch_4
    move-object v1, v10

    move-object/from16 v22, p1

    check-cast v22, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/2addr v0, v13

    if-ne v0, v12, :cond_13

    move-object/from16 v0, v22

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_b

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_c

    :cond_13
    :goto_b
    move-object/from16 v16, v11

    check-cast v16, Ljava/lang/String;

    move-object v10, v1

    check-cast v10, Lm00/a;

    iget-object v0, v10, Lm00/a;->a:Ls20/a;

    move-object/from16 v19, v9

    check-cast v19, Lkotlin/jvm/functions/Function1;

    iget-object v1, v10, Lm00/a;->h:Ljava/util/List;

    const/16 v23, 0x180

    const/16 v24, 0x20

    const/16 v18, 0x1

    const/16 v21, 0x0

    move-object/from16 v17, v0

    move-object/from16 v20, v1

    invoke-static/range {v16 .. v24}, Lcom/squareup/wire/n;->d(Ljava/lang/String;Ls20/a;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_c
    return-object v8

    :pswitch_5
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v5, v2, 0x3

    if-eq v5, v12, :cond_14

    move v5, v6

    goto :goto_d

    :cond_14
    move v5, v7

    :goto_d
    and-int/2addr v2, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_18

    check-cast v11, Ld0/z1;

    new-instance v2, Lb30/o4;

    const/16 v5, 0x9

    invoke-direct {v2, v11, v5}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    invoke-static {v4, v2}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v9, Lx1/b;

    move-object v10, v1

    check-cast v10, Ll1/w4;

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_e
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    :cond_16
    invoke-static {v4, v0, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v10, v0, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_18
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_f
    return-object v8

    :pswitch_6
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v11, Ll1/g1;

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v12, :cond_19

    move v7, v6

    :cond_19
    and-int/2addr v2, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v7}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1a

    sget-object v12, Ll1/b0;->a:Ll1/b0;

    check-cast v11, Ll1/h1;

    invoke-virtual {v11}, Ll1/h1;->b()Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v11}, Ll1/h1;->a()I

    move-result v14

    move-object v15, v1

    check-cast v15, Ll1/e0;

    sget-object v1, Ll1/f1;->f:Ll0/l1;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    check-cast v9, Ll1/y;

    iget-wide v1, v9, Ll1/y;->c:J

    const v20, 0x30c00

    move-object/from16 v19, v0

    move-wide/from16 v17, v1

    invoke-virtual/range {v12 .. v20}, Ll1/b0;->a(Ljava/lang/Long;ILl1/e0;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_10

    :cond_1a
    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_10
    return-object v8

    :pswitch_7
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v10, v1

    check-cast v10, Li20/c0;

    move-object v15, v11

    check-cast v15, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    and-int/lit8 v1, v2, 0x3

    if-ne v1, v12, :cond_1c

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_11

    :cond_1b
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_14

    :cond_1c
    :goto_11
    const/4 v1, 0x0

    invoke-static {v1, v0, v13}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v2

    check-cast v0, Lp1/q;

    const v3, -0x6827ec49

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1e

    if-ne v4, v5, :cond_1d

    goto :goto_12

    :cond_1d
    move-object v1, v2

    goto :goto_13

    :cond_1e
    :goto_12
    new-instance v14, Lg20/p;

    const/16 v19, 0x11

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    move-object/from16 v16, v10

    invoke-direct/range {v14 .. v19}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v1, v17

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v14

    :goto_13
    check-cast v4, Lc93/m;

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    invoke-static {v0, v4, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x68278e7a

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1f

    if-ne v3, v5, :cond_20

    :cond_1f
    new-instance v3, Li20/w;

    invoke-direct {v3, v15, v12}, Li20/w;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v3, Lc93/a;

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    invoke-static {v3, v7, v0, v7, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    check-cast v9, Li20/b0;

    new-instance v2, Lg1/f;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v15, v9, v3}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x64ca82ca

    invoke-static {v1, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-interface {v9, v1, v0}, Li20/b0;->h0(Lx1/b;Lp1/q;)V

    :goto_14
    return-object v8

    :pswitch_8
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    and-int/lit8 v1, v2, 0x3

    if-ne v1, v12, :cond_22

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_21

    goto :goto_15

    :cond_21
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_16

    :cond_22
    :goto_15
    move-object v12, v11

    check-cast v12, Lh40/k;

    iget-object v1, v10, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Li20/v0;

    check-cast v0, Lp1/q;

    const v1, -0x76071c9c

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_23

    if-ne v2, v5, :cond_24

    :cond_23
    new-instance v13, Lb30/i0;

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/4 v14, 0x0

    const-class v16, Li20/v0;

    const-string v17, "onBackPressed"

    const-string v18, "onBackPressed()V"

    invoke-direct/range {v13 .. v20}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v13

    :cond_24
    check-cast v2, Lj93/g;

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    move-object v15, v2

    check-cast v15, Lc93/a;

    new-instance v1, Li20/x;

    check-cast v9, Li20/b0;

    invoke-direct {v1, v10, v9, v6}, Li20/x;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Li20/b0;I)V

    const v2, -0x4f447322

    invoke-static {v2, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/16 v18, 0x6008

    const/16 v19, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v12 .. v19}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_16
    return-object v8

    :pswitch_9
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    and-int/lit8 v1, v2, 0x3

    if-ne v1, v12, :cond_26

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_25

    goto :goto_17

    :cond_25
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_18

    :cond_26
    :goto_17
    move-object v12, v11

    check-cast v12, Lh40/k;

    iget-object v1, v10, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/p;

    iget-object v15, v1, Li20/p;->w:Li20/k1;

    check-cast v0, Lp1/q;

    const v1, 0x22be6dea

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_27

    if-ne v2, v5, :cond_28

    :cond_27
    new-instance v13, Li20/d;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v14, 0x0

    const-class v16, Li20/k1;

    const-string v17, "dismiss"

    const-string v18, "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V"

    invoke-direct/range {v13 .. v20}, Li20/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v13

    :cond_28
    move-object v15, v2

    check-cast v15, Lc93/a;

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    new-instance v1, Li20/f;

    check-cast v9, Leb/u0;

    invoke-direct {v1, v9, v10, v6}, Li20/f;-><init>(Leb/u0;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    const v2, 0x23264d67

    invoke-static {v2, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/16 v18, 0x6008

    const/16 v19, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v12 .. v19}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_18
    return-object v8

    :pswitch_a
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v3, v11

    check-cast v3, Lh40/k;

    move-object v10, v1

    check-cast v10, Lbc3/c0;

    check-cast v9, Lcom/stripe/android/shoppay/ShopPayActivity;

    and-int/lit8 v1, v2, 0x3

    if-ne v1, v12, :cond_2a

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_29

    goto :goto_19

    :cond_29
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1a

    :cond_2a
    :goto_19
    move-object v12, v11

    check-cast v12, Lh40/k;

    check-cast v0, Lp1/q;

    const v1, 0x60be38ab

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2b

    if-ne v2, v5, :cond_2c

    :cond_2b
    new-instance v2, Ld30/r;

    const/16 v1, 0x19

    invoke-direct {v2, v10, v3, v9, v1}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object v15, v2

    check-cast v15, Lc93/a;

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    new-instance v1, Lh30/c;

    invoke-direct {v1, v9, v7}, Lh30/c;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V

    const v2, 0x6a43b588

    invoke-static {v2, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/16 v18, 0x6008

    const/16 v19, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v12 .. v19}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_1a
    return-object v8

    :pswitch_b
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v12, :cond_2d

    move v3, v6

    goto :goto_1b

    :cond_2d
    move v3, v7

    :goto_1b
    and-int/2addr v2, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_32

    const-string v2, "border"

    invoke-static {v4, v2}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v10, v1

    check-cast v10, Lp1/c1;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/e;

    iget-wide v3, v1, Lh2/e;->a:J

    check-cast v9, Ll0/k1;

    sget v1, Lg1/j4;->a:F

    new-instance v1, Lg1/d4;

    invoke-direct {v1, v3, v4, v9, v7}, Lg1/d4;-><init>(JLjava/lang/Object;I)V

    invoke-static {v2, v1}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v11, Lc93/m;

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

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_2e

    invoke-virtual {v0, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_1c
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v0, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_2f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_30

    :cond_2f
    invoke-static {v3, v0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v11, :cond_31

    const v1, -0x4d3f14a3

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    :goto_1d
    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_31
    const v1, 0xe063924

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v11, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1d

    :goto_1e
    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_1f

    :cond_32
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1f
    return-object v8

    :pswitch_c
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x3

    if-eq v4, v12, :cond_33

    move v4, v6

    goto :goto_20

    :cond_33
    move v4, v7

    :goto_20
    and-int/2addr v2, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_37

    check-cast v11, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    sget v4, Lg1/o3;->d:F

    invoke-static {v11, v2, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/a1;->x:Ll0/a1;

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v10, v1

    check-cast v10, Lf0/r1;

    const/16 v1, 0xe

    invoke-static {v2, v10, v1}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v9, Lkotlin/jvm/functions/Function3;

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v4, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_34

    invoke-virtual {v0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_34
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_21
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_35

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_36

    :cond_35
    invoke-static {v4, v0, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Ll0/z;->a:Ll0/z;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v1, v0, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_37
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_22
    return-object v8

    :pswitch_d
    move-object v1, v10

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v5, v2, 0x3

    if-eq v5, v12, :cond_38

    move v5, v6

    goto :goto_23

    :cond_38
    move v5, v7

    :goto_23
    and-int/2addr v2, v6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3e

    check-cast v11, Lc93/m;

    move-object v10, v1

    check-cast v10, Lc93/m;

    check-cast v9, Lx1/b;

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v2, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_39

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_24

    :cond_39
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_24
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_3a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3b

    :cond_3a
    invoke-static {v2, v0, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    if-nez v11, :cond_3c

    const v2, -0x5d6e349

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    move-object v2, v1

    goto :goto_25

    :cond_3c
    const v2, -0x5d6e348

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    new-instance v2, Lg1/e;

    invoke-direct {v2, v6, v11}, Lg1/e;-><init>(ILc93/m;)V

    const v4, 0x6790e913

    invoke-static {v4, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    :goto_25
    if-nez v10, :cond_3d

    const v4, -0x5d07504

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    :goto_26
    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_27

    :cond_3d
    const v1, -0x5d07503

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lg1/e;

    invoke-direct {v1, v13, v10}, Lg1/e;-><init>(ILc93/m;)V

    const v4, 0x4b6ecd32    # 1.5650098E7f

    invoke-static {v4, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    goto :goto_26

    :goto_27
    invoke-static {v2, v1, v0, v3}, Lg1/k;->a(Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v9, v0, v6}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_28

    :cond_3e
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_28
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
