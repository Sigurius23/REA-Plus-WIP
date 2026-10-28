.class public final Lim2/b;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lim2/c;",
        "Lim2/a$f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000c*\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lim2/b;",
        "Lld1/c;",
        "Lim2/c;",
        "Lim2/a$f;",
        "Lfm2/d;",
        "interactor",
        "Ljm2/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lfm2/d;Ljm2/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Lfm2/b;",
        "Lfm2/c;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "p",
        "(Lim2/a$f;)Lfm2/b;",
        "event",
        "Ll83/a0;",
        "o",
        "(Lim2/a$f;)V",
        "x",
        "Lfm2/d;",
        "y",
        "Ljm2/a;",
        "z",
        "Lbc3/c0;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "F",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "trends-mini-arch_release"
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
.field private final E:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
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

.field private final x:Lfm2/d;

.field private final y:Ljm2/a;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lfm2/d;Ljm2/a;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lim2/b;->x:Lfm2/d;

    .line 3
    iput-object p2, p0, Lim2/b;->y:Ljm2/a;

    .line 4
    iput-object p3, p0, Lim2/b;->z:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lim2/b;->E:Lec3/o1;

    .line 6
    new-instance p2, Lim2/b$b;

    invoke-direct {p2, p1, p0}, Lim2/b$b;-><init>(Lec3/l;Lim2/b;)V

    .line 7
    invoke-direct {p0, p2}, Lim2/b;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lim2/b$c;

    invoke-direct {p2, p1, p0}, Lim2/b$c;-><init>(Lec3/l;Lim2/b;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lim2/b;->F:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lfm2/d;Ljm2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lim2/b;-><init>(Lfm2/d;Ljm2/a;Lbc3/c0;)V

    return-void
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

    iget-object v0, p0, Lim2/b;->x:Lfm2/d;

    invoke-virtual {v0, p1}, Lfm2/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Lim2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lim2/b;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lim2/b;)Ljm2/a;
    .locals 0

    iget-object p0, p0, Lim2/b;->y:Ljm2/a;

    return-object p0
.end method

.method public static final synthetic n(Lim2/b;Lim2/a$f;)Lfm2/b;
    .locals 0

    invoke-direct {p0, p1}, Lim2/b;->p(Lim2/a$f;)Lfm2/b;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lim2/a$f;)Lfm2/b;
    .locals 3

    instance-of v0, p1, Lim2/a$e;

    if-eqz v0, :cond_0

    new-instance v0, Lfm2/b$a;

    check-cast p1, Lim2/a$e;

    invoke-virtual {p1}, Lim2/a$e;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lfm2/b$a;-><init>(Ljava/lang/String;Lfm2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lim2/a$f;

    invoke-virtual {p0, p1}, Lim2/b;->o(Lim2/a$f;)V

    return-void
.end method

.method public getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lim2/b;->F:Lec3/l;

    return-object v0
.end method

.method public o(Lim2/a$f;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lim2/b;->z:Lbc3/c0;

    new-instance v1, Lim2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lim2/b$a;-><init>(Lim2/b;Lim2/a$f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
