.class public final Lz00/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static a(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerSession;
    .locals 12

    const-string v0, "consumer_session"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "verification_sessions"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const-string v2, "getString(...)"

    if-eqz v1, :cond_9

    const/4 v3, 0x0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-static {v3, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    move-object v5, v3

    check-cast v5, Li93/i;

    iget-boolean v5, v5, Li93/i;->y:Z

    if-eqz v5, :cond_1

    move-object v5, v3

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/json/JSONObject;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    sget-object v6, Lcom/stripe/android/model/v;->x:Lcom/stripe/android/model/t;

    const-string v7, "type"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "toLowerCase(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lcom/stripe/android/model/v;->H:Lt83/b;

    invoke-virtual {v6}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/stripe/android/model/v;

    iget-object v10, v10, Lcom/stripe/android/model/v;->w:Ljava/lang/String;

    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_2

    :cond_3
    move-object v9, v0

    :goto_2
    check-cast v9, Lcom/stripe/android/model/v;

    if-nez v9, :cond_4

    sget-object v9, Lcom/stripe/android/model/v;->y:Lcom/stripe/android/model/v;

    :cond_4
    sget-object v6, Lcom/stripe/android/model/s;->x:Lcom/stripe/android/model/q;

    const-string v7, "state"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lcom/stripe/android/model/s;->G:Lt83/b;

    invoke-virtual {v6}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/stripe/android/model/s;

    iget-object v8, v8, Lcom/stripe/android/model/s;->w:Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_3

    :cond_6
    move-object v7, v0

    :goto_3
    check-cast v7, Lcom/stripe/android/model/s;

    if-nez v7, :cond_7

    sget-object v7, Lcom/stripe/android/model/s;->y:Lcom/stripe/android/model/s;

    :cond_7
    invoke-direct {v5, v9, v7}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;-><init>(Lcom/stripe/android/model/v;Lcom/stripe/android/model/s;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_8
    :goto_4
    move-object v10, v1

    goto :goto_5

    :cond_9
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_4

    :goto_5
    const-string v1, "mobile_fallback_webview_params"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v3, Lcom/stripe/android/model/MobileFallbackWebviewParams;

    sget-object v4, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Companion:Lcom/stripe/android/model/d0;

    const-string v5, "webview_requirement_type"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->getEntries()Lt83/a;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    invoke-virtual {v7}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->getValue()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v7, v5, v8}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object v0, v6

    :cond_b
    check-cast v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    if-nez v0, :cond_c

    sget-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Unknown:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    :cond_c
    const-string v4, "webview_open_url"

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lcom/stripe/android/model/MobileFallbackWebviewParams;-><init>(Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;Ljava/lang/String;)V

    move-object v11, v3

    goto :goto_6

    :cond_d
    move-object v11, v0

    :goto_6
    new-instance v3, Lcom/stripe/android/model/ConsumerSession;

    const-string v0, "client_secret"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email_address"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redacted_formatted_phone_number"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redacted_phone_number"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unredacted_phone_number"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "phone_number_country"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/model/ConsumerSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)V

    return-object v3
.end method


# virtual methods
.method public final bridge synthetic m(Lorg/json/JSONObject;)Lvy/b;
    .locals 0

    invoke-static {p1}, Lz00/b;->a(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerSession;

    move-result-object p1

    return-object p1
.end method
