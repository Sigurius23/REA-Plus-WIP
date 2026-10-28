.class public final Lt9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/q;
.implements Lti/b;
.implements Lkotlin/time/Clock;
.implements Lwm/k;


# static fields
.field public static volatile x:Lt9/p;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt9/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(Ljava/util/LinkedHashMap;Lty/b;)Ljava/util/Map;
    .locals 4

    const-string v0, "source_data"

    const-string v1, "payment_method_data"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/util/Map;

    if-eqz v3, :cond_2

    check-cast v0, Ljava/util/Map;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_5

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lty/b;->b()Ljava/util/Map;

    move-result-object v2

    :cond_3
    if-nez v2, :cond_4

    sget-object v2, Lm83/z;->w:Lm83/z;

    :cond_4
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    :cond_5
    return-object p0
.end method

.method public static h(Ly00/s4;Ly00/v3;I)Ly00/d5;
    .locals 1

    and-int/lit8 p2, p2, 0x2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move-object p1, v0

    :cond_0
    new-instance p2, Ly00/d5;

    invoke-direct {p2, p0, p1, v0}, Ly00/d5;-><init>(Ly00/s4;Ly00/v3;Ly00/n;)V

    return-object p2
.end method

.method public static i(Lorg/json/JSONObject;Ly00/n;)Ly00/d5;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "paymentMethodData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "tokenizationData"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "token"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lz00/g;->d(Lorg/json/JSONObject;)Ly00/g8;

    move-result-object v2

    const-string v3, "info"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "billingAddress"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "postalCode"

    const-string v5, "countryCode"

    const-string v6, "administrativeArea"

    const-string v7, "locality"

    const-string v8, "address2"

    const-string v9, "address1"

    if-eqz v1, :cond_0

    invoke-static {v9, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v8, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v7, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v6, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    invoke-static {v5, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    new-instance v10, Ly00/c;

    invoke-direct/range {v10 .. v16}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v10, v3

    :goto_0
    const-string v11, "name"

    invoke-static {v11, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "email"

    invoke-static {v13, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "phoneNumber"

    invoke-static {v14, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v15, "shippingAddress"

    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v9, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v8, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v7, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v6, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v5, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v11, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    invoke-static {v14, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    :cond_1
    if-eqz v2, :cond_2

    iget-object v0, v2, Ly00/g8;->w:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    if-nez v0, :cond_3

    const-string v0, ""

    :cond_3
    move-object/from16 v19, v0

    new-instance v14, Ly00/s4;

    if-eqz v2, :cond_4

    iget-object v0, v2, Ly00/g8;->G:Ly00/h;

    if-eqz v0, :cond_4

    iget-object v0, v0, Ly00/h;->U:Ly00/h8;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_4
    if-eqz v3, :cond_5

    invoke-static {v3}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    :goto_2
    move-object/from16 v20, v0

    goto :goto_3

    :cond_5
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    goto :goto_2

    :goto_3
    const/16 v21, 0x0

    const/16 v22, 0x4f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v22}, Ly00/s4;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ly00/r4;I)V

    new-instance v0, Ly00/v3;

    invoke-direct {v0, v10, v13, v12, v1}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ly00/d5;

    move-object/from16 v2, p1

    invoke-direct {v1, v14, v0, v2}, Ly00/d5;-><init>(Ly00/s4;Ly00/v3;Ly00/n;)V

    return-object v1
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;Ly00/n;Ljava/util/Map;Ly00/r3;I)Ly00/d5;
    .locals 10

    and-int/lit8 p5, p5, 0x20

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v7, p4

    const-string p4, "paymentDetailsId"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "consumerSessionClientSecret"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "clientAttributionMetadata"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ly00/f4;->H:Ly00/f4;

    new-instance v4, Ly00/w4;

    invoke-direct {v4, p0, p1, p3}, Ly00/w4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v0, Ly00/d5;

    const/4 v5, 0x0

    const v9, 0x173bfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v8, p2

    invoke-direct/range {v0 .. v9}, Ly00/d5;-><init>(Ly00/f4;Ly00/s4;Ly00/b5;Ly00/w4;Ly00/z4;Ly00/v3;Ly00/r3;Ly00/n;I)V

    return-object v0
.end method

.method public static k(Ljava/lang/String;)Ly00/j;
    .locals 5

    sget-object v0, Ly00/j;->H:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ly00/j;

    iget-object v3, v3, Ly00/j;->w:Ljava/lang/String;

    if-eqz p0, :cond_1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "toLowerCase(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    :cond_2
    check-cast v2, Ly00/j;

    if-nez v2, :cond_3

    sget-object p0, Ly00/j;->F:Ly00/j;

    return-object p0

    :cond_3
    return-object v2
.end method

.method public static m(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;
    .locals 3

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Status;->J:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v2, v2, Lcom/stripe/android/model/StripeIntent$Status;->w:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lcom/stripe/android/model/StripeIntent$Status;

    return-object v0
.end method

.method public static n(IJ)Lug/b;
    .locals 3

    new-instance v0, Lug/b;

    int-to-long v1, p0

    invoke-static {p1, p2, v1, v2}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    move-result-object p0

    const-string p1, "ofEpochSecond(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lug/b;-><init>(Ljava/time/Instant;)V

    return-object v0
.end method

.method public static p(Ljava/lang/String;)Lug/b;
    .locals 14

    const-string v0, "ts"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lug/s;->a:I

    new-instance v0, Lsl0/b2;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lsl0/b2;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lsl0/b2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v2, v0, Lug/f;->a:I

    iget-object v0, v0, Lug/f;->b:Ljava/lang/Object;

    check-cast v0, Lug/g;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v2, v3, :cond_0

    new-instance v4, Lug/i;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lug/i;-><init>(IIIII)V

    goto :goto_0

    :cond_0
    new-instance v3, Lb30/z;

    const/16 v4, 0xe

    const-string v5, "Tt"

    invoke-direct {v3, v5, v4, v1}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v1, Lsl0/b2;

    const/16 v4, 0x10

    invoke-direct {v1, v4}, Lsl0/b2;-><init>(I)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, p0, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lug/f;

    iget v2, v2, Lug/f;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, p0, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lug/f;

    iget-object p0, p0, Lug/f;->b:Ljava/lang/Object;

    move-object v4, p0

    check-cast v4, Lug/i;

    :goto_0
    new-instance v5, Lug/h;

    iget v6, v0, Lug/g;->a:I

    iget v7, v0, Lug/g;->b:I

    iget v8, v0, Lug/g;->c:I

    iget v9, v4, Lug/i;->a:I

    iget v10, v4, Lug/i;->b:I

    iget v11, v4, Lug/i;->c:I

    iget v12, v4, Lug/i;->d:I

    iget v13, v4, Lug/i;->e:I

    invoke-direct/range {v5 .. v13}, Lug/h;-><init>(IIIIIIII)V

    invoke-static {v5}, Ls2/a;->f(Lug/h;)Lug/b;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/String;)Lug/b;
    .locals 13

    sget v0, Lug/s;->a:I

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x30

    if-gt v5, v0, :cond_0

    const/16 v5, 0x3a

    if-ge v0, v5, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Lb30/z;

    const-string v5, "Mon"

    const/16 v6, 0xd

    invoke-direct {v0, v5, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v5, Lb30/z;

    const-string v7, "Tue"

    invoke-direct {v5, v7, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v7, Lb30/z;

    const-string v8, "Wed"

    invoke-direct {v7, v8, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v8, Lb30/z;

    const-string v9, "Thu"

    invoke-direct {v8, v9, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v9, Lb30/z;

    const-string v10, "Fri"

    invoke-direct {v9, v10, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v10, Lb30/z;

    const-string v11, "Sat"

    invoke-direct {v10, v11, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    new-instance v11, Lb30/z;

    const-string v12, "Sun"

    invoke-direct {v11, v12, v6, v4}, Lb30/z;-><init>(Ljava/lang/String;IB)V

    const/4 v6, 0x7

    new-array v6, v6, [Lc93/m;

    aput-object v0, v6, v4

    aput-object v5, v6, v3

    const/4 v0, 0x2

    aput-object v7, v6, v0

    const/4 v0, 0x3

    aput-object v8, v6, v0

    aput-object v9, v6, v1

    const/4 v0, 0x5

    aput-object v10, v6, v0

    const/4 v0, 0x6

    aput-object v11, v6, v0

    sget-object v0, Lug/n;->w:Lug/n;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    array-length v7, v6

    move v8, v4

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    :try_start_0
    invoke-interface {v9, p0, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lug/f;
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v2

    :goto_1
    if-eqz v9, :cond_3

    iget v4, v9, Lug/f;->a:I

    iget-object v5, v9, Lug/f;->b:Ljava/lang/Object;

    invoke-static {v4, v3, p0}, Lug/m;->J(IILjava/lang/String;)V

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2c

    if-ne v6, v7, :cond_2

    new-instance v7, Lug/f;

    add-int/2addr v4, v3

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    invoke-direct {v7, v4, v6}, Lug/f;-><init>(ILjava/lang/Object;)V

    new-instance v4, Lug/f;

    new-instance v6, Ll83/k;

    iget-object v8, v7, Lug/f;->b:Ljava/lang/Object;

    invoke-direct {v6, v5, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v5, v7, Lug/f;->a:I

    invoke-direct {v4, v5, v6}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget v5, v4, Lug/f;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, p0, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v5, v0, Lug/f;->a:I

    iget-object v0, v0, Lug/f;->b:Ljava/lang/Object;

    new-instance v6, Lug/f;

    new-instance v7, Ll83/k;

    iget-object v4, v4, Lug/f;->b:Ljava/lang/Object;

    invoke-direct {v7, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v6, v5, v7}, Lug/f;-><init>(ILjava/lang/Object;)V

    iget-object v0, v6, Lug/f;->b:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    const-string v4, "it"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lug/f;

    iget v4, v6, Lug/f;->a:I

    invoke-direct {v0, v4, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance v0, Laws/smithy/kotlin/runtime/time/ParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "` found `"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x60

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v4}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0

    :cond_3
    new-instance v0, Laws/smithy/kotlin/runtime/time/ParseException;

    const-string v1, "no alternatives matched"

    invoke-direct {v0, p0, v1, v4}, Laws/smithy/kotlin/runtime/time/ParseException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v0

    :cond_4
    :goto_2
    new-instance v0, Lug/f;

    invoke-direct {v0, v4, v2}, Lug/f;-><init>(ILjava/lang/Object;)V

    :goto_3
    new-instance v2, Li93/j;

    const/16 v4, 0x1f

    invoke-direct {v2, v3, v4, v3}, Li93/h;-><init>(III)V

    new-instance v4, Lsl0/j2;

    invoke-direct {v4, v3, v2}, Lsl0/j2;-><init>(ILi93/j;)V

    iget v0, v0, Lug/f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Lsl0/j2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v2, v0, Lug/f;->a:I

    iget-object v0, v0, Lug/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v6

    sget-object v0, Lug/o;->w:Lug/o;

    new-instance v3, Lsl0/b2;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lsl0/b2;-><init>(I)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p0, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v0, v0, Lug/f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v2, v0, Lug/f;->a:I

    iget-object v0, v0, Lug/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5

    sget-object v0, Lug/p;->w:Lug/p;

    new-instance v3, Lsl0/b2;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lsl0/b2;-><init>(I)V

    new-instance v4, Lcom/whoop/profile/presentation/edit/b;

    invoke-direct {v4, v3, v1, v1}, Lcom/whoop/profile/presentation/edit/b;-><init>(Lc93/m;II)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v0, v0, Lug/f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v1, v0, Lug/f;->a:I

    iget-object v0, v0, Lug/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    sget-object v0, Lug/q;->w:Lug/q;

    new-instance v2, Lsl0/b2;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lsl0/b2;-><init>(I)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug/f;

    iget v0, v0, Lug/f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lug/f;

    iget-object p0, p0, Lug/f;->b:Ljava/lang/Object;

    check-cast p0, Lug/i;

    new-instance v3, Lug/h;

    iget v7, p0, Lug/i;->a:I

    iget v8, p0, Lug/i;->b:I

    iget v9, p0, Lug/i;->c:I

    iget v10, p0, Lug/i;->d:I

    iget v11, p0, Lug/i;->e:I

    invoke-direct/range {v3 .. v11}, Lug/h;-><init>(IIIIIIII)V

    invoke-static {v3}, Ls2/a;->f(Lug/h;)Lug/b;

    move-result-object p0

    return-object p0
.end method

.method public static t()Lug/b;
    .locals 3

    new-instance v0, Lug/b;

    invoke-static {}, Ljava/time/Instant;->now()Ljava/time/Instant;

    move-result-object v1

    const-string v2, "now(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lug/b;-><init>(Ljava/time/Instant;)V

    return-object v0
.end method


# virtual methods
.method public a(F)Z
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lej/a;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(F)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public d()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public g(Landroid/content/Context;Lt23/c0;)Ll83/k;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Lt23/c0;->p:Lt23/s0;

    iget-object p2, p2, Lt23/s0;->M:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const-string v0, "<this>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/android/video/generated/models/OwnCapability;

    const-string v2, "capability"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;

    if-eqz v2, :cond_1

    const-string v1, "android.permission.RECORD_AUDIO"

    goto :goto_1

    :cond_1
    instance-of v1, v1, Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;

    if-eqz v1, :cond_2

    const-string v1, "android.permission.CAMERA"

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lj43/a;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "<anonymous parameter 0>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_4

    const-string v2, "permission check failed for "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "PermissionUtilities"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_6

    new-instance p2, Ll83/k;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_6
    new-instance p1, Ll83/k;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    invoke-direct {p1, p2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l()V
    .locals 1

    iget v0, p0, Lt9/p;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public now()Lkotlin/time/Instant;
    .locals 2

    invoke-static {}, Ljava/time/Instant;->now()Ljava/time/Instant;

    move-result-object v0

    const-string v1, "now(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/time/jdk8/InstantConversionsJDK8Kt;->toKotlinInstant(Ljava/time/Instant;)Lkotlin/time/Instant;

    move-result-object v0

    return-object v0
.end method

.method public o(II)Lt9/k0;
    .locals 0

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public o(II)Lwm/s;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public r(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc5/i;

    iget p1, p1, Lc5/i;->c:I

    return p1
.end method

.method public s(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lc5/i;

    iget-boolean p1, p1, Lc5/i;->d:Z

    return p1
.end method

.method public u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p3

    instance-of v1, v0, Lw43/c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lw43/c;

    iget v2, v1, Lw43/c;->I:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lw43/c;->I:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lw43/c;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lw43/c;-><init>(Lt9/p;Ls83/c;)V

    :goto_0
    iget-object v0, v1, Lw43/c;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lw43/c;->I:I

    const/4 v5, 0x3

    const-string v8, "SfuRetry"

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v11, :cond_2

    if-ne v4, v10, :cond_1

    iget-wide v12, v1, Lw43/c;->F:J

    iget-object v4, v1, Lw43/c;->z:Lkotlin/jvm/internal/e0;

    iget-object v14, v1, Lw43/c;->y:Lc93/m;

    iget-object v15, v1, Lw43/c;->x:Lw43/b;

    const-wide/16 v16, 0x0

    iget-object v6, v1, Lw43/c;->w:Lt9/p;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    move-object v7, v6

    move-object v6, v0

    move-object v0, v15

    move-object v15, v7

    move-object v7, v4

    move-object v4, v1

    move-object v1, v14

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-wide/16 v16, 0x0

    iget-wide v6, v1, Lw43/c;->F:J

    iget-object v4, v1, Lw43/c;->E:Ljava/lang/Throwable;

    iget-object v12, v1, Lw43/c;->z:Lkotlin/jvm/internal/e0;

    iget-object v13, v1, Lw43/c;->y:Lc93/m;

    iget-object v14, v1, Lw43/c;->x:Lw43/b;

    iget-object v15, v1, Lw43/c;->w:Lt9/p;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_b

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :cond_3
    const-wide/16 v16, 0x0

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v11, v0, Lkotlin/jvm/internal/e0;->w:I

    move-object v7, v0

    move-object v4, v1

    move-object v15, v2

    move-object v6, v9

    move-wide/from16 v12, v16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    :goto_1
    iget v14, v7, Lkotlin/jvm/internal/e0;->w:I

    if-gt v14, v5, :cond_c

    cmp-long v14, v12, v16

    if-lez v14, :cond_5

    iput-object v15, v4, Lw43/c;->w:Lt9/p;

    iput-object v0, v4, Lw43/c;->x:Lw43/b;

    iput-object v1, v4, Lw43/c;->y:Lc93/m;

    iput-object v7, v4, Lw43/c;->z:Lkotlin/jvm/internal/e0;

    iput-object v6, v4, Lw43/c;->E:Ljava/lang/Throwable;

    iput-wide v12, v4, Lw43/c;->F:J

    iput v11, v4, Lw43/c;->I:I

    invoke-static {v12, v13, v4}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v14
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v14, v3, :cond_4

    goto :goto_4

    :cond_4
    move-object v14, v0

    move-wide/from16 v27, v12

    move-object v13, v1

    move-object v1, v4

    move-object v4, v6

    move-object v12, v7

    move-wide/from16 v6, v27

    :goto_2
    move-object/from16 v22, v4

    move-wide/from16 v20, v6

    move-object v4, v12

    move-object/from16 v23, v14

    move-object v6, v1

    move-object v1, v13

    goto :goto_3

    :cond_5
    move-object/from16 v23, v0

    move-object/from16 v22, v6

    move-wide/from16 v20, v12

    move-object v6, v4

    move-object v4, v7

    :goto_3
    :try_start_3
    new-instance v18, Lw43/a;

    iget v0, v4, Lkotlin/jvm/internal/e0;->w:I

    move/from16 v19, v0

    invoke-direct/range {v18 .. v23}, Lw43/a;-><init>(IJLjava/lang/Throwable;Lw43/b;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object/from16 v0, v18

    move-wide/from16 v12, v20

    move-object/from16 v14, v23

    :try_start_4
    iput-object v15, v6, Lw43/c;->w:Lt9/p;

    iput-object v14, v6, Lw43/c;->x:Lw43/b;

    iput-object v1, v6, Lw43/c;->y:Lc93/m;

    iput-object v4, v6, Lw43/c;->z:Lkotlin/jvm/internal/e0;

    iput-object v9, v6, Lw43/c;->E:Ljava/lang/Throwable;

    iput-wide v12, v6, Lw43/c;->F:J

    iput v10, v6, Lw43/c;->I:I

    invoke-interface {v1, v0, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v0, v3, :cond_e

    :goto_4
    return-object v3

    :catchall_2
    move-exception v0

    :goto_5
    move-object v7, v4

    move-object v4, v6

    move-object v6, v0

    move-object v0, v14

    goto :goto_6

    :catchall_3
    move-exception v0

    move-wide/from16 v12, v20

    move-object/from16 v14, v23

    goto :goto_5

    :goto_6
    :try_start_5
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v14, v10, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const-string v5, " failed: "

    const-string v11, "Retry attempt "

    if-eqz v14, :cond_6

    :try_start_6
    sget-object v14, Lb23/i;->c:Lb23/j;

    iget v9, v7, Lkotlin/jvm/internal/e0;->w:I

    move-object/from16 p1, v1

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v14, v10, v8, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :cond_6
    move-object/from16 p1, v1

    :goto_7
    iget v1, v7, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    const/4 v9, 0x1

    if-lt v1, v9, :cond_7

    iget-object v9, v0, Lw43/b;->a:Lc93/m;

    new-instance v14, Ljava/lang/Integer;

    invoke-direct {v14, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v9, v14, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v9, 0x1

    goto :goto_8

    :cond_7
    move v9, v2

    :goto_8
    iget v1, v7, Lkotlin/jvm/internal/e0;->w:I

    const/4 v14, 0x3

    if-ne v1, v14, :cond_8

    const/4 v2, 0x1

    :cond_8
    if-nez v9, :cond_a

    if-eqz v2, :cond_9

    goto :goto_9

    :cond_9
    iget-object v2, v0, Lw43/b;->b:Ltx/a;

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v1}, Ljava/lang/Integer;-><init>(I)V

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, v12, v13}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v2, v5, v1}, Ltx/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v21

    const-wide/16 v23, 0xfa

    const-wide/16 v25, 0x7d0

    invoke-static/range {v21 .. v26}, Le93/b;->p(JJJ)J

    move-result-wide v12

    iget v1, v7, Lkotlin/jvm/internal/e0;->w:I

    const/16 v19, 0x1

    add-int/lit8 v1, v1, 0x1

    iput v1, v7, Lkotlin/jvm/internal/e0;->w:I

    move-object/from16 v2, p0

    move-object/from16 v1, p1

    move v5, v14

    move/from16 v11, v19

    const/4 v9, 0x0

    const/4 v10, 0x2

    goto/16 :goto_1

    :cond_a
    :goto_9
    sget-object v0, Lb23/i;->d:Lb23/e;

    invoke-interface {v0, v10, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lb23/i;->c:Lb23/j;

    iget v1, v7, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Giving up."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v10, v8, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    throw v6

    :goto_a
    throw v0

    :cond_c
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v2, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v1, Lb23/i;->c:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Retry loop completed without success or failure. Policy: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v1, v2, v8, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Check your policy: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_b
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_e
    :goto_c
    return-object v0

    :goto_d
    throw v0
.end method

.method public v(Lt9/e0;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public x(Lwm/p;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
