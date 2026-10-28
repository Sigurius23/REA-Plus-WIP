.class public final Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;
.super Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Quality480p"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;",
        "Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;",
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
.field public static final INSTANCE:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;

    invoke-direct {v0}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;-><init>()V

    sput-object v0, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;->INSTANCE:Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality$Quality480p;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "480p"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lio/getstream/android/video/generated/models/RTMPBroadcastRequest$Quality;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
