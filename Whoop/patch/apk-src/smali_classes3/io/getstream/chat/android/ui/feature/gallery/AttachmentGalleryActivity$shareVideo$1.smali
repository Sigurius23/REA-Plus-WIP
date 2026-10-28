.class final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareVideo(Lio/getstream/chat/android/models/Attachment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$shareVideo$1"
    f = "AttachmentGalleryActivity.kt"
    l = {
        0xe9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachment:Lio/getstream/chat/android/models/Attachment;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v3, "getApplicationContext(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iput v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->label:I

    const/16 v7, 0xc

    move-object v6, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->writeAttachmentToShareableFile$default(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ln23/h;

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_3

    iget-object v7, v6, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Landroid/net/Uri;

    iget-object p1, v6, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lio/getstream/chat/android/ui/common/utils/ContextUtilsKt;->shareLocalFile$default(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_4

    iget-object p1, v6, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->access$toastFailedShare(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    :goto_1
    iget-object p1, v6, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareVideo$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->access$setNoSharingInProgressUi(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
