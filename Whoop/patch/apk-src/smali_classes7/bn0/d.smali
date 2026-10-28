.class public final Lbn0/d;
.super Lbn0/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001dR \u0010(\u001a\u0008\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lbn0/d;",
        "Lbn0/c;",
        "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
        "interactor",
        "Lcn0/c;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcn0/c;Lor2/m;)V",
        "Lbn0/b;",
        "Lcom/whoop/calendararchmini/domain/a;",
        "q",
        "(Lbn0/b;)Lcom/whoop/calendararchmini/domain/a;",
        "event",
        "Ll83/a0;",
        "p",
        "(Lbn0/b;)V",
        "y",
        "Lcn0/c;",
        "z",
        "Lor2/m;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "archMiniCalendarViewEventFlow",
        "Lec3/l;",
        "Lan0/a;",
        "F",
        "Lec3/l;",
        "domainState",
        "Lbn0/a;",
        "G",
        "accumulator",
        "Lec3/t1;",
        "Lbn0/e;",
        "H",
        "Lec3/t1;",
        "o",
        "()Lec3/t1;",
        "viewState",
        "calendar-arch-mini_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final E:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final G:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final H:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final y:Lcn0/c;

.field private final z:Lor2/m;


# direct methods
.method public constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcn0/c;Lor2/m;)V
    .locals 5

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lbn0/c;-><init>(Lor2/m;)V

    .line 2
    iput-object p2, p0, Lbn0/d;->y:Lcn0/c;

    .line 3
    iput-object p3, p0, Lbn0/d;->z:Lor2/m;

    const/4 p2, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4
    invoke-static {v0, v1, v2, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lbn0/d;->E:Lec3/o1;

    .line 5
    new-instance v1, Lbn0/d$c;

    invoke-direct {v1, p2, p0}, Lbn0/d$c;-><init>(Lec3/l;Lbn0/d;)V

    .line 6
    invoke-virtual {p1, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lbn0/d;->F:Lec3/l;

    .line 7
    new-instance v1, Lbn0/a;

    invoke-direct {v1, v2, v0, v2}, Lbn0/a;-><init>(Ljava/time/LocalDate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lbn0/d$a;

    invoke-direct {v3, v2}, Lbn0/d$a;-><init>(Lq83/d;)V

    .line 8
    new-instance v4, Lec3/l1;

    invoke-direct {v4, v1, p2, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    .line 9
    iput-object v4, p0, Lbn0/d;->G:Lec3/l;

    .line 10
    new-instance p2, Lbn0/d$d;

    invoke-direct {p2, p0, v2}, Lbn0/d$d;-><init>(Lbn0/d;Lq83/d;)V

    .line 11
    new-instance v1, Lec3/l1;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v4, p2, v2}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 12
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v1, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lbn0/d;->H:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcn0/c;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 13
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lbn0/d;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcn0/c;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lbn0/d;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lbn0/d;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lbn0/d;)Lcn0/c;
    .locals 0

    iget-object p0, p0, Lbn0/d;->y:Lcn0/c;

    return-object p0
.end method

.method public static final synthetic n(Lbn0/d;Lbn0/b;)Lcom/whoop/calendararchmini/domain/a;
    .locals 0

    invoke-direct {p0, p1}, Lbn0/d;->q(Lbn0/b;)Lcom/whoop/calendararchmini/domain/a;

    move-result-object p0

    return-object p0
.end method

.method private final q(Lbn0/b;)Lcom/whoop/calendararchmini/domain/a;
    .locals 1

    instance-of v0, p1, Lbn0/b$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/calendararchmini/domain/a$a;

    check-cast p1, Lbn0/b$b;

    invoke-virtual {p1}, Lbn0/b$b;->a()Lib1/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/calendararchmini/domain/a$a;-><init>(Lib1/a;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lbn0/b$d;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/calendararchmini/domain/a$c;

    check-cast p1, Lbn0/b$d;

    invoke-virtual {p1}, Lbn0/b$d;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lcom/whoop/calendararchmini/domain/a$c;-><init>(I)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lbn0/b$e;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/whoop/calendararchmini/domain/a$d;

    check-cast p1, Lbn0/b$e;

    invoke-virtual {p1}, Lbn0/b$e;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lcom/whoop/calendararchmini/domain/a$d;-><init>(I)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lbn0/b$c;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/whoop/calendararchmini/domain/a$b;

    check-cast p1, Lbn0/b$c;

    invoke-virtual {p1}, Lbn0/b$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/calendararchmini/domain/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of p1, p1, Lbn0/b$a;

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lbn0/b;

    invoke-virtual {p0, p1}, Lbn0/d;->p(Lbn0/b;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, Lbn0/d;->o()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public o()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lbn0/d;->H:Lec3/t1;

    return-object v0
.end method

.method public p(Lbn0/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbn0/d;->z:Lor2/m;

    new-instance v1, Lbn0/d$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lbn0/d$b;-><init>(Lbn0/d;Lbn0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
