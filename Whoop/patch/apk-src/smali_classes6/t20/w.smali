.class public final Lt20/w;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lh20/i1;

.field public final F:Lh20/l1;

.field public final G:Z

.field public final H:Z

.field public final I:Z

.field public final J:Z

.field public final K:Lg40/f3;

.field public final L:Ln53/e;

.field public final M:Lg40/f3;

.field public final N:Ln53/e;

.field public final O:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final P:Lg40/z1;

.field public final Q:Ln53/e;

.field public final R:Lg40/v2;

.field public final S:Lg40/h;

.field public final T:Ln53/e;

.field public final U:Lec3/f2;

.field public final V:Lx30/i1;

.field public final W:Lec3/h2;

.field public final X:Lx30/n1;

.field public final Y:Lec3/h2;

.field public final Z:Ln53/e;

.field public final a0:Lec3/w1;

.field public final b0:Lec3/q1;

.field public final c0:Ln53/e;

.field public final d0:Ln53/e;

.field public e0:Lw10/e;

.field public final w:Lt20/v;

.field public final x:Landroid/app/Application;

.field public final y:Lk83/a;

.field public final z:Landroidx/lifecycle/k1;


# direct methods
.method public constructor <init>(Lt20/v;Landroid/app/Application;Lb10/c;Landroidx/lifecycle/k1;Lg40/z;)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    iget-object v3, v1, Lt20/v;->k:Lq20/s;

    const-string v4, "lazyPaymentConfig"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v1, v0, Lt20/w;->w:Lt20/v;

    move-object/from16 v4, p2

    iput-object v4, v0, Lt20/w;->x:Landroid/app/Application;

    iput-object v2, v0, Lt20/w;->y:Lk83/a;

    move-object/from16 v2, p4

    iput-object v2, v0, Lt20/w;->z:Landroidx/lifecycle/k1;

    iget-object v2, v1, Lt20/v;->d:Ls20/a;

    iget-object v4, v2, Ls20/a;->e:Lh20/i1;

    iget-object v5, v2, Ls20/a;->e:Lh20/i1;

    iget-object v6, v2, Ls20/a;->f:Li20/b;

    iput-object v4, v0, Lt20/w;->E:Lh20/i1;

    iget-object v7, v2, Ls20/a;->i:Lh20/l1;

    iput-object v7, v0, Lt20/w;->F:Lh20/l1;

    iget-object v8, v7, Lh20/l1;->z:Lh20/j1;

    iget-object v9, v7, Lh20/l1;->w:Lh20/k1;

    iget-boolean v10, v7, Lh20/l1;->E:Z

    sget-object v11, Lh20/j1;->y:Lh20/j1;

    if-ne v8, v11, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    iput-boolean v8, v0, Lt20/w;->G:Z

    iget-object v11, v7, Lh20/l1;->x:Lh20/k1;

    sget-object v14, Lh20/k1;->y:Lh20/k1;

    if-ne v11, v14, :cond_1

    const/4 v11, 0x1

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    :goto_1
    iput-boolean v11, v0, Lt20/w;->H:Z

    iget-boolean v15, v1, Lt20/v;->a:Z

    if-eqz v15, :cond_3

    if-ne v9, v14, :cond_2

    :goto_2
    const/4 v9, 0x1

    goto :goto_3

    :cond_2
    const/4 v9, 0x0

    goto :goto_3

    :cond_3
    sget-object v14, Lh20/k1;->x:Lh20/k1;

    if-eq v9, v14, :cond_2

    goto :goto_2

    :goto_3
    iput-boolean v9, v0, Lt20/w;->I:Z

    iget-object v14, v7, Lh20/l1;->y:Lh20/k1;

    sget-object v15, Lh20/k1;->x:Lh20/k1;

    if-eq v14, v15, :cond_4

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    const/4 v14, 0x0

    :goto_4
    iput-boolean v14, v0, Lt20/w;->J:Z

    const/16 v20, 0x0

    if-eqz v3, :cond_5

    iget-object v15, v3, Lq20/s;->z:Lq20/q;

    iget-object v15, v15, Lq20/q;->w:Ljava/lang/String;

    goto :goto_6

    :cond_5
    if-nez v9, :cond_7

    if-eqz v10, :cond_6

    goto :goto_5

    :cond_6
    move-object/from16 v15, v20

    goto :goto_6

    :cond_7
    :goto_5
    if-eqz v4, :cond_6

    iget-object v15, v4, Lh20/i1;->y:Ljava/lang/String;

    :goto_6
    new-instance v12, Lg40/f3;

    new-instance v13, Lg40/l1;

    invoke-direct {v13}, Lg40/l1;-><init>()V

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move/from16 v17, v8

    const/4 v8, 0x4

    invoke-direct {v12, v13, v15, v7, v8}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v12, v0, Lt20/w;->K:Lg40/f3;

    new-instance v13, Lsz0/k;

    const/16 v15, 0x9

    invoke-direct {v13, v15}, Lsz0/k;-><init>(I)V

    iget-object v12, v12, Lg40/f3;->x:Ln53/e;

    invoke-static {v12, v13}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v13

    iput-object v13, v0, Lt20/w;->L:Ln53/e;

    if-eqz v3, :cond_8

    iget-object v15, v3, Lq20/s;->z:Lq20/q;

    iget-object v15, v15, Lq20/q;->x:Ljava/lang/String;

    goto :goto_8

    :cond_8
    if-nez v14, :cond_a

    if-eqz v10, :cond_9

    goto :goto_7

    :cond_9
    move-object/from16 v15, v20

    goto :goto_8

    :cond_a
    :goto_7
    if-eqz v4, :cond_9

    iget-object v15, v4, Lh20/i1;->x:Ljava/lang/String;

    :goto_8
    sget-object v18, Lg40/z0;->F:Ljava/util/regex/Pattern;

    if-eqz v3, :cond_c

    iget-object v7, v3, Lq20/s;->z:Lq20/q;

    if-eqz v7, :cond_c

    iget-object v7, v7, Lq20/q;->x:Ljava/lang/String;

    if-nez v7, :cond_b

    goto :goto_9

    :cond_b
    move-object v15, v7

    :cond_c
    :goto_9
    new-instance v7, Lg40/f3;

    move/from16 v18, v9

    new-instance v9, Lg40/z0;

    move/from16 v19, v10

    move/from16 v21, v11

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct {v9, v11, v10}, Lg40/z0;-><init>(ZI)V

    const/4 v10, 0x0

    invoke-direct {v7, v9, v15, v10, v8}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v7, v0, Lt20/w;->M:Lg40/f3;

    new-instance v9, Lsz0/k;

    const/16 v10, 0xe

    invoke-direct {v9, v10}, Lsz0/k;-><init>(I)V

    iget-object v7, v7, Lg40/f3;->x:Ln53/e;

    invoke-static {v7, v9}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v9

    iput-object v9, v0, Lt20/w;->N:Ln53/e;

    if-eqz v3, :cond_e

    iget-object v10, v3, Lq20/s;->z:Lq20/q;

    iget-object v10, v10, Lq20/q;->z:Ly00/c;

    if-eqz v10, :cond_d

    iget-object v10, v10, Ly00/c;->x:Ljava/lang/String;

    goto :goto_a

    :cond_d
    move-object/from16 v10, v20

    goto :goto_a

    :cond_e
    if-nez v21, :cond_f

    if-eqz v19, :cond_d

    :cond_f
    if-eqz v4, :cond_d

    iget-object v10, v4, Lh20/i1;->w:Lh20/x0;

    if-eqz v10, :cond_d

    iget-object v10, v10, Lh20/x0;->x:Ljava/lang/String;

    :goto_a
    if-eqz v3, :cond_10

    iget-object v11, v3, Lq20/s;->z:Lq20/q;

    iget-object v11, v11, Lq20/q;->y:Ljava/lang/String;

    goto :goto_c

    :cond_10
    if-nez v21, :cond_12

    if-eqz v19, :cond_11

    goto :goto_b

    :cond_11
    move-object/from16 v11, v20

    goto :goto_c

    :cond_12
    :goto_b
    if-eqz v4, :cond_11

    iget-object v11, v4, Lh20/i1;->z:Ljava/lang/String;

    :goto_c
    if-eqz v21, :cond_13

    sget-object v14, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    goto :goto_d

    :cond_13
    if-eqz v14, :cond_14

    sget-object v14, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    goto :goto_d

    :cond_14
    if-eqz v18, :cond_15

    sget-object v14, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    goto :goto_d

    :cond_15
    move-object/from16 v14, v20

    :goto_d
    iput-object v14, v0, Lt20/w;->O:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    if-nez v11, :cond_16

    const-string v11, ""

    :cond_16
    const/16 v15, 0x1c

    const/4 v8, 0x0

    invoke-static {v11, v15, v10, v8, v8}, Lg40/l0;->a(Ljava/lang/String;ILjava/lang/String;ZZ)Lg40/z1;

    move-result-object v10

    iget-object v8, v10, Lg40/z1;->m:Ln53/e;

    iput-object v10, v0, Lt20/w;->P:Lg40/z1;

    new-instance v10, Lsz0/k;

    const/16 v11, 0xf

    invoke-direct {v10, v11}, Lsz0/k;-><init>(I)V

    invoke-static {v8, v10}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v10

    iput-object v10, v0, Lt20/w;->Q:Ln53/e;

    if-eqz v3, :cond_17

    iget-object v15, v3, Lq20/s;->z:Lq20/q;

    iget-object v15, v15, Lq20/q;->z:Ly00/c;

    goto :goto_f

    :cond_17
    if-nez v17, :cond_19

    if-eqz v19, :cond_18

    goto :goto_e

    :cond_18
    move-object/from16 v15, v20

    goto :goto_f

    :cond_19
    :goto_e
    if-eqz v4, :cond_18

    iget-object v15, v4, Lh20/i1;->w:Lh20/x0;

    if-eqz v15, :cond_18

    iget-object v11, v15, Lh20/x0;->y:Ljava/lang/String;

    move-object/from16 v25, v11

    iget-object v11, v15, Lh20/x0;->z:Ljava/lang/String;

    move-object/from16 v26, v11

    iget-object v11, v15, Lh20/x0;->w:Ljava/lang/String;

    move-object/from16 v23, v11

    iget-object v11, v15, Lh20/x0;->F:Ljava/lang/String;

    move-object/from16 v28, v11

    iget-object v11, v15, Lh20/x0;->x:Ljava/lang/String;

    iget-object v15, v15, Lh20/x0;->E:Ljava/lang/String;

    new-instance v22, Ly00/c;

    move-object/from16 v24, v11

    move-object/from16 v27, v15

    invoke-direct/range {v22 .. v28}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v15, v22

    :goto_f
    if-eqz v6, :cond_1a

    invoke-static {v6, v4}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object v4

    sget-object v11, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_1a

    invoke-static {v4}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_1a

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    new-instance v11, Lg40/v2;

    move-object/from16 v19, v14

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    move-object/from16 v22, v15

    new-instance v15, Lg40/u2;

    invoke-direct {v15, v4}, Lg40/u2;-><init>(Z)V

    invoke-direct {v11, v14, v15}, Lg40/v2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/u2;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v19, v14

    move-object/from16 v22, v15

    move-object/from16 v11, v20

    :goto_10
    iput-object v11, v0, Lt20/w;->R:Lg40/v2;

    sget-object v4, Lm83/z;->w:Lm83/z;

    const-string v14, "billing_details[address]"

    if-eqz p5, :cond_1d

    sget-object v15, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v24

    if-eqz v22, :cond_1b

    invoke-static/range {v22 .. v22}, Ls93/h;->c(Ly00/c;)Ljava/util/Map;

    move-result-object v15

    move-object/from16 v25, v15

    goto :goto_11

    :cond_1b
    move-object/from16 v25, v4

    :goto_11
    invoke-virtual/range {v16 .. v16}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v26

    if-eqz v6, :cond_1c

    invoke-static {v6, v5}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object v15

    move-object/from16 v32, v15

    goto :goto_12

    :cond_1c
    move-object/from16 v32, v20

    :goto_12
    new-instance v23, Lg40/v;

    const/16 v34, 0x0

    const/16 v35, 0x478

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v33, p5

    move-object/from16 v31, v11

    invoke-direct/range {v23 .. v35}, Lg40/v;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Lg40/z;ZI)V

    move-object/from16 v29, v31

    goto :goto_13

    :cond_1d
    move-object/from16 v29, v11

    move-object/from16 v23, v20

    :goto_13
    if-eqz v23, :cond_1e

    :goto_14
    move-object/from16 v4, v23

    goto :goto_16

    :cond_1e
    new-instance v23, Lg40/f;

    sget-object v11, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v24

    if-eqz v22, :cond_1f

    invoke-static/range {v22 .. v22}, Ls93/h;->c(Ly00/c;)Ljava/util/Map;

    move-result-object v4

    :cond_1f
    move-object/from16 v25, v4

    invoke-virtual/range {v16 .. v16}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v27

    if-eqz v6, :cond_20

    invoke-static {v6, v5}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object v4

    move-object/from16 v30, v4

    goto :goto_15

    :cond_20
    move-object/from16 v30, v20

    :goto_15
    const/16 v32, 0x0

    const/16 v33, 0x194

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v23 .. v33}, Lg40/f;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/m;Ljava/util/Set;Lg40/i0;Lg40/v2;Ljava/util/Map;ZZI)V

    goto :goto_14

    :goto_16
    iput-object v4, v0, Lt20/w;->S:Lg40/h;

    invoke-interface {v4}, Lg40/y2;->e()Lec3/f2;

    move-result-object v5

    new-instance v6, Lsz0/k;

    const/16 v11, 0x10

    invoke-direct {v6, v11}, Lsz0/k;-><init>(I)V

    invoke-static {v5, v6}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v5

    iput-object v5, v0, Lt20/w;->T:Ln53/e;

    if-eqz v17, :cond_21

    invoke-interface {v4}, Lg40/y2;->f()Lec3/f2;

    move-result-object v6

    new-instance v11, Lrq0/x;

    const/16 v14, 0xf

    invoke-direct {v11, v0, v14}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-static {v6, v11}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v6

    goto :goto_17

    :cond_21
    invoke-static/range {v19 .. v19}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v6

    :goto_17
    iput-object v6, v0, Lt20/w;->U:Lec3/f2;

    if-eqz v3, :cond_22

    iget-object v6, v3, Lq20/s;->z:Lq20/q;

    if-eqz v6, :cond_22

    iget-boolean v11, v6, Lq20/q;->E:Z

    goto :goto_18

    :cond_22
    const/4 v11, 0x0

    :goto_18
    new-instance v6, Lx30/i1;

    iget-object v14, v2, Ls20/a;->c:Ljava/lang/String;

    invoke-direct {v6, v11, v14}, Lx30/i1;-><init>(ZLjava/lang/String;)V

    iput-object v6, v0, Lt20/w;->V:Lx30/i1;

    iget-object v6, v6, Lx30/i1;->c:Lg40/u2;

    iget-object v6, v6, Lg40/u2;->f:Ljava/lang/Object;

    check-cast v6, Lec3/h2;

    iput-object v6, v0, Lt20/w;->W:Lec3/h2;

    if-eqz v3, :cond_23

    invoke-static {v3}, Ls2/e;->I(Lq20/y;)Ljava/lang/Boolean;

    move-result-object v11

    if-eqz v11, :cond_23

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    goto :goto_19

    :cond_23
    const/4 v11, 0x0

    :goto_19
    iget-boolean v14, v1, Lt20/v;->o:Z

    if-eqz v14, :cond_24

    new-instance v14, Lx30/n1;

    iget-boolean v15, v1, Lt20/v;->p:Z

    invoke-direct {v14, v11, v6, v15}, Lx30/n1;-><init>(ZLec3/h2;Z)V

    goto :goto_1a

    :cond_24
    move-object/from16 v14, v20

    :goto_1a
    iput-object v14, v0, Lt20/w;->X:Lx30/n1;

    if-eqz v3, :cond_25

    iget-object v1, v3, Lq20/s;->E:Lt20/g;

    move-object v15, v1

    :goto_1b
    move-object/from16 v1, v20

    goto :goto_1d

    :cond_25
    new-instance v15, Lt20/g;

    iget-boolean v3, v1, Lt20/v;->g:Z

    iget-object v1, v1, Lt20/v;->b:Lq20/c;

    if-eqz v1, :cond_26

    iget-object v1, v1, Lq20/c;->x:Ljava/lang/String;

    move-object/from16 v17, v1

    goto :goto_1c

    :cond_26
    const/16 v17, 0x0

    :goto_1c
    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v16, v3

    invoke-direct/range {v15 .. v20}, Lt20/g;-><init>(ZLjava/lang/String;ZLt20/b;Lzy/c;)V

    goto :goto_1b

    :goto_1d
    invoke-static {v15}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v3

    iput-object v3, v0, Lt20/w;->Y:Lec3/h2;

    new-instance v11, Ld30/c;

    const/4 v15, 0x6

    invoke-direct {v11, v15}, Ld30/c;-><init>(I)V

    invoke-static {v13, v9, v10, v5, v11}, Lbi/g;->q(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/n;)Ln53/e;

    move-result-object v5

    new-instance v9, Lr12/a;

    const/16 v10, 0x1b

    invoke-direct {v9, v0, v10}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3, v6, v9}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v3

    iput-object v3, v0, Lt20/w;->Z:Ln53/e;

    const/4 v6, 0x5

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v11, v10, v1, v6}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v6

    iput-object v6, v0, Lt20/w;->a0:Lec3/w1;

    invoke-static {v6}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v6

    iput-object v6, v0, Lt20/w;->b0:Lec3/q1;

    if-eqz v14, :cond_27

    iget-object v6, v14, Lx30/n1;->f:Lx30/l1;

    if-eqz v6, :cond_27

    iget-object v6, v6, Lx30/l1;->c:Lec3/h2;

    if-nez v6, :cond_28

    :cond_27
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v6

    :cond_28
    new-instance v9, Llz1/a;

    const/16 v10, 0x19

    invoke-direct {v9, v0, v10}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3, v5, v6, v9}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object v3

    iput-object v3, v0, Lt20/w;->c0:Ln53/e;

    new-instance v3, Lsz0/k;

    const/16 v5, 0xa

    invoke-direct {v3, v5}, Lsz0/k;-><init>(I)V

    invoke-static {v12, v3}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v3

    new-instance v6, Lsz0/k;

    const/16 v9, 0xb

    invoke-direct {v6, v9}, Lsz0/k;-><init>(I)V

    invoke-static {v7, v6}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v6

    new-instance v7, Lsz0/k;

    const/16 v9, 0xc

    invoke-direct {v7, v9}, Lsz0/k;-><init>(I)V

    invoke-static {v8, v7}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v7

    invoke-interface {v4}, Lg40/y2;->e()Lec3/f2;

    move-result-object v4

    new-instance v8, Lsz0/k;

    const/16 v9, 0xd

    invoke-direct {v8, v9}, Lsz0/k;-><init>(I)V

    invoke-static {v4, v8}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v4

    new-instance v8, Las1/j;

    invoke-direct {v8, v0, v5}, Las1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3, v6, v7, v4, v8}, Lbi/g;->q(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/n;)Ln53/e;

    move-result-object v3

    iput-object v3, v0, Lt20/w;->d0:Ln53/e;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    new-instance v4, Lsz/q;

    const/4 v5, 0x4

    invoke-direct {v4, v0, v1, v5}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v5, 0x3

    const/4 v10, 0x0

    invoke-static {v3, v10, v10, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v3, v2, Ls20/a;->e:Lh20/i1;

    if-eqz v3, :cond_29

    iget-object v4, v3, Lh20/i1;->y:Ljava/lang/String;

    move-object/from16 v20, v4

    goto :goto_1e

    :cond_29
    move-object/from16 v20, v1

    :goto_1e
    if-eqz v20, :cond_2a

    iget-object v4, v2, Ls20/a;->i:Lh20/l1;

    iget-boolean v4, v4, Lh20/l1;->E:Z

    :cond_2a
    if-eqz v3, :cond_2b

    iget-object v1, v3, Lh20/i1;->x:Ljava/lang/String;

    :cond_2b
    move-object/from16 v20, v1

    if-eqz v20, :cond_2c

    iget-object v1, v2, Ls20/a;->i:Lh20/l1;

    iget-boolean v1, v1, Lh20/l1;->E:Z

    :cond_2c
    return-void
.end method

.method public static synthetic j(Lt20/w;Z)Lzy/c;
    .locals 1

    iget-object v0, p0, Lt20/w;->W:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lt20/w;->g(ZZ)Lzy/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final g(ZZ)Lzy/c;
    .locals 9

    iget-object v0, p0, Lt20/w;->w:Lt20/v;

    iget-object v1, v0, Lt20/v;->q:Lh20/i3;

    sget-object v2, Lh20/i3;->x:Lh20/i3;

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, v0, Lt20/v;->d:Ls20/a;

    iget-object v1, v1, Ls20/a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_3

    :goto_0
    add-int/lit8 v3, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2e

    if-ne v4, v5, :cond_2

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    const-string v1, ""

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lt20/v;->r:Ljava/lang/String;

    iget-boolean v4, v0, Lt20/v;->s:Z

    iget-boolean v7, v0, Lt20/v;->a:Z

    iget-boolean v0, v0, Lt20/v;->g:Z

    xor-int/lit8 v8, v0, 0x1

    move v5, p1

    move v6, p2

    invoke-static/range {v2 .. v8}, Ls93/k;->b(Ljava/lang/String;Ljava/lang/String;ZZZZZ)Lzy/c;

    move-result-object p1

    return-object p1
.end method

.method public final l()Lq20/h;
    .locals 2

    iget-object v0, p0, Lt20/w;->w:Lt20/v;

    iget-boolean v0, v0, Lt20/v;->e:Z

    iget-object v1, p0, Lt20/w;->W:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_0

    sget-object v0, Lq20/h;->x:Lq20/h;

    return-object v0

    :cond_0
    sget-object v0, Lq20/h;->y:Lq20/h;

    return-object v0

    :cond_1
    sget-object v0, Lq20/h;->z:Lq20/h;

    return-object v0
.end method

.method public final n()Lw10/c;
    .locals 4

    new-instance v0, Lw10/c;

    iget-object v1, p0, Lt20/w;->L:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lt20/w;->N:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0}, Lt20/w;->o()Ljz/e;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lw10/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljz/e;)V

    return-object v0
