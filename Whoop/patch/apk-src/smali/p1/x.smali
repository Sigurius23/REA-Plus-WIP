.class public abstract Lp1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Lp1/i0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp1/x;->a:Ljava/lang/Object;

    new-instance v0, Lp1/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp1/x;->b:Lp1/i0;

    return-void
.end method

.method public static final A(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)Lp1/c1;
    .locals 3

    check-cast p0, Lp1/q;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lp1/c1;

    invoke-virtual {p0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lp1/q2;

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-direct {v2, p1, v0, v1, p2}, Lp1/q2;-><init>(Lc93/m;Lp1/c1;Lq83/d;I)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/m;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-static {p0, v2, p1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final B(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;I)Lp1/c1;
    .locals 2

    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p5, v0, :cond_0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p5

    invoke-virtual {p4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p5, Lp1/c1;

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p0, :cond_1

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lp1/q2;

    const/4 p0, 0x1

    const/4 v0, 0x0

    invoke-direct {v1, p3, p5, v0, p0}, Lp1/q2;-><init>(Lc93/m;Lp1/c1;Lq83/d;I)V

    invoke-virtual {p4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {p1, p2, v1, p4}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    return-object p5
.end method

.method public static final C(Ljava/lang/Object;[Ljava/lang/Object;Lc93/m;Lp1/q;)Lp1/c1;
    .locals 3

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lp1/c1;

    array-length p0, p1

    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lp1/r2;

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-direct {v2, p2, v0, v1, p1}, Lp1/r2;-><init>(Lc93/m;Lp1/c1;Lq83/d;I)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/m;

    invoke-static {p0, v2, p3}, Lp1/x;->j([Ljava/lang/Object;Lc93/m;Lp1/q;)V

    return-object v0
.end method

.method public static final D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lp1/t1;->b()Lp1/w2;

    move-result-object v0

    :cond_0
    check-cast v0, Lp1/w2;

    invoke-interface {v0, p0}, Lp1/w2;->a(Lp1/p1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final E(Landroidx/compose/runtime/Composer;)Lp1/o;
    .locals 7

    move-object v1, p0

    check-cast v1, Lp1/q;

    const/16 p0, 0xce

    sget-object v0, Lp1/r;->e:Lp1/e1;

    invoke-virtual {v1, p0, v0}, Lp1/q;->a0(ILp1/e1;)V

    iget-boolean p0, v1, Lp1/q;->S:Z

    if-eqz p0, :cond_0

    iget-object p0, v1, Lp1/q;->I:Lp1/i2;

    invoke-static {p0}, Lp1/i2;->y(Lp1/i2;)V

    :cond_0
    invoke-virtual {v1}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lp1/n;

    if-eqz v0, :cond_1

    check-cast p0, Lp1/n;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_2

    new-instance p0, Lp1/n;

    new-instance v0, Lp1/o;

    iget-wide v2, v1, Lp1/q;->T:J

    iget-boolean v4, v1, Lp1/q;->q:Z

    iget-boolean v5, v1, Lp1/q;->C:Z

    iget-object v6, v1, Lp1/q;->h:Lp1/w;

    iget-object v6, v6, Lp1/w;->T:Lbu/c;

    invoke-direct/range {v0 .. v6}, Lp1/o;-><init>(Lp1/q;JZZLbu/c;)V

    invoke-direct {p0, v0}, Lp1/n;-><init>(Lp1/o;)V

    invoke-virtual {v1, p0}, Lp1/q;->q0(Ljava/lang/Object;)V

    :cond_2
    iget-object p0, p0, Lp1/n;->w:Lp1/o;

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    iget-object v2, p0, Lp1/o;->f:Lp1/k1;

    invoke-virtual {v2, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static final F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;
    .locals 2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lp1/c1;

    invoke-interface {v0, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V
    .locals 1

    check-cast p0, Lp1/q;

    iget-boolean v0, p0, Lp1/q;->S:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    invoke-virtual {p0, p2, p1}, Lp1/q;->b(Ljava/lang/Object;Lc93/m;)V

    return-void
.end method

.method public static final H(Lc93/a;)Lec3/s1;
    .locals 2

    new-instance v0, Landroidx/lifecycle/g1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/g1;-><init>(Lc93/a;Lq83/d;)V

    new-instance p0, Lec3/s1;

    invoke-direct {p0, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p0
.end method

.method public static final I(La0/f0;)I
    .locals 10

    iget v0, p0, La0/f0;->b:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La0/f0;->c(I)I

    move-result v1

    :cond_0
    iget v2, p0, La0/f0;->b:I

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, La0/f0;->c(I)I

    move-result v2

    if-ne v2, v1, :cond_2

    invoke-virtual {p0}, La0/f0;->d()I

    move-result v2

    invoke-virtual {p0, v0, v2}, La0/f0;->g(II)V

    iget v2, p0, La0/f0;->b:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, La0/f0;->f(I)V

    iget v2, p0, La0/f0;->b:I

    ushr-int/lit8 v3, v2, 0x1

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {p0, v4}, La0/f0;->c(I)I

    move-result v5

    add-int/lit8 v6, v4, 0x1

    mul-int/lit8 v6, v6, 0x2

    add-int/lit8 v7, v6, -0x1

    invoke-virtual {p0, v7}, La0/f0;->c(I)I

    move-result v8

    if-ge v6, v2, :cond_1

    invoke-virtual {p0, v6}, La0/f0;->c(I)I

    move-result v9

    if-le v9, v8, :cond_1

    if-le v9, v5, :cond_0

    invoke-virtual {p0, v4, v9}, La0/f0;->g(II)V

    invoke-virtual {p0, v6, v5}, La0/f0;->g(II)V

    move v4, v6

    goto :goto_0

    :cond_1
    if-le v8, v5, :cond_0

    invoke-virtual {p0, v4, v8}, La0/f0;->g(II)V

    invoke-virtual {p0, v7, v5}, La0/f0;->g(II)V

    move v4, v7

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static final J(Ljava/util/Collection;)Lz1/p;
    .locals 1

    new-instance v0, Lz1/p;

    invoke-direct {v0}, Lz1/p;-><init>()V

    invoke-virtual {v0, p0}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static final K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V
    .locals 2

    check-cast p0, Lp1/q;

    iget-boolean v0, p0, Lp1/q;->S:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    if-nez v0, :cond_1

    invoke-virtual {p0, p2, p1}, Lp1/q;->b(Ljava/lang/Object;Lc93/m;)V

    :cond_1
    return-void
.end method

.method public static final L(I)I
    .locals 3

    const v0, 0x12492492

    and-int/2addr v0, p0

    const v1, 0x24924924

    and-int/2addr v1, p0

    const v2, -0x36db6db7

    and-int/2addr p0, v2

    shr-int/lit8 v2, v1, 0x1

    or-int/2addr v2, v0

    or-int/2addr p0, v2

    shl-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v1

    or-int/2addr p0, v0

    return p0
.end method

.method public static final M([Lp1/u1;Lp1/p1;Lp1/p1;)Lx1/g;
    .locals 6

    sget-object v0, Lx1/g;->z:Lx1/g;

    new-instance v1, Lx1/f;

    invoke-direct {v1, v0}, Lu1/e;-><init>(Lu1/c;)V

    iput-object v0, v1, Lx1/f;->G:Lx1/g;

    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    iget-object v4, v3, Lp1/u1;->a:Lp1/t1;

    iget-boolean v5, v3, Lp1/u1;->f:Z

    if-nez v5, :cond_0

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/w2;

    invoke-virtual {v4, v3, v5}, Lp1/t1;->c(Lp1/u1;Lp1/w2;)Lp1/w2;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lu1/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lx1/f;->h()Lx1/g;

    move-result-object p0

    return-object p0
.end method

.method public static final N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v0

    new-instance v1, Llb3/v;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Llb3/v;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v0, v1, p1}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    check-cast p2, Lp1/q;

    const v0, -0x8ed3d8b

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    iget-object v0, p2, Lp1/q;->x:La3/x;

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    const/16 v2, 0xc9

    sget-object v3, Lp1/r;->b:Lp1/e1;

    invoke-virtual {p2, v2, v3}, Lp1/q;->a0(ILp1/e1;)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v2, v4

    goto :goto_0

    :cond_0
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp1/w2;

    :goto_0
    iget-object v3, p0, Lp1/u1;->a:Lp1/t1;

    invoke-virtual {v3, p0, v2}, Lp1/t1;->c(Lp1/u1;Lp1/w2;)Lp1/w2;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    iget-boolean v6, p2, Lp1/q;->S:Z

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_5

    iget-boolean v2, p0, Lp1/u1;->f:Z

    if-nez v2, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    check-cast v1, Lx1/g;

    invoke-virtual {v1, v3, v5}, Lx1/g;->c(Lp1/t1;Lp1/w2;)Lx1/g;

    move-result-object v1

    :cond_3
    iput-boolean v7, p2, Lp1/q;->J:Z

    :cond_4
    move v2, v8

    goto :goto_4

    :cond_5
    iget-object v6, p2, Lp1/q;->G:Lp1/e2;

    iget v9, v6, Lp1/e2;->g:I

    iget-object v10, v6, Lp1/e2;->b:[I

    invoke-virtual {v6, v10, v9}, Lp1/e2;->b([II)Ljava/lang/Object;

    move-result-object v6

    const-string v9, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lp1/p1;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v9

    if-eqz v9, :cond_6

    if-nez v2, :cond_7

    :cond_6
    iget-boolean v9, p0, Lp1/u1;->f:Z

    if-nez v9, :cond_a

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    goto :goto_2

    :cond_7
    if-eqz v2, :cond_8

    iget-boolean v2, p2, Lp1/q;->w:Z

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    iget-boolean v2, p2, Lp1/q;->w:Z

    if-eqz v2, :cond_9

    goto :goto_3

    :cond_9
    :goto_1
    move-object v1, v6

    goto :goto_3

    :cond_a
    :goto_2
    check-cast v1, Lx1/g;

    invoke-virtual {v1, v3, v5}, Lx1/g;->c(Lp1/t1;Lp1/w2;)Lx1/g;

    move-result-object v1

    :goto_3
    iget-boolean v2, p2, Lp1/q;->y:Z

    if-nez v2, :cond_b

    if-eq v6, v1, :cond_4

    :cond_b
    move v2, v7

    :goto_4
    if-eqz v2, :cond_c

    iget-boolean v3, p2, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {p2, v1}, Lp1/q;->P(Lp1/p1;)V

    :cond_c
    iget-boolean v3, p2, Lp1/q;->w:Z

    invoke-virtual {v0, v3}, La3/x;->c(I)V

    iput-boolean v2, p2, Lp1/q;->w:Z

    iput-object v1, p2, Lp1/q;->K:Lp1/p1;

    const/16 v2, 0xca

    sget-object v3, Lp1/r;->c:Lp1/e1;

    invoke-virtual {p2, v3, v2, v1, v8}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    shr-int/lit8 v1, p3, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1, p1, p2, v8, v8}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    invoke-virtual {v0}, La3/x;->b()I

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_5

    :cond_d
    move v7, v8

    :goto_5
    iput-boolean v7, p2, Lp1/q;->w:Z

    iput-object v4, p2, Lp1/q;->K:Lp1/p1;

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance v0, La11/j;

    const/16 v1, 0xe

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, 0x18bf8a0a

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    iget-object v0, p2, Lp1/q;->x:La3/x;

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    const/16 v2, 0xc9

    sget-object v3, Lp1/r;->b:Lp1/e1;

    invoke-virtual {p2, v2, v3}, Lp1/q;->a0(ILp1/e1;)V

    iget-boolean v2, p2, Lp1/q;->S:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    sget-object v2, Lx1/g;->z:Lx1/g;

    invoke-static {p0, v1, v2}, Lp1/x;->M([Lp1/u1;Lp1/p1;Lp1/p1;)Lx1/g;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lp1/q;->o0(Lp1/p1;Lx1/g;)Lx1/g;

    move-result-object v1

    iput-boolean v3, p2, Lp1/q;->J:Z

    :cond_0
    :goto_0
    move v2, v4

    goto :goto_2

    :cond_1
    iget-object v2, p2, Lp1/q;->G:Lp1/e2;

    iget v5, v2, Lp1/e2;->g:I

    invoke-virtual {v2, v5, v4}, Lp1/e2;->h(II)Ljava/lang/Object;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lp1/p1;

    iget-object v6, p2, Lp1/q;->G:Lp1/e2;

    iget v7, v6, Lp1/e2;->g:I

    invoke-virtual {v6, v7, v3}, Lp1/e2;->h(II)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lp1/p1;

    invoke-static {p0, v1, v6}, Lp1/x;->M([Lp1/u1;Lp1/p1;Lp1/p1;)Lx1/g;

    move-result-object v5

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v7

    if-eqz v7, :cond_3

    iget-boolean v7, p2, Lp1/q;->y:Z

    if-nez v7, :cond_3

    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    iget v1, p2, Lp1/q;->l:I

    iget-object v5, p2, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v5}, Lp1/e2;->s()I

    move-result v5

    add-int/2addr v5, v1

    iput v5, p2, Lp1/q;->l:I

    move-object v1, v2

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p2, v1, v5}, Lp1/q;->o0(Lp1/p1;Lx1/g;)Lx1/g;

    move-result-object v1

    iget-boolean v5, p2, Lp1/q;->y:Z

    if-nez v5, :cond_4

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v2, v3

    :goto_2
    if-eqz v2, :cond_5

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {p2, v1}, Lp1/q;->P(Lp1/p1;)V

    :cond_5
    iget-boolean v5, p2, Lp1/q;->w:Z

    invoke-virtual {v0, v5}, La3/x;->c(I)V

    iput-boolean v2, p2, Lp1/q;->w:Z

    iput-object v1, p2, Lp1/q;->K:Lp1/p1;

    const/16 v2, 0xca

    sget-object v5, Lp1/r;->c:Lp1/e1;

    invoke-virtual {p2, v5, v2, v1, v4}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    shr-int/lit8 v1, p3, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1, p1, p2, v4, v4}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    invoke-virtual {v0}, La3/x;->b()I

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    move v3, v4

    :goto_3
    iput-boolean v3, p2, Lp1/q;->w:Z

    const/4 v0, 0x0

    iput-object v0, p2, Lp1/q;->K:Lp1/p1;

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, La11/j;

    const/16 v1, 0xf

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V
    .locals 0

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p1, p0, :cond_1

    :cond_0
    new-instance p1, Lp1/g0;

    invoke-direct {p1, p3}, Lp1/g0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lp1/g0;

    return-void
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V
    .locals 0

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p1, p0, :cond_1

    :cond_0
    new-instance p1, Lp1/g0;

    invoke-direct {p1, p2}, Lp1/g0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lp1/g0;

    return-void
.end method

.method public static final e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V
    .locals 1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_0

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne v0, p0, :cond_1

    :cond_0
    new-instance v0, Lp1/g0;

    invoke-direct {v0, p1}, Lp1/g0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lp1/g0;

    return-void
.end method

.method public static final f([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V
    .locals 5

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, p0, v1

    move-object v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-nez v2, :cond_2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p0, v0, :cond_1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_1
    new-instance p0, Lp1/g0;

    invoke-direct {p0, p1}, Lp1/g0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V
    .locals 2

    check-cast p0, Lp1/q;

    iget-object v0, p0, Lp1/q;->R:Lq83/j;

    invoke-virtual {p0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v1, p2, :cond_1

    :cond_0
    new-instance v1, Lp1/s0;

    invoke-direct {v1, v0, p1}, Lp1/s0;-><init>(Lq83/j;Lc93/m;)V

    invoke-virtual {p0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lp1/s0;

    return-void
.end method

.method public static final h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V
    .locals 1

    check-cast p3, Lp1/q;

    iget-object v0, p3, Lp1/q;->R:Lq83/j;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p1, p0, :cond_1

    :cond_0
    new-instance p1, Lp1/s0;

    invoke-direct {p1, v0, p2}, Lp1/s0;-><init>(Lq83/j;Lc93/m;)V

    invoke-virtual {p3, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lp1/s0;

    return-void
.end method

.method public static final i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V
    .locals 1

    check-cast p4, Lp1/q;

    iget-object v0, p4, Lp1/q;->R:Lq83/j;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p1, p0, :cond_1

    :cond_0
    new-instance p1, Lp1/s0;

    invoke-direct {p1, v0, p3}, Lp1/s0;-><init>(Lq83/j;Lc93/m;)V

    invoke-virtual {p4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lp1/s0;

    return-void
.end method

.method public static final j([Ljava/lang/Object;Lc93/m;Lp1/q;)V
    .locals 5

    iget-object v0, p2, Lp1/q;->R:Lq83/j;

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, p0, v2

    invoke-virtual {p2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-nez v3, :cond_2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_1
    new-instance p0, Lp1/s0;

    invoke-direct {p0, v0, p1}, Lp1/s0;-><init>(Lq83/j;Lc93/m;)V

    invoke-virtual {p2, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    return-void
.end method

.method public static final k(Lc93/a;Landroidx/compose/runtime/Composer;)V
    .locals 1

    check-cast p1, Lp1/q;

    iget-object p1, p1, Lp1/q;->M:Lq1/b;

    iget-object p1, p1, Lq1/b;->b:Lq1/a;

    iget-object p1, p1, Lq1/a;->a:Lq1/l0;

    sget-object v0, Lq1/b0;->d:Lq1/b0;

    invoke-virtual {p1, v0}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    return-void
.end method

.method public static final l(La0/f0;I)V
    .locals 3

    iget v0, p0, La0/f0;->b:I

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La0/f0;->c(I)I

    move-result v0

    if-eq v0, p1, :cond_0

    iget v0, p0, La0/f0;->b:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, La0/f0;->c(I)I

    move-result v0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    iget v0, p0, La0/f0;->b:I

    invoke-virtual {p0, p1}, La0/f0;->a(I)V

    :goto_0
    if-lez v0, :cond_2

    add-int/lit8 v1, v0, 0x1

    ushr-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, La0/f0;->c(I)I

    move-result v2

    if-le p1, v2, :cond_2

    invoke-virtual {p0, v0, v2}, La0/f0;->g(II)V

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, p1}, La0/f0;->g(II)V

    return-void
.end method

.method public static m(Lp1/i2;Ljava/util/List;Lp1/w;)V
    .locals 5

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/a;

    invoke-virtual {p0, v2}, Lp1/i2;->c(Lp1/a;)I

    move-result v2

    invoke-virtual {p0, v2}, Lp1/i2;->r(I)I

    move-result v3

    iget-object v4, p0, Lp1/i2;->b:[I

    invoke-virtual {p0, v4, v3}, Lp1/i2;->M([II)I

    move-result v3

    iget-object v4, p0, Lp1/i2;->b:[I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Lp1/i2;->r(I)I

    move-result v2

    invoke-virtual {p0, v4, v2}, Lp1/i2;->g([II)I

    move-result v2

    if-ge v3, v2, :cond_0

    invoke-virtual {p0, v3}, Lp1/i2;->h(I)I

    move-result v2

    iget-object v3, p0, Lp1/i2;->c:[Ljava/lang/Object;

    aget-object v2, v3, v2

    goto :goto_1

    :cond_0
    sget-object v2, Lp1/l;->a:Lp1/v0;

    :goto_1
    instance-of v3, v2, Lp1/v1;

    if-eqz v3, :cond_1

    check-cast v2, Lp1/v1;

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_2

    iput-object p2, v2, Lp1/v1;->a:Lp1/w;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;
    .locals 6

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lq83/k;->w:Lq83/k;

    :cond_0
    move-object v2, p2

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p2, p3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_2

    :cond_1
    new-instance p3, La6/v;

    const/4 p2, 0x0

    const/16 p5, 0x12

    invoke-direct {p3, v2, p0, p2, p5}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p3

    check-cast v3, Lc93/m;

    shr-int/lit8 p2, p4, 0x3

    and-int/lit8 p2, p2, 0xe

    shl-int/lit8 p3, p4, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/2addr p2, p3

    and-int/lit16 p3, p4, 0x380

    or-int v5, p2, p3

    move-object v1, p0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lp1/x;->B(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;
    .locals 6

    invoke-interface {p0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    and-int/lit8 v4, p2, 0xe

    const/4 v5, 0x0

    sget-object v2, Lq83/k;->w:Lq83/k;

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Landroidx/compose/runtime/Composer;)Lbc3/c0;
    .locals 1

    check-cast p0, Lp1/q;

    iget-object p0, p0, Lp1/q;->R:Lq83/j;

    new-instance v0, Lp1/c2;

    invoke-direct {v0, p0}, Lp1/c2;-><init>(Lq83/j;)V

    return-object v0
.end method

.method public static final q()Lr1/c;
    .locals 3

    sget-object v0, Lp1/p2;->b:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr1/c;

    if-nez v1, :cond_0

    new-instance v1, Lr1/c;

    const/4 v2, 0x0

    new-array v2, v2, [Lp1/p;

    invoke-direct {v1, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ls/m2;->s(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static final r(Lc93/a;)Lp1/f0;
    .locals 2

    sget-object v0, Lp1/p2;->a:Ls/m2;

    new-instance v0, Lp1/f0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp1/f0;-><init>(Lc93/a;Lp1/o2;)V

    return-object v0
.end method

.method public static final s(Lc93/a;Lp1/o2;)Lp1/f0;
    .locals 1

    sget-object v0, Lp1/p2;->a:Ls/m2;

    new-instance v0, Lp1/f0;

    invoke-direct {v0, p0, p1}, Lp1/f0;-><init>(Lc93/a;Lp1/o2;)V

    return-object v0
.end method

.method public static final t(Landroidx/compose/runtime/Composer;)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Lp1/q;

    iget-wide v0, p0, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    return p0
.end method

.method public static final u(Lp1/q;)J
    .locals 2

    iget-wide v0, p0, Lp1/q;->T:J

    return-wide v0
.end method

.method public static final v(Lq83/j;)Lp1/w0;
    .locals 1

    sget-object v0, Lp1/v0;->x:Lp1/v0;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lp1/w0;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final w()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid applier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static x(Lp1/i2;ILp1/i2;ZZZ)Ljava/util/List;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual/range {p0 .. p1}, Lp1/i2;->t(I)I

    move-result v3

    add-int v4, v1, v3

    invoke-virtual/range {p0 .. p1}, Lp1/i2;->f(I)I

    move-result v5

    invoke-virtual {v0, v4}, Lp1/i2;->f(I)I

    move-result v6

    sub-int v7, v6, v5

    const/4 v9, 0x1

    if-ltz v1, :cond_0

    iget-object v10, v0, Lp1/i2;->b:[I

    invoke-virtual/range {p0 .. p1}, Lp1/i2;->r(I)I

    move-result v11

    mul-int/lit8 v11, v11, 0x5

    add-int/2addr v11, v9

    aget v10, v10, v11

    const/high16 v11, 0xc000000

    and-int/2addr v10, v11

    if-eqz v10, :cond_0

    move v10, v9

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lp1/i2;->v(I)V

    iget v11, v2, Lp1/i2;->t:I

    invoke-virtual {v2, v7, v11}, Lp1/i2;->w(II)V

    iget v11, v0, Lp1/i2;->g:I

    if-ge v11, v4, :cond_1

    invoke-virtual {v0, v4}, Lp1/i2;->A(I)V

    :cond_1
    iget v11, v0, Lp1/i2;->k:I

    if-ge v11, v6, :cond_2

    invoke-virtual {v0, v6, v4}, Lp1/i2;->B(II)V

    :cond_2
    iget-object v6, v2, Lp1/i2;->b:[I

    iget v11, v2, Lp1/i2;->t:I

    iget-object v12, v0, Lp1/i2;->b:[I

    mul-int/lit8 v13, v11, 0x5

    mul-int/lit8 v14, v1, 0x5

    mul-int/lit8 v15, v4, 0x5

    invoke-static {v13, v14, v12, v6, v15}, Lm83/n;->e0(II[I[II)V

    iget-object v12, v2, Lp1/i2;->c:[Ljava/lang/Object;

    iget v14, v2, Lp1/i2;->i:I

    iget-object v15, v0, Lp1/i2;->c:[Ljava/lang/Object;

    invoke-static {v15, v5, v12, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v15, v2, Lp1/i2;->v:I

    add-int/lit8 v16, v13, 0x2

    aput v15, v6, v16

    sub-int v16, v11, v1

    add-int v8, v11, v3

    invoke-virtual {v2, v6, v11}, Lp1/i2;->g([II)I

    move-result v18

    sub-int v18, v14, v18

    move/from16 v19, v9

    iget v9, v2, Lp1/i2;->m:I

    move/from16 v20, v9

    iget v9, v2, Lp1/i2;->l:I

    array-length v12, v12

    move/from16 v21, v10

    move/from16 v10, v20

    move/from16 v20, v13

    move v13, v11

    :goto_1
    if-ge v13, v8, :cond_6

    if-eq v13, v11, :cond_3

    mul-int/lit8 v22, v13, 0x5

    add-int/lit8 v22, v22, 0x2

    aget v23, v6, v22

    add-int v23, v23, v16

    aput v23, v6, v22

    :cond_3
    invoke-virtual {v2, v6, v13}, Lp1/i2;->g([II)I

    move-result v22

    move-object/from16 v23, v6

    add-int v6, v22, v18

    if-ge v10, v13, :cond_4

    move/from16 v22, v11

    const/4 v11, 0x0

    goto :goto_2

    :cond_4
    move/from16 v22, v11

    iget v11, v2, Lp1/i2;->k:I

    :goto_2
    invoke-static {v6, v11, v9, v12}, Lp1/i2;->i(IIII)I

    move-result v6

    mul-int/lit8 v11, v13, 0x5

    add-int/lit8 v11, v11, 0x4

    aput v6, v23, v11

    if-ne v13, v10, :cond_5

    add-int/lit8 v10, v10, 0x1

    :cond_5
    add-int/lit8 v13, v13, 0x1

    move/from16 v11, v22

    move-object/from16 v6, v23

    goto :goto_1

    :cond_6
    move-object/from16 v23, v6

    iput v10, v2, Lp1/i2;->m:I

    iget-object v6, v0, Lp1/i2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lp1/i2;->p()I

    move-result v9

    invoke-static {v6, v1, v9}, Lp1/h2;->b(Ljava/util/ArrayList;II)I

    move-result v6

    iget-object v9, v0, Lp1/i2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lp1/i2;->p()I

    move-result v10

    invoke-static {v9, v4, v10}, Lp1/h2;->b(Ljava/util/ArrayList;II)I

    move-result v4

    if-ge v6, v4, :cond_8

    iget-object v9, v0, Lp1/i2;->d:Ljava/util/ArrayList;

    new-instance v10, Ljava/util/ArrayList;

    sub-int v11, v4, v6

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    move v11, v6

    :goto_3
    if-ge v11, v4, :cond_7

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lp1/a;

    iget v13, v12, Lp1/a;->a:I

    add-int v13, v13, v16

    iput v13, v12, Lp1/a;->a:I

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_7
    iget-object v11, v2, Lp1/i2;->d:Ljava/util/ArrayList;

    iget v12, v2, Lp1/i2;->t:I

    invoke-virtual {v2}, Lp1/i2;->p()I

    move-result v13

    invoke-static {v11, v12, v13}, Lp1/h2;->b(Ljava/util/ArrayList;II)I

    move-result v11

    iget-object v12, v2, Lp1/i2;->d:Ljava/util/ArrayList;

    invoke-virtual {v12, v11, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->clear()V

    goto :goto_4

    :cond_8
    sget-object v10, Lm83/y;->w:Lm83/y;

    :goto_4
    move-object v4, v10

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_9

    iget-object v6, v0, Lp1/i2;->e:Ljava/util/HashMap;

    iget-object v9, v2, Lp1/i2;->e:Ljava/util/HashMap;

    if-eqz v6, :cond_9

    if-eqz v9, :cond_9

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v4, :cond_9

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lp1/a;

    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lp1/n0;

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_9
    iget v4, v2, Lp1/i2;->v:I

    invoke-virtual {v2, v15}, Lp1/i2;->N(I)Lp1/n0;

    iget-object v4, v0, Lp1/i2;->b:[I

    invoke-virtual {v0, v4, v1}, Lp1/i2;->D([II)I

    move-result v4

    if-nez p5, :cond_a

    const/16 v17, 0x0

    goto :goto_7

    :cond_a
    if-eqz p3, :cond_e

    if-ltz v4, :cond_b

    move/from16 v17, v19

    goto :goto_6

    :cond_b
    const/16 v17, 0x0

    :goto_6
    if-eqz v17, :cond_c

    invoke-virtual {v0}, Lp1/i2;->O()V

    iget v3, v0, Lp1/i2;->t:I

    sub-int/2addr v4, v3

    invoke-virtual {v0, v4}, Lp1/i2;->a(I)V

    invoke-virtual {v0}, Lp1/i2;->O()V

    :cond_c
    iget v3, v0, Lp1/i2;->t:I

    sub-int/2addr v1, v3

    invoke-virtual {v0, v1}, Lp1/i2;->a(I)V

    invoke-virtual {v0}, Lp1/i2;->G()Z

    move-result v1

    if-eqz v17, :cond_d

    invoke-virtual {v0}, Lp1/i2;->L()V

    invoke-virtual {v0}, Lp1/i2;->j()V

    invoke-virtual {v0}, Lp1/i2;->L()V

    invoke-virtual {v0}, Lp1/i2;->j()V

    :cond_d
    move/from16 v17, v1

    goto :goto_7

    :cond_e
    invoke-virtual {v0, v1, v3}, Lp1/i2;->H(II)Z

    move-result v3

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v5, v7, v1}, Lp1/i2;->I(III)V

    move/from16 v17, v3

    :goto_7
    if-eqz v17, :cond_f

    const-string v0, "Unexpectedly removed anchors"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_f
    iget v0, v2, Lp1/i2;->o:I

    add-int/lit8 v13, v20, 0x1

    aget v1, v23, v13

    const/high16 v3, 0x40000000    # 2.0f

    and-int/2addr v3, v1

    if-eqz v3, :cond_10

    move/from16 v9, v19

    goto :goto_8

    :cond_10
    const v3, 0x3ffffff

    and-int v9, v1, v3

    :goto_8
    add-int/2addr v0, v9

    iput v0, v2, Lp1/i2;->o:I

    if-eqz p4, :cond_11

    iput v8, v2, Lp1/i2;->t:I

    add-int/2addr v14, v7

    iput v14, v2, Lp1/i2;->i:I

    :cond_11
    if-eqz v21, :cond_12

    invoke-virtual {v2, v15}, Lp1/i2;->S(I)V

    :cond_12
    return-object v10
.end method

.method public static final y(F)Lp1/g1;
    .locals 1

    new-instance v0, Lp1/g1;

    invoke-direct {v0, p0}, Lp1/g1;-><init>(F)V

    return-object v0
.end method

.method public static z(Ljava/lang/Object;)Lp1/k1;
    .locals 2

    sget-object v0, Lp1/v0;->F:Lp1/v0;

    new-instance v1, Lp1/k1;

    invoke-direct {v1, p0, v0}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    return-object v1
.end method
