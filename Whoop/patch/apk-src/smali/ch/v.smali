.class public abstract Lch/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:Lnh/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Ly3/b;->h(IIII)J

    move-result-wide v0

    sput-wide v0, Lch/v;->a:J

    sget-object v0, Lnh/h;->c:Lnh/h;

    new-instance v1, Lnh/e;

    invoke-direct {v1, v0}, Lnh/e;-><init>(Lnh/h;)V

    sput-object v1, Lch/v;->b:Lnh/e;

    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lch/u;
    .locals 2

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    :goto_0
    new-instance v0, Lch/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lch/u;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lmh/j;
    .locals 4

    check-cast p1, Lp1/q;

    const v0, 0x40cd272a

    invoke-virtual {p1, v0}, Lp1/q;->f0(I)V

    instance-of v0, p0, Lmh/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lmh/j;

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0

    :cond_0
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const v2, -0x4a382b91

    invoke-virtual {p1, v2}, Lp1/q;->f0(I)V

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v2, Lmh/h;

    invoke-direct {v2, v0}, Lmh/h;-><init>(Landroid/content/Context;)V

    iput-object p0, v2, Lmh/h;->c:Ljava/lang/Object;

    invoke-virtual {v2}, Lmh/h;->a()Lmh/j;

    move-result-object v3

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lmh/j;

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object v3
.end method

.method public static final c(Ljava/lang/Object;Ly2/k;Landroidx/compose/runtime/Composer;)Lmh/j;
    .locals 6

    check-cast p2, Lp1/q;

    const v0, 0x63ff5e82

    invoke-virtual {p2, v0}, Lp1/q;->f0(I)V

    instance-of v0, p0, Lmh/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p0

    check-cast v2, Lmh/j;

    iget-object v3, v2, Lmh/j;->E:Lmh/d;

    iget-object v3, v3, Lmh/d;->a:Lnh/i;

    if-eqz v3, :cond_0

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v2

    :cond_0
    const v2, 0x1856439f

    invoke-virtual {p2, v2}, Lp1/q;->f0(I)V

    sget-object v2, Ly2/j;->f:Ly2/l;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz p1, :cond_1

    sget-object p1, Lch/v;->b:Lnh/e;

    goto :goto_0

    :cond_1
    const p1, 0x18564e9e

    invoke-virtual {p2, p1}, Lp1/q;->f0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    new-instance p1, Lch/p;

    invoke-direct {p1}, Lch/p;-><init>()V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, Lch/p;

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    const v0, -0xd8b4232

    invoke-virtual {p2, v0}, Lp1/q;->f0(I)V

    check-cast p0, Lmh/j;

    const v0, 0x18565abd

    invoke-virtual {p2, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    if-ne v4, v2, :cond_4

    :cond_3
    invoke-static {p0}, Lmh/j;->a(Lmh/j;)Lmh/h;

    move-result-object p0

    iput-object p1, p0, Lmh/h;->u:Lnh/i;

    iput-object v3, p0, Lmh/h;->w:Landroidx/lifecycle/x;

    iput-object v3, p0, Lmh/h;->x:Lnh/i;

    iput-object v3, p0, Lmh/h;->y:Lnh/g;

    invoke-virtual {p0}, Lmh/h;->a()Lmh/j;

    move-result-object v4

    invoke-virtual {p2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/j;

    invoke-static {p2, v1, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-object v4

    :cond_5
    const v0, -0xd88c34e

    invoke-virtual {p2, v0}, Lp1/q;->f0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const v4, 0x1856748e

    invoke-virtual {p2, v4}, Lp1/q;->f0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    if-ne v5, v2, :cond_7

    :cond_6
    new-instance v2, Lmh/h;

    invoke-direct {v2, v0}, Lmh/h;-><init>(Landroid/content/Context;)V

    iput-object p0, v2, Lmh/h;->c:Ljava/lang/Object;

    iput-object p1, v2, Lmh/h;->u:Lnh/i;

    iput-object v3, v2, Lmh/h;->w:Landroidx/lifecycle/x;

    iput-object v3, v2, Lmh/h;->x:Lnh/i;

    iput-object v3, v2, Lmh/h;->y:Lnh/g;

    invoke-virtual {v2}, Lmh/h;->a()Lmh/j;

    move-result-object v5

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lmh/j;

    invoke-static {p2, v1, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-object v5
.end method
