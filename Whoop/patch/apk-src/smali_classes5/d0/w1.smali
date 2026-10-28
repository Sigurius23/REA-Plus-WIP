.class public final synthetic Ld0/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld0/w1;->w:I

    iput p1, p0, Ld0/w1;->x:F

    iput-object p2, p0, Ld0/w1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FI)V
    .locals 0

    .line 2
    iput p3, p0, Ld0/w1;->w:I

    iput-object p1, p0, Ld0/w1;->y:Ljava/lang/Object;

    iput p2, p0, Ld0/w1;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ld0/w1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/w1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget v1, p0, Ld0/w1;->x:F

    check-cast p1, Li2/g0;

    invoke-static {v0, v1, p1}, Lzq0/f;->m(Ljava/util/List;FLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ld0/w1;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    iget v1, p0, Ld0/w1;->x:F

    check-cast p1, Leu/g;

    invoke-static {v0, v1, p1}, Lw41/k;->b(Lcom/google/android/gms/maps/model/LatLng;FLeu/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ld0/w1;->y:Ljava/lang/Object;

    check-cast v0, Lg23/a;

    check-cast p1, Landroid/animation/Animator;

    const/4 p1, 0x0

    iget v1, p0, Ld0/w1;->x:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lg23/a;->x:Lm23/a;

    invoke-virtual {p1}, Lm23/a;->invoke()Ljava/lang/Object;

    :goto_0
    iget-object p1, v0, Lg23/a;->w:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ld0/w1;->y:Ljava/lang/Object;

    check-cast v0, Lf0/t;

    check-cast p1, Lk2/c;

    move-object v1, p1

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object p1, v1, La3/p0;->w:Lk2/b;

    iget v2, p0, Ld0/w1;->x:F

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ly3/f;->b(FF)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lk2/b;->getDensity()F

    move-result v4

    mul-float v7, v4, v2

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v8, 0xffffffffL

    and-long/2addr v4, v8

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float v4, v7, v4

    sub-float/2addr v2, v4

    iget-object v0, v0, Lf0/t;->b:Li2/t;

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    const/16 v10, 0x20

    shl-long/2addr v3, v10

    and-long/2addr v5, v8

    or-long/2addr v3, v5

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v10

    long-to-int p1, v5

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v5, p1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v11, p1

    shl-long/2addr v5, v10

    and-long/2addr v8, v11

    or-long/2addr v5, v8

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v10}, Lk2/e;->j(Lk2/e;Li2/t;JJFLi2/t0;FI)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ld0/w1;->y:Ljava/lang/Object;

    check-cast v0, Lf11/e;

    iget v1, p0, Ld0/w1;->x:F

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lf11/d;->b(Lf11/e;FLn0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ld0/w1;->y:Ljava/lang/Object;

    check-cast v0, Ld0/z1;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ld0/z1;->g()Z

    move-result p1

    iget-object v3, v0, Ld0/z1;->g:Lp1/i1;

    if-nez p1, :cond_5

    invoke-virtual {v3}, Lp1/i1;->x()J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long p1, v4, v6

    if-nez p1, :cond_2

    invoke-virtual {v3, v1, v2}, Lp1/i1;->y(J)V

    iget-object p1, v0, Ld0/z1;->a:Lal/a;

    iget-object p1, p1, Lal/a;->x:Ljava/lang/Object;

    check-cast p1, Lp1/k1;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v3}, Lp1/i1;->x()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const/4 p1, 0x0

    iget v3, p0, Ld0/w1;->x:F

    cmpg-float p1, v3, p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    long-to-double v1, v1

    float-to-double v3, v3

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Le93/b;->Y(D)J

    move-result-wide v1

    :goto_2
    invoke-virtual {v0, v1, v2}, Ld0/z1;->n(J)V

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    invoke-virtual {v0, v1, v2, p1}, Ld0/z1;->h(JZ)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
