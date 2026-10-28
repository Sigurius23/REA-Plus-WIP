.class public final synthetic Lq0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq0/y;


# direct methods
.method public synthetic constructor <init>(Lq0/y;I)V
    .locals 0

    iput p2, p0, Lq0/u;->w:I

    iput-object p1, p0, Lq0/u;->x:Lq0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lq0/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq0/u;->x:Lq0/y;

    check-cast p1, Lp0/i0;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v3

    :try_start_0
    iget v0, v0, Lq0/y;->e:I

    invoke-virtual {p1, v0}, Lp0/i0;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lq0/u;->x:Lq0/y;

    invoke-static {v1}, Le4/a;->t(Lq0/y;)J

    move-result-wide v2

    iget v4, v1, Lq0/y;->i:F

    add-float/2addr v4, v0

    float-to-double v5, v4

    invoke-static {v5, v6}, Le93/b;->Y(D)J

    move-result-wide v5

    long-to-float v7, v5

    sub-float/2addr v4, v7

    iput v4, v1, Lq0/y;->i:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v7, 0x38d1b717    # 1.0E-4f

    cmpg-float v4, v4, v7

    if-gez v4, :cond_1

    goto/16 :goto_6

    :cond_1
    add-long v7, v2, v5

    iget-wide v9, v1, Lq0/y;->h:J

    iget-wide v11, v1, Lq0/y;->g:J

    invoke-static/range {v7 .. v12}, Le93/b;->p(JJJ)J

    move-result-wide v4

    cmp-long v0, v7, v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_2

    move v0, v7

    goto :goto_1

    :cond_2
    move v0, v6

    :goto_1
    sub-long/2addr v4, v2

    long-to-float v2, v4

    iput v2, v1, Lq0/y;->j:F

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v3, v8, v10

    const/4 v8, 0x0

    if-eqz v3, :cond_5

    iget-object v3, v1, Lq0/y;->H:Lp1/k1;

    cmpl-float v9, v2, v8

    if-lez v9, :cond_3

    move v9, v7

    goto :goto_2

    :cond_3
    move v9, v6

    :goto_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v3, v9}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v3, v1, Lq0/y;->I:Lp1/k1;

    cmpg-float v2, v2, v8

    if-gez v2, :cond_4

    move v6, v7

    :cond_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_5
    iget-object v2, v1, Lq0/y;->p:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq0/q;

    long-to-int v3, v4

    neg-int v6, v3

    invoke-virtual {v2, v6}, Lq0/q;->d(I)Lq0/q;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v9, v1, Lq0/y;->b:Lq0/q;

    if-eqz v9, :cond_7

    invoke-virtual {v9, v6}, Lq0/q;->d(I)Lq0/q;

    move-result-object v6

    if-eqz v6, :cond_6

    iput-object v6, v1, Lq0/y;->b:Lq0/q;

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    iget-boolean v3, v1, Lq0/y;->a:Z

    invoke-virtual {v1, v2, v3, v7}, Lq0/y;->h(Lq0/q;ZZ)V

    iget-object v1, v1, Lq0/y;->D:Lp1/c1;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    iget-object v2, v1, Lq0/y;->d:Ll9/o;

    iget-object v6, v2, Ll9/o;->b:Ljava/lang/Object;

    check-cast v6, Lq0/y;

    iget-object v2, v2, Ll9/o;->d:Ljava/lang/Object;

    check-cast v2, Lp1/g1;

    invoke-virtual {v6}, Lq0/y;->o()I

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    :cond_9
    int-to-float v3, v3

    invoke-virtual {v6}, Lq0/y;->o()I

    move-result v6

    int-to-float v6, v6

    div-float v8, v3, v6

    :goto_4
    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v3

    add-float/2addr v3, v8

    invoke-virtual {v2, v3}, Lp1/g1;->y(F)V

    iget-object v1, v1, Lq0/y;->z:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La3/n0;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, La3/n0;->m()V

    :cond_a
    :goto_5
    if-eqz v0, :cond_b

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :cond_b
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v0

    :goto_6
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
