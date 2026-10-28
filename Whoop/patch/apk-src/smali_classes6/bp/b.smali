.class public abstract Lbp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static E:Ljava/lang/Boolean; = null

.field public static w:Landroid/content/Context; = null

.field public static x:Ljava/lang/Boolean; = null

.field public static y:Z = true

.field public static z:Lo2/e;


# direct methods
.method public static final A(Ln6/o;)Z
    .locals 2

    new-instance v0, Lp6/h1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp6/h1;-><init>(I)V

    invoke-interface {p0, v0}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result p0

    return p0
.end method

.method public static final B(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lva3/d;->i(C)Z

    move-result v2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final C(Ljava/lang/Exception;Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x1

    invoke-static {p2, v0}, Le4/p;->b(II)I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Le4/p;->e(I)I

    move-result p2

    const-string v1, "MFLT-SDK"

    if-eq p2, v0, :cond_5

    const/4 v0, 0x2

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-eq p2, v0, :cond_3

    const/4 v0, 0x4

    if-eq p2, v0, :cond_2

    const/4 v0, 0x5

    if-eq p2, v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {v1, p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_2
    invoke-static {v1, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_3
    invoke-static {v1, p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_4
    invoke-static {v1, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_5
    invoke-static {v1, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static final D(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)Llb/e;
    .locals 1

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb/e;

    invoke-direct {v0, p0, p1, p2}, Llb/e;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final E(Lio/sentry/internal/debugmeta/c;)Llb/e;
    .locals 1

    new-instance v0, Llb/e;

    invoke-direct {v0, p0}, Llb/e;-><init>(Lio/sentry/internal/debugmeta/c;)V

    return-object v0
.end method

.method public static final F(Landroid/view/ViewStructure;La3/n0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lj3/b;)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Li3/u;->a:Li3/y;

    sget-object v4, Li3/k;->a:Li3/y;

    invoke-virtual {v1}, La3/n0;->I()Li3/l;

    move-result-object v4

    const/4 v10, 0x2

    const/16 v13, 0x8

    if-eqz v4, :cond_13

    iget-object v4, v4, Li3/l;->w:La0/v0;

    if-eqz v4, :cond_13

    const-wide/16 v16, 0x80

    iget-object v5, v4, La0/v0;->b:[Ljava/lang/Object;

    iget-object v6, v4, La0/v0;->c:[Ljava/lang/Object;

    iget-object v4, v4, La0/v0;->a:[J

    const-wide/16 v18, 0xff

    array-length v7, v4

    sub-int/2addr v7, v10

    move/from16 v30, v10

    if-ltz v7, :cond_11

    const/4 v8, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x7

    :goto_0
    aget-wide v9, v4, v8

    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v11, v9

    shl-long v11, v11, v29

    and-long/2addr v11, v9

    and-long v11, v11, v31

    cmp-long v11, v11, v31

    if-eqz v11, :cond_10

    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_f

    and-long v33, v9, v18

    cmp-long v33, v33, v16

    if-gez v33, :cond_d

    shl-int/lit8 v33, v8, 0x3

    add-int v33, v33, v12

    aget-object v34, v5, v33

    aget-object v14, v6, v33

    move-object/from16 v15, v34

    check-cast v15, Li3/y;

    move/from16 v34, v13

    sget-object v13, Li3/u;->r:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType"

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v14

    check-cast v20, Lc2/f;

    goto/16 :goto_2

    :cond_0
    sget-object v13, Li3/u;->a:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    const-string v13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ljava/util/List;

    invoke-static {v14}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_e

    invoke-virtual {v0, v13}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_1
    sget-object v13, Li3/u;->q:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType"

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v14

    check-cast v23, Lc2/p;

    goto/16 :goto_2

    :cond_2
    sget-object v13, Li3/u;->E:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString"

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v14

    check-cast v28, Ll3/g;

    goto/16 :goto_2

    :cond_3
    sget-object v13, Li3/u;->k:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    if-eqz v13, :cond_4

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setFocused(Z)V

    goto/16 :goto_2

    :cond_4
    sget-object v13, Li3/u;->N:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v27, v14

    check-cast v27, Ljava/lang/Integer;

    goto/16 :goto_2

    :cond_5
    sget-object v13, Li3/u;->J:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/16 v26, 0x1

    goto/16 :goto_2

    :cond_6
    sget-object v13, Li3/u;->x:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v25, v14

    check-cast v25, Li3/i;

    goto :goto_2

    :cond_7
    sget-object v13, Li3/u;->H:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v24, v14

    check-cast v24, Ljava/lang/Boolean;

    goto :goto_2

    :cond_8
    sget-object v2, Li3/u;->I:Li3/y;

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v22, v14

    check-cast v22, Lk3/a;

    goto :goto_2

    :cond_9
    sget-object v2, Li3/k;->b:Li3/y;

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setClickable(Z)V

    goto :goto_2

    :cond_a
    const/4 v2, 0x1

    sget-object v13, Li3/k;->c:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setLongClickable(Z)V

    goto :goto_2

    :cond_b
    sget-object v13, Li3/k;->v:Li3/y;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setFocusable(Z)V

    goto :goto_2

    :cond_c
    sget-object v2, Li3/k;->j:Li3/y;

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/16 v21, 0x1

    goto :goto_2

    :cond_d
    move/from16 v34, v13

    :cond_e
    :goto_2
    shr-long v9, v9, v34

    add-int/lit8 v12, v12, 0x1

    move/from16 v13, v34

    const/4 v2, 0x1

    goto/16 :goto_1

    :cond_f
    move v2, v13

    if-ne v11, v2, :cond_12

    :cond_10
    if-eq v8, v7, :cond_12

    add-int/lit8 v8, v8, 0x1

    const/4 v2, 0x1

    const/16 v13, 0x8

    goto/16 :goto_0

    :cond_11
    const/16 v29, 0x7

    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    :cond_12
    move-object/from16 v2, v22

    move-object/from16 v4, v25

    move-object/from16 v5, v28

    goto :goto_3

    :cond_13
    move/from16 v30, v10

    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const/16 v29, 0x7

    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_3
    invoke-virtual {v1}, La3/n0;->I()Li3/l;

    move-result-object v6

    if-eqz v6, :cond_17

    iget-boolean v7, v6, Li3/l;->y:Z

    if-eqz v7, :cond_17

    iget-boolean v7, v6, Li3/l;->z:Z

    if-eqz v7, :cond_14

    goto :goto_5

    :cond_14
    invoke-virtual {v6}, Li3/l;->a()Li3/l;

    move-result-object v6

    new-instance v7, La0/q0;

    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lr1/b;

    iget-object v8, v8, Lr1/b;->w:Lr1/c;

    iget v8, v8, Lr1/c;->y:I

    invoke-direct {v7, v8}, La0/q0;-><init>(I)V

    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7, v8}, La0/q0;->b(Ljava/util/List;)V

    :cond_15
    :goto_4
    invoke-virtual {v7}, La0/q0;->h()Z

    move-result v8

    if-eqz v8, :cond_17

    iget v8, v7, La0/q0;->b:I

    const/16 v35, 0x1

    add-int/lit8 v8, v8, -0x1

    invoke-virtual {v7, v8}, La0/q0;->j(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La3/n0;

    invoke-virtual {v8}, La3/n0;->I()Li3/l;

    move-result-object v9

    if-eqz v9, :cond_15

    iget-boolean v10, v9, Li3/l;->y:Z

    if-eqz v10, :cond_16

    goto :goto_4

    :cond_16
    invoke-virtual {v6, v9}, Li3/l;->d(Li3/l;)V

    iget-boolean v9, v9, Li3/l;->z:Z

    if-nez v9, :cond_15

    invoke-virtual {v8}, La3/n0;->q()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7, v8}, La0/q0;->b(Ljava/util/List;)V

    goto :goto_4

    :cond_17
    :goto_5
    if-eqz v6, :cond_1d

    iget-object v6, v6, Li3/l;->w:La0/v0;

    if-eqz v6, :cond_1d

    iget-object v7, v6, La0/v0;->b:[Ljava/lang/Object;

    iget-object v8, v6, La0/v0;->c:[Ljava/lang/Object;

    iget-object v6, v6, La0/v0;->a:[J

    array-length v9, v6

    add-int/lit8 v9, v9, -0x2

    if-ltz v9, :cond_1d

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_6
    aget-wide v12, v6, v10

    not-long v14, v12

    shl-long v14, v14, v29

    and-long/2addr v14, v12

    and-long v14, v14, v31

    cmp-long v14, v14, v31

    if-eqz v14, :cond_1c

    sub-int v14, v10, v9

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v34, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v15, 0x0

    :goto_7
    if-ge v15, v14, :cond_1b

    and-long v36, v12, v18

    cmp-long v22, v36, v16

    if-gez v22, :cond_1a

    shl-int/lit8 v22, v10, 0x3

    add-int v22, v22, v15

    aget-object v25, v7, v22

    move-object/from16 v28, v3

    aget-object v3, v8, v22

    move-object/from16 v22, v6

    move-object/from16 v6, v25

    check-cast v6, Li3/y;

    move-object/from16 v25, v7

    sget-object v7, Li3/u;->i:Li3/y;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/ViewStructure;->setEnabled(Z)V

    goto :goto_8

    :cond_18
    sget-object v7, Li3/u;->A:Li3/y;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v3

    check-cast v11, Ljava/util/List;

    :cond_19
    :goto_8
    const/16 v3, 0x8

    goto :goto_9

    :cond_1a
    move-object/from16 v28, v3

    move-object/from16 v22, v6

    move-object/from16 v25, v7

    goto :goto_8

    :goto_9
    shr-long/2addr v12, v3

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v6, v22

    move-object/from16 v7, v25

    move-object/from16 v3, v28

    goto :goto_7

    :cond_1b
    move-object/from16 v28, v3

    move-object/from16 v22, v6

    move-object/from16 v25, v7

    const/16 v3, 0x8

    if-ne v14, v3, :cond_1e

    goto :goto_a

    :cond_1c
    move-object/from16 v28, v3

    move-object/from16 v22, v6

    move-object/from16 v25, v7

    const/16 v3, 0x8

    :goto_a
    if-eq v10, v9, :cond_1e

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, v22

    move-object/from16 v7, v25

    move-object/from16 v3, v28

    goto :goto_6

    :cond_1d
    move-object/from16 v28, v3

    const/4 v11, 0x0

    :cond_1e
    iget v3, v1, La3/n0;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v6

    if-nez v6, :cond_1f

    const/4 v3, 0x0

    :cond_1f
    if-eqz v3, :cond_20

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_b
    move-object/from16 v6, p2

    goto :goto_c

    :cond_20
    const/4 v3, -0x1

    goto :goto_b

    :goto_c
    invoke-virtual {v0, v6, v3}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    move-object/from16 v6, p3

    const/4 v7, 0x0

    invoke-virtual {v0, v3, v6, v7, v7}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v20, :cond_21

    :goto_d
    move-object/from16 v3, v28

    goto :goto_e

    :cond_21
    if-eqz v21, :cond_22

    goto :goto_d

    :cond_22
    if-eqz v2, :cond_23

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_e

    :cond_23
    move-object v3, v7

    :goto_e
    if-eqz v3, :cond_24

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillType(I)V

    :cond_24
    if-eqz v23, :cond_25

    invoke-static/range {v23 .. v23}, Lbi/g;->E(Lc2/p;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    :cond_25
    move-object/from16 v3, p4

    iget-object v3, v3, Lj3/b;->a:Lae3/k;

    iget v6, v1, La3/n0;->x:I

    new-instance v7, Lc2/q;

    const/4 v8, 0x0

    invoke-direct {v7, v0, v8}, Lc2/q;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v6, v7}, Lae3/k;->g(ILc93/n;)V

    if-eqz v24, :cond_26

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setSelected(Z)V

    :cond_26
    const/4 v7, 0x4

    if-eqz v2, :cond_28

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setCheckable(Z)V

    sget-object v3, Lk3/a;->w:Lk3/a;

    if-ne v2, v3, :cond_27

    const/4 v2, 0x1

    goto :goto_f

    :cond_27
    move v2, v8

    :goto_f
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    goto :goto_11

    :cond_28
    if-eqz v24, :cond_2b

    if-nez v4, :cond_2a

    :cond_29
    const/4 v2, 0x1

    goto :goto_10

    :cond_2a
    iget v2, v4, Li3/i;->a:I

    if-ne v2, v7, :cond_29

    goto :goto_11

    :goto_10
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setCheckable(Z)V

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    :cond_2b
    :goto_11
    sget-object v2, Lc2/p;->a:Lc2/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lc2/o;->b:Lc2/g;

    invoke-static {v2}, Lbi/g;->E(Lc2/p;)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v23, :cond_2c

    invoke-static/range {v23 .. v23}, Lbi/g;->E(Lc2/p;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2c

    invoke-static {v3, v2}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2c

    const/4 v2, 0x1

    goto :goto_12

    :cond_2c
    move v2, v8

    :goto_12
    if-nez v26, :cond_2e

    if-eqz v2, :cond_2d

    goto :goto_13

    :cond_2d
    move v2, v8

    goto :goto_14

    :cond_2e
    :goto_13
    const/4 v2, 0x1

    :goto_14
    if-eqz v2, :cond_2f

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setDataIsSensitive(Z)V

    :cond_2f
    iget-object v3, v1, La3/n0;->e0:La3/l1;

    iget-object v3, v3, La3/l1;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result v3

    if-eqz v3, :cond_30

    goto :goto_15

    :cond_30
    move v7, v8

    :goto_15
    invoke-virtual {v0, v7}, Landroid/view/ViewStructure;->setVisibility(I)V

    if-eqz v11, :cond_32

    move-object v3, v11

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const-string v6, ""

    move v15, v8

    :goto_16
    if-ge v15, v3, :cond_31

    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll3/g;

    invoke-static {v6}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v7, Ll3/g;->x:Ljava/lang/String;

    const/16 v8, 0xa

    invoke-static {v6, v7, v8}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v15, v15, 0x1

    goto :goto_16

    :cond_31
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    const-string v3, "android.widget.TextView"

    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    :cond_32
    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lr1/b;

    invoke-virtual {v1}, Lr1/b;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_33

    if-eqz v4, :cond_33

    iget v1, v4, Li3/i;->a:I

    invoke-static {v1}, Lb3/o0;->p(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_33

    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    :cond_33
    if-eqz v21, :cond_36

    const-string v1, "android.widget.EditText"

    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    if-eqz v27, :cond_34

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setMaxTextLength(I)V

    :cond_34
    if-eqz v5, :cond_35

    iget-object v1, v5, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v1}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    :cond_35
    if-eqz v2, :cond_36

    const/16 v1, 0x81

    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setInputType(I)V

    :cond_36
    return-void
.end method

.method public static final G(Lna3/p;)Z
    .locals 1

    sget-object v0, Lna3/p;->y:Lna3/p;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final H(Ljava/lang/String;)Ll83/k;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v1, v0, [C

    const/4 v2, 0x0

    const/16 v3, 0x3d

    aput-char v3, v1, v2

    const/4 v3, 0x2

    invoke-static {p0, v1, v3, v3}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static J(Landroid/view/ViewGroup;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lbc/f0;->b(Landroid/view/ViewGroup;Z)V

    return-void

    :cond_0
    sget-boolean v0, Lbp/b;->y:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p0, p1}, Lbc/f0;->b(Landroid/view/ViewGroup;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p0, 0x0

    sput-boolean p0, Lbp/b;->y:Z

    :cond_1
    return-void
.end method

.method public static K(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr30/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "name"

    iget-object v4, v1, Lr30/h;->w:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "id"

    iget-object v4, v1, Lr30/h;->x:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "criticalityIndicator"

    iget-boolean v4, v1, Lr30/h;->y:Z

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v2

    new-instance v3, Lorg/json/JSONObject;

    iget-object v1, v1, Lr30/h;->z:Ljava/util/HashMap;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v1, "data"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "put(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p1, p0, p2}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public static final b(Ljava/util/List;IZLq20/c;Lkotlin/jvm/functions/Function1;Lm40/w;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ln0/u;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v6, p1

    move-object/from16 v7, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p5

    move-object/from16 v10, p6

    move/from16 v11, p10

    const-string v0, "paymentMethods"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSelectedListener"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p9

    check-cast v12, Lp1/q;

    const v0, 0x5413219e

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v12, v6}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_5

    move/from16 v2, p2

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    goto :goto_4

    :cond_5
    move/from16 v2, p2

    :goto_4
    and-int/lit16 v4, v11, 0xc00

    if-nez v4, :cond_8

    and-int/lit16 v4, v11, 0x1000

    if-nez v4, :cond_6

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_5

    :cond_6
    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_5
    if-eqz v4, :cond_7

    const/16 v4, 0x800

    goto :goto_6

    :cond_7
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v0, v4

    :cond_8
    and-int/lit16 v4, v11, 0x6000

    if-nez v4, :cond_a

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v4, 0x4000

    goto :goto_7

    :cond_9
    const/16 v4, 0x2000

    :goto_7
    or-int/2addr v0, v4

    :cond_a
    const/high16 v4, 0x30000

    and-int/2addr v4, v11

    if-nez v4, :cond_d

    const/high16 v4, 0x40000

    and-int/2addr v4, v11

    if-nez v4, :cond_b

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_8

    :cond_b
    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_8
    if-eqz v4, :cond_c

    const/high16 v4, 0x20000

    goto :goto_9

    :cond_c
    const/high16 v4, 0x10000

    :goto_9
    or-int/2addr v0, v4

    :cond_d
    const/high16 v4, 0x180000

    and-int/2addr v4, v11

    if-nez v4, :cond_f

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/high16 v4, 0x100000

    goto :goto_a

    :cond_e
    const/high16 v4, 0x80000

    :goto_a
    or-int/2addr v0, v4

    :cond_f
    const/high16 v4, 0xc00000

    and-int/2addr v4, v11

    if-nez v4, :cond_11

    move-object/from16 v4, p7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    const/high16 v9, 0x800000

    goto :goto_b

    :cond_10
    const/high16 v9, 0x400000

    :goto_b
    or-int/2addr v0, v9

    goto :goto_c

    :cond_11
    move-object/from16 v4, p7

    :goto_c
    const/high16 v9, 0x6000000

    and-int/2addr v9, v11

    if-nez v9, :cond_12

    const/high16 v9, 0x2000000

    or-int/2addr v0, v9

    :cond_12
    const v9, 0x2492493

    and-int/2addr v9, v0

    const v13, 0x2492492

    if-ne v9, v13, :cond_14

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_d

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object v5, v12

    goto/16 :goto_12

    :cond_14
    :goto_d
    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v9, v11, 0x1

    const v13, -0xe000001

    const/4 v14, 0x0

    if-eqz v9, :cond_16

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_15

    goto :goto_e

    :cond_15
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/2addr v0, v13

    move-object/from16 v9, p8

    goto :goto_f

    :cond_16
    :goto_e
    const/4 v9, 0x3

    invoke-static {v14, v14, v12, v9}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v9

    and-int/2addr v0, v13

    :goto_f
    invoke-virtual {v12}, Lp1/q;->r()V

    sget-object v13, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v12, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const v14, -0x7e4ec49

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->h(Z)Z

    move-result v14

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v14, v14, v16

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_17

    const/4 v0, 0x1

    goto :goto_10

    :cond_17
    const/4 v0, 0x0

    :goto_10
    or-int/2addr v0, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_18

    if-ne v3, v14, :cond_19

    :cond_18
    new-instance v3, Lb30/x1;

    const/4 v0, 0x0

    invoke-direct {v3, v13, v9, v6, v0}, Lb30/x1;-><init>(ZLn0/u;ILq83/d;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lc93/m;

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-static {v12, v3, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x7e4d491

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1a

    if-ne v3, v14, :cond_1c

    :cond_1a
    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v0, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lu00/f;

    iget-object v13, v13, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1b
    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v3, Ljava/util/List;

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const-string v0, "PaymentMethodsUITestTag1"

    invoke-static {v10, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    new-instance v0, Lb30/d2;

    move-object/from16 v17, v5

    move v5, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v9

    move-object/from16 v9, v17

    invoke-direct/range {v0 .. v9}, Lb30/d2;-><init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/u;ZILq20/c;Lm40/w;Lkotlin/jvm/functions/Function1;)V

    move-object v9, v4

    const v1, 0x42757488    # 61.3638f

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v12

    move-object v1, v13

    invoke-static/range {v1 .. v7}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_12
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1d

    new-instance v0, Lb30/w1;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object v7, v10

    move v10, v11

    invoke-direct/range {v0 .. v10}, Lb30/w1;-><init>(Ljava/util/List;IZLq20/c;Lkotlin/jvm/functions/Function1;Lm40/w;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ln0/u;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, 0x535b83a1

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0xe

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    or-int/lit8 v2, v2, 0x30

    and-int/lit8 v4, v2, 0x5b

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v17, v1

    move-object/from16 v1, p1

    goto :goto_3

    :cond_3
    :goto_2
    sget-wide v4, Luj/g;->i:J

    move-wide v6, v4

    sget-wide v4, Luj/g;->c:J

    sget-wide v8, Luj/g;->e:J

    sget v10, Luj/g;->a:F

    int-to-float v3, v3

    div-float v3, v10, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v8, v9, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v10, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0xd80

    const/16 v19, 0x0

    const v20, 0x1fff0

    move-object/from16 v17, v1

    move/from16 v18, v2

    move-object v1, v3

    move-wide v2, v6

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v21

    :goto_3
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-nez v2, :cond_4

    return-void

    :cond_4
    new-instance v3, Loj/r;

    const/4 v4, 0x0

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Loj/r;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Lq3/y;)Landroid/view/inputmethod/ExtractedText;
    .locals 5

    new-instance v0, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v0}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    iget-object v1, p0, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    iput-object v1, v0, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->startOffset:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialEndOffset:I

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialStartOffset:I

    iget-wide v3, p0, Lq3/y;->b:J

    invoke-static {v3, v4}, Ll3/u0;->f(J)I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    invoke-static {v3, v4}, Ll3/u0;->e(J)I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    iget-object p0, p0, Lq3/y;->a:Ll3/g;

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {p0, v1, v2}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    iput p0, v0, Landroid/view/inputmethod/ExtractedText;->flags:I

    return-object v0
.end method

.method public static final f(IIIZ)I
    .locals 2

    const/4 v0, 0x0

    if-lt p1, p2, :cond_1

    if-eqz p3, :cond_0

    return v0

    :cond_0
    sub-int/2addr p2, p1

    return p2

    :cond_1
    if-nez p3, :cond_2

    if-gt p1, p0, :cond_4

    goto :goto_0

    :cond_2
    sub-int v1, p2, p1

    if-le v1, p0, :cond_4

    :goto_0
    if-eqz p3, :cond_3

    goto :goto_2

    :cond_3
    sub-int/2addr p0, p1

    return p0

    :cond_4
    if-eqz p3, :cond_5

    if-gt p1, p0, :cond_7

    goto :goto_1

    :cond_5
    sub-int v1, p2, p1

    if-le v1, p0, :cond_7

    :goto_1
    if-nez p3, :cond_6

    :goto_2
    return p0

    :cond_6
    sub-int/2addr p0, p1

    return p0

    :cond_7
    if-nez p3, :cond_8

    return v0

    :cond_8
    sub-int/2addr p2, p1

    return p2
.end method

.method public static final g(Lds/w;Ls83/c;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lds/n;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lbp/b;->x(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_0
    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Lds/s;

    const/16 v1, 0x8

    invoke-direct {p1, v1, p0, v0}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lds/r;->w:Lds/r;

    invoke-virtual {p0, p1, v1}, Lds/n;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance p1, Ls;

    const/4 v1, 0x6

    invoke-direct {p1, p0, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw p0
.end method

.method public static h(Ljava/time/Instant;Ljava/time/Instant;)Lq7/a;
    .locals 1

    const-string v0, "startTime"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lq7/a;

    invoke-direct {v0, p0, p1}, Lq7/a;-><init>(Ljava/time/Instant;Ljava/time/Instant;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "end time needs be after start time"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(Ljava/lang/CharSequence;)Ljava/util/stream/IntStream;
    .locals 0

    invoke-interface {p0}, Ljava/lang/CharSequence;->chars()Ljava/util/stream/IntStream;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/CharSequence;)Ljava/util/stream/IntStream;
    .locals 0

    invoke-interface {p0}, Ljava/lang/CharSequence;->codePoints()Ljava/util/stream/IntStream;

    move-result-object p0

    return-object p0
.end method

.method public static k([S[S)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([S[S)Z

    move-result p0

    return p0
.end method

.method public static l([I[I)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p0

    return p0
.end method

.method public static m([B[B)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method public static n([J[J)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p0

    return p0
.end method

.method public static final o(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, " on line "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " See https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html for file format details."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;
    .locals 11

    new-instance v0, Landroid/text/BoringLayout;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v7, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    invoke-direct/range {v0 .. v10}, Landroid/text/BoringLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)V

    return-object v0
.end method

.method public static q()Lio/sentry/config/b;
    .locals 8

    const-string v0, "sentry.properties"

    new-instance v1, Lio/sentry/r2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lio/sentry/config/e;

    const-string v4, "sentry."

    invoke-static {}, Ljava/lang/System;->getProperties()Ljava/util/Properties;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lio/sentry/config/e;-><init>(Ljava/lang/String;Ljava/util/Properties;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lio/sentry/config/c;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "sentry.properties.file"

    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    new-instance v5, Lf1/p1;

    invoke-direct {v5, v3, v1, v4}, Lf1/p1;-><init>(Ljava/lang/String;Lio/sentry/r2;Z)V

    invoke-virtual {v5}, Lf1/p1;->q()Ljava/util/Properties;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v5, Lio/sentry/config/e;

    invoke-direct {v5, v3}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v3, "SENTRY_PROPERTIES_FILE"

    invoke-static {v3}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v5, Lf1/p1;

    invoke-direct {v5, v3, v1, v4}, Lf1/p1;-><init>(Ljava/lang/String;Lio/sentry/r2;Z)V

    invoke-virtual {v5}, Lf1/p1;->q()Ljava/util/Properties;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v4, Lio/sentry/config/e;

    invoke-direct {v4, v3}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-class v3, Lio/sentry/config/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v3}, Lds/q;->q(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_2

    :try_start_1
    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-direct {v5, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v6, Ljava/util/Properties;

    invoke-direct {v6}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v6, v5}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    move-object v4, v6

    goto :goto_4

    :catch_0
    move-exception v3

    goto :goto_3

    :catchall_0
    move-exception v5

    goto :goto_1

    :catchall_1
    move-exception v6

    :try_start_5
    invoke-virtual {v5}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v5

    :try_start_6
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_1
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v3

    :try_start_8
    invoke-virtual {v5, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v5

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_4

    :goto_3
    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Failed to load Sentry configuration from classpath resource: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v5, v3, v6, v7}, Lio/sentry/r2;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_4
    if-eqz v4, :cond_4

    new-instance v3, Lio/sentry/config/e;

    invoke-direct {v3, v4}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    new-instance v3, Lf1/p1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lf1/p1;-><init>(Ljava/lang/String;Lio/sentry/r2;Z)V

    invoke-virtual {v3}, Lf1/p1;->q()Ljava/util/Properties;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lio/sentry/config/e;

    invoke-direct {v1, v0}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    new-instance v0, Lio/sentry/config/b;

    invoke-direct {v0, v2}, Lio/sentry/config/b;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static r(Landroid/app/Application;)La13/b;
    .locals 1

    new-instance v0, La13/b;

    invoke-direct {v0}, La13/b;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-object v0
.end method

.method public static final s(Lne3/p;Lne3/e0;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Lne3/p;->J(Lne3/e0;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/e0;

    :try_start_1
    invoke-virtual {p0, v1}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v2

    iget-boolean v2, v2, Ln4/f;->c:Z

    if-eqz v2, :cond_1

    invoke-static {p0, v1}, Lbp/b;->s(Lne3/p;Lne3/e0;)V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Lne3/p;->m(Lne3/e0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :goto_2
    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    return-void

    :cond_3
    throw v0

    :catch_1
    return-void
.end method

.method public static final t(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_b

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    const/16 v4, 0x5c

    const/16 v5, 0x22

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ltz v2, :cond_0

    if-ge v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_a

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v5, :cond_2

    const-string v1, "\\\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_2
    if-ne v1, v4, :cond_3

    const-string v1, "\\\\"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    const/16 v6, 0xa

    if-ne v1, v6, :cond_4

    const-string v1, "\\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    const/16 v6, 0xd

    if-ne v1, v6, :cond_5

    const-string v1, "\\r"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    const/16 v6, 0x9

    if-ne v1, v6, :cond_6

    const-string v1, "\\t"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    const/16 v6, 0x8

    if-ne v1, v6, :cond_7

    const-string v1, "\\b"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_7
    const/16 v6, 0xc

    if-ne v1, v6, :cond_8

    const-string v1, "\\f"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_8
    if-ltz v1, :cond_9

    if-ge v1, v3, :cond_9

    const/16 v6, 0x10

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v1, v6}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const-string v6, "toString(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "\\u"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x4

    invoke-static {v6, v1}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_9
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_b
    return-object p0
.end method

.method public static u(Ljava/util/Locale;)Lb3/c;
    .locals 2

    sget-object v0, Lb3/c;->g:Lb3/c;

    if-nez v0, :cond_0

    new-instance v0, Lb3/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb3/c;-><init>(I)V

    invoke-static {p0}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object p0

    iput-object p0, v0, Lb3/c;->e:Ljava/text/BreakIterator;

    sput-object v0, Lb3/c;->g:Lb3/c;

    :cond_0
    sget-object p0, Lb3/c;->g:Lb3/c;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static v(Lg40/h1;)Lzy/b;
    .locals 3

    invoke-interface {p0}, Lg40/h1;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    :cond_1
    invoke-interface {p0}, Lg40/h1;->getMessage()I

    move-result p0

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {p0, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lq83/j;)Lmg/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmg/i;->x:Lg73/d;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lmg/i;

    if-eqz p0, :cond_1

    iget-object p0, p0, Lmg/i;->w:Lmg/h;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lmg/h;->a:Lmg/g;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Lmg/g;->b:Lmg/f;

    return-object p0
.end method

.method public static x(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static final y(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p2, p0, v0, v1}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-static {p0, p1, v0}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/BoringLayout$Metrics;)Landroid/text/BoringLayout$Metrics;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static declared-synchronized z(Landroid/content/Context;)Z
    .locals 3

    const-class v0, Lbp/b;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, Lbp/b;->w:Landroid/content/Context;

    if-eqz v1, :cond_1

    sget-object v2, Lbp/b;->x:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    if-eq v1, p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :try_start_1
    sput-object v1, Lbp/b;->x:Ljava/lang/Boolean;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager;->isInstantApp()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lbp/b;->x:Ljava/lang/Boolean;

    sput-object p0, Lbp/b;->w:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return p0

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method
