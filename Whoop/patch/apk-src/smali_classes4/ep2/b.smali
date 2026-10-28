.class public final Lep2/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lep2/b;",
        "Landroidx/lifecycle/w1;",
        "Lbp2/d;",
        "interactor",
        "Lfp2/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lbp2/d;Lfp2/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Lbp2/b;",
        "Lbp2/c;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lep2/a$q;",
        "o",
        "(Lep2/a$q;)Lbp2/b;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lep2/a$q;)V",
        "w",
        "Lbp2/d;",
        "x",
        "Lfp2/a;",
        "y",
        "Lbc3/c0;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lep2/c;",
        "E",
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
.field private final E:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final w:Lbp2/d;

.field private final x:Lfp2/a;

.field private final y:Lbc3/c0;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbp2/d;Lfp2/a;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lep2/b;->w:Lbp2/d;

    .line 3
    iput-object p2, p0, Lep2/b;->x:Lfp2/a;

    .line 4
    iput-object p3, p0, Lep2/b;->y:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lep2/b;->z:Lec3/o1;

    .line 6
    new-instance p2, Lep2/b$b;

    invoke-direct {p2, p1, p0}, Lep2/b$b;-><init>(Lec3/l;Lep2/b;)V

    .line 7
    invoke-direct {p0, p2}, Lep2/b;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lep2/b$c;

    invoke-direct {p2, p1, p0}, Lep2/b$c;-><init>(Lec3/l;Lep2/b;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lep2/b;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lbp2/d;Lfp2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lep2/b;-><init>(Lbp2/d;Lfp2/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lep2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lep2/b;->z:Lec3/o1;

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

    iget-object v0, p0, Lep2/b;->w:Lbp2/d;

    invoke-virtual {v0, p1}, Lbp2/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Lep2/b;)Lfp2/a;
    .locals 0

    iget-object p0, p0, Lep2/b;->x:Lfp2/a;

    return-object p0
.end method

.method public static final synthetic l(Lep2/b;Lep2/a$q;)Lbp2/b;
    .locals 0

    invoke-direct {p0, p1}, Lep2/b;->o(Lep2/a$q;)Lbp2/b;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lep2/a$q;)Lbp2/b;
    .locals 2

    instance-of v0, p1, Lep2/a$g;

    if-eqz v0, :cond_0

    new-instance v0, Lbp2/b$b;

    check-cast p1, Lep2/a$g;

    invoke-virtual {p1}, Lep2/a$g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lep2/a$g;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lbp2/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lep2/a$p;

    if-eqz v0, :cond_1

    sget-object p1, Lbp2/b$d;->a:Lbp2/b$d;

    return-object p1

    :cond_1
    instance-of v0, p1, Lep2/a$n;

    if-eqz v0, :cond_2

    new-instance v0, Lbp2/b$c;

    check-cast p1, Lep2/a$n;

    invoke-virtual {p1}, Lep2/a$n;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, p1}, Lbp2/b$c;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_2
    instance-of p1, p1, Lep2/a$e;

    if-eqz p1, :cond_3

    sget-object p1, Lbp2/b$a;->a:Lbp2/b$a;

    return-object p1

    :cond_3
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

    iget-object v0, p0, Lep2/b;->E:Lec3/l;

    return-object v0
.end method

.method public final n(Lep2/a$q;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lep2/b;->y:Lbc3/c0;

    new-instance v1, Lep2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lep2/b$a;-><init>(Lep2/b;Lep2/a$q;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
