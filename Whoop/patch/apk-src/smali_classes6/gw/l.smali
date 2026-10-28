.class public final Lgw/l;
.super Lgw/g;
.source "SourceFile"


# instance fields
.field public E:Lxw/b;

.field public F:Lxw/b;

.field public G:I

.field public x:Lgw/k;

.field public y:Lxw/b;

.field public z:Lxw/b;


# direct methods
.method public constructor <init>(Lgw/k;Lgw/r;)V
    .locals 0

    invoke-direct {p0}, Lgw/g;-><init>()V

    iput-object p1, p0, Lgw/l;->x:Lgw/k;

    iput-object p2, p0, Lgw/g;->w:Lgw/r;

    const/4 p1, 0x0

    iput-object p1, p0, Lgw/l;->y:Lxw/b;

    iput-object p1, p0, Lgw/l;->E:Lxw/b;

    const/4 p1, 0x1

    iput p1, p0, Lgw/l;->G:I

    return-void
.end method


# virtual methods
.method public final declared-synchronized b(Lgw/j;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lgw/l;->G:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-virtual {p0, p1}, Lgw/l;->c(Lgw/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lgw/l;->x:Lgw/k;

    iget-object v1, p0, Lgw/g;->w:Lgw/r;

    iget-object v2, v1, Lgw/r;->x:[B

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lgw/r;->y:Lxw/b;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lxw/a;->a()[B

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    iget-object v1, p0, Lgw/l;->x:Lgw/k;

    invoke-virtual {v1}, Lgw/c;->a()Lxw/b;

    move-result-object v1

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-interface {p1, v0, v2, v1}, Lgw/j;->a(Lgw/k;[B[B)Lb30/m;

    move-result-object p1
    :try_end_1
    .catch Lcom/nimbusds/jose/JOSEException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lgw/k;

    if-eqz v0, :cond_3

    iput-object v0, p0, Lgw/l;->x:Lgw/k;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    :goto_1
    iget-object v0, p1, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Lxw/b;

    iput-object v0, p0, Lgw/l;->y:Lxw/b;

    iget-object v0, p1, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, Lxw/b;

    iput-object v0, p0, Lgw/l;->z:Lxw/b;

    iget-object v0, p1, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Lxw/b;

    iput-object v0, p0, Lgw/l;->E:Lxw/b;

    iget-object p1, p1, Lb30/m;->F:Ljava/lang/Object;

    check-cast p1, Lxw/b;

    iput-object p1, p0, Lgw/l;->F:Lxw/b;

    const/4 p1, 0x2

    iput p1, p0, Lgw/l;->G:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_3
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The JWE object must be in an unencrypted state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_4
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final c(Lgw/j;)V
    .locals 3

    check-cast p1, Ljw/a;

    iget-object v0, p1, Ljw/a;->a:Ljava/util/Set;

    iget-object v1, p0, Lgw/l;->x:Lgw/k;

    iget-object v1, v1, Lgw/c;->w:Lgw/a;

    check-cast v1, Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "The "

    if-eqz v1, :cond_1

    iget-object p1, p1, Ljw/a;->b:Ljava/util/Set;

    iget-object v0, p0, Lgw/l;->x:Lgw/k;

    iget-object v0, v0, Lgw/k;->O:Lgw/f;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lgw/l;->x:Lgw/k;

    iget-object v2, v2, Lgw/k;->O:Lgw/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " encryption method or key size is not supported by the JWE encrypter: Supported methods: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lgw/l;->x:Lgw/k;

    iget-object v2, v2, Lgw/c;->w:Lgw/a;

    check-cast v2, Lgw/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " algorithm is not supported by the JWE encrypter: Supported algorithms: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lgw/l;->G:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The JWE object must be in an encrypted or decrypted state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgw/l;->x:Lgw/k;

    invoke-virtual {v1}, Lgw/c;->a()Lxw/b;

    move-result-object v1

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgw/l;->y:Lxw/b;

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgw/l;->z:Lxw/b;

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgw/l;->E:Lxw/b;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgw/l;->F:Lxw/b;

    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
