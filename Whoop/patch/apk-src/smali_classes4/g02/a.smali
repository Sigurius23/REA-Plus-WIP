.class public final Lg02/a;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lg02/a;",
        "Landroidx/lifecycle/w1;",
        "Lc02/c;",
        "interactor",
        "Le02/h;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lc02/c;Le02/h;Lbc3/c0;)V",
        "Le02/f;",
        "Lc02/a;",
        "o",
        "(Le02/f;)Lc02/a;",
        "event",
        "Ll83/a0;",
        "n",
        "(Le02/f;)V",
        "w",
        "Le02/h;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "sizeGuideViewEventFlow",
        "Lec3/l;",
        "Le02/g;",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "native-store_release"
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
.field private final w:Le02/h;

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
.method public constructor <init>(Lc02/c;Le02/h;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lg02/a;->w:Le02/h;

    .line 3
    iput-object p3, p0, Lg02/a;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lg02/a;->y:Lec3/o1;

    .line 5
    new-instance v0, Lg02/a$b;

    invoke-direct {v0, p2, p0}, Lg02/a$b;-><init>(Lec3/l;Lg02/a;)V

    .line 6
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Lg02/a$c;

    invoke-direct {p2, p1, p0}, Lg02/a$c;-><init>(Lec3/l;Lg02/a;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lg02/a;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lc02/c;Le02/h;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lg02/a;-><init>(Lc02/c;Le02/h;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lg02/a;)Le02/h;
    .locals 0

    iget-object p0, p0, Lg02/a;->w:Le02/h;

    return-object p0
.end method

.method public static final synthetic j(Lg02/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lg02/a;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lg02/a;Le02/f;)Lc02/a;
    .locals 0

    invoke-direct {p0, p1}, Lg02/a;->o(Le02/f;)Lc02/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Le02/f;)Lc02/a;
    .locals 1

    instance-of v0, p1, Le02/c;

    if-eqz v0, :cond_0

    new-instance v0, Lc02/a$a;

    check-cast p1, Le02/c;

    invoke-virtual {p1}, Le02/c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc02/a$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Le02/e;

    if-eqz v0, :cond_1

    new-instance v0, Lc02/a$a;

    check-cast p1, Le02/e;

    invoke-virtual {p1}, Le02/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc02/a$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
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

    iget-object v0, p0, Lg02/a;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Le02/f;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg02/a;->x:Lbc3/c0;

    new-instance v1, Lg02/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lg02/a$a;-><init>(Lg02/a;Le02/f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
