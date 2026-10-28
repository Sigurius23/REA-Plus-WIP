.class final Lm70/d$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm70/d;->u(Lm70/a$c;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lm70/b;",
        "<anonymous>",
        "(Lbc3/c0;)Lm70/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$trialOfferCheckout$2"
    f = "PaymentsInteractor.kt"
    l = {
        0x8a,
        0x9d,
        0xa5
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lm70/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lm70/a$c;


# direct methods
.method public constructor <init>(Lm70/a$c;Lm70/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm70/a$c;",
            "Lm70/d;",
            "Lq83/d<",
            "-",
            "Lm70/d$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm70/d$j;->z:Lm70/a$c;

    iput-object p2, p0, Lm70/d$j;->E:Lm70/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lm70/d$j;

    iget-object v0, p0, Lm70/d$j;->z:Lm70/a$c;

    iget-object v1, p0, Lm70/d$j;->E:Lm70/d;

    invoke-direct {p1, v0, v1, p2}, Lm70/d$j;-><init>(Lm70/a$c;Lm70/d;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lm70/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lm70/d$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm70/d$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm70/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm70/d$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lm70/d$j;->y:I

    const-string v9, ""

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v5, Lm70/d$j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v0, v5, Lm70/d$j;->w:Ljava/lang/Object;

    check-cast v0, Lm70/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v0

    move-object/from16 v0, p1

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lm70/d$j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlinx/serialization/json/JsonObject;

    iget-object v0, v5, Lm70/d$j;->w:Ljava/lang/Object;

    check-cast v0, Lm70/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v0

    move-object/from16 v0, p1

    goto/16 :goto_5

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lm70/d$j;->z:Lm70/a$c;

    invoke-virtual {v0}, Lm70/a$c;->j()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v5, Lm70/d$j;->E:Lm70/d;

    iget-object v4, v5, Lm70/d$j;->z:Lm70/a$c;

    invoke-static {v4}, Lm70/e;->a(Lm70/a$c;)Lm70/k;

    move-result-object v4

    iput v3, v5, Lm70/d$j;->y:I

    invoke-static {v0, v4, v5}, Lm70/d;->c(Lm70/d;Lm70/k;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    goto/16 :goto_8

    :cond_4
    :goto_0
    check-cast v0, Lm70/b;

    :goto_1
    move-object v10, v0

    goto :goto_2

    :cond_5
    new-instance v0, Lm70/b$c;

    invoke-direct {v0, v9}, Lm70/b$c;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    instance-of v0, v10, Lm70/b$c;

    if-nez v0, :cond_6

    return-object v10

    :cond_6
    iget-object v0, v5, Lm70/d$j;->E:Lm70/d;

    invoke-static {v0}, Lm70/d;->e(Lm70/d;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    sget-object v4, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    const-string v4, "billing_postal_code"

    const-string v6, "payment_method_id"

    const-string v7, "promo_code"

    const-string v11, "use_default_tax"

    const-string v12, "payload"

    const/4 v13, 0x0

    if-eqz v0, :cond_d

    iget-object v0, v5, Lm70/d$j;->z:Lm70/a$c;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Lm70/a$c;->g()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v14

    const-string v15, "element"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {v0}, Lm70/a$c;->f()Z

    move-result v12

    xor-int/2addr v3, v12

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {v0}, Lm70/a$c;->h()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-static {v3}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    :cond_7
    move-object v3, v10

    check-cast v3, Lm70/b$c;

    invoke-virtual {v3}, Lm70/b$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_8

    goto :goto_3

    :cond_8
    move-object v3, v13

    :goto_3
    if-eqz v3, :cond_9

    invoke-static {v3}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    :cond_9
    invoke-virtual {v0}, Lm70/a$c;->e()Ld70/g;

    move-result-object v0

    invoke-virtual {v0}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_a

    goto :goto_4

    :cond_a
    move-object v0, v13

    :goto_4
    if-eqz v0, :cond_b

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-static {v0, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    :cond_b
    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v5, Lm70/d$j;->E:Lm70/d;

    invoke-static {v3}, Lm70/d;->f(Lm70/d;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lm70/d$j$a;

    iget-object v6, v5, Lm70/d$j;->E:Lm70/d;

    invoke-direct {v4, v6, v0, v13}, Lm70/d$j$a;-><init>(Lm70/d;Lkotlinx/serialization/json/JsonObject;Lq83/d;)V

    iput-object v10, v5, Lm70/d$j;->w:Ljava/lang/Object;

    iput-object v13, v5, Lm70/d$j;->x:Ljava/lang/Object;

    iput v2, v5, Lm70/d$j;->y:I

    const/4 v2, 0x0

    move-object v0, v1

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_c

    goto/16 :goto_8

    :cond_c
    :goto_5
    check-cast v0, Lu02/a;

    goto/16 :goto_a

    :cond_d
    iget-object v0, v5, Lm70/d$j;->z:Lm70/a$c;

    invoke-virtual {v0}, Lm70/a$c;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, v5, Lm70/d$j;->z:Lm70/a$c;

    invoke-virtual {v2}, Lm70/a$c;->f()Z

    move-result v12

    xor-int/2addr v3, v12

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lm70/a$c;->h()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-interface {v0, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    move-object v3, v10

    check-cast v3, Lm70/b$c;

    invoke-virtual {v3}, Lm70/b$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_f

    goto :goto_6

    :cond_f
    move-object v3, v13

    :goto_6
    if-eqz v3, :cond_10

    invoke-interface {v0, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    invoke-virtual {v2}, Lm70/a$c;->e()Ld70/g;

    move-result-object v2

    invoke-virtual {v2}, Ld70/g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_11

    goto :goto_7

    :cond_11
    move-object v2, v13

    :goto_7
    if-eqz v2, :cond_12

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v5, Lm70/d$j;->E:Lm70/d;

    invoke-static {v3}, Lm70/d;->f(Lm70/d;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lm70/d$j$b;

    iget-object v6, v5, Lm70/d$j;->E:Lm70/d;

    invoke-direct {v4, v6, v0, v13}, Lm70/d$j$b;-><init>(Lm70/d;Ljava/util/Map;Lq83/d;)V

    iput-object v10, v5, Lm70/d$j;->w:Ljava/lang/Object;

    iput-object v13, v5, Lm70/d$j;->x:Ljava/lang/Object;

    iput v1, v5, Lm70/d$j;->y:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_13

    :goto_8
    return-object v8

    :cond_13
    :goto_9
    check-cast v0, Lu02/a;

    :goto_a
    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_15

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getType()Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    move-result-object v0

    sget-object v1, Lcom/whoop/membership/extensions/domain/models/ProgressContentType;->SUCCESS:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    if-ne v0, v1, :cond_15

    new-instance v0, Lm70/b$g;

    check-cast v10, Lm70/b$c;

    invoke-virtual {v10}, Lm70/b$c;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_14

    goto :goto_b

    :cond_14
    move-object v9, v1

    :goto_b
    invoke-direct {v0, v9}, Lm70/b$g;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_15
    new-instance v0, Lm70/b$f;

    sget-object v1, Lm70/h$a;->a:Lm70/h$a;

    invoke-direct {v0, v1}, Lm70/b$f;-><init>(Lm70/h;)V

    return-object v0
.end method
