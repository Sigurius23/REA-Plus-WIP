.class final Lj92/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj92/k;->i(Lcom/whoop/domain/model/Session;Lud3/x0;)Lud3/o0;
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
    c = "com.whoop.service.network.interceptor.OauthTokenRefresher$handleRefresh$1"
    f = "OauthTokenRefresher.kt"
    l = {
        0x33
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lj92/k;

.field final synthetic y:Lud3/x0;

.field final synthetic z:Lcom/whoop/domain/model/Session;


# direct methods
.method public constructor <init>(Lj92/k;Lud3/x0;Lcom/whoop/domain/model/Session;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj92/k;",
            "Lud3/x0;",
            "Lcom/whoop/domain/model/Session;",
            "Lq83/d<",
            "-",
            "Lj92/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj92/k$a;->x:Lj92/k;

    iput-object p2, p0, Lj92/k$a;->y:Lud3/x0;

    iput-object p3, p0, Lj92/k$a;->z:Lcom/whoop/domain/model/Session;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lj92/k$a;

    iget-object v0, p0, Lj92/k$a;->x:Lj92/k;

    iget-object v1, p0, Lj92/k$a;->y:Lud3/x0;

    iget-object v2, p0, Lj92/k$a;->z:Lcom/whoop/domain/model/Session;

    invoke-direct {p1, v0, v1, v2, p2}, Lj92/k$a;-><init>(Lj92/k;Lud3/x0;Lcom/whoop/domain/model/Session;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj92/k$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj92/k$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj92/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj92/k$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj92/k$a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {p1}, Lj92/k;->e(Lj92/k;)Ltr2/n;

    move-result-object p1

    iget-object v1, p0, Lj92/k$a;->y:Lud3/x0;

    iget-object v1, v1, Lud3/x0;->w:Lud3/o0;

    iget-object v1, v1, Lud3/o0;->a:Lud3/e0;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "handleRefresh from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {p1}, Lj92/k;->f(Lj92/k;)Ll83/h;

    move-result-object p1

    invoke-interface {p1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj92/p;

    iget-object v1, p0, Lj92/k$a;->z:Lcom/whoop/domain/model/Session;

    iget-object v4, p0, Lj92/k$a;->y:Lud3/x0;

    iput v3, p0, Lj92/k$a;->w:I

    invoke-virtual {p1, v1, v4, p0}, Lj92/p;->j(Lcom/whoop/domain/model/Session;Lud3/x0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lj92/s;

    invoke-virtual {p1}, Lj92/s;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lj92/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {p1}, Lj92/k;->e(Lj92/k;)Ltr2/n;

    move-result-object p1

    const-string v0, "Refresh failed, signing user out"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {p1}, Lj92/k;->g(Lj92/k;)Ll83/h;

    move-result-object p1

    invoke-interface {p1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lod1/a0;

    invoke-interface {p1}, Lod1/a0;->a()V

    :cond_3
    return-object v1

    :cond_4
    iget-object v0, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {v0}, Lj92/k;->e(Lj92/k;)Ltr2/n;

    move-result-object v0

    const-string v4, "Refresh success"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v4, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lj92/s;->c()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {v0}, Lj92/k;->c(Lj92/k;)Lbc3/c0;

    move-result-object v0

    new-instance v2, Lj92/k$a$a;

    iget-object v4, p0, Lj92/k$a;->x:Lj92/k;

    invoke-direct {v2, v4, v1}, Lj92/k$a$a;-><init>(Lj92/k;Lq83/d;)V

    const/4 v4, 0x3

    invoke-static {v0, v1, v1, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Lj92/k$a;->x:Lj92/k;

    invoke-static {v0}, Lj92/k;->c(Lj92/k;)Lbc3/c0;

    move-result-object v0

    new-instance v2, Lj92/k$a$b;

    iget-object v5, p0, Lj92/k$a;->x:Lj92/k;

    invoke-direct {v2, v5, v1}, Lj92/k$a$b;-><init>(Lj92/k;Lq83/d;)V

    invoke-static {v0, v1, v1, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    iget-object v0, p0, Lj92/k$a;->y:Lud3/x0;

    iget-object v0, v0, Lud3/x0;->w:Lud3/o0;

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    sget-object v1, Lj92/i;->F:Lj92/i$a;

    invoke-virtual {v1}, Lj92/i$a;->c()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {p1}, Lj92/s;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Bearer %s"

    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Authorization"

    invoke-virtual {v0, v1, p1}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1
.end method
