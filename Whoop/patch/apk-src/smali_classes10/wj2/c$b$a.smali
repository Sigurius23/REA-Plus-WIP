.class final Lwj2/c$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwj2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.tiltgraph.domain.TiltGraphInteractor$fetchData$2$1"
    f = "TiltGraphInteractor.kt"
    l = {
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lwj2/c;

.field final synthetic y:Ljava/time/LocalDate;


# direct methods
.method public constructor <init>(Lwj2/c;Ljava/time/LocalDate;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj2/c;",
            "Ljava/time/LocalDate;",
            "Lq83/d<",
            "-",
            "Lwj2/c$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwj2/c$b$a;->x:Lwj2/c;

    iput-object p2, p0, Lwj2/c$b$a;->y:Ljava/time/LocalDate;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lwj2/c$b$a;

    iget-object v1, p0, Lwj2/c$b$a;->x:Lwj2/c;

    iget-object v2, p0, Lwj2/c$b$a;->y:Ljava/time/LocalDate;

    invoke-direct {v0, v1, v2, p1}, Lwj2/c$b$a;-><init>(Lwj2/c;Ljava/time/LocalDate;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lwj2/c$b$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lwj2/c$b$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwj2/c$b$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lwj2/c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwj2/c$b$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwj2/c$b$a;->x:Lwj2/c;

    invoke-static {p1}, Lwj2/c;->c(Lwj2/c;)Lcom/whoop/tiltgraph/api/TiltGraphApi;

    move-result-object p1

    sget-object v1, Lwj2/c;->d:Lwj2/c$a;

    invoke-virtual {v1}, Lwj2/c$a;->a()Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    iget-object v3, p0, Lwj2/c$b$a;->y:Ljava/time/LocalDate;

    invoke-virtual {v1, v3}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "format(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, p0, Lwj2/c$b$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/tiltgraph/api/TiltGraphApi;->getTiltGraphData(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
