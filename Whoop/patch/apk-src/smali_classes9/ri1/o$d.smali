.class final Lri1/o$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lri1/o;->interact(Lec3/l;)Lec3/l;
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
        "Lri1/n;",
        "previousState",
        "Lri1/p;",
        "action",
        "<anonymous>",
        "(Lri1/n;Lri1/p;)Lri1/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.health.domain.HealthspanHeroMetricInteractor$interact$2"
    f = "HealthspanHeroMetricInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lri1/o;


# direct methods
.method public constructor <init>(Lri1/o;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri1/o;",
            "Lq83/d<",
            "-",
            "Lri1/o$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lri1/o$d;->z:Lri1/o;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lri1/n;Lri1/p;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri1/n;",
            "Lri1/p;",
            "Lq83/d<",
            "-",
            "Lri1/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lri1/o$d;

    iget-object v1, p0, Lri1/o$d;->z:Lri1/o;

    invoke-direct {v0, v1, p3}, Lri1/o$d;-><init>(Lri1/o;Lq83/d;)V

    iput-object p1, v0, Lri1/o$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lri1/o$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lri1/o$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lri1/n;

    check-cast p2, Lri1/p;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lri1/o$d;->f(Lri1/n;Lri1/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lri1/o$d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lri1/n;

    iget-object v0, p0, Lri1/o$d;->y:Ljava/lang/Object;

    check-cast v0, Lri1/p;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lri1/o$d;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lri1/p$b;

    if-eqz p1, :cond_1

    check-cast v0, Lri1/p$b;

    invoke-virtual {v0}, Lri1/p$b;->a()Lcj1/m;

    move-result-object p1

    invoke-virtual {p1}, Lcj1/m;->h()Z

    move-result p1

    const/4 v1, 0x0

    const-string v2, "TortoiseHasClosedCalibration"

    if-nez p1, :cond_0

    iget-object p1, p0, Lri1/o$d;->z:Lri1/o;

    invoke-static {p1}, Lri1/o;->d(Lri1/o;)Lu92/d;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Lu92/d;->q(Ljava/lang/String;Z)V

    :cond_0
    new-instance p1, Lri1/n;

    sget-object v3, Lri1/m$b;->a:Lri1/m$b;

    invoke-virtual {v0}, Lri1/p$b;->a()Lcj1/m;

    move-result-object v0

    iget-object v4, p0, Lri1/o$d;->z:Lri1/o;

    invoke-static {v4}, Lri1/o;->d(Lri1/o;)Lu92/d;

    move-result-object v4

    invoke-virtual {v4, v2, v1}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {p1, v3, v0, v1}, Lri1/n;-><init>(Lri1/m;Lcj1/m;Z)V

    return-object p1

    :cond_1
    instance-of p1, v0, Lri1/p$a;

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Lri1/n;->d()Lri1/m;

    move-result-object p1

    instance-of p1, p1, Lri1/m$b;

    if-eqz p1, :cond_2

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Lri1/n;->b(Lri1/n;Lri1/m;Lcj1/m;ZILjava/lang/Object;)Lri1/n;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
