.class final Lwj2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwj2/c;->f(Ljava/time/LocalDate;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
        "Lwj2/b;",
        "<anonymous>",
        "(Lbc3/c0;)Lwj2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.tiltgraph.domain.TiltGraphInteractor$fetchData$2"
    f = "TiltGraphInteractor.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lwj2/c;

.field final synthetic y:Ljava/time/LocalDate;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lwj2/c;Ljava/time/LocalDate;ZLjava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj2/c;",
            "Ljava/time/LocalDate;",
            "Z",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lwj2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwj2/c$b;->x:Lwj2/c;

    iput-object p2, p0, Lwj2/c$b;->y:Ljava/time/LocalDate;

    iput-boolean p3, p0, Lwj2/c$b;->z:Z

    iput-object p4, p0, Lwj2/c$b;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lwj2/c$b;

    iget-object v1, p0, Lwj2/c$b;->x:Lwj2/c;

    iget-object v2, p0, Lwj2/c$b;->y:Ljava/time/LocalDate;

    iget-boolean v3, p0, Lwj2/c$b;->z:Z

    iget-object v4, p0, Lwj2/c$b;->E:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lwj2/c$b;-><init>(Lwj2/c;Ljava/time/LocalDate;ZLjava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lwj2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwj2/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwj2/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwj2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwj2/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwj2/c$b;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v3

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lwj2/c$b;->x:Lwj2/c;

    invoke-static {v1}, Lwj2/c;->e(Lwj2/c;)Ltr2/n;

    move-result-object v4

    new-instance v7, Lwj2/c$b$a;

    iget-object v1, p0, Lwj2/c$b;->x:Lwj2/c;

    iget-object v5, p0, Lwj2/c$b;->y:Ljava/time/LocalDate;

    invoke-direct {v7, v1, v5, v2}, Lwj2/c$b$a;-><init>(Lwj2/c;Ljava/time/LocalDate;Lq83/d;)V

    iput p1, p0, Lwj2/c$b;->w:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, v8, Lwj2/c$b;->x:Lwj2/c;

    iget-object v1, v8, Lwj2/c$b;->y:Ljava/time/LocalDate;

    iget-boolean v3, v8, Lwj2/c$b;->z:Z

    iget-object v4, v8, Lwj2/c$b;->E:Ljava/lang/String;

    check-cast p1, Lu02/a;

    instance-of v5, p1, Lu02/a$b;

    if-eqz v5, :cond_3

    invoke-static {v0}, Lwj2/c;->b(Lwj2/c;)Luj2/b;

    move-result-object p1

    sget-object v0, Luj2/a$f;->a:Luj2/a$f;

    invoke-virtual {p1, v0}, Luj2/b;->j(Luj2/a;)V

    new-instance p1, Lwj2/b$a;

    invoke-direct {p1, v1}, Lwj2/b$a;-><init>(Ljava/time/LocalDate;)V

    return-object p1

    :cond_3
    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_5

    if-eqz v3, :cond_4

    invoke-static {v0}, Lwj2/c;->b(Lwj2/c;)Luj2/b;

    move-result-object v0

    new-instance v1, Luj2/a$g;

    move-object v3, p1

    check-cast v3, Lu02/a$c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    invoke-virtual {v5}, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;->getAnalyticsMetadata()Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;->getDaysSince()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    invoke-virtual {v3}, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;->getAnalyticsMetadata()Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;->getHoursInGraph()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v4, v5, v3}, Luj2/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Luj2/b;->j(Luj2/a;)V

    :cond_4
    new-instance v0, Lwj2/b$c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, p1, v1, v3, v2}, Lwj2/b$c;-><init>(Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
