.class public final enum Llive/hms/video/transport/models/TransportState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/transport/models/TransportState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/transport/models/TransportState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Disconnected",
        "Connecting",
        "SignalConnected",
        "Joined",
        "Failed",
        "Reconnecting",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Llive/hms/video/transport/models/TransportState;

.field public static final enum Connecting:Llive/hms/video/transport/models/TransportState;

.field public static final enum Disconnected:Llive/hms/video/transport/models/TransportState;

.field public static final enum Failed:Llive/hms/video/transport/models/TransportState;

.field public static final enum Joined:Llive/hms/video/transport/models/TransportState;

.field public static final enum Reconnecting:Llive/hms/video/transport/models/TransportState;

.field public static final enum SignalConnected:Llive/hms/video/transport/models/TransportState;


# direct methods
.method private static final synthetic $values()[Llive/hms/video/transport/models/TransportState;
    .locals 6

    sget-object v0, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Connecting:Llive/hms/video/transport/models/TransportState;

    sget-object v2, Llive/hms/video/transport/models/TransportState;->SignalConnected:Llive/hms/video/transport/models/TransportState;

    sget-object v3, Llive/hms/video/transport/models/TransportState;->Joined:Llive/hms/video/transport/models/TransportState;

    sget-object v4, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    sget-object v5, Llive/hms/video/transport/models/TransportState;->Reconnecting:Llive/hms/video/transport/models/TransportState;

    filled-new-array/range {v0 .. v5}, [Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/transport/models/TransportState;

    const-string v1, "Disconnected"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/transport/models/TransportState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    new-instance v0, Llive/hms/video/transport/models/TransportState;

    const-string v1, "Connecting"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/transport/models/TransportState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/transport/models/TransportState;->Connecting:Llive/hms/video/transport/models/TransportState;

    new-instance v0, Llive/hms/video/transport/models/TransportState;

    const-string v1, "SignalConnected"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/transport/models/TransportState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/transport/models/TransportState;->SignalConnected:Llive/hms/video/transport/models/TransportState;

    new-instance v0, Llive/hms/video/transport/models/TransportState;

    const-string v1, "Joined"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llive/hms/video/transport/models/TransportState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/transport/models/TransportState;->Joined:Llive/hms/video/transport/models/TransportState;

    new-instance v0, Llive/hms/video/transport/models/TransportState;

    const-string v1, "Failed"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llive/hms/video/transport/models/TransportState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    new-instance v0, Llive/hms/video/transport/models/TransportState;

    const-string v1, "Reconnecting"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llive/hms/video/transport/models/TransportState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/transport/models/TransportState;->Reconnecting:Llive/hms/video/transport/models/TransportState;

    invoke-static {}, Llive/hms/video/transport/models/TransportState;->$values()[Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sput-object v0, Llive/hms/video/transport/models/TransportState;->$VALUES:[Llive/hms/video/transport/models/TransportState;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/transport/models/TransportState;->$ENTRIES:Lt83/a;

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

    sget-object v0, Llive/hms/video/transport/models/TransportState;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/transport/models/TransportState;
    .locals 1

    const-class v0, Llive/hms/video/transport/models/TransportState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/transport/models/TransportState;

    return-object p0
.end method

.method public static values()[Llive/hms/video/transport/models/TransportState;
    .locals 1

    sget-object v0, Llive/hms/video/transport/models/TransportState;->$VALUES:[Llive/hms/video/transport/models/TransportState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/transport/models/TransportState;

    return-object v0
.end method
