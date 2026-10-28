.class public abstract Lq83/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lob3/o;Lob3/k;)Lob3/g;
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->Z(Lob3/k;)Lob3/g;

    move-result-object p0

    return-object p0
.end method

.method public static B(I)I
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_8

    const/4 v1, 0x2

    if-eq p0, v1, :cond_7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_6

    const/16 v1, 0x8

    if-eq p0, v1, :cond_5

    const/16 v2, 0x10

    if-eq p0, v2, :cond_4

    const/16 v0, 0x20

    if-eq p0, v0, :cond_3

    const/16 v0, 0x40

    if-eq p0, v0, :cond_2

    const/16 v0, 0x80

    if-eq p0, v0, :cond_1

    const/16 v0, 0x100

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "type needs to be >= FIRST and <= LAST, type="

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x7

    return p0

    :cond_2
    const/4 p0, 0x6

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0

    :cond_4
    return v0

    :cond_5
    const/4 p0, 0x3

    return p0

    :cond_6
    return v1

    :cond_7
    return v0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public static final E(Lob3/o;Lob3/h;)Z
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result p0

    return p0
.end method

.method public static F(Lq83/j;Lc93/m;)Ld4/l;
    .locals 2

    sget-object v0, Lbc3/d0;->w:Lbc3/d0;

    const-string v1, "context"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lic/o;

    invoke-direct {v1, p0, v0, p1}, Lic/o;-><init>(Lq83/j;Lbc3/d0;Lc93/m;)V

    invoke-static {v1}, Lj93/l0;->z(Ld4/j;)Ld4/l;

    move-result-object p0

    return-object p0
.end method

.method public static G(Ll83/i;Lc93/a;)Ll83/h;
    .locals 2

    sget-object v0, Ll83/x;->a:Ll83/x;

    const-string v1, "initializer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    new-instance p0, Ll83/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll83/b0;->w:Lc93/a;

    iput-object v0, p0, Ll83/b0;->x:Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ll83/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll83/o;->w:Lc93/a;

    iput-object v0, p0, Ll83/o;->x:Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance p0, Ll83/p;

    invoke-direct {p0, p1}, Ll83/p;-><init>(Lc93/a;)V

    return-object p0
.end method

.method public static H(Lc93/a;)Ll83/p;
    .locals 1

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/p;

    invoke-direct {v0, p0}, Ll83/p;-><init>(Lc93/a;)V

    return-object v0
.end method

