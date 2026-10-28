.class public abstract Lb3/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-class v5, Landroid/util/Size;

    const-class v6, Landroid/util/SizeF;

    const-class v0, Ljava/io/Serializable;

    const-class v1, Landroid/os/Parcelable;

    const-class v2, Ljava/lang/String;

    const-class v3, Landroid/util/SparseArray;

    const-class v4, Landroid/os/Binder;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lb3/o0;->a:[Ljava/lang/Class;

    return-void
.end method

.method public static final a(Li3/p;)Z
    .locals 1

    invoke-virtual {p0}, Li3/p;->k()Li3/l;

    move-result-object p0

    sget-object v0, Li3/u;->i:Li3/y;

    iget-object p0, p0, Li3/l;->w:La0/v0;

    invoke-virtual {p0, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final b(Lb3/a;Landroidx/lifecycle/x;)La3/m0;
    .locals 2

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lb3/i3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb3/i3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p0, La3/m0;

    const/4 v1, 0x3

    invoke-direct {p0, v1, p1, v0}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot configure "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to disposeComposition at Lifecycle ON_DESTROY: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "is already destroyed"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final c(Li3/p;Landroid/content/res/Resources;)Z
    .locals 3

    iget-object v0, p0, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->a:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_1
    const/4 v0, 0x1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    invoke-static {p0}, Lb3/o0;->j(Li3/p;)Ll3/g;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {p0, p1}, Lb3/o0;->i(Li3/p;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {p0}, Lb3/o0;->h(Li3/p;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move p1, v2

    goto :goto_1

    :cond_3
    :goto_0
    move p1, v0

    :goto_1
    invoke-static {p0}, Li3/s;->e(Li3/p;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Li3/p;->d:Li3/l;

    iget-boolean v1, v1, Li3/l;->y:Z

    if-nez v1, :cond_4

    invoke-virtual {p0}, Li3/p;->p()Z

    move-result p0

    if-eqz p0, :cond_5

    if-eqz p1, :cond_5

    :cond_4
    return v0

    :cond_5
    return v2
.end method

.method public static final d(Li3/p;Li5/f;)V
    .locals 4

    iget-object v0, p0, Li3/p;->d:Li3/l;

    iget-object v1, v0, Li3/l;->w:La0/v0;

    sget-object v2, Li3/u;->x:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Li3/i;

    invoke-static {p0}, Lb3/o0;->a(Li3/p;)Z

    move-result p0

    if-eqz p0, :cond_a

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget p0, v0, Li3/i;->a:I

    const/16 v0, 0x8

    if-ne p0, v0, :cond_2

    goto :goto_2

    :cond_2
    :goto_0
    sget-object p0, Li3/k;->x:Li3/y;

    invoke-virtual {v1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_3

    move-object p0, v2

    :cond_3
    check-cast p0, Li3/a;

    if-eqz p0, :cond_4

    new-instance v0, Li5/d;

    const v3, 0x1020046

    iget-object p0, p0, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v0, v3, p0}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Li5/f;->b(Li5/d;)V

    :cond_4
    sget-object p0, Li3/k;->z:Li3/y;

    invoke-virtual {v1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_5

    move-object p0, v2

    :cond_5
    check-cast p0, Li3/a;

    if-eqz p0, :cond_6

    new-instance v0, Li5/d;

    const v3, 0x1020047

    iget-object p0, p0, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v0, v3, p0}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Li5/f;->b(Li5/d;)V

    :cond_6
    sget-object p0, Li3/k;->y:Li3/y;

    invoke-virtual {v1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_7

    move-object p0, v2

    :cond_7
    check-cast p0, Li3/a;

    if-eqz p0, :cond_8

    new-instance v0, Li5/d;

    const v3, 0x1020048

    iget-object p0, p0, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v0, v3, p0}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Li5/f;->b(Li5/d;)V

    :cond_8
    sget-object p0, Li3/k;->A:Li3/y;

    invoke-virtual {v1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_9

    goto :goto_1

    :cond_9
    move-object v2, p0

    :goto_1
    check-cast v2, Li3/a;

    if-eqz v2, :cond_a

    new-instance p0, Li5/d;

    const v0, 0x1020049

    iget-object v1, v2, Li3/a;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, p0}, Li5/f;->b(Li5/d;)V

    :cond_a
    :goto_2
    return-void
.end method

.method public static final e(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p0, Lz1/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lz1/n;

    invoke-interface {p0}, Lz1/n;->h()Lp1/o2;

    move-result-object v0

    sget-object v2, Lp1/v0;->y:Lp1/v0;

    if-eq v0, v2, :cond_0

    invoke-interface {p0}, Lz1/n;->h()Lp1/o2;

    move-result-object v0

    sget-object v2, Lp1/v0;->F:Lp1/v0;

    if-eq v0, v2, :cond_0

    invoke-interface {p0}, Lz1/n;->h()Lp1/o2;

    move-result-object v0

    sget-object v2, Lp1/v0;->z:Lp1/v0;

    if-ne v0, v2, :cond_5

    :cond_0
    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lb3/o0;->e(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    instance-of v0, p0, Ll83/e;

    if-eqz v0, :cond_3

    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_3

    return v1

    :cond_3
    move v0, v1

    :goto_0
    const/4 v2, 0x7

    if-ge v0, v2, :cond_5

    sget-object v2, Lb3/o0;->a:[Ljava/lang/Class;

    aget-object v2, v2, v0

    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return v1
.end method

.method public static final f([FI[FI)F
    .locals 3

    const/4 v0, 0x4

    mul-int/2addr p1, v0

    aget v1, p0, p1

    aget v2, p2, p3

    mul-float/2addr v1, v2

    add-int/lit8 v2, p1, 0x1

    aget v2, p0, v2

    add-int/2addr v0, p3

    aget v0, p2, v0

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    add-int/lit8 v0, p1, 0x2

    aget v0, p0, v0

    const/16 v1, 0x8

    add-int/2addr v1, p3

    aget v1, p2, v1

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    add-int/lit8 p1, p1, 0x3

    aget p0, p0, p1

    const/16 p1, 0xc

    add-int/2addr p1, p3

    aget p1, p2, p1

    mul-float/2addr p0, p1

    add-float/2addr p0, v0

    return p0
.end method

.method public static final g(Ljava/util/ArrayList;I)Lb3/v2;
    .locals 3

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/v2;

    invoke-virtual {v2}, Lb3/v2;->a()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/v2;

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final h(Li3/p;)Z
    .locals 4

    iget-object v0, p0, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->a:Li3/y;

    sget-object v1, Li3/u;->I:Li3/y;

    invoke-static {v0, v1}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk3/a;

    iget-object p0, p0, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->x:Li3/y;

    invoke-static {p0, v1}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/i;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v3, Li3/u;->H:Li3/y;

    invoke-static {p0, v3}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_3

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget p0, v1, Li3/i;->a:I

    const/4 v1, 0x4

    if-ne p0, v1, :cond_2

    return v0

    :cond_2
    :goto_1
    return v2

    :cond_3
    return v0
.end method

.method public static final i(Li3/p;Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Li3/p;->d:Li3/l;

    iget-object v1, p0, Li3/p;->d:Li3/l;

    sget-object v2, Li3/u;->b:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    :cond_0
    iget-object v3, v1, Li3/l;->w:La0/v0;

    sget-object v4, Li3/u;->I:Li3/y;

    invoke-virtual {v3, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    move-object v4, v2

    :cond_1
    check-cast v4, Lk3/a;

    sget-object v5, Li3/u;->x:Li3/y;

    invoke-virtual {v3, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v5, v2

    :cond_2
    check-cast v5, Li3/i;

    const/4 v6, 0x1

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v7, 0x2

    if-eqz v4, :cond_6

    if-eq v4, v6, :cond_4

    if-ne v4, v7, :cond_3

    if-nez v0, :cond_8

    const v0, 0x7f1406dc

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    iget v4, v5, Li3/i;->a:I

    if-ne v4, v7, :cond_8

    if-nez v0, :cond_8

    const v0, 0x7f140d4b

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_6
    if-nez v5, :cond_7

    goto :goto_0

    :cond_7
    iget v4, v5, Li3/i;->a:I

    if-ne v4, v7, :cond_8

    if-nez v0, :cond_8

    const v0, 0x7f140d4c

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_8
    :goto_0
    sget-object v4, Li3/u;->H:Li3/y;

    invoke-virtual {v3, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_9

    move-object v4, v2

    :cond_9
    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v5, :cond_a

    goto :goto_1

    :cond_a
    iget v5, v5, Li3/i;->a:I

    const/4 v7, 0x4

    if-ne v5, v7, :cond_b

    goto :goto_2

    :cond_b
    :goto_1
    if-nez v0, :cond_d

    if-eqz v4, :cond_c

    const v0, 0x7f140b5c

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_c
    const v0, 0x7f140966

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_d
    :goto_2
    sget-object v4, Li3/u;->c:Li3/y;

    invoke-virtual {v3, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_e

    move-object v4, v2

    :cond_e
    check-cast v4, Li3/h;

    if-eqz v4, :cond_15

    sget-object v5, Li3/h;->d:Li3/h;

    if-eq v4, v5, :cond_14

    if-nez v0, :cond_15

    iget-object v0, v4, Li3/h;->b:Li93/f;

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v5, v7

    const/4 v7, 0x0

    cmpg-float v5, v5, v7

    if-nez v5, :cond_f

    move v4, v7

    goto :goto_3

    :cond_f
    iget v4, v4, Li3/h;->a:F

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sub-float/2addr v5, v0

    div-float/2addr v4, v5

    :goto_3
    cmpg-float v0, v4, v7

    if-gez v0, :cond_10

    move v4, v7

    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v5, v4, v0

    if-lez v5, :cond_11

    move v4, v0

    :cond_11
    cmpg-float v5, v4, v7

    if-nez v5, :cond_12

    const/4 v0, 0x0

    goto :goto_4

    :cond_12
    cmpg-float v0, v4, v0

    const/16 v5, 0x64

    if-nez v0, :cond_13

    move v0, v5

    goto :goto_4

    :cond_13
    int-to-float v0, v5

    mul-float/2addr v4, v0

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v4, 0x63

    invoke-static {v0, v6, v4}, Le93/b;->n(III)I

    move-result v0

    :goto_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v4, 0x7f14117f

    invoke-virtual {p1, v4, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_14
    if-nez v0, :cond_15

    const v0, 0x7f1406d5

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_15
    :goto_5
    sget-object v4, Li3/u;->E:Li3/y;

    invoke-virtual {v3, v4}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    new-instance v0, Li3/p;

    iget-object v3, p0, Li3/p;->a:Lb2/v;

    iget-object p0, p0, Li3/p;->c:La3/n0;

    invoke-direct {v0, v3, v6, p0, v1}, Li3/p;-><init>(Lb2/v;ZLa3/n0;Li3/l;)V

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object p0

    iget-object p0, p0, Li3/l;->w:La0/v0;

    sget-object v0, Li3/u;->a:Li3/y;

    invoke-virtual {p0, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_16

    move-object v0, v2

    :cond_16
    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_17

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    :cond_17
    sget-object v0, Li3/u;->A:Li3/y;

    invoke-virtual {p0, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_18

    move-object v0, v2

    :cond_18
    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_19

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    :cond_19
    invoke-virtual {p0, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1a

    move-object p0, v2

    :cond_1a
    check-cast p0, Ljava/lang/CharSequence;

    if-eqz p0, :cond_1b

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_1c

    :cond_1b
    const p0, 0x7f140d4a

    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_1c
    move-object v0, v2

    :cond_1d
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static final j(Li3/p;)Ll3/g;
    .locals 2

    iget-object v0, p0, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->a:Li3/y;

    sget-object v1, Li3/u;->E:Li3/y;

    invoke-static {v0, v1}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/g;

    iget-object p0, p0, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->A:Li3/y;

    invoke-static {p0, v1}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll3/g;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static k()Z
    .locals 5

    :try_start_0
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "android.os.SystemProperties"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    :cond_0
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->i1:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    if-eqz v0, :cond_1

    const-string v2, "getBoolean"

    const-class v3, Ljava/lang/String;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->i1:Ljava/lang/reflect/Method;

    :cond_2
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->i1:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3

    const-string v2, "debug.layout"

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    instance-of v2, v0, Ljava/lang/Boolean;

    if-eqz v2, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final l(Li3/l;)Ll3/r0;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Li3/k;->a:Li3/y;

    iget-object p0, p0, Li3/l;->w:La0/v0;

    invoke-virtual {p0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    move-object p0, v1

    :cond_0
    check-cast p0, Li3/a;

    if-eqz p0, :cond_1

    iget-object p0, p0, Li3/a;->b:Ll83/e;

    check-cast p0, Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_1

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll3/r0;

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final m([F[F)Z
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/4 v3, 0x0

    const/16 v4, 0x10

    if-lt v2, v4, :cond_0

    array-length v2, v1

    if-ge v2, v4, :cond_1

    :cond_0
    move/from16 v19, v3

    goto/16 :goto_2

    :cond_1
    aget v2, v0, v3

    const/4 v4, 0x1

    aget v5, v0, v4

    const/4 v6, 0x2

    aget v7, v0, v6

    const/4 v8, 0x3

    aget v9, v0, v8

    const/4 v10, 0x4

    aget v11, v0, v10

    const/4 v12, 0x5

    aget v13, v0, v12

    const/4 v14, 0x6

    aget v15, v0, v14

    const/16 v16, 0x7

    aget v17, v0, v16

    const/16 v18, 0x8

    move/from16 v19, v3

    aget v3, v0, v18

    const/16 v20, 0x9

    move/from16 v21, v4

    aget v4, v0, v20

    const/16 v22, 0xa

    aget v23, v0, v22

    const/16 v24, 0xb

    aget v25, v0, v24

    const/16 v26, 0xc

    move/from16 v27, v6

    aget v6, v0, v26

    const/16 v28, 0xd

    aget v29, v0, v28

    const/16 v30, 0xe

    aget v31, v0, v30

    const/16 v32, 0xf

    aget v0, v0, v32

    mul-float v33, v2, v13

    mul-float v34, v5, v11

    sub-float v33, v33, v34

    mul-float v34, v2, v15

    mul-float v35, v7, v11

    sub-float v34, v34, v35

    mul-float v35, v2, v17

    mul-float v36, v9, v11

    sub-float v35, v35, v36

    mul-float v36, v5, v15

    mul-float v37, v7, v13

    sub-float v36, v36, v37

    mul-float v37, v5, v17

    mul-float v38, v9, v13

    sub-float v37, v37, v38

    mul-float v38, v7, v17

    mul-float v39, v9, v15

    sub-float v38, v38, v39

    mul-float v39, v3, v29

    mul-float v40, v4, v6

    sub-float v39, v39, v40

    mul-float v40, v3, v31

    mul-float v41, v23, v6

    sub-float v40, v40, v41

    mul-float v41, v3, v0

    mul-float v42, v25, v6

    sub-float v41, v41, v42

    mul-float v42, v4, v31

    mul-float v43, v23, v29

    sub-float v42, v42, v43

    mul-float v43, v4, v0

    mul-float v44, v25, v29

    sub-float v43, v43, v44

    mul-float v44, v23, v0

    mul-float v45, v25, v31

    sub-float v44, v44, v45

    mul-float v45, v33, v44

    mul-float v46, v34, v43

    sub-float v45, v45, v46

    mul-float v46, v35, v42

    add-float v46, v46, v45

    mul-float v45, v36, v41

    add-float v45, v45, v46

    mul-float v46, v37, v40

    sub-float v45, v45, v46

    mul-float v46, v38, v39

    add-float v46, v46, v45

    const/16 v45, 0x0

    cmpg-float v45, v46, v45

    if-nez v45, :cond_2

    goto/16 :goto_0

    :cond_2
    const/high16 v47, 0x3f800000    # 1.0f

    div-float v47, v47, v46

    mul-float v46, v13, v44

    mul-float v48, v15, v43

    sub-float v46, v46, v48

    mul-float v48, v17, v42

    add-float v48, v48, v46

    mul-float v48, v48, v47

    aput v48, v1, v19

    move/from16 v46, v8

    neg-float v8, v5

    mul-float v8, v8, v44

    mul-float v48, v7, v43

    add-float v48, v48, v8

    mul-float v8, v9, v42

    sub-float v48, v48, v8

    mul-float v48, v48, v47

    aput v48, v1, v21

    mul-float v8, v29, v38

    mul-float v48, v31, v37

    sub-float v8, v8, v48

    mul-float v48, v0, v36

    add-float v48, v48, v8

    mul-float v48, v48, v47

    aput v48, v1, v27

    neg-float v8, v4

    mul-float v8, v8, v38

    mul-float v27, v23, v37

    add-float v27, v27, v8

    mul-float v8, v25, v36

    sub-float v27, v27, v8

    mul-float v27, v27, v47

    aput v27, v1, v46

    neg-float v8, v11

    mul-float v27, v8, v44

    mul-float v46, v15, v41

    add-float v46, v46, v27

    mul-float v27, v17, v40

    sub-float v46, v46, v27

    mul-float v46, v46, v47

    aput v46, v1, v10

    mul-float v44, v44, v2

    mul-float v10, v7, v41

    sub-float v44, v44, v10

    mul-float v10, v9, v40

    add-float v10, v10, v44

    mul-float v10, v10, v47

    aput v10, v1, v12

    neg-float v10, v6

    mul-float v12, v10, v38

    mul-float v27, v31, v35

    add-float v27, v27, v12

    mul-float v12, v0, v34

    sub-float v27, v27, v12

    mul-float v27, v27, v47

    aput v27, v1, v14

    mul-float v38, v38, v3

    mul-float v12, v23, v35

    sub-float v38, v38, v12

    mul-float v12, v25, v34

    add-float v12, v12, v38

    mul-float v12, v12, v47

    aput v12, v1, v16

    mul-float v11, v11, v43

    mul-float v12, v13, v41

    sub-float/2addr v11, v12

    mul-float v17, v17, v39

    add-float v17, v17, v11

    mul-float v17, v17, v47

    aput v17, v1, v18

    neg-float v11, v2

    mul-float v11, v11, v43

    mul-float v41, v41, v5

    add-float v41, v41, v11

    mul-float v9, v9, v39

    sub-float v41, v41, v9

    mul-float v41, v41, v47

    aput v41, v1, v20

    mul-float v6, v6, v37

    mul-float v9, v29, v35

    sub-float/2addr v6, v9

    mul-float v0, v0, v33

    add-float/2addr v0, v6

    mul-float v0, v0, v47

    aput v0, v1, v22

    neg-float v0, v3

    mul-float v0, v0, v37

    mul-float v35, v35, v4

    add-float v35, v35, v0

    mul-float v25, v25, v33

    sub-float v35, v35, v25

    mul-float v35, v35, v47

    aput v35, v1, v24

    mul-float v8, v8, v42

    mul-float v13, v13, v40

    add-float/2addr v13, v8

    mul-float v15, v15, v39

    sub-float/2addr v13, v15

    mul-float v13, v13, v47

    aput v13, v1, v26

    mul-float v2, v2, v42

    mul-float v5, v5, v40

    sub-float/2addr v2, v5

    mul-float v7, v7, v39

    add-float/2addr v7, v2

    mul-float v7, v7, v47

    aput v7, v1, v28

    mul-float v10, v10, v36

    mul-float v29, v29, v34

    add-float v29, v29, v10

    mul-float v31, v31, v33

    sub-float v29, v29, v31

    mul-float v29, v29, v47

    aput v29, v1, v30

    mul-float v3, v3, v36

    mul-float v4, v4, v34

    sub-float/2addr v3, v4

    mul-float v23, v23, v33

    add-float v23, v23, v3

    mul-float v23, v23, v47

    aput v23, v1, v32

    :goto_0
    if-nez v45, :cond_3

    move/from16 v3, v21

    goto :goto_1

    :cond_3
    move/from16 v3, v19

    :goto_1
    xor-int/lit8 v0, v3, 0x1

    return v0

    :goto_2
    return v19
.end method

.method public static final n([F[F)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Lb3/o0;->f([FI[FI)F

    move-result v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v4}, Lb3/o0;->f([FI[FI)F

    move-result v5

    const/4 v6, 0x2

    invoke-static {v1, v2, v0, v6}, Lb3/o0;->f([FI[FI)F

    move-result v7

    const/4 v8, 0x3

    invoke-static {v1, v2, v0, v8}, Lb3/o0;->f([FI[FI)F

    move-result v9

    invoke-static {v1, v4, v0, v2}, Lb3/o0;->f([FI[FI)F

    move-result v10

    invoke-static {v1, v4, v0, v4}, Lb3/o0;->f([FI[FI)F

    move-result v11

    invoke-static {v1, v4, v0, v6}, Lb3/o0;->f([FI[FI)F

    move-result v12

    invoke-static {v1, v4, v0, v8}, Lb3/o0;->f([FI[FI)F

    move-result v13

    invoke-static {v1, v6, v0, v2}, Lb3/o0;->f([FI[FI)F

    move-result v14

    invoke-static {v1, v6, v0, v4}, Lb3/o0;->f([FI[FI)F

    move-result v15

    invoke-static {v1, v6, v0, v6}, Lb3/o0;->f([FI[FI)F

    move-result v16

    invoke-static {v1, v6, v0, v8}, Lb3/o0;->f([FI[FI)F

    move-result v17

    invoke-static {v1, v8, v0, v2}, Lb3/o0;->f([FI[FI)F

    move-result v18

    invoke-static {v1, v8, v0, v4}, Lb3/o0;->f([FI[FI)F

    move-result v19

    invoke-static {v1, v8, v0, v6}, Lb3/o0;->f([FI[FI)F

    move-result v20

    invoke-static {v1, v8, v0, v8}, Lb3/o0;->f([FI[FI)F

    move-result v1

    aput v3, v0, v2

    aput v5, v0, v4

    aput v7, v0, v6

    aput v9, v0, v8

    const/4 v2, 0x4

    aput v10, v0, v2

    const/4 v2, 0x5

    aput v11, v0, v2

    const/4 v2, 0x6

    aput v12, v0, v2

    const/4 v2, 0x7

    aput v13, v0, v2

    const/16 v2, 0x8

    aput v14, v0, v2

    const/16 v2, 0x9

    aput v15, v0, v2

    const/16 v2, 0xa

    aput v16, v0, v2

    const/16 v2, 0xb

    aput v17, v0, v2

    const/16 v2, 0xc

    aput v18, v0, v2

    const/16 v2, 0xd

    aput v19, v0, v2

    const/16 v2, 0xe

    aput v20, v0, v2

    const/16 v2, 0xf

    aput v1, v0, v2

    return-void
.end method

.method public static final o(Lb3/h1;I)Lb4/l;
    .locals 3

    invoke-virtual {p0}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/n0;

    iget v2, v2, La3/n0;->x:I

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb4/l;

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static final p(I)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "android.widget.Button"

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    const-string p0, "android.widget.CheckBox"

    return-object p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    const-string p0, "android.widget.RadioButton"

    return-object p0

    :cond_2
    const/4 v0, 0x5

    if-ne p0, v0, :cond_3

    const-string p0, "android.widget.ImageView"

    return-object p0

    :cond_3
    const/4 v0, 0x6

    if-ne p0, v0, :cond_4

    const-string p0, "android.widget.Spinner"

    return-object p0

    :cond_4
    const/4 v0, 0x7

    if-ne p0, v0, :cond_5

    const-string p0, "android.widget.NumberPicker"

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method
