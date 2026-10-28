.class public final Lcom/google/crypto/tink/internal/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/crypto/tink/internal/z;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    :try_start_0
    new-instance v0, Lcom/google/crypto/tink/internal/z;

    invoke-direct {v0}, Lcom/google/crypto/tink/internal/z;-><init>()V

    new-instance v1, Lb23/h;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    const-class v2, Lcom/google/crypto/tink/internal/q;

    new-instance v3, Lcom/google/crypto/tink/internal/m;

    invoke-direct {v3, v2, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sput-object v0, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lzt/q;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lzt/q;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {v2, v1}, Lcom/google/crypto/tink/internal/q0;-><init>(Lzt/q;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/crypto/tink/internal/o0;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v2, Lct/a;

    const-class v3, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v1, v3, v2}, Lcom/google/crypto/tink/internal/o0;-><init>(Ljava/lang/Class;Lct/a;)V

    iget-object v0, v0, Lcom/google/crypto/tink/internal/q0;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/k;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/k;->b:Lcom/google/crypto/tink/internal/l;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/internal/l;->e(Lcom/google/crypto/tink/internal/k0;)Lts/o;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No Key Parser for requested key type "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " available"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/crypto/tink/internal/o0;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Lct/a;

    const-class v3, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v1, v3, v2}, Lcom/google/crypto/tink/internal/o0;-><init>(Ljava/lang/Class;Lct/a;)V

    iget-object v0, v0, Lcom/google/crypto/tink/internal/q0;->d:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/b0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/b0;->b:Lcom/google/crypto/tink/internal/c0;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/internal/c0;->g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No Parameters Parser for requested key type "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " available"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized c(Lcom/google/crypto/tink/internal/k;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lzt/q;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {v0, v1}, Lzt/q;-><init>(Lcom/google/crypto/tink/internal/q0;)V

    invoke-virtual {v0, p1}, Lzt/q;->B(Lcom/google/crypto/tink/internal/k;)V

    new-instance p1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/q0;-><init>(Lzt/q;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public final declared-synchronized d(Lcom/google/crypto/tink/internal/m;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lzt/q;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {v0, v1}, Lzt/q;-><init>(Lcom/google/crypto/tink/internal/q0;)V

    invoke-virtual {v0, p1}, Lzt/q;->C(Lcom/google/crypto/tink/internal/m;)V

    new-instance p1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/q0;-><init>(Lzt/q;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public final declared-synchronized e(Lcom/google/crypto/tink/internal/b0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lzt/q;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {v0, v1}, Lzt/q;-><init>(Lcom/google/crypto/tink/internal/q0;)V

    invoke-virtual {v0, p1}, Lzt/q;->D(Lcom/google/crypto/tink/internal/b0;)V

    new-instance p1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/q0;-><init>(Lzt/q;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public final declared-synchronized f(Lcom/google/crypto/tink/internal/d0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lzt/q;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {v0, v1}, Lzt/q;-><init>(Lcom/google/crypto/tink/internal/q0;)V

    invoke-virtual {v0, p1}, Lzt/q;->E(Lcom/google/crypto/tink/internal/d0;)V

    new-instance p1, Lcom/google/crypto/tink/internal/q0;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/q0;-><init>(Lzt/q;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public final g(Lts/o;)Lcom/google/crypto/tink/internal/n0;
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/crypto/tink/internal/p0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/p0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v0, v0, Lcom/google/crypto/tink/internal/q0;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/m;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/m;->b:Lcom/google/crypto/tink/internal/n;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/internal/n;->d(Lts/o;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No Key serializer for "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " available"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lfs/k;)Lcom/google/crypto/tink/internal/n0;
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/z;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/crypto/tink/internal/p0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/p0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v0, v0, Lcom/google/crypto/tink/internal/q0;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/d0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/d0;->b:Lcom/google/crypto/tink/internal/e0;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/internal/e0;->c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No Key Format serializer for "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " available"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
