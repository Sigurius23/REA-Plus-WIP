.class public final Lwg2/d;
.super Lwg2/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lwg2/d;",
        "Lwg2/c;",
        "Lvg2/c;",
        "interactor",
        "Lxg2/a;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lvg2/c;Lxg2/a;Lor2/m;)V",
        "Lwg2/b;",
        "Lvg2/a;",
        "p",
        "(Lwg2/b;)Lvg2/a;",
        "event",
        "Ll83/a0;",
        "o",
        "(Lwg2/b;)V",
        "y",
        "Lxg2/a;",
        "z",
        "Lor2/m;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/f2;",
        "Lwg2/e;",
        "F",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "start-activity_release"
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

.field private final F:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final y:Lxg2/a;

.field private final z:Lor2/m;


# direct methods
.method public constructor <init>(Lvg2/c;Lxg2/a;Lor2/m;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lwg2/c;-><init>(Lor2/m;)V

    .line 2
    iput-object p2, p0, Lwg2/d;->y:Lxg2/a;

    .line 3
    iput-object p3, p0, Lwg2/d;->z:Lor2/m;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lwg2/d;->E:Lec3/o1;

    .line 5
    new-instance v0, Lwg2/d$b;

    invoke-direct {v0, p2, p0}, Lwg2/d$b;-><init>(Lec3/l;Lwg2/d;)V

    .line 6
    invoke-virtual {p1, v0}, Lvg2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Lwg2/d$c;

    invoke-direct {p2, p1, p0}, Lwg2/d$c;-><init>(Lec3/l;Lwg2/d;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    .line 9
    sget-object v0, Lwg2/e$c;->a:Lwg2/e$c;

    .line 10
    invoke-static {p2, p3, p1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lwg2/d;->F:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lvg2/c;Lxg2/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lwg2/d;-><init>(Lvg2/c;Lxg2/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lwg2/d;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lwg2/d;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lwg2/d;)Lxg2/a;
    .locals 0

    iget-object p0, p0, Lwg2/d;->y:Lxg2/a;

    return-object p0
.end method

.method public static final synthetic n(Lwg2/d;Lwg2/b;)Lvg2/a;
    .locals 0

    invoke-direct {p0, p1}, Lwg2/d;->p(Lwg2/b;)Lvg2/a;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lwg2/b;)Lvg2/a;
    .locals 1

    new-instance v0, Lvg2/a;

    invoke-virtual {p1}, Lwg2/b;->a()Lwg2/a;

    move-result-object p1

    invoke-virtual {p1}, Lwg2/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lvg2/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lwg2/b;

    invoke-virtual {p0, p1}, Lwg2/d;->o(Lwg2/b;)V

    return-void
.end method

.method public getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lwg2/d;->F:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwg2/d;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public o(Lwg2/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwg2/d;->z:Lor2/m;

    new-instance v1, Lwg2/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lwg2/d$a;-><init>(Lwg2/d;Lwg2/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
