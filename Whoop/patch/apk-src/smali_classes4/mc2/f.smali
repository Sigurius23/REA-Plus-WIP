.class public final Lmc2/f;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020!0 8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lmc2/f;",
        "Landroidx/lifecycle/w1;",
        "Lmc2/c;",
        "interactor",
        "Lmc2/g;",
        "viewStateReducer",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lmc2/c;Lmc2/g;Lbc3/c0;)V",
        "Lec3/l;",
        "Lmc2/a$a;",
        "Lmc2/b;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lmc2/e;",
        "o",
        "(Lmc2/e;)Lmc2/a$a;",
        "action",
        "Ll83/a0;",
        "p",
        "(Lmc2/e;)V",
        "w",
        "Lmc2/c;",
        "x",
        "Lmc2/g;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lmc2/m;",
        "E",
        "Lec3/t1;",
        "n",
        "()Lec3/t1;",
        "viewState",
        "settings_release"
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
.field private final E:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final w:Lmc2/c;

.field private final x:Lmc2/g;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmc2/c;Lmc2/g;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lmc2/f;->w:Lmc2/c;

    .line 3
    iput-object p2, p0, Lmc2/f;->x:Lmc2/g;

    .line 4
    iput-object p3, p0, Lmc2/f;->y:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lmc2/f;->z:Lec3/o1;

    .line 6
    new-instance p2, Lmc2/f$b;

    invoke-direct {p2, p1, p0}, Lmc2/f$b;-><init>(Lec3/l;Lmc2/f;)V

    .line 7
    invoke-direct {p0, p2}, Lmc2/f;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lmc2/f$c;

    invoke-direct {p2, p1, p0}, Lmc2/f$c;-><init>(Lec3/l;Lmc2/f;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lmc2/f;->E:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lmc2/c;Lmc2/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lmc2/f;-><init>(Lmc2/c;Lmc2/g;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lmc2/f;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lmc2/f;->z:Lec3/o1;

    return-object p0
.end method

.method private final interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lmc2/f;->w:Lmc2/c;

    invoke-virtual {v0, p1}, Lmc2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Lmc2/f;)Lmc2/g;
    .locals 0

    iget-object p0, p0, Lmc2/f;->x:Lmc2/g;

    return-object p0
.end method

.method public static final synthetic l(Lmc2/f;Lmc2/e;)Lmc2/a$a;
    .locals 0

    invoke-direct {p0, p1}, Lmc2/f;->o(Lmc2/e;)Lmc2/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lmc2/e;)Lmc2/a$a;
    .locals 0

    instance-of p1, p1, Lmc2/e$a;

    if-eqz p1, :cond_0

    sget-object p1, Lmc2/a$a;->a:Lmc2/a$a;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final n()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lmc2/f;->E:Lec3/t1;

    return-object v0
.end method

.method public final p(Lmc2/e;)V
    .locals 3

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmc2/f;->y:Lbc3/c0;

    new-instance v1, Lmc2/f$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmc2/f$a;-><init>(Lmc2/f;Lmc2/e;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
