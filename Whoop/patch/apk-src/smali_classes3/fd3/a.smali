.class public final synthetic Lfd3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lfd3/a;->w:I

    iput-object p2, p0, Lfd3/a;->x:Ljava/lang/Object;

    iput-object p3, p0, Lfd3/a;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lfd3/a;->w:I

    const/4 v3, 0x0

    const/high16 v5, -0x40800000    # -1.0f

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide v8, 0xffffffffL

    const/4 v10, 0x1

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    const-string v13, "it"

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    iget-object v15, v0, Lfd3/a;->y:Ljava/lang/Object;

    const/16 v16, 0x20

    iget-object v4, v0, Lfd3/a;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v4, Lh0/d4;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    iget v1, v4, Lh0/d4;->e:F

    iput v12, v4, Lh0/d4;->e:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v15, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v14

    :pswitch_0
    check-cast v4, Lkotlin/jvm/internal/d0;

    check-cast v15, Lh0/e0;

    check-cast v1, Ld0/k;

    iget v2, v4, Lkotlin/jvm/internal/d0;->w:F

    cmpg-float v2, v2, v12

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget v3, v4, Lkotlin/jvm/internal/d0;->w:F

    div-float v11, v2, v3

    :goto_0
    iget-object v2, v15, Lh0/e0;->a:Lh0/f0;

    iget-object v2, v2, Lh0/f0;->a:Lea2/g;

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    new-instance v5, Lh2/b;

    const-wide/16 v6, 0x0

    invoke-direct {v5, v6, v7}, Lh2/b;-><init>(J)V

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v2, v3, v5, v6}, Lea2/g;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iput v1, v4, Lkotlin/jvm/internal/d0;->w:F

    return-object v14

    :pswitch_1
    check-cast v4, Lh0/a3;

    check-cast v15, Lh0/c3;

    check-cast v1, Lh0/h0;

    iget-wide v1, v1, Lh0/h0;->a:J

    iget-object v3, v15, Lh0/c3;->d:Lh0/d2;

    sget-object v5, Lh0/d2;->x:Lh0/d2;

    if-ne v3, v5, :cond_1

    invoke-static {v12, v12, v1, v2, v10}, Lh2/b;->a(FFJI)J

    move-result-wide v1

    goto :goto_1

    :cond_1
    invoke-static {v12, v12, v1, v2, v6}, Lh2/b;->a(FFJI)J

    move-result-wide v1

    :goto_1
    invoke-virtual {v4, v10, v1, v2}, Lh0/a3;->a(IJ)J

    return-object v14

    :pswitch_2
    check-cast v4, Lh0/g1;

    check-cast v15, Lh0/m1;

    check-cast v1, Lh0/h0;

    iget-wide v1, v1, Lh0/h0;->a:J

    iget-boolean v3, v15, Lh0/m1;->e0:Z

    if-eqz v3, :cond_2

    invoke-static {v5, v1, v2}, Lh2/b;->i(FJ)J

    move-result-wide v1

    goto :goto_2

    :cond_2
    invoke-static {v11, v1, v2}, Lh2/b;->i(FJ)J

    move-result-wide v1

    :goto_2
    iget-object v3, v15, Lh0/m1;->a0:Lh0/d2;

    sget-object v5, Lh0/k1;->a:Lh0/j1;

    sget-object v5, Lh0/d2;->w:Lh0/d2;

    if-ne v3, v5, :cond_3

    and-long/2addr v1, v8

    :goto_3
    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    goto :goto_4

    :cond_3
    shr-long v1, v1, v16

    goto :goto_3

    :goto_4
    invoke-interface {v4, v1}, Lh0/g1;->a(F)V

    return-object v14

    :pswitch_3
    check-cast v4, Lad3/z;

    check-cast v15, Lh0/v;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v1, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    invoke-virtual {v1, v15}, Lr1/c;->k(Ljava/lang/Object;)Z

    return-object v14

    :pswitch_4
    check-cast v4, Lh0/k;

    check-cast v15, Lh0/a;

    check-cast v1, Lh0/h0;

    iget-wide v1, v1, Lh0/h0;->a:J

    invoke-virtual {v4}, Lh0/k;->k1()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v5, v1, v2}, Lh2/b;->i(FJ)J

    move-result-wide v1

    goto :goto_5

    :cond_4
    invoke-static {v11, v1, v2}, Lh2/b;->i(FJ)J

    move-result-wide v1

    :goto_5
    iget-object v3, v4, Lh0/k;->a0:Lh0/d2;

    sget-object v5, Lh0/d2;->w:Lh0/d2;

    if-ne v3, v5, :cond_5

    and-long/2addr v1, v8

    :goto_6
    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    goto :goto_7

    :cond_5
    shr-long v1, v1, v16

    goto :goto_6

    :goto_7
    iget-object v2, v4, Lh0/k;->Z:Lh0/p;

    invoke-virtual {v2, v1}, Lh0/p;->d(F)F

    move-result v1

    invoke-static {v15, v1}, Lh0/a;->a(Lh0/a;F)V

    return-object v14

    :pswitch_5
    check-cast v4, Lep2/c$d;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v4, v15, v1}, Lgp2/e;->d(Lep2/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v4, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    check-cast v15, Lp1/t2;

    invoke-static {v4, v15, v1}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->E(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;Lp1/t2;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v15, Lcom/whoop/bot/models/feedback/FeedbackReason;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v4, v15, v1}, Lgh0/e;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    check-cast v4, Lp1/c1;

    check-cast v15, Lg40/m3;

    check-cast v1, Lg2/v;

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    check-cast v1, Lg2/w;

    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v3

    if-eq v2, v3, :cond_6

    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v2

    invoke-interface {v15, v2}, Lg40/m3;->g(Z)V

    :cond_6
    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v4, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v14

    :pswitch_9
    check-cast v4, Lg40/m3;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Lg40/m3;->k()Lc2/n;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v15, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-interface {v4, v1}, Lg40/m3;->q(Ljava/lang/String;)Lg40/s3;

    return-object v14

    :pswitch_a
    check-cast v4, Lg40/u2;

    check-cast v15, Lp1/c1;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/2addr v1, v10

    iget-object v2, v4, Lg40/u2;->b:Lec3/h2;

    invoke-static {v1, v2, v7}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-object v14

    :pswitch_b
    check-cast v4, Lg40/z1;

    check-cast v15, Lp1/c1;

    check-cast v1, Lg2/v;

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    check-cast v1, Lg2/w;

    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v3

    if-eq v2, v3, :cond_8

    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v2

    iget-object v3, v4, Lg40/z1;->h:Lec3/h2;

    invoke-static {v2, v3, v7}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v15, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v14

    :pswitch_c
    check-cast v4, Lbc3/c0;

    check-cast v15, Lr0/a;

    check-cast v1, Lg2/v;

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lg2/w;

    invoke-virtual {v1}, Lg2/w;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v1, Lg40/e2;

    invoke-direct {v1, v15, v7, v3}, Lg40/e2;-><init>(Lr0/a;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v4, v7, v7, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_9
    return-object v14

    :pswitch_d
    check-cast v4, Lkotlin/jvm/internal/b0;

    check-cast v15, Lkotlin/jvm/internal/e0;

    check-cast v1, Ly2/y;

    const-string v2, "layoutCoordinates"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v4, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v2, :cond_a

    iget v2, v15, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v1}, Ly2/y;->n()J

    move-result-wide v5

    and-long/2addr v5, v8

    long-to-int v1, v5

    add-int/2addr v2, v1

    iput v2, v15, Lkotlin/jvm/internal/e0;->w:I

    iput-boolean v10, v4, Lkotlin/jvm/internal/b0;->w:Z

    :cond_a
    return-object v14

    :pswitch_e
    check-cast v4, Le32/e;

    check-cast v15, Lg32/m;

    check-cast v1, Lh20/b4;

    invoke-static {v4, v15, v1}, Lg32/k;->i(Le32/e;Lg32/m;Lh20/b4;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v15, Lg31/d;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v4, v15, v1}, Lg31/a;->b(Lkotlin/jvm/functions/Function1;Lg31/d;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v15, Lg11/d;

    check-cast v1, Ljava/time/LocalDate;

    invoke-static {v4, v15, v1}, Lg11/c;->m(Lkotlin/jvm/functions/Function1;Lg11/d;Ljava/time/LocalDate;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v4, Lg1/a4;

    check-cast v15, Ll0/i0;

    check-cast v1, Ll0/b2;

    new-instance v2, Ll0/g0;

    invoke-direct {v2, v15, v1}, Ll0/g0;-><init>(Ll0/b2;Ll0/b2;)V

    iget-object v1, v4, Lg1/a4;->a:Lp1/k1;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object v14

    :pswitch_12
    check-cast v4, Lp1/t2;

    check-cast v15, Lp1/t2;

    check-cast v1, Lk2/e;

    sget v2, Lg1/w4;->f:F

    invoke-interface {v1, v2}, Ly3/c;->q0(F)F

    move-result v8

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v9, v2, Li2/x;->a:J

    sget v2, Lg1/w4;->d:F

    invoke-interface {v1, v2}, Ly3/c;->q0(F)F

    move-result v2

    int-to-float v5, v6

    div-float v5, v8, v5

    sub-float v19, v2, v5

    new-instance v7, Lk2/i;

    const/4 v12, 0x0

    const/16 v13, 0x1e

    move-wide/from16 v17, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v24, 0x6c

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v1

    move-object/from16 v23, v7

    invoke-static/range {v16 .. v24}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    int-to-float v3, v3

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-lez v2, :cond_b

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/f;

    iget v4, v4, Ly3/f;->w:F

    invoke-interface {v1, v4}, Ly3/c;->q0(F)F

    move-result v4

    sub-float v19, v4, v5

    sget-object v23, Lk2/h;->a:Lk2/h;

    const/16 v24, 0x6c

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v1

    move-wide/from16 v17, v2

    invoke-static/range {v16 .. v24}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    :cond_b
    return-object v14

    :pswitch_13
    check-cast v4, Lfz0/d;

    check-cast v15, Lp1/c1;

    check-cast v1, Ly3/c;

    invoke-static {v4, v15, v1}, Lfz0/c;->b(Lfz0/d;Lp1/c1;Ly3/c;)Ly3/j;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v4, Lfx2/g;

    check-cast v15, Lcom/whoop/whooplabs/data/domain/OptionSelection;

    check-cast v1, Ltb/a;

    invoke-static {v4, v15, v1}, Lfx2/g;->a0(Lfx2/g;Lcom/whoop/whooplabs/data/domain/OptionSelection;Ltb/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v4, Lfx2/g;

    check-cast v15, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;

    check-cast v1, Ltb/a;

    invoke-static {v4, v15, v1}, Lfx2/g;->V(Lfx2/g;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;Ltb/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v4, Lfx2/g;

    check-cast v15, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    check-cast v1, Ltb/a;

    invoke-static {v4, v15, v1}, Lfx2/g;->T(Lfx2/g;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ltb/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v4, Lfx2/g;

    check-cast v15, Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    check-cast v1, Ltb/a;

    invoke-static {v4, v15, v1}, Lfx2/g;->k0(Lfx2/g;Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Ltb/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v4, Lfx2/g;

    check-cast v15, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    check-cast v1, Ltb/a;

    invoke-static {v4, v15, v1}, Lfx2/g;->b0(Lfx2/g;Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;Ltb/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v4, Lfx2/g;

    check-cast v15, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    check-cast v1, Ltb/a;

    invoke-static {v4, v15, v1}, Lfx2/g;->f0(Lfx2/g;Lcom/whoop/whooplabs/data/domain/ProtocolStep;Ltb/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v4, Lfj1/c;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v1, Landroidx/compose/ui/Modifier;

    invoke-static {v4, v15, v1}, Lfj1/b;->a(Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v4, Lce0/d$c;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lc31/c;

    invoke-static {v4, v15, v1}, Lfe0/e;->g(Lce0/d$c;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v4, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;

    check-cast v15, Ljava/util/Map;

    check-cast v1, Ljava/lang/String;

    invoke-static {v4, v15, v1}, Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;->d(Llive/hms/video/connection/stats/clientside/manager/StatsSamplingManager;Ljava/util/Map;Ljava/lang/String;)Lhms/webrtc/RTCStats;

    move-result-object v1

    return-object v1

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
