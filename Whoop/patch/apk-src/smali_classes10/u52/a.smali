.class public final Lu52/a;
.super Li31/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lu52/a;",
        "Li31/f;",
        "Li31/g;",
        "seed",
        "Lcom/whoop/recommendationtile/domain/f;",
        "interactor",
        "Lv52/a;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Li31/g;Lcom/whoop/recommendationtile/domain/f;Lv52/a;Lor2/m;)V",
        "Li31/e;",
        "Lcom/whoop/recommendationtile/domain/d;",
        "p",
        "(Li31/e;)Lcom/whoop/recommendationtile/domain/d;",
        "event",
        "Ll83/a0;",
        "o",
        "(Li31/e;)V",
        "x",
        "Lv52/a;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "recommendationTileHeaderViewEventFlow",
        "Lec3/f2;",
        "Li31/d;",
        "E",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "recommendation-tile-arch-mini_release"
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

.field private final x:Lv52/a;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li31/g;Lcom/whoop/recommendationtile/domain/f;Lv52/a;Lor2/m;)V
    .locals 3

    const-string v0, "seed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Li31/f;-><init>(Lor2/m;)V

    .line 2
    iput-object p3, p0, Lu52/a;->x:Lv52/a;

    .line 3
    iput-object p4, p0, Lu52/a;->y:Lor2/m;

    const/4 p3, 0x5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 4
    invoke-static {v0, v1, v2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lu52/a;->z:Lec3/o1;

    .line 5
    new-instance v1, Lu52/a$b;

    invoke-direct {v1, p3, p0}, Lu52/a$b;-><init>(Lec3/l;Lu52/a;)V

    .line 6
    invoke-static {v1, p2}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p2

    .line 7
    new-instance p3, Lu52/a$c;

    invoke-direct {p3, p2, p0}, Lu52/a$c;-><init>(Lec3/l;Lu52/a;)V

    .line 8
    new-instance p2, Li31/d;

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v2}, Li31/d;-><init>(Li31/g;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {p3, p4, p1, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lu52/a;->E:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Li31/g;Lcom/whoop/recommendationtile/domain/f;Lv52/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 9
    new-instance p4, Lor2/m;

    const/4 p5, 0x1

    const/4 p6, 0x0

    invoke-direct {p4, p6, p5, p6}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lu52/a;-><init>(Li31/g;Lcom/whoop/recommendationtile/domain/f;Lv52/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lu52/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lu52/a;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lu52/a;)Lv52/a;
    .locals 0

    iget-object p0, p0, Lu52/a;->x:Lv52/a;

    return-object p0
.end method

.method public static final synthetic n(Lu52/a;Li31/e;)Lcom/whoop/recommendationtile/domain/d;
    .locals 0

    invoke-direct {p0, p1}, Lu52/a;->p(Li31/e;)Lcom/whoop/recommendationtile/domain/d;

    move-result-object p0

    return-object p0
.end method

.method private final p(Li31/e;)Lcom/whoop/recommendationtile/domain/d;
    .locals 1

    instance-of v0, p1, Li31/e$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/recommendationtile/domain/d$a;

    check-cast p1, Li31/e$a;

    invoke-virtual {p1}, Li31/e$a;->a()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/recommendationtile/domain/d$a;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    return-object v0

    :cond_0
    instance-of p1, p1, Li31/e$b;

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/recommendationtile/domain/d$b;->a:Lcom/whoop/recommendationtile/domain/d$b;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li31/e;

    invoke-virtual {p0, p1}, Lu52/a;->o(Li31/e;)V

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
    iget-object v0, p0, Lu52/a;->E:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu52/a;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public o(Li31/e;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu52/a;->y:Lor2/m;

    new-instance v1, Lu52/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lu52/a$a;-><init>(Lu52/a;Li31/e;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
