.class final Lso0/a$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso0/a;->q(Lro0/a$d;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lro0/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$markMessageAsSeen$1"
    f = "ProactiveInteractor.kt"
    l = {
        0x6c,
        0x75,
        0x79
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lro0/a$d;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lso0/a;


# direct methods
.method public constructor <init>(Lso0/a;Lro0/a$d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso0/a;",
            "Lro0/a$d;",
            "Lq83/d<",
            "-",
            "Lso0/a$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lso0/a$i;->z:Lso0/a;

    iput-object p2, p0, Lso0/a$i;->E:Lro0/a$d;

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

    new-instance v0, Lso0/a$i;

    iget-object v1, p0, Lso0/a$i;->z:Lso0/a;

    iget-object v2, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-direct {v0, v1, v2, p2}, Lso0/a$i;-><init>(Lso0/a;Lro0/a$d;Lq83/d;)V

    iput-object p1, v0, Lso0/a$i;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lso0/a$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lso0/a$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lso0/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lso0/a$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const-string v0, "Successfully marked message as seen: conversationId="

    iget-object v1, p0, Lso0/a$i;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lso0/a$i;->x:I

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v0, p0, Lso0/a$i;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v6, p1

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lso0/a$i;->z:Lso0/a;

    invoke-static {p1}, Lso0/a;->h(Lso0/a;)Lcom/whoop/coacheverywhere/domain/ProactiveApi;

    move-result-object p1

    iget-object v3, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v3}, Lro0/a$d;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v8, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v8}, Lro0/a$d;->b()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;

    iget-object v10, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v10}, Lro0/a$d;->c()Ljava/lang/Long;

    move-result-object v10

    iget-object v11, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v11}, Lro0/a$d;->d()Ljava/lang/Long;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;-><init>(Ljava/lang/Long;Ljava/lang/Long;)V

    iput-object v1, p0, Lso0/a$i;->y:Ljava/lang/Object;

    iput v7, p0, Lso0/a$i;->x:I

    invoke-interface {p1, v3, v8, v9, p0}, Lcom/whoop/coacheverywhere/domain/ProactiveApi;->markMessageAsSeen(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/coacheverywhere/domain/models/MarkMessageAsSeenRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lso0/a$i;->z:Lso0/a;

    invoke-static {p1}, Lso0/a;->g(Lso0/a;)Ltr2/n;

    move-result-object p1

    iget-object v3, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v3}, Lro0/a$d;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v7, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v7}, Lro0/a$d;->c()Ljava/lang/Long;

    move-result-object v7

    iget-object v8, p0, Lso0/a$i;->E:Lro0/a$d;

    invoke-virtual {v8}, Lro0/a$d;->d()Ljava/lang/Long;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ttfmt="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "ms, ttpia="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "ms"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lro0/b$d;->a:Lro0/b$d;

    iput-object v1, p0, Lso0/a$i;->y:Ljava/lang/Object;

    iput v6, p0, Lso0/a$i;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v2, :cond_5

    goto :goto_2

    :goto_1
    iget-object p1, p0, Lso0/a$i;->z:Lso0/a;

    invoke-static {p1}, Lso0/a;->g(Lso0/a;)Ltr2/n;

    move-result-object p1

    const-string v0, "Failed to mark message as seen, continuing anyway"

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lso0/a$i;->z:Lso0/a;

    invoke-static {p1}, Lso0/a;->g(Lso0/a;)Ltr2/n;

    move-result-object v8

    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    sget-object p1, Lro0/b$d;->a:Lro0/b$d;

    const/4 v0, 0x0

    iput-object v0, p0, Lso0/a$i;->y:Ljava/lang/Object;

    iput-object v0, p0, Lso0/a$i;->w:Ljava/lang/Object;

    iput v5, p0, Lso0/a$i;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_2
    return-object v2

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
