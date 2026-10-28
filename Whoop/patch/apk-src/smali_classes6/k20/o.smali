.class public final Lk20/o;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lk20/o;->w:I

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk20/o;->x:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ln83/c;Ljava/util/List;Z)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lk20/o;->w:I

    const-string v0, "visiblePaymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenPaymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x3e

    .line 5
    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "visible_payment_methods"

    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, ","

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "hidden_payment_methods"

    invoke-virtual {v0, p2, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    .line 7
    const-string p1, "vertical"

    goto :goto_0

    :cond_0
    const-string p1, "horizontal"

    :goto_0
    const-string p2, "payment_method_layout"

    invoke-virtual {v0, p2, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    .line 9
    iput-object p1, p0, Lk20/o;->x:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Lq20/y;Ljava/util/ArrayList;Lkotlin/time/Duration;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Lk20/o;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    if-eqz p3, :cond_0

    .line 12
    invoke-virtual {p3}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v1

    .line 13
    sget-object p3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v2, p3}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v1

    double-to-float p3, v1

    .line 14
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-string v1, "duration"

    invoke-virtual {v0, v1, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    instance-of p3, p1, Lq20/j;

    if-eqz p3, :cond_1

    .line 16
    const-string p1, "google_pay"

    goto :goto_1

    .line 17
    :cond_1
    instance-of p3, p1, Lq20/m;

    if-eqz p3, :cond_2

    .line 18
    const-string p1, "link"

    goto :goto_1

    .line 19
    :cond_2
    instance-of p3, p1, Lq20/w;

    if-eqz p3, :cond_4

    check-cast p1, Lq20/w;

    .line 20
    iget-object p1, p1, Lq20/w;->x:Ly00/o4;

    .line 21
    iget-object p1, p1, Ly00/o4;->E:Ly00/f4;

    if-eqz p1, :cond_3

    iget-object p1, p1, Ly00/f4;->w:Ljava/lang/String;

    if-nez p1, :cond_5

    .line 22
    :cond_3
    const-string p1, "saved"

    goto :goto_1

    :cond_4
    const-string p1, "none"

    .line 23
    :cond_5
    :goto_1
    const-string p3, "selected_lpm"

    invoke-virtual {v0, p3, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    .line 24
    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "ordered_lpms"

    invoke-virtual {v0, p2, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    .line 26
    iput-object p1, p0, Lk20/o;->x:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ly00/i;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lk20/o;->w:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    if-eqz p1, :cond_0

    .line 29
    const-string v1, "selected_card_brand"

    .line 30
    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    .line 31
    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_0
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    .line 33
    iput-object p1, p0, Lk20/o;->x:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lk20/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk20/o;->x:Ljava/io/Serializable;

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const-string v1, "init"

    invoke-static {v0, v1}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "mc_update_card"

    return-object v0

    :pswitch_1
    const-string v0, "mc_load_succeeded"

    return-object v0

    :pswitch_2
    const-string v0, "mc_initial_displayed_payment_methods"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lk20/o;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lk20/t;->getParams()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk20/o;->x:Ljava/io/Serializable;

    check-cast v0, Ln83/f;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lk20/o;->x:Ljava/io/Serializable;

    check-cast v0, Ln83/f;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lk20/o;->x:Ljava/io/Serializable;

    check-cast v0, Ln83/f;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
