.class public final Lns/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/e;


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

.method public static a(Lcom/google/crypto/tink/internal/q;)Lns/s;
    .locals 4

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

    const-class v1, Lfs/e;

    invoke-static {v0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/e;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v0, Lvs/h4;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown output prefix type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    :cond_3
    :goto_1
    new-instance p0, Lns/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method public static b(Lns/p;)Lns/s;
    .locals 4

    iget-object v0, p0, Lns/p;->b:Lns/m;

    new-instance v1, Lns/s;

    iget-object v2, p0, Lns/p;->c:Lct/a;

    iget-object v3, v0, Lns/m;->a:Lns/k;

    invoke-static {v3}, Lns/s;->e(Lns/k;)V

    iget-object v3, v0, Lns/m;->b:Lns/j;

    invoke-static {v3}, Lns/s;->d(Lns/j;)V

    iget-object v0, v0, Lns/m;->c:Lns/i;

    invoke-static {v0}, Lns/s;->c(Lns/i;)V

    iget-object p0, p0, Lns/p;->d:Lct/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2}, Lct/a;->b()[B

    invoke-virtual {p0}, Lct/a;->b()[B

    return-object v1
.end method

.method public static c(Lns/i;)V
    .locals 1

    sget-object v0, Lns/i;->z:Lns/i;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lns/i;->E:Lns/i;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    sget-object v0, Lns/i;->F:Lns/i;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-void

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE AEAD identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lns/j;)V
    .locals 1

    sget-object v0, Lns/j;->z:Lns/j;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lns/j;->E:Lns/j;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    sget-object v0, Lns/j;->F:Lns/j;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-void

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE KDF identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lns/k;)V
    .locals 1

    sget-object v0, Lns/k;->G:Lns/k;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lns/k;->z:Lns/k;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lat/p;->w:Lat/p;

    invoke-static {p0}, Lng3/n;->k(Lat/p;)Lng3/n;

    return-void

    :cond_1
    sget-object v0, Lns/k;->E:Lns/k;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lat/p;->x:Lat/p;

    invoke-static {p0}, Lng3/n;->k(Lat/p;)Lng3/n;

    return-void

    :cond_2
    sget-object v0, Lns/k;->F:Lns/k;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lat/p;->y:Lat/p;

    invoke-static {p0}, Lng3/n;->k(Lat/p;)Lng3/n;

    return-void

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
