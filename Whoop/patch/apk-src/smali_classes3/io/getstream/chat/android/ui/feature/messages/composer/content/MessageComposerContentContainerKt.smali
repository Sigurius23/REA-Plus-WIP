.class public final Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "findRecordAudioButton",
        "Landroid/view/View;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;",
        "stream-chat-android-ui-components_release"
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
.method public static final findRecordAudioButton(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;)Landroid/view/View;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "record_audio_button"

    invoke-interface {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method
