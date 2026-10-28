.class public final enum Lg1/h5;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lg1/h5;

.field public static final synthetic F:[Lg1/h5;

.field public static final enum w:Lg1/h5;

.field public static final enum x:Lg1/h5;

.field public static final enum y:Lg1/h5;

.field public static final enum z:Lg1/h5;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lg1/h5;

    const-string v1, "TopBar"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/h5;->w:Lg1/h5;

    new-instance v1, Lg1/h5;

    const-string v2, "MainContent"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg1/h5;->x:Lg1/h5;

    new-instance v2, Lg1/h5;

    const-string v3, "Snackbar"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lg1/h5;->y:Lg1/h5;

    new-instance v3, Lg1/h5;

    const-string v4, "Fab"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg1/h5;->z:Lg1/h5;

    new-instance v4, Lg1/h5;

    const-string v5, "BottomBar"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lg1/h5;->E:Lg1/h5;

    filled-new-array {v0, v1, v2, v3, v4}, [Lg1/h5;

    move-result-object v0

    sput-object v0, Lg1/h5;->F:[Lg1/h5;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg1/h5;
    .locals 1

    const-class v0, Lg1/h5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg1/h5;

    return-object p0
.end method

.method public static values()[Lg1/h5;
    .locals 1

    sget-object v0, Lg1/h5;->F:[Lg1/h5;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg1/h5;

    return-object v0
.end method
