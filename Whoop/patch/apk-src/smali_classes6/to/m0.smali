.class public final Lto/m0;
.super Lto/d0;
.source "SourceFile"


# instance fields
.field public final b:Lto/q;

.field public final c:Lcq/i;

.field public final d:Lto/o;


# direct methods
.method public constructor <init>(ILto/q;Lcq/i;Lto/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lto/n0;-><init>(I)V

    iput-object p3, p0, Lto/m0;->c:Lcq/i;

    iput-object p2, p0, Lto/m0;->b:Lto/q;

    iput-object p4, p0, Lto/m0;->d:Lto/o;

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    iget-boolean p1, p2, Lto/q;->b:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lto/m0;->d:Lto/o;

    check-cast v0, Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ls3/d;->g(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    move-result-object p1

    iget-object v0, p0, Lto/m0;->c:Lcq/i;

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lto/m0;->c:Lcq/i;

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Lpg3/o;Z)V
    .locals 2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object v0, p1, Lpg3/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lto/m0;->c:Lcq/i;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, v1, Lcq/i;->a:Lcq/u;

    new-instance v0, Lso/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lso/q;->w:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, v0, Lso/q;->x:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lcq/u;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final d(Lto/v;)V
    .locals 2

    iget-object v0, p0, Lto/m0;->c:Lcq/i;

    :try_start_0
    iget-object v1, p0, Lto/m0;->b:Lto/q;

    iget-object p1, p1, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    invoke-virtual {v1, p1, v0}, Lto/q;->b(Lcom/google/android/gms/common/api/d;Lcq/i;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void

    :goto_1
    invoke-static {p1}, Lto/n0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lto/m0;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :goto_2
    throw p1
.end method

.method public final f(Lto/v;)[Lcom/google/android/gms/common/c;
    .locals 0

    iget-object p1, p0, Lto/m0;->b:Lto/q;

    iget-object p1, p1, Lto/q;->a:[Lcom/google/android/gms/common/c;

    return-object p1
.end method

.method public final g(Lto/v;)Z
    .locals 0

    iget-object p1, p0, Lto/m0;->b:Lto/q;

    iget-boolean p1, p1, Lto/q;->b:Z

    return p1
.end method
