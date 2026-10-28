.class public abstract Ld/x0;
.super Ld/b1;
.source "SourceFile"

# interfaces
.implements Ld/a1;


# static fields
.field public static final b:Ld/d;

.field public static final c:[B


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld/d;

    const-class v1, Ld/x0;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ld/d;-><init>(ILjava/lang/Class;)V

    sput-object v0, Ld/x0;->b:Ld/d;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Ld/x0;->c:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Ld/x0;->a:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'string\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Ld/q;)Ld/x0;
    .locals 2

    if-eqz p0, :cond_2

    instance-of v0, p0, Ld/x0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    instance-of v1, v0, Ld/x0;

    if-eqz v1, :cond_1

    check-cast v0, Ld/x0;

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "illegal object in getInstance: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    check-cast p0, Ld/x0;

    return-object p0
.end method


# virtual methods
.method public final b()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final c()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Ld/x0;->a:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/x0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/x0;

    iget-object v0, p0, Ld/x0;->a:[B

    iget-object p1, p1, Ld/x0;->a:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ld/x0;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method

.method public j()Ld/b1;
    .locals 2

    new-instance v0, Ld/l;

    iget-object v1, p0, Ld/x0;->a:[B

    invoke-direct {v0, v1}, Ld/x0;-><init>([B)V

    return-object v0
.end method

.method public k()Ld/b1;
    .locals 2

    new-instance v0, Ld/l;

    iget-object v1, p0, Ld/x0;->a:[B

    invoke-direct {v0, v1}, Ld/x0;-><init>([B)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    sget-object v0, Lxg/b;->a:Lty/c;

    iget-object v0, p0, Ld/x0;->a:[B

    array-length v1, v0

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    sget-object v3, Lxg/b;->a:Lty/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    const/16 v4, 0x48

    new-array v4, v4, [B

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-lez v1, :cond_2

    const/16 v7, 0x24

    invoke-static {v7, v1}, Ljava/lang/Math;->min(II)I

    move-result v7

    add-int v8, v6, v7

    move v9, v5

    :goto_1
    if-ge v6, v8, :cond_1

    add-int/lit8 v10, v6, 0x1

    aget-byte v6, v0, v6

    and-int/lit16 v11, v6, 0xff

    add-int/lit8 v12, v9, 0x1

    iget-object v13, v3, Lty/c;->x:Ljava/lang/Object;

    check-cast v13, [B

    ushr-int/lit8 v11, v11, 0x4

    aget-byte v11, v13, v11

    aput-byte v11, v4, v9

    add-int/lit8 v9, v9, 0x2

    and-int/lit8 v6, v6, 0xf

    aget-byte v6, v13, v6

    aput-byte v6, v4, v12

    move v6, v10

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-virtual {v2, v4, v5, v9}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v1, v7

    move v6, v8

    goto :goto_0

    :cond_2
    :goto_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lwg/c;->a([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :goto_3
    new-instance v1, Lc/d;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception encoding Hex string: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lc/d;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1
.end method
