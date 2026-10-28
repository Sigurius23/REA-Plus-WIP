.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u000c\u001a\u00020\u00052\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH&\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;",
        "",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "attachments",
        "Ll83/a0;",
        "onSelectedAttachmentsChanged",
        "(Ljava/util/List;)V",
        "onSelectedAttachmentsSubmitted",
        "()V",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "onPollSubmitted",
        "(Lio/getstream/chat/android/models/CreatePollParams;)V",
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
.method public abstract onPollSubmitted(Lio/getstream/chat/android/models/CreatePollParams;)V
.end method

.method public abstract onSelectedAttachmentsChanged(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onSelectedAttachmentsSubmitted()V
.end method
