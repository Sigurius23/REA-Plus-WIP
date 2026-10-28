.class public final Lwb0/h;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e*\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e*\u0008\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001d\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\"\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lwb0/h;",
        "Landroidx/lifecycle/w1;",
        "Lub0/e;",
        "interactor",
        "Lxb0/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lub0/e;Lxb0/a;Lbc3/c0;)V",
        "Lwb0/g;",
        "Lub0/c;",
        "o",
        "(Lwb0/g;)Lub0/c;",
        "Lec3/l;",
        "Lub0/d;",
        "Lwb0/i;",
        "l",
        "(Lec3/l;Lxb0/a;)Lec3/l;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lwb0/g;)V",
        "w",
        "Lub0/e;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "z",
        "Lec3/l;",
        "domainState",
        "E",
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

.field private final w:Lub0/e;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
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
.method public constructor <init>(Lub0/e;Lxb0/a;Lbc3/c0;)V
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
    iput-object p1, p0, Lwb0/h;->w:Lub0/e;

    .line 3
    iput-object p3, p0, Lwb0/h;->x:Lbc3/c0;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lwb0/h;->y:Lec3/o1;

    .line 5
    new-instance v0, Lwb0/h$b;

    invoke-direct {v0, p1, p0}, Lwb0/h$b;-><init>(Lec3/l;Lwb0/h;)V

    .line 6
    invoke-direct {p0, v0}, Lwb0/h;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 7
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lwb0/h;->z:Lec3/l;

    .line 8
    invoke-direct {p0, p1, p2}, Lwb0/h;->l(Lec3/l;Lxb0/a;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lwb0/h;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lub0/e;Lxb0/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lwb0/h;-><init>(Lub0/e;Lxb0/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lwb0/h;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lwb0/h;->y:Lec3/o1;

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

    iget-object v0, p0, Lwb0/h;->w:Lub0/e;

    invoke-virtual {v0, p1}, Lub0/e;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Lwb0/h;Lwb0/g;)Lub0/c;
    .locals 0

    invoke-direct {p0, p1}, Lwb0/h;->o(Lwb0/g;)Lub0/c;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lxb0/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lxb0/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lxb0/a;->i(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final o(Lwb0/g;)Lub0/c;
    .locals 10

    instance-of v0, p1, Lwb0/g$d;

    if-eqz v0, :cond_0

    new-instance v0, Lub0/c$c;

    check-cast p1, Lwb0/g$d;

    invoke-virtual {p1}, Lwb0/g$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lwb0/g$d;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lub0/c$c;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lwb0/g$e;

    if-eqz v0, :cond_2

    check-cast p1, Lwb0/g$e;

    invoke-virtual {p1}, Lwb0/g$e;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwb0/f;

    new-instance v2, Lub0/b;

    invoke-virtual {v1}, Lwb0/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lwb0/f;->d()Z

    move-result v4

    invoke-virtual {v1}, Lwb0/f;->l()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1}, Lwb0/f;->j()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lub0/b;-><init>(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lub0/c$e;

    invoke-direct {p1, v0}, Lub0/c$e;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Lwb0/g$b;

    if-eqz v0, :cond_3

    new-instance v0, Lub0/c$d;

    check-cast p1, Lwb0/g$b;

    invoke-virtual {p1}, Lwb0/g$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lub0/c$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lwb0/g$f;

    if-eqz v0, :cond_4

    new-instance v0, Lub0/c$f;

    check-cast p1, Lwb0/g$f;

    invoke-virtual {p1}, Lwb0/g$f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lwb0/g$f;->c()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p1}, Lwb0/g$f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lub0/c$f;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    return-object v0

    :cond_4
    instance-of v0, p1, Lwb0/g$a;

    if-eqz v0, :cond_5

    sget-object p1, Lub0/c$a;->a:Lub0/c$a;

    return-object p1

    :cond_5
    instance-of v0, p1, Lwb0/g$c;

    if-eqz v0, :cond_6

    new-instance v0, Lub0/c$b;

    check-cast p1, Lwb0/g$c;

    invoke-virtual {p1}, Lwb0/g$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lub0/c$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
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

    iget-object v0, p0, Lwb0/h;->E:Lec3/l;

    return-object v0
.end method

.method public final n(Lwb0/g;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwb0/h;->x:Lbc3/c0;

    new-instance v1, Lwb0/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lwb0/h$a;-><init>(Lwb0/h;Lwb0/g;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
