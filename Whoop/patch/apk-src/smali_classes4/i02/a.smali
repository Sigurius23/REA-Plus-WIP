.class public final Li02/a;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001d0!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Li02/a;",
        "Landroidx/lifecycle/w1;",
        "Lxz1/f;",
        "interactor",
        "Lb02/f;",
        "reducer",
        "Lao2/a;",
        "cartIndicatorRepository",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lxz1/f;Lb02/f;Lao2/a;Lbc3/c0;)V",
        "Lb02/c$m;",
        "Lxz1/c;",
        "o",
        "(Lb02/c$m;)Lxz1/c;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lb02/c$m;)V",
        "w",
        "Lb02/f;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "pdpViewEventFlow",
        "Lec3/l;",
        "Lb02/e;",
        "z",
        "Lec3/l;",
        "reducedViewStateFlow",
        "Lec3/f2;",
        "E",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
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
.field private final E:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final w:Lb02/f;

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
.method public constructor <init>(Lxz1/f;Lb02/f;Lao2/a;Lbc3/c0;)V
    .locals 9

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartIndicatorRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Li02/a;->w:Lb02/f;

    .line 3
    iput-object p4, p0, Li02/a;->x:Lbc3/c0;

    const/4 p2, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v0, v1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Li02/a;->y:Lec3/o1;

    .line 5
    new-instance v0, Li02/a$b;

    invoke-direct {v0, p2, p0}, Li02/a$b;-><init>(Lec3/l;Li02/a;)V

    .line 6
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Li02/a$c;

    invoke-direct {p2, p1, p0}, Li02/a$c;-><init>(Lec3/l;Li02/a;)V

    .line 8
    iput-object p2, p0, Li02/a;->z:Lec3/l;

    .line 9
    invoke-virtual {p3}, Lao2/a;->h()Lec3/f2;

    move-result-object p1

    .line 10
    new-instance p3, Li02/a$d;

    invoke-direct {p3, v1}, Li02/a$d;-><init>(Lq83/d;)V

    .line 11
    new-instance v0, Lec3/l1;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p1, p3, v1}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 12
    new-instance v2, Lb02/e;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lb02/e;-><init>(ZZLb02/a;Lao2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v0, p4, p1, v2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Li02/a;->E:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lxz1/f;Lb02/f;Lao2/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 13
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Li02/a;-><init>(Lxz1/f;Lb02/f;Lao2/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Li02/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Li02/a;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Li02/a;)Lb02/f;
    .locals 0

    iget-object p0, p0, Li02/a;->w:Lb02/f;

    return-object p0
.end method

.method public static final synthetic l(Li02/a;Lb02/c$m;)Lxz1/c;
    .locals 0

    invoke-direct {p0, p1}, Li02/a;->o(Lb02/c$m;)Lxz1/c;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lb02/c$m;)Lxz1/c;
    .locals 7

    instance-of v0, p1, Lb02/c$g;

    if-eqz v0, :cond_0

    new-instance v0, Lxz1/c$a;

    check-cast p1, Lb02/c$g;

    invoke-virtual {p1}, Lb02/c$g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lb02/c$g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lb02/c$g;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lxz1/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lb02/c$k;

    if-eqz v0, :cond_1

    new-instance v1, Lxz1/c$b;

    check-cast p1, Lb02/c$k;

    invoke-virtual {p1}, Lb02/c$k;->a()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v2

    invoke-virtual {p1}, Lb02/c$k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lb02/c$k;->e()I

    move-result v4

    invoke-virtual {p1}, Lb02/c$k;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lb02/c$k;->d()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lxz1/c$b;-><init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lb02/c$l;

    if-eqz v0, :cond_2

    new-instance v0, Lxz1/c$c;

    check-cast p1, Lb02/c$l;

    invoke-virtual {p1}, Lb02/c$l;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lxz1/c$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lb02/c$j;

    if-eqz v0, :cond_3

    new-instance v0, Lxz1/c$a;

    check-cast p1, Lb02/c$j;

    invoke-virtual {p1}, Lb02/c$j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lb02/c$j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lb02/c$j;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lxz1/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Li02/a;->E:Lec3/f2;

    return-object v0
.end method

.method public final n(Lb02/c$m;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li02/a;->x:Lbc3/c0;

    new-instance v1, Li02/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Li02/a$a;-><init>(Li02/a;Lb02/c$m;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
