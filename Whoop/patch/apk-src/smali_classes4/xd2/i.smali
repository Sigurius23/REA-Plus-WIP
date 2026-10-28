.class public final Lxd2/i;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e*\u0008\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e*\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010!\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lxd2/i;",
        "Landroidx/lifecycle/w1;",
        "Lvd2/c;",
        "interactor",
        "Lxd2/k;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lvd2/c;Lxd2/k;Lbc3/c0;)V",
        "Lxd2/h$p;",
        "Lvd2/a;",
        "p",
        "(Lxd2/h$p;)Lvd2/a;",
        "Lec3/l;",
        "Lvd2/b;",
        "l",
        "(Lec3/l;Lvd2/c;)Lec3/l;",
        "reducer",
        "Lxd2/j;",
        "n",
        "(Lec3/l;Lxd2/k;)Lec3/l;",
        "viewEvent",
        "Lbc3/k1;",
        "o",
        "(Lxd2/h$p;)Lbc3/k1;",
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
.method public constructor <init>(Lvd2/c;Lxd2/k;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lxd2/i;->w:Lbc3/c0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    invoke-static {v1, v1, v2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lxd2/i;->x:Lec3/o1;

    .line 4
    new-instance v1, Lxd2/i$a;

    invoke-direct {v1, v2}, Lxd2/i$a;-><init>(Lq83/d;)V

    .line 5
    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 6
    new-instance v0, Lxd2/i$c;

    invoke-direct {v0, v2, p0}, Lxd2/i$c;-><init>(Lec3/l;Lxd2/i;)V

    .line 7
    invoke-direct {p0, v0, p1}, Lxd2/i;->l(Lec3/l;Lvd2/c;)Lec3/l;

    move-result-object p1

    .line 8
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lxd2/i;->y:Lec3/l;

    .line 9
    invoke-direct {p0, p1, p2}, Lxd2/i;->n(Lec3/l;Lxd2/k;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lxd2/i;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lvd2/c;Lxd2/k;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lxd2/i;-><init>(Lvd2/c;Lxd2/k;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lxd2/i;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lxd2/i;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lxd2/i;Lxd2/h$p;)Lvd2/a;
    .locals 0

    invoke-direct {p0, p1}, Lxd2/i;->p(Lxd2/h$p;)Lvd2/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lvd2/c;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lvd2/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lvd2/c;->k(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lec3/l;Lxd2/k;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lxd2/k;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lxd2/k;->b(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lxd2/h$p;)Lvd2/a;
    .locals 1

    sget-object v0, Lxd2/h$m;->a:Lxd2/h$m;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lvd2/a$g;->a:Lvd2/a$g;

    return-object p1

    :cond_0
    sget-object v0, Lxd2/h$c;->a:Lxd2/h$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lvd2/a$c;->a:Lvd2/a$c;

    return-object p1

    :cond_1
    sget-object v0, Lxd2/h$h;->a:Lxd2/h$h;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lvd2/a$h;->a:Lvd2/a$h;

    return-object p1

    :cond_2
    instance-of v0, p1, Lxd2/h$g;

    if-eqz v0, :cond_3

    new-instance v0, Lvd2/a$f;

    check-cast p1, Lxd2/h$g;

    invoke-virtual {p1}, Lxd2/h$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvd2/a$f;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    sget-object v0, Lxd2/h$e;->a:Lxd2/h$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lvd2/a$d;->a:Lvd2/a$d;

    return-object p1

    :cond_4
    sget-object v0, Lxd2/h$n;->a:Lxd2/h$n;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lvd2/a$i;->a:Lvd2/a$i;

    return-object p1

    :cond_5
    sget-object v0, Lxd2/h$a;->a:Lxd2/h$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lvd2/a$a;->a:Lvd2/a$a;

    return-object p1

    :cond_6
    instance-of v0, p1, Lxd2/h$f;

    if-eqz v0, :cond_7

    new-instance v0, Lvd2/a$e;

    check-cast p1, Lxd2/h$f;

    invoke-virtual {p1}, Lxd2/h$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvd2/a$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lxd2/h$o;

    if-eqz v0, :cond_8

    new-instance v0, Lvd2/a$j;

    check-cast p1, Lxd2/h$o;

    invoke-virtual {p1}, Lxd2/h$o;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvd2/a$j;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_8
    instance-of v0, p1, Lxd2/h$b;

    if-eqz v0, :cond_9

    new-instance v0, Lvd2/a$b;

    check-cast p1, Lxd2/h$b;

    invoke-virtual {p1}, Lxd2/h$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvd2/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_9
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

    iget-object v0, p0, Lxd2/i;->z:Lec3/l;

    return-object v0
.end method

.method public final o(Lxd2/h$p;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxd2/i;->w:Lbc3/c0;

    new-instance v1, Lxd2/i$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lxd2/i$b;-><init>(Lxd2/i;Lxd2/h$p;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
