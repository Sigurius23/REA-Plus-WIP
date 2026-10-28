.class public final Lce0/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e*\u0008\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001d\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020#0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010!\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lce0/c;",
        "Landroidx/lifecycle/w1;",
        "Lae0/c;",
        "interactor",
        "Lee0/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lae0/c;Lee0/a;Lbc3/c0;)V",
        "Lce0/b;",
        "Lae0/a;",
        "n",
        "(Lce0/b;)Lae0/a;",
        "Lec3/l;",
        "Lae0/b;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "l",
        "(Lce0/b;)V",
        "w",
        "Lae0/c;",
        "x",
        "Lee0/a;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "E",
        "Lec3/l;",
        "domainState",
        "Lce0/d;",
        "F",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "advanced-labs_release"
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

.field private final F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final w:Lae0/c;

.field private final x:Lee0/a;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lae0/c;Lee0/a;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lce0/c;->w:Lae0/c;

    .line 3
    iput-object p2, p0, Lce0/c;->x:Lee0/a;

    .line 4
    iput-object p3, p0, Lce0/c;->y:Lbc3/c0;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lce0/c;->z:Lec3/o1;

    .line 6
    new-instance v0, Lce0/c$b;

    invoke-direct {v0, p1, p0}, Lce0/c$b;-><init>(Lec3/l;Lce0/c;)V

    .line 7
    invoke-direct {p0, v0}, Lce0/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lce0/c;->E:Lec3/l;

    .line 9
    invoke-virtual {p2, p1}, Lee0/a;->c(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 10
    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lce0/c;->F:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lae0/c;Lee0/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lce0/c;-><init>(Lae0/c;Lee0/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lce0/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lce0/c;->z:Lec3/o1;

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

    iget-object v0, p0, Lce0/c;->w:Lae0/c;

    invoke-virtual {v0, p1}, Lae0/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Lce0/c;Lce0/b;)Lae0/a;
    .locals 0

    invoke-direct {p0, p1}, Lce0/c;->n(Lce0/b;)Lae0/a;

    move-result-object p0

    return-object p0
.end method

.method private final n(Lce0/b;)Lae0/a;
    .locals 4

    instance-of v0, p1, Lce0/b$d;

    if-eqz v0, :cond_0

    new-instance v0, Lae0/a$c;

    check-cast p1, Lce0/b$d;

    invoke-virtual {p1}, Lce0/b$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lce0/b$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lce0/b$d;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lae0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lce0/b$b;

    if-eqz v0, :cond_1

    new-instance v0, Lae0/a$f;

    check-cast p1, Lce0/b$b;

    invoke-virtual {p1}, Lce0/b$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lce0/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lae0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lce0/b$a;

    if-eqz v0, :cond_2

    sget-object p1, Lae0/a$a;->a:Lae0/a$a;

    return-object p1

    :cond_2
    instance-of v0, p1, Lce0/b$f;

    if-eqz v0, :cond_3

    new-instance v0, Lae0/a$d;

    check-cast p1, Lce0/b$f;

    invoke-virtual {p1}, Lce0/b$f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lce0/b$f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lce0/b$f;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lce0/b$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lae0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lce0/b$c;

    if-eqz v0, :cond_4

    sget-object p1, Lae0/a$b;->a:Lae0/a$b;

    return-object p1

    :cond_4
    instance-of v0, p1, Lce0/b$e;

    if-eqz v0, :cond_5

    new-instance v0, Lae0/a$e;

    check-cast p1, Lce0/b$e;

    invoke-virtual {p1}, Lce0/b$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lce0/b$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lce0/b$e;->c()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lae0/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :cond_5
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

    iget-object v0, p0, Lce0/c;->F:Lec3/l;

    return-object v0
.end method

.method public final l(Lce0/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lce0/c;->y:Lbc3/c0;

    new-instance v1, Lce0/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lce0/c$a;-><init>(Lce0/c;Lce0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
