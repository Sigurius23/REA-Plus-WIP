.class public final Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->provideDefaultUserIconBuilder(Landroid/content/Context;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "io/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Landroidx/core/graphics/drawable/IconCompat;",
        "buildIcon",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "builder$delegate",
        "Ll83/h;",
        "getBuilder",
        "()Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "builder",
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
.field private final builder$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La11/l;

    const/16 v1, 0x16

    invoke-direct {v0, v1, p1, p0}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;->builder$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;->builder_delegate$lambda$1(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    move-result-object p0

    return-object p0
.end method

.method private static final builder_delegate$lambda$1(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;)Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :try_start_0
    const-class p1, Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-static {p1}, Lk93/c;->a(Lj93/d;)Lj93/g;

    move-result-object p1

    if-eqz p1, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "null cannot be cast to non-null type io.getstream.chat.android.client.notifications.handler.UserIconBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/notifications/handler/DefaultUserIconBuilder;-><init>(Landroid/content/Context;)V

    instance-of p0, p1, Ll83/m;

    if-eqz p0, :cond_1

    move-object p1, v0

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    return-object p1
.end method

.method private final getBuilder()Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;->builder$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    return-object v0
.end method


# virtual methods
.method public final buildIcon(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory$provideDefaultUserIconBuilder$1;->getBuilder()Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;->buildIcon(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
