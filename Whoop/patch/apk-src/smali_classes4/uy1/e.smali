.class public final Luy1/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000b*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Luy1/e;",
        "Landroidx/lifecycle/w1;",
        "Luy1/c;",
        "interactor",
        "Luy1/f;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "stateInScope",
        "<init>",
        "(Luy1/c;Luy1/f;Lbc3/c0;Lbc3/c0;)V",
        "Lec3/l;",
        "Lvy1/c;",
        "Luy1/b;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "l",
        "(Lvy1/c;)V",
        "w",
        "Luy1/c;",
        "x",
        "Luy1/f;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "mutableViewEvents",
        "Lec3/f2;",
        "Lvy1/d;",
        "E",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "mfa_release"
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
.field private final E:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final w:Luy1/c;

.field private final x:Luy1/f;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Luy1/c;Luy1/f;Lbc3/c0;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateInScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Luy1/e;->w:Luy1/c;

    .line 3
    iput-object p2, p0, Luy1/e;->x:Luy1/f;

    .line 4
    iput-object p3, p0, Luy1/e;->y:Lbc3/c0;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 5
    invoke-static {p2, p2, p3, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Luy1/e;->z:Lec3/o1;

    .line 6
    new-instance p2, Luy1/e$c;

    invoke-direct {p2, p3}, Luy1/e$c;-><init>(Lq83/d;)V

    .line 7
    new-instance p3, Lec3/a0;

    invoke-direct {p3, p2, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 8
    invoke-direct {p0, p3}, Luy1/e;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 9
    new-instance p2, Luy1/e$b;

    invoke-direct {p2, p1, p0}, Luy1/e$b;-><init>(Lec3/l;Luy1/e;)V

    .line 10
    sget-object p1, Lec3/z1;->b:Lec3/b2;

    sget-object p3, Lvy1/d$a;->a:Lvy1/d$a;

    invoke-static {p2, p4, p1, p3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Luy1/e;->E:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Luy1/c;Luy1/f;Lbc3/c0;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p6, 0x1

    const/4 v0, 0x0

    invoke-direct {p3, v0, p6, v0}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, p3

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Luy1/e;-><init>(Luy1/c;Luy1/f;Lbc3/c0;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Luy1/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Luy1/e;->z:Lec3/o1;

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

    iget-object v0, p0, Luy1/e;->w:Luy1/c;

    invoke-virtual {v0, p1}, Luy1/c;->p(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Luy1/e;)Luy1/f;
    .locals 0

    iget-object p0, p0, Luy1/e;->x:Luy1/f;

    return-object p0
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Luy1/e;->E:Lec3/f2;

    return-object v0
.end method

.method public final l(Lvy1/c;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luy1/e;->y:Lbc3/c0;

    new-instance v1, Luy1/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Luy1/e$a;-><init>(Luy1/e;Lvy1/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
