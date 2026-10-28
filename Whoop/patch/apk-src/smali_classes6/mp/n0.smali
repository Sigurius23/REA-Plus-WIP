.class public Lmp/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lmp/l0;


# instance fields
.field public final a:Lmp/k0;

.field public final b:Ljava/lang/Character;

.field public volatile c:Lmp/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmp/m0;

    const-string v1, "base64()"

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-direct {v0, v1, v2}, Lmp/m0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lmp/m0;

    const-string v1, "base64Url()"

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    invoke-direct {v0, v1, v2}, Lmp/m0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lmp/n0;

    const-string v1, "base32()"

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    invoke-direct {v0, v1, v2}, Lmp/n0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lmp/n0;

    const-string v1, "base32Hex()"

    const-string v2, "0123456789ABCDEFGHIJKLMNOPQRSTUV"

    invoke-direct {v0, v1, v2}, Lmp/n0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lmp/l0;

    new-instance v1, Lmp/k0;

    const-string v2, "base16()"

    const-string v3, "0123456789ABCDEF"

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lmp/k0;-><init>(Ljava/lang/String;[C)V

    invoke-direct {v0, v1}, Lmp/l0;-><init>(Lmp/k0;)V

    sput-object v0, Lmp/n0;->d:Lmp/l0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x3d

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    .line 7
    new-instance v1, Lmp/k0;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lmp/k0;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v1, v0}, Lmp/n0;-><init>(Lmp/k0;Ljava/lang/Character;)V

    return-void
.end method

.method public constructor <init>(Lmp/k0;Ljava/lang/Character;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmp/n0;->a:Lmp/k0;

    if-eqz p2, :cond_1

    .line 3
    iget-object p1, p1, Lmp/k0;->g:[B

    .line 4
    array-length v0, p1

    const/16 v1, 0x3d

    if-le v0, v1, :cond_1

    aget-byte p1, p1, v1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "Padding character %s was already in alphabet"

    .line 6
    invoke-static {v0, p2}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p2, p0, Lmp/n0;->b:Ljava/lang/Character;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/StringBuilder;[BI)V
    .locals 4

    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v1, p3, v0}, Lmp/b;->m(III)V

    :goto_0
    if-ge v1, p3, :cond_0

    iget-object v0, p0, Lmp/n0;->a:Lmp/k0;

    iget v2, v0, Lmp/k0;->f:I

    sub-int v3, p3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p0, p1, p2, v1, v2}, Lmp/n0;->b(Ljava/lang/StringBuilder;[BII)V

    iget v0, v0, Lmp/k0;->f:I

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/StringBuilder;[BII)V
    .locals 9

    add-int v0, p3, p4

    array-length v1, p2

    invoke-static {p3, v0, v1}, Lmp/b;->m(III)V

    iget-object v0, p0, Lmp/n0;->a:Lmp/k0;

    iget v1, v0, Lmp/k0;->f:I

    iget v2, v0, Lmp/k0;->d:I

    if-gt p4, v1, :cond_3

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    move v5, v1

    :goto_0
    const/16 v6, 0x8

    if-ge v5, p4, :cond_0

    add-int v7, p3, v5

    aget-byte v7, p2, v7

    and-int/lit16 v7, v7, 0xff

    int-to-long v7, v7

    or-long/2addr v3, v7

    shl-long/2addr v3, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p4, 0x1

    mul-int/2addr p2, v6

    :goto_1
    mul-int/lit8 p3, p4, 0x8

    if-ge v1, p3, :cond_1

    sub-int p3, p2, v2

    sub-int/2addr p3, v1

    ushr-long v7, v3, p3

    long-to-int p3, v7

    iget v5, v0, Lmp/k0;->c:I

    and-int/2addr p3, v5

    iget-object v5, v0, Lmp/k0;->b:[C

    aget-char p3, v5, p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lmp/n0;->b:Ljava/lang/Character;

    if-eqz p2, :cond_2

    :goto_2
    iget p2, v0, Lmp/k0;->f:I

    mul-int/2addr p2, v6

    if-ge v1, p2, :cond_2

    const/16 p2, 0x3d

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/2addr v1, v2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final c(I[B)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    array-length v1, p2

    invoke-static {v0, p1, v1}, Lmp/b;->m(III)V

    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lmp/n0;->a:Lmp/k0;

    iget v2, v1, Lmp/k0;->f:I

    sget-object v3, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p1, v2}, Lmp/b;->a(II)I

    move-result v2

    iget v1, v1, Lmp/k0;->e:I

    mul-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :try_start_0
    invoke-virtual {p0, v0, p2, p1}, Lmp/n0;->a(Ljava/lang/StringBuilder;[BI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lmp/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lmp/n0;

    iget-object v0, p0, Lmp/n0;->a:Lmp/k0;

    iget-object v2, p1, Lmp/n0;->a:Lmp/k0;

    invoke-virtual {v0, v2}, Lmp/k0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmp/n0;->b:Ljava/lang/Character;

    iget-object p1, p1, Lmp/n0;->b:Ljava/lang/Character;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lmp/n0;->a:Lmp/k0;

    invoke-virtual {v0}, Lmp/k0;->hashCode()I

    move-result v0

    iget-object v1, p0, Lmp/n0;->b:Ljava/lang/Character;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseEncoding."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lmp/n0;->a:Lmp/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x8

    iget v1, v1, Lmp/k0;->d:I

    rem-int/2addr v2, v1

    if-eqz v2, :cond_1

    iget-object v1, p0, Lmp/n0;->b:Ljava/lang/Character;

    if-nez v1, :cond_0

    const-string v1, ".omitPadding()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v2, ".withPadChar(\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
