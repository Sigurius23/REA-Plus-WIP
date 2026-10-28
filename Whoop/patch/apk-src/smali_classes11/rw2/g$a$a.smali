.class public final Lrw2/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrw2/g$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lrw2/g;


# direct methods
.method public constructor <init>(Lec3/m;Lrw2/g;)V
    .locals 0

    iput-object p1, p0, Lrw2/g$a$a;->w:Lec3/m;

    iput-object p2, p0, Lrw2/g$a$a;->x:Lrw2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lrw2/g$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lrw2/g$a$a$a;

    iget v1, v0, Lrw2/g$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrw2/g$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrw2/g$a$a$a;

    invoke-direct {v0, p0, p2}, Lrw2/g$a$a$a;-><init>(Lrw2/g$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lrw2/g$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrw2/g$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lrw2/g$a$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    iget-object p1, v0, Lrw2/g$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lrw2/g$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lrw2/g$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lrw2/g$a$a;->w:Lec3/m;

    check-cast p1, Lqw2/a;

    invoke-interface {p1}, Lqw2/a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    instance-of v2, p1, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_6

    iget-object v2, p0, Lrw2/g$a$a;->x:Lrw2/g;

    invoke-static {v2}, Lrw2/g;->c(Lrw2/g;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v2

    const-string v6, "android-arch-v2-preserve-quoted-state-strings"

    invoke-interface {v2, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    move-object v6, p1

    check-cast v6, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;->getState()Ljava/util/Map;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v8, v2}, Lu82/h;->d(Lkotlinx/serialization/json/JsonElement;Z)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object v10, v5

    :goto_2
    if-eqz v10, :cond_3

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-static {v7}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    iget-object v6, p0, Lrw2/g$a$a;->x:Lrw2/g;

    invoke-static {v6}, Lrw2/g;->d(Lrw2/g;)Ltr2/n;

    move-result-object v6

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "STATE_UPDATE patch="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v6, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v6, Lqw2/b$m;

    invoke-direct {v6, v2, p1}, Lqw2/b$m;-><init>(Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;)V

    goto/16 :goto_4

    :cond_6
    instance-of v2, p1, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lrw2/g$a$a;->x:Lrw2/g;

    invoke-static {v2}, Lrw2/g;->d(Lrw2/g;)Ltr2/n;

    move-result-object v2

    move-object v6, p1

    check-cast v6, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StateClearAction;->getKeys()Ljava/util/List;

    move-result-object v7

    const-string v8, "STATE_CLEAR keys="

    invoke-static {v8, v7}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v2, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lqw2/b$l;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StateClearAction;->getKeys()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v2, v6, p1}, Lqw2/b$l;-><init>(Ljava/util/Set;Lcom/whoop/whoopaction/domain/models/Action;)V

    :goto_3
    move-object v6, v2

    goto :goto_4

    :cond_7
    instance-of v2, p1, Lcom/whoop/whoopaction/domain/models/StatePushAction;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lrw2/g$a$a;->x:Lrw2/g;

    invoke-static {v2}, Lrw2/g;->d(Lrw2/g;)Ltr2/n;

    move-result-object v2

    move-object v6, p1

    check-cast v6, Lcom/whoop/whoopaction/domain/models/StatePushAction;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StatePushAction;->getKey()Ljava/lang/String;

    move-result-object v7

    const-string v8, "STATE_PUSH key="

    invoke-static {v8, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v2, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lqw2/b$k;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StatePushAction;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StatePushAction;->getValue()Lkotlinx/serialization/json/JsonElement;

    move-result-object v6

    invoke-direct {v2, v7, v6, p1}, Lqw2/b$k;-><init>(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/whoopaction/domain/models/Action;)V

    goto :goto_3

    :cond_8
    instance-of v2, p1, Lcom/whoop/whoopaction/domain/models/StatePopAction;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lrw2/g$a$a;->x:Lrw2/g;

    invoke-static {v2}, Lrw2/g;->d(Lrw2/g;)Ltr2/n;

    move-result-object v2

    move-object v6, p1

    check-cast v6, Lcom/whoop/whoopaction/domain/models/StatePopAction;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StatePopAction;->getKey()Ljava/lang/String;

    move-result-object v7

    const-string v8, "STATE_POP key="

    invoke-static {v8, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v2, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lqw2/b$j;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/StatePopAction;->getKey()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6, p1}, Lqw2/b$j;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V

    goto :goto_3

    :cond_9
    move-object v6, v5

    :goto_4
    if-eqz v6, :cond_a

    iput-object v5, v0, Lrw2/g$a$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lrw2/g$a$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lrw2/g$a$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lrw2/g$a$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lrw2/g$a$a$a;->H:Ljava/lang/Object;

    iput v4, v0, Lrw2/g$a$a$a;->I:I

    iput v3, v0, Lrw2/g$a$a$a;->x:I

    invoke-interface {p2, v6, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
