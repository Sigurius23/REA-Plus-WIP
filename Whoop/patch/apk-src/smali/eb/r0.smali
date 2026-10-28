.class public Leb/r0;
.super Leb/n0;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# static fields
.field public static final synthetic P:I


# instance fields
.field public final L:La0/g1;

.field public M:I

.field public N:Ljava/lang/String;

.field public O:Ljava/lang/String;


# direct methods
.method public constructor <init>(Leb/t0;)V
    .locals 1

    invoke-direct {p0, p1}, Leb/n0;-><init>(Leb/i1;)V

    new-instance p1, La0/g1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, La0/g1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Leb/r0;->L:La0/g1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_4

    instance-of v0, p1, Leb/r0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-super {p0, p1}, Leb/n0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Leb/r0;->L:La0/g1;

    invoke-virtual {v0}, La0/g1;->g()I

    move-result v1

    check-cast p1, Leb/r0;

    iget-object v2, p1, Leb/r0;->L:La0/g1;

    invoke-virtual {v2}, La0/g1;->g()I

    move-result v3

    if-ne v1, v3, :cond_4

    iget v1, p0, Leb/r0;->M:I

    iget p1, p1, Leb/r0;->M:I

    if-ne v1, p1, :cond_4

    new-instance p1, La0/i1;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, La0/i1;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object p1

    check-cast p1, Lxb3/a;

    invoke-virtual {p1}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/n0;

    iget v1, v0, Leb/n0;->H:I

    invoke-virtual {v2, v1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/n0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget v0, p0, Leb/n0;->H:I

    if-eqz v0, :cond_0

    invoke-super {p0}, Leb/n0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "the root navigation"

    return-object v0
.end method

.method public final hashCode()I
    .locals 6

    iget v0, p0, Leb/r0;->M:I

    iget-object v1, p0, Leb/r0;->L:La0/g1;

    invoke-virtual {v1}, La0/g1;->g()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, La0/g1;->e(I)I

    move-result v4

    invoke-virtual {v1, v3}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/n0;

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v5}, Leb/n0;->hashCode()I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Leb/q0;

    invoke-direct {v0, p0}, Leb/q0;-><init>(Leb/r0;)V

    return-object v0
.end method

.method public final j(Leb/k0;)Leb/l0;
    .locals 1

    const-string v0, "navDeepLinkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p0}, Leb/r0;->t(Leb/k0;ZLeb/r0;)Leb/l0;

    move-result-object p1

    return-object p1
.end method

