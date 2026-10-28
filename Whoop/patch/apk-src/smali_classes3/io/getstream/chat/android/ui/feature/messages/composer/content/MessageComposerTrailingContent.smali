.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001R$\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007R*\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "getSendMessageButtonClickListener",
        "()Lc93/a;",
        "setSendMessageButtonClickListener",
        "(Lc93/a;)V",
        "sendMessageButtonClickListener",
        "Lkotlin/Function1;",
        "Landroid/view/MotionEvent;",
        "",
        "getRecordAudioButtonTouchListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setRecordAudioButtonTouchListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "recordAudioButtonTouchListener",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic access$findViewByKey$jd(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract getRecordAudioButtonTouchListener()Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end method

.method public abstract getSendMessageButtonClickListener()Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation
.end method

.method public abstract setRecordAudioButtonTouchListener(Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setSendMessageButtonClickListener(Lc93/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation
.end method
