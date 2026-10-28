.class public final Lcom/stripe/android/link/WebLinkActivityContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/link/WebLinkActivityContract;",
        "Lk/b;",
        "Lwz/k;",
        "Lwz/q;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lb10/c1;

.field public final b:Lb20/f;


# direct methods
.method public constructor <init>(Lb10/c1;Lb20/f;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/WebLinkActivityContract;->a:Lb10/c1;

    iput-object p2, p0, Lcom/stripe/android/link/WebLinkActivityContract;->b:Lb20/f;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lwz/k;)Landroid/content/Intent;
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "input"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lux/y;->y:Lux/y;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    new-instance v2, Lux/x;

    invoke-direct {v2, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    const-string v4, "key_publishable_key"

    iget-object v2, v2, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v5, Lux/y;

    const-string v6, "key_account_id"

    invoke-interface {v2, v6, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v4, v2}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v5

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    sput-object v2, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    sget-object v4, Lcom/stripe/android/link/serialization/PopupPayload;->Companion:Lcom/stripe/android/link/serialization/b;

    iget-object v1, v1, Lwz/k;->a:Lwz/g0;

    iget-object v6, v2, Lux/y;->w:Ljava/lang/String;

    iget-object v7, v2, Lux/y;->x:Ljava/lang/String;

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    move-object/from16 v5, p0

    iget-object v8, v5, Lcom/stripe/android/link/WebLinkActivityContract;->a:Lb10/c1;

    check-cast v8, Lb10/z0;

    invoke-virtual {v8, v2}, Lb10/z0;->c(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "configuration"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "publishableKey"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentUserAgent"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iget-object v2, v1, Lwz/g0;->x:Ljava/lang/String;

    iget-object v4, v1, Lwz/g0;->w:Ly00/c8;

    iget-object v9, v1, Lwz/g0;->z:Ljava/lang/String;

    invoke-direct {v8, v2, v9}, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iget-object v2, v1, Lwz/g0;->F:Lwz/f0;

    iget-object v10, v2, Lwz/f0;->x:Ljava/lang/String;

    iget-object v2, v2, Lwz/f0;->z:Ljava/lang/String;

    const-string v11, "getCountry(...)"

    const/4 v12, 0x0

    if-nez v2, :cond_3

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    invoke-direct {v9, v10, v2}, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lwz/g0;->J:Lwz/e0;

    if-eqz v2, :cond_4

    new-instance v10, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    iget-boolean v14, v2, Lwz/e0;->w:Z

    iget-object v2, v2, Lwz/e0;->x:Ljava/util/List;

    invoke-direct {v10, v14, v2}, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;-><init>(ZLjava/util/List;)V

    move-object/from16 v17, v10

    goto :goto_2

    :cond_4
    move-object/from16 v17, v3

    :goto_2
    instance-of v2, v4, Ly00/l3;

    if-eqz v2, :cond_6

    move-object v10, v4

    check-cast v10, Ly00/l3;

    iget-object v14, v10, Ly00/l3;->K:Ljava/lang/String;

    iget-object v10, v10, Ly00/l3;->y:Ljava/lang/Long;

    if-eqz v14, :cond_5

    if-eqz v10, :cond_5

    new-instance v3, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    move-object/from16 p2, v13

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-direct {v3, v14, v12, v13}, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;-><init>(Ljava/lang/String;J)V

    :goto_3
    move-object v10, v3

    goto :goto_4

    :cond_5
    move-object/from16 p2, v13

    goto :goto_3

    :cond_6
    move-object/from16 p2, v13

    instance-of v10, v4, Ly00/g6;

    if-eqz v10, :cond_e

    goto :goto_3

    :goto_4
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string v12, "packageName"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v12

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v11, v1, Lwz/g0;->H:Z

    if-eqz v11, :cond_7

    const-string v13, "card_payment_method"

    :goto_5
    move-object v14, v13

    goto :goto_6

    :cond_7
    const-string v13, "link_payment_method"

    goto :goto_5

    :goto_6
    if-eqz v2, :cond_8

    sget-object v13, Lf00/a;->x:Lf00/a;

    goto :goto_7

    :cond_8
    instance-of v13, v4, Ly00/g6;

    if-eqz v13, :cond_d

    sget-object v13, Lf00/a;->y:Lf00/a;

    :goto_7
    iget-object v15, v13, Lf00/a;->w:Ljava/lang/String;

    if-eqz v2, :cond_a

    if-eqz v11, :cond_9

    move-object v2, v4

    check-cast v2, Ly00/l3;

    sget-object v11, Ly00/f4;->G:Lt9/c0;

    const-string v11, "card"

    invoke-virtual {v2, v11}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v2

    :goto_8
    move/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object v2, v4

    check-cast v2, Ly00/l3;

    sget-object v11, Ly00/f4;->G:Lt9/c0;

    const-string v11, "link"

    invoke-virtual {v2, v11}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v2

    goto :goto_8

    :cond_a
    instance-of v2, v4, Ly00/g6;

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    goto :goto_8

    :goto_9
    iget-object v2, v1, Lwz/g0;->I:Ljava/util/Map;

    invoke-interface {v4}, Ly00/c8;->i0()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v4, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 v18, v2

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v13, "toUpperCase(...)"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v18

    goto :goto_a

    :cond_b
    move-object/from16 v18, v2

    iget-object v1, v1, Lwz/g0;->i0:Ly00/n;

    invoke-virtual {v1}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object v20

    new-instance v5, Lcom/stripe/android/link/serialization/PopupPayload;

    move-object/from16 v13, p2

    move-object/from16 v19, v11

    move-object v11, v3

    invoke-direct/range {v5 .. v20}, Lcom/stripe/android/link/serialization/PopupPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V

    sget v1, Lcom/stripe/android/link/LinkForegroundActivity;->x:I

    invoke-virtual {v5}, Lcom/stripe/android/link/serialization/PopupPayload;->toUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "popupUrl"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/stripe/android/link/LinkForegroundActivity;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "LinkPopupUrl"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtra(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final b(ILandroid/content/Intent;)Lwz/q;
    .locals 10

    sget-object v1, Lwz/b;->w:Lwz/b;

    if-eqz p1, :cond_f

    const v0, 0xc2cf

    const/4 v2, 0x0

    if-eq p1, v0, :cond_5

    const v0, 0x164e7

    if-eq p1, v0, :cond_0

    new-instance p1, Lwz/m;

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1

    :cond_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_3

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-lt p2, v0, :cond_1

    invoke-static {p1}, Lb5/c;->c(Landroid/os/Bundle;)Ljava/io/Serializable;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string p2, "LinkFailure"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    const-class p2, Ljava/lang/Exception;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    move-object v2, p1

    :cond_2
    :goto_0
    check-cast v2, Ljava/lang/Exception;

    :cond_3
    if-eqz v2, :cond_4

    new-instance p1, Lwz/o;

    invoke-direct {p1, v2, v1}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    return-object p1

    :cond_4
    new-instance p1, Lwz/m;

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1

    :cond_5
    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string p2, "link_status"

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_d

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v3, -0x4167ea76

    if-eq v0, v3, :cond_b

    const v3, -0x23bacec7

    if-eq v0, v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v0, "complete"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_d

    const-string p2, "pm"

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    const/4 p2, 0x0

    :try_start_0
    invoke-static {p1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    const-string p2, "decode(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance p1, Lz00/a;

    const/16 p2, 0x1d

    invoke-direct {p1, p2}, Lz00/a;-><init>(I)V

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_8

    move-object v2, p1

    goto :goto_2

    :cond_8
    sget-object p1, Lb20/e;->N:Lb20/e;

    new-instance v3, Lcom/stripe/android/link/FailedToParseLinkResultUriException;

    const/4 v7, 0x0

    const/16 v5, 0x17

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/core/exception/StripeException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    const/4 p2, 0x4

    iget-object v0, p0, Lcom/stripe/android/link/WebLinkActivityContract;->b:Lb20/f;

    invoke-static {v0, p1, v3, v2, p2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :goto_2
    check-cast v2, Ly00/o4;

    :cond_9
    if-nez v2, :cond_a

    new-instance p1, Lwz/m;

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    goto :goto_3

    :cond_a
    new-instance p1, Lwz/p;

    invoke-direct {p1, v2}, Lwz/p;-><init>(Ly00/o4;)V

    :goto_3
    return-object p1

    :cond_b
    const-string p1, "logout"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_4

    :cond_c
    new-instance p1, Lwz/m;

    sget-object p2, Lwz/l;->x:Lwz/l;

    invoke-direct {p1, p2, v1}, Lwz/m;-><init>(Lwz/l;Lwz/e;)V

    return-object p1

    :cond_d
    :goto_4
    new-instance p1, Lwz/m;

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1

    :cond_e
    :goto_5
    new-instance p1, Lwz/m;

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1

    :cond_f
    new-instance p1, Lwz/m;

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    return-object p1
.end method

.method public final bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lwz/k;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->a(Landroid/content/Context;Lwz/k;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->b(ILandroid/content/Intent;)Lwz/q;

    move-result-object p1

    return-object p1
.end method
