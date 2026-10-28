.class public final Lu52/b;
.super Lh31/p;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lu52/b;",
        "Lh31/p;",
        "Lcom/whoop/recommendationtile/domain/h;",
        "interactor",
        "Lv52/b;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/recommendationtile/domain/h;Lv52/b;Lor2/m;)V",
        "Lh31/o;",
        "Lcom/whoop/recommendationtile/domain/b;",
        "q",
        "(Lh31/o;)Lcom/whoop/recommendationtile/domain/b;",
        "event",
        "Ll83/a0;",
        "p",
        "(Lh31/o;)V",
        "x",
        "Lv52/b;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lh31/m;",
        "E",
        "Lec3/t1;",
        "o",
        "()Lec3/t1;",
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
.field private final E:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final x:Lv52/b;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/recommendationtile/domain/h;Lv52/b;Lor2/m;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lh31/p;-><init>(Lor2/m;)V

    .line 2
    iput-object p2, p0, Lu52/b;->x:Lv52/b;

    .line 3
    iput-object p3, p0, Lu52/b;->y:Lor2/m;

    const/4 p2, 0x0

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 4
    invoke-static {v1, v2, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lu52/b;->z:Lec3/o1;

    .line 5
    new-instance v0, Lu52/b$b;

    invoke-direct {v0, p2, p0}, Lu52/b$b;-><init>(Lec3/l;Lu52/b;)V

    .line 6
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Lu52/b$c;

    invoke-direct {p2, p1, p0}, Lu52/b$c;-><init>(Lec3/l;Lu52/b;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {p2, p3, p1, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lu52/b;->E:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/recommendationtile/domain/h;Lv52/b;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lu52/b;-><init>(Lcom/whoop/recommendationtile/domain/h;Lv52/b;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lu52/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lu52/b;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lu52/b;)Lv52/b;
    .locals 0

    iget-object p0, p0, Lu52/b;->x:Lv52/b;

    return-object p0
.end method

.method public static final synthetic n(Lu52/b;Lh31/o;)Lcom/whoop/recommendationtile/domain/b;
    .locals 0

    invoke-direct {p0, p1}, Lu52/b;->q(Lh31/o;)Lcom/whoop/recommendationtile/domain/b;

    move-result-object p0

    return-object p0
.end method

.method private final q(Lh31/o;)Lcom/whoop/recommendationtile/domain/b;
    .locals 1

    instance-of v0, p1, Lh31/o$e;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/recommendationtile/domain/b$e;

    check-cast p1, Lh31/o$e;

    invoke-virtual {p1}, Lh31/o$e;->a()Lh31/q;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/recommendationtile/domain/b$e;-><init>(Lh31/q;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lh31/o$b;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/recommendationtile/domain/b$b;

    check-cast p1, Lh31/o$b;

    invoke-virtual {p1}, Lh31/o$b;->a()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/recommendationtile/domain/b$b;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lh31/o$d;

    if-eqz v0, :cond_2

    sget-object p1, Lcom/whoop/recommendationtile/domain/b$d;->a:Lcom/whoop/recommendationtile/domain/b$d;

    return-object p1

    :cond_2
    instance-of v0, p1, Lh31/o$c;

    if-eqz v0, :cond_3

    sget-object p1, Lcom/whoop/recommendationtile/domain/b$c;->a:Lcom/whoop/recommendationtile/domain/b$c;

    return-object p1

    :cond_3
    instance-of p1, p1, Lh31/o$a;

    if-eqz p1, :cond_4

    sget-object p1, Lcom/whoop/recommendationtile/domain/b$a;->a:Lcom/whoop/recommendationtile/domain/b$a;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh31/o;

    invoke-virtual {p0, p1}, Lu52/b;->p(Lh31/o;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, Lu52/b;->o()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public o()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lu52/b;->E:Lec3/t1;

    return-object v0
.end method

.method public p(Lh31/o;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu52/b;->y:Lor2/m;

    new-instance v1, Lu52/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lu52/b$a;-><init>(Lu52/b;Lh31/o;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
