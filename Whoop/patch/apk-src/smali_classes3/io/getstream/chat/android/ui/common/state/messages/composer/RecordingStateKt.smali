.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "copy",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;",
        "duration",
        "",
        "waveform",
        "",
        "",
        "stream-chat-android-ui-common_release"
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
.method public static final copy(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;ILjava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waveform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    if-eqz v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;->getOffset()Ll83/k;

    move-result-object p0

    invoke-direct {v0, p1, p2, p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;-><init>(ILjava/util/List;Ll83/k;)V

    return-object v0

    :cond_0
    instance-of p0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    if-eqz p0, :cond_1

    new-instance p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;-><init>(ILjava/util/List;)V

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;ILjava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;->getDurationInMs()I

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;->getWaveform()Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingStateKt;->copy(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;ILjava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    move-result-object p0

    return-object p0
.end method
