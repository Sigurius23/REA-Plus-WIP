.class public final Lcom/google/android/gms/common/internal/zzaf;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:Lcom/google/android/gms/common/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iget v0, p1, Lcom/google/android/gms/common/a;->x:I

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/common/a;->y:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "ResolvableConnectionException can only be created with a connection result containing a resolution."

    invoke-static {v0, v1}, Luo/w;->b(ZLjava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/zzaf;->w:Lcom/google/android/gms/common/a;

    return-void
.end method
