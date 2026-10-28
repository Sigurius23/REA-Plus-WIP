.class public final synthetic Lg1/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic F:Lp1/t2;

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:Lp1/t2;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(JJLd0/j0;Ld0/j0;Ld0/j0;Ld0/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/n4;->w:J

    iput-wide p3, p0, Lg1/n4;->x:J

    iput-object p5, p0, Lg1/n4;->y:Lp1/t2;

    iput-object p6, p0, Lg1/n4;->z:Lp1/t2;

    iput-object p7, p0, Lg1/n4;->E:Lp1/t2;

    iput-object p8, p0, Lg1/n4;->F:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v5, p1

    check-cast v5, Lk2/e;

    invoke-interface {v5}, Lk2/e;->d()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    iget-wide v2, p0, Lg1/n4;->w:J

    invoke-static/range {v0 .. v5}, Lg1/v4;->f(FFJFLk2/e;)V

    iget-object p1, p0, Lg1/n4;->y:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Lg1/n4;->z:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    sub-float/2addr v0, v2

    const/4 v6, 0x0

    cmpl-float v0, v0, v6

    iget-wide v2, p0, Lg1/n4;->x:J

    if-lez v0, :cond_0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static/range {v0 .. v5}, Lg1/v4;->f(FFJFLk2/e;)V

    :cond_0
    iget-object p1, p0, Lg1/n4;->E:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Lg1/n4;->F:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v0, v7

    cmpl-float v0, v0, v6

    if-lez v0, :cond_1

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static/range {v0 .. v5}, Lg1/v4;->f(FFJFLk2/e;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
