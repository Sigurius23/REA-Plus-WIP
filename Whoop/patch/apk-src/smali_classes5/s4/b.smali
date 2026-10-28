.class public abstract Ls4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static A(Landroid/graphics/drawable/Drawable;FF)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    return-void
.end method

.method public static B(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    return-void
.end method

.method public static C(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
    .locals 5

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eq p1, v0, :cond_9

    if-nez p1, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_4

    :cond_0
    instance-of v1, p1, Landroid/text/Spanned;

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_2

    move v3, v2

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_1
    if-eq v3, v2, :cond_4

    goto :goto_3

    :cond_4
    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-eq v2, v3, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    if-ge v1, v2, :cond_9

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_8

    :cond_7
    :goto_3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_9
    :goto_4
    return-void
.end method

.method public static D(ILandroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    return-void
.end method

.method public static E(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static F(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static G(Lzt/d;)[B
    .locals 10

    new-instance v0, Ljava/util/ArrayDeque;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v2

    const/4 v3, 0x2

    mul-int/2addr v2, v3

    const/16 v4, 0x80

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v4, 0x2000

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    move v4, v1

    :goto_0
    const/4 v5, -0x1

    const v6, 0x7ffffff7

    if-ge v4, v6, :cond_5

    sub-int/2addr v6, v4

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    new-array v7, v6, [B

    invoke-virtual {v0, v7}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    move v8, v1

    :goto_1
    if-ge v8, v6, :cond_1

    sub-int v9, v6, v8

    invoke-virtual {p0, v7, v8, v9}, Lzt/d;->read([BII)I

    move-result v9

    if-ne v9, v5, :cond_0

    invoke-static {v0, v4}, Ls4/b;->e(Ljava/util/ArrayDeque;I)[B

    move-result-object p0

    return-object p0

    :cond_0
    add-int/2addr v8, v9

    add-int/2addr v4, v9

    goto :goto_1

    :cond_1
    int-to-long v5, v2

    const/16 v7, 0x1000

    if-ge v2, v7, :cond_2

    const/4 v2, 0x4

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    int-to-long v7, v2

    mul-long/2addr v5, v7

    const-wide/32 v7, 0x7fffffff

    cmp-long v2, v5, v7

    if-lez v2, :cond_3

    const v2, 0x7fffffff

    goto :goto_0

    :cond_3
    const-wide/32 v7, -0x80000000

    cmp-long v2, v5, v7

    if-gez v2, :cond_4

    const/high16 v2, -0x80000000

    goto :goto_0

    :cond_4
    long-to-int v2, v5

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lzt/d;->read()I

    move-result p0

    if-ne p0, v5, :cond_6

    invoke-static {v0, v6}, Ls4/b;->e(Ljava/util/ArrayDeque;I)[B

    move-result-object p0

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/OutOfMemoryError;

    const-string v0, "input is too large to fit in a byte array"

    invoke-direct {p0, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static H(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    instance-of v0, p0, Lw4/b;

    if-eqz v0, :cond_0

    check-cast p0, Lw4/b;

    check-cast p0, Lw4/c;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final a(Ly00/j5;)Ljava/lang/Boolean;
    .locals 1

    instance-of v0, p0, Ly00/f5;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/f5;

    iget-object p0, p0, Ly00/f5;->x:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    instance-of v0, p0, Ly00/i5;

    if-eqz v0, :cond_1

    check-cast p0, Ly00/i5;

    iget-object p0, p0, Ly00/i5;->x:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    instance-of v0, p0, Ly00/h5;

    if-eqz v0, :cond_2

    check-cast p0, Ly00/h5;

    iget-object p0, p0, Ly00/h5;->x:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Ljava/util/AbstractList;Lv00/c0;Lv00/m0;)V
    .locals 6

    new-instance v0, Lx30/i1;

    iget-boolean v1, p2, Lv00/m0;->f:Z

    iget-object v2, p2, Lv00/m0;->g:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lx30/i1;-><init>(ZLjava/lang/String;)V

    iget-object v1, v0, Lx30/i1;->c:Lg40/u2;

    iget-object v1, v1, Lg40/u2;->f:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    iget-object p1, p1, Lv00/c0;->P:Lv00/p;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lv00/p;->z:Z

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_4

    new-instance p1, Lx30/n1;

    iget-object v0, p2, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSetAsDefaultPaymentMethod$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    :cond_3
    iget-boolean p2, p2, Lv00/m0;->n:Z

    invoke-direct {p1, v2, v1, p2}, Lx30/n1;-><init>(ZLec3/h2;Z)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method public static c(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static d(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    return-void
.end method

.method public static e(Ljava/util/ArrayDeque;I)[B
    .locals 6

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array p0, v1, [B

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v2, v0

    if-ne v2, p1, :cond_1

    return-object v0

    :cond_1
    array-length v2, v0

    sub-int v2, p1, v2

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    :goto_0
    if-lez v2, :cond_2

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v4, v3

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, p1, v2

    invoke-static {v3, v1, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v2, v4

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static f(Landroid/graphics/drawable/Drawable;)I
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result p0

    return p0
.end method

.method public static g(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lcc/p;)I
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result p0

    return p0
.end method

.method public static i(Landroid/content/Context;)Ljava/util/concurrent/Executor;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/util/List;Ljava/io/InputStream;Lal/g;)I
    .locals 4

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lgl/u;

    invoke-direct {v1, p1, p2}, Lgl/u;-><init>(Ljava/io/InputStream;Lal/g;)V

    move-object p1, v1

    :cond_1
    const/high16 v1, 0x500000

    invoke-virtual {p1, v1}, Ljava/io/InputStream;->mark(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwk/d;

    :try_start_0
    invoke-interface {v3, p1, p2}, Lwk/d;->c(Ljava/io/InputStream;Lal/g;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    if-eq v3, v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    throw p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static final k(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {p0}, Lcom/stripe/android/core/exception/StripeException;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of p0, p0, Ljava/io/IOException;

    if-eqz p0, :cond_1

    const-string p0, "ioException"

    return-object p0

    :cond_1
    const-string p0, "unknown"

    return-object p0
.end method

.method public static l(Ljava/util/ArrayList;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 4

    if-nez p1, :cond_0

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwk/d;

    invoke-interface {v2, p1}, Lwk/d;->a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v2, v3, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0
.end method

.method public static n(Ljava/util/List;Ljava/io/InputStream;Lal/g;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 3

    if-nez p1, :cond_0

    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lgl/u;

    invoke-direct {v0, p1, p2}, Lgl/u;-><init>(Ljava/io/InputStream;Lal/g;)V

    move-object p1, v0

    :cond_1
    const/high16 p2, 0x500000

    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_3

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwk/d;

    :try_start_0
    invoke-interface {v1, p1}, Lwk/d;->b(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    throw p0

    :cond_3
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    :goto_1
    return-object v1
.end method

.method public static o(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static p(Landroid/graphics/drawable/Drawable;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result p0

    return p0
.end method

.method public static final q(Ljava/lang/String;Lv00/i0;Ly00/c8;Z)Z
    .locals 2

    const-string v0, "code"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodSaveConsentBehavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lv00/e0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Lv00/f0;

    if-eqz v0, :cond_1

    return p3

    :cond_1
    instance-of p1, p1, Lv00/h0;

    if-eqz p1, :cond_5

    instance-of p1, p2, Ly00/l3;

    if-eqz p1, :cond_3

    check-cast p2, Ly00/l3;

    invoke-virtual {p2, p0}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    return p3

    :cond_3
    instance-of p0, p2, Ly00/g6;

    if-eqz p0, :cond_4

    return v1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static r(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    return-void
.end method

.method public static final s(Ly00/f4;ZLy00/u5;Ly00/o;)Ly00/x2;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ly00/f4;->z:Z

    if-nez p1, :cond_2

    if-eqz p2, :cond_0

    invoke-static {p2}, Ly00/g;->d(Ly00/u5;)Ly00/o;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ldc/a;->D(Ly00/o;)Z

    move-result p1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-static {p3}, Ldc/a;->D(Ly00/o;)Z

    move-result p1

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    new-instance p1, Ly00/x2;

    sget-object p2, Ly00/w2;->z:Ly00/w2;

    invoke-direct {p1, p2}, Ly00/x2;-><init>(Ly00/w2;)V

    if-eqz v0, :cond_3

    iget-boolean p0, p0, Ly00/f4;->y:Z

    if-eqz p0, :cond_3

    return-object p1

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static t(Ly2/c0;La3/w0;Ly2/q0;I)I
    .locals 3

    new-instance v0, Ly2/u0;

    sget-object v1, Ly2/w0;->x:Ly2/w0;

    sget-object v2, Ly2/x0;->x:Ly2/x0;

    invoke-direct {v0, p2, v1, v2}, Ly2/u0;-><init>(Ly2/q0;Ly2/w0;Ly2/x0;)V

    const/4 p2, 0x0

    const/16 v1, 0xd

    invoke-static {p3, p2, v1}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p0

    invoke-interface {p0}, Ly2/s0;->getHeight()I

    move-result p0

    return p0
.end method

.method public static u(Ly2/c0;La3/w0;Ly2/q0;I)I
    .locals 3

    new-instance v0, Ly2/u0;

    sget-object v1, Ly2/w0;->x:Ly2/w0;

    sget-object v2, Ly2/x0;->w:Ly2/x0;

    invoke-direct {v0, p2, v1, v2}, Ly2/u0;-><init>(Ly2/q0;Ly2/w0;Ly2/x0;)V

    const/4 p2, 0x0

    const/4 v1, 0x7

    invoke-static {p2, p3, v1}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p0

    invoke-interface {p0}, Ly2/s0;->getWidth()I

    move-result p0

    return p0
.end method

.method public static v(Ly2/c0;La3/w0;Ly2/q0;I)I
    .locals 3

    new-instance v0, Ly2/u0;

    sget-object v1, Ly2/w0;->w:Ly2/w0;

    sget-object v2, Ly2/x0;->x:Ly2/x0;

    invoke-direct {v0, p2, v1, v2}, Ly2/u0;-><init>(Ly2/q0;Ly2/w0;Ly2/x0;)V

    const/4 p2, 0x0

    const/16 v1, 0xd

    invoke-static {p3, p2, v1}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p0

    invoke-interface {p0}, Ly2/s0;->getHeight()I

    move-result p0

    return p0
.end method

.method public static w(Ly2/c0;La3/w0;Ly2/q0;I)I
    .locals 3

    new-instance v0, Ly2/u0;

    sget-object v1, Ly2/w0;->w:Ly2/w0;

    sget-object v2, Ly2/x0;->w:Ly2/x0;

    invoke-direct {v0, p2, v1, v2}, Ly2/u0;-><init>(Ly2/q0;Ly2/w0;Ly2/x0;)V

    const/4 p2, 0x0

    const/4 v1, 0x7

    invoke-static {p2, p3, v1}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p0

    invoke-interface {p0}, Ly2/s0;->getWidth()I

    move-result p0

    return p0
.end method

.method public static x(Ljava/lang/String;)Lvc/a;
    .locals 7

    const-string v0, "arn"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x3a

    aput-char v4, v2, v3

    const/4 v4, 0x6

    const/4 v5, 0x2

    invoke-static {p0, v2, v4, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v4, :cond_8

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_5

    new-instance p0, Lty/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lty/f;->a:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lty/f;->b:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lty/f;->c:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v3, v0

    :cond_1
    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lty/f;->d:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lty/f;->e:Ljava/lang/String;

    iget-object v0, p0, Lty/f;->a:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lty/f;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lty/f;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    new-instance v0, Lvc/a;

    invoke-direct {v0, p0}, Lvc/a;-><init>(Lty/f;)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "ARN resource must not be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "ARN service must not be null or blank"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "ARN partition must not be null or blank"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Malformed ARN - no AWS service specified"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Malformed ARN - no AWS partition specified"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Malformed ARN - does not start with `arn:`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    const-string v0, "Malformed ARN ("

    const-string v1, ") does not have the expected number of components"

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static y(Lorg/json/JSONObject;)Ly00/v3;
    .locals 9

    const-string v0, "address"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "city"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "country"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "line1"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "line2"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "postal_code"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "state"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    new-instance v2, Ly00/c;

    invoke-direct/range {v2 .. v8}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v0, "email"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "name"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "phone"

    invoke-static {v3, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    new-instance v3, Ly00/v3;

    invoke-direct {v3, v2, v0, v1, p0}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public static z(Landroid/graphics/drawable/Drawable;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void
.end method
