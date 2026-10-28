.class public final Lcy/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcy/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu00/e;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lcy/b;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcy/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lbz/a;->b:Lbz/a;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_2
    const-string v0, "PaymentSheet"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0

    :pswitch_3
    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->x:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object v0

    :pswitch_4
    new-instance v0, Ll20/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_7
    sget-object v0, Lbz/a;->b:Lbz/a;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_8
    const-string v0, "PaymentElement.Autocomplete"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0

    :pswitch_9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_a
    new-instance v0, Ln40/g;

    invoke-direct {v0}, Ln40/g;-><init>()V

    return-object v0

    :pswitch_b
    const-string v0, "PaymentSheet.FlowController"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0

    :pswitch_c
    sget-object v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->y:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object v0

    :pswitch_d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_e
    new-instance v0, Ll20/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_f
    new-instance v0, Ll20/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lw20/a0;->b:Lw20/a0;

    new-instance v2, Lj10/a;

    invoke-direct {v2, v0, v1}, Lj10/a;-><init>(Ll20/a;Lw20/a0;)V

    return-object v2

    :pswitch_10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_11
    new-instance v0, Lg10/a;

    sget-object v1, Lv20/v;->a:Lv20/v;

    invoke-direct {v0, v1}, Lg10/a;-><init>(Lv20/v;)V

    return-object v0

    :pswitch_12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_13
    const-string v0, "CustomerSheet"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0

    :pswitch_14
    sget-object v0, Lfz/b;->d:Lcy/b;

    invoke-virtual {v0}, Lcy/b;->get()Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lqy/e;->a:Lqy/d;

    goto :goto_0

    :cond_0
    sget-object v0, Lqy/e;->b:Lqy/d;

    :goto_0
    return-object v0

    :pswitch_15
    sget-object v0, Lbz/a;->b:Lbz/a;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_16
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_17
    new-instance v0, Lq30/p0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_18
    sget-object v0, Lux/t;->b:Lux/t;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_19
    sget-object v0, Lbz/a;->b:Lbz/a;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_1a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1b
    sget-object v0, Lbz/a;->b:Lbz/a;

    invoke-static {v0}, Ls93/k;->c(Ljava/lang/Object;)V

    return-object v0

    :pswitch_1c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
