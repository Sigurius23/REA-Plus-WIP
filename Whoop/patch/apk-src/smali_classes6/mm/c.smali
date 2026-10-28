.class public final enum Lmm/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lmm/c;

.field public static final enum x:Lmm/c;

.field public static final enum y:Lmm/c;

.field public static final synthetic z:[Lmm/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lmm/c;

    const-string v1, "NETWORK_UNMETERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/c;->w:Lmm/c;

    new-instance v1, Lmm/c;

    const-string v2, "DEVICE_IDLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lmm/c;->x:Lmm/c;

    new-instance v2, Lmm/c;

    const-string v3, "DEVICE_CHARGING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lmm/c;->y:Lmm/c;

    filled-new-array {v0, v1, v2}, [Lmm/c;

    move-result-object v0

    sput-object v0, Lmm/c;->z:[Lmm/c;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmm/c;
    .locals 1

    const-class v0, Lmm/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmm/c;

    return-object p0
.end method

.method public static values()[Lmm/c;
    .locals 1

    sget-object v0, Lmm/c;->z:[Lmm/c;

    invoke-virtual {v0}, [Lmm/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmm/c;

    return-object v0
.end method
