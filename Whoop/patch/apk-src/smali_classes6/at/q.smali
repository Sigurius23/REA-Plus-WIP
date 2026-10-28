.class public final enum Lat/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lat/q;

.field public static final enum x:Lat/q;

.field public static final synthetic y:[Lat/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lat/q;

    const-string v1, "IEEE_P1363"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/q;->w:Lat/q;

    new-instance v1, Lat/q;

    const-string v2, "DER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lat/q;->x:Lat/q;

    filled-new-array {v0, v1}, [Lat/q;

    move-result-object v0

    sput-object v0, Lat/q;->y:[Lat/q;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lat/q;
    .locals 1

    const-class v0, Lat/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lat/q;

    return-object p0
.end method

.method public static values()[Lat/q;
    .locals 1

    sget-object v0, Lat/q;->y:[Lat/q;

    invoke-virtual {v0}, [Lat/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/q;

    return-object v0
.end method
