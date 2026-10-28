.class final Lso0/a$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso0/a;->o(Lro0/a$c;)Lec3/l;
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
    c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$fetchProactiveAnimation$1"
    f = "ProactiveInteractor.kt"
    l = {
        0x33,
        0x35,
        0x39,
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lro0/a$c;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lso0/a;


# direct methods
.method public constructor <init>(Lso0/a;Lro0/a$c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso0/a;",
            "Lro0/a$c;",
            "Lq83/d<",
            "-",
            "Lso0/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lso0/a$f;->z:Lso0/a;

    iput-object p2, p0, Lso0/a$f;->E:Lro0/a$c;

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

    new-instance v0, Lso0/a$f;

    iget-object v1, p0, Lso0/a$f;->z:Lso0/a;

    iget-object v2, p0, Lso0/a$f;->E:Lro0/a$c;

    invoke-direct {v0, v1, v2, p2}, Lso0/a$f;-><init>(Lso0/a;Lro0/a$c;Lq83/d;)V

    iput-object p1, v0, Lso0/a$f;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lso0/a$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lso0/a$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lso0/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lso0/a$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lso0/a$f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lso0/a$f;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lso0/a$f;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lso0/a$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coacheverywhere/domain/models/ProactiveResponse;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lro0/b$c;->a:Lro0/b$c;

    iput-object v1, p0, Lso0/a$f;->y:Ljava/lang/Object;

    iput v6, p0, Lso0/a$f;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    :try_start_1
    iget-object p1, p0, Lso0/a$f;->z:Lso0/a;

    invoke-static {p1}, Lso0/a;->h(Lso0/a;)Lcom/whoop/coacheverywhere/domain/ProactiveApi;

    move-result-object p1

    iget-object v0, p0, Lso0/a$f;->E:Lro0/a$c;

    invoke-virtual {v0}, Lro0/a$c;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lso0/a$f;->E:Lro0/a$c;

    invoke-virtual {v6}, Lro0/a$c;->a()Ljava/lang/String;

    move-result-object v6

    iput-object v1, p0, Lso0/a$f;->y:Ljava/lang/Object;

    iput v5, p0, Lso0/a$f;->x:I

    invoke-interface {p1, v0, v6, p0}, Lcom/whoop/coacheverywhere/domain/ProactiveApi;->getProactiveAnimation(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast p1, Lcom/whoop/coacheverywhere/domain/models/ProactiveResponse;

    new-instance v0, Lro0/b$f;

    invoke-virtual {p1}, Lcom/whoop/coacheverywhere/domain/models/ProactiveResponse;->getProactiveAnimation()Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;->getOnLoadStyle()Lep0/f;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/coacheverywhere/domain/models/ProactiveResponse;->getProactiveAnimation()Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;->getLoadStyle()Lep0/g;

    move-result-object p1

    invoke-direct {v0, v5, p1}, Lro0/b$f;-><init>(Lep0/f;Lep0/g;)V

    iput-object v1, p0, Lso0/a$f;->y:Ljava/lang/Object;

    iput-object v7, p0, Lso0/a$f;->w:Ljava/lang/Object;

    iput v4, p0, Lso0/a$f;->x:I

    invoke-interface {v1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v2, :cond_7

    goto :goto_3

    :goto_2
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p1, p0, Lso0/a$f;->z:Lso0/a;

    invoke-static {p1}, Lso0/a;->g(Lso0/a;)Ltr2/n;

    move-result-object v10

    const/16 v12, 0xa

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    sget-object p1, Lro0/b$b;->a:Lro0/b$b;

    iput-object v7, p0, Lso0/a$f;->y:Ljava/lang/Object;

    iput-object v7, p0, Lso0/a$f;->w:Ljava/lang/Object;

    iput v3, p0, Lso0/a$f;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
