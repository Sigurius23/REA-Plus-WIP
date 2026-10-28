.class public final enum Lt23/c4;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lt23/c4;

.field public static final enum x:Lt23/c4;

.field public static final synthetic y:[Lt23/c4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt23/c4;

    const-string v1, "LEGACY_BEHAVIOUR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt23/c4;->w:Lt23/c4;

    new-instance v1, Lt23/c4;

    const-string v2, "PUBLISHER_CONNECTED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lt23/c4;->x:Lt23/c4;

    filled-new-array {v0, v1}, [Lt23/c4;

    move-result-object v0

    sput-object v0, Lt23/c4;->y:[Lt23/c4;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt23/c4;
    .locals 1

    const-class v0, Lt23/c4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt23/c4;

    return-object p0
.end method

.method public static values()[Lt23/c4;
    .locals 1

    sget-object v0, Lt23/c4;->y:[Lt23/c4;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt23/c4;

    return-object v0
.end method
