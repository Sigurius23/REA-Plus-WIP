.class public final synthetic Lg1/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg1/d4;->w:I

    iput-wide p1, p0, Lg1/d4;->x:J

    iput-object p3, p0, Lg1/d4;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    iput p4, p0, Lg1/d4;->w:I

    iput-object p1, p0, Lg1/d4;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lg1/d4;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    iget v0, v1, Lg1/d4;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-wide v3, v1, Lg1/d4;->x:J

    iget-object v5, v1, Lg1/d4;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, Lus1/b;

    move-object/from16 v0, p1

    check-cast v0, Ltb/a;

    invoke-static {v5, v3, v4, v0}, Lus1/b;->i(Lus1/b;JLtb/a;)Lvs1/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v5, Lu0/s0;

    move-object/from16 v6, p1

    check-cast v6, Lk2/e;

    iget-object v0, v5, Lu0/s0;->s:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v5, Lu0/s0;->t:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v15, 0x0

    const/16 v16, 0x7e

    iget-wide v7, v1, Lg1/d4;->x:J

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v6 .. v16}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    :cond_1
    return-object v2

    :pswitch_1
    check-cast v5, Lk2/i;

    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v3, v4, v5, v0}, Lt71/a;->a(JLk2/i;Lk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v5, Lp0/t;

    move-object/from16 v0, p1

    check-cast v0, Ld0/e;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/j;

    iget-wide v6, v0, Ly3/j;->a:J

    invoke-static {v6, v7, v3, v4}, Ly3/j;->c(JJ)J

    move-result-wide v3

    sget v0, Lp0/t;->t:I

    invoke-virtual {v5, v3, v4}, Lp0/t;->m(J)V

    iget-object v0, v5, Lp0/t;->c:Lnr0/e;

    invoke-virtual {v0}, Lnr0/e;->invoke()Ljava/lang/Object;

    return-object v2

    :pswitch_3
    check-cast v5, Lm51/a;

    move-object/from16 v0, p1

    check-cast v0, Lk2/e;

    invoke-static {v3, v4, v5, v0}, Lm51/b;->a(JLm51/a;Lk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v5, Ll0/k1;

    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    const/16 v6, 0x20

    shr-long v7, v3, v6

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    const/4 v8, 0x0

    cmpl-float v9, v7, v8

    if-lez v9, :cond_6

    sget v9, Lg1/j4;->a:F

    check-cast v0, La3/p0;

    invoke-virtual {v0, v9}, La3/p0;->q0(F)F

    move-result v9

    iget-object v10, v0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v11

    invoke-interface {v5, v11}, Ll0/k1;->b(Ly3/m;)F

    move-result v5

    invoke-virtual {v0, v5}, La3/p0;->q0(F)F

    move-result v5

    sub-float/2addr v5, v9

    add-float/2addr v7, v5

    const/4 v11, 0x2

    int-to-float v11, v11

    mul-float/2addr v9, v11

    add-float/2addr v9, v7

    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v7

    sget-object v12, Lg1/i4;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v12, v7

    const/4 v13, 0x1

    if-ne v7, v13, :cond_2

    invoke-interface {v10}, Lk2/e;->d()J

    move-result-wide v14

    shr-long/2addr v14, v6

    long-to-int v7, v14

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float/2addr v7, v9

    :goto_0
    move v15, v7

    goto :goto_1

    :cond_2
    cmpg-float v7, v5, v8

    if-gez v7, :cond_3

    move v7, v8

    goto :goto_0

    :cond_3
    move v7, v5

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v12, v7

    if-ne v7, v13, :cond_5

    invoke-interface {v10}, Lk2/e;->d()J

    move-result-wide v9

    shr-long v6, v9, v6

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpg-float v7, v5, v8

    if-gez v7, :cond_4

    goto :goto_2

    :cond_4
    move v8, v5

    :goto_2
    sub-float v9, v6, v8

    :cond_5
    move/from16 v17, v9

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    neg-float v4, v3

    div-float v16, v4, v11

    div-float v18, v3, v11

    invoke-virtual {v0}, La3/p0;->t0()La3/p;

    move-result-object v3

    invoke-virtual {v3}, La3/p;->A()J

    move-result-wide v4

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v6

    invoke-interface {v6}, Li2/v;->q()V

    :try_start_0
    iget-object v6, v3, La3/p;->x:Ljava/lang/Object;

    move-object v14, v6

    check-cast v14, Laj/d;

    const/16 v19, 0x0

    invoke-virtual/range {v14 .. v19}, Laj/d;->d(FFFFI)V

    invoke-virtual {v0}, La3/p0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    throw v0

    :cond_6
    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    :goto_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
