.class final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->u(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lec3/m;",
        "Lpm0/a;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$fetchUncached$1"
    f = "ArchMiniCalendarInteractor.kt"
    l = {
        0xf5,
        0xf9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/network/request/GetApiRequest;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
            "Lcom/whoop/network/request/GetApiRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->E:Lcom/whoop/network/request/GetApiRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->E:Lcom/whoop/network/request/GetApiRequest;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->x:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ltr2/n;

    move-result-object v7

    new-instance v10, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;

    iget-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->E:Lcom/whoop/network/request/GetApiRequest;

    invoke-direct {v10, p1, v2, v5}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    iput-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->y:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->x:I

    const/4 v8, 0x0

    const-string v9, "Failed to fetch arch mini calendar"

    const/4 v12, 0x2

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_4

    new-instance v2, Lpm0/a$a$a;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v2, p1}, Lpm0/a$a$a;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_6

    new-instance v2, Lpm0/a$c;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3, v4, v5}, Lpm0/a$c;-><init>(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    iput-object v5, v11, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->y:Ljava/lang/Object;

    iput-object v5, v11, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->w:Ljava/lang/Object;

    iput v4, v11, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
