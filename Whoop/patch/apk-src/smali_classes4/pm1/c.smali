.class public final Lpm1/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lpm1/c;",
        "Landroidx/lifecycle/w1;",
        "Lom1/l;",
        "interactor",
        "Lpm1/d;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lom1/l;Lpm1/d;Lbc3/c0;)V",
        "Lec3/l;",
        "Lom1/j;",
        "Lom1/k;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lpm1/b;",
        "o",
        "(Lpm1/b;)Lom1/j;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lpm1/b;)V",
        "w",
        "Lom1/l;",
        "x",
        "Lpm1/d;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lqm1/b;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "home_release"
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
.field private final E:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final w:Lom1/l;

.field private final x:Lpm1/d;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lom1/l;Lpm1/d;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lpm1/c;->w:Lom1/l;

    .line 3
    iput-object p2, p0, Lpm1/c;->x:Lpm1/d;

    .line 4
    iput-object p3, p0, Lpm1/c;->y:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lpm1/c;->z:Lec3/o1;

    .line 6
    new-instance p2, Lpm1/c$b;

    invoke-direct {p2, p1, p0}, Lpm1/c$b;-><init>(Lec3/l;Lpm1/c;)V

    .line 7
    invoke-direct {p0, p2}, Lpm1/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lpm1/c$c;

    invoke-direct {p2, p1, p0}, Lpm1/c$c;-><init>(Lec3/l;Lpm1/c;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lpm1/c;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lom1/l;Lpm1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 10
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpm1/c;-><init>(Lom1/l;Lpm1/d;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lpm1/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lpm1/c;->z:Lec3/o1;

    return-object p0
.end method

.method private final interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lpm1/c;->w:Lom1/l;

    invoke-virtual {v0, p1}, Lom1/l;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Lpm1/c;)Lpm1/d;
    .locals 0

    iget-object p0, p0, Lpm1/c;->x:Lpm1/d;

    return-object p0
.end method

.method public static final synthetic l(Lpm1/c;Lpm1/b;)Lom1/j;
    .locals 0

    invoke-direct {p0, p1}, Lpm1/c;->o(Lpm1/b;)Lom1/j;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lpm1/b;)Lom1/j;
    .locals 7

    instance-of v0, p1, Lpm1/a;

    if-eqz v0, :cond_0

    new-instance v1, Lom1/j$a;

    check-cast p1, Lpm1/a;

    invoke-virtual {p1}, Lpm1/a;->b()Lcom/whoop/home/domain/models/DayZeroCardsViewState;

    move-result-object v2

    invoke-virtual {p1}, Lpm1/a;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lom1/j$a;-><init>(Lcom/whoop/home/domain/models/DayZeroCardsViewState;Lom1/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lpm1/c;->E:Lec3/l;

    return-object v0
.end method

.method public final n(Lpm1/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpm1/c;->y:Lbc3/c0;

    new-instance v1, Lpm1/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lpm1/c$a;-><init>(Lpm1/c;Lpm1/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
