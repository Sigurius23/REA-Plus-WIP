.class public final enum Lu40/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final enum E:Lu40/d;

.field public static final enum F:Lu40/d;

.field public static final enum G:Lu40/d;

.field public static final enum H:Lu40/d;

.field public static final synthetic I:[Lu40/d;

.field public static final synthetic J:Lt83/b;

.field public static final y:Lt9/c0;

.field public static final enum z:Lu40/d;


# instance fields
.field public final w:I

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lu40/d;

    const-string v1, "No internet connection"

    const-string v2, "NETWORK_ERROR"

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v0, v2, v3, v4, v1}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v1, Lu40/d;

    const-string v2, "Invalid data is not accepted by endpoints"

    const-string v3, "INVALID_DATA"

    const/4 v5, 0x1

    const/16 v6, 0x8

    invoke-direct {v1, v3, v5, v6, v2}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v2, Lu40/d;

    const-string v3, "Challenge encountered error on setup"

    const-string v5, "CHALLENGE_ERROR"

    const/4 v7, 0x2

    const/16 v8, 0x9

    invoke-direct {v2, v5, v7, v8, v3}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v3, Lu40/d;

    const-string v5, "hCaptcha client encountered an internal error"

    const-string v7, "INTERNAL_ERROR"

    const/4 v9, 0x3

    const/16 v10, 0xa

    invoke-direct {v3, v7, v9, v10, v5}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    move v5, v4

    new-instance v4, Lu40/d;

    const/16 v7, 0xf

    const-string v9, "Session Timeout"

    const-string v11, "SESSION_TIMEOUT"

    const/4 v12, 0x4

    invoke-direct {v4, v11, v12, v7, v9}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lu40/d;->z:Lu40/d;

    move v7, v5

    new-instance v5, Lu40/d;

    const/16 v9, 0x10

    const-string v11, "Token Timeout"

    const-string v12, "TOKEN_TIMEOUT"

    const/4 v13, 0x5

    invoke-direct {v5, v12, v13, v9, v11}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v5, Lu40/d;->E:Lu40/d;

    move v9, v6

    new-instance v6, Lu40/d;

    const/16 v11, 0x1e

    const-string v12, "Challenge Closed"

    const-string v13, "CHALLENGE_CLOSED"

    const/4 v14, 0x6

    invoke-direct {v6, v13, v14, v11, v12}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v6, Lu40/d;->F:Lu40/d;

    move v11, v7

    new-instance v7, Lu40/d;

    const/16 v12, 0x1f

    const-string v13, "Rate Limited"

    const-string v14, "RATE_LIMITED"

    invoke-direct {v7, v14, v11, v12, v13}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    move v11, v8

    new-instance v8, Lu40/d;

    const/16 v12, 0x20

    const-string v13, "Invalid custom theme"

    const-string v14, "INVALID_CUSTOM_THEME"

    invoke-direct {v8, v14, v9, v12, v13}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    new-instance v9, Lu40/d;

    const/16 v12, 0x21

    const-string v13, "Insecure resource requested"

    const-string v14, "INSECURE_HTTP_REQUEST_ERROR"

    invoke-direct {v9, v14, v11, v12, v13}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v9, Lu40/d;->G:Lu40/d;

    move v11, v10

    new-instance v10, Lu40/d;

    const/16 v12, 0x1d

    const-string v13, "Unknown error"

    const-string v14, "ERROR"

    invoke-direct {v10, v14, v11, v12, v13}, Lu40/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v10, Lu40/d;->H:Lu40/d;

    filled-new-array/range {v0 .. v10}, [Lu40/d;

    move-result-object v0

    sput-object v0, Lu40/d;->I:[Lu40/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lu40/d;->J:Lt83/b;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu40/d;->y:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lu40/d;->w:I

    iput-object p4, p0, Lu40/d;->x:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu40/d;
    .locals 1

    const-class v0, Lu40/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu40/d;

    return-object p0
.end method

.method public static values()[Lu40/d;
    .locals 1

    sget-object v0, Lu40/d;->I:[Lu40/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu40/d;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu40/d;->x:Ljava/lang/String;

    return-object v0
.end method
