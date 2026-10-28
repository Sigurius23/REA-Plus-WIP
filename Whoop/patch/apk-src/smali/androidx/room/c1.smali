.class public abstract synthetic Landroidx/room/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final B(II)I
    .locals 0

    shr-int/2addr p0, p1

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static E(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;
    .locals 5

    const-class v0, Ljava/util/Properties;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne p0, v0, :cond_0

    new-array p0, v3, [Ljava/lang/reflect/Type;

    const-class p1, Ljava/lang/String;

    aput-object p1, p0, v2

    aput-object p1, p0, v1

    return-object p0

    :cond_0
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p0, p1, v0}, Lrx/f;->d(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, p1, v0, v4}, Lrx/f;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz p1, :cond_1

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0

    :cond_1
    new-array p0, v3, [Ljava/lang/reflect/Type;

    const-class p1, Ljava/lang/Object;

    aput-object p1, p0, v2

    aput-object p1, p0, v1

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static varargs F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;
    .locals 2

    array-length v0, p1

    if-eqz v0, :cond_0

    new-instance v0, Lrx/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lrx/d;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing type arguments for "

    invoke-static {p0, v0}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final G(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p0, "Unknown"

    return-object p0

    :cond_0
    const/16 p0, 0x24

    invoke-static {v0, p0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x2e

    invoke-static {v1, p0, p0}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    const-string v0, "Kt"

    invoke-static {p0, v0}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static H(Ljava/lang/String;)La3/p;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p0, :cond_0

    :try_start_1
    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :try_start_2
    new-instance p0, La3/p;

    const/16 v1, 0xc

    invoke-direct {p0, v0, v0, v0, v1}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object p0

    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const-string v2, ""

    if-nez p0, :cond_1

    move-object p0, v2

    goto :goto_1

    :cond_1
    :try_start_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "://"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-virtual {v1}, Ljava/net/URI;->getRawAuthority()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    move-object v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/net/URI;->getRawAuthority()Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v1}, Ljava/net/URI;->getRawPath()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/net/URI;->getRawPath()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v1}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/net/URI;->getRawFragment()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Landroidx/room/c1;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v2, La3/p;

    const/16 v3, 0xc

    invoke-direct {v2, p0, v4, v1, v3}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v2

    :catch_1
    new-instance p0, La3/p;

    const/16 v1, 0xc

    invoke-direct {p0, v0, v0, v0, v1}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object p0
.end method

.method public static I(Ljava/lang/String;)Lae3/k;
    .locals 9

    const-string v0, "statusLine"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "HTTP/1."

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x4

    const/16 v3, 0x20

    const-string v4, "Unexpected status line: "

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x9

    if-lt v0, v1, :cond_2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v3, :cond_2

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    add-int/lit8 v0, v0, -0x30

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    if-ne v0, v5, :cond_0

    sget-object v0, Lud3/m0;->z:Lud3/m0;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lud3/m0;->y:Lud3/m0;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string v0, "ICY "

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lud3/m0;->y:Lud3/m0;

    move v1, v2

    goto :goto_0

    :cond_4
    const-string v0, "SOURCETABLE "

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lud3/m0;->z:Lud3/m0;

    const/16 v1, 0xc

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v6, v1, 0x3

    if-lt v5, v6, :cond_8

    invoke-virtual {p0, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v7, "substring(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v8

    if-le v8, v6, :cond_6

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v3, :cond_5

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const-string p0, ""

    :goto_1
    new-instance v1, Lae3/k;

    invoke-direct {v1, v0, v5, p0}, Lae3/k;-><init>(Lud3/m0;ILjava/lang/String;)V

    return-object v1

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static J(Ljava/lang/String;)Lud3/h0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static K(Ljava/lang/Class;Z)Leb/g1;
    .locals 1

    const-class v0, Landroid/os/Parcelable;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p1, Leb/c1;

    invoke-direct {p1, p0}, Leb/c1;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_0
    new-instance p1, Leb/d1;

    invoke-direct {p1, p0}, Leb/d1;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_1
    const-class v0, Ljava/lang/Enum;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_2

    new-instance p1, Leb/b1;

    invoke-direct {p1, p0}, Leb/b1;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_2
    const-class v0, Ljava/io/Serializable;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_3

    new-instance p1, Leb/e1;

    invoke-direct {p1, p0}, Leb/e1;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_3
    new-instance p1, Leb/f1;

    invoke-direct {p1, p0}, Leb/f1;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 12

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const/4 v10, 0x0

    const v11, 0x7feff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v7, p0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final M(Landroid/view/View;Lg/b0;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0d67

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static final N(Li63/z;Ljava/lang/String;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :cond_0
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Li63/a0;->a:Ljava/util/List;

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [C

    const/16 v1, 0x2f

    const/4 v2, 0x0

    aput-char v1, v0, v2

    const/4 v1, 0x6

    invoke-static {p1, v0, v2, v1}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li63/z;->h:Ljava/util/List;

    return-void
.end method

.method public static final O(Lq1/l0;ILjava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lq1/l0;->e:[Ljava/lang/Object;

    iget v1, p0, Lq1/l0;->f:I

    iget-object v2, p0, Lq1/l0;->a:[Lq1/j0;

    iget p0, p0, Lq1/l0;->b:I

    add-int/lit8 p0, p0, -0x1

    aget-object p0, v2, p0

    iget p0, p0, Lq1/j0;->c:I

    sub-int/2addr v1, p0

    add-int/2addr v1, p1

    aput-object p2, v0, v1

    return-void
.end method

.method public static final P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    iget v0, p0, Lq1/l0;->f:I

    iget-object v1, p0, Lq1/l0;->a:[Lq1/j0;

    iget v2, p0, Lq1/l0;->b:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    iget v1, v1, Lq1/j0;->c:I

    sub-int/2addr v0, v1

    iget-object p0, p0, Lq1/l0;->e:[Ljava/lang/Object;

    add-int/2addr p1, v0

    aput-object p2, p0, p1

    add-int/2addr v0, p3

    aput-object p4, p0, v0

    return-void
.end method

.method public static Q(ILjava/lang/String;)Lue/a;
    .locals 5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    and-int/lit8 v1, p0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    const-string v1, "sts"

    :goto_0
    and-int/lit8 v3, p0, 0x4

    if-eqz v3, :cond_1

    move-object p1, v2

    :cond_1
    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_2

    move-object v0, v2

    :cond_2
    if-nez v1, :cond_3

    if-nez p1, :cond_3

    if-nez v0, :cond_3

    sget-object p0, Lgf/i;->w:Lgf/i;

    goto :goto_3

    :cond_3
    new-instance p0, Lgf/c;

    invoke-direct {p0}, Lgf/c;-><init>()V

    invoke-static {}, Lwe/f;->j()Lgf/a;

    move-result-object v2

    const-string v3, "key"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v2, p1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-static {}, Lwe/f;->l()Lgf/a;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_7

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p0, p1, v1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    invoke-static {}, Lwe/f;->m()Lgf/a;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_8
    :goto_3
    new-instance p1, Lue/a;

    const-string v0, "aws.auth#sigv4"

    invoke-direct {p1, v0, p0}, Lue/a;-><init>(Ljava/lang/String;Lgf/b;)V

    return-object p1
.end method

.method public static R(Ljava/lang/reflect/Type;)Lrx/e;
    .locals 2

    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    move-object p0, v0

    :goto_0
    new-instance v0, Lrx/e;

    sget-object v1, Lrx/f;->b:[Ljava/lang/reflect/Type;

    invoke-direct {v0, p0, v1}, Lrx/e;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static final S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-static {p0}, Landroidx/room/c1;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance p0, La6/l0;

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p0

    return-object p0
.end method

.method public static final T(J)D
    .locals 4

    const/16 v0, 0xb

    ushr-long v0, p0, v0

    long-to-double v0, v0

    const/16 v2, 0x800

    int-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/16 v2, 0x7ff

    and-long/2addr p0, v2

    long-to-double p0, p0

    add-double/2addr v0, p0

    return-wide v0
.end method

.method public static final a(Lgb/q;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v2, p0

    move/from16 v6, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v0, 0x118f13d0

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v8, 0x4

    if-eqz v0, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int v9, v6, v0

    and-int/lit8 v0, v9, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_2
    :goto_1
    invoke-static {v7}, Ly1/k;->g(Landroidx/compose/runtime/Composer;)Ly1/d;

    move-result-object v3

    invoke-virtual {v2}, Leb/i1;->b()Leb/t;

    move-result-object v0

    iget-object v0, v0, Leb/t;->e:Lec3/r1;

    const/4 v10, 0x0

    invoke-static {v0, v7, v10}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    sget-object v4, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v7, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_3

    if-ne v11, v12, :cond_7

    :cond_3
    new-instance v11, Lz1/p;

    invoke-direct {v11}, Lz1/p;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Leb/q;

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    iget-object v14, v14, Leb/q;->H:Landroidx/lifecycle/i0;

    iget-object v14, v14, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v15, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v14, v15}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v14

    if-ltz v14, :cond_4

    :goto_3
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v11, v5}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lz1/p;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v11, v0, v7, v10}, Landroidx/room/c1;->b(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Leb/i1;->b()Leb/t;

    move-result-object v0

    iget-object v0, v0, Leb/t;->f:Lec3/r1;

    invoke-static {v0, v7, v10}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_8

    new-instance v0, Lz1/p;

    invoke-direct {v0}, Lz1/p;-><init>()V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v0

    check-cast v4, Lz1/p;

    const v0, 0x511fc6cf

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v11

    :goto_4
    move-object v0, v11

    check-cast v0, Ln83/b;

    invoke-virtual {v0}, Ln83/b;->hasNext()Z

    move-result v1

    const/4 v5, 0x1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Leb/q;

    iget-object v0, v1, Leb/q;->x:Leb/n0;

    const-string v14, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgb/p;

    and-int/lit8 v14, v9, 0xe

    if-ne v14, v8, :cond_9

    goto :goto_5

    :cond_9
    move v5, v10

    :goto_5
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_a

    if-ne v14, v12, :cond_b

    :cond_a
    new-instance v14, La3/z0;

    const/16 v5, 0xa

    invoke-direct {v14, v5, v2, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, Lc93/a;

    invoke-virtual {v0}, Lgb/p;->p()Lc4/a0;

    move-result-object v15

    move-object v5, v0

    new-instance v0, Lgb/l;

    invoke-direct/range {v0 .. v5}, Lgb/l;-><init>(Leb/q;Lgb/q;Ly1/d;Lz1/p;Lgb/p;)V

    const v1, 0x43541ebc

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x180

    invoke-static {v14, v15, v0, v7, v1}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_c
    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v3, v9, 0xe

    if-ne v3, v8, :cond_d

    move v10, v5

    :cond_d
    or-int/2addr v1, v10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_e

    if-ne v3, v12, :cond_f

    :cond_e
    new-instance v3, Lgb/m;

    const/4 v1, 0x0

    invoke-direct {v3, v13, v2, v4, v1}, Lgb/m;-><init>(Lp1/c1;Lgb/q;Lz1/p;Lq83/d;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lc93/m;

    invoke-static {v0, v4, v3, v7}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    :goto_6
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v1, Lb2/r;

    const/4 v3, 0x5

    invoke-direct {v1, v2, v6, v3}, Lb2/r;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final b(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p2, Lp1/q;

    const v0, 0x5baa69c3

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_4

    :cond_3
    :goto_2
    sget-object v0, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v3, v2, Leb/q;->H:Landroidx/lifecycle/i0;

    invoke-virtual {p2, v0}, Lp1/q;->h(Z)Z

    move-result v4

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p2, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_5

    :cond_4
    new-instance v5, Lgb/o;

    invoke-direct {v5, v2, p0, v0}, Lgb/o;-><init>(Leb/q;Ljava/util/List;Z)V

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v5, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_3

    :cond_6
    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lc4/q;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p3, v1}, Lc4/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final c(ZLc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, -0x264426c9

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->h(Z)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {p1, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_4

    invoke-static {p2}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    new-instance v5, Lp1/a0;

    invoke-direct {v5, v3}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v5

    :cond_4
    check-cast v3, Lp1/a0;

    iget-object v3, v3, Lp1/a0;->w:Lbc3/c0;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    new-instance v5, Lh/k;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc93/m;

    invoke-direct {v5, p0}, Lg/t;-><init>(Z)V

    iput-object v3, v5, Lh/k;->d:Lbc3/c0;

    iput-object v6, v5, Lh/k;->e:Lc93/m;

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lh/k;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc93/m;

    invoke-virtual {p2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {p2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_6

    if-ne v7, v4, :cond_7

    :cond_6
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc93/m;

    iput-object v2, v5, Lh/k;->e:Lc93/m;

    iput-object v3, v5, Lh/k;->d:Lbc3/c0;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    or-int/2addr v0, v3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    if-ne v1, v4, :cond_a

    :cond_9
    new-instance v1, Lh/l;

    const/4 v0, 0x0

    invoke-direct {v1, v5, p0, v0}, Lh/l;-><init>(Lh/k;ZLq83/d;)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lc93/m;

    invoke-static {p2, v1, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p2}, Lh/h;->a(Landroidx/compose/runtime/Composer;)Lg/b0;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Lg/b0;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v1

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/g0;

    invoke-virtual {p2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    if-ne v3, v4, :cond_c

    :cond_b
    new-instance v3, Lc0/h;

    const/4 v2, 0x2

    invoke-direct {v3, v0, v1, v5, v2}, Lc0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v3, p2}, Lp1/x;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lh/m;

    invoke-direct {v0, p0, p1, p3}, Lh/m;-><init>(ZLc93/m;I)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    array-length v0, p0

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v1, p1, v2, p0, v0}, Lm83/n;->i0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/lit8 v1, p1, 0x2

    array-length v2, p0

    invoke-static {v1, p1, v2, p0, v0}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p2, v0, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-object v0
.end method

.method public static final e(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    array-length v0, p1

    add-int/lit8 v0, v0, -0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v1, p0, v2, p1, v0}, Lm83/n;->i0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/lit8 v1, p0, 0x2

    array-length v2, p1

    invoke-static {p0, v1, v2, p1, v0}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final f(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v1, p0, v2, p1, v0}, Lm83/n;->i0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/lit8 v1, p0, 0x1

    array-length v2, p1

    invoke-static {p0, v1, v2, p1, v0}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final g(Lo63/n;Lo63/n;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lo63/n;->b()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {p0, v1, v0}, Lo63/n;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    const-string p4, "$this$clickableWithEffect"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "onClick"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, La;

    invoke-direct {p4, p2, p1, p3}, La;-><init>(Li3/i;ZLc93/a;)V

    invoke-static {p0, p4}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3

    const-class v0, Ljava/util/Collection;

    invoke-virtual {v0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0, v0, v0}, Lrx/f;->d(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, v0, v1, v2}, Lrx/f;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v1

    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v1

    return-object p0

    :cond_1
    const-class p0, Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static final k(IIIILnh/g;)D
    .locals 4

    int-to-double v0, p2

    int-to-double v2, p0

    div-double/2addr v0, v2

    int-to-double p2, p3

    int-to-double p0, p1

    div-double/2addr p2, p0

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static l(ILjava/lang/String;)Lal/a;
    .locals 3

    sget-object v0, Lok/c;->x:Lok/c;

    iget-object v1, v0, Lok/c;->w:Li93/j;

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt p0, v1, :cond_0

    if-gt v2, p0, :cond_0

    new-instance p0, Lok/e;

    const/4 p1, 0x4

    invoke-direct {p0, v0, p1}, Lal/a;-><init>(Ljava/lang/Object;I)V

    return-object p0

    :cond_0
    sget-object v0, Lok/c;->y:Lok/c;

    iget-object v0, v0, Lok/c;->w:Li93/j;

    iget v1, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt p0, v0, :cond_1

    if-gt v1, p0, :cond_1

    new-instance p0, Lok/a;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lok/a;-><init>(Lorg/json/JSONObject;)V

    return-object p0

    :cond_1
    sget-object v0, Lok/c;->E:Lok/c;

    iget-object v0, v0, Lok/c;->w:Li93/j;

    iget v1, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt p0, v0, :cond_2

    if-gt v1, p0, :cond_2

    new-instance p0, Lok/d;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lok/d;-><init>(Lorg/json/JSONObject;)V

    return-object p0

    :cond_2
    sget-object v0, Lok/c;->F:Lok/c;

    iget-object v0, v0, Lok/c;->w:Li93/j;

    iget v1, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt p0, v0, :cond_3

    if-gt v1, p0, :cond_3

    new-instance p0, Lok/g;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lok/g;-><init>(Lorg/json/JSONObject;)V

    return-object p0

    :cond_3
    sget-object v0, Lok/c;->z:Lok/c;

    iget-object v0, v0, Lok/c;->w:Li93/j;

    iget v1, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt p0, v0, :cond_4

    if-gt v1, p0, :cond_4

    new-instance p0, Lok/f;

    invoke-direct {p0}, Lok/f;-><init>()V

    return-object p0

    :cond_4
    new-instance p0, Lok/b;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    const-string v1, "error"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    :goto_0
    invoke-direct {p0, v0}, Lok/b;-><init>(Lorg/json/JSONObject;)V

    return-object p0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/Iterable;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 3

    const-string v0, "debugName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lub3/f;

    invoke-direct {v0}, Lub3/f;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    if-eq v1, v2, :cond_0

    instance-of v2, v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;

    if-eqz v2, :cond_1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;

    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-static {v0, v1}, Lm83/s;->o0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lub3/f;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget p1, v0, Lub3/f;->w:I

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_3

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;

    new-array v1, v2, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-virtual {v0, v1}, Lub3/f;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-direct {p1, p0, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;-><init>(Ljava/lang/String;[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V

    move-object v2, p1

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v2}, Lub3/f;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    :cond_4
    :goto_1
    return-object v2
.end method

.method public static final n(Ljava/io/File;)V
    .locals 3

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not create directory at "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static final o(Ll3/w;Li2/v;Li2/t;FLi2/z0;Lw3/l;Lk2/f;)V
    .locals 10

    iget-object p0, p0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/y;

    iget-object v3, v2, Ll3/y;->a:Ll3/a;

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    move-object/from16 v9, p6

    invoke-virtual/range {v3 .. v9}, Ll3/a;->g(Li2/v;Li2/t;FLi2/z0;Lw3/l;Lk2/f;)V

    iget-object v2, v2, Ll3/y;->a:Ll3/a;

    invoke-virtual {v2}, Ll3/a;->b()F

    move-result v2

    const/4 v3, 0x0

    invoke-interface {p1, v3, v2}, Li2/v;->f(FF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p0, Ljava/lang/Class;

    if-eqz v1, :cond_2

    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    instance-of v1, p0, Ljava/lang/reflect/ParameterizedType;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    if-nez v1, :cond_3

    return v2

    :cond_3
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    instance-of v1, p0, Lrx/d;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lrx/d;

    iget-object v1, v1, Lrx/d;->y:[Ljava/lang/reflect/Type;

    goto :goto_0

    :cond_4
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    :goto_0
    instance-of v3, p1, Lrx/d;

    if-eqz v3, :cond_5

    move-object v3, p1

    check-cast v3, Lrx/d;

    iget-object v3, v3, Lrx/d;->y:[Ljava/lang/reflect/Type;

    goto :goto_1

    :cond_5
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    :goto_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    return v0

    :cond_6
    return v2

    :cond_7
    instance-of v1, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v1, :cond_a

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_8

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p1, p0}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p0

    return p0

    :cond_8
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_9

    return v2

    :cond_9
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p0

    return p0

    :cond_a
    instance-of v1, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_d

    instance-of v1, p1, Ljava/lang/reflect/WildcardType;

    if-nez v1, :cond_b

    return v2

    :cond_b
    check-cast p0, Ljava/lang/reflect/WildcardType;

    check-cast p1, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_c

    return v0

    :cond_c
    return v2

    :cond_d
    instance-of v1, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v1, :cond_f

    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    if-nez v1, :cond_e

    return v2

    :cond_e
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    check-cast p1, Ljava/lang/reflect/TypeVariable;

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v1

    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v3

    if-ne v1, v3, :cond_f

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    return v0

    :cond_f
    return v2
.end method

.method public static q(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "@"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "[Filtered]"

    if-eqz v0, :cond_1

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v0, 0x0

    const/16 v2, 0x40

    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v1, "[Filtered]:[Filtered]"

    :cond_2
    invoke-static {v1}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lo63/m;)Ljava/util/ArrayList;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lo63/m;->b()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v0, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static s(Ljava/lang/String;Ljava/lang/String;)Leb/g1;
    .locals 2

    const-string v0, "integer"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Leb/g1;->b:Leb/a1;

    return-object p0

    :cond_0
    const-string v0, "integer[]"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Leb/g1;->d:Leb/z0;

    return-object p0

    :cond_1
    const-string v0, "List<Int>"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Leb/g1;->e:Leb/z0;

    return-object p0

    :cond_2
    const-string v0, "long"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Leb/g1;->f:Leb/a1;

    return-object p0

    :cond_3
    const-string v0, "long[]"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Leb/g1;->g:Leb/z0;

    return-object p0

    :cond_4
    const-string v0, "List<Long>"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Leb/g1;->h:Leb/z0;

    return-object p0

    :cond_5
    const-string v0, "boolean"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Leb/g1;->l:Leb/a1;

    return-object p0

    :cond_6
    const-string v0, "boolean[]"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Leb/g1;->m:Leb/z0;

    return-object p0

    :cond_7
    const-string v0, "List<Boolean>"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Leb/g1;->n:Leb/z0;

    return-object p0

    :cond_8
    const-string v0, "string"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_1

    :cond_9
    const-string v0, "string[]"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p0, Leb/g1;->p:Leb/z0;

    return-object p0

    :cond_a
    const-string v0, "List<String>"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p0, Leb/g1;->q:Leb/z0;

    return-object p0

    :cond_b
    const-string v0, "float"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object p0, Leb/g1;->i:Leb/a1;

    return-object p0

    :cond_c
    const-string v0, "float[]"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object p0, Leb/g1;->j:Leb/z0;

    return-object p0

    :cond_d
    const-string v0, "List<Float>"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object p0, Leb/g1;->k:Leb/z0;

    return-object p0

    :cond_e
    const-string v0, "reference"

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object p0, Leb/g1;->c:Leb/a1;

    return-object p0

    :cond_f
    if-eqz p0, :cond_14

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_10

    goto :goto_1

    :cond_10
    :try_start_0
    const-string v0, "."

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz p1, :cond_11

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_11
    move-object p1, p0

    :goto_0
    const-string v0, "[]"

    invoke-static {p0, v0, v1}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_12

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_12
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/room/c1;->K(Ljava/lang/Class;Z)Leb/g1;

    move-result-object p0

    if-eqz p0, :cond_13

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not Serializable or Parcelable."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_14
    :goto_1
    sget-object p0, Leb/g1;->o:Leb/a1;

    return-object p0
.end method

.method public static final t(Landroid/view/View;)Lg/b0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    const v1, 0x7f0a0d67

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lg/b0;

    if-eqz v2, :cond_0

    check-cast v1, Lg/b0;

    goto :goto_1

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Ldt/b;->v(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object p0

    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_2

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static u(Ljava/lang/String;)Lud3/h0;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Lyb3/p;->c(ILjava/lang/String;)Lyb3/n;

    move-result-object v0

    const/16 v2, 0x22

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "toLowerCase(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Lyb3/l;

    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lyb3/n;->b()Li93/j;

    move-result-object v0

    iget v0, v0, Li93/h;->x:I

    :goto_0
    add-int/2addr v0, v4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v0, v7, :cond_6

    sget-object v7, Lud3/h0;->f:Lyb3/p;

    invoke-virtual {v7, v0, p0}, Lyb3/p;->c(ILjava/lang/String;)Lyb3/n;

    move-result-object v7

    const-string v9, "substring(...)"

    if-eqz v7, :cond_5

    iget-object v0, v7, Lyb3/n;->c:Lyb3/m;

    invoke-virtual {v0, v4}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object v10

    const/4 v11, 0x0

    if-eqz v10, :cond_0

    iget-object v10, v10, Lyb3/j;->a:Ljava/lang/String;

    goto :goto_1

    :cond_0
    move-object v10, v11

    :goto_1
    if-nez v10, :cond_1

    invoke-virtual {v7}, Lyb3/n;->b()Li93/j;

    move-result-object v0

    iget v0, v0, Li93/h;->x:I

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v8}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object v12

    if-eqz v12, :cond_2

    iget-object v11, v12, Lyb3/j;->a:Ljava/lang/String;

    :cond_2
    if-nez v11, :cond_3

    const/4 v9, 0x3

    invoke-virtual {v0, v9}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v11, v0, Lyb3/j;->a:Ljava/lang/String;

    goto :goto_2

    :cond_3
    const/16 v0, 0x27

    invoke-static {v11, v0}, Lyb3/r;->z0(Ljava/lang/String;C)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-static {v11, v0}, Lyb3/r;->Z(Ljava/lang/String;C)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v8, :cond_4

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v4

    invoke-virtual {v11, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_2
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Lyb3/n;->b()Li93/j;

    move-result-object v0

    iget v0, v0, Li93/h;->x:I

    goto :goto_0

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Parameter is not formatted correctly: \""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" for: \""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, p0, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Lud3/h0;

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-direct {v0, p0, v3, v5, v1}, Lud3/h0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No subtype found for: \""

    invoke-static {v2, v1, p0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final v(Li63/z;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Li63/z;->e:Ljava/lang/String;

    iget-object v3, p0, Li63/z;->f:Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v2, "@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li63/z;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Li63/z;->c:I

    if-eqz v1, :cond_2

    iget-object v3, p0, Li63/z;->a:Li63/b0;

    iget v3, v3, Li63/b0;->b:I

    if-eq v1, v3, :cond_2

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Li63/z;->c:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final w(Li63/z;)Ljava/lang/String;
    .locals 6

    iget-object p0, p0, Li63/z;->h:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "/"

    return-object p0

    :cond_1
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_2
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "/"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static x()Ljava/util/Set;
    .locals 3

    :try_start_0
    const-string v0, "android.text.EmojiConsistency"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getEmojiConsistencySet"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0

    :cond_0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, [I

    if-nez v2, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v0

    :catchall_0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0
.end method

.method public static z(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 4

    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p0

    check-cast p0, Ljava/lang/Class;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_3

    const-class p0, Ljava/lang/Object;

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v1

    invoke-static {p0}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_4
    if-nez p0, :cond_5

    const-string v0, "null"

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "> is of type "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public abstract A()I
.end method

.method public abstract C()Z
.end method

.method public abstract D()Z
.end method

.method public abstract h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
.end method

.method public abstract y()[B
.end method
