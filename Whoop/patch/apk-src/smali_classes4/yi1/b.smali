.class public final Lyi1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lyi1/b;",
        "Landroidx/lifecycle/w1;",
        "Lvi1/d;",
        "interactor",
        "Lyi1/e;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lvi1/d;Lyi1/e;Lbc3/c0;)V",
        "Lyi1/c;",
        "viewEvent",
        "Lvi1/b$a;",
        "o",
        "(Lyi1/c;)Lvi1/b$a;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lyi1/c;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "_viewEvents",
        "Lec3/t1;",
        "Lyi1/d;",
        "y",
        "Lec3/t1;",
        "l",
        "()Lec3/t1;",
        "viewState",
        "kennel_release"
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

.field private final y:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvi1/d;Lyi1/e;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    iput-object p3, p0, Lyi1/b;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lyi1/b;->x:Lec3/o1;

    new-instance v1, Lyi1/b$b;

    invoke-direct {v1, v0, p0}, Lyi1/b$b;-><init>(Lec3/l;Lyi1/b;)V

    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    new-instance v0, Lyi1/b$c;

    invoke-direct {v0, p1, p2}, Lyi1/b$c;-><init>(Lec3/l;Lyi1/e;)V

    const-wide/16 p1, 0x1388

    const/4 v1, 0x2

    invoke-static {v1, p1, p2}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {v0, p3, p1, p2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lyi1/b;->y:Lec3/t1;

    return-void
.end method

.method public static final synthetic g(Lyi1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lyi1/b;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lyi1/b;Lyi1/c;)Lvi1/b$a;
    .locals 0

    invoke-direct {p0, p1}, Lyi1/b;->o(Lyi1/c;)Lvi1/b$a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lyi1/c;)Lvi1/b$a;
    .locals 1

    sget-object v0, Lyi1/c$a;->a:Lyi1/c$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lvi1/b$a;->a:Lvi1/b$a;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final l()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lyi1/b;->y:Lec3/t1;

    return-object v0
.end method

.method public final n(Lyi1/c;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyi1/b;->w:Lbc3/c0;

    new-instance v1, Lyi1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lyi1/b$a;-><init>(Lyi1/b;Lyi1/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
