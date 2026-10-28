.class public final Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "style",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
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


# virtual methods
.method public final newInstance(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;-><init>()V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->setChannel(Lio/getstream/chat/android/models/Channel;)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->setStyle(Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)V

    return-object v0
.end method
