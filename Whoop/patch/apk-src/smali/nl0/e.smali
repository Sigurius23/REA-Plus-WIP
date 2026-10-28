.class public final Lnl0/e;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lnl0/f;",
        "Lnl0/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lnl0/e;",
        "Lld1/c;",
        "Lnl0/f;",
        "Lnl0/d;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lxk0/a;",
        "analyticsHelper",
        "Lel0/a;",
        "combiner",
        "Lpl0/d;",
        "reducer",
        "<init>",
        "(Lbc3/c0;Lxk0/a;Lel0/a;Lpl0/d;)V",
        "viewEvent",
        "Ll83/a0;",
        "n",
        "(Lnl0/d;)V",
        "o",
        "x",
        "Lbc3/c0;",
        "y",
        "Lxk0/a;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "viewEventFlow",
        "Lec3/l;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "bot_release"
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

.field private final x:Lbc3/c0;

.field private final y:Lxk0/a;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lxk0/a;Lel0/a;Lpl0/d;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "combiner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lld1/c;-><init>(Lbc3/c0;)V

    iput-object p1, p0, Lnl0/e;->x:Lbc3/c0;

    iput-object p2, p0, Lnl0/e;->y:Lxk0/a;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lnl0/e;->z:Lec3/o1;

    invoke-static {p2, p3}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p2

    new-instance p3, Lnl0/e$b;

    invoke-direct {p3, p2, p4}, Lnl0/e$b;-><init>(Lec3/l;Lpl0/d;)V

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 p4, 0x1

    invoke-static {p3, p1, p2, p4}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lnl0/e;->E:Lec3/l;

    return-void
.end method

.method public static final synthetic j(Lnl0/e;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lnl0/e;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lnl0/e;Lnl0/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lnl0/e;->n(Lnl0/d;)V

    return-void
.end method

.method private final n(Lnl0/d;)V
    .locals 3

    iget-object v0, p0, Lnl0/e;->y:Lxk0/a;

    instance-of v1, p1, Lnl0/d$m;

    if-eqz v1, :cond_0

    check-cast p1, Lnl0/d$m;

    invoke-virtual {p1}, Lnl0/d$m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnl0/d$m;->b()I

    move-result v2

    invoke-virtual {p1}, Lnl0/d$m;->c()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lxk0/a;->B(Ljava/lang/String;II)V

    return-void

    :cond_0
    instance-of v1, p1, Lnl0/d$f;

    if-eqz v1, :cond_1

    check-cast p1, Lnl0/d$f;

    invoke-virtual {p1}, Lnl0/d$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxk0/a;->c(Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v1, p1, Lnl0/d$d;

    if-eqz v1, :cond_2

    check-cast p1, Lnl0/d$d;

    invoke-virtual {p1}, Lnl0/d$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxk0/a;->e(Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v1, p1, Lnl0/d$s;

    if-eqz v1, :cond_3

    check-cast p1, Lnl0/d$s;

    invoke-virtual {p1}, Lnl0/d$s;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxk0/a;->q(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v1, Lnl0/d$i;->a:Lnl0/d$i;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lxk0/a;->z()V

    return-void

    :cond_4
    instance-of v1, p1, Lnl0/d$n;

    if-eqz v1, :cond_5

    check-cast p1, Lnl0/d$n;

    invoke-virtual {p1}, Lnl0/d$n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnl0/d$n;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lxk0/a;->A(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    instance-of v1, p1, Lnl0/d$p;

    if-eqz v1, :cond_6

    check-cast p1, Lnl0/d$p;

    invoke-virtual {p1}, Lnl0/d$p;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnl0/d$p;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnl0/d$p;->b()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lxk0/a;->D(Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    instance-of v1, p1, Lnl0/d$o;

    if-eqz v1, :cond_7

    check-cast p1, Lnl0/d$o;

    invoke-virtual {p1}, Lnl0/d$o;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnl0/d$o;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lxk0/a;->C(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lnl0/d;

    invoke-virtual {p0, p1}, Lnl0/e;->o(Lnl0/d;)V

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

    iget-object v0, p0, Lnl0/e;->E:Lec3/l;

    return-object v0
.end method

.method public o(Lnl0/d;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnl0/e;->x:Lbc3/c0;

    new-instance v1, Lnl0/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lnl0/e$a;-><init>(Lnl0/e;Lnl0/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
