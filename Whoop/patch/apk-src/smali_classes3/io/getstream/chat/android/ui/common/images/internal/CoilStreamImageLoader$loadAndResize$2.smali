.class final Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->loadAndResize(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
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
    c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2"
    f = "CoilStreamImageLoader.kt"
    l = {
        0x92
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $data:Ljava/lang/Object;

.field final synthetic $onComplete:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic $onStart:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic $placeholderDrawable:Landroid/graphics/drawable/Drawable;

.field final synthetic $target:Landroid/widget/ImageView;

.field final synthetic $transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lc93/a;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$target:Landroid/widget/ImageView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$data:Ljava/lang/Object;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    iput-object p5, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$onStart:Lc93/a;

    iput-object p6, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$onComplete:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$target:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$data:Ljava/lang/Object;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$onStart:Lc93/a;

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$onComplete:Lc93/a;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;-><init>(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$2:Ljava/lang/Object;

    check-cast v1, Lq83/j;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$1:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$target:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v10

    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    new-instance v5, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;

    iget-object v7, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v8, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$data:Ljava/lang/Object;

    iget-object v9, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    iget-object v11, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$onStart:Lc93/a;

    iget-object v12, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$onComplete:Lc93/a;

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v13}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/j;Lc93/a;Lc93/a;Lq83/d;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$1:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->L$2:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->label:I

    invoke-static {p1, v5, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, v10

    :goto_0
    check-cast p1, Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->$target:Landroid/widget/ImageView;

    new-instance v4, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$2$1;

    invoke-direct {v4, p1, v2, v3}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$2$1;-><init>(Landroid/graphics/drawable/Drawable;Landroid/widget/ImageView;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
