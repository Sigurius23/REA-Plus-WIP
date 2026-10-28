.class public final Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\t\u001a\u00020\u00082\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;",
        "Ll83/a0;",
        "initializer",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
        "newInstance",
        "(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
        "",
        "ARG_THEME_RES_ID",
        "Ljava/lang/String;",
        "ARG_SHOW_HEADER",
        "ARG_SHOW_SEARCH",
        "ARG_HEADER_TITLE",
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

.method public static synthetic newInstance$default(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;->newInstance(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;->newInstance$default(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object v0

    return-object v0
.end method

.method public final newInstance(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->build()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object p1

    return-object p1
.end method
