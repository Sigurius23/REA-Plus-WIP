.class final Lvl2/p$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl2/p;->c(Lec3/l;)Lec3/l;
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
        "Lvl2/n;",
        "state",
        "Lvl2/o;",
        "action",
        "<anonymous>",
        "(Lvl2/n;Lvl2/o;)Lvl2/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trends.data.domain.TrendMenuSheetStateInteractor$interact$1"
    f = "TrendMenuSheetInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvl2/p;


# direct methods
.method public constructor <init>(Lvl2/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/p;",
            "Lq83/d<",
            "-",
            "Lvl2/p$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvl2/p$a;->z:Lvl2/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvl2/n;Lvl2/o;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/n;",
            "Lvl2/o;",
            "Lq83/d<",
            "-",
            "Lvl2/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvl2/p$a;

    iget-object v1, p0, Lvl2/p$a;->z:Lvl2/p;

    invoke-direct {v0, v1, p3}, Lvl2/p$a;-><init>(Lvl2/p;Lq83/d;)V

    iput-object p1, v0, Lvl2/p$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvl2/p$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvl2/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvl2/n;

    check-cast p2, Lvl2/o;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvl2/p$a;->f(Lvl2/n;Lvl2/o;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lvl2/p$a;->x:Ljava/lang/Object;

    check-cast v0, Lvl2/n;

    iget-object v1, p0, Lvl2/p$a;->y:Ljava/lang/Object;

    check-cast v1, Lvl2/o;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvl2/p$a;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvl2/p$a;->z:Lvl2/p;

    invoke-static {p1, v0}, Lvl2/p;->a(Lvl2/p;Lvl2/n;)Lvl2/b0;

    move-result-object v2

    sget-object p1, Lvl2/o$a;->a:Lvl2/o$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lvl2/n;->a(Lvl2/h;)Lvl2/n;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lvl2/o$b;

    if-eqz p1, :cond_1

    new-instance p1, Lvl2/h$a;

    check-cast v1, Lvl2/o$b;

    invoke-virtual {v1}, Lvl2/o$b;->a()Ljava/time/LocalDateTime;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lvl2/b0;->b(Lvl2/b0;Ljava/lang/Integer;Ljava/lang/String;Ljava/time/LocalDateTime;ILjava/lang/Object;)Lvl2/b0;

    move-result-object v1

    invoke-direct {p1, v1}, Lvl2/h$a;-><init>(Lvl2/b0;)V

    invoke-virtual {v0, p1}, Lvl2/n;->a(Lvl2/h;)Lvl2/n;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Lvl2/o$c;

    if-eqz p1, :cond_2

    new-instance p1, Lvl2/h$a;

    check-cast v1, Lvl2/o$c;

    invoke-virtual {v1}, Lvl2/o$c;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lvl2/b0;->b(Lvl2/b0;Ljava/lang/Integer;Ljava/lang/String;Ljava/time/LocalDateTime;ILjava/lang/Object;)Lvl2/b0;

    move-result-object v1

    invoke-direct {p1, v1}, Lvl2/h$a;-><init>(Lvl2/b0;)V

    invoke-virtual {v0, p1}, Lvl2/n;->a(Lvl2/h;)Lvl2/n;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Lvl2/o$d;

    if-eqz p1, :cond_3

    new-instance p1, Lvl2/h$a;

    check-cast v1, Lvl2/o$d;

    invoke-virtual {v1}, Lvl2/o$d;->a()I

    move-result v1

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v1}, Ljava/lang/Integer;-><init>(I)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lvl2/b0;->b(Lvl2/b0;Ljava/lang/Integer;Ljava/lang/String;Ljava/time/LocalDateTime;ILjava/lang/Object;)Lvl2/b0;

    move-result-object v1

    invoke-direct {p1, v1}, Lvl2/h$a;-><init>(Lvl2/b0;)V

    invoke-virtual {v0, p1}, Lvl2/n;->a(Lvl2/h;)Lvl2/n;

    move-result-object p1

    return-object p1

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
