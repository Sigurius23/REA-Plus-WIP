.class public final Lzn0/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lzn0/b;",
        "Landroidx/lifecycle/w1;",
        "Lvn0/d;",
        "interactor",
        "Lao0/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lvn0/d;Lao0/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Lvn0/b;",
        "Lvn0/c;",
        "l",
        "(Lec3/l;Lvn0/d;)Lec3/l;",
        "Lzn0/a;",
        "o",
        "(Lzn0/a;)Lvn0/b;",
        "viewEvent",
        "Ll83/a0;",
        "n",
        "(Lzn0/a;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "y",
        "Lec3/l;",
        "domainState",
        "Lzn0/c;",
        "z",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "change-password_release"
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
.method public constructor <init>(Lvn0/d;Lao0/a;Lbc3/c0;)V
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
    iput-object p3, p0, Lzn0/b;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lzn0/b;->x:Lec3/o1;

    .line 4
    new-instance v1, Lzn0/b$b;

    invoke-direct {v1, v0, p0}, Lzn0/b$b;-><init>(Lec3/l;Lzn0/b;)V

    .line 5
    invoke-direct {p0, v1, p1}, Lzn0/b;->l(Lec3/l;Lvn0/d;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lzn0/b;->y:Lec3/l;

    .line 6
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    .line 7
    new-instance p3, Lzn0/b$c;

    invoke-direct {p3, p1, p2}, Lzn0/b$c;-><init>(Lec3/l;Lao0/a;)V

    .line 8
    iput-object p3, p0, Lzn0/b;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lvn0/d;Lao0/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lzn0/b;-><init>(Lvn0/d;Lao0/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lzn0/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lzn0/b;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lzn0/b;Lzn0/a;)Lvn0/b;
    .locals 0

    invoke-direct {p0, p1}, Lzn0/b;->o(Lzn0/a;)Lvn0/b;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lvn0/d;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lvn0/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lvn0/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final o(Lzn0/a;)Lvn0/b;
    .locals 3

    instance-of v0, p1, Lzn0/a$e;

    if-eqz v0, :cond_0

    sget-object p1, Lvn0/b$c;->a:Lvn0/b$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lzn0/a$f;

    if-eqz v0, :cond_1

    new-instance v0, Lvn0/b$f;

    check-cast p1, Lzn0/a$f;

    invoke-virtual {p1}, Lzn0/a$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvn0/b$f;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lzn0/a$c;

    if-eqz v0, :cond_2

    new-instance v0, Lvn0/b$e;

    check-cast p1, Lzn0/a$c;

    invoke-virtual {p1}, Lzn0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvn0/b$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lzn0/a$a;

    if-eqz v0, :cond_3

    new-instance v0, Lvn0/b$d;

    check-cast p1, Lzn0/a$a;

    invoke-virtual {p1}, Lzn0/a$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lzn0/a$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lzn0/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lvn0/b$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lzn0/a$b;

    if-eqz v0, :cond_4

    new-instance v0, Lvn0/b$a;

    check-cast p1, Lzn0/a$b;

    invoke-virtual {p1}, Lzn0/a$b;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lvn0/b$a;-><init>(Z)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lzn0/a$d;

    if-eqz p1, :cond_5

    sget-object p1, Lvn0/b$b;->a:Lvn0/b$b;

    return-object p1

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

    iget-object v0, p0, Lzn0/b;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Lzn0/a;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzn0/b;->w:Lbc3/c0;

    new-instance v1, Lzn0/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzn0/b$a;-><init>(Lzn0/b;Lzn0/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
