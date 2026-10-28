.class public final Lzh1/d$a$b;
.super Ltp/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh1/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "zh1/d$a$b",
        "Ltp/g;",
        "Lcom/google/android/gms/location/LocationResult;",
        "result",
        "Ll83/a0;",
        "onLocationResult",
        "(Lcom/google/android/gms/location/LocationResult;)V",
        "gps-tracking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldc3/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzh1/d$a$b;->a:Ldc3/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->b()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lzh1/e;->a(Landroid/location/Location;)Lfv1/b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lzh1/d$a$b;->a:Ldc3/u;

    check-cast v0, Ldc3/t;

    iget-object v0, v0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
