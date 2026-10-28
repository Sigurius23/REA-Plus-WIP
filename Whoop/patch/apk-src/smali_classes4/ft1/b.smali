.class public final Lft1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lft1/b;",
        "Landroidx/lifecycle/w1;",
        "Ldt1/d;",
        "combiner",
        "Lft1/d;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ldt1/d;Lft1/d;Lbc3/c0;)V",
        "Lft1/a;",
        "event",
        "Ll83/a0;",
        "l",
        "(Lft1/a;)V",
        "w",
        "Lft1/d;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "events",
        "Lec3/l;",
        "Lft1/c;",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "labrador_release"
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
.field private final w:Lft1/d;

.field private final x:Lbc3/c0;

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
.method public constructor <init>(Ldt1/d;Lft1/d;Lbc3/c0;)V
    .locals 2

    const-string v0, "combiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lft1/b;->w:Lft1/d;

    .line 3
    iput-object p3, p0, Lft1/b;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 p3, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, p2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lft1/b;->y:Lec3/o1;

    .line 5
    new-instance p3, Lft1/b$b;

    invoke-direct {p3, p2}, Lft1/b$b;-><init>(Lec3/l;)V

    .line 6
    invoke-static {p3, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Lft1/b$c;

    invoke-direct {p2, p1, p0}, Lft1/b$c;-><init>(Lec3/l;Lft1/b;)V

    .line 8
    iput-object p2, p0, Lft1/b;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Ldt1/d;Lft1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lft1/b;-><init>(Ldt1/d;Lft1/d;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lft1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lft1/b;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lft1/b;)Lft1/d;
    .locals 0

    iget-object p0, p0, Lft1/b;->w:Lft1/d;

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

    iget-object v0, p0, Lft1/b;->z:Lec3/l;

    return-object v0
.end method

.method public final l(Lft1/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lft1/b;->x:Lbc3/c0;

    new-instance v1, Lft1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lft1/b$a;-><init>(Lft1/b;Lft1/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
