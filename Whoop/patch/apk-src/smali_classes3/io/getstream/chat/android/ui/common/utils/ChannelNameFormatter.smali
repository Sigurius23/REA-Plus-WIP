.class public interface abstract Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e6\u0080\u0001\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;",
        "",
        "formatChannelName",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->Companion:Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;

    return-void
.end method


# virtual methods
.method public abstract formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;
.end method
