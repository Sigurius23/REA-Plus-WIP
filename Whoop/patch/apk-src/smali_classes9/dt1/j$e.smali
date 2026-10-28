.class final Ldt1/j$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/j;->e(Ldt1/g;)Lec3/l;
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
        "Ldt1/k;",
        "internalState",
        "Ldt1/c;",
        "internalEvent",
        "<anonymous>",
        "(Ldt1/k;Ldt1/c;)Ldt1/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$interact$1"
    f = "LabradorDetailsLocalInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldt1/j;


# direct methods
.method public constructor <init>(Ldt1/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/j;",
            "Lq83/d<",
            "-",
            "Ldt1/j$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/j$e;->z:Ldt1/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldt1/k;Ldt1/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/k;",
            "Ldt1/c;",
            "Lq83/d<",
            "-",
            "Ldt1/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldt1/j$e;

    iget-object v1, p0, Ldt1/j$e;->z:Ldt1/j;

    invoke-direct {v0, v1, p3}, Ldt1/j$e;-><init>(Ldt1/j;Lq83/d;)V

    iput-object p1, v0, Ldt1/j$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldt1/j$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldt1/j$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldt1/k;

    check-cast p2, Ldt1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldt1/j$e;->f(Ldt1/k;Ldt1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ldt1/j$e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ldt1/k;

    iget-object v0, p0, Ldt1/j$e;->y:Ljava/lang/Object;

    check-cast v0, Ldt1/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldt1/j$e;->w:I

    if-nez v2, :cond_b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ldt1/c$g;->a:Ldt1/c$g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v2, Ldt1/g$h;->a:Ldt1/g$h;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ldt1/c$f;->a:Ldt1/c$f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance v2, Ldt1/g$d;

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-direct {v2, v0, p1, v0}, Ldt1/g$d;-><init>(Ldt1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Ldt1/c$k;

    if-eqz p1, :cond_2

    new-instance v2, Ldt1/g$g;

    iget-object p1, p0, Ldt1/j$e;->z:Ldt1/j;

    invoke-static {p1}, Ldt1/j;->b(Ldt1/j;)Ldt1/f;

    move-result-object p1

    check-cast v0, Ldt1/c$k;

    invoke-virtual {v0}, Ldt1/c$k;->b()Lqk1/a;

    move-result-object v3

    invoke-virtual {p1, v3}, Ldt1/f;->a(Lqk1/a;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v3

    invoke-virtual {v0}, Ldt1/c$k;->a()Ldt1/a;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Ldt1/g$g;-><init>(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/a;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Ldt1/c$j;->a:Ldt1/c$j;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v2, Ldt1/g$j;->a:Ldt1/g$j;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Ldt1/c$l;

    if-eqz p1, :cond_4

    new-instance v2, Ldt1/g$k;

    check-cast v0, Ldt1/c$l;

    invoke-virtual {v0}, Ldt1/c$l;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ldt1/c$l;->d()Ljava/time/Instant;

    move-result-object v3

    invoke-virtual {v0}, Ldt1/c$l;->c()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Ldt1/c$l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v3, v4, v0}, Ldt1/g$k;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Ldt1/c$i;->a:Ldt1/c$i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object v2, Ldt1/g$i;->a:Ldt1/g$i;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Ldt1/c$a;

    if-eqz p1, :cond_6

    new-instance v2, Ldt1/g$a;

    check-cast v0, Ldt1/c$a;

    invoke-virtual {v0}, Ldt1/c$a;->a()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v2, p1}, Ldt1/g$a;-><init>(Ljava/time/Instant;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_6
    sget-object p1, Ldt1/c$b;->a:Ldt1/c$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v2, Ldt1/g$b;->a:Ldt1/g$b;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v0, Ldt1/c$c;

    if-eqz p1, :cond_8

    new-instance v2, Ldt1/g$c;

    check-cast v0, Ldt1/c$c;

    invoke-virtual {v0}, Ldt1/c$c;->a()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v2, p1}, Ldt1/g$c;-><init>(Ljava/time/Instant;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_8
    sget-object p1, Ldt1/c$e;->a:Ldt1/c$e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object v2, Ldt1/g$f;->a:Ldt1/g$f;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_9
    sget-object p1, Ldt1/c$d;->a:Ldt1/c$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object v2, Ldt1/g$e;->a:Ldt1/g$e;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ldt1/k;->b(Ldt1/k;Ldt1/g;Lqk1/a;Ldt1/c$h;ILjava/lang/Object;)Ldt1/k;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
