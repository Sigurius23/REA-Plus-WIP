.class public interface abstract Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;,
        Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$DefaultImpls;,
        Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000  2\u00020\u0001:\u0002 !JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0004\u0008\u000e\u0010\u0012JX\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00a6@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JW\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J,\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u0082\u0001\u0001\"\u00a8\u0006#\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;",
        "",
        "Landroid/widget/ImageView;",
        "target",
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
        "Landroid/content/Context;",
        "context",
        "",
        "url",
        "Landroid/graphics/Bitmap;",
        "loadAsBitmap",
        "(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;",
        "Companion",
        "ImageTransformation",
        "Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    return-void
.end method

.method public static synthetic load$default(Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 7

    if-nez p8, :cond_4

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 5
    sget-object p4, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 6
    new-instance p5, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p5, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    .line 7
    new-instance p6, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p6, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    .line 8
    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->load(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: load"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic load$default(Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 7

    if-nez p8, :cond_4

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 1
    sget-object p4, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 2
    new-instance p5, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p5, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    .line 3
    new-instance p6, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p6, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    .line 4
    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: load"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static load$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static load$lambda$1()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static load$lambda$2()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static load$lambda$3()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic loadAndResize$default(Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    if-nez p9, :cond_4

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_2

    new-instance p5, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p5, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p8, 0x20

    if-eqz p3, :cond_3

    new-instance p6, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p6, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->loadAndResize(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: loadAndResize"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static loadAndResize$lambda$4()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static loadAndResize$lambda$5()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic loadAsBitmap$default(Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget-object p3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->loadAsBitmap(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: loadAsBitmap"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic loadVideoThumbnail$default(Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 7

    if-nez p8, :cond_4

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$None;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    new-instance p5, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p5, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    new-instance p6, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x13

    invoke-direct {p6, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->loadVideoThumbnail(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: loadVideoThumbnail"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static loadVideoThumbnail$lambda$6()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static loadVideoThumbnail$lambda$7()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public abstract load(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
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
.end method

.method public abstract load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
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
.end method

.method public abstract loadAndResize(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract loadAsBitmap(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract loadVideoThumbnail(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
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
.end method
