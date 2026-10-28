.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->C(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->H(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->y(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->B(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/Map;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
