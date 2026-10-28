.class public final Lgp/j0;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/j0;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:[B


# instance fields
.field public final w:[[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lgp/j0;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "WebAuthn PRF\u0000"

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lgp/j0;->x:[B

    return-void
.end method

.method public constructor <init>([[B)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, Luo/w;->a(Z)V

    array-length v2, p1

    and-int/2addr v2, v1

    xor-int/2addr v2, v1

    if-eq v1, v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-static {v2}, Luo/w;->a(Z)V

    move v2, v0

    :goto_2
    array-length v3, p1

    if-ge v2, v3, :cond_7

    if-eqz v2, :cond_2

    aget-object v3, p1, v2

    if-eqz v3, :cond_3

    :cond_2
    move v3, v1

    goto :goto_3

    :cond_3
    move v3, v0

    :goto_3
    invoke-static {v3}, Luo/w;->a(Z)V

    add-int/lit8 v3, v2, 0x1

    aget-object v4, p1, v3

    if-eqz v4, :cond_4

    move v4, v1

    goto :goto_4

    :cond_4
    move v4, v0

    :goto_4
    invoke-static {v4}, Luo/w;->a(Z)V

    aget-object v3, p1, v3

    array-length v3, v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_5

    const/16 v4, 0x40

    if-ne v3, v4, :cond_6

    :cond_5
    move v3, v1

    goto :goto_5

    :cond_6
    move v3, v0

    :goto_5
    invoke-static {v3}, Luo/w;->a(Z)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_2

    :cond_7
    iput-object p1, p0, Lgp/j0;->w:[[B

    return-void
.end method

.method public static b(Lorg/json/JSONObject;Z)Lgp/j0;
    .locals 4

    const-string v0, "evalByCredential"

    const-string v1, "eval"

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lgp/j0;->i(Lorg/json/JSONObject;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lgp/j0;->k(Lorg/json/JSONObject;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lzo/b;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lgp/j0;->i(Lorg/json/JSONObject;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lgp/j0;->k(Lorg/json/JSONObject;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    new-instance p0, Lgp/j0;

    const/4 p1, 0x0

    new-array p1, p1, [[B

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[B

    invoke-direct {p0, p1}, Lgp/j0;-><init>([[B)V

    return-object p0

    :catch_0
    new-instance p0, Lorg/json/JSONException;

    const-string p1, "invalid base64url value"

    invoke-direct {p0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f([B)Lorg/json/JSONObject;
    .locals 5

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    array-length v1, p0

    const-string v2, "first"

    const/16 v3, 0xb

    const/16 v4, 0x20

    if-ne v1, v4, :cond_0

    invoke-static {p0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-static {p0, v1, v4, v3}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0, v4, v4, v3}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    move-result-object p0

    const-string v1, "second"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public static h([B)[B
    .locals 6

    sget v0, Lmp/i0;->a:I

    sget-object v0, Lmp/h0;->a:Lmp/j0;

    iget v1, v0, Lmp/j0;->F:I

    iget-object v2, v0, Lmp/j0;->E:Ljava/security/MessageDigest;

    iget-boolean v0, v0, Lmp/j0;->G:Z

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Ld/s;

    invoke-virtual {v2}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/MessageDigest;

    invoke-direct {v0, v3, v1}, Ld/s;-><init>(Ljava/security/MessageDigest;I)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    new-instance v0, Ld/s;

    invoke-virtual {v2}, Ljava/security/MessageDigest;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    :try_start_1
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-direct {v0, v2, v1}, Ld/s;-><init>(Ljava/security/MessageDigest;I)V

    :goto_0
    iget-object v1, v0, Ld/s;->c:Ljava/lang/Object;

    check-cast v1, Ljava/security/MessageDigest;

    sget-object v2, Lgp/j0;->x:[B

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v3, v2

    iget-boolean v4, v0, Ld/s;->b:Z

    const-string v5, "Cannot re-use a Hasher after calling hash() on it"

    if-nez v4, :cond_4

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, p0

    iget-boolean v3, v0, Ld/s;->b:Z

    if-nez v3, :cond_3

    invoke-virtual {v1, p0, v4, v2}, Ljava/security/MessageDigest;->update([BII)V

    iget-boolean p0, v0, Ld/s;->b:Z

    if-nez p0, :cond_2

    const/4 p0, 0x1

    iput-boolean p0, v0, Ld/s;->b:Z

    iget p0, v0, Ld/s;->a:I

    invoke-virtual {v1}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v0

    if-ne p0, v0, :cond_1

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    sget-object v0, Lmp/g0;->w:[C

    new-instance v0, Lmp/f0;

    invoke-direct {v0, p0}, Lmp/f0;-><init>([B)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    sget-object v0, Lmp/g0;->w:[C

    new-instance v0, Lmp/f0;

    invoke-direct {v0, p0}, Lmp/f0;-><init>([B)V

    :goto_1
    iget-object p0, v0, Lmp/f0;->x:[B

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    move-exception p0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static i(Lorg/json/JSONObject;)[B
    .locals 5

    const-string v0, "first"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzo/b;->a(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    const-string v2, "hashed PRF value with wrong length"

    const/16 v3, 0x20

    if-ne v1, v3, :cond_2

    const-string v1, "second"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzo/b;->a(Ljava/lang/String;)[B

    move-result-object p0

    array-length v1, p0

    if-ne v1, v3, :cond_1

    filled-new-array {v0, p0}, [[B

    move-result-object p0

    invoke-static {p0}, Lmp/b;->j([[B)[B

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lorg/json/JSONException;

    invoke-direct {p0, v2}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lorg/json/JSONException;

    invoke-direct {p0, v2}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static k(Lorg/json/JSONObject;)[B
    .locals 3

    const-string v0, "first"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzo/b;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lgp/j0;->h([B)[B

    move-result-object v0

    const-string v1, "second"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzo/b;->a(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0}, Lgp/j0;->h([B)[B

    move-result-object p0

    filled-new-array {v0, p0}, [[B

    move-result-object p0

    invoke-static {p0}, Lmp/b;->j([[B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lgp/j0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lgp/j0;

    iget-object v0, p0, Lgp/j0;->w:[[B

    iget-object p1, p1, Lgp/j0;->w:[[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lgp/j0;->w:[[B

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    if-eqz v4, :cond_0

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    const-string v0, "}"

    iget-object v1, p0, Lgp/j0;->w:[[B

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    array-length v5, v1

    if-ge v3, v5, :cond_2

    aget-object v5, v1, v3

    if-nez v5, :cond_0

    const-string v5, "eval"

    add-int/lit8 v6, v3, 0x1

    aget-object v6, v1, v6

    invoke-static {v6}, Lgp/j0;->f([B)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_0
    if-nez v4, :cond_1

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "evalByCredential"

    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    aget-object v5, v1, v3

    invoke-static {v5}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    aget-object v6, v1, v6

    invoke-static {v6}, Lgp/j0;->f([B)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_1
    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PrfExtension{"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PrfExtension{Exception:"

    invoke-static {v2, v1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget-object v0, p0, Lgp/j0;->w:[[B

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-static {p1, v1}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v1

    array-length v2, v0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeByteArray([B)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lvo/c;->t(Landroid/os/Parcel;I)V

    :goto_1
    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
