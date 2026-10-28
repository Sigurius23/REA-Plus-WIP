.class public final Li2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Li2/s;Ljava/util/List;FFI)Li2/k0;
    .locals 17

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move/from16 v0, p2

    :goto_0
    and-int/lit8 v2, p4, 0x4

    if-eqz v2, :cond_1

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v12, v3, v5

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    shl-long v0, v2, v0

    and-long v2, v4, v7

    or-long v14, v0, v2

    new-instance v9, Li2/k0;

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v16}, Li2/k0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJI)V

    return-object v9
.end method

.method public static b(Li2/s;[Ll83/k;)Li2/k0;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length p0, p1

    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, [Ll83/k;

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v1, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v3, p1

    const/16 p1, 0x20

    shl-long/2addr v1, p1

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v7, p0

    shl-long p0, v3, p1

    and-long v3, v7, v5

    or-long/2addr v3, p0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Li2/s;->c([Ll83/k;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static c([Ll83/k;JJI)Li2/k0;
    .locals 9

    array-length v0, p0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v4, p0, v3

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Li2/x;

    iget-wide v4, v4, Li2/x;->a:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length v0, p0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v4, p0, v1

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Li2/k0;

    move-wide v4, p1

    move-wide v6, p3

    move v8, p5

    invoke-direct/range {v1 .. v8}, Li2/k0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJI)V

    return-object v1
.end method

.method public static d(Li2/s;Ljava/util/List;JJI)Li2/k0;
    .locals 8

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    move-wide v3, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-wide p4, 0x7f8000007f800000L    # 1.404448428688076E306

    :cond_1
    move-wide v5, p4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Li2/k0;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Li2/k0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJI)V

    return-object v0
.end method

.method public static synthetic e(Li2/s;[Ll83/k;JJI)Li2/k0;
    .locals 6

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    move-wide v1, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-wide p4, 0x7f8000007f800000L    # 1.404448428688076E306

    :cond_1
    move-wide v3, p4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Li2/s;->c([Ll83/k;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static f([Ll83/k;JFI)Li2/u0;
    .locals 8

    array-length v0, p0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v4, p0, v3

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Li2/x;

    iget-wide v4, v4, Li2/x;->a:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length v0, p0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v4, p0, v1

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Li2/u0;

    move-wide v4, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v1 .. v7}, Li2/u0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JFI)V

    return-object v1
.end method

.method public static g(Li2/s;Ljava/util/List;JFI)Li2/u0;
    .locals 7

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    :cond_0
    move-wide v3, p2

    and-int/lit8 p2, p5, 0x4

    if-eqz p2, :cond_1

    const/high16 p4, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    move v5, p4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Li2/u0;

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Li2/u0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JFI)V

    return-object v0
.end method

.method public static synthetic h(Li2/s;[Ll83/k;JFI)Li2/u0;
    .locals 1

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/high16 p4, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p3, p4, p0}, Li2/s;->f([Ll83/k;JFI)Li2/u0;

    move-result-object p0

    return-object p0
.end method

.method public static i(Li2/s;Ljava/util/List;)Li2/d1;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Li2/d1;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Li2/d1;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    return-object p0
.end method

.method public static j(Li2/s;[Ll83/k;)Li2/d1;
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length p0, p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p0, :cond_0

    aget-object v3, p1, v2

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Li2/x;

    iget-wide v3, v3, Li2/x;->a:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    array-length p0, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v1, p0, :cond_1

    aget-object v3, p1, v1

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    new-instance p0, Li2/d1;

    invoke-direct {p0, v0, v2}, Li2/d1;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    return-object p0
.end method

.method public static k(Li2/s;Ljava/util/List;FFI)Li2/k0;
    .locals 17

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move/from16 v0, p2

    :goto_0
    and-int/lit8 v2, p4, 0x4

    if-eqz v2, :cond_1

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v12, v3, v5

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v3, v0

    and-long v0, v1, v7

    or-long v14, v3, v0

    new-instance v9, Li2/k0;

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v16}, Li2/k0;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJI)V

    return-object v9
.end method

.method public static l(Li2/s;[Ll83/k;FFI)Li2/k0;
    .locals 8

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/high16 p3, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length p0, p1

    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, [Ll83/k;

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v3, p2

    const/16 p2, 0x20

    shl-long/2addr p0, p2

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v3, p0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long p3, p3

    shl-long/2addr p0, p2

    and-long p2, p3, v5

    or-long v5, p0, p2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Li2/s;->c([Ll83/k;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
