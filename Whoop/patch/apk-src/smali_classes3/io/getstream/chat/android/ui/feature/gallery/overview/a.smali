.class public final synthetic Lio/getstream/chat/android/ui/feature/gallery/overview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->d(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->c(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->f(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->b(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/a;->x:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->e(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
