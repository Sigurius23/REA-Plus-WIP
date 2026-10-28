.class public final Ljz1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Ljz1/b;",
        "Landroidx/lifecycle/w1;",
        "Liz1/c;",
        "interactor",
        "Lkz1/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Liz1/c;Lkz1/a;Lbc3/c0;)V",
        "Ljz1/a;",
        "Liz1/a;",
        "n",
        "(Ljz1/a;)Liz1/a;",
        "event",
        "Ll83/a0;",
        "l",
        "(Ljz1/a;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "viewEvents",
        "Lec3/f2;",
        "Ljz1/c;",
        "y",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "motion-tracking-sandbox_release"
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

.field private final y:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Liz1/c;Lkz1/a;Lbc3/c0;)V
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
    iput-object p3, p0, Ljz1/b;->w:Lbc3/c0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    invoke-static {v1, v1, v2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Ljz1/b;->x:Lec3/o1;

    .line 4
    new-instance v1, Ljz1/b$b;

    invoke-direct {v1, v0, p0}, Ljz1/b$b;-><init>(Lec3/l;Ljz1/b;)V

    .line 5
    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 6
    new-instance v0, Ljz1/b$c;

    invoke-direct {v0, p1, p2}, Ljz1/b$c;-><init>(Lec3/l;Lkz1/a;)V

    .line 7
    new-instance p1, Liz1/b;

    const/4 v1, 0x3

    invoke-direct {p1, v2, v2, v1, v2}, Liz1/b;-><init>(Liz1/e;Lgz1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, p1}, Lkz1/a;->e(Liz1/b;)Ljz1/c;

    move-result-object p1

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    invoke-static {v0, p3, p2, p1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Ljz1/b;->y:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Liz1/c;Lkz1/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Ljz1/b;-><init>(Liz1/c;Lkz1/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Ljz1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ljz1/b;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Ljz1/b;Ljz1/a;)Liz1/a;
    .locals 0

    invoke-direct {p0, p1}, Ljz1/b;->n(Ljz1/a;)Liz1/a;

    move-result-object p0

    return-object p0
.end method

.method private final n(Ljz1/a;)Liz1/a;
    .locals 1

    sget-object v0, Ljz1/a$a;->a:Ljz1/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Liz1/a$a;->a:Liz1/a$a;

    return-object p1

    :cond_0
    sget-object v0, Ljz1/a$b;->a:Ljz1/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Liz1/a$b;->a:Liz1/a$b;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Ljz1/b;->y:Lec3/f2;

    return-object v0
.end method

.method public final l(Ljz1/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljz1/b;->w:Lbc3/c0;

    new-instance v1, Ljz1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ljz1/b$a;-><init>(Ljz1/b;Ljz1/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
