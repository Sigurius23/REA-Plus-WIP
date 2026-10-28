.class public final synthetic Lgi0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/ToDoubleFunction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgi0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsDouble(Ljava/lang/Object;)D
    .locals 2

    iget v0, p0, Lgi0/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Double;

    invoke-static {p1}, Lgi0/f;->d(Ljava/lang/Double;)D

    move-result-wide v0

    return-wide v0

    :pswitch_0
    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v0

    return-wide v0

    :pswitch_1
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
