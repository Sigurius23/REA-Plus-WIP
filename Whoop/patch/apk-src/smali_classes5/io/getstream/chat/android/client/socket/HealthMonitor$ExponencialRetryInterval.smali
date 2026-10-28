.class public final Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/socket/HealthMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ExponencialRetryInterval"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;",
        "Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;",
        "<init>",
        "()V",
        "nextInterval",
        "",
        "consecutiveFailures",
        "",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;->INSTANCE:Lio/getstream/chat/android/client/socket/HealthMonitor$ExponencialRetryInterval;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final nextInterval(I)J
    .locals 5

    mul-int/lit16 v0, p1, 0x7d0

    add-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x61a8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 p1, p1, -0x1

    mul-int/lit16 p1, p1, 0x7d0

    const/16 v2, 0xfa

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    sub-int/2addr v0, p1

    int-to-double v3, v0

    mul-double/2addr v1, v3

    int-to-double v3, p1

    add-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    return-wide v0
.end method
