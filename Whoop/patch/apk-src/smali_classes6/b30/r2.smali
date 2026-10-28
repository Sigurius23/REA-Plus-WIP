.class public final synthetic Lb30/r2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ll1/k4;Ld0/v1;Lp1/c1;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput p1, p0, Lb30/r2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb30/r2;->x:Lp1/t2;

    iput-object p3, p0, Lb30/r2;->y:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lb30/r2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/r2;->y:Lp1/c1;

    iput-object p2, p0, Lb30/r2;->x:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/r2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh2/e;

    iget-object v0, p0, Lb30/r2;->x:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-wide v1, p1, Lh2/e;->a:J

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    mul-float/2addr v1, v0

    iget-wide v4, p1, Lh2/e;->a:J

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int p1, v4

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    mul-float/2addr p1, v0

    iget-object v0, p0, Lb30/r2;->y:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/e;

    iget-wide v4, v2, Lh2/e;->a:J

    shr-long/2addr v4, v3

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v2, v2, v1

    if-nez v2, :cond_0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/e;

    iget-wide v4, v2, Lh2/e;->a:J

    and-long/2addr v4, v6

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v2, v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v4, p1

    shl-long/2addr v1, v3

    and-long v3, v4, v6

    or-long/2addr v1, v3

    new-instance p1, Lh2/e;

    invoke-direct {p1, v1, v2}, Lh2/e;-><init>(J)V

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lm20/a;

    const-string v0, "$this$AndroidViewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb30/r2;->y:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lb30/r2;->x:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb30/p3;

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->d(Lb30/p3;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
