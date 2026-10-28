.class public abstract Lh00/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;

.field public static final b:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh00/d0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh00/d0;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lh00/f0;->a:Lp1/b0;

    sput-object v1, Lh00/f0;->b:Lp1/b0;

    return-void
.end method

.method public static final a(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "startDestination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p4

    check-cast v6, Lp1/q;

    const v0, -0x615d480b    # -1.72285E-20f

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    or-int/lit16 v0, v0, 0x180

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x800

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v0, v0, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_4

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v5, p2

    goto :goto_4

    :cond_4
    :goto_3
    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v6}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v0

    iget-object v0, v0, Ll0/c2;->r:Ll0/z1;

    invoke-static {v6}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v1

    iget-object v1, v1, Ll0/c2;->q:Ll0/z1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    const v0, -0xd98ccbd

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v0, v5, :cond_5

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, v0

    check-cast v5, Lp1/c1;

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ly3/l;

    new-instance v0, Lh00/e0;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lh00/e0;-><init>(ZLeb/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    const v1, -0x5c7e91af

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v7, v0, v6, v1}, Lh00/f0;->b(Ly3/l;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v5, v0

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_6

    new-instance v0, Lat2/u;

    const/16 v2, 0xc

    move-object v3, p0

    move-object v4, p1

    move-object v6, p3

    move v1, p5

    invoke-direct/range {v0 .. v6}, Lat2/u;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Ly3/l;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p2, Lp1/q;

    const v0, -0x26b88e7f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    and-int/lit8 v0, v0, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_2

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_2
    :goto_1
    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    if-eqz p0, :cond_3

    iget-wide v1, p0, Ly3/l;->a:J

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    invoke-interface {v0, v3}, Ly3/c;->e0(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    invoke-interface {v0, v1}, Ly3/c;->e0(I)F

    move-result v0

    invoke-static {v3, v0}, Lvf3/b;->a(FF)J

    move-result-wide v0

    new-instance v2, Ly3/h;

    invoke-direct {v2, v0, v1}, Ly3/h;-><init>(J)V

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    sget-object v0, Lh00/f0;->a:Lp1/b0;

    invoke-virtual {v0, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v0, p1, p2, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_4

    new-instance v0, Lf01/f;

    const/16 v1, 0x16

    invoke-direct {v0, p0, p1, p3, v1}, Lf01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method
