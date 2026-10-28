.class public final Lk20/s;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;

.field public final y:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk20/s;->w:I

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-string v0, "paymentoption_removed"

    invoke-static {p1, v0}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/s;->x:Ljava/lang/String;

    .line 28
    const-string p1, "selected_lpm"

    .line 29
    invoke-static {p1, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 30
    iput-object p1, p0, Lk20/s;->y:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lk20/r;Lkotlin/time/Duration;Lq20/y;Ln10/c0;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lk20/s;->w:I

    .line 1
    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSelection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->z:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const-string v1, "payment_"

    if-ne p1, v0, :cond_0

    .line 4
    invoke-interface {p2}, Lk20/r;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p4}, Lg73/a;->o(Lq20/y;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Lk20/r;->e()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    :goto_0
    iput-object p1, p0, Lk20/s;->x:Ljava/lang/String;

    .line 7
    new-instance p1, Ln83/f;

    invoke-direct {p1}, Ln83/f;-><init>()V

    if-eqz p3, :cond_1

    .line 8
    invoke-virtual {p3}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    .line 9
    sget-object p3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p3}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p3, v0

    .line 10
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    const-string v0, "duration"

    invoke-virtual {p1, v0, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p5, :cond_2

    .line 11
    const-string p3, "deferred_intent_confirmation_type"

    .line 12
    iget-object p5, p5, Ln10/c0;->w:Ljava/lang/String;

    .line 13
    invoke-virtual {p1, p3, p5}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p6, :cond_3

    .line 14
    const-string p3, "intent_id"

    invoke-virtual {p1, p3, p6}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_3
    instance-of p3, p2, Lk20/p;

    if-eqz p3, :cond_4

    .line 16
    check-cast p2, Lk20/p;

    iget-object p2, p2, Lk20/p;->a:Lk20/h;

    invoke-virtual {p2}, Lk20/h;->a()Ljava/lang/String;

    move-result-object p3

    const-string p5, "error_message"

    invoke-virtual {p1, p5, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-virtual {p2}, Lk20/h;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 18
    const-string p3, "error_code"

    invoke-virtual {p1, p3, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_4
    const-string p2, "selected_lpm"

    invoke-static {p4}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-static {p4}, Lk20/u;->b(Lq20/y;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 21
    const-string p3, "link_context"

    invoke-virtual {p1, p3, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_5
    invoke-static {p4}, Ls2/e;->I(Lq20/y;)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 23
    const-string p3, "set_as_default"

    invoke-virtual {p1, p3, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_6
    invoke-virtual {p1}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    .line 25
    iput-object p1, p0, Lk20/s;->y:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk20/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk20/s;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk20/s;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lk20/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk20/s;->y:Ljava/util/Map;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk20/s;->y:Ljava/util/Map;

    check-cast v0, Ln83/f;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
