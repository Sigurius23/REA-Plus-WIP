.class final Lgi2/c$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi2/c;->interact(Lec3/l;)Lec3/l;
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
        "Lgi2/a;",
        "accumulator",
        "Lgi2/d;",
        "currentDomainResult",
        "<anonymous>",
        "(Lgi2/a;Lgi2/d;)Lgi2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.strava.domain.StravaDomainInteractor$interact$2"
    f = "StravaDomainInteractor.kt"
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
            "Lgi2/c$g;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lgi2/a;Lgi2/d;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/a;",
            "Lgi2/d;",
            "Lq83/d<",
            "-",
            "Lgi2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lgi2/c$g;

    invoke-direct {v0, p3}, Lgi2/c$g;-><init>(Lq83/d;)V

    iput-object p1, v0, Lgi2/c$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lgi2/c$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lgi2/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgi2/a;

    check-cast p2, Lgi2/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lgi2/c$g;->f(Lgi2/a;Lgi2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lgi2/c$g;->x:Ljava/lang/Object;

    check-cast v1, Lgi2/a;

    iget-object v2, v0, Lgi2/c$g;->y:Ljava/lang/Object;

    check-cast v2, Lgi2/d;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lgi2/c$g;->w:I

    if-nez v3, :cond_11

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v2, Lgi2/d$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-static {v1, v5, v2, v4, v5}, Lgi2/a;->b(Lgi2/a;Ljava/util/List;Lgi2/d;ILjava/lang/Object;)Lgi2/a;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v2, Lgi2/d$b;

    if-eqz v3, :cond_1

    invoke-static {v1, v5, v2, v4, v5}, Lgi2/a;->b(Lgi2/a;Ljava/util/List;Lgi2/d;ILjava/lang/Object;)Lgi2/a;

    move-result-object v1

    return-object v1

    :cond_1
    sget-object v3, Lgi2/d$c;->a:Lgi2/d$c;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v5, v2, v4, v5}, Lgi2/a;->b(Lgi2/a;Ljava/util/List;Lgi2/d;ILjava/lang/Object;)Lgi2/a;

    move-result-object v1

    return-object v1

    :cond_2
    sget-object v3, Lgi2/d$d;->a:Lgi2/d$d;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1, v5, v2, v4, v5}, Lgi2/a;->b(Lgi2/a;Ljava/util/List;Lgi2/d;ILjava/lang/Object;)Lgi2/a;

    move-result-object v1

    return-object v1

    :cond_3
    instance-of v3, v2, Lgi2/d$g;

    if-eqz v3, :cond_4

    invoke-static {v1, v5, v2, v4, v5}, Lgi2/a;->b(Lgi2/a;Ljava/util/List;Lgi2/d;ILjava/lang/Object;)Lgi2/a;

    move-result-object v1

    return-object v1

    :cond_4
    sget-object v3, Lgi2/d$h;->a:Lgi2/d$h;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v5, v2, v4, v5}, Lgi2/a;->b(Lgi2/a;Ljava/util/List;Lgi2/d;ILjava/lang/Object;)Lgi2/a;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v3, v2, Lgi2/d$f;

    if-eqz v3, :cond_6

    new-instance v1, Lgi2/a;

    move-object v3, v2

    check-cast v3, Lgi2/d$f;

    invoke-virtual {v3}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v3

    invoke-virtual {v3}, Lhi2/b;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Lgi2/a;-><init>(Ljava/util/List;Lgi2/d;)V

    return-object v1

    :cond_6
    instance-of v3, v2, Lgi2/d$e;

    if-eqz v3, :cond_9

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v3

    instance-of v3, v3, Lgi2/d$f;

    if-eqz v3, :cond_8

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v3

    check-cast v3, Lgi2/d$f;

    invoke-virtual {v3}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v5

    check-cast v2, Lgi2/d$e;

    invoke-virtual {v2}, Lgi2/d$e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v2}, Lgi2/d$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    :goto_0
    move v8, v4

    goto :goto_1

    :cond_7
    const/4 v4, 0x0

    goto :goto_0

    :goto_1
    const/16 v19, 0x1ff9

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v5 .. v20}, Lhi2/b;->b(Lhi2/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZILjava/lang/Object;)Lhi2/b;

    move-result-object v2

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v3

    check-cast v3, Lgi2/d$f;

    invoke-virtual {v3, v2}, Lgi2/d$f;->a(Lhi2/b;)Lgi2/d$f;

    move-result-object v2

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v2

    :goto_2
    new-instance v3, Lgi2/a;

    invoke-virtual {v1}, Lgi2/a;->d()Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1, v2}, Lgi2/a;-><init>(Ljava/util/List;Lgi2/d;)V

    return-object v3

    :cond_9
    instance-of v3, v2, Lgi2/d$j;

    if-eqz v3, :cond_d

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lgi2/a;->d()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lji2/c;

    invoke-virtual {v5}, Lji2/c;->e()Ljava/lang/String;

    move-result-object v4

    move-object v6, v2

    check-cast v6, Lgi2/d$j;

    invoke-virtual {v6}, Lgi2/d$j;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v6}, Lgi2/d$j;->a()Z

    move-result v10

    const/16 v12, 0x2f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lji2/c;->b(Lji2/c;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;ZZILjava/lang/Object;)Lji2/c;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v2

    instance-of v2, v2, Lgi2/d$f;

    if-eqz v2, :cond_c

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v2

    check-cast v2, Lgi2/d$f;

    invoke-virtual {v2}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v4

    const/16 v18, 0x1dfb

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v4 .. v19}, Lhi2/b;->b(Lhi2/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZILjava/lang/Object;)Lhi2/b;

    move-result-object v2

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v1

    check-cast v1, Lgi2/d$f;

    invoke-virtual {v1, v2}, Lgi2/d$f;->a(Lhi2/b;)Lgi2/d$f;

    move-result-object v1

    goto :goto_4

    :cond_c
    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v1

    :goto_4
    new-instance v2, Lgi2/a;

    invoke-direct {v2, v14, v1}, Lgi2/a;-><init>(Ljava/util/List;Lgi2/d;)V

    return-object v2

    :cond_d
    instance-of v3, v2, Lgi2/d$i;

    if-eqz v3, :cond_10

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lgi2/a;->d()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lji2/c;

    move-object v4, v2

    check-cast v4, Lgi2/d$i;

    invoke-virtual {v4}, Lgi2/d$i;->a()Z

    move-result v10

    const/16 v12, 0x2f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lji2/c;->b(Lji2/c;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;ZZILjava/lang/Object;)Lji2/c;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v3

    instance-of v3, v3, Lgi2/d$f;

    if-eqz v3, :cond_f

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v3

    check-cast v3, Lgi2/d$f;

    invoke-virtual {v3}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v4

    check-cast v2, Lgi2/d$i;

    invoke-virtual {v2}, Lgi2/d$i;->a()Z

    move-result v11

    const/16 v18, 0x1dbb

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v4 .. v19}, Lhi2/b;->b(Lhi2/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZILjava/lang/Object;)Lhi2/b;

    move-result-object v2

    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v1

    check-cast v1, Lgi2/d$f;

    invoke-virtual {v1, v2}, Lgi2/d$f;->a(Lhi2/b;)Lgi2/d$f;

    move-result-object v1

    goto :goto_6

    :cond_f
    invoke-virtual {v1}, Lgi2/a;->c()Lgi2/d;

    move-result-object v1

    :goto_6
    new-instance v2, Lgi2/a;

    invoke-direct {v2, v14, v1}, Lgi2/a;-><init>(Ljava/util/List;Lgi2/d;)V

    return-object v2

    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
