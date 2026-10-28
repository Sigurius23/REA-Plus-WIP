.class final Lry1/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b;->A(Lec3/l;)Lec3/l;
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
        "Lry1/a;",
        "domainState",
        "Lry1/b$a;",
        "internalDomainAction",
        "<anonymous>",
        "(Lry1/a;Lry1/b$a;)Lry1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$interact$2"
    f = "MfaChallengeInteractor.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lry1/b;


# direct methods
.method public constructor <init>(Lry1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lry1/b;",
            "Lq83/d<",
            "-",
            "Lry1/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lry1/b$e;->z:Lry1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lry1/a;Lry1/b$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lry1/a;",
            "Lry1/b$a;",
            "Lq83/d<",
            "-",
            "Lry1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lry1/b$e;

    iget-object v1, p0, Lry1/b$e;->z:Lry1/b;

    invoke-direct {v0, v1, p3}, Lry1/b$e;-><init>(Lry1/b;Lq83/d;)V

    iput-object p1, v0, Lry1/b$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lry1/b$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lry1/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lry1/a;

    check-cast p2, Lry1/b$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lry1/b$e;->f(Lry1/a;Lry1/b$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lry1/b$e;->x:Ljava/lang/Object;

    check-cast v0, Lry1/a;

    iget-object v1, p0, Lry1/b$e;->y:Ljava/lang/Object;

    check-cast v1, Lry1/b$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lry1/b$e;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lry1/b$a$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lry1/b$e;->z:Lry1/b;

    check-cast v1, Lry1/b$a$a;

    invoke-static {p1, v0, v1}, Lry1/b;->f(Lry1/b;Lry1/a;Lry1/b$a$a;)Lry1/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Lry1/b$a$b;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lry1/b$e;->z:Lry1/b;

    check-cast v1, Lry1/b$a$b;

    invoke-static {p1, v0, v1}, Lry1/b;->h(Lry1/b;Lry1/a;Lry1/b$a$b;)Lry1/a;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lry1/b$a$c;->a:Lry1/b$a$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lry1/b$e;->z:Lry1/b;

    invoke-static {p1, v0}, Lry1/b;->k(Lry1/b;Lry1/a;)Lry1/a;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v1, Lry1/b$a$d;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lry1/b$e;->z:Lry1/b;

    check-cast v1, Lry1/b$a$d;

    invoke-static {p1, v0, v1}, Lry1/b;->l(Lry1/b;Lry1/a;Lry1/b$a$d;)Lry1/a;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v1, Lry1/b$a$e;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lry1/b$e;->z:Lry1/b;

    check-cast v1, Lry1/b$a$e;

    const/4 v3, 0x0

    iput-object v3, p0, Lry1/b$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lry1/b$e;->y:Ljava/lang/Object;

    iput v4, p0, Lry1/b$e;->w:I

    invoke-static {p1, v0, v1, p0}, Lry1/b;->m(Lry1/b;Lry1/a;Lry1/b$a$e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    return-object v2

    :cond_6
    :goto_0
    check-cast p1, Lry1/a;

    return-object p1

    :cond_7
    sget-object p1, Lry1/b$a$f;->a:Lry1/b$a$f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lry1/b$e;->z:Lry1/b;

    invoke-static {p1, v0}, Lry1/b;->g(Lry1/b;Lry1/a;)Lry1/a;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
