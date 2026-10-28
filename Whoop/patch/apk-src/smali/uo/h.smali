.class public abstract Luo/h;
.super Luo/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/d;


# instance fields
.field public final y:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V
    .locals 11

    sget-object v1, Luo/h0;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Luo/h0;->h:Luo/h0;

    if-nez v0, :cond_0

    new-instance v0, Luo/h0;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Luo/h0;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    sput-object v0, Luo/h0;->h:Luo/h0;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v5, Luo/h0;->h:Luo/h0;

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v6

    invoke-static/range {p5 .. p5}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static/range {p6 .. p6}, Luo/w;->f(Ljava/lang/Object;)V

    new-instance v8, Luo/k;

    move-object/from16 v0, p5

    invoke-direct {v8, v0}, Luo/k;-><init>(Ljava/lang/Object;)V

    new-instance v9, Luo/k;

    move-object/from16 v0, p6

    invoke-direct {v9, v0}, Luo/k;-><init>(Ljava/lang/Object;)V

    iget-object v0, p4, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v7, p3

    invoke-direct/range {v2 .. v10}, Luo/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Luo/h0;Lcom/google/android/gms/common/GoogleApiAvailability;ILuo/k;Luo/k;Ljava/lang/String;)V

    iget-object p1, p4, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iput-object p1, p0, Luo/h;->y:Ljava/util/Set;

    return-void

    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
