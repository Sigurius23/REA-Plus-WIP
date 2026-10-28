.class public final Lio/getstream/chat/android/models/AttachmentType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/AttachmentType;",
        "",
        "<init>",
        "()V",
        "IMAGE",
        "",
        "GIPHY",
        "VIDEO",
        "AUDIO",
        "FILE",
        "AUDIO_RECORDING",
        "UNKNOWN",
        "stream-chat-android-core"
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
.field public static final AUDIO:Ljava/lang/String; = "audio"

.field public static final AUDIO_RECORDING:Ljava/lang/String; = "voiceRecording"

.field public static final FILE:Ljava/lang/String; = "file"

.field public static final GIPHY:Ljava/lang/String; = "giphy"

.field public static final IMAGE:Ljava/lang/String; = "image"

.field public static final INSTANCE:Lio/getstream/chat/android/models/AttachmentType;

.field public static final UNKNOWN:Ljava/lang/String; = "unknown"

.field public static final VIDEO:Ljava/lang/String; = "video"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/AttachmentType;

    invoke-direct {v0}, Lio/getstream/chat/android/models/AttachmentType;-><init>()V

    sput-object v0, Lio/getstream/chat/android/models/AttachmentType;->INSTANCE:Lio/getstream/chat/android/models/AttachmentType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
