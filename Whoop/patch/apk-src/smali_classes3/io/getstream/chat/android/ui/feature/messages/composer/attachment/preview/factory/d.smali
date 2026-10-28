.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/client/audio/AudioPlayer;

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/audio/AudioPlayer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/d;->w:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/d;->x:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/d;->w:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/d;->x:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder;->c(Lio/getstream/chat/android/client/audio/AudioPlayer;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
