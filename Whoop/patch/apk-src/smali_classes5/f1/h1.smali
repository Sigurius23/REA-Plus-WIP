.class public final synthetic Lf1/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/s1;


# direct methods
.method public synthetic constructor <init>(Lf1/s1;I)V
    .locals 0

    iput p2, p0, Lf1/h1;->w:I

    iput-object p1, p0, Lf1/h1;->x:Lf1/s1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lf1/h1;->w:I

    iget-object v2, v0, Lf1/h1;->x:Lf1/s1;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lh2/b;

    invoke-virtual {v2}, Lf1/s1;->q()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lp1/i0;

    new-instance v1, Lb1/e;

    const/16 v3, 0xc

    invoke-direct {v1, v2, v3}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ly2/y;

    iget-object v3, v2, Lf1/s1;->d:Lu0/s0;

    if-eqz v3, :cond_7

    iget-boolean v5, v3, Lu0/s0;->p:Z

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_7

    iget-object v5, v2, Lf1/s1;->b:Lq3/r;

    invoke-virtual {v2}, Lf1/s1;->m()Lq3/y;

    move-result-object v6

    iget-wide v6, v6, Lq3/y;->b:J

    sget v8, Ll3/u0;->c:I

    const/16 v8, 0x20

    shr-long/2addr v6, v8

    long-to-int v6, v6

    invoke-interface {v5, v6}, Lq3/r;->x(I)I

    move-result v5

    iget-object v6, v2, Lf1/s1;->b:Lq3/r;

    invoke-virtual {v2}, Lf1/s1;->m()Lq3/y;

    move-result-object v7

    iget-wide v9, v7, Lq3/y;->b:J

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    long-to-int v7, v9

    invoke-interface {v6, v7}, Lq3/r;->x(I)I

    move-result v6

    iget-object v7, v2, Lf1/s1;->d:Lu0/s0;

    const-wide/16 v9, 0x0

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lu0/s0;->c()Ly2/y;

    move-result-object v7

    if-eqz v7, :cond_1

    const/4 v13, 0x1

    invoke-virtual {v2, v13}, Lf1/s1;->k(Z)J

    move-result-wide v13

    invoke-interface {v7, v13, v14}, Ly2/y;->Z(J)J

    move-result-wide v13

    goto :goto_1

    :cond_1
    move-wide v13, v9

    :goto_1
    iget-object v7, v2, Lf1/s1;->d:Lu0/s0;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lu0/s0;->c()Ly2/y;

    move-result-object v7

    if-eqz v7, :cond_2

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Lf1/s1;->k(Z)J

    move-result-wide v9

    invoke-interface {v7, v9, v10}, Ly2/y;->Z(J)J

    move-result-wide v9

    :cond_2
    iget-object v7, v2, Lf1/s1;->d:Lu0/s0;

    const/4 v15, 0x0

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lu0/s0;->c()Ly2/y;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v3}, Lu0/s0;->d()Lu0/p1;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v4, v4, Lu0/p1;->a:Ll3/r0;

    invoke-virtual {v4, v5}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v4

    iget v4, v4, Lh2/c;->b:F

    goto :goto_2

    :cond_3
    move v4, v15

    :goto_2
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    move/from16 v16, v8

    move-wide/from16 v17, v9

    int-to-long v8, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long v8, v8, v16

    and-long/2addr v4, v11

    or-long/2addr v4, v8

    invoke-interface {v7, v4, v5}, Ly2/y;->Z(J)J

    move-result-wide v4

    and-long/2addr v4, v11

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    goto :goto_3

    :cond_4
    move/from16 v16, v8

    move-wide/from16 v17, v9

    move v4, v15

    :goto_3
    iget-object v5, v2, Lf1/s1;->d:Lu0/s0;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lu0/s0;->c()Ly2/y;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v3}, Lu0/s0;->d()Lu0/p1;

    move-result-object v7

    if-eqz v7, :cond_5

    iget-object v7, v7, Lu0/p1;->a:Ll3/r0;

    invoke-virtual {v7, v6}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v6

    iget v6, v6, Lh2/c;->b:F

    goto :goto_4

    :cond_5
    move v6, v15

    :goto_4
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v9, v6

    shl-long v6, v7, v16

    and-long v8, v9, v11

    or-long/2addr v6, v8

    invoke-interface {v5, v6, v7}, Ly2/y;->Z(J)J

    move-result-wide v5

    and-long/2addr v5, v11

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v15

    :cond_6
    shr-long v5, v13, v16

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    shr-long v7, v17, v16

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-static {v4, v15}, Ljava/lang/Math;->min(FF)F

    move-result v4

    and-long v7, v13, v11

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    and-long v8, v17, v11

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/16 v8, 0x19

    int-to-float v8, v8

    iget-object v3, v3, Lu0/s0;->a:Lu0/c1;

    iget-object v3, v3, Lu0/c1;->g:Ly3/c;

    invoke-interface {v3}, Ly3/c;->getDensity()F

    move-result v3

    mul-float/2addr v3, v8

    add-float/2addr v3, v7

    new-instance v7, Lh2/c;

    invoke-direct {v7, v6, v4, v5, v3}, Lh2/c;-><init>(FFFF)V

    goto :goto_5

    :cond_7
    sget-object v7, Lh2/c;->e:Lh2/c;

    :goto_5
    iget-object v2, v2, Lf1/s1;->d:Lu0/s0;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lu0/s0;->c()Ly2/y;

    move-result-object v4

    goto :goto_6

    :cond_8
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_9

    invoke-static {v7, v4, v1}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->d(Lh2/c;Ly2/y;Ly2/y;)Lh2/c;

    move-result-object v1

    return-object v1

    :cond_9
    const-string v1, "Required value was null."

    invoke-static {v1}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
