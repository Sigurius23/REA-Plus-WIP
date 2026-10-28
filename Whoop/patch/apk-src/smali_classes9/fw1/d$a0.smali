.class final Lfw1/d$a0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->v(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lfw1/c;",
        "previousDomainResult",
        "currentDomainResult",
        "<anonymous>",
        "(Lfw1/c;Lfw1/c;)Lfw1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$2"
    f = "ExtensionsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfw1/d$a0;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lfw1/c;Lfw1/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/c;",
            "Lfw1/c;",
            "Lq83/d<",
            "-",
            "Lfw1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfw1/d$a0;

    invoke-direct {v0, p3}, Lfw1/d$a0;-><init>(Lq83/d;)V

    iput-object p1, v0, Lfw1/d$a0;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfw1/d$a0;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfw1/d$a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfw1/c;

    check-cast p2, Lfw1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfw1/d$a0;->f(Lfw1/c;Lfw1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lfw1/d$a0;->x:Ljava/lang/Object;

    check-cast v1, Lfw1/c;

    iget-object v2, v0, Lfw1/d$a0;->y:Ljava/lang/Object;

    check-cast v2, Lfw1/c;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfw1/d$a0;->w:I

    if-nez v3, :cond_d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v2, Lfw1/a;

    if-eqz v3, :cond_8

    instance-of v3, v1, Lfw1/a;

    if-eqz v3, :cond_8

    move-object v4, v2

    check-cast v4, Lfw1/a;

    invoke-virtual {v4}, Lfw1/a;->l()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->l()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v2

    :cond_0
    move-object v8, v2

    invoke-virtual {v4}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v2

    if-nez v2, :cond_1

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->f()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object v2

    :cond_1
    move-object v9, v2

    invoke-virtual {v4}, Lfw1/a;->g()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->g()Ljava/util/List;

    move-result-object v2

    :cond_2
    move-object v10, v2

    check-cast v10, Ljava/util/List;

    invoke-virtual {v4}, Lfw1/a;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v2

    :goto_0
    move-object v11, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lfw1/a;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v2

    goto :goto_0

    :goto_1
    invoke-virtual {v4}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_4

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->i()Ljava/lang/String;

    move-result-object v2

    :cond_4
    move-object v7, v2

    invoke-virtual {v4}, Lfw1/a;->k()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v2

    if-nez v2, :cond_5

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->k()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v2

    :cond_5
    move-object v12, v2

    invoke-virtual {v4}, Lfw1/a;->j()Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_6

    move-object v2, v1

    check-cast v2, Lfw1/a;

    invoke-virtual {v2}, Lfw1/a;->j()Ljava/util/Map;

    move-result-object v2

    :cond_6
    move-object v13, v2

    invoke-virtual {v4}, Lfw1/a;->h()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    check-cast v1, Lfw1/a;

    invoke-virtual {v1}, Lfw1/a;->h()Ljava/lang/String;

    move-result-object v2

    :cond_7
    move-object v14, v2

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v16}, Lfw1/a;->d(Lfw1/a;ZZLjava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Ljava/util/List;Lcom/whoop/payments/domain/models/Card;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lfw1/a;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v3, v2, Lfw1/f;

    if-eqz v3, :cond_9

    instance-of v3, v1, Lfw1/f;

    if-eqz v3, :cond_9

    move-object v4, v2

    check-cast v4, Lfw1/f;

    check-cast v1, Lfw1/f;

    invoke-virtual {v1}, Lfw1/f;->h()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v9

    invoke-virtual {v1}, Lfw1/f;->j()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lfw1/f;->e()Lcom/whoop/payments/domain/models/Card;

    move-result-object v11

    invoke-virtual {v1}, Lfw1/f;->g()Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x10f

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    invoke-static/range {v4 .. v15}, Lfw1/f;->d(Lfw1/f;ZZLcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lfw1/f;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v3, v2, Lfw1/e;

    if-eqz v3, :cond_c

    instance-of v3, v1, Lfw1/e;

    if-eqz v3, :cond_c

    move-object v4, v2

    check-cast v4, Lfw1/e;

    invoke-virtual {v4}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v2

    if-nez v2, :cond_a

    move-object v2, v1

    check-cast v2, Lfw1/e;

    invoke-virtual {v2}, Lfw1/e;->e()Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;

    move-result-object v2

    :cond_a
    move-object v7, v2

    invoke-virtual {v4}, Lfw1/e;->h()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    check-cast v1, Lfw1/e;

    invoke-virtual {v1}, Lfw1/e;->h()Ljava/lang/String;

    move-result-object v2

    :cond_b
    move-object v8, v2

    const/16 v12, 0x73

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v13}, Lfw1/e;->d(Lfw1/e;ZZLcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingResponse;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;ZILjava/lang/Object;)Lfw1/e;

    move-result-object v1

    return-object v1

    :cond_c
    return-object v2

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
