.class public final synthetic Ll1/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(FJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ll1/m1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll1/m1;->y:F

    iput-wide p2, p0, Ll1/m1;->x:J

    return-void
.end method

.method public synthetic constructor <init>(JFI)V
    .locals 0

    .line 2
    iput p4, p0, Ll1/m1;->w:I

    iput-wide p1, p0, Ll1/m1;->x:J

    iput p3, p0, Ll1/m1;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Ll1/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ll1/m1;->y:F

    check-cast p1, Lk2/e;

    iget-wide v1, p0, Ll1/m1;->x:J

    invoke-static {v1, v2, v0, p1}, Ly11/n;->b(JFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Ll1/m1;->y:F

    check-cast p1, Lk2/e;

    iget-wide v1, p0, Ll1/m1;->x:J

    invoke-static {v1, v2, v0, p1}, Lpx0/c;->h(JFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v0, p1

    check-cast v0, Lk2/e;

    iget p1, p0, Ll1/m1;->y:F

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result v7

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    const/16 v1, 0x20

    shl-long/2addr v3, v1

    const-wide v8, 0xffffffffL

    and-long/2addr v5, v8

    or-long/2addr v3, v5

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v1

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result p1

    div-float/2addr p1, v2

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v10, p1

    shl-long v1, v5, v1

    and-long v5, v10, v8

    or-long/2addr v5, v1

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    iget-wide v1, p0, Ll1/m1;->x:J

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