.end method

.method public final o()Ljz/e;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lt20/w;->w:Lt20/v;

    iget-object v2, v1, Lt20/v;->h:Ljava/lang/String;

    iget-object v3, v1, Lt20/v;->d:Ls20/a;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v1, Lt20/v;->b:Lq20/c;

    if-eqz v4, :cond_2

    iget-object v4, v1, Lt20/v;->i:Ljava/lang/String;

    if-nez v4, :cond_0

    new-instance v4, Ly00/g2;

    invoke-direct {v4, v2}, Ly00/g2;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v13, v4

    goto :goto_1

    :cond_0
    iget-boolean v4, v1, Lt20/v;->g:Z

    if-eqz v4, :cond_1

    new-instance v4, Ly00/h2;

    invoke-direct {v4, v2}, Ly00/h2;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v4, Ly00/i2;

    invoke-direct {v4, v2}, Ly00/i2;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v13, 0x0

    :goto_1
    new-instance v6, Ljz/e;

    iget-object v2, v3, Ls20/a;->d:Lu30/a;

    if-eqz v2, :cond_3

    iget-wide v7, v2, Lu30/a;->w:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object v7, v2

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    iget-object v2, v3, Ls20/a;->d:Lu30/a;

    if-eqz v2, :cond_4

    iget-object v2, v2, Lu30/a;->x:Ljava/lang/String;

    move-object v8, v2

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    iget-object v9, v1, Lt20/v;->c:Ly00/p2;

    invoke-virtual {v0}, Lt20/w;->l()Lq20/h;

    move-result-object v2

    iget-object v1, v1, Lt20/v;->d:Ls20/a;

    iget-object v3, v1, Ls20/a;->g:Lv00/i0;

    iget-boolean v1, v1, Ls20/a;->h:Z

    invoke-interface {v3, v1, v2}, Lv00/i0;->L(ZLq20/h;)Ly00/r3;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_7

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    sget-object v1, Ljz/a;->z:Ljz/a;

    :goto_4
    move-object v10, v1

    goto :goto_5

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    sget-object v1, Ljz/a;->y:Ljz/a;

    goto :goto_4

    :cond_7
    sget-object v1, Ljz/a;->x:Ljz/a;

    goto :goto_4

    :goto_5
    iget-object v1, v0, Lt20/w;->F:Lh20/l1;

    iget-boolean v1, v1, Lh20/l1;->E:Z

    iget-object v2, v0, Lt20/w;->L:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-boolean v3, v0, Lt20/w;->I:Z

    if-nez v3, :cond_9

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    :cond_9
    :goto_6
    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lt20/w;->N:Ln53/e;

    iget-object v4, v3, Ln53/e;->y:Ll83/e;

    check-cast v4, Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    iget-boolean v11, v0, Lt20/w;->J:Z

    if-nez v11, :cond_b

    if-eqz v1, :cond_a

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :cond_b
    :goto_7
    check-cast v4, Ljava/lang/String;

    iget-object v11, v0, Lt20/w;->Q:Ln53/e;

    iget-object v12, v11, Ln53/e;->y:Ll83/e;

    check-cast v12, Lc93/a;

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    iget-boolean v14, v0, Lt20/w;->H:Z

    if-nez v14, :cond_d

    if-eqz v1, :cond_c

    goto :goto_8

    :cond_c
    const/4 v12, 0x0

    :cond_d
    :goto_8
    check-cast v12, Ljava/lang/String;

    iget-object v14, v0, Lt20/w;->T:Ln53/e;

    iget-object v14, v14, Ln53/e;->y:Ll83/e;

    check-cast v14, Lc93/a;

    invoke-interface {v14}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ly00/c;

    iget-boolean v15, v0, Lt20/w;->G:Z

    if-nez v15, :cond_f

    if-eqz v1, :cond_e

    goto :goto_9

    :cond_e
    const/4 v14, 0x0

    :cond_f
    :goto_9
    check-cast v14, Ly00/c;

    if-eqz v4, :cond_10

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "toLowerCase(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_10
    const/4 v1, 0x0

    :goto_a
    if-eqz v14, :cond_11

    new-instance v15, Ljz/b;

    iget-object v4, v14, Ly00/c;->y:Ljava/lang/String;

    iget-object v5, v14, Ly00/c;->z:Ljava/lang/String;

    move-object/from16 v16, v4

    iget-object v4, v14, Ly00/c;->E:Ljava/lang/String;

    move-object/from16 v18, v4

    iget-object v4, v14, Ly00/c;->w:Ljava/lang/String;

    move-object/from16 v19, v4

    iget-object v4, v14, Ly00/c;->F:Ljava/lang/String;

    iget-object v14, v14, Ly00/c;->x:Ljava/lang/String;

    move-object/from16 v20, v4

    move-object/from16 v17, v5

    move-object/from16 v21, v14

    invoke-direct/range {v15 .. v21}, Ljz/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_b

    :cond_11
    const/4 v15, 0x0

    :goto_b
    new-instance v4, Ljz/c;

    invoke-direct {v4, v2, v12, v1, v15}, Ljz/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljz/b;)V

    new-instance v12, Ljz/d;

    iget-object v1, v3, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Lt20/w;->E:Lh20/i1;

    if-nez v1, :cond_13

    if-eqz v2, :cond_12

    iget-object v1, v2, Lh20/i1;->x:Ljava/lang/String;

    goto :goto_c

    :cond_12
    const/4 v1, 0x0

    :cond_13
    :goto_c
    iget-object v3, v11, Ln53/e;->y:Ll83/e;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_15

    if-eqz v2, :cond_14

    iget-object v5, v2, Lh20/i1;->z:Ljava/lang/String;

    goto :goto_d

    :cond_14
    const/4 v5, 0x0

    goto :goto_d

    :cond_15
    move-object v5, v3

    :goto_d
    iget-object v2, v0, Lt20/w;->P:Lg40/z1;

    invoke-virtual {v2}, Lg40/z1;->u()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v12, v1, v5, v2}, Ljz/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v11, v4

    invoke-direct/range {v6 .. v13}, Ljz/e;-><init>(Ljava/lang/Long;Ljava/lang/String;Ly00/p2;Ljz/a;Ljz/c;Ljz/d;Ly00/j2;)V

    return-object v6
