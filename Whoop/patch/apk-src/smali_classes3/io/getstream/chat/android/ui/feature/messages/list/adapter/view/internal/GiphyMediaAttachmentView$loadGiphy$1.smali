.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->loadGiphy(Ljava/lang/String;)V
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
    c = "io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.GiphyMediaAttachmentView$loadGiphy$1"
    f = "GiphyMediaAttachmentView.kt"
    l = {
        0xad
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $url:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->$url:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->invokeSuspend$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;)Ll83/a0;

    return-void
.end method

.method public static synthetic h(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;

    move-result-object p0

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->loadImage:Landroid/widget/FrameLayout;

    const-string v0, "loadImage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;

    move-result-object p0

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->loadImage:Landroid/widget/FrameLayout;

    const-string v0, "loadImage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->$url:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;

    move-result-object p1

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->imageView:Lcom/google/android/material/imageview/ShapeableImageView;

    const-string p1, "imageView"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->$url:Ljava/lang/String;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->getPlaceholderIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    new-instance v7, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/m;

    const/4 v1, 0x0

    invoke-direct {v7, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/m;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;I)V

    new-instance v8, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/m;

    const/4 v1, 0x1

    invoke-direct {v8, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/m;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;I)V

    iput v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView$loadGiphy$1;->label:I

    const/4 v6, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v3 .. v11}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->loadAndResize$default(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
