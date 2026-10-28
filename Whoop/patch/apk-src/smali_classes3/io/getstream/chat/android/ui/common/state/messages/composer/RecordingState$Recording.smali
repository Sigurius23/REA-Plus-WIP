.class public abstract Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;
.super Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Recording"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "<init>",
        "()V",
        "durationInMs",
        "",
        "getDurationInMs",
        "()I",
        "waveform",
        "",
        "",
        "getWaveform",
        "()Ljava/util/List;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getDurationInMs()I
.end method

.method public abstract getWaveform()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end method
