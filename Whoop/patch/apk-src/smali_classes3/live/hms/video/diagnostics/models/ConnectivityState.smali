.class public final enum Llive/hms/video/diagnostics/models/ConnectivityState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/diagnostics/models/ConnectivityState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Llive/hms/video/diagnostics/models/ConnectivityState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "STARTING",
        "INIT_FETCHED",
        "SIGNAL_CONNECTED",
        "ICE_ESTABLISHED",
        "MEDIA_CAPTURED",
        "MEDIA_PUBLISHED",
        "COMPLETED",
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

.field private static final synthetic $VALUES:[Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum COMPLETED:Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum ICE_ESTABLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum INIT_FETCHED:Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum MEDIA_CAPTURED:Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum MEDIA_PUBLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum SIGNAL_CONNECTED:Llive/hms/video/diagnostics/models/ConnectivityState;

.field public static final enum STARTING:Llive/hms/video/diagnostics/models/ConnectivityState;


# direct methods
.method private static final synthetic $values()[Llive/hms/video/diagnostics/models/ConnectivityState;
    .locals 7

    sget-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->STARTING:Llive/hms/video/diagnostics/models/ConnectivityState;

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->INIT_FETCHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    sget-object v2, Llive/hms/video/diagnostics/models/ConnectivityState;->SIGNAL_CONNECTED:Llive/hms/video/diagnostics/models/ConnectivityState;

    sget-object v3, Llive/hms/video/diagnostics/models/ConnectivityState;->ICE_ESTABLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    sget-object v4, Llive/hms/video/diagnostics/models/ConnectivityState;->MEDIA_CAPTURED:Llive/hms/video/diagnostics/models/ConnectivityState;

    sget-object v5, Llive/hms/video/diagnostics/models/ConnectivityState;->MEDIA_PUBLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    sget-object v6, Llive/hms/video/diagnostics/models/ConnectivityState;->COMPLETED:Llive/hms/video/diagnostics/models/ConnectivityState;

    filled-new-array/range {v0 .. v6}, [Llive/hms/video/diagnostics/models/ConnectivityState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "STARTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->STARTING:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "INIT_FETCHED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->INIT_FETCHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "SIGNAL_CONNECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->SIGNAL_CONNECTED:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "ICE_ESTABLISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->ICE_ESTABLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "MEDIA_CAPTURED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->MEDIA_CAPTURED:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "MEDIA_PUBLISHED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->MEDIA_PUBLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    const-string v1, "COMPLETED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llive/hms/video/diagnostics/models/ConnectivityState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->COMPLETED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-static {}, Llive/hms/video/diagnostics/models/ConnectivityState;->$values()[Llive/hms/video/diagnostics/models/ConnectivityState;

    move-result-object v0

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->$VALUES:[Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->$ENTRIES:Lt83/a;

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

    sget-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/diagnostics/models/ConnectivityState;
    .locals 1

    const-class v0, Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/diagnostics/models/ConnectivityState;

    return-object p0
.end method

.method public static values()[Llive/hms/video/diagnostics/models/ConnectivityState;
    .locals 1

    sget-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->$VALUES:[Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/diagnostics/models/ConnectivityState;

    return-object v0
.end method
