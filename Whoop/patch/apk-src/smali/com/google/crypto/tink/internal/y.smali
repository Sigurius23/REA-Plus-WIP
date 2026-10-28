.class public final Lcom/google/crypto/tink/internal/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/crypto/tink/internal/y;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/internal/y;

    invoke-direct {v0}, Lcom/google/crypto/tink/internal/y;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/crypto/tink/internal/f;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    new-instance v2, Lcom/google/crypto/tink/internal/i0;

    invoke-direct {v2, v1}, Lcom/google/crypto/tink/internal/i0;-><init>(Lcom/google/crypto/tink/internal/f;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/i0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/i0;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfs/l;

    invoke-interface {p1}, Lfs/l;->a()Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No input primitive class for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " available"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lts/o;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/crypto/tink/internal/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lcom/google/crypto/tink/internal/h0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object p2, v0, Lcom/google/crypto/tink/internal/i0;->a:Ljava/util/HashMap;

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/crypto/tink/internal/f0;

    iget-object p2, p2, Lcom/google/crypto/tink/internal/f0;->c:Lcom/google/crypto/tink/internal/g0;

    invoke-interface {p2, p1}, Lcom/google/crypto/tink/internal/g0;->h(Lts/o;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "No PrimitiveConstructor for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " available"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized c(Lcom/google/crypto/tink/internal/f0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/i0;

    new-instance v1, Lcom/google/crypto/tink/internal/f;

    invoke-direct {v1, v0}, Lcom/google/crypto/tink/internal/f;-><init>(Lcom/google/crypto/tink/internal/i0;)V

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/f;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance p1, Lcom/google/crypto/tink/internal/i0;

    invoke-direct {p1, v1}, Lcom/google/crypto/tink/internal/i0;-><init>(Lcom/google/crypto/tink/internal/f;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d(Lfs/l;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/i0;

    new-instance v1, Lcom/google/crypto/tink/internal/f;

    invoke-direct {v1, v0}, Lcom/google/crypto/tink/internal/f;-><init>(Lcom/google/crypto/tink/internal/i0;)V

    iget-object v0, v1, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Lfs/l;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/l;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"

    invoke-static {v2, v0}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    new-instance p1, Lcom/google/crypto/tink/internal/i0;

    invoke-direct {p1, v1}, Lcom/google/crypto/tink/internal/i0;-><init>(Lcom/google/crypto/tink/internal/f;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
