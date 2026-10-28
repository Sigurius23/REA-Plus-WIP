.class public abstract Lro/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lab/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lab/h0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GoogleSignInCommon"

    invoke-direct {v0, v2, v1}, Lab/h0;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lro/h;->a:Lab/h0;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lro/i;->G(Landroid/content/Context;)Lro/i;

    move-result-object p0

    invoke-virtual {p0}, Lro/i;->H()V

    sget-object p0, Lcom/google/android/gms/common/api/k;->a:Ljava/util/Set;

    monitor-enter p0

    :try_start_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lto/f;->a()V

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/common/api/k;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
