.class public final enum Lg1/r2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lg1/r2;

.field public static final synthetic x:[Lg1/r2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg1/r2;

    const-string v1, "Closed"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/r2;->w:Lg1/r2;

    new-instance v1, Lg1/r2;

    const-string v2, "Open"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1}, [Lg1/r2;

    move-result-object v0

    sput-object v0, Lg1/r2;->x:[Lg1/r2;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg1/r2;
    .locals 1

    const-class v0, Lg1/r2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg1/r2;

    return-object p0
.end method

.method public static values()[Lg1/r2;
    .locals 1

    sget-object v0, Lg1/r2;->x:[Lg1/r2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg1/r2;

    return-object v0
.end method
