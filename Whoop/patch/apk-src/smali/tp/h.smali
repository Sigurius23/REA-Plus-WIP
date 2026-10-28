.class public abstract Ltp/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/f;

.field public static final b:Lcom/google/android/gms/common/c;

.field public static final c:Lcom/google/android/gms/common/c;

.field public static final d:Lcom/google/android/gms/common/c;

.field public static final e:[Lcom/google/android/gms/common/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ltp/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "LocationServices.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    new-instance v0, Lcom/google/android/gms/common/c;

    const-string v1, "name_ulr_private"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v1, Lcom/google/android/gms/common/c;

    const-string v4, "name_sleep_segment_request"

    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v1, Ltp/h;->b:Lcom/google/android/gms/common/c;

    new-instance v4, Lcom/google/android/gms/common/c;

    const-string v5, "support_context_feature_id"

    invoke-direct {v4, v5, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v4, Ltp/h;->c:Lcom/google/android/gms/common/c;

    new-instance v5, Lcom/google/android/gms/common/c;

    const-string v6, "get_current_location"

    invoke-direct {v5, v6, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v5, Ltp/h;->d:Lcom/google/android/gms/common/c;

    new-instance v6, Lcom/google/android/gms/common/c;

    const-string v7, "get_last_activity_feature_id"

    invoke-direct {v6, v7, v2, v3}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    filled-new-array {v0, v1, v4, v5, v6}, [Lcom/google/android/gms/common/c;

    move-result-object v0

    sput-object v0, Ltp/h;->e:[Lcom/google/android/gms/common/c;

    return-void
.end method
