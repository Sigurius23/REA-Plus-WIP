.class final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$loadingOlderMessages$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-string v0, "isLoadingPreviousMessages()Z"

    const/4 v1, 0x0

    const-class v2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    const-string v3, "isLoadingPreviousMessages"

    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;->isLoadingPreviousMessages()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
