.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

.field public final synthetic x:Lio/getstream/chat/android/client/audio/AudioPlayer;

.field public final synthetic y:Lio/getstream/chat/android/models/Attachment;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->w:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->x:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->y:Lio/getstream/chat/android/models/Attachment;

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->z:I

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->E:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->z:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->E:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->w:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->x:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/g;->y:Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2, v3, v4, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->g(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/client/audio/AudioPlayer;Lio/getstream/chat/android/models/Attachment;ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
