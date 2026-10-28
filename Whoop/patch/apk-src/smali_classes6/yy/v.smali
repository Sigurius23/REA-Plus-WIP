.class public final enum Lyy/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lyy/v;

.field public static final enum F:Lyy/v;

.field public static final enum G:Lyy/v;

.field public static final synthetic H:[Lyy/v;

.field public static final enum x:Lyy/v;

.field public static final enum y:Lyy/v;

.field public static final enum z:Lyy/v;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lyy/v;

    const/4 v1, 0x0

    const-string v2, "Wi-Fi"

    const-string v3, "WiFi"

    invoke-direct {v0, v3, v1, v2}, Lyy/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyy/v;->x:Lyy/v;

    new-instance v1, Lyy/v;

    const/4 v2, 0x1

    const-string v3, "2G"

    const-string v4, "Mobile2G"

    invoke-direct {v1, v4, v2, v3}, Lyy/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lyy/v;->y:Lyy/v;

    new-instance v2, Lyy/v;

    const/4 v3, 0x2

    const-string v4, "3G"

    const-string v5, "Mobile3G"

    invoke-direct {v2, v5, v3, v4}, Lyy/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lyy/v;->z:Lyy/v;

    new-instance v3, Lyy/v;

    const/4 v4, 0x3

    const-string v5, "4G"

    const-string v6, "Mobile4G"

    invoke-direct {v3, v6, v4, v5}, Lyy/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lyy/v;->E:Lyy/v;

    new-instance v4, Lyy/v;

    const/4 v5, 0x4

    const-string v6, "5G"

    const-string v7, "Mobile5G"

    invoke-direct {v4, v7, v5, v6}, Lyy/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lyy/v;->F:Lyy/v;

    new-instance v5, Lyy/v;

    const/4 v6, 0x5

    const-string v7, "unknown"

    const-string v8, "Unknown"

    invoke-direct {v5, v8, v6, v7}, Lyy/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lyy/v;->G:Lyy/v;

    filled-new-array/range {v0 .. v5}, [Lyy/v;

    move-result-object v0

    sput-object v0, Lyy/v;->H:[Lyy/v;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lyy/v;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyy/v;
    .locals 1

    const-class v0, Lyy/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyy/v;

    return-object p0
.end method

.method public static values()[Lyy/v;
    .locals 1

    sget-object v0, Lyy/v;->H:[Lyy/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyy/v;

    return-object v0
.end method
