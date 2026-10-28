.class public final Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
    reason = "This class shouldn\'t be renamed without verifying it works correctly on Chat Client Artifacts because we are using it by reflection"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Landroidx/core/graphics/drawable/IconCompat;",
        "buildIcon",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Landroid/content/Context;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public buildIcon(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Landroidx/core/graphics/drawable/IconCompat;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;-><init>(Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;->Companion:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$Companion;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object p1

    sget-object v5, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$Circle;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$Circle;

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder$buildIcon$1;->label:I

    invoke-virtual {p2, v2, p1, v5, v0}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->loadAsBitmap(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_4

    invoke-static {p2}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v3
.end method
