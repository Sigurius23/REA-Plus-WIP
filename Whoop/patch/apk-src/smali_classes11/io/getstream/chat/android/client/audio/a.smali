.class public final synthetic Lio/getstream/chat/android/client/audio/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

.field public final synthetic x:I

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/a;->w:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iput p2, p0, Lio/getstream/chat/android/client/audio/a;->x:I

    iput-boolean p3, p0, Lio/getstream/chat/android/client/audio/a;->y:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/client/audio/a;->x:I

    iget-boolean v1, p0, Lio/getstream/chat/android/client/audio/a;->y:Z

    iget-object v2, p0, Lio/getstream/chat/android/client/audio/a;->w:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->d(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;IZ)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
