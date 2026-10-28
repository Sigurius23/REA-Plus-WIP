.class public final enum Lt23/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lt23/g;

.field public static final synthetic F:[Lt23/g;

.field public static final enum x:Lt23/g;

.field public static final enum y:Lt23/g;

.field public static final enum z:Lt23/g;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lt23/g;

    const/4 v1, 0x0

    const-string v2, "Leave timeout after disconnect"

    const-string v3, "LEAVE_TIMEOUT_AFTER_DISCONNECT"

    invoke-direct {v0, v3, v1, v2}, Lt23/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lt23/g;->x:Lt23/g;

    new-instance v1, Lt23/g;

    const/4 v2, 0x1

    const-string v3, "SFU:DISCONNECT"

    const-string v4, "SFU_DISCONNECT"

    invoke-direct {v1, v4, v2, v3}, Lt23/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lt23/g;->y:Lt23/g;

    new-instance v2, Lt23/g;

    const/4 v3, 0x2

    const-string v4, "CallEndedEvent"

    const-string v5, "CALL_ENDED_EVENT"

    invoke-direct {v2, v5, v3, v4}, Lt23/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lt23/g;->z:Lt23/g;

    new-instance v3, Lt23/g;

    const/4 v4, 0x3

    const-string v5, "CallEndedSfuEvent"

    const-string v6, "CALL_ENDED_SFU_EVENT"

    invoke-direct {v3, v6, v4, v5}, Lt23/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lt23/g;->E:Lt23/g;

    new-instance v4, Lt23/g;

    const/4 v5, 0x4

    const-string v6, "CallSessionEndedEvent"

    const-string v7, "CALL_SESSION_ENDED_EVENT"

    invoke-direct {v4, v7, v5, v6}, Lt23/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Lt23/g;

    const/4 v6, 0x5

    const-string v7, "Ring failed"

    const-string v8, "RING_FAILED"

    invoke-direct {v5, v8, v6, v7}, Lt23/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array/range {v0 .. v5}, [Lt23/g;

    move-result-object v0

    sput-object v0, Lt23/g;->F:[Lt23/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lt23/g;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt23/g;
    .locals 1

    const-class v0, Lt23/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt23/g;

    return-object p0
.end method

.method public static values()[Lt23/g;
    .locals 1

    sget-object v0, Lt23/g;->F:[Lt23/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt23/g;

    return-object v0
.end method
