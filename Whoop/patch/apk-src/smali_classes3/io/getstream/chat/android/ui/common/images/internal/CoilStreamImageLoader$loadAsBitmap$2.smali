.class final Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->loadAsBitmap(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Landroid/graphics/Bitmap;",
        "<anonymous>",
        "(Lbc3/c0;)Landroid/graphics/Bitmap;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAsBitmap$2"
    f = "CoilStreamImageLoader.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

.field final synthetic $url:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$url:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$context:Landroid/content/Context;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

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

    new-instance p1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$url:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$context:Landroid/content/Context;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;-><init>(Ljava/lang/String;Landroid/content/Context;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)V

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
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->L$0:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$url:Ljava/lang/String;

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$context:Landroid/content/Context;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$url:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    sget-object v5, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;

    invoke-virtual {v5, p1}, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader$stream_chat_android_ui_common_release(Landroid/content/Context;)Lrh/n;

    move-result-object v5

    sget-object v6, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    new-instance v7, Lfi/e;

    invoke-direct {v7, p1}, Lfi/e;-><init>(Landroid/content/Context;)V

    iput-object v1, v7, Lfi/e;->c:Ljava/lang/Object;

    invoke-static {v6, v7, v4}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->access$applyTransformation(Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;Lfi/e;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;)Lfi/e;

    move-result-object v1

    invoke-virtual {v1}, Lfi/e;->a()Lfi/i;

    move-result-object v1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->L$1:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAsBitmap$2;->label:I

    check-cast v5, Lrh/t;

    invoke-virtual {v5, v1, p0}, Lrh/t;->c(Lfi/i;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    move-object p1, v1

    :goto_1
    check-cast p1, Lfi/l;

    invoke-interface {p1}, Lfi/l;->e()Lrh/j;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "getResources(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lrh/o;->b(Lrh/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v3

    :goto_2
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_5

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_3

    :cond_5
    move-object p1, v3

    :goto_3
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v3
.end method
