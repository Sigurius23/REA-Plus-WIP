.class public final Lio/d;
.super Lio/k;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final E:I

.field public final F:Z

.field public final G:Ljava/lang/String;

.field public final H:Lio/f;

.field public final I:Z

.field public final J:I

.field public final K:I

.field public final L:I

.field public final M:Z

.field public final N:I

.field public final O:I

.field public final P:Z

.field public final Q:I

.field public final R:I

.field public final S:I

.field public final T:I

.field public final U:Z

.field public final V:Z


# direct methods
.method public constructor <init>(ILsn/w0;ILio/f;IZ)V
    .locals 5

    invoke-direct {p0, p1, p2, p3}, Lio/k;-><init>(ILsn/w0;I)V

    iput-object p4, p0, Lio/d;->H:Lio/f;

    iget-object p1, p0, Lio/k;->z:Lrm/c0;

    iget-object p1, p1, Lrm/c0;->y:Ljava/lang/String;

    invoke-static {p1}, Lio/m;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/d;->G:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p5, p1}, Lio/m;->b(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lio/d;->I:Z

    move p2, p1

    :goto_0
    iget-object p3, p4, Lio/w;->N:Lzr/g0;

    iget-object v0, p4, Lio/w;->R:Lzr/g0;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    const v1, 0x7fffffff

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Lio/k;->z:Lrm/c0;

    iget-object v2, p4, Lio/w;->N:Lzr/g0;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p3, v2, p1}, Lio/m;->a(Lrm/c0;Ljava/lang/String;Z)I

    move-result p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    move p3, p1

    move p2, v1

    :goto_1
    iput p2, p0, Lio/d;->K:I

    iput p3, p0, Lio/d;->J:I

    iget-object p2, p0, Lio/k;->z:Lrm/c0;

    iget p2, p2, Lrm/c0;->E:I

    iget p3, p4, Lio/w;->O:I

    if-eqz p2, :cond_2

    if-ne p2, p3, :cond_2

    move p2, v1

    goto :goto_2

    :cond_2
    and-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    :goto_2
    iput p2, p0, Lio/d;->L:I

    iget-object p2, p0, Lio/k;->z:Lrm/c0;

    iget p3, p2, Lrm/c0;->E:I

    const/4 v2, 0x1

    if-eqz p3, :cond_4

    and-int/2addr p3, v2

    if-eqz p3, :cond_3

    goto :goto_3

    :cond_3
    move p3, p1

    goto :goto_4

    :cond_4
    :goto_3
    move p3, v2

    :goto_4
    iput-boolean p3, p0, Lio/d;->M:Z

    iget p3, p2, Lrm/c0;->z:I

    and-int/2addr p3, v2

    if-eqz p3, :cond_5

    move p3, v2

    goto :goto_5

    :cond_5
    move p3, p1

    :goto_5
    iput-boolean p3, p0, Lio/d;->P:Z

    iget p3, p2, Lrm/c0;->Y:I

    iput p3, p0, Lio/d;->Q:I

    iget v3, p2, Lrm/c0;->Z:I

    iput v3, p0, Lio/d;->R:I

    iget p2, p2, Lrm/c0;->H:I

    iput p2, p0, Lio/d;->S:I

    const/4 v3, -0x1

    if-eq p2, v3, :cond_6

    iget v4, p4, Lio/w;->Q:I

    if-gt p2, v4, :cond_7

    :cond_6
    if-eq p3, v3, :cond_8

    iget p2, p4, Lio/w;->P:I

    if-gt p3, p2, :cond_7

    goto :goto_6

    :cond_7
    move p2, p1

    goto :goto_7

    :cond_8
    :goto_6
    move p2, v2

    :goto_7
    iput-boolean p2, p0, Lio/d;->F:Z

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    sget p3, Llo/y;->a:I

    const/16 p4, 0x18

    if-lt p3, p4, :cond_9

    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object p2

    const-string p3, ","

    invoke-virtual {p2, p3, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    goto :goto_9

    :cond_9
    iget-object p2, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    const/16 p4, 0x15

    if-lt p3, p4, :cond_a

    invoke-virtual {p2}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p2

    goto :goto_8

    :cond_a
    invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_8
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    :goto_9
    move p3, p1

    :goto_a
    array-length p4, p2

    if-ge p3, p4, :cond_b

    aget-object p4, p2, p3

    invoke-static {p4}, Llo/y;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    aput-object p4, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_a

    :cond_b
    move p3, p1

    :goto_b
    array-length p4, p2

    if-ge p3, p4, :cond_d

    iget-object p4, p0, Lio/k;->z:Lrm/c0;

    aget-object v4, p2, p3

    invoke-static {p4, v4, p1}, Lio/m;->a(Lrm/c0;Ljava/lang/String;Z)I

    move-result p4

    if-lez p4, :cond_c

    goto :goto_c

    :cond_c
    add-int/lit8 p3, p3, 0x1

    goto :goto_b

    :cond_d
    move p4, p1

    move p3, v1

    :goto_c
    iput p3, p0, Lio/d;->N:I

    iput p4, p0, Lio/d;->O:I

    move p2, p1

    :goto_d
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_f

    iget-object p3, p0, Lio/k;->z:Lrm/c0;

    iget-object p3, p3, Lrm/c0;->L:Ljava/lang/String;

    if-eqz p3, :cond_e

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    move v1, p2

    goto :goto_e

    :cond_e
    add-int/lit8 p2, p2, 0x1

    goto :goto_d

    :cond_f
    :goto_e
    iput v1, p0, Lio/d;->T:I

    and-int/lit16 p2, p5, 0x80

    const/16 p3, 0x80

    if-ne p2, p3, :cond_10

    move p2, v2

    goto :goto_f

    :cond_10
    move p2, p1

    :goto_f
    iput-boolean p2, p0, Lio/d;->U:Z

    and-int/lit8 p2, p5, 0x40

    const/16 p3, 0x40

    if-ne p2, p3, :cond_11

    move p2, v2

    goto :goto_10

    :cond_11
    move p2, p1

    :goto_10
    iput-boolean p2, p0, Lio/d;->V:Z

    iget-boolean p2, p0, Lio/d;->F:Z

    iget-object p3, p0, Lio/d;->H:Lio/f;

    iget-boolean p4, p3, Lio/f;->j0:Z

    invoke-static {p5, p4}, Lio/m;->b(IZ)Z

    move-result p4

    if-nez p4, :cond_12

    goto :goto_11

    :cond_12
    if-nez p2, :cond_13

    iget-boolean p4, p3, Lio/f;->e0:Z

    if-nez p4, :cond_13

    goto :goto_11

    :cond_13
    invoke-static {p5, p1}, Lio/m;->b(IZ)Z

    move-result p1

    if-eqz p1, :cond_15

    if-eqz p2, :cond_15

    iget-object p1, p0, Lio/k;->z:Lrm/c0;

    iget p1, p1, Lrm/c0;->H:I

    if-eq p1, v3, :cond_15

    iget-boolean p1, p3, Lio/w;->W:Z

    if-nez p1, :cond_15

    iget-boolean p1, p3, Lio/w;->V:Z

    if-nez p1, :cond_15

    iget-boolean p1, p3, Lio/f;->l0:Z

    if-nez p1, :cond_14

    if-nez p6, :cond_15

    :cond_14
    const/4 p1, 0x2

    goto :goto_11

    :cond_15
    move p1, v2

    :goto_11
    iput p1, p0, Lio/d;->E:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lio/d;->E:I

    return v0
.end method

.method public final b(Lio/k;)Z
    .locals 6

    check-cast p1, Lio/d;

    iget-object v0, p1, Lio/k;->z:Lrm/c0;

    iget-object v1, p0, Lio/d;->H:Lio/f;

    iget-boolean v2, v1, Lio/f;->h0:Z

    const/4 v3, -0x1

    iget-object v4, p0, Lio/k;->z:Lrm/c0;

    if-nez v2, :cond_0

    iget v2, v4, Lrm/c0;->Y:I

    if-eq v2, v3, :cond_3

    iget v5, v0, Lrm/c0;->Y:I

    if-ne v2, v5, :cond_3

    :cond_0
    iget-boolean v2, v1, Lio/f;->f0:Z

    if-nez v2, :cond_1

    iget-object v2, v4, Lrm/c0;->L:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v5, v0, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iget-boolean v2, v1, Lio/f;->g0:Z

    if-nez v2, :cond_2

    iget v2, v4, Lrm/c0;->Z:I

    if-eq v2, v3, :cond_3

    iget v0, v0, Lrm/c0;->Z:I

    if-ne v2, v0, :cond_3

    :cond_2
    iget-boolean v0, v1, Lio/f;->i0:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lio/d;->U:Z

    iget-boolean v1, p1, Lio/d;->U:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lio/d;->V:Z

    iget-boolean p1, p1, Lio/d;->V:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final c(Lio/d;)I
    .locals 7

    iget-boolean v0, p0, Lio/d;->I:Z

    iget-boolean v1, p0, Lio/d;->F:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v2, Lio/m;->e:Lzr/v0;

    goto :goto_0

    :cond_0
    sget-object v2, Lio/m;->e:Lzr/v0;

    invoke-virtual {v2}, Lzr/v0;->a()Lzr/v0;

    move-result-object v2

    :goto_0
    iget-boolean v3, p1, Lio/d;->I:Z

    iget v4, p1, Lio/d;->S:I

    sget-object v5, Lzr/y;->a:Lzr/w;

    invoke-virtual {v5, v0, v3}, Lzr/w;->c(ZZ)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->K:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v5, p1, Lio/d;->K:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, Lzr/u0;->y:Lzr/u0;

    invoke-virtual {v0, v3, v5, v6}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->J:I

    iget v5, p1, Lio/d;->J:I

    invoke-virtual {v0, v3, v5}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->L:I

    iget v5, p1, Lio/d;->L:I

    invoke-virtual {v0, v3, v5}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    iget-boolean v3, p0, Lio/d;->P:Z

    iget-boolean v5, p1, Lio/d;->P:Z

    invoke-virtual {v0, v3, v5}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    iget-boolean v3, p0, Lio/d;->M:Z

    iget-boolean v5, p1, Lio/d;->M:Z

    invoke-virtual {v0, v3, v5}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->N:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v5, p1, Lio/d;->N:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v3, v5, v6}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->O:I

    iget v5, p1, Lio/d;->O:I

    invoke-virtual {v0, v3, v5}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    iget-boolean v3, p1, Lio/d;->F:Z

    invoke-virtual {v0, v1, v3}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    iget v1, p0, Lio/d;->T:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v3, p1, Lio/d;->T:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3, v6}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget v1, p0, Lio/d;->S:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lio/d;->H:Lio/f;

    iget-boolean v6, v6, Lio/w;->V:Z

    if-eqz v6, :cond_1

    sget-object v6, Lio/m;->e:Lzr/v0;

    invoke-virtual {v6}, Lzr/v0;->a()Lzr/v0;

    move-result-object v6

    goto :goto_1

    :cond_1
    sget-object v6, Lio/m;->f:Lzr/v0;

    :goto_1
    invoke-virtual {v0, v3, v5, v6}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget-boolean v3, p0, Lio/d;->U:Z

    iget-boolean v5, p1, Lio/d;->U:Z

    invoke-virtual {v0, v3, v5}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    iget-boolean v3, p0, Lio/d;->V:Z

    iget-boolean v5, p1, Lio/d;->V:Z

    invoke-virtual {v0, v3, v5}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->Q:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v5, p1, Lio/d;->Q:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v3, v5, v2}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget v3, p0, Lio/d;->R:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v5, p1, Lio/d;->R:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v3, v5, v2}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lio/d;->G:Ljava/lang/String;

    iget-object p1, p1, Lio/d;->G:Ljava/lang/String;

    invoke-static {v4, p1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v2, Lio/m;->f:Lzr/v0;

    :goto_2
    invoke-virtual {v0, v1, v3, v2}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-virtual {p1}, Lzr/y;->e()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lio/d;

    invoke-virtual {p0, p1}, Lio/d;->c(Lio/d;)I

    move-result p1

    return p1
.end method
