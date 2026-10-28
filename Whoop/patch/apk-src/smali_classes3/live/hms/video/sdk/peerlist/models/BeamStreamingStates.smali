.class public final enum Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/peerlist/models/BeamStreamingStates$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "none",
        "initialised",
        "started",
        "stopped",
        "failed",
        "toHMSStreamingState",
        "Llive/hms/video/sdk/models/enums/HMSStreamingState;",
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

.field private static final synthetic $VALUES:[Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

.field public static final enum failed:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

.field public static final enum initialised:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

.field public static final enum none:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

.field public static final enum started:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

.field public static final enum stopped:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;


# direct methods
.method private static final synthetic $values()[Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 5

    sget-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->none:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    sget-object v1, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->initialised:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    sget-object v2, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    sget-object v3, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->stopped:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    sget-object v4, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->failed:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    filled-new-array {v0, v1, v2, v3, v4}, [Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    const-string v1, "none"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->none:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    new-instance v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    const-string v1, "initialised"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->initialised:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    new-instance v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    const-string v1, "started"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    new-instance v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    const-string v1, "stopped"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->stopped:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    new-instance v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    const-string v1, "failed"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->failed:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    invoke-static {}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->$values()[Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v0

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->$VALUES:[Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->$ENTRIES:Lt83/a;

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

    sget-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 1

    const-class v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-object p0
.end method

.method public static values()[Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;
    .locals 1

    sget-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->$VALUES:[Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    return-object v0
.end method


# virtual methods
.method public final toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;
    .locals 2

    sget-object v0, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->FAILED:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->STOPPED:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0

    :cond_2
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->STARTED:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0

    :cond_3
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->STARTING:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0

    :cond_4
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->NONE:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0
.end method
