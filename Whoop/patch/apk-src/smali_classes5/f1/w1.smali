.class public final synthetic Lf1/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf1/w1;->w:I

    iput-object p2, p0, Lf1/w1;->x:Ljava/lang/Object;

    iput-object p3, p0, Lf1/w1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lf1/w1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf1/w1;->x:Ljava/lang/Object;

    check-cast p1, Ls83/i;

    iput-object p1, p0, Lf1/w1;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lf1/w1;->w:I

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, v0, Lf1/w1;->y:Ljava/lang/Object;

    iget-object v9, v0, Lf1/w1;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lhy0/h1;

    invoke-static {v9, v8}, Lhy0/e1;->b(Lkotlin/jvm/functions/Function1;Lhy0/h1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lhy0/u;

    invoke-static {v9, v8}, Lhy0/y;->f(Lkotlin/jvm/functions/Function1;Lhy0/u;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lhv2/k$c;

    invoke-static {v9, v8}, Lhv2/i;->z(Lkotlin/jvm/functions/Function1;Lhv2/k$c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v9, Lht2/i;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lht2/e;->m(Lht2/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lgt2/c$a;

    invoke-static {v9, v8}, Lht2/e;->n(Lkotlin/jvm/functions/Function1;Lgt2/c$a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lh51/f;

    invoke-static {v9, v8}, Lh51/a;->a(Lkotlin/jvm/functions/Function1;Lh51/f;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lh41/c;

    invoke-static {v9, v8}, Lh41/a;->a(Lkotlin/jvm/functions/Function1;Lh41/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v9, Lh31/g;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lh31/e;->c(Lh31/g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v9, Lh20/k4;

    iget-object v1, v9, Lh20/k4;->g0:Ll20/a;

    check-cast v8, Lk20/a;

    iget-object v2, v9, Le30/c;->P:Lec3/r1;

    iget-object v3, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq20/y;

    if-eqz v3, :cond_0

    invoke-virtual {v8, v3}, Lk20/a;->q(Lq20/y;)V

    :cond_0
    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq20/y;

    instance-of v3, v2, Lq20/w;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Lq20/w;

    iget-object v3, v3, Lq20/w;->x:Ly00/o4;

    iget-object v8, v9, Le30/c;->L:Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lv00/c0;

    if-eqz v8, :cond_2

    iget-object v8, v8, Lv00/c0;->w:Ly00/c8;

    invoke-virtual {v1, v8, v3}, Ll20/a;->c(Ly00/c8;Ly00/o4;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v9}, Le30/c;->o()Lh20/x2;

    move-result-object v8

    sget-object v10, Lh20/x2;->w:Lh20/x2;

    if-eq v8, v10, :cond_1

    iget-object v8, v9, Le30/c;->M:Lr20/d;

    iget-object v8, v8, Lr20/d;->g:Ln53/e;

    iget-object v8, v8, Ln53/e;->y:Ll83/e;

    check-cast v8, Lc93/a;

    invoke-interface {v8}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v8

    instance-of v8, v8, Lr20/i;

    if-nez v8, :cond_1

    move v5, v6

    :cond_1
    if-eqz v5, :cond_2

    new-instance v2, Lh20/d4;

    invoke-direct {v2, v9, v4}, Lh20/d4;-><init>(Lh20/k4;I)V

    invoke-virtual {v1, v3, v2}, Ll20/a;->b(Ly00/o4;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_2
    sget-object v1, Lh20/f4;->x:Lh20/f4;

    invoke-virtual {v9, v2, v1}, Lh20/k4;->C(Lq20/y;Lh20/f4;)V

    :goto_0
    return-object v7

    :pswitch_8
    check-cast v9, Lh20/w0;

    check-cast v8, Lk20/a;

    iget-object v1, v9, Le30/c;->P:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq20/y;

    if-eqz v1, :cond_3

    invoke-virtual {v8, v1}, Lk20/a;->q(Lq20/y;)V

    :cond_3
    invoke-virtual {v9}, Lh20/w0;->A()V

    return-object v7

    :pswitch_9
    check-cast v9, Lh11/h;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lh11/d;->c(Lh11/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    invoke-static {v9, v8}, Lh02/h0;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lh02/c;

    invoke-static {v9, v8}, Lh02/b;->b(Lkotlin/jvm/functions/Function1;Lh02/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lgv1/l;

    invoke-static {v9, v8}, Lgv1/j;->a(Lkotlin/jvm/functions/Function1;Lgv1/l;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Ldt1/a;

    invoke-static {v9, v8}, Lgt1/c;->c(Lkotlin/jvm/functions/Function1;Ldt1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {v9, v8}, Lgh0/b;->e(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    check-cast v9, Lg41/e;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lg41/d;->c(Lg41/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lg40/g3;

    invoke-interface {v9, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    :pswitch_11
    check-cast v9, Ljava/lang/Long;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lg11/c;->g(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v9, Lg1/l6;

    check-cast v8, Lg1/w2;

    iget-object v1, v8, Lg1/w2;->a:Ljava/lang/Object;

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, v8, Lg1/w2;->b:Ljava/util/ArrayList;

    new-instance v2, Leg/j;

    const/16 v4, 0x10

    invoke-direct {v2, v9, v4}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v8, Lg1/w2;->c:Lp1/v1;

    if-eqz v1, :cond_4

    iget-object v2, v1, Lp1/v1;->a:Lp1/w;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v1, v3}, Lp1/w;->r(Lp1/v1;Ljava/lang/Object;)Lp1/p0;

    :cond_4
    return-object v7

    :pswitch_13
    check-cast v9, Lg01/d;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lg01/c;->d(Lg01/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lfy2/b;

    invoke-static {v9, v8}, Lfy2/a;->a(Lkotlin/jvm/functions/Function1;Lfy2/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v9, Lfj1/m;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lfj1/l;->c(Lfj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lcj1/r;

    invoke-static {v9, v8}, Lfj1/e;->e(Lkotlin/jvm/functions/Function1;Lcj1/r;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v9, Lfj1/c;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lfj1/b;->c(Lfj1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v9, Lff/a;

    check-cast v8, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to load region from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v9, Ljava/lang/String;

    check-cast v8, Lff/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "resolved region ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ") from "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v9, Landroidx/fragment/app/o1;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8}, Lf22/c;->m(Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v9, Lf1/s1;

    check-cast v8, Lp1/c1;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/l;

    iget-wide v7, v1, Ly3/l;->a:J

    invoke-virtual {v9}, Lf1/s1;->i()Lh2/b;

    move-result-object v1

    const-wide v10, 0x7fc000007fc00000L    # 2.247117487993712E307

    if-eqz v1, :cond_c

    iget-wide v12, v1, Lh2/b;->a:J

    invoke-virtual {v9}, Lf1/s1;->l()Ll3/g;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_4

    :cond_5
    iget-object v1, v9, Lf1/s1;->r:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu0/f0;

    const/4 v3, -0x1

    if-nez v1, :cond_6

    move v1, v3

    goto :goto_1

    :cond_6
    sget-object v14, Lf1/u1;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v14, v1

    :goto_1
    if-eq v1, v3, :cond_c

    const-wide v14, 0xffffffffL

    if-eq v1, v6, :cond_8

    if-eq v1, v4, :cond_8

    const/4 v3, 0x3

    if-ne v1, v3, :cond_7

    invoke-virtual {v9}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    move/from16 v16, v2

    iget-wide v2, v1, Lq3/y;->b:J

    sget v1, Ll3/u0;->c:I

    and-long v1, v2, v14

    :goto_2
    long-to-int v1, v1

    goto :goto_3

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    move/from16 v16, v2

    invoke-virtual {v9}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-wide v1, v1, Lq3/y;->b:J

    sget v3, Ll3/u0;->c:I

    shr-long v1, v1, v16

    goto :goto_2

    :goto_3
    iget-object v2, v9, Lf1/s1;->d:Lu0/s0;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-nez v2, :cond_9

    goto/16 :goto_4

    :cond_9
    iget-object v3, v9, Lf1/s1;->d:Lu0/s0;

    if-eqz v3, :cond_c

    iget-object v3, v3, Lu0/s0;->a:Lu0/c1;

    iget-object v3, v3, Lu0/c1;->a:Ll3/g;

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    iget-object v6, v9, Lf1/s1;->b:Lq3/r;

    invoke-interface {v6, v1}, Lq3/r;->x(I)I

    move-result v1

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v5, v3}, Le93/b;->n(III)I

    move-result v1

    invoke-virtual {v2, v12, v13}, Lu0/p1;->d(J)J

    move-result-wide v5

    shr-long v5, v5, v16

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    iget-object v2, v2, Lu0/p1;->a:Ll3/r0;

    iget-object v5, v2, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v5, v1}, Ll3/w;->d(I)I

    move-result v1

    invoke-virtual {v2, v1}, Ll3/r0;->f(I)F

    move-result v6

    invoke-virtual {v2, v1}, Ll3/r0;->g(I)F

    move-result v2

    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    move-result v9

    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v3, v9, v2}, Le93/b;->m(FFF)F

    move-result v2

    const-wide/16 v12, 0x0

    invoke-static {v7, v8, v12, v13}, Ly3/l;->a(JJ)Z

    move-result v6

    if-nez v6, :cond_b

    sub-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    shr-long v6, v7, v16

    long-to-int v6, v6

    div-int/2addr v6, v4

    int-to-float v6, v6

    cmpl-float v3, v3, v6

    if-lez v3, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v5, v1}, Ll3/w;->f(I)F

    move-result v3

    invoke-virtual {v5, v1}, Ll3/w;->b(I)F

    move-result v1

    sub-float/2addr v1, v3

    int-to-float v4, v4

    div-float/2addr v1, v4

    add-float/2addr v1, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    shl-long v1, v2, v16

    and-long v3, v4, v14

    or-long v10, v1, v3

    :cond_c
    :goto_4
    new-instance v1, Lh2/b;

    invoke-direct {v1, v10, v11}, Lh2/b;-><init>(J)V

    return-object v1

    :pswitch_1c
    check-cast v9, Lbc3/c0;

    check-cast v8, Ls83/i;

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v2, La20/b;

    invoke-direct {v2, v8, v3}, La20/b;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v9, v3, v1, v2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v7

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
