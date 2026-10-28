.class final Lvl2/l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl2/l;->a(Lec3/l;)Lec3/l;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lvl2/y;",
        "localSate",
        "Lvl2/x;",
        "domainAction",
        "Lvl2/y$a;",
        "<anonymous>",
        "(Lvl2/y;Lvl2/x;)Lvl2/y$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trends.data.domain.TrendLocalStateInteractor$interact$1"
    f = "TrendLocalStateInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvl2/l$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvl2/y;Lvl2/x;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/y;",
            "Lvl2/x;",
            "Lq83/d<",
            "-",
            "Lvl2/y$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lvl2/l$a;

    invoke-direct {p1, p3}, Lvl2/l$a;-><init>(Lq83/d;)V

    iput-object p2, p1, Lvl2/l$a;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvl2/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvl2/y;

    check-cast p2, Lvl2/x;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvl2/l$a;->f(Lvl2/y;Lvl2/x;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lvl2/l$a;->x:Ljava/lang/Object;

    check-cast v0, Lvl2/x;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvl2/l$a;->w:I

    if-nez v1, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lvl2/x$a;

    if-eqz p1, :cond_1

    sget-object p1, Lor2/h0;->WHOOP_AGE:Lor2/h0;

    sget-object v1, Lor2/h0;->PACE_OF_AGING:Lor2/h0;

    filled-new-array {p1, v1}, [Lor2/h0;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast v0, Lvl2/x$a;

    invoke-virtual {v0}, Lvl2/x$a;->c()Lor2/h0;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lvl2/x$a;->b()Lvl2/a;

    move-result-object p1

    sget-object v1, Lvl2/a;->WEEKLY:Lvl2/a;

    if-ne p1, v1, :cond_0

    new-instance v2, Lvl2/y$a;

    sget-object v3, Lvl2/a;->MONTHLY:Lvl2/a;

    invoke-virtual {v0}, Lvl2/x$a;->c()Lor2/h0;

    move-result-object v4

    invoke-virtual {v0}, Lvl2/x$a;->a()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lvl2/y$a;-><init>(Lvl2/a;Lor2/h0;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    new-instance v3, Lvl2/y$a;

    invoke-virtual {v0}, Lvl2/x$a;->b()Lvl2/a;

    move-result-object v4

    invoke-virtual {v0}, Lvl2/x$a;->c()Lor2/h0;

    move-result-object v5

    invoke-virtual {v0}, Lvl2/x$a;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lvl2/y$a;-><init>(Lvl2/a;Lor2/h0;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of p1, v0, Lvl2/x$b;

    if-eqz p1, :cond_2

    new-instance p1, Lvl2/y$a;

    check-cast v0, Lvl2/x$b;

    invoke-virtual {v0}, Lvl2/x$b;->b()Lvl2/a;

    move-result-object v1

    invoke-virtual {v0}, Lvl2/x$b;->c()Lor2/h0;

    move-result-object v2

    invoke-virtual {v0}, Lvl2/x$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lvl2/x$b;->d()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v1, v2, v3, v0}, Lvl2/y$a;-><init>(Lvl2/a;Lor2/h0;Ljava/lang/String;Ljava/util/List;)V

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
