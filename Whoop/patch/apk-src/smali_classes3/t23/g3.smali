.class public final enum Lt23/g3;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lt23/g3;

.field public static final enum F:Lt23/g3;

.field public static final synthetic G:[Lt23/g3;

.field public static final enum w:Lt23/g3;

.field public static final enum x:Lt23/g3;

.field public static final enum y:Lt23/g3;

.field public static final enum z:Lt23/g3;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lt23/g3;

    const/4 v1, 0x0

    const-string v2, "App removed from recents"

    const-string v3, "TASK_REMOVED"

    invoke-direct {v0, v3, v1, v2}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lt23/g3;->w:Lt23/g3;

    new-instance v1, Lt23/g3;

    const/4 v2, 0x1

    const-string v3, "Call put on hold"

    const-string v4, "CALL_ON_HOLD"

    invoke-direct {v1, v4, v2, v3}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lt23/g3;

    const/4 v3, 0x2

    const-string v4, "client-cleanup"

    const-string v5, "CLIENT_CLEANUP"

    invoke-direct {v2, v5, v3, v4}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lt23/g3;->x:Lt23/g3;

    new-instance v3, Lt23/g3;

    const/4 v4, 0x3

    const-string v5, "RingTimeout"

    const-string v6, "RING_TIMEOUT"

    invoke-direct {v3, v6, v4, v5}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lt23/g3;->y:Lt23/g3;

    new-instance v4, Lt23/g3;

    const/4 v5, 0x4

    const-string v6, "accepted-on-another-device"

    const-string v7, "ACCEPTED_ON_OTHER_DEVICE"

    invoke-direct {v4, v7, v5, v6}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lt23/g3;->z:Lt23/g3;

    new-instance v5, Lt23/g3;

    const/4 v6, 0x5

    const-string v7, "LocalCallMissedEvent"

    const-string v8, "LOCAL_CALL_MISSED_EVENT"

    invoke-direct {v5, v8, v6, v7}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lt23/g3;->E:Lt23/g3;

    new-instance v6, Lt23/g3;

    const/4 v7, 0x6

    const-string v8, "All participants rejected the call"

    const-string v9, "REJECTED_BY_ALL"

    invoke-direct {v6, v9, v7, v8}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lt23/g3;->F:Lt23/g3;

    new-instance v7, Lt23/g3;

    const/4 v8, 0x7

    const-string v9, "CALL_ENDED"

    const-string v10, "END_CALL"

    invoke-direct {v7, v10, v8, v9}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Lt23/g3;

    const/16 v9, 0x8

    const-string v10, "Error in Pip"

    const-string v11, "PIP_ERROR"

    invoke-direct {v8, v11, v9, v10}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v9, Lt23/g3;

    const/16 v10, 0x9

    const-string v11, "PIP stopped"

    const-string v12, "PIP_STOPPED"

    invoke-direct {v9, v12, v10, v11}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Lt23/g3;

    const/16 v11, 0xa

    const-string v12, "Activity destroyed"

    const-string v13, "ACTIVITY_DESTROYED"

    invoke-direct {v10, v13, v11, v12}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v11, Lt23/g3;

    const-string v12, "STREAM_CALL_ACTIVITY_EXCEPTION"

    const/16 v13, 0xb

    invoke-direct {v11, v12, v13, v12}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v12, Lt23/g3;

    const/16 v13, 0xc

    const-string v14, "Leave previous call to accept new call"

    const-string v15, "LEAVE_PREVIOUS_CALL_TO_ACCEPT_NEW_CALL"

    invoke-direct {v12, v15, v13, v14}, Lt23/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array/range {v0 .. v12}, [Lt23/g3;

    move-result-object v0

    sput-object v0, Lt23/g3;->G:[Lt23/g3;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt23/g3;
    .locals 1

    const-class v0, Lt23/g3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt23/g3;

    return-object p0
.end method

.method public static values()[Lt23/g3;
    .locals 1

    sget-object v0, Lt23/g3;->G:[Lt23/g3;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt23/g3;

    return-object v0
.end method
