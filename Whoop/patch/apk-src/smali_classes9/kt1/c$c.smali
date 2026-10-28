.class final Lkt1/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkt1/c;->e(Lec3/l;)Lec3/l;
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
        "Lkt1/b;",
        "prevDomainState",
        "Lkt1/a;",
        "domainAction",
        "<anonymous>",
        "(Lkt1/b;Lkt1/a;)Lkt1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.eligibility.domain.LabradorEligibilityInteractor$interact$1"
    f = "LabradorEligibilityInteractor.kt"
    l = {
        0x12
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkt1/c;


# direct methods
.method public constructor <init>(Lkt1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt1/c;",
            "Lq83/d<",
            "-",
            "Lkt1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkt1/c$c;->z:Lkt1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lkt1/b;Lkt1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt1/b;",
            "Lkt1/a;",
            "Lq83/d<",
            "-",
            "Lkt1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkt1/c$c;

    iget-object v1, p0, Lkt1/c$c;->z:Lkt1/c;

    invoke-direct {v0, v1, p3}, Lkt1/c$c;-><init>(Lkt1/c;Lq83/d;)V

    iput-object p1, v0, Lkt1/c$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkt1/c$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkt1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkt1/b;

    check-cast p2, Lkt1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkt1/c$c;->f(Lkt1/b;Lkt1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lkt1/c$c;->x:Ljava/lang/Object;

    check-cast v0, Lkt1/b;

    iget-object v1, p0, Lkt1/c$c;->y:Ljava/lang/Object;

    check-cast v1, Lkt1/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lkt1/c$c;->w:I

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

    sget-object p1, Lkt1/a$a;->a:Lkt1/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lkt1/c$c;->z:Lkt1/c;

    const/4 v1, 0x0

    iput-object v1, p0, Lkt1/c$c;->x:Ljava/lang/Object;

    iput-object v1, p0, Lkt1/c$c;->y:Ljava/lang/Object;

    iput v4, p0, Lkt1/c$c;->w:I

    invoke-static {p1, v0, p0}, Lkt1/c;->a(Lkt1/c;Lkt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lkt1/b;

    return-object p1

    :cond_3
    instance-of p1, v1, Lkt1/a$b;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lkt1/c$c;->z:Lkt1/c;

    check-cast v1, Lkt1/a$b;

    invoke-virtual {v1}, Lkt1/a$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lkt1/a$b;->a()Z

    move-result v1

    invoke-static {p1, v0, v2, v1}, Lkt1/c;->c(Lkt1/c;Lkt1/b;Ljava/lang/String;Z)Lkt1/b;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
