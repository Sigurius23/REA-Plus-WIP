.class public final synthetic Lm1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm1/g;


# direct methods
.method public synthetic constructor <init>(Lm1/g;I)V
    .locals 0

    iput p2, p0, Lm1/c;->w:I

    iput-object p1, p0, Lm1/c;->x:Lm1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lm1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm1/c;->x:Lm1/g;

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v1

    iget-object v0, v0, Lm1/g;->h:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :pswitch_0
    iget-object v0, p0, Lm1/c;->x:Lm1/g;

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm1/c;->x:Lm1/g;

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v1

    iget-object v2, v0, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v1

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v2

    iget-object v3, v0, Lm1/g;->i:Lp1/f0;

    invoke-virtual {v3}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v2

    sub-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_1

    const v4, 0x358637bd    # 1.0E-6f

    cmpl-float v3, v3, v4

    if-lez v3, :cond_1

    invoke-virtual {v0}, Lm1/g;->f()F

    move-result v0

    sub-float/2addr v0, v1

    div-float/2addr v0, v2

    cmpg-float v1, v0, v4

    if-gez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v1, 0x3f7fffef    # 0.999999f

    cmpl-float v1, v0, v1

    if-lez v1, :cond_2

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lm1/c;->x:Lm1/g;

    iget-object v1, v0, Lm1/g;->l:Lp1/k1;

    iget-object v2, v0, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v1, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v3

    cmpg-float v4, v3, v1

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    if-gez v4, :cond_5

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lm1/b0;->b(FZ)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lm1/b0;->b(FZ)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    :goto_1
    move-object v1, v2

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    :cond_7
    :goto_2
    return-object v1

    :pswitch_3
    iget-object v0, p0, Lm1/c;->x:Lm1/g;

    iget-object v1, v0, Lm1/g;->l:Lp1/k1;

    iget-object v2, v0, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_9

    iget-object v1, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lm1/g;->c(FFLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    :cond_9
    :goto_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
