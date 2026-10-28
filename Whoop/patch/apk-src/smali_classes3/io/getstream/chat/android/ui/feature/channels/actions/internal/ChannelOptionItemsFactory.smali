.class public interface abstract Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008`\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cJ,\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;",
        "",
        "createChannelOptionItems",
        "",
        "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;",
        "selectedChannel",
        "Lio/getstream/chat/android/models/Channel;",
        "ownCapabilities",
        "",
        "",
        "style",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;->Companion:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;

    return-void
.end method


# virtual methods
.method public abstract createChannelOptionItems(Lio/getstream/chat/android/models/Channel;Ljava/util/Set;Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;",
            ">;"
        }
    .end annotation
.end method
