.class public final Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "cid",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;",
        "Ll83/a0;",
        "initializer",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
        "newInstance",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
        "ARG_THEME_RES_ID",
        "Ljava/lang/String;",
        "ARG_CHANNEL_ID",
        "ARG_MESSAGE_ID",
        "ARG_SHOW_HEADER",
        "ARG_THREAD_LOAD_OLDER_TO_NEWER",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;->newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;->newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p1

    return-object p1
.end method

.method public final newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->build()Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p1

    return-object p1
.end method
