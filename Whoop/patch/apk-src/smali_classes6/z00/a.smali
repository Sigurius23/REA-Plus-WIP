.class public final Lz00/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# static fields
.field public static final E:Lz00/a;

.field public static final F:Lz00/a;

.field public static final G:Lz00/a;

.field public static final H:Lz00/a;

.field public static final x:Lz00/a;

.field public static final y:Lz00/a;

.field public static final z:Lz00/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lz00/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->x:Lz00/a;

    new-instance v0, Lz00/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->y:Lz00/a;

    new-instance v0, Lz00/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->z:Lz00/a;

    new-instance v0, Lz00/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->E:Lz00/a;

    new-instance v0, Lz00/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->F:Lz00/a;

    new-instance v0, Lz00/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->G:Lz00/a;

    new-instance v0, Lz00/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/a;->H:Lz00/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lz00/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Ly00/t0;
    .locals 3

    const-string v0, "object"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x6ccac4d6

    if-eq v1, v2, :cond_4

    const v2, -0x356f97e5    # -4731917.5f

    if-eq v1, v2, :cond_2

    const v2, 0x2e7b10

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "card"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Ls2/h;->j(Lorg/json/JSONObject;)Ly00/h;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance v0, Ly00/s0;

    invoke-direct {v0, p0}, Ly00/s0;-><init>(Ly00/h;)V

    return-object v0

    :cond_2
    const-string v1, "source"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lz00/h;

    invoke-static {p0}, Lz00/h;->a(Lorg/json/JSONObject;)Ly00/m6;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance v0, Ly00/u0;

    invoke-direct {v0, p0}, Ly00/u0;-><init>(Ly00/m6;)V

    return-object v0

    :cond_4
    const-string v1, "bank_account"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p0}, Ls2/d;->q(Lorg/json/JSONObject;)Ly00/e;

    move-result-object p0

    new-instance v0, Ly00/r0;

    invoke-direct {v0, p0}, Ly00/r0;-><init>(Ly00/e;)V

    return-object v0

    :cond_6
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Lorg/json/JSONObject;)Ly00/y;
    .locals 10

    const-string v0, "billing_address"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const-string v1, "name"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "line_1"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "line_2"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "locality"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "postal_code"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "administrative_area"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "country_code"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    invoke-direct {v0, p0}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    :cond_0
    move-object v9, v0

    new-instance v2, Ly00/y;

    invoke-direct/range {v2 .. v9}, Ly00/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    return-object v2

    :cond_1
    return-object v0
.end method

