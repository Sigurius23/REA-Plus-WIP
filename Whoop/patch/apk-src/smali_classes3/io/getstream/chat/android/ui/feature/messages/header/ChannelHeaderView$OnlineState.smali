.class final enum Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OnlineState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NONE",
        "ONLINE",
        "CONNECTING",
        "OFFLINE",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

.field public static final enum CONNECTING:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

.field public static final enum NONE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

.field public static final enum OFFLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

.field public static final enum ONLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->NONE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->ONLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->CONNECTING:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->OFFLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    filled-new-array {v0, v1, v2, v3}, [Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->NONE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const-string v1, "ONLINE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->ONLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const-string v1, "CONNECTING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->CONNECTING:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const-string v1, "OFFLINE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->OFFLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->$values()[Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->$VALUES:[Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;
    .locals 1

    const-class v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->$VALUES:[Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    return-object v0
.end method
