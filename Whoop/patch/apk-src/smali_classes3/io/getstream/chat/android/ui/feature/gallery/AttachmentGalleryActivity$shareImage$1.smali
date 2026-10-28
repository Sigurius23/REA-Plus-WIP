.class final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->shareImage(Lio/getstream/chat/android/models/Attachment;)V
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
    c = "io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$shareImage$1"
    f = "AttachmentGalleryActivity.kt"
    l = {
        0xcd,
        0xd1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachment:Lio/getstream/chat/android/models/Attachment;

.field final synthetic $imageUrl:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->$imageUrl:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->$imageUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v4, p0

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->label:I

    const-string v8, "getApplicationContext(...)"

    const/4 v9, 0x2

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v9, :cond_0

    iget-object v0, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    iget-object v2, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v2

    iget-object v2, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->$imageUrl:Ljava/lang/String;

    iput v1, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->label:I

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->loadAsBitmap$default(Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    iget-object v1, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    new-instance v10, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->I$0:I

    iput v9, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->label:I

    invoke-virtual {v10, v1, v0, v4}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->writeBitmapToShareableFile(Landroid/content/Context;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    :goto_1
    return-object v7

    :cond_4
    :goto_2
    check-cast v0, Ln23/h;

    if-eqz v0, :cond_7

    iget-object v5, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    iget-object v1, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    instance-of v2, v0, Ln23/g;

    if-eqz v2, :cond_5

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroid/net/Uri;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lio/getstream/chat/android/ui/common/utils/ContextUtilsKt;->shareLocalFile$default(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    instance-of v0, v0, Ln23/f;

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    :goto_3
    iget-object v0, v4, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$shareImage$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;->access$setNoSharingInProgressUi(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
