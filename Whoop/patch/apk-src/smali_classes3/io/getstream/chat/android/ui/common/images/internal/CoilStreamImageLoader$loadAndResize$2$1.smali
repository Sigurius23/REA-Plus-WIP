.class final Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Landroid/graphics/drawable/Drawable;",
        "<anonymous>",
        "(Lbc3/c0;)Landroid/graphics/drawable/Drawable;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2$1"
    f = "CoilStreamImageLoader.kt"
    l = {
        0x93
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $calledContext:Lq83/j;

.field final synthetic $context:Landroid/content/Context;

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

.field final synthetic $transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/j;Lc93/a;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lq83/j;",
            "Lc93/a;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$data:Ljava/lang/Object;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    iput-object p5, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$calledContext:Lq83/j;

    iput-object p6, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$onStart:Lc93/a;

    iput-object p7, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$onComplete:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$data:Ljava/lang/Object;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$calledContext:Lq83/j;

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$onStart:Lc93/a;

    iget-object v7, p0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$onComplete:Lc93/a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/j;Lc93/a;Lc93/a;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->L$0:Ljava/lang/Object;

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
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->L$0:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->label:I

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v2, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$context:Landroid/content/Context;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader$stream_chat_android_ui_common_release(Landroid/content/Context;)Lrh/n;

    move-result-object v16

    sget-object v2, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    new-instance v5, Lfi/e;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$context:Landroid/content/Context;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v5, v6}, Lfi/e;-><init>(Landroid/content/Context;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    sget-object v7, Lfi/k;->a:Lf93/a;

    if-eqz v6, :cond_2

    invoke-static {v6}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v6

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    new-instance v7, Leg/j;

    const/16 v8, 0xa

    invoke-direct {v7, v6, v8}, Leg/j;-><init>(Ljava/lang/Object;I)V

    iput-object v7, v5, Lfi/e;->h:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_3

    invoke-static {v6}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v6

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    new-instance v7, Leg/j;

    invoke-direct {v7, v6, v8}, Leg/j;-><init>(Ljava/lang/Object;I)V

    iput-object v7, v5, Lfi/e;->j:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$placeholderDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_4

    invoke-static {v6}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v6

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    new-instance v7, Leg/j;

    invoke-direct {v7, v6, v8}, Leg/j;-><init>(Ljava/lang/Object;I)V

    iput-object v7, v5, Lfi/e;->i:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$data:Ljava/lang/Object;

    iput-object v6, v5, Lfi/e;->c:Ljava/lang/Object;

    move v6, v4

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$calledContext:Lq83/j;

    move-object v7, v5

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$onStart:Lc93/a;

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$onComplete:Lc93/a;

    move-object v9, v2

    new-instance v2, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1$invokeSuspend$$inlined$listener$1;

    move v10, v6

    move-object v6, v3

    move-object v11, v7

    move-object v7, v4

    move-object v12, v9

    move-object v9, v3

    move v13, v10

    move-object v10, v4

    move-object v14, v11

    move-object v11, v8

    move-object/from16 v17, v12

    move-object v12, v3

    move/from16 v18, v13

    move-object v13, v4

    move-object/from16 v19, v14

    move-object v14, v8

    move-object/from16 v15, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v19

    invoke-direct/range {v2 .. v14}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1$invokeSuspend$$inlined$listener$1;-><init>(Lbc3/c0;Lq83/j;Lc93/a;Lbc3/c0;Lq83/j;Lc93/a;Lbc3/c0;Lq83/j;Lc93/a;Lbc3/c0;Lq83/j;Lc93/a;)V

    iput-object v2, v1, Lfi/e;->e:Lfi/h;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$transformation:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;

    invoke-static {v15, v1, v2}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->access$applyTransformation(Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;Lfi/e;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;)Lfi/e;

    move-result-object v1

    invoke-virtual {v1}, Lfi/e;->a()Lfi/i;

    move-result-object v1

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->label:I

    move-object/from16 v2, v16

    check-cast v2, Lrh/t;

    invoke-virtual {v2, v1, v0}, Lrh/t;->c(Lfi/i;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v17

    if-ne v1, v2, :cond_5

    return-object v2

    :cond_5
    :goto_3
    check-cast v1, Lfi/l;

    invoke-interface {v1}, Lfi/l;->e()Lrh/j;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader$loadAndResize$2$1;->$context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "getResources(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lrh/o;->b(Lrh/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    return-object v1

    :cond_6
    const/16 v20, 0x0

    return-object v20
.end method
