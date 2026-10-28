.class public Lla/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;
.implements Lml/h;
.implements Lmo/m;
.implements Ln9/c;
.implements Lr93/v;
.implements Li5/o;
.implements Lr93/s0;
.implements Lpe3/c;
.implements Log/e;
.implements Lpg3/n;
.implements Lcq/d;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    const/16 p1, 0xb

    iput p1, p0, Lla/b;->w:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 2

    iput p1, p0, Lla/b;->w:I

    packed-switch p1, :pswitch_data_0

    .line 19
    :pswitch_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide p1

    const/16 v0, 0x400

    int-to-long v0, v0

    div-long/2addr p1, v0

    long-to-int p1, p1

    div-int/lit8 p1, p1, 0x8

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance p2, Lm40/d;

    const/4 v0, 0x0

    .line 22
    invoke-direct {p2, p1, v0}, Lm40/d;-><init>(II)V

    .line 23
    iput-object p2, p0, Lla/b;->x:Ljava/lang/Object;

    return-void

    .line 24
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ljc/b;

    const/16 p2, 0x13

    .line 26
    invoke-direct {p1, p2}, Ljc/b;-><init>(I)V

    .line 27
    iput-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    return-void

    .line 28
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 29
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayDeque;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Ld00/l;Lwz/g0;Lwz/n0;)V
    .locals 3

    const/16 v0, 0x1b

    iput v0, p0, Lla/b;->w:I

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lwz/g0;->M:Lf20/b;

    const-string v1, "linkLaunchMode"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-object p2, p2, Lwz/g0;->w:Ly00/c8;

    .line 6
    invoke-static {p2, p1}, Ld00/n;->a(Ly00/c8;Ld00/l;)Ljava/util/Set;

    move-result-object p2

    .line 7
    instance-of v1, p3, Lwz/m0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p3, Lwz/m0;

    goto :goto_0

    :cond_0
    move-object p3, v2

    :goto_0
    if-eqz p3, :cond_1

    .line 8
    iget-object v2, p3, Lwz/m0;->x:Lwz/v0;

    .line 9
    :cond_1
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p3

    .line 10
    iget-object p1, p1, Ld00/l;->x:Ljava/lang/String;

    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    .line 11
    const-string p1, "bank_account"

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    .line 12
    sget-object p1, Lwz/v0;->x:Lwz/v0;

    if-ne v2, p1, :cond_3

    .line 13
    :cond_2
    new-instance p1, Lq00/d;

    invoke-direct {p1, v0}, Lq00/d;-><init>(Lf20/b;)V

    invoke-virtual {p3, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_3
    const-string p1, "card"

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v2, :cond_4

    .line 15
    sget-object p1, Lwz/v0;->w:Lwz/v0;

    if-ne v2, p1, :cond_5

    .line 16
    :cond_4
    sget-object p1, Lq00/e;->c:Lq00/e;

    invoke-virtual {p3, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_5
    invoke-static {p3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    .line 18
    iput-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lla/b;->w:I

    iput-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm63/c;Lad3/c;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, Lla/b;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lla/b;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqy/d;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lla/b;->w:I

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    return-void
.end method

.method public static D(Ljava/lang/Object;)Ljava/security/interfaces/ECPublicKey;
    .locals 4

    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Lnw/b;->h(Ljava/util/Map;)Lnw/b;

    move-result-object p0

    goto :goto_1

    :cond_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_2

    const-string p0, ""

    :cond_2
    sget-object v0, Lnw/b;->S:Ljava/util/Set;

    const/4 v0, -0x1

    invoke-static {v0, p0}, Lxw/d;->i(ILjava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Lnw/b;->h(Ljava/util/Map;)Lnw/b;

    move-result-object p0

    :goto_1
    const-string v0, "EC"

    iget-object v1, p0, Lnw/b;->O:Lnw/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lnw/c;->a(Lnw/a;)Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v1, Ljava/security/spec/ECPoint;

    iget-object v3, p0, Lnw/b;->P:Lxw/b;

    invoke-virtual {v3}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object v3

    iget-object p0, p0, Lnw/b;->Q:Lxw/b;

    invoke-virtual {p0}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object p0

    invoke-direct {v1, v3, p0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance p0, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {p0, v1, v2}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    check-cast p0, Ljava/security/interfaces/ECPublicKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "toECPublicKey(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t get EC parameter spec for curve "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A(IILt9/o;)V
    .locals 23

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    iget-object v4, v2, Lla/b;->x:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lla/d;

    iget-object v4, v5, Lla/d;->b:Lla/e;

    iget-object v6, v5, Lla/d;->c:Landroid/util/SparseArray;

    iget-object v7, v5, Lla/d;->k:Lx8/n;

    iget-object v8, v5, Lla/d;->i:Lx8/n;

    const/16 v9, 0xa1

    const/16 v10, 0xa3

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x4

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v0, v9, :cond_b

    if-eq v0, v10, :cond_b

    const/16 v4, 0xa5

    if-eq v0, v4, :cond_8

    const/16 v4, 0x41ed

    if-eq v0, v4, :cond_5

    const/16 v4, 0x4255

    if-eq v0, v4, :cond_4

    const/16 v4, 0x47e2

    if-eq v0, v4, :cond_3

    const/16 v4, 0x53ab

    if-eq v0, v4, :cond_2

    const/16 v4, 0x63a2

    if-eq v0, v4, :cond_1

    const/16 v4, 0x7672

    if-ne v0, v4, :cond_0

    invoke-virtual {v5, v0}, Lla/d;->c(I)V

    iget-object v0, v5, Lla/d;->x:Lla/c;

    new-array v4, v1, [B

    iput-object v4, v0, Lla/c;->x:[B

    invoke-interface {v3, v4, v15, v1}, Lt9/o;->readFully([BII)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected id: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {v5, v0}, Lla/d;->c(I)V

    iget-object v0, v5, Lla/d;->x:Lla/c;

    new-array v4, v1, [B

    iput-object v4, v0, Lla/c;->l:[B

    invoke-interface {v3, v4, v15, v1}, Lt9/o;->readFully([BII)V

    return-void

    :cond_2
    iget-object v0, v7, Lx8/n;->a:[B

    invoke-static {v0, v15}, Ljava/util/Arrays;->fill([BB)V

    iget-object v0, v7, Lx8/n;->a:[B

    rsub-int/lit8 v4, v1, 0x4

    invoke-interface {v3, v0, v4, v1}, Lt9/o;->readFully([BII)V

    invoke-virtual {v7, v15}, Lx8/n;->F(I)V

    invoke-virtual {v7}, Lx8/n;->v()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, v5, Lla/d;->z:I

    return-void

    :cond_3
    new-array v4, v1, [B

    invoke-interface {v3, v4, v15, v1}, Lt9/o;->readFully([BII)V

    invoke-virtual {v5, v0}, Lla/d;->c(I)V

    iget-object v0, v5, Lla/d;->x:Lla/c;

    new-instance v1, Lt9/j0;

    invoke-direct {v1, v14, v15, v15, v4}, Lt9/j0;-><init>(III[B)V

    iput-object v1, v0, Lla/c;->k:Lt9/j0;

    return-void

    :cond_4
    invoke-virtual {v5, v0}, Lla/d;->c(I)V

    iget-object v0, v5, Lla/d;->x:Lla/c;

    new-array v4, v1, [B

    iput-object v4, v0, Lla/c;->j:[B

    invoke-interface {v3, v4, v15, v1}, Lt9/o;->readFully([BII)V

    return-void

    :cond_5
    invoke-virtual {v5, v0}, Lla/d;->c(I)V

    iget-object v0, v5, Lla/d;->x:Lla/c;

    iget v4, v0, Lla/c;->h:I

    const v5, 0x64767643

    if-eq v4, v5, :cond_7

    const v5, 0x64766343

    if-ne v4, v5, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {v3, v1}, Lt9/o;->n(I)V

    return-void

    :cond_7
    :goto_0
    new-array v4, v1, [B

    iput-object v4, v0, Lla/c;->P:[B

    invoke-interface {v3, v4, v15, v1}, Lt9/o;->readFully([BII)V

    return-void

    :cond_8
    iget v0, v5, Lla/d;->J:I

    if-eq v0, v12, :cond_9

    goto/16 :goto_12

    :cond_9
    iget v0, v5, Lla/d;->P:I

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lla/c;

    iget v4, v5, Lla/d;->S:I

    iget-object v5, v5, Lla/d;->p:Lx8/n;

    if-ne v4, v13, :cond_a

    const-string v4, "V_VP9"

    iget-object v0, v0, Lla/c;->c:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v5, v1}, Lx8/n;->C(I)V

    iget-object v0, v5, Lx8/n;->a:[B

    invoke-interface {v3, v0, v15, v1}, Lt9/o;->readFully([BII)V

    return-void

    :cond_a
    invoke-interface {v3, v1}, Lt9/o;->n(I)V

    return-void

    :cond_b
    iget v7, v5, Lla/d;->J:I

    const/16 v9, 0x8

    if-nez v7, :cond_c

    invoke-virtual {v4, v3, v15, v14, v9}, Lla/e;->b(Lt9/o;ZZI)J

    move-result-wide v10

    long-to-int v10, v10

    iput v10, v5, Lla/d;->P:I

    iget v4, v4, Lla/e;->c:I

    iput v4, v5, Lla/d;->Q:I

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v10, v5, Lla/d;->L:J

    iput v14, v5, Lla/d;->J:I

    invoke-virtual {v8, v15}, Lx8/n;->C(I)V

    :cond_c
    iget v4, v5, Lla/d;->P:I

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lla/c;

    if-nez v6, :cond_d

    iget v0, v5, Lla/d;->Q:I

    sub-int v0, v1, v0

    invoke-interface {v3, v0}, Lt9/o;->n(I)V

    iput v15, v5, Lla/d;->J:I

    return-void

    :cond_d
    iget-object v4, v6, Lla/c;->Z:Lt9/k0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v5, Lla/d;->J:I

    if-ne v4, v14, :cond_22

    const/4 v4, 0x3

    invoke-virtual {v5, v3, v4}, Lla/d;->f(Lt9/o;I)V

    iget-object v10, v8, Lx8/n;->a:[B

    aget-byte v10, v10, v12

    and-int/lit8 v10, v10, 0x6

    shr-int/2addr v10, v14

    const/16 v11, 0xff

    if-nez v10, :cond_10

    iput v14, v5, Lla/d;->N:I

    iget-object v10, v5, Lla/d;->O:[I

    if-nez v10, :cond_e

    new-array v10, v14, [I

    goto :goto_1

    :cond_e
    array-length v13, v10

    if-lt v13, v14, :cond_f

    goto :goto_1

    :cond_f
    array-length v10, v10

    mul-int/2addr v10, v12

    invoke-static {v10, v14}, Ljava/lang/Math;->max(II)I

    move-result v10

    new-array v10, v10, [I

    :goto_1
    iput-object v10, v5, Lla/d;->O:[I

    iget v13, v5, Lla/d;->Q:I

    sub-int/2addr v1, v13

    sub-int/2addr v1, v4

    aput v1, v10, v15

    :goto_2
    move/from16 v17, v14

    move/from16 v19, v15

    goto/16 :goto_b

    :cond_10
    invoke-virtual {v5, v3, v13}, Lla/d;->f(Lt9/o;I)V

    iget-object v7, v8, Lx8/n;->a:[B

    aget-byte v7, v7, v4

    and-int/2addr v7, v11

    add-int/2addr v7, v14

    iput v7, v5, Lla/d;->N:I

    move/from16 v17, v13

    iget-object v13, v5, Lla/d;->O:[I

    if-nez v13, :cond_11

    new-array v13, v7, [I

    goto :goto_3

    :cond_11
    array-length v9, v13

    if-lt v9, v7, :cond_12

    goto :goto_3

    :cond_12
    array-length v9, v13

    mul-int/2addr v9, v12

    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    new-array v13, v7, [I

    :goto_3
    iput-object v13, v5, Lla/d;->O:[I

    if-ne v10, v12, :cond_13

    iget v4, v5, Lla/d;->Q:I

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x4

    iget v4, v5, Lla/d;->N:I

    div-int/2addr v1, v4

    invoke-static {v13, v15, v4, v1}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_2

    :cond_13
    if-ne v10, v14, :cond_16

    move v4, v15

    move v7, v4

    move/from16 v13, v17

    :goto_4
    iget v9, v5, Lla/d;->N:I

    sub-int/2addr v9, v14

    if-ge v4, v9, :cond_15

    iget-object v9, v5, Lla/d;->O:[I

    aput v15, v9, v4

    :goto_5
    add-int/lit8 v9, v13, 0x1

    invoke-virtual {v5, v3, v9}, Lla/d;->f(Lt9/o;I)V

    iget-object v10, v8, Lx8/n;->a:[B

    aget-byte v10, v10, v13

    and-int/2addr v10, v11

    iget-object v13, v5, Lla/d;->O:[I

    aget v16, v13, v4

    add-int v16, v16, v10

    aput v16, v13, v4

    if-eq v10, v11, :cond_14

    add-int v7, v7, v16

    add-int/lit8 v4, v4, 0x1

    move v13, v9

    goto :goto_4

    :cond_14
    move v13, v9

    goto :goto_5

    :cond_15
    iget-object v4, v5, Lla/d;->O:[I

    iget v10, v5, Lla/d;->Q:I

    sub-int/2addr v1, v10

    sub-int/2addr v1, v13

    sub-int/2addr v1, v7

    aput v1, v4, v9

    goto :goto_2

    :cond_16
    if-ne v10, v4, :cond_21

    move v4, v15

    move v7, v4

    move/from16 v13, v17

    :goto_6
    iget v9, v5, Lla/d;->N:I

    sub-int/2addr v9, v14

    if-ge v4, v9, :cond_1e

    iget-object v9, v5, Lla/d;->O:[I

    aput v15, v9, v4

    add-int/lit8 v9, v13, 0x1

    invoke-virtual {v5, v3, v9}, Lla/d;->f(Lt9/o;I)V

    iget-object v10, v8, Lx8/n;->a:[B

    aget-byte v10, v10, v13

    if-eqz v10, :cond_1d

    move/from16 v17, v14

    move v10, v15

    :goto_7
    const/16 v14, 0x8

    if-ge v10, v14, :cond_19

    rsub-int/lit8 v14, v10, 0x7

    shl-int v14, v17, v14

    move/from16 v19, v15

    iget-object v15, v8, Lx8/n;->a:[B

    aget-byte v15, v15, v13

    and-int/2addr v15, v14

    if-eqz v15, :cond_18

    add-int v15, v9, v10

    invoke-virtual {v5, v3, v15}, Lla/d;->f(Lt9/o;I)V

    iget-object v12, v8, Lx8/n;->a:[B

    aget-byte v12, v12, v13

    and-int/2addr v12, v11

    not-int v13, v14

    and-int/2addr v12, v13

    int-to-long v12, v12

    :goto_8
    if-ge v9, v15, :cond_17

    const/16 v18, 0x8

    shl-long v12, v12, v18

    iget-object v14, v8, Lx8/n;->a:[B

    add-int/lit8 v20, v9, 0x1

    aget-byte v9, v14, v9

    and-int/2addr v9, v11

    move-wide/from16 v21, v12

    int-to-long v11, v9

    or-long v12, v21, v11

    move/from16 v9, v20

    const/16 v11, 0xff

    goto :goto_8

    :cond_17
    if-lez v4, :cond_1a

    mul-int/lit8 v10, v10, 0x7

    add-int/lit8 v10, v10, 0x6

    const-wide/16 v20, 0x1

    shl-long v9, v20, v10

    sub-long v9, v9, v20

    sub-long/2addr v12, v9

    goto :goto_9

    :cond_18
    add-int/lit8 v10, v10, 0x1

    move/from16 v15, v19

    const/16 v11, 0xff

    const/4 v12, 0x2

    goto :goto_7

    :cond_19
    move/from16 v19, v15

    const-wide/16 v12, 0x0

    move v15, v9

    :cond_1a
    :goto_9
    const-wide/32 v9, -0x80000000

    cmp-long v9, v12, v9

    if-ltz v9, :cond_1c

    const-wide/32 v9, 0x7fffffff

    cmp-long v9, v12, v9

    if-gtz v9, :cond_1c

    long-to-int v9, v12

    iget-object v10, v5, Lla/d;->O:[I

    if-nez v4, :cond_1b

    goto :goto_a

    :cond_1b
    add-int/lit8 v11, v4, -0x1

    aget v11, v10, v11

    add-int/2addr v9, v11

    :goto_a
    aput v9, v10, v4

    add-int/2addr v7, v9

    add-int/lit8 v4, v4, 0x1

    move v13, v15

    move/from16 v14, v17

    move/from16 v15, v19

    const/16 v11, 0xff

    const/4 v12, 0x2

    goto/16 :goto_6

    :cond_1c
    const-string v0, "EBML lacing sample size out of range."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v1, 0x0

    const-string v0, "No valid varint length mask found"

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_1e
    move/from16 v17, v14

    move/from16 v19, v15

    iget-object v4, v5, Lla/d;->O:[I

    iget v10, v5, Lla/d;->Q:I

    sub-int/2addr v1, v10

    sub-int/2addr v1, v13

    sub-int/2addr v1, v7

    aput v1, v4, v9

    :goto_b
    iget-object v1, v8, Lx8/n;->a:[B

    aget-byte v4, v1, v19

    const/16 v18, 0x8

    shl-int/lit8 v4, v4, 0x8

    aget-byte v1, v1, v17

    const/16 v14, 0xff

    and-int/2addr v1, v14

    or-int/2addr v1, v4

    iget-wide v9, v5, Lla/d;->E:J

    int-to-long v11, v1

    invoke-virtual {v5, v11, v12}, Lla/d;->l(J)J

    move-result-wide v11

    add-long/2addr v11, v9

    iput-wide v11, v5, Lla/d;->K:J

    iget v1, v6, Lla/c;->e:I

    const/4 v4, 0x2

    if-eq v1, v4, :cond_20

    const/16 v7, 0xa3

    if-ne v0, v7, :cond_1f

    iget-object v1, v8, Lx8/n;->a:[B

    aget-byte v1, v1, v4

    const/16 v8, 0x80

    and-int/2addr v1, v8

    if-ne v1, v8, :cond_1f

    goto :goto_c

    :cond_1f
    move/from16 v1, v19

    goto :goto_d

    :cond_20
    :goto_c
    move/from16 v1, v17

    :goto_d
    iput v1, v5, Lla/d;->R:I

    iput v4, v5, Lla/d;->J:I

    move/from16 v1, v19

    iput v1, v5, Lla/d;->M:I

    :goto_e
    const/16 v7, 0xa3

    goto :goto_f

    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected lacing value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_22
    move/from16 v17, v14

    goto :goto_e

    :goto_f
    if-ne v0, v7, :cond_24

    :goto_10
    iget v0, v5, Lla/d;->M:I

    iget v1, v5, Lla/d;->N:I

    if-ge v0, v1, :cond_23

    iget-object v1, v5, Lla/d;->O:[I

    aget v0, v1, v0

    const/4 v1, 0x0

    invoke-virtual {v5, v3, v6, v0, v1}, Lla/d;->m(Lt9/o;Lla/c;IZ)I

    move-result v10

    iget-wide v0, v5, Lla/d;->K:J

    iget v4, v5, Lla/d;->M:I

    iget v7, v6, Lla/c;->f:I

    mul-int/2addr v4, v7

    div-int/lit16 v4, v4, 0x3e8

    int-to-long v7, v4

    add-long/2addr v7, v0

    iget v9, v5, Lla/d;->R:I

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Lla/d;->d(Lla/c;JIII)V

    iget v0, v5, Lla/d;->M:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v5, Lla/d;->M:I

    goto :goto_10

    :cond_23
    const/4 v1, 0x0

    iput v1, v5, Lla/d;->J:I

    return-void

    :cond_24
    :goto_11
    iget v0, v5, Lla/d;->M:I

    iget v1, v5, Lla/d;->N:I

    if-ge v0, v1, :cond_25

    iget-object v1, v5, Lla/d;->O:[I

    aget v4, v1, v0

    move/from16 v7, v17

    invoke-virtual {v5, v3, v6, v4, v7}, Lla/d;->m(Lt9/o;Lla/c;IZ)I

    move-result v4

    aput v4, v1, v0

    iget v0, v5, Lla/d;->M:I

    add-int/2addr v0, v7

    iput v0, v5, Lla/d;->M:I

    goto :goto_11

    :cond_25
    :goto_12
    return-void
.end method

.method public B(IJ)V
    .locals 9

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lla/d;

    const/16 v1, 0x5031

    const/4 v2, 0x0

    const-string v3, " not supported"

    if-eq p1, v1, :cond_13

    const/16 v1, 0x5032

    const-wide/16 v4, 0x1

    if-eq p1, v1, :cond_11

    const/4 v1, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    sparse-switch p1, :sswitch_data_0

    const/4 v1, -0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->E:I

    return-void

    :pswitch_1
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->D:I

    return-void

    :pswitch_2
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput-boolean v8, p1, Lla/c;->z:Z

    long-to-int p1, p2

    invoke-static {p1}, Lu8/g;->f(I)I

    move-result p1

    if-eq p1, v1, :cond_14

    iget-object p2, v0, Lla/d;->x:Lla/c;

    iput p1, p2, Lla/c;->A:I

    return-void

    :pswitch_3
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    long-to-int p1, p2

    invoke-static {p1}, Lu8/g;->g(I)I

    move-result p1

    if-eq p1, v1, :cond_14

    iget-object p2, v0, Lla/d;->x:Lla/c;

    iput p1, p2, Lla/c;->B:I

    return-void

    :pswitch_4
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    long-to-int p1, p2

    if-eq p1, v8, :cond_1

    if-eq p1, v7, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v8, p1, Lla/c;->C:I

    return-void

    :cond_1
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v7, p1, Lla/c;->C:I

    return-void

    :sswitch_0
    iput-wide p2, v0, Lla/d;->t:J

    return-void

    :sswitch_1
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->f:I

    return-void

    :sswitch_2
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    long-to-int p1, p2

    if-eqz p1, :cond_5

    if-eq p1, v8, :cond_4

    if-eq p1, v7, :cond_3

    if-eq p1, v6, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v6, p1, Lla/c;->t:I

    return-void

    :cond_3
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v7, p1, Lla/c;->t:I

    return-void

    :cond_4
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v8, p1, Lla/c;->t:I

    return-void

    :cond_5
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v1, p1, Lla/c;->t:I

    return-void

    :sswitch_3
    iput-wide p2, v0, Lla/d;->U:J

    return-void

    :sswitch_4
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->R:I

    return-void

    :sswitch_5
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput-wide p2, p1, Lla/c;->U:J

    return-void

    :sswitch_6
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput-wide p2, p1, Lla/c;->T:J

    return-void

    :sswitch_7
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->g:I

    return-void

    :sswitch_8
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput-boolean v8, p1, Lla/c;->z:Z

    long-to-int p2, p2

    iput p2, p1, Lla/c;->p:I

    return-void

    :sswitch_9
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    cmp-long p2, p2, v4

    if-nez p2, :cond_6

    move v1, v8

    :cond_6
    iput-boolean v1, p1, Lla/c;->W:Z

    return-void

    :sswitch_a
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->r:I

    return-void

    :sswitch_b
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->s:I

    return-void

    :sswitch_c
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->q:I

    return-void

    :sswitch_d
    long-to-int p2, p2

    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    if-eqz p2, :cond_a

    if-eq p2, v8, :cond_9

    if-eq p2, v6, :cond_8

    const/16 p1, 0xf

    if-eq p2, p1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v6, p1, Lla/c;->y:I

    return-void

    :cond_8
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v8, p1, Lla/c;->y:I

    return-void

    :cond_9
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v7, p1, Lla/c;->y:I

    return-void

    :cond_a
    iget-object p1, v0, Lla/d;->x:Lla/c;

    iput v1, p1, Lla/c;->y:I

    return-void

    :sswitch_e
    iget-wide v1, v0, Lla/d;->s:J

    add-long/2addr p2, v1

    iput-wide p2, v0, Lla/d;->A:J

    return-void

    :sswitch_f
    cmp-long p1, p2, v4

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "AESSettingsCipherMode "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :sswitch_10
    const-wide/16 v0, 0x5

    cmp-long p1, p2, v0

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentEncAlgo "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :sswitch_11
    cmp-long p1, p2, v4

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "EBMLReadVersion "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :sswitch_12
    cmp-long p1, p2, v4

    if-ltz p1, :cond_e

    const-wide/16 v0, 0x2

    cmp-long p1, p2, v0

    if-gtz p1, :cond_e

    goto/16 :goto_0

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "DocTypeReadVersion "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :sswitch_13
    const-wide/16 v0, 0x3

    cmp-long p1, p2, v0

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentCompAlgo "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :sswitch_14
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->h:I

    return-void

    :sswitch_15
    iput-boolean v8, v0, Lla/d;->T:Z

    return-void

    :sswitch_16
    iget-boolean v1, v0, Lla/d;->H:Z

    if-nez v1, :cond_14

    invoke-virtual {v0, p1}, Lla/d;->a(I)V

    iget-object p1, v0, Lla/d;->G:Llo/k;

    invoke-virtual {p1, p2, p3}, Llo/k;->a(J)V

    iput-boolean v8, v0, Lla/d;->H:Z

    return-void

    :sswitch_17
    long-to-int p1, p2

    iput p1, v0, Lla/d;->S:I

    return-void

    :sswitch_18
    invoke-virtual {v0, p2, p3}, Lla/d;->l(J)J

    move-result-wide p1

    iput-wide p1, v0, Lla/d;->E:J

    return-void

    :sswitch_19
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->d:I

    return-void

    :sswitch_1a
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->o:I

    return-void

    :sswitch_1b
    invoke-virtual {v0, p1}, Lla/d;->a(I)V

    iget-object p1, v0, Lla/d;->F:Llo/k;

    invoke-virtual {v0, p2, p3}, Lla/d;->l(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Llo/k;->a(J)V

    return-void

    :sswitch_1c
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->n:I

    return-void

    :sswitch_1d
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->Q:I

    return-void

    :sswitch_1e
    invoke-virtual {v0, p2, p3}, Lla/d;->l(J)J

    move-result-wide p1

    iput-wide p1, v0, Lla/d;->L:J

    return-void

    :sswitch_1f
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    cmp-long p2, p2, v4

    if-nez p2, :cond_10

    move v1, v8

    :cond_10
    iput-boolean v1, p1, Lla/c;->X:Z

    return-void

    :sswitch_20
    invoke-virtual {v0, p1}, Lla/d;->c(I)V

    iget-object p1, v0, Lla/d;->x:Lla/c;

    long-to-int p2, p2

    iput p2, p1, Lla/c;->e:I

    return-void

    :cond_11
    cmp-long p1, p2, v4

    if-nez p1, :cond_12

    goto :goto_0

    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentEncodingScope "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :cond_13
    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_15

    :cond_14
    :goto_0
    return-void

    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "ContentEncodingOrder "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p1

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_20
        0x88 -> :sswitch_1f
        0x9b -> :sswitch_1e
        0x9f -> :sswitch_1d
        0xb0 -> :sswitch_1c
        0xb3 -> :sswitch_1b
        0xba -> :sswitch_1a
        0xd7 -> :sswitch_19
        0xe7 -> :sswitch_18
        0xee -> :sswitch_17
        0xf1 -> :sswitch_16
        0xfb -> :sswitch_15
        0x41e7 -> :sswitch_14
        0x4254 -> :sswitch_13
        0x4285 -> :sswitch_12
        0x42f7 -> :sswitch_11
        0x47e1 -> :sswitch_10
        0x47e8 -> :sswitch_f
        0x53ac -> :sswitch_e
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_c
        0x54b2 -> :sswitch_b
        0x54ba -> :sswitch_a
        0x55aa -> :sswitch_9
        0x55b2 -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public C(Lorg/json/JSONObject;)Lq30/a;
    .locals 6

    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, v0}, Lxw/d;->i(ILjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "parse(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lq30/a;

    const-string v2, "acsURL"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "acsEphemPubKey"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lla/b;->D(Ljava/lang/Object;)Ljava/security/interfaces/ECPublicKey;

    move-result-object v3

    const-string v4, "sdkEphemPubKey"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lla/b;->D(Ljava/lang/Object;)Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lq30/a;-><init>(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Ln30/c;

    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to parse ACS data: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Lq30/a;

    return-object v1
.end method

.method public E(Ljava/lang/String;Lm40/i;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lm40/d;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lm40/d;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public F(I)Ljava/util/ArrayList;
    .locals 22

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iget-object v2, v1, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Lo0/y;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    move-object v10, v4

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-static {v3}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v11

    :try_start_0
    iget-boolean v4, v2, Lo0/y;->b:Z

    if-eqz v4, :cond_1

    iget-object v4, v2, Lo0/y;->c:Lo0/o;

    :goto_1
    move-object v9, v4

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    iget-object v4, v2, Lo0/y;->e:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/o;

    goto :goto_1

    :goto_2
    if-eqz v9, :cond_3

    new-instance v6, Lkotlin/jvm/internal/e0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x1

    iput v4, v6, Lkotlin/jvm/internal/e0;->w:I

    iget-object v4, v9, Lo0/o;->k:Lkotlin/jvm/functions/Function1;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/util/List;

    move-object v4, v7

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v4, 0x0

    move v13, v4

    :goto_3
    if-ge v13, v12, :cond_3

    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v14, v2, Lo0/y;->o:Lp0/l0;

    iget-object v8, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v16

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ly3/a;

    move-object v15, v6

    iget-wide v5, v4, Ly3/a;->a:J

    sget-object v4, Lo0/y;->w:Lp0/n0;

    new-instance v4, Ljp2/l;

    move/from16 v8, p1

    move-wide/from16 v17, v5

    move-object v6, v15

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v9}, Ljp2/l;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/List;ILo0/o;)V

    iget-object v15, v14, Lp0/l0;->c:Lb9/b;

    if-eqz v15, :cond_2

    iget-object v8, v14, Lp0/l0;->b:La3/p;

    const/16 v20, 0x0

    move-object/from16 v21, v4

    move-object/from16 v19, v8

    invoke-virtual/range {v15 .. v21}, Lb9/b;->y(IJLa3/p;ZLkotlin/jvm/functions/Function1;)Lp0/y0;

    move-result-object v4

    goto :goto_4

    :cond_2
    sget-object v4, Lp0/g;->a:Lp0/g;

    :goto_4
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_3
    invoke-static {v3, v11, v10}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :goto_5
    invoke-static {v3, v11, v10}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method

.method public G(Lm63/d;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lm63/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm63/a;

    iget v1, v0, Lm63/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm63/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm63/a;

    invoke-direct {v0, p0, p2}, Lm63/a;-><init>(Lla/b;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lm63/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm63/a;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lm63/a;->x:Lm63/d;

    iget-object v2, v0, Lm63/a;->w:Lla/b;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p1, Lm63/d;->F:Ljava/lang/Object;

    check-cast p2, Ls63/a;

    iget-object v2, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Lad3/c;

    iget-object v2, v2, Lad3/c;->b:Lcd3/f;

    invoke-static {p2, v2}, Lio/sentry/config/a;->Y(Ls63/a;Lcd3/f;)Lwc3/c;

    move-result-object p2

    iput-object p2, p1, Lm63/d;->z:Ljava/lang/Object;

    iput-object p0, v0, Lm63/a;->w:Lla/b;

    iput-object p1, v0, Lm63/a;->x:Lm63/d;

    iput v4, v0, Lm63/a;->E:I

    invoke-virtual {p0, p1}, Lla/b;->H(Lm63/d;)Lj63/b;

    move-result-object p2
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    goto :goto_1

    :catch_0
    move-object v2, p0

    :catch_1
    move-object p2, v5

    :goto_1
    if-eqz p2, :cond_5

    return-object p2

    :cond_5
    iget-object p2, p1, Lm63/d;->y:Ljava/lang/Object;

    iget-object v4, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast v4, Lad3/c;

    iget-object v4, v4, Lad3/c;->b:Lcd3/f;

    invoke-static {p2, v4}, Lio/sentry/config/a;->G(Ljava/lang/Object;Lcd3/f;)Lwc3/c;

    move-result-object p2

    iput-object p2, p1, Lm63/d;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm63/a;->w:Lla/b;

    iput-object v5, v0, Lm63/a;->x:Lm63/d;

    iput v3, v0, Lm63/a;->E:I

    invoke-virtual {v2, p1}, Lla/b;->H(Lm63/d;)Lj63/b;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method

.method public H(Lm63/d;)Lj63/b;
    .locals 4

    if-eqz p1, :cond_1

    iget-object v0, p1, Lm63/d;->z:Ljava/lang/Object;

    check-cast v0, Lwc3/c;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lm63/d;->E:Ljava/lang/Object;

    check-cast v1, Lad3/c;

    iget-object v2, p1, Lm63/d;->y:Ljava/lang/Object;

    iget-object v3, p1, Lm63/d;->H:Ljava/lang/Object;

    check-cast v3, Li63/d;

    iget-object p1, p1, Lm63/d;->G:Ljava/lang/Object;

    check-cast p1, Ljava/nio/charset/Charset;

    check-cast v0, Lwc3/j;

    invoke-virtual {v1, v0, v2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lj63/e;

    invoke-static {v3, p1}, Lpf/c;->e0(Li63/d;Ljava/nio/charset/Charset;)Li63/d;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lj63/e;-><init>(Ljava/lang/String;Li63/d;)V

    return-object v1

    :cond_0
    const-string p1, "serializer"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "parameters type is "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", but expected "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p1, Lm63/d;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public I()V
    .locals 5

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    invoke-virtual {p0}, Lla/b;->K()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "data item not completed, stackSize: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " scope: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public J(J)V
    .locals 4

    invoke-virtual {p0}, Lla/b;->K()J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-eqz v2, :cond_2

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    const-wide/16 v2, -0x2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-wide v0, v2

    :cond_1
    const-string v2, "expected non-string scope or scope "

    const-string v3, " but found "

    invoke-static {p1, p2, v2, v3}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_0
    return-void
.end method

.method public K()J
    .locals 2

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lig3/a;

    invoke-interface {v0, p1}, Lig3/a;->a(Ljava/lang/Throwable;)Lig3/a;

    return-void
.end method

.method public b(Ljava/util/List;)Lr93/v;
    .locals 0

    return-object p0
.end method

.method public build()Lr93/w;
    .locals 1

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lnb3/c;

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lig3/a;

    invoke-interface {v0, p2, p1}, Lig3/a;->f(Ljava/lang/Object;Ljava/lang/String;)Lig3/a;

    return-void
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lud3/a1;

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lpg3/n;

    invoke-interface {v0, p1}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    return-object p1
.end method

.method public d(Lva3/h;)Lr93/v;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lig3/a;

    invoke-interface {v0}, Lig3/a;->b()V

    return-void
.end method

.method public f(I)Lr93/v;
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    return-object p0
.end method

.method public g()Lr93/v;
    .locals 0

    return-object p0
.end method

.method public getChannel()Ljava/nio/channels/FileChannel;
    .locals 2

    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    return-object v0
.end method

.method public h()Lr93/v;
    .locals 0

    return-object p0
.end method

.method public i()Lr93/v;
    .locals 0

    return-object p0
.end method

.method public k()Lr93/v;
    .locals 0

    return-object p0
.end method

.method public l(Lr93/k;)Lr93/v;
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public m(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {v0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->I(Landroid/view/View;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    :cond_0
    iget v1, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->e:I

    if-nez v1, :cond_1

    if-nez v2, :cond_2

    :cond_1
    if-ne v1, v3, :cond_3

    if-nez v2, :cond_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    neg-int v1, v1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lmr/f;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Lmr/f;->a(Landroid/view/View;)V

    :cond_4
    return v3

    :cond_5
    return v2
.end method

.method public n(Llb3/y;)Lr93/v;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    iget p1, p0, Lla/b;->w:I

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, p2

    :cond_0
    iget-object v1, p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->d0:Lh5/q1;

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->d0:Lh5/q1;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_1
    iget-object p1, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p1}, Lh5/o1;->c()Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v0, p2

    :cond_2
    iget-object v1, p1, Lcom/google/android/material/appbar/AppBarLayout;->G:Lh5/q1;

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v0, p1, Lcom/google/android/material/appbar/AppBarLayout;->G:Lh5/q1;

    iget-object v0, p1, Lcom/google/android/material/appbar/AppBarLayout;->V:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    move-result v0

    if-lez v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_4
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lr93/a0;)Lr93/v;
    .locals 0

    return-object p0
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lpp/b;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lpp/b;->cancel(Z)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lpp/p;->I:Ljava/lang/Object;

    :cond_1
    sget-object v1, Lpp/p;->L:Lbi/g;

    invoke-virtual {v1, v0, v2, p1}, Lbi/g;->i0(Lpp/p;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v0}, Lpp/b;->P(Lpp/b;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v1, Lpp/g;

    invoke-direct {v1, p1}, Lpp/g;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lpp/p;->L:Lbi/g;

    invoke-virtual {p1, v0, v2, v1}, Lbi/g;->i0(Lpp/p;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v0}, Lpp/b;->P(Lpp/b;)V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public r(Lc93/a;)V
    .locals 2

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Lig3/a;

    new-instance v1, Lpg/c;

    invoke-direct {v1, p1}, Lpg/c;-><init>(Lc93/a;)V

    invoke-interface {v0, v1}, Lig3/a;->g(Lpg/c;)Lig3/a;

    return-void
.end method

.method public s()Lr93/v;
    .locals 0

    return-object p0
.end method

.method public t(Lr93/q0;)Lr93/v;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lla/b;->w:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Lja3/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lja3/q;->J:Lkb3/i;

    sget-object v2, Lja3/q;->N:[Lj93/z;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-static {v1, v2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{fragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Lml/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{fragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Lml/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0x7 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public u()Lr93/v;
    .locals 0

    return-object p0
.end method

.method public v(Ls93/i;)Lr93/v;
    .locals 1

    const-string v0, "additionalAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public w(Lr93/r;)Lr93/v;
    .locals 1

    const-string v0, "visibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public x()V
    .locals 0

    return-void
.end method

.method public y(Lmm/d;)V
    .locals 1

    iget-object v0, p0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmm/d;->a(Landroid/view/Display;)V

    return-void
.end method

.method public z()Lr93/v;
    .locals 0

    return-object p0
.end method
