.class public final Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;
.super Lio/getstream/android/video/generated/models/OwnCapability;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/OwnCapability;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StopRecordCall"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;",
        "Lio/getstream/android/video/generated/models/OwnCapability;",
        "()V",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;

    invoke-direct {v0}, Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;-><init>()V

    sput-object v0, Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$StopRecordCall;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "stop-record-call"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lio/getstream/android/video/generated/models/OwnCapability;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
