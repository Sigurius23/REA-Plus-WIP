.class final Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;",
        "",
        "<init>",
        "()V",
        "createInitialHeaderState",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;",
        "context",
        "Landroid/content/Context;",
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

.method public static final synthetic access$createInitialHeaderState(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;->createInitialHeaderState(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    move-result-object p0

    return-object p0
.end method

.method private final createInitialHeaderState(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;
    .locals 10

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_header_thread_title:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string p1, "getString(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lm83/y;->w:Lm83/y;

    sget-object v9, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->NONE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, ""

    const/4 v5, 0x1

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V

    return-object v0
.end method
