.class public final enum Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Timeout"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;",
        "",
        "valueInMinutes",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/Integer;)V",
        "getValueInMinutes",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "OneHour",
        "OneDay",
        "OneWeek",
        "NoTimeout",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

.field public static final enum NoTimeout:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

.field public static final enum OneDay:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

.field public static final enum OneHour:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

.field public static final enum OneWeek:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;


# instance fields
.field private final valueInMinutes:Ljava/lang/Integer;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->OneHour:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    sget-object v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->OneDay:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    sget-object v2, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->OneWeek:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    sget-object v3, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->NoTimeout:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    filled-new-array {v0, v1, v2, v3}, [Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    const/16 v1, 0x3c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "OneHour"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->OneHour:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    const/16 v1, 0x5a0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "OneDay"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->OneDay:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    const/16 v1, 0x2760

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "OneWeek"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->OneWeek:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const-string v3, "NoTimeout"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->NoTimeout:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    invoke-static {}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->$values()[Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->$VALUES:[Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->valueInMinutes:Ljava/lang/Integer;

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

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;
    .locals 1

    const-class v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->$VALUES:[Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;

    return-object v0
.end method


# virtual methods
.method public final getValueInMinutes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->valueInMinutes:Ljava/lang/Integer;

    return-object v0
.end method
