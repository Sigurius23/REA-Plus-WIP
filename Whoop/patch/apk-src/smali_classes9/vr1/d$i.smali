.class final Lvr1/d$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr1/d;->n(Lvr1/a;Lvr1/b;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;"
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
    c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$interactingStateToDomainData$4"
    f = "JournalCalendarInteractor.kt"
    l = {
        0x97
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvr1/d;

.field final synthetic y:Lvr1/b;


# direct methods
.method public constructor <init>(Lvr1/d;Lvr1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr1/d;",
            "Lvr1/b;",
            "Lq83/d<",
            "-",
            "Lvr1/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr1/d$i;->x:Lvr1/d;

    iput-object p2, p0, Lvr1/d$i;->y:Lvr1/b;

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

    new-instance v0, Lvr1/d$i;

    iget-object v1, p0, Lvr1/d$i;->x:Lvr1/d;

    iget-object v2, p0, Lvr1/d$i;->y:Lvr1/b;

    invoke-direct {v0, v1, v2, p1}, Lvr1/d$i;-><init>(Lvr1/d;Lvr1/b;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lvr1/d$i;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lvr1/d$i;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvr1/d$i;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lvr1/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvr1/d$i;->w:I

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

    iget-object p1, p0, Lvr1/d$i;->x:Lvr1/d;

    invoke-static {p1}, Lvr1/d;->e(Lvr1/d;)Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;

    move-result-object p1

    iget-object v1, p0, Lvr1/d$i;->y:Lvr1/b;

    check-cast v1, Lvr1/b$a;

    invoke-virtual {v1}, Lvr1/b$a;->b()Ljava/lang/String;

    move-result-object v1

    iput v2, p0, Lvr1/d$i;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;->getJournalCalendar(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
