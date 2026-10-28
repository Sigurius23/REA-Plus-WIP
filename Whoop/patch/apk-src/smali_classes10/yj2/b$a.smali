.class final Lyj2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyj2/b;->a(Lec3/l;Lec3/l;)Lec3/l;
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
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lwj2/b;",
        "domainState",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarState",
        "Lyj2/a;",
        "<anonymous>",
        "(Lwj2/b;Lh91/b;)Lyj2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.tiltgraph.domain.combiner.TiltGraphDomainCombiner$combineState$1"
    f = "TiltGraphDomainCombiner.kt"
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
            "Lyj2/b$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lwj2/b;Lh91/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj2/b;",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;",
            "Lq83/d<",
            "-",
            "Lyj2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lyj2/b$a;

    invoke-direct {v0, p3}, Lyj2/b$a;-><init>(Lq83/d;)V

    iput-object p1, v0, Lyj2/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lyj2/b$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lyj2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwj2/b;

    check-cast p2, Lh91/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lyj2/b$a;->f(Lwj2/b;Lh91/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyj2/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lwj2/b;

    iget-object v1, p0, Lyj2/b$a;->y:Ljava/lang/Object;

    check-cast v1, Lh91/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lyj2/b$a;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lyj2/a;

    invoke-direct {p1, v0, v1}, Lyj2/a;-><init>(Lwj2/b;Lh91/b;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
