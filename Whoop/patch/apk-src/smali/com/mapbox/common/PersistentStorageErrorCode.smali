.class public final enum Lcom/mapbox/common/PersistentStorageErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mapbox/common/PersistentStorageErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mapbox/common/PersistentStorageErrorCode;

.field public static final enum CORRUPTED_DATA:Lcom/mapbox/common/PersistentStorageErrorCode;

.field public static final enum IOERROR:Lcom/mapbox/common/PersistentStorageErrorCode;

.field public static final enum KEY_ALREADY_EXISTS:Lcom/mapbox/common/PersistentStorageErrorCode;

.field public static final enum KEY_NOT_FOUND:Lcom/mapbox/common/PersistentStorageErrorCode;

.field public static final enum UNKNOWN:Lcom/mapbox/common/PersistentStorageErrorCode;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/mapbox/common/PersistentStorageErrorCode;

    const-string v1, "KEY_ALREADY_EXISTS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mapbox/common/PersistentStorageErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mapbox/common/PersistentStorageErrorCode;->KEY_ALREADY_EXISTS:Lcom/mapbox/common/PersistentStorageErrorCode;

    new-instance v1, Lcom/mapbox/common/PersistentStorageErrorCode;

    const-string v2, "KEY_NOT_FOUND"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/mapbox/common/PersistentStorageErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/mapbox/common/PersistentStorageErrorCode;->KEY_NOT_FOUND:Lcom/mapbox/common/PersistentStorageErrorCode;

    new-instance v2, Lcom/mapbox/common/PersistentStorageErrorCode;

    const-string v3, "CORRUPTED_DATA"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/mapbox/common/PersistentStorageErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/mapbox/common/PersistentStorageErrorCode;->CORRUPTED_DATA:Lcom/mapbox/common/PersistentStorageErrorCode;

    new-instance v3, Lcom/mapbox/common/PersistentStorageErrorCode;

    const-string v4, "IOERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/mapbox/common/PersistentStorageErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/mapbox/common/PersistentStorageErrorCode;->IOERROR:Lcom/mapbox/common/PersistentStorageErrorCode;

    new-instance v4, Lcom/mapbox/common/PersistentStorageErrorCode;

    const-string v5, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/mapbox/common/PersistentStorageErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/mapbox/common/PersistentStorageErrorCode;->UNKNOWN:Lcom/mapbox/common/PersistentStorageErrorCode;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/mapbox/common/PersistentStorageErrorCode;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/PersistentStorageErrorCode;->$VALUES:[Lcom/mapbox/common/PersistentStorageErrorCode;

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

.method private getValue()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mapbox/common/PersistentStorageErrorCode;
    .locals 1

    const-class v0, Lcom/mapbox/common/PersistentStorageErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/PersistentStorageErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/mapbox/common/PersistentStorageErrorCode;
    .locals 1

    sget-object v0, Lcom/mapbox/common/PersistentStorageErrorCode;->$VALUES:[Lcom/mapbox/common/PersistentStorageErrorCode;

    invoke-virtual {v0}, [Lcom/mapbox/common/PersistentStorageErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mapbox/common/PersistentStorageErrorCode;

    return-object v0
.end method
