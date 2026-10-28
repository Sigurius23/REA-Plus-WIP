.class public final Lir0/a;
.super Lw01/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR \u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lir0/a;",
        "Lw01/b;",
        "Lgr0/c;",
        "interactor",
        "Ljr0/a;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lgr0/c;Ljr0/a;Lor2/m;)V",
        "Lw01/a;",
        "Lgr0/a;",
        "p",
        "(Lw01/a;)Lgr0/a;",
        "event",
        "Ll83/a0;",
        "o",
        "(Lw01/a;)V",
        "x",
        "Ljr0/a;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lgr0/b;",
        "E",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "Lw01/c;",
        "F",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "community-follower-lookup-arch-mini_release"
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

.field private final F:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final x:Ljr0/a;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgr0/c;Ljr0/a;Lor2/m;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "interactor"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "reducer"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "coroutineScope"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0, v3}, Lw01/b;-><init>(Lbc3/c0;)V

    .line 2
    iput-object v2, v0, Lir0/a;->x:Ljr0/a;

    .line 3
    iput-object v3, v0, Lir0/a;->y:Lor2/m;

    const/4 v2, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    .line 4
    invoke-static {v5, v5, v2, v4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v2

    iput-object v2, v0, Lir0/a;->z:Lec3/o1;

    .line 5
    new-instance v4, Lir0/a$b;

    invoke-direct {v4, v2, v0}, Lir0/a$b;-><init>(Lec3/l;Lir0/a;)V

    .line 6
    invoke-virtual {v1, v4}, Lgr0/c;->t(Lec3/l;)Lec3/l;

    move-result-object v1

    iput-object v1, v0, Lir0/a;->E:Lec3/l;

    .line 7
    new-instance v2, Lir0/a$c;

    invoke-direct {v2, v1, v0}, Lir0/a$c;-><init>(Lec3/l;Lir0/a;)V

    .line 8
    new-instance v4, Lw01/c;

    const/16 v18, 0x1ffe

    const/16 v19, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v4 .. v19}, Lw01/c;-><init>(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v2, v3, v1, v4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lir0/a;->F:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lgr0/c;Ljr0/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lir0/a;-><init>(Lgr0/c;Ljr0/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lir0/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lir0/a;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lir0/a;)Ljr0/a;
    .locals 0

    iget-object p0, p0, Lir0/a;->x:Ljr0/a;

    return-object p0
.end method

.method public static final synthetic n(Lir0/a;Lw01/a;)Lgr0/a;
    .locals 0

    invoke-direct {p0, p1}, Lir0/a;->p(Lw01/a;)Lgr0/a;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lw01/a;)Lgr0/a;
    .locals 1

    instance-of v0, p1, Lw01/a$d;

    if-eqz v0, :cond_0

    new-instance v0, Lgr0/a$c;

    check-cast p1, Lw01/a$d;

    invoke-virtual {p1}, Lw01/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lgr0/a$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lw01/a$e;

    if-eqz v0, :cond_1

    new-instance v0, Lgr0/a$d;

    check-cast p1, Lw01/a$e;

    invoke-virtual {p1}, Lw01/a$e;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v0, p1}, Lgr0/a$d;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lw01/a$c;

    if-eqz v0, :cond_2

    new-instance v0, Lgr0/a$e;

    check-cast p1, Lw01/a$c;

    invoke-virtual {p1}, Lw01/a$c;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v0, p1}, Lgr0/a$e;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lw01/a$b;

    if-eqz v0, :cond_3

    sget-object p1, Lgr0/a$b;->a:Lgr0/a$b;

    return-object p1

    :cond_3
    instance-of p1, p1, Lw01/a$a;

    if-eqz p1, :cond_4

    sget-object p1, Lgr0/a$a;->a:Lgr0/a$a;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw01/a;

    invoke-virtual {p0, p1}, Lir0/a;->o(Lw01/a;)V

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
    iget-object v0, p0, Lir0/a;->F:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lir0/a;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public o(Lw01/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lir0/a;->y:Lor2/m;

    new-instance v1, Lir0/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lir0/a$a;-><init>(Lir0/a;Lw01/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
