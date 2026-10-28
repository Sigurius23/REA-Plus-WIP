.class final Lam1/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lam1/a;->interact(Lec3/l;)Lec3/l;
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
        "Lam1/b;",
        "state",
        "Lil1/t;",
        "action",
        "<anonymous>",
        "(Lam1/b;Lil1/t;)Lam1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.onboarding.HomeOnboardingInteractor$interact$1"
    f = "HomeOnboardingInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lam1/a;


# direct methods
.method public constructor <init>(Lam1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam1/a;",
            "Lq83/d<",
            "-",
            "Lam1/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lam1/a$a;->z:Lam1/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lam1/b;Lil1/t;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lam1/b;",
            "Lil1/t;",
            "Lq83/d<",
            "-",
            "Lam1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lam1/a$a;

    iget-object v1, p0, Lam1/a$a;->z:Lam1/a;

    invoke-direct {v0, v1, p3}, Lam1/a$a;-><init>(Lam1/a;Lq83/d;)V

    iput-object p1, v0, Lam1/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lam1/a$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lam1/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lam1/b;

    check-cast p2, Lil1/t;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lam1/a$a;->f(Lam1/b;Lil1/t;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lam1/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lam1/b;

    iget-object v1, p0, Lam1/a$a;->y:Ljava/lang/Object;

    check-cast v1, Lil1/t;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lam1/a$a;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lil1/t$a;->a:Lil1/t$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lam1/b;

    iget-object v0, p0, Lam1/a$a;->z:Lam1/a;

    invoke-static {v0}, Lam1/a;->f(Lam1/a;)Z

    move-result v0

    iget-object v1, p0, Lam1/a$a;->z:Lam1/a;

    invoke-static {v1}, Lam1/a;->e(Lam1/a;)Z

    move-result v1

    invoke-direct {p1, v0, v1}, Lam1/b;-><init>(ZZ)V

    return-object p1

    :cond_0
    sget-object p1, Lil1/t$c;->a:Lil1/t$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lam1/a$a;->z:Lam1/a;

    invoke-static {p1}, Lam1/a;->d(Lam1/a;)V

    const/4 p1, 0x2

    invoke-static {v0, v4, v3, p1, v2}, Lam1/b;->b(Lam1/b;ZZILjava/lang/Object;)Lam1/b;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lil1/t$b;->a:Lil1/t$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lam1/a$a;->z:Lam1/a;

    invoke-static {p1}, Lam1/a;->c(Lam1/a;)V

    invoke-static {v0, v3, v4, v4, v2}, Lam1/b;->b(Lam1/b;ZZILjava/lang/Object;)Lam1/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