.method public static final K(Landroid/content/Context;Lui/y;Ljava/lang/String;Z)Lqi/d0;
    .locals 3

    instance-of v0, p1, Lui/w;

    const-string v1, "__LottieInternalDefaultCacheKey__"

    if-eqz v0, :cond_1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    check-cast p1, Lui/w;

    iget p1, p1, Lui/w;->a:I

    invoke-static {p0, p1}, Lqi/l;->l(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lqi/l;->f(Landroid/content/Context;ILjava/lang/String;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p1, Lui/w;

    iget p1, p1, Lui/w;->a:I

    invoke-static {p0, p1, p2}, Lqi/l;->f(Landroid/content/Context;ILjava/lang/String;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p1, Lui/x;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    check-cast p1, Lui/x;

    iget-object p1, p1, Lui/x;->a:Ljava/lang/String;

    sget-object p2, Lqi/l;->a:Ljava/util/HashMap;

    const-string p2, "url_"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljc/f;

    invoke-direct {p3, p0, p1, p2}, Ljc/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p3, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_2
    check-cast p1, Lui/x;

    iget-object p1, p1, Lui/x;->a:Ljava/lang/String;

    new-instance p3, Ljc/f;

    invoke-direct {p3, p0, p1, p2}, Ljc/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p3, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p1, Lui/u;

    if-eqz v0, :cond_8

    if-eqz p3, :cond_4

    return-object v2

    :cond_4
    new-instance p0, Ljava/io/FileInputStream;

    check-cast p1, Lui/u;

    invoke-virtual {p1}, Lui/u;->a()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lui/u;->a()Ljava/lang/String;

    move-result-object p3

    const-string v0, "zip"

    const/4 v2, 0x0

    invoke-static {p3, v0, v2}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_6

    new-instance p3, Ljava/util/zip/ZipInputStream;

    invoke-direct {p3, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Lui/u;->a()Ljava/lang/String;

    move-result-object p2

    :cond_5
    new-instance p0, Lcom/iterable/iterableapi/n1;

    const/16 p1, 0x9

    invoke-direct {p0, p1, p3, p2}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Llr/e;

    const/16 v0, 0xb

    invoke-direct {p1, p3, v0}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, p0, p1}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p1}, Lui/u;->a()Ljava/lang/String;

    move-result-object p2

    :cond_7
    new-instance p1, Lcom/iterable/iterableapi/n1;

    const/4 p3, 0x7

    invoke-direct {p1, p3, p0, p2}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p3, Llr/e;

    const/16 v0, 0xa

    invoke-direct {p3, p0, v0}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, p1, p3}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_8
    instance-of p3, p1, Lui/s;

    if-eqz p3, :cond_a

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_9

    check-cast p1, Lui/s;

    invoke-virtual {p1}, Lui/s;->a()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lqi/l;->a:Ljava/util/HashMap;

    const-string p2, "asset_"

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance p3, Lht/f;

    invoke-direct {p3, p0, p1, p2, v0}, Lht/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p2, p3, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_9
    check-cast p1, Lui/s;

    invoke-virtual {p1}, Lui/s;->a()Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lqi/l;->a:Ljava/util/HashMap;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance p3, Lht/f;

    invoke-direct {p3, p0, p1, p2, v0}, Lht/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p2, p3, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_a
    instance-of p3, p1, Lui/v;

    if-eqz p3, :cond_c

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    move-object p0, p1

    check-cast p0, Lui/v;

    invoke-virtual {p0}, Lui/v;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    :cond_b
    check-cast p1, Lui/v;

    invoke-virtual {p1}, Lui/v;->c()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lcom/iterable/iterableapi/n1;

    invoke-direct {p1, p0, p2}, Lcom/iterable/iterableapi/n1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0

    :cond_c
    instance-of p1, p1, Lui/t;

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0

    :cond_d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final L(Lob3/o;Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->f(Lob3/g;)Lob3/h;

    move-result-object p0

    return-object p0
.end method

.method public static M(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static final N(Lob3/o;Lob3/l;)I
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->E(Lob3/l;)I

    move-result p0

    return p0
.end method

.method public static O(Lud3/d0;)Lud3/h;
    .locals 26

    move-object/from16 v0, p0

    const-string v1, "headers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lud3/d0;->size()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, -0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_0
    if-ge v6, v1, :cond_18

    const/16 v21, 0x1

    invoke-virtual {v0, v6}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v6}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v5

    const-string v3, "Cache-Control"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v8, :cond_0

    :goto_1
    const/4 v7, 0x0

    goto :goto_2

    :cond_0
    move-object v8, v5

    goto :goto_2

    :cond_1
    const-string v3, "Pragma"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    goto :goto_1

    :goto_2
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_17

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    move v2, v3

    :goto_4
    if-ge v2, v4, :cond_3

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move/from16 v22, v1

    const-string v1, "=,;"

    move/from16 v23, v2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v0

    if-eqz v0, :cond_2

    move/from16 v2, v23

    goto :goto_5

    :cond_2
    add-int/lit8 v2, v23, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v22

    goto :goto_4

    :cond_3
    move/from16 v22, v1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    :goto_5
    invoke-virtual {v5, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v2, v3, :cond_4

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_4

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3b

    if-ne v3, v4, :cond_5

    :cond_4
    move/from16 v23, v6

    const/4 v4, 0x0

    goto/16 :goto_a

    :cond_5
    add-int/lit8 v2, v2, 0x1

    sget-object v3, Lwd3/f;->a:[B

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    :goto_6
    if-ge v2, v3, :cond_7

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v23, v2

    const/16 v2, 0x20

    if-eq v4, v2, :cond_6

    const/16 v2, 0x9

    if-eq v4, v2, :cond_6

    move/from16 v2, v23

    goto :goto_7

    :cond_6
    add-int/lit8 v2, v23, 0x1

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    :goto_7
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_8

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x22

    if-ne v3, v4, :cond_8

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x4

    move/from16 v23, v6

    const/4 v6, 0x0

    invoke-static {v5, v4, v2, v6, v3}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    goto :goto_b

    :cond_8
    move/from16 v23, v6

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    move v4, v2

    :goto_8
    if-ge v4, v3, :cond_a

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v24, v3

    const-string v3, ",;"

    move/from16 v25, v4

    const/4 v4, 0x0

    invoke-static {v3, v6, v4}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v3

    if-eqz v3, :cond_9

    move/from16 v3, v25

    goto :goto_9

    :cond_9
    add-int/lit8 v3, v25, 0x1

    move v4, v3

    move/from16 v3, v24

    goto :goto_8

    :cond_a
    const/4 v4, 0x0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    :goto_9
    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_b

    :goto_a
    add-int/lit8 v2, v2, 0x1

    move v3, v2

    const/4 v2, 0x0

    :goto_b
    const-string v1, "no-cache"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    move-object/from16 v0, p0

    move/from16 v9, v21

    :goto_c
    move/from16 v1, v22

    move/from16 v6, v23

    goto/16 :goto_3

    :cond_b
    const-string v1, "no-store"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    move-object/from16 v0, p0

    move/from16 v10, v21

    goto :goto_c

    :cond_c
    const-string v1, "max-age"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    invoke-static {v1, v2}, Lwd3/f;->q(ILjava/lang/String;)I

    move-result v11

    :cond_d
    :goto_d
    move-object/from16 v0, p0

    goto :goto_c

    :cond_e
    const/4 v1, -0x1

    const-string v6, "s-maxage"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-static {v1, v2}, Lwd3/f;->q(ILjava/lang/String;)I

    move-result v12

    goto :goto_d

    :cond_f
    const-string v1, "private"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    move-object/from16 v0, p0

    move/from16 v13, v21

    goto :goto_c

    :cond_10
    const-string v1, "public"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    move-object/from16 v0, p0

    move/from16 v14, v21

    goto :goto_c

    :cond_11
    const-string v1, "must-revalidate"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    move-object/from16 v0, p0

    move/from16 v15, v21

    goto :goto_c

    :cond_12
    const-string v1, "max-stale"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    const v0, 0x7fffffff

    invoke-static {v0, v2}, Lwd3/f;->q(ILjava/lang/String;)I

    move-result v16

    goto :goto_d

    :cond_13
    const-string v1, "min-fresh"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    invoke-static {v1, v2}, Lwd3/f;->q(ILjava/lang/String;)I

    move-result v17

    goto :goto_d

    :cond_14
    const/4 v1, -0x1

    const-string v2, "only-if-cached"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_15

    move-object/from16 v0, p0

    move/from16 v18, v21

    goto/16 :goto_c

    :cond_15
    const-string v2, "no-transform"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_16

    move-object/from16 v0, p0

    move/from16 v19, v21

    goto/16 :goto_c

    :cond_16
    const-string v2, "immutable"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    move-object/from16 v0, p0

    move/from16 v20, v21

    goto/16 :goto_c

    :cond_17
    move/from16 v22, v1

    move/from16 v23, v6

    const/4 v1, -0x1

    const/4 v4, 0x0

    add-int/lit8 v6, v23, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v22

    goto/16 :goto_0

    :cond_18
    if-nez v7, :cond_19

    const/16 v21, 0x0

    goto :goto_e

    :cond_19
    move-object/from16 v21, v8

    :goto_e
    new-instance v8, Lud3/h;

    invoke-direct/range {v8 .. v21}, Lud3/h;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v8
.end method

.method public static final P(Ljava/lang/String;)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v2, Ll83/i;->y:Ll83/i;

    sget-object v3, Li63/q;->x:Li63/q;

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v4

    if-gt v3, v4, :cond_17

    sget-object v4, Ll83/i;->y:Ll83/i;

    sget-object v5, Li63/q;->y:Li63/q;

    invoke-static {v4, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v3

    :goto_1
    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v7

    if-gt v6, v7, :cond_14

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2c

    if-ne v7, v8, :cond_3

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    new-instance v8, Li63/h;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_2

    :cond_1
    move v5, v6

    :goto_2
    invoke-static {v3, v5, v0}, Lq83/g;->Z(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4}, Ll83/h;->b()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_3

    :cond_2
    move-object v4, v1

    :goto_3
    invoke-direct {v8, v3, v4}, Li63/h;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    :goto_4
    move v3, v6

    goto :goto_0

    :cond_3
    const/16 v9, 0x3b

    if-ne v7, v9, :cond_13

    if-nez v5, :cond_4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_4
    add-int/lit8 v6, v6, 0x1

    move v7, v6

    :goto_5
    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v10

    const-string v11, ""

    if-gt v7, v10, :cond_12

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v12, 0x3d

    if-ne v10, v12, :cond_f

    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v12

    if-ne v12, v10, :cond_5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v8, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_5
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x22

    if-ne v11, v12, :cond_b

    add-int/lit8 v8, v7, 0x2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    :goto_6
    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v11

    const-string v13, "builder.toString()"

    if-gt v8, v11, :cond_a

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v12, :cond_8

    add-int/lit8 v14, v8, 0x1

    move v15, v14

    :goto_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v15, v12, :cond_6

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v9, 0x20

    if-ne v12, v9, :cond_6

    add-int/lit8 v15, v15, 0x1

    const/16 v9, 0x3b

    goto :goto_7

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-eq v15, v9, :cond_7

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v12, 0x3b

    if-ne v9, v12, :cond_8

    :cond_7
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    move-object v9, v10

    goto/16 :goto_c

    :cond_8
    const/16 v9, 0x5c

    if-ne v11, v9, :cond_9

    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v9

    add-int/lit8 v9, v9, -0x2

    if-ge v8, v9, :cond_9

    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x2

    :goto_9
    const/16 v9, 0x3b

    const/16 v12, 0x22

    goto :goto_6

    :cond_9
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_a
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "\""

    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ll83/k;

    invoke-direct {v10, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_b
    move v9, v10

    :goto_a
    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v11

    if-gt v9, v11, :cond_e

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x3b

    if-ne v11, v12, :cond_c

    goto :goto_b

    :cond_c
    if-ne v11, v8, :cond_d

    :goto_b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v10, v9, v0}, Lq83/g;->Z(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ll83/k;

    invoke-direct {v10, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_e
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v10, v9, v0}, Lq83/g;->Z(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ll83/k;

    invoke-direct {v10, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :goto_c
    iget-object v8, v9, Ll83/k;->w:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v9, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {v4, v0, v6, v7, v9}, Lq83/g;->Q(Ll83/h;Ljava/lang/String;IILjava/lang/String;)V

    move v6, v8

    goto/16 :goto_1

    :cond_f
    move v12, v9

    if-ne v10, v12, :cond_10

    goto :goto_d

    :cond_10
    if-ne v10, v8, :cond_11

    :goto_d
    invoke-static {v4, v0, v6, v7, v11}, Lq83/g;->Q(Ll83/h;Ljava/lang/String;IILjava/lang/String;)V

    :goto_e
    move v6, v7

    goto/16 :goto_1

    :cond_11
    add-int/lit8 v7, v7, 0x1

    move v9, v12

    goto/16 :goto_5

    :cond_12
    invoke-static {v4, v0, v6, v7, v11}, Lq83/g;->Q(Ll83/h;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_e

    :cond_13
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    :cond_14
    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    new-instance v8, Li63/h;

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_f

    :cond_15
    move v5, v6

    :goto_f
    invoke-static {v3, v5, v0}, Lq83/g;->Z(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4}, Ll83/h;->b()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    goto :goto_10

    :cond_16
    move-object v4, v1

    :goto_10
    invoke-direct {v8, v3, v4}, Li63/h;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_17
    invoke-interface {v2}, Ll83/h;->b()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_18
    return-object v1
.end method

.method public static final Q(Ll83/h;Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-static {p2, p3, p1}, Lq83/g;->Z(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    new-instance p2, Li63/i;

    invoke-direct {p2, p1, p4}, Li63/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final R(Lqa3/h;Lsa3/f;)Laa3/s;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/h;->y:I

    invoke-static {p1, v0}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lqa3/h;->z:Ljava/util/List;

    const-string v1, "getArgumentList(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/f;

    iget-object v3, v2, Lqa3/f;->z:Lqa3/e;

    const-string v4, "getValue(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, p1}, Lq83/g;->S(Lqa3/e;Lsa3/f;)Laa3/m0;

    move-result-object v3

    if-eqz v3, :cond_1

    iget v2, v2, Lqa3/f;->y:I

    invoke-interface {p1, v2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    new-instance p1, Laa3/s;

    invoke-direct {p1, v0, p0}, Laa3/s;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1
.end method

.method public static final S(Lqa3/e;Lsa3/f;)Laa3/m0;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsa3/d;->P:Lsa3/b;

    iget v1, p0, Lqa3/e;->M:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eqz v0, :cond_5

    iget-object p1, p0, Lqa3/e;->y:Lqa3/d;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lba3/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget v2, v0, p1

    :goto_0
    if-eq v2, v1, :cond_4

    const/4 p1, 0x2

    if-eq v2, p1, :cond_3

    const/4 p1, 0x3

    if-eq v2, p1, :cond_2

    const/4 p1, 0x4

    if-ne v2, p1, :cond_1

    new-instance p1, Laa3/k0;

    iget-wide v0, p0, Lqa3/e;->z:J

    invoke-direct {p1, v0, v1}, Laa3/k0;-><init>(J)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot read value of unsigned type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lqa3/e;->y:Lqa3/d;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Laa3/j0;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    invoke-direct {p1, p0}, Laa3/j0;-><init>(I)V

    return-object p1

    :cond_3
    new-instance p1, Laa3/l0;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    int-to-short p0, p0

    invoke-direct {p1, p0}, Laa3/l0;-><init>(S)V

    return-object p1

    :cond_4
    new-instance p1, Laa3/i0;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    int-to-byte p0, p0

    invoke-direct {p1, p0}, Laa3/i0;-><init>(B)V

    return-object p1

    :cond_5
    iget-object v0, p0, Lqa3/e;->y:Lqa3/d;

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    sget-object v2, Lba3/j;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v2, v2, v0

    :goto_1
    packed-switch v2, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    iget-object p0, p0, Lqa3/e;->K:Ljava/util/List;

    const-string v0, "getArrayElementList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/e;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1, p1}, Lq83/g;->S(Lqa3/e;Lsa3/f;)Laa3/m0;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    new-instance p0, Laa3/v;

    invoke-direct {p0, v0}, Laa3/v;-><init>(Ljava/util/ArrayList;)V

    return-object p0

    :pswitch_2
    new-instance v0, Laa3/t;

    iget-object p0, p0, Lqa3/e;->J:Lqa3/h;

    const-string v1, "getAnnotation(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object p0

    invoke-direct {v0, p0}, Laa3/t;-><init>(Laa3/s;)V

    return-object v0

    :pswitch_3
    new-instance v0, Laa3/a0;

    iget v1, p0, Lqa3/e;->H:I

    invoke-static {p1, v1}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object v1

    iget p0, p0, Lqa3/e;->I:I

    invoke-interface {p1, p0}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Laa3/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    iget v0, p0, Lqa3/e;->H:I

    invoke-static {p1, v0}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object p1

    iget p0, p0, Lqa3/e;->L:I

    if-nez p0, :cond_9

    new-instance p0, Laa3/d0;

    invoke-direct {p0, p1}, Laa3/d0;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_9
    new-instance v0, Laa3/u;

    invoke-direct {v0, p1, p0}, Laa3/u;-><init>(Ljava/lang/String;I)V

    return-object v0

    :pswitch_5
    new-instance v0, Laa3/h0;

    iget p0, p0, Lqa3/e;->G:I

    invoke-interface {p1, p0}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Laa3/h0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    new-instance p1, Laa3/w;

    iget-wide v2, p0, Lqa3/e;->z:J

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-eqz p0, :cond_a

    goto :goto_3

    :cond_a
    const/4 v1, 0x0

    :goto_3
    invoke-direct {p1, v1}, Laa3/w;-><init>(Z)V

    return-object p1

    :pswitch_7
    new-instance p1, Laa3/z;

    iget-wide v0, p0, Lqa3/e;->F:D

    invoke-direct {p1, v0, v1}, Laa3/z;-><init>(D)V

    return-object p1

    :pswitch_8
    new-instance p1, Laa3/b0;

    iget p0, p0, Lqa3/e;->E:F

    invoke-direct {p1, p0}, Laa3/b0;-><init>(F)V

    return-object p1

    :pswitch_9
    new-instance p1, Laa3/y;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    int-to-char p0, p0

    invoke-direct {p1, p0}, Laa3/y;-><init>(C)V

    return-object p1

    :pswitch_a
    new-instance p1, Laa3/f0;

    iget-wide v0, p0, Lqa3/e;->z:J

    invoke-direct {p1, v0, v1}, Laa3/f0;-><init>(J)V

    return-object p1

    :pswitch_b
    new-instance p1, Laa3/c0;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    invoke-direct {p1, p0}, Laa3/c0;-><init>(I)V

    return-object p1

    :pswitch_c
    new-instance p1, Laa3/g0;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    int-to-short p0, p0

    invoke-direct {p1, p0}, Laa3/g0;-><init>(S)V

    return-object p1

    :pswitch_d
    new-instance p1, Laa3/x;

    iget-wide v0, p0, Lqa3/e;->z:J

    long-to-int p0, v0

    int-to-byte p0, p0

    invoke-direct {p1, p0}, Laa3/x;-><init>(B)V

    return-object p1

    :pswitch_e
    const/4 p0, 0x0

    return-object p0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final T(Lui/y;Lp1/q;II)Lui/r;
    .locals 10

    const-string p2, "spec"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, -0x4a6a3202

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    and-int/lit8 p2, p3, 0x2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    const-string p2, "images"

    move-object v5, p2

    :goto_0
    and-int/lit8 p2, p3, 0x8

    if-eqz p2, :cond_1

    const-string p2, ".ttf"

    :goto_1
    move-object v6, p2

    goto :goto_2

    :cond_1
    const-string p2, "otf"

    goto :goto_1

    :goto_2
    new-instance v2, Lh0/j1;

    const/4 p2, 0x3

    const/4 p3, 0x2

    invoke-direct {v2, p2, p3, v0}, Lh0/j1;-><init>(IILq83/d;)V

    sget-object p2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Landroid/content/Context;

    const p2, 0x44faf204

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_2

    if-ne p3, v0, :cond_3

    :cond_2
    new-instance p2, Lui/r;

    invoke-direct {p2}, Lui/r;-><init>()V

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p3

    invoke-virtual {p1, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    move-object v7, p3

    check-cast v7, Lp1/c1;

    const p3, 0x1e7b2b64

    invoke-virtual {p1, p3}, Lp1/q;->f0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    const-string v9, "__LottieInternalDefaultCacheKey__"

    invoke-virtual {p1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_4

    if-ne v1, v0, :cond_5

    :cond_4
    const/4 p3, 0x1

    invoke-static {v3, p0, v9, p3}, Lq83/g;->K(Landroid/content/Context;Lui/y;Ljava/lang/String;Z)Lqi/d0;

    move-result-object p3

    invoke-virtual {p1, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    new-instance v1, Lui/d0;

    const/4 v8, 0x0

    move-object v4, p0

    invoke-direct/range {v1 .. v8}, Lui/d0;-><init>(Lh0/j1;Landroid/content/Context;Lui/y;Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lq83/d;)V

    invoke-static {v4, v9, v1, p1}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lui/r;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static final U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;
    .locals 3

    const/4 p2, 0x0

    new-array v0, p2, [Ljava/lang/Object;

    and-int/lit8 v1, p0, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x4

    if-le v1, v2, :cond_0

    move-object v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p2}, Lp1/q;->e(I)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    and-int/lit8 p0, p0, 0x6

    if-ne p0, v2, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    move p0, p2

    :goto_0
    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p0, :cond_3

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne v1, p0, :cond_4

    :cond_3
    new-instance v1, Lf0/l1;

    invoke-direct {v1, p2}, Lf0/l1;-><init>(I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lc93/a;

    sget-object p0, Lf0/r1;->i:Lp0/n0;

    invoke-static {v0, p0, v1, p1, p2}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf0/r1;

    return-object p0
.end method

.method public static V(Landroidx/compose/ui/Modifier;Lf0/r1;ZZ)Landroidx/compose/ui/Modifier;
    .locals 10

    if-eqz p3, :cond_0

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lh0/d2;->x:Lh0/d2;

    goto :goto_0

    :goto_1
    iget-object v6, p1, Lf0/r1;->c:Lj0/j;

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    invoke-static/range {v1 .. v9}, Landroidx/compose/foundation/a;->j(Landroidx/compose/ui/Modifier;Lh0/x2;Lh0/d2;ZLh0/o1;Lj0/i;ZLf0/k;Lq0/g;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance p1, Landroidx/compose/foundation/ScrollingLayoutElement;

    invoke-direct {p1, v2, p3}, Landroidx/compose/foundation/ScrollingLayoutElement;-><init>(Lf0/r1;Z)V

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final W(Li3/p;Li5/f;)V
    .locals 9

    invoke-virtual {p0}, Li3/p;->k()Li3/l;

    move-result-object v0

    sget-object v1, Li3/u;->g:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    if-nez v0, :cond_c

    invoke-virtual {p0}, Li3/p;->l()Li3/p;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v2

    sget-object v3, Li3/u;->e:Li3/y;

    iget-object v2, v2, Li3/l;->w:La0/v0;

    invoke-virtual {v2, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, v1

    :cond_2
    if-eqz v2, :cond_b

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v2

    sget-object v3, Li3/u;->f:Li3/y;

    iget-object v2, v2, Li3/l;->w:La0/v0;

    invoke-virtual {v2, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_0
    check-cast v1, Li3/b;

    if-eqz v1, :cond_4

    iget v2, v1, Li3/b;->a:I

    if-ltz v2, :cond_b

    iget v1, v1, Li3/b;->b:I

    if-gez v1, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p0}, Li3/p;->k()Li3/l;

    move-result-object v1

    sget-object v2, Li3/u;->H:Li3/y;

    iget-object v1, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v2}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_3

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x4

    invoke-static {v2, v0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_1
    if-ge v4, v2, :cond_7

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li3/p;

    invoke-virtual {v6}, Li3/p;->k()Li3/l;

    move-result-object v7

    sget-object v8, Li3/u;->H:Li3/y;

    iget-object v7, v7, Li3/l;->w:La0/v0;

    invoke-virtual {v7, v8}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v6, Li3/p;->c:La3/n0;

    invoke-virtual {v6}, La3/n0;->H()I

    move-result v6

    iget-object v7, p0, Li3/p;->c:La3/n0;

    invoke-virtual {v7}, La3/n0;->H()I

    move-result v7

    if-ge v6, v7, :cond_6

    add-int/lit8 v5, v5, 0x1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {v1}, Lq83/g;->l(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v1, v3

    goto :goto_2

    :cond_8
    move v1, v5

    :goto_2
    if-eqz v0, :cond_9

    move v3, v5

    :cond_9
    invoke-virtual {p0}, Li3/p;->k()Li3/l;

    move-result-object p0

    sget-object v0, Li3/u;->H:Li3/y;

    iget-object p0, p0, Li3/l;->w:La0/v0;

    invoke-virtual {p0, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_a

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_a
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    const/4 v0, 0x1

    invoke-static {v1, v0, v3, v0, p0}, Laj/d;->s(IIIIZ)Laj/d;

    move-result-object p0

    invoke-virtual {p1, p0}, Li5/f;->j(Laj/d;)V

    :cond_b
    :goto_3
    return-void

    :cond_c
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static final X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/res/Resources;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final Z(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v15, p12

    move/from16 v7, p13

    move-object/from16 v4, p11

    check-cast v4, Lp1/q;

    const v0, -0x5013ac4b

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v15, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v15

    goto :goto_1

    :cond_1
    move v0, v15

    :goto_1
    and-int/lit8 v5, v15, 0x30

    move-object/from16 v8, p1

    if-nez v5, :cond_3

    invoke-virtual {v4, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v15, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v0, v9

    goto :goto_4

    :cond_5
    move-object/from16 v5, p2

    :goto_4
    and-int/lit8 v9, v7, 0x8

    if-eqz v9, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v10, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v10, v15, 0xc00

    if-nez v10, :cond_6

    move-object/from16 v10, p3

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_5

    :cond_8
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v0, v11

    :goto_6
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_a

    move/from16 v11, p4

    invoke-virtual {v4, v11}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x4000

    goto :goto_7

    :cond_9
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v0, v12

    goto :goto_8

    :cond_a
    move/from16 v11, p4

    :goto_8
    const/high16 v12, 0x30000

    and-int/2addr v12, v15

    if-nez v12, :cond_c

    move/from16 v12, p5

    invoke-virtual {v4, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_b

    const/high16 v13, 0x20000

    goto :goto_9

    :cond_b
    const/high16 v13, 0x10000

    :goto_9
    or-int/2addr v0, v13

    goto :goto_a

    :cond_c
    move/from16 v12, p5

    :goto_a
    const/high16 v13, 0x180000

    and-int/2addr v13, v15

    if-nez v13, :cond_e

    invoke-virtual {v4, v6}, Lp1/q;->e(I)Z

    move-result v13

    if-eqz v13, :cond_d

    const/high16 v13, 0x100000

    goto :goto_b

    :cond_d
    const/high16 v13, 0x80000

    :goto_b
    or-int/2addr v0, v13

    :cond_e
    and-int/lit16 v13, v7, 0x80

    const/high16 v14, 0xc00000

    if-eqz v13, :cond_10

    or-int/2addr v0, v14

    :cond_f
    move/from16 v14, p7

    goto :goto_d

    :cond_10
    and-int/2addr v14, v15

    if-nez v14, :cond_f

    move/from16 v14, p7

    invoke-virtual {v4, v14}, Lp1/q;->e(I)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x800000

    goto :goto_c

    :cond_11
    const/high16 v16, 0x400000

    :goto_c
    or-int v0, v0, v16

    :goto_d
    and-int/lit16 v2, v7, 0x100

    const/high16 v16, 0x6000000

    if-eqz v2, :cond_12

    or-int v0, v0, v16

    move-object/from16 v3, p8

    goto :goto_f

    :cond_12
    and-int v16, v15, v16

    move-object/from16 v3, p8

    if-nez v16, :cond_14

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x4000000

    goto :goto_e

    :cond_13
    const/high16 v17, 0x2000000

    :goto_e
    or-int v0, v0, v17

    :cond_14
    :goto_f
    move/from16 v17, v0

    and-int/lit16 v0, v7, 0x200

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_16

    or-int v17, v17, v18

    :cond_15
    move/from16 v18, v0

    move-object/from16 v0, p9

    goto :goto_11

    :cond_16
    and-int v18, v15, v18

    if-nez v18, :cond_15

    move/from16 v18, v0

    move-object/from16 v0, p9

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x20000000

    goto :goto_10

    :cond_17
    const/high16 v19, 0x10000000

    :goto_10
    or-int v17, v17, v19

    :goto_11
    and-int/lit16 v0, v7, 0x400

    if-eqz v0, :cond_18

    const/16 v19, 0x6

    move/from16 v20, v0

    move-object/from16 v0, p10

    goto :goto_12

    :cond_18
    move/from16 v20, v0

    move-object/from16 v0, p10

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    const/16 v19, 0x4

    goto :goto_12

    :cond_19
    const/16 v19, 0x2

    :goto_12
    const v21, 0x12492493

    and-int v0, v17, v21

    move/from16 v21, v2

    const v2, 0x12492492

    move/from16 v22, v9

    if-ne v0, v2, :cond_1b

    and-int/lit8 v0, v19, 0x3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1a

    goto :goto_13

    :cond_1a
    const/4 v0, 0x0

    goto :goto_14

    :cond_1b
    :goto_13
    const/4 v0, 0x1

    :goto_14
    and-int/lit8 v2, v17, 0x1

    invoke-virtual {v4, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_32

    const/4 v0, 0x0

    if-eqz v22, :cond_1c

    move-object/from16 v22, v0

    goto :goto_15

    :cond_1c
    move-object/from16 v22, p3

    :goto_15
    if-eqz v13, :cond_1d

    const/4 v7, 0x1

    goto :goto_16

    :cond_1d
    move v7, v14

    :goto_16
    if-eqz v21, :cond_1e

    sget-object v2, Lm83/z;->w:Lm83/z;

    move-object/from16 v21, v2

    goto :goto_17

    :cond_1e
    move-object/from16 v21, v3

    :goto_17
    if-eqz v18, :cond_1f

    move-object v12, v0

    goto :goto_18

    :cond_1f
    move-object/from16 v12, p9

    :goto_18
    if-eqz v20, :cond_20

    move-object v14, v0

    goto :goto_19

    :cond_20
    move-object/from16 v14, p10

    :goto_19
    invoke-static {v7, v6}, Lts/o;->R(II)V

    sget-object v2, Lf1/c1;->a:Lp1/b0;

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf1/a1;

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_25

    const v0, 0x5eab3b55

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/y1;

    iget-wide v9, v0, Lf1/y1;->b:J

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v13, Ltx0/a;

    const/4 v5, 0x2

    invoke-direct {v13, v2, v5}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lt71/i;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lt71/i;-><init>(I)V

    new-instance v6, Lp0/n0;

    move/from16 v16, v7

    const/16 v7, 0xa

    invoke-direct {v6, v7, v13, v5}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_22

    if-ne v7, v3, :cond_21

    goto :goto_1a

    :cond_21
    const/4 v5, 0x1

    goto :goto_1b

    :cond_22
    :goto_1a
    new-instance v7, Lu0/j;

    const/4 v5, 0x1

    invoke-direct {v7, v2, v5}, Lu0/j;-><init>(Lf1/a1;I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v7, Lc93/a;

    const/4 v13, 0x0

    invoke-static {v0, v6, v7, v4, v13}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lp1/q;->f(J)Z

    move-result v0

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v0, v0, v18

    invoke-virtual {v4, v9, v10}, Lp1/q;->f(J)Z

    move-result v18

    or-int v0, v0, v18

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_23

    if-ne v5, v3, :cond_24

    :cond_23
    new-instance v23, Le1/j;

    move-object/from16 v26, v2

    move-wide/from16 v24, v6

    move-wide/from16 v27, v9

    invoke-direct/range {v23 .. v28}, Le1/j;-><init>(JLf1/a1;J)V

    move-object/from16 v5, v23

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v0, v5

    check-cast v0, Le1/j;

    const/4 v13, 0x0

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    :goto_1c
    move-object v6, v0

    goto :goto_1d

    :cond_25
    move/from16 v16, v7

    const/4 v13, 0x0

    const v2, 0x5eb2b9f1

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_1c

    :goto_1d
    sget-object v0, Lu0/d;->a:Ll83/k;

    iget-object v0, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v2, v1, Ll3/g;->w:Ljava/util/List;

    if-eqz v2, :cond_28

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_1e
    if-ge v7, v5, :cond_28

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll3/e;

    iget-object v10, v9, Ll3/e;->a:Ljava/lang/Object;

    instance-of v10, v10, Ll3/o0;

    if-eqz v10, :cond_26

    iget-object v10, v9, Ll3/e;->d:Ljava/lang/String;

    const-string v13, "androidx.compose.foundation.text.inlineContent"

    invoke-virtual {v13, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_26

    iget v10, v9, Ll3/e;->b:I

    iget v9, v9, Ll3/e;->c:I

    const/4 v13, 0x0

    invoke-static {v13, v0, v10, v9}, Ll3/h;->b(IIII)Z

    move-result v9

    if-eqz v9, :cond_27

    const/4 v0, 0x1

    goto :goto_1f

    :cond_26
    const/4 v13, 0x0

    :cond_27
    add-int/lit8 v7, v7, 0x1

    goto :goto_1e

    :cond_28
    const/4 v13, 0x0

    move v0, v13

    :goto_1f
    invoke-static {v1}, Lhg3/i;->V(Ll3/g;)Z

    move-result v2

    sget-object v5, Lb3/v1;->k:Lp1/u2;

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lp3/h;

    if-nez v0, :cond_2c

    if-nez v2, :cond_2c

    const v0, 0x5eb67e36

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v17, 0xe

    or-int/lit16 v0, v0, 0xc00

    shr-int/lit8 v2, v17, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int v5, v0, v2

    const/4 v3, 0x0

    move-object v0, v1

    move-object v2, v10

    const/16 v18, 0x1

    move-object/from16 v1, p2

    invoke-static/range {v0 .. v5}, Lu0/q;->a(Ll3/g;Ll3/v0;Lp3/h;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    move-object v15, v4

    const/4 v10, 0x0

    move v0, v13

    const/4 v13, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v0, v8

    move v4, v11

    move/from16 v7, v16

    move-object/from16 v3, v22

    move-object v8, v2

    move-object v11, v6

    move-object/from16 v2, p2

    move/from16 v6, p6

    invoke-static/range {v0 .. v14}, Lq83/g;->a0(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILp3/h;Ljava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v2, v3

    iget-wide v0, v15, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-eqz v5, :cond_29

    invoke-virtual {v15, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_29
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_20
    sget-object v4, La3/k;->g:La3/i;

    sget-object v5, Lu0/e0;->a:Lu0/e0;

    invoke-static {v15, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v15, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v15, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-nez v3, :cond_2b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2a

    goto :goto_22

    :cond_2a
    :goto_21
    const/4 v5, 0x1

    goto :goto_23

    :cond_2b
    :goto_22
    invoke-static {v0, v15, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_21

    :goto_23
    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move-object/from16 v4, v21

    goto/16 :goto_25

    :cond_2c
    move-object v15, v4

    move-object v11, v6

    move-object v8, v10

    move v1, v13

    move/from16 v7, v16

    move-object/from16 v2, v22

    const/4 v5, 0x1

    const v4, 0x5ec5fe36

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v17, 0xe

    const/4 v6, 0x4

    if-ne v4, v6, :cond_2d

    move v9, v5

    goto :goto_24

    :cond_2d
    move v9, v1

    :goto_24
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v9, :cond_2e

    if-ne v4, v3, :cond_2f

    :cond_2e
    invoke-static/range {p0 .. p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    check-cast v4, Lp1/c1;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/g;

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_30

    if-ne v9, v3, :cond_31

    :cond_30
    new-instance v9, Lh01/m;

    const/4 v6, 0x4

    invoke-direct {v9, v6, v4}, Lh01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    move-object v13, v9

    check-cast v13, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v3, v17, 0x3

    and-int/lit16 v3, v3, 0x38e

    shr-int/lit8 v4, v17, 0xc

    const v6, 0xe000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v17, 0x9

    const/high16 v9, 0x70000

    and-int/2addr v4, v9

    or-int/2addr v3, v4

    shl-int/lit8 v4, v17, 0x6

    const/high16 v9, 0x380000

    and-int/2addr v9, v4

    or-int/2addr v3, v9

    const/high16 v9, 0x1c00000

    and-int/2addr v9, v4

    or-int/2addr v3, v9

    const/high16 v9, 0xe000000

    and-int/2addr v9, v4

    or-int/2addr v3, v9

    const/high16 v9, 0x70000000

    and-int/2addr v4, v9

    or-int v16, v3, v4

    shr-int/lit8 v3, v17, 0x15

    and-int/lit16 v3, v3, 0x380

    shl-int/lit8 v4, v19, 0xc

    and-int/2addr v4, v6

    or-int v17, v3, v4

    move/from16 v6, p4

    move v3, v0

    move-object v1, v5

    move v9, v7

    move-object v10, v8

    move-object/from16 v4, v21

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    move/from16 v7, p5

    move/from16 v8, p6

    invoke-static/range {v0 .. v17}, Lq83/g;->e(Landroidx/compose/ui/Modifier;Ll3/g;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Ll3/v0;IZIILp3/h;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move v7, v9

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_25
    move-object v9, v4

    move v8, v7

    move-object v10, v12

    move-object v11, v14

    move-object v4, v2

    goto :goto_26

    :cond_32
    move-object v15, v4

    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object v9, v3

    move v8, v14

    :goto_26
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_33

    new-instance v0, Lu0/o;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lu0/o;-><init>(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;II)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method public static final a0(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILp3/h;Ljava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;)Landroidx/compose/ui/Modifier;
    .locals 14

    if-nez p11, :cond_0

    new-instance v0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v3, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p12

    move-object/from16 v13, p13

    move-object/from16 v12, p14

    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;-><init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Li2/a0;Lu0/z0;Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-interface {p0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v3, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p14

    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;-><init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;)V

    iget-object v1, v11, Le1/j;->F:Landroidx/compose/ui/Modifier;

    invoke-interface {p0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v9, p1

    move-object/from16 v2, p2

    move/from16 v6, p6

    move-object/from16 v0, p9

    move/from16 v15, p11

    move/from16 v10, p12

    move-object/from16 v11, p10

    check-cast v11, Lp1/q;

    const v3, -0x3e089999

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v15, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_1
    move v3, v15

    :goto_1
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v15, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit8 v5, v10, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v15, 0xc00

    if-nez v8, :cond_6

    move-object/from16 v8, p3

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x800

    goto :goto_4

    :cond_8
    const/16 v12, 0x400

    :goto_4
    or-int/2addr v3, v12

    :goto_5
    and-int/lit8 v12, v10, 0x10

    if-eqz v12, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move/from16 v13, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v15, 0x6000

    if-nez v13, :cond_9

    move/from16 v13, p4

    invoke-virtual {v11, v13}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x4000

    goto :goto_6

    :cond_b
    const/16 v14, 0x2000

    :goto_6
    or-int/2addr v3, v14

    :goto_7
    and-int/lit8 v14, v10, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_c

    or-int v3, v3, v16

    move/from16 v4, p5

    goto :goto_9

    :cond_c
    and-int v16, v15, v16

    move/from16 v4, p5

    if-nez v16, :cond_e

    invoke-virtual {v11, v4}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v16, 0x10000

    :goto_8
    or-int v3, v3, v16

    :cond_e
    :goto_9
    const/high16 v16, 0x180000

    and-int v16, v15, v16

    if-nez v16, :cond_10

    invoke-virtual {v11, v6}, Lp1/q;->e(I)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x100000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x80000

    :goto_a
    or-int v3, v3, v16

    :cond_10
    and-int/lit16 v7, v10, 0x80

    const/high16 v17, 0xc00000

    if-eqz v7, :cond_12

    or-int v3, v3, v17

    :cond_11
    move/from16 v17, v3

    move/from16 v3, p7

    goto :goto_c

    :cond_12
    and-int v17, v15, v17

    if-nez v17, :cond_11

    move/from16 v17, v3

    move/from16 v3, p7

    invoke-virtual {v11, v3}, Lp1/q;->e(I)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x800000

    goto :goto_b

    :cond_13
    const/high16 v18, 0x400000

    :goto_b
    or-int v17, v17, v18

    :goto_c
    and-int/lit16 v3, v10, 0x100

    const/high16 v18, 0x6000000

    if-eqz v3, :cond_15

    or-int v17, v17, v18

    :cond_14
    move/from16 v18, v3

    move-object/from16 v3, p8

    goto :goto_e

    :cond_15
    and-int v18, v15, v18

    if-nez v18, :cond_14

    move/from16 v18, v3

    move-object/from16 v3, p8

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x4000000

    goto :goto_d

    :cond_16
    const/high16 v19, 0x2000000

    :goto_d
    or-int v17, v17, v19

    :goto_e
    and-int/lit16 v3, v10, 0x200

    const/high16 v19, 0x30000000

    if-eqz v3, :cond_17

    :goto_f
    or-int v17, v17, v19

    goto :goto_11

    :cond_17
    and-int v19, v15, v19

    if-nez v19, :cond_1a

    const/high16 v19, 0x40000000    # 2.0f

    and-int v19, v15, v19

    if-nez v19, :cond_18

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    goto :goto_10

    :cond_18
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    :goto_10
    if-eqz v19, :cond_19

    const/high16 v19, 0x20000000

    goto :goto_f

    :cond_19
    const/high16 v19, 0x10000000

    goto :goto_f

    :cond_1a
    :goto_11
    const v19, 0x12492493

    and-int v0, v17, v19

    move/from16 v19, v3

    const v3, 0x12492492

    if-eq v0, v3, :cond_1b

    const/4 v0, 0x1

    goto :goto_12

    :cond_1b
    const/4 v0, 0x0

    :goto_12
    and-int/lit8 v3, v17, 0x1

    invoke-virtual {v11, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_35

    const/4 v0, 0x0

    if-eqz v5, :cond_1c

    move-object/from16 v20, v0

    goto :goto_13

    :cond_1c
    move-object/from16 v20, v8

    :goto_13
    if-eqz v12, :cond_1d

    const/4 v8, 0x1

    goto :goto_14

    :cond_1d
    move/from16 v8, p4

    :goto_14
    if-eqz v14, :cond_1e

    const/4 v12, 0x1

    goto :goto_15

    :cond_1e
    move v12, v4

    :goto_15
    if-eqz v7, :cond_1f

    const/4 v7, 0x1

    goto :goto_16

    :cond_1f
    move/from16 v7, p7

    :goto_16
    move v14, v8

    if-eqz v18, :cond_20

    move-object v8, v0

    goto :goto_17

    :cond_20
    move-object/from16 v8, p8

    :goto_17
    move/from16 v18, v14

    if-eqz v19, :cond_21

    move-object v14, v0

    goto :goto_18

    :cond_21
    move-object/from16 v14, p9

    :goto_18
    invoke-static {v7, v6}, Lts/o;->R(II)V

    sget-object v3, Lf1/c1;->a:Lp1/b0;

    invoke-virtual {v11, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf1/a1;

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_26

    const v0, 0x153ec423

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/y1;

    move-object/from16 p3, v14

    iget-wide v13, v0, Lf1/y1;->b:J

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v5, Ltx0/a;

    const/4 v10, 0x2

    invoke-direct {v5, v3, v10}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    new-instance v10, Lt71/i;

    const/16 v6, 0x1d

    invoke-direct {v10, v6}, Lt71/i;-><init>(I)V

    new-instance v6, Lp0/n0;

    move/from16 p4, v7

    const/16 v7, 0xa

    invoke-direct {v6, v7, v5, v10}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_22

    if-ne v7, v4, :cond_23

    :cond_22
    new-instance v7, Lu0/j;

    const/4 v5, 0x0

    invoke-direct {v7, v3, v5}, Lu0/j;-><init>(Lf1/a1;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v7, Lc93/a;

    const/4 v5, 0x0

    invoke-static {v0, v6, v7, v11, v5}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-virtual {v11, v5, v6}, Lp1/q;->f(J)Z

    move-result v0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v11, v13, v14}, Lp1/q;->f(J)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_24

    if-ne v7, v4, :cond_25

    :cond_24
    new-instance v21, Le1/j;

    move-object/from16 v24, v3

    move-wide/from16 v22, v5

    move-wide/from16 v25, v13

    invoke-direct/range {v21 .. v26}, Le1/j;-><init>(JLf1/a1;J)V

    move-object/from16 v7, v21

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object v0, v7

    check-cast v0, Le1/j;

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_19
    move-object v6, v0

    goto :goto_1a

    :cond_26
    move/from16 p4, v7

    move-object/from16 p3, v14

    const/4 v5, 0x0

    const v3, 0x154642bf

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_19

    :goto_1a
    sget-object v0, Lb3/v1;->k:Lp1/u2;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp3/h;

    and-int/lit8 v0, v17, 0xe

    shr-int/lit8 v5, v17, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v0, v5

    sget-object v5, Lu0/q;->a:Lp1/u2;

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/util/concurrent/Executor;

    if-eqz v7, :cond_2f

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v5}, Lu0/q;->b(I)Z

    move-result v5

    if-eqz v5, :cond_2f

    const v5, 0x4ac3871f    # 6407055.5f

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/m;

    sget-object v10, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/c;

    and-int/lit8 v13, v0, 0x70

    xor-int/lit8 v13, v13, 0x30

    const/16 v14, 0x20

    if-le v13, v14, :cond_27

    :try_start_0
    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_28

    :cond_27
    and-int/lit8 v13, v0, 0x30

    if-ne v13, v14, :cond_29

    :cond_28
    const/4 v13, 0x1

    goto :goto_1b

    :cond_29
    const/4 v13, 0x0

    :goto_1b
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    invoke-virtual {v11, v14}, Lp1/q;->e(I)Z

    move-result v14

    or-int/2addr v13, v14

    and-int/lit8 v14, v0, 0xe

    xor-int/lit8 v14, v14, 0x6

    move/from16 p5, v0

    const/4 v0, 0x4

    if-le v14, v0, :cond_2a

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2b

    :cond_2a
    and-int/lit8 v14, p5, 0x6

    if-ne v14, v0, :cond_2c

    :cond_2b
    const/4 v0, 0x1

    goto :goto_1c

    :cond_2c
    const/4 v0, 0x0

    :goto_1c
    or-int/2addr v0, v13

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v0, v13

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v0, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v0, :cond_2d

    if-ne v13, v4, :cond_2e

    :cond_2d
    new-instance v0, Lic/h0;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v5

    move-object v5, v4

    move-object v4, v10

    :try_start_1
    invoke-direct/range {v0 .. v5}, Lic/h0;-><init>(Ll3/v0;Ly3/m;Ljava/lang/String;Ly3/c;Lp3/h;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v3, v5

    :try_start_2
    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v13, v0

    :cond_2e
    check-cast v13, Ljava/lang/Runnable;

    invoke-interface {v7, v13}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_1d
    const/4 v5, 0x0

    goto :goto_1e

    :catch_1
    move-object v3, v5

    goto :goto_1d

    :goto_1e
    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_1f

    :cond_2f
    const/4 v5, 0x0

    const v0, 0x4ad0c8a7    # 6841427.5f

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_1f
    if-nez v6, :cond_30

    if-nez v20, :cond_30

    if-eqz p3, :cond_31

    :cond_30
    move-object/from16 v0, p0

    move/from16 v7, p4

    move v13, v12

    move/from16 v4, v18

    goto :goto_20

    :cond_31
    const v0, 0x1554ef13

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    new-instance v0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v7, p4

    move/from16 v6, p6

    move v5, v12

    move/from16 v4, v18

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;-><init>(Ljava/lang/String;Ll3/v0;Lp3/h;IZIILi2/a0;)V

    move-object v13, v1

    move-object v1, v0

    move-object v0, v13

    move v13, v5

    invoke-interface {v9, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v14, p3

    move-object v15, v11

    move-object/from16 v3, v20

    goto :goto_21

    :goto_20
    const v1, 0x154b1c71

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    new-instance v1, Ll3/g;

    invoke-direct {v1, v0}, Ll3/g;-><init>(Ljava/lang/String;)V

    sget-object v2, Lb3/v1;->k:Lp1/u2;

    invoke-virtual {v11, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp3/h;

    const/4 v10, 0x0

    move/from16 v27, v5

    move v5, v13

    const/4 v13, 0x0

    const/4 v9, 0x0

    move-object/from16 v0, p1

    move-object/from16 v14, p3

    move-object v12, v8

    move-object v15, v11

    move-object/from16 v3, v20

    move-object v8, v2

    move-object v11, v6

    move-object/from16 v2, p2

    move/from16 v6, p6

    invoke-static/range {v0 .. v14}, Lq83/g;->a0(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILp3/h;Ljava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v8, v12

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_21
    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_32

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_22

    :cond_32
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_22
    sget-object v6, La3/k;->g:La3/i;

    sget-object v9, Lu0/e0;->a:Lu0/e0;

    invoke-static {v15, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_34

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    goto :goto_24

    :cond_33
    :goto_23
    const/4 v0, 0x1

    goto :goto_25

    :cond_34
    :goto_24
    invoke-static {v0, v15, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_23

    :goto_25
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move v6, v5

    move-object v9, v8

    move-object v10, v14

    move v5, v4

    move v8, v7

    move-object v4, v3

    goto :goto_26

    :cond_35
    move-object v15, v11

    invoke-virtual {v15}, Lp1/q;->X()V

    move/from16 v5, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move v6, v4

    move-object v4, v8

    move/from16 v8, p7

    :goto_26
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_36

    new-instance v0, Lu0/n;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p6

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lu0/n;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method public static final b0(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final c(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;ILjava/util/Map;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v7, p7

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v1, -0x3f70023c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    move-object/from16 v8, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v2, v7, 0x30

    move-object/from16 v9, p1

    if-nez v2, :cond_3

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v7, 0x180

    move-object/from16 v10, p2

    if-nez v2, :cond_5

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v7, 0xc00

    move-object/from16 v11, p3

    if-nez v2, :cond_7

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v7, 0x6000

    const/4 v3, 0x1

    if-nez v2, :cond_9

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x30000

    and-int/2addr v2, v7

    if-nez v2, :cond_b

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    const/high16 v2, 0x180000

    and-int/2addr v2, v7

    if-nez v2, :cond_d

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v2, 0x80000

    :goto_7
    or-int/2addr v1, v2

    :cond_d
    const/high16 v2, 0xc00000

    or-int/2addr v1, v2

    const/high16 v2, 0x6000000

    and-int/2addr v2, v7

    move-object/from16 v6, p5

    if-nez v2, :cond_f

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x4000000

    goto :goto_8

    :cond_e
    const/high16 v2, 0x2000000

    :goto_8
    or-int/2addr v1, v2

    :cond_f
    const/high16 v2, 0x30000000

    or-int/2addr v1, v2

    const v2, 0x12492493

    and-int/2addr v2, v1

    const v4, 0x12492492

    if-eq v2, v4, :cond_10

    goto :goto_9

    :cond_10
    const/4 v3, 0x0

    :goto_9
    and-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    const v2, 0x7ffffffe

    and-int v20, v1, v2

    const/16 v21, 0x400

    const/4 v12, 0x1

    const/4 v13, 0x1

    const v14, 0x7fffffff

    const/4 v15, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v0

    move-object/from16 v16, v6

    invoke-static/range {v8 .. v21}, Lq83/g;->a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move v5, v15

    goto :goto_a

    :cond_11
    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    move/from16 v5, p4

    :goto_a
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lny0/a1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lny0/a1;-><init>(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;ILjava/util/Map;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final c0(Ljava/util/Map;)Ljava/util/Map;
    .locals 2

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0
.end method

.method public static d(IILdc3/a;)Ldc3/h;
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    sget-object p2, Ldc3/a;->w:Ldc3/a;

    :cond_1
    const/4 p1, -0x2

    const/4 v0, 0x1

    if-eq p0, p1, :cond_8

    const/4 p1, -0x1

    if-eq p0, p1, :cond_6

    if-eqz p0, :cond_4

    const p1, 0x7fffffff

    if-eq p0, p1, :cond_3

    sget-object p1, Ldc3/a;->w:Ldc3/a;

    if-ne p2, p1, :cond_2

    new-instance p1, Ldc3/h;

    invoke-direct {p1, p0}, Ldc3/h;-><init>(I)V

    return-object p1

    :cond_2
    new-instance p1, Ldc3/q;

    invoke-direct {p1, p0, p2}, Ldc3/q;-><init>(ILdc3/a;)V

    return-object p1

    :cond_3
    new-instance p0, Ldc3/h;

    invoke-direct {p0, p1}, Ldc3/h;-><init>(I)V

    return-object p0

    :cond_4
    sget-object p0, Ldc3/a;->w:Ldc3/a;

    if-ne p2, p0, :cond_5

    new-instance p0, Ldc3/h;

    invoke-direct {p0, v1}, Ldc3/h;-><init>(I)V

    return-object p0

    :cond_5
    new-instance p0, Ldc3/q;

    invoke-direct {p0, v0, p2}, Ldc3/q;-><init>(ILdc3/a;)V

    return-object p0

    :cond_6
    sget-object p0, Ldc3/a;->w:Ldc3/a;

    if-ne p2, p0, :cond_7

    new-instance p0, Ldc3/q;

    sget-object p1, Ldc3/a;->x:Ldc3/a;

    invoke-direct {p0, v0, p1}, Ldc3/q;-><init>(ILdc3/a;)V

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    sget-object p0, Ldc3/a;->w:Ldc3/a;

    if-ne p2, p0, :cond_9

    new-instance p0, Ldc3/h;

    sget-object p1, Ldc3/l;->h:Ldc3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Ldc3/k;->b:I

    invoke-direct {p0, p1}, Ldc3/h;-><init>(I)V

    return-object p0

    :cond_9
    new-instance p0, Ldc3/q;

    invoke-direct {p0, v0, p2}, Ldc3/q;-><init>(ILdc3/a;)V

    return-object p0
.end method

.method public static final d0(Lob3/o;Lob3/g;)Lob3/l;
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->N(Lob3/g;)Lob3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ll3/g;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Ll3/v0;IZIILp3/h;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v0, p1

    move-object/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v15, p14

    move/from16 v9, p16

    move/from16 v10, p17

    move-object/from16 v4, p15

    check-cast v4, Lp1/q;

    const v1, -0x7e46da9f

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    const/4 v3, 0x2

    move-object/from16 v11, p0

    if-nez v1, :cond_1

    invoke-virtual {v4, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_3
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v4, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    :cond_5
    and-int/lit16 v5, v9, 0xc00

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-nez v5, :cond_7

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    move/from16 v5, v17

    goto :goto_4

    :cond_6
    move/from16 v5, v16

    :goto_4
    or-int/2addr v1, v5

    :cond_7
    and-int/lit16 v5, v9, 0x6000

    const/16 v18, 0x2000

    const/16 v19, 0x4000

    if-nez v5, :cond_9

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move/from16 v5, v19

    goto :goto_5

    :cond_8
    move/from16 v5, v18

    :goto_5
    or-int/2addr v1, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v9

    if-nez v5, :cond_b

    move-object/from16 v5, p5

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_a

    const/high16 v20, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v20, 0x10000

    :goto_6
    or-int v1, v1, v20

    goto :goto_7

    :cond_b
    move-object/from16 v5, p5

    :goto_7
    const/high16 v20, 0x180000

    and-int v20, v9, v20

    move/from16 v14, p6

    if-nez v20, :cond_d

    invoke-virtual {v4, v14}, Lp1/q;->e(I)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v21, 0x80000

    :goto_8
    or-int v1, v1, v21

    :cond_d
    const/high16 v21, 0xc00000

    and-int v21, v9, v21

    move/from16 v12, p7

    if-nez v21, :cond_f

    invoke-virtual {v4, v12}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_e

    const/high16 v22, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v22, 0x400000

    :goto_9
    or-int v1, v1, v22

    :cond_f
    const/high16 v22, 0x6000000

    and-int v22, v9, v22

    move/from16 v13, p8

    if-nez v22, :cond_11

    invoke-virtual {v4, v13}, Lp1/q;->e(I)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v23, 0x2000000

    :goto_a
    or-int v1, v1, v23

    :cond_11
    const/high16 v23, 0x30000000

    and-int v23, v9, v23

    move/from16 v7, p9

    if-nez v23, :cond_13

    invoke-virtual {v4, v7}, Lp1/q;->e(I)Z

    move-result v23

    if-eqz v23, :cond_12

    const/high16 v23, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v23, 0x10000000

    :goto_b
    or-int v1, v1, v23

    :cond_13
    and-int/lit8 v23, v10, 0x6

    move-object/from16 v2, p10

    if-nez v23, :cond_15

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_14

    const/4 v3, 0x4

    :cond_14
    or-int/2addr v3, v10

    goto :goto_c

    :cond_15
    move v3, v10

    :goto_c
    and-int/lit8 v23, v10, 0x30

    move-object/from16 v7, p11

    if-nez v23, :cond_17

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    const/16 v23, 0x20

    goto :goto_d

    :cond_16
    const/16 v23, 0x10

    :goto_d
    or-int v3, v3, v23

    :cond_17
    move/from16 p15, v1

    and-int/lit16 v1, v10, 0x180

    if-nez v1, :cond_19

    move-object/from16 v1, p12

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_18

    const/16 v20, 0x100

    goto :goto_e

    :cond_18
    const/16 v20, 0x80

    :goto_e
    or-int v3, v3, v20

    goto :goto_f

    :cond_19
    move-object/from16 v1, p12

    :goto_f
    and-int/lit16 v1, v10, 0xc00

    if-nez v1, :cond_1b

    move-object/from16 v1, p13

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1a

    move/from16 v16, v17

    :cond_1a
    or-int v3, v3, v16

    goto :goto_10

    :cond_1b
    move-object/from16 v1, p13

    :goto_10
    and-int/lit16 v1, v10, 0x6000

    if-nez v1, :cond_1e

    const v1, 0x8000

    and-int/2addr v1, v10

    if-nez v1, :cond_1c

    invoke-virtual {v4, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_11

    :cond_1c
    invoke-virtual {v4, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_11
    if-eqz v1, :cond_1d

    move/from16 v18, v19

    :cond_1d
    or-int v3, v3, v18

    :cond_1e
    const v1, 0x12492493

    and-int v1, p15, v1

    const v2, 0x12492492

    if-ne v1, v2, :cond_20

    and-int/lit16 v1, v3, 0x2493

    const/16 v2, 0x2492

    if-eq v1, v2, :cond_1f

    goto :goto_12

    :cond_1f
    const/4 v1, 0x0

    goto :goto_13

    :cond_20
    :goto_12
    const/4 v1, 0x1

    :goto_13
    and-int/lit8 v2, p15, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0}, Lhg3/i;->V(Ll3/g;)Z

    move-result v1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_24

    const v1, 0x8ae9de3

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, p15, 0x70

    const/16 v2, 0x20

    if-ne v1, v2, :cond_21

    const/4 v1, 0x1

    goto :goto_14

    :cond_21
    const/4 v1, 0x0

    :goto_14
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_22

    if-ne v2, v7, :cond_23

    :cond_22
    new-instance v2, Lu0/r1;

    invoke-direct {v2, v0}, Lu0/r1;-><init>(Ll3/g;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v2, Lu0/r1;

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object v1, v2

    goto :goto_15

    :cond_24
    const/4 v1, 0x0

    const v2, 0x8af9e5c

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    :goto_15
    invoke-static {v0}, Lhg3/i;->V(Ll3/g;)Z

    move-result v2

    if-eqz v2, :cond_28

    const v2, 0x8b2a4a3

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, p15, 0x70

    move/from16 v17, v3

    const/16 v3, 0x20

    if-ne v2, v3, :cond_25

    const/4 v2, 0x1

    goto :goto_16

    :cond_25
    const/4 v2, 0x0

    :goto_16
    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_26

    if-ne v3, v7, :cond_27

    :cond_26
    new-instance v3, Ls51/f;

    const/16 v2, 0x15

    invoke-direct {v3, v2, v1, v0}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v3, Lc93/a;

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    :goto_17
    move-object/from16 v18, v3

    goto :goto_19

    :cond_28
    move/from16 v17, v3

    const v2, 0x8b420a1

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, p15, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_29

    const/4 v2, 0x1

    goto :goto_18

    :cond_29
    const/4 v2, 0x0

    :goto_18
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2a

    if-ne v3, v7, :cond_2b

    :cond_2a
    new-instance v3, Lsc0/c;

    const/16 v2, 0xa

    invoke-direct {v3, v0, v2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v3, Lc93/a;

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_17

    :goto_19
    if-eqz p3, :cond_30

    if-eqz v8, :cond_2c

    sget-object v3, Lu0/d;->a:Ll83/k;

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2d

    :cond_2c
    move-object/from16 v19, v1

    goto :goto_1b

    :cond_2d
    iget-object v3, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    move-object/from16 v19, v1

    const-string v1, "androidx.compose.foundation.text.inlineContent"

    invoke-virtual {v0, v2, v3, v1}, Ll3/g;->c(IILjava/lang/String;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v1

    check-cast v20, Ljava/util/Collection;

    invoke-interface/range {v20 .. v20}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_1a
    if-ge v5, v0, :cond_2f

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move/from16 v22, v0

    move-object/from16 v0, v20

    check-cast v0, Ll3/e;

    move-object/from16 v20, v1

    iget-object v1, v0, Ll3/e;->a:Ljava/lang/Object;

    move/from16 v23, v5

    iget v5, v0, Ll3/e;->c:I

    iget v0, v0, Ll3/e;->b:I

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu0/j0;

    if-eqz v1, :cond_2e

    move-object/from16 v25, v1

    new-instance v1, Ll3/e;

    invoke-virtual/range {v25 .. v25}, Lu0/j0;->b()Ll3/d0;

    move-result-object v8

    invoke-direct {v1, v8, v0, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ll3/e;

    invoke-virtual/range {v25 .. v25}, Lu0/j0;->a()Lkotlin/jvm/functions/Function3;

    move-result-object v8

    invoke-direct {v1, v8, v0, v5}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2e
    add-int/lit8 v5, v23, 0x1

    move-object/from16 v8, p4

    move-object/from16 v1, v20

    move/from16 v0, v22

    goto :goto_1a

    :cond_2f
    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1c

    :goto_1b
    sget-object v0, Lu0/d;->a:Ll83/k;

    :goto_1c
    const/4 v1, 0x0

    goto :goto_1d

    :cond_30
    move-object/from16 v19, v1

    new-instance v0, Ll83/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1d
    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    if-eqz p3, :cond_32

    const v0, 0x8b8f36c

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_31

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v0, Lp1/c1;

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_32
    const/4 v2, 0x0

    const v0, 0x8ba4a3c

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    move-object v0, v1

    :goto_1e
    if-eqz p3, :cond_35

    const v1, 0x8bbb67d

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_33

    if-ne v2, v7, :cond_34

    :cond_33
    new-instance v2, Lq12/c;

    const/16 v1, 0xd

    invoke-direct {v2, v1, v0}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    move-object/from16 v16, v2

    goto :goto_1f

    :cond_35
    const/4 v5, 0x0

    const v2, 0x8bccd7c

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    move-object/from16 v16, v1

    :goto_1f
    shr-int/lit8 v1, p15, 0x3

    and-int/lit8 v1, v1, 0xe

    shr-int/lit8 v2, p15, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v1

    shl-int/lit8 v5, v17, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v2

    move-object/from16 v2, p10

    move/from16 v9, p15

    move-object/from16 v26, v0

    move/from16 v27, v1

    move-object/from16 p15, v8

    move-object/from16 v8, v19

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    invoke-static/range {v0 .. v5}, Lu0/q;->a(Ll3/g;Ll3/v0;Lp3/h;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v18 .. v18}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/g;

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v5, v9, 0x380

    const/16 v9, 0x100

    if-ne v5, v9, :cond_36

    const/4 v5, 0x1

    goto :goto_20

    :cond_36
    const/4 v5, 0x0

    :goto_20
    or-int/2addr v2, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_37

    if-ne v5, v7, :cond_38

    :cond_37
    new-instance v5, Lu0/k;

    const/4 v2, 0x0

    invoke-direct {v5, v8, v6, v2}, Lu0/k;-><init>(Lu0/r1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, p10

    move-object/from16 v20, p11

    move-object/from16 v21, p12

    move-object/from16 v22, p13

    move-object v10, v1

    move-object/from16 v18, v3

    move-object v9, v11

    move-object/from16 v23, v15

    move-object/from16 v19, v16

    move-object/from16 v11, p5

    move/from16 v16, p9

    move v15, v13

    move v13, v14

    move v14, v12

    move-object v12, v5

    invoke-static/range {v9 .. v23}, Lq83/g;->a0(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILp3/h;Ljava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-nez p3, :cond_3b

    const v2, 0x8cecd97

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3a

    if-ne v3, v7, :cond_39

    goto :goto_21

    :cond_39
    const/4 v2, 0x0

    goto :goto_22

    :cond_3a
    :goto_21
    new-instance v3, Lu0/l;

    const/4 v2, 0x0

    invoke-direct {v3, v8, v2}, Lu0/l;-><init>(Lu0/r1;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    check-cast v3, Lc93/a;

    new-instance v5, Lu0/u0;

    invoke-direct {v5, v3}, Lu0/u0;-><init>(Lc93/a;)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_23

    :cond_3b
    const v2, 0x8d18011

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3c

    if-ne v3, v7, :cond_3d

    :cond_3c
    new-instance v3, Lu0/l;

    const/4 v2, 0x1

    invoke-direct {v3, v8, v2}, Lu0/l;-><init>(Lu0/r1;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    check-cast v3, Lc93/a;

    move-object/from16 v2, v26

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_3e

    if-ne v9, v7, :cond_3f

    :cond_3e
    new-instance v9, Lo0/i;

    const/16 v5, 0x1a

    invoke-direct {v9, v5, v2}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3f
    check-cast v9, Lc93/a;

    new-instance v5, Lc4/o;

    const/4 v2, 0x1

    invoke-direct {v5, v2, v3, v9}, Lc4/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    :goto_23
    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_40

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_24

    :cond_40
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_24
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v4, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_41

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_42

    :cond_41
    invoke-static {v2, v4, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_42
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v8, :cond_43

    const v1, -0x19d78e09

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    :goto_25
    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_43
    const/4 v2, 0x0

    const v1, -0x115988b6

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4, v2}, Lu0/r1;->a(Landroidx/compose/runtime/Composer;I)V

    goto :goto_25

    :goto_26
    if-nez p15, :cond_44

    const v1, -0x19d6c7af

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    :goto_27
    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    goto :goto_28

    :cond_44
    const v1, -0x19d6c7ae

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    move-object/from16 v1, p15

    move/from16 v3, v27

    invoke-static {v0, v1, v4, v3}, Lu0/d;->a(Ll3/g;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    goto :goto_27

    :goto_28
    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_29

    :cond_45
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_29
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_46

    new-instance v0, Lu0/m;

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v28, v1

    move-object v3, v6

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v17}, Lu0/m;-><init>(Landroidx/compose/ui/Modifier;Ll3/g;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Ll3/v0;IZIILp3/h;Le1/j;Li2/a0;Lkotlin/jvm/functions/Function1;Lu0/z0;II)V

    move-object v1, v0

    move-object/from16 v0, v28

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_46
    return-void
.end method

.method public static final e0(Lob3/o;Lob3/h;)Lob3/l;
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroid/content/Context;Lui/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 15

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    instance-of v3, v2, Lui/c0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lui/c0;

    iget v4, v3, Lui/c0;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lui/c0;->F:I

    goto :goto_0

    :cond_0
    new-instance v3, Lui/c0;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lui/c0;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lui/c0;->F:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v0, v3, Lui/c0;->w:Ljava/lang/Object;

    check-cast v0, Lqi/i;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lui/c0;->z:Ljava/lang/Object;

    check-cast v0, Lqi/i;

    iget-object v1, v3, Lui/c0;->y:Ljava/lang/String;

    iget-object v5, v3, Lui/c0;->x:Ljava/lang/String;

    iget-object v8, v3, Lui/c0;->w:Ljava/lang/Object;

    check-cast v8, Landroid/content/Context;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v5

    move-object v5, v10

    goto/16 :goto_3

    :cond_3
    iget-object v0, v3, Lui/c0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v3, Lui/c0;->y:Ljava/lang/String;

    iget-object v5, v3, Lui/c0;->x:Ljava/lang/String;

    iget-object v9, v3, Lui/c0;->w:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v0

    move-object v11, v1

    move-object v1, v5

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v2, 0x0

    move-object/from16 v5, p5

    invoke-static {p0, v1, v5, v2}, Lq83/g;->K(Landroid/content/Context;Lui/y;Ljava/lang/String;Z)Lqi/d0;

    move-result-object v5

    if-eqz v5, :cond_c

    iput-object p0, v3, Lui/c0;->w:Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, v3, Lui/c0;->x:Ljava/lang/String;

    move-object/from16 v11, p3

    iput-object v11, v3, Lui/c0;->y:Ljava/lang/String;

    move-object/from16 v12, p4

    iput-object v12, v3, Lui/c0;->z:Ljava/lang/Object;

    iput v9, v3, Lui/c0;->F:I

    new-instance v13, Lbc3/m;

    invoke-static {v3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v14

    invoke-direct {v13, v9, v14}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v13}, Lbc3/m;->s()V

    new-instance v14, Lui/b0;

    invoke-direct {v14, v13, v2}, Lui/b0;-><init>(Lbc3/m;I)V

    invoke-virtual {v5, v14}, Lqi/d0;->b(Lqi/z;)V

    new-instance v2, Lui/b0;

    invoke-direct {v2, v13, v9}, Lui/b0;-><init>(Lbc3/m;I)V

    invoke-virtual {v5, v2}, Lqi/d0;->a(Lqi/z;)V

    invoke-virtual {v13}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    goto/16 :goto_5

    :cond_5
    move-object v9, p0

    :goto_1
    check-cast v2, Lqi/i;

    iput-object v9, v3, Lui/c0;->w:Ljava/lang/Object;

    iput-object v11, v3, Lui/c0;->x:Ljava/lang/String;

    iput-object v12, v3, Lui/c0;->y:Ljava/lang/String;

    iput-object v2, v3, Lui/c0;->z:Ljava/lang/Object;

    iput v8, v3, Lui/c0;->F:I

    iget-object v0, v2, Lqi/i;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v1, v2

    move-object v0, v6

    move-object v8, v9

    move-object v5, v10

    goto :goto_2

    :cond_6
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v5, Lay/u;

    const/16 v8, 0x17

    move-object/from16 p3, v1

    move-object/from16 p1, v2

    move-object p0, v5

    move/from16 p5, v8

    move-object/from16 p2, v9

    move-object/from16 p4, v10

    invoke-direct/range {p0 .. p5}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v2, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move-object/from16 v5, p4

    invoke-static {v0, v2, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_7

    goto :goto_2

    :cond_7
    move-object v0, v6

    :goto_2
    if-ne v0, v4, :cond_8

    goto :goto_5

    :cond_8
    move-object v0, v1

    move-object v1, v12

    :goto_3
    iput-object v0, v3, Lui/c0;->w:Ljava/lang/Object;

    iput-object v5, v3, Lui/c0;->x:Ljava/lang/String;

    iput-object v5, v3, Lui/c0;->y:Ljava/lang/String;

    iput-object v5, v3, Lui/c0;->z:Ljava/lang/Object;

    iput v7, v3, Lui/c0;->F:I

    iget-object v2, v0, Lqi/i;->f:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_9
    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    new-instance v5, Ld0;

    const/4 v7, 0x0

    const/16 v9, 0x9

    move-object/from16 p1, v0

    move-object/from16 p4, v1

    move-object p0, v5

    move-object/from16 p5, v7

    move-object/from16 p2, v8

    move/from16 p6, v9

    move-object/from16 p3, v11

    invoke-direct/range {p0 .. p6}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v1, p0

    invoke-static {v2, v1, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    move-object v6, v1

    :cond_a
    :goto_4
    if-ne v6, v4, :cond_b

    :goto_5
    return-object v4

    :cond_b
    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to create parsing task for "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;
    .locals 1

    and-int/lit8 p2, p2, 0x2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p0, p1, p2, v0}, Lq83/g;->V(Landroidx/compose/ui/Modifier;Lf0/r1;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljava/util/List;Lc93/a;)Ljava/util/ArrayList;
    .locals 9

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lu0/y0;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lu0/y0;-><init>(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lu0/s1;

    invoke-virtual {v4}, Lu0/s1;->j()Lqm2/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lqm2/c;->a(Lu0/y0;)Lcom/google/android/material/datepicker/n;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/material/datepicker/n;->s()I

    move-result v5

    invoke-virtual {v4}, Lcom/google/android/material/datepicker/n;->s()I

    move-result v6

    invoke-virtual {v4}, Lcom/google/android/material/datepicker/n;->q()I

    move-result v7

    invoke-virtual {v4}, Lcom/google/android/material/datepicker/n;->q()I

    move-result v8

    invoke-static {v5, v6, v7, v8}, Lva3/l;->n(IIII)J

    move-result-wide v5

    invoke-interface {v3, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-virtual {v4}, Lcom/google/android/material/datepicker/n;->r()Lc93/a;

    move-result-object v4

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h(ILjava/lang/String;)Landroidx/room/n1;
    .locals 3

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/room/n1;->I:Ljava/util/TreeMap;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/n1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v1, Landroidx/room/n1;->x:Ljava/lang/String;

    iput p0, v1, Landroidx/room/n1;->H:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    monitor-exit v0

    new-instance v0, Landroidx/room/n1;

    invoke-direct {v0, p0}, Landroidx/room/n1;-><init>(I)V

    iput-object p1, v0, Landroidx/room/n1;->x:Ljava/lang/String;

    iput p0, v0, Landroidx/room/n1;->H:I

    return-object v0

    :goto_0
    monitor-exit v0

    throw p0
.end method

.method public static final i(Lzc3/d;)Lad3/k;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lad3/k;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lad3/k;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, p0, v1}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final j(Lzc3/e;)Lad3/p;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lad3/p;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lad3/p;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, p0, v1}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final k(Lob3/o;Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->h0(Lob3/g;)Lob3/h;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/util/ArrayList;)Z
    .locals 14

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const-wide v3, 0xffffffffL

    const/16 v5, 0x20

    if-gt v0, v2, :cond_1

    sget-object p0, Lm83/y;->w:Lm83/y;

    goto/16 :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    move v8, v1

    :goto_0
    if-ge v8, v7, :cond_2

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Li3/p;

    check-cast v6, Li3/p;

    invoke-virtual {v6}, Li3/p;->g()Lh2/c;

    move-result-object v11

    invoke-virtual {v11}, Lh2/c;->d()J

    move-result-wide v11

    shr-long/2addr v11, v5

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    invoke-virtual {v10}, Li3/p;->g()Lh2/c;

    move-result-object v12

    invoke-virtual {v12}, Lh2/c;->d()J

    move-result-wide v12

    shr-long/2addr v12, v5

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    sub-float/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    invoke-virtual {v6}, Li3/p;->g()Lh2/c;

    move-result-object v6

    invoke-virtual {v6}, Lh2/c;->d()J

    move-result-wide v12

    and-long/2addr v12, v3

    long-to-int v6, v12

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-virtual {v10}, Li3/p;->g()Lh2/c;

    move-result-object v10

    invoke-virtual {v10}, Lh2/c;->d()J

    move-result-wide v12

    and-long/2addr v12, v3

    long-to-int v10, v12

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    sub-float/2addr v6, v10

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v12, v6

    shl-long/2addr v10, v5

    and-long/2addr v12, v3

    or-long/2addr v10, v12

    new-instance v6, Lh2/b;

    invoke-direct {v6, v10, v11}, Lh2/b;-><init>(J)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v9

    goto :goto_0

    :cond_2
    move-object p0, v0

    :goto_1
    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ne v0, v2, :cond_3

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh2/b;

    iget-wide v6, p0, Lh2/b;->a:J

    goto :goto_3

    :cond_3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Empty collection can\'t be reduced."

    invoke-static {v0}, La4/b;->d(Ljava/lang/String;)V

    :cond_4
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-gt v2, v6, :cond_5

    move v7, v2

    :goto_2
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh2/b;

    iget-wide v8, v8, Lh2/b;->a:J

    check-cast v0, Lh2/b;

    iget-wide v10, v0, Lh2/b;->a:J

    invoke-static {v10, v11, v8, v9}, Lh2/b;->h(JJ)J

    move-result-wide v8

    new-instance v0, Lh2/b;

    invoke-direct {v0, v8, v9}, Lh2/b;-><init>(J)V

    if-eq v7, v6, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    check-cast v0, Lh2/b;

    iget-wide v6, v0, Lh2/b;->a:J

    :goto_3
    shr-long v8, v6, v5

    long-to-int p0, v8

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    and-long/2addr v3, v6

    long-to-int v0, v3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_6

    :goto_4
    return v2

    :cond_6
    return v1
.end method

.method public static final m(Ljc/v;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    const-string v1, "getWorkDatabase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()Lqc/c;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    invoke-static {v2}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Lqc/u;->d(Ljava/lang/String;)Lic/m0;

    move-result-object v5

    sget-object v6, Lic/m0;->y:Lic/m0;

    if-eq v5, v6, :cond_0

    sget-object v6, Lic/m0;->z:Lic/m0;

    if-eq v5, v6, :cond_0

    iget-object v5, v1, Lqc/u;->a:Landroidx/room/z0;

    new-instance v6, Lht2/d;

    const/16 v7, 0x1c

    invoke-direct {v6, v3, v7}, Lht2/d;-><init>(Ljava/lang/String;I)V

    const/4 v7, 0x0

    invoke-static {v5, v7, v4, v6}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    :cond_0
    invoke-virtual {v0, v3}, Lqc/c;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ljc/v;->f:Ljc/g;

    const-string v1, "getProcessor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Processor cancelling "

    iget-object v2, v0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    sget-object v5, Ljc/g;->l:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v5, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Ljc/g;->i:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, Ljc/g;->b(Ljava/lang/String;)Ljc/i0;

    move-result-object v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v0, v4}, Ljc/g;->d(Ljava/lang/String;Ljc/i0;I)Z

    iget-object p0, p0, Ljc/v;->e:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljc/i;

    invoke-interface {v0, p1}, Ljc/i;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static n(III)V
    .locals 4

    const-string v0, "startIndex: "

    if-ltz p0, :cond_1

    if-gt p1, p2, :cond_1

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " > endIndex: "

    invoke-static {p0, p1, v0, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ", endIndex: "

    const-string v3, ", size: "

    invoke-static {p0, p1, v0, v2, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static o(III)V
    .locals 4

    const-string v0, "fromIndex: "

    if-ltz p0, :cond_1

    if-gt p1, p2, :cond_1

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, " > toIndex: "

    invoke-static {p0, p1, v0, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ", toIndex: "

    const-string v3, ", size: "

    invoke-static {p0, p1, v0, v2, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static varargs p([Lkotlin/jvm/functions/Function1;)Lea2/l;
    .locals 2

    array-length v0, p0

    if-lez v0, :cond_0

    new-instance v0, Lea2/l;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static s(Ljava/util/ArrayList;)V
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgt/b;

    new-instance v5, Lgt/h;

    invoke-direct {v5, v2}, Lgt/h;-><init>(Lgt/b;)V

    iget-object v6, v2, Lgt/b;->b:Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lgt/p;

    new-instance v8, Lgt/i;

    iget v9, v2, Lgt/b;->e:I

    if-nez v9, :cond_1

    move v9, v4

    goto :goto_1

    :cond_1
    move v9, v3

    :goto_1
    xor-int/lit8 v10, v9, 0x1

    invoke-direct {v8, v7, v10}, Lgt/i;-><init>(Lgt/p;Z)V

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v0, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Set;

    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_4

    if-nez v9, :cond_3

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Multiple components provide "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    invoke-interface {v8, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgt/h;

    iget-object v6, v5, Lgt/h;->a:Lgt/b;

    iget-object v6, v6, Lgt/b;->c:Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lgt/j;

    iget v8, v7, Lgt/j;->c:I

    if-nez v8, :cond_8

    new-instance v8, Lgt/i;

    iget-object v9, v7, Lgt/j;->a:Lgt/p;

    iget v7, v7, Lgt/j;->b:I

    const/4 v10, 0x2

    if-ne v7, v10, :cond_9

    move v7, v4

    goto :goto_4

    :cond_9
    move v7, v3

    :goto_4
    invoke-direct {v8, v9, v7}, Lgt/i;-><init>(Lgt/p;Z)V

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Set;

    if-nez v7, :cond_a

    goto :goto_3

    :cond_a
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lgt/h;

    iget-object v9, v5, Lgt/h;->b:Ljava/util/HashSet;

    invoke-virtual {v9, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v8, v8, Lgt/h;->c:Ljava/util/HashSet;

    invoke-virtual {v8, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_6

    :cond_c
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgt/h;

    iget-object v5, v4, Lgt/h;->c:Ljava/util/HashSet;

    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_e
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgt/h;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    iget-object v4, v2, Lgt/h;->b:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_f
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgt/h;

    iget-object v6, v5, Lgt/h;->c:Ljava/util/HashSet;

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v6, v5, Lgt/h;->c:Ljava/util/HashSet;

    invoke-virtual {v6}, Ljava/util/HashSet;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-ne v3, p0, :cond_11

    return-void

    :cond_11
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgt/h;

    iget-object v2, v1, Lgt/h;->c:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    iget-object v2, v1, Lgt/h;->b:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    iget-object v1, v1, Lgt/h;->a:Lgt/b;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_13
    new-instance v0, Lcom/google/firebase/components/DependencyCycleException;

    invoke-direct {v0, p0}, Lcom/google/firebase/components/DependencyCycleException;-><init>(Ljava/util/ArrayList;)V

    throw v0
.end method

.method public static final t(Landroidx/room/u1;Ljava/lang/String;Lc93/a;)Ld4/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc/i;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p2, v1}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0}, Lj93/l0;->z(Ld4/j;)Ld4/l;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, p0, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public static v()Ljava/lang/String;
    .locals 12

    invoke-static {}, Lio/sentry/util/k;->a()Lio/sentry/util/j;

    move-result-object v0

    const/16 v1, 0x10

    new-array v2, v1, [B

    invoke-virtual {v0, v2}, Lio/sentry/util/j;->b([B)V

    const/4 v0, 0x6

    aget-byte v3, v2, v0

    and-int/lit8 v3, v3, 0xf

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    or-int/lit8 v3, v3, 0x40

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const/16 v0, 0x8

    aget-byte v3, v2, v0

    and-int/lit8 v3, v3, 0x3f

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-wide v6, v3

    :goto_0
    if-ge v5, v0, :cond_0

    shl-long/2addr v6, v0

    aget-byte v8, v2, v5

    and-int/lit16 v8, v8, 0xff

    int-to-long v8, v8

    or-long/2addr v6, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v0

    :goto_1
    if-ge v5, v1, :cond_1

    shl-long/2addr v3, v0

    aget-byte v8, v2, v5

    and-int/lit16 v8, v8, 0xff

    int-to-long v8, v8

    or-long/2addr v3, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/UUID;

    invoke-direct {v2, v6, v7, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sget-object v3, Lio/sentry/util/n;->a:[C

    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v5

    const/16 v2, 0x20

    new-array v7, v2, [C

    invoke-static {v7, v3, v4}, Lio/sentry/util/n;->a([CJ)V

    sget-object v3, Lio/sentry/util/n;->a:[C

    const-wide/high16 v8, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v8, v5

    const/16 v4, 0x3c

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    aput-char v4, v7, v1

    const-wide/high16 v8, 0xf00000000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x38

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x11

    aput-char v4, v7, v8

    const-wide/high16 v8, 0xf0000000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x34

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x12

    aput-char v4, v7, v8

    const-wide/high16 v8, 0xf000000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x30

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x13

    aput-char v4, v7, v8

    const-wide v8, 0xf00000000000L

    and-long/2addr v8, v5

    const/16 v4, 0x2c

    ushr-long/2addr v8, v4

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x14

    aput-char v4, v7, v8

    const-wide v9, 0xf0000000000L

    and-long/2addr v9, v5

    const/16 v4, 0x28

    ushr-long/2addr v9, v4

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x15

    aput-char v4, v7, v9

    const-wide v9, 0xf000000000L

    and-long/2addr v9, v5

    const/16 v4, 0x24

    ushr-long/2addr v9, v4

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x16

    aput-char v4, v7, v9

    const-wide v9, 0xf00000000L

    and-long/2addr v9, v5

    ushr-long/2addr v9, v2

    long-to-int v2, v9

    aget-char v2, v3, v2

    const/16 v4, 0x17

    aput-char v2, v7, v4

    const-wide v9, 0xf0000000L

    and-long/2addr v9, v5

    const/16 v2, 0x1c

    ushr-long/2addr v9, v2

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x18

    aput-char v4, v7, v9

    const-wide/32 v10, 0xf000000

    and-long/2addr v10, v5

    ushr-long v9, v10, v9

    long-to-int v4, v9

    aget-char v4, v3, v4

    const/16 v9, 0x19

    aput-char v4, v7, v9

    const-wide/32 v9, 0xf00000

    and-long/2addr v9, v5

    ushr-long v8, v9, v8

    long-to-int v4, v8

    aget-char v4, v3, v4

    const/16 v8, 0x1a

    aput-char v4, v7, v8

    const-wide/32 v8, 0xf0000

    and-long/2addr v8, v5

    ushr-long/2addr v8, v1

    long-to-int v1, v8

    aget-char v1, v3, v1

    const/16 v4, 0x1b

    aput-char v1, v7, v4

    const-wide/32 v8, 0xf000

    and-long/2addr v8, v5

    const/16 v1, 0xc

    ushr-long/2addr v8, v1

    long-to-int v1, v8

    aget-char v1, v3, v1

    aput-char v1, v7, v2

    const-wide/16 v1, 0xf00

    and-long/2addr v1, v5

    ushr-long v0, v1, v0

    long-to-int v0, v0

    aget-char v0, v3, v0

    const/16 v1, 0x1d

    aput-char v0, v7, v1

    const-wide/16 v0, 0xf0

    and-long/2addr v0, v5

    const/4 v2, 0x4

    ushr-long/2addr v0, v2

    long-to-int v0, v0

    aget-char v0, v3, v0

    const/16 v1, 0x1e

    aput-char v0, v7, v1

    const-wide/16 v0, 0xf

    and-long/2addr v0, v5

    long-to-int v0, v0

    aget-char v0, v3, v0

    const/16 v1, 0x1f

    aput-char v0, v7, v1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v7}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static final w(Lsa3/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lsa3/f;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, p1}, Lsa3/f;->a(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "."

    invoke-static {p0, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {}, Ls/c2;->b()Ls/c2;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ls/c2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static y(Landroidx/lifecycle/e2;)Leb/b0;
    .locals 3

    const-string v0, "viewModelStore"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll8/a;->b:Ll8/a;

    const-string v1, "defaultCreationExtras"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lzt/q;

    sget-object v2, Leb/b0;->x:Landroidx/fragment/app/s1;

    invoke-direct {v1, p0, v2, v0}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    const-class p0, Leb/b0;

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const-string v0, "modelClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Leb/b0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z(Ljava/lang/String;)Lfj/a;
    .locals 3

    const-string v0, "instanceName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfj/a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lfj/a;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lfj/a;

    invoke-direct {v2}, Lfj/a;-><init>()V

    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Lfj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public C(Ljava/lang/String;)V
    .locals 2

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x2

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, v1, p1}, Lq83/g;->I(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public D(I)Z
    .locals 1

    const-string v0, "lvl"

    invoke-static {p1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {v0, p1}, Le4/p;->b(II)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract I(ILjava/lang/String;)V
.end method

.method public J(Lc93/a;)V
    .locals 2

    const-string v0, "lvl"

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lq83/g;->D(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, v1, p1}, Lq83/g;->I(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 2

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, v1, p1}, Lq83/g;->I(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