.method public static f(Lorg/json/JSONObject;)Ly00/c0;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "type"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    const-string v3, "id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "is_default"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    const-string v3, "nickname"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    move-object v8, v3

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "toLowerCase(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "card"

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v9, "billing_email_address"

    const-string v10, "last4"

    const-string v11, "getString(...)"

    if-eqz v6, :cond_c

    const-string v1, "card_details"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v6, "checks"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v12, "networks"

    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    if-eqz v12, :cond_1

    const/4 v13, 0x0

    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v14

    invoke-static {v13, v14}, Le93/b;->i0(II)Li93/j;

    move-result-object v13

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v13, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v13}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    move-object v15, v13

    check-cast v15, Li93/i;

    iget-boolean v15, v15, Li93/i;->y:Z

    if-eqz v15, :cond_2

    move-object v15, v13

    check-cast v15, Lm83/e0;

    invoke-virtual {v15}, Lm83/e0;->nextInt()I

    move-result v15

    invoke-virtual {v12, v15}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v14, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v12, "exp_year"

    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    const-string v13, "exp_month"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    sget-object v15, Ly00/i;->M:Lt9/c0;

    const/16 v16, 0x0

    const-string v2, "brand"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "american_express"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v2, "amex"

    goto :goto_2

    :cond_3
    const-string v3, "diners_club"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v2, "diners"

    :cond_4
    :goto_2
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v2

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ly00/v0;->x:Lt9/p;

    if-eqz v6, :cond_5

    const-string v10, "cvc_check"

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_5
    move-object/from16 v6, v16

    :goto_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ly00/v0;->I:Lt83/b;

    invoke-virtual {v4}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ly00/v0;

    iget-object v11, v11, Ly00/v0;->w:Ljava/lang/String;

    invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_4

    :cond_7
    move-object/from16 v10, v16

    :goto_4
    check-cast v10, Ly00/v0;

    if-nez v10, :cond_8

    sget-object v10, Ly00/v0;->G:Ly00/v0;

    :cond_8
    move-object v15, v10

    sget-object v4, Ly00/z;->y:Lt9/c0;

    const-string v6, "funding"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ly00/z;->F:Lt83/b;

    invoke-virtual {v4}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ly00/z;

    iget-object v10, v10, Ly00/z;->w:Ljava/lang/String;

    invoke-virtual {v10, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    move-object/from16 v16, v6

    :cond_a
    check-cast v16, Ly00/z;

    if-nez v16, :cond_b

    sget-object v16, Ly00/z;->z:Ly00/z;

    :cond_b
    invoke-static {v0}, Lz00/a;->e(Lorg/json/JSONObject;)Ly00/y;

    move-result-object v1

    invoke-static {v9, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    new-instance v4, Ly00/a0;

    move-object v9, v1

    move-object v6, v3

    move v11, v12

    move v12, v13

    move-object v13, v2

    invoke-direct/range {v4 .. v16}, Ly00/a0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ly00/y;Ljava/lang/String;IILy00/i;Ljava/util/List;Ly00/v0;Ly00/z;)V

    return-object v4

    :cond_c
    const/16 v16, 0x0

    const-string v2, "bank_account"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "bank_account_details"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "bank_account_name"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "bank_icon_code"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0}, Lz00/a;->e(Lorg/json/JSONObject;)Ly00/y;

    move-result-object v11

    invoke-static {v9, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    new-instance v4, Ly00/x;

    move-object v9, v2

    invoke-direct/range {v4 .. v12}, Ly00/x;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/y;Ljava/lang/String;)V

    return-object v4

    :cond_d
    const/16 v16, 0x0

    :cond_e
    return-object v16
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Ly00/b;
    .locals 13

    const-string v0, "account_range_high"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "account_range_low"

    invoke-static {v1, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "pan_length"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_0
    const-string v3, "is_static"

    const/4 v5, 0x0

    invoke-virtual {p1, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v5, "brand"

    invoke-static {v5, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ly00/a;->L:Lt83/b;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, La0/i1;

    const/4 v8, 0x2

    invoke-direct {v7, v6, v8}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_1
    invoke-virtual {v7}, La0/i1;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v7}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ly00/a;

    iget-object v8, v8, Ly00/a;->w:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_2
    move-object v6, v4

    :goto_1
    move-object v10, v6

    check-cast v10, Ly00/a;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    if-eqz v2, :cond_3

    if-eqz v10, :cond_3

    new-instance v8, Ly00/f;

    invoke-direct {v8, v1, v0, v3}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "country"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v0, "funding"

    invoke-static {v0, p1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ly00/j;->x:Lt9/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lt9/p;->k(Ljava/lang/String;)Ly00/j;

    move-result-object v11

    new-instance v7, Ly00/b;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-direct/range {v7 .. v12}, Ly00/b;-><init>(Ly00/f;ILy00/a;Ly00/j;Ljava/lang/String;)V

    return-object v7

    :cond_3
    return-object v4
.end method

.method public c(Lorg/json/JSONObject;)Ly00/l3;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "object"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "payment_intent"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    const-string v1, "id"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "payment_method_types"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v7

    invoke-static {v6, v7}, Le93/b;->i0(II)Li93/j;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    move-object v9, v7

    check-cast v9, Li93/i;

    iget-boolean v9, v9, Li93/i;->y:Z

    if-eqz v9, :cond_2

    move-object v9, v7

    check-cast v9, Lm83/e0;

    invoke-virtual {v9}, Lm83/e0;->nextInt()I

    move-result v9

    invoke-virtual {v1, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v8, v3

    :cond_2
    const-string v1, "amount"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    move-object v1, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_1
    const-string v7, "canceled_at"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v9

    sget-object v7, Ly00/d3;->x:Lt9/c0;

    const-string v11, "cancellation_reason"

    invoke-static {v11, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Ly00/d3;->z:Lt83/b;

    invoke-virtual {v7}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ly00/d3;

    iget-object v13, v13, Ly00/d3;->w:Ljava/lang/String;

    invoke-virtual {v13, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_5
    move-object v12, v2

    :goto_2
    check-cast v12, Ly00/d3;

    sget-object v7, Ly00/e3;->x:Lt9/p;

    const-string v11, "capture_method"

    invoke-static {v11, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Ly00/e3;->G:Lt83/b;

    invoke-virtual {v7}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Ly00/e3;

    iget-object v14, v14, Ly00/e3;->w:Ljava/lang/String;

    invoke-virtual {v14, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    goto :goto_3

    :cond_7
    move-object v13, v2

    :goto_3
    check-cast v13, Ly00/e3;

    if-nez v13, :cond_8

    sget-object v13, Ly00/e3;->y:Ly00/e3;

    :cond_8
    const-string v7, "client_secret"

    invoke-static {v7, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    sget-object v11, Ly00/g3;->x:Lt9/c0;

    const-string v14, "confirmation_method"

    invoke-static {v14, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, Ly00/g3;->F:Lt83/b;

    invoke-virtual {v11}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v2, v15

    check-cast v2, Ly00/g3;

    iget-object v2, v2, Ly00/g3;->w:Ljava/lang/String;

    invoke-virtual {v2, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    goto :goto_4

    :cond_a
    const/4 v15, 0x0

    :goto_5
    check-cast v15, Ly00/g3;

    if-nez v15, :cond_b

    sget-object v15, Ly00/g3;->y:Ly00/g3;

    :cond_b
    const-string v2, "created"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v17

    const/4 v2, 0x0

    invoke-static {v0}, Ls/s;->r(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    const-string v11, "description"

    invoke-static {v11, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v14, "livemode"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_c

    invoke-virtual {v0, v14, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_c

    move-wide/from16 v40, v17

    const/16 v18, 0x1

    :goto_6
    move-object/from16 v17, v7

    move-wide/from16 v42, v9

    move-object v10, v8

    move-wide/from16 v7, v42

    move-object v9, v12

    move-object v12, v15

    move-wide/from16 v14, v40

    goto :goto_7

    :cond_c
    move-wide/from16 v40, v17

    move/from16 v18, v6

    goto :goto_6

    :goto_7
    const-string v2, "payment_method"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_d

    new-instance v6, Lz00/a;

    move-object/from16 v23, v1

    const/16 v1, 0x1d

    invoke-direct {v6, v1}, Lz00/a;-><init>(I)V

    invoke-virtual {v6, v5}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v1

    goto :goto_8

    :cond_d
    move-object/from16 v23, v1

    const/4 v1, 0x0

    :goto_8
    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_e

    goto :goto_9

    :cond_e
    const/4 v2, 0x0

    :goto_9
    if-nez v2, :cond_10

    if-eqz v1, :cond_f

    iget-object v2, v1, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_a

    :cond_f
    const/4 v2, 0x0

    :cond_10
    :goto_a
    const-string v5, "receipt_email"

    invoke-static {v5, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/model/StripeIntent$Status;->x:Lt9/p;

    move-object/from16 v24, v1

    const-string v1, "status"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt9/p;->m(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v1

    const-string v6, "payment_method_options"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v29, v6

    goto :goto_b

    :cond_11
    const/16 v29, 0x0

    :goto_b
    sget-object v6, Lcom/stripe/android/model/StripeIntent$Usage;->x:Lt9/c0;

    move-object/from16 v25, v1

    const-string v1, "setup_future_usage"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt9/c0;->n(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v1

    const-string v6, "last_payment_error"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    move-object/from16 v26, v1

    if-eqz v6, :cond_15

    const-string v1, "charge"

    invoke-static {v1, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v31

    const-string v1, "code"

    invoke-static {v1, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v32

    const-string v1, "decline_code"

    invoke-static {v1, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v33

    const-string v1, "doc_url"

    invoke-static {v1, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v34

    const-string v1, "message"

    invoke-static {v1, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v35

    const-string v1, "param"

    invoke-static {v1, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v36

    const-string v1, "payment_method"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/16 v27, 0x0

    move-object/from16 v28, v2

    if-eqz v1, :cond_12

    new-instance v2, Lz00/a;

    move-object/from16 v39, v3

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lz00/a;-><init>(I)V

    invoke-virtual {v2, v1}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v1

    move-object/from16 v37, v1

    goto :goto_c

    :cond_12
    move-object/from16 v39, v3

    move-object/from16 v37, v27

    :goto_c
    sget-object v1, Ly00/h3;->x:Lt9/p;

    const-string v2, "type"

    invoke-static {v2, v6}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ly00/h3;->z:Lt83/b;

    invoke-virtual {v1}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ly00/h3;

    iget-object v6, v6, Ly00/h3;->w:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    move-object/from16 v27, v3

    :cond_14
    move-object/from16 v38, v27

    check-cast v38, Ly00/h3;

    new-instance v30, Ly00/i3;

    invoke-direct/range {v30 .. v38}, Ly00/i3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/o4;Ly00/h3;)V

    goto :goto_d

    :cond_15
    move-object/from16 v28, v2

    move-object/from16 v39, v3

    const/16 v30, 0x0

    :goto_d
    const-string v1, "shipping"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_17

    const-string v2, "address"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_16

    const-string v3, "city"

    invoke-static {v3, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v32

    const-string v3, "country"

    invoke-static {v3, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v33

    const-string v3, "line1"

    invoke-static {v3, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v34

    const-string v3, "line2"

    invoke-static {v3, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v35

    const-string v3, "postal_code"

    invoke-static {v3, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v36

    const-string v3, "state"

    invoke-static {v3, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v37

    new-instance v31, Ly00/c;

    invoke-direct/range {v31 .. v37}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v34, v31

    goto :goto_e

    :cond_16
    new-instance v32, Ly00/c;

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v34, v32

    :goto_e
    const-string v2, "carrier"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v35

    const-string v2, "name"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v36

    const-string v2, "phone"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v37

    const-string v2, "tracking_number"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v38

    new-instance v33, Ly00/j3;

    invoke-direct/range {v33 .. v38}, Ly00/j3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_f

    :cond_17
    const/16 v33, 0x0

    :goto_f
    const-string v1, "next_action"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-static {v1}, Ls30/b;->s(Lorg/json/JSONObject;)Ly00/b8;

    move-result-object v2

    goto :goto_10

    :cond_18
    const/4 v2, 0x0

    :goto_10
    const-string v1, "unactivated_payment_method_types"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    const/4 v6, 0x0

    invoke-static {v6, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v3

    new-instance v6, Ljava/util/ArrayList;

    move-object/from16 v20, v2

    move-object/from16 v27, v4

    const/16 v2, 0xa

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_11
    move-object v3, v2

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_1a

    move-object v3, v2

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_19
    move-object/from16 v20, v2

    move-object/from16 v27, v4

    move-object/from16 v6, v39

    :cond_1a
    check-cast v6, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v6, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "toLowerCase(...)"

    if-eqz v3, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1b
    const-string v2, "link_funding_sources"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    const/4 v6, 0x0

    invoke-static {v6, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v3

    new-instance v6, Ljava/util/ArrayList;

    move-object/from16 v31, v1

    move-object/from16 v32, v5

    const/16 v1, 0xa

    invoke-static {v3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_13
    move-object v3, v1

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_1c

    move-object v3, v1

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1c
    move-object v3, v6

    goto :goto_14

    :cond_1d
    move-object/from16 v31, v1

    move-object/from16 v32, v5

    move-object/from16 v3, v39

    :goto_14
    check-cast v3, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_1e
    const-string v2, "country_code"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "automatic_payment_methods"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1f

    const-string v3, "enabled"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1f

    move v6, v3

    goto :goto_16

    :cond_1f
    const/4 v6, 0x0

    :goto_16
    new-instance v3, Ly00/l3;

    if-nez v17, :cond_20

    const-string v0, "redacted_client_secret"

    move-object/from16 v17, v11

    move-object v11, v0

    :goto_17
    move-object/from16 v4, v28

    move-object/from16 v28, v20

    move-object/from16 v20, v4

    move-object v5, v10

    move-object v10, v13

    move-object/from16 v19, v24

    move-object/from16 v22, v25

    move-object/from16 v4, v27

    move-object/from16 v24, v30

    move-object/from16 v21, v32

    move-object/from16 v25, v33

    move-object/from16 v27, v1

    move-object v13, v2

    move/from16 v30, v6

    move-object/from16 v6, v23

    move-object/from16 v23, v26

    move-object/from16 v26, v31

    goto :goto_18

    :cond_20
    move-object/from16 v4, v17

    move-object/from16 v17, v11

    move-object v11, v4

    goto :goto_17

    :goto_18
    invoke-direct/range {v3 .. v30}, Ly00/l3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    return-object v3
.end method

.method public d(Lorg/json/JSONObject;)Ly00/o4;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lz00/a;->w:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "type"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    sget-object v2, Ly00/f4;->G:Lt9/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Lt9/c0;->k(Ljava/lang/String;)Ly00/f4;

    move-result-object v8

    const-string v2, "id"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "created"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_0

    move-object v2, v5

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_0
    const-string v3, "billing_details"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Ls4/b;->y(Lorg/json/JSONObject;)Ly00/v3;

    move-result-object v3

    move-object v9, v3

    goto :goto_1

    :cond_1
    move-object v9, v5

    :goto_1
    const-string v3, "allow_redisplay"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    sget-object v6, Ly00/r3;->F:Lt83/b;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, La0/i1;

    const/4 v11, 0x2

    invoke-direct {v10, v6, v11}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_2
    invoke-virtual {v10}, La0/i1;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v10}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ly00/r3;

    iget-object v11, v11, Ly00/r3;->w:Ljava/lang/String;

    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_3
    move-object v6, v5

    :goto_2
    check-cast v6, Ly00/r3;

    move-object/from16 v20, v6

    goto :goto_3

    :cond_4
    move-object/from16 v20, v5

    :goto_3
    const-string v3, "customer"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    const-string v3, "livemode"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    if-nez v8, :cond_5

    const/4 v3, -0x1

    goto :goto_4

    :cond_5
    sget-object v3, Lz00/e;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v3, v3, v11

    :goto_4
    const-string v11, "last4"

    const-string v12, "fingerprint"

    const-string v13, "bank"

    packed-switch v3, :pswitch_data_1

    :cond_6
    :goto_5
    move-object v11, v5

    move-object v12, v11

    :goto_6
    move-object v13, v12

    :goto_7
    move-object v14, v13

    :goto_8
    move-object v15, v14

    :goto_9
    move-object/from16 v16, v15

    move-object/from16 v17, v16

    :goto_a
    move-object/from16 v18, v17

    :goto_b
    move-object/from16 v19, v18

    goto/16 :goto_18

    :pswitch_0
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_11

    sget-object v3, Ly00/h4;->z:Lt83/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, La0/i1;

    const/4 v12, 0x2

    invoke-direct {v11, v3, v12}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_7
    invoke-virtual {v11}, La0/i1;->hasNext()Z

    move-result v3

    const/4 v12, 0x0

    if-eqz v3, :cond_8

    invoke-virtual {v11}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ly00/h4;

    const-string v14, "account_holder_type"

    invoke-static {v14, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    iget-object v13, v13, Ly00/h4;->w:Ljava/lang/String;

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_c

    :cond_8
    move-object v3, v12

    :goto_c
    check-cast v3, Ly00/h4;

    if-nez v3, :cond_9

    sget-object v3, Ly00/h4;->x:Ly00/h4;

    :cond_9
    move-object/from16 v22, v3

    sget-object v3, Ly00/j4;->z:Lt83/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, La0/i1;

    const/4 v13, 0x2

    invoke-direct {v11, v3, v13}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_a
    invoke-virtual {v11}, La0/i1;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v11}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ly00/j4;

    const-string v14, "account_type"

    invoke-static {v14, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    iget-object v13, v13, Ly00/j4;->w:Ljava/lang/String;

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    goto :goto_d

    :cond_b
    move-object v3, v12

    :goto_d
    check-cast v3, Ly00/j4;

    if-nez v3, :cond_c

    sget-object v3, Ly00/j4;->x:Ly00/j4;

    :cond_c
    move-object/from16 v23, v3

    const-string v3, "bank_name"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v24

    const-string v3, "fingerprint"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v25

    const-string v3, "last4"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v26

    const-string v3, "financial_connections_account"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v27

    const-string v3, "networks"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    const-string v13, "preferred"

    invoke-static {v13, v11}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_d

    const-string v12, "supported"

    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    :cond_d
    invoke-static {v12}, Ls/s;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v3

    if-nez v3, :cond_e

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_e
    check-cast v3, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v3, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_f
    new-instance v3, Ly00/k4;

    invoke-direct {v3, v11, v12}, Ly00/k4;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object/from16 v28, v3

    goto :goto_f

    :cond_10
    move-object/from16 v28, v12

    :goto_f
    const-string v3, "routing_number"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v29

    new-instance v21, Ly00/l4;

    invoke-direct/range {v21 .. v29}, Ly00/l4;-><init>(Ly00/h4;Ly00/j4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/k4;Ljava/lang/String;)V

    goto :goto_10

    :cond_11
    move-object/from16 v21, v5

    :goto_10
    move-object v11, v5

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v21

    goto/16 :goto_18

    :pswitch_1
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_12

    new-instance v3, Ly00/d4;

    invoke-static {v13, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ly00/d4;-><init>(Ljava/lang/String;)V

    goto :goto_11

    :cond_12
    move-object v3, v5

    :goto_11
    move-object/from16 v18, v3

    move-object v11, v5

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v19, v17

    goto/16 :goto_18

    :pswitch_2
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v3, "vpa"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    goto/16 :goto_5

    :pswitch_3
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_13

    new-instance v3, Ly00/t3;

    invoke-static {v12, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v13, "sort_code"

    invoke-static {v13, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v12, v11, v1}, Ly00/t3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_13
    move-object v3, v5

    :goto_12
    move-object/from16 v17, v3

    move-object v11, v5

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v18, v16

    goto/16 :goto_b

    :pswitch_4
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_14

    new-instance v3, Ly00/s3;

    const-string v13, "bsb_number"

    invoke-static {v13, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v13, v12, v1}, Ly00/s3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_13

    :cond_14
    move-object v3, v5

    :goto_13
    move-object/from16 v16, v3

    move-object v11, v5

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v17, v15

    goto/16 :goto_a

    :pswitch_5
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_15

    new-instance v13, Ly00/e4;

    const-string v3, "bank_code"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v3, "branch_code"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    const-string v3, "country"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    invoke-static {v12, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    invoke-static {v11, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v13 .. v18}, Ly00/e4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_14

    :cond_15
    move-object v13, v5

    :goto_14
    move-object v11, v5

    move-object v12, v11

    move-object v14, v12

    move-object/from16 v16, v14

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object v15, v13

    move-object/from16 v13, v19

    goto/16 :goto_18

    :pswitch_6
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_16

    new-instance v3, Ly00/b4;

    invoke-static {v13, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "account_holder_type"

    invoke-static {v12, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v11, v1}, Ly00/b4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_15

    :cond_16
    move-object v3, v5

    :goto_15
    move-object v13, v3

    move-object v11, v5

    move-object v12, v11

    move-object v14, v12

    goto/16 :goto_8

    :pswitch_7
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_17

    new-instance v3, Ly00/c4;

    invoke-static {v13, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "bic"

    invoke-static {v12, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v11, v1}, Ly00/c4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_16

    :cond_17
    move-object v3, v5

    :goto_16
    move-object v14, v3

    move-object v11, v5

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    goto/16 :goto_9

    :pswitch_8
    sget-object v1, Ly00/a4;->x:Ly00/a4;

    move-object v12, v1

    move-object v11, v5

    move-object v13, v11

    goto/16 :goto_7

    :pswitch_9
    iget-object v3, v8, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-static {v1}, Ls4/g;->j(Lorg/json/JSONObject;)Ly00/z3;

    move-result-object v1

    goto :goto_17

    :cond_18
    move-object v1, v5

    :goto_17
    move-object v11, v1

    move-object v12, v5

    goto/16 :goto_6

    :goto_18
    if-eqz v4, :cond_1b

    new-instance v3, Ly00/o4;

    const v21, 0x64000

    move-object v1, v5

    move-object v5, v2

    invoke-direct/range {v3 .. v21}, Ly00/o4;-><init>(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ly00/f4;Ly00/v3;Ljava/lang/String;Ly00/z3;Ly00/a4;Ly00/b4;Ly00/c4;Ly00/e4;Ly00/s3;Ly00/t3;Ly00/d4;Ly00/l4;Ly00/r3;I)V

    iget-object v2, v3, Ly00/o4;->H:Ly00/z3;

    if-eqz v2, :cond_19

    iget-object v2, v2, Ly00/z3;->J:La10/j;

    if-eqz v2, :cond_19

    iget-object v5, v2, La10/j;->w:La10/h;

    goto :goto_19

    :cond_19
    move-object v5, v1

    :goto_19
    sget-object v2, La10/h;->I:La10/h;

    if-ne v5, v2, :cond_1a

    const/4 v2, 0x1

    goto :goto_1a

    :cond_1a
    const/4 v2, 0x0

    :goto_1a
    const v4, 0xbffff

    invoke-static {v3, v1, v1, v2, v4}, Ly00/o4;->b(Ly00/o4;Ly00/v3;Ly00/s2;ZI)Ly00/o4;

    move-result-object v1

    return-object v1

    :cond_1b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "PaymentMethod id was null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_a
    new-instance v2, Lz00/a;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lz00/a;-><init>(I)V

    const-string v3, "payment_method"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "getJSONObject(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v2

    const-string v3, "link_payment_details"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "is_link_origin"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1c

    invoke-virtual {v1, v4, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1c

    move v1, v6

    goto :goto_1b

    :cond_1c
    move v1, v7

    :goto_1b
    const-string v4, "CARD"

    const-string v5, "BANK_ACCOUNT"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v3, :cond_1d

    check-cast v4, Ljava/lang/Iterable;

    const-string v8, "type"

    invoke-static {v8, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_20

    :cond_1d
    if-eqz v3, :cond_1e

    invoke-static {v3}, Lz00/a;->f(Lorg/json/JSONObject;)Ly00/c0;

    move-result-object v3

    goto :goto_1c

    :cond_1e
    move-object v3, v5

    :goto_1c
    instance-of v4, v3, Ly00/a0;

    if-eqz v4, :cond_1f

    new-instance v8, Ly00/r2;

    check-cast v3, Ly00/a0;

    iget-object v9, v3, Ly00/a0;->F:Ljava/lang/String;

    iget v10, v3, Ly00/a0;->J:I

    iget v11, v3, Ly00/a0;->I:I

    iget-object v12, v3, Ly00/a0;->z:Ljava/lang/String;

    iget-object v13, v3, Ly00/a0;->K:Ly00/i;

    iget-object v3, v3, Ly00/a0;->N:Ly00/z;

    iget-object v14, v3, Ly00/z;->w:Ljava/lang/String;

    invoke-direct/range {v8 .. v14}, Ly00/r2;-><init>(Ljava/lang/String;IILjava/lang/String;Ly00/i;Ljava/lang/String;)V

    goto :goto_1e

    :cond_1f
    instance-of v4, v3, Ly00/x;

    if-eqz v4, :cond_20

    new-instance v8, Ly00/q2;

    check-cast v3, Ly00/x;

    iget-object v4, v3, Ly00/x;->G:Ljava/lang/String;

    iget-object v3, v3, Ly00/x;->z:Ljava/lang/String;

    invoke-direct {v8, v4, v3}, Ly00/q2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1e

    :cond_20
    instance-of v4, v3, Ly00/b0;

    if-nez v4, :cond_22

    if-nez v3, :cond_21

    goto :goto_1d

    :cond_21
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_22
    :goto_1d
    move-object v8, v5

    :goto_1e
    if-eqz v1, :cond_23

    if-nez v8, :cond_23

    goto :goto_1f

    :cond_23
    move v6, v7

    :goto_1f
    const v1, 0x9ffff

    invoke-static {v2, v5, v8, v6, v1}, Ly00/o4;->b(Ly00/o4;Ly00/v3;Ly00/s2;ZI)Ly00/o4;

    move-result-object v5

    :goto_20
    return-object v5

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
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

.method public final m(Lorg/json/JSONObject;)Lvy/b;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lz00/a;->w:I

    packed-switch v2, :pswitch_data_0

    invoke-virtual/range {p0 .. p1}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual/range {p0 .. p1}, Lz00/a;->c(Lorg/json/JSONObject;)Ly00/l3;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v2, Ly00/a8;

    const-string v3, "app_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v3, "nonce_str"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v3, "package"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "partner_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v3, "prepay_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v3, "timestamp"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v3, "sign"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v4, Ly00/k8;

    const/4 v5, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v13}, Ly00/k8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ly00/a8;-><init>(Ly00/k8;)V

    return-object v2

    :pswitch_2
    new-instance v2, Ly00/z7;

    const-string v3, "arrival_date"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    const-string v5, "hosted_verification_url"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "optString(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Ly00/y2;->z:Lt83/b;

    invoke-virtual {v6}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ly00/y2;

    iget-object v8, v8, Ly00/y2;->w:Ljava/lang/String;

    const-string v9, "microdeposit_type"

    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_0
    check-cast v7, Ly00/y2;

    if-nez v7, :cond_2

    sget-object v7, Ly00/y2;->x:Ly00/y2;

    :cond_2
    invoke-direct {v2, v3, v4, v5, v7}, Ly00/z7;-><init>(JLjava/lang/String;Ly00/y2;)V

    return-object v2

    :pswitch_3
    sget-object v0, Ly00/y7;->w:Ly00/y7;

    return-object v0

    :pswitch_4
    new-instance v2, Ly00/x7;

    const-string v3, "mobile_auth_url"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "optString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Ly00/x7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_5
    const-string v2, "type"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "stripe_3ds2_fingerprint"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v4, Ly00/v7;

    const-string v2, "three_d_secure_2_source"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "optString(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "directory_server_name"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "server_transaction_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "directory_server_encryption"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_3

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :cond_3
    const-string v8, "root_certificate_authorities"

    invoke-virtual {v3, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-static {v8}, Ls/s;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v8

    sget-object v9, Lm83/y;->w:Lm83/y;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v10, v9

    :cond_4
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Ljava/lang/String;

    if-eqz v12, :cond_4

    check-cast v10, Ljava/util/Collection;

    invoke-static {v11, v10}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v10

    goto :goto_1

    :cond_5
    if-eqz v10, :cond_6

    move-object v9, v10

    :cond_6
    new-instance v8, Ly00/u7;

    const-string v10, "directory_server_id"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "certificate"

    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "key_id"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v10, v11, v9, v2}, Ly00/u7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v2, "three_d_secure_2_intent"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "publishable_key"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    invoke-direct/range {v4 .. v10}, Ly00/v7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/u7;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const-string v0, "intent_confirmation_challenge"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v4, Ly00/s7;->w:Ly00/s7;

    goto :goto_2

    :cond_8
    const/4 v4, 0x0

    :goto_2
    return-object v4

    :pswitch_6
    const-string v2, "url"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v3, Ly00/r7;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string v4, "parse(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "return_url"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ly00/r7;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    const/4 v3, 0x0

    :goto_3
    return-object v3

    :pswitch_7
    new-instance v2, Ly00/p7;

    const-string v3, "hosted_instructions_url"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ly00/p7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_8
    new-instance v2, Ly00/o7;

    const-string v3, "hosted_instructions_url"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ly00/o7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_9
    new-instance v2, Ly00/n7;

    const-string v3, "expires_after"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "number"

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "hosted_voucher_url"

    invoke-static {v5, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Ly00/n7;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_a
    new-instance v2, Ly00/m7;

    const-string v3, "hosted_voucher_url"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ly00/m7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_b
    new-instance v2, Ly00/l7;

    const-string v3, "hosted_voucher_url"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ly00/l7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_c
    new-instance v2, Ly00/k7;

    const-string v3, "hosted_voucher_url"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ly00/k7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_d
    new-instance v2, Ly00/j7;

    const-string v3, "mobile_auth_url"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "optString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Ly00/j7;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_e
    sget-object v0, Ly00/i7;->w:Ly00/i7;

    return-object v0

    :pswitch_f
    new-instance v2, Ly00/h7;

    const-string v3, "native_data"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "url"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "return_url"

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "alipay://url?"

    const/4 v7, 0x0

    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v8

    const-string v9, "https"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v4

    const-string v8, "stripe.com"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    if-eqz v4, :cond_b

    const-string v8, ".stripe.com"

    invoke-static {v4, v8, v9}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_b
    move v4, v9

    :goto_4
    if-eqz v4, :cond_d

    :cond_c
    const/4 v9, 0x1

    :cond_d
    :goto_5
    if-eqz v9, :cond_e

    goto :goto_6

    :cond_e
    move-object v0, v7

    goto :goto_6

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_6
    instance-of v4, v0, Ll83/m;

    if-eqz v4, :cond_f

    goto :goto_7

    :cond_f
    move-object v7, v0

    :goto_7
    check-cast v7, Ljava/lang/String;

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v4, "parse(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v7, v0, v6}, Ly00/h7;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    return-object v2

    :pswitch_10
    new-instance v2, Ly00/a3;

    new-instance v3, Ly00/z2;

    const-string v4, "card_brand_choice"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v4, "eligible"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {v3, v0}, Ly00/z2;-><init>(Z)V

    invoke-direct {v2, v3}, Ly00/a3;-><init>(Ly00/z2;)V

    return-object v2

    :pswitch_11
    new-instance v2, Ly00/f2;

    const-string v3, "client_secret"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "id"

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ly00/f2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_12
    invoke-static {v0}, Lz00/a;->b(Lorg/json/JSONObject;)Ly00/t0;

    move-result-object v0

    return-object v0

    :pswitch_13
    const-string v2, "object"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "customer"

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_10

    goto/16 :goto_10

    :cond_10
    const-string v3, "id"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v3, "default_source"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v3, "shipping"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_12

    const-string v5, "address"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_11

    const-string v8, "city"

    invoke-static {v8, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    const-string v8, "country"

    invoke-static {v8, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v8, "line1"

    invoke-static {v8, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v8, "line2"

    invoke-static {v8, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v8, "postal_code"

    invoke-static {v8, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v8, "state"

    invoke-static {v8, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    new-instance v9, Ly00/c;

    invoke-direct/range {v9 .. v15}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_11
    move-object v9, v4

    :goto_8
    const-string v5, "name"

    invoke-static {v5, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "phone"

    invoke-static {v8, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    new-instance v8, Ly00/i6;

    invoke-direct {v8, v9, v5, v3}, Ly00/i6;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_12
    move-object v8, v4

    :goto_9
    const-string v3, "sources"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_1b

    const-string v9, "list"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    const-string v2, "has_more"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-virtual {v3, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v2, 0x1

    goto :goto_a

    :cond_13
    move v2, v5

    :goto_a
    const-string v9, "total_count"

    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_14

    goto :goto_b

    :cond_14
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_b
    const-string v9, "url"

    invoke-static {v9, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "data"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_15

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    :cond_15
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v10

    invoke-static {v5, v10}, Le93/b;->i0(II)Li93/j;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v10, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_c
    move-object v12, v10

    check-cast v12, Li93/i;

    iget-boolean v12, v12, Li93/i;->y:Z

    if-eqz v12, :cond_16

    move-object v12, v10

    check-cast v12, Lm83/e0;

    invoke-virtual {v12}, Lm83/e0;->nextInt()I

    move-result v12

    invoke-virtual {v3, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_16
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_17
    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lorg/json/JSONObject;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v11}, Lz00/a;->b(Lorg/json/JSONObject;)Ly00/t0;

    move-result-object v11

    if-eqz v11, :cond_17

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_18
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ly00/t0;

    invoke-virtual {v12}, Ly00/t0;->b()Ly00/h8;

    move-result-object v12

    sget-object v13, Ly00/h8;->y:Ly00/h8;

    if-ne v12, v13, :cond_19

    goto :goto_e

    :cond_19
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1a
    move-object v11, v4

    move-object v12, v9

    move-object v9, v10

    move v10, v2

    goto :goto_f

    :cond_1b
    sget-object v10, Lm83/y;->w:Lm83/y;

    move-object v11, v4

    move-object v12, v11

    move-object v9, v10

    move v10, v5

    :goto_f
    new-instance v2, Ly00/q0;

    const-string v3, "description"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v3, "email"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v3, "livemode"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v15

    move-object v5, v2

    invoke-direct/range {v5 .. v15}, Ly00/q0;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/i6;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v4, v5

    :goto_10
    return-object v4

    :pswitch_14
    const-string v2, "id"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x0

    if-nez v4, :cond_1c

    goto/16 :goto_19

    :cond_1c
    const-string v3, "created"

    invoke-static {v3, v0}, Ls/s;->s(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_2b

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-string v3, "expires_at"

    invoke-static {v3, v0}, Ls/s;->s(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    move-result-object v7

    const-string v3, "livemode"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_1d

    invoke-virtual {v0, v3, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1d

    const/4 v9, 0x1

    :cond_1d
    move v8, v9

    const-string v3, "payment_intent_id"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v3, "payment_method_preview"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_25

    const-string v10, "type"

    invoke-static {v10, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    if-eqz v10, :cond_24

    sget-object v12, Ly00/f4;->G:Lt9/c0;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Lt9/c0;->k(Ljava/lang/String;)Ly00/f4;

    move-result-object v18

    if-nez v18, :cond_1e

    goto :goto_14

    :cond_1e
    const-string v10, "allow_redisplay"

    invoke-static {v10, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_21

    sget-object v12, Ly00/r3;->F:Lt83/b;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, La0/i1;

    const/4 v14, 0x2

    invoke-direct {v13, v12, v14}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_1f
    invoke-virtual {v13}, La0/i1;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_20

    invoke-virtual {v13}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ly00/r3;

    iget-object v14, v14, Ly00/r3;->w:Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1f

    goto :goto_11

    :cond_20
    move-object v12, v11

    :goto_11
    check-cast v12, Ly00/r3;

    move-object v14, v12

    goto :goto_12

    :cond_21
    move-object v14, v11

    :goto_12
    const-string v10, "billing_details"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    if-eqz v10, :cond_22

    invoke-static {v10}, Ls4/b;->y(Lorg/json/JSONObject;)Ly00/v3;

    move-result-object v10

    move-object v15, v10

    goto :goto_13

    :cond_22
    move-object v15, v11

    :goto_13
    const-string v10, "card"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    if-eqz v10, :cond_23

    invoke-static {v10}, Ls4/g;->j(Lorg/json/JSONObject;)Ly00/z3;

    move-result-object v11

    :cond_23
    move-object/from16 v16, v11

    const-string v10, "customer"

    invoke-static {v10, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v10, "toString(...)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Ly00/t;

    move-object/from16 v19, v3

    invoke-direct/range {v13 .. v19}, Ly00/t;-><init>(Ly00/r3;Ly00/v3;Ly00/z3;Ljava/lang/String;Ly00/f4;Ljava/lang/String;)V

    move-object v11, v13

    :cond_24
    :goto_14
    move-object v10, v11

    goto :goto_15

    :cond_25
    move-object v10, v2

    :goto_15
    const-string v3, "return_url"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v3, "setup_future_usage"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_28

    sget-object v12, Ly00/o;->G:Lt83/b;

    invoke-virtual {v12}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_26
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_27

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Ly00/o;

    iget-object v14, v14, Ly00/o;->w:Ljava/lang/String;

    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_26

    goto :goto_16

    :cond_27
    move-object v13, v2

    :goto_16
    check-cast v13, Ly00/o;

    move-object v12, v13

    goto :goto_17

    :cond_28
    move-object v12, v2

    :goto_17
    const-string v3, "setup_intent_id"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v3, "shipping"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2a

    const-string v3, "address"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_29

    const-string v2, "city"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    const-string v2, "country"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    const-string v2, "line1"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    const-string v2, "line2"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    const-string v2, "postal_code"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v19

    const-string v2, "state"

    invoke-static {v2, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v20

    new-instance v14, Ly00/c;

    invoke-direct/range {v14 .. v20}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v14

    :cond_29
    const-string v3, "name"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v14, "phone"

    invoke-static {v14, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    new-instance v14, Ly00/i6;

    invoke-direct {v14, v2, v3, v0}, Ly00/i6;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_18

    :cond_2a
    move-object v14, v2

    :goto_18
    new-instance v3, Ly00/u;

    invoke-direct/range {v3 .. v14}, Ly00/u;-><init>(Ljava/lang/String;JLjava/lang/Long;ZLjava/lang/String;Ly00/t;Ljava/lang/String;Ly00/o;Ljava/lang/String;Ly00/i6;)V

    move-object v2, v3

    :cond_2b
    :goto_19
    return-object v2

    :pswitch_15
    invoke-virtual/range {p0 .. p1}, Lz00/a;->a(Lorg/json/JSONObject;)Ly00/b;

    move-result-object v0

    return-object v0

    :pswitch_16
    const-string v2, "payment_method"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_1a

    :cond_2c
    new-instance v2, Ly00/h6;

    const-string v3, "id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "toString(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v0}, Ly00/h6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    :goto_1a
    return-object v0

    :pswitch_17
    invoke-virtual/range {p0 .. p1}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v0

    return-object v0

    :pswitch_18
    new-instance v2, Ly00/k2;

    const-string v3, "id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "client_secret"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v0}, Ly00/k2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_19
    const-string v2, "shipping_addresses"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_2d

    goto/16 :goto_1e

    :cond_2d
    const/4 v3, 0x0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-static {v3, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2e
    :goto_1b
    move-object v5, v3

    check-cast v5, Li93/i;

    iget-boolean v5, v5, Li93/i;->y:Z

    if-eqz v5, :cond_31

    move-object v5, v3

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v6, "id"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "is_default"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    const-string v8, "address"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_2f

    move-object v8, v2

    goto :goto_1d

    :cond_2f
    new-instance v8, Ly00/j0;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v9, "name"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v9, "line_1"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v9, "line_2"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v9, "locality"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    const-string v9, "administrative_area"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v9, "postal_code"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    const-string v9, "country_code"

    invoke-static {v9, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_30

    new-instance v9, Lcom/stripe/android/core/model/CountryCode;

    invoke-direct {v9, v5}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v9

    goto :goto_1c

    :cond_30
    move-object/from16 v17, v2

    :goto_1c
    new-instance v10, Ly00/y;

    invoke-direct/range {v10 .. v17}, Ly00/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    invoke-direct {v8, v6, v7, v10, v2}, Ly00/j0;-><init>(Ljava/lang/String;ZLy00/y;Ljava/lang/String;)V

    :goto_1d
    if-eqz v8, :cond_2e

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_31
    new-instance v2, Ly00/k0;

    invoke-direct {v2, v4}, Ly00/k0;-><init>(Ljava/util/ArrayList;)V

    :goto_1e
    return-object v2

    :pswitch_1a
    invoke-static {v0}, Lz00/b;->a(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerSession;

    move-result-object v2

    const-string v3, "publishable_key"

    invoke-static {v3, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_32

    new-instance v3, Lcom/stripe/android/model/ConsumerSessionSignup;

    invoke-direct {v3, v2, v0}, Lcom/stripe/android/model/ConsumerSessionSignup;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V

    goto :goto_1f

    :cond_32
    const/4 v3, 0x0

    :goto_1f
    return-object v3

    :pswitch_1b
    const-string v2, "payment_method"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_33

    const/4 v0, 0x0

    goto :goto_20

    :cond_33
    new-instance v2, Lz00/a;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lz00/a;-><init>(I)V

    invoke-virtual {v2, v0}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v0

    new-instance v2, Ly00/h0;

    invoke-direct {v2, v0}, Ly00/h0;-><init>(Ly00/o4;)V

    move-object v0, v2

    :goto_20
    return-object v0

    :pswitch_1c
    const-string v2, "redacted_payment_details"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_36

    const/4 v0, 0x0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v0, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_21
    move-object v4, v0

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_34

    move-object v4, v0

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_21

    :cond_34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_35
    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_38

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lz00/a;->f(Lorg/json/JSONObject;)Ly00/c0;

    move-result-object v3

    if-eqz v3, :cond_35

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_36
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_37

    invoke-static {v0}, Lz00/a;->f(Lorg/json/JSONObject;)Ly00/c0;

    move-result-object v0

    if-eqz v0, :cond_37

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_23

    :cond_37
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_38
    :goto_23
    new-instance v2, Ly00/d0;

    invoke-direct {v2, v0}, Ly00/d0;-><init>(Ljava/util/List;)V

    return-object v2

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
