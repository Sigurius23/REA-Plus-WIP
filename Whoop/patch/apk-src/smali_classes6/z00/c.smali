.class public final Lz00/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# instance fields
.field public final synthetic w:I

.field public final x:Lad3/r;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lz00/c;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lyz1/g;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lyz1/g;-><init>(I)V

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-static {v0, p1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    iput-object p1, p0, Lz00/c;->x:Lad3/r;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lyz1/g;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lyz1/g;-><init>(I)V

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-static {v0, p1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    iput-object p1, p0, Lz00/c;->x:Lad3/r;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final m(Lorg/json/JSONObject;)Lvy/b;
    .locals 12

    iget v0, p0, Lz00/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lz00/b;->a(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerSession;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v1, "link_auth_intent"

    invoke-static {v1, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lz00/c;->x:Lad3/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/stripe/android/model/LinkAuthIntent;->Companion:Lcom/stripe/android/model/a0;

    invoke-virtual {v2}, Lcom/stripe/android/model/a0;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/LinkAuthIntent;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v1, Lcom/stripe/android/model/ConsumerSessionRefresh;

    invoke-direct {v1, v0, p1}, Lcom/stripe/android/model/ConsumerSessionRefresh;-><init>(Lcom/stripe/android/model/ConsumerSession;Lcom/stripe/android/model/LinkAuthIntent;)V

    return-object v1

    :pswitch_0
    const-string v0, "exists"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    move v4, v2

    invoke-static {p1}, Lz00/b;->a(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerSession;

    move-result-object v5

    const-string v0, "error_message"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "publishable_key"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "displayable_payment_details"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    new-instance v2, Lcom/stripe/android/model/DisplayablePaymentDetails;

    const-string v3, "default_card_brand"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "default_payment_type"

    invoke-static {v8, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "last_4"

    invoke-static {v9, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "number_of_saved_payment_details"

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    invoke-direct {v2, v3, v8, v9, v0}, Lcom/stripe/android/model/DisplayablePaymentDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    move-object v8, v2

    goto :goto_2

    :cond_3
    move-object v8, v1

    :goto_2
    const-string v0, "consent_ui"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lz00/c;->x:Lad3/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/stripe/android/model/ConsentUi;->Companion:Lcom/stripe/android/model/a;

    invoke-virtual {v2}, Lcom/stripe/android/model/a;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsentUi;

    :cond_4
    move-object v9, v1

    const-string v0, "suggested_email"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    new-instance v3, Lcom/stripe/android/model/ConsumerSessionLookup;

    invoke-direct/range {v3 .. v10}, Lcom/stripe/android/model/ConsumerSessionLookup;-><init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
