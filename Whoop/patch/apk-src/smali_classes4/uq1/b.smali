.class public final Luq1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Luq1/b;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lrq1/c;",
        "interactor",
        "Lvq1/a;",
        "reducer",
        "<init>",
        "(Lbc3/c0;Lrq1/c;Lvq1/a;)V",
        "Lec3/l;",
        "Lrq1/a;",
        "Lrq1/b;",
        "l",
        "(Lec3/l;Lrq1/c;)Lec3/l;",
        "Luq1/a;",
        "viewEvent",
        "Lbc3/k1;",
        "n",
        "(Luq1/a;)Lbc3/k1;",
        "w",
        "Lbc3/c0;",
        "x",
        "Lvq1/a;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "z",
        "Lec3/l;",
        "domainState",
        "Luq1/c;",
        "E",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "behavior-impact_release"
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

.field private final w:Lbc3/c0;

.field private final x:Lvq1/a;

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
.method public constructor <init>(Lbc3/c0;Lrq1/c;Lvq1/a;)V
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
    iput-object p1, p0, Luq1/b;->w:Lbc3/c0;

    .line 3
    iput-object p3, p0, Luq1/b;->x:Lvq1/a;

    const/4 p3, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p3, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Luq1/b;->y:Lec3/o1;

    .line 5
    invoke-direct {p0, p3, p2}, Luq1/b;->l(Lec3/l;Lrq1/c;)Lec3/l;

    move-result-object p2

    iput-object p2, p0, Luq1/b;->z:Lec3/l;

    .line 6
    sget-object p3, Lec3/z1;->a:Lec3/b2;

    .line 7
    invoke-static {p2, p1, p3, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    .line 8
    new-instance p2, Luq1/b$b;

    invoke-direct {p2, p1, p0}, Luq1/b$b;-><init>(Lec3/l;Luq1/b;)V

    .line 9
    iput-object p2, p0, Luq1/b;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lrq1/c;Lvq1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    .line 10
    new-instance p1, Lor2/m;

    const/4 p4, 0x0

    invoke-direct {p1, p4, p5, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Luq1/b;-><init>(Lbc3/c0;Lrq1/c;Lvq1/a;)V

    return-void
.end method

.method public static final synthetic g(Luq1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Luq1/b;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Luq1/b;)Lvq1/a;
    .locals 0

    iget-object p0, p0, Luq1/b;->x:Lvq1/a;

    return-object p0
.end method

.method private final l(Lec3/l;Lrq1/c;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lrq1/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lrq1/c;->interact(Lec3/l;)Lec3/l;

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

    iget-object v0, p0, Luq1/b;->E:Lec3/l;

    return-object v0
.end method

.method public final n(Luq1/a;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Luq1/a$a;->a:Luq1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Luq1/b;->w:Lbc3/c0;

    new-instance v0, Luq1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Luq1/b$a;-><init>(Luq1/b;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
