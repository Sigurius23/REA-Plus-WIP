.class public final Lto/l0;
.super Lto/d0;
.source "SourceFile"


# instance fields
.field public final b:Lcq/i;

.field public final synthetic c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILcq/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lto/n0;-><init>(I)V

    .line 2
    iput-object p2, p0, Lto/l0;->b:Lcq/i;

    return-void
.end method

.method public constructor <init>(Lto/f0;Lcq/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lto/l0;->c:I

    const/4 v0, 0x3

    .line 4
    invoke-direct {p0, v0, p2}, Lto/l0;-><init>(ILcq/i;)V

    iput-object p1, p0, Lto/l0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lto/j;Lcq/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lto/l0;->c:I

    const/4 v0, 0x4

    .line 3
    invoke-direct {p0, v0, p2}, Lto/l0;-><init>(ILcq/i;)V

    iput-object p1, p0, Lto/l0;->d:Ljava/lang/Object;

    return-void
.end method

.method private final bridge synthetic h(Lpg3/o;Z)V
    .locals 0

    return-void
.end method

.method private final bridge synthetic i(Lpg3/o;Z)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    iget-object p1, p0, Lto/l0;->b:Lcq/i;

    invoke-virtual {p1, v0}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lto/l0;->b:Lcq/i;

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final bridge synthetic c(Lpg3/o;Z)V
    .locals 0

    iget p1, p0, Lto/l0;->c:I

    return-void
.end method

.method public final d(Lto/v;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, Lto/l0;->j(Lto/v;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lto/l0;->b:Lcq/i;

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Lto/n0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lto/l0;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    invoke-static {p1}, Lto/n0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Lto/l0;->a(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public final f(Lto/v;)[Lcom/google/android/gms/common/c;
    .locals 1

    iget v0, p0, Lto/l0;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lto/v;->k:Ljava/util/HashMap;

    iget-object v0, p0, Lto/l0;->d:Ljava/lang/Object;

    check-cast v0, Lto/j;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lto/f0;

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lto/v;)Z
    .locals 1

    iget v0, p0, Lto/l0;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lto/v;->k:Ljava/util/HashMap;

    iget-object v0, p0, Lto/l0;->d:Ljava/lang/Object;

    check-cast v0, Lto/j;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lto/f0;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lto/v;)V
    .locals 4

    iget v0, p0, Lto/l0;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lto/v;->k:Ljava/util/HashMap;

    iget-object v1, p0, Lto/l0;->d:Ljava/lang/Object;

    check-cast v1, Lto/j;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/f0;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    iget-object v1, p0, Lto/l0;->b:Lcq/i;

    iget-object v2, v0, Lto/f0;->b:Lto/r;

    check-cast v2, Lto/h0;

    iget-object v2, v2, Lto/h0;->b:Llo/r;

    iget-object v2, v2, Llo/r;->z:Ljava/lang/Object;

    check-cast v2, Ltp/r;

    invoke-virtual {v2, p1, v1}, Ltp/r;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v0, Lto/f0;->a:Lto/l;

    iget-object p1, p1, Lto/l;->a:Lto/k;

    const/4 v0, 0x0

    iput-object v0, p1, Lto/k;->b:Lto/j;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lto/l0;->b:Lcq/i;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcq/i;->d(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lto/l0;->d:Ljava/lang/Object;

    check-cast v0, Lto/f0;

    iget-object v1, v0, Lto/f0;->a:Lto/l;

    iget-object v2, p1, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    iget-object v3, p0, Lto/l0;->b:Lcq/i;

    invoke-virtual {v1, v2, v3}, Lto/l;->b(Lcom/google/android/gms/common/api/d;Lcq/i;)V

    iget-object v1, v1, Lto/l;->a:Lto/k;

    iget-object v1, v1, Lto/k;->b:Lto/j;

    if-eqz v1, :cond_1

    iget-object p1, p1, Lto/v;->k:Ljava/util/HashMap;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
