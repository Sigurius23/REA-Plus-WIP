.class public final Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;",
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
        "getContext",
        "()Landroid/content/Context;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final buildIcon(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    :cond_0
    if-eqz p1, :cond_2

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v2, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;

    invoke-direct {v2, p1, p0, v1}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder$buildIcon$3$1;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;Lq83/d;)V

    invoke-static {v0, v2, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    check-cast p1, Landroidx/core/graphics/drawable/IconCompat;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;->context:Landroid/content/Context;

    return-object v0
.end method
