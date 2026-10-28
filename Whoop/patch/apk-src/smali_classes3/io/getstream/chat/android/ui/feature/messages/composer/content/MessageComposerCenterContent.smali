.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001R*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R*\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u0006\"\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "getTextInputChangeListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setTextInputChangeListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "textInputChangeListener",
        "Lio/getstream/chat/android/models/Attachment;",
        "getAttachmentRemovalListener",
        "setAttachmentRemovalListener",
        "attachmentRemovalListener",
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
.method public static synthetic access$findViewByKey$jd(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract getAttachmentRemovalListener()Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end method

.method public abstract getTextInputChangeListener()Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end method

.method public abstract setAttachmentRemovalListener(Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setTextInputChangeListener(Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method
