.class final Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;",
        "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;",
        "context",
        "Landroid/content/Context;",
        "fallback",
        "",
        "maxMembers",
        "<init>",
        "(Landroid/content/Context;II)V",
        "formatChannelName",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private final fallback:I

.field private final maxMembers:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;->context:Landroid/content/Context;

    iput p2, p0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;->fallback:I

    iput p3, p0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;->maxMembers:I

    return-void
.end method


# virtual methods
.method public final formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;
    .locals 3

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;->context:Landroid/content/Context;

    iget v1, p0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;->fallback:I

    iget v2, p0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;->maxMembers:I

    invoke-static {p1, v0, p2, v1, v2}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getDisplayName(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
