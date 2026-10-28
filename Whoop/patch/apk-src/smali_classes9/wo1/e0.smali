.class public final synthetic Lwo1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwo1/e0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lwo1/e0;->w:I

    const-string v2, "null cannot be cast to non-null type android.app.Application"

    sget-object v3, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    const-string v4, "$this$initializer"

    const/4 v5, 0x1

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ln20/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ln20/e;->a()Lxz/x;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, v3, Lxz/x;->a:Lxz/f0;

    iget-object v3, v3, Lxz/f0;->b:Lec3/r1;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ln20/e;->a()Lxz/x;

    move-result-object v1

    iget-object v1, v1, Lxz/x;->a:Lxz/f0;

    iget-object v1, v1, Lxz/f0;->b:Lec3/r1;

    new-instance v2, Lwz/h1;

    invoke-direct {v2, v5}, Lwz/h1;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    :goto_1
    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll8/c;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v14

    invoke-virtual {v1, v3}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v1

    check-cast v13, Landroid/app/Application;

    sget v1, Lcom/stripe/android/link/LinkActivity;->E:I

    const-string v1, "native_link_args"

    invoke-virtual {v14, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/g1;

    if-eqz v1, :cond_2

    iget-object v8, v1, Lwz/g1;->w:Lwz/g0;

    iget-object v9, v1, Lwz/g1;->x:Lv00/c0;

    new-instance v10, Lwz/r;

    const/4 v2, 0x0

    invoke-direct {v10, v1, v2}, Lwz/r;-><init>(Lwz/g1;I)V

    new-instance v11, Lwz/r;

    invoke-direct {v11, v1, v5}, Lwz/r;-><init>(Lwz/g1;I)V

    iget-object v12, v1, Lwz/g1;->H:Ljava/lang/String;

    iget-object v2, v1, Lwz/g1;->F:Lwz/h0;

    iget-object v3, v1, Lwz/g1;->I:Lwz/n0;

    iget-object v4, v1, Lwz/g1;->G:Lwz/d;

    iget-object v1, v1, Lwz/g1;->y:Lb10/d;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lc00/a;

    new-instance v7, Lg73/d;

    const/16 v5, 0x1b

    invoke-direct {v7, v5}, Lg73/d;-><init>(I)V

    move-object v15, v13

    move-object/from16 v19, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    invoke-direct/range {v6 .. v19}, Lc00/a;-><init>(Lg73/d;Lwz/g0;Lv00/c0;Lwz/r;Lwz/r;Ljava/lang/String;Landroid/app/Application;Landroidx/lifecycle/k1;Landroid/app/Application;Lwz/h0;Lwz/n0;Lwz/d;Lb10/d;)V

    invoke-virtual {v6}, Lc00/a;->c()Lwz/y;

    move-result-object v1

    return-object v1

    :cond_2
    new-instance v1, Lcom/stripe/android/link/NoArgsException;

    invoke-direct {v1}, Lcom/stripe/android/link/NoArgsException;-><init>()V

    throw v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ll8/c;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lcom/stripe/android/attestation/AttestationActivity;->y:I

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v4

    const-string v6, "attestation_args"

    invoke-virtual {v4, v6}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwx/g;

    if-eqz v4, :cond_3

    invoke-virtual {v1, v3}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/app/Application;

    new-instance v2, Lvv1/c;

    const/16 v3, 0x10

    invoke-direct {v2, v4, v3}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    iget-object v3, v4, Lwx/g;->x:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    new-instance v4, Lt9/p;

    const/4 v6, 0x7

    invoke-direct {v4, v6}, Lt9/p;-><init>(I)V

    new-instance v6, Lt9/c0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Luy/a;

    invoke-direct {v7, v6, v5}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v7}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    sget-object v6, Lwx/h;->b:Ls10/c;

    new-instance v7, Le20/a;

    const/4 v8, 0x5

    invoke-direct {v7, v4, v6, v8}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v7}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v4

    sget-object v6, Lwx/h;->a:Ls10/c;

    invoke-static {v6}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v6

    new-instance v7, Lwx/j;

    invoke-static {v1}, La30/h;->a(Landroid/app/Application;)Lt40/f;

    move-result-object v8

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lq83/j;

    new-instance v10, Lyy/j;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqy/d;

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq83/j;

    invoke-direct {v10, v4, v5}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v4, Lb10/b;

    invoke-direct {v4, v1, v3, v2}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-interface {v6}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbz/c;

    const-string v2, "durationProvider"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq30/w0;

    invoke-direct {v2, v10, v4, v1}, Lq30/w0;-><init>(Lyy/j;Lyy/c;Lbz/c;)V

    invoke-direct {v7, v8, v9, v2}, Lwx/j;-><init>(Lt40/f;Lq83/j;Lq30/w0;)V

    return-object v7

    :cond_3
    new-instance v1, Lcom/stripe/android/attestation/AttestationViewModel$NoArgsException;

    invoke-direct {v1}, Lcom/stripe/android/attestation/AttestationViewModel$NoArgsException;-><init>()V

    throw v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;

    invoke-static {v1}, Lwv2/a;->c(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;)Lov2/e;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    invoke-static {v1}, Lwv2/a;->a(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;)Luu2/h0;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Llb1/z0;

    invoke-static {v1}, Lwv2/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Ljb1/b;

    invoke-static {v1}, Lwv2/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;

    invoke-static {v1}, Lwu2/c;->a(Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Lmh/h;

    invoke-static {v1}, Lwt1/a;->g(Lmh/h;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lwr0/u0;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    invoke-static/range {p1 .. p1}, Lwr0/u0;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Li3/z;

    invoke-static {v1}, Lwr0/u0;->p(Li3/z;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lwr0/j0;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    invoke-static/range {p1 .. p1}, Lwr0/d0;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lwr0/z;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    invoke-static/range {p1 .. p1}, Lwr0/s;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    invoke-static/range {p1 .. p1}, Lwr0/m;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    invoke-static/range {p1 .. p1}, Lwr0/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    invoke-static/range {p1 .. p1}, Lwr0/g;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Lm91/q;

    invoke-static {v1}, Lwq2/c;->a(Lm91/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, Ltq1/a;

    invoke-static {v1}, Lwq1/c;->e(Ltq1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lwq1/c;->n(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    return-object v1

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lwq1/c;->b(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    return-object v1

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Ljb1/b;

    invoke-static {v1}, Lwp2/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Lyn1/a;

    invoke-static {v1}, Lwo1/p0;->a(Lyn1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Lyn1/a;

    invoke-static {v1}, Lwo1/p0;->f(Lyn1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Lro1/g;

    invoke-static {v1}, Lwo1/p0;->g(Lro1/g;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Lyn1/a;

    invoke-static {v1}, Lwo1/h0;->c(Lyn1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, Lro1/g;

    invoke-static {v1}, Lwo1/h0;->f(Lro1/g;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Lyn1/a;

    invoke-static {v1}, Lwo1/f0;->h(Lyn1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
