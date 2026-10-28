.class final Ljt2/k$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljt2/k;->interact(Lec3/l;)Lec3/l;
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
        "Ljt2/j;",
        "domainState",
        "Ljt2/p;",
        "internalAction",
        "<anonymous>",
        "(Ljt2/j;Ljt2/p;)Ljt2/j;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeCombiner$interact$2"
    f = "HubAndSpokeCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljt2/k;


# direct methods
.method public constructor <init>(Ljt2/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/k;",
            "Lq83/d<",
            "-",
            "Ljt2/k$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljt2/k$b;->z:Ljt2/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljt2/j;Ljt2/p;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/j;",
            "Ljt2/p;",
            "Lq83/d<",
            "-",
            "Ljt2/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljt2/k$b;

    iget-object v1, p0, Ljt2/k$b;->z:Ljt2/k;

    invoke-direct {v0, v1, p3}, Ljt2/k$b;-><init>(Ljt2/k;Lq83/d;)V

    iput-object p1, v0, Ljt2/k$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Ljt2/k$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljt2/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljt2/j;

    check-cast p2, Ljt2/p;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljt2/k$b;->f(Ljt2/j;Ljt2/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Ljt2/k$b;->x:Ljava/lang/Object;

    check-cast v1, Ljt2/j;

    iget-object v2, v0, Ljt2/k$b;->y:Ljava/lang/Object;

    check-cast v2, Ljt2/p;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Ljt2/k$b;->w:I

    if-nez v3, :cond_1e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v2, Ljt2/p$s;

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    check-cast v2, Ljt2/p$s;

    invoke-virtual {v2}, Ljt2/p$s;->a()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v2

    new-instance v3, Ljt2/m$i;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetadata()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    invoke-direct {v3, v2, v6}, Ljt2/m$i;-><init>(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    iget-object v6, v0, Ljt2/k$b;->z:Ljt2/k;

    new-instance v7, Ljt2/m$i;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetadata()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v5

    :goto_1
    invoke-direct {v7, v2, v8}, Ljt2/m$i;-><init>(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    invoke-static {v1, v7, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v4

    invoke-virtual {v6, v2, v4}, Ljt2/k;->i(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Ljt2/j;)Ljt2/d;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljt2/j;->a(Ljt2/m;Ljt2/d;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v3, v2, Ljt2/p$i;

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    check-cast v2, Ljt2/p$i;

    invoke-virtual {v2}, Ljt2/p$i;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v3

    :goto_2
    move-object v8, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->e()Ljava/util/List;

    move-result-object v3

    goto :goto_2

    :goto_3
    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->r()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v2}, Ljt2/p$i;->a()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->k()Ljava/util/List;

    move-result-object v3

    :goto_4
    move-object/from16 v16, v3

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->q()Ljava/util/List;

    move-result-object v3

    goto :goto_4

    :goto_5
    invoke-virtual {v2}, Ljt2/p$i;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v2

    invoke-virtual {v2}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v2

    :goto_6
    move-object v13, v2

    goto :goto_7

    :cond_5
    invoke-virtual {v1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v2

    invoke-virtual {v2}, Ljt2/d;->p()Ljava/util/List;

    move-result-object v2

    goto :goto_6

    :goto_7
    const v28, 0x1ffdad

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v29}, Ljt2/d;->b(Ljt2/d;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljt2/d;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v5, v2, v3, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v2, Ljt2/p$a;

    if-eqz v3, :cond_7

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->h(Ljt2/k;)Ljt2/n;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/n;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v3, v2, Ljt2/p$r;

    if-eqz v3, :cond_8

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->h(Ljt2/k;)Ljt2/n;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/n;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v3, v2, Ljt2/p$n;

    if-eqz v3, :cond_9

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->h(Ljt2/k;)Ljt2/n;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/n;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v3, v2, Ljt2/p$w;

    if-eqz v3, :cond_a

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->g(Ljt2/k;)Ljt2/o;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/o;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_a
    instance-of v3, v2, Ljt2/p$y;

    if-eqz v3, :cond_b

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->g(Ljt2/k;)Ljt2/o;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/o;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_b
    instance-of v3, v2, Ljt2/p$o;

    if-eqz v3, :cond_c

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->g(Ljt2/k;)Ljt2/o;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/o;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_c
    instance-of v3, v2, Ljt2/p$u;

    if-eqz v3, :cond_d

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->e(Ljt2/k;)Ljt2/e;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/e;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_d
    instance-of v3, v2, Ljt2/p$v;

    if-eqz v3, :cond_e

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->f(Ljt2/k;)Ljt2/g;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/g;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_e
    instance-of v3, v2, Ljt2/p$j;

    if-eqz v3, :cond_f

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->e(Ljt2/k;)Ljt2/e;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/e;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_f
    instance-of v3, v2, Ljt2/p$k;

    if-eqz v3, :cond_10

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->f(Ljt2/k;)Ljt2/g;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/g;->a(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_10
    instance-of v3, v2, Ljt2/p$f;

    if-eqz v3, :cond_11

    sget-object v2, Ljt2/m$d;->a:Ljt2/m$d;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_11
    sget-object v3, Ljt2/p$g;->a:Ljt2/p$g;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    sget-object v2, Ljt2/m$e;->a:Ljt2/m$e;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_12
    sget-object v3, Ljt2/p$q;->a:Ljt2/p$q;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    sget-object v2, Ljt2/m$h;->a:Ljt2/m$h;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_13
    instance-of v3, v2, Ljt2/p$x;

    if-eqz v3, :cond_14

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->d(Ljt2/k;)Ljt2/i;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/i;->g(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_14
    instance-of v3, v2, Ljt2/p$e;

    if-eqz v3, :cond_15

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->d(Ljt2/k;)Ljt2/i;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/i;->g(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_15
    instance-of v3, v2, Ljt2/p$t;

    if-eqz v3, :cond_16

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->d(Ljt2/k;)Ljt2/i;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/i;->g(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_16
    instance-of v3, v2, Ljt2/p$h;

    if-eqz v3, :cond_17

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->d(Ljt2/k;)Ljt2/i;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/i;->g(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_17
    instance-of v3, v2, Ljt2/p$l;

    if-eqz v3, :cond_18

    iget-object v3, v0, Ljt2/k$b;->z:Ljt2/k;

    invoke-static {v3}, Ljt2/k;->d(Ljt2/k;)Ljt2/i;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljt2/i;->g(Ljt2/p;Ljt2/j;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_18
    sget-object v3, Ljt2/p$p;->a:Ljt2/p$p;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    sget-object v2, Ljt2/m$g;->a:Ljt2/m$g;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_19
    sget-object v3, Ljt2/p$m;->a:Ljt2/p$m;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    sget-object v2, Ljt2/m$f;->a:Ljt2/m$f;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_1a
    sget-object v3, Ljt2/p$c;->a:Ljt2/p$c;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    sget-object v2, Ljt2/m$b;->a:Ljt2/m$b;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_1b
    sget-object v3, Ljt2/p$d;->a:Ljt2/p$d;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    sget-object v2, Ljt2/m$c;->a:Ljt2/m$c;

    invoke-static {v1, v2, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_1c
    instance-of v3, v2, Ljt2/p$b;

    if-eqz v3, :cond_1d

    new-instance v3, Ljt2/m$a;

    check-cast v2, Ljt2/p$b;

    invoke-virtual {v2}, Ljt2/p$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljt2/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3, v5, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_1d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
