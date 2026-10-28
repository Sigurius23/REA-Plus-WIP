.class final Llo2/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llo2/c;->b(Lec3/l;Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Llo2/a;",
        "previousState",
        "Llo2/b;",
        "combinedResult",
        "<anonymous>",
        "(Llo2/a;Llo2/b;)Llo2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.checkout.domain.interactors.combiner.UniversalCheckoutResultCombiner$combine$2"
    f = "UniversalCheckoutResultCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Llo2/c;


# direct methods
.method public constructor <init>(Llo2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo2/c;",
            "Lq83/d<",
            "-",
            "Llo2/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llo2/c$c;->z:Llo2/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Llo2/a;Llo2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo2/a;",
            "Llo2/b;",
            "Lq83/d<",
            "-",
            "Llo2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llo2/c$c;

    iget-object v1, p0, Llo2/c$c;->z:Llo2/c;

    invoke-direct {v0, v1, p3}, Llo2/c$c;-><init>(Llo2/c;Lq83/d;)V

    iput-object p1, v0, Llo2/c$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Llo2/c$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Llo2/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llo2/a;

    check-cast p2, Llo2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Llo2/c$c;->f(Llo2/a;Llo2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Llo2/c$c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llo2/a;

    iget-object v0, p0, Llo2/c$c;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Llo2/b;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llo2/c$c;->w:I

    if-nez v0, :cond_e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llo2/b;->b()Lko2/c;

    move-result-object p1

    invoke-virtual {p1}, Lko2/c;->o()Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    invoke-virtual {v6}, Llo2/b;->a()Ljo2/b;

    move-result-object v4

    invoke-virtual {v4}, Ljo2/b;->d()Z

    move-result v4

    invoke-virtual {v6}, Llo2/b;->a()Ljo2/b;

    move-result-object v5

    invoke-virtual {v5}, Ljo2/b;->e()Z

    move-result v5

    sget-object v7, Lmn2/b;->Companion:Lmn2/b$a;

    invoke-virtual {v6}, Llo2/b;->b()Lko2/c;

    move-result-object v8

    invoke-virtual {v8}, Lko2/c;->p()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lmn2/b$a;->a(Ljava/lang/String;)Lmn2/b;

    move-result-object v7

    invoke-virtual {v7}, Lmn2/b;->isInAppJoinFlow()Z

    move-result v7

    if-eqz v3, :cond_1

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    move v2, v0

    :goto_1
    if-nez v2, :cond_3

    if-eqz v3, :cond_2

    if-eqz v7, :cond_2

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move v3, v0

    goto :goto_3

    :cond_3
    :goto_2
    move v3, v4

    :goto_3
    if-eqz v3, :cond_4

    invoke-virtual {v1}, Llo2/a;->c()Z

    move-result v5

    if-nez v5, :cond_4

    move v5, v4

    goto :goto_4

    :cond_4
    move v5, v0

    :goto_4
    invoke-virtual {v1}, Llo2/a;->d()Z

    move-result v7

    if-nez v7, :cond_5

    if-eqz v5, :cond_5

    move v5, v4

    goto :goto_5

    :cond_5
    move v5, v0

    :goto_5
    const/4 v7, 0x0

    if-eqz v5, :cond_7

    iget-object v8, p0, Llo2/c$c;->z:Llo2/c;

    invoke-static {v8}, Llo2/c;->a(Llo2/c;)Lho2/a;

    move-result-object v8

    new-instance v9, Lpo2/a$l0;

    invoke-virtual {v6}, Llo2/b;->b()Lko2/c;

    move-result-object v10

    invoke-virtual {v10}, Lko2/c;->p()Ljava/lang/String;

    move-result-object v10

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->getAnalyticsPayload()Ljava/util/Map;

    move-result-object v11

    if-eqz v11, :cond_6

    invoke-static {v11}, Lu82/h;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    goto :goto_6

    :cond_6
    move-object v11, v7

    :goto_6
    invoke-direct {v9, v10, v11}, Lpo2/a$l0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v8, v9}, Lho2/a;->a(Lpo2/a$a;)V

    :cond_7
    invoke-virtual {v1}, Llo2/a;->e()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-virtual {v6}, Llo2/b;->a()Ljo2/b;

    move-result-object v8

    invoke-virtual {v8}, Ljo2/b;->e()Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v8, p0, Llo2/c$c;->z:Llo2/c;

    invoke-static {v8}, Llo2/c;->a(Llo2/c;)Lho2/a;

    move-result-object v8

    new-instance v9, Lpo2/a$f0;

    invoke-virtual {v6}, Llo2/b;->b()Lko2/c;

    move-result-object v10

    invoke-virtual {v10}, Lko2/c;->p()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Llo2/b;->a()Ljo2/b;

    move-result-object v11

    invoke-virtual {v11}, Ljo2/b;->c()Ljava/lang/String;

    move-result-object v11

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->getAnalyticsPayload()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {p1}, Lu82/h;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    :cond_8
    invoke-direct {v9, v10, v11, v7}, Lpo2/a$f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v8, v9}, Lho2/a;->a(Lpo2/a$a;)V

    :cond_9
    invoke-virtual {v1}, Llo2/a;->c()Z

    move-result p1

    if-nez p1, :cond_b

    if-eqz v3, :cond_a

    goto :goto_7

    :cond_a
    move v3, v0

    goto :goto_8

    :cond_b
    :goto_7
    move v3, v4

    :goto_8
    invoke-virtual {v1}, Llo2/a;->d()Z

    move-result p1

    if-nez p1, :cond_d

    if-eqz v5, :cond_c

    goto :goto_9

    :cond_c
    move v4, v0

    :cond_d
    :goto_9
    invoke-virtual {v6}, Llo2/b;->a()Ljo2/b;

    move-result-object p1

    invoke-virtual {p1}, Ljo2/b;->e()Z

    move-result v5

    invoke-virtual/range {v1 .. v6}, Llo2/a;->a(ZZZZLlo2/b;)Llo2/a;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