.end method

.method public final p(Lzy/b;)V
    .locals 8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v1, p0, Lt20/w;->z:Landroidx/lifecycle/k1;

    const-string v2, "has_launched"

    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "should_reset"

    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt20/w;->q(Z)V

    new-instance v1, Lt20/g;

    iget-object v0, p0, Lt20/w;->w:Lt20/v;

    iget-boolean v2, v0, Lt20/v;->g:Z

    iget-object v0, v0, Lt20/v;->b:Lq20/c;

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq20/c;->x:Ljava/lang/String;

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v7

    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lt20/g;-><init>(ZLjava/lang/String;ZLt20/b;Lzy/c;)V

    iget-object p1, p0, Lt20/w;->Y:Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v7, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lt20/w;->V:Lx30/i1;

    iget-object p1, p1, Lx30/i1;->c:Lg40/u2;

    iget-object p1, p1, Lg40/u2;->e:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v7, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final q(Z)V
    .locals 1

    iget-object v0, p0, Lt20/w;->K:Lg40/f3;

    invoke-virtual {v0, p1}, Lg40/f3;->b(Z)V

    iget-object v0, p0, Lt20/w;->P:Lg40/z1;

    invoke-virtual {v0, p1}, Lg40/z1;->b(Z)V

    iget-object v0, p0, Lt20/w;->M:Lg40/f3;

    invoke-virtual {v0, p1}, Lg40/f3;->b(Z)V

    iget-object v0, p0, Lt20/w;->S:Lg40/h;

    invoke-interface {v0, p1}, Lg40/y2;->b(Z)V

    return-void
.end method
