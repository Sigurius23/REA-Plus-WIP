.class public final synthetic Lc51/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(FLp1/c1;I)V
    .locals 0

    iput p3, p0, Lc51/a;->w:I

    iput p1, p0, Lc51/a;->x:F

    iput-object p2, p0, Lc51/a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lc51/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh2/e;

    iget-wide v0, p1, Lh2/e;->a:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget v1, p0, Lc51/a;->x:F

    mul-float/2addr v0, v1

    iget-wide v3, p1, Lh2/e;->a:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p1, v3

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    mul-float/2addr p1, v1

    iget-object v1, p0, Lc51/a;->y:Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/e;

    iget-wide v3, v3, Lh2/e;->a:J

    shr-long/2addr v3, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    cmpg-float v3, v3, v0

    if-nez v3, :cond_0

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/e;

    iget-wide v3, v3, Lh2/e;->a:J

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    cmpg-float v3, v3, p1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v7, p1

    shl-long v2, v3, v2

    and-long v4, v7, v5

    or-long/2addr v2, v4

    new-instance p1, Lh2/e;

    invoke-direct {p1, v2, v3}, Lh2/e;-><init>(J)V

    invoke-interface {v1, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget p1, p0, Lc51/a;->x:F

    iget-object v2, p0, Lc51/a;->y:Lp1/c1;

    invoke-static {p1, v2, v0, v1}, Lc51/c;->f(FLp1/c1;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
