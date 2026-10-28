.class public final Lio/getstream/chat/android/ui/utils/ImageUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001aQ\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0010\u001aR\u0010\u0011\u001a\u00020\u0008*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0087@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001aS\u0010\u0015\u001a\u00020\u000b*\u00020\u00002\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroid/widget/ImageView;",
        "",
        "data",
        "",
        "placeholderResId",
        "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
        "transformation",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onStart",
        "onComplete",
        "Lio/getstream/chat/android/ui/common/disposable/Disposable;",
        "load",
        "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;",
        "Landroid/graphics/drawable/Drawable;",
        "placeholderDrawable",
        "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;",
        "loadAndResize",
        "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "uri",
        "loadVideoThumbnail",
        "(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final load(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Object;",
            "Landroid/graphics/drawable/Drawable;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lc93/a;",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/common/disposable/Disposable;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    sget-object v1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    .line 6
    invoke-virtual/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->load(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static final load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lc93/a;",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/common/disposable/Disposable;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    .line 3
    invoke-virtual/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic load$default(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 5
    sget-object p3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 6
    new-instance p4, Lou1/a;

    const/4 p3, 0x7

    invoke-direct {p4, p3}, Lou1/a;-><init>(I)V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 7
    new-instance p5, Lou1/a;

    const/4 p3, 0x7

    invoke-direct {p5, p3}, Lou1/a;-><init>(I)V

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    .line 8
    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 1
    sget-object p3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 2
    new-instance p4, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p4, p2}, Lou1/a;-><init>(I)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 3
    new-instance p5, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p5, p2}, Lou1/a;-><init>(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    .line 4
    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method private static final load$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final load$lambda$1()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final load$lambda$2()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final load$lambda$3()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final loadAndResize(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Object;",
            "Landroid/graphics/drawable/Drawable;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lc93/a;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v1 .. v8}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->loadAndResize(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic loadAndResize$default(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    sget-object p3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    new-instance p4, Lou1/a;

    const/4 p3, 0x7

    invoke-direct {p4, p3}, Lou1/a;-><init>(I)V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    new-instance p5, Lou1/a;

    const/4 p3, 0x7

    invoke-direct {p5, p3}, Lou1/a;-><init>(I)V

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->loadAndResize(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final loadAndResize$lambda$4()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final loadAndResize$lambda$5()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final loadVideoThumbnail(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Landroid/net/Uri;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lc93/a;",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/ui/common/disposable/Disposable;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->loadVideoThumbnail(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic loadVideoThumbnail$default(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    sget-object p3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    new-instance p4, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p4, p2}, Lou1/a;-><init>(I)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    new-instance p5, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p5, p2}, Lou1/a;-><init>(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->loadVideoThumbnail(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method private static final loadVideoThumbnail$lambda$6()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final loadVideoThumbnail$lambda$7()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
