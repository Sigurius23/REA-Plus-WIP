.class public final enum Ljm/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lot/c;


# static fields
.field public static final enum E:Ljm/c;

.field public static final enum F:Ljm/c;

.field public static final enum G:Ljm/c;

.field public static final enum H:Ljm/c;

.field public static final synthetic I:[Ljm/c;

.field public static final enum x:Ljm/c;

.field public static final enum y:Ljm/c;

.field public static final enum z:Ljm/c;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ljm/c;

    const-string v1, "REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljm/c;->x:Ljm/c;

    new-instance v1, Ljm/c;

    const-string v2, "MESSAGE_TOO_OLD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ljm/c;->y:Ljm/c;

    new-instance v2, Ljm/c;

    const-string v3, "CACHE_FULL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v2, Ljm/c;->z:Ljm/c;

    new-instance v3, Ljm/c;

    const-string v4, "PAYLOAD_TOO_BIG"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ljm/c;->E:Ljm/c;

    new-instance v4, Ljm/c;

    const-string v5, "MAX_RETRIES_REACHED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Ljm/c;->F:Ljm/c;

    new-instance v5, Ljm/c;

    const-string v6, "INVALID_PAYLOD"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ljm/c;->G:Ljm/c;

    new-instance v6, Ljm/c;

    const-string v7, "SERVER_ERROR"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Ljm/c;-><init>(Ljava/lang/String;II)V

    sput-object v6, Ljm/c;->H:Ljm/c;

    filled-new-array/range {v0 .. v6}, [Ljm/c;

    move-result-object v0

    sput-object v0, Ljm/c;->I:[Ljm/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ljm/c;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljm/c;
    .locals 1

    const-class v0, Ljm/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljm/c;

    return-object p0
.end method

.method public static values()[Ljm/c;
    .locals 1

    sget-object v0, Ljm/c;->I:[Ljm/c;

    invoke-virtual {v0}, [Ljm/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljm/c;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ljm/c;->w:I

    return v0
.end method
