.class public final synthetic Lio/getstream/chat/android/client/internal/file/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/file/b;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/file/b;->b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/file/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/file/b;->b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->c(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/file/b;->b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->d(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
