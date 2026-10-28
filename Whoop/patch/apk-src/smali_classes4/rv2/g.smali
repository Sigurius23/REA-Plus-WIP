.class public final Lrv2/g;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lrv2/g;",
        "Landroidx/lifecycle/w1;",
        "Lrv2/e;",
        "reducer",
        "Lqv2/e;",
        "interactor",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lrv2/e;Lqv2/e;Lbc3/c0;)V",
        "Lrv2/d$c0;",
        "viewEvent",
        "Lqv2/c;",
        "n",
        "(Lrv2/d$c0;)Lqv2/c;",
        "Lbc3/k1;",
        "o",
        "(Lrv2/d$c0;)Lbc3/k1;",
        "w",
        "Lrv2/e;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "Lqv2/d;",
        "y",
        "Lec3/t1;",
        "domainState",
        "Lec3/l;",
        "Lrv2/h;",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
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
.field private final w:Lrv2/e;

.field private final x:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final y:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
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
.method public constructor <init>(Lrv2/e;Lqv2/e;Lbc3/c0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "reducer"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "interactor"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "scope"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0, v3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object v1, v0, Lrv2/g;->w:Lrv2/e;

    const/4 v1, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    .line 3
    invoke-static {v5, v5, v1, v4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, v0, Lrv2/g;->x:Lec3/o1;

    .line 4
    new-instance v4, Lrv2/g$c;

    invoke-direct {v4, v1, v0}, Lrv2/g$c;-><init>(Lec3/l;Lrv2/g;)V

    .line 5
    new-instance v5, Lqv2/d;

    sget-object v6, Lqv2/b$e;->a:Lqv2/b$e;

    const/16 v15, 0x1fe

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lqv2/d;-><init>(Lqv2/b;Ljava/lang/Long;Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Ljava/util/List;Lqv2/f;Lqv2/a;ZLrv2/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lrv2/g$a;

    invoke-direct {v1, v2}, Lrv2/g$a;-><init>(Ljava/lang/Object;)V

    .line 6
    new-instance v2, Lec3/l1;

    invoke-direct {v2, v5, v4, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    .line 7
    sget-object v1, Lec3/z1;->a:Lec3/b2;

    const/4 v4, 0x1

    invoke-static {v2, v3, v1, v4}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v1

    iput-object v1, v0, Lrv2/g;->y:Lec3/t1;

    .line 8
    new-instance v2, Lrv2/g$d;

    invoke-direct {v2, v1, v0}, Lrv2/g$d;-><init>(Lec3/l;Lrv2/g;)V

    .line 9
    iput-object v2, v0, Lrv2/g;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lrv2/e;Lqv2/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lrv2/g;-><init>(Lrv2/e;Lqv2/e;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lrv2/g;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lrv2/g;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lrv2/g;)Lrv2/e;
    .locals 0

    iget-object p0, p0, Lrv2/g;->w:Lrv2/e;

    return-object p0
.end method

.method public static final synthetic l(Lrv2/g;Lrv2/d$c0;)Lqv2/c;
    .locals 0

    invoke-direct {p0, p1}, Lrv2/g;->n(Lrv2/d$c0;)Lqv2/c;

    move-result-object p0

    return-object p0
.end method

.method private final n(Lrv2/d$c0;)Lqv2/c;
    .locals 3

    instance-of v0, p1, Lrv2/d$u;

    if-eqz v0, :cond_0

    sget-object p1, Lqv2/c$i;->a:Lqv2/c$i;

    return-object p1

    :cond_0
    instance-of v0, p1, Lrv2/d$q;

    if-eqz v0, :cond_1

    sget-object p1, Lqv2/c$g;->a:Lqv2/c$g;

    return-object p1

    :cond_1
    instance-of v0, p1, Lrv2/d$p;

    if-eqz v0, :cond_2

    new-instance v0, Lqv2/c$f;

    check-cast p1, Lrv2/d$p;

    invoke-virtual {p1}, Lrv2/d$p;->a()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lqv2/c$f;-><init>(J)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lrv2/d$b;

    if-eqz v0, :cond_3

    sget-object p1, Lqv2/c$a;->a:Lqv2/c$a;

    return-object p1

    :cond_3
    instance-of v0, p1, Lrv2/d$b0;

    if-eqz v0, :cond_4

    sget-object p1, Lqv2/c$o;->a:Lqv2/c$o;

    return-object p1

    :cond_4
    instance-of v0, p1, Lrv2/d$y;

    if-eqz v0, :cond_5

    sget-object p1, Lqv2/c$l;->a:Lqv2/c$l;

    return-object p1

    :cond_5
    instance-of v0, p1, Lrv2/d$f;

    if-eqz v0, :cond_6

    sget-object p1, Lqv2/c$d;->a:Lqv2/c$d;

    return-object p1

    :cond_6
    instance-of v0, p1, Lrv2/d$z;

    if-eqz v0, :cond_7

    sget-object p1, Lqv2/c$m;->a:Lqv2/c$m;

    return-object p1

    :cond_7
    instance-of v0, p1, Lrv2/d$a0;

    if-eqz v0, :cond_8

    sget-object p1, Lqv2/c$n;->a:Lqv2/c$n;

    return-object p1

    :cond_8
    instance-of v0, p1, Lrv2/d$e;

    if-eqz v0, :cond_9

    sget-object p1, Lqv2/c$c;->a:Lqv2/c$c;

    return-object p1

    :cond_9
    instance-of v0, p1, Lrv2/d$g;

    if-eqz v0, :cond_a

    sget-object p1, Lqv2/c$e;->a:Lqv2/c$e;

    return-object p1

    :cond_a
    instance-of v0, p1, Lrv2/d$x;

    if-eqz v0, :cond_b

    new-instance v0, Lqv2/c$k;

    check-cast p1, Lrv2/d$x;

    invoke-virtual {p1}, Lrv2/d$x;->a()Lrv2/f;

    move-result-object p1

    invoke-direct {v0, p1}, Lqv2/c$k;-><init>(Lrv2/f;)V

    return-object v0

    :cond_b
    instance-of v0, p1, Lrv2/d$v;

    if-eqz v0, :cond_c

    sget-object p1, Lqv2/c$j;->a:Lqv2/c$j;

    return-object p1

    :cond_c
    instance-of v0, p1, Lrv2/d$t;

    if-eqz v0, :cond_d

    sget-object p1, Lqv2/c$h;->a:Lqv2/c$h;

    return-object p1

    :cond_d
    instance-of p1, p1, Lrv2/d$d;

    if-eqz p1, :cond_e

    sget-object p1, Lqv2/c$b;->a:Lqv2/c$b;

    return-object p1

    :cond_e
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

    iget-object v0, p0, Lrv2/g;->z:Lec3/l;

    return-object v0
.end method

.method public final o(Lrv2/d$c0;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lrv2/g$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lrv2/g$b;-><init>(Lrv2/g;Lrv2/d$c0;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
