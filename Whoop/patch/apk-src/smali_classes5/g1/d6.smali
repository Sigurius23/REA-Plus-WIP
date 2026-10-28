.class public final Lg1/d6;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/t2;

.field public w:I

.field public synthetic x:Lh0/h2;

.field public synthetic y:J

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(ZFLp1/c1;Lp1/t2;Lq83/d;)V
    .locals 0

    iput-boolean p1, p0, Lg1/d6;->z:Z

    iput p2, p0, Lg1/d6;->E:F

    iput-object p3, p0, Lg1/d6;->F:Lp1/c1;

    iput-object p4, p0, Lg1/d6;->G:Lp1/t2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Lh0/h2;

    check-cast p2, Lh2/b;

    iget-wide v0, p2, Lh2/b;->a:J

    move-object v7, p3

    check-cast v7, Lq83/d;

    new-instance v2, Lg1/d6;

    iget-object v5, p0, Lg1/d6;->F:Lp1/c1;

    iget-object v6, p0, Lg1/d6;->G:Lp1/t2;

    iget-boolean v3, p0, Lg1/d6;->z:Z

    iget v4, p0, Lg1/d6;->E:F

    invoke-direct/range {v2 .. v7}, Lg1/d6;-><init>(ZFLp1/c1;Lp1/t2;Lq83/d;)V

    iput-object p1, v2, Lg1/d6;->x:Lh0/h2;

    iput-wide v0, v2, Lg1/d6;->y:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v2, p1}, Lg1/d6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/d6;->w:I

    iget-object v2, p0, Lg1/d6;->F:Lp1/c1;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/gestures/GestureCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/d6;->x:Lh0/h2;

    iget-wide v4, p0, Lg1/d6;->y:J

    iget-boolean v1, p0, Lg1/d6;->z:Z

    const/16 v6, 0x20

    if-eqz v1, :cond_2

    shr-long/2addr v4, v6

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget v4, p0, Lg1/d6;->E:F

    sub-float/2addr v4, v1

    goto :goto_0

    :cond_2
    shr-long/2addr v4, v6

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    :goto_0
    iget-object v1, p0, Lg1/d6;->G:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    sub-float/2addr v4, v1

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v2, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :try_start_1
    iput v3, p0, Lg1/d6;->w:I

    invoke-virtual {p1, p0}, Lh0/h2;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroidx/compose/foundation/gestures/GestureCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_3

    return-object v0

    :catch_0
    new-instance p1, Ljava/lang/Float;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
