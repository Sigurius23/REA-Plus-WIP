.class public final Lgs0/a;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lis0/s0;",
        "Lis0/r0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lgs0/a;",
        "Lld1/c;",
        "Lis0/s0;",
        "Lis0/r0;",
        "Lds0/h;",
        "interactor",
        "Lhs0/c;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lds0/h;Lhs0/c;Lor2/m;)V",
        "Lds0/d;",
        "p",
        "(Lis0/r0;)Lds0/d;",
        "event",
        "Ll83/a0;",
        "o",
        "(Lis0/r0;)V",
        "x",
        "Lhs0/c;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "reactionsViewEventFlow",
        "Lec3/l;",
        "Lds0/f;",
        "E",
        "Lec3/l;",
        "domainState",
        "Lec3/f2;",
        "F",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "community-reactions-arch-mini_release"
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

.field private final x:Lhs0/c;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lds0/h;Lhs0/c;Lor2/m;)V
    .locals 17

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
    invoke-direct {v0, v3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object v2, v0, Lgs0/a;->x:Lhs0/c;

    .line 3
    iput-object v3, v0, Lgs0/a;->y:Lor2/m;

    const/4 v2, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    .line 4
    invoke-static {v5, v5, v2, v4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v2

    iput-object v2, v0, Lgs0/a;->z:Lec3/o1;

    .line 5
    new-instance v4, Lgs0/a$b;

    invoke-direct {v4, v2, v0}, Lgs0/a$b;-><init>(Lec3/l;Lgs0/a;)V

    .line 6
    invoke-static {v4, v1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object v1

    iput-object v1, v0, Lgs0/a;->E:Lec3/l;

    .line 7
    new-instance v2, Lgs0/a$c;

    invoke-direct {v2, v1, v0}, Lgs0/a$c;-><init>(Lec3/l;Lgs0/a;)V

    .line 8
    new-instance v4, Lis0/s0;

    const/16 v15, 0x3fe

    const/16 v16, 0x0

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

    invoke-direct/range {v4 .. v16}, Lis0/s0;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lkotlin/time/Duration;Lcom/whoop/design/models/modal/AnyModal;Lis0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v2, v3, v1, v4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lgs0/a;->F:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lds0/h;Lhs0/c;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lgs0/a;-><init>(Lds0/h;Lhs0/c;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lgs0/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lgs0/a;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lgs0/a;)Lhs0/c;
    .locals 0

    iget-object p0, p0, Lgs0/a;->x:Lhs0/c;

    return-object p0
.end method

.method public static final synthetic n(Lgs0/a;Lis0/r0;)Lds0/d;
    .locals 0

    invoke-direct {p0, p1}, Lgs0/a;->p(Lis0/r0;)Lds0/d;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lis0/r0;)Lds0/d;
    .locals 3

    instance-of v0, p1, Lis0/r0$a;

    if-eqz v0, :cond_0

    new-instance v0, Lds0/d$a;

    check-cast p1, Lis0/r0$a;

    invoke-virtual {p1}, Lis0/r0$a;->a()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lds0/d$a;-><init>(J)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lis0/r0$h;

    if-eqz v0, :cond_1

    new-instance v0, Lds0/d$k;

    check-cast p1, Lis0/r0$h;

    invoke-virtual {p1}, Lis0/r0$h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lis0/r0$h;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lds0/d$k;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lis0/r0$i;

    if-eqz v0, :cond_2

    new-instance v0, Lds0/d$l;

    check-cast p1, Lis0/r0$i;

    invoke-virtual {p1}, Lis0/r0$i;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lds0/d$l;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lis0/r0$g;

    if-eqz v0, :cond_3

    sget-object p1, Lds0/d$j;->a:Lds0/d$j;

    return-object p1

    :cond_3
    instance-of v0, p1, Lis0/r0$b;

    if-eqz v0, :cond_4

    new-instance v0, Lds0/d$b;

    check-cast p1, Lis0/r0$b;

    invoke-virtual {p1}, Lis0/r0$b;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-direct {v0, p1}, Lds0/d$b;-><init>(Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0

    :cond_4
    instance-of v0, p1, Lis0/r0$f;

    if-eqz v0, :cond_5

    new-instance v0, Lds0/d$i;

    check-cast p1, Lis0/r0$f;

    invoke-virtual {p1}, Lis0/r0$f;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, p1}, Lds0/d$i;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Lis0/r0$d;

    if-eqz v0, :cond_6

    sget-object p1, Lds0/d$d;->a:Lds0/d$d;

    return-object p1

    :cond_6
    instance-of v0, p1, Lis0/r0$c;

    if-eqz v0, :cond_7

    sget-object p1, Lds0/d$c;->a:Lds0/d$c;

    return-object p1

    :cond_7
    instance-of v0, p1, Lis0/r0$e;

    if-eqz v0, :cond_8

    new-instance v0, Lds0/d$g;

    check-cast p1, Lis0/r0$e;

    invoke-virtual {p1}, Lis0/r0$e;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v0, p1}, Lds0/d$g;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lis0/r0;

    invoke-virtual {p0, p1}, Lgs0/a;->o(Lis0/r0;)V

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
    iget-object v0, p0, Lgs0/a;->F:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgs0/a;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public o(Lis0/r0;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgs0/a;->y:Lor2/m;

    new-instance v1, Lgs0/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lgs0/a$a;-><init>(Lgs0/a;Lis0/r0;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
