.class public final Lux/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/List;

.field public static final g:Ljava/util/List;

.field public static final h:Ljava/lang/Object;


# instance fields
.field public final a:Lcd/a;

.field public final b:Z

.field public final c:Ljava/util/List;

.field public final d:Lux/a;

.field public final e:Lux/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v0, "PAN_ONLY"

    const-string v1, "CRYPTOGRAM_3DS"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lux/q;->f:Ljava/util/List;

    const-string v0, "AMEX"

    const-string v1, "DISCOVER"

    const-string v2, "MASTERCARD"

    const-string v3, "VISA"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    sput-object v4, Lux/q;->g:Ljava/util/List;

    sget-object v4, Ly00/i;->Q:Ly00/i;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ly00/i;->R:Ly00/i;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ly00/i;->P:Ly00/i;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ly00/i;->O:Ly00/i;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ly00/i;->S:Ly00/i;

    new-instance v3, Ll83/k;

    const-string v6, "JCB"

    invoke-direct {v3, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lux/q;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcd/a;Ljava/util/List;Lux/a;Lux/b;I)V
    .locals 6

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 7
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v3, p2

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lux/q;-><init>(Lcd/a;ZLjava/util/List;Lux/a;Lux/b;)V

    return-void
.end method

.method public constructor <init>(Lcd/a;ZLjava/util/List;Lux/a;Lux/b;)V
    .locals 1

    const-string v0, "additionalEnabledNetworks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lux/q;->a:Lcd/a;

    .line 3
    iput-boolean p2, p0, Lux/q;->b:Z

    .line 4
    iput-object p3, p0, Lux/q;->c:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lux/q;->d:Lux/a;

    .line 6
    iput-object p5, p0, Lux/q;->e:Lux/b;

    return-void
.end method

