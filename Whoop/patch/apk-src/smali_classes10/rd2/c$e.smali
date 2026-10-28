.class final Lrd2/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd2/c;->g(Lec3/l;)Lec3/l;
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
        "Lrd2/b;",
        "prevDomainState",
        "Lrd2/a;",
        "domainAction",
        "<anonymous>",
        "(Lrd2/b;Lrd2/a;)Lrd2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor$interact$1"
    f = "ShepherdHistoryDetailInteractor.kt"
    l = {
        0x19,
        0x33
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lrd2/c;


# direct methods
.method public constructor <init>(Lrd2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd2/c;",
            "Lq83/d<",
            "-",
            "Lrd2/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrd2/c$e;->z:Lrd2/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lrd2/b;Lrd2/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd2/b;",
            "Lrd2/a;",
            "Lq83/d<",
            "-",
            "Lrd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrd2/c$e;

    iget-object v1, p0, Lrd2/c$e;->z:Lrd2/c;

    invoke-direct {v0, v1, p3}, Lrd2/c$e;-><init>(Lrd2/c;Lq83/d;)V

    iput-object p1, v0, Lrd2/c$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lrd2/c$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lrd2/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrd2/b;

    check-cast p2, Lrd2/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lrd2/c$e;->f(Lrd2/b;Lrd2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lrd2/c$e;->x:Ljava/lang/Object;

    check-cast v0, Lrd2/b;

    iget-object v1, p0, Lrd2/c$e;->y:Ljava/lang/Object;

    check-cast v1, Lrd2/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lrd2/c$e;->w:I

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lrd2/a$d;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lrd2/c$e;->z:Lrd2/c;

    check-cast v1, Lrd2/a$d;

    invoke-virtual {v1}, Lrd2/a$d;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lrd2/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lrd2/c$e;->y:Ljava/lang/Object;

    iput v4, p0, Lrd2/c$e;->w:I

    invoke-static {p1, v0, v1, p0}, Lrd2/c;->b(Lrd2/c;Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lrd2/b;

    return-object p1

    :cond_4
    sget-object p1, Lrd2/a$c;->a:Lrd2/a$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const-string v4, "Clear Date History"

    const-string v6, "ANF"

    if-eqz p1, :cond_5

    iget-object p1, p0, Lrd2/c$e;->z:Lrd2/c;

    invoke-static {p1}, Lrd2/c;->c(Lrd2/c;)Lfi0/a;

    move-result-object p1

    const-string v1, "Click"

    invoke-interface {p1, v6, v1, v4, v6}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lrd2/e$a;->a:Lrd2/e$a;

    invoke-static {v0, p1, v3, v5, v3}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Lrd2/a$b;->a:Lrd2/a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lrd2/e$d;->a:Lrd2/e$d;

    invoke-static {v0, p1, v3, v5, v3}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v1, Lrd2/a$e;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lrd2/c$e;->z:Lrd2/c;

    invoke-static {p1}, Lrd2/c;->c(Lrd2/c;)Lfi0/a;

    move-result-object p1

    const-string v2, "Confirm"

    invoke-interface {p1, v6, v2, v4, v6}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lrd2/e$f;

    check-cast v1, Lrd2/a$e;

    invoke-virtual {v1}, Lrd2/a$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lrd2/e$f;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1, v3, v5, v3}, Lrd2/b;->b(Lrd2/b;Lrd2/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;ILjava/lang/Object;)Lrd2/b;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v1, Lrd2/a$a;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lrd2/c$e;->z:Lrd2/c;

    check-cast v1, Lrd2/a$a;

    invoke-virtual {v1}, Lrd2/a$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lrd2/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lrd2/c$e;->y:Ljava/lang/Object;

    iput v5, p0, Lrd2/c$e;->w:I

    invoke-static {p1, v0, v1, p0}, Lrd2/c;->a(Lrd2/c;Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    :goto_1
    return-object v2

    :cond_8
    :goto_2
    check-cast p1, Lrd2/b;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
