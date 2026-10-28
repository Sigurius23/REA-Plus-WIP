.class public final Lr02/a;
.super Lhb1/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR \u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lr02/a;",
        "Lhb1/f;",
        "Lq02/d;",
        "interactor",
        "Lt02/a;",
        "reducer",
        "Ls02/a;",
        "renderDurationEmitter",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lq02/d;Lt02/a;Ls02/a;Lor2/m;)V",
        "Lhb1/e;",
        "Lq02/a;",
        "q",
        "(Lhb1/e;)Lq02/a;",
        "event",
        "Ll83/a0;",
        "p",
        "(Lhb1/e;)V",
        "x",
        "Lt02/a;",
        "y",
        "Ls02/a;",
        "z",
        "Lor2/m;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/f2;",
        "Lhb1/g;",
        "F",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "nested-bff-arch-mini_release"
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

.field private final x:Lt02/a;

.field private final y:Ls02/a;

.field private final z:Lor2/m;


# direct methods
.method public constructor <init>(Lq02/d;Lt02/a;Ls02/a;Lor2/m;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderDurationEmitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Lhb1/f;-><init>(Lor2/m;)V

    .line 2
    iput-object p2, p0, Lr02/a;->x:Lt02/a;

    .line 3
    iput-object p3, p0, Lr02/a;->y:Ls02/a;

    .line 4
    iput-object p4, p0, Lr02/a;->z:Lor2/m;

    const/4 p2, 0x7

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 5
    invoke-static {p3, p3, v0, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lr02/a;->E:Lec3/o1;

    .line 6
    new-instance p3, Lr02/a$b;

    invoke-direct {p3, p2, p0}, Lr02/a$b;-><init>(Lec3/l;Lr02/a;)V

    .line 7
    invoke-virtual {p1, p3}, Lq02/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Lr02/a$c;

    invoke-direct {p2, p1, p0}, Lr02/a$c;-><init>(Lec3/l;Lr02/a;)V

    .line 9
    new-instance p1, Lr02/a$d;

    invoke-direct {p1, p0, v0}, Lr02/a$d;-><init>(Lr02/a;Lq83/d;)V

    .line 10
    new-instance p3, Lec3/j1;

    const/4 v0, 0x0

    invoke-direct {p3, p2, p1, v0}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 11
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    .line 12
    sget-object p2, Lhb1/g$c;->a:Lhb1/g$c;

    .line 13
    invoke-static {p3, p4, p1, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lr02/a;->F:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lq02/d;Lt02/a;Ls02/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 14
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lr02/a;-><init>(Lq02/d;Lt02/a;Ls02/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lr02/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lr02/a;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lr02/a;)Lt02/a;
    .locals 0

    iget-object p0, p0, Lr02/a;->x:Lt02/a;

    return-object p0
.end method

.method public static final synthetic n(Lr02/a;)Ls02/a;
    .locals 0

    iget-object p0, p0, Lr02/a;->y:Ls02/a;

    return-object p0
.end method

.method public static final synthetic o(Lr02/a;Lhb1/e;)Lq02/a;
    .locals 0

    invoke-direct {p0, p1}, Lr02/a;->q(Lhb1/e;)Lq02/a;

    move-result-object p0

    return-object p0
.end method

.method private final q(Lhb1/e;)Lq02/a;
    .locals 3

    instance-of v0, p1, Lhb1/e$a;

    if-eqz v0, :cond_0

    new-instance v0, Lq02/a$a;

    check-cast p1, Lhb1/e$a;

    invoke-virtual {p1}, Lhb1/e$a;->a()Lhb1/n;

    move-result-object v1

    invoke-virtual {v1}, Lhb1/n;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lhb1/e$a;->a()Lhb1/n;

    move-result-object v2

    invoke-virtual {v2}, Lhb1/n;->c()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object v2

    invoke-virtual {p1}, Lhb1/e$a;->a()Lhb1/n;

    move-result-object p1

    invoke-virtual {p1}, Lhb1/n;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lq02/a$a;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lhb1/e$b;

    if-eqz v0, :cond_1

    new-instance v0, Lq02/a$b;

    check-cast p1, Lhb1/e$b;

    invoke-virtual {p1}, Lhb1/e$b;->a()Lhb1/n;

    move-result-object v1

    invoke-virtual {v1}, Lhb1/n;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lhb1/e$b;->a()Lhb1/n;

    move-result-object v2

    invoke-virtual {v2}, Lhb1/n;->c()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object v2

    invoke-virtual {p1}, Lhb1/e$b;->a()Lhb1/n;

    move-result-object p1

    invoke-virtual {p1}, Lhb1/n;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lq02/a$b;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhb1/e;

    invoke-virtual {p0, p1}, Lr02/a;->p(Lhb1/e;)V

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
    iget-object v0, p0, Lr02/a;->F:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr02/a;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public p(Lhb1/e;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhb1/e$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr02/a;->y:Ls02/a;

    move-object v1, p1

    check-cast v1, Lhb1/e$a;

    invoke-virtual {v1}, Lhb1/e$a;->a()Lhb1/n;

    move-result-object v1

    invoke-virtual {v1}, Lhb1/n;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls02/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lr02/a;->z:Lor2/m;

    new-instance v1, Lr02/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lr02/a$a;-><init>(Lr02/a;Lhb1/e;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
