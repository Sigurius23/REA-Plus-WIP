.class public final Lue2/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e*\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lue2/c;",
        "Landroidx/lifecycle/w1;",
        "Lue2/b;",
        "reducer",
        "Lse2/d;",
        "interactor",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lue2/b;Lse2/d;Lbc3/c0;)V",
        "Lte2/b$b;",
        "Lse2/b;",
        "l",
        "(Lte2/b$b;)Lse2/b;",
        "Lec3/l;",
        "Lse2/c;",
        "Lue2/a;",
        "n",
        "(Lec3/l;Lue2/b;)Lec3/l;",
        "viewEvent",
        "Ll83/a0;",
        "o",
        "(Lte2/b$b;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "y",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "sleep-coach_release"
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


# direct methods
.method public constructor <init>(Lue2/b;Lse2/d;Lbc3/c0;)V
    .locals 3

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lue2/c;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lue2/c;->x:Lec3/o1;

    .line 4
    new-instance v1, Lue2/c$c;

    invoke-direct {v1, v0, p0}, Lue2/c$c;-><init>(Lec3/l;Lue2/c;)V

    .line 5
    invoke-static {v1, p2}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p2

    .line 6
    invoke-direct {p0, p2, p1}, Lue2/c;->n(Lec3/l;Lue2/b;)Lec3/l;

    move-result-object p1

    .line 7
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lue2/c;->y:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lue2/b;Lse2/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lue2/c;-><init>(Lue2/b;Lse2/d;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lue2/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lue2/c;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lue2/c;Lte2/b$b;)Lse2/b;
    .locals 0

    invoke-direct {p0, p1}, Lue2/c;->l(Lte2/b$b;)Lse2/b;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lte2/b$b;)Lse2/b;
    .locals 1

    sget-object v0, Lte2/b$b$c;->a:Lte2/b$b$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lse2/b$c;->a:Lse2/b$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lte2/b$b$b;

    if-eqz v0, :cond_1

    new-instance v0, Lse2/b$b;

    check-cast p1, Lte2/b$b$b;

    invoke-virtual {p1}, Lte2/b$b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lse2/b$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    sget-object v0, Lte2/b$b$a;->a:Lte2/b$b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lse2/b$a;->a:Lse2/b$a;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final n(Lec3/l;Lue2/b;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lue2/b;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lue2/c$a;

    invoke-direct {v0, p1, p2}, Lue2/c$a;-><init>(Lec3/l;Lue2/b;)V

    return-object v0
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

    iget-object v0, p0, Lue2/c;->y:Lec3/l;

    return-object v0
.end method

.method public final o(Lte2/b$b;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lue2/c;->w:Lbc3/c0;

    new-instance v1, Lue2/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lue2/c$b;-><init>(Lue2/c;Lte2/b$b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
