.class public final synthetic Lio/getstream/chat/android/client/internal/file/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/file/c;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/file/c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/file/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/file/c;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lmg1/b;->b(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/file/c;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->b(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
