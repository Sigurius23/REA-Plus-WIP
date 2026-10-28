.class final Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;->buildIcon(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
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
        "Landroidx/core/graphics/drawable/IconCompat;",
        "<anonymous>",
        "(Lbc3/c0;)Landroidx/core/graphics/drawable/IconCompat;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.notifications.handler.DefaultUserIconBuilder$buildIcon$3$1"
    f = "UserIconBuilder.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $it:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->$it:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->$it:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->L$0:Ljava/lang/Object;

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
            "Landroidx/core/graphics/drawable/IconCompat;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->$it:Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;->this$0:Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v0}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Lw4/a;

    invoke-direct {v3, v0, v2}, Lw4/a;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-object v0, v3, Lw4/a;->e:Landroid/graphics/BitmapShader;

    iget-object v2, v3, Lw4/a;->d:Landroid/graphics/Paint;

    const/4 v4, 0x1

    iput-boolean v4, v3, Lw4/a;->k:Z

    iput-boolean v4, v3, Lw4/a;->j:Z

    iget v4, v3, Lw4/a;->m:I

    iget v5, v3, Lw4/a;->l:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    iput v4, v3, Lw4/a;->g:F

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    invoke-static {v3}, Ls4/d;->j(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {p1, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    move-object v1, p1

    :goto_2
    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
