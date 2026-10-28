.class final Lkl1/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkl1/c;->interact(Lec3/l;)Lec3/l;
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
        "Lkl1/e;",
        "accumulator",
        "Lkl1/b;",
        "action",
        "<anonymous>",
        "(Lkl1/e;Lkl1/b;)Lkl1/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.calendar.CalendarDomainInteractor$interact$2"
    f = "CalendarDomainInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lkl1/c$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lkl1/e;Lkl1/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl1/e;",
            "Lkl1/b;",
            "Lq83/d<",
            "-",
            "Lkl1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkl1/c$e;

    invoke-direct {v0, p3}, Lkl1/c$e;-><init>(Lq83/d;)V

    iput-object p1, v0, Lkl1/c$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkl1/c$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkl1/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkl1/e;

    check-cast p2, Lkl1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkl1/c$e;->f(Lkl1/e;Lkl1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lkl1/c$e;->x:Ljava/lang/Object;

    check-cast v0, Lkl1/e;

    iget-object v1, p0, Lkl1/c$e;->y:Ljava/lang/Object;

    check-cast v1, Lkl1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkl1/c$e;->w:I

    if-nez v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lkl1/b$b;

    if-eqz p1, :cond_0

    new-instance p1, Lkl1/e;

    sget-object v1, Lkl1/d$a;->a:Lkl1/d$a;

    invoke-virtual {v0}, Lkl1/e;->a()Lkl1/a;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lkl1/e;-><init>(Lkl1/d;Lkl1/a;)V

    return-object p1

    :cond_0
    instance-of p1, v1, Lkl1/b$a;

    if-eqz p1, :cond_1

    new-instance p1, Lkl1/e;

    invoke-virtual {v0}, Lkl1/e;->b()Lkl1/d;

    move-result-object v1

    invoke-virtual {v0}, Lkl1/e;->a()Lkl1/a;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lkl1/e;-><init>(Lkl1/d;Lkl1/a;)V

    return-object p1

    :cond_1
    instance-of p1, v1, Lkl1/b$c;

    if-eqz p1, :cond_4

    check-cast v1, Lkl1/b$c;

    invoke-virtual {v1}, Lkl1/b$c;->b()Lcom/whoop/home/domain/models/CalendarResponse;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lkl1/e;->a()Lkl1/a;

    move-result-object v2

    invoke-virtual {v2}, Lkl1/a;->b()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lfm1/g;->OVERVIEW:Lfm1/g;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lkl1/b$c;->a()I

    move-result v4

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object p1, Lm83/z;->w:Lm83/z;

    :goto_0
    invoke-virtual {v0}, Lkl1/e;->a()Lkl1/a;

    move-result-object v2

    invoke-virtual {v1}, Lkl1/b$c;->a()I

    move-result v1

    invoke-virtual {v0}, Lkl1/e;->a()Lkl1/a;

    move-result-object v0

    invoke-virtual {v0}, Lkl1/a;->b()Ljava/util/Map;

    move-result-object v0

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Lkl1/a;->a(Ljava/util/Map;I)Lkl1/a;

    move-result-object p1

    new-instance v0, Lkl1/e;

    sget-object v1, Lkl1/d$b;->a:Lkl1/d$b;

    invoke-direct {v0, v1, p1}, Lkl1/e;-><init>(Lkl1/d;Lkl1/a;)V

    return-object v0

    :cond_3
    new-instance p1, Lkl1/e;

    sget-object v1, Lkl1/d$b;->a:Lkl1/d$b;

    invoke-virtual {v0}, Lkl1/e;->a()Lkl1/a;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lkl1/e;-><init>(Lkl1/d;Lkl1/a;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
