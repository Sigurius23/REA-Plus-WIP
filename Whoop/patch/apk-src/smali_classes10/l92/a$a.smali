.class final Ll92/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll92/a;->a(Lud3/b1;Lud3/x0;)Lud3/o0;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lud3/o0;",
        "<anonymous>",
        "(Lbc3/c0;)Lud3/o0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.network.onboarding.OnboardingAuthTokenRefresher$authenticate$1"
    f = "OnboardingAuthTokenRefresher.kt"
    l = {
        0x76,
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field final synthetic G:Ll92/a;

.field final synthetic H:Lud3/x0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Ll92/a;Lud3/x0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll92/a;",
            "Lud3/x0;",
            "Lq83/d<",
            "-",
            "Ll92/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll92/a$a;->G:Ll92/a;

    iput-object p2, p0, Ll92/a$a;->H:Lud3/x0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Ll92/a$a;

    iget-object v0, p0, Ll92/a$a;->G:Ll92/a;

    iget-object v1, p0, Ll92/a$a;->H:Lud3/x0;

    invoke-direct {p1, v0, v1, p2}, Ll92/a$a;-><init>(Ll92/a;Lud3/x0;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lud3/o0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ll92/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll92/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll92/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll92/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll92/a$a;->F:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ll92/a$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Ll92/a$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Ll92/a$a;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Ll92/a$a;->z:I

    iget-object v3, p0, Ll92/a$a;->y:Ljava/lang/Object;

    check-cast v3, Lud3/x0;

    iget-object v6, p0, Ll92/a$a;->x:Ljava/lang/Object;

    check-cast v6, Ll92/a;

    iget-object v7, p0, Ll92/a$a;->w:Ljava/lang/Object;

    check-cast v7, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v7

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll92/a$a;->G:Ll92/a;

    invoke-static {p1}, Ll92/a;->d(Ll92/a;)Lmc3/a;

    move-result-object p1

    iget-object v6, p0, Ll92/a$a;->G:Ll92/a;

    iget-object v1, p0, Ll92/a$a;->H:Lud3/x0;

    iput-object p1, p0, Ll92/a$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Ll92/a$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Ll92/a$a;->y:Ljava/lang/Object;

    iput v4, p0, Ll92/a$a;->z:I

    iput v3, p0, Ll92/a$a;->F:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v1

    move v1, v4

    :goto_0
    :try_start_1
    invoke-static {v6}, Ll92/a;->b(Ll92/a;)Lj92/a;

    move-result-object v7

    iget-object v8, v3, Lud3/x0;->w:Lud3/o0;

    invoke-virtual {v7, v8}, Lj92/a;->b(Lud3/o0;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6}, Ll92/a;->e(Ll92/a;)Lod1/j;

    move-result-object v8

    invoke-virtual {v8}, Lod1/j;->a()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {v6}, Ll92/a;->c(Ll92/a;)Ltr2/n;

    move-result-object v0

    const-string v1, "Pending token already refreshed by another call; retrying with current token"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, v3, Lud3/x0;->w:Lud3/o0;

    invoke-static {v6, v0, v8}, Ll92/a;->g(Ll92/a;Lud3/o0;Ljava/lang/String;)Lud3/o0;

    move-result-object v0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    goto :goto_5

    :cond_4
    invoke-static {v6}, Ll92/a;->e(Ll92/a;)Lod1/j;

    move-result-object v7

    invoke-virtual {v7}, Lod1/j;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lcom/whoop/domain/model/AuthMaterial;->getRefreshToken()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_5
    move-object v7, v5

    :goto_1
    iput-object p1, p0, Ll92/a$a;->w:Ljava/lang/Object;

    iput-object v5, p0, Ll92/a$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Ll92/a$a;->y:Ljava/lang/Object;

    iput v1, p0, Ll92/a$a;->z:I

    iput v4, p0, Ll92/a$a;->E:I

    iput v2, p0, Ll92/a$a;->F:I

    invoke-static {v6, v7, v3, p0}, Ll92/a;->f(Ll92/a;Ljava/lang/String;Lud3/x0;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v1

    :goto_3
    :try_start_2
    check-cast p1, Lud3/o0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_4
    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :goto_5
    invoke-interface {v0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