.method public static c(Lux/q;Lux/p;Lux/k;Lux/j;ZLjava/lang/Boolean;)Lorg/json/JSONObject;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "transactionInfo"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lux/k;->w:Ljava/lang/String;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "apiVersion"

    const/4 v6, 0x2

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "apiVersionMinor"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v4

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    move-object/from16 v7, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p5

    invoke-virtual {v7, v8, v9, v6}, Lux/q;->a(Lux/j;Ljava/lang/Boolean;Z)Lorg/json/JSONObject;

    move-result-object v7

    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v5

    const-string v7, "allowedPaymentMethods"

    invoke-virtual {v4, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    iget-object v7, v0, Lux/p;->w:Ljava/lang/String;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "toUpperCase(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "currencyCode"

    invoke-virtual {v5, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v5

    iget-object v9, v0, Lux/p;->x:Lux/o;

    iget-object v9, v9, Lux/o;->w:Ljava/lang/String;

    const-string v11, "totalPriceStatus"

    invoke-virtual {v5, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v5

    iget-object v9, v0, Lux/p;->y:Ljava/lang/String;

    if-eqz v9, :cond_0

    invoke-virtual {v9, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "countryCode"

    invoke-virtual {v5, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v9, v0, Lux/p;->z:Ljava/lang/String;

    if-eqz v9, :cond_1

    const-string v11, "transactionId"

    invoke-virtual {v5, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v9, v0, Lux/p;->E:Ljava/lang/Long;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v7

    const-string v8, "getInstance(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lk40/a;->a(Ljava/util/Currency;)I

    move-result v8

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "format(...)"

    const/16 v14, 0x23

    if-nez v8, :cond_3

    move v8, v6

    :goto_0
    if-ge v8, v9, :cond_2

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    new-instance v8, Ljava/text/DecimalFormat;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v10}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    invoke-virtual {v8, v7}, Ljava/text/DecimalFormat;->setCurrency(Ljava/util/Currency;)V

    invoke-virtual {v8, v6}, Ljava/text/DecimalFormat;->setGroupingUsed(Z)V

    invoke-virtual {v8, v11, v12}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    sub-int v15, v9, v8

    :goto_1
    if-ge v6, v15, :cond_4

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    const/16 v6, 0x30

    if-gt v9, v8, :cond_5

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    const/16 v9, 0x2e

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_6
    const-wide/high16 v14, 0x4024000000000000L    # 10.0

    int-to-double v8, v8

    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    long-to-double v11, v11

    div-double/2addr v11, v8

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v6}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object v6

    new-instance v8, Ljava/text/DecimalFormat;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v6}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    invoke-virtual {v8, v7}, Ljava/text/DecimalFormat;->setCurrency(Ljava/util/Currency;)V

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Ljava/text/DecimalFormat;->setGroupingUsed(Z)V

    invoke-virtual {v8, v11, v12}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    const-string v7, "totalPrice"

    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    iget-object v6, v0, Lux/p;->F:Ljava/lang/String;

    if-eqz v6, :cond_8

    const-string v7, "totalPriceLabel"

    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    iget-object v0, v0, Lux/p;->G:Lux/n;

    if-eqz v0, :cond_9

    const-string v6, "checkoutOption"

    iget-object v0, v0, Lux/n;->w:Ljava/lang/String;

    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    const-string v0, "apply(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "emailRequired"

    move/from16 v4, p4

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "merchantName"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_b
    :goto_4
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    iget-object v1, v1, Lux/k;->x:Lux/m;

    iget-object v1, v1, Lux/m;->w:Lux/l;

    iget-object v1, v1, Lux/l;->w:Ljava/lang/String;

    const-string v4, "id"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "version"

    const-string v4, "22.6.1"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "softwareInfo"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "merchantInfo"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method


# virtual methods
.method public final a(Lux/j;Ljava/lang/Boolean;Z)Lorg/json/JSONObject;
    .locals 6

    iget-object v0, p0, Lux/q;->c:Ljava/util/List;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lux/q;->b:Z

    const-string v4, "JCB"

    sget-object v5, Lux/q;->g:Ljava/util/List;

    if-eqz p3, :cond_2

    check-cast v5, Ljava/util/Collection;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    if-eqz v3, :cond_0

    move-object v2, p3

    :cond_0
    if-eqz v2, :cond_1

    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    :cond_1
    invoke-static {v5, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p3

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p3, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p3

    goto :goto_1

    :cond_2
    check-cast v5, Ljava/util/Collection;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    if-eqz v3, :cond_3

    move-object v2, p3

    :cond_3
    if-eqz v2, :cond_4

    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    :cond_4
    invoke-static {v5, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p3

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p3, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lux/q;->h:Ljava/lang/Object;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/i;

    if-nez v2, :cond_6

    sget-object v2, Ly00/i;->X:Ly00/i;

    :cond_6
    iget-object v3, p0, Lux/q;->d:Lux/a;

    invoke-interface {v3, v2}, Lux/a;->o(Ly00/i;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    move-object p3, v0

    :goto_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONArray;

    sget-object v2, Lux/q;->f:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v2, "allowedAuthMethods"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string p3, "allowedCardNetworks"

    invoke-virtual {v0, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p3

    const-string v0, "put(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_8

    iget-boolean v1, p1, Lux/j;->w:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_8

    const-string v1, "billingAddressRequired"

    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "phoneNumberRequired"

    iget-boolean v3, p1, Lux/j;->y:Z

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    iget-object p1, p1, Lux/j;->x:Lux/i;

    iget-object p1, p1, Lux/i;->w:Ljava/lang/String;

    const-string v2, "format"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "billingAddressParameters"

    invoke-virtual {p3, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    sget-object p1, Ly00/j;->y:Ly00/j;

    iget-object v1, p0, Lux/q;->e:Lux/b;

    invoke-interface {v1, p1}, Lux/b;->F(Ly00/j;)Z

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    and-int/2addr p1, p2

    const-string p2, "allowCreditCards"

    invoke-virtual {p3, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    sget-object p1, Ly00/j;->E:Ly00/j;

    invoke-interface {v1, p1}, Lux/b;->F(Ly00/j;)Z

    move-result p1

    const-string p2, "allowPrepaidCards"

    invoke-virtual {p3, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string p2, "CARD"

    const-string v1, "type"

    invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "parameters"

    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object p3, p0, Lux/q;->a:Lcd/a;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "PAYMENT_GATEWAY"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "gateway"

    const-string v4, "stripe"

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p3, Lcd/a;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StripeAndroid/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "stripe:version"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p3, Lcd/a;->c:Ljava/lang/String;

    iget-object p3, p3, Lcd/a;->b:Ljava/lang/String;

    if-eqz p3, :cond_a

    const-string v4, "/"

    invoke-static {v3, v4, p3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_9

    goto :goto_2

    :cond_9
    move-object v3, p3

    :cond_a
    :goto_2
    const-string p3, "stripe:publishableKey"

    invoke-virtual {v2, p3, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "tokenizationSpecification"

    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Lux/j;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "apiVersion"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "apiVersionMinor"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {p0, p1, p3, v2}, Lux/q;->a(Lux/j;Ljava/lang/Boolean;Z)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object p1

    const-string p3, "allowedPaymentMethods"

    invoke-virtual {v0, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p3, "existingPaymentMethodRequired"

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p2, "apply(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
