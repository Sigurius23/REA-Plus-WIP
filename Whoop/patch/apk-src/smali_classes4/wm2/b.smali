.class public final Lwm2/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001d\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\"0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lwm2/b;",
        "Landroidx/lifecycle/w1;",
        "Ltm2/a;",
        "mainInteractor",
        "Lwm2/a;",
        "navigationReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ltm2/a;Lwm2/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Lum2/a;",
        "interactor",
        "Lum2/b;",
        "n",
        "(Lec3/l;Ltm2/a;)Lec3/l;",
        "Lxm2/b;",
        "viewEvent",
        "Lum2/a$a;",
        "p",
        "(Lxm2/b;)Lum2/a$a;",
        "Ll83/a0;",
        "o",
        "(Lxm2/b;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "y",
        "Lec3/t1;",
        "domainState",
        "Lxm2/a;",
        "z",
        "Lec3/l;",
        "l",
        "()Lec3/l;",
        "navigationEvents",
        "app_prodStandardRelease"
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

.field private final z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltm2/a;Lwm2/a;Lbc3/c0;)V
    .locals 3

    const-string v0, "mainInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lwm2/b;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lwm2/b;->x:Lec3/o1;

    .line 4
    new-instance v1, Lwm2/b$c;

    invoke-direct {v1, v0, p0}, Lwm2/b$c;-><init>(Lec3/l;Lwm2/b;)V

    .line 5
    invoke-direct {p0, v1, p1}, Lwm2/b;->n(Lec3/l;Ltm2/a;)Lec3/l;

    move-result-object p1

    .line 6
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lwm2/b;->y:Lec3/t1;

    .line 7
    new-instance p3, Lwm2/b$b;

    invoke-direct {p3, p1}, Lwm2/b$b;-><init>(Lec3/l;)V

    .line 8
    new-instance p1, Lwm2/b$d;

    invoke-direct {p1, p3, p2}, Lwm2/b$d;-><init>(Lec3/l;Lwm2/a;)V

    .line 9
    iput-object p1, p0, Lwm2/b;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Ltm2/a;Lwm2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lwm2/b;-><init>(Ltm2/a;Lwm2/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lwm2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lwm2/b;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lwm2/b;Lxm2/b;)Lum2/a$a;
    .locals 0

    invoke-direct {p0, p1}, Lwm2/b;->p(Lxm2/b;)Lum2/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final n(Lec3/l;Ltm2/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Ltm2/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Ltm2/a;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lxm2/b;)Lum2/a$a;
    .locals 1

    instance-of v0, p1, Lxm2/b$a;

    if-eqz v0, :cond_0

    new-instance v0, Lum2/a$a;

    check-cast p1, Lxm2/b$a;

    invoke-virtual {p1}, Lxm2/b$a;->a()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, p1}, Lum2/a$a;-><init>(Landroid/net/Uri;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final l()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lwm2/b;->z:Lec3/l;

    return-object v0
.end method

.method public final o(Lxm2/b;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwm2/b;->w:Lbc3/c0;

    new-instance v1, Lwm2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lwm2/b$a;-><init>(Lwm2/b;Lxm2/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
