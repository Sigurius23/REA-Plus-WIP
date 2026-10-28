.class public abstract Lfs/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lfs/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-class v1, Lfs/a;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/c;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/q;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/e;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/d;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/j;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lts/m;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/m;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-class v1, Lfs/n;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    return-void
.end method

.method public static a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lvs/m3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    sget-object v1, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/j;->a(Ljava/lang/String;)Lcom/google/crypto/tink/internal/p;

    move-result-object v0

    iget-object v1, v0, Lcom/google/crypto/tink/internal/p;->b:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, v0, Lcom/google/crypto/tink/internal/p;->a:Ljava/lang/String;

    iget-object v1, v0, Lcom/google/crypto/tink/internal/p;->c:Lvs/l3;

    sget-object v2, Lvs/h4;->E:Lvs/h4;

    const/4 v3, 0x0

    invoke-static {p1, p0, v1, v2, v3}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p0

    sget-object p1, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/internal/z;->a(Lcom/google/crypto/tink/internal/k0;)Lts/o;

    move-result-object p0

    sget-object p1, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/p;->b:Ljava/lang/Class;

    invoke-virtual {p1, p0, v0}, Lcom/google/crypto/tink/internal/y;->b(Lts/o;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Primitive type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " not supported by key manager of type "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", which only supports: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v0, Lcom/google/crypto/tink/internal/p;->b:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static declared-synchronized b(Lvs/p3;)Lvs/m3;
    .locals 5

    const-string v0, "newKey-operation not permitted for key type "

    const-class v1, Lfs/o;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    invoke-virtual {p0}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/j;->a(Ljava/lang/String;)Lcom/google/crypto/tink/internal/p;

    move-result-object v3

    invoke-virtual {p0}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v4

    iget-object v2, v2, Lcom/google/crypto/tink/internal/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/google/crypto/tink/internal/p;->b(Lcom/google/crypto/tink/shaded/protobuf/i;)Lvs/m3;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
