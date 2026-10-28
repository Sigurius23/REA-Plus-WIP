.class public final synthetic Lut2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lut2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lut2/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaSize;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Lv30/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_2
    sget-object v0, Lv30/c;->a:Lp1/b0;

    sget-object v0, Lv30/l;->a:Lv30/l;

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/GetPaymentMethodMenuItemResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    sget v0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->x:I

    new-instance v0, Llz/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llz/b;-><init>(I)V

    return-object v0

    :pswitch_8
    sget-object v0, Lv00/d0;->a:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lv00/b0;

    invoke-interface {v3}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v3

    iget-object v3, v3, Ly00/f4;->w:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v2

    :pswitch_9
    invoke-static {}, Lcom/whoop/whooplive/selfie/SelfieActivity;->X()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lux2/a;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Luw0/q;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Luw0/f;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Luw0/f;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Luw0/f;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/membership/domain/upcycle/models/Cta;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Luu2/w;->q()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Luu2/w;->k()Lqi0/a;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Luu2/f;->a()Luu2/e;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/TrackingStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItemStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryItem;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    nop

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
