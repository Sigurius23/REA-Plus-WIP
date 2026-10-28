.class public final Lcom/google/android/gms/common/api/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/android/gms/common/api/g;


# instance fields
.field public final a:Ljc/b;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljc/b;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/common/api/g;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/common/api/g;-><init>(Ljc/b;Landroid/os/Looper;)V

    sput-object v2, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    return-void
.end method

.method public constructor <init>(Ljc/b;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/g;->a:Ljc/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/g;->b:Landroid/os/Looper;

    return-void
.end method
