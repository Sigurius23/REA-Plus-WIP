.class public final Lpv0/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n*\u0008\u0012\u0004\u0012\u00020\u000c0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010 \u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lpv0/c;",
        "Landroidx/lifecycle/w1;",
        "Lnv0/c;",
        "interactor",
        "Lqv0/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lnv0/c;Lqv0/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Lnv0/a;",
        "Lnv0/b;",
        "l",
        "(Lec3/l;Lnv0/c;)Lec3/l;",
        "Lpv0/d;",
        "o",
        "(Lec3/l;Lqv0/a;)Lec3/l;",
        "Lpv0/b;",
        "viewEvent",
        "n",
        "(Lpv0/b;)Lnv0/a;",
        "Ll83/a0;",
        "p",
        "(Lpv0/b;)V",
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
        "content-search_release"
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
.method public constructor <init>(Lnv0/c;Lqv0/a;Lbc3/c0;)V
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
    iput-object p3, p0, Lpv0/c;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lpv0/c;->x:Lec3/o1;

    .line 4
    new-instance v1, Lpv0/c$b;

    invoke-direct {v1, v0, p0}, Lpv0/c$b;-><init>(Lec3/l;Lpv0/c;)V

    .line 5
    invoke-direct {p0, v1, p1}, Lpv0/c;->l(Lec3/l;Lnv0/c;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lpv0/c;->y:Lec3/l;

    .line 6
    invoke-direct {p0, p1, p2}, Lpv0/c;->o(Lec3/l;Lqv0/a;)Lec3/l;

    move-result-object p1

    .line 7
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lpv0/c;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lnv0/c;Lqv0/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 8
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpv0/c;-><init>(Lnv0/c;Lqv0/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lpv0/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lpv0/c;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lpv0/c;Lpv0/b;)Lnv0/a;
    .locals 0

    invoke-direct {p0, p1}, Lpv0/c;->n(Lpv0/b;)Lnv0/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lnv0/c;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lnv0/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lnv0/c;->n(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lpv0/b;)Lnv0/a;
    .locals 1

    instance-of v0, p1, Lpv0/b$b;

    if-eqz v0, :cond_0

    new-instance v0, Lnv0/a$b;

    check-cast p1, Lpv0/b$b;

    invoke-virtual {p1}, Lpv0/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnv0/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lpv0/b$c;

    if-eqz v0, :cond_1

    new-instance v0, Lnv0/a$c;

    check-cast p1, Lpv0/b$c;

    invoke-virtual {p1}, Lpv0/b$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnv0/a$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lpv0/b$d;

    if-eqz v0, :cond_2

    new-instance v0, Lnv0/a$d;

    check-cast p1, Lpv0/b$d;

    invoke-virtual {p1}, Lpv0/b$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnv0/a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lpv0/b$a;

    if-eqz v0, :cond_3

    sget-object p1, Lnv0/a$a;->a:Lnv0/a$a;

    return-object p1

    :cond_3
    instance-of v0, p1, Lpv0/b$e;

    if-eqz v0, :cond_4

    new-instance v0, Lnv0/a$e;

    check-cast p1, Lpv0/b$e;

    invoke-virtual {p1}, Lpv0/b$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnv0/a$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final o(Lec3/l;Lqv0/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lqv0/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lqv0/a;->d(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lpv0/c;->z:Lec3/l;

    return-object v0
.end method

.method public final p(Lpv0/b;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpv0/c;->w:Lbc3/c0;

    new-instance v1, Lpv0/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lpv0/c$a;-><init>(Lpv0/c;Lpv0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
