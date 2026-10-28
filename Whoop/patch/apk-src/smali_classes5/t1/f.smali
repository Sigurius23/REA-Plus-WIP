.class public final Lt1/f;
.super Lm83/h;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements Ld93/b;


# instance fields
.field public E:Lw1/b;

.field public F:[Ljava/lang/Object;

.field public G:[Ljava/lang/Object;

.field public H:I

.field public w:Lt1/c;

.field public x:[Ljava/lang/Object;

.field public y:[Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lt1/c;[Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lt1/f;->w:Lt1/c;

    iput-object p2, p0, Lt1/f;->x:[Ljava/lang/Object;

    iput-object p3, p0, Lt1/f;->y:[Ljava/lang/Object;

    iput p4, p0, Lt1/f;->z:I

    new-instance p4, Lw1/b;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lt1/f;->E:Lw1/b;

    iput-object p2, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object p3, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p1}, Lm83/a;->a()I

    move-result p1

    iput p1, p0, Lt1/f;->H:I

    return-void
.end method

.method public static e([Ljava/lang/Object;ILjava/util/Iterator;)V
    .locals 2

    :goto_0
    const/16 v0, 0x20

    if-ge p1, v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p0, p1

    move p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final A([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    invoke-static {p3}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object p3

    shr-int/lit8 v0, p2, 0x5

    iget v1, p0, Lt1/f;->z:I

    const/4 v2, 0x1

    shl-int v3, v2, v1

    if-ge v0, v3, :cond_0

    invoke-virtual {p0, p1, p2, v1, p3}, Lt1/f;->z([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-virtual {p3}, La0/i1;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p0, Lt1/f;->z:I

    add-int/lit8 p2, p2, 0x5

    iput p2, p0, Lt1/f;->z:I

    invoke-virtual {p0, p1}, Lt1/f;->t(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget p2, p0, Lt1/f;->z:I

    shl-int v0, v2, p2

    invoke-virtual {p0, p1, v0, p2, p3}, Lt1/f;->z([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final B([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lt1/f;->H:I

    shr-int/lit8 v1, v0, 0x5

    iget v2, p0, Lt1/f;->z:I

    const/4 v3, 0x1

    shl-int v4, v3, v2

    if-le v1, v4, :cond_0

    invoke-virtual {p0, p1}, Lt1/f;->t(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lt1/f;->z:I

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {p0, v0, p1, p2}, Lt1/f;->D(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object p3, p0, Lt1/f;->G:[Ljava/lang/Object;

    iget p1, p0, Lt1/f;->z:I

    add-int/lit8 p1, p1, 0x5

    iput p1, p0, Lt1/f;->z:I

    iget p1, p0, Lt1/f;->H:I

    add-int/2addr p1, v3

    iput p1, p0, Lt1/f;->H:I

    return-void

    :cond_0
    if-nez p1, :cond_1

    iput-object p2, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object p3, p0, Lt1/f;->G:[Ljava/lang/Object;

    add-int/2addr v0, v3

    iput v0, p0, Lt1/f;->H:I

    return-void

    :cond_1
    invoke-virtual {p0, v2, p1, p2}, Lt1/f;->D(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object p3, p0, Lt1/f;->G:[Ljava/lang/Object;

    iget p1, p0, Lt1/f;->H:I

    add-int/2addr p1, v3

    iput p1, p0, Lt1/f;->H:I

    return-void
.end method

.method public final D(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lt1/f;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, p1}, Lwb3/f;->G(II)I

    move-result v0

    invoke-virtual {p0, p2}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x5

    if-ne p1, v1, :cond_0

    aput-object p3, p2, v0

    return-object p2

    :cond_0
    aget-object v2, p2, v0

    check-cast v2, [Ljava/lang/Object;

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1, v2, p3}, Lt1/f;->D(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p1, p2, v0

    return-object p2
.end method

.method public final E(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILf93/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 6

    invoke-virtual {p0, p2}, Lt1/f;->n([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p6, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p5, Lf93/a;->x:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    move-object v3, v0

    move v2, v1

    :goto_0
    if-ge v2, p3, :cond_4

    aget-object v4, p2, v2

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_3

    const/16 v5, 0x20

    if-ne p4, v5, :cond_2

    invoke-interface {p6}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-virtual {p6}, Ljava/util/ArrayList;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    invoke-virtual {p6, p4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Ljava/lang/Object;

    :goto_1
    move-object v3, p4

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object p4

    goto :goto_1

    :goto_2
    move p4, v1

    :cond_2
    add-int/lit8 v5, p4, 0x1

    aput-object v4, v3, p4

    move p4, v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    iput-object v3, p5, Lf93/a;->x:Ljava/lang/Object;

    if-eq v0, v3, :cond_5

    invoke-virtual {p7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return p4
.end method

.method public final F(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILf93/a;)I
    .locals 6

    const/4 v0, 0x0

    move-object v2, p2

    move v3, p3

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_2

    aget-object v4, p2, v0

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    if-nez v1, :cond_1

    invoke-virtual {p0, p2}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const/4 v1, 0x1

    move v3, v0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    aput-object v4, v2, v3

    move v3, v5

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iput-object v2, p4, Lf93/a;->x:Ljava/lang/Object;

    return v3
.end method

.method public final G(Lkotlin/jvm/functions/Function1;ILf93/a;)I
    .locals 1

    iget-object v0, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, p1, v0, p2, p3}, Lt1/f;->F(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILf93/a;)I

    move-result p1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p3, p3, Lf93/a;->x:Ljava/lang/Object;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p3, p1, p2, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput-object p3, p0, Lt1/f;->G:[Ljava/lang/Object;

    iget p3, p0, Lt1/f;->H:I

    sub-int/2addr p2, p1

    sub-int/2addr p3, p2

    iput p3, p0, Lt1/f;->H:I

    return p1
.end method

.method public final I(Lkotlin/jvm/functions/Function1;)Z
    .locals 15

    move-object/from16 v1, p1

    invoke-virtual {p0}, Lt1/f;->P()I

    move-result v8

    new-instance v5, Lf93/a;

    const/4 v0, 0x4

    const/4 v9, 0x0

    invoke-direct {v5, v9, v0}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, v1, v8, v5}, Lt1/f;->G(Lkotlin/jvm/functions/Function1;ILf93/a;)I

    move-result v0

    if-eq v0, v8, :cond_9

    :goto_0
    move v10, v11

    goto/16 :goto_7

    :cond_0
    invoke-virtual {p0, v10}, Lt1/f;->o(I)Lt1/a;

    move-result-object v12

    const/16 v13, 0x20

    move v0, v13

    :goto_1
    if-ne v0, v13, :cond_1

    invoke-virtual {v12}, Lt1/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v12}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {p0, v1, v0, v13, v5}, Lt1/f;->F(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILf93/a;)I

    move-result v0

    goto :goto_1

    :cond_1
    if-ne v0, v13, :cond_3

    invoke-virtual {p0, v1, v8, v5}, Lt1/f;->G(Lkotlin/jvm/functions/Function1;ILf93/a;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v1, p0, Lt1/f;->F:[Ljava/lang/Object;

    iget v2, p0, Lt1/f;->H:I

    iget v3, p0, Lt1/f;->z:I

    invoke-virtual {p0, v2, v3, v1}, Lt1/f;->w(II[Ljava/lang/Object;)V

    :cond_2
    if-eq v0, v8, :cond_9

    goto :goto_0

    :cond_3
    iget v2, v12, Lt1/a;->w:I

    sub-int/2addr v2, v11

    shl-int/lit8 v14, v2, 0x5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_2
    invoke-virtual {v12}, Lt1/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    const/16 v3, 0x20

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lt1/f;->E(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILf93/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v4

    move-object/from16 v1, p1

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    move-object v0, p0

    move-object/from16 v1, p1

    move v3, v8

    invoke-virtual/range {v0 .. v7}, Lt1/f;->E(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILf93/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v1

    iget-object v2, v5, Lf93/a;->x:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [Ljava/lang/Object;

    invoke-static {v2, v1, v13, v9}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Lt1/f;->F:[Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lt1/f;->F:[Ljava/lang/Object;

    iget v5, p0, Lt1/f;->z:I

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-virtual {p0, v4, v14, v5, v6}, Lt1/f;->z([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v4

    :goto_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    shl-int/lit8 v5, v5, 0x5

    add-int/2addr v14, v5

    and-int/lit8 v5, v14, 0x1f

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "invalid size"

    invoke-static {v5}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_4
    if-nez v14, :cond_7

    iput v10, p0, Lt1/f;->z:I

    goto :goto_6

    :cond_7
    add-int/lit8 v5, v14, -0x1

    :goto_5
    iget v6, p0, Lt1/f;->z:I

    shr-int v7, v5, v6

    if-nez v7, :cond_8

    add-int/lit8 v6, v6, -0x5

    iput v6, p0, Lt1/f;->z:I

    aget-object v4, v4, v10

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, [Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v5, v6, v4}, Lt1/f;->u(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    :goto_6
    iput-object v9, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    add-int/2addr v14, v1

    iput v14, p0, Lt1/f;->H:I

    goto/16 :goto_0

    :cond_9
    :goto_7
    if-eqz v10, :cond_a

    iget v1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr v1, v11

    iput v1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_a
    return v10
.end method

.method public final K([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;
    .locals 6

    invoke-static {p3, p2}, Lwb3/f;->G(II)I

    move-result v0

    const/16 v1, 0x1f

    if-nez p2, :cond_0

    aget-object p2, p1, v0

    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 v2, v0, 0x1

    const/16 v3, 0x20

    invoke-static {v0, v2, v3, p1, p3}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iget-object p1, p4, Lf93/a;->x:Ljava/lang/Object;

    aput-object p1, p3, v1

    iput-object p2, p4, Lf93/a;->x:Ljava/lang/Object;

    return-object p3

    :cond_0
    aget-object v2, p1, v1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, p2}, Lwb3/f;->G(II)I

    move-result v1

    :cond_1
    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 p2, p2, -0x5

    add-int/lit8 v2, v0, 0x1

    const-string v3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    if-gt v2, v1, :cond_2

    :goto_0
    aget-object v4, p1, v1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p0, v4, p2, v5, p4}, Lt1/f;->K([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;

    move-result-object v4

    aput-object v4, p1, v1

    if-eq v1, v2, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    aget-object v1, p1, v0

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {p0, v1, p2, p3, p4}, Lt1/f;->K([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    return-object p1
.end method

.method public final L([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lt1/f;->H:I

    sub-int/2addr v0, p2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p4, p0, Lt1/f;->G:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p4, p4, v0

    invoke-virtual {p0, p2, p3, p1}, Lt1/f;->w(II[Ljava/lang/Object;)V

    return-object p4

    :cond_0
    iget-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    aget-object v3, v2, p4

    invoke-virtual {p0, v2}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, p4, 0x1

    invoke-static {p4, v5, v0, v2, v4}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/lit8 p4, v0, -0x1

    const/4 v2, 0x0

    aput-object v2, v4, p4

    iput-object p1, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object v4, p0, Lt1/f;->G:[Ljava/lang/Object;

    add-int/2addr p2, v0

    sub-int/2addr p2, v1

    iput p2, p0, Lt1/f;->H:I

    iput p3, p0, Lt1/f;->z:I

    return-object v3
.end method

.method public final M()I
    .locals 2

    iget v0, p0, Lt1/f;->H:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    and-int/lit8 v0, v0, -0x20

    return v0
.end method

.method public final N([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;
    .locals 9

    invoke-static {p3, p2}, Lwb3/f;->G(II)I

    move-result v0

    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_1

    if-eq v1, p1, :cond_0

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    aget-object p1, v1, v0

    iput-object p1, p5, Lf93/a;->x:Ljava/lang/Object;

    aput-object p4, v1, v0

    return-object v1

    :cond_1
    aget-object p1, v1, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, [Ljava/lang/Object;

    add-int/lit8 v5, p2, -0x5

    move-object v3, p0

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v3 .. v8}, Lt1/f;->N([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return-object v1
.end method

.method public final O(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 5

    const/4 v0, 0x1

    if-lt p6, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "requires at least one nullBuffer"

    invoke-static {v1}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p3}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const/4 v1, 0x0

    aput-object p3, p5, v1

    and-int/lit8 v2, p2, 0x1f

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr v3, p2

    sub-int/2addr v3, v0

    and-int/lit8 p2, v3, 0x1f

    sub-int v3, p4, v2

    add-int/2addr v3, p2

    const/16 v4, 0x20

    if-ge v3, v4, :cond_1

    add-int/2addr p2, v0

    invoke-static {p2, v2, p4, p3, p7}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, -0x1f

    if-ne p6, v0, :cond_2

    move-object v4, p3

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 p6, p6, -0x1

    aput-object v4, p5, p6

    :goto_1
    sub-int v3, p4, v3

    invoke-static {v1, v3, p4, p3, p7}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/2addr p2, v0

    invoke-static {p2, v2, v3, p3, v4}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    move-object p7, v4

    :goto_2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p3, v2, p1}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    :goto_3
    if-ge v0, p6, :cond_3

    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v1, p1}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    aput-object p2, p5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    invoke-static {p7, v1, p1}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    return-void
.end method

.method public final P()I
    .locals 2

    iget v0, p0, Lt1/f;->H:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v0, -0x1

    and-int/lit8 v1, v1, -0x20

    sub-int/2addr v0, v1

    return v0
.end method

.method public final a()I
    .locals 1

    iget v0, p0, Lt1/f;->H:I

    return v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lt1/f;->a()I

    move-result v0

    .line 2
    invoke-static {p1, v0}, Lv63/b;->c(II)V

    .line 3
    invoke-virtual {p0}, Lt1/f;->a()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0, p2}, Lt1/f;->add(Ljava/lang/Object;)Z

    return-void

    .line 5
    :cond_0
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7
    iget-object v1, p0, Lt1/f;->F:[Ljava/lang/Object;

    sub-int/2addr p1, v0

    invoke-virtual {p0, v1, p1, p2}, Lt1/f;->m([Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    .line 8
    :cond_1
    new-instance v7, Lf93/a;

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-direct {v7, v0, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    .line 9
    iget-object v3, p0, Lt1/f;->F:[Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v4, p0, Lt1/f;->z:I

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-virtual/range {v2 .. v7}, Lt1/f;->l([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    .line 10
    iget-object v0, v7, Lf93/a;->x:Ljava/lang/Object;

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lt1/f;->m([Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 3

    .line 12
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 13
    invoke-virtual {p0}, Lt1/f;->P()I

    move-result v0

    const/16 v2, 0x20

    if-ge v0, v2, :cond_0

    .line 14
    iget-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v2}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 15
    aput-object p1, v2, v0

    .line 16
    iput-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    .line 17
    invoke-virtual {p0}, Lt1/f;->a()I

    move-result p1

    add-int/2addr p1, v1

    .line 18
    iput p1, p0, Lt1/f;->H:I

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lt1/f;->t(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 20
    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    iget-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v2, p1}, Lt1/f;->B([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    return v1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 13

    .line 1
    iget v0, p0, Lt1/f;->H:I

    .line 2
    invoke-static {p1, v0}, Lv63/b;->c(II)V

    .line 3
    iget v0, p0, Lt1/f;->H:I

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0, p2}, Lt1/f;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 5
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    .line 6
    :cond_1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    shr-int/lit8 v0, p1, 0x5

    shl-int/lit8 v0, v0, 0x5

    .line 7
    iget v3, p0, Lt1/f;->H:I

    sub-int/2addr v3, v0

    .line 8
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v4, v3

    sub-int/2addr v4, v2

    const/16 v3, 0x20

    div-int/lit8 v10, v4, 0x20

    if-nez v10, :cond_2

    and-int/lit8 v0, p1, 0x1f

    .line 9
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, p1

    sub-int/2addr v1, v2

    and-int/lit8 p1, v1, 0x1f

    .line 10
    iget-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    add-int/2addr p1, v2

    invoke-virtual {p0}, Lt1/f;->P()I

    move-result v4

    invoke-static {p1, v0, v4, v1, v3}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 11
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    .line 12
    iput-object v3, p0, Lt1/f;->G:[Ljava/lang/Object;

    .line 13
    iget p1, p0, Lt1/f;->H:I

    .line 14
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Lt1/f;->H:I

    return v2

    .line 15
    :cond_2
    new-array v7, v10, [[Ljava/lang/Object;

    .line 16
    invoke-virtual {p0}, Lt1/f;->P()I

    move-result v9

    .line 17
    iget v4, p0, Lt1/f;->H:I

    .line 18
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/2addr v5, v4

    if-gt v5, v3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v4, v5, -0x1

    and-int/lit8 v4, v4, -0x20

    sub-int/2addr v5, v4

    .line 19
    :goto_0
    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v4

    if-lt p1, v4, :cond_4

    .line 20
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v12

    .line 21
    iget-object v8, p0, Lt1/f;->G:[Ljava/lang/Object;

    move-object v5, p0

    move-object v6, p2

    move v11, v10

    move-object v10, v7

    move v7, p1

    invoke-virtual/range {v5 .. v12}, Lt1/f;->O(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    move-object p1, v5

    move-object v7, v10

    goto :goto_1

    :cond_4
    move-object v6, p2

    move p2, p1

    move-object p1, p0

    if-le v5, v9, :cond_5

    sub-int v8, v5, v9

    .line 22
    iget-object v1, p1, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v8, v1}, Lt1/f;->q(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    move-object v5, p1

    move-object v9, v7

    move v7, p2

    .line 23
    invoke-virtual/range {v5 .. v11}, Lt1/f;->j(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    move-object v7, v9

    move-object v12, v11

    goto :goto_1

    .line 24
    :cond_5
    iget-object v4, p1, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v12

    sub-int v5, v9, v5

    invoke-static {v1, v5, v9, v4, v12}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    sub-int/2addr v3, v5

    .line 25
    iget-object v1, p1, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v3, v1}, Lt1/f;->q(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v10, -0x1

    .line 26
    aput-object v9, v7, v8

    move v5, p2

    move-object v4, v6

    move v6, v3

    move-object v3, p1

    .line 27
    invoke-virtual/range {v3 .. v9}, Lt1/f;->j(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    move-object v6, v4

    .line 28
    :goto_1
    iget-object p2, p1, Lt1/f;->F:[Ljava/lang/Object;

    invoke-virtual {p0, p2, v0, v7}, Lt1/f;->A([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p1, Lt1/f;->F:[Ljava/lang/Object;

    .line 29
    iput-object v12, p1, Lt1/f;->G:[Ljava/lang/Object;

    .line 30
    iget p2, p1, Lt1/f;->H:I

    .line 31
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p1, Lt1/f;->H:I

    return v2
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 7

    .line 32
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 33
    :cond_0
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 34
    invoke-virtual {p0}, Lt1/f;->P()I

    move-result v0

    .line 35
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    rsub-int/lit8 v4, v0, 0x20

    .line 36
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v5

    if-lt v4, v5, :cond_1

    .line 37
    iget-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0, v3}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    iput-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    .line 38
    iget v0, p0, Lt1/f;->H:I

    .line 39
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lt1/f;->H:I

    return v2

    .line 40
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v4, v0

    sub-int/2addr v4, v2

    div-int/lit8 v4, v4, 0x20

    .line 41
    new-array v5, v4, [[Ljava/lang/Object;

    .line 42
    iget-object v6, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v6}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v0, v3}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    aput-object v6, v5, v1

    move v0, v2

    :goto_0
    if-ge v0, v4, :cond_2

    .line 43
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v1, v3}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    aput-object v6, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 44
    :cond_2
    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v4

    invoke-virtual {p0, v0, v4, v5}, Lt1/f;->A([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    .line 45
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1, v3}, Lt1/f;->e([Ljava/lang/Object;ILjava/util/Iterator;)V

    iput-object v0, p0, Lt1/f;->G:[Ljava/lang/Object;

    .line 46
    iget v0, p0, Lt1/f;->H:I

    .line 47
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lt1/f;->H:I

    return v2
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lt1/f;->a()I

    move-result v0

    invoke-static {p1, v0}, Lv63/b;->b(II)V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v1, p0, Lt1/f;->F:[Ljava/lang/Object;

    iget v2, p0, Lt1/f;->z:I

    sub-int/2addr p1, v0

    invoke-virtual {p0, v1, v0, v2, p1}, Lt1/f;->L([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Lf93/a;

    iget-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const/4 v4, 0x4

    invoke-direct {v1, v2, v4}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lt1/f;->F:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v4, p0, Lt1/f;->z:I

    invoke-virtual {p0, v2, v4, p1, v1}, Lt1/f;->K([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;

    move-result-object p1

    iget v2, p0, Lt1/f;->z:I

    invoke-virtual {p0, p1, v0, v2, v3}, Lt1/f;->L([Ljava/lang/Object;III)Ljava/lang/Object;

    iget-object p1, v1, Lf93/a;->x:Ljava/lang/Object;

    return-object p1
.end method

.method public final d()Lt1/c;
    .locals 5

    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    iget-object v1, p0, Lt1/f;->x:[Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    iget-object v2, p0, Lt1/f;->y:[Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lt1/f;->w:Lt1/c;

    goto :goto_0

    :cond_0
    new-instance v1, Lw1/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lt1/f;->E:Lw1/b;

    iput-object v0, p0, Lt1/f;->x:[Ljava/lang/Object;

    iget-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    iput-object v1, p0, Lt1/f;->y:[Ljava/lang/Object;

    if-nez v0, :cond_2

    array-length v0, v1

    if-nez v0, :cond_1

    sget-object v0, Lt1/j;->x:Lt1/j;

    goto :goto_0

    :cond_1
    new-instance v0, Lt1/j;

    iget v2, p0, Lt1/f;->H:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lt1/j;-><init>([Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v2, Lt1/e;

    iget v3, p0, Lt1/f;->H:I

    iget v4, p0, Lt1/f;->z:I

    invoke-direct {v2, v0, v1, v3, v4}, Lt1/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    move-object v0, v2

    :goto_0
    iput-object v0, p0, Lt1/f;->w:Lt1/c;

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lt1/f;->a()I

    move-result v0

    invoke-static {p1, v0}, Lv63/b;->b(II)V

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, Lt1/f;->G:[Ljava/lang/Object;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, p0, Lt1/f;->z:I

    :goto_0
    if-lez v1, :cond_1

    invoke-static {p1, v1}, Lwb3/f;->G(II)I

    move-result v2

    aget-object v0, v0, v2

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x5

    goto :goto_0

    :cond_1
    :goto_1
    and-int/lit8 p1, p1, 0x1f

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt1/f;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    shr-int/lit8 v0, p2, 0x5

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v1

    shr-int/lit8 v1, v1, 0x5

    invoke-virtual {p0, v1}, Lt1/f;->o(I)Lt1/a;

    move-result-object v1

    move v3, p5

    move-object v2, p6

    :goto_0
    iget v4, v1, Lt1/a;->w:I

    add-int/lit8 v4, v4, -0x1

    if-eq v4, v0, :cond_0

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Object;

    rsub-int/lit8 v5, p3, 0x20

    const/4 v6, 0x0

    const/16 v7, 0x20

    invoke-static {v6, v5, v7, v4, v2}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {p0, p3, v4}, Lt1/f;->q(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v3, -0x1

    aput-object v2, p4, v3

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, [Ljava/lang/Object;

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result p3

    shr-int/lit8 p3, p3, 0x5

    add-int/lit8 p3, p3, -0x1

    sub-int/2addr p3, v0

    sub-int v7, p5, p3

    if-ge v7, p5, :cond_1

    aget-object p6, p4, v7

    invoke-static {p6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v8, p6

    const/16 v5, 0x20

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v6, p4

    invoke-virtual/range {v1 .. v8}, Lt1/f;->O(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "root is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final l([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;
    .locals 7

    invoke-static {p3, p2}, Lwb3/f;->G(II)I

    move-result v0

    if-nez p2, :cond_0

    const/16 p2, 0x1f

    aget-object p3, p1, p2

    iput-object p3, p5, Lf93/a;->x:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 p5, v0, 0x1

    invoke-static {p5, v0, p2, p1, p3}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p4, p3, v0

    return-object p3

    :cond_0
    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 v3, p2, -0x5

    aget-object p2, p1, v0

    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, [Ljava/lang/Object;

    move-object v1, p0

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lt1/f;->l([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    const/16 p2, 0x20

    if-ge v0, p2, :cond_1

    aget-object p2, p1, v0

    if-eqz p2, :cond_1

    move-object v2, p2

    check-cast v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, v6, Lf93/a;->x:Ljava/lang/Object;

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lt1/f;->l([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lt1/f;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    iget v0, p0, Lt1/f;->H:I

    .line 2
    invoke-static {p1, v0}, Lv63/b;->c(II)V

    .line 3
    new-instance v0, Lt1/h;

    invoke-direct {v0, p0, p1}, Lt1/h;-><init>(Lt1/f;I)V

    return-object v0
.end method

.method public final m([Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 5

    invoke-virtual {p0}, Lt1/f;->P()I

    move-result v0

    iget-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0x20

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lt1/f;->G:[Ljava/lang/Object;

    add-int/lit8 v3, p2, 0x1

    invoke-static {v3, p2, v0, v2, v1}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p3, v1, p2

    iput-object p1, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    iget p1, p0, Lt1/f;->H:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lt1/f;->H:I

    return-void

    :cond_0
    iget-object v0, p0, Lt1/f;->G:[Ljava/lang/Object;

    const/16 v2, 0x1f

    aget-object v3, v0, v2

    add-int/lit8 v4, p2, 0x1

    invoke-static {v4, p2, v2, v0, v1}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p3, v1, p2

    invoke-virtual {p0, v3}, Lt1/f;->t(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Lt1/f;->B([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final n([Ljava/lang/Object;)Z
    .locals 2

    array-length v0, p1

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    aget-object p1, p1, v0

    iget-object v0, p0, Lt1/f;->E:Lw1/b;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(I)Lt1/a;
    .locals 4

    iget-object v0, p0, Lt1/f;->F:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v1

    shr-int/lit8 v1, v1, 0x5

    invoke-static {p1, v1}, Lv63/b;->c(II)V

    iget v2, p0, Lt1/f;->z:I

    if-nez v2, :cond_0

    new-instance v1, Lt1/i;

    invoke-direct {v1, v0, p1}, Lt1/i;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :cond_0
    div-int/lit8 v2, v2, 0x5

    new-instance v3, Lt1/k;

    invoke-direct {v3, v0, p1, v1, v2}, Lt1/k;-><init>([Ljava/lang/Object;III)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid root"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lt1/f;->n([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v0

    array-length v1, p1

    const/16 v2, 0x20

    if-le v1, v2, :cond_2

    move v1, v2

    :cond_2
    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {v3, v1, v2, p1, v0}, Lm83/n;->i0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final q(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lt1/f;->n([Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    rsub-int/lit8 v0, p1, 0x20

    invoke-static {p1, v1, v0, p2, p2}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object p2

    :cond_0
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v0

    rsub-int/lit8 v2, p1, 0x20

    invoke-static {p1, v1, v2, p2, v0}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final r()[Ljava/lang/Object;
    .locals 3

    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0x20

    iget-object v2, p0, Lt1/f;->E:Lw1/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    new-instance v0, Lt1/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lt1/b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, Lt1/f;->I(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    return p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Lt1/f;->a()I

    move-result v0

    invoke-static {p1, v0}, Lv63/b;->b(II)V

    invoke-virtual {p0}, Lt1/f;->M()I

    move-result v0

    if-gt v0, p1, :cond_1

    iget-object v0, p0, Lt1/f;->G:[Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    iget v1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    and-int/lit8 p1, p1, 0x1f

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    iput-object v0, p0, Lt1/f;->G:[Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v7, Lf93/a;

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-direct {v7, v0, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Lt1/f;->F:[Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v4, p0, Lt1/f;->z:I

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-virtual/range {v2 .. v7}, Lt1/f;->N([Ljava/lang/Object;IILjava/lang/Object;Lf93/a;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v2, Lt1/f;->F:[Ljava/lang/Object;

    iget-object p1, v7, Lf93/a;->x:Ljava/lang/Object;

    return-object p1
.end method

.method public final t(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/16 p1, 0x20

    iget-object v1, p0, Lt1/f;->E:Lw1/b;

    aput-object v1, v0, p1

    return-object v0
.end method

.method public final u(II[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "shift should be positive"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_0
    if-nez p2, :cond_1

    return-object p3

    :cond_1
    invoke-static {p1, p2}, Lwb3/f;->G(II)I

    move-result v0

    aget-object v1, p3, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x5

    invoke-virtual {p0, p1, p2, v1}, Lt1/f;->u(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const/16 p2, 0x1f

    if-ge v0, p2, :cond_3

    add-int/lit8 p2, v0, 0x1

    aget-object v1, p3, p2

    if-eqz v1, :cond_3

    invoke-virtual {p0, p3}, Lt1/f;->n([Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    const/16 v2, 0x20

    invoke-static {p3, p2, v2, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    :cond_2
    invoke-virtual {p0}, Lt1/f;->r()[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v2, p2, p3, v1}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    move-object p3, v1

    :cond_3
    aget-object p2, p3, v0

    if-eq p1, p2, :cond_4

    invoke-virtual {p0, p3}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p1, p2, v0

    return-object p2

    :cond_4
    return-object p3
.end method

.method public final v([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;
    .locals 5

    add-int/lit8 v0, p3, -0x1

    invoke-static {v0, p2}, Lwb3/f;->G(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x5

    if-ne p2, v2, :cond_0

    aget-object p2, p1, v0

    iput-object p2, p4, Lf93/a;->x:Ljava/lang/Object;

    move-object p2, v1

    goto :goto_0

    :cond_0
    aget-object v3, p1, v0

    const-string v4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, [Ljava/lang/Object;

    sub-int/2addr p2, v2

    invoke-virtual {p0, v3, p2, p3, p4}, Lt1/f;->v([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p2, p1, v0

    return-object p1
.end method

.method public final w(II[Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p2, :cond_1

    iput-object v1, p0, Lt1/f;->F:[Ljava/lang/Object;

    if-nez p3, :cond_0

    new-array p3, v0, [Ljava/lang/Object;

    :cond_0
    iput-object p3, p0, Lt1/f;->G:[Ljava/lang/Object;

    iput p1, p0, Lt1/f;->H:I

    iput p2, p0, Lt1/f;->z:I

    return-void

    :cond_1
    new-instance v2, Lf93/a;

    const/4 v3, 0x4

    invoke-direct {v2, v1, v3}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, p3, p2, p1, v2}, Lt1/f;->v([Ljava/lang/Object;IILf93/a;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v2, Lf93/a;->x:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, p0, Lt1/f;->G:[Ljava/lang/Object;

    iput p1, p0, Lt1/f;->H:I

    const/4 p1, 0x1

    aget-object p1, p3, p1

    if-nez p1, :cond_2

    aget-object p1, p3, v0

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, Lt1/f;->F:[Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x5

    iput p2, p0, Lt1/f;->z:I

    return-void

    :cond_2
    iput-object p3, p0, Lt1/f;->F:[Ljava/lang/Object;

    iput p2, p0, Lt1/f;->z:I

    return-void
.end method

.method public final z([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;
    .locals 4

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "invalid buffersIterator"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p3, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    if-nez v2, :cond_2

    const-string v2, "negative shift"

    invoke-static {v2}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_2
    if-nez p3, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1

    :cond_3
    invoke-virtual {p0, p1}, Lt1/f;->p([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3}, Lwb3/f;->G(II)I

    move-result v2

    aget-object v3, p1, v2

    check-cast v3, [Ljava/lang/Object;

    add-int/lit8 p3, p3, -0x5

    invoke-virtual {p0, v3, p2, p3, p4}, Lt1/f;->z([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v2

    :goto_1
    add-int/2addr v2, v1

    const/16 p2, 0x20

    if-ge v2, p2, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    aget-object p2, p1, v2

    check-cast p2, [Ljava/lang/Object;

    invoke-virtual {p0, p2, v0, p3, p4}, Lt1/f;->z([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v2

    goto :goto_1

    :cond_4
    return-object p1
.end method
