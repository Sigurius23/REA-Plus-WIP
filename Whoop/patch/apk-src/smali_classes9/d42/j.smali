.class public abstract Ld42/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0081\u0001\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a=\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001aQ\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "isDueDateLoading",
        "isGeneralError",
        "isDueDateUpdateError",
        "Lc42/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onSavedClicked",
        "Lkotlin/Function0;",
        "onPregnancyOnboardingDueDateExit",
        "onErrorRetry",
        "onErrorForceExit",
        "onDueDateRetry",
        "C",
        "(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroid/app/DatePickerDialog;",
        "datePickerDialog",
        "selectedDateText",
        "o",
        "(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "buttonTextResource",
        "t",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "w",
        "(ZZZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "pregnancy_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final A(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(ZZZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Ld42/j;->w(ZZZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Lc42/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move-object/from16 v7, p4

    move-object/from16 v6, p5

    move-object/from16 v11, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSavedClicked"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPregnancyOnboardingDueDateExit"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onErrorRetry"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onErrorForceExit"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDueDateRetry"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p9

    check-cast v5, Lp1/q;

    const v0, 0x295a89dc

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v10, 0x6

    move v2, v1

    move/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_2

    move/from16 v1, p0

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_2
    move/from16 v1, p0

    move v2, v10

    :goto_1
    and-int/lit8 v3, p11, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v13, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v13, v10, 0x30

    if-nez v13, :cond_3

    move/from16 v13, p1

    invoke-virtual {v5, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_5

    const/16 v14, 0x20

    goto :goto_2

    :cond_5
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v2, v14

    :goto_3
    and-int/lit8 v14, p11, 0x4

    if-eqz v14, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move/from16 v15, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v15, v10, 0x180

    if-nez v15, :cond_6

    move/from16 v15, p2

    invoke-virtual {v5, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v2, v2, v16

    :goto_5
    and-int/lit16 v12, v10, 0xc00

    if-nez v12, :cond_b

    and-int/lit16 v12, v10, 0x1000

    if-nez v12, :cond_9

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_6

    :cond_9
    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    :goto_6
    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_7

    :cond_a
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v2, v12

    :cond_b
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_d

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x4000

    goto :goto_8

    :cond_c
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v2, v12

    :cond_d
    const/high16 v12, 0x30000

    and-int v12, p10, v12

    if-nez v12, :cond_f

    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v12, 0x10000

    :goto_9
    or-int/2addr v2, v12

    :cond_f
    const/high16 v12, 0x180000

    and-int v12, p10, v12

    if-nez v12, :cond_11

    invoke-virtual {v5, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x80000

    :goto_a
    or-int/2addr v2, v12

    :cond_11
    const/high16 v12, 0xc00000

    and-int v12, p10, v12

    if-nez v12, :cond_13

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    const/high16 v12, 0x800000

    goto :goto_b

    :cond_12
    const/high16 v12, 0x400000

    :goto_b
    or-int/2addr v2, v12

    :cond_13
    const/high16 v12, 0x6000000

    and-int v12, p10, v12

    if-nez v12, :cond_15

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    const/high16 v12, 0x4000000

    goto :goto_c

    :cond_14
    const/high16 v12, 0x2000000

    :goto_c
    or-int/2addr v2, v12

    :cond_15
    move v12, v2

    const v2, 0x2492493

    and-int/2addr v2, v12

    const v10, 0x2492492

    if-eq v2, v10, :cond_16

    const/4 v2, 0x1

    goto :goto_d

    :cond_16
    const/4 v2, 0x0

    :goto_d
    and-int/lit8 v10, v12, 0x1

    invoke-virtual {v5, v10, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_26

    if-eqz v0, :cond_17

    const/4 v10, 0x0

    goto :goto_e

    :cond_17
    move v10, v1

    :goto_e
    if-eqz v3, :cond_18

    const/4 v9, 0x0

    goto :goto_f

    :cond_18
    move v9, v13

    :goto_f
    move v13, v10

    if-eqz v14, :cond_19

    const/4 v10, 0x0

    goto :goto_10

    :cond_19
    move v10, v15

    :goto_10
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/content/Context;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v2, v14, :cond_1a

    invoke-virtual {v4}, Lc42/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v15, v2

    check-cast v15, Lp1/c1;

    invoke-virtual {v4}, Lc42/d;->b()Ll83/q;

    move-result-object v2

    iget-object v3, v2, Ll83/q;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v21

    iget-object v3, v2, Ll83/q;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v22

    iget-object v2, v2, Ll83/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v23

    sget v19, Lu32/b;->a:I

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1b

    if-ne v3, v14, :cond_1c

    :cond_1b
    new-instance v3, Ld42/e;

    const/4 v2, 0x0

    invoke-direct {v3, v1, v0, v15, v2}, Ld42/e;-><init>(Ljava/util/Calendar;Ljava/lang/Object;Lp1/c1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v20, v3

    check-cast v20, Landroid/app/DatePickerDialog$OnDateSetListener;

    new-instance v17, Landroid/app/DatePickerDialog;

    invoke-direct/range {v17 .. v23}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;III)V

    invoke-virtual/range {v17 .. v17}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v1

    invoke-virtual {v4}, Lc42/d;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/widget/DatePicker;->setMinDate(J)V

    invoke-virtual {v4}, Lc42/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/widget/DatePicker;->setMaxDate(J)V

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move/from16 p1, v9

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_1d

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_11
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    move/from16 p2, v10

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-nez v10, :cond_1e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    :cond_1e
    invoke-static {v8, v5, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v5, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Lgb1/b0;->T(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    move/from16 v19, v13

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_20

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_20
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v5, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_21

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    :cond_21
    invoke-static {v10, v5, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v5, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->x:Lb2/m;

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v8, v0, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v15}, Ld42/j;->D(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v2, 0x3

    shr-int/lit8 v2, v12, 0x6

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v9

    shr-int/lit8 v10, v12, 0x9

    and-int/lit16 v3, v10, 0x380

    or-int v6, v2, v3

    move-object/from16 v2, p5

    move-object v11, v1

    move-object/from16 v3, v17

    move-object/from16 v1, p3

    invoke-static/range {v0 .. v6}, Ld42/j;->o(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x4

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->H:Lb2/m;

    invoke-virtual {v8, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lc42/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const v2, 0xe000

    and-int v3, v12, v2

    const/16 v4, 0x4000

    if-ne v3, v4, :cond_23

    const/4 v8, 0x1

    goto :goto_13

    :cond_23
    const/4 v8, 0x0

    :goto_13
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v8, :cond_24

    if-ne v3, v14, :cond_25

    :cond_24
    new-instance v3, Lbs1/i;

    const/4 v4, 0x7

    invoke-direct {v3, v7, v15, v4}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v3, Lc93/a;

    invoke-static {v0, v1, v3, v5, v9}, Ld42/j;->t(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    and-int/lit16 v1, v12, 0x3fe

    and-int/lit16 v3, v10, 0x1c00

    or-int/2addr v1, v3

    and-int/2addr v2, v10

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v10

    or-int v15, v1, v2

    move/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object v14, v5

    move/from16 v8, v19

    invoke-static/range {v8 .. v15}, Ld42/j;->w(ZZZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move v2, v9

    move v3, v10

    move/from16 v1, v19

    goto :goto_14

    :cond_26
    invoke-virtual {v5}, Lp1/q;->X()V

    move v2, v13

    move v3, v15

    :goto_14
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_27

    new-instance v0, Ld42/g;

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    move-object v5, v7

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v11}, Ld42/g;-><init>(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final D(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final E(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final F(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p5, p6}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p2, p0}, Ld42/j;->E(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ld42/j;->D(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move v1, p0

    move v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Ld42/j;->C(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V
    .locals 0

    invoke-static/range {p0 .. p6}, Ld42/j;->F(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lp1/c1;Landroid/widget/DatePicker;III)V

    return-void
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->p(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/app/DatePickerDialog;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->q(Landroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ld42/j;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->y(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ZZZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ld42/j;->B(ZZZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ld42/j;->s(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Ld42/j;->H(ZZZLc42/d;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->x(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->A(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld42/j;->G(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->z(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld42/j;->r(Ljava/lang/String;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld42/j;->u(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc42/d;",
            "Lc93/a;",
            "Landroid/app/DatePickerDialog;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v0, -0x2c1ec4eb

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_4

    and-int/lit8 v8, v6, 0x40

    if-nez v8, :cond_2

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_2
    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_3

    :cond_3
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v0, v8

    :cond_4
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :cond_6
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_8

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_5

    :cond_7
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :cond_8
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_a

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v0, v8

    :cond_a
    and-int/lit16 v8, v0, 0x2493

    const/16 v10, 0x2492

    const/4 v11, 0x0

    if-eq v8, v10, :cond_b

    const/4 v8, 0x1

    goto :goto_7

    :cond_b
    move v8, v11

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v13, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v10, v13, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v13, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v19, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v22

    sget v9, Lu32/a;->i:I

    invoke-static {v13, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v23

    const v36, 0xfff2

    const/16 v37, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v19 .. v37}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x380

    const/16 v9, 0x100

    if-ne v0, v9, :cond_f

    const/4 v0, 0x1

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_10

    if-ne v9, v14, :cond_11

    :cond_10
    new-instance v9, La31/e;

    const/16 v0, 0x1b

    invoke-direct {v9, v3, v0}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v9, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v0, v0, 0x3

    move-object/from16 v18, v15

    const/16 v15, 0x35

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v21, v10

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object v6, v8

    move-object/from16 v38, v14

    move-object/from16 v5, v18

    move-object/from16 v8, v19

    move-object/from16 v33, v20

    move-object/from16 v2, v22

    move-object/from16 v3, v23

    const/4 v4, 0x1

    move v14, v0

    move-object/from16 v0, v21

    invoke-static/range {v7 .. v15}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v10, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v10, v11

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v10, v4

    mul-float/2addr v10, v11

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    const/4 v14, 0x6

    invoke-static {v12, v0, v13, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_12

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v13, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v12, v13, v12, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v13, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lc42/d;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v13, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget v12, Lx81/d;->b:I

    move-object/from16 v14, v33

    invoke-virtual {v14, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v14, v13, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->O()Lb91/a;

    move-result-object v27

    sget v17, Lb91/a;->d:I

    shl-int/lit8 v31, v17, 0x12

    const v32, 0x2fffa

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v18, v11

    move/from16 v19, v12

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v20, v9

    move-wide/from16 v41, v15

    move/from16 v16, v10

    move-wide/from16 v9, v41

    const/4 v15, 0x0

    move/from16 v21, v16

    move-object/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    move/from16 v25, v21

    const-wide/16 v20, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v39, v30

    const/16 v30, 0x0

    move/from16 p5, v34

    move-object/from16 v34, v5

    move/from16 v5, p5

    move-object v7, v0

    move-object/from16 p5, v1

    move-object/from16 v0, v33

    move/from16 v40, v35

    move/from16 v1, v36

    move/from16 v4, v39

    move-object/from16 v35, v6

    move-object/from16 v6, v37

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    invoke-virtual/range {p1 .. p1}, Lc42/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v13, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v9

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    const/4 v13, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    invoke-static {v4, v4, v6, v13}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, Ll0/m;->g:Ll0/h;

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x36

    invoke-static {v7, v8, v13, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_15

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_15
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v35

    invoke-static {v13, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    move-object/from16 v2, v34

    goto :goto_d

    :cond_17
    :goto_c
    move-object/from16 v2, p5

    goto :goto_e

    :goto_d
    invoke-static {v8, v13, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v13, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lu32/a;->g:I

    invoke-static {v13, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    sget-object v1, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v7

    const/16 v16, 0x0

    const/16 v17, 0xe

    const-wide/16 v9, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v15, v29

    invoke-static/range {v7 .. v17}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v13

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    invoke-static {v6, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-wide/high16 v0, 0x400c000000000000L    # 3.5

    double-to-float v0, v0

    mul-float/2addr v0, v4

    new-instance v14, Ll0/l1;

    move/from16 v10, v40

    invoke-direct {v14, v0, v10, v0, v10}, Ll0/l1;-><init>(FFFF)V

    move-object/from16 v4, p3

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_19

    move-object/from16 v0, v38

    if-ne v1, v0, :cond_18

    goto :goto_f

    :cond_18
    const/4 v0, 0x0

    goto :goto_10

    :cond_19
    :goto_f
    new-instance v1, Ld42/i;

    const/4 v0, 0x0

    invoke-direct {v1, v4, v0}, Ld42/i;-><init>(Landroid/app/DatePickerDialog;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v7, v1

    check-cast v7, Lc93/a;

    new-instance v1, Ld42/f;

    move-object/from16 v5, p4

    invoke-direct {v1, v5, v0}, Ld42/f;-><init>(Ljava/lang/String;I)V

    const v0, 0x7286e6d5

    invoke-static {v0, v15, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v17, 0x36006000

    const/16 v18, 0x6c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v15

    move-object v15, v0

    invoke-static/range {v7 .. v18}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    const/4 v0, 0x1

    invoke-static {v13, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Laq1/c;

    const/4 v7, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final p(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroid/app/DatePickerDialog;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljava/lang/String;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    const-string v0, "$this$Button"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v26, v0, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Ld42/j;->o(Landroidx/compose/ui/Modifier;Lc42/d;Lc93/a;Landroid/app/DatePickerDialog;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x2f4e28f0

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v4, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v4, 0x180

    const/16 v6, 0x100

    if-nez v5, :cond_6

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v7, :cond_7

    move v5, v9

    goto :goto_5

    :cond_7
    move v5, v8

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v14, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v7, v14, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lny0/v;->TextLarge:Lny0/v;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v11, v0, 0x3

    and-int/lit8 v11, v11, 0xe

    or-int/2addr v10, v11

    invoke-static {v2, v14, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v14, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->a()J

    move-result-wide v11

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v6, :cond_b

    move v8, v9

    :cond_b
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_c

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v0, v6, :cond_d

    :cond_c
    new-instance v0, La31/e;

    const/16 v6, 0x16

    invoke-direct {v0, v3, v6}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v13, v0

    check-cast v13, Lc93/a;

    const/16 v15, 0x36

    const/16 v16, 0x68

    const/4 v8, 0x0

    move-object v6, v7

    move v0, v9

    move-object v7, v10

    move-wide v9, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lcy1/b;

    const/4 v5, 0x4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final u(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ld42/j;->t(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(ZZZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v8, 0x1e4648f5

    invoke-virtual {v0, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v7, 0x6

    const/4 v9, 0x2

    if-nez v8, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    move v8, v9

    :goto_0
    or-int/2addr v8, v7

    goto :goto_1

    :cond_1
    move v8, v7

    :goto_1
    and-int/lit8 v10, v7, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v8, v10

    :cond_3
    and-int/lit16 v10, v7, 0x180

    if-nez v10, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v8, v10

    :cond_5
    and-int/lit16 v10, v7, 0xc00

    const/16 v11, 0x800

    if-nez v10, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    move v10, v11

    goto :goto_4

    :cond_6
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v8, v10

    :cond_7
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_5

    :cond_8
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v8, v10

    :cond_9
    const/high16 v24, 0x30000

    and-int v10, v7, v24

    if-nez v10, :cond_b

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v10, 0x10000

    :goto_6
    or-int/2addr v8, v10

    :cond_b
    const v10, 0x12493

    and-int/2addr v10, v8

    const v14, 0x12492

    const/16 v25, 0x1

    if-eq v10, v14, :cond_c

    move/from16 v10, v25

    goto :goto_7

    :cond_c
    const/4 v10, 0x0

    :goto_7
    and-int/lit8 v14, v8, 0x1

    invoke-virtual {v0, v14, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1c

    const v26, 0xe000

    sget-object v10, Lp1/l;->a:Lp1/v0;

    const/4 v14, 0x0

    if-eqz v2, :cond_13

    const v13, 0x1527f481

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    new-instance v16, Lsz0/p0$b;

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lu32/a;->h:I

    invoke-direct {v13, v15, v14, v9, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v13

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lu32/a;->k:I

    invoke-direct {v13, v15, v14, v9, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lu32/a;->j:I

    invoke-direct {v15, v12, v14, v9, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v12, v8, 0x1c00

    if-ne v12, v11, :cond_d

    move/from16 v11, v25

    goto :goto_8

    :cond_d
    const/4 v11, 0x0

    :goto_8
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_e

    if-ne v12, v10, :cond_f

    :cond_e
    new-instance v12, La31/e;

    const/16 v11, 0x17

    invoke-direct {v12, v4, v11}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lc93/a;

    move-object v11, v15

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lu32/a;->b:I

    invoke-direct {v15, v1, v14, v9, v14}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int v1, v8, v26

    const/16 v9, 0x4000

    if-ne v1, v9, :cond_10

    move/from16 v1, v25

    goto :goto_9

    :cond_10
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v1, :cond_11

    if-ne v9, v10, :cond_12

    :cond_11
    new-instance v9, La31/e;

    const/16 v1, 0x18

    invoke-direct {v9, v5, v1}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lc93/a;

    sget v1, Lsz0/p0$b;->h:I

    or-int v1, v1, v24

    sget v19, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v20, v19, 0x3

    or-int v1, v1, v20

    shl-int/lit8 v20, v19, 0x9

    or-int v1, v1, v20

    shl-int/lit8 v19, v19, 0x15

    or-int v21, v1, v19

    const/4 v1, 0x0

    const/16 v22, 0x0

    const/16 v23, 0xe44

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v20, v8

    move-object/from16 v8, v16

    move-object/from16 v16, v9

    move-object v9, v13

    const/4 v13, 0x1

    move-object/from16 v27, v14

    const/4 v14, 0x0

    const/16 v28, 0x4000

    const/16 v17, 0x0

    const/16 v29, 0x2

    const/16 v18, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0x0

    move/from16 p6, v20

    move-object/from16 v2, v27

    move-object/from16 v31, v30

    move-object/from16 v20, v0

    move/from16 v0, v29

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v20

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_13
    move/from16 p6, v8

    move-object/from16 v31, v10

    move-object v2, v14

    const/4 v1, 0x0

    move-object v8, v0

    move v0, v9

    const v9, 0x152fa38d

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_a
    if-eqz v3, :cond_1a

    const v9, 0x15306037

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    new-instance v10, Lsz0/p0$b;

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lu32/a;->h:I

    invoke-direct {v11, v9, v2, v0, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lu32/a;->e:I

    invoke-direct {v9, v11, v2, v0, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lu32/a;->d:I

    invoke-direct {v11, v12, v2, v0, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v12, 0x70000

    and-int v12, p6, v12

    const/high16 v13, 0x20000

    if-ne v12, v13, :cond_14

    move/from16 v15, v25

    goto :goto_b

    :cond_14
    move v15, v1

    :goto_b
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v13, v31

    if-nez v15, :cond_15

    if-ne v12, v13, :cond_16

    :cond_15
    new-instance v12, La31/e;

    const/16 v14, 0x19

    invoke-direct {v12, v6, v14}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v12, Lc93/a;

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v14, Lu32/a;->b:I

    invoke-direct {v15, v14, v2, v0, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int v14, p6, v26

    const/16 v0, 0x4000

    if-ne v14, v0, :cond_17

    goto :goto_c

    :cond_17
    move/from16 v25, v1

    :goto_c
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v25, :cond_18

    if-ne v0, v13, :cond_19

    :cond_18
    new-instance v0, La31/e;

    const/16 v13, 0x1a

    invoke-direct {v0, v5, v13}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v16, v0

    check-cast v16, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    or-int v0, v0, v24

    sget v13, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v14, v13, 0x3

    or-int/2addr v0, v14

    shl-int/lit8 v14, v13, 0x9

    or-int/2addr v0, v14

    shl-int/lit8 v13, v13, 0x15

    or-int v21, v0, v13

    const/16 v22, 0x0

    const/16 v23, 0xe44

    move-object/from16 v20, v8

    move-object v8, v10

    const/4 v10, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v20

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_1a
    const v0, 0x153834cd

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_d
    if-eqz p0, :cond_1b

    const v0, 0x1538c3ef

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    move-object/from16 v20, v8

    new-instance v8, Lsz0/p0$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lu32/a;->f:I

    const/4 v10, 0x2

    invoke-direct {v0, v9, v2, v10, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->e()I

    move-result v2

    invoke-direct {v8, v0, v2}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v0, Lsz0/p0$e;->g:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int v21, v0, v2

    const/16 v22, 0x0

    const/16 v23, 0xffc

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v20

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1b
    const v0, 0x153cf58d    # 3.8160003E-26f

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1c
    move-object v8, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1d

    new-instance v0, Ld42/h;

    move/from16 v1, p0

    move/from16 v2, p1

    invoke-direct/range {v0 .. v7}, Ld42/h;-><init>(ZZZLc93/a;Lc93/a;Lc93/a;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final x(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
