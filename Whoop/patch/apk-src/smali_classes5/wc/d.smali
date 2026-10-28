.class public final Lwc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final c(Lsf/e;Lsf/m;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p1

    iget-object v1, v0, Lsf/e;->b:Lvf/a;

    invoke-interface {v1}, Lvf/a;->getUrl()Lcg/o;

    move-result-object v1

    iget-object v1, v1, Lcg/o;->h:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v3, v2, Lwc/d;->a:Ljava/lang/String;

    const-string v4, "-----BEGIN EC PRIVATE KEY-----"

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "-----END EC PRIVATE KEY-----"

    invoke-static {v3, v4, v5, v6}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\s"

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v7, "compile(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "replaceAll(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "\n"

    invoke-static {v3, v4, v5, v6}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\r"

    invoke-static {v3, v4, v5, v6}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ltg/a;->a:[I

    invoke-static {v3}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x4

    rem-int/2addr v4, v5

    const/16 v7, 0x3d

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    rsub-int/lit8 v4, v4, 0x4

    new-array v8, v4, [B

    move v9, v6

    :goto_0
    if-ge v9, v4, :cond_1

    aput-byte v7, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v3, v8}, Lm83/n;->F0([B[B)[B

    move-result-object v3

    :goto_1
    array-length v4, v3

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-nez v4, :cond_2

    move v4, v6

    goto :goto_3

    :cond_2
    array-length v4, v3

    and-int/lit8 v11, v4, 0x3

    if-nez v11, :cond_15

    if-lt v4, v9, :cond_3

    add-int/lit8 v11, v4, -0x1

    aget-byte v11, v3, v11

    if-ne v11, v7, :cond_3

    add-int/lit8 v11, v4, -0x2

    aget-byte v11, v3, v11

    if-ne v11, v7, :cond_3

    move v7, v9

    goto :goto_2

    :cond_3
    add-int/lit8 v11, v4, -0x1

    aget-byte v11, v3, v11

    if-ne v11, v7, :cond_4

    move v7, v10

    goto :goto_2

    :cond_4
    move v7, v6

    :goto_2
    mul-int/2addr v4, v8

    div-int/2addr v4, v5

    sub-int/2addr v4, v7

    :goto_3
    new-array v7, v4, [B

    array-length v11, v3

    div-int/2addr v11, v5

    sub-int/2addr v11, v10

    move v12, v6

    move v13, v12

    move v14, v13

    :goto_4
    const/4 v15, -0x1

    move/from16 p2, v8

    const/16 v8, 0xff

    if-ge v12, v11, :cond_6

    add-int/lit8 v16, v13, 0x1

    aget-byte v17, v3, v13

    invoke-static/range {v17 .. v17}, Ltg/a;->a(B)I

    move-result v17

    shl-int/lit8 v17, v17, 0x12

    add-int/lit8 v18, v13, 0x2

    aget-byte v16, v3, v16

    invoke-static/range {v16 .. v16}, Ltg/a;->a(B)I

    move-result v16

    shl-int/lit8 v16, v16, 0xc

    or-int v16, v17, v16

    add-int/lit8 v17, v13, 0x3

    aget-byte v18, v3, v18

    invoke-static/range {v18 .. v18}, Ltg/a;->a(B)I

    move-result v18

    shl-int/lit8 v18, v18, 0x6

    or-int v16, v16, v18

    add-int/lit8 v13, v13, 0x4

    aget-byte v17, v3, v17

    move/from16 v18, v9

    invoke-static/range {v17 .. v17}, Ltg/a;->a(B)I

    move-result v9

    and-int/2addr v9, v8

    or-int v9, v16, v9

    move/from16 v16, v10

    move/from16 v10, v18

    :goto_5
    if-ge v15, v10, :cond_5

    add-int/lit8 v17, v14, 0x1

    mul-int/lit8 v19, v10, 0x8

    shr-int v15, v9, v19

    and-int/2addr v15, v8

    int-to-byte v15, v15

    aput-byte v15, v7, v14

    add-int/lit8 v10, v10, -0x1

    move/from16 v14, v17

    const/4 v15, -0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v12, v12, 0x1

    move/from16 v8, p2

    move/from16 v10, v16

    move/from16 v9, v18

    goto :goto_4

    :cond_6
    move/from16 v18, v9

    move/from16 v16, v10

    mul-int/lit8 v11, v11, 0x3

    if-ltz v11, :cond_9

    add-int/lit8 v9, v13, 0x1

    aget-byte v10, v3, v13

    invoke-static {v10}, Ltg/a;->a(B)I

    move-result v10

    add-int/lit8 v11, v13, 0x2

    aget-byte v9, v3, v9

    invoke-static {v9}, Ltg/a;->a(B)I

    move-result v9

    add-int/lit8 v13, v13, 0x3

    aget-byte v11, v3, v11

    invoke-static {v11}, Ltg/a;->a(B)I

    move-result v11

    aget-byte v3, v3, v13

    invoke-static {v3}, Ltg/a;->a(B)I

    move-result v3

    if-eq v10, v8, :cond_8

    if-eq v9, v8, :cond_8

    add-int/lit8 v12, v14, 0x1

    shl-int/lit8 v10, v10, 0x2

    shr-int/lit8 v13, v9, 0x4

    and-int/lit8 v13, v13, 0x3

    or-int/2addr v10, v13

    int-to-byte v10, v10

    aput-byte v10, v7, v14

    if-eq v11, v8, :cond_7

    add-int/lit8 v14, v14, 0x2

    shl-int/2addr v9, v5

    and-int/lit16 v9, v9, 0xf0

    shr-int/lit8 v10, v11, 0x2

    and-int/lit8 v10, v10, 0xf

    or-int/2addr v9, v10

    int-to-byte v9, v9

    aput-byte v9, v7, v12

    move v12, v14

    :cond_7
    if-eq v3, v8, :cond_9

    and-int/lit8 v9, v11, 0x3

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v3, v9

    int-to-byte v3, v3

    aput-byte v3, v7, v12

    goto :goto_6

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "decode base64: invalid padding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_6
    const/4 v3, 0x7

    const/16 v9, 0x27

    invoke-static {v7, v3, v9}, Lm83/n;->k0([BII)[B

    move-result-object v3

    const/16 v9, 0x28

    :goto_7
    if-ge v9, v4, :cond_b

    aget-byte v10, v7, v9

    if-ne v10, v5, :cond_a

    add-int/lit8 v15, v9, 0x1

    goto :goto_8

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_b
    const/4 v15, -0x1

    :goto_8
    sub-int/2addr v4, v15

    div-int/lit8 v4, v4, 0x2

    add-int v9, v15, v4

    invoke-static {v7, v15, v9}, Lm83/n;->k0([BII)[B

    move-result-object v10

    invoke-static {v10}, Lrj/o;->z([B)[B

    move-result-object v10

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v15

    invoke-static {v7, v9, v4}, Lm83/n;->k0([BII)[B

    move-result-object v4

    invoke-static {v4}, Lrj/o;->z([B)[B

    move-result-object v4

    sget-object v7, Ly83/c;->f:Ly83/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Ly83/c;->h:Ly83/c;

    sget-object v9, Ly83/b;->z:Ly83/b;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v11, v7, Ly83/c;->d:Ly83/b;

    if-ne v11, v9, :cond_c

    goto :goto_9

    :cond_c
    new-instance v11, Ly83/c;

    iget-boolean v12, v7, Ly83/c;->a:Z

    iget-boolean v13, v7, Ly83/c;->b:Z

    iget v7, v7, Ly83/c;->c:I

    invoke-direct {v11, v12, v13, v7, v9}, Ly83/c;-><init>(ZZILy83/b;)V

    move-object v7, v11

    :goto_9
    new-instance v9, Le73/b;

    invoke-direct {v9, v6}, Le73/b;-><init>(Z)V

    invoke-virtual {v9}, Le73/b;->f()V

    const-string v11, "typ"

    invoke-virtual {v9, v11}, Le73/b;->q(Ljava/lang/String;)V

    const-string v11, "dpop+jwt"

    invoke-virtual {v9, v11}, Le73/b;->r(Ljava/lang/String;)V

    const-string v11, "alg"

    invoke-virtual {v9, v11}, Le73/b;->q(Ljava/lang/String;)V

    const-string v11, "ES256"

    invoke-virtual {v9, v11}, Le73/b;->r(Ljava/lang/String;)V

    const-string v11, "jwk"

    invoke-virtual {v9, v11}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v9}, Le73/b;->f()V

    const-string v11, "kty"

    invoke-virtual {v9, v11}, Le73/b;->q(Ljava/lang/String;)V

    const-string v11, "EC"

    invoke-virtual {v9, v11}, Le73/b;->r(Ljava/lang/String;)V

    const-string v11, "x"

    invoke-virtual {v9, v11}, Le73/b;->q(Ljava/lang/String;)V

    invoke-static {v7, v10}, Ly83/c;->b(Ly83/c;[B)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Le73/b;->r(Ljava/lang/String;)V

    const-string v10, "y"

    invoke-virtual {v9, v10}, Le73/b;->q(Ljava/lang/String;)V

    invoke-static {v7, v4}, Ly83/c;->b(Ly83/c;[B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Le73/b;->r(Ljava/lang/String;)V

    const-string v4, "crv"

    invoke-virtual {v9, v4}, Le73/b;->q(Ljava/lang/String;)V

    const-string v4, "P-256"

    invoke-virtual {v9, v4}, Le73/b;->r(Ljava/lang/String;)V

    invoke-virtual {v9}, Le73/b;->k()V

    invoke-virtual {v9}, Le73/b;->k()V

    invoke-virtual {v9}, Le73/b;->l()[B

    move-result-object v4

    new-instance v9, Le73/b;

    invoke-direct {v9, v6}, Le73/b;-><init>(Z)V

    invoke-virtual {v9}, Le73/b;->f()V

    const-string v10, "jti"

    invoke-virtual {v9, v10}, Le73/b;->q(Ljava/lang/String;)V

    sget-object v10, Lvg/t;->d:[C

    invoke-static {}, Lsb3/a;->q()Lvg/t;

    move-result-object v10

    iget-object v10, v10, Lvg/t;->c:Ljava/lang/String;

    invoke-virtual {v9, v10}, Le73/b;->r(Ljava/lang/String;)V

    const-string v10, "htm"

    invoke-virtual {v9, v10}, Le73/b;->q(Ljava/lang/String;)V

    const-string v10, "POST"

    invoke-virtual {v9, v10}, Le73/b;->r(Ljava/lang/String;)V

    const-string v10, "htu"

    invoke-virtual {v9, v10}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Le73/b;->r(Ljava/lang/String;)V

    const-string v1, "iat"

    invoke-virtual {v9, v1}, Le73/b;->q(Ljava/lang/String;)V

    sget-object v1, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v1

    iget-object v1, v1, Lug/b;->w:Ljava/time/Instant;

    invoke-virtual {v1}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Le73/b;->j(Ljava/lang/String;)V

    invoke-virtual {v9}, Le73/b;->k()V

    invoke-virtual {v9}, Le73/b;->l()[B

    move-result-object v1

    invoke-static {v7, v4}, Ly83/c;->b(Ly83/c;[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v1}, Ly83/c;->b(Ly83/c;[B)Ljava/lang/String;

    move-result-object v1

    const/16 v9, 0x2e

    invoke-static {v9, v4, v1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v3, v4}, Lse/g;->u([B[B)[B

    move-result-object v3

    aget-byte v4, v3, p2

    and-int/2addr v4, v8

    add-int v10, v5, v4

    invoke-static {v5, v10}, Le93/b;->i0(II)Li93/j;

    move-result-object v5

    invoke-static {v3, v5}, Lm83/n;->N0([BLi93/j;)[B

    move-result-object v5

    add-int/lit8 v10, v4, 0x5

    add-int/lit8 v4, v4, 0x6

    aget-byte v10, v3, v10

    and-int/2addr v8, v10

    add-int/2addr v8, v4

    invoke-static {v4, v8}, Le93/b;->i0(II)Li93/j;

    move-result-object v4

    invoke-static {v3, v4}, Lm83/n;->N0([BLi93/j;)[B

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v8, v5

    move v10, v6

    move v11, v10

    :goto_a
    if-ge v10, v8, :cond_f

    aget-byte v12, v5, v10

    if-eqz v11, :cond_d

    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_d
    if-nez v12, :cond_e

    goto :goto_b

    :cond_e
    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v11, v16

    :goto_b
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_f
    invoke-static {v4}, Lm83/s;->z1(Ljava/util/ArrayList;)[B

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    array-length v8, v3

    move v10, v6

    :goto_c
    if-ge v6, v8, :cond_12

    aget-byte v11, v3, v6

    if-eqz v10, :cond_10

    invoke-static {v11}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_10
    if-nez v11, :cond_11

    goto :goto_d

    :cond_11
    invoke-static {v11}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v10, v16

    :goto_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_c

    :cond_12
    invoke-static {v5}, Lm83/s;->z1(Ljava/util/ArrayList;)[B

    move-result-object v3

    array-length v5, v4

    const/16 v6, 0x20

    if-ge v5, v6, :cond_13

    array-length v5, v4

    rsub-int/lit8 v5, v5, 0x20

    new-array v5, v5, [B

    invoke-static {v5, v4}, Lm83/n;->F0([B[B)[B

    move-result-object v4

    :cond_13
    array-length v5, v3

    if-ge v5, v6, :cond_14

    array-length v5, v3

    sub-int/2addr v6, v5

    new-array v5, v6, [B

    invoke-static {v5, v3}, Lm83/n;->F0([B[B)[B

    move-result-object v3

    :cond_14
    invoke-static {v4, v3}, Lm83/n;->F0([B[B)[B

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v7, v3}, Ly83/c;->b(Ly83/c;[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lsf/e;->b:Lvf/a;

    invoke-static {v0}, Ls93/k;->i(Lvf/a;)Lvf/b;

    move-result-object v0

    const-string v3, "DPoP"

    invoke-static {v0, v3, v1}, Ls93/h;->q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lvf/b;->b()Lvf/h;

    move-result-object v0

    return-object v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid base64 string of length "

    const-string v3, "; not a multiple of 4"

    invoke-static {v4, v1, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
