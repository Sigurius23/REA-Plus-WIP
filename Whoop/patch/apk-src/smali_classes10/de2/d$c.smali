.class final Lde2/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde2/d;->f(Lec3/l;)Lec3/l;
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
        "Lde2/c;",
        "prevDomainState",
        "Lde2/b;",
        "domainAction",
        "<anonymous>",
        "(Lde2/c;Lde2/b;)Lde2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.shepherd.feature.terms.domain.ShepherdTermsOfUseInteractor$interact$1"
    f = "ShepherdTermsOfUseInteractor.kt"
    l = {
        0x17
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lde2/d;


# direct methods
.method public constructor <init>(Lde2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde2/d;",
            "Lq83/d<",
            "-",
            "Lde2/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lde2/d$c;->z:Lde2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lde2/c;Lde2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde2/c;",
            "Lde2/b;",
            "Lq83/d<",
            "-",
            "Lde2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lde2/d$c;

    iget-object v1, p0, Lde2/d$c;->z:Lde2/d;

    invoke-direct {v0, v1, p3}, Lde2/d$c;-><init>(Lde2/d;Lq83/d;)V

    iput-object p1, v0, Lde2/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lde2/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lde2/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde2/c;

    check-cast p2, Lde2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lde2/d$c;->f(Lde2/c;Lde2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lde2/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lde2/c;

    iget-object v1, p0, Lde2/d$c;->y:Ljava/lang/Object;

    check-cast v1, Lde2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lde2/d$c;->w:I

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

    sget-object p1, Lde2/b$a;->a:Lde2/b$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lde2/d$c;->z:Lde2/d;

    const/4 v1, 0x0

    iput-object v1, p0, Lde2/d$c;->x:Ljava/lang/Object;

    iput-object v1, p0, Lde2/d$c;->y:Ljava/lang/Object;

    iput v4, p0, Lde2/d$c;->w:I

    invoke-static {p1, v0, p0}, Lde2/d;->a(Lde2/d;Lde2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lde2/c;

    return-object p1

    :cond_3
    instance-of p1, v1, Lde2/b$b;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lde2/d$c;->z:Lde2/d;

    check-cast v1, Lde2/b$b;

    invoke-virtual {v1}, Lde2/b$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lde2/b$b;->b()Z

    move-result v1

    invoke-static {p1, v0, v2, v1}, Lde2/d;->c(Lde2/d;Lde2/c;Ljava/lang/String;Z)Lde2/c;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
