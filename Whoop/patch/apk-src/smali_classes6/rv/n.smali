.class public abstract Lrv/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z


# direct methods
.method public static final a(Ln6/o;IILx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 8

    move-object v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x1c496500

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_2
    move v2, p5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p5, 0x30

    if-nez v4, :cond_5

    invoke-virtual {v0, p1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v6, p5, 0x180

    if-nez v6, :cond_8

    invoke-virtual {v0, p2}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    :cond_8
    :goto_5
    and-int/lit16 v6, p5, 0xc00

    if-nez v6, :cond_a

    invoke-virtual {v0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x800

    goto :goto_6

    :cond_9
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v2, v6

    :cond_a
    and-int/lit16 v6, v2, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_7
    move-object v1, p0

    move v2, p1

    move v3, p2

    goto/16 :goto_a

    :cond_c
    :goto_8
    if-eqz v1, :cond_d

    sget-object p0, Ln6/m;->a:Ln6/m;

    :cond_d
    const/4 v1, 0x0

    if-eqz v3, :cond_e

    move p1, v1

    :cond_e
    if-eqz v4, :cond_f

    move p2, v1

    :cond_f
    const v3, 0x6e3c21fe

    invoke-virtual {v0, v3}, Lp1/q;->f0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_10

    sget-object v3, Lv6/f;->w:Lv6/f;

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lj93/g;

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    check-cast v3, Lc93/a;

    const v4, -0x28c122f7

    invoke-virtual {v0, v4}, Lp1/q;->f0(I)V

    const v4, -0x20ad3f64

    invoke-virtual {v0, v4}, Lp1/q;->f0(I)V

    iget-object v4, v0, Lp1/q;->a:Lhb3/a0;

    instance-of v4, v4, Ln6/b;

    if-eqz v4, :cond_13

    invoke-virtual {v0}, Lp1/q;->c0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_11

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    new-instance v3, Lsl0/b2;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lsl0/b2;-><init>(I)V

    invoke-static {v0, v3, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Lv6/a;

    invoke-direct {v3, p2}, Lv6/a;-><init>(I)V

    new-instance v4, Lsl0/b2;

    const/16 v6, 0x1c

    invoke-direct {v4, v6}, Lsl0/b2;-><init>(I)V

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Lv6/b;

    invoke-direct {v3, p1}, Lv6/b;-><init>(I)V

    new-instance v4, Lsl0/b2;

    const/16 v6, 0x1d

    invoke-direct {v4, v6}, Lsl0/b2;-><init>(I)V

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v2, v2, 0x70

    or-int/lit8 v2, v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lv6/h;->a:Lv6/h;

    invoke-virtual {p3, v3, v0, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_7

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_12

    new-instance v0, Lv6/e;

    const/4 v7, 0x0

    move-object v4, p3

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lv6/e;-><init>(Ljava/lang/Object;IILl83/e;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void

    :cond_13
    invoke-static {}, Lp1/x;->w()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;)Lyv/b;
    .locals 22

    new-instance v0, Lyv/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lyv/a;->a:Z

    const v2, 0x800033

    iput v2, v0, Lyv/a;->b:I

    const/high16 v2, 0x40800000    # 4.0f

    iput v2, v0, Lyv/a;->c:F

    iput v2, v0, Lyv/a;->d:F

    iput v2, v0, Lyv/a;->e:F

    iput v2, v0, Lyv/a;->f:F

    const/high16 v2, -0x1000000

    iput v2, v0, Lyv/a;->g:I

    iput v2, v0, Lyv/a;->h:I

    const/4 v2, -0x1

    iput v2, v0, Lyv/a;->i:I

    const/high16 v2, 0x40000000    # 2.0f

    iput v2, v0, Lyv/a;->j:F

    iput v2, v0, Lyv/a;->k:F

    const/high16 v3, 0x41000000    # 8.0f

    iput v3, v0, Lyv/a;->l:F

    iput v2, v0, Lyv/a;->m:F

    iput v3, v0, Lyv/a;->n:F

    iput-boolean v1, v0, Lyv/a;->o:Z

    const-wide/16 v2, 0xf

    iput-wide v2, v0, Lyv/a;->p:J

    iput-boolean v1, v0, Lyv/a;->q:Z

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Lyv/a;->r:F

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lyv/b;

    iget-boolean v2, v0, Lyv/a;->a:Z

    iget v3, v0, Lyv/a;->b:I

    iget v4, v0, Lyv/a;->c:F

    iget v5, v0, Lyv/a;->d:F

    iget v6, v0, Lyv/a;->e:F

    iget v7, v0, Lyv/a;->f:F

    iget v8, v0, Lyv/a;->g:I

    iget v9, v0, Lyv/a;->h:I

    iget v10, v0, Lyv/a;->i:I

    iget v11, v0, Lyv/a;->j:F

    iget v12, v0, Lyv/a;->k:F

    iget v13, v0, Lyv/a;->l:F

    iget v14, v0, Lyv/a;->m:F

    iget v15, v0, Lyv/a;->n:F

    move-object/from16 p0, v1

    iget-boolean v1, v0, Lyv/a;->o:Z

    move/from16 v17, v1

    move/from16 v16, v2

    iget-wide v1, v0, Lyv/a;->p:J

    move-wide/from16 v18, v1

    iget-boolean v1, v0, Lyv/a;->q:Z

    iget v2, v0, Lyv/a;->r:F

    iget-boolean v0, v0, Lyv/a;->s:Z

    move/from16 v21, v0

    move/from16 v20, v2

    move/from16 v2, v16

    move/from16 v16, v17

    move-wide/from16 v17, v18

    move/from16 v19, v1

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v21}, Lyv/b;-><init>(ZIFFFFIIIFFFFFZJZFZ)V

    return-object v1
.end method

.method public static c(Landroidx/lifecycle/w1;Landroidx/lifecycle/k1;)Lvv1/c;
    .locals 4

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "STRIPE_ANALYTICS_LOCAL_SESSION"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvx/c;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    instance-of v0, v1, Lvx/b;

    if-eqz v0, :cond_0

    sget-object v0, Lyy/c;->g:Ljava/util/UUID;

    check-cast v1, Lvx/b;

    iget-object v0, v1, Lvx/b;->w:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lyy/c;->g:Ljava/util/UUID;

    sput-boolean v2, Lrv/n;->a:Z

    goto :goto_1

    :cond_0
    instance-of v0, v1, Lvx/a;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-boolean v1, Lrv/n;->a:Z

    if-nez v1, :cond_3

    sput-boolean v2, Lrv/n;->a:Z

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    sget-object v2, Lyy/c;->g:Ljava/util/UUID;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sput-object v1, Lyy/c;->g:Ljava/util/UUID;

    new-instance v2, Lvx/b;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1}, Lvx/b;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-object v2, Lvx/a;->w:Lvx/a;

    :goto_0
    invoke-virtual {p1, v2, v0}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    new-instance v0, Lvx/d;

    invoke-direct {v0, p1}, Lvx/d;-><init>(Landroidx/lifecycle/k1;)V

    invoke-virtual {p0, v0}, Landroidx/lifecycle/w1;->addCloseable(Ljava/lang/AutoCloseable;)V

    new-instance p0, Lvv1/c;

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    return-object p0
.end method

.method public static d([F)Ljava/util/ArrayList;
    .locals 7

    new-instance v0, Lcom/mapbox/bindgen/Value;

    const-string v1, "rgba"

    invoke-direct {v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const/4 v2, 0x0

    aget v2, p0, v2

    float-to-double v2, v2

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    new-instance v2, Lcom/mapbox/bindgen/Value;

    const/4 v3, 0x1

    aget v3, p0, v3

    float-to-double v3, v3

    invoke-direct {v2, v3, v4}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    new-instance v3, Lcom/mapbox/bindgen/Value;

    const/4 v4, 0x2

    aget v4, p0, v4

    float-to-double v4, v4

    invoke-direct {v3, v4, v5}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    new-instance v4, Lcom/mapbox/bindgen/Value;

    const/4 v5, 0x3

    aget p0, p0, v5

    float-to-double v5, p0

    invoke-direct {v4, v5, v6}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/mapbox/bindgen/Value;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lz8/f;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Lz8/f;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static final f(I)[C
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/high16 v2, 0x10000

    if-ltz p0, :cond_0

    if-ge p0, v2, :cond_0

    int-to-char p0, p0

    new-array v1, v1, [C

    aput-char p0, v1, v0

    return-object v1

    :cond_0
    if-gt v2, p0, :cond_1

    const/high16 v3, 0x110000

    if-ge p0, v3, :cond_1

    sub-int/2addr p0, v2

    and-int/lit16 v2, p0, 0x3ff

    const v3, 0xdc00

    add-int/2addr v2, v3

    ushr-int/lit8 p0, p0, 0xa

    and-int/lit16 p0, p0, 0x3ff

    const v3, 0xd800

    add-int/2addr p0, v3

    int-to-char p0, p0

    int-to-char v2, v2

    const/4 v3, 0x2

    new-array v3, v3, [C

    aput-char p0, v3, v0

    aput-char v2, v3, v1

    return-object v3

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid codepoint "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(I)[F
    .locals 5

    shr-int/lit8 v0, p0, 0x10

    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    and-int/lit16 v2, p0, 0xff

    int-to-float v2, v2

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    const/high16 v3, 0x437f0000    # 255.0f

    div-float/2addr p0, v3

    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v0, v3, v4

    const/4 v0, 0x1

    aput v1, v3, v0

    const/4 v0, 0x2

    aput v2, v3, v0

    const/4 v0, 0x3

    aput p0, v3, v0

    return-object v3
.end method

.method public static varargs h([[B)[B
    .locals 4

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write([B)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static i(ILjava/lang/String;)Lt7/c;
    .locals 8

    new-instance v0, Lt7/c;

    const-class v1, Lt7/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v2, "ErrorCode::class\n       \u2026          .declaredFields"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/16 v4, 0x2717

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-ne v3, p0, :cond_3

    move-object v5, v2

    :cond_4
    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_5
    invoke-direct {v0, v4, p1}, Lt7/c;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static j(Ll40/a;)Ljava/util/Map;
    .locals 8

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpMonth$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Ll40/a;->a:Ljava/lang/String;

    const-string v2, "Required value was null."

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, -0x1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lo73/a;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v7, v3, :cond_1

    invoke-static {v4, v6}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    move v6, v5

    :goto_0
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p0}, Ll40/a;->a(Ljava/lang/String;Ll40/a;)Ll40/a;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpYear$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    if-eqz v1, :cond_3

    invoke-static {v1}, Lo73/a;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v6, v3, :cond_3

    invoke-static {v4, v1}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/lit16 v5, v1, 0x7d0

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Ll40/a;->a(Ljava/lang/String;Ll40/a;)Ll40/a;

    move-result-object p0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Luf/u;Lef/a;)V
    .locals 6

    const-string v0, "req"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "endpoint"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Luf/u;->b:Ljava/lang/Object;

    check-cast v1, Lvf/b;

    iget-object p0, p0, Luf/u;->a:Ldg/a;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lvf/b;->y:Lmf/c;

    iget-object v1, v1, Lvf/b;->x:Lcg/j;

    const-string v2, "ctx"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lef/a;->a:Lcg/o;

    sget-object v2, Luf/i;->c:Lgf/a;

    invoke-virtual {p0, v2}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-static {p0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object v2, p1, Lcg/o;->b:Lbg/e;

    iget-object v3, p1, Lcg/o;->d:Lcg/x;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iget-object v2, p1, Lcg/o;->a:Lbg/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "<set-?>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v1, Lcg/j;->w:Lbg/l;

    iget-object v2, v1, Lcg/j;->F:Lwe/o;

    iget-object v4, p1, Lcg/o;->f:Lcg/y;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v4, Lcg/y;->a:Ltg/b;

    iput-object v5, v2, Lwe/o;->w:Ljava/lang/Object;

    iget-object v4, v4, Lcg/y;->b:Ltg/b;

    iput-object v4, v2, Lwe/o;->x:Ljava/lang/Object;

    invoke-static {p0}, Lwb3/f;->V(Ljava/lang/String;)Lbg/e;

    move-result-object p0

    iput-object p0, v1, Lcg/j;->x:Lbg/e;

    iget p0, p1, Lcg/o;->c:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, v1, Lcg/j;->y:Ljava/lang/Integer;

    iget-object p0, v1, Lcg/j;->z:Lbd3/k;

    iget-boolean v2, p0, Lbd3/k;->b:Z

    iget-object v4, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    const/4 v5, 0x0

    if-nez v2, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-boolean v2, v3, Lcg/x;->b:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v5

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iput-boolean v2, p0, Lbd3/k;->b:Z

    iget-object p0, v3, Lcg/x;->a:Ljava/util/List;

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v4, v5, p0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    iget-object p0, v1, Lcg/j;->E:Lcg/g;

    iget-object v2, p1, Lcg/o;->e:Lcg/i;

    iget-object p0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {p0, v2}, Lgf/m;->H(Ljava/util/Map;)V

    iget-object p0, p1, Lcg/o;->g:Ltg/b;

    const/4 p1, 0x0

    if-eqz p0, :cond_3

    iget-object p0, p0, Ltg/b;->b:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object p0, p1

    :goto_2
    if-eqz p0, :cond_4

    sget-object p1, Ltg/g;->k:Ltg/g;

    invoke-interface {p1, p0}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    :cond_4
    iput-object p1, v1, Lcg/j;->G:Ltg/b;

    const-string p0, "Host"

    invoke-virtual {v1}, Lcg/j;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static l([BII)[B
    .locals 2

    new-array v0, p2, [B

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
