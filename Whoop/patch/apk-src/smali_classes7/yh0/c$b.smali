.class final Lyh0/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyh0/c;->c(Lec3/l;)Lec3/l;
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
        "Lyh0/b;",
        "accumulatedResult",
        "Lyh0/a;",
        "domainAction",
        "<anonymous>",
        "(Lyh0/b;Lyh0/a;)Lyh0/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.amoeba.debug.domain.AmoebaDebugInteractor$interact$1"
    f = "AmoebaDebugInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lyh0/c;


# direct methods
.method public constructor <init>(Lyh0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh0/c;",
            "Lq83/d<",
            "-",
            "Lyh0/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyh0/c$b;->z:Lyh0/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lyh0/b;Lyh0/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh0/b;",
            "Lyh0/a;",
            "Lq83/d<",
            "-",
            "Lyh0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lyh0/c$b;

    iget-object v1, p0, Lyh0/c$b;->z:Lyh0/c;

    invoke-direct {v0, v1, p3}, Lyh0/c$b;-><init>(Lyh0/c;Lq83/d;)V

    iput-object p1, v0, Lyh0/c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lyh0/c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lyh0/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyh0/b;

    check-cast p2, Lyh0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lyh0/c$b;->f(Lyh0/b;Lyh0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lyh0/c$b;->x:Ljava/lang/Object;

    check-cast v1, Lyh0/b;

    iget-object v2, v0, Lyh0/c$b;->y:Ljava/lang/Object;

    check-cast v2, Lyh0/a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lyh0/c$b;->w:I

    if-nez v3, :cond_9

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v2, Lyh0/a$a;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v1, v0, Lyh0/c$b;->z:Lyh0/c;

    invoke-static {v1}, Lyh0/c;->b(Lyh0/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v2, "amoeba-debug-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v5, Lyh0/b$c;

    sget-object v1, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v1, v4}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v7

    const/16 v10, 0xd

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_0
    sget-object v1, Lyh0/b$a;->a:Lyh0/b$a;

    return-object v1

    :cond_1
    instance-of v3, v2, Lyh0/a$e;

    if-eqz v3, :cond_3

    instance-of v3, v1, Lyh0/b$c;

    if-eqz v3, :cond_2

    check-cast v1, Lyh0/b$c;

    invoke-virtual {v1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v3

    check-cast v2, Lyh0/a$e;

    invoke-virtual {v2}, Lyh0/a$e;->a()F

    move-result v5

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lyh0/e;->b(Lyh0/e;FFZILjava/lang/Object;)Lyh0/e;

    move-result-object v10

    invoke-virtual {v1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v12

    sget-object v1, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v2}, Lyh0/a$e;->a()F

    move-result v2

    invoke-virtual {v1, v2}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v11

    new-instance v9, Lyh0/b$c;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_2
    new-instance v1, Lyh0/b$c;

    new-instance v3, Lyh0/e;

    check-cast v2, Lyh0/a$e;

    invoke-virtual {v2}, Lyh0/a$e;->a()F

    move-result v5

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lyh0/e;-><init>(FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v2}, Lyh0/a$e;->a()F

    move-result v2

    invoke-virtual {v4, v2}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    invoke-direct/range {v1 .. v7}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of v3, v2, Lyh0/a$c;

    if-eqz v3, :cond_5

    instance-of v3, v1, Lyh0/b$c;

    if-eqz v3, :cond_4

    check-cast v1, Lyh0/b$c;

    invoke-virtual {v1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v3

    check-cast v2, Lyh0/a$c;

    invoke-virtual {v2}, Lyh0/a$c;->a()F

    move-result v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lyh0/e;->b(Lyh0/e;FFZILjava/lang/Object;)Lyh0/e;

    move-result-object v10

    invoke-virtual {v1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v12

    sget-object v2, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v1

    invoke-virtual {v1}, Lyh0/e;->d()F

    move-result v1

    invoke-virtual {v2, v1}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v11

    new-instance v9, Lyh0/b$c;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_4
    new-instance v1, Lyh0/b$c;

    new-instance v5, Lyh0/e;

    check-cast v2, Lyh0/a$c;

    invoke-virtual {v2}, Lyh0/a$c;->a()F

    move-result v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lyh0/e;-><init>(FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v5

    sget-object v3, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v3, v4}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    instance-of v3, v2, Lyh0/a$b;

    if-eqz v3, :cond_7

    new-instance v5, Lyh0/e;

    sget-object v2, Lc51/n;->l:Lc51/n$a;

    invoke-virtual {v2}, Lc51/n$a;->b()Li93/f;

    move-result-object v3

    invoke-static {v3}, Ld51/e;->d(Li93/f;)F

    move-result v6

    invoke-virtual {v2}, Lc51/n$a;->a()Li93/f;

    move-result-object v2

    invoke-static {v2}, Ld51/e;->d(Li93/f;)F

    move-result v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lyh0/e;-><init>(FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    instance-of v2, v1, Lyh0/b$c;

    if-eqz v2, :cond_6

    check-cast v1, Lyh0/b$c;

    invoke-virtual {v1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v1

    sget-object v2, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v5}, Lyh0/e;->d()F

    move-result v3

    invoke-virtual {v2, v3}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v2

    new-instance v3, Lyh0/b$c;

    const/4 v4, 0x1

    invoke-direct {v3, v5, v2, v1, v4}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;Z)V

    return-object v3

    :cond_6
    move-object v6, v5

    new-instance v5, Lyh0/b$c;

    sget-object v1, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v6}, Lyh0/e;->d()F

    move-result v2

    invoke-virtual {v1, v2}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v7

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_7
    instance-of v1, v2, Lyh0/a$d;

    if-eqz v1, :cond_8

    new-instance v5, Lyh0/b$c;

    new-instance v6, Lyh0/e;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct/range {v6 .. v11}, Lyh0/e;-><init>(FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v1, v4}, Lyh0/c$a;->b(F)Lyh0/d;

    move-result-object v7

    const/16 v10, 0xc

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lyh0/b$c;-><init>(Lyh0/e;Lyh0/d;Lyh0/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
