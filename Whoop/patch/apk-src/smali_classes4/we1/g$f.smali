.class final Lwe1/g$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe1/g;->u(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.entitlements.EntitlementsRepository$update$2"
    f = "EntitlementsRepository.kt"
    l = {
        0x5c,
        0x5d,
        0x5f,
        0x70,
        0x73
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lwe1/g;

.field final synthetic K:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe1/g;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwe1/g$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwe1/g$f;->J:Lwe1/g;

    iput-object p2, p0, Lwe1/g$f;->K:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lwe1/g$f;

    iget-object v1, p0, Lwe1/g$f;->J:Lwe1/g;

    iget-object v2, p0, Lwe1/g$f;->K:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lwe1/g$f;-><init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lwe1/g$f;->I:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwe1/g$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwe1/g$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwe1/g$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwe1/g$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    iget-object v0, v1, Lwe1/g$f;->I:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lwe1/g$f;->H:I

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v8, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, v1, Lwe1/g$f;->G:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteException;

    iget-object v0, v1, Lwe1/g$f;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Lwe1/g$f;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v0, v1, Lwe1/g$f;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v0, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/entitlements/EntitlementsResponse;

    iget-object v0, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lwe1/g$f;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v3, v1, Lwe1/g$f;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v3, v1, Lwe1/g$f;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/Set;

    iget-object v3, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/entitlements/EntitlementsResponse;

    iget-object v3, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v3, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    iget-object v0, v1, Lwe1/g$f;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v3, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/entitlements/EntitlementsResponse;

    iget-object v3, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v3, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_2

    :cond_3
    iget-object v0, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/entitlements/EntitlementsResponse;

    iget-object v3, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v7, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    check-cast v7, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object v0, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v3, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Lwe1/g$f$a;

    iget-object v11, v1, Lwe1/g$f;->J:Lwe1/g;

    iget-object v12, v1, Lwe1/g$f;->K:Ljava/lang/String;

    invoke-direct {v3, v11, v12, v10}, Lwe1/g$f$a;-><init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v10, v3, v6}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v3

    new-instance v11, Lwe1/g$f$b;

    iget-object v12, v1, Lwe1/g$f;->J:Lwe1/g;

    invoke-direct {v11, v12, v10}, Lwe1/g$f$b;-><init>(Lwe1/g;Lq83/d;)V

    invoke-static {v0, v10, v11, v6}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iput-object v10, v1, Lwe1/g$f;->I:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    iput-object v0, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    iput v8, v1, Lwe1/g$f;->H:I

    invoke-virtual {v3, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto/16 :goto_8

    :cond_6
    :goto_0
    check-cast v3, Lcom/whoop/entitlements/EntitlementsResponse;

    iget-object v8, v1, Lwe1/g$f;->J:Lwe1/g;

    iput-object v10, v1, Lwe1/g$f;->I:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    iput-object v0, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    iput-object v3, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    iput v7, v1, Lwe1/g$f;->H:I

    invoke-static {v8, v3, v1}, Lwe1/g;->p(Lwe1/g;Lcom/whoop/entitlements/EntitlementsResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_7

    goto/16 :goto_8

    :cond_7
    move-object/from16 v18, v3

    move-object v3, v0

    move-object/from16 v0, v18

    :goto_1
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/entitlements/EntitlementsResponse;->getEntitlements()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_9

    :cond_8
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_9
    iput-object v10, v1, Lwe1/g$f;->I:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    iput-object v0, v1, Lwe1/g$f;->z:Ljava/lang/Object;

    iput v6, v1, Lwe1/g$f;->H:I

    invoke-interface {v3, v1}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    goto/16 :goto_8

    :cond_a
    :goto_2
    check-cast v3, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_b

    iget-object v0, v1, Lwe1/g$f;->J:Lwe1/g;

    invoke-static {v0}, Lwe1/g;->g(Lwe1/g;)Ltr2/n;

    move-result-object v0

    const-string v2, "Failed to get new entries and did not find old entries"

    new-array v3, v9, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_b
    check-cast v0, Ljava/lang/Iterable;

    iget-object v6, v1, Lwe1/g$f;->J:Lwe1/g;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwe1/e;

    new-instance v12, Lwe1/e;

    if-eqz v11, :cond_c

    invoke-virtual {v11}, Lwe1/e;->b()I

    move-result v13

    goto :goto_4

    :cond_c
    move v13, v9

    :goto_4
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/entitlements/EntitlementResponse;

    invoke-virtual {v15}, Lcom/whoop/entitlements/EntitlementResponse;->getEntitled()Z

    move-result v15

    if-eqz v11, :cond_d

    invoke-virtual {v11}, Lwe1/e;->a()Z

    move-result v4

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/entitlements/EntitlementResponse;

    invoke-virtual {v8}, Lcom/whoop/entitlements/EntitlementResponse;->getEntitled()Z

    move-result v8

    if-ne v4, v8, :cond_d

    invoke-virtual {v11}, Lwe1/e;->c()J

    move-result-wide v16

    goto :goto_5

    :cond_d
    invoke-static {v6}, Lwe1/g;->e(Lwe1/g;)Ljava/time/Clock;

    move-result-object v4

    invoke-virtual {v4}, Ljava/time/Clock;->millis()J

    move-result-wide v16

    :goto_5
    invoke-direct/range {v12 .. v17}, Lwe1/e;-><init>(ILjava/lang/String;ZJ)V

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x5

    goto :goto_3

    :cond_e
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    :cond_f
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    :try_start_1
    iget-object v3, v1, Lwe1/g$f;->J:Lwe1/g;

    invoke-static {v3}, Lwe1/g;->f(Lwe1/g;)Lwe1/b;

    move-result-object v3

    iput-object v10, v1, Lwe1/g$f;->I:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->z:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->E:Ljava/lang/Object;

    iput-object v0, v1, Lwe1/g$f;->F:Ljava/lang/Object;

    iput v5, v1, Lwe1/g$f;->H:I

    invoke-interface {v3, v0, v1}, Lwe1/b;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v3, v2, :cond_10

    goto :goto_8

    :cond_10
    :goto_6
    iget-object v2, v1, Lwe1/g$f;->J:Lwe1/g;

    invoke-static {v2}, Lwe1/g;->l(Lwe1/g;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :goto_7
    iget-object v3, v1, Lwe1/g$f;->J:Lwe1/g;

    invoke-static {v3}, Lwe1/g;->g(Lwe1/g;)Ltr2/n;

    move-result-object v3

    const-string v4, "Failed to update entitlements"

    new-array v5, v9, [Lqr2/a$a;

    invoke-interface {v3, v4, v0, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v0, v1, Lwe1/g$f;->J:Lwe1/g;

    iget-object v3, v1, Lwe1/g$f;->K:Ljava/lang/String;

    iput-object v10, v1, Lwe1/g$f;->I:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->w:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->x:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->y:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->z:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->E:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->F:Ljava/lang/Object;

    iput-object v10, v1, Lwe1/g$f;->G:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v1, Lwe1/g$f;->H:I

    invoke-static {v0, v3, v1}, Lwe1/g;->n(Lwe1/g;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_11

    :goto_8
    return-object v2

    :cond_11
    :goto_9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method