.method public final m(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Leb/n0;->m(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, Lfb/a;->d:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "context.resources.obtain\u2026leable.NavGraphNavigator)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iget v1, p0, Leb/n0;->H:I

    if-eq v0, v1, :cond_2

    iget-object v1, p0, Leb/r0;->O:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Leb/r0;->v(Ljava/lang/String;)V

    :cond_0
    iput v0, p0, Leb/r0;->M:I

    iput-object v2, p0, Leb/r0;->N:Ljava/lang/String;

    iget v0, p0, Leb/r0;->M:I

    const v1, 0xffffff

    if-gt v0, v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v0, "try {\n                  \u2026tring()\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    iput-object p1, p0, Leb/r0;->N:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Start destination "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " cannot use the same id as the graph "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final p(Leb/n0;)V
    .locals 4

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Leb/n0;->H:I

    iget-object v1, p1, Leb/n0;->I:Ljava/lang/String;

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v2, p0, Leb/n0;->I:Ljava/lang/String;

    const-string v3, "Destination "

    if-eqz v2, :cond_3

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot have the same route as graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget v1, p0, Leb/n0;->H:I

    if-eq v0, v1, :cond_7

    iget-object v1, p0, Leb/r0;->L:La0/g1;

    invoke-virtual {v1, v0}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/n0;

    if-ne v0, p1, :cond_4

    return-void

    :cond_4
    iget-object v2, p1, Leb/n0;->x:Leb/r0;

    if-nez v2, :cond_6

    if-eqz v0, :cond_5

    const/4 v2, 0x0

    iput-object v2, v0, Leb/n0;->x:Leb/r0;

    :cond_5
    iput-object p0, p1, Leb/n0;->x:Leb/r0;

    iget v0, p1, Leb/n0;->H:I

    invoke-virtual {v1, v0, p1}, La0/g1;->f(ILjava/lang/Object;)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " cannot have the same id as graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q(Ljava/lang/String;Z)Leb/n0;
    .locals 6

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    iget-object v1, p0, Leb/r0;->L:La0/g1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La0/i1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    check-cast v0, Lxb3/a;

    invoke-virtual {v0}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Leb/n0;

    iget-object v4, v3, Leb/n0;->I:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v4, p1, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3, p1}, Leb/n0;->l(Ljava/lang/String;)Leb/l0;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :cond_2
    :goto_0
    check-cast v1, Leb/n0;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    iget-object p2, p0, Leb/n0;->x:Leb/r0;

    if-eqz p2, :cond_4

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v2

    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Leb/r0;->q(Ljava/lang/String;Z)Leb/n0;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v2

    :cond_5
    return-object v1
.end method

.method public final r(ILeb/n0;Leb/n0;Z)Leb/n0;
    .locals 5

    iget-object v0, p0, Leb/r0;->L:La0/g1;

    invoke-virtual {v0, p1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    const/4 v2, 0x0

    if-eqz p3, :cond_1

    invoke-static {v1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v1, Leb/n0;->x:Leb/r0;

    iget-object v4, p3, Leb/n0;->x:Leb/r0;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v1

    :cond_0
    move-object v1, v2

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    if-eqz p4, :cond_6

    new-instance v1, La0/i1;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, La0/i1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    check-cast v0, Lxb3/a;

    invoke-virtual {v0}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    instance-of v3, v1, Leb/r0;

    if-eqz v3, :cond_4

    invoke-virtual {v1, p2}, Leb/n0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    check-cast v1, Leb/r0;

    const/4 v3, 0x1

    invoke-virtual {v1, p1, p0, p3, v3}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_5
    move-object v1, v2

    :cond_6
    :goto_2
    if-nez v1, :cond_8

    iget-object v0, p0, Leb/n0;->x:Leb/r0;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p2}, Leb/r0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    iget-object p2, p0, Leb/n0;->x:Leb/r0;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2, p1, p0, p3, p4}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v2

    :cond_8
    return-object v1
.end method

.method public final t(Leb/k0;ZLeb/r0;)Leb/l0;
    .locals 6

    const-string v0, "navDeepLinkRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Leb/n0;->j(Leb/k0;)Leb/l0;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Leb/q0;

    invoke-direct {v2, p0}, Leb/q0;-><init>(Leb/r0;)V

    :cond_0
    :goto_0
    invoke-virtual {v2}, Leb/q0;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Leb/q0;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/n0;

    invoke-static {v3, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1}, Leb/n0;->j(Leb/k0;)Leb/l0;

    move-result-object v4

    :cond_1
    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Leb/l0;

    iget-object v2, p0, Leb/n0;->x:Leb/r0;

    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {v2, p3}, Leb/r0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x1

    invoke-virtual {v2, p1, p2, p0}, Leb/r0;->t(Leb/k0;ZLeb/r0;)Leb/l0;

    move-result-object v4

    :cond_3
    filled-new-array {v0, v1, v4}, [Leb/l0;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Leb/l0;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Leb/n0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/r0;->O:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    invoke-virtual {p0, v1, v3}, Leb/r0;->q(Ljava/lang/String;Z)Leb/n0;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_2

    iget v1, p0, Leb/r0;->M:I

    const/4 v3, 0x0

    invoke-virtual {p0, v1, p0, v2, v3}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v1

    :cond_2
    const-string v2, " startDestination="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_5

    iget-object v1, p0, Leb/r0;->O:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    iget-object v1, p0, Leb/r0;->N:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Leb/r0;->M:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    const-string v2, "{"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Leb/n0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final u(Ljava/lang/String;ZLeb/r0;)Leb/l0;
    .locals 6

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Leb/n0;->l(Ljava/lang/String;)Leb/l0;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Leb/q0;

    invoke-direct {v2, p0}, Leb/q0;-><init>(Leb/r0;)V

    :cond_0
    :goto_0
    invoke-virtual {v2}, Leb/q0;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Leb/q0;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/n0;

    invoke-static {v3, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    instance-of v4, v3, Leb/r0;

    if-eqz v4, :cond_2

    check-cast v3, Leb/r0;

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v4, p0}, Leb/r0;->u(Ljava/lang/String;ZLeb/r0;)Leb/l0;

    move-result-object v4

    goto :goto_1

    :cond_2
    invoke-virtual {v3, p1}, Leb/n0;->l(Ljava/lang/String;)Leb/l0;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Leb/l0;

    iget-object v2, p0, Leb/n0;->x:Leb/r0;

    if-eqz v2, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {v2, p3}, Leb/r0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    const/4 p2, 0x1

    invoke-virtual {v2, p1, p2, p0}, Leb/r0;->u(Ljava/lang/String;ZLeb/r0;)Leb/l0;

    move-result-object v4

    :cond_4
    filled-new-array {v0, v1, v4}, [Leb/l0;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Leb/l0;

    return-object p1
.end method

.method public final v(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Leb/n0;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android-app://androidx.navigation/"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    iput v0, p0, Leb/r0;->M:I

    iput-object p1, p0, Leb/r0;->O:Ljava/lang/String;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot have an empty start destination route"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Start destination "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot use the same route as the graph "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
