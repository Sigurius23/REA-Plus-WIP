.class public final Ljl2/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001d\u0010(\u001a\u0008\u0012\u0004\u0012\u00020#0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Ljl2/b;",
        "Landroidx/lifecycle/w1;",
        "Lhl2/f;",
        "interactor",
        "Ljl2/c;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lhl2/f;Ljl2/c;Lbc3/c0;)V",
        "Lec3/l;",
        "Lhl2/c;",
        "Lhl2/d;",
        "n",
        "(Lec3/l;Lhl2/f;)Lec3/l;",
        "Lml2/a$b;",
        "viewEvent",
        "o",
        "(Lml2/a$b;)Lhl2/c;",
        "Lbc3/k1;",
        "p",
        "(Lml2/a$b;)Lbc3/k1;",
        "w",
        "Ljl2/c;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "Lml2/a;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "z",
        "Lec3/t1;",
        "domainState",
        "Lnl2/c;",
        "E",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "training_release"
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

.field private final w:Ljl2/c;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhl2/f;Ljl2/c;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Ljl2/b;->w:Ljl2/c;

    .line 3
    iput-object p3, p0, Ljl2/b;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Ljl2/b;->y:Lec3/o1;

    .line 5
    new-instance v0, Ljl2/b$b;

    invoke-direct {v0, p2}, Ljl2/b$b;-><init>(Lec3/l;)V

    .line 6
    new-instance p2, Ljl2/b$c;

    invoke-direct {p2, v0, p0}, Ljl2/b$c;-><init>(Lec3/l;Ljl2/b;)V

    .line 7
    invoke-direct {p0, p2, p1}, Ljl2/b;->n(Lec3/l;Lhl2/f;)Lec3/l;

    move-result-object p1

    .line 8
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Ljl2/b;->z:Lec3/t1;

    .line 9
    new-instance p2, Ljl2/b$d;

    invoke-direct {p2, p1, p0}, Ljl2/b$d;-><init>(Lec3/l;Ljl2/b;)V

    .line 10
    iput-object p2, p0, Ljl2/b;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lhl2/f;Ljl2/c;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Ljl2/b;-><init>(Lhl2/f;Ljl2/c;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Ljl2/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ljl2/b;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Ljl2/b;)Ljl2/c;
    .locals 0

    iget-object p0, p0, Ljl2/b;->w:Ljl2/c;

    return-object p0
.end method

.method public static final synthetic l(Ljl2/b;Lml2/a$b;)Lhl2/c;
    .locals 0

    invoke-direct {p0, p1}, Ljl2/b;->o(Lml2/a$b;)Lhl2/c;

    move-result-object p0

    return-object p0
.end method

.method private final n(Lec3/l;Lhl2/f;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lhl2/f;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lhl2/f;->r(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final o(Lml2/a$b;)Lhl2/c;
    .locals 4

    sget-object v0, Lml2/a$b$f;->a:Lml2/a$b$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lhl2/c$f;->a:Lhl2/c$f;

    return-object p1

    :cond_0
    sget-object v0, Lml2/a$b$p;->a:Lml2/a$b$p;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lhl2/c$p;->a:Lhl2/c$p;

    return-object p1

    :cond_1
    sget-object v0, Lml2/a$b$n;->a:Lml2/a$b$n;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lhl2/c$n;->a:Lhl2/c$n;

    return-object p1

    :cond_2
    sget-object v0, Lml2/a$b$o;->a:Lml2/a$b$o;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lhl2/c$o;->a:Lhl2/c$o;

    return-object p1

    :cond_3
    sget-object v0, Lml2/a$b$k;->a:Lml2/a$b$k;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lhl2/c$k;->a:Lhl2/c$k;

    return-object p1

    :cond_4
    sget-object v0, Lml2/a$b$b;->a:Lml2/a$b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lhl2/c$c;->a:Lhl2/c$c;

    return-object p1

    :cond_5
    sget-object v0, Lml2/a$b$j;->a:Lml2/a$b$j;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lhl2/c$j;->a:Lhl2/c$j;

    return-object p1

    :cond_6
    sget-object v0, Lml2/a$b$c;->a:Lml2/a$b$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Lhl2/c$a;->a:Lhl2/c$a;

    return-object p1

    :cond_7
    instance-of v0, p1, Lml2/a$b$i;

    if-eqz v0, :cond_8

    new-instance v0, Lhl2/c$i;

    check-cast p1, Lml2/a$b$i;

    invoke-virtual {p1}, Lml2/a$b$i;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lhl2/c$i;-><init>(I)V

    return-object v0

    :cond_8
    instance-of v0, p1, Lml2/a$b$l;

    if-eqz v0, :cond_9

    new-instance v0, Lhl2/c$l;

    check-cast p1, Lml2/a$b$l;

    invoke-virtual {p1}, Lml2/a$b$l;->c()I

    move-result v1

    invoke-virtual {p1}, Lml2/a$b$l;->b()I

    move-result v2

    invoke-virtual {p1}, Lml2/a$b$l;->a()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lhl2/c$l;-><init>(III)V

    return-object v0

    :cond_9
    sget-object v0, Lml2/a$b$a;->a:Lml2/a$b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p1, Lhl2/c$b;->a:Lhl2/c$b;

    return-object p1

    :cond_a
    instance-of v0, p1, Lml2/a$b$e;

    if-eqz v0, :cond_b

    new-instance v0, Lhl2/c$e;

    check-cast p1, Lml2/a$b$e;

    invoke-virtual {p1}, Lml2/a$b$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lml2/a$b$e;->c()I

    move-result v2

    invoke-virtual {p1}, Lml2/a$b$e;->b()Lsz0/v1;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lhl2/c$e;-><init>(Ljava/lang/String;ILsz0/v1;)V

    return-object v0

    :cond_b
    instance-of v0, p1, Lml2/a$b$q;

    if-eqz v0, :cond_c

    new-instance v0, Lhl2/c$q;

    check-cast p1, Lml2/a$b$q;

    invoke-virtual {p1}, Lml2/a$b$q;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lhl2/c$q;-><init>(I)V

    return-object v0

    :cond_c
    instance-of v0, p1, Lml2/a$b$g;

    if-eqz v0, :cond_d

    new-instance v0, Lhl2/c$g;

    check-cast p1, Lml2/a$b$g;

    invoke-virtual {p1}, Lml2/a$b$g;->a()I

    move-result v1

    invoke-virtual {p1}, Lml2/a$b$g;->c()Lsz0/v1;

    move-result-object v2

    invoke-virtual {p1}, Lml2/a$b$g;->b()Ljl2/a;

    move-result-object v3

    invoke-virtual {v3}, Ljl2/a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lml2/a$b$g;->d()Z

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lhl2/c$g;-><init>(ILsz0/v1;Ljava/lang/String;Z)V

    return-object v0

    :cond_d
    sget-object v0, Lml2/a$b$h;->a:Lml2/a$b$h;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object p1, Lhl2/c$h;->a:Lhl2/c$h;

    return-object p1

    :cond_e
    sget-object v0, Lml2/a$b$m;->a:Lml2/a$b$m;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object p1, Lhl2/c$m;->a:Lhl2/c$m;

    return-object p1

    :cond_f
    instance-of v0, p1, Lml2/a$b$d;

    if-eqz v0, :cond_10

    new-instance v0, Lhl2/c$d;

    check-cast p1, Lml2/a$b$d;

    invoke-virtual {p1}, Lml2/a$b$d;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lhl2/c$d;-><init>(I)V

    return-object v0

    :cond_10
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

    iget-object v0, p0, Ljl2/b;->E:Lec3/l;

    return-object v0
.end method

.method public final p(Lml2/a$b;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljl2/b;->x:Lbc3/c0;

    new-instance v1, Ljl2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ljl2/b$a;-><init>(Ljl2/b;Lml2/a$b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
