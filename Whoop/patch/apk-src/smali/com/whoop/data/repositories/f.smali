.class public final synthetic Lcom/whoop/data/repositories/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/data/repositories/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lcom/whoop/data/repositories/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->l(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->x(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->s(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->f(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->b(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->r(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->v(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->k(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->m(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ld0/n;

    iget p1, p1, Ld0/n;->a:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ld0/q;

    new-instance v0, Lh2/c;

    iget v1, p1, Ld0/q;->a:F

    iget v2, p1, Ld0/q;->b:F

    iget v3, p1, Ld0/q;->c:F

    iget p1, p1, Ld0/q;->d:F

    invoke-direct {v0, v1, v2, v3, p1}, Lh2/c;-><init>(FFFF)V

    return-object v0

    :pswitch_a
    check-cast p1, Lh2/c;

    new-instance v0, Ld0/q;

    iget v1, p1, Lh2/c;->a:F

    iget v2, p1, Lh2/c;->b:F

    iget v3, p1, Lh2/c;->c:F

    iget p1, p1, Lh2/c;->d:F

    invoke-direct {v0, v1, v2, v3, p1}, Ld0/q;-><init>(FFFF)V

    return-object v0

    :pswitch_b
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    move v0, v1

    :cond_0
    iget p1, p1, Ld0/o;->b:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    move v1, p1

    :goto_0
    int-to-long v2, v0

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    int-to-long v0, v1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_c
    check-cast p1, Ly3/l;

    new-instance v0, Ld0/o;

    iget-wide v1, p1, Ly3/l;->a:J

    const/16 p1, 0x20

    shr-long v3, v1, p1

    long-to-int p1, v3

    int-to-float p1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-direct {v0, p1, v1}, Ld0/o;-><init>(FF)V

    return-object v0

    :pswitch_d
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget p1, p1, Ld0/o;->b:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_e
    check-cast p1, Ly3/j;

    new-instance v0, Ld0/o;

    iget-wide v1, p1, Ly3/j;->a:J

    const/16 p1, 0x20

    shr-long v3, v1, p1

    long-to-int p1, v3

    int-to-float p1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-direct {v0, p1, v1}, Ld0/o;-><init>(FF)V

    return-object v0

    :pswitch_f
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    iget p1, p1, Ld0/o;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Lh2/b;

    invoke-direct {p1, v0, v1}, Lh2/b;-><init>(J)V

    return-object p1

    :pswitch_10
    check-cast p1, Lh2/b;

    new-instance v0, Ld0/o;

    iget-wide v1, p1, Lh2/b;->a:J

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v2, p1, Lh2/b;->a:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ld0/o;-><init>(FF)V

    return-object v0

    :pswitch_11
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    iget p1, p1, Ld0/o;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Lh2/e;

    invoke-direct {p1, v0, v1}, Lh2/e;-><init>(J)V

    return-object p1

    :pswitch_12
    check-cast p1, Lh2/e;

    new-instance v0, Ld0/o;

    iget-wide v1, p1, Lh2/e;->a:J

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v2, p1, Lh2/e;->a:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ld0/o;-><init>(FF)V

    return-object v0

    :pswitch_13
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    iget p1, p1, Ld0/o;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/g;

    invoke-direct {p1, v0, v1}, Ly3/g;-><init>(J)V

    return-object p1

    :pswitch_14
    check-cast p1, Ly3/g;

    new-instance v0, Ld0/o;

    iget-wide v1, p1, Ly3/g;->a:J

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v2, p1, Ly3/g;->a:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ld0/o;-><init>(FF)V

    return-object v0

    :pswitch_15
    check-cast p1, Ld0/n;

    iget p1, p1, Ld0/n;->a:F

    new-instance v0, Ly3/f;

    invoke-direct {v0, p1}, Ly3/f;-><init>(F)V

    return-object v0

    :pswitch_16
    check-cast p1, Ly3/f;

    new-instance v0, Ld0/n;

    iget p1, p1, Ly3/f;->w:F

    invoke-direct {v0, p1}, Ld0/n;-><init>(F)V

    return-object v0

    :pswitch_17
    check-cast p1, Ld0/n;

    iget p1, p1, Ld0/n;->a:F

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Ld0/n;

    int-to-float p1, p1

    invoke-direct {v0, p1}, Ld0/n;-><init>(F)V

    return-object v0

    :pswitch_19
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    new-instance v0, Ld0/n;

    invoke-direct {v0, p1}, Ld0/n;-><init>(F)V

    return-object v0

    :pswitch_1a
    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    check-cast p1, Ld0/f1;

    iget-wide v0, p1, Ld0/f1;->G:J

    sget-object v2, Ld0/d2;->b:Ljava/lang/Object;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz1/v;

    sget-object v3, Ld0/d2;->a:Lcom/whoop/data/repositories/f;

    iget-object v4, p1, Ld0/f1;->H:La6/l0;

    invoke-virtual {v2, v4, v3, p1}, Lz1/v;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    iget-wide v2, p1, Ld0/f1;->G:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    iget-object v0, p1, Ld0/f1;->O:Ld0/y0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ld0/y0;->e()J

    move-result-wide v1

    iget-wide v3, p1, Ld0/f1;->G:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    invoke-virtual {p1}, Ld0/f1;->M0()V

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v3, v4}, Ld0/y0;->k(J)V

    invoke-virtual {v0}, Ld0/y0;->a()Ld0/g2;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ld0/y0;->f()Ld0/n;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ld0/n;->a(I)F

    move-result v1

    float-to-double v1, v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v1

    iget-wide v1, p1, Ld0/f1;->G:J

    long-to-double v1, v1

    mul-double/2addr v3, v1

    invoke-static {v3, v4}, Le93/b;->Y(D)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld0/y0;->i(J)V

    goto :goto_1

    :cond_3
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ld0/f1;->P0()V

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1c
    check-cast p1, Ltd1/e;

    invoke-static {p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->i(Ltd1/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

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
