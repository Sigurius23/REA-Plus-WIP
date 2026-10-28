.class public final Lio/getstream/chat/android/client/audio/AudioHashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "audioHash",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "getAudioHash$annotations",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "getAudioHash",
        "(Lio/getstream/chat/android/models/Attachment;)I",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getAudioHash(Lio/getstream/chat/android/models/Attachment;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->hashCode()I

    move-result p0

    return p0
.end method

.method public static synthetic getAudioHash$annotations(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method
