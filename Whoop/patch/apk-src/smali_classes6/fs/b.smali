.class public abstract Lfs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lfs/b;->a:[B

    return-void
.end method

.method public static a(Ljava/lang/String;)Lfs/f;
    .locals 4

    sget-object v0, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    const-string v1, "Name "

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lcom/google/crypto/tink/internal/x;->a:Ljava/util/HashMap;

    invoke-virtual {v2, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v0, Lcom/google/crypto/tink/internal/x;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfs/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Lfs/f;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not exist"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static b([B)Lfs/k;
    .locals 5

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Lvs/p3;->I([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p3;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-static {p0}, Lcom/google/crypto/tink/internal/l0;->F(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p0

    iget-object v1, v0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/q0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcom/google/crypto/tink/internal/o0;

    iget-object v3, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v3, Lct/a;

    const-class v4, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v2, v4, v3}, Lcom/google/crypto/tink/internal/o0;-><init>(Ljava/lang/Class;Lct/a;)V

    iget-object v1, v1, Lcom/google/crypto/tink/internal/q0;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Lcom/google/crypto/tink/internal/r;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/internal/r;-><init>(Lcom/google/crypto/tink/internal/l0;)V

    return-object v0

    :cond_0
    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/internal/z;->b(Lcom/google/crypto/tink/internal/l0;)Lfs/k;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Failed to parse proto"

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static c(Lfs/k;)[B
    .locals 1

    instance-of v0, p0, Lcom/google/crypto/tink/internal/r;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/crypto/tink/internal/r;

    iget-object p0, p0, Lcom/google/crypto/tink/internal/r;->a:Lcom/google/crypto/tink/internal/l0;

    iget-object p0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p0, Lvs/p3;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/internal/z;->h(Lfs/k;)Lcom/google/crypto/tink/internal/n0;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/internal/l0;

    iget-object p0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p0, Lvs/p3;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object p0

    return-object p0
.end method
