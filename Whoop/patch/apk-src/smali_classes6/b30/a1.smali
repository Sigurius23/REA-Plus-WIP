.class public final synthetic Lb30/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb30/a1;->w:I

    iput-object p1, p0, Lb30/a1;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lb30/a1;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Llq2/t;

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Llq2/m;->a(Llq2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lkd1/o;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Llq2/i;->f(Lkd1/o;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Llq2/a;->c(Lkotlin/jvm/functions/Function3;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lld0/p;

    move-object/from16 v2, p1

    check-cast v2, Ll0/s0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Llf0/t0;->a(Lld0/p;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Llf0/u;

    move-object/from16 v2, p1

    check-cast v2, Ll0/s0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Llf0/t;->e(Llf0/u;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lk71/o;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lk71/b;->d(Lk71/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lgr1/l;

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Ljr1/g;->i(Lgr1/l;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lhp1/d;

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Ljp1/g;->a(Lhp1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lir2/b;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lir2/d;->c(Lir2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/settings/notification/SettingsNotificationFragment;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->E(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;ZZ)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lhr2/b;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lhr2/e;->b(Lhr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lh02/p0;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lh02/o0;->c(Lh02/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lh02/l;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lh02/n;->d(Lh02/l;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lgr2/b;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lgr2/e;->b(Lgr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lfr2/b;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lfr2/d;->b(Lfr2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Ler2/b;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Ler2/e;->d(Ler2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lbb0/a;

    move-object/from16 v2, p1

    check-cast v2, Ll0/s0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Ldb0/c;->r(Lbb0/a;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lc42/b;

    move-object/from16 v2, p1

    check-cast v2, Ll0/s1;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Ld42/p;->b(Lc42/b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lc42/t;

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Ld42/p;->g(Lc42/t;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Ld30/v;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object/from16 v2, p2

    check-cast v2, Lq20/c;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v5, v1, Ld30/v;->a:Ljava/lang/String;

    iget-object v8, v1, Ld30/v;->e:Lt20/n;

    iget-object v9, v1, Ld30/v;->b:Ls20/a;

    iget-object v10, v1, Ld30/v;->c:Ljava/util/List;

    iget-object v1, v1, Ld30/v;->g:Lt00/a;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_0

    invoke-virtual {v2, v5}, Lq20/c;->b(Ljava/lang/String;)Lq20/c;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, v2, Lq20/c;->x:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const/16 v4, 0x17f

    invoke-static {v1, v3, v2, v4}, Lt00/a;->a(Lt00/a;Lzy/b;Ljava/lang/String;I)Lt00/a;

    move-result-object v3

    :cond_1
    move-object v11, v3

    new-instance v4, Ld30/g1;

    invoke-direct/range {v4 .. v11}, Ld30/g1;-><init>(Ljava/lang/String;ZZLt20/n;Ls20/a;Ljava/util/List;Lt00/a;)V

    return-object v4

    :pswitch_13
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Ld1/e;

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object/from16 v5, p2

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    iget-object v7, v1, Ld1/e;->W:Lq3/r;

    invoke-interface {v7, v4}, Lq3/r;->n(I)I

    move-result v4

    :goto_1
    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    iget-object v7, v1, Ld1/e;->W:Lq3/r;

    invoke-interface {v7, v5}, Lq3/r;->n(I)I

    move-result v5

    :goto_2
    iget-boolean v7, v1, Ld1/e;->U:Z

    const/4 v8, 0x0

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    iget-object v7, v1, Ld1/e;->R:Lq3/y;

    iget-wide v9, v7, Lq3/y;->b:J

    sget v7, Ll3/u0;->c:I

    const/16 v7, 0x20

    shr-long v11, v9, v7

    long-to-int v7, v11

    if-ne v4, v7, :cond_5

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    long-to-int v7, v9

    if-ne v5, v7, :cond_5

    :goto_3
    move v2, v8

    goto :goto_6

    :cond_5
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-ltz v7, :cond_8

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v9, v1, Ld1/e;->R:Lq3/y;

    iget-object v9, v9, Lq3/y;->a:Ll3/g;

    iget-object v9, v9, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-gt v7, v9, :cond_8

    if-nez v6, :cond_7

    if-ne v4, v5, :cond_6

    goto :goto_4

    :cond_6
    iget-object v6, v1, Ld1/e;->X:Lf1/s1;

    invoke-virtual {v6, v2}, Lf1/s1;->h(Z)V

    goto :goto_5

    :cond_7
    :goto_4
    iget-object v6, v1, Ld1/e;->X:Lf1/s1;

    invoke-virtual {v6, v8}, Lf1/s1;->s(Z)V

    sget-object v7, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {v6, v7}, Lf1/s1;->p(Lu0/g0;)V

    :goto_5
    iget-object v6, v1, Ld1/e;->S:Lu0/s0;

    iget-object v6, v6, Lu0/s0;->v:Lu0/v;

    new-instance v7, Lq3/y;

    iget-object v1, v1, Ld1/e;->R:Lq3/y;

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    invoke-static {v4, v5}, Lj93/l0;->f(II)J

    move-result-wide v4

    invoke-direct {v7, v1, v4, v5, v3}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    invoke-virtual {v6, v7}, Lu0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_8
    iget-object v1, v1, Ld1/e;->X:Lf1/s1;

    invoke-virtual {v1, v8}, Lf1/s1;->s(Z)V

    sget-object v2, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {v1, v2}, Lf1/s1;->p(Lu0/g0;)V

    goto :goto_3

    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_14
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lcz/n0;

    iget-object v4, v1, Lcz/n0;->z:Lcz/b;

    move-object/from16 v5, p1

    check-cast v5, Lcz/e0;

    move-object/from16 v6, p2

    check-cast v6, Lcz/f0;

    move-object/from16 v7, p3

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v8, "customerState"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "selectionConfirmationState"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v5, Lcz/e0;->a:Ljava/util/List;

    iget-object v12, v5, Lcz/e0;->b:Lq20/y;

    const/4 v8, 0x0

    if-eqz v7, :cond_9

    iget-boolean v7, v5, Lcz/e0;->g:Z

    if-eqz v7, :cond_9

    move v15, v2

    goto :goto_7

    :cond_9
    move v15, v8

    :goto_7
    if-nez v15, :cond_a

    iget-object v7, v1, Lcz/n0;->w:Lq20/y;

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    move/from16 v17, v2

    goto :goto_8

    :cond_a
    move/from16 v17, v8

    :goto_8
    iget-object v10, v4, Lcz/b;->y:Ljava/lang/String;

    invoke-virtual {v1}, Lcz/n0;->o()Z

    move-result v13

    iget-boolean v1, v5, Lcz/e0;->e:Z

    iget-boolean v14, v6, Lcz/f0;->a:Z

    iget-object v2, v6, Lcz/f0;->b:Ljava/lang/String;

    iget-object v6, v5, Lcz/e0;->f:Lw30/c;

    instance-of v6, v6, Lw30/a;

    iget-boolean v5, v5, Lcz/e0;->g:Z

    if-eqz v12, :cond_b

    iget-object v4, v4, Lcz/b;->F:Ljava/lang/String;

    invoke-virtual {v12, v4, v8}, Lq20/y;->f(Ljava/lang/String;Z)Lzy/c;

    move-result-object v4

    if-eqz v4, :cond_b

    if-eqz v17, :cond_b

    move-object/from16 v21, v4

    goto :goto_9

    :cond_b
    move-object/from16 v21, v3

    :goto_9
    new-instance v9, Lcz/r0;

    move/from16 v19, v1

    move-object/from16 v20, v2

    move/from16 v18, v5

    move/from16 v22, v6

    move/from16 v16, v8

    invoke-direct/range {v9 .. v22}, Lcz/r0;-><init>(Ljava/lang/String;Ljava/util/List;Lq20/y;ZZZZZZZLjava/lang/String;Lzy/c;Z)V

    return-object v9

    :pswitch_15
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lqx1/a;

    move-object/from16 v2, p1

    check-cast v2, Ll0/s1;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lcom/whoop/membership/view/upcycle/b;->g(Lqx1/a;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lcr2/c;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lcr2/e;->c(Lcr2/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    move-object/from16 v2, p1

    check-cast v2, Ll0/y;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->f(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    move-object/from16 v2, p1

    check-cast v2, Ll0/s0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lc41/b1;->g(Ljava/util/ArrayList;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lc11/i;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lc11/h;->m(Lc11/i;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lxq2/i;

    move-object/from16 v2, p1

    check-cast v2, Lc0/i0;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lbr2/e;->c(Lxq2/i;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Lbd1/o;

    move-object/from16 v2, p1

    check-cast v2, Ll0/y;

    move-object/from16 v3, p2

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Lbd1/l;->a(Lbd1/o;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    iget-object v1, v0, Lb30/a1;->x:Ljava/lang/Object;

    check-cast v1, Ln20/u;

    move-object/from16 v5, p1

    check-cast v5, Ljava/lang/String;

    move-object/from16 v2, p2

    check-cast v2, Ln20/h;

    move-object/from16 v4, p3

    check-cast v4, Ln20/m;

    if-eqz v2, :cond_c

    if-eqz v4, :cond_c

    iget-object v2, v2, Ln20/h;->w:La30/f1;

    iget-object v7, v2, La30/f1;->w:Lmy/a;

    iget-object v6, v2, La30/f1;->E:Lv00/c0;

    iget-object v2, v4, Ln20/m;->b:Lh20/x1;

    iget-object v8, v2, Lh20/x1;->H:Lh20/h1;

    iget-object v9, v1, Ln20/u;->E:Lq20/y;

    new-instance v4, Lb30/z0;

    invoke-direct/range {v4 .. v9}, Lb30/z0;-><init>(Ljava/lang/String;Lv00/c0;Lmy/a;Lh20/h1;Lq20/y;)V

    move-object v3, v4

    :cond_c
    return-object v3

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
