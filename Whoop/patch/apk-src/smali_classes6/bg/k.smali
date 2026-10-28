.class public final Lbg/k;
.super Landroidx/room/c1;
.source "SourceFile"


# static fields
.field public static final e:Lbg/k;

.field public static final f:Lbg/k;

.field public static final g:[B


# instance fields
.field public final a:[B

.field public final b:Ljava/lang/String;

.field public final c:Ll83/p;

.field public final d:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbg/k;

    const/16 v1, 0x10

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2}, Lbg/k;-><init>(Ljava/lang/String;[B)V

    sput-object v0, Lbg/k;->e:Lbg/k;

    new-instance v0, Lbg/k;

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-direct {v0, v3, v1}, Lbg/k;-><init>(Ljava/lang/String;[B)V

    sput-object v0, Lbg/k;->f:Lbg/k;

    const/16 v0, 0xc

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lbg/k;->g:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        -0x1t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lbg/k;->a:[B

    .line 3
    iput-object p1, p0, Lbg/k;->b:Ljava/lang/String;

    .line 4
    array-length p1, p2

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    .line 5
    new-instance p1, Lbg/j;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbg/k;->c:Ll83/p;

    .line 6
    new-instance p1, La1/j;

    const/16 p2, 0x9

    invoke-direct {p1, p0, p2}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbg/k;->d:Ll83/p;

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Invalid IPv6 repr: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; expected 16 bytes"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(SSSSSSSSLjava/lang/String;)V
    .locals 19

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    const v8, 0xffff

    and-int v9, v0, v8

    const/16 v10, 0x8

    ushr-int/2addr v9, v10

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    and-int v11, v1, v8

    ushr-int/2addr v11, v10

    and-int/lit16 v11, v11, 0xff

    int-to-byte v11, v11

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    and-int v12, v2, v8

    ushr-int/2addr v12, v10

    and-int/lit16 v12, v12, 0xff

    int-to-byte v12, v12

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    and-int v13, v3, v8

    ushr-int/2addr v13, v10

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    and-int v14, v4, v8

    ushr-int/2addr v14, v10

    and-int/lit16 v14, v14, 0xff

    int-to-byte v14, v14

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    and-int v15, v5, v8

    ushr-int/2addr v15, v10

    and-int/lit16 v15, v15, 0xff

    int-to-byte v15, v15

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    and-int v16, v6, v8

    move/from16 v17, v8

    ushr-int/lit8 v8, v16, 0x8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    and-int v16, v7, v17

    move/from16 v17, v10

    ushr-int/lit8 v10, v16, 0x8

    and-int/lit16 v10, v10, 0xff

    int-to-byte v10, v10

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    move/from16 v16, v0

    const/16 v0, 0x10

    .line 8
    new-array v0, v0, [B

    const/16 v18, 0x0

    aput-byte v9, v0, v18

    const/4 v9, 0x1

    aput-byte v16, v0, v9

    const/4 v9, 0x2

    aput-byte v11, v0, v9

    const/4 v9, 0x3

    aput-byte v1, v0, v9

    const/4 v1, 0x4

    aput-byte v12, v0, v1

    const/4 v1, 0x5

    aput-byte v2, v0, v1

    const/4 v1, 0x6

    aput-byte v13, v0, v1

    const/4 v1, 0x7

    aput-byte v3, v0, v1

    aput-byte v14, v0, v17

    const/16 v1, 0x9

    aput-byte v4, v0, v1

    const/16 v1, 0xa

    aput-byte v15, v0, v1

    const/16 v1, 0xb

    aput-byte v5, v0, v1

    const/16 v1, 0xc

    aput-byte v8, v0, v1

    const/16 v1, 0xd

    aput-byte v6, v0, v1

    const/16 v1, 0xe

    aput-byte v10, v0, v1

    const/16 v1, 0xf

    aput-byte v7, v0, v1

    move-object/from16 v1, p0

    move-object/from16 v2, p9

    .line 9
    invoke-direct {v1, v2, v0}, Lbg/k;-><init>(Ljava/lang/String;[B)V

    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 1

    sget-object v0, Lbg/k;->e:Lbg/k;

    invoke-virtual {p0, v0}, Lbg/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final U(Ljava/lang/StringBuilder;Li93/j;)V
    .locals 7

    new-instance v5, La1/b;

    const/16 v0, 0x14

    invoke-direct {v5, p0, v0}, La1/b;-><init>(Ljava/lang/Object;I)V

    const/16 v6, 0x3c

    const-string v2, ":"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lbg/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lbg/k;

    iget-object v2, p0, Lbg/k;->a:[B

    iget-object p1, p1, Lbg/k;->a:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lbg/k;->a:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbg/k;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final y()[B
    .locals 1

    iget-object v0, p0, Lbg/k;->a:[B

    return-object v0
.end method
