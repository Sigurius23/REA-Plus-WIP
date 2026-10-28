.class public final Lez1/a;
.super Lt21/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e*\u0008\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR \u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lez1/a;",
        "Lt21/c;",
        "Lcz1/d;",
        "interactor",
        "Lfz1/a;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lcz1/d;Lfz1/a;Lor2/m;)V",
        "Lt21/b;",
        "Lcz1/b;",
        "r",
        "(Lt21/b;)Lcz1/b;",
        "Lec3/l;",
        "Lcz1/c;",
        "p",
        "(Lec3/l;Lcz1/d;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "q",
        "(Lt21/b;)V",
        "x",
        "Lfz1/a;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "E",
        "Lec3/l;",
        "domainState",
        "Lec3/t1;",
        "Lt21/d;",
        "F",
        "Lec3/t1;",
        "o",
        "()Lec3/t1;",
        "viewState",
        "milestone-pill-arch-mini_release"
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

.field private final F:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final x:Lfz1/a;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcz1/d;Lfz1/a;Lor2/m;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lt21/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lez1/a;->x:Lfz1/a;

    .line 3
    iput-object p3, p0, Lez1/a;->y:Lor2/m;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lez1/a;->z:Lec3/o1;

    .line 5
    new-instance v0, Lez1/a$b;

    invoke-direct {v0, p2, p0}, Lez1/a$b;-><init>(Lec3/l;Lez1/a;)V

    .line 6
    invoke-direct {p0, v0, p1}, Lez1/a;->p(Lec3/l;Lcz1/d;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lez1/a;->E:Lec3/l;

    .line 7
    new-instance p2, Lez1/a$c;

    invoke-direct {p2, p1, p0}, Lez1/a$c;-><init>(Lec3/l;Lez1/a;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lez1/a;->F:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lcz1/d;Lfz1/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lez1/a;-><init>(Lcz1/d;Lfz1/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lez1/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lez1/a;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lez1/a;)Lfz1/a;
    .locals 0

    iget-object p0, p0, Lez1/a;->x:Lfz1/a;

    return-object p0
.end method

.method public static final synthetic n(Lez1/a;Lt21/b;)Lcz1/b;
    .locals 0

    invoke-direct {p0, p1}, Lez1/a;->r(Lt21/b;)Lcz1/b;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lec3/l;Lcz1/d;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lcz1/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lcz1/d;->f(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final r(Lt21/b;)Lcz1/b;
    .locals 1

    instance-of v0, p1, Lt21/b$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcz1/b$b;

    check-cast p1, Lt21/b$b;

    invoke-virtual {p1}, Lt21/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcz1/b$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of p1, p1, Lt21/b$a;

    if-eqz p1, :cond_1

    sget-object p1, Lcz1/b$a;->a:Lcz1/b$a;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lt21/b;

    invoke-virtual {p0, p1}, Lez1/a;->q(Lt21/b;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, Lez1/a;->o()Lec3/t1;

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

    iget-object v0, p0, Lez1/a;->F:Lec3/t1;

    return-object v0
.end method

.method public q(Lt21/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lez1/a;->y:Lor2/m;

    new-instance v1, Lez1/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lez1/a$a;-><init>(Lez1/a;Lt21/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
