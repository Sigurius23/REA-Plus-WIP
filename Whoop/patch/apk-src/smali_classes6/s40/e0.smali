.class public abstract Ls40/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v3

    if-gez v3, :cond_1

    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static final b(Lf63/c;Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lf63/c;->a()Lw53/b;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static c(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const-wide/16 v2, 0x0

    :goto_0
    if-ltz v1, :cond_0

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v4, v1

    add-long/2addr v2, v4

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public static final d(Landroid/view/View;Landroidx/lifecycle/f2;Lc93/m;)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object p1

    :cond_0
    if-eqz v0, :cond_4

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, La20/h;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v2, "getApplicationContext(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p0

    instance-of v2, p1, Landroidx/lifecycle/r;

    if-eqz v2, :cond_2

    check-cast p1, Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object p1, Ll8/a;->b:Ll8/a;

    :goto_0
    const-string v2, "store"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "defaultCreationExtras"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lzt/q;

    invoke-direct {v2, p0, v1, p1}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    const-class p0, Ls40/d0;

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const-string p1, "modelClass"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Ls40/d0;

    invoke-interface {p2, v0, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_1
    return-void
.end method

.method public static final e(Lv00/b0;Lv00/c0;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v0

    iget-object v0, v0, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v0

    invoke-interface {p0, v0}, Lv00/b0;->a(Z)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/i;

    invoke-interface {p0}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v2

    iget-object v2, v2, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {v1, p1, v2}, Lv00/i;->a(Lv00/c0;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static f(Ljava/util/List;)Lin/c;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget v4, Llo/y;->a:I

    const-string v4, "="

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    array-length v6, v4

    const-string v7, "VorbisUtil"

    if-eq v6, v5, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, "Failed to parse Vorbis comment: "

    if-eqz v4, :cond_0

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {v7, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_1
    aget-object v3, v4, v1

    const-string v5, "METADATA_BLOCK_PICTURE"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    :try_start_0
    aget-object v3, v4, v5

    invoke-static {v3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    new-instance v4, Led3/a;

    invoke-direct {v4, v3, v5, v1}, Led3/a;-><init>([BIB)V

    invoke-static {v4}, Lln/a;->b(Led3/a;)Lln/a;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    const-string v4, "Failed to parse vorbis picture"

    invoke-static {v7, v4, v3}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_2

    :cond_2
    new-instance v3, Lqn/a;

    aget-object v6, v4, v1

    aget-object v4, v4, v5

    invoke-direct {v3, v6, v4}, Lln/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x0

    goto :goto_3

    :cond_4
    new-instance p0, Lin/c;

    invoke-direct {p0, v0}, Lin/c;-><init>(Ljava/util/List;)V

    :goto_3
    return-object p0
.end method

.method public static final g(Ljava/io/InputStream;)[B
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x2000

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    invoke-static {p0, v0}, Ls40/e0;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    const-string v0, "toByteArray(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static h(Led3/a;ZZ)Lt9/m0;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    invoke-static {p1, p0, v0}, Ls40/e0;->k(ILed3/a;Z)Z

    :cond_0
    invoke-virtual {p0}, Led3/a;->m()J

    move-result-wide v1

    long-to-int p1, v1

    sget-object v1, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, v1}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    invoke-virtual {p0}, Led3/a;->m()J

    move-result-wide v1

    long-to-int p1, v1

    new-array p1, p1, [Ljava/lang/String;

    :goto_0
    int-to-long v3, v0

    cmp-long v3, v3, v1

    if-gez v3, :cond_1

    invoke-virtual {p0}, Led3/a;->m()J

    move-result-wide v3

    long-to-int v3, v3

    sget-object v4, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v3, v4}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Led3/a;->y()I

    move-result p0

    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const-string p0, "framing bit expected to be set"

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0

    :cond_3
    :goto_1
    new-instance p0, Lt9/m0;

    invoke-direct {p0, p1}, Lt9/m0;-><init>([Ljava/lang/String;)V

    return-object p0
.end method

.method public static final i(ILjava/lang/String;)I
    .locals 1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "compass"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const p0, 0x7f0807ae

    return p0

    :sswitch_1
    const-string v0, "usaa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const p0, 0x7f0807b8

    return p0

    :sswitch_2
    const-string v0, "nfcu"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const p0, 0x7f0807b2

    return p0

    :sswitch_3
    const-string v0, "svb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const p0, 0x7f0807b6

    return p0

    :sswitch_4
    const-string v0, "pnc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const p0, 0x7f0807b3

    return p0

    :sswitch_5
    const-string v0, "boa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const p0, 0x7f0807ab

    return p0

    :sswitch_6
    const-string v0, "td"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const p0, 0x7f0807b7

    return p0

    :sswitch_7
    const-string v0, "wellsfargo"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const p0, 0x7f0807ba

    return p0

    :sswitch_8
    const-string v0, "morganchase"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const p0, 0x7f0807b1

    return p0

    :sswitch_9
    const-string v0, "usbank"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const p0, 0x7f0807b9

    return p0

    :sswitch_a
    const-string v0, "stripe"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const p0, 0x7f0807b4

    return p0

    :sswitch_b
    const-string v0, "citibank"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    const p0, 0x7f0807ad

    return p0

    :sswitch_c
    const-string v0, "suntrust"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    const p0, 0x7f0807b5

    return p0

    :sswitch_d
    const-string v0, "capitalone"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_0

    :cond_d
    const p0, 0x7f0807ac

    :cond_e
    :goto_0
    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x693d6c02 -> :sswitch_d
        -0x66527074 -> :sswitch_c
        -0x559585e9 -> :sswitch_b
        -0x352a9fb3 -> :sswitch_a
        -0x31d66a26 -> :sswitch_9
        -0x101ffb56 -> :sswitch_8
        -0x4b43406 -> :sswitch_7
        0xe70 -> :sswitch_6
        0x17db4 -> :sswitch_5
        0x1b225 -> :sswitch_4
        0x1be5f -> :sswitch_3
        0x338c2a -> :sswitch_2
        0x36eb3e -> :sswitch_1
        0x38a73d12 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final j(Lb9/b;)Lb9/b;
    .locals 4

    invoke-virtual {p0}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ErrorResponse"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x60

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lb9/b;->t()Lb9/b;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Error"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid error, expected <Error>; found `"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p0, :cond_2

    iget-object p0, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast p0, Lkg/a;

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid root, expected <ErrorResponse>; found `"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lb9/b;->y:Ljava/lang/Object;

    check-cast p0, Lkg/a;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(ILed3/a;Z)Z
    .locals 3

    invoke-virtual {p1}, Led3/a;->a()I

    move-result v0

    const/4 v1, 0x7

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    if-eqz p2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Led3/a;->a()I

    move-result p0

    new-instance p1, Ljava/lang/StringBuilder;

    const/16 p2, 0x1d

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "too short header: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0

    :cond_1
    invoke-virtual {p1}, Led3/a;->y()I

    move-result v0

    if-eq v0, p0, :cond_4

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const-string p2, "expected header type "

    if-eqz p1, :cond_3

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v2, p0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0

    :cond_4
    invoke-virtual {p1}, Led3/a;->y()I

    move-result p0

    const/16 v0, 0x76

    if-ne p0, v0, :cond_6

    invoke-virtual {p1}, Led3/a;->y()I

    move-result p0

    const/16 v0, 0x6f

    if-ne p0, v0, :cond_6

    invoke-virtual {p1}, Led3/a;->y()I

    move-result p0

    const/16 v0, 0x72

    if-ne p0, v0, :cond_6

    invoke-virtual {p1}, Led3/a;->y()I

    move-result p0

    const/16 v0, 0x62

    if-ne p0, v0, :cond_6

    invoke-virtual {p1}, Led3/a;->y()I

    move-result p0

    const/16 v0, 0x69

    if-ne p0, v0, :cond_6

    invoke-virtual {p1}, Led3/a;->y()I

    move-result p0

    const/16 p1, 0x73

    if-eq p0, p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 p0, 0x1

    return p0

    :cond_6
    :goto_1
    if-eqz p2, :cond_7

    :goto_2
    const/4 p0, 0x0

    return p0

    :cond_7
    const-string p0, "expected characters \'vorbis\'"

    invoke-static {v2, p0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0
.end method
