.class public final synthetic Lg1/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lg1/s0;

.field public final synthetic x:F

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lg1/s0;FZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/i2;->w:Lg1/s0;

    iput p2, p0, Lg1/i2;->x:F

    iput-boolean p3, p0, Lg1/i2;->y:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    int-to-float p1, p1

    new-instance v0, Lg1/k3;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v2, Lg1/t0;->w:Lg1/t0;

    iget v3, p0, Lg1/i2;->x:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v4, v3

    cmpl-float v5, p1, v4

    if-gtz v5, :cond_0

    iget-boolean v5, p0, Lg1/i2;->y:Z

    if-eqz v5, :cond_1

    :cond_0
    sget-object v5, Lg1/t0;->x:Lg1/t0;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 v4, 0x0

    cmpl-float v5, p1, v4

    if-lez v5, :cond_2

    sget-object v5, Lg1/t0;->y:Lg1/t0;

    sub-float/2addr v3, p1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v1, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-direct {v0, v1}, Lg1/k3;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lg1/i2;->w:Lg1/s0;

    iget-object v3, p1, Lg1/s0;->a:Lg1/a0;

    iget-object p1, p1, Lg1/s0;->a:Lg1/a0;

    invoke-virtual {v3}, Lg1/a0;->e()Lg1/k3;

    move-result-object v3

    iget-object v3, v3, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_0

    :cond_3
    iget-object v3, p1, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/t0;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v1, p1, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lg1/t0;

    goto :goto_3

    :cond_4
    :goto_0
    iget-object v3, p1, Lg1/a0;->h:Lp1/f0;

    invoke-virtual {v3}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/t0;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_8

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_1
    sget-object v3, Lg1/t0;->x:Lg1/t0;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    :goto_2
    move-object v2, v3

    goto :goto_3

    :cond_7
    sget-object v3, Lg1/t0;->y:Lg1/t0;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_2

    :cond_8
    :goto_3
    invoke-virtual {p1, v0, v2}, Lg1/a0;->k(Lg1/k3;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
