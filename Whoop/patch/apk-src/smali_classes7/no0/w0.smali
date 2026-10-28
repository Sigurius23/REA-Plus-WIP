.class public abstract Lno0/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000f2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llo0/r0;",
        "state",
        "",
        "selectedTimeSlot",
        "Lkotlin/Function1;",
        "Lcom/whoop/design/models/AppointmentButtonModel;",
        "Ll83/a0;",
        "onAppointmentClick",
        "e",
        "(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "label",
        "",
        "selected",
        "Lkotlin/Function0;",
        "onClick",
        "i",
        "(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lno0/w0;->h(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/w0;->f(Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lno0/w0;->j(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/w0;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llo0/r0;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x2f12d23c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v9, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_5

    :cond_a
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v3, v11

    :goto_6
    and-int/lit16 v11, v3, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_b

    const/4 v11, 0x1

    goto :goto_7

    :cond_b
    move v11, v13

    :goto_7
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_25

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v1, v11

    :cond_c
    if-eqz v4, :cond_d

    const/4 v0, 0x0

    goto :goto_8

    :cond_d
    move-object v0, v6

    :goto_8
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_e

    new-instance v6, Ln72/b;

    const/16 v7, 0x1c

    invoke-direct {v6, v7}, Ln72/b;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v9, v6

    :cond_f
    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p0, v9

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-nez v14, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v19, v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_a

    :cond_11
    move-object/from16 v19, v1

    :goto_a
    invoke-static {v8, v10, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v8, v9

    invoke-virtual {v2}, Llo0/r0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v12, 0x9

    const/16 v18, 0xf7

    move-object v14, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v16, v10

    const/16 v22, 0x0

    const/4 v10, 0x0

    move-object/from16 v23, v11

    move/from16 v17, v12

    const/16 v24, 0x1

    const-wide/16 v11, 0x0

    move-object/from16 v25, v13

    move-object/from16 v26, v14

    const-wide/16 v13, 0x0

    move-object/from16 v27, v15

    const/4 v15, 0x0

    move-object/from16 p4, v0

    move-object/from16 p3, v1

    move-object/from16 p2, v4

    move-object/from16 v5, v20

    move-object/from16 v0, v21

    move-object/from16 v1, v23

    move-object/from16 v4, v25

    move-object/from16 v2, v27

    move/from16 v20, v3

    move-object/from16 v3, v26

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v29

    const/4 v14, 0x3

    int-to-float v6, v14

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v31, v6, v7

    const/16 v33, 0x0

    const/16 v34, 0xd

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v29 .. v34}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v8

    mul-float v15, v8, v7

    invoke-static {v15}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v7, v5, v10, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_13

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    move-object/from16 v0, p3

    goto :goto_e

    :cond_15
    :goto_d
    invoke-static {v7, v10, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x6f6c1d54

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Llo0/r0;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v14}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v15}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v5, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_16

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_16
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    :cond_17
    invoke-static {v5, v10, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x2a95dd56

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v6, "invalid weight; must be greater than zero"

    if-eqz v4, :cond_20

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/AppointmentButtonModel;

    move-object v7, v6

    invoke-virtual {v4}, Lcom/whoop/design/models/AppointmentButtonModel;->getTextDisplay()Ljava/lang/String;

    move-result-object v6

    if-eqz p4, :cond_19

    invoke-virtual {v4}, Lcom/whoop/design/models/AppointmentButtonModel;->getDate()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v5, p4

    const p3, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    move-object v9, v7

    const/4 v7, 0x1

    goto :goto_12

    :cond_19
    move-object/from16 v5, p4

    const p3, 0x7f7fffff    # Float.MAX_VALUE

    :cond_1a
    move-object v9, v7

    const/4 v7, 0x0

    :goto_12
    move/from16 p4, v14

    move/from16 v14, v20

    and-int/lit16 v8, v14, 0x1c00

    const/16 v11, 0x800

    const-wide/16 v17, 0x0

    if-ne v8, v11, :cond_1b

    const/4 v8, 0x1

    goto :goto_13

    :cond_1b
    const/4 v8, 0x0

    :goto_13
    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v8, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_1d

    move-object/from16 v8, p2

    if-ne v12, v8, :cond_1c

    goto :goto_14

    :cond_1c
    move-object/from16 v13, p0

    goto :goto_15

    :cond_1d
    move-object/from16 v8, p2

    :goto_14
    new-instance v12, Lno0/o0;

    const/4 v11, 0x7

    move-object/from16 v13, p0

    invoke-direct {v12, v11, v13, v4}, Lno0/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    check-cast v12, Lc93/a;

    move-object/from16 p0, v0

    move-object/from16 v23, v1

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v0, v4

    cmpl-double v0, v0, v17

    if-lez v0, :cond_1e

    goto :goto_16

    :cond_1e
    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_16
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v0, v4, p3

    if-lez v0, :cond_1f

    move/from16 v0, p3

    :goto_17
    const/4 v1, 0x1

    goto :goto_18

    :cond_1f
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_17

    :goto_18
    invoke-direct {v9, v0, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v11, 0x0

    move-object v0, v8

    move-object v8, v12

    const/4 v12, 0x0

    const/16 v16, 0x6

    const/16 v28, 0x800

    invoke-static/range {v6 .. v12}, Lno0/w0;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 p2, v0

    move/from16 v20, v14

    move/from16 v8, v16

    move-object/from16 v1, v23

    move-object/from16 v0, p0

    move/from16 v14, p4

    move-object/from16 p4, v5

    move-object/from16 p0, v13

    const/high16 v13, 0x3f800000    # 1.0f

    goto/16 :goto_11

    :cond_20
    move-object/from16 v13, p0

    move-object/from16 v5, p4

    move-object/from16 p0, v0

    move-object/from16 v23, v1

    move-object v9, v6

    move/from16 v16, v8

    move/from16 p4, v14

    move/from16 v14, v20

    const p3, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v1, 0x1

    const/4 v4, 0x0

    const-wide/16 v17, 0x0

    const/16 v28, 0x800

    move-object/from16 v0, p2

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    const v3, -0x2a95aa71

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    rsub-int/lit8 v2, v2, 0x3

    const/4 v3, 0x0

    :goto_19
    if-ge v3, v2, :cond_23

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v6, v4

    cmpl-double v6, v6, v17

    if-lez v6, :cond_21

    goto :goto_1a

    :cond_21
    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1a
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v4, p3

    if-lez v7, :cond_22

    move/from16 v7, p3

    goto :goto_1b

    :cond_22
    move v7, v4

    :goto_1b
    invoke-direct {v6, v7, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_19

    :cond_23
    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object/from16 p2, v0

    move/from16 v20, v14

    move/from16 v8, v16

    move-object/from16 v1, v23

    move-object/from16 v0, p0

    move/from16 v14, p4

    move-object/from16 p4, v5

    move-object/from16 p0, v13

    move v13, v4

    goto/16 :goto_f

    :cond_24
    move-object/from16 v13, p0

    move-object/from16 v5, p4

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v10, v3, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v3, v5

    move-object v4, v13

    move-object/from16 v1, v19

    goto :goto_1c

    :cond_25
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v3, v6

    move-object v4, v9

    :goto_1c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_26

    new-instance v0, Lkw1/c;

    const/16 v7, 0x16

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final f(Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/AppointmentButtonModel;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lno0/w0;->e(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p1

    move/from16 v1, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x57d81953

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    move-object/from16 v6, p0

    if-nez v2, :cond_1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v0, v7}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v1, 0x180

    move-object/from16 v12, p2

    if-nez v4, :cond_5

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v2, v2, 0xc00

    :cond_6
    move-object/from16 v5, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v1, 0xc00

    if-nez v5, :cond_6

    move-object/from16 v5, p3

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit16 v8, v2, 0x493

    const/16 v9, 0x492

    if-eq v8, v9, :cond_9

    const/4 v8, 0x1

    goto :goto_6

    :cond_9
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_a

    move-object v5, v8

    :cond_a
    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v3, v3

    mul-float/2addr v4, v3

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v5, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Li2/w0;->a:Li2/v0;

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    if-eqz v7, :cond_b

    const v13, -0x7b507145

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    double-to-float v13, v10

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->X()J

    move-result-wide v14

    invoke-static {v8, v13, v14, v15, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->T()J

    move-result-wide v10

    invoke-static {v3, v10, v11, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    const v3, -0x7b4d33c7

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v3, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v13

    invoke-static {v8, v13, v14, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    :goto_7
    invoke-interface {v4, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v11, 0x0

    const/16 v13, 0xf

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v4, 0x0

    const/4 v9, 0x1

    invoke-static {v8, v4, v3, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v4, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v8, v0, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->E()Lb91/a;

    move-result-object v28

    invoke-virtual {v3, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v10

    and-int/lit8 v31, v2, 0xe

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v2, v2, 0x12

    or-int/lit16 v2, v2, 0xc30

    const v33, 0x2d7fa

    move/from16 v18, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v3, v18

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v30, v0

    move/from16 v32, v2

    move-object v8, v6

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    :goto_9
    move-object v4, v5

    goto :goto_a

    :cond_f
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Lcom/whoop/profile/view/edit/form/f;

    const/4 v3, 0x1

    move-object/from16 v6, p0

    move-object/from16 v5, p2

    move/from16 v2, p6

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/view/edit/form/f;-><init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final j(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lno0/w0;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
