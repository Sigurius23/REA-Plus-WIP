.class public final Lwn2/h;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001d\u0010(\u001a\u0008\u0012\u0004\u0012\u00020#0\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lwn2/h;",
        "Landroidx/lifecycle/w1;",
        "Lsn2/c;",
        "interactor",
        "Lwn2/j;",
        "reducer",
        "Lsn2/h;",
        "selection",
        "",
        "storeDomain",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lsn2/c;Lwn2/j;Lsn2/h;Ljava/lang/String;Lor2/m;)V",
        "Lwn2/e$i;",
        "Lsn2/a;",
        "o",
        "(Lwn2/e$i;)Lsn2/a;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lwn2/e$i;)V",
        "w",
        "Lwn2/j;",
        "x",
        "Lsn2/h;",
        "y",
        "Ljava/lang/String;",
        "z",
        "Lor2/m;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "buyNowViewEventFlow",
        "Lec3/l;",
        "Lwn2/i;",
        "F",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "universal-checkout_release"
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

.field private final w:Lwn2/j;

.field private final x:Lsn2/h;

.field private final y:Ljava/lang/String;

.field private final z:Lor2/m;


# direct methods
.method public constructor <init>(Lsn2/c;Lwn2/j;Lsn2/h;Ljava/lang/String;Lor2/m;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeDomain"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p5}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lwn2/h;->w:Lwn2/j;

    .line 3
    iput-object p3, p0, Lwn2/h;->x:Lsn2/h;

    .line 4
    iput-object p4, p0, Lwn2/h;->y:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lwn2/h;->z:Lor2/m;

    const/4 p2, 0x0

    const/4 p3, 0x7

    const/4 p4, 0x0

    .line 6
    invoke-static {p4, p4, p2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lwn2/h;->E:Lec3/o1;

    .line 7
    new-instance p3, Lwn2/h$b;

    invoke-direct {p3, p2, p0}, Lwn2/h$b;-><init>(Lec3/l;Lwn2/h;)V

    .line 8
    invoke-static {p3, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 9
    new-instance p2, Lwn2/h$c;

    invoke-direct {p2, p1, p0}, Lwn2/h$c;-><init>(Lec3/l;Lwn2/h;)V

    .line 10
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 p3, 0x1

    invoke-static {p2, p5, p1, p3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lwn2/h;->F:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lsn2/c;Lwn2/j;Lsn2/h;Ljava/lang/String;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 11
    new-instance p5, Lor2/m;

    const/4 p6, 0x1

    const/4 p7, 0x0

    invoke-direct {p5, p7, p6, p7}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lwn2/h;-><init>(Lsn2/c;Lwn2/j;Lsn2/h;Ljava/lang/String;Lor2/m;)V

    return-void
.end method

.method public static final synthetic g(Lwn2/h;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lwn2/h;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lwn2/h;)Lwn2/j;
    .locals 0

    iget-object p0, p0, Lwn2/h;->w:Lwn2/j;

    return-object p0
.end method

.method public static final synthetic l(Lwn2/h;Lwn2/e$i;)Lsn2/a;
    .locals 0

    invoke-direct {p0, p1}, Lwn2/h;->o(Lwn2/e$i;)Lsn2/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lwn2/e$i;)Lsn2/a;
    .locals 2

    sget-object v0, Lwn2/e$g;->a:Lwn2/e$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lsn2/a$c;

    iget-object v0, p0, Lwn2/h;->x:Lsn2/h;

    iget-object v1, p0, Lwn2/h;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lsn2/a$c;-><init>(Lsn2/h;Ljava/lang/String;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lwn2/e$f;

    if-eqz v0, :cond_1

    new-instance v0, Lsn2/a$b;

    check-cast p1, Lwn2/e$f;

    invoke-virtual {p1}, Lwn2/e$f;->a()Lsn2/d;

    move-result-object p1

    invoke-direct {v0, p1}, Lsn2/a$b;-><init>(Lsn2/d;)V

    return-object v0

    :cond_1
    sget-object v0, Lwn2/e$b;->a:Lwn2/e$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lsn2/a$a;->a:Lsn2/a$a;

    return-object p1

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

    iget-object v0, p0, Lwn2/h;->F:Lec3/l;

    return-object v0
.end method

.method public final n(Lwn2/e$i;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwn2/h;->z:Lor2/m;

    new-instance v1, Lwn2/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lwn2/h$a;-><init>(Lwn2/h;Lwn2/e$i;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
