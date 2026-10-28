.class public final Lls/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/c;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lls/f;->a:I

    .line 1
    sget-object v0, Lcom/google/crypto/tink/internal/a;->h:Lu00/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lls/f;->b:Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, La33/d;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    sget-object v1, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    .line 5
    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/w;->a()Lcom/google/crypto/tink/internal/v;

    move-result-object v1

    .line 6
    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->i(La33/d;)V

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lls/f;->c:Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Lls/f;->d:Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_0
    iput-object v0, p0, Lls/f;->c:Ljava/lang/Object;

    .line 10
    iput-object v0, p0, Lls/f;->d:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lfs/c;Lvs/h4;[B)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lls/f;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lls/f;->b:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Lls/f;->c:Ljava/lang/Object;

    .line 14
    iput-object p3, p0, Lls/f;->d:Ljava/lang/Object;

    return-void
.end method

.method public static c(Lcom/google/crypto/tink/internal/q;)Lls/f;
    .locals 6

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

    const-class v1, Lfs/c;

    invoke-static {v0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/c;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v2, v4, :cond_2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_1

    const/4 v4, 0x4

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "unknown output prefix type "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lvs/h4;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-array p0, v5, [B

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    :goto_1
    new-instance v2, Lls/f;

    invoke-direct {v2, v0, v1, p0}, Lls/f;-><init>(Lfs/c;Lvs/h4;[B)V

    return-object v2
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 3

    iget v0, p0, Lls/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lls/f;->b:Ljava/lang/Object;

    check-cast v0, Lfs/c;

    iget-object v1, p0, Lls/f;->c:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    sget-object v2, Lvs/h4;->E:Lvs/h4;

    if-ne v1, v2, :cond_0

    invoke-interface {v0, p1, p2}, Lfs/c;->a([B[B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lls/f;->d:Ljava/lang/Object;

    check-cast v1, [B

    invoke-interface {v0, p1, p2}, Lfs/c;->a([B[B)[B

    move-result-object p1

    filled-new-array {v1, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lls/f;->c:Ljava/lang/Object;

    check-cast v0, Lu00/e;

    iget-object v1, p0, Lls/f;->b:Ljava/lang/Object;

    check-cast v1, La33/d;

    :try_start_0
    iget-object v2, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Lcom/google/crypto/tink/internal/j0;

    iget-object v2, v2, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v2, Lfs/c;

    invoke-interface {v2, p1, p2}, Lfs/c;->a([B[B)[B

    move-result-object p2

    iget-object v1, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/j0;

    iget v1, v1, Lcom/google/crypto/tink/internal/j0;->d:I

    array-length p1, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b([B[B)[B
    .locals 4

    iget v0, p0, Lls/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lls/f;->b:Ljava/lang/Object;

    check-cast v0, Lfs/c;

    iget-object v1, p0, Lls/f;->c:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    sget-object v2, Lvs/h4;->E:Lvs/h4;

    if-ne v1, v2, :cond_0

    invoke-interface {v0, p1, p2}, Lfs/c;->b([B[B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lls/f;->d:Ljava/lang/Object;

    check-cast v1, [B

    invoke-static {v1, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x5

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lfs/c;->b([B[B)[B

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "wrong prefix"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lls/f;->b:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v1, p0, Lls/f;->d:Ljava/lang/Object;

    check-cast v1, Lu00/e;

    array-length v2, p1

    const/4 v3, 0x5

    if-le v2, v3, :cond_2

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-virtual {v0, v2}, La33/d;->v([B)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/internal/j0;

    :try_start_0
    iget-object v3, v3, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v3, Lfs/c;

    invoke-interface {v3, p1, p2}, Lfs/c;->b([B[B)[B

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    sget-object v2, Lfs/b;->a:[B

    invoke-virtual {v0, v2}, La33/d;->v([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/internal/j0;

    :try_start_1
    iget-object v2, v2, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v2, Lfs/c;

    invoke-interface {v2, p1, p2}, Lfs/c;->b([B[B)[B

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    return-object v3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
