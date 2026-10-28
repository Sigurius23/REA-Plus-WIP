.class public abstract Lge3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Landroidx/room/z0;ZLs83/c;)Lq83/j;
    .locals 1

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    sget-object v0, Landroidx/room/t1;->x:Landroidx/room/s1;

    invoke-interface {p2, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Landroidx/room/t1;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/room/t1;->w:Lq83/f;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Landroidx/room/z0;->getQueryContext()Lq83/j;

    move-result-object p0

    invoke-interface {p0, p2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroidx/room/z0;->getTransactionContext$room_runtime()Lq83/j;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Landroidx/room/z0;->getQueryContext()Lq83/j;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-virtual {p0}, Landroidx/room/z0;->getQueryContext()Lq83/j;

    move-result-object p0

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    sget-object p2, Lq83/k;->w:Lq83/k;

    :goto_1
    invoke-interface {p0, p2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method public static final B(Landroid/view/View;)Lu5/a;
    .locals 2

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu5/a;

    if-nez v1, :cond_0

    new-instance v1, Lu5/a;

    invoke-direct {v1}, Lu5/a;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static final C(Ljava/lang/String;)Lf6/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/d;

    invoke-direct {v0, p0}, Lf6/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static D(Lq83/d;)Lq83/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ls83/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ls83/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ls83/c;->intercepted()Lq83/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static E(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static F(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static G(Landroid/content/Context;)Z
    .locals 1

    const-class v0, Landroid/os/UserManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/UserManager;

    invoke-virtual {p0}, Landroid/os/UserManager;->isUserUnlocked()Z

    move-result p0

    return p0
.end method

.method public static final H(JJF)J
    .locals 4

    const/16 v0, 0x20

    shr-long v1, p0, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    shr-long v2, p2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1, v2, p4}, Le93/b;->O(FFF)F

    move-result v1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    and-long p1, p2, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p0, p1, p4}, Le93/b;->O(FFF)F

    move-result p0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p3, p0

    shl-long p0, p1, v0

    and-long p2, p3, v2

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public static final I(Ljava/lang/String;)Lf6/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/d;

    invoke-direct {v0, p0}, Lf6/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final J(Lqa3/d0;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lhb3/c0;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v1, 0x4

    if-eq p0, v1, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    return v0
.end method

.method public static final varargs K([Ljava/lang/Object;)Luf3/a;
    .locals 1

    new-instance v0, Luf3/a;

    invoke-static {p0}, Lm83/n;->Z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {v0, p0}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static final L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 8

    const-string v0, "db"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/z0;->assertNotSuspendingTransaction()V

    invoke-virtual {p0}, Landroidx/room/z0;->getSuspendingTransactionContext()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq83/j;

    if-nez v0, :cond_0

    sget-object v0, Lq83/k;->w:Lq83/k;

    :cond_0
    move-object v2, v0

    new-instance v1, Lob/d;

    const/4 v7, 0x0

    move-object v3, p0

    move v5, p1

    move v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Lob/d;-><init>(Lq83/j;Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v1}, Le93/b;->Z(Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lob/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lob/e;

    iget v1, v0, Lob/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lob/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lob/e;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lob/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lob/e;->z:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Lob/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object p0, v0, Lob/e;->w:Landroidx/room/z0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result p2

    if-eqz p2, :cond_7

    new-instance p2, La6/j0;

    const/4 v2, 0x2

    invoke-direct {p2, p0, p1, v7, v2}, La6/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v6, v0, Lob/e;->z:I

    invoke-static {p0, p2, v0}, Lpf/c;->f0(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    goto :goto_2

    :cond_6
    return-object p0

    :cond_7
    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0}, Landroidx/room/z0;->isOpenInternal$room_runtime()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0}, Landroidx/room/z0;->inTransaction()Z

    move-result p2

    if-eqz p2, :cond_9

    new-instance p2, Lb2/y;

    invoke-direct {p2, p0, p1, v7}, Lb2/y;-><init>(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput v5, v0, Lob/e;->z:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    goto :goto_2

    :cond_8
    return-object p0

    :cond_9
    iput-object p0, v0, Lob/e;->w:Landroidx/room/z0;

    iput-object p1, v0, Lob/e;->x:Lkotlin/jvm/functions/Function1;

    iput v4, v0, Lob/e;->z:I

    invoke-static {p0, v6, v0}, Lge3/g;->A(Landroidx/room/z0;ZLs83/c;)Lq83/j;

    move-result-object p2

    if-ne p2, v1, :cond_a

    goto :goto_2

    :cond_a
    :goto_1
    check-cast p2, Lq83/j;

    new-instance v2, Ln20/j;

    invoke-direct {v2, p0, p1, v7}, Ln20/j;-><init>(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object v7, v0, Lob/e;->w:Landroidx/room/z0;

    iput-object v7, v0, Lob/e;->x:Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lob/e;->z:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_b

    :goto_2
    return-object v1

    :cond_b
    return-object p0
.end method

.method public static final N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 15

    move-object/from16 v0, p4

    instance-of v1, v0, Lob/f;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lob/f;

    iget v2, v1, Lob/f;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lob/f;->F:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lob/f;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lob/f;->E:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lob/f;->F:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v9, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v9, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-boolean p0, v7, Lob/f;->z:Z

    iget-boolean v1, v7, Lob/f;->y:Z

    iget-object v3, v7, Lob/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v4, v7, Lob/f;->w:Landroidx/room/z0;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move v13, p0

    move-object v14, v3

    move-object v11, v4

    :goto_2
    move v12, v1

    goto :goto_3

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroidx/room/z0;->isOpenInternal$room_runtime()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroidx/room/z0;->inTransaction()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lob/b;

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v3, p0

    move/from16 v2, p1

    move/from16 v1, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lob/b;-><init>(ZZLandroidx/room/z0;Lq83/d;Lkotlin/jvm/functions/Function1;I)V

    move v1, v2

    move-object v2, v0

    iput v9, v7, Lob/f;->F:I

    invoke-virtual {p0, v1, v2, v7}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v8, :cond_5

    goto :goto_4

    :cond_5
    return-object p0

    :cond_6
    move/from16 v1, p1

    move/from16 v4, p2

    iput-object p0, v7, Lob/f;->w:Landroidx/room/z0;

    move-object/from16 v5, p3

    iput-object v5, v7, Lob/f;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean v1, v7, Lob/f;->y:Z

    iput-boolean v4, v7, Lob/f;->z:Z

    iput v3, v7, Lob/f;->F:I

    invoke-static {p0, v4, v7}, Lge3/g;->A(Landroidx/room/z0;ZLs83/c;)Lq83/j;

    move-result-object v3

    if-ne v3, v8, :cond_7

    goto :goto_4

    :cond_7
    move-object v11, p0

    move-object v0, v3

    move v13, v4

    move-object v14, v5

    goto :goto_2

    :goto_3
    check-cast v0, Lq83/j;

    new-instance v9, Lob/c;

    const/4 v10, 0x0

    invoke-direct/range {v9 .. v14}, Lob/c;-><init>(Lq83/d;Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)V

    const/4 p0, 0x0

    iput-object p0, v7, Lob/f;->w:Landroidx/room/z0;

    iput-object p0, v7, Lob/f;->x:Lkotlin/jvm/functions/Function1;

    iput v2, v7, Lob/f;->F:I

    invoke-static {v0, v9, v7}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v8, :cond_8

    :goto_4
    return-object v8

    :cond_8
    return-object p0
.end method

.method public static O(JLjava/lang/String;)[B
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    cmp-long v1, v1, p0

    if-gtz v1, :cond_1

    new-instance p0, Ljava/io/FileInputStream;

    invoke-direct {p0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Ljava/io/BufferedInputStream;

    invoke-direct {p1, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v0, 0x400

    :try_start_2
    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V

    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_5

    :catchall_2
    move-exception p2

    goto :goto_3

    :goto_1
    :try_start_5
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p2

    :try_start_6
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_3
    :try_start_7
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception p1

    :try_start_8
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_5
    :try_start_9
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1

    :cond_1
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {p2, v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Reading file failed, because size located at \'%s\' with %d bytes is bigger than the maximum allowed size of %d bytes."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Reading the item "

    const-string v0, " failed, because can\'t read the file."

    invoke-static {p1, p2, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Reading path "

    const-string v0, " failed, because it\'s not a file."

    invoke-static {p1, p2, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "File \'"

    const-string v0, "\' doesn\'t exists"

    invoke-static {p2, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static P(Ljava/io/File;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance v3, Ljava/io/BufferedReader;

    invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_1
    move-object v0, v1

    goto :goto_4

    :catch_0
    move-exception v4

    goto :goto_3

    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v1}, Lse/g;->q(Ljava/io/Closeable;)V

    invoke-static {v2}, Lse/g;->q(Ljava/io/Closeable;)V

    invoke-static {v3}, Lse/g;->q(Ljava/io/Closeable;)V

    return-object p0

    :catchall_1
    move-exception p0

    move-object v3, v0

    goto :goto_1

    :catch_1
    move-exception v4

    move-object v3, v0

    goto :goto_3

    :catchall_2
    move-exception p0

    move-object v2, v0

    move-object v3, v2

    goto :goto_1

    :catch_2
    move-exception v4

    move-object v2, v0

    :goto_2
    move-object v3, v2

    goto :goto_3

    :catchall_3
    move-exception p0

    move-object v2, v0

    move-object v3, v2

    goto :goto_4

    :catch_3
    move-exception v4

    move-object v1, v0

    move-object v2, v1

    goto :goto_2

    :goto_3
    :try_start_4
    const-string v5, "IterableUtilImpl"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error while reading file: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v5, p0, v4}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v1}, Lse/g;->q(Ljava/io/Closeable;)V

    invoke-static {v2}, Lse/g;->q(Ljava/io/Closeable;)V

    invoke-static {v3}, Lse/g;->q(Ljava/io/Closeable;)V

    return-object v0

    :goto_4
    invoke-static {v0}, Lse/g;->q(Ljava/io/Closeable;)V

    invoke-static {v2}, Lse/g;->q(Ljava/io/Closeable;)V

    invoke-static {v3}, Lse/g;->q(Ljava/io/Closeable;)V

    throw p0
.end method

.method public static Q(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->canRead()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_3
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static R(Lk63/a;Li63/d;Lk63/b;)V
    .locals 2

    check-cast p0, Lb63/b;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Li63/b;->a:Li63/d;

    invoke-virtual {p1, v0}, Li63/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb63/i;->w:Lb63/i;

    goto :goto_0

    :cond_0
    new-instance v0, Lro/i;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lro/i;-><init>(Ljava/lang/Object;I)V

    :goto_0
    new-instance v1, Lb63/a;

    invoke-direct {v1, p2, p1, v0}, Lb63/a;-><init>(Lk63/b;Li63/d;Li63/e;)V

    iget-object p0, p0, Lb63/b;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final S([Leb/i1;Landroidx/compose/runtime/Composer;)Leb/u0;
    .locals 7

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    new-instance v0, Lgb/u;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2}, Lgb/u;-><init>(Landroid/content/Context;I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    sget-object v5, Lgb/t;->w:Lgb/t;

    invoke-direct {v2, v3, v5, v0}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v3, v0, :cond_1

    :cond_0
    new-instance v3, La3/l0;

    const/16 v0, 0x9

    invoke-direct {v3, p1, v0}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-static/range {v1 .. v6}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/u0;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p0, v1

    iget-object v3, p1, Leb/a0;->w:Leb/j1;

    invoke-virtual {v3, v2}, Leb/j1;->a(Leb/i1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static final T(FJ)J
    .locals 5

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr v1, p0

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    sub-float/2addr p1, p0

    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v1, p0

    shl-long p0, p1, v0

    and-long v0, v1, v3

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final U(Ljava/lang/String;)Lf6/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/d;

    invoke-direct {v0, p0}, Lf6/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final V(Ljava/lang/String;)Lf6/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/d;

    invoke-direct {v0, p0}, Lf6/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static W(Lorg/json/JSONArray;)Lorg/json/JSONArray;
    .locals 6

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x400

    if-gt v4, v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0, v2, v3}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lorg/json/JSONObject;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    check-cast v3, Lorg/json/JSONObject;

    invoke-static {v3}, Lge3/g;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lorg/json/JSONArray;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    check-cast v3, Lorg/json/JSONArray;

    invoke-static {v3}, Lge3/g;->W(Lorg/json/JSONArray;)Lorg/json/JSONArray;

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object p0
.end method

.method public static X(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    if-nez p0, :cond_0

    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->length()I

    move-result v0

    const/16 v1, 0x400

    if-gt v0, v1, :cond_6

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    const-string v2, "obj.keys()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    invoke-virtual {v3, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lorg/json/JSONObject;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    check-cast v3, Lorg/json/JSONObject;

    invoke-static {v3}, Lge3/g;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lorg/json/JSONArray;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast v3, Lorg/json/JSONArray;

    invoke-static {v3}, Lge3/g;->W(Lorg/json/JSONArray;)Lorg/json/JSONArray;

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "JSON parsing error. Too long (> 1024 chars) or invalid JSON"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Too many properties (more than 1024) in JSON"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;
    .locals 1

    const-string v0, "kClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls63/a;

    invoke-direct {v0, p0, p1, p2}, Ls63/a;-><init>(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static Z(Lc93/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lq83/k;->w:Lq83/k;

    if-ne v0, v1, :cond_0

    new-instance v0, Lr83/d;

    invoke-direct {v0, p2}, Lr83/d;-><init>(Lq83/d;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lr83/e;

    invoke-direct {v1, v0, p2}, Lr83/e;-><init>(Lq83/j;Lq83/d;)V

    move-object v0, v1

    :goto_0
    const/4 p2, 0x2

    invoke-static {p2, p0}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p0, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final a([B)Lio/ktor/utils/io/m;
    .locals 3

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    new-instance v1, Lio/ktor/utils/io/m;

    const/4 v2, 0x0

    invoke-static {p0, v2, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p0

    const-string v0, "wrap(content, offset, length)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0}, Lio/ktor/utils/io/m;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v1
.end method

.method public static a0(Ljava/io/File;Ljava/lang/String;)Z
    .locals 2

    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error while writing to file: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "IterableUtilImpl"

    invoke-static {v0, p0, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V
    .locals 14

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x4a783646

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v6, 0x6

    move v3, v2

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move v3, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p7, 0x2

    if-nez v4, :cond_3

    move-wide v4, p1

    invoke-virtual {v0, v4, v5}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-wide v4, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    goto :goto_3

    :cond_5
    move-wide v4, p1

    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    or-int/lit16 v3, v3, 0xc00

    and-int/lit16 v9, v3, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_9

    move v9, v12

    goto :goto_6

    :cond_9
    move v9, v11

    :goto_6
    and-int/2addr v3, v12

    invoke-virtual {v0, v3, v9}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v3, v6, 0x1

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v2, p0

    move/from16 v1, p4

    move-wide v3, v4

    goto :goto_a

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    move-object v2, v9

    goto :goto_8

    :cond_c
    move-object v2, p0

    :goto_8
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_d

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v3

    const v1, 0x3df5c28f    # 0.12f

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    goto :goto_9

    :cond_d
    move-wide v3, v4

    :goto_9
    if-eqz v7, :cond_e

    int-to-float v1, v12

    move v8, v1

    :cond_e
    int-to-float v1, v11

    :goto_a
    invoke-virtual {v0}, Lp1/q;->r()V

    const/4 v5, 0x0

    cmpg-float v7, v1, v5

    if-nez v7, :cond_f

    goto :goto_b

    :cond_f
    const/4 v7, 0x0

    const/16 v10, 0xe

    const/4 v12, 0x0

    const/4 v13, 0x0

    move p1, v1

    move/from16 p4, v7

    move-object p0, v9

    move/from16 p5, v10

    move/from16 p2, v12

    move/from16 p3, v13

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    :goto_b
    invoke-static {v8, v5}, Ly3/f;->b(FF)Z

    move-result v5

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v5, :cond_10

    const v5, -0x1b2d8496

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5}, Ly3/c;->getDensity()F

    move-result v5

    div-float v5, v7, v5

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    const v5, -0x1b2c8099

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    move v5, v8

    :goto_c
    invoke-interface {v2, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v3, v4, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v0, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move v5, v1

    move-object v1, v2

    move-wide v2, v3

    :goto_d
    move v4, v8

    goto :goto_e

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, p0

    move-wide v2, v4

    move/from16 v5, p4

    goto :goto_d

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lg1/c2;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lg1/c2;-><init>(Landroidx/compose/ui/Modifier;JFFII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final c(FF)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final d(Landroid/content/Context;)Leb/u0;
    .locals 2

    new-instance v0, Leb/u0;

    const-string v1, "context"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Leb/a0;-><init>(Landroid/content/Context;)V

    new-instance p0, Lgb/g;

    iget-object v1, v0, Leb/a0;->w:Leb/j1;

    invoke-direct {p0, v1}, Leb/t0;-><init>(Leb/j1;)V

    invoke-virtual {v1, p0}, Leb/j1;->a(Leb/i1;)V

    new-instance p0, Lgb/i;

    invoke-direct {p0}, Lgb/i;-><init>()V

    iget-object v1, v0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v1, p0}, Leb/j1;->a(Leb/i1;)V

    new-instance p0, Lgb/q;

    invoke-direct {p0}, Lgb/q;-><init>()V

    iget-object v1, v0, Leb/a0;->w:Leb/j1;

    invoke-virtual {v1, p0}, Leb/j1;->a(Leb/i1;)V

    return-object v0
.end method

.method public static final e(Ljava/util/List;La6/m;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, La6/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/d;

    iget v1, v0, La6/d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/d;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, La6/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/d;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, La6/d;->x:Ljava/util/Iterator;

    iget-object p1, v0, La6/d;->w:Ljava/io/Serializable;

    check-cast p1, Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, La6/d;->w:Ljava/io/Serializable;

    check-cast p0, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, La6/f;

    const/4 v5, 0x0

    invoke-direct {v2, p0, p2, v5}, La6/f;-><init>(Ljava/util/List;Ljava/util/ArrayList;Lq83/d;)V

    iput-object p2, v0, La6/d;->w:Ljava/io/Serializable;

    iput v4, v0, La6/d;->z:I

    invoke-virtual {p1, v2, v0}, La6/m;->a(La6/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4

    goto :goto_4

    :cond_4
    move-object p0, p2

    :goto_1
    new-instance p1, Lkotlin/jvm/internal/g0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function1;

    :try_start_1
    iput-object p1, v0, La6/d;->w:Ljava/io/Serializable;

    iput-object p0, v0, La6/d;->x:Ljava/util/Iterator;

    iput v3, v0, La6/d;->z:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p2, v1, :cond_5

    goto :goto_4

    :goto_3
    iget-object v2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v2, :cond_6

    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_6
    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v2, p2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_7
    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    if-nez p0, :cond_8

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1

    :cond_8
    throw p0
.end method

.method public static final f(Ljava/lang/String;)Lf6/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/d;

    invoke-direct {v0, p0}, Lf6/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lf0/t;Li2/a1;)Landroidx/compose/ui/Modifier;
    .locals 1

    iget v0, p1, Lf0/t;->a:F

    iget-object p1, p1, Lf0/t;->b:Li2/t;

    invoke-static {v0, p0, p1, p2}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Li2/c1;

    invoke-direct {v0, p2, p3}, Li2/c1;-><init>(J)V

    invoke-static {p1, p0, v0, p4}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/BorderModifierNodeElement;

    invoke-direct {v0, p0, p2, p3}, Landroidx/compose/foundation/BorderModifierNodeElement;-><init>(FLi2/t;Li2/a1;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static j(ZILic/a;JJIZJJJJ)J
    .locals 3

    const-string v0, "backoffPolicy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p15, v0

    if-eqz v2, :cond_2

    if-eqz p8, :cond_2

    if-nez p7, :cond_0

    goto :goto_0

    :cond_0
    const-wide/32 p0, 0xdbba0

    add-long/2addr p5, p0

    cmp-long p0, p15, p5

    if-gez p0, :cond_1

    return-wide p5

    :cond_1
    :goto_0
    return-wide p15

    :cond_2
    if-eqz p0, :cond_5

    sget-object p0, Lic/a;->x:Lic/a;

    if-ne p2, p0, :cond_3

    int-to-long p0, p1

    mul-long/2addr p3, p0

    goto :goto_1

    :cond_3
    long-to-float p0, p3

    add-int/lit8 p1, p1, -0x1

    invoke-static {p0, p1}, Ljava/lang/Math;->scalb(FI)F

    move-result p0

    float-to-long p3, p0

    :goto_1
    const-wide/32 p0, 0x112a880

    cmp-long p2, p3, p0

    if-lez p2, :cond_4

    move-wide p3, p0

    :cond_4
    add-long/2addr p5, p3

    return-wide p5

    :cond_5
    if-eqz p8, :cond_8

    if-nez p7, :cond_6

    add-long/2addr p5, p9

    goto :goto_2

    :cond_6
    add-long p5, p5, p13

    :goto_2
    cmp-long p0, p11, p13

    if-eqz p0, :cond_7

    if-nez p7, :cond_7

    sub-long p0, p13, p11

    add-long/2addr p0, p5

    return-wide p0

    :cond_7
    return-wide p5

    :cond_8
    const-wide/16 p0, -0x1

    cmp-long p0, p5, p0

    if-nez p0, :cond_9

    return-wide v0

    :cond_9
    add-long/2addr p5, p9

    return-wide p5
.end method

.method public static final k(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lx30/s0;->p(Landroid/view/View;)Lm83/r;

    move-result-object p0

    iget-object p0, p0, Lm83/r;->b:Ljava/lang/Object;

    check-cast p0, Ls83/h;

    invoke-static {p0}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object p0

    :cond_0
    invoke-virtual {p0}, Lxb3/j;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lxb3/j;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lge3/g;->B(Landroid/view/View;)Lu5/a;

    move-result-object v0

    iget-object v0, v0, Lu5/a;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/e3;

    iget-object v2, v2, Lb3/e3;->a:Lb3/a;

    invoke-virtual {v2}, Lb3/a;->d()V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static l(Lzt/q;Lr93/g;Lx93/n;I)Lzt/q;
    .locals 3

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Ll83/i;->y:Ll83/i;

    new-instance v0, Lce3/p;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-static {p3, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p3

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    if-eqz p2, :cond_1

    new-instance v1, Lia3/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lia3/e;-><init>(Lzt/q;Lr93/l;Lma3/f;I)V

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lzt/q;->y:Ljava/lang/Object;

    move-object v1, p0

    check-cast v1, Lia3/f;

    :goto_0
    new-instance p0, Lzt/q;

    invoke-direct {p0, v0, v1, p3}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    return-object p0
.end method

.method public static final m(Lj0/i;Lp1/q;I)Lp1/c1;
    .locals 4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lp1/c1;

    and-int/lit8 v2, p2, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    if-le v2, v3, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v3, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_4

    if-ne v2, v1, :cond_5

    :cond_4
    new-instance v2, La6/c;

    const/16 p2, 0x14

    const/4 v1, 0x0

    invoke-direct {v2, p0, v0, v1, p2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lc93/m;

    invoke-static {p1, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static n(Lud3/d0;Lud3/d0;)Lud3/d0;
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v1

    move v3, v2

    :goto_0
    const-string v4, "Content-Type"

    const-string v5, "Content-Encoding"

    const-string v6, "Content-Length"

    if-ge v3, v1, :cond_4

    invoke-virtual {p0, v3}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v3}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Warning"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v9, "1"

    invoke-static {v8, v9, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v7}, Lge3/g;->E(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    :cond_2
    :goto_1
    invoke-virtual {v0, v7, v8}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lud3/d0;->size()I

    move-result p0

    :goto_3
    if-ge v2, p0, :cond_7

    invoke-virtual {p1, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {v1}, Lge3/g;->E(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p1, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lzt/q;Ls93/i;)Lzt/q;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lzt/q;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Lia3/f;

    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v4, Lce/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5, p0, p1}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    return-object v0
.end method

.method public static p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ls83/a;

    if-eqz v0, :cond_0

    check-cast p0, Ls83/a;

    invoke-virtual {p0, p1, p2}, Ls83/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lq83/k;->w:Lq83/k;

    if-ne v0, v1, :cond_1

    new-instance v0, Lr83/b;

    invoke-direct {v0, p0, p2, p1}, Lr83/b;-><init>(Lc93/m;Lq83/d;Lq83/d;)V

    return-object v0

    :cond_1
    new-instance v1, Lr83/c;

    invoke-direct {v1, p2, v0, p0, p1}, Lr83/c;-><init>(Lq83/d;Lq83/j;Lc93/m;Lq83/d;)V

    return-object v1
.end method

.method public static final q(Landroid/content/Context;)Lp3/j;
    .locals 4

    new-instance v0, Lp3/j;

    new-instance v1, Laj/c;

    invoke-direct {v1, p0}, Laj/c;-><init>(Landroid/content/Context;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_0

    sget-object v2, Lp3/s;->a:Lp3/s;

    invoke-virtual {v2, p0}, Lp3/s;->a(Landroid/content/Context;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v2, Lp3/a;

    invoke-direct {v2, p0}, Lp3/a;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lp3/j;-><init>(Laj/c;Lp3/a;)V

    return-object v0
.end method

.method public static r(Ljava/io/File;)Z
    .locals 5

    const/4 v0, 0x1

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    array-length v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    aget-object v4, v1, v3

    invoke-static {v4}, Lge3/g;->r(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_3

    return v2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0

    :cond_5
    :goto_1
    return v0
.end method

.method public static final s(Lqa3/k1;)Lr93/o;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lhb3/c0;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const-string v0, "PRIVATE"

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lr93/q;->a:Lr93/p;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_0
    sget-object p0, Lr93/q;->f:Lr93/p;

    const-string v0, "LOCAL"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_1
    sget-object p0, Lr93/q;->e:Lr93/p;

    const-string v0, "PUBLIC"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_2
    sget-object p0, Lr93/q;->c:Lr93/p;

    const-string v0, "PROTECTED"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_3
    sget-object p0, Lr93/q;->b:Lr93/p;

    const-string v0, "PRIVATE_TO_THIS"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_4
    sget-object p0, Lr93/q;->a:Lr93/p;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_5
    sget-object p0, Lr93/q;->d:Lr93/p;

    const-string v0, "INTERNAL"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final t(Lk2/e;Ll2/c;)V
    .locals 18

    move-object/from16 v0, p1

    invoke-interface/range {p0 .. p0}, Lk2/e;->t0()La3/p;

    move-result-object v1

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Lk2/e;->t0()La3/p;

    move-result-object v2

    iget-object v2, v2, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ll2/c;

    iget-object v3, v0, Ll2/c;->a:Ll2/e;

    iget-boolean v4, v0, Ll2/c;->s:Z

    if-eqz v4, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-virtual {v0}, Ll2/c;->a()V

    invoke-interface {v3}, Ll2/e;->j()Z

    move-result v4

    if-nez v4, :cond_1

    :try_start_0
    iget-object v4, v0, Ll2/c;->a:Ll2/e;

    iget-object v5, v0, Ll2/c;->b:Ly3/c;

    iget-object v6, v0, Ll2/c;->c:Ly3/m;

    iget-object v7, v0, Ll2/c;->e:La3/m1;

    invoke-interface {v4, v5, v6, v0, v7}, Ll2/e;->A(Ly3/c;Ly3/m;Ll2/c;La3/m1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    invoke-interface {v3}, Ll2/e;->N()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    const/4 v5, 0x1

    if-lez v4, :cond_2

    move v4, v5

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_3

    invoke-interface {v1}, Li2/v;->i()V

    :cond_3
    invoke-static {v1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v13

    if-nez v13, :cond_7

    iget-wide v8, v0, Ll2/c;->t:J

    const/16 v10, 0x20

    shr-long v11, v8, v10

    long-to-int v11, v11

    int-to-float v11, v11

    const-wide v14, 0xffffffffL

    and-long/2addr v8, v14

    long-to-int v8, v8

    int-to-float v9, v8

    move-object v8, v7

    iget-wide v6, v0, Ll2/c;->u:J

    move-wide/from16 v16, v14

    shr-long v14, v6, v10

    long-to-int v10, v14

    int-to-float v10, v10

    add-float/2addr v10, v11

    and-long v6, v6, v16

    long-to-int v6, v6

    int-to-float v6, v6

    add-float/2addr v6, v9

    invoke-interface {v3}, Ll2/e;->a()F

    move-result v7

    invoke-interface {v3}, Ll2/e;->h()Li2/y;

    move-result-object v12

    invoke-interface {v3}, Ll2/e;->x()I

    move-result v14

    const/high16 v15, 0x3f800000    # 1.0f

    cmpg-float v15, v7, v15

    if-ltz v15, :cond_5

    const/4 v15, 0x3

    if-ne v14, v15, :cond_5

    if-nez v12, :cond_5

    invoke-interface {v3}, Ll2/e;->g()I

    move-result v15

    if-ne v15, v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    move-object v7, v8

    move v8, v11

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v15, v0, Ll2/c;->p:Li2/h;

    if-nez v15, :cond_6

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object v15

    iput-object v15, v0, Ll2/c;->p:Li2/h;

    :cond_6
    invoke-virtual {v15, v7}, Li2/h;->c(F)V

    invoke-virtual {v15, v14}, Li2/h;->d(I)V

    invoke-virtual {v15, v12}, Li2/h;->f(Li2/y;)V

    iget-object v12, v15, Li2/h;->a:Landroid/graphics/Paint;

    move-object v7, v8

    move v8, v11

    move v11, v6

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    :goto_2
    invoke-virtual {v7, v8, v9}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-interface {v3}, Ll2/e;->u()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    :cond_7
    if-nez v13, :cond_8

    iget-boolean v6, v0, Ll2/c;->w:Z

    if-eqz v6, :cond_8

    move v6, v5

    goto :goto_3

    :cond_8
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_d

    invoke-interface {v1}, Li2/v;->q()V

    invoke-virtual {v0}, Ll2/c;->d()Li2/p0;

    move-result-object v8

    instance-of v9, v8, Li2/n0;

    if-eqz v9, :cond_9

    check-cast v8, Li2/n0;

    iget-object v8, v8, Li2/n0;->a:Lh2/c;

    invoke-static {v1, v8}, Li2/v;->h(Li2/v;Lh2/c;)V

    goto :goto_5

    :cond_9
    instance-of v9, v8, Li2/o0;

    if-eqz v9, :cond_b

    iget-object v9, v0, Ll2/c;->m:Li2/j;

    if-eqz v9, :cond_a

    iget-object v10, v9, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    goto :goto_4

    :cond_a
    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v9

    iput-object v9, v0, Ll2/c;->m:Li2/j;

    :goto_4
    check-cast v8, Li2/o0;

    iget-object v8, v8, Li2/o0;->a:Lh2/d;

    invoke-static {v9, v8}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    invoke-interface {v1, v9, v5}, Li2/v;->n(Li2/s0;I)V

    goto :goto_5

    :cond_b
    instance-of v9, v8, Li2/m0;

    if-eqz v9, :cond_c

    check-cast v8, Li2/m0;

    iget-object v8, v8, Li2/m0;->a:Li2/s0;

    invoke-interface {v1, v8, v5}, Li2/v;->n(Li2/s0;I)V

    goto :goto_5

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    :goto_5
    if-eqz v2, :cond_13

    iget-object v2, v2, Ll2/c;->r:Ll2/a;

    iget-boolean v8, v2, Ll2/a;->a:Z

    if-nez v8, :cond_e

    const-string v8, "Only add dependencies during a tracking"

    invoke-static {v8}, Li2/j0;->a(Ljava/lang/String;)V

    :cond_e
    iget-object v8, v2, Ll2/a;->d:Ljava/lang/Object;

    check-cast v8, La0/w0;

    const/4 v9, 0x0

    if-eqz v8, :cond_f

    invoke-virtual {v8, v0}, La0/w0;->a(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    iget-object v8, v2, Ll2/a;->b:Ljava/lang/Object;

    check-cast v8, Ll2/c;

    if-eqz v8, :cond_10

    sget-object v8, La0/e1;->a:La0/w0;

    new-instance v8, La0/w0;

    invoke-direct {v8}, La0/w0;-><init>()V

    iget-object v10, v2, Ll2/a;->b:Ljava/lang/Object;

    check-cast v10, Ll2/c;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, La0/w0;->a(Ljava/lang/Object;)Z

    invoke-virtual {v8, v0}, La0/w0;->a(Ljava/lang/Object;)Z

    iput-object v8, v2, Ll2/a;->d:Ljava/lang/Object;

    iput-object v9, v2, Ll2/a;->b:Ljava/lang/Object;

    goto :goto_6

    :cond_10
    iput-object v0, v2, Ll2/a;->b:Ljava/lang/Object;

    :goto_6
    iget-object v8, v2, Ll2/a;->e:Ljava/lang/Object;

    check-cast v8, La0/w0;

    if-eqz v8, :cond_11

    invoke-virtual {v8, v0}, La0/w0;->l(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v5

    goto :goto_7

    :cond_11
    iget-object v8, v2, Ll2/a;->c:Ljava/lang/Object;

    check-cast v8, Ll2/c;

    if-eq v8, v0, :cond_12

    move v2, v5

    goto :goto_7

    :cond_12
    iput-object v9, v2, Ll2/a;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    :goto_7
    if-eqz v2, :cond_13

    iget v2, v0, Ll2/c;->q:I

    add-int/2addr v2, v5

    iput v2, v0, Ll2/c;->q:I

    :cond_13
    invoke-static {v1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v2

    if-nez v2, :cond_15

    iget-object v2, v0, Ll2/c;->o:Lk2/b;

    if-nez v2, :cond_14

    new-instance v2, Lk2/b;

    invoke-direct {v2}, Lk2/b;-><init>()V

    iput-object v2, v0, Ll2/c;->o:Lk2/b;

    :cond_14
    iget-object v3, v2, Lk2/b;->x:La3/p;

    iget-object v5, v0, Ll2/c;->b:Ly3/c;

    iget-object v8, v0, Ll2/c;->c:Ly3/m;

    iget-wide v9, v0, Ll2/c;->u:J

    invoke-static {v9, v10}, Lv63/b;->l(J)J

    move-result-wide v9

    iget-object v11, v3, La3/p;->z:Ljava/lang/Object;

    check-cast v11, Lk2/b;

    iget-object v11, v11, Lk2/b;->w:Lk2/a;

    iget-object v12, v11, Lk2/a;->a:Ly3/c;

    iget-object v11, v11, Lk2/a;->b:Ly3/m;

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v14

    move/from16 p0, v6

    move-object v15, v7

    invoke-virtual {v3}, La3/p;->A()J

    move-result-wide v6

    move/from16 v16, v4

    iget-object v4, v3, La3/p;->y:Ljava/lang/Object;

    check-cast v4, Ll2/c;

    invoke-virtual {v3, v5}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v3, v8}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v3, v1}, La3/p;->P(Li2/v;)V

    invoke-virtual {v3, v9, v10}, La3/p;->U(J)V

    iput-object v0, v3, La3/p;->y:Ljava/lang/Object;

    invoke-interface {v1}, Li2/v;->q()V

    :try_start_1
    invoke-virtual {v0, v2}, Ll2/c;->c(Lk2/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v1}, Li2/v;->g()V

    invoke-virtual {v3, v12}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v3, v11}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v3, v14}, La3/p;->P(Li2/v;)V

    invoke-virtual {v3, v6, v7}, La3/p;->U(J)V

    iput-object v4, v3, La3/p;->y:Ljava/lang/Object;

    goto :goto_8

    :catchall_1
    move-exception v0

    invoke-interface {v1}, Li2/v;->g()V

    invoke-virtual {v3, v12}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v3, v11}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v3, v14}, La3/p;->P(Li2/v;)V

    invoke-virtual {v3, v6, v7}, La3/p;->U(J)V

    iput-object v4, v3, La3/p;->y:Ljava/lang/Object;

    throw v0

    :cond_15
    move/from16 v16, v4

    move/from16 p0, v6

    move-object v15, v7

    invoke-interface {v3, v1}, Ll2/e;->D(Li2/v;)V

    :goto_8
    if-eqz p0, :cond_16

    invoke-interface {v1}, Li2/v;->g()V

    :cond_16
    if-eqz v16, :cond_17

    invoke-interface {v1}, Li2/v;->r()V

    :cond_17
    if-nez v13, :cond_18

    invoke-virtual {v15}, Landroid/graphics/Canvas;->restore()V

    :cond_18
    :goto_9
    return-void
.end method

.method public static final u([Ljava/lang/Enum;)Lt83/b;
    .locals 1

    const-string v0, "entries"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt83/b;

    invoke-direct {v0, p0}, Lt83/b;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method

.method public static v(Ljk/a;)Lorg/json/JSONObject;
    .locals 3

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "event_type"

    invoke-virtual {p0}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Ljk/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "user_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v1, p0, Ljk/a;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "device_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v1, p0, Ljk/a;->c:Ljava/lang/Long;

    if-eqz v1, :cond_2

    const-string v2, "time"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    iget-object v1, p0, Ljk/a;->N:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Le93/b;->f0(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "event_properties"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Ljk/a;->O:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Le93/b;->f0(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "user_properties"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Ljk/a;->P:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Le93/b;->f0(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "groups"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Ljk/a;->Q:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Le93/b;->f0(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->X(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "group_properties"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Ljk/a;->i:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v2, "app_version"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    iget-object v1, p0, Ljk/a;->k:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v2, "platform"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    iget-object v1, p0, Ljk/a;->l:Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v2, "os_name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    iget-object v1, p0, Ljk/a;->m:Ljava/lang/String;

    if-eqz v1, :cond_6

    const-string v2, "os_version"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    iget-object v1, p0, Ljk/a;->n:Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v2, "device_brand"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    iget-object v1, p0, Ljk/a;->o:Ljava/lang/String;

    if-eqz v1, :cond_8

    const-string v2, "device_manufacturer"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    iget-object v1, p0, Ljk/a;->p:Ljava/lang/String;

    if-eqz v1, :cond_9

    const-string v2, "device_model"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    iget-object v1, p0, Ljk/a;->q:Ljava/lang/String;

    if-eqz v1, :cond_a

    const-string v2, "carrier"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_a
    iget-object v1, p0, Ljk/a;->r:Ljava/lang/String;

    if-eqz v1, :cond_b

    const-string v2, "country"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_b
    iget-object v1, p0, Ljk/a;->s:Ljava/lang/String;

    if-eqz v1, :cond_c

    const-string v2, "region"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_c
    iget-object v1, p0, Ljk/a;->t:Ljava/lang/String;

    if-eqz v1, :cond_d

    const-string v2, "city"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_d
    iget-object v1, p0, Ljk/a;->u:Ljava/lang/String;

    if-eqz v1, :cond_e

    const-string v2, "dma"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_e
    iget-object v1, p0, Ljk/a;->A:Ljava/lang/String;

    if-eqz v1, :cond_f

    const-string v2, "language"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_f
    iget-object v1, p0, Ljk/a;->G:Ljava/lang/Double;

    if-eqz v1, :cond_10

    const-string v2, "price"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_10
    iget-object v1, p0, Ljk/a;->H:Ljava/lang/Integer;

    if-eqz v1, :cond_11

    const-string v2, "quantity"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_11
    iget-object v1, p0, Ljk/a;->F:Ljava/lang/Double;

    if-eqz v1, :cond_12

    const-string v2, "revenue"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_12
    iget-object v1, p0, Ljk/a;->I:Ljava/lang/String;

    if-eqz v1, :cond_13

    const-string v2, "productId"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_13
    iget-object v1, p0, Ljk/a;->J:Ljava/lang/String;

    if-eqz v1, :cond_14

    const-string v2, "revenueType"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_14
    iget-object v1, p0, Ljk/a;->g:Ljava/lang/Double;

    if-eqz v1, :cond_15

    const-string v2, "location_lat"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_15
    iget-object v1, p0, Ljk/a;->h:Ljava/lang/Double;

    if-eqz v1, :cond_16

    const-string v2, "location_lng"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_16
    iget-object v1, p0, Ljk/a;->C:Ljava/lang/String;

    if-eqz v1, :cond_17

    const-string v2, "ip"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_17
    iget-object v1, p0, Ljk/a;->j:Ljava/lang/String;

    if-eqz v1, :cond_18

    const-string v2, "version_name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_18
    iget-object v1, p0, Ljk/a;->v:Ljava/lang/String;

    if-eqz v1, :cond_19

    const-string v2, "idfa"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_19
    iget-object v1, p0, Ljk/a;->w:Ljava/lang/String;

    if-eqz v1, :cond_1a

    const-string v2, "idfv"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1a
    iget-object v1, p0, Ljk/a;->x:Ljava/lang/String;

    if-eqz v1, :cond_1b

    const-string v2, "adid"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1b
    iget-object v1, p0, Ljk/a;->z:Ljava/lang/String;

    if-eqz v1, :cond_1c

    const-string v2, "android_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1c
    iget-object v1, p0, Ljk/a;->d:Ljava/lang/Long;

    if-eqz v1, :cond_1d

    const-string v2, "event_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1d
    iget-object v1, p0, Ljk/a;->e:Ljava/lang/Long;

    if-eqz v1, :cond_1e

    const-string v2, "session_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1e
    iget-object v1, p0, Ljk/a;->f:Ljava/lang/String;

    if-eqz v1, :cond_1f

    const-string v2, "insert_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1f
    iget-object v1, p0, Ljk/a;->B:Ljava/lang/String;

    if-eqz v1, :cond_20

    const-string v2, "library"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_20
    iget-object v1, p0, Ljk/a;->K:Ljava/lang/String;

    if-eqz v1, :cond_21

    const-string v2, "partner_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_21
    iget-object v1, p0, Ljk/a;->y:Ljava/lang/String;

    if-eqz v1, :cond_22

    const-string v2, "android_app_set_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_22
    iget-object v1, p0, Ljk/a;->D:Ljk/d;

    if-eqz v1, :cond_23

    const-string v2, "plan"

    invoke-virtual {v1}, Ljk/d;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_23
    iget-object p0, p0, Ljk/a;->E:Ljk/c;

    if-eqz p0, :cond_24

    const-string v1, "ingestion_metadata"

    invoke-virtual {p0}, Ljk/c;->g()Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_24
    return-object v0
.end method

.method public static final w(JIZF)J
    .locals 0

    if-nez p3, :cond_2

    const/4 p3, 0x2

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x4

    if-ne p2, p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x5

    if-ne p2, p3, :cond_3

    :cond_2
    :goto_0
    invoke-static {p0, p1}, Ly3/a;->e(J)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0, p1}, Ly3/a;->i(J)I

    move-result p2

    goto :goto_1

    :cond_3
    const p2, 0x7fffffff

    :goto_1
    invoke-static {p0, p1}, Ly3/a;->k(J)I

    move-result p3

    if-ne p3, p2, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p4}, Lwb3/f;->l(F)I

    move-result p3

    invoke-static {p0, p1}, Ly3/a;->k(J)I

    move-result p4

    invoke-static {p3, p4, p2}, Le93/b;->n(III)I

    move-result p2

    :goto_2
    invoke-static {p0, p1}, Ly3/a;->h(J)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p1, p2, p1, p0}, Lva3/l;->n(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final x(Ljava/lang/String;)Lf6/d;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf6/d;

    invoke-direct {v0, p0}, Lf6/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;
    .locals 2

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_0

    const-string v1, "clazz"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v0, p2, p0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "KoinApplication has not been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final z(Lm93/g;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lm93/g;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method
