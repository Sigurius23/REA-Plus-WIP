.class public abstract Ldp0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\r\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "bottomNavTab",
        "Ll83/a0;",
        "e",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "",
        "k",
        "(Landroidx/compose/runtime/Composer;I)Z",
        "Ly3/f;",
        "clearance",
        "h",
        "(FLandroidx/compose/runtime/Composer;I)V",
        "ownsBar",
        "coach-everywhere-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldp0/c;->g(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldp0/g;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1}, Ldp0/c;->f(Ldp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldp0/c;->j(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ldp0/g;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1}, Ldp0/c;->i(Ldp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p1, Lp1/q;

    const v0, 0x48397f9a

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v3, v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p1, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldp0/g;

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v2, :cond_3

    move v4, v5

    :cond_3
    or-int v0, v3, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_4

    if-ne v2, v3, :cond_5

    :cond_4
    new-instance v2, Ldp0/c$a;

    const/4 v0, 0x0

    invoke-direct {v2, v1, p0, v0}, Ldp0/c$a;-><init>(Ldp0/g;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lc93/m;

    invoke-static {v1, p0, v2, p1}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    if-ne v2, v3, :cond_7

    :cond_6
    new-instance v2, Ldp0/a;

    const/4 v0, 0x0

    invoke-direct {v2, v1, v0}, Ldp0/a;-><init>(Ldp0/g;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, p1}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lcp0/a;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p2, v1}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final f(Ldp0/g;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ldp0/c$b;

    invoke-direct {p1, p0}, Ldp0/c$b;-><init>(Ldp0/g;)V

    return-object p1
.end method

.method private static final g(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ldp0/c;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(FLandroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p1, Lp1/q;

    const v0, -0x18b4f1ae

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    if-eq v2, v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v3

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp0/g;

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p1, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-interface {v1, p0}, Ly3/c;->q0(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1, v1}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_3

    if-ne v4, v5, :cond_4

    :cond_3
    new-instance v4, Ldp0/c$c;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Ldp0/c$c;-><init>(Ldp0/g;FLq83/d;)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lc93/m;

    invoke-static {v0, v2, v4, p1}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    if-ne v2, v5, :cond_6

    :cond_5
    new-instance v2, Ldp0/a;

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Ldp0/a;-><init>(Ldp0/g;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, p1}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Ldp0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Ldp0/b;-><init>(FII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final i(Ldp0/g;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ldp0/c$d;

    invoke-direct {p1, p0}, Ldp0/c$d;-><init>(Ldp0/g;)V

    return-object p1
.end method

.method private static final j(FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ldp0/c;->h(FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)Z
    .locals 6

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object p1

    move-object v3, p0

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldp0/g;

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v0, p1, :cond_1

    :cond_0
    invoke-interface {p0}, Ldp0/g;->getState()Lec3/f2;

    move-result-object p0

    new-instance p1, Ldp0/c$e;

    invoke-direct {p1, p0}, Ldp0/c$e;-><init>(Lec3/l;)V

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lec3/l;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v4, 0x30

    const/4 v5, 0x2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p0

    invoke-static {p0}, Ldp0/c;->l(Lp1/t2;)Z

    move-result p0

    return p0
.end method

.method private static final l(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method
