.class final Lub0/e$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub0/e;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ll83/k;",
        "Lub0/e$a;",
        "Lub0/e$b;",
        "<destruct>",
        "internalAction",
        "<anonymous>",
        "(Ll83/k;Lub0/e$b;)Ll83/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$2"
    f = "EditBiomarkersInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lub0/e;


# direct methods
.method public constructor <init>(Lub0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub0/e;",
            "Lq83/d<",
            "-",
            "Lub0/e$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lub0/e$j;->z:Lub0/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ll83/k;Lub0/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Lub0/e$b;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lub0/e$j;

    iget-object v1, p0, Lub0/e$j;->z:Lub0/e;

    invoke-direct {v0, v1, p3}, Lub0/e$j;-><init>(Lub0/e;Lq83/d;)V

    iput-object p1, v0, Lub0/e$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Lub0/e$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lub0/e$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll83/k;

    check-cast p2, Lub0/e$b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lub0/e$j;->f(Ll83/k;Lub0/e$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lub0/e$j;->x:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    iget-object v1, p0, Lub0/e$j;->y:Ljava/lang/Object;

    check-cast v1, Lub0/e$b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lub0/e$j;->w:I

    if-nez v2, :cond_f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lub0/e$a;

    instance-of p1, v1, Lub0/e$b$b;

    if-eqz p1, :cond_2

    new-instance p1, Ln83/f;

    invoke-direct {p1}, Ln83/f;-><init>()V

    move-object v0, v1

    check-cast v0, Lub0/e$b$b;

    invoke-virtual {v0}, Lub0/e$b$b;->a()Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getBiomarkerId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lub0/b;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getBiomarkerId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getIncluded()Z

    move-result v8

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getValue()Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getUnit()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->getCalculatedFromBiomarkers()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_0

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    :goto_1
    move-object v11, v4

    goto :goto_2

    :cond_0
    sget-object v4, Lm83/a0;->w:Lm83/a0;

    goto :goto_1

    :goto_2
    invoke-direct/range {v6 .. v11}, Lub0/b;-><init>(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {p1, v5, v6}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ln83/f;->b()Ln83/f;

    move-result-object v3

    invoke-virtual {v0}, Lub0/e$b$b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lub0/e$b$b;->c()Z

    move-result v7

    invoke-virtual {v0}, Lub0/e$b$b;->a()Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    move-result-object v6

    move-object v4, v3

    invoke-virtual/range {v2 .. v7}, Lub0/e$a;->a(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lub0/e$a;

    move-result-object p1

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_2
    instance-of p1, v1, Lub0/e$b$c;

    if-eqz p1, :cond_d

    move-object p1, v1

    check-cast p1, Lub0/e$b$c;

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v0

    instance-of v3, v0, Lub0/c$d;

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v3

    check-cast v3, Lub0/c$d;

    invoke-virtual {v3}, Lub0/c$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lub0/b;

    if-eqz v5, :cond_c

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v3

    check-cast v3, Lub0/c$d;

    invoke-virtual {v3}, Lub0/c$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Lub0/b;->e()Z

    move-result v6

    xor-int/lit8 v7, v6, 0x1

    const/16 v11, 0x1d

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lub0/b;->b(Lub0/b;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lub0/b;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lub0/e$j;->z:Lub0/e;

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object p1

    check-cast p1, Lub0/c$d;

    invoke-virtual {p1}, Lub0/c$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lub0/e;->k(Lub0/e;Ljava/util/Map;Ljava/lang/String;)V

    const/16 v8, 0x1d

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v4, v0

    invoke-static/range {v2 .. v9}, Lub0/e$a;->b(Lub0/e$a;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;ZILjava/lang/Object;)Lub0/e$a;

    move-result-object v2

    goto/16 :goto_6

    :cond_3
    instance-of v3, v0, Lub0/c$b;

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v3

    check-cast v3, Lub0/c$b;

    invoke-virtual {v3}, Lub0/c$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lub0/b;

    if-eqz v3, :cond_c

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v4

    check-cast v4, Lub0/c$b;

    invoke-virtual {v4}, Lub0/c$b;->a()Ljava/lang/String;

    move-result-object v11

    const/16 v9, 0x1d

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lub0/b;->b(Lub0/b;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lub0/b;

    move-result-object v3

    invoke-interface {v0, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lub0/e$j;->z:Lub0/e;

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object p1

    check-cast p1, Lub0/c$b;

    invoke-virtual {p1}, Lub0/c$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lub0/e;->k(Lub0/e;Ljava/util/Map;Ljava/lang/String;)V

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v4, v0

    invoke-static/range {v2 .. v9}, Lub0/e$a;->b(Lub0/e$a;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;ZILjava/lang/Object;)Lub0/e$a;

    move-result-object v2

    goto/16 :goto_6

    :cond_4
    instance-of v3, v0, Lub0/c$e;

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object p1

    check-cast p1, Lub0/c$e;

    invoke-virtual {p1}, Lub0/c$e;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub0/b;

    invoke-virtual {v0}, Lub0/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lub0/b;

    if-eqz v5, :cond_7

    invoke-virtual {v0}, Lub0/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lub0/b;->e()Z

    move-result v7

    invoke-virtual {v0}, Lub0/b;->g()Ljava/lang/Double;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lub0/b;->g()Ljava/lang/Double;

    move-result-object v6

    :cond_5
    move-object v8, v6

    invoke-virtual {v0}, Lub0/b;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-virtual {v5}, Lub0/b;->f()Ljava/lang/String;

    move-result-object v0

    :cond_6
    move-object v9, v0

    const/16 v11, 0x11

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lub0/b;->b(Lub0/b;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lub0/b;

    move-result-object v0

    invoke-interface {v4, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lub0/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lub0/e$a;->b(Lub0/e$a;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;ZILjava/lang/Object;)Lub0/e$a;

    move-result-object v2

    goto/16 :goto_6

    :cond_9
    instance-of v0, v0, Lub0/c$f;

    if-eqz v0, :cond_c

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v3

    check-cast v3, Lub0/c$f;

    invoke-virtual {v3}, Lub0/c$f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lub0/b;

    if-eqz v5, :cond_c

    invoke-virtual {v2}, Lub0/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v3

    check-cast v3, Lub0/c$f;

    invoke-virtual {v3}, Lub0/c$f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v6

    check-cast v6, Lub0/c$f;

    invoke-virtual {v6}, Lub0/c$f;->c()Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v6

    check-cast v6, Lub0/c$f;

    invoke-virtual {v6}, Lub0/c$f;->b()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_a

    invoke-virtual {v5}, Lub0/b;->f()Ljava/lang/String;

    move-result-object v6

    :cond_a
    move-object v9, v6

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object v6

    check-cast v6, Lub0/c$f;

    invoke-virtual {v6}, Lub0/c$f;->c()Ljava/lang/Double;

    move-result-object v6

    if-eqz v6, :cond_b

    :goto_4
    move v7, v4

    goto :goto_5

    :cond_b
    const/4 v4, 0x0

    goto :goto_4

    :goto_5
    const/16 v11, 0x11

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lub0/b;->b(Lub0/b;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lub0/b;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lub0/e$j;->z:Lub0/e;

    invoke-virtual {p1}, Lub0/e$b$c;->a()Lub0/c;

    move-result-object p1

    check-cast p1, Lub0/c$f;

    invoke-virtual {p1}, Lub0/c$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lub0/e;->k(Lub0/e;Ljava/util/Map;Ljava/lang/String;)V

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v4, v0

    invoke-static/range {v2 .. v9}, Lub0/e$a;->b(Lub0/e$a;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;ZILjava/lang/Object;)Lub0/e$a;

    move-result-object v2

    :cond_c
    :goto_6
    new-instance p1, Ll83/k;

    invoke-direct {p1, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_d
    instance-of p1, v1, Lub0/e$b$a;

    if-eqz p1, :cond_e

    new-instance p1, Ll83/k;

    invoke-direct {p1, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
