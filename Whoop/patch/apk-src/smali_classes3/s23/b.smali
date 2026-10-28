.class public final synthetic Ls23/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaRecorder$OnInfoListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

.field public final synthetic b:Ls23/d;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/a;Ls23/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls23/b;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    iput-object p2, p0, Ls23/b;->b:Ls23/d;

    return-void
.end method


# virtual methods
.method public final onInfo(Landroid/media/MediaRecorder;II)V
    .locals 1

    iget-object p1, p0, Ls23/b;->b:Ls23/d;

    iget-object v0, p0, Ls23/b;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->f(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V

    return-void
.end method
