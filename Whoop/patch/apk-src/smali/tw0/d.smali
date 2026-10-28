.class public final Ltw0/d;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Ltw0/d;",
        "Landroidx/lifecycle/w1;",
        "Lsw0/f;",
        "interactor",
        "Ltw0/e;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lsw0/f;Ltw0/e;Lbc3/c0;)V",
        "Lec3/l;",
        "Lsw0/d;",
        "Lsw0/e;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Ltw0/c;",
        "o",
        "(Ltw0/c;)Lsw0/d;",
        "viewEvent",
        "Lbc3/k1;",
        "n",
        "(Ltw0/c;)Lbc3/k1;",
        "w",
        "Lsw0/f;",
        "x",
        "Ltw0/e;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Luw0/p;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "custombottomsheet_release"
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

.field private final w:Lsw0/f;

.field private final x:Ltw0/e;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsw0/f;Ltw0/e;Lbc3/c0;)V
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
    iput-object p1, p0, Ltw0/d;->w:Lsw0/f;

    .line 3
    iput-object p2, p0, Ltw0/d;->x:Ltw0/e;

    .line 4
    iput-object p3, p0, Ltw0/d;->y:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Ltw0/d;->z:Lec3/o1;

    .line 6
    new-instance p2, Ltw0/d$b;

    invoke-direct {p2, p1, p0}, Ltw0/d$b;-><init>(Lec3/l;Ltw0/d;)V

    .line 7
    invoke-direct {p0, p2}, Ltw0/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Ltw0/d$c;

    invoke-direct {p2, p1, p0}, Ltw0/d$c;-><init>(Lec3/l;Ltw0/d;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Ltw0/d;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lsw0/f;Ltw0/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Ltw0/d;-><init>(Lsw0/f;Ltw0/e;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Ltw0/d;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ltw0/d;->z:Lec3/o1;

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

    iget-object v0, p0, Ltw0/d;->w:Lsw0/f;

    invoke-virtual {v0, p1}, Lsw0/f;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Ltw0/d;)Ltw0/e;
    .locals 0

    iget-object p0, p0, Ltw0/d;->x:Ltw0/e;

    return-object p0
.end method

.method public static final synthetic l(Ltw0/d;Ltw0/c;)Lsw0/d;
    .locals 0

    invoke-direct {p0, p1}, Ltw0/d;->o(Ltw0/c;)Lsw0/d;

    move-result-object p0

    return-object p0
.end method

.method private final o(Ltw0/c;)Lsw0/d;
    .locals 1

    instance-of v0, p1, Ltw0/c$f;

    if-eqz v0, :cond_0

    new-instance v0, Lsw0/d$f;

    check-cast p1, Ltw0/c$f;

    invoke-virtual {p1}, Ltw0/c$f;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lsw0/d$f;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Ltw0/c$c;

    if-eqz v0, :cond_1

    new-instance v0, Lsw0/d$c;

    check-cast p1, Ltw0/c$c;

    invoke-virtual {p1}, Ltw0/c$c;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lsw0/d$c;-><init>(I)V

    return-object v0

    :cond_1
    instance-of v0, p1, Ltw0/c$b;

    if-eqz v0, :cond_2

    sget-object p1, Lsw0/d$b;->a:Lsw0/d$b;

    return-object p1

    :cond_2
    instance-of v0, p1, Ltw0/c$a;

    if-eqz v0, :cond_3

    new-instance v0, Lsw0/d$a;

    check-cast p1, Ltw0/c$a;

    invoke-virtual {p1}, Ltw0/c$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lsw0/d$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Ltw0/c$g;

    if-eqz v0, :cond_4

    new-instance v0, Lsw0/d$g;

    check-cast p1, Ltw0/c$g;

    invoke-virtual {p1}, Ltw0/c$g;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lsw0/d$g;-><init>(Z)V

    return-object v0

    :cond_4
    instance-of v0, p1, Ltw0/c$d;

    if-eqz v0, :cond_5

    new-instance v0, Lsw0/d$d;

    check-cast p1, Ltw0/c$d;

    invoke-virtual {p1}, Ltw0/c$d;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lsw0/d$d;-><init>(I)V

    return-object v0

    :cond_5
    instance-of v0, p1, Ltw0/c$h;

    if-eqz v0, :cond_6

    new-instance v0, Lsw0/d$h;

    check-cast p1, Ltw0/c$h;

    invoke-virtual {p1}, Ltw0/c$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lsw0/d$h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Ltw0/c$e;

    if-eqz v0, :cond_7

    new-instance v0, Lsw0/d$e;

    check-cast p1, Ltw0/c$e;

    invoke-virtual {p1}, Ltw0/c$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lsw0/d$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
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

    iget-object v0, p0, Ltw0/d;->E:Lec3/l;

    return-object v0
.end method

.method public final n(Ltw0/c;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltw0/d;->y:Lbc3/c0;

    new-instance v1, Ltw0/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ltw0/d$a;-><init>(Ltw0/d;Ltw0/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
