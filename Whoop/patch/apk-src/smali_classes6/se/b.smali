.class public abstract Lse/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/os/Handler;


# direct methods
.method public static A(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;ZLjava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "nameProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh20/p0;->a:Lh20/p0;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object p1, Lh20/q0;->a:Lh20/q0;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    const/4 p2, 0x3

    new-array p2, p2, [Lh20/t0;

    sget-object v2, Lh20/o0;->a:Lh20/o0;

    const/4 v3, 0x0

    aput-object v2, p2, v3

    const/4 v2, 0x1

    aput-object v0, p2, v2

    const/4 v0, 0x2

    aput-object p1, p2, v0

    invoke-static {p2}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p0, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/o4;

    new-instance v2, Lh20/r0;

    iget-object v3, v0, Ly00/o4;->E:Ly00/f4;

    if-eqz v3, :cond_2

    iget-object v3, v3, Ly00/f4;->w:Ljava/lang/String;

    goto :goto_3

    :cond_2
    move-object v3, v1

    :goto_3
    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzy/c;

    iget-object v4, v0, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v4, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v3, v0, p4, v4}, Lh20/t;->a(Lzy/c;Ly00/o4;ZZ)Lh20/l;

    move-result-object v0

    invoke-direct {v2, v0}, Lh20/r0;-><init>(Lh20/l;)V

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {p1, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final B(JLandroidx/compose/runtime/Composer;)Ll3/m0;
    .locals 25

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x32a9c7cf

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const v1, -0x548d6062

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/e;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    iget-object v3, v3, Lg00/e;->d:Ll3/v0;

    iget-object v3, v3, Ll3/v0;->a:Ll3/m0;

    iget-wide v8, v3, Ll3/m0;->b:J

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/e;

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    iget-object v3, v3, Lg00/e;->d:Ll3/v0;

    iget-object v3, v3, Ll3/v0;->a:Ll3/m0;

    iget-object v13, v3, Ll3/m0;->f:Lp3/i;

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/e;

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    iget-object v1, v1, Lg00/e;->d:Ll3/v0;

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v10, v1, Ll3/m0;->c:Lp3/r;

    new-instance v5, Ll3/m0;

    const/16 v23, 0x0

    const v24, 0xffd8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    move-wide/from16 v6, p0

    invoke-direct/range {v5 .. v24}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    return-object v5
.end method

.method public static final C(Ljava/lang/Throwable;)La30/e1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, La30/e1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, La30/e1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, La30/d1;

    invoke-direct {v0, p0}, La30/d1;-><init>(Ljava/lang/Throwable;)V

    :cond_1
    return-object v0
.end method

.method public static final D(Ly00/c0;)Lzy/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/a0;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/a0;

    iget-object v0, p0, Ly00/a0;->F:Ljava/lang/String;

    iget-object v1, p0, Ly00/a0;->N:Ly00/z;

    iget-object v1, v1, Ly00/z;->w:Ljava/lang/String;

    iget-object p0, p0, Ly00/a0;->K:Ly00/i;

    invoke-static {v0, v1, p0}, Lse/b;->L(Ljava/lang/String;Ljava/lang/String;Ly00/i;)Lzy/c;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ly00/x;

    if-eqz v0, :cond_3

    check-cast p0, Ly00/x;

    iget-object v0, p0, Ly00/x;->F:Ljava/lang/String;

    iget-object p0, p0, Ly00/x;->G:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    invoke-static {p0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_2
    const p0, 0x7f141051

    invoke-static {p0}, Ls4/i;->h(I)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ly00/b0;

    if-eqz v0, :cond_4

    check-cast p0, Ly00/b0;

    iget-object p0, p0, Ly00/b0;->E:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final E(Ly00/s2;)Lzy/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/r2;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/r2;

    iget-object v0, p0, Ly00/r2;->w:Ljava/lang/String;

    iget-object v1, p0, Ly00/r2;->F:Ljava/lang/String;

    iget-object p0, p0, Ly00/r2;->E:Ly00/i;

    invoke-static {v0, v1, p0}, Lse/b;->L(Ljava/lang/String;Ljava/lang/String;Ly00/i;)Lzy/c;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ly00/q2;

    if-eqz v0, :cond_2

    check-cast p0, Ly00/q2;

    iget-object v0, p0, Ly00/q2;->w:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object p0, p0, Ly00/q2;->x:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final F(I)Lr7/j0;
    .locals 2

    int-to-double v0, p0

    new-instance p0, Lr7/j0;

    invoke-direct {p0, v0, v1}, Lr7/j0;-><init>(D)V

    return-object p0
.end method

.method public static final G(Lva3/h;)Ljava/util/List;
    .locals 6

    invoke-virtual {p0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lfa3/w;->a:Lva3/e;

    const-string v1, "get"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "is"

    if-nez v3, :cond_3

    invoke-static {v0, v5, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "set"

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    invoke-static {p0, v1, v4, v0}, Lse/b;->V(Lva3/h;Ljava/lang/String;Ljava/lang/String;I)Lva3/h;

    move-result-object v2

    invoke-static {p0, v1, v5, v0}, Lse/b;->V(Lva3/h;Ljava/lang/String;Ljava/lang/String;I)Lva3/h;

    move-result-object p0

    filled-new-array {v2, p0}, [Lva3/h;

    move-result-object p0

    invoke-static {p0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lfa3/f;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-nez p0, :cond_2

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_2
    return-object p0

    :cond_3
    :goto_0
    const/16 v0, 0xc

    invoke-static {p0, v1, v4, v0}, Lse/b;->V(Lva3/h;Ljava/lang/String;Ljava/lang/String;I)Lva3/h;

    move-result-object v0

    if-nez v0, :cond_4

    const/16 v0, 0x8

    invoke-static {p0, v5, v4, v0}, Lse/b;->V(Lva3/h;Ljava/lang/String;Ljava/lang/String;I)Lva3/h;

    move-result-object v0

    :cond_4
    invoke-static {v0}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static H(Ljava/util/List;Lq20/y;)Lh20/t0;
    .locals 5

    const-string v0, "items"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lh20/t0;

    instance-of v3, p1, Lq20/j;

    if-eqz v3, :cond_1

    instance-of v2, v2, Lh20/p0;

    goto :goto_1

    :cond_1
    instance-of v3, p1, Lq20/m;

    if-eqz v3, :cond_2

    instance-of v2, v2, Lh20/q0;

    goto :goto_1

    :cond_2
    instance-of v3, p1, Lq20/w;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    instance-of v3, v2, Lh20/r0;

    if-eqz v3, :cond_3

    move-object v3, p1

    check-cast v3, Lq20/w;

    iget-object v3, v3, Lq20/w;->x:Ly00/o4;

    iget-object v3, v3, Ly00/o4;->w:Ljava/lang/String;

    check-cast v2, Lh20/r0;

    iget-object v2, v2, Lh20/r0;->c:Ly00/o4;

    iget-object v2, v2, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_3
    :goto_0
    move v2, v4

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lq20/t;

    if-nez v2, :cond_3

    instance-of v2, p1, Lq20/g;

    if-nez v2, :cond_3

    instance-of v2, p1, Lq20/i;

    if-nez v2, :cond_3

    instance-of v2, p1, Lq20/x;

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :goto_1
    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_6
    check-cast v0, Lh20/t0;

    :cond_7
    return-object v0
.end method

.method public static final I(Ly00/s2;)Lzy/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/r2;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/r2;

    iget-object p0, p0, Ly00/r2;->z:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ly00/q2;

    if-eqz v0, :cond_2

    check-cast p0, Ly00/q2;

    iget-object v0, p0, Ly00/q2;->w:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object p0, p0, Ly00/q2;->x:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static J()Landroid/os/Handler;
    .locals 2

    sget-object v0, Lse/b;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lse/b;->a:Landroid/os/Handler;

    :cond_0
    sget-object v0, Lse/b;->a:Landroid/os/Handler;

    return-object v0
.end method

.method public static final K(Ljava/util/List;)Lzy/c;
    .locals 3

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzy/c;

    check-cast v0, Lzy/c;

    const-string v2, " "

    invoke-static {v2}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v2

    invoke-static {v0, v2}, Ls4/i;->q(Lzy/c;Lzy/c;)Lzy/a;

    move-result-object v0

    invoke-static {v0, v1}, Ls4/i;->q(Lzy/c;Lzy/c;)Lzy/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lzy/c;

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final L(Ljava/lang/String;Ljava/lang/String;Ly00/i;)Lzy/c;
    .locals 2

    if-eqz p0, :cond_0

    invoke-static {p0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object p0, p2, Ly00/i;->x:Ljava/lang/String;

    const-string p2, "funding"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "brand"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f141030

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "CREDIT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const p1, 0x7f14102d

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :sswitch_1
    const-string p2, "FUNDING_INVALID"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :sswitch_2
    const-string p2, "CHARGE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, p0, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :sswitch_3
    const-string p2, "PREPAID"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const p1, 0x7f14102f

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :sswitch_4
    const-string p2, "DEBIT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, p0, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_4
    const p1, 0x7f14102e

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x3de9ccc -> :sswitch_4
        0x17d197cf -> :sswitch_3
        0x766a16b4 -> :sswitch_2
        0x767c4675 -> :sswitch_1
        0x76f89ef9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static M(Ljava/util/Map;)Lgw/a;
    .locals 1

    const-string v0, "alg"

    invoke-static {v0, p0}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lgw/a;->x:Lgw/a;

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lgw/a;

    invoke-direct {v0, p0}, Lgw/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static N(Ljava/util/Map;)Ljava/util/Date;
    .locals 4

    const-string v0, "exp"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Lxw/d;->e(Ljava/lang/String;Ljava/util/Map;)J

    move-result-wide v0

    new-instance p0, Ljava/util/Date;

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p0
.end method

.method public static O(Ljava/util/Map;)Ljava/util/Date;
    .locals 4

    const-string v0, "iat"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Lxw/d;->e(Ljava/lang/String;Ljava/util/Map;)J

    move-result-wide v0

    new-instance p0, Ljava/util/Date;

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p0
.end method

.method public static P(Ljava/util/Map;)Ljava/util/LinkedHashSet;
    .locals 9

    const-string v0, "key_ops"

    invoke-static {v0, p0}, Lxw/d;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lnw/e;->values()[Lnw/e;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v6, v4, :cond_3

    aget-object v7, v3, v6

    iget-object v8, v7, Lnw/e;->w:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move-object v7, v0

    :goto_2
    if-eqz v7, :cond_4

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "Invalid JWK operation: "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_5
    return-object v1
.end method

.method public static Q(Ljava/util/Map;)Lnw/g;
    .locals 6

    const-string v0, "revoked"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {v0, p0}, Lxw/d;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "revoked_at"

    invoke-static {v0, p0}, Lxw/d;->e(Ljava/lang/String;Ljava/util/Map;)J

    move-result-wide v0

    new-instance v3, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    const-string v0, "reason"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    const-class v1, Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    sget-object v0, Lnw/f;->b:Lnw/f;

    iget-object v1, v0, Lnw/f;->a:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lnw/f;->c:Lnw/f;

    iget-object v1, v0, Lnw/f;->a:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Lnw/f;->d:Lnw/f;

    iget-object v1, v0, Lnw/f;->a:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lnw/f;

    invoke-direct {v0, p0}, Lnw/f;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    :goto_1
    new-instance p0, Lnw/g;

    invoke-direct {p0, v3, v2}, Lnw/g;-><init>(Ljava/util/Date;Lnw/f;)V

    return-object p0
.end method

.method public static R(Ljava/util/Map;)Lnw/h;
    .locals 2

    :try_start_0
    const-string v0, "kty"

    invoke-static {v0, p0}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lnw/h;->a(Ljava/lang/String;)Lnw/h;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/text/ParseException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method public static S(Ljava/util/Map;)Lnw/i;
    .locals 2

    const-string v0, "use"

    invoke-static {v0, p0}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Lnw/i;->x:Lnw/i;

    iget-object v1, v0, Lnw/i;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lnw/i;->y:Lnw/i;

    iget-object v1, v0, Lnw/i;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lnw/i;

    invoke-direct {v0, p0}, Lnw/i;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    new-instance p0, Ljava/text/ParseException;

    const-string v0, "JWK use value must not be empty or blank"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static T(Ljava/util/Map;)Ljava/util/Date;
    .locals 4

    const-string v0, "nbf"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Lxw/d;->e(Ljava/lang/String;Ljava/util/Map;)J

    move-result-wide v0

    new-instance p0, Ljava/util/Date;

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p0
.end method

.method public static U(Ljava/util/Map;)Ljava/util/LinkedList;
    .locals 2

    const-string v0, "x5c"

    const-class v1, Ljava/util/List;

    invoke-static {p0, v0, v1}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Ls2/d;->u(Ljava/util/List;)Ljava/util/LinkedList;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static V(Lva3/h;Ljava/lang/String;Ljava/lang/String;I)Lva3/h;
    .locals 6

    and-int/lit8 v0, p3, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 p3, p3, 0x8

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    move-object p2, v3

    :cond_1
    iget-boolean p3, p0, Lva3/h;->x:Z

    if-eqz p3, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p0}, Lva3/h;->c()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p1, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v4, v5, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x61

    if-gt v5, v4, :cond_5

    const/16 v5, 0x7b

    if-ge v4, v5, :cond_5

    goto/16 :goto_4

    :cond_5
    if-eqz p2, :cond_6

    invoke-static {p3, p1}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    return-object p0

    :cond_6
    if-nez v0, :cond_7

    return-object p0

    :cond_7
    invoke-static {p3, p1}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-static {v1, p0}, Lsb3/a;->o(ILjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_3

    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const-string p2, "substring(...)"

    if-eq p1, v2, :cond_e

    invoke-static {v2, p0}, Lsb3/a;->o(ILjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    new-instance p1, Li93/j;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p3

    sub-int/2addr p3, v2

    invoke-direct {p1, v1, p3, v2}, Li93/h;-><init>(III)V

    invoke-virtual {p1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    move-object p3, p1

    check-cast p3, Li93/i;

    iget-boolean p3, p3, Li93/i;->y:Z

    if-eqz p3, :cond_c

    move-object p3, p1

    check-cast p3, Lm83/e0;

    invoke-virtual {p3}, Lm83/e0;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0, p0}, Lsb3/a;->o(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_1

    :cond_c
    move-object p3, v3

    :goto_1
    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_d

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr p1, v2

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lsb3/a;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_d
    invoke-static {p0}, Lsb3/a;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_e
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_f

    goto :goto_3

    :cond_f
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 p3, 0x41

    if-gt p3, p1, :cond_10

    const/16 p3, 0x5b

    if-ge p1, p3, :cond_10

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_10
    :goto_3
    invoke-static {p0}, Lva3/h;->f(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_11

    :goto_4
    return-object v3

    :cond_11
    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    return-object p0
.end method

.method public static W(I)[B
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/m0;->a:Lat/b;

    new-array p0, p0, [B

    sget-object v0, Lcom/google/crypto/tink/internal/m0;->a:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/SecureRandom;

    invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object p0
.end method

.method public static final X(La0/g;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    const-string v0, "map"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La0/g;

    const/16 v1, 0x3e7

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iget v2, p0, La0/f1;->y:I

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :cond_0
    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {p0, v4}, La0/f1;->g(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v4}, La0/f1;->k(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v1, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, La0/f1;->clear()V

    move v5, v3

    goto :goto_0

    :cond_1
    if-lez v5, :cond_2

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public static final Y(La0/y;ZLkotlin/jvm/functions/Function1;)V
    .locals 10

    new-instance v0, La0/y;

    const/16 v1, 0x3e7

    invoke-direct {v0, v1}, La0/y;-><init>(I)V

    invoke-virtual {p0}, La0/y;->i()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :cond_0
    :goto_0
    if-ge v4, v2, :cond_3

    if-eqz p1, :cond_1

    invoke-virtual {p0, v4}, La0/y;->f(I)J

    move-result-wide v6

    invoke-virtual {p0, v4}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v6, v7, v8}, La0/y;->g(JLjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v4}, La0/y;->f(I)J

    move-result-wide v6

    const/4 v8, 0x0

    invoke-virtual {v0, v6, v7, v8}, La0/y;->g(JLjava/lang/Object;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v1, :cond_0

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_2

    invoke-virtual {v0}, La0/y;->i()I

    move-result v5

    move v6, v3

    :goto_2
    if-ge v6, v5, :cond_2

    invoke-virtual {v0, v6}, La0/y;->f(I)J

    move-result-wide v7

    invoke-virtual {v0, v6}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {p0, v7, v8, v9}, La0/y;->g(JLjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, La0/y;->a()V

    move v5, v3

    goto :goto_0

    :cond_3
    if-lez v5, :cond_4

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_4

    invoke-virtual {v0}, La0/y;->i()I

    move-result p1

    :goto_3
    if-ge v3, p1, :cond_4

    invoke-virtual {v0, v3}, La0/y;->f(I)J

    move-result-wide v1

    invoke-virtual {v0, v3}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v1, v2, p2}, La0/y;->g(JLjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method public static final Z(Lkotlin/Metadata;)[Ljava/lang/String;
    .locals 2

    invoke-interface {p0}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;

    const-string v0, "Metadata is missing: kotlin.Metadata.data1 must not be an empty array"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static final a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "onButtonClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, -0x6a98236

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 p2, p2, 0x13

    const/16 v0, 0x12

    if-ne p2, v0, :cond_5

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_4

    :cond_5
    :goto_3
    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 p2, 0x0

    int-to-float v6, p2

    sget-object p2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v9, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/c1;

    invoke-virtual {p2}, Lg1/c1;->h()J

    move-result-wide v2

    new-instance p2, Lb30/i;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1, p0}, Lb30/i;-><init>(ILc93/a;Z)V

    const v0, 0x278ee8b9

    invoke-static {v0, v9, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x30c06

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Lg1/n0;->b(Landroidx/compose/ui/Modifier;JJFLl0/k1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_4
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, La41/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static a0(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    if-eqz p0, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "RESULT_CANCELED"

    return-object p0

    :cond_1
    const-string p0, "RESULT_OK"

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    const-string v0, "contentDescription"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPressed"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    const v0, -0x338d4fe1    # -6.3619196E7f

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v5, v9}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v3, p0

    goto :goto_4

    :cond_5
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_4

    move-object/from16 v3, p0

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_3

    :cond_6
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit16 v4, v10, 0xc00

    if-nez v4, :cond_8

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x800

    goto :goto_5

    :cond_7
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v0, v4

    :cond_8
    and-int/lit16 v4, v0, 0x493

    const/16 v6, 0x492

    if-ne v4, v6, :cond_a

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v4, v3

    goto/16 :goto_9

    :cond_a
    :goto_6
    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_b

    move-object v11, v4

    goto :goto_7

    :cond_b
    move-object v11, v3

    :goto_7
    sget-object v2, Lb2/e;->E:Lb2/m;

    const/16 v3, 0x1e

    int-to-float v3, v3

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v6, -0x1a6f7841

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    sget-object v7, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v5, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg00/b;

    const/4 v13, 0x0

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    iget-wide v14, v12, Lg00/b;->c:J

    sget-object v12, Lt0/j;->a:Lt0/i;

    invoke-static {v3, v14, v15, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v12}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v12, 0x0

    const/4 v14, 0x7

    invoke-static {v3, v13, v12, v8, v14}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-nez v13, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    :cond_d
    invoke-static {v12, v5, v12, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v2, v0, 0xe

    invoke-static {v9, v5, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/b;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    iget-wide v6, v3, Lg00/b;->v:J

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x180

    move-wide/from16 v16, v6

    move v6, v0

    move-object v0, v2

    move-object v2, v3

    move-wide/from16 v3, v16

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object v4, v11

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lh00/i;

    move-object/from16 v6, p1

    move/from16 v3, p6

    move-object v5, v8

    move v1, v9

    move v2, v10

    invoke-direct/range {v0 .. v6}, Lh00/i;-><init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static b0(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-static {}, Lse/b;->J()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/Integer;ZJZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v12, p7

    check-cast v12, Lp1/q;

    const v5, 0xf1356bd

    invoke-virtual {v12, v5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int v5, p8, v5

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v5, v6

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v5, v6

    move-wide/from16 v6, p3

    invoke-virtual {v12, v6, v7}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x800

    goto :goto_3

    :cond_3
    const/16 v8, 0x400

    :goto_3
    or-int/2addr v5, v8

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x4000

    goto :goto_4

    :cond_4
    const/16 v8, 0x2000

    :goto_4
    or-int/2addr v5, v8

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    const/high16 v9, 0x20000

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_5

    :cond_5
    const/high16 v8, 0x10000

    :goto_5
    or-int v16, v5, v8

    const v5, 0x12493

    and-int v5, v16, v5

    const v8, 0x12492

    if-ne v5, v8, :cond_7

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_7
    :goto_6
    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v13, 0x30

    int-to-float v14, v13

    const/16 v21, 0x0

    const/16 v22, 0xd

    const/16 v18, 0x0

    const/16 v20, 0x0

    move/from16 v19, v14

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const v10, -0x67dab863

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    const/high16 v10, 0x70000

    and-int v10, v16, v10

    const/4 v15, 0x0

    const/4 v6, 0x1

    if-ne v10, v9, :cond_8

    move v7, v6

    goto :goto_7

    :cond_8
    move v7, v15

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_9

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v9, v7, :cond_a

    :cond_9
    new-instance v9, Lg40/i3;

    const/4 v7, 0x0

    invoke-direct {v9, v4, v7}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v9, Lc93/a;

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    const/4 v7, 0x6

    const/4 v10, 0x0

    invoke-static {v14, v3, v10, v9, v7}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "TEST_TAG_DROP_DOWN_CHOICE_"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v9, -0x67daaca6

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    if-eqz v3, :cond_b

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_b
    sget-object v9, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v12, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li2/x;

    iget-wide v9, v9, Li2/x;->a:J

    sget-object v14, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v12, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg1/c1;

    invoke-virtual {v14}, Lg1/c1;->i()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-static {v9, v10}, Li2/w0;->x(J)F

    goto :goto_8

    :cond_c
    invoke-static {v9, v10}, Li2/w0;->x(J)F

    :goto_8
    const v9, 0x3ec28f5c    # 0.38f

    :goto_9
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    invoke-static {v9, v7}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x36

    invoke-static {v8, v5, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    :cond_e
    invoke-static {v8, v12, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x2864a644

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    if-nez v1, :cond_10

    move-object/from16 v17, v11

    move/from16 v24, v13

    goto :goto_b

    :cond_10
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5, v12, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    const/16 v7, 0xd

    int-to-float v7, v7

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v18, v7

    move-object/from16 v17, v11

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move v8, v13

    const/16 v13, 0x1b0

    const/16 v14, 0x78

    move v9, v6

    const/4 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move v11, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move/from16 v24, v18

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_b
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    const/16 v5, 0x10

    int-to-float v9, v5

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v18, v9

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v25, v18

    const v6, 0x2864cf31

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_11

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v12, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/c1;

    invoke-virtual {v6}, Lg1/c1;->f()J

    move-result-wide v6

    goto :goto_c

    :cond_11
    move-wide/from16 v6, p3

    :goto_c
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    if-eqz v2, :cond_12

    sget-object v8, Lp3/r;->I:Lp3/r;

    goto :goto_d

    :cond_12
    sget-object v8, Lp3/r;->F:Lp3/r;

    :goto_d
    and-int/lit8 v9, v16, 0xe

    or-int/lit8 v22, v9, 0x30

    const/16 v23, 0xc00

    const v24, 0x1dfd8

    move-object v1, v5

    const-wide/16 v4, 0x0

    move-wide v2, v6

    const/4 v6, 0x0

    move-object v7, v8

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x1

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v26

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v21

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v1, v0

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_13

    :goto_e
    const/4 v13, 0x1

    goto :goto_f

    :cond_13
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_e

    :goto_f
    invoke-static {v0, v13, v12}, Ldc/b;->y(FZLp1/q;)V

    const v1, 0x7f0807c0

    const/4 v2, 0x0

    invoke-static {v1, v12, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v2, 0x14

    int-to-float v2, v2

    move-object/from16 v3, v28

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v2, 0x8

    int-to-float v7, v2

    const/4 v10, 0x0

    const/16 v11, 0xa

    const/4 v8, 0x0

    move/from16 v9, v25

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz p2, :cond_14

    move v10, v0

    goto :goto_10

    :cond_14
    const/4 v10, 0x0

    :goto_10
    invoke-static {v10, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v12, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->f()J

    move-result-wide v3

    const/16 v6, 0x30

    const/4 v7, 0x0

    move-object v0, v1

    const/4 v1, 0x0

    move-object v5, v12

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_15

    new-instance v0, Lg40/j3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lg40/j3;-><init>(Ljava/lang/String;Ljava/lang/Integer;ZJZLc93/a;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static c0(Landroid/view/View;Lkr/g;)V
    .locals 3

    iget-object v0, p1, Lkr/g;->w:Lkr/f;

    iget-object v0, v0, Lkr/f;->b:Lyq/a;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lyq/a;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, Lh5/h0;->e(Landroid/view/View;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lkr/g;->w:Lkr/f;

    iget v1, p0, Lkr/f;->m:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_1

    iput v0, p0, Lkr/f;->m:F

    invoke-virtual {p1}, Lkr/g;->v()V

    :cond_1
    return-void
.end method

.method public static final d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x3145f7ad

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    move-object/from16 v7, p1

    if-nez v6, :cond_3

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    move v13, v5

    and-int/lit16 v5, v13, 0x93

    const/16 v6, 0x92

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v5, v6, :cond_6

    move v5, v15

    goto :goto_4

    :cond_6
    move v5, v14

    :goto_4
    and-int/lit8 v6, v13, 0x1

    invoke-virtual {v0, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Landroid/view/View;

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ly3/c;

    sget-object v5, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ly3/m;

    invoke-static {v0}, Lp1/x;->E(Landroidx/compose/runtime/Composer;)Lp1/o;

    move-result-object v5

    invoke-static {v3, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    new-array v11, v14, [Ljava/lang/Object;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v14, v12, :cond_7

    sget-object v14, Lc4/f;->x:Lc4/f;

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v14, Lc93/a;

    const/16 v2, 0x30

    invoke-static {v11, v14, v0, v2}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/util/UUID;

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v2, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v2, :cond_8

    if-ne v14, v12, :cond_9

    :cond_8
    move-object v2, v5

    new-instance v5, Lc4/d0;

    move-object/from16 v16, v6

    move-object v6, v1

    move-object/from16 v1, v16

    invoke-direct/range {v5 .. v11}, Lc4/d0;-><init>(Lc93/a;Lc4/a0;Landroid/view/View;Ly3/m;Ly3/c;Ljava/util/UUID;)V

    new-instance v6, Lc4/e;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v7}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lx1/b;

    const v7, 0x14ae31cc

    invoke-direct {v1, v6, v15, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    iget-object v6, v5, Lc4/d0;->G:Lc4/z;

    invoke-virtual {v6, v2}, Lb3/a;->setParentCompositionContext(Lp1/t;)V

    iget-object v2, v6, Lc4/z;->K:Lp1/k1;

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iput-boolean v15, v6, Lc4/z;->O:Z

    invoke-virtual {v6}, Lb3/a;->c()V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v14, v5

    :cond_9
    move-object v6, v14

    check-cast v6, Lc4/d0;

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_a

    if-ne v2, v12, :cond_b

    :cond_a
    new-instance v2, La13/h;

    const/4 v1, 0x0

    const/4 v5, 0x6

    invoke-direct {v2, v6, v1, v5}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lc93/m;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v2, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    if-ne v2, v12, :cond_d

    :cond_c
    new-instance v2, Lc4/b;

    const/4 v1, 0x0

    invoke-direct {v2, v6, v1}, Lc4/b;-><init>(Lc4/d0;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v2, v0}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, v13, 0xe

    const/4 v5, 0x4

    if-ne v2, v5, :cond_e

    move v2, v15

    goto :goto_5

    :cond_e
    const/4 v2, 0x0

    :goto_5
    or-int/2addr v1, v2

    and-int/lit8 v2, v13, 0x70

    const/16 v5, 0x20

    if-ne v2, v5, :cond_f

    move v14, v15

    goto :goto_6

    :cond_f
    const/4 v14, 0x0

    :goto_6
    or-int/2addr v1, v14

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    if-ne v2, v12, :cond_11

    :cond_10
    new-instance v5, Landroidx/fragment/app/p;

    const/4 v10, 0x1

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    invoke-direct/range {v5 .. v10}, Landroidx/fragment/app/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v5

    :cond_11
    check-cast v2, Lc93/a;

    invoke-static {v2, v0}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    goto :goto_7

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lc4/c;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final d0(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetwork(Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;

    return-void
.end method

.method public static final e(ZZLg40/m3;Ln00/d;Lg2/s;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    const-string v0, "emailController"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    const v0, 0x2efdb194

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v0, p0

    invoke-virtual {v4, v0}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p6, v2

    move/from16 v11, p1

    invoke-virtual {v4, v11}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v2, v5

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x800

    goto :goto_3

    :cond_3
    const/16 v5, 0x400

    :goto_3
    or-int v12, v2, v5

    and-int/lit16 v2, v12, 0x2493

    const/16 v5, 0x2492

    if-ne v2, v5, :cond_5

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_5
    :goto_4
    const/4 v13, 0x0

    new-array v2, v13, [Ljava/lang/Object;

    const v5, 0x334356a1

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v5, v14, :cond_6

    new-instance v5, Lmq2/a;

    const/16 v6, 0x11

    invoke-direct {v5, v6}, Lmq2/a;-><init>(I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v5

    check-cast v6, Lc93/a;

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    const/16 v8, 0xc00

    const/4 v9, 0x6

    const/4 v5, 0x0

    move-object v7, v4

    move-object v4, v2

    invoke-static/range {v4 .. v9}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/c1;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v13

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->F:Lb2/m;

    invoke-static {v5, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    invoke-static {v6, v7, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v7, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    const/16 v0, 0x8

    int-to-float v0, v0

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-static {v15, v4, v0, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    move v4, v0

    new-instance v0, Lg1/u7;

    move v6, v11

    move-object v11, v5

    move v5, v6

    move-object v6, v1

    move/from16 v18, v12

    move-object/from16 v1, p4

    move v12, v4

    move/from16 v4, p0

    invoke-direct/range {v0 .. v6}, Lg1/u7;-><init>(Lg2/s;Lp1/c1;Ln00/d;ZZLg40/m3;)V

    const v1, -0x41f6c77d

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    shr-int/lit8 v0, v18, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v5, v0, 0x6006

    const/16 v6, 0x8

    move-object/from16 v1, p2

    move-object v4, v7

    move/from16 v2, v16

    move-object/from16 v0, v17

    move-object/from16 v7, p3

    invoke-static/range {v0 .. v6}, Lg40/j4;->e(Landroidx/compose/ui/Modifier;Lg40/m3;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    const v0, 0xacbdde7

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ln00/d;->x:Ln00/d;

    if-ne v7, v0, :cond_e

    sget-object v0, Ll0/m;->a:Ll0/e;

    sget-object v1, Lb2/e;->J:Lb2/l;

    const/4 v2, 0x0

    invoke-static {v0, v1, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v1, v4, v1, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x1a6f7841

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    iget-wide v0, v0, Lg00/b;->u:J

    const/4 v2, 0x4

    int-to-float v2, v2

    const/16 v3, 0x14

    int-to-float v3, v3

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v5, -0x607fd34

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_d

    new-instance v5, Lmx1/o;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Lmx1/o;-><init>(I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    invoke-static {v3, v10, v5}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object v8, v4

    move-wide v4, v0

    move v1, v2

    const/16 v2, 0xc00

    const/4 v3, 0x4

    const-wide/16 v6, 0x0

    invoke-static/range {v1 .. v9}, Lup/d;->f(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v4, v8

    const/4 v0, 0x1

    invoke-static {v15, v12, v4, v0}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_7

    :cond_e
    const/4 v0, 0x1

    const/4 v10, 0x0

    :goto_7
    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lb30/x3;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/x3;-><init>(ZZLg40/m3;Ln00/d;Lg2/s;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final e0(Ly00/o4;Lv00/c0;Ljava/lang/String;)Lh20/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object v1, p0, Ly00/o4;->E:Ly00/f4;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly00/f4;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Lv00/c0;->R(Ljava/lang/String;)Lu00/f;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, Lu00/f;->c:Lzy/c;

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    invoke-static {v1}, Ls4/i;->p(Lzy/c;)Lzy/c;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    invoke-static {v1}, Ls4/i;->p(Lzy/c;)Lzy/c;

    move-result-object v1

    if-eqz p1, :cond_3

    iget-object v0, p1, Lv00/c0;->H:Lw30/c;

    :cond_3
    instance-of p1, v0, Lw30/a;

    iget-object v0, p0, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {v1, p0, p1, p2}, Lh20/t;->a(Lzy/c;Ly00/o4;ZZ)Lh20/l;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x70bc5a37

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    const/16 v7, 0x20

    if-eqz v6, :cond_1

    move v6, v7

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v4, v6

    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_3

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v25, v3

    goto/16 :goto_7

    :cond_3
    :goto_2
    const v6, 0x7f141033

    invoke-static {v3, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const v8, 0x7f141032

    filled-new-array {v0, v6}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9, v3}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v8

    const v9, 0x725ee5ac

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v9, v4, 0x70

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-ne v9, v7, :cond_4

    move v7, v10

    goto :goto_3

    :cond_4
    move v7, v11

    :goto_3
    and-int/lit8 v4, v4, 0xe

    if-ne v4, v5, :cond_5

    goto :goto_4

    :cond_5
    move v10, v11

    :goto_4
    or-int v4, v7, v10

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_6

    if-ne v5, v7, :cond_7

    :cond_6
    new-instance v5, Lc41/j0;

    const/4 v4, 0x6

    invoke-direct {v5, v1, v0, v4}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lc93/a;

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    const-string v4, "substring(...)"

    const v9, -0x52073109

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    new-instance v9, Ll3/d;

    invoke-direct {v9}, Ll3/d;-><init>()V

    const/4 v10, 0x6

    invoke-static {v8, v6, v11, v11, v10}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v10

    const v12, -0x1a6f7841

    invoke-virtual {v3, v12}, Lp1/q;->e0(I)V

    sget-object v13, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v3, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg00/b;

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    iget-wide v14, v14, Lg00/b;->n:J

    invoke-static {v14, v15, v3}, Lse/b;->B(JLandroidx/compose/runtime/Composer;)Ll3/m0;

    move-result-object v14

    invoke-virtual {v3, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg00/b;

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    iget-wide v12, v12, Lg00/b;->q:J

    invoke-static {v12, v13, v3}, Lse/b;->B(JLandroidx/compose/runtime/Composer;)Ll3/m0;

    move-result-object v12

    const v13, -0x41499f99

    invoke-virtual {v3, v13}, Lp1/q;->e0(I)V

    if-ltz v10, :cond_a

    invoke-virtual {v9, v14}, Ll3/d;->j(Ll3/m0;)I

    move-result v13

    :try_start_0
    invoke-virtual {v8, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v15}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    invoke-virtual {v9, v13}, Ll3/d;->f(I)V

    const v13, -0x132c464c

    invoke-virtual {v3, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_8

    if-ne v15, v7, :cond_9

    :cond_8
    new-instance v15, Li20/z0;

    const/4 v7, 0x1

    invoke-direct {v15, v5, v7}, Li20/z0;-><init>(Lc93/a;I)V

    invoke-virtual {v3, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v15, Li20/z0;

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    new-instance v5, Ll3/t;

    const/4 v7, 0x0

    const-string v13, "update"

    invoke-direct {v5, v13, v7, v15}, Ll3/t;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    invoke-virtual {v9, v5}, Ll3/d;->g(Ll3/t;)I

    move-result v5

    :try_start_1
    invoke-virtual {v9, v12}, Ll3/d;->j(Ll3/m0;)I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v9, v6}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v9, v7}, Ll3/d;->f(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v9, v5}, Ll3/d;->f(I)V

    invoke-virtual {v9, v14}, Ll3/d;->j(Ll3/m0;)I

    move-result v5

    :try_start_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v10, v6

    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v9, v5}, Ll3/d;->f(I)V

    goto :goto_6

    :catchall_0
    move-exception v0

    invoke-virtual {v9, v5}, Ll3/d;->f(I)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {v9, v7}, Ll3/d;->f(I)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    invoke-virtual {v9, v5}, Ll3/d;->f(I)V

    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v9, v13}, Ll3/d;->f(I)V

    throw v0

    :cond_a
    invoke-virtual {v9, v14}, Ll3/d;->j(Ll3/m0;)I

    move-result v4

    :try_start_6
    invoke-virtual {v9, v8}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-virtual {v9, v4}, Ll3/d;->f(I)V

    :goto_6
    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v9}, Ll3/d;->k()Ll3/g;

    move-result-object v4

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v5, 0x8

    int-to-float v5, v5

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v16, v5

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "emailSuggestionUpdateTag"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, -0x548d6062

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/e;

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    iget-object v12, v6, Lg00/e;->d:Ll3/v0;

    const/16 v25, 0x0

    const v26, 0xff7fff

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x3

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v24

    const/16 v27, 0x0

    const v28, 0x1fffc

    move-object/from16 v25, v3

    move-object v3, v4

    move-object v4, v5

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x30

    invoke-static/range {v3 .. v28}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_7
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lj21/d;

    const/16 v5, 0x14

    invoke-direct {v4, v0, v1, v2, v5}, Lj21/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void

    :catchall_4
    move-exception v0

    invoke-virtual {v9, v4}, Ll3/d;->f(I)V

    throw v0
.end method

.method public static final f0(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final g(ILandroidx/compose/ui/Modifier;Lbm/t;FLl0/k1;Lb2/g;Lh0/o1;ZLx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move-object/from16 v2, p2

    move/from16 v13, p10

    move-object/from16 v10, p9

    check-cast v10, Lp1/q;

    const v0, -0x7dbdf67

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v13, 0xe

    if-nez v0, :cond_1

    move/from16 v0, p0

    invoke-virtual {v10, v0}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_1
    move/from16 v0, p0

    move v3, v13

    :goto_1
    and-int/lit8 v4, v13, 0x70

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_3
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v5, v13, 0x380

    if-nez v5, :cond_5

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_4

    :cond_4
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v3, v5

    :cond_5
    or-int/lit16 v5, v3, 0xc00

    and-int/lit8 v6, p11, 0x10

    const v7, 0xe000

    if-eqz v6, :cond_7

    or-int/lit16 v5, v3, 0x6c00

    :cond_6
    move/from16 v3, p3

    goto :goto_6

    :cond_7
    and-int v3, v13, v7

    if-nez v3, :cond_6

    move/from16 v3, p3

    invoke-virtual {v10, v3}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v5, v8

    :goto_6
    and-int/lit8 v8, p11, 0x20

    const/high16 v9, 0x30000

    if-eqz v8, :cond_a

    or-int/2addr v5, v9

    :cond_9
    move-object/from16 v11, p4

    goto :goto_8

    :cond_a
    const/high16 v11, 0x70000

    and-int/2addr v11, v13

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/high16 v12, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v12, 0x10000

    :goto_7
    or-int/2addr v5, v12

    :goto_8
    and-int/lit8 v12, p11, 0x40

    if-eqz v12, :cond_d

    const/high16 v14, 0x180000

    or-int/2addr v5, v14

    :cond_c
    move-object/from16 v14, p5

    goto :goto_a

    :cond_d
    const/high16 v14, 0x380000

    and-int/2addr v14, v13

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-virtual {v10, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v15, 0x80000

    :goto_9
    or-int/2addr v5, v15

    :goto_a
    const/high16 v15, 0x1c00000

    and-int v16, v13, v15

    if-nez v16, :cond_f

    const/high16 v16, 0x400000

    or-int v5, v5, v16

    :cond_f
    const/high16 v16, 0x36000000

    or-int v5, v5, v16

    const v16, 0x5b6db6db

    move/from16 p9, v7

    and-int v7, v5, v16

    move/from16 v16, v9

    const v9, 0x12492492

    if-ne v7, v9, :cond_11

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object v5, v11

    move-object v6, v14

    :goto_b
    move v4, v3

    goto/16 :goto_18

    :cond_11
    :goto_c
    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v7, v13, 0x1

    const v9, -0x1c00001

    if-eqz v7, :cond_13

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_12

    goto :goto_d

    :cond_12
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int v1, v5, v9

    move-object/from16 v4, p6

    move/from16 v6, p7

    move-object v5, v11

    move-object v7, v14

    move/from16 v18, v15

    goto/16 :goto_17

    :cond_13
    :goto_d
    const/4 v7, 0x0

    if-eqz v6, :cond_14

    int-to-float v3, v7

    :cond_14
    if-eqz v8, :cond_15

    int-to-float v6, v7

    new-instance v8, Ll0/l1;

    invoke-direct {v8, v6, v6, v6, v6}, Ll0/l1;-><init>(FFFF)V

    goto :goto_e

    :cond_15
    move-object v8, v11

    :goto_e
    if-eqz v12, :cond_16

    sget-object v6, Lb2/e;->K:Lb2/l;

    goto :goto_f

    :cond_16
    move-object v6, v14

    :goto_f
    sget-object v11, Ly3/m;->w:Ly3/m;

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v11

    const v12, 0x7e1a6bf

    invoke-virtual {v10, v12}, Lp1/q;->f0(I)V

    invoke-static {v10}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v12

    sget-object v14, Lx03/k;->a:Ld0/i1;

    move/from16 v17, v9

    const v9, -0x2e42a570

    invoke-virtual {v10, v9}, Lp1/q;->f0(I)V

    iget-object v9, v2, Lbm/t;->a:Ln0/u;

    move/from16 v18, v15

    const-string v15, "lazyListState"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v15, -0x25b8e9c2

    invoke-virtual {v10, v15}, Lp1/q;->f0(I)V

    const v15, -0x3ea261cf

    invoke-virtual {v10, v15}, Lp1/q;->f0(I)V

    const v15, -0x384098

    invoke-virtual {v10, v15}, Lp1/q;->f0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    sget-object v1, Lx03/d;->w:Lx03/d;

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v15, v15, v19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez v15, :cond_18

    if-ne v7, v0, :cond_17

    goto :goto_11

    :cond_17
    :goto_10
    const/4 v1, 0x0

    goto :goto_12

    :cond_18
    :goto_11
    new-instance v7, Lx03/b;

    invoke-direct {v7, v9, v1}, Lx03/b;-><init>(Ln0/u;Lc93/m;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :goto_12
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    check-cast v7, Lx03/b;

    sget-object v9, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/c;

    invoke-interface {v9, v11}, Ly3/c;->F(F)I

    move-result v9

    iget-object v11, v7, Lx03/b;->c:Lp1/k1;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v11, v9}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const v1, -0x25b8e61d

    invoke-virtual {v10, v1}, Lp1/q;->f0(I)V

    sget-object v1, Lbm/l;->w:Lbm/l;

    filled-new-array {v7, v12, v14, v1}, [Ljava/lang/Object;

    move-result-object v1

    const v9, -0x383cc2

    invoke-virtual {v10, v9}, Lp1/q;->f0(I)V

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_13
    const/4 v15, 0x4

    if-ge v9, v15, :cond_19

    aget-object v15, v1, v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v11, v15

    goto :goto_13

    :cond_19
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v11, :cond_1b

    if-ne v1, v0, :cond_1a

    goto :goto_15

    :cond_1a
    :goto_14
    const/4 v0, 0x0

    goto :goto_16

    :cond_1b
    :goto_15
    new-instance v1, Lx03/i;

    invoke-direct {v1, v7, v12, v14}, Lx03/i;-><init>(Lx03/b;Ld0/x;Ld0/l;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_14

    :goto_16
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    check-cast v1, Lx03/i;

    invoke-static {v10, v0, v0, v0, v0}, Lb9/y;->B(Lp1/q;ZZZZ)V

    and-int v0, v5, v17

    const/4 v5, 0x1

    move-object v4, v1

    move-object v7, v6

    move v1, v0

    move v6, v5

    move-object v5, v8

    :goto_17
    invoke-virtual {v10}, Lp1/q;->r()V

    and-int/lit8 v0, v1, 0xe

    or-int v0, v0, v16

    and-int/lit8 v8, v1, 0x70

    or-int/2addr v0, v8

    and-int/lit16 v8, v1, 0x380

    or-int/2addr v0, v8

    and-int/lit16 v8, v1, 0x1c00

    or-int/2addr v0, v8

    and-int v8, v1, p9

    or-int/2addr v0, v8

    shr-int/lit8 v8, v1, 0x3

    and-int v8, v8, v18

    or-int/2addr v0, v8

    shl-int/lit8 v8, v1, 0x9

    const/high16 v9, 0xe000000

    and-int/2addr v8, v9

    or-int/2addr v0, v8

    const/high16 v8, 0x70000000

    and-int/2addr v8, v1

    or-int v11, v0, v8

    shr-int/lit8 v0, v1, 0x12

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v12, v0, 0x180

    const/4 v8, 0x0

    move/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p8

    invoke-static/range {v0 .. v12}, Lse/b;->m(ILandroidx/compose/ui/Modifier;Lbm/t;FLh0/o1;Ll0/k1;ZLb2/g;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move v8, v6

    move-object v6, v7

    move-object v7, v4

    goto/16 :goto_b

    :goto_18
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-nez v12, :cond_1c

    return-void

    :cond_1c
    new-instance v0, Lbm/b;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v9, p8

    move/from16 v11, p11

    move v10, v13

    invoke-direct/range {v0 .. v11}, Lbm/b;-><init>(ILandroidx/compose/ui/Modifier;Lbm/t;FLl0/k1;Lb2/g;Lh0/o1;ZLx1/b;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final h(Lcom/amplitude/android/engagement/types/ImageBlock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v3, -0x4c36ebda

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x70

    if-nez v5, :cond_3

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v3, v3, 0x5b

    const/16 v5, 0x12

    if-ne v3, v5, :cond_5

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v11}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_5
    :goto_3
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_6

    new-instance v5, Lzt/q;

    invoke-direct {v5, v3}, Lzt/q;-><init>(Landroid/content/Context;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ldh/s;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, Lbh/b;

    invoke-static {v6}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v14

    invoke-static {v7}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v15

    invoke-static {v8}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v16

    invoke-static {v9}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v17

    invoke-static {v10}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v18

    invoke-direct/range {v13 .. v18}, Lbh/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->e()Lbh/j;

    move-result-object v5

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lbh/e;

    new-instance v6, Lmh/h;

    invoke-direct {v6, v3}, Lmh/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ImageBlock;->getMeta()Lcom/amplitude/android/engagement/types/ImageMeta;

    move-result-object v3

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/ImageMeta;->getSrc()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v6, Lmh/h;->c:Ljava/lang/Object;

    invoke-virtual {v6}, Lmh/h;->b()V

    invoke-virtual {v6}, Lmh/h;->a()Lmh/j;

    move-result-object v3

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ImageBlock;->getMeta()Lcom/amplitude/android/engagement/types/ImageMeta;

    move-result-object v6

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/ImageMeta;->getFilename()Ljava/lang/String;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v8, Lqj/b;

    const/4 v14, 0x0

    invoke-direct {v8, v0, v14}, Lqj/b;-><init>(Lcom/amplitude/android/engagement/types/ImageBlock;I)V

    const v9, -0x2fc00622

    invoke-static {v9, v11, v8}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    new-instance v9, Lqj/b;

    const/4 v10, 0x1

    invoke-direct {v9, v0, v10}, Lqj/b;-><init>(Lcom/amplitude/android/engagement/types/ImageBlock;I)V

    const v12, 0x164fb444

    invoke-static {v12, v11, v9}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    new-instance v12, Lqj/b;

    invoke-direct {v12, v0, v4}, Lqj/b;-><init>(Lcom/amplitude/android/engagement/types/ImageBlock;I)V

    const v4, -0x2ed5ae98

    invoke-static {v4, v11, v12}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const v12, -0x5c193b5f

    invoke-virtual {v11, v12}, Lp1/q;->f0(I)V

    sget-object v12, Lb2/e;->E:Lb2/m;

    sget-object v13, Lch/k;->b:Lqt/e;

    new-instance v15, Lch/l;

    invoke-direct {v15, v3, v13, v5}, Lch/l;-><init>(Ljava/lang/Object;Lqt/e;Lbh/e;)V

    sget-object v3, Lch/v;->b:Lnh/e;

    new-instance v3, Lch/t;

    invoke-direct {v3, v8, v9, v4, v14}, Lch/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v4, Lx1/b;

    const v5, 0x2cbfdce0

    invoke-direct {v4, v3, v10, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v8, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v4

    move-object v4, v6

    sget-object v6, Lcoil/compose/AsyncImagePainter;->T:La11/g;

    move-object v5, v7

    const/4 v7, 0x0

    sget-object v9, Ly2/j;->b:Ly2/b1;

    move-object v3, v15

    invoke-static/range {v3 .. v13}, Lds/p;->n(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-nez v3, :cond_7

    return-void

    :cond_7
    new-instance v4, Lc4/i;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v1, v2, v5}, Lc4/i;-><init>(Lcom/amplitude/android/engagement/types/ContentBlock;Landroidx/compose/ui/Modifier;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final i(Lh00/j;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x30c11939

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    or-int/lit8 v0, v0, 0x30

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x100

    goto :goto_1

    :cond_1
    const/16 v2, 0x80

    :goto_1
    or-int/2addr v0, v2

    and-int/lit16 v0, v0, 0x93

    const/16 v2, 0x92

    if-ne v0, v2, :cond_3

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v2, p1

    goto/16 :goto_5

    :cond_3
    :goto_2
    iget-boolean v0, v1, Lh00/j;->d:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    sget v0, Lg1/g0;->a:F

    :goto_3
    move v4, v0

    goto :goto_4

    :cond_4
    int-to-float v0, v2

    goto :goto_3

    :goto_4
    const/16 v8, 0x180

    const/16 v9, 0xa

    const/4 v5, 0x0

    const-string v6, "LinkAppBarElevation"

    move-object v7, v13

    invoke-static/range {v4 .. v9}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    const v4, -0x1a6f7841

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v13, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    iget-wide v6, v4, Lg00/b;->b:J

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v8, -0x487d24cf

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v9, v8, :cond_6

    :cond_5
    new-instance v9, Lb;

    const/4 v8, 0x4

    invoke-direct {v9, v0, v8}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-static {v4, v9}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v0, Lb30/w2;

    const/16 v2, 0xe

    invoke-direct {v0, v2, v1, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x7c96c97d

    invoke-static {v2, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x180000

    const/16 v15, 0x3a

    move-object v0, v5

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v0

    :goto_5
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_7

    new-instance v0, La01/d;

    const/16 v5, 0x14

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final j(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x108ab8ed

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    or-int/lit8 p2, p2, 0x30

    and-int/lit8 p2, p2, 0x13

    const/16 v0, 0x12

    if-ne p2, v0, :cond_2

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_2
    :goto_1
    if-eqz p0, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    :goto_2
    move v0, p1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const/16 v5, 0xc00

    const/16 v6, 0x16

    const/4 v1, 0x0

    const-string v2, "titleAlpha"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v0, Lb2/e;->E:Lb2/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_4

    invoke-virtual {v4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v4, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2, v4, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x7f08085e

    invoke-static {p1, v4, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const p1, 0x7f14102c

    invoke-static {v4, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    const/16 v9, 0x7c

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v7

    const/4 p1, 0x1

    invoke-virtual {v4, p1}, Lp1/q;->q(Z)V

    move-object p1, p2

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lb30/t2;

    const/4 v1, 0x5

    invoke-direct {v0, p0, p1, p3, v1}, Lb30/t2;-><init>(ZLjava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final k(Lk00/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x7894aa9c

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x2

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v4, v6

    and-int/lit8 v4, v4, 0x13

    const/16 v6, 0x12

    if-ne v4, v6, :cond_3

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget v7, Lg00/g;->e:F

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v6, v3, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v8, v3, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v3, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v3, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v3, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v8, v3, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v3, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v0}, Lk00/a;->getText()Lzy/c;

    move-result-object v6

    invoke-interface {v6, v4}, Lzy/c;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const v6, -0x548d6062

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/e;

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    iget-object v6, v6, Lg00/e;->b:Ll3/v0;

    invoke-interface {v0}, Lk00/a;->isDestructive()Z

    move-result v8

    const v9, -0x1a6f7841

    if-eqz v8, :cond_7

    const v8, 0x4ec325b0

    invoke-virtual {v3, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v3, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/b;

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    iget-wide v8, v8, Lg00/b;->r:J

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    const v8, 0x4ec42931

    invoke-virtual {v3, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v3, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/b;

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    iget-wide v8, v8, Lg00/b;->m:J

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    :goto_4
    sget-object v7, Lb2/t;->w:Lb2/t;

    sget v10, Lg00/g;->g:F

    const/4 v11, 0x0

    invoke-static {v7, v10, v11, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v26, 0x0

    const v27, 0xfff8

    move-object/from16 v24, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v23, v6

    move-wide v5, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x30

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v24

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_8

    new-instance v4, Lj21/d;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v1, v2, v5}, Lj21/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    const-string v0, "items"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemPress"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x2d2d8446

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v6, 0x93

    const/16 v9, 0x92

    if-ne v7, v9, :cond_8

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_4
    move-object v1, v5

    goto/16 :goto_9

    :cond_8
    :goto_5
    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_9

    move-object v5, v7

    :cond_9
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v9, -0x1a6f7841

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v0, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg00/b;

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    iget-wide v11, v9, Lg00/b;->c:J

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v11, v12, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v9, 0xa

    int-to-float v9, v9

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v11, v9, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v11, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v11, v0, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0xd307778

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lk00/a;

    invoke-interface {v9}, Lk00/a;->a()Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v11}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v13, -0xd306031

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    and-int/lit16 v13, v6, 0x380

    if-ne v13, v8, :cond_d

    move v13, v12

    goto :goto_8

    :cond_d
    move v13, v10

    :goto_8
    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_e

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v14, v13, :cond_f

    :cond_e
    new-instance v14, Lj11/q;

    const/16 v13, 0x10

    invoke-direct {v14, v13, v3, v9}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v14, Lc93/a;

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    const/4 v13, 0x7

    const/4 v15, 0x0

    invoke-static {v11, v10, v15, v14, v13}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v9, v11, v0, v10}, Lse/b;->k(Lk00/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_10
    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, La81/k;

    const/4 v6, 0x4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La81/k;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final m(ILandroidx/compose/ui/Modifier;Lbm/t;FLh0/o1;Ll0/k1;ZLb2/g;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 27

    move/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v11, p2

    move/from16 v12, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v3, p9

    move/from16 v13, p11

    move/from16 v14, p12

    const-string v0, "modifier"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flingBehavior"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentPadding"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v0, -0x3fe8c63b

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v13, 0xe

    const/4 v4, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v13

    goto :goto_1

    :cond_1
    move v0, v13

    :goto_1
    and-int/lit8 v5, v13, 0x70

    if-nez v5, :cond_3

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v13, 0x380

    if-nez v5, :cond_5

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v13, 0x1c00

    const/4 v15, 0x0

    if-nez v5, :cond_7

    invoke-virtual {v9, v15}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    const v5, 0xe000

    and-int/2addr v5, v13

    if-nez v5, :cond_9

    invoke-virtual {v9, v12}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v0, v5

    :cond_9
    const/high16 v16, 0x70000

    and-int v5, v13, v16

    if-nez v5, :cond_b

    invoke-virtual {v9, v15}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v5, 0x10000

    :goto_6
    or-int/2addr v0, v5

    :cond_b
    const/high16 v17, 0x380000

    and-int v5, v13, v17

    if-nez v5, :cond_d

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v5, 0x80000

    :goto_7
    or-int/2addr v0, v5

    :cond_d
    const/high16 v18, 0x1c00000

    and-int v5, v13, v18

    const/4 v2, 0x0

    if-nez v5, :cond_f

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v5, 0x400000

    :goto_8
    or-int/2addr v0, v5

    :cond_f
    const/high16 v5, 0xe000000

    and-int/2addr v5, v13

    if-nez v5, :cond_11

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v5, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v5, 0x2000000

    :goto_9
    or-int/2addr v0, v5

    :cond_11
    const/high16 v5, 0x70000000

    and-int/2addr v5, v13

    if-nez v5, :cond_13

    move/from16 v5, p6

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_12

    const/high16 v20, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v20, 0x10000000

    :goto_a
    or-int v0, v0, v20

    goto :goto_b

    :cond_13
    move/from16 v5, p6

    :goto_b
    and-int/lit8 v20, v14, 0xe

    move-object/from16 v10, p7

    if-nez v20, :cond_15

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_14

    move/from16 v19, v4

    goto :goto_c

    :cond_14
    const/16 v19, 0x2

    :goto_c
    or-int v4, v14, v19

    goto :goto_d

    :cond_15
    move v4, v14

    :goto_d
    or-int/lit8 v4, v4, 0x30

    and-int/lit16 v2, v14, 0x380

    if-nez v2, :cond_17

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    const/16 v20, 0x100

    goto :goto_e

    :cond_16
    const/16 v20, 0x80

    :goto_e
    or-int v4, v4, v20

    :cond_17
    const v2, 0x5b6db6db

    and-int/2addr v2, v0

    const v15, 0x12492492

    if-ne v2, v15, :cond_19

    and-int/lit16 v2, v4, 0x2db

    const/16 v15, 0x92

    if-ne v2, v15, :cond_19

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_f

    :cond_18
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v8, v9

    move-object/from16 v9, p8

    goto/16 :goto_29

    :cond_19
    :goto_f
    sget-object v15, Lb2/e;->N:Lb2/k;

    if-ltz v1, :cond_2c

    shr-int/lit8 v2, v0, 0x12

    move/from16 v20, v0

    const v0, 0x44faf204

    invoke-virtual {v9, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move/from16 v22, v2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v21, :cond_1b

    if-ne v0, v2, :cond_1a

    goto :goto_11

    :cond_1a
    move/from16 v21, v4

    :goto_10
    const/4 v4, 0x0

    goto :goto_12

    :cond_1b
    :goto_11
    new-instance v0, Lav/b;

    move/from16 v21, v4

    const/4 v4, 0x2

    invoke-direct {v0, v7, v4}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :goto_12
    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    check-cast v0, Lc93/a;

    iget-object v4, v11, Lbm/t;->g:Lp1/k1;

    invoke-virtual {v4, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    shr-int/lit8 v23, v20, 0x6

    const v5, 0x1e7b2b64

    invoke-virtual {v9, v5}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1d

    if-ne v5, v2, :cond_1c

    goto :goto_14

    :cond_1c
    :goto_13
    const/4 v4, 0x0

    goto :goto_15

    :cond_1d
    :goto_14
    new-instance v5, Lbm/c;

    const/4 v4, 0x0

    invoke-direct {v5, v11, v1, v4}, Lbm/c;-><init>(Lbm/t;ILq83/d;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_13

    :goto_15
    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    check-cast v5, Lc93/m;

    invoke-static {v9, v5, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x44faf204

    invoke-virtual {v9, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1f

    if-ne v4, v2, :cond_1e

    goto :goto_17

    :cond_1e
    :goto_16
    const/4 v0, 0x0

    goto :goto_18

    :cond_1f
    :goto_17
    new-instance v4, Lbm/c;

    const/4 v0, 0x1

    const/4 v5, 0x0

    invoke-direct {v4, v11, v5, v0}, Lbm/c;-><init>(Lbm/t;Lq83/d;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_16

    :goto_18
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    check-cast v4, Lc93/m;

    invoke-static {v9, v4, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x44faf204

    invoke-virtual {v9, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_21

    if-ne v4, v2, :cond_20

    goto :goto_1a

    :cond_20
    :goto_19
    const/4 v0, 0x0

    goto :goto_1b

    :cond_21
    :goto_1a
    new-instance v4, Lbm/c;

    const/4 v0, 0x2

    const/4 v5, 0x0

    invoke-direct {v4, v11, v5, v0}, Lbm/c;-><init>(Lbm/t;Lq83/d;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_19

    :goto_1b
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    check-cast v4, Lc93/m;

    invoke-static {v9, v4, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    new-instance v4, Ly3/f;

    invoke-direct {v4, v12}, Ly3/f;-><init>(F)V

    new-instance v5, Ly3/f;

    invoke-direct {v5, v12}, Ly3/f;-><init>(F)V

    shr-int/lit8 v24, v20, 0x3

    const v1, 0x607fb4c4

    invoke-virtual {v9, v1}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    or-int v1, v1, v25

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_23

    if-ne v5, v2, :cond_22

    goto :goto_1d

    :cond_22
    :goto_1c
    const/4 v1, 0x0

    goto :goto_1e

    :cond_23
    :goto_1d
    new-instance v5, Lbm/h;

    const/4 v1, 0x0

    invoke-direct {v5, v0, v11, v12, v1}, Lbm/h;-><init>(Ly3/c;Lbm/t;FLq83/d;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1c

    :goto_1e
    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    check-cast v5, Lc93/m;

    invoke-static {v0, v11, v4, v5, v9}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    const v0, 0x44faf204

    invoke-virtual {v9, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_25

    if-ne v1, v2, :cond_24

    goto :goto_20

    :cond_24
    :goto_1f
    const/4 v4, 0x0

    goto :goto_21

    :cond_25
    :goto_20
    new-instance v1, Lbm/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1f

    :goto_21
    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object v4, v1

    check-cast v4, Lbm/n;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const v1, 0x44faf204

    invoke-virtual {v9, v1}, Lp1/q;->f0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_27

    if-ne v1, v2, :cond_26

    goto :goto_23

    :cond_26
    :goto_22
    const/4 v0, 0x0

    goto :goto_24

    :cond_27
    :goto_23
    new-instance v1, Lbm/a;

    const/4 v0, 0x1

    invoke-direct {v1, v0, v11}, Lbm/a;-><init>(ZLbm/t;)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_22

    :goto_24
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    check-cast v1, Lbm/a;

    const v0, -0x1e6bec54

    invoke-virtual {v9, v0}, Lp1/q;->f0(I)V

    iget-object v0, v11, Lbm/t;->a:Ln0/u;

    invoke-static {v12, v15}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v25

    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 p8, v0

    const/4 v0, 0x0

    filled-new-array {v5, v0, v1, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    const v5, -0x21de6e89

    invoke-virtual {v9, v5}, Lp1/q;->f0(I)V

    move-object/from16 v26, v0

    const/4 v5, 0x0

    const/16 v19, 0x0

    :goto_25
    const/4 v0, 0x5

    if-ge v5, v0, :cond_28

    aget-object v0, v26, v5

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int v19, v19, v0

    add-int/lit8 v5, v5, 0x1

    goto :goto_25

    :cond_28
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v19, :cond_2a

    if-ne v0, v2, :cond_29

    goto :goto_27

    :cond_29
    move-object/from16 v19, p8

    move/from16 v6, v20

    move/from16 v5, v21

    move/from16 v7, v22

    :goto_26
    const/4 v4, 0x0

    goto :goto_28

    :cond_2a
    :goto_27
    new-instance v0, Lbm/j;

    move-object/from16 v19, p8

    move-object v2, v1

    move/from16 v6, v20

    move/from16 v5, v21

    move/from16 v7, v22

    move/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lbm/j;-><init>(ILbm/a;Lx1/b;Lbm/n;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_26

    :goto_28
    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v1, v24, 0xe

    and-int/lit16 v2, v7, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v6, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0xf

    and-int v2, v2, v16

    or-int/2addr v1, v2

    and-int v2, v6, v17

    or-int/2addr v1, v2

    and-int v2, v23, v18

    or-int/2addr v1, v2

    const/4 v10, 0x0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v4, p7

    move-object v7, v0

    move-object v2, v8

    move-object v8, v9

    move-object/from16 v3, v25

    move-object/from16 v0, p1

    move v9, v1

    move-object/from16 v1, v19

    invoke-static/range {v0 .. v10}, Lkotlin/jvm/internal/j;->e(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x0

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    move-object v9, v15

    :goto_29
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-nez v15, :cond_2b

    return-void

    :cond_2b
    new-instance v0, Lbm/k;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object v3, v11

    move v4, v12

    move v11, v13

    move v12, v14

    invoke-direct/range {v0 .. v12}, Lbm/k;-><init>(ILandroidx/compose/ui/Modifier;Lbm/t;FLh0/o1;Ll0/k1;ZLb2/g;Lb2/f;Lx1/b;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "pageCount must be >= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final n(Lg40/z1;Lg40/m3;Ln00/c;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v0, 0x65faff6b

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    and-int/lit16 v0, v0, 0x93

    const/16 v3, 0x92

    if-ne v0, v3, :cond_4

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_4
    :goto_3
    const/4 v10, 0x0

    new-array v3, v10, [Ljava/lang/Object;

    const v0, -0x46c8bc57

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v0, v11, :cond_5

    new-instance v0, Lmq2/a;

    const/16 v4, 0xe

    invoke-direct {v0, v4}, Lmq2/a;-><init>(I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, v0

    check-cast v5, Lc93/a;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    new-array v3, v10, [Ljava/lang/Object;

    const v4, -0x46c8b417

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_6

    new-instance v4, Lmq2/a;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Lmq2/a;-><init>(I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v5, v4

    check-cast v5, Lc93/a;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lp1/c1;

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v7, v6, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v6, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v7, v6, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v6, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Ld40/m;->w:Ld40/m;

    move-object v1, v0

    new-instance v0, Lg1/e0;

    move-object v3, p0

    move-object v5, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lg1/e0;-><init>(Lp1/c1;Ln00/c;Lg40/z1;Lp1/c1;Lg40/m3;)V

    const v1, 0x174daab6

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v7, v0, v6, v1, v10}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    iget-object v0, p2, Ln00/c;->g:Lzy/c;

    const/4 v12, 0x1

    if-eqz v0, :cond_a

    move v1, v12

    goto :goto_5

    :cond_a
    move v1, v10

    :goto_5
    new-instance v0, Ln00/a;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2}, Ln00/a;-><init>(Ln00/c;I)V

    const v2, 0x218ba339

    invoke-static {v2, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v8, 0x180006

    const/16 v9, 0x1e

    move-object v7, v6

    move-object v6, v0

    sget-object v0, Ll0/z;->a:Ll0/z;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    invoke-virtual {v6, v12}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Ljp1/k;

    const/16 v5, 0x9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final o(Lg40/m3;Lg40/z1;Lg40/m3;Ln00/c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v4, p3

    move-object/from16 v3, p4

    move-object/from16 v6, p5

    const-string v0, "emailController"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumberController"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameController"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpScreenState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v4, Ln00/c;->e:Ln00/d;

    const-string v2, "onSignUpClick"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onSuggestedEmailClick"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v2, -0x640559b6

    invoke-virtual {v13, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p7, v2

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v2, v5

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x800

    goto :goto_3

    :cond_3
    const/16 v5, 0x400

    :goto_3
    or-int/2addr v2, v5

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x4000

    goto :goto_4

    :cond_4
    const/16 v5, 0x2000

    :goto_4
    or-int/2addr v2, v5

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/high16 v5, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v5, 0x10000

    :goto_5
    or-int/2addr v2, v5

    const v5, 0x12493

    and-int/2addr v2, v5

    const v5, 0x12492

    if-ne v2, v5, :cond_7

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v13}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_7
    :goto_6
    sget-object v2, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v13, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/x2;

    sget-object v5, Ln00/d;->y:Ln00/d;

    const/4 v7, 0x0

    if-ne v0, v5, :cond_8

    const/4 v5, 0x1

    goto :goto_7

    :cond_8
    move v5, v7

    :goto_7
    new-array v10, v7, [Ljava/lang/Object;

    const v11, -0x497ddfd0

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v11, v12, :cond_9

    new-instance v11, Lmq2/a;

    const/16 v14, 0x10

    invoke-direct {v11, v14}, Lmq2/a;-><init>(I)V

    invoke-virtual {v13, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v11, Lc93/a;

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    const/16 v14, 0xc00

    const/4 v15, 0x6

    move-object/from16 v16, v12

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v7, v16

    invoke-static/range {v10 .. v15}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lp1/c1;

    const v11, -0x497dd8cc

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v7, :cond_a

    invoke-static {v13}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v11

    :cond_a
    check-cast v11, Lg2/s;

    const/4 v12, 0x0

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    const v12, -0x497dd378

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    const/4 v14, 0x0

    if-nez v12, :cond_d

    sget-object v12, Ln00/d;->w:Ln00/d;

    if-ne v0, v12, :cond_d

    const v0, -0x497dc4d7

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v0, :cond_b

    if-ne v12, v7, :cond_c

    :cond_b
    new-instance v12, Lh20/i0;

    const/16 v0, 0x1c

    invoke-direct {v12, v11, v10, v14, v0}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v12, Lc93/m;

    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    invoke-static {v13, v12, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    new-instance v0, Ln00/b;

    move v7, v5

    move-object v5, v1

    move-object v1, v4

    move-object v4, v2

    move v2, v7

    move-object v7, v6

    move-object v6, v11

    invoke-direct/range {v0 .. v9}, Ln00/b;-><init>(Ln00/c;ZLc93/a;Lb3/x2;Lg40/m3;Lg2/s;Lkotlin/jvm/functions/Function1;Lg40/z1;Lg40/m3;)V

    const v1, 0x2d6a95c0

    invoke-static {v1, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v14, v0, v13, v1}, Lvd/f;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Lat2/b0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lat2/b0;-><init>(Lg40/m3;Lg40/z1;Lg40/m3;Ln00/c;Lc93/a;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final p(ZLn00/c;Lc93/a;Lb3/x2;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p4

    check-cast v6, Lp1/q;

    const p4, 0x39b316f4

    invoke-virtual {v6, p4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->h(Z)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x10

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr p4, v0

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/16 v2, 0x100

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p4, v0

    invoke-virtual {v6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/16 v3, 0x800

    if-eqz v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    const/16 v0, 0x400

    :goto_3
    or-int/2addr p4, v0

    and-int/lit16 v0, p4, 0x493

    const/16 v4, 0x492

    if-ne v0, v4, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_5
    :goto_4
    const/4 v0, 0x0

    int-to-float v1, v1

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x1

    invoke-static {v4, v0, v1, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p0, :cond_6

    const v4, -0x7e7636a0

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    const v4, 0x7f140feb

    invoke-static {v6, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    const v4, -0x7e74c053

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    const v4, 0x7f141034

    invoke-static {v6, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_5
    iget-boolean v7, p1, Ln00/c;->f:Z

    if-eqz v7, :cond_7

    sget-object v7, Lh00/o0;->z:Lh00/o0;

    goto :goto_6

    :cond_7
    iget-boolean v7, p1, Ln00/c;->b:Z

    if-eqz v7, :cond_8

    sget-object v7, Lh00/o0;->x:Lh00/o0;

    goto :goto_6

    :cond_8
    sget-object v7, Lh00/o0;->y:Lh00/o0;

    :goto_6
    const v8, 0x6f88c8f5

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    and-int/lit16 v8, p4, 0x380

    if-ne v8, v2, :cond_9

    move v2, v5

    goto :goto_7

    :cond_9
    move v2, v1

    :goto_7
    and-int/lit16 p4, p4, 0x1c00

    if-ne p4, v3, :cond_a

    goto :goto_8

    :cond_a
    move v5, v1

    :goto_8
    or-int p4, v2, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p4, :cond_b

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v2, p4, :cond_c

    :cond_b
    new-instance v2, Lb30/c3;

    invoke-direct {v2, p2, p3}, Lb30/c3;-><init>(Lc93/a;Lb3/x2;)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v3, v2

    check-cast v3, Lc93/a;

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    move-object v2, v7

    const/4 v7, 0x6

    const/16 v8, 0xf0

    move-object v1, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lh00/n0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lh00/o0;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_d

    new-instance v0, Lay/a0;

    const/4 v6, 0x5

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lay/a0;-><init>(ZLjava/lang/Object;Lc93/a;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final q(Ll0/y;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, -0x1b619ed8

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x1

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v22, v1

    goto/16 :goto_1

    :cond_1
    :goto_0
    const v2, 0x7f14103d

    invoke-static {v1, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "signUpHeaderTag"

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x4

    int-to-float v5, v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v3, v6, v5, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v6

    iget-object v6, v6, Lg00/e;->a:Ll3/v0;

    invoke-static {v1}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    iget-wide v7, v7, Lg00/b;->m:J

    new-instance v13, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v13, v9}, Lw3/k;-><init>(I)V

    const/16 v24, 0x0

    const v25, 0xfdf8

    move v10, v5

    move-object/from16 v21, v6

    const-wide/16 v5, 0x0

    move-object/from16 v22, v1

    move-object v1, v2

    move-object v2, v3

    move-wide/from16 v29, v7

    move-object v8, v4

    move-wide/from16 v3, v29

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v14, v10

    move-object v15, v11

    const-wide/16 v10, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x30

    move-object/from16 v0, v28

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v22

    const v2, 0x7f14103f

    invoke-static {v1, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v0, 0x1e

    int-to-float v10, v0

    const/4 v11, 0x5

    const/4 v7, 0x0

    const/4 v9, 0x0

    move/from16 v8, v27

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v3

    iget-object v3, v3, Lg00/e;->b:Ll3/v0;

    invoke-static {v1}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v4

    iget-wide v4, v4, Lg00/b;->o:J

    new-instance v13, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v13, v12}, Lw3/k;-><init>(I)V

    move-object/from16 v21, v3

    move-wide v3, v4

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_1
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lk71/i;

    const/16 v2, 0xe

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method public static final r(Ln00/k;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p0

    move/from16 v8, p2

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    const v0, -0x626cc807

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v8

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_2
    :goto_1
    iget-object v0, v2, Ln00/k;->O:Lec3/r1;

    const/4 v9, 0x0

    invoke-static {v0, v15, v9}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    iget-object v10, v2, Ln00/k;->K:Lg40/f3;

    move-object v11, v10

    iget-object v10, v2, Ln00/k;->L:Lg40/z1;

    move-object v12, v11

    iget-object v11, v2, Ln00/k;->M:Lg40/f3;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ln00/c;

    const v0, -0x66f91f27

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_3

    if-ne v1, v14, :cond_4

    :cond_3
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x19

    const/4 v1, 0x0

    const-class v3, Ln00/k;

    const-string v4, "onSignUpClick"

    const-string v5, "onSignUpClick()V"

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_4
    check-cast v1, Lj93/g;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    const v0, -0x66f917df

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    if-ne v1, v14, :cond_6

    :cond_5
    new-instance v0, Lm7/l0;

    const/4 v6, 0x0

    const/16 v7, 0x17

    const/4 v1, 0x1

    const-class v3, Ln00/k;

    const-string v4, "onSuggestedEmailClick"

    const-string v5, "onSuggestedEmailClick(Ljava/lang/String;)V"

    invoke-direct/range {v0 .. v7}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_6
    check-cast v1, Lj93/g;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object v14, v1

    check-cast v14, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, v16

    const/16 v16, 0x248

    move-object v9, v12

    move-object v12, v13

    move-object v13, v1

    invoke-static/range {v9 .. v16}, Lse/b;->o(Lg40/m3;Lg40/z1;Lg40/m3;Ln00/c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Lmw1/a;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v8, v3}, Lmw1/a;-><init>(Landroidx/lifecycle/w1;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final s(ZLzy/b;Lg40/g3;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v5, p2

    move-object/from16 v8, p4

    move-object/from16 v10, p9

    move/from16 v11, p11

    const-string v0, "onChoiceSelected"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v0, 0x5a22b316

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    move/from16 v12, p0

    if-nez v0, :cond_1

    invoke-virtual {v9, v12}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v1, v11, 0x30

    if-nez v1, :cond_3

    move-object/from16 v1, p1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    goto :goto_3

    :cond_3
    move-object/from16 v1, p1

    :goto_3
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_6

    and-int/lit16 v2, v11, 0x200

    if-nez v2, :cond_4

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_4

    :cond_4
    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_5

    :cond_5
    const/16 v2, 0x80

    :goto_5
    or-int/2addr v0, v2

    :cond_6
    and-int/lit16 v2, v11, 0xc00

    move-object/from16 v4, p3

    if-nez v2, :cond_8

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x800

    goto :goto_6

    :cond_7
    const/16 v2, 0x400

    :goto_6
    or-int/2addr v0, v2

    :cond_8
    and-int/lit16 v2, v11, 0x6000

    if-nez v2, :cond_a

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/16 v2, 0x4000

    goto :goto_7

    :cond_9
    const/16 v2, 0x2000

    :goto_7
    or-int/2addr v0, v2

    :cond_a
    const/high16 v2, 0x30000

    and-int/2addr v2, v11

    move-wide/from16 v6, p5

    if-nez v2, :cond_c

    invoke-virtual {v9, v6, v7}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_b

    const/high16 v2, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v2, 0x10000

    :goto_8
    or-int/2addr v0, v2

    :cond_c
    const/high16 v13, 0x180000

    and-int v2, v11, v13

    if-nez v2, :cond_e

    move-wide/from16 v2, p7

    invoke-virtual {v9, v2, v3}, Lp1/q;->f(J)Z

    move-result v14

    if-eqz v14, :cond_d

    const/high16 v14, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v14, 0x80000

    :goto_9
    or-int/2addr v0, v14

    goto :goto_a

    :cond_e
    move-wide/from16 v2, p7

    :goto_a
    const/high16 v14, 0xc00000

    and-int/2addr v14, v11

    if-nez v14, :cond_10

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v14, 0x400000

    :goto_b
    or-int/2addr v0, v14

    :cond_10
    move v14, v0

    const v0, 0x492493

    and-int/2addr v0, v14

    const v15, 0x492492

    if-ne v0, v15, :cond_12

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v8, v9

    goto :goto_d

    :cond_12
    :goto_c
    new-instance v0, Lg40/k3;

    move-wide/from16 v16, v6

    move-wide v6, v2

    move-wide/from16 v2, v16

    invoke-direct/range {v0 .. v8}, Lg40/k3;-><init>(Lzy/b;JLjava/util/List;Lg40/g3;JLkotlin/jvm/functions/Function1;)V

    const v1, -0x7b8a9ef7

    invoke-static {v1, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    and-int/lit8 v0, v14, 0xe

    or-int/2addr v0, v13

    shr-int/lit8 v1, v14, 0x12

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    const/16 v10, 0x3c

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p9

    move-object v8, v9

    move v9, v0

    move v0, v12

    invoke-static/range {v0 .. v10}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_13

    new-instance v0, Lg40/h3;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v11}, Lg40/h3;-><init>(ZLzy/b;Lg40/g3;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLc93/a;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final t(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, 0x4100086b

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_5

    sget-object v1, Lc4/h;->b:Lc4/h;

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Ly2/r0;

    shr-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x180

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v2

    iget-wide v4, p2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p2, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v7, p2, Lp1/q;->S:Z

    if-eqz v7, :cond_6

    invoke-virtual {p2, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p2, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p2, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, p2, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v2, p2, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p2, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0, p1, p2, v3}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lc4/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lc4/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final u(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, 0x5c74dfd8

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0xe

    if-nez p2, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    or-int/lit8 p2, p2, 0x30

    and-int/lit8 v0, p2, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v1, p0

    goto/16 :goto_4

    :cond_3
    :goto_2
    const/high16 p1, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 v0, 0x64

    int-to-float v0, v0

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v0, Lb2/e;->E:Lb2/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    invoke-virtual {v7, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v7, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2, v7, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x7f080692

    invoke-static {p1, v7, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/16 p1, 0x18

    int-to-float p1, p1

    invoke-static {p1, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const p1, -0x1896950d

    invoke-virtual {v7, p1}, Lp1/q;->f0(I)V

    sget-object p1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v7, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luj/m;

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    iget-wide v3, p1, Luj/m;->p:J

    new-instance v6, Li2/p;

    const/4 p1, 0x5

    invoke-direct {v6, v3, v4, p1}, Li2/p;-><init>(JI)V

    shl-int/lit8 p1, p2, 0x3

    and-int/lit8 p1, p1, 0x70

    or-int/lit16 v8, p1, 0x188

    const/16 v9, 0x38

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 p0, 0x1

    invoke-virtual {v7, p0}, Lp1/q;->q(Z)V

    move-object p1, v10

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-nez p0, :cond_7

    return-void

    :cond_7
    new-instance p2, Loj/r;

    const/4 v0, 0x1

    invoke-direct {p2, v1, p1, p3, v0}, Loj/r;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static v(JJJJJJJJJJLandroidx/compose/runtime/Composer;II)Lg1/w1;
    .locals 21

    move-object/from16 v0, p20

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    move-object v3, v0

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->f()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p0

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_2

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    move-object v5, v0

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/c1;

    invoke-virtual {v6}, Lg1/c1;->e()J

    move-result-wide v6

    sget-object v8, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v5, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li2/x;

    iget-wide v8, v8, Li2/x;->a:J

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->i()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-static {v8, v9}, Li2/w0;->x(J)F

    goto :goto_1

    :cond_1
    invoke-static {v8, v9}, Li2/w0;->x(J)F

    :goto_1
    const v8, 0x3ec28f5c    # 0.38f

    invoke-static {v8, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->h()J

    move-result-wide v4

    invoke-static {v6, v7, v4, v5}, Li2/w0;->p(JJ)J

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p2

    :goto_2
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_3

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    move-object v7, v0

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/c1;

    invoke-virtual {v6}, Lg1/c1;->f()J

    move-result-wide v6

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p4

    :goto_3
    and-int/lit8 v8, v1, 0x8

    if-eqz v8, :cond_4

    const v8, 0x3e75c28f    # 0.24f

    invoke-static {v8, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v8

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p6

    :goto_4
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_5

    sget-object v10, Lg1/d1;->a:Lp1/u2;

    move-object v11, v0

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->e()J

    move-result-wide v10

    const v12, 0x3ea3d70a    # 0.32f

    invoke-static {v12, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p8

    :goto_5
    and-int/lit8 v12, v1, 0x20

    const v13, 0x3df5c28f    # 0.12f

    if-eqz v12, :cond_6

    invoke-static {v13, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v14

    goto :goto_6

    :cond_6
    move-wide/from16 v14, p10

    :goto_6
    and-int/lit8 v12, v1, 0x40

    const v13, 0x3f0a3d71    # 0.54f

    move-wide/from16 v16, v2

    if-eqz v12, :cond_7

    invoke-static {v6, v7, v0}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v2

    invoke-static {v13, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    goto :goto_7

    :cond_7
    move-wide/from16 v2, p12

    :goto_7
    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_8

    invoke-static {v13, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v12

    goto :goto_8

    :cond_8
    move-wide/from16 v12, p14

    :goto_8
    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_9

    const v0, 0x3df5c28f    # 0.12f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v18

    goto :goto_9

    :cond_9
    const v0, 0x3df5c28f    # 0.12f

    move-wide/from16 v18, p16

    :goto_9
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_a

    invoke-static {v0, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v0

    goto :goto_a

    :cond_a
    move-wide/from16 v0, p18

    :goto_a
    new-instance v20, Lg1/w1;

    move-wide/from16 p19, v0

    move-wide/from16 p13, v2

    move-wide/from16 p3, v4

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move-wide/from16 p9, v10

    move-wide/from16 p15, v12

    move-wide/from16 p11, v14

    move-wide/from16 p1, v16

    move-wide/from16 p17, v18

    move-object/from16 p0, v20

    invoke-direct/range {p0 .. p20}, Lg1/w1;-><init>(JJJJJJJJJJ)V

    move-object/from16 v0, p0

    return-object v0
.end method

.method public static w([BII)Lpe3/b;
    .locals 1

    new-instance v0, Lpe3/b;

    invoke-static {p0, p1, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-direct {v0, p0}, Lpe3/b;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public static final x(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;
    .locals 8

    const-string v0, "annotationClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbg/j;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v6

    new-instance v0, Lce/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0, p1}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v5

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    filled-new-array {p0}, [Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lm93/d;

    move-object v3, p0

    move-object v4, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lm93/d;-><init>(Ljava/lang/Class;Ljava/util/Map;Ll83/p;Ll83/p;Ljava/util/List;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic y(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, v1}, Lse/b;->x(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static z(I)Lse/a;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    new-instance p0, Lkr/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lkr/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Lkr/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method
