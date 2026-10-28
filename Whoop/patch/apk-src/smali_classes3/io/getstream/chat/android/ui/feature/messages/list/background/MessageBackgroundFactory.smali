.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
        "",
        "plainTextMessageBackground",
        "Landroid/graphics/drawable/Drawable;",
        "context",
        "Landroid/content/Context;",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "deletedMessageBackground",
        "textAndAttachmentMessageBackground",
        "fileAttachmentsMessageBackground",
        "linkAttachmentMessageBackground",
        "giphyAppearanceModel",
        "imageAttachmentMessageBackground",
        "pollMessageBackground",
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


# virtual methods
.method public abstract deletedMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract fileAttachmentsMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract giphyAppearanceModel(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract imageAttachmentMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract linkAttachmentMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract plainTextMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract pollMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract textAndAttachmentMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
.end method
