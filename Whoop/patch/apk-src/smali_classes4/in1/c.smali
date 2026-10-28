.class public final Lin1/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010!\u001a\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lin1/c;",
        "Landroidx/lifecycle/w1;",
        "Ldn1/b;",
        "interactor",
        "Lin1/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ldn1/b;Lin1/a;Lbc3/c0;)V",
        "Lin1/b;",
        "event",
        "Ldn1/a;",
        "o",
        "(Lin1/b;)Ldn1/a;",
        "Lin1/d$c;",
        "viewState",
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;",
        "l",
        "(Lin1/d$c;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;",
        "viewEvent",
        "Ll83/a0;",
        "n",
        "(Lin1/b;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Ldn1/c;",
        "y",
        "Lec3/l;",
        "domainState",
        "Lin1/d;",
        "z",
        "getViewState",
        "()Lec3/l;",
        "home-customization_release"
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

.field private final y:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
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
.method public constructor <init>(Ldn1/b;Lin1/a;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lin1/c;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lin1/c;->x:Lec3/o1;

    .line 4
    new-instance v1, Lin1/c$b;

    invoke-direct {v1, v0, p0}, Lin1/c$b;-><init>(Lec3/l;Lin1/c;)V

    .line 5
    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lin1/c;->y:Lec3/l;

    .line 6
    new-instance v0, Lin1/c$c;

    invoke-direct {v0, p1, p2}, Lin1/c$c;-><init>(Lec3/l;Lin1/a;)V

    .line 7
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 p2, 0x1

    invoke-static {v0, p3, p1, p2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lin1/c;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Ldn1/b;Lin1/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 8
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lin1/c;-><init>(Ldn1/b;Lin1/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lin1/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lin1/c;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lin1/c;Lin1/b;)Ldn1/a;
    .locals 0

    invoke-direct {p0, p1}, Lin1/c;->o(Lin1/b;)Ldn1/a;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lin1/d$c;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lin1/d$c;->b()Lin1/f;

    move-result-object v1

    invoke-virtual {v1}, Lin1/f;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le41/i;

    invoke-virtual {v2}, Le41/i;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lin1/d$c;->c()Lin1/h;

    invoke-virtual {p1}, Lin1/d$c;->c()Lin1/h;

    new-instance p1, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;

    invoke-direct {p1, v0, v1}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private final o(Lin1/b;)Ldn1/a;
    .locals 2

    instance-of v0, p1, Lin1/b$c;

    if-eqz v0, :cond_0

    sget-object p1, Ldn1/a$c;->a:Ldn1/a$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lin1/b$i;

    if-eqz v0, :cond_1

    sget-object p1, Ldn1/a$j;->a:Ldn1/a$j;

    return-object p1

    :cond_1
    instance-of v0, p1, Lin1/b$e;

    if-eqz v0, :cond_2

    new-instance v0, Ldn1/a$e;

    check-cast p1, Lin1/b$e;

    invoke-virtual {p1}, Lin1/b$e;->a()I

    move-result v1

    invoke-virtual {p1}, Lin1/b$e;->b()I

    move-result p1

    invoke-direct {v0, v1, p1}, Ldn1/a$e;-><init>(II)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lin1/b$a;

    if-eqz v0, :cond_3

    new-instance v0, Ldn1/a$a;

    check-cast p1, Lin1/b$a;

    invoke-virtual {p1}, Lin1/b$a;->a()I

    move-result p1

    invoke-direct {v0, p1}, Ldn1/a$a;-><init>(I)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lin1/b$d;

    if-eqz v0, :cond_4

    new-instance v0, Ldn1/a$d;

    check-cast p1, Lin1/b$d;

    invoke-virtual {p1}, Lin1/b$d;->a()I

    move-result p1

    invoke-direct {v0, p1}, Ldn1/a$d;-><init>(I)V

    return-object v0

    :cond_4
    instance-of v0, p1, Lin1/b$h;

    if-eqz v0, :cond_5

    new-instance v0, Ldn1/a$h;

    check-cast p1, Lin1/b$h;

    invoke-virtual {p1}, Lin1/b$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ldn1/a$h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Lin1/b$g;

    if-eqz v0, :cond_6

    sget-object p1, Ldn1/a$g;->a:Ldn1/a$g;

    return-object p1

    :cond_6
    instance-of v0, p1, Lin1/b$f;

    if-eqz v0, :cond_7

    new-instance v0, Ldn1/a$f;

    check-cast p1, Lin1/b$f;

    invoke-virtual {p1}, Lin1/b$f;->a()Lin1/d$c;

    move-result-object p1

    invoke-direct {p0, p1}, Lin1/c;->l(Lin1/d$c;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;

    move-result-object p1

    invoke-direct {v0, p1}, Ldn1/a$f;-><init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;)V

    return-object v0

    :cond_7
    instance-of p1, p1, Lin1/b$b;

    if-eqz p1, :cond_8

    sget-object p1, Ldn1/a$b;->a:Ldn1/a$b;

    return-object p1

    :cond_8
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

    iget-object v0, p0, Lin1/c;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Lin1/b;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lin1/c;->w:Lbc3/c0;

    new-instance v1, Lin1/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lin1/c$a;-><init>(Lin1/b;Lin1/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
