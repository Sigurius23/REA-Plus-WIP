.class public final Lat/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/n;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, La33/d;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/w;->a()Lcom/google/crypto/tink/internal/v;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->i(La33/d;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/crypto/tink/internal/q;)Lat/o;
    .locals 2

    iget-object p0, p0, Lcom/google/crypto/tink/internal/q;->a:Lcom/google/crypto/tink/internal/k0;

    invoke-static {p0}, Lcom/google/crypto/tink/internal/q;->V(Lcom/google/crypto/tink/internal/k0;)V

    invoke-static {}, Lvs/m3;->G()Lvs/k3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lvs/k3;->h(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v0, v1}, Lvs/k3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v1, Lvs/l3;

    invoke-virtual {v0, v1}, Lvs/k3;->g(Lvs/l3;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/m3;

    const-class v1, Lfs/n;

    invoke-static {v0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/n;

    new-instance v0, Lat/o;

    invoke-static {p0}, Lat/o;->c(Lcom/google/crypto/tink/internal/k0;)[B

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast p0, Lvs/h4;

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static b(Lws/k;)Lat/o;
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Lih0/d0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lat/o;

    iget-object v1, p0, Lws/k;->c:Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    iget-object v2, p0, Lws/k;->d:Lct/a;

    invoke-virtual {v2}, Lct/a;->b()[B

    iget-object p0, p0, Lws/k;->b:Lws/h;

    iget-object p0, p0, Lws/h;->a:Lws/g;

    sget-object v2, Lws/g;->d:Lws/g;

    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 p0, 0x1

    invoke-static {p0}, Lih0/d0;->a(I)Z

    move-result p0

    if-eqz p0, :cond_2

    array-length p0, v1

    const/16 v2, 0x20

    if-ne p0, v2, :cond_1

    invoke-static {v1}, Lct/a;->a([B)Lct/a;

    sget-object p0, Lcom/google/crypto/tink/internal/c;->a:[J

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Could not initialize Ed25519."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given public key\'s length is not 32."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lcom/google/crypto/tink/internal/k0;)[B
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v0, Lvs/h4;

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-array p0, v3, [B

    return-object p0

    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0
.end method
