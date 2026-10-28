.class public final Lxu2/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lxu2/c;",
        "Landroidx/lifecycle/w1;",
        "Lwu2/c;",
        "interactor",
        "Lxu2/e;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lwu2/c;Lxu2/e;Lbc3/c0;)V",
        "Lhu2/b$p;",
        "Lfu2/b;",
        "o",
        "(Lhu2/b$p;)Lfu2/b;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lhu2/b$p;)V",
        "Lec3/o1;",
        "w",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lxu2/d;",
        "x",
        "Lec3/t1;",
        "l",
        "()Lec3/t1;",
        "viewState",
        "weightlifting_release"
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
.field private final w:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final x:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwu2/c;Lxu2/e;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    const/4 p3, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 2
    invoke-static {v1, v1, p3, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lxu2/c;->w:Lec3/o1;

    .line 3
    new-instance v0, Lxu2/c$b;

    invoke-direct {v0, p3, p0}, Lxu2/c$b;-><init>(Lec3/l;Lxu2/c;)V

    .line 4
    sget-object p3, Lwu2/b;->k:Lwu2/b$a;

    invoke-virtual {p3}, Lwu2/b$a;->a()Lwu2/b;

    move-result-object p3

    new-instance v1, Lxu2/c$d;

    invoke-direct {v1, p1}, Lxu2/c$d;-><init>(Ljava/lang/Object;)V

    .line 5
    new-instance p1, Lec3/l1;

    invoke-direct {p1, p3, v0, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    .line 6
    new-instance p3, Lxu2/c$c;

    invoke-direct {p3, p1, p2}, Lxu2/c$c;-><init>(Lec3/l;Lxu2/e;)V

    .line 7
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p3, p1, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lxu2/c;->x:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lwu2/c;Lxu2/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lxu2/c;-><init>(Lwu2/c;Lxu2/e;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lxu2/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lxu2/c;->w:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lxu2/c;Lhu2/b$p;)Lfu2/b;
    .locals 0

    invoke-direct {p0, p1}, Lxu2/c;->o(Lhu2/b$p;)Lfu2/b;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lhu2/b$p;)Lfu2/b;
    .locals 9

    instance-of v0, p1, Lhu2/b$k;

    if-eqz v0, :cond_0

    new-instance v1, Lfu2/b$i;

    check-cast p1, Lhu2/b$k;

    invoke-virtual {p1}, Lhu2/b$k;->e()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Lhu2/b$k;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lhu2/b$k;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lhu2/b$k;->g()Z

    move-result v5

    invoke-virtual {p1}, Lhu2/b$k;->f()Z

    move-result v6

    invoke-virtual {p1}, Lhu2/b$k;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lhu2/b$k;->c()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lfu2/b$i;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lhu2/b$i;

    if-eqz v0, :cond_1

    sget-object p1, Lfu2/b$h;->a:Lfu2/b$h;

    return-object p1

    :cond_1
    instance-of v0, p1, Lhu2/b$a;

    if-eqz v0, :cond_2

    new-instance v0, Lfu2/b$e;

    check-cast p1, Lhu2/b$a;

    invoke-virtual {p1}, Lhu2/b$a;->b()I

    move-result v1

    invoke-virtual {p1}, Lhu2/b$a;->a()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lfu2/b$e;-><init>(II)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lhu2/b$j;

    if-eqz v0, :cond_3

    sget-object p1, Lfu2/b$f;->a:Lfu2/b$f;

    return-object p1

    :cond_3
    instance-of v0, p1, Lhu2/b$e;

    if-eqz v0, :cond_4

    sget-object p1, Lfu2/b$m;->a:Lfu2/b$m;

    return-object p1

    :cond_4
    instance-of v0, p1, Lhu2/b$m;

    if-eqz v0, :cond_5

    sget-object p1, Lfu2/b$s;->a:Lfu2/b$s;

    return-object p1

    :cond_5
    instance-of v0, p1, Lhu2/b$l;

    if-eqz v0, :cond_6

    sget-object p1, Lfu2/b$g;->a:Lfu2/b$g;

    return-object p1

    :cond_6
    instance-of v0, p1, Lhu2/b$n;

    if-eqz v0, :cond_7

    new-instance v0, Lfu2/b$l;

    check-cast p1, Lhu2/b$n;

    invoke-virtual {p1}, Lhu2/b$n;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lfu2/b$l;-><init>(Z)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lhu2/b$b;

    if-eqz v0, :cond_8

    sget-object p1, Lfu2/b$b;->a:Lfu2/b$b;

    return-object p1

    :cond_8
    instance-of v0, p1, Lhu2/m;

    if-eqz v0, :cond_9

    check-cast p1, Lhu2/m;

    invoke-static {p1}, Lhu2/o;->a(Lhu2/m;)Lfu2/b$n;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final l()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lxu2/c;->x:Lec3/t1;

    return-object v0
.end method

.method public final n(Lhu2/b$p;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lxu2/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lxu2/c$a;-><init>(Lxu2/c;Lhu2/b$p;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
