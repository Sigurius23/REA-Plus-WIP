.class public final Lvh0/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001cR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020!0\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001c\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lvh0/b;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lsh0/c;",
        "interactor",
        "Lvh0/d;",
        "reducer",
        "<init>",
        "(Lbc3/c0;Lsh0/c;Lvh0/d;)V",
        "Lvh0/a;",
        "viewEvent",
        "Ll83/a0;",
        "l",
        "(Lvh0/a;)V",
        "w",
        "Lbc3/c0;",
        "x",
        "Lsh0/c;",
        "y",
        "Lvh0/d;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lsh0/a;",
        "E",
        "Lec3/l;",
        "domainActionFlow",
        "Lsh0/b;",
        "F",
        "domainResultFlow",
        "Lvh0/c;",
        "G",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "ai-insights_release"
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

.field private final G:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final w:Lbc3/c0;

.field private final x:Lsh0/c;

.field private final y:Lvh0/d;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lsh0/c;Lvh0/d;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lvh0/b;->w:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lvh0/b;->x:Lsh0/c;

    .line 4
    iput-object p3, p0, Lvh0/b;->y:Lvh0/d;

    const/4 p3, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p3, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lvh0/b;->z:Lec3/o1;

    .line 6
    new-instance v0, Lvh0/b$b;

    invoke-direct {v0, p3}, Lvh0/b$b;-><init>(Lec3/l;)V

    .line 7
    iput-object v0, p0, Lvh0/b;->E:Lec3/l;

    .line 8
    invoke-virtual {p2, v0}, Lsh0/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p2

    iput-object p2, p0, Lvh0/b;->F:Lec3/l;

    .line 9
    new-instance p3, Lvh0/b$c;

    invoke-direct {p3, p2, p0}, Lvh0/b$c;-><init>(Lec3/l;Lvh0/b;)V

    .line 10
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p3, p1, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lvh0/b;->G:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lsh0/c;Lvh0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    .line 11
    new-instance p1, Lor2/m;

    const/4 p4, 0x0

    invoke-direct {p1, p4, p5, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvh0/b;-><init>(Lbc3/c0;Lsh0/c;Lvh0/d;)V

    return-void
.end method

.method public static final synthetic g(Lvh0/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lvh0/b;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lvh0/b;)Lvh0/d;
    .locals 0

    iget-object p0, p0, Lvh0/b;->y:Lvh0/d;

    return-object p0
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

    iget-object v0, p0, Lvh0/b;->G:Lec3/l;

    return-object v0
.end method

.method public final l(Lvh0/a;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvh0/b;->w:Lbc3/c0;

    new-instance v1, Lvh0/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lvh0/b$a;-><init>(Lvh0/b;Lvh0/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
