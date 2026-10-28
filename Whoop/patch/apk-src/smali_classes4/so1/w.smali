.class public final Lso1/w;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f*\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001e\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lso1/w;",
        "Landroidx/lifecycle/w1;",
        "Lpo1/c;",
        "interactor",
        "Lto1/d;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lpo1/c;Lto1/d;Lbc3/c0;)V",
        "Lso1/v;",
        "viewEvent",
        "Lpo1/a;",
        "o",
        "(Lso1/v;)Lpo1/a;",
        "Lec3/l;",
        "Lpo1/b;",
        "Lso1/x;",
        "l",
        "(Lec3/l;Lto1/d;)Lec3/l;",
        "Ll83/a0;",
        "n",
        "(Lso1/v;)V",
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
        "hormonal-insights_release"
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
.method public constructor <init>(Lpo1/c;Lto1/d;Lbc3/c0;)V
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
    iput-object p3, p0, Lso1/w;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lso1/w;->x:Lec3/o1;

    .line 4
    new-instance v1, Lso1/w$b;

    invoke-direct {v1, v0, p0}, Lso1/w$b;-><init>(Lec3/l;Lso1/w;)V

    .line 5
    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 6
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    .line 7
    invoke-static {p1, p3, v0, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    .line 8
    iput-object p1, p0, Lso1/w;->y:Lec3/l;

    .line 9
    invoke-direct {p0, p1, p2}, Lso1/w;->l(Lec3/l;Lto1/d;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lso1/w;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lpo1/c;Lto1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lso1/w;-><init>(Lpo1/c;Lto1/d;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lso1/w;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lso1/w;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lso1/w;Lso1/v;)Lpo1/a;
    .locals 0

    invoke-direct {p0, p1}, Lso1/w;->o(Lso1/v;)Lpo1/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Lto1/d;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lto1/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lto1/d;->b(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final o(Lso1/v;)Lpo1/a;
    .locals 1

    instance-of v0, p1, Lso1/v$b;

    if-eqz v0, :cond_0

    sget-object p1, Lpo1/a$b;->a:Lpo1/a$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lso1/v$a;

    if-eqz v0, :cond_1

    new-instance v0, Lpo1/a$a;

    check-cast p1, Lso1/v$a;

    invoke-virtual {p1}, Lso1/v$a;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lpo1/a$a;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lso1/v$c;

    if-eqz v0, :cond_2

    new-instance v0, Lpo1/a$d;

    check-cast p1, Lso1/v$c;

    invoke-virtual {p1}, Lso1/v$c;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lpo1/a$d;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_2
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

    iget-object v0, p0, Lso1/w;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Lso1/v;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lso1/w;->w:Lbc3/c0;

    new-instance v1, Lso1/w$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lso1/w$a;-><init>(Lso1/w;Lso1/v;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
