.class final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic w:Lkotlin/jvm/internal/b0;

.field final synthetic x:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/b0;Lec3/m;Lkotlin/jvm/functions/Function1;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/b0;",
            "Lec3/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->w:Lkotlin/jvm/internal/b0;

    iput-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->x:Lec3/m;

    iput-object p3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p5, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->E:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->F:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lpm0/a;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lpm0/a$e;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_7

    instance-of v0, p1, Lpm0/a$a;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->w:Lkotlin/jvm/internal/b0;

    iput-boolean v2, v0, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->x:Lec3/m;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lpm0/a$a;

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    instance-of v0, p1, Lpm0/a$d;

    const-string v3, "Failed to fetch arch mini calendar month "

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {v0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ltr2/n;

    move-result-object v0

    iget-object v5, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->E:Ljava/lang/String;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, ", showing the cached month: "

    invoke-static {v3, v5, v7, v6}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v0, v3, v4}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->w:Lkotlin/jvm/internal/b0;

    iput-boolean v2, v0, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->x:Lec3/m;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    instance-of v0, p1, Lpm0/a$c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->w:Lkotlin/jvm/internal/b0;

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ltr2/n;

    move-result-object p2

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->E:Ljava/lang/String;

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Failed to refresh arch mini calendar month "

    const-string v3, ", keeping the month on screen: "

    invoke-static {v2, v0, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {v0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ltr2/n;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->E:Ljava/lang/String;

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v5, ": "

    invoke-static {v3, v2, v5, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->x:Lec3/m;

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->F:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    return-object p1

    :cond_5
    return-object v1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpm0/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;->b(Lpm0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
