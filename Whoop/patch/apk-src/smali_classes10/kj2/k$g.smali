.class final Lkj2/k$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->w(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lnj2/l;",
        "<anonymous>",
        "(Lbc3/c0;)Lnj2/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshCoachingLanding$2"
    f = "StressMonitorInteractor.kt"
    l = {
        0x124
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lkj2/k;


# direct methods
.method public constructor <init>(Lkj2/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/k;",
            "Lq83/d<",
            "-",
            "Lkj2/k$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$g;->x:Lkj2/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lkj2/k$g;

    iget-object v0, p0, Lkj2/k$g;->x:Lkj2/k;

    invoke-direct {p1, v0, p2}, Lkj2/k$g;-><init>(Lkj2/k;Lq83/d;)V

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
            "Lnj2/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkj2/k$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/k$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkj2/k$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkj2/k$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/k$g;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lkj2/k$g;->x:Lkj2/k;

    invoke-static {p1}, Lkj2/k;->f(Lkj2/k;)Ltr2/n;

    move-result-object p1

    new-instance v5, Lkj2/k$g$a;

    iget-object v3, p0, Lkj2/k$g;->x:Lkj2/k;

    const/4 v4, 0x0

    invoke-direct {v5, v3, v4}, Lkj2/k$g$a;-><init>(Lkj2/k;Lq83/d;)V

    iput v2, p0, Lkj2/k$g;->w:I

    const/4 v3, 0x0

    const-string v4, "refreshCoachingLanding"

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_3

    new-instance v0, Lnj2/l$a;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-direct {v0, p1}, Lnj2/l$a;-><init>(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)V

    return-object v0

    :cond_3
    sget-object p1, Lnj2/l$c;->a:Lnj2/l$c;

    return-object p1
.end method
