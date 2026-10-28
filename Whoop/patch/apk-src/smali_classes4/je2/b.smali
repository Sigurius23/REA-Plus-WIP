.class public final Lje2/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e*\u0008\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000e*\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010 \u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lje2/b;",
        "Landroidx/lifecycle/w1;",
        "Lie2/c;",
        "interactor",
        "Lje2/d;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lie2/c;Lje2/d;Lbc3/c0;)V",
        "Lje2/a$j;",
        "Lie2/a;",
        "p",
        "(Lje2/a$j;)Lie2/a;",
        "Lec3/l;",
        "Lie2/b;",
        "l",
        "(Lec3/l;Lie2/c;)Lec3/l;",
        "Lje2/c;",
        "n",
        "(Lec3/l;Lje2/d;)Lec3/l;",
        "viewEvent",
        "Lbc3/k1;",
        "o",
        "(Lje2/a$j;)Lbc3/k1;",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "y",
        "Lec3/l;",
        "domainState",
        "z",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "shepherd_release"
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
.field private final w:Lbc3/c0;

.field private final x:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final y:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lie2/c;Lje2/d;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lje2/b;->w:Lbc3/c0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    invoke-static {v1, v1, v2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lje2/b;->x:Lec3/o1;

    .line 4
    new-instance v1, Lje2/b$a;

    invoke-direct {v1, v2}, Lje2/b$a;-><init>(Lq83/d;)V

    .line 5
    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 6
    new-instance v0, Lje2/b$c;

    invoke-direct {v0, v2, p0}, Lje2/b$c;-><init>(Lec3/l;Lje2/b;)V

    .line 7
    invoke-direct {p0, v0, p1}, Lje2/b;->l(Lec3/l;Lie2/c;)Lec3/l;

    move-result-object p1

    .line 8
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lje2/b;->y:Lec3/l;

    .line 9
    invoke-direct {p0, p1, p2}, Lje2/b;->n(Lec3/l;Lje2/d;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lje2/b;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lie2/c;Lje2/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lje2/b;-><init>(Lie2/c;Lje2/d;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lje2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lje2/b;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lje2/b;Lje2/a$j;)Lie2/a;
    .locals 0

    invoke-direct {p0, p1}, Lje2/b;->p(Lje2/a$j;)Lie2/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lie2/c;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lie2/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lie2/c;->f(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lec3/l;Lje2/d;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lje2/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lje2/d;->b(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lje2/a$j;)Lie2/a;
    .locals 2

    sget-object v0, Lje2/a$f;->a:Lje2/a$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lie2/a$b;->a:Lie2/a$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lje2/a$g;

    if-eqz v0, :cond_1

    new-instance v0, Lie2/a$c;

    check-cast p1, Lje2/a$g;

    invoke-virtual {p1}, Lje2/a$g;->a()Z

    move-result v1

    invoke-virtual {p1}, Lje2/a$g;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lie2/a$c;-><init>(ZZ)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lje2/a$h;

    if-eqz v0, :cond_2

    new-instance v0, Lie2/a$d;

    check-cast p1, Lje2/a$h;

    invoke-virtual {p1}, Lje2/a$h;->a()Z

    move-result v1

    invoke-virtual {p1}, Lje2/a$h;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lie2/a$d;-><init>(ZZ)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lje2/a$i;

    if-eqz v0, :cond_3

    new-instance v0, Lie2/a$e;

    check-cast p1, Lje2/a$i;

    invoke-virtual {p1}, Lje2/a$i;->a()Z

    move-result v1

    invoke-virtual {p1}, Lje2/a$i;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lie2/a$e;-><init>(ZZ)V

    return-object v0

    :cond_3
    sget-object v0, Lje2/a$a;->a:Lje2/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lie2/a$a;->a:Lie2/a$a;

    return-object p1

    :cond_4
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

    iget-object v0, p0, Lje2/b;->z:Lec3/l;

    return-object v0
.end method

.method public final o(Lje2/a$j;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lje2/b;->w:Lbc3/c0;

    new-instance v1, Lje2/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lje2/b$b;-><init>(Lje2/b;Lje2/a$j;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
