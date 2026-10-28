.class public final enum Lt23/d4;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lt23/d4;

.field public static final enum x:Lt23/d4;

.field public static final enum y:Lt23/d4;

.field public static final synthetic z:[Lt23/d4;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lt23/d4;

    const/4 v1, 0x0

    const-string v2, "Call rejected on wearable"

    const-string v3, "WEARABLE_REJECTED"

    invoke-direct {v0, v3, v1, v2}, Lt23/d4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lt23/d4;

    const/4 v2, 0x1

    const-string v3, "Canceled from wearable"

    const-string v4, "WEARABLE_CANCEL"

    invoke-direct {v1, v4, v2, v3}, Lt23/d4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lt23/d4;

    const/4 v3, 0x2

    const-string v4, "Call join aborted"

    const-string v5, "CALL_JOIN_ABORT"

    invoke-direct {v2, v5, v3, v4}, Lt23/d4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lt23/d4;->w:Lt23/d4;

    new-instance v3, Lt23/d4;

    const/4 v4, 0x3

    const-string v5, "Rejected by self"

    const-string v6, "REJECTED_BY_SELF"

    invoke-direct {v3, v6, v4, v5}, Lt23/d4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lt23/d4;->x:Lt23/d4;

    new-instance v4, Lt23/d4;

    const/4 v5, 0x4

    const-string v6, "Cancelled the call"

    const-string v7, "CANCELLED_BY_SELF"

    invoke-direct {v4, v7, v5, v6}, Lt23/d4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Lt23/d4;

    const/4 v6, 0x5

    const-string v7, "User left from notification action"

    const-string v8, "LEAVE_FROM_NOTIFICATION"

    invoke-direct {v5, v8, v6, v7}, Lt23/d4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lt23/d4;->y:Lt23/d4;

    filled-new-array/range {v0 .. v5}, [Lt23/d4;

    move-result-object v0

    sput-object v0, Lt23/d4;->z:[Lt23/d4;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt23/d4;
    .locals 1

    const-class v0, Lt23/d4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt23/d4;

    return-object p0
.end method

.method public static values()[Lt23/d4;
    .locals 1

    sget-object v0, Lt23/d4;->z:[Lt23/d4;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt23/d4;

    return-object v0
.end method
