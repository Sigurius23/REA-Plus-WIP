.class public final synthetic Li0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lkotlin/jvm/internal/d0;

.field public final synthetic z:Lh0/k2;


# direct methods
.method public synthetic constructor <init>(FLkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p5, p0, Li0/h;->w:I

    iput p1, p0, Li0/h;->x:F

    iput-object p2, p0, Li0/h;->y:Lkotlin/jvm/internal/d0;

    iput-object p3, p0, Li0/h;->z:Lh0/k2;

    iput-object p4, p0, Li0/h;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Li0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li0/h;->z:Lh0/k2;

    check-cast p1, Ld0/k;

    iget-object v1, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v2, p0, Li0/h;->x:F

    invoke-static {v1, v2}, Li0/k;->d(FF)F

    move-result v1

    iget-object v2, p0, Li0/h;->y:Lkotlin/jvm/internal/d0;

    iget v3, v2, Lkotlin/jvm/internal/d0;->w:F

    sub-float v3, v1, v3

    :try_start_0
    invoke-interface {v0, v3}, Lh0/k2;->a(F)F

    move-result v0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, Ld0/k;->a()V

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iget-object v5, p0, Li0/h;->E:Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v4, 0x3f000000    # 0.5f

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_0

    iget-object v3, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpg-float v1, v1, v3

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ld0/k;->a()V

    :goto_1
    iget p1, v2, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr p1, v0

    iput p1, v2, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ld0/k;

    iget-object v0, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v2, p0, Li0/h;->x:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v1, v1, v3

    iget-object v3, p0, Li0/h;->y:Lkotlin/jvm/internal/d0;

    iget-object v4, p0, Li0/h;->z:Lh0/k2;

    iget-object v5, p0, Li0/h;->E:Lkotlin/jvm/functions/Function1;

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0, v2}, Li0/k;->d(FF)F

    move-result v0

    iget v1, v3, Lkotlin/jvm/internal/d0;->w:F

    sub-float v1, v0, v1

    invoke-static {p1, v4, v5, v1}, Li0/k;->c(Ld0/k;Lh0/k2;Lkotlin/jvm/functions/Function1;F)V

    invoke-virtual {p1}, Ld0/k;->a()V

    iput v0, v3, Lkotlin/jvm/internal/d0;->w:F

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v2, v3, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v1, v2

    invoke-static {p1, v4, v5, v1}, Li0/k;->c(Ld0/k;Lh0/k2;Lkotlin/jvm/functions/Function1;F)V

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v3, Lkotlin/jvm/internal/d0;->w:F

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
