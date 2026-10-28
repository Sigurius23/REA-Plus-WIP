.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/client/audio/AudioPlayer;

.field public final synthetic x:Lio/getstream/chat/android/models/Attachment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/f;->w:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/f;->x:Lio/getstream/chat/android/models/Attachment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/f;->w:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/f;->x:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder;->d(Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
