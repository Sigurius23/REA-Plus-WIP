.class public final Ltk2/l;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Ltk2/m;",
        "Ltk2/j$l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000c*\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Ltk2/l;",
        "Lld1/c;",
        "Ltk2/m;",
        "Ltk2/j$l;",
        "Lmk2/r;",
        "interactor",
        "Luk2/c;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lmk2/r;Luk2/c;Lbc3/c0;)V",
        "Lec3/l;",
        "Lmk2/p;",
        "Lmk2/q;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "p",
        "(Ltk2/j$l;)Lmk2/p;",
        "event",
        "Ll83/a0;",
        "o",
        "(Ltk2/j$l;)V",
        "x",
        "Lmk2/r;",
        "y",
        "Luk2/c;",
        "z",
        "Lbc3/c0;",
        "Lec3/o1;",
        "E",
        "Lec3/o1;",
        "eventFlow",
        "F",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "track-activity_release"
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

.field private final F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final x:Lmk2/r;

.field private final y:Luk2/c;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lmk2/r;Luk2/c;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Ltk2/l;->x:Lmk2/r;

    .line 3
    iput-object p2, p0, Ltk2/l;->y:Luk2/c;

    .line 4
    iput-object p3, p0, Ltk2/l;->z:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Ltk2/l;->E:Lec3/o1;

    .line 6
    new-instance p2, Ltk2/l$b;

    invoke-direct {p2, p1, p0}, Ltk2/l$b;-><init>(Lec3/l;Ltk2/l;)V

    .line 7
    invoke-direct {p0, p2}, Ltk2/l;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 8
    new-instance p2, Ltk2/l$c;

    invoke-direct {p2, p1, p0}, Ltk2/l$c;-><init>(Lec3/l;Ltk2/l;)V

    .line 9
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Ltk2/l;->F:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lmk2/r;Luk2/c;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Ltk2/l;-><init>(Lmk2/r;Luk2/c;Lbc3/c0;)V

    return-void
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

    iget-object v0, p0, Ltk2/l;->x:Lmk2/r;

    invoke-virtual {v0, p1}, Lmk2/r;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic j(Ltk2/l;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ltk2/l;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Ltk2/l;)Luk2/c;
    .locals 0

    iget-object p0, p0, Ltk2/l;->y:Luk2/c;

    return-object p0
.end method

.method public static final synthetic n(Ltk2/l;Ltk2/j$l;)Lmk2/p;
    .locals 0

    invoke-direct {p0, p1}, Ltk2/l;->p(Ltk2/j$l;)Lmk2/p;

    move-result-object p0

    return-object p0
.end method

.method private final p(Ltk2/j$l;)Lmk2/p;
    .locals 6

    instance-of v0, p1, Ltk2/j$h;

    if-eqz v0, :cond_0

    new-instance v0, Lmk2/p$k;

    check-cast p1, Ltk2/j$h;

    invoke-virtual {p1}, Ltk2/j$h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ltk2/j$h;->a()Z

    move-result v2

    invoke-virtual {p1}, Ltk2/j$h;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lmk2/p$k;-><init>(Ljava/lang/String;ZLcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    sget-object v0, Ltk2/j$g;->a:Ltk2/j$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lmk2/p$g;->a:Lmk2/p$g;

    return-object p1

    :cond_1
    sget-object v0, Ltk2/j$f;->a:Ltk2/j$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lmk2/p$f;->a:Lmk2/p$f;

    return-object p1

    :cond_2
    sget-object v0, Ltk2/j$b;->a:Ltk2/j$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lmk2/p$b;->a:Lmk2/p$b;

    return-object p1

    :cond_3
    sget-object v0, Ltk2/j$d;->a:Ltk2/j$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lmk2/p$d;->a:Lmk2/p$d;

    return-object p1

    :cond_4
    sget-object v0, Ltk2/j$c;->a:Ltk2/j$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lmk2/p$c;->a:Lmk2/p$c;

    return-object p1

    :cond_5
    sget-object v0, Ltk2/j$e;->a:Ltk2/j$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lmk2/p$e;->a:Lmk2/p$e;

    return-object p1

    :cond_6
    sget-object v0, Ltk2/j$a;->a:Ltk2/j$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Lmk2/p$a;->a:Lmk2/p$a;

    return-object p1

    :cond_7
    instance-of v0, p1, Ltk2/j$k;

    if-eqz v0, :cond_b

    check-cast p1, Ltk2/j$k;

    invoke-virtual {p1}, Ltk2/j$k;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lmk2/v;->HEART_RATE:Lmk2/v;

    invoke-static {}, Lmk2/v;->values()[Lmk2/v;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_9

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_1

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_9
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_a

    goto :goto_2

    :cond_a
    move-object v0, v4

    :goto_2
    new-instance p1, Lmk2/p$l;

    invoke-direct {p1, v0}, Lmk2/p$l;-><init>(Lmk2/v;)V

    return-object p1

    :cond_b
    sget-object v0, Ltk2/j$i;->a:Ltk2/j$i;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object p1, Lmk2/p$i;->a:Lmk2/p$i;

    return-object p1

    :cond_c
    sget-object v0, Ltk2/j$j;->a:Ltk2/j$j;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    sget-object p1, Lmk2/p$j;->a:Lmk2/p$j;

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ltk2/j$l;

    invoke-virtual {p0, p1}, Ltk2/l;->o(Ltk2/j$l;)V

    return-void
.end method

.method public getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Ltk2/l;->F:Lec3/l;

    return-object v0
.end method

.method public o(Ltk2/j$l;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltk2/l;->z:Lbc3/c0;

    new-instance v1, Ltk2/l$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ltk2/l$a;-><init>(Ltk2/l;Ltk2/j$l;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
