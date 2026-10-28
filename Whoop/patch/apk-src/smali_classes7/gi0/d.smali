.class public final synthetic Lgi0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgi0/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lgi0/d;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Double;

    invoke-static {p1}, Lgi0/f;->e(Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-static {p1}, Lgi0/f;->f(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-static {p1}, Lgi0/f;->a(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lgi0/f;->c(Ljava/util/List;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
