.class public final synthetic Lg1/q5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Li93/e;

.field public final synthetic w:Li93/f;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:F

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Li93/f;Lkotlin/jvm/functions/Function1;FLp1/c1;Li93/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/q5;->w:Li93/f;

    iput-object p2, p0, Lg1/q5;->x:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lg1/q5;->y:F

    iput-object p4, p0, Lg1/q5;->z:Lp1/c1;

    iput-object p5, p0, Lg1/q5;->E:Li93/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lg1/q5;->w:Li93/f;

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sub-float/2addr v1, v0

    const/16 v0, 0x3e8

    int-to-float v0, v0

    div-float/2addr v1, v0

    iget v0, p0, Lg1/q5;->y:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget-object v2, p0, Lg1/q5;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v2, p0, Lg1/q5;->z:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    sub-float v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v1, v3, v1

    if-lez v1, :cond_0

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    iget-object v3, p0, Lg1/q5;->E:Li93/e;

    invoke-virtual {v3, v1}, Li93/e;->c(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v2, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
