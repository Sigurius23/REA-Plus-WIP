.class public final Lge2/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0008*\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lge2/b;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lde2/a;",
        "interactor",
        "<init>",
        "(Lbc3/c0;Lde2/a;)V",
        "Lec3/l;",
        "Lge2/a;",
        "Lge2/c;",
        "j",
        "(Lec3/l;Lde2/a;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "l",
        "(Lge2/a;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "g",
        "()Lec3/o1;",
        "events",
        "y",
        "Lec3/l;",
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


# direct methods
.method public constructor <init>(Lbc3/c0;Lde2/a;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lge2/b;->w:Lbc3/c0;

    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v0, v1, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lge2/b;->x:Lec3/o1;

    .line 4
    new-instance v0, Lge2/b$b;

    invoke-direct {v0, v1}, Lge2/b$b;-><init>(Lq83/d;)V

    .line 5
    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 6
    invoke-direct {p0, v1, p2}, Lge2/b;->j(Lec3/l;Lde2/a;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lge2/b;->y:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lde2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    .line 7
    new-instance p1, Lor2/m;

    const/4 p3, 0x0

    invoke-direct {p1, p3, p4, p3}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lge2/b;-><init>(Lbc3/c0;Lde2/a;)V

    return-void
.end method

.method private final j(Lec3/l;Lde2/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lde2/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lde2/a;->g(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final g()Lec3/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/o1;"
        }
    .end annotation

    iget-object v0, p0, Lge2/b;->x:Lec3/o1;

    return-object v0
.end method

.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lge2/b;->y:Lec3/l;

    return-object v0
.end method

.method public final l(Lge2/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lge2/b;->w:Lbc3/c0;

    new-instance v1, Lge2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lge2/b$a;-><init>(Lge2/b;Lge2/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
