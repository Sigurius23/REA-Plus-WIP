.class public final Ltp/r;
.super Ltp/v;
.source "SourceFile"


# instance fields
.field public final synthetic x:Lto/k;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Lto/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltp/r;->x:Lto/k;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltp/v;->w:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    iget-boolean v0, p0, Ltp/v;->w:Z

    if-eqz v0, :cond_0

    new-instance v0, Ltp/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Ltp/s;-><init>(ILcq/i;)V

    :try_start_0
    iget-object v1, p0, Ltp/r;->x:Lto/k;

    iget-object v1, v1, Lto/k;->b:Lto/j;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1, v0}, Lnp/i;->u(Lto/j;Ltp/s;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    :cond_0
    return-void
.end method
