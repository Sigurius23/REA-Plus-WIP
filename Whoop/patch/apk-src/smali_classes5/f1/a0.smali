.class public final synthetic Lf1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lf1/a0;->w:I

    iput-object p2, p0, Lf1/a0;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lf1/a0;->w:I

    const-wide v2, 0xffffffffL

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, v0, Lf1/a0;->x:Lp1/c1;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lgr1/a;

    invoke-static {v5, v1}, Ljr1/e;->j(Lp1/c1;Lgr1/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Ljp2/n;->e(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Ljp1/r;->g(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1, v5}, Ljp1/h;->e(ILp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ly3/f;

    invoke-static {v5, v1}, Ljm0/d;->g(Lp1/c1;Ly3/f;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ly3/f;

    invoke-static {v5, v1}, Ljm0/d;->d(Lp1/c1;Ly3/f;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Ll3/r0;

    invoke-static {v5, v1}, Liz0/g;->x(Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Lcom/whoop/education/FeatureEducationDebugFragment;->y(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Ly2/y;

    invoke-static {v5, v1}, Lib0/d;->c(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Lv41/s;

    invoke-static {v5, v1}, Li51/k;->b(Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Lcom/whoop/domain/model/UnitSystem;

    invoke-static {v5, v1}, Lh90/b;->c(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Ly2/y;

    invoke-static {v5, v1}, Lh51/d;->i(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Ll3/r0;

    invoke-static {v5, v1}, Lh01/s;->c(Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Ly3/l;

    sget-object v2, Lh00/f0;->a:Lp1/b0;

    invoke-interface {v5, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Lkotlin/jvm/functions/Function3;

    const-string v2, "content"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Lgv1/g;->a(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Lgh0/e;->l(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Ly3/l;

    iget-wide v6, v1, Ly3/l;->a:J

    and-long v1, v6, v2

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    new-instance v2, Ly3/f;

    invoke-direct {v2, v1}, Ly3/f;-><init>(F)V

    invoke-interface {v5, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

    :pswitch_13
    move-object/from16 v6, p1

    check-cast v6, Lk2/e;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v7, v1, Li2/x;->a:J

    sget v1, Lg1/r7;->a:F

    invoke-interface {v6, v1}, Ly3/c;->q0(F)F

    move-result v1

    sget v5, Lg1/r7;->b:F

    invoke-interface {v6, v5}, Ly3/c;->q0(F)F

    move-result v13

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float v5, v13, v5

    invoke-interface {v6}, Lk2/e;->B0()J

    move-result-wide v9

    and-long/2addr v9, v2

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v14, v9

    const/16 v9, 0x20

    shl-long/2addr v10, v9

    and-long/2addr v14, v2

    or-long/2addr v10, v14

    sub-float/2addr v1, v5

    invoke-interface {v6}, Lk2/e;->B0()J

    move-result-wide v14

    and-long/2addr v14, v2

    long-to-int v5, v14

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v14, v1

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    move-wide/from16 v16, v2

    int-to-long v2, v1

    shl-long/2addr v14, v9

    and-long v1, v2, v16

    or-long/2addr v1, v14

    const/4 v15, 0x0

    const/16 v16, 0x1e0

    const/4 v14, 0x1

    move-wide v9, v10

    move-wide v11, v1

    invoke-static/range {v6 .. v16}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    return-object v4

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Ly3/l;

    invoke-static {v5, v1}, Lfz0/c;->a(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v5, v1}, Lfg2/j;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Lfg2/j;->f(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v5, v1}, Lfg2/h;->d(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v5, v1}, Lfg2/g;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v5, v1}, Lfg2/g;->d(Lp1/c1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Ltp0/c;

    invoke-static {v5, v1}, Lfa0/c;->o(Lp1/c1;Ltp0/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, Ld61/a;

    invoke-static {v5, v1}, Lf61/j;->b(Lp1/c1;Ld61/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Lf1/u;

    invoke-interface {v5, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v4

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
