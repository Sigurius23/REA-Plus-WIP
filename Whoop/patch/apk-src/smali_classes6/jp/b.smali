.class public abstract Ljp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/c;

.field public static final b:[Lcom/google/android/gms/common/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/c;

    const-string v1, "CLIENT_TELEMETRY"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v0, Ljp/b;->a:Lcom/google/android/gms/common/c;

    filled-new-array {v0}, [Lcom/google/android/gms/common/c;

    move-result-object v0

    sput-object v0, Ljp/b;->b:[Lcom/google/android/gms/common/c;

    return-void
.end method
